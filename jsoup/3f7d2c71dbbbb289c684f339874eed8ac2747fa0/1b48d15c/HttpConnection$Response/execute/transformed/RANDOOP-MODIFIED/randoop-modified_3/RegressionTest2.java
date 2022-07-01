import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest2 {

    public static boolean debug = false;

    @Test
    public void test1001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1001");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.util.Map<java.lang.String, java.lang.String> strMap3 = response2.headers();
        int int4 = response2.statusCode();
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response2);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response6 = org.jsoup.helper.HttpConnection.Response.execute(request0, response5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1002");
        org.jsoup.helper.HttpConnection.Response.MAX_REDIRECTS = (-10);
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1003");
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
        java.nio.FloatBuffer floatBuffer21 = byteBuffer10.asFloatBuffer();
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
        org.junit.Assert.assertNotNull(floatBuffer21);
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1004");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean3 = response2.executed;
        response2.statusCode = 0;
        java.lang.String str6 = response2.contentType();
        boolean boolean8 = response2.hasCookie("java.nio.HeapByteBufferR[pos=0 lim=0 cap=0]");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray9 = response2.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1005");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate((int) (byte) 10);
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.nio.ByteBuffer byteBuffer6 = java.nio.ByteBuffer.wrap(byteArray5);
        java.nio.ByteBuffer byteBuffer7 = byteBuffer1.get(byteArray5);
        java.nio.ByteBuffer byteBuffer9 = byteBuffer1.putFloat((float) (byte) 10);
        java.nio.ByteBuffer byteBuffer10 = byteBuffer9.compact();
        java.nio.ByteBuffer byteBuffer12 = java.nio.ByteBuffer.allocate(0);
        boolean boolean13 = byteBuffer12.isReadOnly();
        java.nio.ShortBuffer shortBuffer14 = byteBuffer12.asShortBuffer();
        int int15 = byteBuffer12.position();
        java.nio.ByteOrder byteOrder16 = null;
        java.nio.ByteBuffer byteBuffer17 = byteBuffer12.order(byteOrder16);
        java.nio.ByteBuffer byteBuffer18 = byteBuffer12.asReadOnlyBuffer();
        java.nio.ByteBuffer byteBuffer19 = byteBuffer18.slice();
        java.nio.ByteBuffer byteBuffer20 = byteBuffer18.duplicate();
        java.nio.ByteBuffer byteBuffer22 = java.nio.ByteBuffer.allocate((int) (byte) 10);
        byte[] byteArray26 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.nio.ByteBuffer byteBuffer27 = java.nio.ByteBuffer.wrap(byteArray26);
        java.nio.ByteBuffer byteBuffer28 = byteBuffer22.get(byteArray26);
        java.nio.Buffer buffer29 = byteBuffer22.rewind();
        java.nio.ByteOrder byteOrder30 = byteBuffer22.order();
        java.nio.ByteBuffer byteBuffer31 = byteBuffer18.order(byteOrder30);
        java.nio.ByteBuffer byteBuffer32 = byteBuffer10.order(byteOrder30);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer35 = byteBuffer32.putDouble(22, 0.0d);
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
        org.junit.Assert.assertNotNull(byteBuffer12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(shortBuffer14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(byteBuffer17);
        org.junit.Assert.assertNotNull(byteBuffer18);
        org.junit.Assert.assertNotNull(byteBuffer19);
        org.junit.Assert.assertNotNull(byteBuffer20);
        org.junit.Assert.assertNotNull(byteBuffer22);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(byteBuffer27);
        org.junit.Assert.assertNotNull(byteBuffer28);
        org.junit.Assert.assertNotNull(buffer29);
        org.junit.Assert.assertNotNull(byteOrder30);
        org.junit.Assert.assertNotNull(byteBuffer31);
        org.junit.Assert.assertNotNull(byteBuffer32);
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1006");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer2 = byteBuffer1.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        java.nio.ByteBuffer byteBuffer4 = byteBuffer1.compact();
        java.nio.ByteBuffer byteBuffer5 = byteBuffer1.slice();
        java.nio.Buffer buffer6 = byteBuffer5.flip();
        // The following exception was thrown during execution in test generation
        try {
            byte byte8 = byteBuffer5.get((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(doubleBuffer2);
        org.junit.Assert.assertNotNull(shortBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertNotNull(buffer6);
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1007");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Method method6 = response5.method();
        org.jsoup.Connection.Method method7 = response5.method();
        boolean boolean9 = response5.hasCookie("java.nio.HeapByteBufferR[pos=0 lim=0 cap=0]");
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1008");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean3 = response2.executed;
        java.lang.String str5 = response2.getHeaderCaseInsensitive("");
        java.lang.String str7 = response2.cookie("java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]");
        int int8 = response2.statusCode();
        org.jsoup.Connection.Response response11 = response2.cookie("hi!", "");
        int int12 = response2.statusCode;
        java.lang.String str13 = response2.contentType();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response2);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Too many redirects occurred trying to load URL null");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1009");
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
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer17 = byteBuffer13.putChar(' ');
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1010");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str4 = response2.header("");
        org.jsoup.Connection.Response response6 = response2.removeCookie("hi!");
        java.lang.String str8 = response2.cookie("");
        java.lang.String str9 = response2.statusMessage();
        int int10 = response2.statusCode();
        java.lang.String str11 = response2.charset;
        java.util.Map<java.lang.String, java.lang.String> strMap12 = response2.headers();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response13 = org.jsoup.helper.HttpConnection.Response.execute(request0, response2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(strMap12);
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1011");
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
            double double30 = byteBuffer25.getDouble();
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
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1012");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.isReadOnly();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        java.nio.ByteBuffer byteBuffer5 = java.nio.ByteBuffer.allocate(0);
        boolean boolean6 = byteBuffer5.isReadOnly();
        int int7 = byteBuffer1.compareTo(byteBuffer5);
        java.nio.Buffer buffer8 = byteBuffer5.clear();
        boolean boolean9 = buffer8.isReadOnly();
        java.nio.Buffer buffer10 = buffer8.rewind();
        boolean boolean11 = buffer10.isReadOnly();
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(shortBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(buffer8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(buffer10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1013");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.isReadOnly();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        java.nio.ByteBuffer byteBuffer5 = java.nio.ByteBuffer.allocate(0);
        boolean boolean6 = byteBuffer5.isReadOnly();
        int int7 = byteBuffer1.compareTo(byteBuffer5);
        java.nio.ByteBuffer byteBuffer8 = byteBuffer5.compact();
        java.nio.ByteBuffer byteBuffer9 = byteBuffer8.asReadOnlyBuffer();
        org.jsoup.helper.HttpConnection.Response response10 = null;
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response10);
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response10);
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response10);
        java.nio.ByteBuffer byteBuffer14 = response13.byteData;
        java.net.URL uRL15 = response13.url();
        java.lang.String str16 = response13.contentType;
        boolean boolean17 = byteBuffer9.equals((java.lang.Object) str16);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer20 = byteBuffer9.putChar(1677787392, '4');
            org.junit.Assert.fail("Expected exception of type java.nio.ReadOnlyBufferException; message: null");
        } catch (java.nio.ReadOnlyBufferException e) {
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
        org.junit.Assert.assertNull(byteBuffer14);
        org.junit.Assert.assertNull(uRL15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1014");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer2 = byteBuffer1.asDoubleBuffer();
        java.nio.LongBuffer longBuffer3 = byteBuffer1.asLongBuffer();
        // The following exception was thrown during execution in test generation
        try {
            byte byte5 = byteBuffer1.get((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(doubleBuffer2);
        org.junit.Assert.assertNotNull(longBuffer3);
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1015");
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
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer15 = byteBuffer7.put((byte) 100);
            org.junit.Assert.fail("Expected exception of type java.nio.BufferOverflowException; message: null");
        } catch (java.nio.BufferOverflowException e) {
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
        org.junit.Assert.assertNotNull(intBuffer13);
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1016");
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
        java.nio.Buffer buffer22 = byteBuffer21.clear();
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
        org.junit.Assert.assertNotNull(buffer22);
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1017");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate((int) (byte) 10);
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.nio.ByteBuffer byteBuffer6 = java.nio.ByteBuffer.wrap(byteArray5);
        java.nio.ByteBuffer byteBuffer7 = byteBuffer1.get(byteArray5);
        java.nio.Buffer buffer8 = byteBuffer1.rewind();
        java.nio.ByteBuffer byteBuffer10 = byteBuffer1.putInt((int) (short) 10);
        java.nio.ByteBuffer byteBuffer11 = byteBuffer1.asReadOnlyBuffer();
        java.nio.ByteBuffer byteBuffer13 = byteBuffer1.putChar('4');
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer16 = byteBuffer13.putFloat(1677787392, (float) 1677787392);
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
        org.junit.Assert.assertNotNull(byteBuffer10);
        org.junit.Assert.assertNotNull(byteBuffer11);
        org.junit.Assert.assertNotNull(byteBuffer13);
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1018");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean3 = response2.executed;
        java.lang.String str5 = response2.getHeaderCaseInsensitive("");
        java.net.URL uRL6 = response2.url();
        org.jsoup.Connection.Response response8 = response2.removeCookie("");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry10 = response2.scanHeaders("");
        org.jsoup.Connection.Request request11 = response2.req;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = response2.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(strEntry10);
        org.junit.Assert.assertNull(request11);
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1019");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.header("");
        org.jsoup.Connection.Response response5 = response1.removeCookie("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap6 = response1.headers();
        java.lang.Class<?> wildcardClass7 = response1.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1020");
        byte[] byteArray0 = new byte[] {};
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.wrap(byteArray0);
        java.nio.Buffer buffer2 = byteBuffer1.flip();
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.asReadOnlyBuffer();
        java.nio.ByteBuffer byteBuffer4 = byteBuffer1.duplicate();
        java.nio.ByteBuffer byteBuffer6 = java.nio.ByteBuffer.allocate(0);
        boolean boolean7 = byteBuffer6.isReadOnly();
        java.nio.ShortBuffer shortBuffer8 = byteBuffer6.asShortBuffer();
        int int9 = byteBuffer6.position();
        boolean boolean10 = byteBuffer6.isReadOnly();
        java.nio.ByteOrder byteOrder11 = byteBuffer6.order();
        java.nio.ByteBuffer byteBuffer12 = byteBuffer4.order(byteOrder11);
        java.nio.ByteBuffer byteBuffer14 = java.nio.ByteBuffer.allocate((int) (byte) 10);
        byte[] byteArray18 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.nio.ByteBuffer byteBuffer19 = java.nio.ByteBuffer.wrap(byteArray18);
        java.nio.ByteBuffer byteBuffer20 = byteBuffer14.get(byteArray18);
        java.nio.LongBuffer longBuffer21 = byteBuffer14.asLongBuffer();
        java.nio.ByteBuffer byteBuffer22 = byteBuffer14.slice();
        java.nio.ByteBuffer byteBuffer24 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer25 = byteBuffer24.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer26 = byteBuffer24.asShortBuffer();
        java.nio.ByteOrder byteOrder27 = null;
        java.nio.ByteBuffer byteBuffer28 = byteBuffer24.order(byteOrder27);
        java.nio.ByteBuffer byteBuffer30 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer31 = byteBuffer30.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer32 = byteBuffer30.asShortBuffer();
        int int33 = byteBuffer30.limit();
        byte[] byteArray34 = byteBuffer30.array();
        java.nio.ByteBuffer byteBuffer35 = byteBuffer24.put(byteArray34);
        java.nio.ByteBuffer byteBuffer36 = byteBuffer22.get(byteArray34);
        java.nio.ByteBuffer byteBuffer37 = byteBuffer12.get(byteArray34);
        java.nio.Buffer buffer38 = byteBuffer12.flip();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.Buffer buffer39 = byteBuffer12.reset();
            org.junit.Assert.fail("Expected exception of type java.nio.InvalidMarkException; message: null");
        } catch (java.nio.InvalidMarkException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(buffer2);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertNotNull(byteBuffer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(shortBuffer8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(byteOrder11);
        org.junit.Assert.assertNotNull(byteBuffer12);
        org.junit.Assert.assertNotNull(byteBuffer14);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(byteBuffer19);
        org.junit.Assert.assertNotNull(byteBuffer20);
        org.junit.Assert.assertNotNull(longBuffer21);
        org.junit.Assert.assertNotNull(byteBuffer22);
        org.junit.Assert.assertNotNull(byteBuffer24);
        org.junit.Assert.assertNotNull(doubleBuffer25);
        org.junit.Assert.assertNotNull(shortBuffer26);
        org.junit.Assert.assertNotNull(byteBuffer28);
        org.junit.Assert.assertNotNull(byteBuffer30);
        org.junit.Assert.assertNotNull(doubleBuffer31);
        org.junit.Assert.assertNotNull(shortBuffer32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray34), "[]");
        org.junit.Assert.assertNotNull(byteBuffer35);
        org.junit.Assert.assertNotNull(byteBuffer36);
        org.junit.Assert.assertNotNull(byteBuffer37);
        org.junit.Assert.assertNotNull(buffer38);
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1021");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate((int) (byte) 10);
        int int2 = byteBuffer1.getInt();
        java.nio.ByteBuffer byteBuffer5 = byteBuffer1.put((int) (byte) 0, (byte) 10);
        java.nio.IntBuffer intBuffer6 = byteBuffer1.asIntBuffer();
        java.nio.Buffer buffer7 = byteBuffer1.mark();
        java.nio.Buffer buffer8 = byteBuffer1.flip();
        java.nio.Buffer buffer9 = byteBuffer1.mark();
        int int10 = buffer9.remaining();
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertNotNull(intBuffer6);
        org.junit.Assert.assertNotNull(buffer7);
        org.junit.Assert.assertNotNull(buffer8);
        org.junit.Assert.assertNotNull(buffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1022");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate((int) ' ');
        int int3 = byteBuffer1.getInt((int) (short) 0);
        java.nio.CharBuffer charBuffer4 = byteBuffer1.asCharBuffer();
        java.nio.ByteBuffer byteBuffer7 = byteBuffer1.putInt((int) (byte) 0, (int) ' ');
        java.nio.ByteBuffer byteBuffer9 = java.nio.ByteBuffer.allocate(0);
        boolean boolean10 = byteBuffer9.isReadOnly();
        java.nio.ShortBuffer shortBuffer11 = byteBuffer9.asShortBuffer();
        java.nio.ByteBuffer byteBuffer13 = java.nio.ByteBuffer.allocate(0);
        boolean boolean14 = byteBuffer13.isReadOnly();
        int int15 = byteBuffer9.compareTo(byteBuffer13);
        java.nio.Buffer buffer17 = byteBuffer9.limit(0);
        byte[] byteArray18 = byteBuffer9.array();
        java.nio.ByteBuffer byteBuffer21 = byteBuffer1.get(byteArray18, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            float float23 = byteBuffer1.getFloat(31);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(charBuffer4);
        org.junit.Assert.assertNotNull(byteBuffer7);
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(shortBuffer11);
        org.junit.Assert.assertNotNull(byteBuffer13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(buffer17);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[]");
        org.junit.Assert.assertNotNull(byteBuffer21);
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1023");
        byte[] byteArray0 = new byte[] {};
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.wrap(byteArray0);
        java.nio.Buffer buffer2 = byteBuffer1.flip();
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.asReadOnlyBuffer();
        java.nio.ByteBuffer byteBuffer4 = byteBuffer1.duplicate();
        java.nio.ByteBuffer byteBuffer6 = java.nio.ByteBuffer.allocate(0);
        boolean boolean7 = byteBuffer6.isReadOnly();
        java.nio.ShortBuffer shortBuffer8 = byteBuffer6.asShortBuffer();
        int int9 = byteBuffer6.position();
        boolean boolean10 = byteBuffer6.isReadOnly();
        java.nio.ByteOrder byteOrder11 = byteBuffer6.order();
        java.nio.ByteBuffer byteBuffer12 = byteBuffer4.order(byteOrder11);
        java.nio.ByteBuffer byteBuffer14 = java.nio.ByteBuffer.allocate((int) (byte) 10);
        byte[] byteArray18 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.nio.ByteBuffer byteBuffer19 = java.nio.ByteBuffer.wrap(byteArray18);
        java.nio.ByteBuffer byteBuffer20 = byteBuffer14.get(byteArray18);
        java.nio.LongBuffer longBuffer21 = byteBuffer14.asLongBuffer();
        java.nio.ByteBuffer byteBuffer22 = byteBuffer14.slice();
        java.nio.ByteBuffer byteBuffer24 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer25 = byteBuffer24.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer26 = byteBuffer24.asShortBuffer();
        java.nio.ByteOrder byteOrder27 = null;
        java.nio.ByteBuffer byteBuffer28 = byteBuffer24.order(byteOrder27);
        java.nio.ByteBuffer byteBuffer30 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer31 = byteBuffer30.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer32 = byteBuffer30.asShortBuffer();
        int int33 = byteBuffer30.limit();
        byte[] byteArray34 = byteBuffer30.array();
        java.nio.ByteBuffer byteBuffer35 = byteBuffer24.put(byteArray34);
        java.nio.ByteBuffer byteBuffer36 = byteBuffer22.get(byteArray34);
        java.nio.ByteBuffer byteBuffer37 = byteBuffer12.get(byteArray34);
        java.nio.Buffer buffer38 = byteBuffer12.flip();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.Buffer buffer40 = buffer38.limit((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(buffer2);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertNotNull(byteBuffer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(shortBuffer8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(byteOrder11);
        org.junit.Assert.assertNotNull(byteBuffer12);
        org.junit.Assert.assertNotNull(byteBuffer14);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(byteBuffer19);
        org.junit.Assert.assertNotNull(byteBuffer20);
        org.junit.Assert.assertNotNull(longBuffer21);
        org.junit.Assert.assertNotNull(byteBuffer22);
        org.junit.Assert.assertNotNull(byteBuffer24);
        org.junit.Assert.assertNotNull(doubleBuffer25);
        org.junit.Assert.assertNotNull(shortBuffer26);
        org.junit.Assert.assertNotNull(byteBuffer28);
        org.junit.Assert.assertNotNull(byteBuffer30);
        org.junit.Assert.assertNotNull(doubleBuffer31);
        org.junit.Assert.assertNotNull(shortBuffer32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray34), "[]");
        org.junit.Assert.assertNotNull(byteBuffer35);
        org.junit.Assert.assertNotNull(byteBuffer36);
        org.junit.Assert.assertNotNull(byteBuffer37);
        org.junit.Assert.assertNotNull(buffer38);
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1024");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.header("");
        response1.charset = "hi!";
        org.jsoup.Connection.Method method6 = response1.method();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method6);
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1025");
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
        // The following exception was thrown during execution in test generation
        try {
            long long18 = byteBuffer5.getLong((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
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
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1026");
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
            byte byte24 = byteBuffer20.get((int) (byte) 1);
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
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1027");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.header("");
        java.lang.String str4 = response1.statusMessage;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response1);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Too many redirects occurred trying to load URL null");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1028");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean3 = response2.executed;
        java.lang.String str5 = response2.getHeaderCaseInsensitive("");
        java.lang.String str7 = response2.cookie("java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]");
        java.lang.String str8 = response2.contentType;
        response2.charset = "hi!";
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry12 = response2.scanHeaders("java.nio.DirectByteBuffer[pos=8 lim=35 cap=35]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(strEntry12);
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1029");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer2 = byteBuffer1.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        java.lang.String str4 = byteBuffer1.toString();
        boolean boolean5 = byteBuffer1.hasArray();
        java.nio.ByteBuffer byteBuffer7 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer8 = byteBuffer7.asDoubleBuffer();
        boolean boolean9 = byteBuffer7.isDirect();
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
        java.nio.ByteBuffer byteBuffer24 = byteBuffer7.put(byteBuffer23);
        byte[] byteArray25 = byteBuffer23.array();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer28 = byteBuffer1.put(byteArray25, (int) (short) 0, 65);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(doubleBuffer2);
        org.junit.Assert.assertNotNull(shortBuffer3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]" + "'", str4, "java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(byteBuffer7);
        org.junit.Assert.assertNotNull(doubleBuffer8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
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
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[]");
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1030");
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
        boolean boolean12 = byteBuffer11.hasRemaining();
        java.nio.ByteBuffer byteBuffer14 = java.nio.ByteBuffer.allocate((int) ' ');
        java.nio.Buffer buffer15 = byteBuffer14.rewind();
        java.nio.ByteBuffer byteBuffer16 = byteBuffer14.compact();
        java.nio.ByteBuffer byteBuffer17 = byteBuffer16.slice();
        java.nio.Buffer buffer19 = byteBuffer16.limit(9);
        java.nio.ByteBuffer byteBuffer20 = byteBuffer16.duplicate();
        java.nio.ByteBuffer byteBuffer22 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer23 = byteBuffer22.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer24 = byteBuffer22.asShortBuffer();
        byte[] byteArray25 = byteBuffer22.array();
        java.nio.ByteBuffer byteBuffer26 = byteBuffer16.get(byteArray25);
        java.nio.ByteBuffer byteBuffer27 = byteBuffer11.get(byteArray25);
        java.nio.ByteBuffer byteBuffer29 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer30 = byteBuffer29.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer31 = byteBuffer29.asShortBuffer();
        byte[] byteArray32 = byteBuffer29.array();
        java.nio.ByteBuffer byteBuffer33 = java.nio.ByteBuffer.wrap(byteArray32);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer36 = byteBuffer27.put(byteArray32, 85, 1);
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
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(byteBuffer14);
        org.junit.Assert.assertNotNull(buffer15);
        org.junit.Assert.assertNotNull(byteBuffer16);
        org.junit.Assert.assertNotNull(byteBuffer17);
        org.junit.Assert.assertNotNull(buffer19);
        org.junit.Assert.assertNotNull(byteBuffer20);
        org.junit.Assert.assertNotNull(byteBuffer22);
        org.junit.Assert.assertNotNull(doubleBuffer23);
        org.junit.Assert.assertNotNull(shortBuffer24);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[]");
        org.junit.Assert.assertNotNull(byteBuffer26);
        org.junit.Assert.assertNotNull(byteBuffer27);
        org.junit.Assert.assertNotNull(byteBuffer29);
        org.junit.Assert.assertNotNull(doubleBuffer30);
        org.junit.Assert.assertNotNull(shortBuffer31);
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray32), "[]");
        org.junit.Assert.assertNotNull(byteBuffer33);
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1031");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int5 = response4.numRedirects;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response7 = response4.removeHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1032");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.ByteBuffer byteBuffer2 = byteBuffer1.slice();
        java.nio.ByteBuffer byteBuffer4 = java.nio.ByteBuffer.allocate((int) ' ');
        java.nio.Buffer buffer5 = byteBuffer4.rewind();
        java.nio.ByteBuffer byteBuffer6 = byteBuffer4.compact();
        java.nio.ByteOrder byteOrder7 = byteBuffer4.order();
        java.nio.ByteBuffer byteBuffer8 = byteBuffer2.order(byteOrder7);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer10 = byteBuffer2.putInt((int) (byte) -1);
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
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1033");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate((int) (byte) 10);
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.nio.ByteBuffer byteBuffer6 = java.nio.ByteBuffer.wrap(byteArray5);
        java.nio.ByteBuffer byteBuffer7 = byteBuffer1.get(byteArray5);
        java.nio.Buffer buffer8 = byteBuffer1.rewind();
        byte[] byteArray12 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.nio.ByteBuffer byteBuffer13 = java.nio.ByteBuffer.wrap(byteArray12);
        java.nio.ByteBuffer byteBuffer14 = byteBuffer1.put(byteArray12);
        java.nio.ByteBuffer byteBuffer16 = java.nio.ByteBuffer.allocate((int) (byte) 10);
        int int17 = byteBuffer16.getInt();
        java.nio.ByteBuffer byteBuffer20 = byteBuffer16.put((int) (byte) 0, (byte) 10);
        java.nio.IntBuffer intBuffer21 = byteBuffer16.asIntBuffer();
        byte[] byteArray25 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.nio.ByteBuffer byteBuffer26 = java.nio.ByteBuffer.wrap(byteArray25);
        java.nio.ByteBuffer byteBuffer27 = java.nio.ByteBuffer.wrap(byteArray25);
        java.nio.ByteBuffer byteBuffer28 = byteBuffer16.get(byteArray25);
        java.nio.ByteBuffer byteBuffer29 = byteBuffer1.get(byteArray25);
        float float30 = byteBuffer29.getFloat();
        java.nio.ByteBuffer byteBuffer32 = java.nio.ByteBuffer.allocate(0);
        boolean boolean33 = byteBuffer32.isReadOnly();
        java.nio.ShortBuffer shortBuffer34 = byteBuffer32.asShortBuffer();
        int int35 = byteBuffer32.position();
        boolean boolean36 = byteBuffer32.isReadOnly();
        java.nio.CharBuffer charBuffer37 = byteBuffer32.asCharBuffer();
        boolean boolean38 = byteBuffer32.hasRemaining();
        byte[] byteArray39 = byteBuffer32.array();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer42 = byteBuffer29.put(byteArray39, (int) (short) 10, 22);
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
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[100, 1, 1]");
        org.junit.Assert.assertNotNull(byteBuffer13);
        org.junit.Assert.assertNotNull(byteBuffer14);
        org.junit.Assert.assertNotNull(byteBuffer16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(byteBuffer20);
        org.junit.Assert.assertNotNull(intBuffer21);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(byteBuffer26);
        org.junit.Assert.assertNotNull(byteBuffer27);
        org.junit.Assert.assertNotNull(byteBuffer28);
        org.junit.Assert.assertNotNull(byteBuffer29);
        org.junit.Assert.assertTrue("'" + float30 + "' != '" + 0.0f + "'", float30 == 0.0f);
        org.junit.Assert.assertNotNull(byteBuffer32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(shortBuffer34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(charBuffer37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray39), "[]");
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1034");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer2 = byteBuffer1.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        java.nio.ByteBuffer byteBuffer4 = byteBuffer1.compact();
        int int5 = byteBuffer1.remaining();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer8 = byteBuffer1.putShort((int) (byte) 10, (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(doubleBuffer2);
        org.junit.Assert.assertNotNull(shortBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1035");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect(2);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer3 = byteBuffer1.putLong((long) 1677787392);
            org.junit.Assert.fail("Expected exception of type java.nio.BufferOverflowException; message: null");
        } catch (java.nio.BufferOverflowException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1036");
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
            long long14 = byteBuffer1.getLong();
            org.junit.Assert.fail("Expected exception of type java.nio.BufferUnderflowException; message: null");
        } catch (java.nio.BufferUnderflowException e) {
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
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1037");
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
        java.nio.ByteBuffer byteBuffer39 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer40 = byteBuffer39.asDoubleBuffer();
        boolean boolean41 = byteBuffer39.isDirect();
        java.nio.ByteBuffer byteBuffer43 = java.nio.ByteBuffer.allocate(0);
        boolean boolean44 = byteBuffer43.isReadOnly();
        java.nio.ShortBuffer shortBuffer45 = byteBuffer43.asShortBuffer();
        java.nio.ByteBuffer byteBuffer47 = java.nio.ByteBuffer.allocate(0);
        boolean boolean48 = byteBuffer47.isReadOnly();
        int int49 = byteBuffer43.compareTo(byteBuffer47);
        java.nio.Buffer buffer50 = byteBuffer47.clear();
        java.nio.ByteBuffer byteBuffer52 = java.nio.ByteBuffer.allocate(0);
        boolean boolean53 = byteBuffer52.hasRemaining();
        java.nio.ByteBuffer byteBuffer54 = byteBuffer47.put(byteBuffer52);
        java.nio.ByteBuffer byteBuffer55 = byteBuffer47.slice();
        java.nio.ByteBuffer byteBuffer56 = byteBuffer39.put(byteBuffer55);
        java.nio.Buffer buffer57 = byteBuffer56.mark();
        java.nio.Buffer buffer58 = byteBuffer56.reset();
        java.nio.ByteBuffer byteBuffer60 = java.nio.ByteBuffer.allocate(0);
        boolean boolean61 = byteBuffer60.isReadOnly();
        java.nio.ShortBuffer shortBuffer62 = byteBuffer60.asShortBuffer();
        java.nio.ByteBuffer byteBuffer64 = java.nio.ByteBuffer.allocate(0);
        boolean boolean65 = byteBuffer64.isReadOnly();
        int int66 = byteBuffer60.compareTo(byteBuffer64);
        java.nio.DoubleBuffer doubleBuffer67 = byteBuffer64.asDoubleBuffer();
        java.nio.FloatBuffer floatBuffer68 = byteBuffer64.asFloatBuffer();
        java.nio.ByteBuffer byteBuffer70 = java.nio.ByteBuffer.allocate((int) (byte) 10);
        byte[] byteArray74 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.nio.ByteBuffer byteBuffer75 = java.nio.ByteBuffer.wrap(byteArray74);
        java.nio.ByteBuffer byteBuffer76 = byteBuffer70.get(byteArray74);
        java.nio.ByteBuffer byteBuffer79 = byteBuffer64.put(byteArray74, 0, (int) (byte) 0);
        java.nio.ByteBuffer byteBuffer80 = java.nio.ByteBuffer.wrap(byteArray74);
        byte[] byteArray81 = new byte[] {};
        java.nio.ByteBuffer byteBuffer82 = java.nio.ByteBuffer.wrap(byteArray81);
        java.nio.ByteBuffer byteBuffer83 = byteBuffer80.get(byteArray81);
        java.nio.ByteBuffer byteBuffer84 = byteBuffer56.put(byteArray81);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer87 = byteBuffer6.put(byteArray81, 31, (int) (short) 10);
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
        org.junit.Assert.assertNotNull(byteBuffer39);
        org.junit.Assert.assertNotNull(doubleBuffer40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(byteBuffer43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(shortBuffer45);
        org.junit.Assert.assertNotNull(byteBuffer47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertNotNull(buffer50);
        org.junit.Assert.assertNotNull(byteBuffer52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(byteBuffer54);
        org.junit.Assert.assertNotNull(byteBuffer55);
        org.junit.Assert.assertNotNull(byteBuffer56);
        org.junit.Assert.assertNotNull(buffer57);
        org.junit.Assert.assertNotNull(buffer58);
        org.junit.Assert.assertNotNull(byteBuffer60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(shortBuffer62);
        org.junit.Assert.assertNotNull(byteBuffer64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertNotNull(doubleBuffer67);
        org.junit.Assert.assertNotNull(floatBuffer68);
        org.junit.Assert.assertNotNull(byteBuffer70);
        org.junit.Assert.assertNotNull(byteArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray74), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(byteBuffer75);
        org.junit.Assert.assertNotNull(byteBuffer76);
        org.junit.Assert.assertNotNull(byteBuffer79);
        org.junit.Assert.assertNotNull(byteBuffer80);
        org.junit.Assert.assertNotNull(byteArray81);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray81), "[]");
        org.junit.Assert.assertNotNull(byteBuffer82);
        org.junit.Assert.assertNotNull(byteBuffer83);
        org.junit.Assert.assertNotNull(byteBuffer84);
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1038");
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
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer33 = byteBuffer25.putLong(3, (long) (-1));
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
        org.junit.Assert.assertNotNull(buffer30);
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1039");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer2 = byteBuffer1.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        java.nio.ByteBuffer byteBuffer4 = byteBuffer1.compact();
        int int5 = byteBuffer1.arrayOffset();
        // The following exception was thrown during execution in test generation
        try {
            char char6 = byteBuffer1.getChar();
            org.junit.Assert.fail("Expected exception of type java.nio.BufferUnderflowException; message: null");
        } catch (java.nio.BufferUnderflowException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(doubleBuffer2);
        org.junit.Assert.assertNotNull(shortBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1040");
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
        float float21 = byteBuffer20.getFloat();
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
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 0.0f + "'", float21 == 0.0f);
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1041");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer2 = byteBuffer1.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        java.nio.ByteOrder byteOrder4 = null;
        java.nio.ByteBuffer byteBuffer5 = byteBuffer1.order(byteOrder4);
        java.nio.Buffer buffer6 = byteBuffer1.clear();
        // The following exception was thrown during execution in test generation
        try {
            float float7 = byteBuffer1.getFloat();
            org.junit.Assert.fail("Expected exception of type java.nio.BufferUnderflowException; message: null");
        } catch (java.nio.BufferUnderflowException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(doubleBuffer2);
        org.junit.Assert.assertNotNull(shortBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertNotNull(buffer6);
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1042");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str4 = response3.statusMessage();
        org.jsoup.Connection.Request request5 = null;
        response3.req = request5;
        int int7 = response3.statusCode();
        java.lang.String str8 = response3.statusMessage();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document9 = response3.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1043");
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
        // The following exception was thrown during execution in test generation
        try {
            double double35 = byteBuffer20.getDouble(4);
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
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1044");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str2 = response1.contentType;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response1);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Too many redirects occurred trying to load URL null");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1045");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer2 = byteBuffer1.asDoubleBuffer();
        boolean boolean3 = byteBuffer1.isDirect();
        int int4 = byteBuffer1.arrayOffset();
        java.nio.ByteBuffer byteBuffer5 = byteBuffer1.asReadOnlyBuffer();
        java.nio.ShortBuffer shortBuffer6 = byteBuffer5.asShortBuffer();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.Buffer buffer8 = shortBuffer6.position((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: newPosition > limit: (100 > 0)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(doubleBuffer2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertNotNull(shortBuffer6);
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1046");
        byte[] byteArray0 = new byte[] {};
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.wrap(byteArray0);
        java.nio.Buffer buffer2 = byteBuffer1.flip();
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.asReadOnlyBuffer();
        java.nio.ByteBuffer byteBuffer4 = byteBuffer1.duplicate();
        int int5 = byteBuffer1.position();
        // The following exception was thrown during execution in test generation
        try {
            long long6 = byteBuffer1.getLong();
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
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1047");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate((int) ' ');
        int int3 = byteBuffer1.getInt((int) (short) 0);
        java.nio.CharBuffer charBuffer4 = byteBuffer1.asCharBuffer();
        java.nio.ByteBuffer byteBuffer5 = byteBuffer1.compact();
        boolean boolean6 = byteBuffer5.isDirect();
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(charBuffer4);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1048");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect((int) 'a');
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.putFloat((float) 1L);
        java.nio.ByteBuffer byteBuffer5 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer6 = byteBuffer5.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer7 = byteBuffer5.asShortBuffer();
        java.nio.ByteBuffer byteBuffer8 = byteBuffer5.compact();
        java.nio.ByteBuffer byteBuffer9 = byteBuffer5.slice();
        java.nio.ByteOrder byteOrder10 = byteBuffer5.order();
        java.nio.ByteBuffer byteBuffer11 = byteBuffer3.order(byteOrder10);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.Buffer buffer12 = byteBuffer3.reset();
            org.junit.Assert.fail("Expected exception of type java.nio.InvalidMarkException; message: null");
        } catch (java.nio.InvalidMarkException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertNotNull(doubleBuffer6);
        org.junit.Assert.assertNotNull(shortBuffer7);
        org.junit.Assert.assertNotNull(byteBuffer8);
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertNotNull(byteOrder10);
        org.junit.Assert.assertNotNull(byteBuffer11);
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1049");
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
        boolean boolean22 = byteBuffer19.isReadOnly();
        java.nio.ByteBuffer byteBuffer23 = byteBuffer19.compact();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer25 = byteBuffer23.putInt(7);
            org.junit.Assert.fail("Expected exception of type java.nio.BufferOverflowException; message: null");
        } catch (java.nio.BufferOverflowException e) {
        // Expected exception.
        }
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(byteBuffer23);
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1050");
        org.jsoup.helper.HttpConnection.Response.MAX_REDIRECTS = 100;
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1051");
        byte[] byteArray3 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.nio.ByteBuffer byteBuffer4 = java.nio.ByteBuffer.wrap(byteArray3);
        java.nio.ByteBuffer byteBuffer5 = java.nio.ByteBuffer.wrap(byteArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer8 = java.nio.ByteBuffer.wrap(byteArray3, (int) (short) 100, (int) '\000');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[100, 1, 1]");
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertNotNull(byteBuffer5);
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1052");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect((int) '#');
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.putShort((short) 0);
        java.nio.ByteOrder byteOrder4 = byteBuffer3.order();
        double double5 = byteBuffer3.getDouble();
        java.nio.ByteBuffer byteBuffer8 = byteBuffer3.putFloat((int) (short) 10, (float) 22);
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertNotNull(byteOrder4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(byteBuffer8);
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1053");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.header("");
        org.jsoup.Connection.Response response5 = response1.removeCookie("hi!");
        java.lang.String str7 = response1.cookie("");
        java.lang.String str8 = response1.statusMessage();
        int int9 = response1.statusCode();
        response1.contentType = "java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]";
        java.lang.String str13 = response1.header("java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1054");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer2 = byteBuffer1.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        java.nio.ByteOrder byteOrder4 = null;
        java.nio.ByteBuffer byteBuffer5 = byteBuffer1.order(byteOrder4);
        java.nio.ByteBuffer byteBuffer6 = byteBuffer5.asReadOnlyBuffer();
        java.nio.Buffer buffer7 = byteBuffer5.clear();
        int int8 = buffer7.capacity();
        java.nio.Buffer buffer9 = buffer7.rewind();
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(doubleBuffer2);
        org.junit.Assert.assertNotNull(shortBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertNotNull(byteBuffer6);
        org.junit.Assert.assertNotNull(buffer7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(buffer9);
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1055");
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
        java.nio.ByteBuffer byteBuffer14 = byteBuffer13.slice();
        java.lang.String str15 = byteBuffer14.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer17 = byteBuffer14.putInt((int) (short) 100);
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
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]" + "'", str15, "java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]");
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1056");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate((int) (byte) 10);
        int int2 = byteBuffer1.getInt();
        java.nio.ByteBuffer byteBuffer5 = byteBuffer1.put((int) (byte) 0, (byte) 10);
        byte[] byteArray6 = byteBuffer5.array();
        java.nio.DoubleBuffer doubleBuffer7 = byteBuffer5.asDoubleBuffer();
        float float8 = byteBuffer5.getFloat();
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(doubleBuffer7);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8 == 0.0f);
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1057");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        response2.executed = false;
        java.lang.String str5 = response2.contentType;
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response2);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response7 = org.jsoup.helper.HttpConnection.Response.execute(request0, response6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1058");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.nio.ByteBuffer byteBuffer5 = response4.byteData;
        org.jsoup.Connection.Response response8 = response4.cookie("hi!", "");
        boolean boolean9 = response4.executed;
        java.lang.String str10 = response4.charset();
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response4);
        java.lang.String str12 = response11.charset;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry14 = response11.scanHeaders("hi!");
        response11.contentType = "hi!";
        response11.executed = true;
        org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response(response11);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response20 = org.jsoup.helper.HttpConnection.Response.execute(request0, response19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(byteBuffer5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(strEntry14);
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1059");
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
        response3.statusCode = 10;
        java.lang.String str17 = response3.getHeaderCaseInsensitive("java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]");
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response(response3);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response19 = org.jsoup.helper.HttpConnection.Response.execute(request0, response18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(request4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1060");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect(32);
        org.junit.Assert.assertNotNull(byteBuffer1);
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1061");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.nio.ByteBuffer byteBuffer4 = response3.byteData;
        java.lang.String str5 = response3.charset;
        java.lang.String str6 = response3.contentType;
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response3);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response10 = response3.cookie("", "java.nio.HeapByteBufferR[pos=0 lim=0 cap=0]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(byteBuffer4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1062");
        byte[] byteArray0 = new byte[] {};
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.wrap(byteArray0);
        java.nio.Buffer buffer2 = byteBuffer1.flip();
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.asReadOnlyBuffer();
        java.nio.ByteBuffer byteBuffer4 = byteBuffer1.duplicate();
        java.nio.ByteBuffer byteBuffer6 = java.nio.ByteBuffer.allocate(0);
        boolean boolean7 = byteBuffer6.isReadOnly();
        java.nio.ShortBuffer shortBuffer8 = byteBuffer6.asShortBuffer();
        int int9 = byteBuffer6.position();
        boolean boolean10 = byteBuffer6.isReadOnly();
        java.nio.ByteOrder byteOrder11 = byteBuffer6.order();
        java.nio.ByteBuffer byteBuffer12 = byteBuffer4.order(byteOrder11);
        java.nio.ByteBuffer byteBuffer14 = java.nio.ByteBuffer.allocate((int) (byte) 10);
        byte[] byteArray18 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.nio.ByteBuffer byteBuffer19 = java.nio.ByteBuffer.wrap(byteArray18);
        java.nio.ByteBuffer byteBuffer20 = byteBuffer14.get(byteArray18);
        java.nio.LongBuffer longBuffer21 = byteBuffer14.asLongBuffer();
        java.nio.ByteBuffer byteBuffer22 = byteBuffer14.slice();
        java.nio.ByteBuffer byteBuffer24 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer25 = byteBuffer24.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer26 = byteBuffer24.asShortBuffer();
        java.nio.ByteOrder byteOrder27 = null;
        java.nio.ByteBuffer byteBuffer28 = byteBuffer24.order(byteOrder27);
        java.nio.ByteBuffer byteBuffer30 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer31 = byteBuffer30.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer32 = byteBuffer30.asShortBuffer();
        int int33 = byteBuffer30.limit();
        byte[] byteArray34 = byteBuffer30.array();
        java.nio.ByteBuffer byteBuffer35 = byteBuffer24.put(byteArray34);
        java.nio.ByteBuffer byteBuffer36 = byteBuffer22.get(byteArray34);
        java.nio.ByteBuffer byteBuffer37 = byteBuffer12.get(byteArray34);
        java.nio.Buffer buffer38 = byteBuffer12.flip();
        java.nio.ByteBuffer byteBuffer40 = java.nio.ByteBuffer.allocate((int) (byte) 10);
        byte[] byteArray44 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.nio.ByteBuffer byteBuffer45 = java.nio.ByteBuffer.wrap(byteArray44);
        java.nio.ByteBuffer byteBuffer46 = byteBuffer40.get(byteArray44);
        java.nio.Buffer buffer47 = byteBuffer40.rewind();
        int int48 = byteBuffer40.position();
        java.nio.Buffer buffer49 = byteBuffer40.rewind();
        java.nio.ByteBuffer byteBuffer50 = byteBuffer40.slice();
        int int51 = byteBuffer12.compareTo(byteBuffer40);
        // The following exception was thrown during execution in test generation
        try {
            int int52 = byteBuffer12.getInt();
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
        org.junit.Assert.assertNotNull(byteBuffer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(shortBuffer8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(byteOrder11);
        org.junit.Assert.assertNotNull(byteBuffer12);
        org.junit.Assert.assertNotNull(byteBuffer14);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(byteBuffer19);
        org.junit.Assert.assertNotNull(byteBuffer20);
        org.junit.Assert.assertNotNull(longBuffer21);
        org.junit.Assert.assertNotNull(byteBuffer22);
        org.junit.Assert.assertNotNull(byteBuffer24);
        org.junit.Assert.assertNotNull(doubleBuffer25);
        org.junit.Assert.assertNotNull(shortBuffer26);
        org.junit.Assert.assertNotNull(byteBuffer28);
        org.junit.Assert.assertNotNull(byteBuffer30);
        org.junit.Assert.assertNotNull(doubleBuffer31);
        org.junit.Assert.assertNotNull(shortBuffer32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray34), "[]");
        org.junit.Assert.assertNotNull(byteBuffer35);
        org.junit.Assert.assertNotNull(byteBuffer36);
        org.junit.Assert.assertNotNull(byteBuffer37);
        org.junit.Assert.assertNotNull(buffer38);
        org.junit.Assert.assertNotNull(byteBuffer40);
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray44), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(byteBuffer45);
        org.junit.Assert.assertNotNull(byteBuffer46);
        org.junit.Assert.assertNotNull(buffer47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(buffer49);
        org.junit.Assert.assertNotNull(byteBuffer50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-10) + "'", int51 == (-10));
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1063");
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
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer16 = byteBuffer7.putInt(2, 65);
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
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1064");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer2 = byteBuffer1.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        java.nio.ByteBuffer byteBuffer4 = byteBuffer1.compact();
        java.nio.ByteBuffer byteBuffer5 = byteBuffer1.slice();
        java.nio.ByteBuffer byteBuffer7 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer8 = byteBuffer7.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer9 = byteBuffer7.asShortBuffer();
        java.nio.ByteBuffer byteBuffer10 = byteBuffer7.compact();
        int int11 = byteBuffer10.capacity();
        java.nio.Buffer buffer12 = byteBuffer10.mark();
        int int13 = byteBuffer1.compareTo(byteBuffer10);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.Buffer buffer15 = byteBuffer10.limit((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(doubleBuffer2);
        org.junit.Assert.assertNotNull(shortBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertNotNull(byteBuffer7);
        org.junit.Assert.assertNotNull(doubleBuffer8);
        org.junit.Assert.assertNotNull(shortBuffer9);
        org.junit.Assert.assertNotNull(byteBuffer10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(buffer12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1065");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate((int) (byte) 10);
        int int2 = byteBuffer1.getInt();
        // The following exception was thrown during execution in test generation
        try {
            float float4 = byteBuffer1.getFloat((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1066");
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
            int int9 = byteBuffer6.getInt();
            org.junit.Assert.fail("Expected exception of type java.nio.BufferUnderflowException; message: null");
        } catch (java.nio.BufferUnderflowException e) {
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
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1067");
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
            java.nio.ByteBuffer byteBuffer18 = byteBuffer15.putInt(100);
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
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1068");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate((int) (byte) 10);
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.nio.ByteBuffer byteBuffer6 = java.nio.ByteBuffer.wrap(byteArray5);
        java.nio.ByteBuffer byteBuffer7 = byteBuffer1.get(byteArray5);
        java.nio.Buffer buffer8 = byteBuffer1.rewind();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer11 = byteBuffer1.putLong(65, (long) 32);
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
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1069");
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
        response15.executed = false;
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response(response15);
        boolean boolean20 = response18.hasCookie("java.nio.HeapByteBuffer[pos=3 lim=10 cap=10]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1070");
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
        java.nio.ByteBuffer byteBuffer29 = byteBuffer28.compact();
        java.nio.Buffer buffer30 = byteBuffer29.flip();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer33 = byteBuffer29.putInt(11, (-32));
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
        org.junit.Assert.assertNotNull(buffer30);
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1071");
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
        java.nio.ByteBuffer byteBuffer24 = byteBuffer22.putShort((short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer26 = byteBuffer22.putLong((long) (-32));
            org.junit.Assert.fail("Expected exception of type java.nio.BufferOverflowException; message: null");
        } catch (java.nio.BufferOverflowException e) {
        // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(byteBuffer24);
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1072");
        byte[] byteArray0 = new byte[] {};
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.wrap(byteArray0);
        java.nio.Buffer buffer2 = byteBuffer1.flip();
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.asReadOnlyBuffer();
        java.nio.ByteBuffer byteBuffer4 = byteBuffer1.duplicate();
        java.nio.ByteBuffer byteBuffer6 = java.nio.ByteBuffer.allocate(0);
        boolean boolean7 = byteBuffer6.isReadOnly();
        java.nio.ShortBuffer shortBuffer8 = byteBuffer6.asShortBuffer();
        int int9 = byteBuffer6.position();
        boolean boolean10 = byteBuffer6.isReadOnly();
        java.nio.ByteOrder byteOrder11 = byteBuffer6.order();
        java.nio.ByteBuffer byteBuffer12 = byteBuffer4.order(byteOrder11);
        java.nio.ByteBuffer byteBuffer14 = java.nio.ByteBuffer.allocate((int) (byte) 10);
        byte[] byteArray18 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.nio.ByteBuffer byteBuffer19 = java.nio.ByteBuffer.wrap(byteArray18);
        java.nio.ByteBuffer byteBuffer20 = byteBuffer14.get(byteArray18);
        java.nio.LongBuffer longBuffer21 = byteBuffer14.asLongBuffer();
        java.nio.ByteBuffer byteBuffer22 = byteBuffer14.slice();
        java.nio.ByteBuffer byteBuffer24 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer25 = byteBuffer24.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer26 = byteBuffer24.asShortBuffer();
        java.nio.ByteOrder byteOrder27 = null;
        java.nio.ByteBuffer byteBuffer28 = byteBuffer24.order(byteOrder27);
        java.nio.ByteBuffer byteBuffer30 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer31 = byteBuffer30.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer32 = byteBuffer30.asShortBuffer();
        int int33 = byteBuffer30.limit();
        byte[] byteArray34 = byteBuffer30.array();
        java.nio.ByteBuffer byteBuffer35 = byteBuffer24.put(byteArray34);
        java.nio.ByteBuffer byteBuffer36 = byteBuffer22.get(byteArray34);
        java.nio.ByteBuffer byteBuffer37 = byteBuffer12.get(byteArray34);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer40 = java.nio.ByteBuffer.wrap(byteArray34, (int) 'a', 4);
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
        org.junit.Assert.assertNotNull(byteBuffer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(shortBuffer8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(byteOrder11);
        org.junit.Assert.assertNotNull(byteBuffer12);
        org.junit.Assert.assertNotNull(byteBuffer14);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(byteBuffer19);
        org.junit.Assert.assertNotNull(byteBuffer20);
        org.junit.Assert.assertNotNull(longBuffer21);
        org.junit.Assert.assertNotNull(byteBuffer22);
        org.junit.Assert.assertNotNull(byteBuffer24);
        org.junit.Assert.assertNotNull(doubleBuffer25);
        org.junit.Assert.assertNotNull(shortBuffer26);
        org.junit.Assert.assertNotNull(byteBuffer28);
        org.junit.Assert.assertNotNull(byteBuffer30);
        org.junit.Assert.assertNotNull(doubleBuffer31);
        org.junit.Assert.assertNotNull(shortBuffer32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray34), "[]");
        org.junit.Assert.assertNotNull(byteBuffer35);
        org.junit.Assert.assertNotNull(byteBuffer36);
        org.junit.Assert.assertNotNull(byteBuffer37);
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1073");
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
        org.jsoup.Connection.Request request14 = response13.req;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(request14);
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1074");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.executed = false;
        java.lang.String str4 = response1.contentType;
        int int5 = response1.statusCode;
        java.lang.String str6 = response1.charset();
        java.lang.String str8 = response1.header("java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]");
        java.lang.String str9 = response1.contentType;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1075");
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
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer21 = byteBuffer1.put(0, (byte) 10);
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
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1076");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.header("");
        boolean boolean5 = response1.hasCookie("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document6 = response1.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1077");
        byte[] byteArray0 = new byte[] {};
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.wrap(byteArray0);
        java.nio.Buffer buffer2 = byteBuffer1.flip();
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.asReadOnlyBuffer();
        java.nio.ByteBuffer byteBuffer4 = byteBuffer1.duplicate();
        java.nio.ByteBuffer byteBuffer6 = java.nio.ByteBuffer.allocate(0);
        boolean boolean7 = byteBuffer6.isReadOnly();
        java.nio.ShortBuffer shortBuffer8 = byteBuffer6.asShortBuffer();
        int int9 = byteBuffer6.position();
        boolean boolean10 = byteBuffer6.isReadOnly();
        java.nio.ByteOrder byteOrder11 = byteBuffer6.order();
        java.nio.ByteBuffer byteBuffer12 = byteBuffer4.order(byteOrder11);
        java.nio.ByteBuffer byteBuffer14 = java.nio.ByteBuffer.allocate((int) (byte) 10);
        byte[] byteArray18 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.nio.ByteBuffer byteBuffer19 = java.nio.ByteBuffer.wrap(byteArray18);
        java.nio.ByteBuffer byteBuffer20 = byteBuffer14.get(byteArray18);
        java.nio.LongBuffer longBuffer21 = byteBuffer14.asLongBuffer();
        java.nio.ByteBuffer byteBuffer22 = byteBuffer14.slice();
        java.nio.ByteBuffer byteBuffer24 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer25 = byteBuffer24.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer26 = byteBuffer24.asShortBuffer();
        java.nio.ByteOrder byteOrder27 = null;
        java.nio.ByteBuffer byteBuffer28 = byteBuffer24.order(byteOrder27);
        java.nio.ByteBuffer byteBuffer30 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer31 = byteBuffer30.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer32 = byteBuffer30.asShortBuffer();
        int int33 = byteBuffer30.limit();
        byte[] byteArray34 = byteBuffer30.array();
        java.nio.ByteBuffer byteBuffer35 = byteBuffer24.put(byteArray34);
        java.nio.ByteBuffer byteBuffer36 = byteBuffer22.get(byteArray34);
        java.nio.ByteBuffer byteBuffer37 = byteBuffer12.get(byteArray34);
        int int38 = byteBuffer37.limit();
        int int39 = byteBuffer37.capacity();
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(buffer2);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertNotNull(byteBuffer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(shortBuffer8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(byteOrder11);
        org.junit.Assert.assertNotNull(byteBuffer12);
        org.junit.Assert.assertNotNull(byteBuffer14);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(byteBuffer19);
        org.junit.Assert.assertNotNull(byteBuffer20);
        org.junit.Assert.assertNotNull(longBuffer21);
        org.junit.Assert.assertNotNull(byteBuffer22);
        org.junit.Assert.assertNotNull(byteBuffer24);
        org.junit.Assert.assertNotNull(doubleBuffer25);
        org.junit.Assert.assertNotNull(shortBuffer26);
        org.junit.Assert.assertNotNull(byteBuffer28);
        org.junit.Assert.assertNotNull(byteBuffer30);
        org.junit.Assert.assertNotNull(doubleBuffer31);
        org.junit.Assert.assertNotNull(shortBuffer32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray34), "[]");
        org.junit.Assert.assertNotNull(byteBuffer35);
        org.junit.Assert.assertNotNull(byteBuffer36);
        org.junit.Assert.assertNotNull(byteBuffer37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1078");
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
        // The following exception was thrown during execution in test generation
        try {
            char char23 = byteBuffer18.getChar(85);
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
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1079");
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
        java.nio.IntBuffer intBuffer21 = byteBuffer19.asIntBuffer();
        // The following exception was thrown during execution in test generation
        try {
            double double23 = byteBuffer19.getDouble((-10));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
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
        org.junit.Assert.assertNotNull(intBuffer21);
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1080");
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
            java.nio.ByteBuffer byteBuffer27 = java.nio.ByteBuffer.wrap(byteArray21, (int) 'a', 22);
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
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1081");
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
        // The following exception was thrown during execution in test generation
        try {
            int int15 = byteBuffer13.getInt();
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1082");
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
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response2);
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response(response2);
        response18.executed = true;
        org.junit.Assert.assertNull(request3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1083");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean5 = response3.hasHeader("hi!");
        java.lang.String str6 = response3.statusMessage();
        org.jsoup.Connection.Request request7 = null;
        response3.req = request7;
        org.jsoup.Connection.Response response11 = response3.header("java.nio.HeapByteBufferR[pos=0 lim=0 cap=0]", "java.nio.HeapByteBuffer[pos=3 lim=10 cap=10]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(response11);
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1084");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.header("");
        org.jsoup.Connection.Response response5 = response1.removeCookie("hi!");
        java.lang.String str7 = response1.cookie("");
        java.lang.String str8 = response1.statusMessage();
        int int9 = response1.statusCode;
        java.util.Map<java.lang.String, java.lang.String> strMap10 = response1.headers();
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response1);
        boolean boolean13 = response11.hasHeader("hi!");
        java.lang.String str14 = response11.charset();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1085");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response1);
        boolean boolean4 = response3.executed;
        java.lang.String str6 = response3.getHeaderCaseInsensitive("");
        java.lang.String str8 = response3.cookie("java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]");
        int int9 = response3.statusCode();
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response3);
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response10);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response12 = org.jsoup.helper.HttpConnection.Response.execute(request0, response11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1086");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate((int) (byte) 10);
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.nio.ByteBuffer byteBuffer6 = java.nio.ByteBuffer.wrap(byteArray5);
        java.nio.ByteBuffer byteBuffer7 = byteBuffer1.get(byteArray5);
        java.nio.ByteBuffer byteBuffer9 = byteBuffer1.putFloat((float) (byte) 10);
        java.nio.ByteBuffer byteBuffer10 = byteBuffer9.compact();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer12 = byteBuffer10.putDouble((double) 2);
            org.junit.Assert.fail("Expected exception of type java.nio.BufferOverflowException; message: null");
        } catch (java.nio.BufferOverflowException e) {
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
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1087");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response17 = response14.cookie("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(byteBuffer4);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(uRL10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1088");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str4 = response2.header("");
        org.jsoup.Connection.Response response6 = response2.removeCookie("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap7 = response2.headers();
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response2);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response9 = org.jsoup.helper.HttpConnection.Response.execute(request0, response8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNotNull(strMap7);
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1089");
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
        java.nio.ByteBuffer byteBuffer23 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer24 = byteBuffer23.asDoubleBuffer();
        boolean boolean25 = byteBuffer23.isDirect();
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
        java.nio.ByteBuffer byteBuffer39 = byteBuffer31.slice();
        java.nio.ByteBuffer byteBuffer40 = byteBuffer23.put(byteBuffer39);
        byte[] byteArray41 = byteBuffer39.array();
        java.nio.ByteBuffer byteBuffer42 = byteBuffer21.put(byteArray41);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer45 = byteBuffer42.putFloat(9, (float) 42953080832L);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
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
        org.junit.Assert.assertNotNull(byteBuffer23);
        org.junit.Assert.assertNotNull(doubleBuffer24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
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
        org.junit.Assert.assertNotNull(byteBuffer40);
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray41), "[]");
        org.junit.Assert.assertNotNull(byteBuffer42);
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1090");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.statusCode();
        boolean boolean4 = response1.hasHeader("hi!");
        java.lang.String str6 = response1.header("java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]");
        java.lang.String str7 = response1.statusMessage();
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Method method9 = response8.method();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(method9);
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1091");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate((int) (byte) 10);
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.nio.ByteBuffer byteBuffer6 = java.nio.ByteBuffer.wrap(byteArray5);
        java.nio.ByteBuffer byteBuffer7 = byteBuffer1.get(byteArray5);
        java.nio.Buffer buffer8 = byteBuffer1.rewind();
        byte[] byteArray12 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.nio.ByteBuffer byteBuffer13 = java.nio.ByteBuffer.wrap(byteArray12);
        java.nio.ByteBuffer byteBuffer14 = byteBuffer1.put(byteArray12);
        java.nio.ByteOrder byteOrder15 = byteBuffer14.order();
        // The following exception was thrown during execution in test generation
        try {
            byte byte17 = byteBuffer14.get((int) (byte) -1);
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
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[100, 1, 1]");
        org.junit.Assert.assertNotNull(byteBuffer13);
        org.junit.Assert.assertNotNull(byteBuffer14);
        org.junit.Assert.assertNotNull(byteOrder15);
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1092");
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
        // The following exception was thrown during execution in test generation
        try {
            double double12 = byteBuffer3.getDouble();
            org.junit.Assert.fail("Expected exception of type java.nio.BufferUnderflowException; message: null");
        } catch (java.nio.BufferUnderflowException e) {
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
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1093");
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
            float float23 = byteBuffer20.getFloat(85);
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
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1094");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate((int) (byte) 10);
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.nio.ByteBuffer byteBuffer6 = java.nio.ByteBuffer.wrap(byteArray5);
        java.nio.ByteBuffer byteBuffer7 = byteBuffer1.get(byteArray5);
        java.nio.Buffer buffer8 = byteBuffer1.rewind();
        java.nio.ByteBuffer byteBuffer10 = byteBuffer1.putInt((int) (short) 10);
        java.nio.ByteBuffer byteBuffer11 = byteBuffer1.asReadOnlyBuffer();
        // The following exception was thrown during execution in test generation
        try {
            double double12 = byteBuffer1.getDouble();
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
        org.junit.Assert.assertNotNull(byteBuffer10);
        org.junit.Assert.assertNotNull(byteBuffer11);
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1095");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.isReadOnly();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        int int4 = shortBuffer3.limit();
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(shortBuffer3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1096");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.header("");
        org.jsoup.Connection.Response response5 = response1.removeCookie("hi!");
        java.lang.String str7 = response1.cookie("");
        java.lang.String str8 = response1.statusMessage();
        int int9 = response1.statusCode;
        java.util.Map<java.lang.String, java.lang.String> strMap10 = response1.headers();
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response1);
        response11.numRedirects = 35;
        response11.statusCode = (short) 1;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(strMap10);
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1097");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer2 = byteBuffer1.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        java.nio.ByteBuffer byteBuffer4 = byteBuffer1.compact();
        java.nio.ByteBuffer byteBuffer5 = byteBuffer1.slice();
        java.nio.ByteBuffer byteBuffer7 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer8 = byteBuffer7.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer9 = byteBuffer7.asShortBuffer();
        java.nio.ByteBuffer byteBuffer10 = byteBuffer7.compact();
        int int11 = byteBuffer10.capacity();
        java.nio.Buffer buffer12 = byteBuffer10.mark();
        int int13 = byteBuffer1.compareTo(byteBuffer10);
        int int14 = byteBuffer1.capacity();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer17 = byteBuffer1.putChar((int) 'a', ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(doubleBuffer2);
        org.junit.Assert.assertNotNull(shortBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertNotNull(byteBuffer7);
        org.junit.Assert.assertNotNull(doubleBuffer8);
        org.junit.Assert.assertNotNull(shortBuffer9);
        org.junit.Assert.assertNotNull(byteBuffer10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(buffer12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1098");
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
            java.nio.ByteBuffer byteBuffer23 = byteBuffer21.putFloat((float) 100);
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
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1099");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.isReadOnly();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        java.nio.ByteBuffer byteBuffer5 = java.nio.ByteBuffer.allocate(0);
        boolean boolean6 = byteBuffer5.isReadOnly();
        int int7 = byteBuffer1.compareTo(byteBuffer5);
        java.nio.DoubleBuffer doubleBuffer8 = byteBuffer5.asDoubleBuffer();
        java.nio.FloatBuffer floatBuffer9 = byteBuffer5.asFloatBuffer();
        java.lang.String str10 = byteBuffer5.toString();
        java.nio.Buffer buffer11 = byteBuffer5.rewind();
        boolean boolean12 = byteBuffer5.isDirect();
        java.nio.ByteBuffer byteBuffer13 = byteBuffer5.duplicate();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer16 = byteBuffer13.putDouble(0, (double) (short) 10);
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
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]" + "'", str10, "java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]");
        org.junit.Assert.assertNotNull(buffer11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(byteBuffer13);
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1100");
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
            byte byte9 = byteBuffer8.get();
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
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1101");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.nio.ByteBuffer byteBuffer4 = response3.byteData;
        java.lang.String str5 = response3.charset;
        java.lang.String str6 = response3.contentType;
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response3);
        java.lang.Class<?> wildcardClass8 = response3.getClass();
        org.junit.Assert.assertNull(byteBuffer4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1102");
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
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response(response2);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response19 = org.jsoup.helper.HttpConnection.Response.execute(request0, response2);
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
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1103");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.isReadOnly();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        int int4 = byteBuffer1.position();
        int int5 = byteBuffer1.arrayOffset();
        java.nio.IntBuffer intBuffer6 = byteBuffer1.asIntBuffer();
        java.nio.LongBuffer longBuffer7 = byteBuffer1.asLongBuffer();
        int int8 = longBuffer7.position();
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(shortBuffer3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(intBuffer6);
        org.junit.Assert.assertNotNull(longBuffer7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1104");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer2 = byteBuffer1.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        java.nio.ByteBuffer byteBuffer4 = byteBuffer1.compact();
        java.nio.ByteBuffer byteBuffer5 = byteBuffer1.slice();
        java.nio.LongBuffer longBuffer6 = byteBuffer5.asLongBuffer();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer9 = byteBuffer5.putLong(1677787392, (long) 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(doubleBuffer2);
        org.junit.Assert.assertNotNull(shortBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertNotNull(longBuffer6);
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1105");
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
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer19 = byteBuffer15.putShort((short) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.nio.BufferOverflowException; message: null");
        } catch (java.nio.BufferOverflowException e) {
        // Expected exception.
        }
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
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1106");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str4 = response3.statusMessage();
        response3.contentType = "";
        java.lang.String str7 = response3.statusMessage();
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response3);
        response3.statusMessage = "java.nio.HeapByteBuffer[pos=16 lim=100 cap=100]";
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1107");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.isReadOnly();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        int int4 = byteBuffer1.position();
        java.nio.ByteOrder byteOrder5 = null;
        java.nio.ByteBuffer byteBuffer6 = byteBuffer1.order(byteOrder5);
        java.lang.String str7 = byteBuffer6.toString();
        java.nio.ByteBuffer byteBuffer8 = byteBuffer6.slice();
        java.lang.Class<?> wildcardClass9 = byteBuffer6.getClass();
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(shortBuffer3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(byteBuffer6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]" + "'", str7, "java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]");
        org.junit.Assert.assertNotNull(byteBuffer8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1108");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate((int) (byte) 10);
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.nio.ByteBuffer byteBuffer6 = java.nio.ByteBuffer.wrap(byteArray5);
        java.nio.ByteBuffer byteBuffer7 = byteBuffer1.get(byteArray5);
        java.nio.Buffer buffer8 = byteBuffer1.rewind();
        int int9 = byteBuffer1.position();
        java.nio.Buffer buffer10 = byteBuffer1.rewind();
        java.nio.ByteBuffer byteBuffer11 = byteBuffer1.slice();
        java.nio.Buffer buffer12 = byteBuffer1.mark();
        java.lang.Class<?> wildcardClass13 = buffer12.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1109");
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
        java.net.HttpURLConnection httpURLConnection14 = null;
        org.jsoup.helper.HttpConnection.Response response15 = null;
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response15);
        response16.executed = false;
        java.lang.String str19 = response16.contentType;
        int int20 = response16.statusCode;
        java.lang.String str21 = response16.charset();
        org.jsoup.helper.HttpConnection.Response response22 = new org.jsoup.helper.HttpConnection.Response(response16);
        org.jsoup.helper.HttpConnection.Response response23 = new org.jsoup.helper.HttpConnection.Response(response22);
        // The following exception was thrown during execution in test generation
        try {
            response3.setupFromConnection(httpURLConnection14, (org.jsoup.Connection.Response) response23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(byteBuffer4);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(uRL10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1110");
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
        // The following exception was thrown during execution in test generation
        try {
            float float13 = byteBuffer11.getFloat();
            org.junit.Assert.fail("Expected exception of type java.nio.BufferUnderflowException; message: null");
        } catch (java.nio.BufferUnderflowException e) {
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
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1111");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.nio.ByteBuffer byteBuffer4 = response3.byteData;
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response3);
        response3.contentType = "hi!";
        java.lang.String str9 = response3.cookie("hi!");
        org.jsoup.Connection.Response response12 = response3.header("java.nio.HeapByteBufferR[pos=4 lim=10 cap=10]", "java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]");
        java.lang.String str13 = response3.charset;
        org.junit.Assert.assertNull(byteBuffer4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1112");
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
        java.nio.CharBuffer charBuffer24 = byteBuffer23.asCharBuffer();
        boolean boolean25 = charBuffer24.hasRemaining();
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
        org.junit.Assert.assertNotNull(charBuffer24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1113");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer2 = byteBuffer1.asDoubleBuffer();
        java.nio.FloatBuffer floatBuffer3 = byteBuffer1.asFloatBuffer();
        boolean boolean4 = byteBuffer1.hasArray();
        // The following exception was thrown during execution in test generation
        try {
            long long6 = byteBuffer1.getLong((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(doubleBuffer2);
        org.junit.Assert.assertNotNull(floatBuffer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1114");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response1);
        boolean boolean4 = response3.executed;
        java.lang.String str6 = response3.getHeaderCaseInsensitive("");
        java.util.Map<java.lang.String, java.lang.String> strMap7 = response3.headers();
        boolean boolean8 = response3.executed;
        org.jsoup.Connection.Request request9 = null;
        response3.req = request9;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response11 = org.jsoup.helper.HttpConnection.Response.execute(request0, response3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1115");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map<java.lang.String, java.lang.String> strMap2 = response1.headers();
        int int3 = response1.statusCode();
        java.util.Map<java.lang.String, java.lang.String> strMap4 = response1.cookies();
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Request request6 = response1.req;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = response1.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(request6);
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1116");
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
        java.nio.IntBuffer intBuffer21 = byteBuffer19.asIntBuffer();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer24 = byteBuffer19.putFloat((-32), (float) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
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
        org.junit.Assert.assertNotNull(intBuffer21);
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1117");
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
            double double13 = byteBuffer12.getDouble();
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
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1118");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.nio.ByteBuffer byteBuffer4 = response3.byteData;
        org.jsoup.Connection.Response response7 = response3.cookie("hi!", "");
        boolean boolean8 = response3.executed;
        java.lang.String str9 = response3.charset();
        boolean boolean10 = response3.executed;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response13 = response3.cookie("", "java.nio.HeapByteBuffer[pos=3 lim=10 cap=10]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(byteBuffer4);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1119");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean3 = response2.executed;
        response2.statusCode = 0;
        java.lang.String str6 = response2.contentType();
        org.jsoup.Connection.Response response9 = response2.cookie("java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]", "java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry11 = response2.scanHeaders("hi!");
        java.lang.String str13 = response2.getHeaderCaseInsensitive("");
        int int14 = response2.statusCode;
        org.jsoup.Connection.Response response16 = response2.removeCookie("java.nio.HeapByteBuffer[pos=10 lim=10 cap=10]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertNull(strEntry11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(response16);
    }

    @Test
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1120");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.hasRemaining();
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.asReadOnlyBuffer();
        boolean boolean4 = byteBuffer1.isDirect();
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1121");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer2 = byteBuffer1.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        java.nio.ByteOrder byteOrder4 = null;
        java.nio.ByteBuffer byteBuffer5 = byteBuffer1.order(byteOrder4);
        java.nio.ByteBuffer byteBuffer6 = byteBuffer5.asReadOnlyBuffer();
        java.nio.Buffer buffer8 = byteBuffer5.position((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer10 = byteBuffer5.putLong((long) '4');
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
    }

    @Test
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1122");
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
        java.nio.CharBuffer charBuffer14 = byteBuffer5.asCharBuffer();
        // The following exception was thrown during execution in test generation
        try {
            float float15 = byteBuffer5.getFloat();
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
        org.junit.Assert.assertNotNull(charBuffer14);
    }

    @Test
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1123");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate((int) (byte) 10);
        short short3 = byteBuffer1.getShort(1);
        java.nio.ByteBuffer byteBuffer5 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer6 = byteBuffer5.asDoubleBuffer();
        boolean boolean7 = byteBuffer5.isDirect();
        java.lang.String str8 = byteBuffer5.toString();
        byte[] byteArray9 = byteBuffer5.array();
        java.nio.ByteBuffer byteBuffer10 = byteBuffer1.put(byteArray9);
        boolean boolean11 = byteBuffer10.hasRemaining();
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertNotNull(doubleBuffer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]" + "'", str8, "java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[]");
        org.junit.Assert.assertNotNull(byteBuffer10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1124");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.isReadOnly();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        java.nio.ByteBuffer byteBuffer5 = java.nio.ByteBuffer.allocate(0);
        boolean boolean6 = byteBuffer5.isReadOnly();
        int int7 = byteBuffer1.compareTo(byteBuffer5);
        java.nio.Buffer buffer9 = byteBuffer1.limit(0);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer12 = byteBuffer1.putFloat(2, (float) 100L);
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
        org.junit.Assert.assertNotNull(buffer9);
    }

    @Test
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1125");
        byte[] byteArray0 = new byte[] {};
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.wrap(byteArray0);
        java.nio.Buffer buffer2 = byteBuffer1.flip();
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.asReadOnlyBuffer();
        java.nio.ByteBuffer byteBuffer4 = byteBuffer1.duplicate();
        java.nio.ByteBuffer byteBuffer6 = java.nio.ByteBuffer.allocate(0);
        boolean boolean7 = byteBuffer6.isReadOnly();
        java.nio.ShortBuffer shortBuffer8 = byteBuffer6.asShortBuffer();
        int int9 = byteBuffer6.position();
        boolean boolean10 = byteBuffer6.isReadOnly();
        java.nio.ByteOrder byteOrder11 = byteBuffer6.order();
        java.nio.ByteBuffer byteBuffer12 = byteBuffer4.order(byteOrder11);
        int int13 = byteBuffer12.arrayOffset();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer15 = byteBuffer12.putDouble((double) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.nio.BufferOverflowException; message: null");
        } catch (java.nio.BufferOverflowException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(buffer2);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertNotNull(byteBuffer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(shortBuffer8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(byteOrder11);
        org.junit.Assert.assertNotNull(byteBuffer12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1126");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate((int) ' ');
        int int3 = byteBuffer1.getInt((int) (short) 0);
        java.nio.CharBuffer charBuffer4 = byteBuffer1.asCharBuffer();
        java.nio.ByteBuffer byteBuffer7 = byteBuffer1.putInt((int) (byte) 0, (int) ' ');
        java.nio.CharBuffer charBuffer8 = byteBuffer7.asCharBuffer();
        java.nio.Buffer buffer9 = charBuffer8.mark();
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(charBuffer4);
        org.junit.Assert.assertNotNull(byteBuffer7);
        org.junit.Assert.assertNotNull(charBuffer8);
        org.junit.Assert.assertNotNull(buffer9);
    }

    @Test
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1127");
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
        java.nio.ByteBuffer byteBuffer18 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer19 = byteBuffer18.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer20 = byteBuffer18.asShortBuffer();
        java.nio.ByteBuffer byteBuffer21 = byteBuffer18.compact();
        int int22 = byteBuffer21.capacity();
        java.nio.Buffer buffer23 = byteBuffer21.mark();
        boolean boolean24 = byteBuffer1.equals((java.lang.Object) buffer23);
        // The following exception was thrown during execution in test generation
        try {
            long long26 = byteBuffer1.getLong((int) 'a');
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
        org.junit.Assert.assertNotNull(doubleBuffer19);
        org.junit.Assert.assertNotNull(shortBuffer20);
        org.junit.Assert.assertNotNull(byteBuffer21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(buffer23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1128");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean3 = response2.executed;
        java.util.Map<java.lang.String, java.lang.String> strMap4 = response2.cookies();
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response2);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = response5.hasHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strMap4);
    }

    @Test
    public void test1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1129");
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
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response14);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response16 = org.jsoup.helper.HttpConnection.Response.execute(request0, response14);
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
    public void test1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1130");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer2 = byteBuffer1.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        java.nio.ByteBuffer byteBuffer4 = byteBuffer1.compact();
        java.nio.Buffer buffer5 = byteBuffer4.rewind();
        // The following exception was thrown during execution in test generation
        try {
            short short7 = byteBuffer4.getShort(3);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(doubleBuffer2);
        org.junit.Assert.assertNotNull(shortBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertNotNull(buffer5);
    }

    @Test
    public void test1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1131");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate((int) (byte) 10);
        int int2 = byteBuffer1.limit();
        java.nio.ByteBuffer byteBuffer4 = byteBuffer1.putChar(' ');
        java.nio.ByteBuffer byteBuffer6 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer7 = byteBuffer6.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer8 = byteBuffer6.asShortBuffer();
        java.nio.ByteOrder byteOrder9 = null;
        java.nio.ByteBuffer byteBuffer10 = byteBuffer6.order(byteOrder9);
        java.nio.ByteBuffer byteBuffer12 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer13 = byteBuffer12.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer14 = byteBuffer12.asShortBuffer();
        int int15 = byteBuffer12.limit();
        byte[] byteArray16 = byteBuffer12.array();
        java.nio.ByteBuffer byteBuffer17 = byteBuffer6.put(byteArray16);
        java.nio.ByteBuffer byteBuffer18 = byteBuffer1.put(byteArray16);
        short short19 = byteBuffer18.getShort();
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertNotNull(byteBuffer6);
        org.junit.Assert.assertNotNull(doubleBuffer7);
        org.junit.Assert.assertNotNull(shortBuffer8);
        org.junit.Assert.assertNotNull(byteBuffer10);
        org.junit.Assert.assertNotNull(byteBuffer12);
        org.junit.Assert.assertNotNull(doubleBuffer13);
        org.junit.Assert.assertNotNull(shortBuffer14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[]");
        org.junit.Assert.assertNotNull(byteBuffer17);
        org.junit.Assert.assertNotNull(byteBuffer18);
        org.junit.Assert.assertTrue("'" + short19 + "' != '" + (short) 0 + "'", short19 == (short) 0);
    }

    @Test
    public void test1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1132");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate((int) (byte) 100);
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.putDouble((double) '4');
        byte[] byteArray9 = new byte[] { (byte) 1, (byte) 100, (byte) -1, (byte) 10, (byte) -1 };
        java.nio.ByteBuffer byteBuffer10 = byteBuffer1.put(byteArray9);
        java.nio.ByteBuffer byteBuffer13 = byteBuffer10.putDouble((int) '\000', (double) 2560L);
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[1, 100, -1, 10, -1]");
        org.junit.Assert.assertNotNull(byteBuffer10);
        org.junit.Assert.assertNotNull(byteBuffer13);
    }

    @Test
    public void test1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1133");
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
            int int25 = byteBuffer24.getInt();
            org.junit.Assert.fail("Expected exception of type java.nio.BufferUnderflowException; message: null");
        } catch (java.nio.BufferUnderflowException e) {
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
    public void test1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1134");
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
        java.nio.ByteBuffer byteBuffer18 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer19 = byteBuffer18.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer20 = byteBuffer18.asShortBuffer();
        java.nio.ByteBuffer byteBuffer21 = byteBuffer18.compact();
        int int22 = byteBuffer21.capacity();
        java.nio.Buffer buffer23 = byteBuffer21.mark();
        boolean boolean24 = byteBuffer1.equals((java.lang.Object) buffer23);
        org.jsoup.helper.HttpConnection.Response response25 = null;
        org.jsoup.helper.HttpConnection.Response response26 = new org.jsoup.helper.HttpConnection.Response(response25);
        org.jsoup.helper.HttpConnection.Response response27 = new org.jsoup.helper.HttpConnection.Response(response25);
        org.jsoup.helper.HttpConnection.Response response28 = new org.jsoup.helper.HttpConnection.Response(response25);
        java.nio.ByteBuffer byteBuffer29 = response28.byteData;
        org.jsoup.helper.HttpConnection.Response response30 = new org.jsoup.helper.HttpConnection.Response(response28);
        java.nio.ByteBuffer byteBuffer32 = java.nio.ByteBuffer.allocate(0);
        response28.byteData = byteBuffer32;
        int int34 = byteBuffer32.arrayOffset();
        byte[] byteArray35 = new byte[] {};
        java.nio.ByteBuffer byteBuffer36 = java.nio.ByteBuffer.wrap(byteArray35);
        java.nio.ByteBuffer byteBuffer37 = byteBuffer32.get(byteArray35);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer40 = byteBuffer1.put(byteArray35, 31, (-10));
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
        org.junit.Assert.assertNotNull(doubleBuffer19);
        org.junit.Assert.assertNotNull(shortBuffer20);
        org.junit.Assert.assertNotNull(byteBuffer21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(buffer23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(byteBuffer29);
        org.junit.Assert.assertNotNull(byteBuffer32);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray35), "[]");
        org.junit.Assert.assertNotNull(byteBuffer36);
        org.junit.Assert.assertNotNull(byteBuffer37);
    }

    @Test
    public void test1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1135");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.header("");
        org.jsoup.Connection.Response response5 = response1.removeCookie("hi!");
        java.lang.String str7 = response1.cookie("");
        java.lang.String str8 = response1.statusMessage();
        int int9 = response1.statusCode;
        java.net.URL uRL10 = response1.url();
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response11);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(uRL10);
    }

    @Test
    public void test1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1136");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.isReadOnly();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        java.nio.ByteBuffer byteBuffer5 = java.nio.ByteBuffer.allocate(0);
        boolean boolean6 = byteBuffer5.isReadOnly();
        int int7 = byteBuffer1.compareTo(byteBuffer5);
        java.nio.DoubleBuffer doubleBuffer8 = byteBuffer5.asDoubleBuffer();
        java.nio.FloatBuffer floatBuffer9 = byteBuffer5.asFloatBuffer();
        java.lang.String str10 = byteBuffer5.toString();
        java.nio.Buffer buffer11 = byteBuffer5.rewind();
        boolean boolean12 = byteBuffer5.isDirect();
        java.nio.ByteBuffer byteBuffer14 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer15 = byteBuffer14.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer16 = byteBuffer14.asShortBuffer();
        java.nio.ByteOrder byteOrder17 = null;
        java.nio.ByteBuffer byteBuffer18 = byteBuffer14.order(byteOrder17);
        java.nio.ByteBuffer byteBuffer19 = byteBuffer18.asReadOnlyBuffer();
        java.nio.Buffer buffer21 = byteBuffer18.position((int) (byte) 0);
        java.nio.ByteBuffer byteBuffer23 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer24 = byteBuffer23.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer25 = byteBuffer23.asShortBuffer();
        byte[] byteArray26 = byteBuffer23.array();
        java.nio.ByteBuffer byteBuffer27 = byteBuffer18.get(byteArray26);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer30 = byteBuffer5.put(byteArray26, 35, 0);
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
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]" + "'", str10, "java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]");
        org.junit.Assert.assertNotNull(buffer11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(byteBuffer14);
        org.junit.Assert.assertNotNull(doubleBuffer15);
        org.junit.Assert.assertNotNull(shortBuffer16);
        org.junit.Assert.assertNotNull(byteBuffer18);
        org.junit.Assert.assertNotNull(byteBuffer19);
        org.junit.Assert.assertNotNull(buffer21);
        org.junit.Assert.assertNotNull(byteBuffer23);
        org.junit.Assert.assertNotNull(doubleBuffer24);
        org.junit.Assert.assertNotNull(shortBuffer25);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[]");
        org.junit.Assert.assertNotNull(byteBuffer27);
    }

    @Test
    public void test1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1137");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate((int) (byte) 10);
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.nio.ByteBuffer byteBuffer6 = java.nio.ByteBuffer.wrap(byteArray5);
        java.nio.ByteBuffer byteBuffer7 = byteBuffer1.get(byteArray5);
        java.nio.ByteBuffer byteBuffer9 = byteBuffer1.putFloat((float) (byte) 10);
        java.nio.ByteBuffer byteBuffer10 = byteBuffer9.compact();
        java.nio.ByteBuffer byteBuffer12 = java.nio.ByteBuffer.allocate(0);
        boolean boolean13 = byteBuffer12.isReadOnly();
        java.nio.ShortBuffer shortBuffer14 = byteBuffer12.asShortBuffer();
        int int15 = byteBuffer12.position();
        java.nio.ByteOrder byteOrder16 = null;
        java.nio.ByteBuffer byteBuffer17 = byteBuffer12.order(byteOrder16);
        java.nio.ByteBuffer byteBuffer18 = byteBuffer12.asReadOnlyBuffer();
        java.nio.ByteBuffer byteBuffer19 = byteBuffer18.slice();
        java.nio.ByteBuffer byteBuffer20 = byteBuffer18.duplicate();
        java.nio.ByteBuffer byteBuffer22 = java.nio.ByteBuffer.allocate((int) (byte) 10);
        byte[] byteArray26 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.nio.ByteBuffer byteBuffer27 = java.nio.ByteBuffer.wrap(byteArray26);
        java.nio.ByteBuffer byteBuffer28 = byteBuffer22.get(byteArray26);
        java.nio.Buffer buffer29 = byteBuffer22.rewind();
        java.nio.ByteOrder byteOrder30 = byteBuffer22.order();
        java.nio.ByteBuffer byteBuffer31 = byteBuffer18.order(byteOrder30);
        java.nio.ByteBuffer byteBuffer32 = byteBuffer10.order(byteOrder30);
        java.nio.FloatBuffer floatBuffer33 = byteBuffer10.asFloatBuffer();
        byte[] byteArray34 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer35 = byteBuffer10.get(byteArray34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(byteBuffer6);
        org.junit.Assert.assertNotNull(byteBuffer7);
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertNotNull(byteBuffer10);
        org.junit.Assert.assertNotNull(byteBuffer12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(shortBuffer14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(byteBuffer17);
        org.junit.Assert.assertNotNull(byteBuffer18);
        org.junit.Assert.assertNotNull(byteBuffer19);
        org.junit.Assert.assertNotNull(byteBuffer20);
        org.junit.Assert.assertNotNull(byteBuffer22);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(byteBuffer27);
        org.junit.Assert.assertNotNull(byteBuffer28);
        org.junit.Assert.assertNotNull(buffer29);
        org.junit.Assert.assertNotNull(byteOrder30);
        org.junit.Assert.assertNotNull(byteBuffer31);
        org.junit.Assert.assertNotNull(byteBuffer32);
        org.junit.Assert.assertNotNull(floatBuffer33);
    }

    @Test
    public void test1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1138");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.nio.ByteBuffer byteBuffer4 = response3.byteData;
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response3);
        response3.contentType = "hi!";
        boolean boolean9 = response3.hasCookie("");
        int int10 = response3.statusCode;
        org.jsoup.Connection.Response response12 = response3.removeHeader("java.nio.DirectByteBuffer[pos=4 lim=35 cap=35]");
        org.junit.Assert.assertNull(byteBuffer4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(response12);
    }

    @Test
    public void test1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1139");
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
        boolean boolean24 = byteBuffer20.isReadOnly();
        java.nio.ByteBuffer byteBuffer25 = byteBuffer20.slice();
        // The following exception was thrown during execution in test generation
        try {
            char char27 = byteBuffer25.getChar((-10));
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
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(byteBuffer25);
    }

    @Test
    public void test1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1140");
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
        java.nio.LongBuffer longBuffer16 = byteBuffer15.asLongBuffer();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer18 = byteBuffer15.putDouble((double) '\000');
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
        org.junit.Assert.assertNotNull(longBuffer16);
    }

    @Test
    public void test1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1141");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response1);
        boolean boolean4 = response3.executed;
        java.lang.String str6 = response3.getHeaderCaseInsensitive("");
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response3);
        response7.statusCode = (-1);
        int int10 = response7.statusCode();
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response7);
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry13 = response7.scanHeaders("java.nio.HeapByteBufferR[pos=0 lim=0 cap=0]");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response14 = org.jsoup.helper.HttpConnection.Response.execute(request0, response7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(strEntry13);
    }

    @Test
    public void test1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1142");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.nio.ByteBuffer byteBuffer4 = response3.byteData;
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response3);
        response3.contentType = "hi!";
        java.lang.String str9 = response3.cookie("hi!");
        int int10 = response3.statusCode;
        int int11 = response3.statusCode;
        org.junit.Assert.assertNull(byteBuffer4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1143");
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
        java.nio.ByteBuffer byteBuffer29 = byteBuffer28.compact();
        byte[] byteArray30 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer33 = byteBuffer29.get(byteArray30, 11, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
    public void test1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1144");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer2 = byteBuffer1.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        java.nio.ByteBuffer byteBuffer4 = byteBuffer1.compact();
        int int5 = byteBuffer1.remaining();
        java.nio.ByteBuffer byteBuffer7 = java.nio.ByteBuffer.allocate(0);
        boolean boolean8 = byteBuffer7.isReadOnly();
        java.nio.ShortBuffer shortBuffer9 = byteBuffer7.asShortBuffer();
        java.nio.ByteBuffer byteBuffer11 = java.nio.ByteBuffer.allocate(0);
        boolean boolean12 = byteBuffer11.isReadOnly();
        int int13 = byteBuffer7.compareTo(byteBuffer11);
        java.nio.ByteBuffer byteBuffer14 = byteBuffer11.compact();
        boolean boolean15 = byteBuffer14.hasRemaining();
        java.nio.ByteBuffer byteBuffer17 = java.nio.ByteBuffer.allocate(0);
        boolean boolean18 = byteBuffer17.isReadOnly();
        java.nio.ShortBuffer shortBuffer19 = byteBuffer17.asShortBuffer();
        int int20 = byteBuffer17.position();
        int int21 = byteBuffer17.capacity();
        java.nio.ByteBuffer byteBuffer22 = byteBuffer14.put(byteBuffer17);
        byte[] byteArray23 = byteBuffer22.array();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer26 = byteBuffer1.get(byteArray23, (int) (short) -1, 31);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(doubleBuffer2);
        org.junit.Assert.assertNotNull(shortBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(byteBuffer7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(shortBuffer9);
        org.junit.Assert.assertNotNull(byteBuffer11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(byteBuffer14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(byteBuffer17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(shortBuffer19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(byteBuffer22);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[]");
    }

    @Test
    public void test1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1145");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect((int) '#');
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.putShort((short) 0);
        java.nio.ByteBuffer byteBuffer6 = byteBuffer3.putShort(0, (short) (byte) 10);
        java.nio.Buffer buffer7 = byteBuffer6.clear();
        java.nio.Buffer buffer9 = buffer7.limit((int) '#');
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer6);
        org.junit.Assert.assertNotNull(buffer7);
        org.junit.Assert.assertNotNull(buffer9);
    }

    @Test
    public void test1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1146");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate((int) (byte) 10);
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.nio.ByteBuffer byteBuffer6 = java.nio.ByteBuffer.wrap(byteArray5);
        java.nio.ByteBuffer byteBuffer7 = byteBuffer1.get(byteArray5);
        java.nio.LongBuffer longBuffer8 = byteBuffer1.asLongBuffer();
        java.nio.ByteBuffer byteBuffer9 = byteBuffer1.slice();
        java.nio.LongBuffer longBuffer10 = byteBuffer9.asLongBuffer();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer13 = byteBuffer9.putShort((-1), (short) 10);
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
        org.junit.Assert.assertNotNull(longBuffer10);
    }

    @Test
    public void test1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1147");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.header("");
        org.jsoup.Connection.Response response5 = response1.removeCookie("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap6 = response1.headers();
        java.nio.ByteBuffer byteBuffer7 = response1.byteData;
        java.net.URL uRL8 = response1.url();
        response1.contentType = "java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]";
        java.lang.String str12 = response1.cookie("");
        java.net.URL uRL13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response14 = response1.url(uRL13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNull(byteBuffer7);
        org.junit.Assert.assertNull(uRL8);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test1148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1148");
        byte[] byteArray0 = new byte[] {};
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.wrap(byteArray0);
        java.nio.Buffer buffer2 = byteBuffer1.flip();
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.asReadOnlyBuffer();
        java.nio.ByteBuffer byteBuffer4 = byteBuffer1.duplicate();
        java.nio.ByteBuffer byteBuffer6 = java.nio.ByteBuffer.allocate(0);
        boolean boolean7 = byteBuffer6.isReadOnly();
        java.nio.ShortBuffer shortBuffer8 = byteBuffer6.asShortBuffer();
        int int9 = byteBuffer6.position();
        boolean boolean10 = byteBuffer6.isReadOnly();
        java.nio.ByteOrder byteOrder11 = byteBuffer6.order();
        java.nio.ByteBuffer byteBuffer12 = byteBuffer4.order(byteOrder11);
        java.nio.ByteBuffer byteBuffer14 = java.nio.ByteBuffer.allocate((int) (byte) 10);
        byte[] byteArray18 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.nio.ByteBuffer byteBuffer19 = java.nio.ByteBuffer.wrap(byteArray18);
        java.nio.ByteBuffer byteBuffer20 = byteBuffer14.get(byteArray18);
        java.nio.LongBuffer longBuffer21 = byteBuffer14.asLongBuffer();
        java.nio.ByteBuffer byteBuffer22 = byteBuffer14.slice();
        java.nio.ByteBuffer byteBuffer24 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer25 = byteBuffer24.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer26 = byteBuffer24.asShortBuffer();
        java.nio.ByteOrder byteOrder27 = null;
        java.nio.ByteBuffer byteBuffer28 = byteBuffer24.order(byteOrder27);
        java.nio.ByteBuffer byteBuffer30 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer31 = byteBuffer30.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer32 = byteBuffer30.asShortBuffer();
        int int33 = byteBuffer30.limit();
        byte[] byteArray34 = byteBuffer30.array();
        java.nio.ByteBuffer byteBuffer35 = byteBuffer24.put(byteArray34);
        java.nio.ByteBuffer byteBuffer36 = byteBuffer22.get(byteArray34);
        java.nio.ByteBuffer byteBuffer37 = byteBuffer12.get(byteArray34);
        java.nio.Buffer buffer38 = byteBuffer12.flip();
        java.nio.ByteBuffer byteBuffer40 = java.nio.ByteBuffer.allocate((int) (byte) 10);
        byte[] byteArray44 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.nio.ByteBuffer byteBuffer45 = java.nio.ByteBuffer.wrap(byteArray44);
        java.nio.ByteBuffer byteBuffer46 = byteBuffer40.get(byteArray44);
        java.nio.Buffer buffer47 = byteBuffer40.rewind();
        int int48 = byteBuffer40.position();
        java.nio.Buffer buffer49 = byteBuffer40.rewind();
        java.nio.ByteBuffer byteBuffer50 = byteBuffer40.slice();
        int int51 = byteBuffer12.compareTo(byteBuffer40);
        java.nio.ByteBuffer byteBuffer52 = byteBuffer40.slice();
        java.nio.ByteBuffer byteBuffer54 = java.nio.ByteBuffer.allocate((int) (byte) 10);
        byte[] byteArray58 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.nio.ByteBuffer byteBuffer59 = java.nio.ByteBuffer.wrap(byteArray58);
        java.nio.ByteBuffer byteBuffer60 = byteBuffer54.get(byteArray58);
        java.nio.Buffer buffer61 = byteBuffer54.rewind();
        java.nio.ByteOrder byteOrder62 = byteBuffer54.order();
        boolean boolean63 = byteBuffer54.hasRemaining();
        byte[] byteArray66 = new byte[] { (byte) 10, (byte) 1 };
        java.nio.ByteBuffer byteBuffer67 = byteBuffer54.put(byteArray66);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer70 = byteBuffer52.get(byteArray66, (int) '\u0a00', (int) (short) 1);
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
        org.junit.Assert.assertNotNull(byteBuffer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(shortBuffer8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(byteOrder11);
        org.junit.Assert.assertNotNull(byteBuffer12);
        org.junit.Assert.assertNotNull(byteBuffer14);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(byteBuffer19);
        org.junit.Assert.assertNotNull(byteBuffer20);
        org.junit.Assert.assertNotNull(longBuffer21);
        org.junit.Assert.assertNotNull(byteBuffer22);
        org.junit.Assert.assertNotNull(byteBuffer24);
        org.junit.Assert.assertNotNull(doubleBuffer25);
        org.junit.Assert.assertNotNull(shortBuffer26);
        org.junit.Assert.assertNotNull(byteBuffer28);
        org.junit.Assert.assertNotNull(byteBuffer30);
        org.junit.Assert.assertNotNull(doubleBuffer31);
        org.junit.Assert.assertNotNull(shortBuffer32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray34), "[]");
        org.junit.Assert.assertNotNull(byteBuffer35);
        org.junit.Assert.assertNotNull(byteBuffer36);
        org.junit.Assert.assertNotNull(byteBuffer37);
        org.junit.Assert.assertNotNull(buffer38);
        org.junit.Assert.assertNotNull(byteBuffer40);
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray44), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(byteBuffer45);
        org.junit.Assert.assertNotNull(byteBuffer46);
        org.junit.Assert.assertNotNull(buffer47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(buffer49);
        org.junit.Assert.assertNotNull(byteBuffer50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-10) + "'", int51 == (-10));
        org.junit.Assert.assertNotNull(byteBuffer52);
        org.junit.Assert.assertNotNull(byteBuffer54);
        org.junit.Assert.assertNotNull(byteArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray58), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(byteBuffer59);
        org.junit.Assert.assertNotNull(byteBuffer60);
        org.junit.Assert.assertNotNull(buffer61);
        org.junit.Assert.assertNotNull(byteOrder62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNotNull(byteArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray66), "[10, 1]");
        org.junit.Assert.assertNotNull(byteBuffer67);
    }

    @Test
    public void test1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1149");
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
        boolean boolean18 = byteBuffer6.hasRemaining();
        java.nio.ByteBuffer byteBuffer20 = java.nio.ByteBuffer.allocate(0);
        boolean boolean21 = byteBuffer20.isReadOnly();
        java.nio.ShortBuffer shortBuffer22 = byteBuffer20.asShortBuffer();
        java.nio.ByteBuffer byteBuffer24 = java.nio.ByteBuffer.allocate(0);
        boolean boolean25 = byteBuffer24.isReadOnly();
        int int26 = byteBuffer20.compareTo(byteBuffer24);
        java.nio.ByteBuffer byteBuffer27 = byteBuffer24.compact();
        java.nio.ByteBuffer byteBuffer29 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer30 = byteBuffer29.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer31 = byteBuffer29.asShortBuffer();
        byte[] byteArray32 = byteBuffer29.array();
        java.nio.ByteBuffer byteBuffer33 = java.nio.ByteBuffer.wrap(byteArray32);
        java.nio.ByteBuffer byteBuffer34 = byteBuffer24.put(byteArray32);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer37 = byteBuffer6.get(byteArray32, 100, 11);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
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
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(byteBuffer20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(shortBuffer22);
        org.junit.Assert.assertNotNull(byteBuffer24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(byteBuffer27);
        org.junit.Assert.assertNotNull(byteBuffer29);
        org.junit.Assert.assertNotNull(doubleBuffer30);
        org.junit.Assert.assertNotNull(shortBuffer31);
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray32), "[]");
        org.junit.Assert.assertNotNull(byteBuffer33);
        org.junit.Assert.assertNotNull(byteBuffer34);
    }

    @Test
    public void test1150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1150");
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
        // The following exception was thrown during execution in test generation
        try {
            double double15 = byteBuffer7.getDouble();
            org.junit.Assert.fail("Expected exception of type java.nio.BufferUnderflowException; message: null");
        } catch (java.nio.BufferUnderflowException e) {
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
        org.junit.Assert.assertNotNull(charBuffer14);
    }

    @Test
    public void test1151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1151");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer2 = byteBuffer1.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        java.nio.ByteOrder byteOrder4 = null;
        java.nio.ByteBuffer byteBuffer5 = byteBuffer1.order(byteOrder4);
        java.nio.ByteBuffer byteBuffer6 = byteBuffer5.asReadOnlyBuffer();
        int int7 = byteBuffer5.arrayOffset();
        org.jsoup.helper.HttpConnection.Response response8 = null;
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response8);
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response8);
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response8);
        java.nio.ByteBuffer byteBuffer12 = response11.byteData;
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response11);
        java.nio.ByteBuffer byteBuffer15 = java.nio.ByteBuffer.allocate(0);
        response11.byteData = byteBuffer15;
        java.nio.ByteBuffer byteBuffer17 = byteBuffer15.slice();
        java.nio.ByteBuffer byteBuffer19 = java.nio.ByteBuffer.allocate(0);
        boolean boolean20 = byteBuffer19.hasRemaining();
        java.nio.ByteBuffer byteBuffer21 = byteBuffer19.asReadOnlyBuffer();
        boolean boolean22 = byteBuffer21.hasRemaining();
        java.nio.ByteBuffer byteBuffer24 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer25 = byteBuffer24.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer26 = byteBuffer24.asShortBuffer();
        java.nio.ByteBuffer byteBuffer27 = byteBuffer24.compact();
        java.nio.ByteOrder byteOrder28 = byteBuffer27.order();
        java.nio.ByteBuffer byteBuffer29 = byteBuffer21.order(byteOrder28);
        java.nio.ByteBuffer byteBuffer30 = byteBuffer17.order(byteOrder28);
        java.nio.ByteBuffer byteBuffer31 = byteBuffer5.put(byteBuffer30);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer34 = byteBuffer5.putDouble(2, (double) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(doubleBuffer2);
        org.junit.Assert.assertNotNull(shortBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertNotNull(byteBuffer6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(byteBuffer12);
        org.junit.Assert.assertNotNull(byteBuffer15);
        org.junit.Assert.assertNotNull(byteBuffer17);
        org.junit.Assert.assertNotNull(byteBuffer19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(byteBuffer21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(byteBuffer24);
        org.junit.Assert.assertNotNull(doubleBuffer25);
        org.junit.Assert.assertNotNull(shortBuffer26);
        org.junit.Assert.assertNotNull(byteBuffer27);
        org.junit.Assert.assertNotNull(byteOrder28);
        org.junit.Assert.assertNotNull(byteBuffer29);
        org.junit.Assert.assertNotNull(byteBuffer30);
        org.junit.Assert.assertNotNull(byteBuffer31);
    }

    @Test
    public void test1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1152");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate((int) (byte) 10);
        int int2 = byteBuffer1.getInt();
        java.nio.ByteBuffer byteBuffer5 = byteBuffer1.put((int) (byte) 0, (byte) 10);
        java.nio.IntBuffer intBuffer6 = byteBuffer1.asIntBuffer();
        byte[] byteArray10 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.nio.ByteBuffer byteBuffer11 = java.nio.ByteBuffer.wrap(byteArray10);
        java.nio.ByteBuffer byteBuffer12 = java.nio.ByteBuffer.wrap(byteArray10);
        java.nio.ByteBuffer byteBuffer13 = byteBuffer1.get(byteArray10);
        char char15 = byteBuffer1.getChar(1);
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertNotNull(intBuffer6);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(byteBuffer11);
        org.junit.Assert.assertNotNull(byteBuffer12);
        org.junit.Assert.assertNotNull(byteBuffer13);
        org.junit.Assert.assertTrue("'" + char15 + "' != '" + '\000' + "'", char15 == '\000');
    }

    @Test
    public void test1153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1153");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean3 = response2.executed;
        java.lang.String str5 = response2.getHeaderCaseInsensitive("");
        java.lang.String str7 = response2.cookie("java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]");
        int int8 = response2.statusCode();
        org.jsoup.Connection.Response response11 = response2.cookie("hi!", "");
        java.util.Map<java.lang.String, java.lang.String> strMap12 = response2.headers();
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response2);
        java.net.URL uRL14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response15 = response13.url(uRL14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNotNull(strMap12);
    }

    @Test
    public void test1154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1154");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response1);
        boolean boolean4 = response3.executed;
        response3.statusCode = 0;
        java.lang.String str7 = response3.contentType();
        java.lang.String str8 = response3.statusMessage();
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response3);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response10 = org.jsoup.helper.HttpConnection.Response.execute(request0, response9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test1155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1155");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.executed = false;
        java.lang.String str4 = response1.contentType;
        int int5 = response1.statusCode;
        java.lang.String str6 = response1.charset();
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response1);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray8 = response7.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test1156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1156");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer2 = byteBuffer1.asDoubleBuffer();
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.compact();
        java.lang.String str4 = byteBuffer1.toString();
        java.nio.LongBuffer longBuffer5 = byteBuffer1.asLongBuffer();
        // The following exception was thrown during execution in test generation
        try {
            float float7 = byteBuffer1.getFloat(31);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(doubleBuffer2);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]" + "'", str4, "java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]");
        org.junit.Assert.assertNotNull(longBuffer5);
    }

    @Test
    public void test1157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1157");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate((int) ' ');
        int int3 = byteBuffer1.getInt((int) (short) 0);
        int int4 = byteBuffer1.remaining();
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
    }

    @Test
    public void test1158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1158");
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
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response1);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document14 = response13.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(strMap10);
    }

    @Test
    public void test1159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1159");
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
            java.nio.ByteBuffer byteBuffer17 = java.nio.ByteBuffer.wrap(byteArray13, (int) (short) 10, 0);
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
    public void test1160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1160");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer2 = byteBuffer1.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        byte[] byteArray4 = byteBuffer1.array();
        // The following exception was thrown during execution in test generation
        try {
            float float6 = byteBuffer1.getFloat(4);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(doubleBuffer2);
        org.junit.Assert.assertNotNull(shortBuffer3);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[]");
    }

    @Test
    public void test1161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1161");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.executed = false;
        java.lang.String str4 = response1.contentType;
        int int5 = response1.statusCode;
        java.lang.String str6 = response1.charset();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = response1.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test1162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1162");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request3 = response2.req;
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response2);
        java.lang.String str6 = response2.cookie("");
        response2.executed = true;
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response2);
        java.lang.String str11 = response9.cookie("java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document12 = response9.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(request3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test1163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1163");
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
        boolean boolean22 = byteBuffer19.isReadOnly();
        java.nio.ByteBuffer byteBuffer23 = byteBuffer19.compact();
        java.nio.ByteBuffer byteBuffer24 = byteBuffer23.duplicate();
        // The following exception was thrown during execution in test generation
        try {
            byte byte26 = byteBuffer23.get(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(byteBuffer23);
        org.junit.Assert.assertNotNull(byteBuffer24);
    }

    @Test
    public void test1164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1164");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer2 = byteBuffer1.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        java.nio.ByteOrder byteOrder4 = null;
        java.nio.ByteBuffer byteBuffer5 = byteBuffer1.order(byteOrder4);
        java.nio.ByteBuffer byteBuffer6 = byteBuffer5.asReadOnlyBuffer();
        int int7 = byteBuffer5.arrayOffset();
        java.nio.CharBuffer charBuffer8 = byteBuffer5.asCharBuffer();
        java.nio.IntBuffer intBuffer9 = byteBuffer5.asIntBuffer();
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(doubleBuffer2);
        org.junit.Assert.assertNotNull(shortBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertNotNull(byteBuffer6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(charBuffer8);
        org.junit.Assert.assertNotNull(intBuffer9);
    }

    @Test
    public void test1165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1165");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.isReadOnly();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        int int4 = byteBuffer1.position();
        java.nio.ByteOrder byteOrder5 = null;
        java.nio.ByteBuffer byteBuffer6 = byteBuffer1.order(byteOrder5);
        java.nio.ByteBuffer byteBuffer7 = byteBuffer1.asReadOnlyBuffer();
        java.nio.FloatBuffer floatBuffer8 = byteBuffer1.asFloatBuffer();
        java.nio.ByteBuffer byteBuffer10 = java.nio.ByteBuffer.allocate((int) (byte) 10);
        byte[] byteArray14 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.nio.ByteBuffer byteBuffer15 = java.nio.ByteBuffer.wrap(byteArray14);
        java.nio.ByteBuffer byteBuffer16 = byteBuffer10.get(byteArray14);
        java.nio.LongBuffer longBuffer17 = byteBuffer10.asLongBuffer();
        java.nio.ByteBuffer byteBuffer18 = byteBuffer10.slice();
        java.nio.ByteBuffer byteBuffer20 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer21 = byteBuffer20.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer22 = byteBuffer20.asShortBuffer();
        java.nio.ByteOrder byteOrder23 = null;
        java.nio.ByteBuffer byteBuffer24 = byteBuffer20.order(byteOrder23);
        java.nio.ByteBuffer byteBuffer26 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer27 = byteBuffer26.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer28 = byteBuffer26.asShortBuffer();
        int int29 = byteBuffer26.limit();
        byte[] byteArray30 = byteBuffer26.array();
        java.nio.ByteBuffer byteBuffer31 = byteBuffer20.put(byteArray30);
        java.nio.ByteBuffer byteBuffer32 = byteBuffer18.get(byteArray30);
        java.nio.ByteBuffer byteBuffer33 = byteBuffer1.put(byteArray30);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer36 = java.nio.ByteBuffer.wrap(byteArray30, 0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(shortBuffer3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(byteBuffer6);
        org.junit.Assert.assertNotNull(byteBuffer7);
        org.junit.Assert.assertNotNull(floatBuffer8);
        org.junit.Assert.assertNotNull(byteBuffer10);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(byteBuffer15);
        org.junit.Assert.assertNotNull(byteBuffer16);
        org.junit.Assert.assertNotNull(longBuffer17);
        org.junit.Assert.assertNotNull(byteBuffer18);
        org.junit.Assert.assertNotNull(byteBuffer20);
        org.junit.Assert.assertNotNull(doubleBuffer21);
        org.junit.Assert.assertNotNull(shortBuffer22);
        org.junit.Assert.assertNotNull(byteBuffer24);
        org.junit.Assert.assertNotNull(byteBuffer26);
        org.junit.Assert.assertNotNull(doubleBuffer27);
        org.junit.Assert.assertNotNull(shortBuffer28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray30), "[]");
        org.junit.Assert.assertNotNull(byteBuffer31);
        org.junit.Assert.assertNotNull(byteBuffer32);
        org.junit.Assert.assertNotNull(byteBuffer33);
    }

    @Test
    public void test1166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1166");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response19 = org.jsoup.helper.HttpConnection.Response.execute(request0, response14);
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
    public void test1167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1167");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect((int) '#');
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.putShort((short) 0);
        java.nio.ByteBuffer byteBuffer5 = byteBuffer1.putDouble((double) '\000');
        char char6 = byteBuffer5.getChar();
        java.nio.Buffer buffer7 = byteBuffer5.clear();
        java.nio.ByteBuffer byteBuffer8 = byteBuffer5.slice();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer11 = byteBuffer5.putDouble(85, (double) 'a');
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
    }

    @Test
    public void test1168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1168");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean3 = response2.executed;
        java.lang.String str5 = response2.getHeaderCaseInsensitive("");
        java.net.URL uRL6 = response2.url();
        org.jsoup.Connection.Response response8 = response2.removeCookie("");
        java.nio.ByteBuffer byteBuffer9 = response2.byteData;
        java.nio.ByteBuffer byteBuffer10 = response2.byteData;
        org.jsoup.Connection.Method method11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response12 = response2.method(method11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(byteBuffer9);
        org.junit.Assert.assertNull(byteBuffer10);
    }

    @Test
    public void test1169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1169");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate((int) ' ');
        int int3 = byteBuffer1.getInt((int) (short) 0);
        java.nio.CharBuffer charBuffer4 = byteBuffer1.asCharBuffer();
        java.nio.ByteBuffer byteBuffer7 = byteBuffer1.putInt((int) (byte) 0, (int) ' ');
        java.nio.ByteBuffer byteBuffer9 = java.nio.ByteBuffer.allocate(0);
        boolean boolean10 = byteBuffer9.isReadOnly();
        java.nio.ShortBuffer shortBuffer11 = byteBuffer9.asShortBuffer();
        java.nio.ByteBuffer byteBuffer13 = java.nio.ByteBuffer.allocate(0);
        boolean boolean14 = byteBuffer13.isReadOnly();
        int int15 = byteBuffer9.compareTo(byteBuffer13);
        java.nio.Buffer buffer17 = byteBuffer9.limit(0);
        byte[] byteArray18 = byteBuffer9.array();
        java.nio.ByteBuffer byteBuffer21 = byteBuffer1.get(byteArray18, 0, 0);
        java.nio.ByteOrder byteOrder22 = byteBuffer21.order();
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(charBuffer4);
        org.junit.Assert.assertNotNull(byteBuffer7);
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(shortBuffer11);
        org.junit.Assert.assertNotNull(byteBuffer13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(buffer17);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[]");
        org.junit.Assert.assertNotNull(byteBuffer21);
        org.junit.Assert.assertNotNull(byteOrder22);
    }

    @Test
    public void test1170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1170");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.isReadOnly();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        int int4 = byteBuffer1.position();
        java.nio.ByteOrder byteOrder5 = null;
        java.nio.ByteBuffer byteBuffer6 = byteBuffer1.order(byteOrder5);
        java.nio.ByteBuffer byteBuffer7 = byteBuffer1.asReadOnlyBuffer();
        java.nio.ByteBuffer byteBuffer8 = byteBuffer7.slice();
        // The following exception was thrown during execution in test generation
        try {
            float float9 = byteBuffer8.getFloat();
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
        org.junit.Assert.assertNotNull(byteBuffer8);
    }

    @Test
    public void test1171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1171");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate((int) '\000');
        org.junit.Assert.assertNotNull(byteBuffer1);
    }

    @Test
    public void test1172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1172");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.nio.ByteBuffer byteBuffer4 = response3.byteData;
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response3);
        response3.contentType = "hi!";
        boolean boolean9 = response3.hasCookie("");
        int int10 = response3.statusCode;
        java.lang.String str11 = response3.contentType();
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response3);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document13 = response12.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(byteBuffer4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test1173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1173");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request3 = response2.req;
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response2);
        response4.contentType = "java.nio.DirectByteBuffer[pos=4 lim=35 cap=35]";
        org.junit.Assert.assertNull(request3);
    }

    @Test
    public void test1174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1174");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.ByteBuffer byteBuffer2 = byteBuffer1.slice();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        java.nio.ByteBuffer byteBuffer5 = java.nio.ByteBuffer.allocate(0);
        boolean boolean6 = byteBuffer5.isReadOnly();
        java.nio.ShortBuffer shortBuffer7 = byteBuffer5.asShortBuffer();
        int int8 = byteBuffer5.position();
        java.nio.ByteOrder byteOrder9 = null;
        java.nio.ByteBuffer byteBuffer10 = byteBuffer5.order(byteOrder9);
        java.nio.ByteBuffer byteBuffer11 = byteBuffer5.asReadOnlyBuffer();
        java.nio.ByteBuffer byteBuffer12 = byteBuffer11.slice();
        java.nio.ByteBuffer byteBuffer13 = byteBuffer11.duplicate();
        java.nio.ByteBuffer byteBuffer15 = java.nio.ByteBuffer.allocate((int) (byte) 10);
        byte[] byteArray19 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.nio.ByteBuffer byteBuffer20 = java.nio.ByteBuffer.wrap(byteArray19);
        java.nio.ByteBuffer byteBuffer21 = byteBuffer15.get(byteArray19);
        java.nio.Buffer buffer22 = byteBuffer15.rewind();
        java.nio.ByteOrder byteOrder23 = byteBuffer15.order();
        java.nio.ByteBuffer byteBuffer24 = byteBuffer11.order(byteOrder23);
        java.nio.ByteBuffer byteBuffer25 = byteBuffer1.order(byteOrder23);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer27 = byteBuffer25.putChar('4');
            org.junit.Assert.fail("Expected exception of type java.nio.BufferOverflowException; message: null");
        } catch (java.nio.BufferOverflowException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteBuffer2);
        org.junit.Assert.assertNotNull(shortBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(shortBuffer7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(byteBuffer10);
        org.junit.Assert.assertNotNull(byteBuffer11);
        org.junit.Assert.assertNotNull(byteBuffer12);
        org.junit.Assert.assertNotNull(byteBuffer13);
        org.junit.Assert.assertNotNull(byteBuffer15);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(byteBuffer20);
        org.junit.Assert.assertNotNull(byteBuffer21);
        org.junit.Assert.assertNotNull(buffer22);
        org.junit.Assert.assertNotNull(byteOrder23);
        org.junit.Assert.assertNotNull(byteBuffer24);
        org.junit.Assert.assertNotNull(byteBuffer25);
    }

    @Test
    public void test1175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1175");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate((int) (byte) 10);
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.nio.ByteBuffer byteBuffer6 = java.nio.ByteBuffer.wrap(byteArray5);
        java.nio.ByteBuffer byteBuffer7 = byteBuffer1.get(byteArray5);
        java.nio.ByteBuffer byteBuffer9 = byteBuffer1.putFloat((float) (byte) 10);
        java.nio.ByteBuffer byteBuffer10 = byteBuffer9.compact();
        java.nio.ByteBuffer byteBuffer12 = java.nio.ByteBuffer.allocate(0);
        boolean boolean13 = byteBuffer12.isReadOnly();
        java.nio.ShortBuffer shortBuffer14 = byteBuffer12.asShortBuffer();
        int int15 = byteBuffer12.position();
        java.nio.ByteOrder byteOrder16 = null;
        java.nio.ByteBuffer byteBuffer17 = byteBuffer12.order(byteOrder16);
        java.nio.ByteBuffer byteBuffer18 = byteBuffer12.asReadOnlyBuffer();
        java.nio.ByteBuffer byteBuffer19 = byteBuffer18.slice();
        java.nio.ByteBuffer byteBuffer20 = byteBuffer18.duplicate();
        java.nio.ByteBuffer byteBuffer22 = java.nio.ByteBuffer.allocate((int) (byte) 10);
        byte[] byteArray26 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.nio.ByteBuffer byteBuffer27 = java.nio.ByteBuffer.wrap(byteArray26);
        java.nio.ByteBuffer byteBuffer28 = byteBuffer22.get(byteArray26);
        java.nio.Buffer buffer29 = byteBuffer22.rewind();
        java.nio.ByteOrder byteOrder30 = byteBuffer22.order();
        java.nio.ByteBuffer byteBuffer31 = byteBuffer18.order(byteOrder30);
        java.nio.ByteBuffer byteBuffer32 = byteBuffer10.order(byteOrder30);
        java.nio.ByteBuffer byteBuffer34 = java.nio.ByteBuffer.allocate(0);
        boolean boolean35 = byteBuffer34.hasRemaining();
        java.nio.ByteBuffer byteBuffer36 = byteBuffer34.asReadOnlyBuffer();
        java.nio.LongBuffer longBuffer37 = byteBuffer34.asLongBuffer();
        java.nio.ByteOrder byteOrder38 = byteBuffer34.order();
        byte[] byteArray39 = byteBuffer34.array();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer42 = byteBuffer10.put(byteArray39, 10, 0);
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
        org.junit.Assert.assertNotNull(byteBuffer12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(shortBuffer14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(byteBuffer17);
        org.junit.Assert.assertNotNull(byteBuffer18);
        org.junit.Assert.assertNotNull(byteBuffer19);
        org.junit.Assert.assertNotNull(byteBuffer20);
        org.junit.Assert.assertNotNull(byteBuffer22);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(byteBuffer27);
        org.junit.Assert.assertNotNull(byteBuffer28);
        org.junit.Assert.assertNotNull(buffer29);
        org.junit.Assert.assertNotNull(byteOrder30);
        org.junit.Assert.assertNotNull(byteBuffer31);
        org.junit.Assert.assertNotNull(byteBuffer32);
        org.junit.Assert.assertNotNull(byteBuffer34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(byteBuffer36);
        org.junit.Assert.assertNotNull(longBuffer37);
        org.junit.Assert.assertNotNull(byteOrder38);
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray39), "[]");
    }

    @Test
    public void test1176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1176");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.isReadOnly();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        java.nio.ByteBuffer byteBuffer5 = java.nio.ByteBuffer.allocate(0);
        boolean boolean6 = byteBuffer5.isReadOnly();
        int int7 = byteBuffer1.compareTo(byteBuffer5);
        java.nio.Buffer buffer8 = byteBuffer5.clear();
        boolean boolean9 = byteBuffer5.isDirect();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer12 = byteBuffer5.putInt((int) (short) 0, (int) (short) 0);
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
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1177");
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
        java.nio.Buffer buffer14 = byteBuffer13.clear();
        // The following exception was thrown during execution in test generation
        try {
            double double16 = byteBuffer13.getDouble(1677787392);
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
        org.junit.Assert.assertNotNull(buffer14);
    }

    @Test
    public void test1178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1178");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str4 = response2.header("");
        org.jsoup.Connection.Response response6 = response2.removeCookie("hi!");
        java.lang.String str7 = response2.charset();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response8 = org.jsoup.helper.HttpConnection.Response.execute(request0, response2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test1179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1179");
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
        java.nio.ByteBuffer byteBuffer18 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer19 = byteBuffer18.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer20 = byteBuffer18.asShortBuffer();
        int int21 = byteBuffer18.limit();
        byte[] byteArray22 = byteBuffer18.array();
        java.nio.ByteBuffer byteBuffer23 = java.nio.ByteBuffer.wrap(byteArray22);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer26 = byteBuffer12.get(byteArray22, 0, 1);
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
        org.junit.Assert.assertNotNull(buffer9);
        org.junit.Assert.assertNotNull(buffer10);
        org.junit.Assert.assertNotNull(byteBuffer12);
        org.junit.Assert.assertNotNull(doubleBuffer13);
        org.junit.Assert.assertNotNull(shortBuffer14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]" + "'", str15, "java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]");
        org.junit.Assert.assertNotNull(byteBuffer16);
        org.junit.Assert.assertNotNull(byteBuffer18);
        org.junit.Assert.assertNotNull(doubleBuffer19);
        org.junit.Assert.assertNotNull(shortBuffer20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[]");
        org.junit.Assert.assertNotNull(byteBuffer23);
    }

    @Test
    public void test1180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1180");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.nio.ByteBuffer byteBuffer6 = response5.byteData;
        org.jsoup.Connection.Response response8 = response5.removeCookie("");
        java.lang.String str9 = response5.statusMessage;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response10 = org.jsoup.helper.HttpConnection.Response.execute(request0, response5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(byteBuffer6);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test1181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1181");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request3 = response2.req;
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response2);
        java.lang.String str6 = response2.cookie("");
        response2.executed = true;
        org.jsoup.Connection.Request request9 = null;
        response2.req = request9;
        java.lang.String str11 = response2.contentType;
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response2);
        org.junit.Assert.assertNull(request3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test1182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1182");
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
            java.nio.ByteBuffer byteBuffer24 = java.nio.ByteBuffer.wrap(byteArray19, 0, (int) ' ');
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
        org.junit.Assert.assertTrue("'" + short15 + "' != '" + (short) 0 + "'", short15 == (short) 0);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[100, 1, 1]");
        org.junit.Assert.assertNotNull(byteBuffer20);
        org.junit.Assert.assertNotNull(byteBuffer21);
    }

    @Test
    public void test1183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1183");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer2 = byteBuffer1.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        java.nio.ByteOrder byteOrder4 = null;
        java.nio.ByteBuffer byteBuffer5 = byteBuffer1.order(byteOrder4);
        java.nio.ByteBuffer byteBuffer6 = byteBuffer5.asReadOnlyBuffer();
        java.nio.Buffer buffer8 = byteBuffer5.position((int) (byte) 0);
        int int9 = byteBuffer5.arrayOffset();
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(doubleBuffer2);
        org.junit.Assert.assertNotNull(shortBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertNotNull(byteBuffer6);
        org.junit.Assert.assertNotNull(buffer8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1184");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate((int) (byte) 0);
        java.nio.Buffer buffer2 = byteBuffer1.clear();
        // The following exception was thrown during execution in test generation
        try {
            char char3 = byteBuffer1.getChar();
            org.junit.Assert.fail("Expected exception of type java.nio.BufferUnderflowException; message: null");
        } catch (java.nio.BufferUnderflowException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(buffer2);
    }

    @Test
    public void test1185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1185");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document22 = response11.parse();
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
    }

    @Test
    public void test1186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1186");
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
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer17 = byteBuffer9.putShort((short) -1);
            org.junit.Assert.fail("Expected exception of type java.nio.BufferOverflowException; message: null");
        } catch (java.nio.BufferOverflowException e) {
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
    }

    @Test
    public void test1187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1187");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean3 = response2.executed;
        java.lang.String str5 = response2.getHeaderCaseInsensitive("");
        java.net.URL uRL6 = response2.url();
        org.jsoup.Connection.Response response8 = response2.removeCookie("");
        java.lang.String str9 = response2.charset();
        response2.contentType = "hi!";
        java.lang.String str12 = response2.statusMessage;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test1188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1188");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request3 = response2.req;
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response2);
        java.lang.String str6 = response2.cookie("");
        response2.executed = true;
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response2);
        org.jsoup.Connection.Response response12 = response2.header("java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]", "hi!");
        org.junit.Assert.assertNull(request3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(response12);
    }

    @Test
    public void test1189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1189");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.executed = false;
        java.lang.String str4 = response1.contentType;
        int int5 = response1.statusCode;
        java.lang.String str6 = response1.charset();
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response1);
        int int8 = response1.statusCode;
        java.net.HttpURLConnection httpURLConnection9 = null;
        org.jsoup.helper.HttpConnection.Response response10 = null;
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response10);
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response10);
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response10);
        java.nio.ByteBuffer byteBuffer14 = response13.byteData;
        org.jsoup.Connection.Response response17 = response13.cookie("hi!", "");
        boolean boolean18 = response13.executed;
        java.lang.String str19 = response13.charset();
        org.jsoup.helper.HttpConnection.Response response20 = new org.jsoup.helper.HttpConnection.Response(response13);
        java.lang.String str21 = response20.charset;
        java.lang.String str23 = response20.getHeaderCaseInsensitive("java.nio.HeapByteBuffer[pos=0 lim=32 cap=32]");
        org.jsoup.helper.HttpConnection.Response response24 = new org.jsoup.helper.HttpConnection.Response(response20);
        // The following exception was thrown during execution in test generation
        try {
            response1.setupFromConnection(httpURLConnection9, (org.jsoup.Connection.Response) response24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer14);
        org.junit.Assert.assertNotNull(response17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test1190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1190");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.nio.ByteBuffer byteBuffer5 = response4.byteData;
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response4);
        java.nio.ByteBuffer byteBuffer8 = java.nio.ByteBuffer.allocate(0);
        response4.byteData = byteBuffer8;
        int int10 = response4.statusCode();
        java.lang.String str12 = response4.getHeaderCaseInsensitive("hi!");
        java.lang.String str14 = response4.getHeaderCaseInsensitive("java.nio.HeapByteBufferR[pos=0 lim=0 cap=0]");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response15 = org.jsoup.helper.HttpConnection.Response.execute(request0, response4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(byteBuffer5);
        org.junit.Assert.assertNotNull(byteBuffer8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test1191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1191");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate((int) (byte) 10);
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.nio.ByteBuffer byteBuffer6 = java.nio.ByteBuffer.wrap(byteArray5);
        java.nio.ByteBuffer byteBuffer7 = byteBuffer1.get(byteArray5);
        java.nio.Buffer buffer8 = byteBuffer1.rewind();
        int int9 = byteBuffer1.position();
        java.nio.Buffer buffer10 = byteBuffer1.rewind();
        int int12 = byteBuffer1.getInt(4);
        java.nio.FloatBuffer floatBuffer13 = byteBuffer1.asFloatBuffer();
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(byteBuffer6);
        org.junit.Assert.assertNotNull(byteBuffer7);
        org.junit.Assert.assertNotNull(buffer8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(buffer10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(floatBuffer13);
    }

    @Test
    public void test1192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1192");
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
        org.jsoup.helper.HttpConnection.Response response12 = null;
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response12);
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response12);
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response12);
        java.nio.ByteBuffer byteBuffer16 = response15.byteData;
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response15);
        java.nio.ByteBuffer byteBuffer19 = java.nio.ByteBuffer.allocate(0);
        response15.byteData = byteBuffer19;
        int int21 = byteBuffer19.arrayOffset();
        byte[] byteArray22 = new byte[] {};
        java.nio.ByteBuffer byteBuffer23 = java.nio.ByteBuffer.wrap(byteArray22);
        java.nio.ByteBuffer byteBuffer24 = byteBuffer19.get(byteArray22);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer27 = byteBuffer1.put(byteArray22, (int) (byte) 10, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
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
        org.junit.Assert.assertNull(byteBuffer16);
        org.junit.Assert.assertNotNull(byteBuffer19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[]");
        org.junit.Assert.assertNotNull(byteBuffer23);
        org.junit.Assert.assertNotNull(byteBuffer24);
    }

    @Test
    public void test1193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1193");
        byte[] byteArray0 = new byte[] {};
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.wrap(byteArray0);
        java.nio.Buffer buffer2 = byteBuffer1.flip();
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.asReadOnlyBuffer();
        java.nio.ByteBuffer byteBuffer4 = byteBuffer1.duplicate();
        java.nio.DoubleBuffer doubleBuffer5 = byteBuffer1.asDoubleBuffer();
        java.nio.CharBuffer charBuffer6 = byteBuffer1.asCharBuffer();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer8 = byteBuffer1.putInt(0);
            org.junit.Assert.fail("Expected exception of type java.nio.BufferOverflowException; message: null");
        } catch (java.nio.BufferOverflowException e) {
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
    public void test1194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1194");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer2 = byteBuffer1.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        java.nio.ByteBuffer byteBuffer4 = byteBuffer1.compact();
        java.nio.ByteBuffer byteBuffer5 = byteBuffer1.slice();
        int int6 = byteBuffer1.position();
        int int7 = byteBuffer1.capacity();
        // The following exception was thrown during execution in test generation
        try {
            short short9 = byteBuffer1.getShort(1);
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
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1195");
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
        int int14 = doubleBuffer13.remaining();
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
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test1196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1196");
        byte[] byteArray0 = new byte[] {};
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.wrap(byteArray0);
        java.nio.Buffer buffer2 = byteBuffer1.flip();
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.asReadOnlyBuffer();
        java.nio.ByteBuffer byteBuffer4 = byteBuffer1.duplicate();
        java.nio.ByteBuffer byteBuffer6 = java.nio.ByteBuffer.allocate(0);
        boolean boolean7 = byteBuffer6.isReadOnly();
        java.nio.ShortBuffer shortBuffer8 = byteBuffer6.asShortBuffer();
        int int9 = byteBuffer6.position();
        boolean boolean10 = byteBuffer6.isReadOnly();
        java.nio.ByteOrder byteOrder11 = byteBuffer6.order();
        java.nio.ByteBuffer byteBuffer12 = byteBuffer4.order(byteOrder11);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer14 = byteBuffer12.putShort((short) 0);
            org.junit.Assert.fail("Expected exception of type java.nio.BufferOverflowException; message: null");
        } catch (java.nio.BufferOverflowException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(buffer2);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertNotNull(byteBuffer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(shortBuffer8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(byteOrder11);
        org.junit.Assert.assertNotNull(byteBuffer12);
    }

    @Test
    public void test1197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1197");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.ByteBuffer byteBuffer2 = byteBuffer1.slice();
        java.nio.ByteBuffer byteBuffer4 = java.nio.ByteBuffer.allocate((int) ' ');
        java.nio.Buffer buffer5 = byteBuffer4.rewind();
        java.nio.ByteBuffer byteBuffer6 = byteBuffer4.compact();
        java.nio.ByteOrder byteOrder7 = byteBuffer4.order();
        java.nio.ByteBuffer byteBuffer8 = byteBuffer2.order(byteOrder7);
        boolean boolean9 = byteBuffer2.isReadOnly();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.Buffer buffer11 = byteBuffer2.position(4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: newPosition > limit: (4 > 0)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteBuffer2);
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertNotNull(buffer5);
        org.junit.Assert.assertNotNull(byteBuffer6);
        org.junit.Assert.assertNotNull(byteOrder7);
        org.junit.Assert.assertNotNull(byteBuffer8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1198");
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
        // The following exception was thrown during execution in test generation
        try {
            short short33 = byteBuffer31.getShort((int) '4');
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
    }

    @Test
    public void test1199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1199");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean3 = response2.executed;
        java.lang.String str5 = response2.getHeaderCaseInsensitive("");
        java.net.URL uRL6 = response2.url();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry8 = response2.scanHeaders("");
        response2.statusMessage = "";
        java.lang.String str11 = response2.charset();
        response2.charset = "java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]";
        response2.statusCode = 9;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(strEntry8);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test1200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1200");
        byte[] byteArray0 = new byte[] {};
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.wrap(byteArray0);
        java.nio.Buffer buffer2 = byteBuffer1.flip();
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.asReadOnlyBuffer();
        java.nio.ByteBuffer byteBuffer4 = byteBuffer1.duplicate();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer7 = byteBuffer4.putShort(35, (short) 100);
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
    }

    @Test
    public void test1201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1201");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            double double2 = byteBuffer1.getDouble();
            org.junit.Assert.fail("Expected exception of type java.nio.BufferUnderflowException; message: null");
        } catch (java.nio.BufferUnderflowException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
    }

    @Test
    public void test1202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1202");
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
        java.nio.ShortBuffer shortBuffer18 = byteBuffer16.asShortBuffer();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer21 = byteBuffer16.put((-1), (byte) 1);
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
        org.junit.Assert.assertNotNull(shortBuffer18);
    }

    @Test
    public void test1203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1203");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.ByteBuffer byteBuffer2 = byteBuffer1.slice();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        java.nio.ByteBuffer byteBuffer4 = byteBuffer1.asReadOnlyBuffer();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer6 = byteBuffer1.putInt(11);
            org.junit.Assert.fail("Expected exception of type java.nio.BufferOverflowException; message: null");
        } catch (java.nio.BufferOverflowException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteBuffer2);
        org.junit.Assert.assertNotNull(shortBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer4);
    }

    @Test
    public void test1204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1204");
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
        int int15 = response3.numRedirects;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response16 = org.jsoup.helper.HttpConnection.Response.execute(request0, response3);
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
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test1205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1205");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.isReadOnly();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        int int4 = byteBuffer1.position();
        boolean boolean5 = byteBuffer1.isReadOnly();
        java.nio.CharBuffer charBuffer6 = byteBuffer1.asCharBuffer();
        boolean boolean8 = byteBuffer1.equals((java.lang.Object) (-1L));
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer10 = byteBuffer1.putLong((long) (-10));
            org.junit.Assert.fail("Expected exception of type java.nio.BufferOverflowException; message: null");
        } catch (java.nio.BufferOverflowException e) {
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
    public void test1206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1206");
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
        // The following exception was thrown during execution in test generation
        try {
            double double20 = byteBuffer17.getDouble((int) '#');
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
    }

    @Test
    public void test1207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1207");
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
        java.nio.ByteBuffer byteBuffer21 = java.nio.ByteBuffer.allocate(35);
        java.nio.ByteBuffer byteBuffer24 = byteBuffer21.putChar(1, '\000');
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer25 = byteBuffer13.put(byteBuffer21);
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
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(byteBuffer19);
        org.junit.Assert.assertNotNull(byteBuffer21);
        org.junit.Assert.assertNotNull(byteBuffer24);
    }

    @Test
    public void test1208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1208");
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
        // The following exception was thrown during execution in test generation
        try {
            float float23 = byteBuffer21.getFloat(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
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
    }

    @Test
    public void test1209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1209");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect((int) '#');
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.putShort((short) 0);
        java.nio.ByteBuffer byteBuffer5 = java.nio.ByteBuffer.allocateDirect((int) '#');
        java.nio.ByteBuffer byteBuffer7 = byteBuffer5.putShort((short) 0);
        java.nio.ByteBuffer byteBuffer9 = byteBuffer5.putDouble((double) '\000');
        char char10 = byteBuffer9.getChar();
        java.nio.ByteBuffer byteBuffer12 = byteBuffer9.put((byte) 10);
        int int13 = byteBuffer1.compareTo(byteBuffer12);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.Buffer buffer15 = byteBuffer1.limit(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertNotNull(byteBuffer7);
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + '\000' + "'", char10 == '\000');
        org.junit.Assert.assertNotNull(byteBuffer12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 11 + "'", int13 == 11);
    }

    @Test
    public void test1210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1210");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer2 = byteBuffer1.asDoubleBuffer();
        boolean boolean3 = byteBuffer1.isDirect();
        int int4 = byteBuffer1.arrayOffset();
        java.nio.ByteBuffer byteBuffer5 = byteBuffer1.asReadOnlyBuffer();
        java.nio.ByteBuffer byteBuffer6 = byteBuffer5.asReadOnlyBuffer();
        java.nio.IntBuffer intBuffer7 = byteBuffer6.asIntBuffer();
        java.nio.ByteBuffer byteBuffer9 = java.nio.ByteBuffer.allocateDirect((int) '#');
        java.nio.ByteBuffer byteBuffer11 = byteBuffer9.putShort((short) 0);
        java.nio.ByteBuffer byteBuffer14 = byteBuffer11.putShort(0, (short) (byte) 10);
        java.nio.ByteBuffer byteBuffer16 = java.nio.ByteBuffer.allocate((int) (byte) 10);
        byte[] byteArray20 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.nio.ByteBuffer byteBuffer21 = java.nio.ByteBuffer.wrap(byteArray20);
        java.nio.ByteBuffer byteBuffer22 = byteBuffer16.get(byteArray20);
        java.nio.Buffer buffer23 = byteBuffer16.rewind();
        java.nio.ByteOrder byteOrder24 = byteBuffer16.order();
        java.nio.ByteBuffer byteBuffer25 = byteBuffer14.order(byteOrder24);
        java.nio.ByteBuffer byteBuffer26 = byteBuffer6.order(byteOrder24);
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(doubleBuffer2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertNotNull(byteBuffer6);
        org.junit.Assert.assertNotNull(intBuffer7);
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertNotNull(byteBuffer11);
        org.junit.Assert.assertNotNull(byteBuffer14);
        org.junit.Assert.assertNotNull(byteBuffer16);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(byteBuffer21);
        org.junit.Assert.assertNotNull(byteBuffer22);
        org.junit.Assert.assertNotNull(buffer23);
        org.junit.Assert.assertNotNull(byteOrder24);
        org.junit.Assert.assertNotNull(byteBuffer25);
        org.junit.Assert.assertNotNull(byteBuffer26);
    }

    @Test
    public void test1211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1211");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate((int) (byte) 10);
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.nio.ByteBuffer byteBuffer6 = java.nio.ByteBuffer.wrap(byteArray5);
        java.nio.ByteBuffer byteBuffer7 = byteBuffer1.get(byteArray5);
        java.nio.Buffer buffer8 = byteBuffer1.rewind();
        java.nio.ByteOrder byteOrder9 = byteBuffer1.order();
        boolean boolean10 = byteBuffer1.hasRemaining();
        byte[] byteArray13 = new byte[] { (byte) 10, (byte) 1 };
        java.nio.ByteBuffer byteBuffer14 = byteBuffer1.put(byteArray13);
        java.nio.ByteBuffer byteBuffer15 = java.nio.ByteBuffer.wrap(byteArray13);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer18 = byteBuffer15.putChar((int) (byte) 100, '\u0a00');
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
        org.junit.Assert.assertNotNull(byteBuffer15);
    }

    @Test
    public void test1212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1212");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate((int) (byte) 10);
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.nio.ByteBuffer byteBuffer6 = java.nio.ByteBuffer.wrap(byteArray5);
        java.nio.ByteBuffer byteBuffer7 = byteBuffer1.get(byteArray5);
        java.nio.Buffer buffer8 = byteBuffer1.rewind();
        java.nio.ByteBuffer byteBuffer10 = byteBuffer1.putInt((int) (short) 10);
        java.nio.ByteBuffer byteBuffer11 = byteBuffer1.asReadOnlyBuffer();
        java.lang.String str12 = byteBuffer11.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer14 = byteBuffer11.put((byte) 0);
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
        org.junit.Assert.assertNotNull(byteBuffer10);
        org.junit.Assert.assertNotNull(byteBuffer11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "java.nio.HeapByteBufferR[pos=4 lim=10 cap=10]" + "'", str12, "java.nio.HeapByteBufferR[pos=4 lim=10 cap=10]");
    }

    @Test
    public void test1213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1213");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.nio.ByteBuffer byteBuffer4 = response3.byteData;
        org.jsoup.Connection.Response response7 = response3.cookie("hi!", "");
        boolean boolean8 = response3.executed;
        java.lang.String str9 = response3.charset();
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response3);
        java.lang.String str11 = response10.charset;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry13 = response10.scanHeaders("hi!");
        java.lang.String str14 = response10.contentType;
        org.junit.Assert.assertNull(byteBuffer4);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(strEntry13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test1214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1214");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate((int) ' ');
        int int3 = byteBuffer1.getInt((int) (short) 0);
        java.nio.CharBuffer charBuffer4 = byteBuffer1.asCharBuffer();
        java.nio.ByteBuffer byteBuffer5 = byteBuffer1.compact();
        // The following exception was thrown during execution in test generation
        try {
            int int7 = byteBuffer1.getInt((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(charBuffer4);
        org.junit.Assert.assertNotNull(byteBuffer5);
    }

    @Test
    public void test1215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1215");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request7 = response6.req;
        org.junit.Assert.assertNull(request7);
    }

    @Test
    public void test1216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1216");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate((int) (byte) 10);
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.nio.ByteBuffer byteBuffer6 = java.nio.ByteBuffer.wrap(byteArray5);
        java.nio.ByteBuffer byteBuffer7 = byteBuffer1.get(byteArray5);
        java.nio.Buffer buffer8 = byteBuffer1.rewind();
        int int9 = byteBuffer1.position();
        java.nio.Buffer buffer10 = byteBuffer1.rewind();
        java.nio.ByteBuffer byteBuffer11 = byteBuffer1.slice();
        // The following exception was thrown during execution in test generation
        try {
            long long13 = byteBuffer11.getLong(70);
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
    }

    @Test
    public void test1217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1217");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.nio.ByteBuffer byteBuffer5 = response4.byteData;
        org.jsoup.Connection.Response response8 = response4.cookie("hi!", "");
        java.net.URL uRL9 = response4.url();
        response4.charset = "";
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response4);
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response12);
        org.jsoup.Connection.Request request14 = null;
        response13.req = request14;
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response13);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response17 = org.jsoup.helper.HttpConnection.Response.execute(request0, response16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(byteBuffer5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(uRL9);
    }

    @Test
    public void test1218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1218");
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
        char char23 = byteBuffer13.getChar();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer25 = byteBuffer13.put((byte) 1);
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
        org.junit.Assert.assertTrue("'" + char23 + "' != '" + '\000' + "'", char23 == '\000');
    }

    @Test
    public void test1219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1219");
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
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer18 = byteBuffer8.putDouble((-32), (double) 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
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
    }

    @Test
    public void test1220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1220");
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
        java.nio.ShortBuffer shortBuffer18 = byteBuffer16.asShortBuffer();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer20 = byteBuffer16.putInt(10);
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
        org.junit.Assert.assertNotNull(shortBuffer18);
    }

    @Test
    public void test1221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1221");
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
            java.nio.ByteBuffer byteBuffer23 = java.nio.ByteBuffer.wrap(byteArray16, 85, 85);
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
    public void test1222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1222");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.hasRemaining();
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.asReadOnlyBuffer();
        java.nio.ByteBuffer byteBuffer4 = byteBuffer1.asReadOnlyBuffer();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer7 = byteBuffer4.put(0, (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.nio.ReadOnlyBufferException; message: null");
        } catch (java.nio.ReadOnlyBufferException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer4);
    }

    @Test
    public void test1223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1223");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect((int) '#');
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.putShort((short) 0);
        java.nio.ByteBuffer byteBuffer5 = byteBuffer1.putDouble((double) '\000');
        java.nio.ByteBuffer byteBuffer7 = java.nio.ByteBuffer.allocate((int) (byte) 10);
        int int8 = byteBuffer7.getInt();
        java.nio.ByteBuffer byteBuffer11 = byteBuffer7.put((int) (byte) 0, (byte) 10);
        java.nio.IntBuffer intBuffer12 = byteBuffer7.asIntBuffer();
        byte[] byteArray16 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.nio.ByteBuffer byteBuffer17 = java.nio.ByteBuffer.wrap(byteArray16);
        java.nio.ByteBuffer byteBuffer18 = java.nio.ByteBuffer.wrap(byteArray16);
        java.nio.ByteBuffer byteBuffer19 = byteBuffer7.get(byteArray16);
        java.nio.ByteBuffer byteBuffer20 = byteBuffer5.put(byteArray16);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer23 = java.nio.ByteBuffer.wrap(byteArray16, (int) '#', (int) (short) 13312);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertNotNull(byteBuffer7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(byteBuffer11);
        org.junit.Assert.assertNotNull(intBuffer12);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(byteBuffer17);
        org.junit.Assert.assertNotNull(byteBuffer18);
        org.junit.Assert.assertNotNull(byteBuffer19);
        org.junit.Assert.assertNotNull(byteBuffer20);
    }

    @Test
    public void test1224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1224");
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
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer36 = byteBuffer20.putInt(31, 0);
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
        org.junit.Assert.assertNotNull(buffer33);
    }

    @Test
    public void test1225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1225");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.isReadOnly();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        java.nio.ByteBuffer byteBuffer5 = java.nio.ByteBuffer.allocate(0);
        boolean boolean6 = byteBuffer5.isReadOnly();
        int int7 = byteBuffer1.compareTo(byteBuffer5);
        java.nio.Buffer buffer8 = byteBuffer5.mark();
        int int9 = byteBuffer5.position();
        org.jsoup.helper.HttpConnection.Response response10 = null;
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response10);
        java.lang.String str13 = response11.header("");
        response11.charset = "hi!";
        java.lang.String str16 = response11.statusMessage;
        int int17 = response11.numRedirects;
        boolean boolean18 = byteBuffer5.equals((java.lang.Object) response11);
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(shortBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(buffer8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1226");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.isReadOnly();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        java.nio.ByteBuffer byteBuffer5 = java.nio.ByteBuffer.allocate(0);
        boolean boolean6 = byteBuffer5.isReadOnly();
        int int7 = byteBuffer1.compareTo(byteBuffer5);
        java.nio.DoubleBuffer doubleBuffer8 = byteBuffer5.asDoubleBuffer();
        java.nio.FloatBuffer floatBuffer9 = byteBuffer5.asFloatBuffer();
        java.lang.String str10 = byteBuffer5.toString();
        java.nio.Buffer buffer11 = byteBuffer5.rewind();
        boolean boolean12 = byteBuffer5.isDirect();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer14 = byteBuffer5.putInt((int) (short) -1);
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
        org.junit.Assert.assertNotNull(buffer11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1227");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Request request4 = response3.req;
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response3);
        response5.executed = false;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response8 = org.jsoup.helper.HttpConnection.Response.execute(request0, response5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(request4);
    }

    @Test
    public void test1228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1228");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.isReadOnly();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        java.nio.ByteBuffer byteBuffer5 = java.nio.ByteBuffer.allocate(0);
        boolean boolean6 = byteBuffer5.isReadOnly();
        int int7 = byteBuffer1.compareTo(byteBuffer5);
        java.nio.ByteBuffer byteBuffer8 = byteBuffer5.compact();
        java.nio.ByteBuffer byteBuffer9 = byteBuffer5.slice();
        // The following exception was thrown during execution in test generation
        try {
            float float11 = byteBuffer5.getFloat(0);
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
    }

    @Test
    public void test1229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1229");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate((int) (byte) 10);
        int int2 = byteBuffer1.getInt();
        java.nio.ByteBuffer byteBuffer3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer4 = byteBuffer1.put(byteBuffer3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1230");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.isReadOnly();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        int int4 = byteBuffer1.position();
        int int5 = byteBuffer1.capacity();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer7 = byteBuffer1.putInt(7);
            org.junit.Assert.fail("Expected exception of type java.nio.BufferOverflowException; message: null");
        } catch (java.nio.BufferOverflowException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(shortBuffer3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test1231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1231");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int5 = response4.numRedirects;
        java.net.URL uRL6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response7 = response4.url(uRL6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test1232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1232");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer2 = byteBuffer1.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        java.nio.ByteBuffer byteBuffer4 = byteBuffer1.compact();
        java.nio.Buffer buffer5 = byteBuffer4.rewind();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer7 = byteBuffer4.putChar('#');
            org.junit.Assert.fail("Expected exception of type java.nio.BufferOverflowException; message: null");
        } catch (java.nio.BufferOverflowException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(doubleBuffer2);
        org.junit.Assert.assertNotNull(shortBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertNotNull(buffer5);
    }

    @Test
    public void test1233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1233");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.executed = false;
        java.lang.String str4 = response1.contentType;
        int int5 = response1.statusCode;
        java.lang.String str6 = response1.charset();
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response7);
        java.lang.String str10 = response8.cookie("java.nio.HeapByteBuffer[pos=0 lim=32 cap=32]");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test1234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1234");
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
        char char23 = byteBuffer13.getChar();
        java.nio.Buffer buffer24 = byteBuffer13.mark();
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
        org.junit.Assert.assertTrue("'" + char23 + "' != '" + '\000' + "'", char23 == '\000');
        org.junit.Assert.assertNotNull(buffer24);
    }

    @Test
    public void test1235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1235");
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
        java.lang.String str14 = byteBuffer5.toString();
        // The following exception was thrown during execution in test generation
        try {
            float float15 = byteBuffer5.getFloat();
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
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]" + "'", str14, "java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]");
    }

    @Test
    public void test1236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1236");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.header("");
        org.jsoup.Connection.Response response5 = response1.removeCookie("hi!");
        java.lang.String str7 = response1.cookie("");
        java.lang.String str8 = response1.statusMessage();
        int int9 = response1.statusCode();
        response1.contentType = "java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]";
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str13 = response1.charset();
        response1.executed = false;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test1237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1237");
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
        java.nio.ByteBuffer byteBuffer27 = java.nio.ByteBuffer.allocateDirect((int) '#');
        java.nio.ByteBuffer byteBuffer29 = byteBuffer27.putShort((short) 0);
        java.nio.ByteBuffer byteBuffer31 = byteBuffer27.putDouble((double) '\000');
        java.nio.ByteBuffer byteBuffer33 = java.nio.ByteBuffer.allocate((int) (byte) 10);
        int int34 = byteBuffer33.getInt();
        java.nio.ByteBuffer byteBuffer37 = byteBuffer33.put((int) (byte) 0, (byte) 10);
        java.nio.IntBuffer intBuffer38 = byteBuffer33.asIntBuffer();
        byte[] byteArray42 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.nio.ByteBuffer byteBuffer43 = java.nio.ByteBuffer.wrap(byteArray42);
        java.nio.ByteBuffer byteBuffer44 = java.nio.ByteBuffer.wrap(byteArray42);
        java.nio.ByteBuffer byteBuffer45 = byteBuffer33.get(byteArray42);
        java.nio.ByteBuffer byteBuffer46 = byteBuffer31.put(byteArray42);
        java.nio.ByteBuffer byteBuffer47 = java.nio.ByteBuffer.wrap(byteArray42);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer48 = byteBuffer10.put(byteArray42);
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
        org.junit.Assert.assertNotNull(byteBuffer29);
        org.junit.Assert.assertNotNull(byteBuffer31);
        org.junit.Assert.assertNotNull(byteBuffer33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(byteBuffer37);
        org.junit.Assert.assertNotNull(intBuffer38);
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray42), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(byteBuffer43);
        org.junit.Assert.assertNotNull(byteBuffer44);
        org.junit.Assert.assertNotNull(byteBuffer45);
        org.junit.Assert.assertNotNull(byteBuffer46);
        org.junit.Assert.assertNotNull(byteBuffer47);
    }

    @Test
    public void test1238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1238");
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
        java.nio.CharBuffer charBuffer17 = byteBuffer15.asCharBuffer();
        boolean boolean18 = byteBuffer15.isReadOnly();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer21 = byteBuffer15.putChar((int) (byte) 1, '#');
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
        org.junit.Assert.assertNotNull(charBuffer17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1239");
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
        java.lang.String str18 = response2.statusMessage;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response19 = org.jsoup.helper.HttpConnection.Response.execute(request0, response2);
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
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test1240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1240");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate((int) (byte) 10);
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.nio.ByteBuffer byteBuffer6 = java.nio.ByteBuffer.wrap(byteArray5);
        java.nio.ByteBuffer byteBuffer7 = byteBuffer1.get(byteArray5);
        java.nio.Buffer buffer8 = byteBuffer1.rewind();
        byte[] byteArray12 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.nio.ByteBuffer byteBuffer13 = java.nio.ByteBuffer.wrap(byteArray12);
        java.nio.ByteBuffer byteBuffer14 = byteBuffer1.put(byteArray12);
        java.nio.Buffer buffer15 = byteBuffer14.mark();
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
        org.junit.Assert.assertNotNull(buffer15);
    }

    @Test
    public void test1241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1241");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer2 = byteBuffer1.asDoubleBuffer();
        java.nio.FloatBuffer floatBuffer3 = byteBuffer1.asFloatBuffer();
        // The following exception was thrown during execution in test generation
        try {
            byte byte4 = byteBuffer1.get();
            org.junit.Assert.fail("Expected exception of type java.nio.BufferUnderflowException; message: null");
        } catch (java.nio.BufferUnderflowException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(doubleBuffer2);
        org.junit.Assert.assertNotNull(floatBuffer3);
    }

    @Test
    public void test1242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1242");
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
        // The following exception was thrown during execution in test generation
        try {
            int int15 = byteBuffer13.getInt();
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
    }

    @Test
    public void test1243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1243");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int5 = response4.numRedirects;
        java.lang.String str6 = response4.charset();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test1244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1244");
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
        java.nio.ByteBuffer byteBuffer23 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer24 = byteBuffer23.asDoubleBuffer();
        boolean boolean25 = byteBuffer23.isDirect();
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
        java.nio.ByteBuffer byteBuffer39 = byteBuffer31.slice();
        java.nio.ByteBuffer byteBuffer40 = byteBuffer23.put(byteBuffer39);
        byte[] byteArray41 = byteBuffer39.array();
        java.nio.ByteBuffer byteBuffer42 = byteBuffer21.put(byteArray41);
        // The following exception was thrown during execution in test generation
        try {
            char char43 = byteBuffer21.getChar();
            org.junit.Assert.fail("Expected exception of type java.nio.BufferUnderflowException; message: null");
        } catch (java.nio.BufferUnderflowException e) {
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
        org.junit.Assert.assertNotNull(byteBuffer23);
        org.junit.Assert.assertNotNull(doubleBuffer24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
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
        org.junit.Assert.assertNotNull(byteBuffer40);
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray41), "[]");
        org.junit.Assert.assertNotNull(byteBuffer42);
    }

    @Test
    public void test1245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1245");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer2 = byteBuffer1.asDoubleBuffer();
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.compact();
        java.lang.String str4 = byteBuffer1.toString();
        int int5 = byteBuffer1.arrayOffset();
        java.nio.LongBuffer longBuffer6 = byteBuffer1.asLongBuffer();
        java.nio.Buffer buffer7 = longBuffer6.clear();
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(doubleBuffer2);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]" + "'", str4, "java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(longBuffer6);
        org.junit.Assert.assertNotNull(buffer7);
    }

    @Test
    public void test1246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1246");
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
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response5);
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response10);
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response10);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1247");
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
        java.nio.ByteBuffer byteBuffer24 = byteBuffer6.duplicate();
        java.nio.IntBuffer intBuffer25 = byteBuffer6.asIntBuffer();
        // The following exception was thrown during execution in test generation
        try {
            char char27 = byteBuffer6.getChar((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
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
        org.junit.Assert.assertNotNull(byteBuffer24);
        org.junit.Assert.assertNotNull(intBuffer25);
    }

    @Test
    public void test1248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1248");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate((int) (byte) 10);
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.nio.ByteBuffer byteBuffer6 = java.nio.ByteBuffer.wrap(byteArray5);
        java.nio.ByteBuffer byteBuffer7 = byteBuffer1.get(byteArray5);
        java.nio.IntBuffer intBuffer8 = byteBuffer7.asIntBuffer();
        java.nio.ByteBuffer byteBuffer9 = byteBuffer7.slice();
        java.nio.LongBuffer longBuffer10 = byteBuffer9.asLongBuffer();
        // The following exception was thrown during execution in test generation
        try {
            float float12 = byteBuffer9.getFloat((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(byteBuffer6);
        org.junit.Assert.assertNotNull(byteBuffer7);
        org.junit.Assert.assertNotNull(intBuffer8);
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertNotNull(longBuffer10);
    }

    @Test
    public void test1249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1249");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.isReadOnly();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        int int4 = byteBuffer1.position();
        java.nio.ByteOrder byteOrder5 = null;
        java.nio.ByteBuffer byteBuffer6 = byteBuffer1.order(byteOrder5);
        int int7 = byteBuffer6.remaining();
        java.nio.ByteBuffer byteBuffer9 = java.nio.ByteBuffer.allocate((int) (byte) 10);
        byte[] byteArray13 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.nio.ByteBuffer byteBuffer14 = java.nio.ByteBuffer.wrap(byteArray13);
        java.nio.ByteBuffer byteBuffer15 = byteBuffer9.get(byteArray13);
        java.nio.Buffer buffer16 = byteBuffer9.rewind();
        java.nio.ByteOrder byteOrder17 = byteBuffer9.order();
        boolean boolean18 = byteBuffer9.hasRemaining();
        byte[] byteArray21 = new byte[] { (byte) 10, (byte) 1 };
        java.nio.ByteBuffer byteBuffer22 = byteBuffer9.put(byteArray21);
        short short23 = byteBuffer9.getShort();
        byte[] byteArray27 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.nio.ByteBuffer byteBuffer28 = java.nio.ByteBuffer.wrap(byteArray27);
        java.nio.ByteBuffer byteBuffer29 = byteBuffer9.put(byteArray27);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer32 = byteBuffer6.get(byteArray27, (int) (short) 13312, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(shortBuffer3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(byteBuffer6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(byteBuffer14);
        org.junit.Assert.assertNotNull(byteBuffer15);
        org.junit.Assert.assertNotNull(buffer16);
        org.junit.Assert.assertNotNull(byteOrder17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[10, 1]");
        org.junit.Assert.assertNotNull(byteBuffer22);
        org.junit.Assert.assertTrue("'" + short23 + "' != '" + (short) 0 + "'", short23 == (short) 0);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[100, 1, 1]");
        org.junit.Assert.assertNotNull(byteBuffer28);
        org.junit.Assert.assertNotNull(byteBuffer29);
    }

    @Test
    public void test1250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1250");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate((int) (byte) 100);
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.putDouble((double) '4');
        byte[] byteArray9 = new byte[] { (byte) 1, (byte) 100, (byte) -1, (byte) 10, (byte) -1 };
        java.nio.ByteBuffer byteBuffer10 = byteBuffer1.put(byteArray9);
        java.nio.ByteBuffer byteBuffer13 = java.nio.ByteBuffer.wrap(byteArray9, (int) '\000', 0);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer16 = java.nio.ByteBuffer.wrap(byteArray9, 13, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[1, 100, -1, 10, -1]");
        org.junit.Assert.assertNotNull(byteBuffer10);
        org.junit.Assert.assertNotNull(byteBuffer13);
    }

    @Test
    public void test1251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1251");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.isReadOnly();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        java.nio.ByteBuffer byteBuffer4 = byteBuffer1.duplicate();
        int int5 = byteBuffer4.remaining();
        java.nio.IntBuffer intBuffer6 = byteBuffer4.asIntBuffer();
        java.nio.FloatBuffer floatBuffer7 = byteBuffer4.asFloatBuffer();
        // The following exception was thrown during execution in test generation
        try {
            byte byte9 = byteBuffer4.get((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(shortBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(intBuffer6);
        org.junit.Assert.assertNotNull(floatBuffer7);
    }

    @Test
    public void test1252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1252");
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
        boolean boolean15 = response13.hasCookie("java.nio.HeapByteBuffer[pos=0 lim=32 cap=32]");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response16 = org.jsoup.helper.HttpConnection.Response.execute(request0, response13);
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
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1253");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.isReadOnly();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        int int4 = byteBuffer1.position();
        java.nio.ByteOrder byteOrder5 = null;
        java.nio.ByteBuffer byteBuffer6 = byteBuffer1.order(byteOrder5);
        int int7 = byteBuffer6.limit();
        java.nio.CharBuffer charBuffer8 = byteBuffer6.asCharBuffer();
        java.nio.Buffer buffer9 = charBuffer8.mark();
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(shortBuffer3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(byteBuffer6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(charBuffer8);
        org.junit.Assert.assertNotNull(buffer9);
    }

    @Test
    public void test1254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1254");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.header("");
        org.jsoup.Connection.Response response5 = response1.removeCookie("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap6 = response1.headers();
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response7);
        response7.executed = true;
        response7.charset = "java.nio.HeapByteBuffer[pos=0 lim=32 cap=32]";
        response7.contentType = "java.nio.HeapByteBuffer[pos=16 lim=100 cap=100]";
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNotNull(strMap6);
    }

    @Test
    public void test1255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1255");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate((int) (byte) 10);
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.nio.ByteBuffer byteBuffer6 = java.nio.ByteBuffer.wrap(byteArray5);
        java.nio.ByteBuffer byteBuffer7 = byteBuffer1.get(byteArray5);
        java.nio.Buffer buffer8 = byteBuffer1.rewind();
        byte[] byteArray12 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.nio.ByteBuffer byteBuffer13 = java.nio.ByteBuffer.wrap(byteArray12);
        java.nio.ByteBuffer byteBuffer14 = byteBuffer1.put(byteArray12);
        java.nio.ByteOrder byteOrder15 = byteBuffer14.order();
        java.nio.ByteBuffer byteBuffer16 = byteBuffer14.slice();
        // The following exception was thrown during execution in test generation
        try {
            char char18 = byteBuffer16.getChar(9);
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
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[100, 1, 1]");
        org.junit.Assert.assertNotNull(byteBuffer13);
        org.junit.Assert.assertNotNull(byteBuffer14);
        org.junit.Assert.assertNotNull(byteOrder15);
        org.junit.Assert.assertNotNull(byteBuffer16);
    }

    @Test
    public void test1256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1256");
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
        java.util.Map<java.lang.String, java.lang.String> strMap30 = response25.headers();
        response25.charset = "";
        org.jsoup.helper.HttpConnection.Response response33 = new org.jsoup.helper.HttpConnection.Response(response25);
        java.lang.String str34 = response33.statusMessage;
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
        org.junit.Assert.assertNotNull(strMap30);
        org.junit.Assert.assertNull(str34);
    }

    @Test
    public void test1257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1257");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer2 = byteBuffer1.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        java.nio.ByteBuffer byteBuffer4 = byteBuffer1.compact();
        java.nio.ByteBuffer byteBuffer5 = byteBuffer1.slice();
        java.nio.ByteBuffer byteBuffer7 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer8 = byteBuffer7.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer9 = byteBuffer7.asShortBuffer();
        java.nio.ByteBuffer byteBuffer10 = byteBuffer7.compact();
        int int11 = byteBuffer10.capacity();
        java.nio.Buffer buffer12 = byteBuffer10.mark();
        int int13 = byteBuffer1.compareTo(byteBuffer10);
        java.nio.Buffer buffer14 = byteBuffer1.mark();
        // The following exception was thrown during execution in test generation
        try {
            short short15 = byteBuffer1.getShort();
            org.junit.Assert.fail("Expected exception of type java.nio.BufferUnderflowException; message: null");
        } catch (java.nio.BufferUnderflowException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(doubleBuffer2);
        org.junit.Assert.assertNotNull(shortBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertNotNull(byteBuffer7);
        org.junit.Assert.assertNotNull(doubleBuffer8);
        org.junit.Assert.assertNotNull(shortBuffer9);
        org.junit.Assert.assertNotNull(byteBuffer10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(buffer12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(buffer14);
    }

    @Test
    public void test1258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1258");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.isReadOnly();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        java.nio.ByteBuffer byteBuffer4 = byteBuffer1.duplicate();
        int int5 = byteBuffer4.remaining();
        java.nio.IntBuffer intBuffer6 = byteBuffer4.asIntBuffer();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.Buffer buffer8 = byteBuffer4.position(32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: newPosition > limit: (32 > 0)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(shortBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(intBuffer6);
    }

    @Test
    public void test1259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1259");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str6 = response4.cookie("hi!");
        int int7 = response4.statusCode;
        org.jsoup.Connection.Response response9 = response4.removeCookie("java.nio.HeapByteBuffer[pos=0 lim=32 cap=32]");
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response4);
        java.nio.ByteBuffer byteBuffer11 = response4.byteData;
        org.jsoup.Connection.Request request12 = null;
        response4.req = request12;
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray14 = response4.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertNull(byteBuffer11);
    }

    @Test
    public void test1260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1260");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.isReadOnly();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        int int4 = byteBuffer1.position();
        int int5 = byteBuffer1.capacity();
        java.nio.Buffer buffer6 = byteBuffer1.flip();
        java.nio.ByteBuffer byteBuffer8 = java.nio.ByteBuffer.allocate((int) (byte) 10);
        byte[] byteArray12 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.nio.ByteBuffer byteBuffer13 = java.nio.ByteBuffer.wrap(byteArray12);
        java.nio.ByteBuffer byteBuffer14 = byteBuffer8.get(byteArray12);
        java.nio.ByteBuffer byteBuffer15 = byteBuffer8.slice();
        byte[] byteArray16 = byteBuffer15.array();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer19 = byteBuffer1.put(byteArray16, (int) (short) 10, 93);
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
        org.junit.Assert.assertNotNull(byteBuffer8);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(byteBuffer13);
        org.junit.Assert.assertNotNull(byteBuffer14);
        org.junit.Assert.assertNotNull(byteBuffer15);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test1261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1261");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate((int) (byte) 10);
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.nio.ByteBuffer byteBuffer6 = java.nio.ByteBuffer.wrap(byteArray5);
        java.nio.ByteBuffer byteBuffer7 = byteBuffer1.get(byteArray5);
        java.nio.Buffer buffer8 = byteBuffer1.rewind();
        int int9 = byteBuffer1.position();
        java.nio.Buffer buffer10 = byteBuffer1.rewind();
        java.nio.ByteBuffer byteBuffer11 = byteBuffer1.slice();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer14 = byteBuffer11.putChar(93, 'a');
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
    }

    @Test
    public void test1262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1262");
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
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry15 = response3.scanHeaders("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response16 = org.jsoup.helper.HttpConnection.Response.execute(request0, response3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(uRL7);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(strEntry15);
    }

    @Test
    public void test1263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1263");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer2 = byteBuffer1.asDoubleBuffer();
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.compact();
        java.lang.String str4 = byteBuffer1.toString();
        int int5 = byteBuffer1.arrayOffset();
        java.nio.LongBuffer longBuffer6 = byteBuffer1.asLongBuffer();
        int int7 = byteBuffer1.capacity();
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(doubleBuffer2);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]" + "'", str4, "java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(longBuffer6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1264");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect((int) '#');
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.putShort((short) 0);
        java.nio.ByteBuffer byteBuffer6 = byteBuffer3.putLong(1, (long) 10);
        java.nio.ByteBuffer byteBuffer9 = byteBuffer3.putShort(0, (short) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = byteBuffer9.arrayOffset();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer6);
        org.junit.Assert.assertNotNull(byteBuffer9);
    }

    @Test
    public void test1265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1265");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate((int) (byte) 10);
        int int2 = byteBuffer1.limit();
        java.nio.ByteBuffer byteBuffer4 = java.nio.ByteBuffer.allocate((int) (byte) 10);
        byte[] byteArray8 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.nio.ByteBuffer byteBuffer9 = java.nio.ByteBuffer.wrap(byteArray8);
        java.nio.ByteBuffer byteBuffer10 = byteBuffer4.get(byteArray8);
        java.nio.Buffer buffer11 = byteBuffer4.rewind();
        byte[] byteArray15 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.nio.ByteBuffer byteBuffer16 = java.nio.ByteBuffer.wrap(byteArray15);
        java.nio.ByteBuffer byteBuffer17 = byteBuffer4.put(byteArray15);
        java.nio.ByteBuffer byteBuffer18 = java.nio.ByteBuffer.wrap(byteArray15);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer21 = byteBuffer1.put(byteArray15, (int) (short) 100, 70);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertNotNull(byteBuffer10);
        org.junit.Assert.assertNotNull(buffer11);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[100, 1, 1]");
        org.junit.Assert.assertNotNull(byteBuffer16);
        org.junit.Assert.assertNotNull(byteBuffer17);
        org.junit.Assert.assertNotNull(byteBuffer18);
    }

    @Test
    public void test1266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1266");
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
        org.jsoup.Connection.Response response15 = response3.removeCookie("java.nio.DirectByteBuffer[pos=8 lim=35 cap=35]");
        org.junit.Assert.assertNull(byteBuffer4);
        org.junit.Assert.assertNotNull(byteBuffer7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertNotNull(response15);
    }

    @Test
    public void test1267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1267");
        org.jsoup.helper.HttpConnection.Response.MAX_REDIRECTS = (byte) -1;
    }

    @Test
    public void test1268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1268");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.isReadOnly();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        java.nio.ByteBuffer byteBuffer5 = java.nio.ByteBuffer.allocate(0);
        boolean boolean6 = byteBuffer5.isReadOnly();
        int int7 = byteBuffer1.compareTo(byteBuffer5);
        java.nio.DoubleBuffer doubleBuffer8 = byteBuffer5.asDoubleBuffer();
        // The following exception was thrown during execution in test generation
        try {
            int int10 = byteBuffer5.getInt(0);
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
    }

    @Test
    public void test1269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1269");
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
        java.lang.String str10 = response5.contentType();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document11 = response5.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test1270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1270");
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
        java.nio.ByteBuffer byteBuffer26 = java.nio.ByteBuffer.allocate((int) (byte) 10);
        byte[] byteArray30 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.nio.ByteBuffer byteBuffer31 = java.nio.ByteBuffer.wrap(byteArray30);
        java.nio.ByteBuffer byteBuffer32 = byteBuffer26.get(byteArray30);
        java.nio.LongBuffer longBuffer33 = byteBuffer26.asLongBuffer();
        java.nio.ByteBuffer byteBuffer34 = byteBuffer26.slice();
        java.nio.ByteBuffer byteBuffer36 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer37 = byteBuffer36.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer38 = byteBuffer36.asShortBuffer();
        java.nio.ByteOrder byteOrder39 = null;
        java.nio.ByteBuffer byteBuffer40 = byteBuffer36.order(byteOrder39);
        java.nio.ByteBuffer byteBuffer42 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer43 = byteBuffer42.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer44 = byteBuffer42.asShortBuffer();
        int int45 = byteBuffer42.limit();
        byte[] byteArray46 = byteBuffer42.array();
        java.nio.ByteBuffer byteBuffer47 = byteBuffer36.put(byteArray46);
        java.nio.ByteBuffer byteBuffer48 = byteBuffer34.get(byteArray46);
        java.nio.ByteBuffer byteBuffer49 = java.nio.ByteBuffer.wrap(byteArray46);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer50 = byteBuffer20.put(byteArray46);
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
        org.junit.Assert.assertNotNull(byteBuffer26);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray30), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(byteBuffer31);
        org.junit.Assert.assertNotNull(byteBuffer32);
        org.junit.Assert.assertNotNull(longBuffer33);
        org.junit.Assert.assertNotNull(byteBuffer34);
        org.junit.Assert.assertNotNull(byteBuffer36);
        org.junit.Assert.assertNotNull(doubleBuffer37);
        org.junit.Assert.assertNotNull(shortBuffer38);
        org.junit.Assert.assertNotNull(byteBuffer40);
        org.junit.Assert.assertNotNull(byteBuffer42);
        org.junit.Assert.assertNotNull(doubleBuffer43);
        org.junit.Assert.assertNotNull(shortBuffer44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(byteArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray46), "[]");
        org.junit.Assert.assertNotNull(byteBuffer47);
        org.junit.Assert.assertNotNull(byteBuffer48);
        org.junit.Assert.assertNotNull(byteBuffer49);
    }

    @Test
    public void test1271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1271");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.isReadOnly();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        int int4 = byteBuffer1.position();
        boolean boolean5 = byteBuffer1.isReadOnly();
        java.nio.ByteOrder byteOrder6 = byteBuffer1.order();
        java.nio.CharBuffer charBuffer7 = byteBuffer1.asCharBuffer();
        java.nio.ByteBuffer byteBuffer9 = java.nio.ByteBuffer.allocate((int) (byte) 100);
        java.nio.ByteBuffer byteBuffer11 = byteBuffer9.putDouble((double) '4');
        byte[] byteArray17 = new byte[] { (byte) 1, (byte) 100, (byte) -1, (byte) 10, (byte) -1 };
        java.nio.ByteBuffer byteBuffer18 = byteBuffer9.put(byteArray17);
        java.nio.ByteBuffer byteBuffer21 = java.nio.ByteBuffer.wrap(byteArray17, (int) '\000', 0);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer22 = byteBuffer1.put(byteArray17);
            org.junit.Assert.fail("Expected exception of type java.nio.BufferOverflowException; message: null");
        } catch (java.nio.BufferOverflowException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(shortBuffer3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(byteOrder6);
        org.junit.Assert.assertNotNull(charBuffer7);
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertNotNull(byteBuffer11);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[1, 100, -1, 10, -1]");
        org.junit.Assert.assertNotNull(byteBuffer18);
        org.junit.Assert.assertNotNull(byteBuffer21);
    }

    @Test
    public void test1272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1272");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate((int) (byte) 10);
        int int2 = byteBuffer1.limit();
        short short3 = byteBuffer1.getShort();
        java.nio.ByteBuffer byteBuffer5 = byteBuffer1.put((byte) -1);
        java.nio.ByteBuffer byteBuffer8 = byteBuffer5.putDouble((int) (short) 0, (double) 11);
        // The following exception was thrown during execution in test generation
        try {
            float float10 = byteBuffer5.getFloat(93);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertNotNull(byteBuffer8);
    }

    @Test
    public void test1273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1273");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate((int) (byte) 10);
        int int2 = byteBuffer1.limit();
        java.nio.ByteBuffer byteBuffer4 = byteBuffer1.putChar(' ');
        java.nio.ByteBuffer byteBuffer6 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer7 = byteBuffer6.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer8 = byteBuffer6.asShortBuffer();
        java.nio.ByteOrder byteOrder9 = null;
        java.nio.ByteBuffer byteBuffer10 = byteBuffer6.order(byteOrder9);
        java.nio.ByteBuffer byteBuffer12 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer13 = byteBuffer12.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer14 = byteBuffer12.asShortBuffer();
        int int15 = byteBuffer12.limit();
        byte[] byteArray16 = byteBuffer12.array();
        java.nio.ByteBuffer byteBuffer17 = byteBuffer6.put(byteArray16);
        java.nio.ByteBuffer byteBuffer18 = byteBuffer1.put(byteArray16);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer21 = java.nio.ByteBuffer.wrap(byteArray16, (-1), 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertNotNull(byteBuffer6);
        org.junit.Assert.assertNotNull(doubleBuffer7);
        org.junit.Assert.assertNotNull(shortBuffer8);
        org.junit.Assert.assertNotNull(byteBuffer10);
        org.junit.Assert.assertNotNull(byteBuffer12);
        org.junit.Assert.assertNotNull(doubleBuffer13);
        org.junit.Assert.assertNotNull(shortBuffer14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[]");
        org.junit.Assert.assertNotNull(byteBuffer17);
        org.junit.Assert.assertNotNull(byteBuffer18);
    }

    @Test
    public void test1274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1274");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.isReadOnly();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        java.nio.ByteBuffer byteBuffer5 = java.nio.ByteBuffer.allocate(0);
        boolean boolean6 = byteBuffer5.isReadOnly();
        int int7 = byteBuffer1.compareTo(byteBuffer5);
        java.nio.Buffer buffer8 = byteBuffer5.clear();
        boolean boolean9 = buffer8.isReadOnly();
        java.nio.Buffer buffer10 = buffer8.rewind();
        int int11 = buffer8.position();
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(shortBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(buffer8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(buffer10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1275");
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
        java.lang.String str14 = byteBuffer5.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer17 = byteBuffer5.putShort((int) (byte) 1, (short) -1);
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
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]" + "'", str14, "java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]");
    }

    @Test
    public void test1276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1276");
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
            long long18 = byteBuffer15.getLong((int) '\u0a00');
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
    public void test1277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1277");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer2 = byteBuffer1.asDoubleBuffer();
        boolean boolean3 = byteBuffer1.isDirect();
        java.lang.String str4 = byteBuffer1.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer6 = byteBuffer1.putChar('\u2300');
            org.junit.Assert.fail("Expected exception of type java.nio.BufferOverflowException; message: null");
        } catch (java.nio.BufferOverflowException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(doubleBuffer2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]" + "'", str4, "java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]");
    }

    @Test
    public void test1278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1278");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect((int) '#');
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.putShort((short) 0);
        java.nio.ByteBuffer byteBuffer6 = byteBuffer3.putLong(1, (long) 10);
        java.nio.ByteBuffer byteBuffer9 = byteBuffer3.putShort(0, (short) (byte) 1);
        java.nio.ByteBuffer byteBuffer11 = java.nio.ByteBuffer.allocate((int) (byte) 100);
        java.nio.ByteBuffer byteBuffer13 = java.nio.ByteBuffer.allocate(0);
        boolean boolean14 = byteBuffer13.isReadOnly();
        java.nio.ShortBuffer shortBuffer15 = byteBuffer13.asShortBuffer();
        java.nio.ByteBuffer byteBuffer17 = java.nio.ByteBuffer.allocate(0);
        boolean boolean18 = byteBuffer17.isReadOnly();
        int int19 = byteBuffer13.compareTo(byteBuffer17);
        java.nio.Buffer buffer20 = byteBuffer17.clear();
        java.nio.ByteBuffer byteBuffer22 = java.nio.ByteBuffer.allocate(0);
        boolean boolean23 = byteBuffer22.hasRemaining();
        java.nio.ByteBuffer byteBuffer24 = byteBuffer17.put(byteBuffer22);
        java.nio.ByteBuffer byteBuffer25 = byteBuffer24.compact();
        java.nio.ByteBuffer byteBuffer26 = byteBuffer11.put(byteBuffer25);
        java.nio.ByteBuffer byteBuffer28 = java.nio.ByteBuffer.allocateDirect((int) '#');
        java.nio.ByteBuffer byteBuffer30 = byteBuffer28.putShort((short) 0);
        java.nio.ByteBuffer byteBuffer32 = byteBuffer28.putDouble((double) '\000');
        char char33 = byteBuffer32.getChar();
        java.nio.Buffer buffer34 = byteBuffer32.clear();
        boolean boolean35 = byteBuffer26.equals((java.lang.Object) byteBuffer32);
        int int36 = byteBuffer32.getInt();
        double double38 = byteBuffer32.getDouble((int) (byte) 10);
        boolean boolean39 = byteBuffer3.equals((java.lang.Object) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer42 = byteBuffer3.putFloat(85, 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer6);
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertNotNull(byteBuffer11);
        org.junit.Assert.assertNotNull(byteBuffer13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(shortBuffer15);
        org.junit.Assert.assertNotNull(byteBuffer17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(buffer20);
        org.junit.Assert.assertNotNull(byteBuffer22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(byteBuffer24);
        org.junit.Assert.assertNotNull(byteBuffer25);
        org.junit.Assert.assertNotNull(byteBuffer26);
        org.junit.Assert.assertNotNull(byteBuffer28);
        org.junit.Assert.assertNotNull(byteBuffer30);
        org.junit.Assert.assertNotNull(byteBuffer32);
        org.junit.Assert.assertTrue("'" + char33 + "' != '" + '\000' + "'", char33 == '\000');
        org.junit.Assert.assertNotNull(buffer34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 0.0d + "'", double38 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test1279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1279");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect((int) (byte) 1);
        java.nio.ByteBuffer byteBuffer2 = byteBuffer1.duplicate();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer5 = byteBuffer2.putChar(10, 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteBuffer2);
    }

    @Test
    public void test1280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1280");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean3 = response2.executed;
        response2.statusCode = 0;
        java.lang.String str6 = response2.contentType();
        java.lang.String str8 = response2.cookie("");
        java.nio.ByteBuffer byteBuffer9 = null;
        response2.byteData = byteBuffer9;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response2);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Too many redirects occurred trying to load URL null");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test1281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1281");
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
        java.lang.String str30 = byteBuffer28.toString();
        java.nio.ByteBuffer byteBuffer31 = byteBuffer28.duplicate();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer33 = byteBuffer28.putDouble((double) 0);
            org.junit.Assert.fail("Expected exception of type java.nio.BufferOverflowException; message: null");
        } catch (java.nio.BufferOverflowException e) {
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
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]" + "'", str30, "java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]");
        org.junit.Assert.assertNotNull(byteBuffer31);
    }

    @Test
    public void test1282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1282");
        org.jsoup.helper.HttpConnection.Response.MAX_REDIRECTS = 1;
    }

    @Test
    public void test1283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1283");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.isReadOnly();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        java.nio.ByteBuffer byteBuffer5 = java.nio.ByteBuffer.allocate(0);
        boolean boolean6 = byteBuffer5.isReadOnly();
        int int7 = byteBuffer1.compareTo(byteBuffer5);
        java.nio.ByteBuffer byteBuffer8 = byteBuffer5.compact();
        boolean boolean9 = byteBuffer8.hasRemaining();
        org.jsoup.helper.HttpConnection.Response response10 = null;
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response10);
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response10);
        boolean boolean13 = response12.executed;
        java.lang.String str15 = response12.getHeaderCaseInsensitive("");
        java.lang.String str17 = response12.cookie("java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]");
        int int18 = response12.statusCode();
        org.jsoup.Connection.Response response21 = response12.cookie("hi!", "");
        java.nio.ByteBuffer byteBuffer23 = java.nio.ByteBuffer.allocate(0);
        boolean boolean24 = byteBuffer23.isReadOnly();
        java.nio.ShortBuffer shortBuffer25 = byteBuffer23.asShortBuffer();
        java.nio.ByteBuffer byteBuffer27 = java.nio.ByteBuffer.allocate(0);
        boolean boolean28 = byteBuffer27.isReadOnly();
        int int29 = byteBuffer23.compareTo(byteBuffer27);
        java.nio.DoubleBuffer doubleBuffer30 = byteBuffer27.asDoubleBuffer();
        response12.byteData = byteBuffer27;
        java.nio.ByteOrder byteOrder32 = byteBuffer27.order();
        java.nio.ByteBuffer byteBuffer33 = byteBuffer8.order(byteOrder32);
        java.lang.Class<?> wildcardClass34 = byteBuffer33.getClass();
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(shortBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(byteBuffer8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(response21);
        org.junit.Assert.assertNotNull(byteBuffer23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(shortBuffer25);
        org.junit.Assert.assertNotNull(byteBuffer27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(doubleBuffer30);
        org.junit.Assert.assertNotNull(byteOrder32);
        org.junit.Assert.assertNotNull(byteBuffer33);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test1284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1284");
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
        boolean boolean12 = byteBuffer11.isDirect();
        // The following exception was thrown during execution in test generation
        try {
            double double13 = byteBuffer11.getDouble();
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
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1285");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate((int) ' ');
        java.nio.Buffer buffer2 = byteBuffer1.rewind();
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.compact();
        java.nio.ByteBuffer byteBuffer4 = byteBuffer3.slice();
        java.nio.Buffer buffer6 = byteBuffer3.limit(9);
        java.nio.ByteBuffer byteBuffer7 = byteBuffer3.duplicate();
        java.nio.ByteBuffer byteBuffer9 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer10 = byteBuffer9.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer11 = byteBuffer9.asShortBuffer();
        byte[] byteArray12 = byteBuffer9.array();
        java.nio.ByteBuffer byteBuffer13 = byteBuffer3.get(byteArray12);
        // The following exception was thrown during execution in test generation
        try {
            double double14 = byteBuffer3.getDouble();
            org.junit.Assert.fail("Expected exception of type java.nio.BufferUnderflowException; message: null");
        } catch (java.nio.BufferUnderflowException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(buffer2);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertNotNull(buffer6);
        org.junit.Assert.assertNotNull(byteBuffer7);
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertNotNull(doubleBuffer10);
        org.junit.Assert.assertNotNull(shortBuffer11);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[]");
        org.junit.Assert.assertNotNull(byteBuffer13);
    }

    @Test
    public void test1286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1286");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.executed = false;
        java.lang.String str4 = response1.contentType;
        int int5 = response1.statusCode;
        java.lang.String str6 = response1.charset();
        int int7 = response1.statusCode;
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray8 = response1.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1287");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        response2.executed = false;
        java.lang.String str5 = response2.contentType;
        int int6 = response2.statusCode;
        java.lang.String str7 = response2.charset();
        org.jsoup.Connection.Request request8 = null;
        response2.req = request8;
        java.util.Map<java.lang.String, java.lang.String> strMap10 = response2.headers();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response11 = org.jsoup.helper.HttpConnection.Response.execute(request0, response2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(strMap10);
    }

    @Test
    public void test1288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1288");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int5 = response4.numRedirects;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response4);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Too many redirects occurred trying to load URL null");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test1289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1289");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean3 = response2.executed;
        java.lang.String str5 = response2.getHeaderCaseInsensitive("");
        java.lang.String str7 = response2.cookie("java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]");
        int int8 = response2.statusCode();
        org.jsoup.Connection.Response response11 = response2.cookie("hi!", "");
        int int12 = response2.statusCode();
        int int13 = response2.statusCode();
        java.lang.String str14 = response2.charset();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response2);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Too many redirects occurred trying to load URL null");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test1290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1290");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response1);
        boolean boolean6 = response4.hasHeader("hi!");
        java.lang.String str7 = response4.statusMessage();
        org.jsoup.Connection.Request request8 = null;
        response4.req = request8;
        org.jsoup.Connection.Response response12 = response4.header("java.nio.HeapByteBufferR[pos=0 lim=0 cap=0]", "java.nio.HeapByteBuffer[pos=3 lim=10 cap=10]");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response13 = org.jsoup.helper.HttpConnection.Response.execute(request0, response4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(response12);
    }

    @Test
    public void test1291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1291");
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
            java.nio.ByteBuffer byteBuffer49 = byteBuffer18.putChar(65, '4');
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
    public void test1292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1292");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response7 = response5.removeHeader("java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response5);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Too many redirects occurred trying to load URL null");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response7);
    }

    @Test
    public void test1293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1293");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer2 = byteBuffer1.asDoubleBuffer();
        java.nio.FloatBuffer floatBuffer3 = byteBuffer1.asFloatBuffer();
        boolean boolean4 = byteBuffer1.hasArray();
        java.nio.ByteBuffer byteBuffer5 = byteBuffer1.slice();
        java.nio.ByteBuffer byteBuffer6 = byteBuffer1.slice();
        // The following exception was thrown during execution in test generation
        try {
            int int8 = byteBuffer6.getInt((int) '\000');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(doubleBuffer2);
        org.junit.Assert.assertNotNull(floatBuffer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertNotNull(byteBuffer6);
    }

    @Test
    public void test1294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1294");
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
        java.nio.ByteBuffer byteBuffer14 = byteBuffer12.duplicate();
        java.nio.ByteBuffer byteBuffer15 = byteBuffer12.asReadOnlyBuffer();
        java.nio.Buffer buffer16 = byteBuffer15.flip();
        // The following exception was thrown during execution in test generation
        try {
            double double18 = byteBuffer15.getDouble((int) (short) 0);
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
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(byteBuffer14);
        org.junit.Assert.assertNotNull(byteBuffer15);
        org.junit.Assert.assertNotNull(buffer16);
    }

    @Test
    public void test1295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1295");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            float float2 = byteBuffer1.getFloat();
            org.junit.Assert.fail("Expected exception of type java.nio.BufferUnderflowException; message: null");
        } catch (java.nio.BufferUnderflowException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
    }

    @Test
    public void test1296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1296");
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
        java.nio.Buffer buffer14 = byteBuffer13.clear();
        java.nio.ByteBuffer byteBuffer15 = byteBuffer13.asReadOnlyBuffer();
        java.nio.ByteBuffer byteBuffer16 = byteBuffer13.compact();
        java.nio.ByteBuffer byteBuffer18 = java.nio.ByteBuffer.allocate(0);
        boolean boolean19 = byteBuffer18.isReadOnly();
        java.nio.ShortBuffer shortBuffer20 = byteBuffer18.asShortBuffer();
        java.nio.ByteBuffer byteBuffer22 = java.nio.ByteBuffer.allocate(0);
        boolean boolean23 = byteBuffer22.isReadOnly();
        int int24 = byteBuffer18.compareTo(byteBuffer22);
        java.nio.Buffer buffer26 = byteBuffer18.limit(0);
        byte[] byteArray27 = byteBuffer18.array();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer30 = byteBuffer13.put(byteArray27, 11, 0);
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
        org.junit.Assert.assertNotNull(buffer14);
        org.junit.Assert.assertNotNull(byteBuffer15);
        org.junit.Assert.assertNotNull(byteBuffer16);
        org.junit.Assert.assertNotNull(byteBuffer18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(shortBuffer20);
        org.junit.Assert.assertNotNull(byteBuffer22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(buffer26);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[]");
    }

    @Test
    public void test1297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1297");
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
        java.nio.ByteBuffer byteBuffer30 = response2.byteData;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response31 = new org.jsoup.helper.HttpConnection.Response(response2);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Too many redirects occurred trying to load URL null");
        } catch (java.io.IOException e) {
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
        org.junit.Assert.assertNotNull(byteBuffer30);
    }

    @Test
    public void test1298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1298");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate((int) (byte) 10);
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.nio.ByteBuffer byteBuffer6 = java.nio.ByteBuffer.wrap(byteArray5);
        java.nio.ByteBuffer byteBuffer7 = byteBuffer1.get(byteArray5);
        java.nio.IntBuffer intBuffer8 = byteBuffer7.asIntBuffer();
        java.nio.ByteBuffer byteBuffer9 = byteBuffer7.slice();
        // The following exception was thrown during execution in test generation
        try {
            byte byte11 = byteBuffer7.get((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(byteBuffer6);
        org.junit.Assert.assertNotNull(byteBuffer7);
        org.junit.Assert.assertNotNull(intBuffer8);
        org.junit.Assert.assertNotNull(byteBuffer9);
    }

    @Test
    public void test1299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1299");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.isReadOnly();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        int int4 = byteBuffer1.position();
        boolean boolean5 = byteBuffer1.isReadOnly();
        java.nio.CharBuffer charBuffer6 = byteBuffer1.asCharBuffer();
        boolean boolean7 = byteBuffer1.hasRemaining();
        java.nio.ByteBuffer byteBuffer9 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer10 = byteBuffer9.asDoubleBuffer();
        boolean boolean11 = byteBuffer9.isDirect();
        int int12 = byteBuffer9.arrayOffset();
        java.nio.ByteBuffer byteBuffer13 = byteBuffer9.asReadOnlyBuffer();
        int int14 = byteBuffer1.compareTo(byteBuffer9);
        java.nio.ByteBuffer byteBuffer16 = java.nio.ByteBuffer.allocate((int) ' ');
        int int18 = byteBuffer16.getInt((int) (short) 0);
        java.nio.ByteBuffer byteBuffer21 = byteBuffer16.putShort((int) (byte) 10, (short) 10);
        java.nio.ByteBuffer byteBuffer24 = byteBuffer21.putLong(3, (long) 0);
        java.nio.ByteBuffer byteBuffer26 = java.nio.ByteBuffer.allocate(0);
        boolean boolean27 = byteBuffer26.isReadOnly();
        java.nio.ShortBuffer shortBuffer28 = byteBuffer26.asShortBuffer();
        java.nio.ByteBuffer byteBuffer30 = java.nio.ByteBuffer.allocate(0);
        boolean boolean31 = byteBuffer30.isReadOnly();
        int int32 = byteBuffer26.compareTo(byteBuffer30);
        java.nio.Buffer buffer33 = byteBuffer30.clear();
        java.nio.ByteBuffer byteBuffer35 = java.nio.ByteBuffer.allocate(0);
        boolean boolean36 = byteBuffer35.hasRemaining();
        java.nio.ByteBuffer byteBuffer37 = byteBuffer30.put(byteBuffer35);
        java.nio.ByteBuffer byteBuffer38 = byteBuffer30.slice();
        java.nio.ByteBuffer byteBuffer39 = byteBuffer30.compact();
        java.nio.ByteBuffer byteBuffer40 = byteBuffer39.compact();
        java.nio.ByteBuffer byteBuffer42 = java.nio.ByteBuffer.allocate((int) (byte) 10);
        byte[] byteArray46 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.nio.ByteBuffer byteBuffer47 = java.nio.ByteBuffer.wrap(byteArray46);
        java.nio.ByteBuffer byteBuffer48 = byteBuffer42.get(byteArray46);
        java.nio.Buffer buffer49 = byteBuffer42.rewind();
        java.nio.ByteOrder byteOrder50 = byteBuffer42.order();
        java.nio.ByteBuffer byteBuffer51 = byteBuffer39.order(byteOrder50);
        java.nio.ByteBuffer byteBuffer52 = byteBuffer21.order(byteOrder50);
        java.nio.ByteBuffer byteBuffer53 = byteBuffer9.order(byteOrder50);
        java.nio.ByteBuffer byteBuffer55 = java.nio.ByteBuffer.allocateDirect((int) '#');
        java.nio.ByteBuffer byteBuffer58 = byteBuffer55.putShort((int) (short) 1, (short) (byte) 10);
        char char60 = byteBuffer55.getChar(31);
        long long61 = byteBuffer55.getLong();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer62 = byteBuffer9.put(byteBuffer55);
            org.junit.Assert.fail("Expected exception of type java.nio.BufferOverflowException; message: null");
        } catch (java.nio.BufferOverflowException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(shortBuffer3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(charBuffer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertNotNull(doubleBuffer10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(byteBuffer13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(byteBuffer16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(byteBuffer21);
        org.junit.Assert.assertNotNull(byteBuffer24);
        org.junit.Assert.assertNotNull(byteBuffer26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(shortBuffer28);
        org.junit.Assert.assertNotNull(byteBuffer30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(buffer33);
        org.junit.Assert.assertNotNull(byteBuffer35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(byteBuffer37);
        org.junit.Assert.assertNotNull(byteBuffer38);
        org.junit.Assert.assertNotNull(byteBuffer39);
        org.junit.Assert.assertNotNull(byteBuffer40);
        org.junit.Assert.assertNotNull(byteBuffer42);
        org.junit.Assert.assertNotNull(byteArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray46), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(byteBuffer47);
        org.junit.Assert.assertNotNull(byteBuffer48);
        org.junit.Assert.assertNotNull(buffer49);
        org.junit.Assert.assertNotNull(byteOrder50);
        org.junit.Assert.assertNotNull(byteBuffer51);
        org.junit.Assert.assertNotNull(byteBuffer52);
        org.junit.Assert.assertNotNull(byteBuffer53);
        org.junit.Assert.assertNotNull(byteBuffer55);
        org.junit.Assert.assertNotNull(byteBuffer58);
        org.junit.Assert.assertTrue("'" + char60 + "' != '" + '\000' + "'", char60 == '\000');
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + 10995116277760L + "'", long61 == 10995116277760L);
    }

    @Test
    public void test1300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1300");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect((int) '#');
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.putShort((short) 0);
        java.nio.ByteBuffer byteBuffer5 = byteBuffer1.putDouble((double) '\000');
        char char6 = byteBuffer5.getChar();
        java.nio.Buffer buffer7 = byteBuffer5.clear();
        java.nio.ByteBuffer byteBuffer10 = byteBuffer5.putFloat((int) '\000', (float) 10);
        java.nio.ByteBuffer byteBuffer12 = byteBuffer5.putLong(0L);
        java.nio.Buffer buffer13 = byteBuffer5.flip();
        boolean boolean14 = byteBuffer5.isDirect();
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '\000' + "'", char6 == '\000');
        org.junit.Assert.assertNotNull(buffer7);
        org.junit.Assert.assertNotNull(byteBuffer10);
        org.junit.Assert.assertNotNull(byteBuffer12);
        org.junit.Assert.assertNotNull(buffer13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1301");
        byte[] byteArray0 = new byte[] {};
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.wrap(byteArray0);
        java.nio.Buffer buffer2 = byteBuffer1.flip();
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.asReadOnlyBuffer();
        java.nio.ByteBuffer byteBuffer4 = byteBuffer1.duplicate();
        java.nio.DoubleBuffer doubleBuffer5 = byteBuffer1.asDoubleBuffer();
        java.nio.CharBuffer charBuffer6 = byteBuffer1.asCharBuffer();
        java.nio.DoubleBuffer doubleBuffer7 = byteBuffer1.asDoubleBuffer();
        java.nio.ByteBuffer byteBuffer9 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer10 = byteBuffer9.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer11 = byteBuffer9.asShortBuffer();
        java.nio.ByteOrder byteOrder12 = null;
        java.nio.ByteBuffer byteBuffer13 = byteBuffer9.order(byteOrder12);
        java.nio.ByteBuffer byteBuffer14 = byteBuffer13.asReadOnlyBuffer();
        java.nio.Buffer buffer16 = byteBuffer13.position((int) (byte) 0);
        java.nio.ByteBuffer byteBuffer18 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer19 = byteBuffer18.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer20 = byteBuffer18.asShortBuffer();
        byte[] byteArray21 = byteBuffer18.array();
        java.nio.ByteBuffer byteBuffer22 = byteBuffer13.get(byteArray21);
        java.nio.ByteBuffer byteBuffer23 = byteBuffer1.put(byteArray21);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = byteBuffer23.getInt();
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
        org.junit.Assert.assertNotNull(doubleBuffer7);
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertNotNull(doubleBuffer10);
        org.junit.Assert.assertNotNull(shortBuffer11);
        org.junit.Assert.assertNotNull(byteBuffer13);
        org.junit.Assert.assertNotNull(byteBuffer14);
        org.junit.Assert.assertNotNull(buffer16);
        org.junit.Assert.assertNotNull(byteBuffer18);
        org.junit.Assert.assertNotNull(doubleBuffer19);
        org.junit.Assert.assertNotNull(shortBuffer20);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[]");
        org.junit.Assert.assertNotNull(byteBuffer22);
        org.junit.Assert.assertNotNull(byteBuffer23);
    }

    @Test
    public void test1302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1302");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.header("");
        org.jsoup.Connection.Response response5 = response1.removeCookie("hi!");
        java.lang.String str7 = response1.cookie("");
        java.lang.String str8 = response1.statusMessage();
        int int9 = response1.statusCode;
        int int10 = response1.statusCode;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response1);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Too many redirects occurred trying to load URL null");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1303");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.isReadOnly();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        int int4 = byteBuffer1.position();
        java.nio.ByteOrder byteOrder5 = null;
        java.nio.ByteBuffer byteBuffer6 = byteBuffer1.order(byteOrder5);
        java.nio.ByteBuffer byteBuffer7 = byteBuffer1.asReadOnlyBuffer();
        int int8 = byteBuffer7.capacity();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.Buffer buffer10 = byteBuffer7.limit(1677787392);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(shortBuffer3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(byteBuffer6);
        org.junit.Assert.assertNotNull(byteBuffer7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1304");
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
        java.nio.ByteBuffer byteBuffer24 = byteBuffer22.putShort((short) 0);
        java.lang.Class<?> wildcardClass25 = byteBuffer22.getClass();
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
        org.junit.Assert.assertNotNull(byteBuffer24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1305");
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
        java.nio.ByteBuffer byteBuffer13 = byteBuffer5.duplicate();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer16 = byteBuffer13.put(7, (byte) 0);
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
    }

    @Test
    public void test1306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1306");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.nio.ByteBuffer byteBuffer5 = response4.byteData;
        org.jsoup.Connection.Response response7 = response4.removeCookie("");
        java.lang.String str8 = response4.contentType;
        org.junit.Assert.assertNull(byteBuffer5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test1307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1307");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request3 = response2.req;
        org.jsoup.Connection.Method method4 = response2.method();
        java.lang.String str6 = response2.getHeaderCaseInsensitive("java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response2);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Too many redirects occurred trying to load URL null");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(request3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test1308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1308");
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
        java.nio.FloatBuffer floatBuffer25 = byteBuffer24.asFloatBuffer();
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
        org.junit.Assert.assertNotNull(floatBuffer25);
    }

    @Test
    public void test1309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1309");
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
        // The following exception was thrown during execution in test generation
        try {
            java.nio.Buffer buffer23 = byteBuffer22.reset();
            org.junit.Assert.fail("Expected exception of type java.nio.InvalidMarkException; message: null");
        } catch (java.nio.InvalidMarkException e) {
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
    }

    @Test
    public void test1310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1310");
        org.jsoup.helper.HttpConnection.Response.MAX_REDIRECTS = (short) 13312;
    }

    @Test
    public void test1311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1311");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect((int) '#');
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.putShort((short) 0);
        java.nio.ByteBuffer byteBuffer6 = byteBuffer3.putLong(1, (long) 10);
        java.nio.ByteBuffer byteBuffer9 = byteBuffer3.putShort(0, (short) (byte) 1);
        java.nio.ByteBuffer byteBuffer11 = java.nio.ByteBuffer.allocate((int) (byte) 100);
        java.nio.ByteBuffer byteBuffer13 = java.nio.ByteBuffer.allocate(0);
        boolean boolean14 = byteBuffer13.isReadOnly();
        java.nio.ShortBuffer shortBuffer15 = byteBuffer13.asShortBuffer();
        java.nio.ByteBuffer byteBuffer17 = java.nio.ByteBuffer.allocate(0);
        boolean boolean18 = byteBuffer17.isReadOnly();
        int int19 = byteBuffer13.compareTo(byteBuffer17);
        java.nio.Buffer buffer20 = byteBuffer17.clear();
        java.nio.ByteBuffer byteBuffer22 = java.nio.ByteBuffer.allocate(0);
        boolean boolean23 = byteBuffer22.hasRemaining();
        java.nio.ByteBuffer byteBuffer24 = byteBuffer17.put(byteBuffer22);
        java.nio.ByteBuffer byteBuffer25 = byteBuffer24.compact();
        java.nio.ByteBuffer byteBuffer26 = byteBuffer11.put(byteBuffer25);
        java.nio.ByteBuffer byteBuffer28 = java.nio.ByteBuffer.allocateDirect((int) '#');
        java.nio.ByteBuffer byteBuffer30 = byteBuffer28.putShort((short) 0);
        java.nio.ByteBuffer byteBuffer32 = byteBuffer28.putDouble((double) '\000');
        char char33 = byteBuffer32.getChar();
        java.nio.Buffer buffer34 = byteBuffer32.clear();
        boolean boolean35 = byteBuffer26.equals((java.lang.Object) byteBuffer32);
        int int36 = byteBuffer32.getInt();
        double double38 = byteBuffer32.getDouble((int) (byte) 10);
        boolean boolean39 = byteBuffer3.equals((java.lang.Object) (byte) 10);
        java.nio.ByteBuffer byteBuffer41 = java.nio.ByteBuffer.allocate((int) (byte) 10);
        byte[] byteArray45 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.nio.ByteBuffer byteBuffer46 = java.nio.ByteBuffer.wrap(byteArray45);
        java.nio.ByteBuffer byteBuffer47 = byteBuffer41.get(byteArray45);
        java.nio.Buffer buffer48 = byteBuffer41.rewind();
        java.nio.ByteOrder byteOrder49 = byteBuffer41.order();
        boolean boolean50 = byteBuffer41.hasRemaining();
        byte[] byteArray53 = new byte[] { (byte) 10, (byte) 1 };
        java.nio.ByteBuffer byteBuffer54 = byteBuffer41.put(byteArray53);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer57 = byteBuffer3.get(byteArray53, 0, (int) (short) 13312);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer6);
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertNotNull(byteBuffer11);
        org.junit.Assert.assertNotNull(byteBuffer13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(shortBuffer15);
        org.junit.Assert.assertNotNull(byteBuffer17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(buffer20);
        org.junit.Assert.assertNotNull(byteBuffer22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(byteBuffer24);
        org.junit.Assert.assertNotNull(byteBuffer25);
        org.junit.Assert.assertNotNull(byteBuffer26);
        org.junit.Assert.assertNotNull(byteBuffer28);
        org.junit.Assert.assertNotNull(byteBuffer30);
        org.junit.Assert.assertNotNull(byteBuffer32);
        org.junit.Assert.assertTrue("'" + char33 + "' != '" + '\000' + "'", char33 == '\000');
        org.junit.Assert.assertNotNull(buffer34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 0.0d + "'", double38 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(byteBuffer41);
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray45), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(byteBuffer46);
        org.junit.Assert.assertNotNull(byteBuffer47);
        org.junit.Assert.assertNotNull(buffer48);
        org.junit.Assert.assertNotNull(byteOrder49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(byteArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray53), "[10, 1]");
        org.junit.Assert.assertNotNull(byteBuffer54);
    }

    @Test
    public void test1312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1312");
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
        int int17 = byteBuffer16.limit();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer20 = byteBuffer16.putInt((int) (short) -1, 1677787392);
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
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test1313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1313");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.header("");
        org.jsoup.Connection.Response response5 = response1.removeCookie("hi!");
        java.lang.String str7 = response1.cookie("");
        java.lang.String str8 = response1.statusMessage();
        int int9 = response1.statusCode;
        java.util.Map<java.lang.String, java.lang.String> strMap10 = response1.headers();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document11 = response1.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(strMap10);
    }

    @Test
    public void test1314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1314");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.header("");
        org.jsoup.Connection.Response response5 = response1.removeCookie("hi!");
        java.lang.String str7 = response1.cookie("");
        java.lang.String str8 = response1.statusMessage();
        int int9 = response1.statusCode;
        java.util.Map<java.lang.String, java.lang.String> strMap10 = response1.headers();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry12 = response1.scanHeaders("");
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response1);
        int int14 = response1.numRedirects;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNull(strEntry12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test1315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1315");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.isReadOnly();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        java.nio.ByteBuffer byteBuffer4 = byteBuffer1.duplicate();
        java.nio.DoubleBuffer doubleBuffer5 = byteBuffer1.asDoubleBuffer();
        int int6 = doubleBuffer5.limit();
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(shortBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertNotNull(doubleBuffer5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test1316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1316");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer2 = byteBuffer1.asDoubleBuffer();
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.compact();
        java.nio.ByteBuffer byteBuffer4 = byteBuffer1.asReadOnlyBuffer();
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(doubleBuffer2);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer4);
    }

    @Test
    public void test1317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1317");
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
            java.nio.ByteBuffer byteBuffer21 = byteBuffer7.putDouble(85, (double) '4');
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
    public void test1318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1318");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.nio.ByteBuffer byteBuffer5 = response4.byteData;
        org.jsoup.Connection.Response response8 = response4.cookie("hi!", "");
        boolean boolean9 = response4.executed;
        java.lang.String str10 = response4.charset();
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response4);
        java.lang.String str12 = response11.charset;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response13 = org.jsoup.helper.HttpConnection.Response.execute(request0, response11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(byteBuffer5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test1319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1319");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer2 = byteBuffer1.asDoubleBuffer();
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.compact();
        // The following exception was thrown during execution in test generation
        try {
            char char4 = byteBuffer3.getChar();
            org.junit.Assert.fail("Expected exception of type java.nio.BufferUnderflowException; message: null");
        } catch (java.nio.BufferUnderflowException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(doubleBuffer2);
        org.junit.Assert.assertNotNull(byteBuffer3);
    }

    @Test
    public void test1320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1320");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect((int) '#');
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.putShort((short) 0);
        java.nio.ByteOrder byteOrder4 = byteBuffer3.order();
        java.nio.ByteBuffer byteBuffer7 = byteBuffer3.put(0, (byte) 0);
        java.nio.ByteBuffer byteBuffer9 = byteBuffer3.putChar('4');
        java.lang.String str10 = byteBuffer9.toString();
        boolean boolean11 = byteBuffer9.isReadOnly();
        double double12 = byteBuffer9.getDouble();
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertNotNull(byteOrder4);
        org.junit.Assert.assertNotNull(byteBuffer7);
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "java.nio.DirectByteBuffer[pos=4 lim=35 cap=35]" + "'", str10, "java.nio.DirectByteBuffer[pos=4 lim=35 cap=35]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test1321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1321");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.isReadOnly();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        java.nio.ByteBuffer byteBuffer5 = java.nio.ByteBuffer.allocate(0);
        boolean boolean6 = byteBuffer5.isReadOnly();
        int int7 = byteBuffer1.compareTo(byteBuffer5);
        java.nio.DoubleBuffer doubleBuffer8 = byteBuffer5.asDoubleBuffer();
        java.nio.FloatBuffer floatBuffer9 = byteBuffer5.asFloatBuffer();
        java.lang.String str10 = byteBuffer5.toString();
        java.nio.Buffer buffer11 = byteBuffer5.rewind();
        boolean boolean12 = byteBuffer5.isDirect();
        java.nio.ByteBuffer byteBuffer14 = java.nio.ByteBuffer.allocate((int) (byte) 10);
        byte[] byteArray18 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.nio.ByteBuffer byteBuffer19 = java.nio.ByteBuffer.wrap(byteArray18);
        java.nio.ByteBuffer byteBuffer20 = byteBuffer14.get(byteArray18);
        java.nio.Buffer buffer21 = byteBuffer14.rewind();
        int int22 = byteBuffer14.position();
        java.nio.Buffer buffer23 = byteBuffer14.rewind();
        java.nio.ByteBuffer byteBuffer24 = byteBuffer14.slice();
        java.nio.ByteOrder byteOrder25 = byteBuffer14.order();
        java.nio.ByteBuffer byteBuffer26 = byteBuffer5.order(byteOrder25);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer29 = byteBuffer5.putChar(13, ' ');
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
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]" + "'", str10, "java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]");
        org.junit.Assert.assertNotNull(buffer11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(byteBuffer14);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(byteBuffer19);
        org.junit.Assert.assertNotNull(byteBuffer20);
        org.junit.Assert.assertNotNull(buffer21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(buffer23);
        org.junit.Assert.assertNotNull(byteBuffer24);
        org.junit.Assert.assertNotNull(byteOrder25);
        org.junit.Assert.assertNotNull(byteBuffer26);
    }

    @Test
    public void test1322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1322");
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
        java.util.Map<java.lang.String, java.lang.String> strMap19 = response5.cookies();
        org.junit.Assert.assertNotNull(byteBuffer7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(byteBuffer13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(shortBuffer15);
        org.junit.Assert.assertNotNull(byteBuffer16);
        org.junit.Assert.assertNotNull(strMap19);
    }

    @Test
    public void test1323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1323");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = response12.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertNull(strEntry11);
    }

    @Test
    public void test1324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1324");
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
        java.nio.FloatBuffer floatBuffer17 = byteBuffer10.asFloatBuffer();
        // The following exception was thrown during execution in test generation
        try {
            int int18 = byteBuffer10.getInt();
            org.junit.Assert.fail("Expected exception of type java.nio.BufferUnderflowException; message: null");
        } catch (java.nio.BufferUnderflowException e) {
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
        org.junit.Assert.assertNotNull(floatBuffer17);
    }

    @Test
    public void test1325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1325");
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
        // The following exception was thrown during execution in test generation
        try {
            byte byte34 = byteBuffer30.get((int) (byte) 100);
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
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 31 + "'", int28 == 31);
        org.junit.Assert.assertNotNull(byteBuffer30);
        org.junit.Assert.assertNotNull(longBuffer31);
        org.junit.Assert.assertNotNull(byteOrder32);
    }

    @Test
    public void test1326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1326");
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
        java.net.URL uRL16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response17 = response15.url(uRL16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertNull(strEntry11);
        org.junit.Assert.assertNull(uRL13);
    }

    @Test
    public void test1327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1327");
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
        java.nio.ByteOrder byteOrder26 = byteBuffer16.order();
        java.nio.ByteBuffer byteBuffer28 = java.nio.ByteBuffer.allocate((int) (byte) 100);
        java.nio.ByteBuffer byteBuffer30 = byteBuffer28.putDouble((double) '4');
        byte[] byteArray36 = new byte[] { (byte) 1, (byte) 100, (byte) -1, (byte) 10, (byte) -1 };
        java.nio.ByteBuffer byteBuffer37 = byteBuffer28.put(byteArray36);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer40 = byteBuffer16.put(byteArray36, 10, 10);
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
        org.junit.Assert.assertNotNull(byteOrder26);
        org.junit.Assert.assertNotNull(byteBuffer28);
        org.junit.Assert.assertNotNull(byteBuffer30);
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray36), "[1, 100, -1, 10, -1]");
        org.junit.Assert.assertNotNull(byteBuffer37);
    }

    @Test
    public void test1328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1328");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate((int) (byte) 10);
        int int2 = byteBuffer1.getInt();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer5 = byteBuffer1.putChar((int) '\u0a00', ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1329");
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
        java.lang.String str20 = response5.charset;
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
    public void test1330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1330");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.isReadOnly();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        int int4 = byteBuffer1.position();
        int int5 = byteBuffer1.arrayOffset();
        int int6 = byteBuffer1.limit();
        // The following exception was thrown during execution in test generation
        try {
            char char7 = byteBuffer1.getChar();
            org.junit.Assert.fail("Expected exception of type java.nio.BufferUnderflowException; message: null");
        } catch (java.nio.BufferUnderflowException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(shortBuffer3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test1331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1331");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.nio.ByteBuffer byteBuffer5 = response4.byteData;
        org.jsoup.Connection.Response response8 = response4.cookie("hi!", "");
        java.net.URL uRL9 = response4.url();
        response4.charset = "";
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response4);
        org.jsoup.Connection.Method method13 = response12.method();
        java.nio.ByteBuffer byteBuffer15 = java.nio.ByteBuffer.allocate(0);
        boolean boolean16 = byteBuffer15.isReadOnly();
        java.nio.ShortBuffer shortBuffer17 = byteBuffer15.asShortBuffer();
        int int18 = byteBuffer15.position();
        java.nio.ByteOrder byteOrder19 = null;
        java.nio.ByteBuffer byteBuffer20 = byteBuffer15.order(byteOrder19);
        response12.byteData = byteBuffer20;
        org.jsoup.helper.HttpConnection.Response response22 = new org.jsoup.helper.HttpConnection.Response(response12);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response23 = org.jsoup.helper.HttpConnection.Response.execute(request0, response22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(byteBuffer5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertNull(method13);
        org.junit.Assert.assertNotNull(byteBuffer15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(shortBuffer17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(byteBuffer20);
    }

    @Test
    public void test1332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1332");
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
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer18 = byteBuffer8.putShort(65, (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
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
    }

    @Test
    public void test1333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1333");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect((int) '#');
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.putShort((short) 0);
        java.nio.ByteBuffer byteBuffer6 = byteBuffer3.putShort(0, (short) (byte) 10);
        java.nio.Buffer buffer7 = byteBuffer6.clear();
        java.nio.ByteOrder byteOrder8 = byteBuffer6.order();
        java.nio.ByteBuffer byteBuffer11 = byteBuffer6.putChar(1, 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer14 = byteBuffer11.putChar(93, ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer6);
        org.junit.Assert.assertNotNull(buffer7);
        org.junit.Assert.assertNotNull(byteOrder8);
        org.junit.Assert.assertNotNull(byteBuffer11);
    }

    @Test
    public void test1334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1334");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.header("");
        response1.executed = true;
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test1335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1335");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.header("");
        boolean boolean5 = response1.hasCookie("");
        response1.statusMessage = "hi!";
        java.lang.Class<?> wildcardClass8 = response1.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1336");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.isReadOnly();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        java.nio.ByteBuffer byteBuffer4 = byteBuffer1.duplicate();
        java.nio.ByteBuffer byteBuffer5 = byteBuffer1.asReadOnlyBuffer();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.Buffer buffer7 = byteBuffer1.position((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: newPosition > limit: (32 > 0)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(shortBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertNotNull(byteBuffer5);
    }

    @Test
    public void test1337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1337");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.ByteBuffer byteBuffer2 = byteBuffer1.slice();
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.compact();
        // The following exception was thrown during execution in test generation
        try {
            float float4 = byteBuffer3.getFloat();
            org.junit.Assert.fail("Expected exception of type java.nio.BufferUnderflowException; message: null");
        } catch (java.nio.BufferUnderflowException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteBuffer2);
        org.junit.Assert.assertNotNull(byteBuffer3);
    }

    @Test
    public void test1338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1338");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document15 = response14.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(byteBuffer4);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(uRL10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test1339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1339");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.isReadOnly();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        int int4 = byteBuffer1.position();
        boolean boolean5 = byteBuffer1.isReadOnly();
        java.nio.CharBuffer charBuffer6 = byteBuffer1.asCharBuffer();
        java.nio.ShortBuffer shortBuffer7 = byteBuffer1.asShortBuffer();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer10 = byteBuffer1.putLong(1677787392, (long) (-10));
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
        org.junit.Assert.assertNotNull(shortBuffer7);
    }

    @Test
    public void test1340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1340");
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
        java.nio.ByteBuffer byteBuffer19 = byteBuffer1.putDouble(1, (double) (byte) 0);
        java.nio.FloatBuffer floatBuffer20 = byteBuffer19.asFloatBuffer();
        java.nio.ByteBuffer byteBuffer23 = byteBuffer19.putLong(35, (long) (-10));
        // The following exception was thrown during execution in test generation
        try {
            java.nio.Buffer buffer25 = byteBuffer23.position((int) '\u0a00');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: newPosition > limit: (2560 > 100)");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertNotNull(byteBuffer19);
        org.junit.Assert.assertNotNull(floatBuffer20);
        org.junit.Assert.assertNotNull(byteBuffer23);
    }

    @Test
    public void test1341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1341");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.isReadOnly();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        int int4 = byteBuffer1.position();
        java.nio.ByteOrder byteOrder5 = null;
        java.nio.ByteBuffer byteBuffer6 = byteBuffer1.order(byteOrder5);
        java.lang.String str7 = byteBuffer6.toString();
        java.nio.ByteBuffer byteBuffer8 = byteBuffer6.slice();
        java.nio.ShortBuffer shortBuffer9 = byteBuffer6.asShortBuffer();
        // The following exception was thrown during execution in test generation
        try {
            short short11 = byteBuffer6.getShort((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
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
    }

    @Test
    public void test1342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1342");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer2 = byteBuffer1.asDoubleBuffer();
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.compact();
        java.lang.String str4 = byteBuffer1.toString();
        java.nio.LongBuffer longBuffer5 = byteBuffer1.asLongBuffer();
        boolean boolean6 = longBuffer5.isReadOnly();
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(doubleBuffer2);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]" + "'", str4, "java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]");
        org.junit.Assert.assertNotNull(longBuffer5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1343");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.nio.ByteBuffer byteBuffer5 = response4.byteData;
        org.jsoup.Connection.Response response8 = response4.cookie("hi!", "");
        java.net.URL uRL9 = response4.url();
        java.lang.String str11 = response4.getHeaderCaseInsensitive("hi!");
        org.jsoup.Connection.Method method12 = response4.method();
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response4);
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response13);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response15 = org.jsoup.helper.HttpConnection.Response.execute(request0, response14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(byteBuffer5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(method12);
    }

    @Test
    public void test1344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1344");
        byte[] byteArray0 = new byte[] {};
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.wrap(byteArray0);
        java.nio.Buffer buffer2 = byteBuffer1.flip();
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.asReadOnlyBuffer();
        java.nio.ByteBuffer byteBuffer4 = byteBuffer1.duplicate();
        java.nio.DoubleBuffer doubleBuffer5 = byteBuffer1.asDoubleBuffer();
        java.nio.CharBuffer charBuffer6 = byteBuffer1.asCharBuffer();
        // The following exception was thrown during execution in test generation
        try {
            byte byte7 = byteBuffer1.get();
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
    public void test1345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1345");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str6 = response4.cookie("hi!");
        int int7 = response4.statusCode;
        org.jsoup.Connection.Response response9 = response4.removeCookie("java.nio.HeapByteBuffer[pos=0 lim=32 cap=32]");
        int int10 = response4.statusCode;
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1346");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request3 = response2.req;
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response2);
        java.lang.String str5 = response4.contentType;
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response4);
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response4);
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response7);
        response7.charset = "java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]";
        org.junit.Assert.assertNull(request3);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test1347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1347");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate((int) ' ');
        int int3 = byteBuffer1.getInt((int) (short) 0);
        long long4 = byteBuffer1.getLong();
        java.nio.ByteBuffer byteBuffer7 = byteBuffer1.put(0, (byte) 0);
        java.nio.Buffer buffer8 = byteBuffer7.flip();
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(byteBuffer7);
        org.junit.Assert.assertNotNull(buffer8);
    }

    @Test
    public void test1348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1348");
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
        response10.executed = true;
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test1349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1349");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.nio.ByteBuffer byteBuffer4 = response3.byteData;
        org.jsoup.Connection.Response response7 = response3.cookie("hi!", "");
        java.net.URL uRL8 = response3.url();
        response3.charset = "";
        response3.executed = false;
        org.jsoup.Connection.Request request13 = null;
        response3.req = request13;
        java.lang.String str15 = response3.contentType();
        org.junit.Assert.assertNull(byteBuffer4);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(uRL8);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test1350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1350");
        byte[] byteArray0 = new byte[] {};
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.wrap(byteArray0);
        java.nio.Buffer buffer2 = byteBuffer1.flip();
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.asReadOnlyBuffer();
        java.nio.ByteBuffer byteBuffer4 = byteBuffer1.duplicate();
        java.nio.DoubleBuffer doubleBuffer5 = byteBuffer1.asDoubleBuffer();
        java.nio.CharBuffer charBuffer6 = byteBuffer1.asCharBuffer();
        java.nio.DoubleBuffer doubleBuffer7 = byteBuffer1.asDoubleBuffer();
        java.nio.ByteBuffer byteBuffer9 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer10 = byteBuffer9.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer11 = byteBuffer9.asShortBuffer();
        java.nio.ByteOrder byteOrder12 = null;
        java.nio.ByteBuffer byteBuffer13 = byteBuffer9.order(byteOrder12);
        java.nio.ByteBuffer byteBuffer14 = byteBuffer13.asReadOnlyBuffer();
        java.nio.Buffer buffer16 = byteBuffer13.position((int) (byte) 0);
        java.nio.ByteBuffer byteBuffer18 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer19 = byteBuffer18.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer20 = byteBuffer18.asShortBuffer();
        byte[] byteArray21 = byteBuffer18.array();
        java.nio.ByteBuffer byteBuffer22 = byteBuffer13.get(byteArray21);
        java.nio.ByteBuffer byteBuffer23 = byteBuffer1.put(byteArray21);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer26 = byteBuffer1.put(31, (byte) 100);
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
        org.junit.Assert.assertNotNull(charBuffer6);
        org.junit.Assert.assertNotNull(doubleBuffer7);
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertNotNull(doubleBuffer10);
        org.junit.Assert.assertNotNull(shortBuffer11);
        org.junit.Assert.assertNotNull(byteBuffer13);
        org.junit.Assert.assertNotNull(byteBuffer14);
        org.junit.Assert.assertNotNull(buffer16);
        org.junit.Assert.assertNotNull(byteBuffer18);
        org.junit.Assert.assertNotNull(doubleBuffer19);
        org.junit.Assert.assertNotNull(shortBuffer20);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[]");
        org.junit.Assert.assertNotNull(byteBuffer22);
        org.junit.Assert.assertNotNull(byteBuffer23);
    }

    @Test
    public void test1351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1351");
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
        boolean boolean31 = buffer30.isReadOnly();
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
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test1352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1352");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request3 = response2.req;
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response2);
        java.lang.String str5 = response4.contentType;
        boolean boolean7 = response4.hasHeader("hi!");
        java.lang.String str8 = response4.contentType();
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray9 = response4.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(request3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test1353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1353");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map<java.lang.String, java.lang.String> strMap2 = response1.headers();
        int int3 = response1.statusCode();
        java.util.Map<java.lang.String, java.lang.String> strMap4 = response1.cookies();
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response1);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray6 = response1.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(strMap4);
    }

    @Test
    public void test1354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1354");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean5 = response3.hasHeader("hi!");
        response3.contentType = "java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]";
        org.jsoup.Connection.Response response9 = response3.removeHeader("java.nio.HeapByteBuffer[pos=16 lim=100 cap=100]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(response9);
    }

    @Test
    public void test1355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1355");
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
        boolean boolean22 = byteBuffer18.hasRemaining();
        java.lang.Class<?> wildcardClass23 = byteBuffer18.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1356");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request3 = response2.req;
        org.jsoup.Connection.Method method4 = response2.method();
        java.lang.String str5 = response2.statusMessage();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response2);
        response2.statusCode = 70;
        org.junit.Assert.assertNull(request3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test1357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1357");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate((int) (byte) 10);
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.nio.ByteBuffer byteBuffer6 = java.nio.ByteBuffer.wrap(byteArray5);
        java.nio.ByteBuffer byteBuffer7 = byteBuffer1.get(byteArray5);
        java.nio.ByteBuffer byteBuffer9 = java.nio.ByteBuffer.allocate((int) (byte) 10);
        byte[] byteArray13 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.nio.ByteBuffer byteBuffer14 = java.nio.ByteBuffer.wrap(byteArray13);
        java.nio.ByteBuffer byteBuffer15 = byteBuffer9.get(byteArray13);
        byte[] byteArray16 = byteBuffer15.array();
        boolean boolean17 = byteBuffer15.isDirect();
        byte[] byteArray18 = byteBuffer15.array();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer19 = byteBuffer7.get(byteArray18);
            org.junit.Assert.fail("Expected exception of type java.nio.BufferUnderflowException; message: null");
        } catch (java.nio.BufferUnderflowException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(byteBuffer6);
        org.junit.Assert.assertNotNull(byteBuffer7);
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(byteBuffer14);
        org.junit.Assert.assertNotNull(byteBuffer15);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test1358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1358");
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
        boolean boolean12 = response10.hasHeader("java.nio.HeapByteBuffer[pos=0 lim=32 cap=32]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1359");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response1);
        boolean boolean4 = response3.executed;
        java.lang.String str6 = response3.getHeaderCaseInsensitive("");
        java.lang.String str8 = response3.cookie("java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]");
        java.lang.String str9 = response3.contentType;
        java.nio.ByteBuffer byteBuffer11 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer12 = byteBuffer11.asDoubleBuffer();
        java.nio.ByteBuffer byteBuffer13 = byteBuffer11.compact();
        java.lang.String str14 = byteBuffer11.toString();
        int int15 = byteBuffer11.arrayOffset();
        java.nio.FloatBuffer floatBuffer16 = byteBuffer11.asFloatBuffer();
        response3.byteData = byteBuffer11;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response18 = org.jsoup.helper.HttpConnection.Response.execute(request0, response3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(byteBuffer11);
        org.junit.Assert.assertNotNull(doubleBuffer12);
        org.junit.Assert.assertNotNull(byteBuffer13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]" + "'", str14, "java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(floatBuffer16);
    }

    @Test
    public void test1360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1360");
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
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response2);
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response(response2);
        org.jsoup.Connection.Response response21 = response2.header("java.nio.HeapByteBuffer[pos=0 lim=32 cap=32]", "java.nio.DirectByteBuffer[pos=8 lim=35 cap=35]");
        org.junit.Assert.assertNull(request3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(response21);
    }

    @Test
    public void test1361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1361");
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
        org.jsoup.Connection.Method method16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response17 = response12.method(method16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(byteBuffer4);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(uRL10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(strMap15);
    }

    @Test
    public void test1362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1362");
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
        org.jsoup.Connection.Method method10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response11 = response5.method(method10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test1363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1363");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.header("");
        response1.charset = "hi!";
        org.jsoup.Connection.Method method6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response7 = response1.method(method6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test1364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1364");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request3 = response2.req;
        org.jsoup.Connection.Method method4 = response2.method();
        java.lang.String str5 = response2.contentType;
        boolean boolean7 = response2.hasCookie("");
        response2.charset = "hi!";
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response2);
        java.net.URL uRL11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response12 = response2.url(uRL11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(request3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1365");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str4 = response2.header("");
        org.jsoup.Connection.Response response6 = response2.removeCookie("hi!");
        java.lang.String str8 = response2.cookie("");
        java.lang.String str9 = response2.statusMessage();
        int int10 = response2.statusCode();
        response2.contentType = "java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]";
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response2);
        java.lang.String str14 = response2.charset();
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
    public void test1366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1366");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.header("");
        org.jsoup.Connection.Response response5 = response1.removeCookie("hi!");
        java.lang.String str7 = response1.cookie("");
        java.lang.String str8 = response1.statusMessage();
        int int9 = response1.statusCode;
        int int10 = response1.statusCode;
        java.lang.String str11 = response1.charset();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test1367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1367");
        byte[] byteArray0 = new byte[] {};
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.wrap(byteArray0);
        java.nio.Buffer buffer2 = byteBuffer1.flip();
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.asReadOnlyBuffer();
        java.lang.String str4 = byteBuffer1.toString();
        java.nio.ByteBuffer byteBuffer6 = java.nio.ByteBuffer.allocate(0);
        boolean boolean7 = byteBuffer6.hasRemaining();
        java.nio.ByteBuffer byteBuffer8 = byteBuffer6.asReadOnlyBuffer();
        boolean boolean9 = byteBuffer8.hasRemaining();
        java.nio.ByteBuffer byteBuffer11 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer12 = byteBuffer11.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer13 = byteBuffer11.asShortBuffer();
        java.nio.ByteBuffer byteBuffer14 = byteBuffer11.compact();
        java.nio.ByteOrder byteOrder15 = byteBuffer14.order();
        java.nio.ByteBuffer byteBuffer16 = byteBuffer8.order(byteOrder15);
        boolean boolean17 = byteBuffer16.hasRemaining();
        java.nio.ByteBuffer byteBuffer19 = java.nio.ByteBuffer.allocate((int) ' ');
        java.nio.Buffer buffer20 = byteBuffer19.rewind();
        java.nio.ByteBuffer byteBuffer21 = byteBuffer19.compact();
        java.nio.ByteBuffer byteBuffer22 = byteBuffer21.slice();
        java.nio.Buffer buffer24 = byteBuffer21.limit(9);
        java.nio.ByteBuffer byteBuffer25 = byteBuffer21.duplicate();
        java.nio.ByteBuffer byteBuffer27 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer28 = byteBuffer27.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer29 = byteBuffer27.asShortBuffer();
        byte[] byteArray30 = byteBuffer27.array();
        java.nio.ByteBuffer byteBuffer31 = byteBuffer21.get(byteArray30);
        java.nio.ByteBuffer byteBuffer32 = byteBuffer16.get(byteArray30);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer35 = byteBuffer1.get(byteArray30, (int) (short) 13312, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(buffer2);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]" + "'", str4, "java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]");
        org.junit.Assert.assertNotNull(byteBuffer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(byteBuffer8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(byteBuffer11);
        org.junit.Assert.assertNotNull(doubleBuffer12);
        org.junit.Assert.assertNotNull(shortBuffer13);
        org.junit.Assert.assertNotNull(byteBuffer14);
        org.junit.Assert.assertNotNull(byteOrder15);
        org.junit.Assert.assertNotNull(byteBuffer16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(byteBuffer19);
        org.junit.Assert.assertNotNull(buffer20);
        org.junit.Assert.assertNotNull(byteBuffer21);
        org.junit.Assert.assertNotNull(byteBuffer22);
        org.junit.Assert.assertNotNull(buffer24);
        org.junit.Assert.assertNotNull(byteBuffer25);
        org.junit.Assert.assertNotNull(byteBuffer27);
        org.junit.Assert.assertNotNull(doubleBuffer28);
        org.junit.Assert.assertNotNull(shortBuffer29);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray30), "[]");
        org.junit.Assert.assertNotNull(byteBuffer31);
        org.junit.Assert.assertNotNull(byteBuffer32);
    }

    @Test
    public void test1368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1368");
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
        java.nio.ByteBuffer byteBuffer29 = byteBuffer28.compact();
        java.nio.IntBuffer intBuffer30 = byteBuffer29.asIntBuffer();
        // The following exception was thrown during execution in test generation
        try {
            byte byte32 = byteBuffer29.get((-1));
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
        org.junit.Assert.assertNotNull(intBuffer30);
    }

    @Test
    public void test1369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1369");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.executed = false;
        int int4 = response1.statusCode;
        int int5 = response1.statusCode;
        response1.statusMessage = "hi!";
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test1370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1370");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer2 = byteBuffer1.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        java.nio.ByteBuffer byteBuffer4 = byteBuffer1.compact();
        java.nio.ByteBuffer byteBuffer5 = byteBuffer1.slice();
        java.nio.ByteOrder byteOrder6 = byteBuffer1.order();
        java.nio.ByteBuffer byteBuffer7 = byteBuffer1.compact();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer9 = byteBuffer7.putShort((short) 13312);
            org.junit.Assert.fail("Expected exception of type java.nio.BufferOverflowException; message: null");
        } catch (java.nio.BufferOverflowException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(doubleBuffer2);
        org.junit.Assert.assertNotNull(shortBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertNotNull(byteOrder6);
        org.junit.Assert.assertNotNull(byteBuffer7);
    }

    @Test
    public void test1371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1371");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.isReadOnly();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        java.nio.ByteBuffer byteBuffer5 = java.nio.ByteBuffer.allocate(0);
        boolean boolean6 = byteBuffer5.isReadOnly();
        int int7 = byteBuffer1.compareTo(byteBuffer5);
        java.nio.ByteBuffer byteBuffer8 = byteBuffer5.compact();
        java.nio.Buffer buffer10 = byteBuffer5.limit((int) (short) 0);
        int int11 = buffer10.limit();
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
    public void test1372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1372");
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
        java.nio.Buffer buffer14 = byteBuffer13.clear();
        java.nio.ByteBuffer byteBuffer15 = byteBuffer13.asReadOnlyBuffer();
        java.nio.IntBuffer intBuffer16 = byteBuffer13.asIntBuffer();
        java.lang.String str17 = byteBuffer13.toString();
        // The following exception was thrown during execution in test generation
        try {
            double double18 = byteBuffer13.getDouble();
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
        org.junit.Assert.assertNotNull(buffer14);
        org.junit.Assert.assertNotNull(byteBuffer15);
        org.junit.Assert.assertNotNull(intBuffer16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]" + "'", str17, "java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]");
    }

    @Test
    public void test1373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1373");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.isReadOnly();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        java.nio.ByteBuffer byteBuffer5 = java.nio.ByteBuffer.allocate(0);
        boolean boolean6 = byteBuffer5.isReadOnly();
        int int7 = byteBuffer1.compareTo(byteBuffer5);
        java.nio.DoubleBuffer doubleBuffer8 = byteBuffer5.asDoubleBuffer();
        java.nio.FloatBuffer floatBuffer9 = byteBuffer5.asFloatBuffer();
        java.lang.String str10 = byteBuffer5.toString();
        java.nio.Buffer buffer11 = byteBuffer5.rewind();
        boolean boolean12 = byteBuffer5.isDirect();
        java.nio.ByteBuffer byteBuffer14 = java.nio.ByteBuffer.allocate((int) (byte) 10);
        byte[] byteArray18 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.nio.ByteBuffer byteBuffer19 = java.nio.ByteBuffer.wrap(byteArray18);
        java.nio.ByteBuffer byteBuffer20 = byteBuffer14.get(byteArray18);
        java.nio.Buffer buffer21 = byteBuffer14.rewind();
        int int22 = byteBuffer14.position();
        java.nio.Buffer buffer23 = byteBuffer14.rewind();
        java.nio.ByteBuffer byteBuffer24 = byteBuffer14.slice();
        java.nio.ByteOrder byteOrder25 = byteBuffer14.order();
        java.nio.ByteBuffer byteBuffer26 = byteBuffer5.order(byteOrder25);
        // The following exception was thrown during execution in test generation
        try {
            float float27 = byteBuffer26.getFloat();
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
        org.junit.Assert.assertNotNull(doubleBuffer8);
        org.junit.Assert.assertNotNull(floatBuffer9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]" + "'", str10, "java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]");
        org.junit.Assert.assertNotNull(buffer11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(byteBuffer14);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(byteBuffer19);
        org.junit.Assert.assertNotNull(byteBuffer20);
        org.junit.Assert.assertNotNull(buffer21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(buffer23);
        org.junit.Assert.assertNotNull(byteBuffer24);
        org.junit.Assert.assertNotNull(byteOrder25);
        org.junit.Assert.assertNotNull(byteBuffer26);
    }

    @Test
    public void test1374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1374");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response1);
        boolean boolean4 = response3.executed;
        java.lang.String str6 = response3.getHeaderCaseInsensitive("");
        java.net.URL uRL7 = response3.url();
        org.jsoup.Connection.Response response9 = response3.removeCookie("");
        java.lang.String str10 = response3.charset();
        response3.contentType = "hi!";
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response3);
        org.jsoup.Connection.Request request14 = response13.req;
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response13);
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response13);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response17 = org.jsoup.helper.HttpConnection.Response.execute(request0, response16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(uRL7);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(request14);
    }

    @Test
    public void test1375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1375");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer2 = byteBuffer1.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        java.nio.ByteOrder byteOrder4 = null;
        java.nio.ByteBuffer byteBuffer5 = byteBuffer1.order(byteOrder4);
        java.nio.ByteBuffer byteBuffer6 = byteBuffer5.asReadOnlyBuffer();
        int int7 = byteBuffer5.arrayOffset();
        java.nio.Buffer buffer8 = byteBuffer5.flip();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer11 = byteBuffer5.putShort((-1), (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(doubleBuffer2);
        org.junit.Assert.assertNotNull(shortBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertNotNull(byteBuffer6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(buffer8);
    }

    @Test
    public void test1376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1376");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Method method6 = response5.method();
        boolean boolean8 = response5.hasCookie("hi!");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry10 = response5.scanHeaders("hi!");
        java.lang.String str11 = response5.contentType;
        int int12 = response5.statusCode;
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray13 = response5.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(strEntry10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1377");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect((int) 'a');
        java.nio.LongBuffer longBuffer2 = byteBuffer1.asLongBuffer();
        boolean boolean3 = byteBuffer1.isReadOnly();
        java.nio.ByteBuffer byteBuffer5 = byteBuffer1.putFloat((float) 13);
        int int6 = byteBuffer1.limit();
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(longBuffer2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
    }

    @Test
    public void test1378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1378");
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
            java.nio.ByteBuffer byteBuffer35 = byteBuffer29.putShort(2, (short) (byte) -1);
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
    }

    @Test
    public void test1379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1379");
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
        java.nio.ByteBuffer byteBuffer16 = java.nio.ByteBuffer.allocateDirect((int) (byte) 10);
        boolean boolean18 = byteBuffer16.equals((java.lang.Object) 1.0f);
        int int19 = byteBuffer5.compareTo(byteBuffer16);
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
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-10) + "'", int19 == (-10));
    }

    @Test
    public void test1380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1380");
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
        java.nio.CharBuffer charBuffer24 = byteBuffer23.asCharBuffer();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer27 = byteBuffer23.putDouble(0, (double) 42953080832L);
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
        org.junit.Assert.assertNotNull(charBuffer24);
    }

    @Test
    public void test1381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1381");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate((int) (byte) 10);
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.nio.ByteBuffer byteBuffer6 = java.nio.ByteBuffer.wrap(byteArray5);
        java.nio.ByteBuffer byteBuffer7 = byteBuffer1.get(byteArray5);
        java.nio.Buffer buffer8 = byteBuffer1.rewind();
        java.nio.ByteOrder byteOrder9 = byteBuffer1.order();
        boolean boolean10 = byteBuffer1.hasRemaining();
        byte[] byteArray13 = new byte[] { (byte) 10, (byte) 1 };
        java.nio.ByteBuffer byteBuffer14 = byteBuffer1.put(byteArray13);
        java.nio.ByteBuffer byteBuffer15 = java.nio.ByteBuffer.wrap(byteArray13);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer18 = java.nio.ByteBuffer.wrap(byteArray13, 31, (int) '#');
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
        org.junit.Assert.assertNotNull(byteBuffer15);
    }

    @Test
    public void test1382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1382");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Method method6 = response5.method();
        java.util.Map<java.lang.String, java.lang.String> strMap7 = response5.headers();
        org.jsoup.Connection.Method method8 = response5.method();
        java.lang.String str9 = response5.contentType;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document10 = response5.parse();
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
    public void test1383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1383");
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
        java.nio.Buffer buffer22 = byteBuffer18.rewind();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.Buffer buffer24 = buffer22.position(31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: newPosition > limit: (31 > 0)");
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
        org.junit.Assert.assertNotNull(buffer22);
    }

    @Test
    public void test1384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1384");
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
        java.nio.ByteBuffer byteBuffer12 = response3.byteData;
        org.junit.Assert.assertNull(byteBuffer4);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(uRL10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(byteBuffer12);
    }

    @Test
    public void test1385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1385");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer2 = byteBuffer1.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        int int4 = byteBuffer1.capacity();
        java.nio.DoubleBuffer doubleBuffer5 = byteBuffer1.asDoubleBuffer();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer8 = byteBuffer1.put((-10), (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(doubleBuffer2);
        org.junit.Assert.assertNotNull(shortBuffer3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(doubleBuffer5);
    }

    @Test
    public void test1386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1386");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate((int) (byte) 10);
        int int2 = byteBuffer1.limit();
        java.nio.ByteBuffer byteBuffer4 = byteBuffer1.putChar(' ');
        java.nio.ByteBuffer byteBuffer5 = byteBuffer1.asReadOnlyBuffer();
        java.nio.ByteBuffer byteBuffer7 = byteBuffer1.putLong((long) (-1));
        java.nio.ByteOrder byteOrder8 = null;
        java.nio.ByteBuffer byteBuffer9 = byteBuffer7.order(byteOrder8);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer11 = byteBuffer9.putDouble(10.0d);
            org.junit.Assert.fail("Expected exception of type java.nio.BufferOverflowException; message: null");
        } catch (java.nio.BufferOverflowException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertNotNull(byteBuffer7);
        org.junit.Assert.assertNotNull(byteBuffer9);
    }

    @Test
    public void test1387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1387");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.nio.ByteBuffer byteBuffer5 = response4.byteData;
        org.jsoup.Connection.Response response8 = response4.cookie("hi!", "");
        java.net.URL uRL9 = response4.url();
        response4.charset = "";
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response4);
        org.jsoup.Connection.Method method13 = response12.method();
        int int14 = response12.statusCode();
        java.lang.String str15 = response12.statusMessage();
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response12);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response17 = org.jsoup.helper.HttpConnection.Response.execute(request0, response16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(byteBuffer5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertNull(method13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test1388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1388");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect((int) '#');
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.putShort((short) 0);
        java.nio.ByteOrder byteOrder4 = byteBuffer3.order();
        double double5 = byteBuffer3.getDouble();
        java.nio.ByteBuffer byteBuffer8 = byteBuffer3.putDouble((int) (short) 0, (double) (short) 1);
        java.nio.Buffer buffer10 = byteBuffer3.position(7);
        // The following exception was thrown during execution in test generation
        try {
            long long12 = byteBuffer3.getLong(31);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertNotNull(byteOrder4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(byteBuffer8);
        org.junit.Assert.assertNotNull(buffer10);
    }

    @Test
    public void test1389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1389");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer2 = byteBuffer1.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        int int4 = byteBuffer1.limit();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer7 = byteBuffer1.putDouble((-1), (double) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(doubleBuffer2);
        org.junit.Assert.assertNotNull(shortBuffer3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test1390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1390");
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
        java.nio.ByteBuffer byteBuffer27 = byteBuffer26.asReadOnlyBuffer();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.Buffer buffer28 = byteBuffer26.reset();
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
        org.junit.Assert.assertNotNull(byteBuffer27);
    }

    @Test
    public void test1391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1391");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate((int) (byte) 10);
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.nio.ByteBuffer byteBuffer6 = java.nio.ByteBuffer.wrap(byteArray5);
        java.nio.ByteBuffer byteBuffer7 = byteBuffer1.get(byteArray5);
        java.nio.Buffer buffer8 = byteBuffer1.rewind();
        int int9 = byteBuffer1.position();
        java.nio.Buffer buffer10 = byteBuffer1.rewind();
        java.nio.ByteBuffer byteBuffer11 = byteBuffer1.slice();
        java.nio.Buffer buffer12 = byteBuffer1.mark();
        java.nio.ByteOrder byteOrder13 = byteBuffer1.order();
        short short14 = byteBuffer1.getShort();
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
        org.junit.Assert.assertNotNull(byteOrder13);
        org.junit.Assert.assertTrue("'" + short14 + "' != '" + (short) 0 + "'", short14 == (short) 0);
    }

    @Test
    public void test1392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1392");
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
        response2.statusMessage = "";
        java.lang.String str16 = response2.contentType();
        java.net.URL uRL17 = response2.url();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(uRL17);
    }

    @Test
    public void test1393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1393");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request3 = response2.req;
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response2);
        java.lang.String str5 = response4.contentType;
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response4);
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response4);
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response7);
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response7);
        response7.numRedirects = (byte) -1;
        org.junit.Assert.assertNull(request3);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test1394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1394");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect((int) (byte) 100);
        java.nio.ByteBuffer byteBuffer2 = byteBuffer1.slice();
        java.nio.ByteBuffer byteBuffer4 = byteBuffer2.putInt(22);
        java.nio.Buffer buffer6 = byteBuffer4.position((int) (short) 0);
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteBuffer2);
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertNotNull(buffer6);
    }

    @Test
    public void test1395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1395");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate((int) (byte) 10);
        int int2 = byteBuffer1.limit();
        char char3 = byteBuffer1.getChar();
        java.nio.ByteBuffer byteBuffer5 = byteBuffer1.putLong((long) (byte) -1);
        java.lang.String str6 = byteBuffer5.toString();
        // The following exception was thrown during execution in test generation
        try {
            char char8 = byteBuffer5.getChar(65);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\000' + "'", char3 == '\000');
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "java.nio.HeapByteBuffer[pos=10 lim=10 cap=10]" + "'", str6, "java.nio.HeapByteBuffer[pos=10 lim=10 cap=10]");
    }

    @Test
    public void test1396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1396");
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
        boolean boolean21 = byteBuffer10.hasArray();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer24 = byteBuffer10.putInt((int) '4', 11);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
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
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test1397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1397");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Method method6 = response5.method();
        boolean boolean8 = response5.hasCookie("hi!");
        java.nio.ByteBuffer byteBuffer10 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer11 = byteBuffer10.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer12 = byteBuffer10.asShortBuffer();
        java.nio.ByteOrder byteOrder13 = null;
        java.nio.ByteBuffer byteBuffer14 = byteBuffer10.order(byteOrder13);
        java.nio.ByteBuffer byteBuffer16 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer17 = byteBuffer16.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer18 = byteBuffer16.asShortBuffer();
        int int19 = byteBuffer16.limit();
        byte[] byteArray20 = byteBuffer16.array();
        java.nio.ByteBuffer byteBuffer21 = byteBuffer10.put(byteArray20);
        response5.byteData = byteBuffer10;
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(byteBuffer10);
        org.junit.Assert.assertNotNull(doubleBuffer11);
        org.junit.Assert.assertNotNull(shortBuffer12);
        org.junit.Assert.assertNotNull(byteBuffer14);
        org.junit.Assert.assertNotNull(byteBuffer16);
        org.junit.Assert.assertNotNull(doubleBuffer17);
        org.junit.Assert.assertNotNull(shortBuffer18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[]");
        org.junit.Assert.assertNotNull(byteBuffer21);
    }

    @Test
    public void test1398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1398");
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
            java.nio.ByteBuffer byteBuffer21 = byteBuffer19.putShort((short) 1);
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
        org.junit.Assert.assertNotNull(byteBuffer14);
        org.junit.Assert.assertNotNull(doubleBuffer15);
        org.junit.Assert.assertNotNull(shortBuffer16);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[]");
        org.junit.Assert.assertNotNull(byteBuffer18);
        org.junit.Assert.assertNotNull(byteBuffer19);
    }

    @Test
    public void test1399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1399");
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
        java.nio.LongBuffer longBuffer14 = byteBuffer12.asLongBuffer();
        // The following exception was thrown during execution in test generation
        try {
            double double16 = byteBuffer12.getDouble(0);
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
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(longBuffer14);
    }

    @Test
    public void test1400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1400");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer2 = byteBuffer1.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        java.nio.ByteOrder byteOrder4 = null;
        java.nio.ByteBuffer byteBuffer5 = byteBuffer1.order(byteOrder4);
        java.lang.String str6 = byteBuffer1.toString();
        java.nio.DoubleBuffer doubleBuffer7 = byteBuffer1.asDoubleBuffer();
        java.nio.Buffer buffer8 = byteBuffer1.flip();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.Buffer buffer10 = byteBuffer1.limit((-32));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(doubleBuffer2);
        org.junit.Assert.assertNotNull(shortBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]" + "'", str6, "java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]");
        org.junit.Assert.assertNotNull(doubleBuffer7);
        org.junit.Assert.assertNotNull(buffer8);
    }

    @Test
    public void test1401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1401");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response1);
        boolean boolean4 = response3.executed;
        response3.statusCode = 0;
        java.lang.String str7 = response3.contentType();
        org.jsoup.Connection.Response response10 = response3.cookie("java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]", "java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response11 = org.jsoup.helper.HttpConnection.Response.execute(request0, response3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(response10);
    }

    @Test
    public void test1402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1402");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(4);
        org.junit.Assert.assertNotNull(byteBuffer1);
    }

    @Test
    public void test1403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1403");
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
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Response response19 = response1.header("hi!", "");
        org.jsoup.Connection.Response response22 = response1.cookie("java.nio.HeapByteBuffer[pos=0 lim=7 cap=7]", "java.nio.HeapByteBufferR[pos=0 lim=0 cap=0]");
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
        org.junit.Assert.assertNotNull(response19);
        org.junit.Assert.assertNotNull(response22);
    }

    @Test
    public void test1404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1404");
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
        java.nio.ByteOrder byteOrder22 = byteBuffer17.order();
        // The following exception was thrown during execution in test generation
        try {
            short short23 = byteBuffer17.getShort();
            org.junit.Assert.fail("Expected exception of type java.nio.BufferUnderflowException; message: null");
        } catch (java.nio.BufferUnderflowException e) {
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
        org.junit.Assert.assertNotNull(byteOrder22);
    }

    @Test
    public void test1405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1405");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean3 = response2.executed;
        response2.statusCode = 0;
        org.jsoup.Connection.Method method6 = response2.method();
        java.lang.String str7 = response2.charset();
        java.lang.String str8 = response2.contentType;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test1406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1406");
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
        response2.statusMessage = "";
        java.lang.String str16 = response2.contentType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = response2.body();
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
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test1407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1407");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer2 = byteBuffer1.asDoubleBuffer();
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.compact();
        java.lang.String str4 = byteBuffer1.toString();
        java.nio.LongBuffer longBuffer5 = byteBuffer1.asLongBuffer();
        java.nio.ByteBuffer byteBuffer7 = java.nio.ByteBuffer.allocate((int) (byte) 10);
        byte[] byteArray11 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.nio.ByteBuffer byteBuffer12 = java.nio.ByteBuffer.wrap(byteArray11);
        java.nio.ByteBuffer byteBuffer13 = byteBuffer7.get(byteArray11);
        java.nio.Buffer buffer14 = byteBuffer7.rewind();
        byte[] byteArray18 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.nio.ByteBuffer byteBuffer19 = java.nio.ByteBuffer.wrap(byteArray18);
        java.nio.ByteBuffer byteBuffer20 = byteBuffer7.put(byteArray18);
        java.nio.ByteBuffer byteBuffer22 = java.nio.ByteBuffer.allocate((int) (byte) 10);
        int int23 = byteBuffer22.getInt();
        java.nio.ByteBuffer byteBuffer26 = byteBuffer22.put((int) (byte) 0, (byte) 10);
        java.nio.IntBuffer intBuffer27 = byteBuffer22.asIntBuffer();
        byte[] byteArray31 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.nio.ByteBuffer byteBuffer32 = java.nio.ByteBuffer.wrap(byteArray31);
        java.nio.ByteBuffer byteBuffer33 = java.nio.ByteBuffer.wrap(byteArray31);
        java.nio.ByteBuffer byteBuffer34 = byteBuffer22.get(byteArray31);
        java.nio.ByteBuffer byteBuffer35 = byteBuffer7.get(byteArray31);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer36 = byteBuffer1.put(byteArray31);
            org.junit.Assert.fail("Expected exception of type java.nio.BufferOverflowException; message: null");
        } catch (java.nio.BufferOverflowException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(doubleBuffer2);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]" + "'", str4, "java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]");
        org.junit.Assert.assertNotNull(longBuffer5);
        org.junit.Assert.assertNotNull(byteBuffer7);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(byteBuffer12);
        org.junit.Assert.assertNotNull(byteBuffer13);
        org.junit.Assert.assertNotNull(buffer14);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[100, 1, 1]");
        org.junit.Assert.assertNotNull(byteBuffer19);
        org.junit.Assert.assertNotNull(byteBuffer20);
        org.junit.Assert.assertNotNull(byteBuffer22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(byteBuffer26);
        org.junit.Assert.assertNotNull(intBuffer27);
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray31), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(byteBuffer32);
        org.junit.Assert.assertNotNull(byteBuffer33);
        org.junit.Assert.assertNotNull(byteBuffer34);
        org.junit.Assert.assertNotNull(byteBuffer35);
    }

    @Test
    public void test1408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1408");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.isReadOnly();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        java.nio.ByteBuffer byteBuffer5 = java.nio.ByteBuffer.allocate(0);
        boolean boolean6 = byteBuffer5.isReadOnly();
        int int7 = byteBuffer1.compareTo(byteBuffer5);
        boolean boolean8 = byteBuffer1.isDirect();
        java.lang.Class<?> wildcardClass9 = byteBuffer1.getClass();
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(shortBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1409");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect(0);
        java.nio.CharBuffer charBuffer2 = byteBuffer1.asCharBuffer();
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(charBuffer2);
    }

    @Test
    public void test1410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1410");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect((int) '#');
        float float3 = byteBuffer1.getFloat(1);
        java.nio.ByteBuffer byteBuffer5 = byteBuffer1.putLong((long) 10);
        java.nio.ByteBuffer byteBuffer7 = byteBuffer1.putChar('\000');
        int int9 = byteBuffer7.getInt((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer12 = byteBuffer7.putInt(65, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertNotNull(byteBuffer7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1411");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.hasRemaining();
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.asReadOnlyBuffer();
        java.nio.ByteBuffer byteBuffer4 = byteBuffer1.asReadOnlyBuffer();
        java.nio.ByteBuffer byteBuffer6 = java.nio.ByteBuffer.allocate(0);
        boolean boolean7 = byteBuffer6.isReadOnly();
        java.nio.ShortBuffer shortBuffer8 = byteBuffer6.asShortBuffer();
        int int9 = byteBuffer6.position();
        java.nio.ByteOrder byteOrder10 = null;
        java.nio.ByteBuffer byteBuffer11 = byteBuffer6.order(byteOrder10);
        java.nio.ByteBuffer byteBuffer12 = byteBuffer6.asReadOnlyBuffer();
        java.nio.FloatBuffer floatBuffer13 = byteBuffer6.asFloatBuffer();
        java.nio.ByteBuffer byteBuffer15 = java.nio.ByteBuffer.allocate((int) (byte) 10);
        byte[] byteArray19 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.nio.ByteBuffer byteBuffer20 = java.nio.ByteBuffer.wrap(byteArray19);
        java.nio.ByteBuffer byteBuffer21 = byteBuffer15.get(byteArray19);
        java.nio.LongBuffer longBuffer22 = byteBuffer15.asLongBuffer();
        java.nio.ByteBuffer byteBuffer23 = byteBuffer15.slice();
        java.nio.ByteBuffer byteBuffer25 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer26 = byteBuffer25.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer27 = byteBuffer25.asShortBuffer();
        java.nio.ByteOrder byteOrder28 = null;
        java.nio.ByteBuffer byteBuffer29 = byteBuffer25.order(byteOrder28);
        java.nio.ByteBuffer byteBuffer31 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer32 = byteBuffer31.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer33 = byteBuffer31.asShortBuffer();
        int int34 = byteBuffer31.limit();
        byte[] byteArray35 = byteBuffer31.array();
        java.nio.ByteBuffer byteBuffer36 = byteBuffer25.put(byteArray35);
        java.nio.ByteBuffer byteBuffer37 = byteBuffer23.get(byteArray35);
        java.nio.ByteBuffer byteBuffer38 = byteBuffer6.put(byteArray35);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer41 = byteBuffer4.put(byteArray35, (-10), 11);
            org.junit.Assert.fail("Expected exception of type java.nio.ReadOnlyBufferException; message: null");
        } catch (java.nio.ReadOnlyBufferException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertNotNull(byteBuffer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(shortBuffer8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(byteBuffer11);
        org.junit.Assert.assertNotNull(byteBuffer12);
        org.junit.Assert.assertNotNull(floatBuffer13);
        org.junit.Assert.assertNotNull(byteBuffer15);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(byteBuffer20);
        org.junit.Assert.assertNotNull(byteBuffer21);
        org.junit.Assert.assertNotNull(longBuffer22);
        org.junit.Assert.assertNotNull(byteBuffer23);
        org.junit.Assert.assertNotNull(byteBuffer25);
        org.junit.Assert.assertNotNull(doubleBuffer26);
        org.junit.Assert.assertNotNull(shortBuffer27);
        org.junit.Assert.assertNotNull(byteBuffer29);
        org.junit.Assert.assertNotNull(byteBuffer31);
        org.junit.Assert.assertNotNull(doubleBuffer32);
        org.junit.Assert.assertNotNull(shortBuffer33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray35), "[]");
        org.junit.Assert.assertNotNull(byteBuffer36);
        org.junit.Assert.assertNotNull(byteBuffer37);
        org.junit.Assert.assertNotNull(byteBuffer38);
    }

    @Test
    public void test1412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1412");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate((int) ' ');
        java.nio.ByteBuffer byteBuffer3 = java.nio.ByteBuffer.allocate(0);
        java.nio.ByteBuffer byteBuffer4 = byteBuffer3.slice();
        java.nio.ByteBuffer byteBuffer5 = byteBuffer1.put(byteBuffer4);
        java.nio.ByteBuffer byteBuffer7 = java.nio.ByteBuffer.allocate((int) (byte) 100);
        java.nio.ByteBuffer byteBuffer9 = byteBuffer7.putDouble((double) '4');
        byte[] byteArray15 = new byte[] { (byte) 1, (byte) 100, (byte) -1, (byte) 10, (byte) -1 };
        java.nio.ByteBuffer byteBuffer16 = byteBuffer7.put(byteArray15);
        java.nio.ByteBuffer byteBuffer19 = java.nio.ByteBuffer.wrap(byteArray15, (int) '\000', 0);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer22 = byteBuffer5.put(byteArray15, 3, 85);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertNotNull(byteBuffer7);
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[1, 100, -1, 10, -1]");
        org.junit.Assert.assertNotNull(byteBuffer16);
        org.junit.Assert.assertNotNull(byteBuffer19);
    }

    @Test
    public void test1413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1413");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Method method6 = response5.method();
        response5.numRedirects = 0;
        response5.statusMessage = "java.nio.DirectByteBuffer[pos=4 lim=35 cap=35]";
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response5);
        org.junit.Assert.assertNull(method6);
    }

    @Test
    public void test1414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1414");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect((int) '#');
        java.nio.ByteOrder byteOrder2 = byteBuffer1.order();
        float float3 = byteBuffer1.getFloat();
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteOrder2);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test1415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1415");
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
        org.jsoup.Connection.Method method13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response14 = response12.method(method13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1416");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.nio.ByteBuffer byteBuffer4 = response3.byteData;
        org.jsoup.Connection.Response response7 = response3.cookie("hi!", "");
        boolean boolean8 = response3.executed;
        java.lang.String str9 = response3.charset();
        boolean boolean10 = response3.executed;
        response3.executed = true;
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response3);
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response13);
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response13);
        response13.charset = "java.nio.HeapByteBuffer[pos=0 lim=32 cap=32]";
        org.junit.Assert.assertNull(byteBuffer4);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1417");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.nio.ByteBuffer byteBuffer4 = response3.byteData;
        java.net.URL uRL5 = response3.url();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response3);
        int int7 = response3.statusCode;
        org.junit.Assert.assertNull(byteBuffer4);
        org.junit.Assert.assertNull(uRL5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1418");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.header("");
        boolean boolean5 = response1.hasCookie("");
        org.jsoup.Connection.Response response7 = response1.removeCookie("hi!");
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Response response10 = response8.removeCookie("java.nio.HeapByteBuffer[pos=3 lim=32 cap=32]");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNotNull(response10);
    }

    @Test
    public void test1419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1419");
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
        org.jsoup.helper.HttpConnection.Response response24 = new org.jsoup.helper.HttpConnection.Response(response21);
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
    }

    @Test
    public void test1420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1420");
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
        // The following exception was thrown during execution in test generation
        try {
            float float22 = byteBuffer14.getFloat();
            org.junit.Assert.fail("Expected exception of type java.nio.BufferUnderflowException; message: null");
        } catch (java.nio.BufferUnderflowException e) {
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
    }

    @Test
    public void test1421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1421");
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
        java.nio.FloatBuffer floatBuffer17 = byteBuffer10.asFloatBuffer();
        int int18 = floatBuffer17.remaining();
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
        org.junit.Assert.assertNotNull(floatBuffer17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test1422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1422");
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
        org.jsoup.Connection.Method method17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response18 = response3.method(method17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(byteBuffer4);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(request9);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1423");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str4 = response3.statusMessage();
        org.jsoup.Connection.Request request5 = null;
        response3.req = request5;
        int int7 = response3.statusCode;
        java.lang.String str8 = response3.contentType();
        response3.charset = "java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]";
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test1424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1424");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.isReadOnly();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        int int4 = byteBuffer1.position();
        java.nio.ByteOrder byteOrder5 = null;
        java.nio.ByteBuffer byteBuffer6 = byteBuffer1.order(byteOrder5);
        java.nio.ByteBuffer byteBuffer7 = byteBuffer1.asReadOnlyBuffer();
        java.nio.ByteBuffer byteBuffer8 = byteBuffer7.slice();
        java.nio.CharBuffer charBuffer9 = byteBuffer7.asCharBuffer();
        java.nio.ByteOrder byteOrder10 = byteBuffer7.order();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer12 = byteBuffer7.put((byte) 10);
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
        org.junit.Assert.assertNotNull(charBuffer9);
        org.junit.Assert.assertNotNull(byteOrder10);
    }

    @Test
    public void test1425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1425");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.nio.ByteBuffer byteBuffer4 = response3.byteData;
        org.jsoup.Connection.Response response7 = response3.cookie("hi!", "");
        boolean boolean8 = response3.executed;
        java.lang.String str9 = response3.charset();
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response3);
        response10.charset = "java.nio.HeapByteBuffer[pos=0 lim=32 cap=32]";
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response10);
        org.junit.Assert.assertNull(byteBuffer4);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test1426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1426");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.isReadOnly();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        int int4 = byteBuffer1.position();
        java.nio.ByteOrder byteOrder5 = null;
        java.nio.ByteBuffer byteBuffer6 = byteBuffer1.order(byteOrder5);
        java.lang.String str7 = byteBuffer6.toString();
        java.nio.ByteBuffer byteBuffer8 = byteBuffer6.slice();
        java.nio.ShortBuffer shortBuffer9 = byteBuffer6.asShortBuffer();
        java.nio.Buffer buffer10 = byteBuffer6.flip();
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(shortBuffer3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(byteBuffer6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]" + "'", str7, "java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]");
        org.junit.Assert.assertNotNull(byteBuffer8);
        org.junit.Assert.assertNotNull(shortBuffer9);
        org.junit.Assert.assertNotNull(buffer10);
    }

    @Test
    public void test1427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1427");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Request request4 = response3.req;
        org.jsoup.Connection.Method method5 = response3.method();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response3);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response7 = org.jsoup.helper.HttpConnection.Response.execute(request0, response6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(request4);
        org.junit.Assert.assertNull(method5);
    }

    @Test
    public void test1428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1428");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request3 = response2.req;
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response2);
        java.lang.String str5 = response4.contentType;
        boolean boolean7 = response4.hasHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response4);
        org.jsoup.Connection.Response response10 = response8.removeCookie("java.nio.DirectByteBuffer[pos=4 lim=35 cap=35]");
        org.junit.Assert.assertNull(request3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(response10);
    }

    @Test
    public void test1429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1429");
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
        java.nio.ByteBuffer byteBuffer15 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer16 = byteBuffer15.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer17 = byteBuffer15.asShortBuffer();
        java.nio.ByteBuffer byteBuffer18 = byteBuffer15.duplicate();
        response13.byteData = byteBuffer15;
        java.lang.String str20 = response13.contentType();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertNull(strEntry11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(byteBuffer15);
        org.junit.Assert.assertNotNull(doubleBuffer16);
        org.junit.Assert.assertNotNull(shortBuffer17);
        org.junit.Assert.assertNotNull(byteBuffer18);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test1430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1430");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.nio.ByteBuffer byteBuffer5 = response4.byteData;
        org.jsoup.Connection.Response response8 = response4.cookie("hi!", "");
        boolean boolean9 = response4.executed;
        java.lang.String str10 = response4.charset();
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response4);
        boolean boolean13 = response4.hasHeader("java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response14 = org.jsoup.helper.HttpConnection.Response.execute(request0, response4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(byteBuffer5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1431");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request3 = response2.req;
        org.jsoup.Connection.Method method4 = response2.method();
        java.lang.String str5 = response2.contentType;
        boolean boolean7 = response2.hasCookie("");
        java.lang.String str9 = response2.header("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap10 = response2.headers();
        org.junit.Assert.assertNull(request3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(strMap10);
    }

    @Test
    public void test1432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1432");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.nio.ByteBuffer byteBuffer4 = response3.byteData;
        org.jsoup.Connection.Response response7 = response3.cookie("hi!", "");
        boolean boolean8 = response3.executed;
        org.jsoup.Connection.Request request9 = response3.req;
        java.lang.String str11 = response3.header("");
        org.junit.Assert.assertNull(byteBuffer4);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(request9);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test1433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1433");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.hasRemaining();
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.asReadOnlyBuffer();
        java.nio.DoubleBuffer doubleBuffer4 = byteBuffer1.asDoubleBuffer();
        java.nio.IntBuffer intBuffer5 = byteBuffer1.asIntBuffer();
        java.nio.ByteBuffer byteBuffer6 = byteBuffer1.compact();
        // The following exception was thrown during execution in test generation
        try {
            float float8 = byteBuffer6.getFloat(93);
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
    }

    @Test
    public void test1434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1434");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer2 = byteBuffer1.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        java.nio.ByteBuffer byteBuffer4 = byteBuffer1.compact();
        java.nio.ByteBuffer byteBuffer5 = byteBuffer1.slice();
        java.nio.CharBuffer charBuffer6 = byteBuffer5.asCharBuffer();
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(doubleBuffer2);
        org.junit.Assert.assertNotNull(shortBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertNotNull(charBuffer6);
    }

    @Test
    public void test1435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1435");
        byte[] byteArray0 = new byte[] {};
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.wrap(byteArray0);
        java.nio.Buffer buffer2 = byteBuffer1.flip();
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.asReadOnlyBuffer();
        java.nio.ByteBuffer byteBuffer5 = java.nio.ByteBuffer.allocate((int) (byte) 10);
        byte[] byteArray9 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.nio.ByteBuffer byteBuffer10 = java.nio.ByteBuffer.wrap(byteArray9);
        java.nio.ByteBuffer byteBuffer11 = byteBuffer5.get(byteArray9);
        java.nio.Buffer buffer12 = byteBuffer5.rewind();
        java.nio.ByteOrder byteOrder13 = byteBuffer5.order();
        boolean boolean14 = byteBuffer5.hasRemaining();
        byte[] byteArray17 = new byte[] { (byte) 10, (byte) 1 };
        java.nio.ByteBuffer byteBuffer18 = byteBuffer5.put(byteArray17);
        short short19 = byteBuffer5.getShort();
        byte[] byteArray23 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.nio.ByteBuffer byteBuffer24 = java.nio.ByteBuffer.wrap(byteArray23);
        java.nio.ByteBuffer byteBuffer25 = byteBuffer5.put(byteArray23);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer28 = byteBuffer1.get(byteArray23, 100, 9);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(buffer2);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(byteBuffer10);
        org.junit.Assert.assertNotNull(byteBuffer11);
        org.junit.Assert.assertNotNull(buffer12);
        org.junit.Assert.assertNotNull(byteOrder13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[10, 1]");
        org.junit.Assert.assertNotNull(byteBuffer18);
        org.junit.Assert.assertTrue("'" + short19 + "' != '" + (short) 0 + "'", short19 == (short) 0);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[100, 1, 1]");
        org.junit.Assert.assertNotNull(byteBuffer24);
        org.junit.Assert.assertNotNull(byteBuffer25);
    }

    @Test
    public void test1436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1436");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.isReadOnly();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        int int4 = byteBuffer1.position();
        java.nio.ByteOrder byteOrder5 = null;
        java.nio.ByteBuffer byteBuffer6 = byteBuffer1.order(byteOrder5);
        java.nio.ByteBuffer byteBuffer7 = byteBuffer1.asReadOnlyBuffer();
        java.nio.FloatBuffer floatBuffer8 = byteBuffer1.asFloatBuffer();
        java.nio.ByteBuffer byteBuffer10 = java.nio.ByteBuffer.allocate((int) (byte) 10);
        byte[] byteArray14 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.nio.ByteBuffer byteBuffer15 = java.nio.ByteBuffer.wrap(byteArray14);
        java.nio.ByteBuffer byteBuffer16 = byteBuffer10.get(byteArray14);
        java.nio.LongBuffer longBuffer17 = byteBuffer10.asLongBuffer();
        java.nio.ByteBuffer byteBuffer18 = byteBuffer10.slice();
        java.nio.ByteBuffer byteBuffer20 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer21 = byteBuffer20.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer22 = byteBuffer20.asShortBuffer();
        java.nio.ByteOrder byteOrder23 = null;
        java.nio.ByteBuffer byteBuffer24 = byteBuffer20.order(byteOrder23);
        java.nio.ByteBuffer byteBuffer26 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer27 = byteBuffer26.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer28 = byteBuffer26.asShortBuffer();
        int int29 = byteBuffer26.limit();
        byte[] byteArray30 = byteBuffer26.array();
        java.nio.ByteBuffer byteBuffer31 = byteBuffer20.put(byteArray30);
        java.nio.ByteBuffer byteBuffer32 = byteBuffer18.get(byteArray30);
        java.nio.ByteBuffer byteBuffer33 = byteBuffer1.put(byteArray30);
        int int34 = byteBuffer33.position();
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(shortBuffer3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(byteBuffer6);
        org.junit.Assert.assertNotNull(byteBuffer7);
        org.junit.Assert.assertNotNull(floatBuffer8);
        org.junit.Assert.assertNotNull(byteBuffer10);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(byteBuffer15);
        org.junit.Assert.assertNotNull(byteBuffer16);
        org.junit.Assert.assertNotNull(longBuffer17);
        org.junit.Assert.assertNotNull(byteBuffer18);
        org.junit.Assert.assertNotNull(byteBuffer20);
        org.junit.Assert.assertNotNull(doubleBuffer21);
        org.junit.Assert.assertNotNull(shortBuffer22);
        org.junit.Assert.assertNotNull(byteBuffer24);
        org.junit.Assert.assertNotNull(byteBuffer26);
        org.junit.Assert.assertNotNull(doubleBuffer27);
        org.junit.Assert.assertNotNull(shortBuffer28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray30), "[]");
        org.junit.Assert.assertNotNull(byteBuffer31);
        org.junit.Assert.assertNotNull(byteBuffer32);
        org.junit.Assert.assertNotNull(byteBuffer33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
    }

    @Test
    public void test1437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1437");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate((int) (byte) 10);
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.nio.ByteBuffer byteBuffer6 = java.nio.ByteBuffer.wrap(byteArray5);
        java.nio.ByteBuffer byteBuffer7 = byteBuffer1.get(byteArray5);
        java.nio.Buffer buffer8 = byteBuffer1.rewind();
        java.nio.ByteOrder byteOrder9 = byteBuffer1.order();
        boolean boolean10 = byteBuffer1.hasRemaining();
        byte[] byteArray13 = new byte[] { (byte) 10, (byte) 1 };
        java.nio.ByteBuffer byteBuffer14 = byteBuffer1.put(byteArray13);
        java.lang.String str15 = byteBuffer14.toString();
        java.nio.ByteBuffer byteBuffer16 = byteBuffer14.compact();
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
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "java.nio.HeapByteBuffer[pos=2 lim=10 cap=10]" + "'", str15, "java.nio.HeapByteBuffer[pos=2 lim=10 cap=10]");
        org.junit.Assert.assertNotNull(byteBuffer16);
    }

    @Test
    public void test1438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1438");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.header("");
        org.jsoup.Connection.Response response5 = response1.removeCookie("hi!");
        java.lang.String str7 = response1.cookie("");
        java.lang.String str8 = response1.statusMessage();
        java.net.HttpURLConnection httpURLConnection9 = null;
        org.jsoup.helper.HttpConnection.Response response10 = null;
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response10);
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response10);
        boolean boolean13 = response12.executed;
        java.lang.String str15 = response12.getHeaderCaseInsensitive("");
        java.lang.String str17 = response12.cookie("java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]");
        int int18 = response12.statusCode();
        java.lang.String str19 = response12.statusMessage;
        java.util.Map<java.lang.String, java.lang.String> strMap20 = response12.headers();
        java.lang.String str21 = response12.statusMessage;
        // The following exception was thrown during execution in test generation
        try {
            response1.setupFromConnection(httpURLConnection9, (org.jsoup.Connection.Response) response12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(strMap20);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test1439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1439");
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
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray11 = response10.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test1440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1440");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect((int) '#');
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.putShort((short) 0);
        java.nio.ByteBuffer byteBuffer6 = byteBuffer3.putShort(0, (short) (byte) 10);
        java.nio.Buffer buffer7 = byteBuffer6.clear();
        java.nio.ByteOrder byteOrder8 = byteBuffer6.order();
        java.nio.CharBuffer charBuffer9 = byteBuffer6.asCharBuffer();
        java.nio.Buffer buffer10 = charBuffer9.flip();
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer6);
        org.junit.Assert.assertNotNull(buffer7);
        org.junit.Assert.assertNotNull(byteOrder8);
        org.junit.Assert.assertNotNull(charBuffer9);
        org.junit.Assert.assertNotNull(buffer10);
    }

    @Test
    public void test1441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1441");
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
        org.jsoup.Connection.Request request15 = null;
        response12.req = request15;
        org.jsoup.Connection.Response response19 = response12.header("java.nio.HeapByteBuffer[pos=10 lim=10 cap=10]", "java.nio.HeapByteBuffer[pos=3 lim=32 cap=32]");
        org.junit.Assert.assertNull(byteBuffer4);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(uRL10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(response19);
    }

    @Test
    public void test1442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1442");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.nio.ByteBuffer byteBuffer4 = response3.byteData;
        org.jsoup.Connection.Response response7 = response3.cookie("hi!", "");
        boolean boolean8 = response3.executed;
        java.lang.String str9 = response3.charset();
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response3);
        response3.statusMessage = "";
        response3.statusMessage = "java.nio.HeapByteBuffer[pos=3 lim=10 cap=10]";
        java.net.HttpURLConnection httpURLConnection15 = null;
        org.jsoup.helper.HttpConnection.Response response16 = null;
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response16);
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response(response16);
        org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response(response16);
        java.nio.ByteBuffer byteBuffer20 = response19.byteData;
        org.jsoup.Connection.Response response23 = response19.cookie("hi!", "");
        boolean boolean24 = response19.executed;
        java.lang.String str25 = response19.charset();
        java.net.URL uRL26 = response19.url();
        java.lang.String str27 = response19.charset();
        org.jsoup.helper.HttpConnection.Response response28 = new org.jsoup.helper.HttpConnection.Response(response19);
        org.jsoup.helper.HttpConnection.Response response29 = new org.jsoup.helper.HttpConnection.Response(response28);
        org.jsoup.helper.HttpConnection.Response response30 = new org.jsoup.helper.HttpConnection.Response(response28);
        boolean boolean32 = response28.hasHeader("java.nio.HeapByteBuffer[pos=0 lim=32 cap=32]");
        // The following exception was thrown during execution in test generation
        try {
            response3.setupFromConnection(httpURLConnection15, (org.jsoup.Connection.Response) response28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(byteBuffer4);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(byteBuffer20);
        org.junit.Assert.assertNotNull(response23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(uRL26);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test1443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1443");
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
            org.jsoup.helper.HttpConnection.Response response8 = org.jsoup.helper.HttpConnection.Response.execute(request0, response7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(strMap5);
    }

    @Test
    public void test1444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1444");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.header("");
        org.jsoup.Connection.Response response5 = response1.removeCookie("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap6 = response1.headers();
        java.lang.Class<?> wildcardClass7 = strMap6.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1445");
        byte[] byteArray0 = new byte[] {};
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.wrap(byteArray0);
        java.nio.Buffer buffer2 = byteBuffer1.flip();
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.asReadOnlyBuffer();
        java.nio.ByteBuffer byteBuffer4 = byteBuffer1.duplicate();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer6 = byteBuffer1.putDouble((double) 65);
            org.junit.Assert.fail("Expected exception of type java.nio.BufferOverflowException; message: null");
        } catch (java.nio.BufferOverflowException e) {
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
    public void test1446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1446");
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
            float float14 = byteBuffer1.getFloat((int) (short) 13312);
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
    public void test1447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1447");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean3 = response2.executed;
        java.util.Map<java.lang.String, java.lang.String> strMap4 = response2.cookies();
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response2);
        int int6 = response5.statusCode();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = response5.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test1448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1448");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.ByteBuffer byteBuffer2 = byteBuffer1.slice();
        java.nio.ByteBuffer byteBuffer4 = java.nio.ByteBuffer.allocate((int) ' ');
        java.nio.Buffer buffer5 = byteBuffer4.rewind();
        java.nio.ByteBuffer byteBuffer6 = byteBuffer4.compact();
        java.nio.ByteOrder byteOrder7 = byteBuffer4.order();
        java.nio.ByteBuffer byteBuffer8 = byteBuffer2.order(byteOrder7);
        java.nio.IntBuffer intBuffer9 = byteBuffer2.asIntBuffer();
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteBuffer2);
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertNotNull(buffer5);
        org.junit.Assert.assertNotNull(byteBuffer6);
        org.junit.Assert.assertNotNull(byteOrder7);
        org.junit.Assert.assertNotNull(byteBuffer8);
        org.junit.Assert.assertNotNull(intBuffer9);
    }

    @Test
    public void test1449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1449");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.isReadOnly();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        java.nio.ByteBuffer byteBuffer4 = byteBuffer1.duplicate();
        java.nio.ByteBuffer byteBuffer5 = byteBuffer1.slice();
        java.nio.Buffer buffer6 = byteBuffer5.rewind();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer8 = byteBuffer5.putFloat(0.0f);
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
    }

    @Test
    public void test1450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1450");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.nio.ByteBuffer byteBuffer4 = response3.byteData;
        org.jsoup.Connection.Response response7 = response3.cookie("hi!", "");
        java.net.URL uRL8 = response3.url();
        org.jsoup.helper.HttpConnection.Response response9 = null;
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response9);
        java.lang.String str12 = response10.header("");
        response10.charset = "hi!";
        java.nio.ByteBuffer byteBuffer15 = null;
        response10.byteData = byteBuffer15;
        org.jsoup.Connection.Method method17 = response10.method();
        java.nio.ByteBuffer byteBuffer19 = java.nio.ByteBuffer.allocate((int) (byte) 10);
        byte[] byteArray23 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.nio.ByteBuffer byteBuffer24 = java.nio.ByteBuffer.wrap(byteArray23);
        java.nio.ByteBuffer byteBuffer25 = byteBuffer19.get(byteArray23);
        java.nio.Buffer buffer26 = byteBuffer19.rewind();
        int int27 = byteBuffer19.position();
        java.nio.Buffer buffer28 = byteBuffer19.rewind();
        response10.byteData = byteBuffer19;
        response3.byteData = byteBuffer19;
        char char31 = byteBuffer19.getChar();
        org.junit.Assert.assertNull(byteBuffer4);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(uRL8);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(method17);
        org.junit.Assert.assertNotNull(byteBuffer19);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(byteBuffer24);
        org.junit.Assert.assertNotNull(byteBuffer25);
        org.junit.Assert.assertNotNull(buffer26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(buffer28);
        org.junit.Assert.assertTrue("'" + char31 + "' != '" + '\000' + "'", char31 == '\000');
    }

    @Test
    public void test1451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1451");
        byte[] byteArray0 = new byte[] {};
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.wrap(byteArray0);
        java.nio.Buffer buffer2 = byteBuffer1.flip();
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.asReadOnlyBuffer();
        java.nio.ByteBuffer byteBuffer4 = byteBuffer1.duplicate();
        java.nio.ByteBuffer byteBuffer6 = java.nio.ByteBuffer.allocate(0);
        boolean boolean7 = byteBuffer6.isReadOnly();
        java.nio.ShortBuffer shortBuffer8 = byteBuffer6.asShortBuffer();
        int int9 = byteBuffer6.position();
        boolean boolean10 = byteBuffer6.isReadOnly();
        java.nio.ByteOrder byteOrder11 = byteBuffer6.order();
        java.nio.ByteBuffer byteBuffer12 = byteBuffer4.order(byteOrder11);
        java.nio.ByteBuffer byteBuffer14 = java.nio.ByteBuffer.allocate((int) (byte) 10);
        byte[] byteArray18 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.nio.ByteBuffer byteBuffer19 = java.nio.ByteBuffer.wrap(byteArray18);
        java.nio.ByteBuffer byteBuffer20 = byteBuffer14.get(byteArray18);
        java.nio.LongBuffer longBuffer21 = byteBuffer14.asLongBuffer();
        java.nio.ByteBuffer byteBuffer22 = byteBuffer14.slice();
        java.nio.ByteBuffer byteBuffer24 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer25 = byteBuffer24.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer26 = byteBuffer24.asShortBuffer();
        java.nio.ByteOrder byteOrder27 = null;
        java.nio.ByteBuffer byteBuffer28 = byteBuffer24.order(byteOrder27);
        java.nio.ByteBuffer byteBuffer30 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer31 = byteBuffer30.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer32 = byteBuffer30.asShortBuffer();
        int int33 = byteBuffer30.limit();
        byte[] byteArray34 = byteBuffer30.array();
        java.nio.ByteBuffer byteBuffer35 = byteBuffer24.put(byteArray34);
        java.nio.ByteBuffer byteBuffer36 = byteBuffer22.get(byteArray34);
        java.nio.ByteBuffer byteBuffer37 = byteBuffer12.get(byteArray34);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer40 = byteBuffer37.putInt((int) '#', 13);
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
        org.junit.Assert.assertNotNull(byteBuffer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(shortBuffer8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(byteOrder11);
        org.junit.Assert.assertNotNull(byteBuffer12);
        org.junit.Assert.assertNotNull(byteBuffer14);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(byteBuffer19);
        org.junit.Assert.assertNotNull(byteBuffer20);
        org.junit.Assert.assertNotNull(longBuffer21);
        org.junit.Assert.assertNotNull(byteBuffer22);
        org.junit.Assert.assertNotNull(byteBuffer24);
        org.junit.Assert.assertNotNull(doubleBuffer25);
        org.junit.Assert.assertNotNull(shortBuffer26);
        org.junit.Assert.assertNotNull(byteBuffer28);
        org.junit.Assert.assertNotNull(byteBuffer30);
        org.junit.Assert.assertNotNull(doubleBuffer31);
        org.junit.Assert.assertNotNull(shortBuffer32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray34), "[]");
        org.junit.Assert.assertNotNull(byteBuffer35);
        org.junit.Assert.assertNotNull(byteBuffer36);
        org.junit.Assert.assertNotNull(byteBuffer37);
    }

    @Test
    public void test1452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1452");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate((int) (byte) 10);
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.nio.ByteBuffer byteBuffer6 = java.nio.ByteBuffer.wrap(byteArray5);
        java.nio.ByteBuffer byteBuffer7 = byteBuffer1.get(byteArray5);
        java.nio.ByteBuffer byteBuffer8 = byteBuffer1.slice();
        java.nio.ByteBuffer byteBuffer9 = byteBuffer1.asReadOnlyBuffer();
        // The following exception was thrown during execution in test generation
        try {
            int int10 = byteBuffer9.arrayOffset();
            org.junit.Assert.fail("Expected exception of type java.nio.ReadOnlyBufferException; message: null");
        } catch (java.nio.ReadOnlyBufferException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(byteBuffer6);
        org.junit.Assert.assertNotNull(byteBuffer7);
        org.junit.Assert.assertNotNull(byteBuffer8);
        org.junit.Assert.assertNotNull(byteBuffer9);
    }

    @Test
    public void test1453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1453");
        org.jsoup.helper.HttpConnection.Response.MAX_REDIRECTS = 22;
    }

    @Test
    public void test1454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1454");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.header("");
        org.jsoup.Connection.Response response5 = response1.removeCookie("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap6 = response1.headers();
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response7);
        int int9 = response8.numRedirects;
        org.jsoup.Connection.Request request10 = null;
        response8.req = request10;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
    }

    @Test
    public void test1455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1455");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.net.URL uRL4 = response3.url();
        java.lang.String str5 = response3.contentType();
        java.lang.String str6 = response3.charset;
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response3);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response8 = org.jsoup.helper.HttpConnection.Response.execute(request0, response7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test1456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1456");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.header("");
        org.jsoup.Connection.Response response5 = response1.removeCookie("hi!");
        java.lang.String str7 = response1.cookie("");
        java.lang.String str8 = response1.statusMessage();
        int int9 = response1.statusCode;
        java.net.URL uRL10 = response1.url();
        org.jsoup.Connection.Method method11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response12 = response1.method(method11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(uRL10);
    }

    @Test
    public void test1457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1457");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean3 = response2.executed;
        java.lang.String str5 = response2.getHeaderCaseInsensitive("");
        java.net.URL uRL6 = response2.url();
        org.jsoup.Connection.Response response9 = response2.cookie("java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]", "java.nio.HeapByteBuffer[pos=0 lim=32 cap=32]");
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response2);
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response10);
        int int12 = response10.statusCode;
        java.net.HttpURLConnection httpURLConnection13 = null;
        org.jsoup.Connection.Response response14 = null;
        // The following exception was thrown during execution in test generation
        try {
            response10.setupFromConnection(httpURLConnection13, response14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1458");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.executed = false;
        java.lang.String str4 = response1.contentType;
        int int5 = response1.statusCode;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document6 = response1.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test1459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1459");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(1);
        java.nio.DoubleBuffer doubleBuffer2 = byteBuffer1.asDoubleBuffer();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer4 = byteBuffer1.putLong((long) 7);
            org.junit.Assert.fail("Expected exception of type java.nio.BufferOverflowException; message: null");
        } catch (java.nio.BufferOverflowException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(doubleBuffer2);
    }

    @Test
    public void test1460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1460");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.executed = false;
        java.lang.String str4 = response1.contentType;
        int int5 = response1.statusCode;
        java.lang.String str6 = response1.charset();
        java.lang.String str8 = response1.header("java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]");
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response9);
        java.nio.ByteBuffer byteBuffer11 = response10.byteData;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(byteBuffer11);
    }

    @Test
    public void test1461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1461");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str4 = response3.statusMessage();
        response3.contentType = "";
        java.lang.String str7 = response3.statusMessage();
        org.jsoup.Connection.Request request8 = response3.req;
        java.lang.String str9 = response3.statusMessage();
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response3);
        java.lang.String str11 = response10.contentType;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(request8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test1462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1462");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.net.URL uRL3 = response2.url();
        java.lang.String str5 = response2.cookie("java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response2);
        java.lang.String str7 = response2.statusMessage();
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray8 = response2.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test1463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1463");
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
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry18 = response1.scanHeaders("java.nio.HeapByteBufferR[pos=0 lim=0 cap=0]");
        org.jsoup.Connection.Method method19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response20 = response1.method(method19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertNull(strEntry18);
    }

    @Test
    public void test1464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1464");
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
        java.nio.DoubleBuffer doubleBuffer29 = byteBuffer22.asDoubleBuffer();
        int int30 = doubleBuffer29.limit();
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
        org.junit.Assert.assertNotNull(doubleBuffer29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test1465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1465");
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
        response5.statusCode = 11;
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
    public void test1466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1466");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request3 = response2.req;
        org.jsoup.Connection.Method method4 = response2.method();
        java.lang.String str5 = response2.contentType;
        java.util.Map<java.lang.String, java.lang.String> strMap6 = response2.headers();
        response2.contentType = "hi!";
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray9 = response2.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(request3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(strMap6);
    }

    @Test
    public void test1467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1467");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.nio.ByteBuffer byteBuffer4 = response3.byteData;
        java.net.URL uRL5 = response3.url();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response3);
        boolean boolean7 = response3.executed;
        org.jsoup.Connection.Method method8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response9 = response3.method(method8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(byteBuffer4);
        org.junit.Assert.assertNull(uRL5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1468");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Method method7 = response6.method();
        org.jsoup.Connection.Method method8 = response6.method();
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response6);
        boolean boolean11 = response9.hasCookie("");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry13 = response9.scanHeaders("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response14 = org.jsoup.helper.HttpConnection.Response.execute(request0, response9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(strEntry13);
    }

    @Test
    public void test1469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1469");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request3 = response2.req;
        org.jsoup.Connection.Method method4 = response2.method();
        java.lang.String str5 = response2.contentType;
        java.util.Map<java.lang.String, java.lang.String> strMap6 = response2.headers();
        response2.contentType = "hi!";
        response2.charset = "hi!";
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response2);
        org.junit.Assert.assertNull(request3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(strMap6);
    }

    @Test
    public void test1470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1470");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean3 = response2.executed;
        response2.statusCode = 0;
        java.lang.String str6 = response2.contentType();
        org.jsoup.Connection.Response response9 = response2.cookie("java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]", "java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry11 = response2.scanHeaders("hi!");
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response2);
        java.lang.String str14 = response2.header("java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]");
        int int15 = response2.statusCode;
        java.net.HttpURLConnection httpURLConnection16 = null;
        org.jsoup.helper.HttpConnection.Response response17 = null;
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response(response17);
        org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response(response17);
        boolean boolean20 = response19.executed;
        java.lang.String str22 = response19.getHeaderCaseInsensitive("");
        java.lang.String str24 = response19.cookie("java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]");
        int int25 = response19.statusCode();
        org.jsoup.Connection.Response response28 = response19.cookie("hi!", "");
        int int29 = response19.statusCode;
        org.jsoup.helper.HttpConnection.Response response30 = new org.jsoup.helper.HttpConnection.Response(response19);
        org.jsoup.helper.HttpConnection.Response response31 = new org.jsoup.helper.HttpConnection.Response(response19);
        java.lang.String str32 = response19.charset();
        // The following exception was thrown during execution in test generation
        try {
            response2.setupFromConnection(httpURLConnection16, (org.jsoup.Connection.Response) response19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertNull(strEntry11);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(response28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNull(str32);
    }

    @Test
    public void test1471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1471");
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
        java.nio.ByteBuffer byteBuffer27 = byteBuffer26.asReadOnlyBuffer();
        java.nio.ShortBuffer shortBuffer28 = byteBuffer27.asShortBuffer();
        // The following exception was thrown during execution in test generation
        try {
            char char30 = byteBuffer27.getChar(4);
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
        org.junit.Assert.assertNotNull(byteBuffer27);
        org.junit.Assert.assertNotNull(shortBuffer28);
    }

    @Test
    public void test1472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1472");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect((int) (byte) 10);
        boolean boolean3 = byteBuffer1.equals((java.lang.Object) 1.0f);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer6 = byteBuffer1.putLong(32, (long) 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1473");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean3 = response2.executed;
        java.lang.String str5 = response2.getHeaderCaseInsensitive("");
        java.lang.String str7 = response2.cookie("java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]");
        org.jsoup.Connection.Response response10 = response2.cookie("hi!", "");
        java.nio.ByteBuffer byteBuffer11 = response2.byteData;
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response2);
        java.lang.String str13 = response12.charset();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test1474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1474");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.nio.ByteBuffer byteBuffer4 = response3.byteData;
        java.lang.String str5 = response3.charset;
        java.lang.String str6 = response3.contentType;
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response3);
        response3.charset = "";
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document10 = response3.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(byteBuffer4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test1475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1475");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect((int) '#');
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.putShort((short) 0);
        java.nio.ByteBuffer byteBuffer5 = byteBuffer1.putDouble((double) '\000');
        char char6 = byteBuffer5.getChar();
        java.nio.Buffer buffer7 = byteBuffer5.clear();
        java.nio.ByteBuffer byteBuffer8 = byteBuffer5.slice();
        short short10 = byteBuffer5.getShort((int) '\000');
        java.nio.FloatBuffer floatBuffer11 = byteBuffer5.asFloatBuffer();
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray12 = byteBuffer5.array();
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
        org.junit.Assert.assertNotNull(floatBuffer11);
    }

    @Test
    public void test1476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1476");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate((int) (byte) 10);
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.nio.ByteBuffer byteBuffer6 = java.nio.ByteBuffer.wrap(byteArray5);
        java.nio.ByteBuffer byteBuffer7 = byteBuffer1.get(byteArray5);
        java.nio.LongBuffer longBuffer8 = byteBuffer1.asLongBuffer();
        java.nio.ByteBuffer byteBuffer9 = byteBuffer1.slice();
        char char10 = byteBuffer9.getChar();
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(byteBuffer6);
        org.junit.Assert.assertNotNull(byteBuffer7);
        org.junit.Assert.assertNotNull(longBuffer8);
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + '\000' + "'", char10 == '\000');
    }

    @Test
    public void test1477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1477");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean3 = response2.executed;
        java.lang.String str5 = response2.getHeaderCaseInsensitive("");
        java.util.Map<java.lang.String, java.lang.String> strMap6 = response2.headers();
        boolean boolean7 = response2.executed;
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response2);
        java.lang.String str9 = response2.charset();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test1478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1478");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.isReadOnly();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        java.nio.ByteBuffer byteBuffer5 = java.nio.ByteBuffer.allocate(0);
        boolean boolean6 = byteBuffer5.isReadOnly();
        int int7 = byteBuffer1.compareTo(byteBuffer5);
        java.nio.Buffer buffer8 = byteBuffer5.clear();
        boolean boolean9 = byteBuffer5.isDirect();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer12 = byteBuffer5.putLong((int) (short) 13312, (long) 1);
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
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1479");
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
        java.nio.Buffer buffer19 = byteBuffer17.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.Buffer buffer20 = buffer19.reset();
            org.junit.Assert.fail("Expected exception of type java.nio.InvalidMarkException; message: null");
        } catch (java.nio.InvalidMarkException e) {
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
        org.junit.Assert.assertNotNull(byteOrder18);
        org.junit.Assert.assertNotNull(buffer19);
    }

    @Test
    public void test1480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1480");
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
        java.nio.Buffer buffer14 = byteBuffer13.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer17 = byteBuffer13.putLong(0, (long) 0);
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
        org.junit.Assert.assertNotNull(buffer14);
    }

    @Test
    public void test1481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1481");
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
        org.jsoup.Connection.Method method19 = response2.method();
        org.junit.Assert.assertNotNull(byteBuffer6);
        org.junit.Assert.assertNotNull(byteBuffer8);
        org.junit.Assert.assertNotNull(byteBuffer10);
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '\000' + "'", char11 == '\000');
        org.junit.Assert.assertNotNull(buffer12);
        org.junit.Assert.assertNotNull(byteBuffer15);
        org.junit.Assert.assertNotNull(byteBuffer17);
        org.junit.Assert.assertNull(method19);
    }

    @Test
    public void test1482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1482");
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
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray23 = response2.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
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
    }

    @Test
    public void test1483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1483");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.hasRemaining();
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.asReadOnlyBuffer();
        java.nio.LongBuffer longBuffer4 = byteBuffer1.asLongBuffer();
        java.nio.ByteOrder byteOrder5 = byteBuffer1.order();
        byte[] byteArray6 = byteBuffer1.array();
        java.nio.ByteBuffer byteBuffer7 = java.nio.ByteBuffer.wrap(byteArray6);
        // The following exception was thrown during execution in test generation
        try {
            long long9 = byteBuffer7.getLong(3);
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
    public void test1484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1484");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.isReadOnly();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        int int4 = byteBuffer1.position();
        boolean boolean5 = byteBuffer1.isReadOnly();
        java.nio.CharBuffer charBuffer6 = byteBuffer1.asCharBuffer();
        boolean boolean8 = byteBuffer1.equals((java.lang.Object) (-1L));
        // The following exception was thrown during execution in test generation
        try {
            float float10 = byteBuffer1.getFloat(1);
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
    public void test1485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1485");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer2 = byteBuffer1.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        java.nio.ByteBuffer byteBuffer4 = byteBuffer1.compact();
        java.nio.ByteOrder byteOrder5 = byteBuffer4.order();
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
        java.nio.CharBuffer charBuffer21 = byteBuffer20.asCharBuffer();
        boolean boolean22 = byteBuffer4.equals((java.lang.Object) byteBuffer20);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer25 = byteBuffer20.putChar((int) (short) -1, 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(doubleBuffer2);
        org.junit.Assert.assertNotNull(shortBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertNotNull(byteOrder5);
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
        org.junit.Assert.assertNotNull(charBuffer21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test1486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1486");
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
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response5);
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response5);
        response11.statusMessage = "java.nio.HeapByteBuffer[pos=0 lim=32 cap=32]";
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1487");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect((int) '#');
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.putShort((short) 0);
        java.nio.ByteBuffer byteBuffer6 = byteBuffer3.putLong(1, (long) 10);
        java.nio.ByteBuffer byteBuffer9 = byteBuffer3.putShort(0, (short) (byte) 1);
        java.nio.ByteBuffer byteBuffer11 = java.nio.ByteBuffer.allocate((int) (byte) 100);
        java.nio.ByteBuffer byteBuffer13 = java.nio.ByteBuffer.allocate(0);
        boolean boolean14 = byteBuffer13.isReadOnly();
        java.nio.ShortBuffer shortBuffer15 = byteBuffer13.asShortBuffer();
        java.nio.ByteBuffer byteBuffer17 = java.nio.ByteBuffer.allocate(0);
        boolean boolean18 = byteBuffer17.isReadOnly();
        int int19 = byteBuffer13.compareTo(byteBuffer17);
        java.nio.Buffer buffer20 = byteBuffer17.clear();
        java.nio.ByteBuffer byteBuffer22 = java.nio.ByteBuffer.allocate(0);
        boolean boolean23 = byteBuffer22.hasRemaining();
        java.nio.ByteBuffer byteBuffer24 = byteBuffer17.put(byteBuffer22);
        java.nio.ByteBuffer byteBuffer25 = byteBuffer24.compact();
        java.nio.ByteBuffer byteBuffer26 = byteBuffer11.put(byteBuffer25);
        java.nio.ByteBuffer byteBuffer28 = java.nio.ByteBuffer.allocateDirect((int) '#');
        java.nio.ByteBuffer byteBuffer30 = byteBuffer28.putShort((short) 0);
        java.nio.ByteBuffer byteBuffer32 = byteBuffer28.putDouble((double) '\000');
        char char33 = byteBuffer32.getChar();
        java.nio.Buffer buffer34 = byteBuffer32.clear();
        boolean boolean35 = byteBuffer26.equals((java.lang.Object) byteBuffer32);
        int int36 = byteBuffer32.getInt();
        double double38 = byteBuffer32.getDouble((int) (byte) 10);
        boolean boolean39 = byteBuffer3.equals((java.lang.Object) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            long long41 = byteBuffer3.getLong(97);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer6);
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertNotNull(byteBuffer11);
        org.junit.Assert.assertNotNull(byteBuffer13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(shortBuffer15);
        org.junit.Assert.assertNotNull(byteBuffer17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(buffer20);
        org.junit.Assert.assertNotNull(byteBuffer22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(byteBuffer24);
        org.junit.Assert.assertNotNull(byteBuffer25);
        org.junit.Assert.assertNotNull(byteBuffer26);
        org.junit.Assert.assertNotNull(byteBuffer28);
        org.junit.Assert.assertNotNull(byteBuffer30);
        org.junit.Assert.assertNotNull(byteBuffer32);
        org.junit.Assert.assertTrue("'" + char33 + "' != '" + '\000' + "'", char33 == '\000');
        org.junit.Assert.assertNotNull(buffer34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 0.0d + "'", double38 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test1488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1488");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Request request4 = response3.req;
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response3);
        java.lang.String str6 = response5.contentType;
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response5);
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response5);
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response8);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response10 = org.jsoup.helper.HttpConnection.Response.execute(request0, response9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(request4);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test1489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1489");
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
        java.lang.String str14 = response13.statusMessage();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document15 = response13.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test1490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1490");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate((int) (byte) 100);
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.putDouble((double) '4');
        byte[] byteArray9 = new byte[] { (byte) 1, (byte) 100, (byte) -1, (byte) 10, (byte) -1 };
        java.nio.ByteBuffer byteBuffer10 = byteBuffer1.put(byteArray9);
        char char11 = byteBuffer10.getChar();
        java.nio.ByteBuffer byteBuffer12 = byteBuffer10.slice();
        org.jsoup.helper.HttpConnection.Response response13 = null;
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response13);
        java.lang.String str16 = response14.header("");
        org.jsoup.Connection.Response response18 = response14.removeCookie("hi!");
        java.lang.String str20 = response14.cookie("");
        java.lang.String str21 = response14.statusMessage();
        int int22 = response14.statusCode();
        java.lang.String str23 = response14.charset;
        response14.numRedirects = (byte) 1;
        boolean boolean26 = byteBuffer10.equals((java.lang.Object) response14);
        org.jsoup.helper.HttpConnection.Response response27 = null;
        org.jsoup.helper.HttpConnection.Response response28 = new org.jsoup.helper.HttpConnection.Response(response27);
        org.jsoup.helper.HttpConnection.Response response29 = new org.jsoup.helper.HttpConnection.Response(response27);
        org.jsoup.helper.HttpConnection.Response response30 = new org.jsoup.helper.HttpConnection.Response(response27);
        org.jsoup.helper.HttpConnection.Response response31 = new org.jsoup.helper.HttpConnection.Response(response27);
        org.jsoup.helper.HttpConnection.Response response32 = new org.jsoup.helper.HttpConnection.Response(response27);
        java.nio.ByteBuffer byteBuffer34 = java.nio.ByteBuffer.allocate(0);
        boolean boolean35 = byteBuffer34.hasRemaining();
        java.nio.ByteBuffer byteBuffer36 = byteBuffer34.asReadOnlyBuffer();
        boolean boolean37 = byteBuffer36.hasRemaining();
        response32.byteData = byteBuffer36;
        java.nio.Buffer buffer39 = byteBuffer36.mark();
        java.nio.ByteOrder byteOrder40 = byteBuffer36.order();
        java.nio.ByteBuffer byteBuffer41 = byteBuffer10.order(byteOrder40);
        char char42 = byteBuffer10.getChar();
        java.nio.Buffer buffer43 = byteBuffer10.flip();
        java.nio.ByteBuffer byteBuffer46 = byteBuffer10.putDouble(4, 10.0d);
        java.nio.ByteBuffer byteBuffer48 = java.nio.ByteBuffer.allocateDirect((int) '#');
        java.nio.ByteBuffer byteBuffer50 = byteBuffer48.putShort((short) 0);
        java.nio.ByteBuffer byteBuffer52 = java.nio.ByteBuffer.allocate((int) (byte) 10);
        byte[] byteArray56 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.nio.ByteBuffer byteBuffer57 = java.nio.ByteBuffer.wrap(byteArray56);
        java.nio.ByteBuffer byteBuffer58 = byteBuffer52.get(byteArray56);
        java.nio.Buffer buffer59 = byteBuffer52.rewind();
        byte[] byteArray63 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.nio.ByteBuffer byteBuffer64 = java.nio.ByteBuffer.wrap(byteArray63);
        java.nio.ByteBuffer byteBuffer65 = byteBuffer52.put(byteArray63);
        java.nio.ByteBuffer byteBuffer66 = java.nio.ByteBuffer.wrap(byteArray63);
        java.nio.ByteBuffer byteBuffer67 = byteBuffer50.put(byteArray63);
        java.nio.ByteBuffer byteBuffer69 = java.nio.ByteBuffer.allocate(0);
        boolean boolean70 = byteBuffer69.hasRemaining();
        java.nio.ByteBuffer byteBuffer71 = byteBuffer69.asReadOnlyBuffer();
        java.nio.LongBuffer longBuffer72 = byteBuffer69.asLongBuffer();
        java.nio.ByteOrder byteOrder73 = byteBuffer69.order();
        byte[] byteArray74 = byteBuffer69.array();
        java.nio.ByteBuffer byteBuffer75 = byteBuffer50.get(byteArray74);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer78 = byteBuffer46.put(byteArray74, 7, (int) (byte) 100);
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
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(response18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(byteBuffer34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(byteBuffer36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(buffer39);
        org.junit.Assert.assertNotNull(byteOrder40);
        org.junit.Assert.assertNotNull(byteBuffer41);
        org.junit.Assert.assertTrue("'" + char42 + "' != '" + '\000' + "'", char42 == '\000');
        org.junit.Assert.assertNotNull(buffer43);
        org.junit.Assert.assertNotNull(byteBuffer46);
        org.junit.Assert.assertNotNull(byteBuffer48);
        org.junit.Assert.assertNotNull(byteBuffer50);
        org.junit.Assert.assertNotNull(byteBuffer52);
        org.junit.Assert.assertNotNull(byteArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray56), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(byteBuffer57);
        org.junit.Assert.assertNotNull(byteBuffer58);
        org.junit.Assert.assertNotNull(buffer59);
        org.junit.Assert.assertNotNull(byteArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray63), "[100, 1, 1]");
        org.junit.Assert.assertNotNull(byteBuffer64);
        org.junit.Assert.assertNotNull(byteBuffer65);
        org.junit.Assert.assertNotNull(byteBuffer66);
        org.junit.Assert.assertNotNull(byteBuffer67);
        org.junit.Assert.assertNotNull(byteBuffer69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(byteBuffer71);
        org.junit.Assert.assertNotNull(longBuffer72);
        org.junit.Assert.assertNotNull(byteOrder73);
        org.junit.Assert.assertNotNull(byteArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray74), "[]");
        org.junit.Assert.assertNotNull(byteBuffer75);
    }

    @Test
    public void test1491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1491");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer2 = byteBuffer1.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        java.nio.ByteBuffer byteBuffer4 = byteBuffer1.compact();
        int int5 = byteBuffer1.remaining();
        boolean boolean6 = byteBuffer1.hasRemaining();
        org.jsoup.helper.HttpConnection.Response response7 = null;
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response7);
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response7);
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response7);
        java.nio.ByteBuffer byteBuffer11 = response10.byteData;
        org.jsoup.Connection.Response response14 = response10.cookie("hi!", "");
        boolean boolean15 = response10.executed;
        org.jsoup.Connection.Request request16 = response10.req;
        response10.executed = true;
        org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response(response10);
        java.lang.String str20 = response19.charset;
        org.jsoup.helper.HttpConnection.Response response21 = new org.jsoup.helper.HttpConnection.Response(response19);
        boolean boolean22 = byteBuffer1.equals((java.lang.Object) response19);
        org.jsoup.helper.HttpConnection.Response response23 = new org.jsoup.helper.HttpConnection.Response(response19);
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(doubleBuffer2);
        org.junit.Assert.assertNotNull(shortBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(request16);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test1492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1492");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.isReadOnly();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        int int4 = byteBuffer1.position();
        int int5 = byteBuffer1.capacity();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer7 = byteBuffer1.putLong((long) 93);
            org.junit.Assert.fail("Expected exception of type java.nio.BufferOverflowException; message: null");
        } catch (java.nio.BufferOverflowException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(shortBuffer3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test1493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1493");
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
        java.nio.ByteBuffer byteBuffer23 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer24 = byteBuffer23.asDoubleBuffer();
        boolean boolean25 = byteBuffer23.isDirect();
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
        java.nio.ByteBuffer byteBuffer39 = byteBuffer31.slice();
        java.nio.ByteBuffer byteBuffer40 = byteBuffer23.put(byteBuffer39);
        byte[] byteArray41 = byteBuffer39.array();
        java.nio.ByteBuffer byteBuffer42 = byteBuffer21.put(byteArray41);
        byte[] byteArray43 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer44 = byteBuffer21.put(byteArray43);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
        org.junit.Assert.assertNotNull(byteBuffer23);
        org.junit.Assert.assertNotNull(doubleBuffer24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
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
        org.junit.Assert.assertNotNull(byteBuffer40);
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray41), "[]");
        org.junit.Assert.assertNotNull(byteBuffer42);
    }

    @Test
    public void test1494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1494");
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
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response5);
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry15 = response5.scanHeaders("java.nio.HeapByteBuffer[pos=3 lim=10 cap=10]");
        java.lang.String str16 = response5.statusMessage;
        org.junit.Assert.assertNotNull(byteBuffer7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(byteBuffer12);
        org.junit.Assert.assertNull(strEntry15);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test1495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1495");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.isReadOnly();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        java.nio.ByteBuffer byteBuffer5 = java.nio.ByteBuffer.allocate(0);
        boolean boolean6 = byteBuffer5.isReadOnly();
        int int7 = byteBuffer1.compareTo(byteBuffer5);
        java.nio.DoubleBuffer doubleBuffer8 = byteBuffer5.asDoubleBuffer();
        java.nio.FloatBuffer floatBuffer9 = byteBuffer5.asFloatBuffer();
        java.lang.String str10 = byteBuffer5.toString();
        java.nio.Buffer buffer11 = byteBuffer5.rewind();
        boolean boolean12 = byteBuffer5.isDirect();
        java.nio.ByteBuffer byteBuffer14 = java.nio.ByteBuffer.allocate((int) (byte) 10);
        byte[] byteArray18 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.nio.ByteBuffer byteBuffer19 = java.nio.ByteBuffer.wrap(byteArray18);
        java.nio.ByteBuffer byteBuffer20 = byteBuffer14.get(byteArray18);
        java.nio.Buffer buffer21 = byteBuffer14.rewind();
        int int22 = byteBuffer14.position();
        java.nio.Buffer buffer23 = byteBuffer14.rewind();
        java.nio.ByteBuffer byteBuffer24 = byteBuffer14.slice();
        java.nio.ByteOrder byteOrder25 = byteBuffer14.order();
        java.nio.ByteBuffer byteBuffer26 = byteBuffer5.order(byteOrder25);
        // The following exception was thrown during execution in test generation
        try {
            double double27 = byteBuffer5.getDouble();
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
        org.junit.Assert.assertNotNull(doubleBuffer8);
        org.junit.Assert.assertNotNull(floatBuffer9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]" + "'", str10, "java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]");
        org.junit.Assert.assertNotNull(buffer11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(byteBuffer14);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(byteBuffer19);
        org.junit.Assert.assertNotNull(byteBuffer20);
        org.junit.Assert.assertNotNull(buffer21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(buffer23);
        org.junit.Assert.assertNotNull(byteBuffer24);
        org.junit.Assert.assertNotNull(byteOrder25);
        org.junit.Assert.assertNotNull(byteBuffer26);
    }

    @Test
    public void test1496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1496");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.isReadOnly();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        java.nio.ByteBuffer byteBuffer5 = java.nio.ByteBuffer.allocate(0);
        boolean boolean6 = byteBuffer5.isReadOnly();
        int int7 = byteBuffer1.compareTo(byteBuffer5);
        java.nio.ByteBuffer byteBuffer8 = byteBuffer5.compact();
        java.nio.Buffer buffer10 = byteBuffer5.limit((int) (short) 0);
        int int11 = byteBuffer5.remaining();
        java.nio.CharBuffer charBuffer12 = byteBuffer5.asCharBuffer();
        // The following exception was thrown during execution in test generation
        try {
            short short13 = byteBuffer5.getShort();
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
        org.junit.Assert.assertNotNull(charBuffer12);
    }

    @Test
    public void test1497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1497");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request3 = response2.req;
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response2);
        java.lang.String str5 = response4.contentType;
        boolean boolean7 = response4.hasHeader("hi!");
        java.lang.String str8 = response4.contentType();
        java.net.URL uRL9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response10 = response4.url(uRL9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(request3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test1498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1498");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer2 = byteBuffer1.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        java.nio.ByteBuffer byteBuffer4 = byteBuffer1.compact();
        java.nio.ByteOrder byteOrder5 = byteBuffer4.order();
        java.nio.CharBuffer charBuffer6 = byteBuffer4.asCharBuffer();
        java.nio.Buffer buffer7 = byteBuffer4.mark();
        // The following exception was thrown during execution in test generation
        try {
            byte byte8 = byteBuffer4.get();
            org.junit.Assert.fail("Expected exception of type java.nio.BufferUnderflowException; message: null");
        } catch (java.nio.BufferUnderflowException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(doubleBuffer2);
        org.junit.Assert.assertNotNull(shortBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertNotNull(byteOrder5);
        org.junit.Assert.assertNotNull(charBuffer6);
        org.junit.Assert.assertNotNull(buffer7);
    }

    @Test
    public void test1499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1499");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.nio.ByteBuffer byteBuffer4 = response3.byteData;
        org.jsoup.Connection.Response response7 = response3.cookie("hi!", "");
        boolean boolean8 = response3.executed;
        org.jsoup.Connection.Request request9 = response3.req;
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response3);
        boolean boolean11 = response10.executed;
        org.jsoup.Connection.Request request12 = null;
        response10.req = request12;
        response10.numRedirects = ' ';
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response10);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Too many redirects occurred trying to load URL null");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(byteBuffer4);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(request9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1500");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.executed = false;
        java.lang.String str4 = response1.contentType;
        int int5 = response1.statusCode;
        java.lang.String str6 = response1.charset();
        org.jsoup.Connection.Request request7 = null;
        response1.req = request7;
        java.lang.String str9 = response1.charset;
        java.lang.String str10 = response1.charset;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
    }
}

