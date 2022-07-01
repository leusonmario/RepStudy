import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

    public static boolean debug = false;

    @Test
    public void test0501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0501");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer2 = byteBuffer1.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        byte[] byteArray4 = byteBuffer1.array();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer7 = java.nio.ByteBuffer.wrap(byteArray4, (int) (short) -1, (int) '#');
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
    public void test0502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0502");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean3 = response2.executed;
        java.lang.String str5 = response2.getHeaderCaseInsensitive("");
        java.lang.String str7 = response2.cookie("java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]");
        int int8 = response2.statusCode();
        org.jsoup.Connection.Response response11 = response2.cookie("hi!", "");
        int int12 = response2.statusCode;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = response2.body();
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
    }

    @Test
    public void test0503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0503");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.hasRemaining();
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.asReadOnlyBuffer();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer6 = byteBuffer3.putShort(3, (short) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.nio.ReadOnlyBufferException; message: null");
        } catch (java.nio.ReadOnlyBufferException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(byteBuffer3);
    }

    @Test
    public void test0504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0504");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response1);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response4 = org.jsoup.helper.HttpConnection.Response.execute(request0, response1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0505");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer2 = byteBuffer1.asDoubleBuffer();
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.compact();
        java.lang.String str4 = byteBuffer1.toString();
        int int5 = byteBuffer1.arrayOffset();
        java.nio.FloatBuffer floatBuffer6 = byteBuffer1.asFloatBuffer();
        // The following exception was thrown during execution in test generation
        try {
            double double8 = byteBuffer1.getDouble(1677787392);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(doubleBuffer2);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]" + "'", str4, "java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(floatBuffer6);
    }

    @Test
    public void test0506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0506");
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
        byte[] byteArray19 = byteBuffer17.array();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer22 = byteBuffer17.putShort((int) (short) -1, (short) 1);
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
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[]");
    }

    @Test
    public void test0507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0507");
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
        java.lang.String str14 = response5.cookie("hi!");
        java.lang.Class<?> wildcardClass15 = response5.getClass();
        org.junit.Assert.assertNotNull(byteBuffer7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(byteBuffer12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0508");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.nio.ByteBuffer byteBuffer4 = response3.byteData;
        java.lang.String str5 = response3.statusMessage();
        java.lang.String str6 = response3.charset;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response3);
// flaky:             org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Too many redirects occurred trying to load URL null");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(byteBuffer4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0509");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect((int) '#');
        float float3 = byteBuffer1.getFloat(1);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.Buffer buffer4 = byteBuffer1.reset();
            org.junit.Assert.fail("Expected exception of type java.nio.InvalidMarkException; message: null");
        } catch (java.nio.InvalidMarkException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test0510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0510");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer2 = byteBuffer1.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        java.nio.ByteBuffer byteBuffer4 = byteBuffer1.compact();
        java.nio.ByteBuffer byteBuffer5 = byteBuffer1.duplicate();
        // The following exception was thrown during execution in test generation
        try {
            char char7 = byteBuffer1.getChar((int) (short) 100);
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
    public void test0511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0511");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate((int) (byte) 10);
        int int2 = byteBuffer1.getInt();
        java.nio.ByteBuffer byteBuffer5 = byteBuffer1.put((int) (byte) 0, (byte) 10);
        java.nio.IntBuffer intBuffer6 = byteBuffer1.asIntBuffer();
        byte[] byteArray10 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.nio.ByteBuffer byteBuffer11 = java.nio.ByteBuffer.wrap(byteArray10);
        java.nio.ByteBuffer byteBuffer12 = java.nio.ByteBuffer.wrap(byteArray10);
        java.nio.ByteBuffer byteBuffer13 = byteBuffer1.get(byteArray10);
        // The following exception was thrown during execution in test generation
        try {
            float float15 = byteBuffer1.getFloat(35);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertNotNull(intBuffer6);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(byteBuffer11);
        org.junit.Assert.assertNotNull(byteBuffer12);
        org.junit.Assert.assertNotNull(byteBuffer13);
    }

    @Test
    public void test0512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0512");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer2 = byteBuffer1.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        int int4 = byteBuffer1.capacity();
        java.nio.DoubleBuffer doubleBuffer5 = byteBuffer1.asDoubleBuffer();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer7 = byteBuffer1.putLong((long) 1677787392);
            org.junit.Assert.fail("Expected exception of type java.nio.BufferOverflowException; message: null");
        } catch (java.nio.BufferOverflowException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(doubleBuffer2);
        org.junit.Assert.assertNotNull(shortBuffer3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(doubleBuffer5);
    }

    @Test
    public void test0513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0513");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.header("");
        org.jsoup.Connection.Response response5 = response1.removeCookie("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap6 = response1.headers();
        java.nio.ByteBuffer byteBuffer7 = response1.byteData;
        java.net.URL uRL8 = response1.url();
        response1.contentType = "java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]";
        java.net.URL uRL11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response12 = response1.url(uRL11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNull(byteBuffer7);
        org.junit.Assert.assertNull(uRL8);
    }

    @Test
    public void test0514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0514");
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
        java.nio.FloatBuffer floatBuffer13 = byteBuffer12.asFloatBuffer();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer15 = byteBuffer12.putShort((short) (byte) 100);
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
        org.junit.Assert.assertNotNull(floatBuffer13);
    }

    @Test
    public void test0515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0515");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.hasRemaining();
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.asReadOnlyBuffer();
        java.nio.DoubleBuffer doubleBuffer4 = byteBuffer1.asDoubleBuffer();
        java.nio.IntBuffer intBuffer5 = byteBuffer1.asIntBuffer();
        java.nio.ByteBuffer byteBuffer6 = byteBuffer1.compact();
        java.nio.ByteOrder byteOrder7 = null;
        java.nio.ByteBuffer byteBuffer8 = byteBuffer6.order(byteOrder7);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.Buffer buffer10 = byteBuffer6.position(35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: newPosition > limit: (35 > 0)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertNotNull(doubleBuffer4);
        org.junit.Assert.assertNotNull(intBuffer5);
        org.junit.Assert.assertNotNull(byteBuffer6);
        org.junit.Assert.assertNotNull(byteBuffer8);
    }

    @Test
    public void test0516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0516");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.nio.ByteBuffer byteBuffer8 = java.nio.ByteBuffer.allocate(0);
        boolean boolean9 = byteBuffer8.hasRemaining();
        java.nio.ByteBuffer byteBuffer10 = byteBuffer8.asReadOnlyBuffer();
        boolean boolean11 = byteBuffer10.hasRemaining();
        response6.byteData = byteBuffer10;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response13 = org.jsoup.helper.HttpConnection.Response.execute(request0, response6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(byteBuffer10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0517");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer2 = byteBuffer1.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        java.nio.ByteOrder byteOrder4 = null;
        java.nio.ByteBuffer byteBuffer5 = byteBuffer1.order(byteOrder4);
        java.nio.FloatBuffer floatBuffer6 = byteBuffer1.asFloatBuffer();
        java.nio.ByteBuffer byteBuffer8 = java.nio.ByteBuffer.allocate((int) (byte) 10);
        byte[] byteArray12 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.nio.ByteBuffer byteBuffer13 = java.nio.ByteBuffer.wrap(byteArray12);
        java.nio.ByteBuffer byteBuffer14 = byteBuffer8.get(byteArray12);
        java.nio.Buffer buffer15 = byteBuffer8.rewind();
        java.nio.ByteOrder byteOrder16 = byteBuffer8.order();
        boolean boolean17 = byteBuffer8.hasRemaining();
        byte[] byteArray20 = new byte[] { (byte) 10, (byte) 1 };
        java.nio.ByteBuffer byteBuffer21 = byteBuffer8.put(byteArray20);
        java.nio.ByteBuffer byteBuffer22 = java.nio.ByteBuffer.wrap(byteArray20);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer23 = byteBuffer1.get(byteArray20);
            org.junit.Assert.fail("Expected exception of type java.nio.BufferUnderflowException; message: null");
        } catch (java.nio.BufferUnderflowException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(doubleBuffer2);
        org.junit.Assert.assertNotNull(shortBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertNotNull(floatBuffer6);
        org.junit.Assert.assertNotNull(byteBuffer8);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(byteBuffer13);
        org.junit.Assert.assertNotNull(byteBuffer14);
        org.junit.Assert.assertNotNull(buffer15);
        org.junit.Assert.assertNotNull(byteOrder16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[10, 1]");
        org.junit.Assert.assertNotNull(byteBuffer21);
        org.junit.Assert.assertNotNull(byteBuffer22);
    }

    @Test
    public void test0518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0518");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.isReadOnly();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        java.nio.ByteBuffer byteBuffer5 = java.nio.ByteBuffer.allocate(0);
        boolean boolean6 = byteBuffer5.isReadOnly();
        int int7 = byteBuffer1.compareTo(byteBuffer5);
        java.nio.ByteBuffer byteBuffer8 = byteBuffer5.compact();
        java.nio.ByteBuffer byteBuffer9 = byteBuffer8.asReadOnlyBuffer();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer11 = byteBuffer8.putFloat((float) (short) 1);
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
        org.junit.Assert.assertNotNull(byteBuffer9);
    }

    @Test
    public void test0519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0519");
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
            short short25 = byteBuffer20.getShort(1677787392);
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
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test0520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0520");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.header("");
        org.jsoup.Connection.Response response5 = response1.removeCookie("hi!");
        java.lang.String str6 = response1.charset();
        response1.contentType = "java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]";
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Too many redirects occurred trying to load URL null");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0521");
        org.jsoup.helper.HttpConnection.Response.MAX_REDIRECTS = (short) -1;
    }

    @Test
    public void test0522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0522");
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
            java.nio.ByteBuffer byteBuffer15 = byteBuffer1.put(3, (byte) 100);
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
    public void test0523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0523");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer2 = byteBuffer1.asDoubleBuffer();
        boolean boolean3 = byteBuffer1.isDirect();
        int int4 = byteBuffer1.arrayOffset();
        java.nio.Buffer buffer5 = byteBuffer1.mark();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer7 = byteBuffer1.putDouble(10.0d);
            org.junit.Assert.fail("Expected exception of type java.nio.BufferOverflowException; message: null");
        } catch (java.nio.BufferOverflowException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(doubleBuffer2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(buffer5);
    }

    @Test
    public void test0524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0524");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer2 = byteBuffer1.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        int int4 = byteBuffer1.limit();
        byte[] byteArray5 = byteBuffer1.array();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer8 = byteBuffer1.putChar((int) '4', '4');
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
    public void test0525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0525");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.isReadOnly();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer5 = byteBuffer1.putChar('#');
            org.junit.Assert.fail("Expected exception of type java.nio.BufferOverflowException; message: null");
        } catch (java.nio.BufferOverflowException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(shortBuffer3);
    }

    @Test
    public void test0526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0526");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect(0);
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
    public void test0527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0527");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.isReadOnly();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        java.nio.ByteBuffer byteBuffer5 = java.nio.ByteBuffer.allocate(0);
        boolean boolean6 = byteBuffer5.isReadOnly();
        int int7 = byteBuffer1.compareTo(byteBuffer5);
        java.nio.Buffer buffer8 = byteBuffer5.clear();
        boolean boolean9 = buffer8.isReadOnly();
        boolean boolean10 = buffer8.isReadOnly();
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(shortBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(buffer8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0528");
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
            int int15 = byteBuffer5.getInt(3);
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
    public void test0529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0529");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response2);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Too many redirects occurred trying to load URL null");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(request3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNull(request12);
    }

    @Test
    public void test0530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0530");
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
        java.nio.ByteBuffer byteBuffer26 = byteBuffer23.duplicate();
        java.nio.ByteBuffer byteBuffer27 = byteBuffer23.slice();
        java.nio.Buffer buffer28 = byteBuffer23.mark();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer29 = byteBuffer20.put(byteBuffer23);
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
        org.junit.Assert.assertNotNull(byteBuffer26);
        org.junit.Assert.assertNotNull(byteBuffer27);
        org.junit.Assert.assertNotNull(buffer28);
    }

    @Test
    public void test0531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0531");
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
        char char25 = byteBuffer21.getChar();
        // The following exception was thrown during execution in test generation
        try {
            long long26 = byteBuffer21.getLong();
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
        org.junit.Assert.assertTrue("'" + char25 + "' != '" + '\000' + "'", char25 == '\000');
    }

    @Test
    public void test0532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0532");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response1);
        int int7 = response6.statusCode;
        response6.contentType = "hi!";
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response10 = org.jsoup.helper.HttpConnection.Response.execute(request0, response6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0533");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate((int) (byte) 100);
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.putDouble((double) '4');
        double double4 = byteBuffer1.getDouble();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.Buffer buffer5 = byteBuffer1.reset();
            org.junit.Assert.fail("Expected exception of type java.nio.InvalidMarkException; message: null");
        } catch (java.nio.InvalidMarkException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test0534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0534");
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
            byte byte17 = byteBuffer13.get(1);
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0535");
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
            byte byte13 = byteBuffer11.get();
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
    public void test0536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0536");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.isReadOnly();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        int int4 = byteBuffer1.position();
        java.nio.ByteOrder byteOrder5 = null;
        java.nio.ByteBuffer byteBuffer6 = byteBuffer1.order(byteOrder5);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.Buffer buffer8 = byteBuffer1.limit((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(shortBuffer3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(byteBuffer6);
    }

    @Test
    public void test0537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0537");
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
            java.nio.ByteBuffer byteBuffer16 = byteBuffer13.putInt((int) '\000', (int) '4');
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
    public void test0538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0538");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean3 = response2.executed;
        java.lang.String str5 = response2.getHeaderCaseInsensitive("");
        java.net.URL uRL6 = response2.url();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry8 = response2.scanHeaders("");
        response2.statusMessage = "";
        java.lang.String str11 = response2.charset();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response2);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Too many redirects occurred trying to load URL null");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(strEntry8);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0539");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer2 = byteBuffer1.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        byte[] byteArray4 = byteBuffer1.array();
        java.nio.ByteBuffer byteBuffer5 = java.nio.ByteBuffer.wrap(byteArray4);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer8 = byteBuffer5.putLong((int) (short) -1, (long) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(doubleBuffer2);
        org.junit.Assert.assertNotNull(shortBuffer3);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[]");
        org.junit.Assert.assertNotNull(byteBuffer5);
    }

    @Test
    public void test0540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0540");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request3 = response2.req;
        org.jsoup.Connection.Method method4 = response2.method();
        java.lang.String str5 = response2.contentType;
        java.lang.Class<?> wildcardClass6 = response2.getClass();
        org.junit.Assert.assertNull(request3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0541");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.nio.ByteBuffer byteBuffer4 = response3.byteData;
        org.jsoup.Connection.Response response7 = response3.cookie("hi!", "");
        boolean boolean8 = response3.executed;
        org.jsoup.Connection.Request request9 = response3.req;
        org.jsoup.Connection.Response response12 = response3.header("java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]", "java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = response3.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(byteBuffer4);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(request9);
        org.junit.Assert.assertNotNull(response12);
    }

    @Test
    public void test0542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0542");
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
        java.nio.LongBuffer longBuffer14 = byteBuffer13.asLongBuffer();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.Buffer buffer16 = byteBuffer13.limit((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
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
        org.junit.Assert.assertNotNull(longBuffer14);
    }

    @Test
    public void test0543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0543");
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
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer21 = byteBuffer13.putDouble((int) (byte) 0, (double) (-1L));
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
    }

    @Test
    public void test0544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0544");
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
            java.nio.ByteBuffer byteBuffer10 = byteBuffer6.put((byte) 1);
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
    public void test0545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0545");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.header("");
        org.jsoup.Connection.Response response5 = response1.removeCookie("hi!");
        java.lang.String str7 = response1.cookie("");
        java.lang.String str8 = response1.statusMessage();
        int int9 = response1.statusCode;
        int int10 = response1.statusCode;
        java.net.URL uRL11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response12 = response1.url(uRL11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
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
    public void test0546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0546");
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
        // The following exception was thrown during execution in test generation
        try {
            long long13 = byteBuffer5.getLong(35);
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
    }

    @Test
    public void test0547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0547");
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
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer20 = byteBuffer16.putLong(0, 0L);
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
    }

    @Test
    public void test0548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0548");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate((int) (byte) 10);
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.nio.ByteBuffer byteBuffer6 = java.nio.ByteBuffer.wrap(byteArray5);
        java.nio.ByteBuffer byteBuffer7 = byteBuffer1.get(byteArray5);
        java.nio.Buffer buffer8 = byteBuffer1.rewind();
        byte[] byteArray12 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.nio.ByteBuffer byteBuffer13 = java.nio.ByteBuffer.wrap(byteArray12);
        java.nio.ByteBuffer byteBuffer14 = byteBuffer1.put(byteArray12);
        byte byte16 = byteBuffer1.get(0);
        // The following exception was thrown during execution in test generation
        try {
            double double17 = byteBuffer1.getDouble();
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
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[100, 1, 1]");
        org.junit.Assert.assertNotNull(byteBuffer13);
        org.junit.Assert.assertNotNull(byteBuffer14);
        org.junit.Assert.assertTrue("'" + byte16 + "' != '" + (byte) 100 + "'", byte16 == (byte) 100);
    }

    @Test
    public void test0549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0549");
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
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer18 = byteBuffer13.putShort((short) -1);
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
        org.junit.Assert.assertNotNull(buffer14);
        org.junit.Assert.assertNotNull(byteBuffer15);
        org.junit.Assert.assertNotNull(intBuffer16);
    }

    @Test
    public void test0550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0550");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response7 = response5.removeHeader("java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]");
        java.net.HttpURLConnection httpURLConnection8 = null;
        org.jsoup.helper.HttpConnection.Response response9 = null;
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response9);
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response9);
        org.jsoup.Connection.Request request12 = response11.req;
        org.jsoup.Connection.Method method13 = response11.method();
        response11.statusMessage = "java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]";
        // The following exception was thrown during execution in test generation
        try {
            response5.setupFromConnection(httpURLConnection8, (org.jsoup.Connection.Response) response11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(request12);
        org.junit.Assert.assertNull(method13);
    }

    @Test
    public void test0551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0551");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.nio.ByteBuffer byteBuffer4 = response3.byteData;
        java.lang.String str5 = response3.statusMessage();
        java.lang.String str6 = response3.charset;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document7 = response3.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(byteBuffer4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0552");
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
        // The following exception was thrown during execution in test generation
        try {
            float float22 = byteBuffer20.getFloat((int) (short) 1);
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
    }

    @Test
    public void test0553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0553");
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
        java.lang.String str16 = byteBuffer13.toString();
        int int17 = byteBuffer13.limit();
        java.nio.ByteBuffer byteBuffer19 = java.nio.ByteBuffer.allocate((int) (byte) 100);
        java.nio.ByteBuffer byteBuffer21 = byteBuffer19.putDouble((double) '4');
        byte[] byteArray27 = new byte[] { (byte) 1, (byte) 100, (byte) -1, (byte) 10, (byte) -1 };
        java.nio.ByteBuffer byteBuffer28 = byteBuffer19.put(byteArray27);
        java.nio.ByteBuffer byteBuffer31 = java.nio.ByteBuffer.wrap(byteArray27, (int) '\000', 0);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer34 = byteBuffer13.get(byteArray27, 10, 3);
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
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]" + "'", str16, "java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(byteBuffer19);
        org.junit.Assert.assertNotNull(byteBuffer21);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[1, 100, -1, 10, -1]");
        org.junit.Assert.assertNotNull(byteBuffer28);
        org.junit.Assert.assertNotNull(byteBuffer31);
    }

    @Test
    public void test0554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0554");
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
            java.nio.ByteBuffer byteBuffer15 = byteBuffer4.putFloat(31, (float) (short) 0);
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
    }

    @Test
    public void test0555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0555");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.isReadOnly();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        int int4 = byteBuffer1.position();
        java.nio.ByteOrder byteOrder5 = null;
        java.nio.ByteBuffer byteBuffer6 = byteBuffer1.order(byteOrder5);
        java.nio.ByteBuffer byteBuffer7 = byteBuffer1.asReadOnlyBuffer();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer9 = byteBuffer7.putChar('#');
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
    }

    @Test
    public void test0556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0556");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean3 = response2.executed;
        response2.statusCode = 0;
        org.jsoup.Connection.Method method6 = response2.method();
        java.net.URL uRL7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response8 = response2.url(uRL7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(method6);
    }

    @Test
    public void test0557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0557");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer2 = byteBuffer1.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        java.nio.ByteBuffer byteBuffer4 = byteBuffer1.compact();
        java.nio.ByteBuffer byteBuffer5 = byteBuffer1.slice();
        java.nio.Buffer buffer6 = byteBuffer5.flip();
        int int7 = byteBuffer5.position();
        java.nio.ByteBuffer byteBuffer9 = java.nio.ByteBuffer.allocate((int) (byte) 10);
        byte[] byteArray13 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.nio.ByteBuffer byteBuffer14 = java.nio.ByteBuffer.wrap(byteArray13);
        java.nio.ByteBuffer byteBuffer15 = byteBuffer9.get(byteArray13);
        java.nio.Buffer buffer16 = byteBuffer9.rewind();
        java.nio.ByteOrder byteOrder17 = byteBuffer9.order();
        boolean boolean18 = byteBuffer9.hasRemaining();
        byte[] byteArray21 = new byte[] { (byte) 10, (byte) 1 };
        java.nio.ByteBuffer byteBuffer22 = byteBuffer9.put(byteArray21);
        java.nio.ByteBuffer byteBuffer23 = java.nio.ByteBuffer.wrap(byteArray21);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer26 = byteBuffer5.get(byteArray21, 0, (int) (short) -1);
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
        org.junit.Assert.assertNotNull(byteBuffer23);
    }

    @Test
    public void test0558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0558");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.ByteBuffer byteBuffer2 = byteBuffer1.slice();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer6 = byteBuffer1.putShort((int) (short) 1, (short) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteBuffer2);
        org.junit.Assert.assertNotNull(shortBuffer3);
    }

    @Test
    public void test0559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0559");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer2 = byteBuffer1.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        java.nio.ByteOrder byteOrder4 = null;
        java.nio.ByteBuffer byteBuffer5 = byteBuffer1.order(byteOrder4);
        java.nio.ByteBuffer byteBuffer6 = byteBuffer5.asReadOnlyBuffer();
        int int7 = byteBuffer5.arrayOffset();
        // The following exception was thrown during execution in test generation
        try {
            double double8 = byteBuffer5.getDouble();
            org.junit.Assert.fail("Expected exception of type java.nio.BufferUnderflowException; message: null");
        } catch (java.nio.BufferUnderflowException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(doubleBuffer2);
        org.junit.Assert.assertNotNull(shortBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertNotNull(byteBuffer6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0560");
        org.jsoup.helper.HttpConnection.Response.MAX_REDIRECTS = 10;
    }

    @Test
    public void test0561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0561");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer2 = byteBuffer1.asDoubleBuffer();
        boolean boolean3 = byteBuffer1.isDirect();
        java.lang.String str4 = byteBuffer1.toString();
        byte[] byteArray5 = byteBuffer1.array();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer8 = byteBuffer1.putShort((int) '4', (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(doubleBuffer2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]" + "'", str4, "java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]");
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[]");
    }

    @Test
    public void test0562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0562");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean3 = response2.executed;
        java.lang.String str5 = response2.getHeaderCaseInsensitive("");
        java.lang.String str7 = response2.cookie("java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]");
        int int8 = response2.statusCode();
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response2);
        java.net.HttpURLConnection httpURLConnection10 = null;
        org.jsoup.helper.HttpConnection.Response response11 = null;
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response11);
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response11);
        boolean boolean14 = response13.executed;
        java.lang.String str16 = response13.getHeaderCaseInsensitive("");
        java.net.URL uRL17 = response13.url();
        org.jsoup.Connection.Response response19 = response13.removeCookie("");
        java.lang.String str20 = response13.charset();
        response13.contentType = "hi!";
        org.jsoup.helper.HttpConnection.Response response23 = new org.jsoup.helper.HttpConnection.Response(response13);
        // The following exception was thrown during execution in test generation
        try {
            response2.setupFromConnection(httpURLConnection10, (org.jsoup.Connection.Response) response13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(uRL17);
        org.junit.Assert.assertNotNull(response19);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test0563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0563");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer2 = byteBuffer1.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        java.nio.ByteBuffer byteBuffer4 = byteBuffer1.compact();
        java.nio.ByteBuffer byteBuffer5 = byteBuffer1.slice();
        java.nio.Buffer buffer6 = byteBuffer5.flip();
        int int7 = byteBuffer5.position();
        java.nio.ByteBuffer byteBuffer9 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer10 = byteBuffer9.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer11 = byteBuffer9.asShortBuffer();
        java.nio.ByteOrder byteOrder12 = null;
        java.nio.ByteBuffer byteBuffer13 = byteBuffer9.order(byteOrder12);
        java.nio.ByteBuffer byteBuffer15 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer16 = byteBuffer15.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer17 = byteBuffer15.asShortBuffer();
        int int18 = byteBuffer15.limit();
        byte[] byteArray19 = byteBuffer15.array();
        java.nio.ByteBuffer byteBuffer20 = byteBuffer9.put(byteArray19);
        int int21 = byteBuffer20.position();
        int int22 = byteBuffer5.compareTo(byteBuffer20);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer24 = byteBuffer5.putFloat((float) '#');
            org.junit.Assert.fail("Expected exception of type java.nio.BufferOverflowException; message: null");
        } catch (java.nio.BufferOverflowException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(doubleBuffer2);
        org.junit.Assert.assertNotNull(shortBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertNotNull(buffer6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertNotNull(doubleBuffer10);
        org.junit.Assert.assertNotNull(shortBuffer11);
        org.junit.Assert.assertNotNull(byteBuffer13);
        org.junit.Assert.assertNotNull(byteBuffer15);
        org.junit.Assert.assertNotNull(doubleBuffer16);
        org.junit.Assert.assertNotNull(shortBuffer17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[]");
        org.junit.Assert.assertNotNull(byteBuffer20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test0564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0564");
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
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray18 = byteBuffer17.array();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
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
    public void test0565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0565");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.isReadOnly();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        int int4 = byteBuffer1.position();
        java.nio.ByteOrder byteOrder5 = null;
        java.nio.ByteBuffer byteBuffer6 = byteBuffer1.order(byteOrder5);
        java.lang.String str7 = byteBuffer6.toString();
        java.nio.ByteBuffer byteBuffer8 = byteBuffer6.slice();
        byte[] byteArray12 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.nio.ByteBuffer byteBuffer13 = java.nio.ByteBuffer.wrap(byteArray12);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer16 = byteBuffer8.get(byteArray12, (int) 'a', (int) (short) -1);
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
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[100, 1, 1]");
        org.junit.Assert.assertNotNull(byteBuffer13);
    }

    @Test
    public void test0566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0566");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.nio.ByteBuffer byteBuffer4 = response3.byteData;
        org.jsoup.Connection.Response response7 = response3.cookie("hi!", "");
        java.net.URL uRL8 = response3.url();
        response3.charset = "";
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response3);
        response11.statusMessage = "";
        org.junit.Assert.assertNull(byteBuffer4);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(uRL8);
    }

    @Test
    public void test0567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0567");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean5 = response3.hasHeader("hi!");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry7 = response3.scanHeaders("java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(strEntry7);
    }

    @Test
    public void test0568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0568");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.nio.ByteBuffer byteBuffer4 = response3.byteData;
        java.lang.String str5 = response3.charset;
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray6 = response3.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(byteBuffer4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0569");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.nio.ByteBuffer byteBuffer4 = response3.byteData;
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response3);
        org.jsoup.Connection.Method method6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response7 = response5.method(method6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(byteBuffer4);
    }

    @Test
    public void test0570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0570");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.nio.ByteBuffer byteBuffer4 = response3.byteData;
        org.jsoup.Connection.Response response7 = response3.cookie("hi!", "");
        java.net.URL uRL8 = response3.url();
        response3.charset = "";
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = response11.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(byteBuffer4);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(uRL8);
    }

    @Test
    public void test0571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0571");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.isReadOnly();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        java.nio.ByteBuffer byteBuffer5 = java.nio.ByteBuffer.allocate(0);
        boolean boolean6 = byteBuffer5.isReadOnly();
        int int7 = byteBuffer1.compareTo(byteBuffer5);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer10 = byteBuffer1.putDouble((int) '4', (double) (short) 0);
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
    public void test0572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0572");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.nio.ByteBuffer byteBuffer4 = response3.byteData;
        java.net.URL uRL5 = response3.url();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response3);
        boolean boolean8 = response3.hasHeader("hi!");
        java.lang.Class<?> wildcardClass9 = response3.getClass();
        org.junit.Assert.assertNull(byteBuffer4);
        org.junit.Assert.assertNull(uRL5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0573");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer2 = byteBuffer1.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        java.nio.ByteBuffer byteBuffer4 = byteBuffer1.compact();
        java.nio.ByteOrder byteOrder5 = byteBuffer4.order();
        // The following exception was thrown during execution in test generation
        try {
            float float7 = byteBuffer4.getFloat((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(doubleBuffer2);
        org.junit.Assert.assertNotNull(shortBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertNotNull(byteOrder5);
    }

    @Test
    public void test0574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0574");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect((int) '#');
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.putShort((short) 0);
        java.nio.ByteBuffer byteBuffer5 = byteBuffer1.putDouble((double) '\000');
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer8 = byteBuffer5.putLong((int) ' ', (long) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer5);
    }

    @Test
    public void test0575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0575");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.nio.ByteBuffer byteBuffer4 = response3.byteData;
        org.jsoup.Connection.Response response7 = response3.cookie("hi!", "");
        java.net.URL uRL8 = response3.url();
        response3.statusMessage = "java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]";
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response13 = response3.cookie("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(byteBuffer4);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(uRL8);
    }

    @Test
    public void test0576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0576");
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
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer26 = byteBuffer20.putLong(0L);
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
        org.junit.Assert.assertNotNull(shortBuffer24);
    }

    @Test
    public void test0577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0577");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Method method6 = response5.method();
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray7 = response5.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method6);
    }

    @Test
    public void test0578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0578");
        byte[] byteArray0 = new byte[] {};
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.wrap(byteArray0);
        java.nio.Buffer buffer2 = byteBuffer1.flip();
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.asReadOnlyBuffer();
        java.nio.ByteBuffer byteBuffer4 = byteBuffer1.duplicate();
        int int5 = byteBuffer1.position();
        // The following exception was thrown during execution in test generation
        try {
            short short7 = byteBuffer1.getShort(0);
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
    public void test0579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0579");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.isReadOnly();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        java.nio.ByteBuffer byteBuffer5 = java.nio.ByteBuffer.allocate(0);
        boolean boolean6 = byteBuffer5.isReadOnly();
        int int7 = byteBuffer1.compareTo(byteBuffer5);
        java.nio.Buffer buffer9 = byteBuffer1.limit(0);
        java.nio.Buffer buffer10 = byteBuffer1.rewind();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer12 = byteBuffer1.putChar('a');
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
        org.junit.Assert.assertNotNull(buffer9);
        org.junit.Assert.assertNotNull(buffer10);
    }

    @Test
    public void test0580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0580");
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
        char char25 = byteBuffer21.getChar();
        // The following exception was thrown during execution in test generation
        try {
            float float26 = byteBuffer21.getFloat();
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
        org.junit.Assert.assertTrue("'" + char25 + "' != '" + '\000' + "'", char25 == '\000');
    }

    @Test
    public void test0581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0581");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.isReadOnly();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        java.nio.ByteBuffer byteBuffer5 = java.nio.ByteBuffer.allocate(0);
        boolean boolean6 = byteBuffer5.isReadOnly();
        int int7 = byteBuffer1.compareTo(byteBuffer5);
        java.nio.ByteBuffer byteBuffer8 = byteBuffer5.compact();
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
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(byteBuffer8);
    }

    @Test
    public void test0582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0582");
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
            java.nio.Buffer buffer15 = charBuffer14.reset();
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
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(charBuffer14);
    }

    @Test
    public void test0583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0583");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer2 = byteBuffer1.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        java.nio.ByteBuffer byteBuffer4 = byteBuffer1.duplicate();
        java.nio.ByteBuffer byteBuffer5 = byteBuffer4.duplicate();
        // The following exception was thrown during execution in test generation
        try {
            double double7 = byteBuffer5.getDouble((int) (short) 100);
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
    public void test0584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0584");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response13 = org.jsoup.helper.HttpConnection.Response.execute(request0, response12);
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
    public void test0585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0585");
        byte[] byteArray0 = new byte[] {};
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.wrap(byteArray0);
        java.nio.Buffer buffer2 = byteBuffer1.flip();
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.asReadOnlyBuffer();
        java.nio.ByteBuffer byteBuffer4 = byteBuffer1.duplicate();
        // The following exception was thrown during execution in test generation
        try {
            char char6 = byteBuffer4.getChar((int) (short) -1);
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
    public void test0586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0586");
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
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer18 = byteBuffer5.put(10, (byte) 0);
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
    }

    @Test
    public void test0587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0587");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.hasRemaining();
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.asReadOnlyBuffer();
        java.nio.DoubleBuffer doubleBuffer4 = byteBuffer1.asDoubleBuffer();
        java.nio.IntBuffer intBuffer5 = byteBuffer1.asIntBuffer();
        // The following exception was thrown during execution in test generation
        try {
            long long7 = byteBuffer1.getLong((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertNotNull(doubleBuffer4);
        org.junit.Assert.assertNotNull(intBuffer5);
    }

    @Test
    public void test0588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0588");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.header("");
        org.jsoup.Connection.Response response5 = response1.removeCookie("hi!");
        java.lang.String str7 = response1.cookie("");
        java.lang.String str8 = response1.statusMessage();
        int int9 = response1.statusCode();
        java.lang.String str11 = response1.header("java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response14 = response1.header("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0589");
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
        int int15 = byteBuffer13.arrayOffset();
        java.nio.ByteBuffer byteBuffer17 = java.nio.ByteBuffer.allocate((int) (byte) 10);
        int int18 = byteBuffer17.getInt();
        java.nio.ByteBuffer byteBuffer21 = byteBuffer17.put((int) (byte) 0, (byte) 10);
        java.nio.IntBuffer intBuffer22 = byteBuffer17.asIntBuffer();
        byte[] byteArray26 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.nio.ByteBuffer byteBuffer27 = java.nio.ByteBuffer.wrap(byteArray26);
        java.nio.ByteBuffer byteBuffer28 = java.nio.ByteBuffer.wrap(byteArray26);
        java.nio.ByteBuffer byteBuffer29 = byteBuffer17.get(byteArray26);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer32 = byteBuffer13.get(byteArray26, (int) (byte) 100, 10);
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
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(byteBuffer17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(byteBuffer21);
        org.junit.Assert.assertNotNull(intBuffer22);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(byteBuffer27);
        org.junit.Assert.assertNotNull(byteBuffer28);
        org.junit.Assert.assertNotNull(byteBuffer29);
    }

    @Test
    public void test0590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0590");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.nio.ByteBuffer byteBuffer5 = response4.byteData;
        org.jsoup.Connection.Response response8 = response4.cookie("hi!", "");
        boolean boolean9 = response4.executed;
        java.lang.String str10 = response4.charset();
        java.net.URL uRL11 = response4.url();
        java.lang.String str12 = response4.charset();
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response4);
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response13);
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response13);
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry17 = response13.scanHeaders("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response18 = org.jsoup.helper.HttpConnection.Response.execute(request0, response13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(byteBuffer5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(strEntry17);
    }

    @Test
    public void test0591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0591");
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
        java.nio.ByteBuffer byteBuffer25 = java.nio.ByteBuffer.allocate(0);
        boolean boolean26 = byteBuffer25.isReadOnly();
        java.nio.ShortBuffer shortBuffer27 = byteBuffer25.asShortBuffer();
        int int28 = byteBuffer25.position();
        java.nio.ByteOrder byteOrder29 = null;
        java.nio.ByteBuffer byteBuffer30 = byteBuffer25.order(byteOrder29);
        int int31 = byteBuffer30.limit();
        java.nio.Buffer buffer32 = byteBuffer30.rewind();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer33 = byteBuffer20.put(byteBuffer30);
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
        org.junit.Assert.assertNotNull(byteBuffer25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(shortBuffer27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(byteBuffer30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(buffer32);
    }

    @Test
    public void test0592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0592");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer2 = byteBuffer1.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        java.nio.ByteBuffer byteBuffer4 = byteBuffer1.compact();
        int int5 = byteBuffer1.remaining();
        java.nio.ByteBuffer byteBuffer7 = java.nio.ByteBuffer.allocate((int) (byte) 10);
        byte[] byteArray11 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.nio.ByteBuffer byteBuffer12 = java.nio.ByteBuffer.wrap(byteArray11);
        java.nio.ByteBuffer byteBuffer13 = byteBuffer7.get(byteArray11);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer16 = byteBuffer1.put(byteArray11, (int) (short) -1, (-1));
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
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(byteBuffer12);
        org.junit.Assert.assertNotNull(byteBuffer13);
    }

    @Test
    public void test0593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0593");
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
            java.nio.ByteBuffer byteBuffer22 = byteBuffer12.putShort(0, (short) 1);
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
    public void test0594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0594");
        byte[] byteArray0 = new byte[] {};
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.wrap(byteArray0);
        java.nio.Buffer buffer2 = byteBuffer1.flip();
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.asReadOnlyBuffer();
        java.lang.String str4 = byteBuffer1.toString();
        // The following exception was thrown during execution in test generation
        try {
            byte byte6 = byteBuffer1.get(3);
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
    }

    @Test
    public void test0595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0595");
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
        java.lang.String str15 = response3.header("java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response16 = org.jsoup.helper.HttpConnection.Response.execute(request0, response3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertNull(strEntry12);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test0596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0596");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean3 = response2.executed;
        java.lang.String str5 = response2.getHeaderCaseInsensitive("");
        java.util.Map<java.lang.String, java.lang.String> strMap6 = response2.headers();
        boolean boolean7 = response2.executed;
        org.jsoup.Connection.Request request8 = null;
        response2.req = request8;
        java.net.URL uRL10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response11 = response2.url(uRL10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0597");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.isReadOnly();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        int int4 = byteBuffer1.position();
        boolean boolean5 = byteBuffer1.isReadOnly();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer8 = byteBuffer1.put(0, (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(shortBuffer3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0598");
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
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer22 = byteBuffer18.putFloat(10.0f);
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
    }

    @Test
    public void test0599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0599");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.isReadOnly();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        java.nio.ByteBuffer byteBuffer5 = java.nio.ByteBuffer.allocate(0);
        boolean boolean6 = byteBuffer5.isReadOnly();
        int int7 = byteBuffer1.compareTo(byteBuffer5);
        java.nio.ByteBuffer byteBuffer8 = byteBuffer5.compact();
        java.nio.ByteBuffer byteBuffer10 = java.nio.ByteBuffer.allocate((int) (byte) 10);
        byte[] byteArray14 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.nio.ByteBuffer byteBuffer15 = java.nio.ByteBuffer.wrap(byteArray14);
        java.nio.ByteBuffer byteBuffer16 = byteBuffer10.get(byteArray14);
        java.nio.Buffer buffer17 = byteBuffer10.rewind();
        java.nio.ByteOrder byteOrder18 = byteBuffer10.order();
        boolean boolean19 = byteBuffer10.hasRemaining();
        byte[] byteArray22 = new byte[] { (byte) 10, (byte) 1 };
        java.nio.ByteBuffer byteBuffer23 = byteBuffer10.put(byteArray22);
        java.nio.ByteBuffer byteBuffer24 = java.nio.ByteBuffer.wrap(byteArray22);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer27 = byteBuffer5.put(byteArray22, 22, (int) (byte) 100);
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
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(byteBuffer15);
        org.junit.Assert.assertNotNull(byteBuffer16);
        org.junit.Assert.assertNotNull(buffer17);
        org.junit.Assert.assertNotNull(byteOrder18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[10, 1]");
        org.junit.Assert.assertNotNull(byteBuffer23);
        org.junit.Assert.assertNotNull(byteBuffer24);
    }

    @Test
    public void test0600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0600");
        byte[] byteArray0 = new byte[] {};
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.wrap(byteArray0);
        java.nio.Buffer buffer2 = byteBuffer1.flip();
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.asReadOnlyBuffer();
        java.nio.ByteOrder byteOrder4 = byteBuffer3.order();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer7 = byteBuffer3.putInt((int) (byte) 10, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.nio.ReadOnlyBufferException; message: null");
        } catch (java.nio.ReadOnlyBufferException e) {
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
    public void test0601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0601");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate((int) (byte) 100);
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.putDouble((double) '4');
        byte[] byteArray9 = new byte[] { (byte) 1, (byte) 100, (byte) -1, (byte) 10, (byte) -1 };
        java.nio.ByteBuffer byteBuffer10 = byteBuffer1.put(byteArray9);
        java.nio.ByteBuffer byteBuffer13 = java.nio.ByteBuffer.wrap(byteArray9, (int) '\000', 0);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = byteBuffer13.getInt();
            org.junit.Assert.fail("Expected exception of type java.nio.BufferUnderflowException; message: null");
        } catch (java.nio.BufferUnderflowException e) {
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
    public void test0602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0602");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.isReadOnly();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        java.nio.ByteBuffer byteBuffer5 = java.nio.ByteBuffer.allocate(0);
        boolean boolean6 = byteBuffer5.isReadOnly();
        int int7 = byteBuffer1.compareTo(byteBuffer5);
        java.nio.DoubleBuffer doubleBuffer8 = byteBuffer5.asDoubleBuffer();
        java.nio.Buffer buffer9 = byteBuffer5.mark();
        java.nio.ByteBuffer byteBuffer11 = java.nio.ByteBuffer.allocate((int) (byte) 10);
        byte[] byteArray15 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.nio.ByteBuffer byteBuffer16 = java.nio.ByteBuffer.wrap(byteArray15);
        java.nio.ByteBuffer byteBuffer17 = byteBuffer11.get(byteArray15);
        java.nio.ByteBuffer byteBuffer18 = byteBuffer11.slice();
        java.nio.ByteBuffer byteBuffer20 = java.nio.ByteBuffer.allocateDirect((int) '#');
        java.nio.ByteBuffer byteBuffer22 = byteBuffer20.putShort((short) 0);
        java.nio.ByteBuffer byteBuffer25 = byteBuffer22.putShort(0, (short) (byte) 10);
        short short27 = byteBuffer22.getShort((int) (byte) 10);
        java.nio.ByteBuffer byteBuffer29 = java.nio.ByteBuffer.allocate(0);
        boolean boolean30 = byteBuffer29.isReadOnly();
        java.nio.ShortBuffer shortBuffer31 = byteBuffer29.asShortBuffer();
        java.nio.ByteBuffer byteBuffer33 = java.nio.ByteBuffer.allocate(0);
        boolean boolean34 = byteBuffer33.isReadOnly();
        int int35 = byteBuffer29.compareTo(byteBuffer33);
        java.nio.Buffer buffer36 = byteBuffer33.clear();
        java.nio.ByteBuffer byteBuffer38 = java.nio.ByteBuffer.allocate(0);
        boolean boolean39 = byteBuffer38.hasRemaining();
        java.nio.ByteBuffer byteBuffer40 = byteBuffer33.put(byteBuffer38);
        java.nio.ByteBuffer byteBuffer42 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer43 = byteBuffer42.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer44 = byteBuffer42.asShortBuffer();
        byte[] byteArray45 = byteBuffer42.array();
        java.nio.ByteBuffer byteBuffer46 = java.nio.ByteBuffer.wrap(byteArray45);
        java.nio.ByteBuffer byteBuffer47 = byteBuffer40.put(byteArray45);
        java.nio.ByteBuffer byteBuffer48 = byteBuffer22.get(byteArray45);
        java.nio.ByteBuffer byteBuffer49 = byteBuffer18.put(byteArray45);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer52 = byteBuffer5.get(byteArray45, (int) (short) 0, (-1));
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
        org.junit.Assert.assertNotNull(byteBuffer11);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(byteBuffer16);
        org.junit.Assert.assertNotNull(byteBuffer17);
        org.junit.Assert.assertNotNull(byteBuffer18);
        org.junit.Assert.assertNotNull(byteBuffer20);
        org.junit.Assert.assertNotNull(byteBuffer22);
        org.junit.Assert.assertNotNull(byteBuffer25);
        org.junit.Assert.assertTrue("'" + short27 + "' != '" + (short) 0 + "'", short27 == (short) 0);
        org.junit.Assert.assertNotNull(byteBuffer29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(shortBuffer31);
        org.junit.Assert.assertNotNull(byteBuffer33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(buffer36);
        org.junit.Assert.assertNotNull(byteBuffer38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(byteBuffer40);
        org.junit.Assert.assertNotNull(byteBuffer42);
        org.junit.Assert.assertNotNull(doubleBuffer43);
        org.junit.Assert.assertNotNull(shortBuffer44);
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray45), "[]");
        org.junit.Assert.assertNotNull(byteBuffer46);
        org.junit.Assert.assertNotNull(byteBuffer47);
        org.junit.Assert.assertNotNull(byteBuffer48);
        org.junit.Assert.assertNotNull(byteBuffer49);
    }

    @Test
    public void test0603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0603");
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
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer18 = byteBuffer13.putShort((int) (byte) 100, (short) 10);
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
    }

    @Test
    public void test0604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0604");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.isReadOnly();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        int int4 = byteBuffer1.position();
        boolean boolean5 = byteBuffer1.isReadOnly();
        java.nio.CharBuffer charBuffer6 = byteBuffer1.asCharBuffer();
        boolean boolean7 = byteBuffer1.hasRemaining();
        java.nio.IntBuffer intBuffer8 = byteBuffer1.asIntBuffer();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer10 = byteBuffer1.putShort((short) (byte) 1);
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
        org.junit.Assert.assertNotNull(intBuffer8);
    }

    @Test
    public void test0605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0605");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean3 = response2.executed;
        response2.statusCode = 0;
        java.lang.String str6 = response2.contentType();
        org.jsoup.Connection.Response response9 = response2.cookie("java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]", "java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry11 = response2.scanHeaders("hi!");
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response2);
        org.jsoup.Connection.Request request13 = null;
        response12.req = request13;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertNull(strEntry11);
    }

    @Test
    public void test0606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0606");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.nio.ByteBuffer byteBuffer5 = response4.byteData;
        org.jsoup.Connection.Response response8 = response4.cookie("hi!", "");
        boolean boolean9 = response4.executed;
        org.jsoup.Connection.Request request10 = response4.req;
        org.jsoup.Connection.Response response13 = response4.header("java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]", "java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]");
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
        org.junit.Assert.assertNull(request10);
        org.junit.Assert.assertNotNull(response13);
    }

    @Test
    public void test0607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0607");
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
        java.net.HttpURLConnection httpURLConnection15 = null;
        org.jsoup.helper.HttpConnection.Response response16 = null;
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response16);
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response(response16);
        boolean boolean19 = response18.executed;
        java.lang.String str21 = response18.getHeaderCaseInsensitive("");
        java.lang.String str23 = response18.cookie("java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]");
        org.jsoup.Connection.Response response25 = response18.removeHeader("hi!");
        // The following exception was thrown during execution in test generation
        try {
            response14.setupFromConnection(httpURLConnection15, response25);
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
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(response25);
    }

    @Test
    public void test0608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0608");
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
        boolean boolean14 = byteBuffer13.hasRemaining();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer16 = byteBuffer13.putFloat(1.0f);
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
    }

    @Test
    public void test0609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0609");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer2 = byteBuffer1.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        int int4 = byteBuffer1.capacity();
        java.nio.LongBuffer longBuffer5 = byteBuffer1.asLongBuffer();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer7 = byteBuffer1.putShort((short) 100);
            org.junit.Assert.fail("Expected exception of type java.nio.BufferOverflowException; message: null");
        } catch (java.nio.BufferOverflowException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(doubleBuffer2);
        org.junit.Assert.assertNotNull(shortBuffer3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(longBuffer5);
    }

    @Test
    public void test0610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0610");
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
        int int15 = byteBuffer14.limit();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer16 = byteBuffer4.put(byteBuffer14);
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
        org.junit.Assert.assertNotNull(byteBuffer14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
    }

    @Test
    public void test0611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0611");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.nio.ByteBuffer byteBuffer4 = response3.byteData;
        java.net.URL uRL5 = response3.url();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response3);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray7 = response6.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(byteBuffer4);
        org.junit.Assert.assertNull(uRL5);
    }

    @Test
    public void test0612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0612");
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
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry16 = response12.scanHeaders("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass17 = strEntry16.getClass();
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
        org.junit.Assert.assertNull(strEntry16);
    }

    @Test
    public void test0613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0613");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate((int) (byte) 10);
        int int2 = byteBuffer1.getInt();
        java.nio.ByteBuffer byteBuffer5 = byteBuffer1.put((int) (byte) 0, (byte) 10);
        java.nio.IntBuffer intBuffer6 = byteBuffer1.asIntBuffer();
        java.nio.Buffer buffer7 = byteBuffer1.mark();
        java.nio.Buffer buffer8 = buffer7.mark();
        boolean boolean9 = buffer7.hasRemaining();
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertNotNull(intBuffer6);
        org.junit.Assert.assertNotNull(buffer7);
        org.junit.Assert.assertNotNull(buffer8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0614");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate((int) ' ');
        java.nio.Buffer buffer2 = byteBuffer1.rewind();
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.compact();
        java.nio.Buffer buffer4 = byteBuffer1.clear();
        java.nio.ByteBuffer byteBuffer6 = byteBuffer1.putShort((short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer9 = byteBuffer6.putLong(1677787392, (long) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(buffer2);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertNotNull(buffer4);
        org.junit.Assert.assertNotNull(byteBuffer6);
    }

    @Test
    public void test0615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0615");
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
            byte[] byteArray17 = response2.bodyAsBytes();
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
    public void test0616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0616");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer2 = byteBuffer1.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        java.nio.ByteBuffer byteBuffer4 = byteBuffer1.compact();
        int int5 = byteBuffer1.remaining();
        boolean boolean6 = byteBuffer1.isReadOnly();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer9 = byteBuffer1.put(1, (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
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
    public void test0617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0617");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer2 = byteBuffer1.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        java.nio.ByteBuffer byteBuffer4 = byteBuffer1.compact();
        java.nio.ByteBuffer byteBuffer5 = byteBuffer1.slice();
        java.nio.Buffer buffer6 = byteBuffer5.flip();
        int int7 = byteBuffer5.position();
        java.nio.ByteBuffer byteBuffer9 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer10 = byteBuffer9.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer11 = byteBuffer9.asShortBuffer();
        java.nio.ByteOrder byteOrder12 = null;
        java.nio.ByteBuffer byteBuffer13 = byteBuffer9.order(byteOrder12);
        java.nio.ByteBuffer byteBuffer15 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer16 = byteBuffer15.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer17 = byteBuffer15.asShortBuffer();
        int int18 = byteBuffer15.limit();
        byte[] byteArray19 = byteBuffer15.array();
        java.nio.ByteBuffer byteBuffer20 = byteBuffer9.put(byteArray19);
        int int21 = byteBuffer20.position();
        int int22 = byteBuffer5.compareTo(byteBuffer20);
        // The following exception was thrown during execution in test generation
        try {
            short short23 = byteBuffer5.getShort();
            org.junit.Assert.fail("Expected exception of type java.nio.BufferUnderflowException; message: null");
        } catch (java.nio.BufferUnderflowException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(doubleBuffer2);
        org.junit.Assert.assertNotNull(shortBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertNotNull(buffer6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertNotNull(doubleBuffer10);
        org.junit.Assert.assertNotNull(shortBuffer11);
        org.junit.Assert.assertNotNull(byteBuffer13);
        org.junit.Assert.assertNotNull(byteBuffer15);
        org.junit.Assert.assertNotNull(doubleBuffer16);
        org.junit.Assert.assertNotNull(shortBuffer17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[]");
        org.junit.Assert.assertNotNull(byteBuffer20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test0618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0618");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.executed = false;
        java.lang.String str4 = response1.contentType;
        int int5 = response1.statusCode;
        java.nio.ByteBuffer byteBuffer6 = null;
        response1.byteData = byteBuffer6;
        java.lang.Class<?> wildcardClass8 = response1.getClass();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0619");
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
            double double19 = byteBuffer13.getDouble((int) (byte) 10);
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
        org.junit.Assert.assertNotNull(intBuffer16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]" + "'", str17, "java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]");
    }

    @Test
    public void test0620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0620");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate((int) (byte) 10);
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.nio.ByteBuffer byteBuffer6 = java.nio.ByteBuffer.wrap(byteArray5);
        java.nio.ByteBuffer byteBuffer7 = byteBuffer1.get(byteArray5);
        java.nio.IntBuffer intBuffer8 = byteBuffer7.asIntBuffer();
        char char9 = byteBuffer7.getChar();
        // The following exception was thrown during execution in test generation
        try {
            long long10 = byteBuffer7.getLong();
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
    }

    @Test
    public void test0621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0621");
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
        // The following exception was thrown during execution in test generation
        try {
            short short17 = byteBuffer13.getShort((int) (short) 0);
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
    }

    @Test
    public void test0622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0622");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate((int) ' ');
        int int3 = byteBuffer1.getInt((int) (short) 0);
        java.nio.CharBuffer charBuffer4 = byteBuffer1.asCharBuffer();
        java.nio.ByteBuffer byteBuffer7 = byteBuffer1.putInt((int) (byte) 0, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer10 = byteBuffer7.putShort((int) '4', (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(charBuffer4);
        org.junit.Assert.assertNotNull(byteBuffer7);
    }

    @Test
    public void test0623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0623");
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
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer24 = byteBuffer19.putFloat((float) ' ');
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
    }

    @Test
    public void test0624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0624");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer2 = byteBuffer1.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        java.nio.ByteBuffer byteBuffer4 = byteBuffer1.compact();
        java.nio.ByteBuffer byteBuffer5 = byteBuffer1.duplicate();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer8 = byteBuffer5.putLong(100, (long) (byte) 1);
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
    public void test0625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0625");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str5 = response4.statusMessage();
        response4.contentType = "";
        java.lang.String str8 = response4.statusMessage();
        org.jsoup.Connection.Request request9 = response4.req;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response10 = org.jsoup.helper.HttpConnection.Response.execute(request0, response4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(request9);
    }

    @Test
    public void test0626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0626");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer2 = byteBuffer1.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        int int4 = byteBuffer1.capacity();
        java.nio.LongBuffer longBuffer5 = byteBuffer1.asLongBuffer();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer8 = byteBuffer1.putFloat((int) (short) 1, (float) 31);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(doubleBuffer2);
        org.junit.Assert.assertNotNull(shortBuffer3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(longBuffer5);
    }

    @Test
    public void test0627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0627");
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
            byte byte15 = byteBuffer11.get((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
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
    public void test0628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0628");
        byte[] byteArray3 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.nio.ByteBuffer byteBuffer4 = java.nio.ByteBuffer.wrap(byteArray3);
        // The following exception was thrown during execution in test generation
        try {
            short short6 = byteBuffer4.getShort((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[100, 1, 1]");
        org.junit.Assert.assertNotNull(byteBuffer4);
    }

    @Test
    public void test0629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0629");
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
        java.lang.String str16 = byteBuffer13.toString();
        // The following exception was thrown during execution in test generation
        try {
            double double17 = byteBuffer13.getDouble();
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
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]" + "'", str16, "java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]");
    }

    @Test
    public void test0630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0630");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.nio.ByteBuffer byteBuffer4 = response3.byteData;
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response3);
        java.nio.ByteBuffer byteBuffer7 = java.nio.ByteBuffer.allocate(0);
        response3.byteData = byteBuffer7;
        java.nio.ByteBuffer byteBuffer9 = byteBuffer7.slice();
        // The following exception was thrown during execution in test generation
        try {
            byte byte11 = byteBuffer9.get((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(byteBuffer4);
        org.junit.Assert.assertNotNull(byteBuffer7);
        org.junit.Assert.assertNotNull(byteBuffer9);
    }

    @Test
    public void test0631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0631");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.nio.ByteBuffer byteBuffer4 = response3.byteData;
        java.lang.String str5 = response3.statusMessage();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = response3.hasHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(byteBuffer4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0632");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Method method7 = response6.method();
        boolean boolean9 = response6.hasCookie("hi!");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry11 = response6.scanHeaders("hi!");
        java.lang.String str12 = response6.contentType;
        java.lang.String str13 = response6.statusMessage();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response14 = org.jsoup.helper.HttpConnection.Response.execute(request0, response6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(strEntry11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test0633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0633");
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
            java.nio.Buffer buffer11 = shortBuffer9.limit((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
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
    }

    @Test
    public void test0634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0634");
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
        java.nio.FloatBuffer floatBuffer13 = byteBuffer12.asFloatBuffer();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer16 = byteBuffer12.putShort((int) (short) 0, (short) (byte) 1);
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
        org.junit.Assert.assertNotNull(floatBuffer13);
    }

    @Test
    public void test0635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0635");
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0636");
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
        org.jsoup.Connection.Method method24 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response25 = response21.method(method24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
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
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test0637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0637");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.isReadOnly();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        java.nio.ByteBuffer byteBuffer5 = java.nio.ByteBuffer.allocate(0);
        boolean boolean6 = byteBuffer5.isReadOnly();
        int int7 = byteBuffer1.compareTo(byteBuffer5);
        // The following exception was thrown during execution in test generation
        try {
            short short9 = byteBuffer5.getShort(0);
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
    public void test0638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0638");
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
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = response2.hasHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(request3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(strMap11);
    }

    @Test
    public void test0639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0639");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer2 = byteBuffer1.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        java.nio.ByteBuffer byteBuffer4 = byteBuffer1.duplicate();
        java.nio.ByteBuffer byteBuffer5 = byteBuffer4.duplicate();
        java.nio.ByteBuffer byteBuffer7 = java.nio.ByteBuffer.allocate((int) (byte) 10);
        int int8 = byteBuffer7.getInt();
        java.nio.ByteBuffer byteBuffer11 = byteBuffer7.put((int) (byte) 0, (byte) 10);
        byte[] byteArray12 = byteBuffer11.array();
        java.nio.DoubleBuffer doubleBuffer13 = byteBuffer11.asDoubleBuffer();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer14 = byteBuffer4.put(byteBuffer11);
            org.junit.Assert.fail("Expected exception of type java.nio.BufferOverflowException; message: null");
        } catch (java.nio.BufferOverflowException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(doubleBuffer2);
        org.junit.Assert.assertNotNull(shortBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertNotNull(byteBuffer7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(byteBuffer11);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[10, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(doubleBuffer13);
    }

    @Test
    public void test0640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0640");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer2 = byteBuffer1.asDoubleBuffer();
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.compact();
        java.lang.String str4 = byteBuffer1.toString();
        // The following exception was thrown during execution in test generation
        try {
            char char5 = byteBuffer1.getChar();
            org.junit.Assert.fail("Expected exception of type java.nio.BufferUnderflowException; message: null");
        } catch (java.nio.BufferUnderflowException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(doubleBuffer2);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]" + "'", str4, "java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]");
    }

    @Test
    public void test0641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0641");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer2 = byteBuffer1.asDoubleBuffer();
        java.nio.FloatBuffer floatBuffer3 = byteBuffer1.asFloatBuffer();
        boolean boolean4 = byteBuffer1.hasArray();
        // The following exception was thrown during execution in test generation
        try {
            long long6 = byteBuffer1.getLong((int) (short) 0);
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
    public void test0642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0642");
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
            long long18 = byteBuffer13.getLong();
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
    public void test0643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0643");
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
        java.nio.ByteBuffer byteBuffer31 = java.nio.ByteBuffer.allocate((int) (byte) 10);
        byte[] byteArray35 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.nio.ByteBuffer byteBuffer36 = java.nio.ByteBuffer.wrap(byteArray35);
        java.nio.ByteBuffer byteBuffer37 = byteBuffer31.get(byteArray35);
        java.nio.Buffer buffer38 = byteBuffer31.rewind();
        byte[] byteArray42 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.nio.ByteBuffer byteBuffer43 = java.nio.ByteBuffer.wrap(byteArray42);
        java.nio.ByteBuffer byteBuffer44 = byteBuffer31.put(byteArray42);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer47 = byteBuffer29.put(byteArray42, (int) (byte) 100, 35);
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
        org.junit.Assert.assertNotNull(byteBuffer31);
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray35), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(byteBuffer36);
        org.junit.Assert.assertNotNull(byteBuffer37);
        org.junit.Assert.assertNotNull(buffer38);
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray42), "[100, 1, 1]");
        org.junit.Assert.assertNotNull(byteBuffer43);
        org.junit.Assert.assertNotNull(byteBuffer44);
    }

    @Test
    public void test0644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0644");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.nio.ByteBuffer byteBuffer5 = response4.byteData;
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response4);
        response4.contentType = "hi!";
        boolean boolean10 = response4.hasCookie("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response11 = org.jsoup.helper.HttpConnection.Response.execute(request0, response4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(byteBuffer5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0645");
        byte[] byteArray0 = new byte[] {};
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.wrap(byteArray0);
        java.nio.Buffer buffer2 = byteBuffer1.flip();
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.asReadOnlyBuffer();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer6 = byteBuffer3.putChar(1, '\000');
            org.junit.Assert.fail("Expected exception of type java.nio.ReadOnlyBufferException; message: null");
        } catch (java.nio.ReadOnlyBufferException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(buffer2);
        org.junit.Assert.assertNotNull(byteBuffer3);
    }

    @Test
    public void test0646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0646");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer2 = byteBuffer1.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        java.nio.ByteBuffer byteBuffer4 = byteBuffer1.compact();
        java.lang.Class<?> wildcardClass5 = byteBuffer1.getClass();
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(doubleBuffer2);
        org.junit.Assert.assertNotNull(shortBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0647");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer2 = byteBuffer1.asDoubleBuffer();
        boolean boolean3 = byteBuffer1.isDirect();
        int int4 = byteBuffer1.arrayOffset();
        java.nio.ByteBuffer byteBuffer5 = byteBuffer1.asReadOnlyBuffer();
        java.nio.ByteBuffer byteBuffer6 = byteBuffer5.asReadOnlyBuffer();
        byte[] byteArray7 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer8 = byteBuffer6.put(byteArray7);
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
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[]");
    }

    @Test
    public void test0648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0648");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.isReadOnly();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        int int4 = byteBuffer1.position();
        java.nio.ByteOrder byteOrder5 = null;
        java.nio.ByteBuffer byteBuffer6 = byteBuffer1.order(byteOrder5);
        java.nio.DoubleBuffer doubleBuffer7 = byteBuffer6.asDoubleBuffer();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer10 = byteBuffer6.put((int) '#', (byte) 100);
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
    public void test0649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0649");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.nio.ByteBuffer byteBuffer4 = response3.byteData;
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response3);
        response3.contentType = "hi!";
        java.lang.String str9 = response3.cookie("hi!");
        int int10 = response3.statusCode;
        org.jsoup.Connection.Method method11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response12 = response3.method(method11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(byteBuffer4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0650");
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
            byte[] byteArray20 = response19.bodyAsBytes();
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
    public void test0651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0651");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean3 = response2.executed;
        java.lang.String str5 = response2.getHeaderCaseInsensitive("");
        java.lang.String str7 = response2.cookie("java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]");
        int int8 = response2.statusCode();
        org.jsoup.Connection.Response response11 = response2.cookie("hi!", "");
        java.util.Map<java.lang.String, java.lang.String> strMap12 = response2.headers();
        java.net.HttpURLConnection httpURLConnection13 = null;
        org.jsoup.helper.HttpConnection.Response response14 = null;
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response14);
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response14);
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response14);
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response(response14);
        org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response(response14);
        int int20 = response19.statusCode;
        org.jsoup.Connection.Response response22 = response19.removeCookie("");
        org.jsoup.helper.HttpConnection.Response response23 = new org.jsoup.helper.HttpConnection.Response(response19);
        // The following exception was thrown during execution in test generation
        try {
            response2.setupFromConnection(httpURLConnection13, (org.jsoup.Connection.Response) response19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(response22);
    }

    @Test
    public void test0652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0652");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer2 = byteBuffer1.asDoubleBuffer();
        boolean boolean3 = byteBuffer1.isDirect();
        int int4 = byteBuffer1.arrayOffset();
        java.nio.Buffer buffer5 = byteBuffer1.mark();
        java.nio.Buffer buffer6 = buffer5.rewind();
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(doubleBuffer2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(buffer5);
        org.junit.Assert.assertNotNull(buffer6);
    }

    @Test
    public void test0653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0653");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.LongBuffer longBuffer2 = byteBuffer1.asLongBuffer();
        // The following exception was thrown during execution in test generation
        try {
            byte byte4 = byteBuffer1.get(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(longBuffer2);
    }

    @Test
    public void test0654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0654");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response1);
        boolean boolean4 = response3.executed;
        java.lang.String str6 = response3.getHeaderCaseInsensitive("");
        java.lang.String str8 = response3.cookie("java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]");
        org.jsoup.Connection.Response response11 = response3.cookie("hi!", "");
        int int12 = response3.statusCode;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response13 = org.jsoup.helper.HttpConnection.Response.execute(request0, response3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0655");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.header("");
        java.lang.String str4 = response1.statusMessage;
        org.jsoup.Connection.Response response6 = response1.removeHeader("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response9 = response1.header("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(response6);
    }

    @Test
    public void test0656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0656");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str4 = response2.header("");
        org.jsoup.Connection.Response response6 = response2.removeCookie("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap7 = response2.headers();
        java.nio.ByteBuffer byteBuffer8 = response2.byteData;
        java.net.URL uRL9 = response2.url();
        response2.contentType = "java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]";
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response12 = org.jsoup.helper.HttpConnection.Response.execute(request0, response2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNull(byteBuffer8);
        org.junit.Assert.assertNull(uRL9);
    }

    @Test
    public void test0657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0657");
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
            java.nio.ByteBuffer byteBuffer13 = byteBuffer11.putInt((int) (byte) 1);
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
    }

    @Test
    public void test0658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0658");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.nio.ByteBuffer byteBuffer4 = response3.byteData;
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response3);
        java.nio.ByteBuffer byteBuffer7 = java.nio.ByteBuffer.allocate(0);
        response3.byteData = byteBuffer7;
        java.nio.ByteBuffer byteBuffer9 = byteBuffer7.slice();
        java.nio.ByteBuffer byteBuffer11 = java.nio.ByteBuffer.allocate(0);
        boolean boolean12 = byteBuffer11.hasRemaining();
        java.nio.ByteBuffer byteBuffer13 = byteBuffer11.asReadOnlyBuffer();
        boolean boolean14 = byteBuffer13.hasRemaining();
        java.nio.ByteBuffer byteBuffer16 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer17 = byteBuffer16.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer18 = byteBuffer16.asShortBuffer();
        java.nio.ByteBuffer byteBuffer19 = byteBuffer16.compact();
        java.nio.ByteOrder byteOrder20 = byteBuffer19.order();
        java.nio.ByteBuffer byteBuffer21 = byteBuffer13.order(byteOrder20);
        java.nio.ByteBuffer byteBuffer22 = byteBuffer9.order(byteOrder20);
        int int23 = byteBuffer22.limit();
        org.junit.Assert.assertNull(byteBuffer4);
        org.junit.Assert.assertNotNull(byteBuffer7);
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertNotNull(byteBuffer11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(byteBuffer13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(byteBuffer16);
        org.junit.Assert.assertNotNull(doubleBuffer17);
        org.junit.Assert.assertNotNull(shortBuffer18);
        org.junit.Assert.assertNotNull(byteBuffer19);
        org.junit.Assert.assertNotNull(byteOrder20);
        org.junit.Assert.assertNotNull(byteBuffer21);
        org.junit.Assert.assertNotNull(byteBuffer22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test0659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0659");
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
        java.nio.ByteBuffer byteBuffer25 = java.nio.ByteBuffer.allocate(0);
        boolean boolean26 = byteBuffer25.isReadOnly();
        java.nio.ShortBuffer shortBuffer27 = byteBuffer25.asShortBuffer();
        int int28 = byteBuffer25.position();
        boolean boolean29 = byteBuffer25.isReadOnly();
        java.nio.ByteBuffer byteBuffer31 = java.nio.ByteBuffer.allocate(0);
        boolean boolean32 = byteBuffer31.isReadOnly();
        java.nio.ShortBuffer shortBuffer33 = byteBuffer31.asShortBuffer();
        int int34 = byteBuffer31.position();
        boolean boolean35 = byteBuffer31.isReadOnly();
        int int36 = byteBuffer25.compareTo(byteBuffer31);
        int int37 = byteBuffer31.limit();
        java.nio.CharBuffer charBuffer38 = byteBuffer31.asCharBuffer();
        java.nio.ByteBuffer byteBuffer40 = java.nio.ByteBuffer.allocate(0);
        java.nio.ByteBuffer byteBuffer41 = byteBuffer40.slice();
        java.nio.ShortBuffer shortBuffer42 = byteBuffer40.asShortBuffer();
        java.nio.ByteBuffer byteBuffer43 = byteBuffer40.asReadOnlyBuffer();
        int int44 = byteBuffer31.compareTo(byteBuffer40);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer45 = byteBuffer20.put(byteBuffer31);
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
        org.junit.Assert.assertNotNull(byteBuffer25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(shortBuffer27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(byteBuffer31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(shortBuffer33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(charBuffer38);
        org.junit.Assert.assertNotNull(byteBuffer40);
        org.junit.Assert.assertNotNull(byteBuffer41);
        org.junit.Assert.assertNotNull(shortBuffer42);
        org.junit.Assert.assertNotNull(byteBuffer43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
    }

    @Test
    public void test0660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0660");
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
        org.junit.Assert.assertNotNull(doubleBuffer8);
        org.junit.Assert.assertNotNull(buffer9);
    }

    @Test
    public void test0661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0661");
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
            byte byte17 = byteBuffer15.get((int) (byte) -1);
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
    public void test0662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0662");
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
            java.nio.ByteBuffer byteBuffer15 = byteBuffer11.putShort((int) (byte) 1, (short) 100);
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
    public void test0663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0663");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.isReadOnly();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        java.nio.ByteBuffer byteBuffer5 = java.nio.ByteBuffer.allocate(0);
        boolean boolean6 = byteBuffer5.isReadOnly();
        int int7 = byteBuffer1.compareTo(byteBuffer5);
        java.nio.Buffer buffer9 = byteBuffer1.limit(0);
        java.nio.Buffer buffer10 = byteBuffer1.rewind();
        // The following exception was thrown during execution in test generation
        try {
            float float11 = byteBuffer1.getFloat();
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
        org.junit.Assert.assertNotNull(buffer9);
        org.junit.Assert.assertNotNull(buffer10);
    }

    @Test
    public void test0664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0664");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate((int) (byte) 10);
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.nio.ByteBuffer byteBuffer6 = java.nio.ByteBuffer.wrap(byteArray5);
        java.nio.ByteBuffer byteBuffer7 = byteBuffer1.get(byteArray5);
        java.nio.ByteBuffer byteBuffer8 = byteBuffer1.slice();
        byte[] byteArray9 = byteBuffer8.array();
        java.nio.ByteBuffer byteBuffer11 = byteBuffer8.putShort((short) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer14 = byteBuffer8.putLong(0, (long) 35);
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[0, 0, 0, 0, 100, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(byteBuffer11);
    }

    @Test
    public void test0665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0665");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.header("");
        boolean boolean5 = response1.hasCookie("");
        java.net.HttpURLConnection httpURLConnection6 = null;
        org.jsoup.helper.HttpConnection.Response response7 = null;
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response7);
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response7);
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response7);
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response7);
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response7);
        org.jsoup.Connection.Method method13 = response12.method();
        // The following exception was thrown during execution in test generation
        try {
            response1.setupFromConnection(httpURLConnection6, (org.jsoup.Connection.Response) response12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(method13);
    }

    @Test
    public void test0666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0666");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate((int) (byte) 10);
        int int2 = byteBuffer1.limit();
        java.nio.ByteBuffer byteBuffer4 = byteBuffer1.putChar(' ');
        java.nio.ByteBuffer byteBuffer5 = byteBuffer1.asReadOnlyBuffer();
        int int6 = byteBuffer1.getInt();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.Buffer buffer8 = byteBuffer1.position((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: newPosition > limit: (100 > 10)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0667");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer2 = byteBuffer1.asDoubleBuffer();
        boolean boolean3 = byteBuffer1.isDirect();
        java.lang.String str4 = byteBuffer1.toString();
        byte[] byteArray5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer8 = byteBuffer1.put(byteArray5, (int) (short) 0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(doubleBuffer2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]" + "'", str4, "java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]");
    }

    @Test
    public void test0668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0668");
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
        // The following exception was thrown during execution in test generation
        try {
            float float17 = byteBuffer15.getFloat((int) (short) 100);
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
    }

    @Test
    public void test0669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0669");
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
        java.net.HttpURLConnection httpURLConnection13 = null;
        org.jsoup.helper.HttpConnection.Response response14 = null;
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response14);
        java.lang.String str17 = response15.header("");
        org.jsoup.Connection.Response response19 = response15.removeCookie("hi!");
        java.lang.String str21 = response15.cookie("");
        java.lang.String str22 = response15.statusMessage();
        // The following exception was thrown during execution in test generation
        try {
            response12.setupFromConnection(httpURLConnection13, (org.jsoup.Connection.Response) response15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(response19);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test0670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0670");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.isReadOnly();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        int int4 = byteBuffer1.position();
        boolean boolean5 = byteBuffer1.isDirect();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer7 = byteBuffer1.put((byte) -1);
            org.junit.Assert.fail("Expected exception of type java.nio.BufferOverflowException; message: null");
        } catch (java.nio.BufferOverflowException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(shortBuffer3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0671");
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
            java.nio.ByteBuffer byteBuffer14 = byteBuffer11.putDouble((double) (byte) 0);
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
    public void test0672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0672");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean3 = response2.executed;
        java.lang.String str5 = response2.getHeaderCaseInsensitive("");
        java.lang.String str6 = response2.contentType;
        java.nio.ByteBuffer byteBuffer7 = response2.byteData;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = response2.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(byteBuffer7);
    }

    @Test
    public void test0673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0673");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer2 = byteBuffer1.asDoubleBuffer();
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.compact();
        java.lang.Class<?> wildcardClass4 = byteBuffer3.getClass();
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(doubleBuffer2);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0674");
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
        // The following exception was thrown during execution in test generation
        try {
            int int18 = byteBuffer17.arrayOffset();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
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
    public void test0675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0675");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Method method6 = response5.method();
        boolean boolean8 = response5.hasCookie("hi!");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry10 = response5.scanHeaders("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = response5.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(strEntry10);
    }

    @Test
    public void test0676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0676");
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
            java.nio.Buffer buffer31 = byteBuffer28.limit((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
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
    public void test0677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0677");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request3 = response2.req;
        org.jsoup.Connection.Method method4 = response2.method();
        java.lang.String str5 = response2.contentType;
        java.util.Map<java.lang.String, java.lang.String> strMap6 = response2.headers();
        int int7 = response2.numRedirects;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response9 = response2.removeHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(request3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0678");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.isReadOnly();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        int int4 = byteBuffer1.position();
        java.nio.ByteOrder byteOrder5 = null;
        java.nio.ByteBuffer byteBuffer6 = byteBuffer1.order(byteOrder5);
        java.lang.String str7 = byteBuffer6.toString();
        java.nio.ByteBuffer byteBuffer8 = byteBuffer6.slice();
        java.nio.ByteBuffer byteBuffer10 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer11 = byteBuffer10.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer12 = byteBuffer10.asShortBuffer();
        byte[] byteArray13 = byteBuffer10.array();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer16 = byteBuffer8.put(byteArray13, 0, 35);
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
        org.junit.Assert.assertNotNull(byteBuffer10);
        org.junit.Assert.assertNotNull(doubleBuffer11);
        org.junit.Assert.assertNotNull(shortBuffer12);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[]");
    }

    @Test
    public void test0679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0679");
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
        // The following exception was thrown during execution in test generation
        try {
            double double26 = byteBuffer24.getDouble((int) (byte) -1);
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
    }

    @Test
    public void test0680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0680");
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
            byte[] byteArray34 = byteBuffer20.array();
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
    public void test0681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0681");
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
        java.net.URL uRL12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response13 = response2.url(uRL12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(request10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0682");
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
        java.lang.Class<?> wildcardClass16 = byteArray13.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0683");
        java.util.Collection<org.jsoup.Connection.KeyVal> keyValCollection0 = null;
        java.io.OutputStream outputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response.writePost(keyValCollection0, outputStream1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0684");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response1);
        boolean boolean4 = response3.executed;
        java.lang.String str6 = response3.getHeaderCaseInsensitive("");
        java.util.Map<java.lang.String, java.lang.String> strMap7 = response3.headers();
        boolean boolean8 = response3.executed;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response9 = org.jsoup.helper.HttpConnection.Response.execute(request0, response3);
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
    public void test0685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0685");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer2 = byteBuffer1.asDoubleBuffer();
        boolean boolean3 = byteBuffer1.isDirect();
        int int4 = byteBuffer1.arrayOffset();
        java.nio.Buffer buffer5 = byteBuffer1.mark();
        java.lang.Class<?> wildcardClass6 = byteBuffer1.getClass();
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(doubleBuffer2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(buffer5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0686");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.net.URL uRL4 = response3.url();
        java.lang.String str5 = response3.contentType();
        response3.statusCode = 35;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response8 = org.jsoup.helper.HttpConnection.Response.execute(request0, response3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0687");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.header("");
        org.jsoup.Connection.Response response5 = response1.removeCookie("hi!");
        java.lang.String str7 = response1.cookie("");
        java.lang.String str8 = response1.statusMessage();
        java.lang.String str9 = response1.charset();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = response1.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0688");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request3 = response2.req;
        org.jsoup.Connection.Method method4 = response2.method();
        java.lang.String str5 = response2.contentType;
        boolean boolean7 = response2.hasCookie("");
        java.lang.String str9 = response2.header("hi!");
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response2);
        org.junit.Assert.assertNull(request3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0689");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.LongBuffer longBuffer2 = byteBuffer1.asLongBuffer();
        // The following exception was thrown during execution in test generation
        try {
            float float3 = byteBuffer1.getFloat();
            org.junit.Assert.fail("Expected exception of type java.nio.BufferUnderflowException; message: null");
        } catch (java.nio.BufferUnderflowException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(longBuffer2);
    }

    @Test
    public void test0690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0690");
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
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer16 = byteBuffer9.putFloat((float) 10);
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
    }

    @Test
    public void test0691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0691");
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
            byte byte17 = byteBuffer10.get();
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
    }

    @Test
    public void test0692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0692");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate((int) (byte) 10);
        int int2 = byteBuffer1.getInt();
        java.nio.ByteBuffer byteBuffer5 = byteBuffer1.put((int) (byte) 0, (byte) 10);
        java.nio.IntBuffer intBuffer6 = byteBuffer1.asIntBuffer();
        java.nio.Buffer buffer7 = byteBuffer1.mark();
        java.nio.Buffer buffer8 = buffer7.mark();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.Buffer buffer10 = buffer8.position((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: newPosition > limit: (97 > 10)");
        } catch (java.lang.IllegalArgumentException e) {
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
    public void test0693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0693");
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
        // The following exception was thrown during execution in test generation
        try {
            java.nio.Buffer buffer23 = byteBuffer19.position((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: newPosition > limit: (97 > 0)");
        } catch (java.lang.IllegalArgumentException e) {
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
    }

    @Test
    public void test0694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0694");
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
        // The following exception was thrown during execution in test generation
        try {
            long long13 = byteBuffer1.getLong();
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
    }

    @Test
    public void test0695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0695");
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
            java.nio.ByteBuffer byteBuffer31 = byteBuffer18.putDouble((double) (-1L));
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
        org.junit.Assert.assertNotNull(doubleBuffer21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(byteBuffer25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(shortBuffer27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(byteBuffer29);
    }

    @Test
    public void test0696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0696");
        org.jsoup.helper.HttpConnection.Response.MAX_REDIRECTS = '4';
    }

    @Test
    public void test0697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0697");
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
        // The following exception was thrown during execution in test generation
        try {
            float float20 = byteBuffer10.getFloat(100);
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
    }

    @Test
    public void test0698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0698");
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
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer48 = byteBuffer19.get(byteArray43, (int) '\000', 3);
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
        org.junit.Assert.assertNotNull(byteBuffer19);
        org.junit.Assert.assertNotNull(floatBuffer20);
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
    }

    @Test
    public void test0699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0699");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.nio.ByteBuffer byteBuffer4 = response3.byteData;
        org.jsoup.Connection.Response response7 = response3.cookie("hi!", "");
        boolean boolean8 = response3.executed;
        org.jsoup.Connection.Request request9 = response3.req;
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response3);
        org.jsoup.Connection.Response response12 = response10.removeCookie("java.nio.HeapByteBuffer[pos=0 lim=32 cap=32]");
        org.junit.Assert.assertNull(byteBuffer4);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(request9);
        org.junit.Assert.assertNotNull(response12);
    }

    @Test
    public void test0700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0700");
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
        java.nio.IntBuffer intBuffer23 = byteBuffer20.asIntBuffer();
        int int24 = byteBuffer20.limit();
        // The following exception was thrown during execution in test generation
        try {
            double double25 = byteBuffer20.getDouble();
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
        org.junit.Assert.assertNotNull(byteBuffer14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(shortBuffer16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(byteBuffer19);
        org.junit.Assert.assertNotNull(byteBuffer20);
        org.junit.Assert.assertNotNull(byteBuffer21);
        org.junit.Assert.assertNotNull(intBuffer22);
        org.junit.Assert.assertNotNull(intBuffer23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test0701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0701");
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
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer17 = byteBuffer5.putLong((int) '4', 0L);
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
    }

    @Test
    public void test0702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0702");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request3 = response2.req;
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response2);
        java.lang.String str5 = response4.contentType;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response7 = response4.removeHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(request3);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0703");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean3 = response2.executed;
        java.lang.String str5 = response2.getHeaderCaseInsensitive("");
        java.net.URL uRL6 = response2.url();
        org.jsoup.Connection.Response response8 = response2.removeCookie("");
        java.nio.ByteBuffer byteBuffer9 = response2.byteData;
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response2);
        java.net.URL uRL11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response12 = response10.url(uRL11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(byteBuffer9);
    }

    @Test
    public void test0704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0704");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.nio.ByteBuffer byteBuffer4 = response3.byteData;
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response3);
        java.nio.ByteBuffer byteBuffer7 = java.nio.ByteBuffer.allocate(0);
        response3.byteData = byteBuffer7;
        java.nio.ByteBuffer byteBuffer9 = byteBuffer7.slice();
        java.nio.ByteBuffer byteBuffer11 = java.nio.ByteBuffer.allocate(0);
        boolean boolean12 = byteBuffer11.hasRemaining();
        java.nio.ByteBuffer byteBuffer13 = byteBuffer11.asReadOnlyBuffer();
        boolean boolean14 = byteBuffer13.hasRemaining();
        java.nio.ByteBuffer byteBuffer16 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer17 = byteBuffer16.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer18 = byteBuffer16.asShortBuffer();
        java.nio.ByteBuffer byteBuffer19 = byteBuffer16.compact();
        java.nio.ByteOrder byteOrder20 = byteBuffer19.order();
        java.nio.ByteBuffer byteBuffer21 = byteBuffer13.order(byteOrder20);
        java.nio.ByteBuffer byteBuffer22 = byteBuffer9.order(byteOrder20);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer25 = byteBuffer9.put(100, (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(byteBuffer4);
        org.junit.Assert.assertNotNull(byteBuffer7);
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertNotNull(byteBuffer11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(byteBuffer13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(byteBuffer16);
        org.junit.Assert.assertNotNull(doubleBuffer17);
        org.junit.Assert.assertNotNull(shortBuffer18);
        org.junit.Assert.assertNotNull(byteBuffer19);
        org.junit.Assert.assertNotNull(byteOrder20);
        org.junit.Assert.assertNotNull(byteBuffer21);
        org.junit.Assert.assertNotNull(byteBuffer22);
    }

    @Test
    public void test0705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0705");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer2 = byteBuffer1.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        java.nio.ByteOrder byteOrder4 = null;
        java.nio.ByteBuffer byteBuffer5 = byteBuffer1.order(byteOrder4);
        java.nio.ByteBuffer byteBuffer6 = byteBuffer5.asReadOnlyBuffer();
        java.nio.Buffer buffer7 = byteBuffer5.clear();
        int int8 = byteBuffer5.position();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer11 = byteBuffer5.putChar((int) ' ', '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(doubleBuffer2);
        org.junit.Assert.assertNotNull(shortBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertNotNull(byteBuffer6);
        org.junit.Assert.assertNotNull(buffer7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0706");
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
            java.nio.ByteBuffer byteBuffer22 = byteBuffer19.putInt((int) (byte) 1, 35);
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
    public void test0707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0707");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean3 = response2.executed;
        response2.statusCode = 0;
        java.lang.String str6 = response2.contentType();
        org.jsoup.Connection.Response response9 = response2.cookie("java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]", "java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry11 = response2.scanHeaders("hi!");
        java.lang.String str12 = response2.charset;
        org.jsoup.Connection.Response response15 = response2.header("java.nio.HeapByteBuffer[pos=0 lim=32 cap=32]", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertNull(strEntry11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(response15);
    }

    @Test
    public void test0708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0708");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate((int) ' ');
        java.nio.ByteBuffer byteBuffer3 = java.nio.ByteBuffer.allocate(0);
        java.nio.ByteBuffer byteBuffer4 = byteBuffer3.slice();
        java.nio.ByteBuffer byteBuffer5 = byteBuffer1.put(byteBuffer4);
        byte[] byteArray9 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.nio.ByteBuffer byteBuffer10 = java.nio.ByteBuffer.wrap(byteArray9);
        java.nio.ByteBuffer byteBuffer11 = java.nio.ByteBuffer.wrap(byteArray9);
        java.nio.ByteBuffer byteBuffer12 = java.nio.ByteBuffer.wrap(byteArray9);
        java.nio.ByteBuffer byteBuffer13 = byteBuffer5.get(byteArray9);
        java.nio.FloatBuffer floatBuffer14 = byteBuffer13.asFloatBuffer();
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
        org.junit.Assert.assertNotNull(floatBuffer14);
    }

    @Test
    public void test0709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0709");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean3 = response2.executed;
        response2.statusCode = 0;
        java.lang.String str6 = response2.contentType();
        org.jsoup.Connection.Response response9 = response2.cookie("java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]", "java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response11 = response2.removeHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(response9);
    }

    @Test
    public void test0710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0710");
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
        java.nio.ByteBuffer byteBuffer14 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer15 = byteBuffer14.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer16 = byteBuffer14.asShortBuffer();
        byte[] byteArray17 = byteBuffer14.array();
        java.nio.ByteBuffer byteBuffer18 = java.nio.ByteBuffer.wrap(byteArray17);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer21 = byteBuffer7.put(byteArray17, (int) '\000', (int) (byte) -1);
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
        org.junit.Assert.assertNotNull(byteBuffer14);
        org.junit.Assert.assertNotNull(doubleBuffer15);
        org.junit.Assert.assertNotNull(shortBuffer16);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[]");
        org.junit.Assert.assertNotNull(byteBuffer18);
    }

    @Test
    public void test0711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0711");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect((int) '#');
        float float3 = byteBuffer1.getFloat(1);
        java.nio.ByteBuffer byteBuffer5 = byteBuffer1.putLong((long) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int6 = byteBuffer5.arrayOffset();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertNotNull(byteBuffer5);
    }

    @Test
    public void test0712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0712");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer2 = byteBuffer1.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        java.nio.ByteBuffer byteBuffer4 = byteBuffer1.compact();
        java.nio.ByteBuffer byteBuffer5 = byteBuffer1.slice();
        java.nio.FloatBuffer floatBuffer6 = byteBuffer5.asFloatBuffer();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer9 = byteBuffer5.putFloat(1677787392, (float) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(doubleBuffer2);
        org.junit.Assert.assertNotNull(shortBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertNotNull(floatBuffer6);
    }

    @Test
    public void test0713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0713");
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
        java.lang.String str16 = byteBuffer13.toString();
        int int17 = byteBuffer13.limit();
        // The following exception was thrown during execution in test generation
        try {
            short short19 = byteBuffer13.getShort((int) '#');
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
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]" + "'", str16, "java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test0714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0714");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer2 = byteBuffer1.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        java.nio.ByteOrder byteOrder4 = null;
        java.nio.ByteBuffer byteBuffer5 = byteBuffer1.order(byteOrder4);
        // The following exception was thrown during execution in test generation
        try {
            long long7 = byteBuffer5.getLong((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(doubleBuffer2);
        org.junit.Assert.assertNotNull(shortBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer5);
    }

    @Test
    public void test0715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0715");
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
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test0716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0716");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response0);
        response5.charset = "hi!";
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = response5.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0717");
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
            java.nio.ByteBuffer byteBuffer16 = byteBuffer1.putChar((int) '\u0a00', '#');
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
    public void test0718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0718");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer2 = byteBuffer1.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        java.nio.ByteBuffer byteBuffer4 = byteBuffer1.compact();
        java.nio.ByteBuffer byteBuffer5 = byteBuffer1.slice();
        java.nio.LongBuffer longBuffer6 = byteBuffer5.asLongBuffer();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer8 = byteBuffer5.putShort((short) 0);
            org.junit.Assert.fail("Expected exception of type java.nio.BufferOverflowException; message: null");
        } catch (java.nio.BufferOverflowException e) {
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
    public void test0719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0719");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = response11.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(byteBuffer4);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(uRL8);
    }

    @Test
    public void test0720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0720");
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
        org.jsoup.Connection.Response response12 = response9.cookie("java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]", "java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]");
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNotNull(response12);
    }

    @Test
    public void test0721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0721");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate((int) ' ');
        java.nio.Buffer buffer2 = byteBuffer1.rewind();
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.compact();
        java.nio.Buffer buffer4 = byteBuffer1.clear();
        java.nio.Buffer buffer5 = buffer4.mark();
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(buffer2);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertNotNull(buffer4);
        org.junit.Assert.assertNotNull(buffer5);
    }

    @Test
    public void test0722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0722");
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
        boolean boolean14 = byteBuffer7.isDirect();
        java.nio.ByteBuffer byteBuffer16 = java.nio.ByteBuffer.allocateDirect((int) '#');
        java.nio.ByteBuffer byteBuffer18 = byteBuffer16.putShort((short) 0);
        java.nio.ByteBuffer byteBuffer21 = byteBuffer18.putShort(0, (short) (byte) 10);
        short short23 = byteBuffer18.getShort((int) (byte) 10);
        java.nio.ByteBuffer byteBuffer25 = java.nio.ByteBuffer.allocate(0);
        boolean boolean26 = byteBuffer25.isReadOnly();
        java.nio.ShortBuffer shortBuffer27 = byteBuffer25.asShortBuffer();
        java.nio.ByteBuffer byteBuffer29 = java.nio.ByteBuffer.allocate(0);
        boolean boolean30 = byteBuffer29.isReadOnly();
        int int31 = byteBuffer25.compareTo(byteBuffer29);
        java.nio.Buffer buffer32 = byteBuffer29.clear();
        java.nio.ByteBuffer byteBuffer34 = java.nio.ByteBuffer.allocate(0);
        boolean boolean35 = byteBuffer34.hasRemaining();
        java.nio.ByteBuffer byteBuffer36 = byteBuffer29.put(byteBuffer34);
        java.nio.ByteBuffer byteBuffer38 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer39 = byteBuffer38.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer40 = byteBuffer38.asShortBuffer();
        byte[] byteArray41 = byteBuffer38.array();
        java.nio.ByteBuffer byteBuffer42 = java.nio.ByteBuffer.wrap(byteArray41);
        java.nio.ByteBuffer byteBuffer43 = byteBuffer36.put(byteArray41);
        java.nio.ByteBuffer byteBuffer44 = byteBuffer18.get(byteArray41);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer47 = byteBuffer7.get(byteArray41, (int) (short) 0, 7);
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(byteBuffer16);
        org.junit.Assert.assertNotNull(byteBuffer18);
        org.junit.Assert.assertNotNull(byteBuffer21);
        org.junit.Assert.assertTrue("'" + short23 + "' != '" + (short) 0 + "'", short23 == (short) 0);
        org.junit.Assert.assertNotNull(byteBuffer25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(shortBuffer27);
        org.junit.Assert.assertNotNull(byteBuffer29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(buffer32);
        org.junit.Assert.assertNotNull(byteBuffer34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(byteBuffer36);
        org.junit.Assert.assertNotNull(byteBuffer38);
        org.junit.Assert.assertNotNull(doubleBuffer39);
        org.junit.Assert.assertNotNull(shortBuffer40);
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray41), "[]");
        org.junit.Assert.assertNotNull(byteBuffer42);
        org.junit.Assert.assertNotNull(byteBuffer43);
        org.junit.Assert.assertNotNull(byteBuffer44);
    }

    @Test
    public void test0723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0723");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int3 = byteBuffer1.getInt((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
    }

    @Test
    public void test0724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0724");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response1);
        boolean boolean4 = response3.executed;
        response3.statusCode = 0;
        org.jsoup.Connection.Method method7 = response3.method();
        java.lang.String str8 = response3.charset();
        java.lang.String str10 = response3.header("java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response11 = org.jsoup.helper.HttpConnection.Response.execute(request0, response3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0725");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer2 = byteBuffer1.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        java.nio.ByteBuffer byteBuffer4 = byteBuffer1.compact();
        java.nio.ByteBuffer byteBuffer5 = byteBuffer1.slice();
        java.nio.Buffer buffer6 = byteBuffer5.flip();
        int int7 = byteBuffer5.position();
        java.nio.ByteBuffer byteBuffer9 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer10 = byteBuffer9.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer11 = byteBuffer9.asShortBuffer();
        java.nio.ByteOrder byteOrder12 = null;
        java.nio.ByteBuffer byteBuffer13 = byteBuffer9.order(byteOrder12);
        java.nio.ByteBuffer byteBuffer15 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer16 = byteBuffer15.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer17 = byteBuffer15.asShortBuffer();
        int int18 = byteBuffer15.limit();
        byte[] byteArray19 = byteBuffer15.array();
        java.nio.ByteBuffer byteBuffer20 = byteBuffer9.put(byteArray19);
        int int21 = byteBuffer20.position();
        int int22 = byteBuffer5.compareTo(byteBuffer20);
        // The following exception was thrown during execution in test generation
        try {
            double double23 = byteBuffer5.getDouble();
            org.junit.Assert.fail("Expected exception of type java.nio.BufferUnderflowException; message: null");
        } catch (java.nio.BufferUnderflowException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(doubleBuffer2);
        org.junit.Assert.assertNotNull(shortBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertNotNull(buffer6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertNotNull(doubleBuffer10);
        org.junit.Assert.assertNotNull(shortBuffer11);
        org.junit.Assert.assertNotNull(byteBuffer13);
        org.junit.Assert.assertNotNull(byteBuffer15);
        org.junit.Assert.assertNotNull(doubleBuffer16);
        org.junit.Assert.assertNotNull(shortBuffer17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[]");
        org.junit.Assert.assertNotNull(byteBuffer20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test0726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0726");
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
        // The following exception was thrown during execution in test generation
        try {
            long long19 = byteBuffer13.getLong(0);
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
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(buffer17);
    }

    @Test
    public void test0727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0727");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean3 = response2.executed;
        response2.statusCode = 0;
        java.lang.String str6 = response2.contentType();
        org.jsoup.Connection.Response response9 = response2.cookie("java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]", "java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry11 = response2.scanHeaders("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = strEntry11.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertNull(strEntry11);
    }

    @Test
    public void test0728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0728");
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
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response9);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = response10.hasHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNull(method7);
    }

    @Test
    public void test0729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0729");
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
        java.lang.Class<?> wildcardClass16 = response1.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0730");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response17 = response11.removeHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(byteBuffer4);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(uRL8);
        org.junit.Assert.assertNull(strEntry15);
    }

    @Test
    public void test0731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0731");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.nio.ByteBuffer byteBuffer4 = response3.byteData;
        org.jsoup.Connection.Response response7 = response3.cookie("hi!", "");
        java.net.URL uRL8 = response3.url();
        response3.statusMessage = "java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]";
        response3.numRedirects = (byte) 10;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = response3.hasHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(byteBuffer4);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(uRL8);
    }

    @Test
    public void test0732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0732");
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
            float float15 = byteBuffer1.getFloat((int) '#');
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
    }

    @Test
    public void test0733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0733");
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
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer25 = byteBuffer15.putFloat((float) 22);
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
        org.junit.Assert.assertNotNull(byteBuffer15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(shortBuffer17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(buffer20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(byteBuffer23);
    }

    @Test
    public void test0734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0734");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.hasRemaining();
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.asReadOnlyBuffer();
        java.nio.DoubleBuffer doubleBuffer4 = byteBuffer1.asDoubleBuffer();
        java.nio.IntBuffer intBuffer5 = byteBuffer1.asIntBuffer();
        java.nio.ByteBuffer byteBuffer6 = byteBuffer1.compact();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer8 = byteBuffer1.putLong(0L);
            org.junit.Assert.fail("Expected exception of type java.nio.BufferOverflowException; message: null");
        } catch (java.nio.BufferOverflowException e) {
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
    public void test0735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0735");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.isReadOnly();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        java.nio.ByteBuffer byteBuffer5 = java.nio.ByteBuffer.allocate(0);
        boolean boolean6 = byteBuffer5.isReadOnly();
        int int7 = byteBuffer1.compareTo(byteBuffer5);
        java.nio.DoubleBuffer doubleBuffer8 = byteBuffer5.asDoubleBuffer();
        java.nio.FloatBuffer floatBuffer9 = byteBuffer5.asFloatBuffer();
        int int10 = byteBuffer5.position();
        // The following exception was thrown during execution in test generation
        try {
            long long11 = byteBuffer5.getLong();
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
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0736");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean3 = response2.executed;
        response2.statusCode = 0;
        java.lang.String str6 = response2.contentType();
        org.jsoup.Connection.Response response9 = response2.cookie("java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]", "java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry11 = response2.scanHeaders("hi!");
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = response12.body();
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
    public void test0737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0737");
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
            java.nio.ByteBuffer byteBuffer26 = byteBuffer20.put((byte) -1);
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
    public void test0738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0738");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response14 = org.jsoup.helper.HttpConnection.Response.execute(request0, response13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(uRL7);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0739");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer2 = byteBuffer1.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        int int4 = byteBuffer1.capacity();
        java.nio.ByteBuffer byteBuffer6 = java.nio.ByteBuffer.allocate((int) (byte) 10);
        byte[] byteArray10 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.nio.ByteBuffer byteBuffer11 = java.nio.ByteBuffer.wrap(byteArray10);
        java.nio.ByteBuffer byteBuffer12 = byteBuffer6.get(byteArray10);
        java.nio.LongBuffer longBuffer13 = byteBuffer6.asLongBuffer();
        java.nio.ByteBuffer byteBuffer14 = byteBuffer6.slice();
        java.nio.ByteBuffer byteBuffer16 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer17 = byteBuffer16.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer18 = byteBuffer16.asShortBuffer();
        java.nio.ByteOrder byteOrder19 = null;
        java.nio.ByteBuffer byteBuffer20 = byteBuffer16.order(byteOrder19);
        java.nio.ByteBuffer byteBuffer22 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer23 = byteBuffer22.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer24 = byteBuffer22.asShortBuffer();
        int int25 = byteBuffer22.limit();
        byte[] byteArray26 = byteBuffer22.array();
        java.nio.ByteBuffer byteBuffer27 = byteBuffer16.put(byteArray26);
        java.nio.ByteBuffer byteBuffer28 = byteBuffer14.get(byteArray26);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer31 = byteBuffer1.get(byteArray26, (int) (short) 10, 31);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
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
        org.junit.Assert.assertNotNull(longBuffer13);
        org.junit.Assert.assertNotNull(byteBuffer14);
        org.junit.Assert.assertNotNull(byteBuffer16);
        org.junit.Assert.assertNotNull(doubleBuffer17);
        org.junit.Assert.assertNotNull(shortBuffer18);
        org.junit.Assert.assertNotNull(byteBuffer20);
        org.junit.Assert.assertNotNull(byteBuffer22);
        org.junit.Assert.assertNotNull(doubleBuffer23);
        org.junit.Assert.assertNotNull(shortBuffer24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[]");
        org.junit.Assert.assertNotNull(byteBuffer27);
        org.junit.Assert.assertNotNull(byteBuffer28);
    }

    @Test
    public void test0740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0740");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.isReadOnly();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        java.nio.ByteBuffer byteBuffer5 = java.nio.ByteBuffer.allocate(0);
        boolean boolean6 = byteBuffer5.isReadOnly();
        int int7 = byteBuffer1.compareTo(byteBuffer5);
        java.nio.ByteBuffer byteBuffer8 = byteBuffer5.compact();
        java.nio.Buffer buffer10 = byteBuffer5.limit((int) (short) 0);
        int int11 = byteBuffer5.remaining();
        java.nio.IntBuffer intBuffer12 = byteBuffer5.asIntBuffer();
        // The following exception was thrown during execution in test generation
        try {
            long long13 = byteBuffer5.getLong();
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
        org.junit.Assert.assertNotNull(intBuffer12);
    }

    @Test
    public void test0741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0741");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.nio.ByteBuffer byteBuffer4 = response3.byteData;
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response3);
        java.nio.ByteBuffer byteBuffer7 = java.nio.ByteBuffer.allocate(0);
        response3.byteData = byteBuffer7;
        java.nio.ByteBuffer byteBuffer9 = byteBuffer7.slice();
        java.nio.ByteBuffer byteBuffer11 = java.nio.ByteBuffer.allocate((int) (byte) 10);
        int int12 = byteBuffer11.getInt();
        java.nio.ByteBuffer byteBuffer15 = byteBuffer11.put((int) (byte) 0, (byte) 10);
        java.nio.ByteBuffer byteBuffer17 = java.nio.ByteBuffer.allocate(0);
        boolean boolean18 = byteBuffer17.isReadOnly();
        java.nio.ShortBuffer shortBuffer19 = byteBuffer17.asShortBuffer();
        java.nio.ByteBuffer byteBuffer21 = java.nio.ByteBuffer.allocate(0);
        boolean boolean22 = byteBuffer21.isReadOnly();
        int int23 = byteBuffer17.compareTo(byteBuffer21);
        java.nio.DoubleBuffer doubleBuffer24 = byteBuffer21.asDoubleBuffer();
        java.nio.FloatBuffer floatBuffer25 = byteBuffer21.asFloatBuffer();
        java.nio.ByteBuffer byteBuffer27 = java.nio.ByteBuffer.allocate((int) (byte) 10);
        byte[] byteArray31 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.nio.ByteBuffer byteBuffer32 = java.nio.ByteBuffer.wrap(byteArray31);
        java.nio.ByteBuffer byteBuffer33 = byteBuffer27.get(byteArray31);
        java.nio.ByteBuffer byteBuffer36 = byteBuffer21.put(byteArray31, 0, (int) (byte) 0);
        java.nio.ByteBuffer byteBuffer37 = java.nio.ByteBuffer.wrap(byteArray31);
        java.nio.ByteBuffer byteBuffer38 = byteBuffer11.put(byteArray31);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer41 = byteBuffer9.put(byteArray31, (int) '\u0a00', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(byteBuffer4);
        org.junit.Assert.assertNotNull(byteBuffer7);
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertNotNull(byteBuffer11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(byteBuffer15);
        org.junit.Assert.assertNotNull(byteBuffer17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(shortBuffer19);
        org.junit.Assert.assertNotNull(byteBuffer21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(doubleBuffer24);
        org.junit.Assert.assertNotNull(floatBuffer25);
        org.junit.Assert.assertNotNull(byteBuffer27);
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray31), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(byteBuffer32);
        org.junit.Assert.assertNotNull(byteBuffer33);
        org.junit.Assert.assertNotNull(byteBuffer36);
        org.junit.Assert.assertNotNull(byteBuffer37);
        org.junit.Assert.assertNotNull(byteBuffer38);
    }

    @Test
    public void test0742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0742");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate((int) ' ');
        int int3 = byteBuffer1.getInt((int) (short) 0);
        java.nio.ByteBuffer byteBuffer6 = byteBuffer1.putShort((int) (byte) 10, (short) 10);
        java.nio.ByteBuffer byteBuffer9 = byteBuffer6.putLong(3, (long) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer12 = byteBuffer6.putShort((-10), (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(byteBuffer6);
        org.junit.Assert.assertNotNull(byteBuffer9);
    }

    @Test
    public void test0743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0743");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = response3.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(byteBuffer4);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0744");
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
            java.nio.ByteBuffer byteBuffer18 = byteBuffer13.putDouble((int) (short) 100, (double) 22);
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0745");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.hasRemaining();
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.asReadOnlyBuffer();
        java.nio.DoubleBuffer doubleBuffer4 = byteBuffer1.asDoubleBuffer();
        java.nio.IntBuffer intBuffer5 = byteBuffer1.asIntBuffer();
        java.nio.ByteBuffer byteBuffer6 = byteBuffer1.compact();
        java.nio.ByteOrder byteOrder7 = null;
        java.nio.ByteBuffer byteBuffer8 = byteBuffer6.order(byteOrder7);
        // The following exception was thrown during execution in test generation
        try {
            float float9 = byteBuffer6.getFloat();
            org.junit.Assert.fail("Expected exception of type java.nio.BufferUnderflowException; message: null");
        } catch (java.nio.BufferUnderflowException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertNotNull(doubleBuffer4);
        org.junit.Assert.assertNotNull(intBuffer5);
        org.junit.Assert.assertNotNull(byteBuffer6);
        org.junit.Assert.assertNotNull(byteBuffer8);
    }

    @Test
    public void test0746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0746");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response14 = org.jsoup.helper.HttpConnection.Response.execute(request0, response12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(byteBuffer5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(uRL9);
    }

    @Test
    public void test0747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0747");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer4 = byteBuffer1.put((int) '4', (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
    }

    @Test
    public void test0748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0748");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.header("");
        org.jsoup.Connection.Response response5 = response1.removeCookie("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap6 = response1.headers();
        java.nio.ByteBuffer byteBuffer7 = response1.byteData;
        org.jsoup.Connection.Method method8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response9 = response1.method(method8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNull(byteBuffer7);
    }

    @Test
    public void test0749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0749");
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
        // The following exception was thrown during execution in test generation
        try {
            long long17 = byteBuffer11.getLong((int) (short) -1);
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
    }

    @Test
    public void test0750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0750");
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
        java.lang.String str24 = byteBuffer20.toString();
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
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "java.nio.HeapByteBufferR[pos=0 lim=0 cap=0]" + "'", str24, "java.nio.HeapByteBufferR[pos=0 lim=0 cap=0]");
    }

    @Test
    public void test0751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0751");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer2 = byteBuffer1.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        byte[] byteArray4 = byteBuffer1.array();
        java.nio.ByteBuffer byteBuffer5 = java.nio.ByteBuffer.wrap(byteArray4);
        java.nio.DoubleBuffer doubleBuffer6 = byteBuffer5.asDoubleBuffer();
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(doubleBuffer2);
        org.junit.Assert.assertNotNull(shortBuffer3);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[]");
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertNotNull(doubleBuffer6);
    }

    @Test
    public void test0752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0752");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate((int) (byte) 10);
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.nio.ByteBuffer byteBuffer6 = java.nio.ByteBuffer.wrap(byteArray5);
        java.nio.ByteBuffer byteBuffer7 = byteBuffer1.get(byteArray5);
        java.nio.ByteBuffer byteBuffer8 = byteBuffer1.slice();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer10 = byteBuffer1.putLong((long) (-1));
            org.junit.Assert.fail("Expected exception of type java.nio.BufferOverflowException; message: null");
        } catch (java.nio.BufferOverflowException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(byteBuffer6);
        org.junit.Assert.assertNotNull(byteBuffer7);
        org.junit.Assert.assertNotNull(byteBuffer8);
    }

    @Test
    public void test0753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0753");
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
        // The following exception was thrown during execution in test generation
        try {
            byte byte25 = byteBuffer23.get((int) 'a');
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
    }

    @Test
    public void test0754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0754");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect((int) '#');
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.putShort((short) 0);
        java.nio.ByteOrder byteOrder4 = byteBuffer3.order();
        double double5 = byteBuffer3.getDouble();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer8 = byteBuffer3.put((int) (short) -1, (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertNotNull(byteOrder4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test0755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0755");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str4 = response3.statusMessage();
        response3.contentType = "";
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray7 = response3.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test0756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0756");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str4 = response2.header("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response5 = org.jsoup.helper.HttpConnection.Response.execute(request0, response2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test0757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0757");
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
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer22 = byteBuffer20.putChar('\u0a00');
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
    }

    @Test
    public void test0758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0758");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(35);
        long long3 = byteBuffer1.getLong((int) (byte) 0);
        java.nio.LongBuffer longBuffer4 = byteBuffer1.asLongBuffer();
        int int5 = longBuffer4.remaining();
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(longBuffer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
    }

    @Test
    public void test0759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0759");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        response2.charset = "";
        response2.statusCode = '\u0a00';
    }

    @Test
    public void test0760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0760");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer2 = byteBuffer1.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        java.nio.ByteOrder byteOrder4 = null;
        java.nio.ByteBuffer byteBuffer5 = byteBuffer1.order(byteOrder4);
        java.nio.ByteBuffer byteBuffer6 = byteBuffer5.asReadOnlyBuffer();
        int int7 = byteBuffer5.arrayOffset();
        java.nio.ByteBuffer byteBuffer9 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer10 = byteBuffer9.asDoubleBuffer();
        boolean boolean11 = byteBuffer9.isDirect();
        java.lang.String str12 = byteBuffer9.toString();
        byte[] byteArray13 = byteBuffer9.array();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer16 = byteBuffer5.get(byteArray13, (int) (short) 10, (int) (byte) 0);
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
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertNotNull(doubleBuffer10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]" + "'", str12, "java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]");
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[]");
    }

    @Test
    public void test0761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0761");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate((int) (byte) 10);
        int int2 = byteBuffer1.getInt();
        java.nio.ByteBuffer byteBuffer5 = byteBuffer1.put((int) (byte) 0, (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            long long6 = byteBuffer1.getLong();
            org.junit.Assert.fail("Expected exception of type java.nio.BufferUnderflowException; message: null");
        } catch (java.nio.BufferUnderflowException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(byteBuffer5);
    }

    @Test
    public void test0762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0762");
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
            float float11 = byteBuffer6.getFloat((int) (byte) 1);
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
    public void test0763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0763");
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
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response2);
        java.nio.ByteBuffer byteBuffer15 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer16 = byteBuffer15.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer17 = byteBuffer15.asShortBuffer();
        java.nio.ByteBuffer byteBuffer18 = byteBuffer15.duplicate();
        response2.byteData = byteBuffer15;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response22 = response2.header("", "java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(request3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(byteBuffer15);
        org.junit.Assert.assertNotNull(doubleBuffer16);
        org.junit.Assert.assertNotNull(shortBuffer17);
        org.junit.Assert.assertNotNull(byteBuffer18);
    }

    @Test
    public void test0764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0764");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer2 = byteBuffer1.asDoubleBuffer();
        java.nio.FloatBuffer floatBuffer3 = byteBuffer1.asFloatBuffer();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.Buffer buffer4 = floatBuffer3.reset();
            org.junit.Assert.fail("Expected exception of type java.nio.InvalidMarkException; message: null");
        } catch (java.nio.InvalidMarkException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(doubleBuffer2);
        org.junit.Assert.assertNotNull(floatBuffer3);
    }

    @Test
    public void test0765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0765");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate((int) ' ');
        java.nio.Buffer buffer2 = byteBuffer1.rewind();
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.compact();
        java.nio.ByteOrder byteOrder4 = byteBuffer1.order();
        // The following exception was thrown during execution in test generation
        try {
            byte byte6 = byteBuffer1.get((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(buffer2);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertNotNull(byteOrder4);
    }

    @Test
    public void test0766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0766");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.isReadOnly();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        java.nio.Buffer buffer4 = shortBuffer3.rewind();
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(shortBuffer3);
        org.junit.Assert.assertNotNull(buffer4);
    }

    @Test
    public void test0767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0767");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Request request4 = response3.req;
        org.jsoup.Connection.Method method5 = response3.method();
        java.lang.String str6 = response3.contentType;
        java.util.Map<java.lang.String, java.lang.String> strMap7 = response3.headers();
        java.nio.ByteBuffer byteBuffer9 = java.nio.ByteBuffer.allocate(0);
        boolean boolean10 = byteBuffer9.isReadOnly();
        java.nio.ShortBuffer shortBuffer11 = byteBuffer9.asShortBuffer();
        int int12 = byteBuffer9.position();
        boolean boolean13 = byteBuffer9.isReadOnly();
        java.nio.ByteBuffer byteBuffer15 = java.nio.ByteBuffer.allocate(0);
        boolean boolean16 = byteBuffer15.isReadOnly();
        java.nio.ShortBuffer shortBuffer17 = byteBuffer15.asShortBuffer();
        int int18 = byteBuffer15.position();
        boolean boolean19 = byteBuffer15.isReadOnly();
        int int20 = byteBuffer9.compareTo(byteBuffer15);
        java.nio.ByteBuffer byteBuffer22 = java.nio.ByteBuffer.allocate(0);
        boolean boolean23 = byteBuffer22.isReadOnly();
        java.nio.ShortBuffer shortBuffer24 = byteBuffer22.asShortBuffer();
        int int25 = byteBuffer22.position();
        java.nio.ByteOrder byteOrder26 = null;
        java.nio.ByteBuffer byteBuffer27 = byteBuffer22.order(byteOrder26);
        java.nio.ByteBuffer byteBuffer28 = byteBuffer22.asReadOnlyBuffer();
        java.nio.ByteBuffer byteBuffer29 = byteBuffer9.put(byteBuffer28);
        response3.byteData = byteBuffer29;
        org.jsoup.helper.HttpConnection.Response response31 = new org.jsoup.helper.HttpConnection.Response(response3);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response32 = org.jsoup.helper.HttpConnection.Response.execute(request0, response31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(request4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(shortBuffer11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(byteBuffer15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(shortBuffer17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(byteBuffer22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(shortBuffer24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(byteBuffer27);
        org.junit.Assert.assertNotNull(byteBuffer28);
        org.junit.Assert.assertNotNull(byteBuffer29);
    }

    @Test
    public void test0768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0768");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer2 = byteBuffer1.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        java.nio.ByteBuffer byteBuffer4 = byteBuffer1.compact();
        int int5 = byteBuffer4.capacity();
        java.nio.ByteBuffer byteBuffer6 = byteBuffer4.compact();
        java.nio.ByteBuffer byteBuffer8 = java.nio.ByteBuffer.allocate(0);
        boolean boolean9 = byteBuffer8.isReadOnly();
        java.nio.ShortBuffer shortBuffer10 = byteBuffer8.asShortBuffer();
        java.nio.ByteBuffer byteBuffer12 = java.nio.ByteBuffer.allocate(0);
        boolean boolean13 = byteBuffer12.isReadOnly();
        int int14 = byteBuffer8.compareTo(byteBuffer12);
        java.nio.DoubleBuffer doubleBuffer15 = byteBuffer12.asDoubleBuffer();
        java.nio.FloatBuffer floatBuffer16 = byteBuffer12.asFloatBuffer();
        java.nio.ByteBuffer byteBuffer18 = java.nio.ByteBuffer.allocate((int) (byte) 10);
        byte[] byteArray22 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.nio.ByteBuffer byteBuffer23 = java.nio.ByteBuffer.wrap(byteArray22);
        java.nio.ByteBuffer byteBuffer24 = byteBuffer18.get(byteArray22);
        java.nio.ByteBuffer byteBuffer27 = byteBuffer12.put(byteArray22, 0, (int) (byte) 0);
        java.nio.ByteBuffer byteBuffer28 = java.nio.ByteBuffer.wrap(byteArray22);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer31 = byteBuffer6.put(byteArray22, 10, 1677787392);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(doubleBuffer2);
        org.junit.Assert.assertNotNull(shortBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(byteBuffer6);
        org.junit.Assert.assertNotNull(byteBuffer8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(shortBuffer10);
        org.junit.Assert.assertNotNull(byteBuffer12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(doubleBuffer15);
        org.junit.Assert.assertNotNull(floatBuffer16);
        org.junit.Assert.assertNotNull(byteBuffer18);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(byteBuffer23);
        org.junit.Assert.assertNotNull(byteBuffer24);
        org.junit.Assert.assertNotNull(byteBuffer27);
        org.junit.Assert.assertNotNull(byteBuffer28);
    }

    @Test
    public void test0769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0769");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate((int) (byte) 100);
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.putDouble((double) '4');
        byte[] byteArray9 = new byte[] { (byte) 1, (byte) 100, (byte) -1, (byte) 10, (byte) -1 };
        java.nio.ByteBuffer byteBuffer10 = byteBuffer1.put(byteArray9);
        char char11 = byteBuffer10.getChar();
        java.nio.ByteBuffer byteBuffer12 = byteBuffer10.slice();
        // The following exception was thrown during execution in test generation
        try {
            int int14 = byteBuffer12.getInt((-10));
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
    }

    @Test
    public void test0770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0770");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.nio.ByteBuffer byteBuffer4 = response3.byteData;
        java.lang.String str5 = response3.charset;
        boolean boolean7 = response3.hasCookie("hi!");
        org.jsoup.Connection.Response response9 = response3.removeHeader("java.nio.HeapByteBuffer[pos=0 lim=32 cap=32]");
        java.net.URL uRL10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response11 = response3.url(uRL10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(byteBuffer4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(response9);
    }

    @Test
    public void test0771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0771");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean3 = response2.executed;
        java.lang.String str5 = response2.getHeaderCaseInsensitive("");
        java.lang.String str7 = response2.cookie("java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]");
        int int8 = response2.statusCode();
        java.lang.String str9 = response2.statusMessage;
        java.net.HttpURLConnection httpURLConnection10 = null;
        org.jsoup.helper.HttpConnection.Response response11 = null;
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response11);
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response11);
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response11);
        java.nio.ByteBuffer byteBuffer15 = response14.byteData;
        org.jsoup.Connection.Response response18 = response14.cookie("hi!", "");
        boolean boolean19 = response14.executed;
        java.lang.String str20 = response14.charset();
        java.net.URL uRL21 = response14.url();
        java.lang.String str22 = response14.charset();
        org.jsoup.helper.HttpConnection.Response response23 = new org.jsoup.helper.HttpConnection.Response(response14);
        org.jsoup.helper.HttpConnection.Response response24 = new org.jsoup.helper.HttpConnection.Response(response23);
        org.jsoup.helper.HttpConnection.Response response25 = new org.jsoup.helper.HttpConnection.Response(response23);
        org.jsoup.Connection.Request request26 = null;
        response23.req = request26;
        // The following exception was thrown during execution in test generation
        try {
            response2.setupFromConnection(httpURLConnection10, (org.jsoup.Connection.Response) response23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(byteBuffer15);
        org.junit.Assert.assertNotNull(response18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(uRL21);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test0772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0772");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.header("");
        org.jsoup.Connection.Response response5 = response1.removeCookie("hi!");
        java.lang.String str6 = response1.charset();
        response1.contentType = "java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]";
        java.net.HttpURLConnection httpURLConnection9 = null;
        org.jsoup.helper.HttpConnection.Response response10 = null;
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response10);
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response10);
        java.net.URL uRL13 = response12.url();
        java.lang.String str14 = response12.contentType();
        // The following exception was thrown during execution in test generation
        try {
            response1.setupFromConnection(httpURLConnection9, (org.jsoup.Connection.Response) response12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(uRL13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test0773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0773");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response1);
        boolean boolean4 = response3.executed;
        java.lang.String str6 = response3.getHeaderCaseInsensitive("");
        java.lang.String str8 = response3.cookie("java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]");
        int int9 = response3.statusCode();
        org.jsoup.Connection.Response response12 = response3.cookie("hi!", "");
        java.nio.ByteBuffer byteBuffer14 = java.nio.ByteBuffer.allocate(0);
        boolean boolean15 = byteBuffer14.isReadOnly();
        java.nio.ShortBuffer shortBuffer16 = byteBuffer14.asShortBuffer();
        java.nio.ByteBuffer byteBuffer18 = java.nio.ByteBuffer.allocate(0);
        boolean boolean19 = byteBuffer18.isReadOnly();
        int int20 = byteBuffer14.compareTo(byteBuffer18);
        java.nio.DoubleBuffer doubleBuffer21 = byteBuffer18.asDoubleBuffer();
        response3.byteData = byteBuffer18;
        org.jsoup.helper.HttpConnection.Response response23 = new org.jsoup.helper.HttpConnection.Response(response3);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response24 = org.jsoup.helper.HttpConnection.Response.execute(request0, response23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNotNull(byteBuffer14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(shortBuffer16);
        org.junit.Assert.assertNotNull(byteBuffer18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(doubleBuffer21);
    }

    @Test
    public void test0774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0774");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.hasRemaining();
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.asReadOnlyBuffer();
        java.nio.DoubleBuffer doubleBuffer4 = byteBuffer1.asDoubleBuffer();
        java.nio.IntBuffer intBuffer5 = byteBuffer1.asIntBuffer();
        java.nio.ByteBuffer byteBuffer6 = byteBuffer1.compact();
        java.nio.ByteOrder byteOrder7 = null;
        java.nio.ByteBuffer byteBuffer8 = byteBuffer6.order(byteOrder7);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.Buffer buffer9 = byteBuffer8.reset();
            org.junit.Assert.fail("Expected exception of type java.nio.InvalidMarkException; message: null");
        } catch (java.nio.InvalidMarkException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertNotNull(doubleBuffer4);
        org.junit.Assert.assertNotNull(intBuffer5);
        org.junit.Assert.assertNotNull(byteBuffer6);
        org.junit.Assert.assertNotNull(byteBuffer8);
    }

    @Test
    public void test0775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0775");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request3 = response2.req;
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response2);
        java.lang.String str5 = response4.contentType;
        java.nio.ByteBuffer byteBuffer6 = response4.byteData;
        java.net.HttpURLConnection httpURLConnection7 = null;
        org.jsoup.helper.HttpConnection.Response response8 = null;
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response8);
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response8);
        boolean boolean11 = response10.executed;
        java.lang.String str13 = response10.getHeaderCaseInsensitive("");
        java.lang.String str15 = response10.cookie("java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]");
        int int16 = response10.statusCode();
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response10);
        // The following exception was thrown during execution in test generation
        try {
            response4.setupFromConnection(httpURLConnection7, (org.jsoup.Connection.Response) response10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(request3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(byteBuffer6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test0776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0776");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.isReadOnly();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        int int4 = byteBuffer1.position();
        int int5 = byteBuffer1.capacity();
        java.nio.Buffer buffer6 = byteBuffer1.flip();
        // The following exception was thrown during execution in test generation
        try {
            char char8 = byteBuffer1.getChar(3);
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
    public void test0777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0777");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.nio.ByteBuffer byteBuffer4 = response3.byteData;
        org.jsoup.Connection.Response response7 = response3.cookie("hi!", "");
        java.net.URL uRL8 = response3.url();
        response3.charset = "";
        response3.statusMessage = "hi!";
        response3.statusCode = (-1);
        boolean boolean16 = response3.hasCookie("");
        org.junit.Assert.assertNull(byteBuffer4);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(uRL8);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0778");
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
        // The following exception was thrown during execution in test generation
        try {
            int int17 = byteBuffer15.getInt((int) (short) 0);
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
    }

    @Test
    public void test0779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0779");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer2 = byteBuffer1.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        java.nio.ByteOrder byteOrder4 = null;
        java.nio.ByteBuffer byteBuffer5 = byteBuffer1.order(byteOrder4);
        // The following exception was thrown during execution in test generation
        try {
            double double6 = byteBuffer1.getDouble();
            org.junit.Assert.fail("Expected exception of type java.nio.BufferUnderflowException; message: null");
        } catch (java.nio.BufferUnderflowException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(doubleBuffer2);
        org.junit.Assert.assertNotNull(shortBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer5);
    }

    @Test
    public void test0780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0780");
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
        java.nio.Buffer buffer17 = byteBuffer16.flip();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer19 = byteBuffer16.putChar(' ');
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
        org.junit.Assert.assertNotNull(buffer9);
        org.junit.Assert.assertNotNull(buffer10);
        org.junit.Assert.assertNotNull(byteBuffer12);
        org.junit.Assert.assertNotNull(doubleBuffer13);
        org.junit.Assert.assertNotNull(shortBuffer14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]" + "'", str15, "java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]");
        org.junit.Assert.assertNotNull(byteBuffer16);
        org.junit.Assert.assertNotNull(buffer17);
    }

    @Test
    public void test0781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0781");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer2 = byteBuffer1.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        int int4 = byteBuffer1.capacity();
        java.nio.LongBuffer longBuffer5 = byteBuffer1.asLongBuffer();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer8 = byteBuffer1.putLong((int) (byte) 100, 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(doubleBuffer2);
        org.junit.Assert.assertNotNull(shortBuffer3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(longBuffer5);
    }

    @Test
    public void test0782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0782");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer2 = byteBuffer1.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        java.nio.ByteBuffer byteBuffer4 = byteBuffer1.compact();
        java.nio.ByteBuffer byteBuffer5 = byteBuffer1.slice();
        java.nio.ByteOrder byteOrder6 = byteBuffer1.order();
        java.nio.ByteBuffer byteBuffer7 = byteBuffer1.compact();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer10 = byteBuffer1.putFloat((int) (short) 0, (float) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
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
    public void test0783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0783");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean3 = response2.executed;
        java.lang.String str5 = response2.getHeaderCaseInsensitive("");
        java.lang.String str7 = response2.cookie("java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]");
        int int8 = response2.statusCode();
        org.jsoup.Connection.Response response11 = response2.cookie("hi!", "");
        java.net.URL uRL12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response13 = response2.url(uRL12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(response11);
    }

    @Test
    public void test0784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0784");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate((int) ' ');
        java.nio.Buffer buffer2 = byteBuffer1.rewind();
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.compact();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer5 = byteBuffer1.putChar('\u0a00');
            org.junit.Assert.fail("Expected exception of type java.nio.BufferOverflowException; message: null");
        } catch (java.nio.BufferOverflowException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(buffer2);
        org.junit.Assert.assertNotNull(byteBuffer3);
    }

    @Test
    public void test0785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0785");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response1);
        boolean boolean4 = response3.executed;
        response3.statusCode = 0;
        org.jsoup.Connection.Method method7 = response3.method();
        java.lang.String str8 = response3.charset();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response9 = org.jsoup.helper.HttpConnection.Response.execute(request0, response3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0786");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document16 = response15.parse();
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
    }

    @Test
    public void test0787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0787");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.ByteBuffer byteBuffer2 = byteBuffer1.slice();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer5 = byteBuffer1.put((int) (short) 10, (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteBuffer2);
    }

    @Test
    public void test0788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0788");
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
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray13 = response3.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(byteBuffer4);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(request9);
    }

    @Test
    public void test0789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0789");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean5 = response3.hasHeader("hi!");
        response3.contentType = "java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]";
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = response3.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0790");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.isReadOnly();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        java.nio.ByteBuffer byteBuffer5 = java.nio.ByteBuffer.allocate(0);
        boolean boolean6 = byteBuffer5.isReadOnly();
        int int7 = byteBuffer1.compareTo(byteBuffer5);
        java.nio.Buffer buffer8 = byteBuffer5.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer11 = byteBuffer5.putDouble((int) '4', (double) (short) 100);
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
    }

    @Test
    public void test0791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0791");
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
            java.nio.ByteBuffer byteBuffer34 = byteBuffer29.putFloat((float) (short) 100);
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
    public void test0792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0792");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer2 = byteBuffer1.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        java.nio.ByteOrder byteOrder4 = null;
        java.nio.ByteBuffer byteBuffer5 = byteBuffer1.order(byteOrder4);
        java.nio.ByteBuffer byteBuffer6 = byteBuffer5.asReadOnlyBuffer();
        java.nio.DoubleBuffer doubleBuffer7 = byteBuffer6.asDoubleBuffer();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.Buffer buffer8 = doubleBuffer7.reset();
            org.junit.Assert.fail("Expected exception of type java.nio.InvalidMarkException; message: null");
        } catch (java.nio.InvalidMarkException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(doubleBuffer2);
        org.junit.Assert.assertNotNull(shortBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertNotNull(byteBuffer6);
        org.junit.Assert.assertNotNull(doubleBuffer7);
    }

    @Test
    public void test0793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0793");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.nio.ByteBuffer byteBuffer5 = response4.byteData;
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response4);
        int int7 = response4.statusCode();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response8 = org.jsoup.helper.HttpConnection.Response.execute(request0, response4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(byteBuffer5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0794");
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
            float float24 = byteBuffer20.getFloat((int) 'a');
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
    }

    @Test
    public void test0795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0795");
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Negative capacity: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0796");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate((int) (byte) 10);
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.nio.ByteBuffer byteBuffer6 = java.nio.ByteBuffer.wrap(byteArray5);
        java.nio.ByteBuffer byteBuffer7 = byteBuffer1.get(byteArray5);
        java.nio.Buffer buffer8 = byteBuffer1.rewind();
        java.nio.ByteBuffer byteBuffer10 = byteBuffer1.putInt((int) (short) 10);
        java.nio.ByteBuffer byteBuffer11 = byteBuffer1.asReadOnlyBuffer();
        // The following exception was thrown during execution in test generation
        try {
            long long12 = byteBuffer11.getLong();
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
    public void test0797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0797");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.nio.ByteBuffer byteBuffer5 = response4.byteData;
        org.jsoup.Connection.Response response8 = response4.cookie("hi!", "");
        boolean boolean9 = response4.executed;
        java.lang.String str10 = response4.charset();
        java.net.URL uRL11 = response4.url();
        java.lang.String str12 = response4.charset();
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response4);
        java.lang.String str14 = response4.statusMessage();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response15 = org.jsoup.helper.HttpConnection.Response.execute(request0, response4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(byteBuffer5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test0798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0798");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer2 = byteBuffer1.asDoubleBuffer();
        boolean boolean3 = byteBuffer1.isDirect();
        int int4 = byteBuffer1.arrayOffset();
        java.nio.ByteBuffer byteBuffer5 = byteBuffer1.asReadOnlyBuffer();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.Buffer buffer6 = byteBuffer1.reset();
            org.junit.Assert.fail("Expected exception of type java.nio.InvalidMarkException; message: null");
        } catch (java.nio.InvalidMarkException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(doubleBuffer2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(byteBuffer5);
    }

    @Test
    public void test0799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0799");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean3 = response2.executed;
        response2.statusCode = 0;
        java.lang.String str6 = response2.contentType();
        org.jsoup.Connection.Response response9 = response2.cookie("java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]", "java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry11 = response2.scanHeaders("hi!");
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response2);
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response2);
        response13.statusMessage = "java.nio.HeapByteBufferR[pos=0 lim=0 cap=0]";
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertNull(strEntry11);
    }

    @Test
    public void test0800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0800");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document14 = response11.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(byteBuffer4);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(uRL8);
    }

    @Test
    public void test0801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0801");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer2 = byteBuffer1.asDoubleBuffer();
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.compact();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer5 = byteBuffer1.putLong((long) 22);
            org.junit.Assert.fail("Expected exception of type java.nio.BufferOverflowException; message: null");
        } catch (java.nio.BufferOverflowException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(doubleBuffer2);
        org.junit.Assert.assertNotNull(byteBuffer3);
    }

    @Test
    public void test0802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0802");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.isReadOnly();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        int int4 = byteBuffer1.position();
        boolean boolean5 = byteBuffer1.isReadOnly();
        java.nio.CharBuffer charBuffer6 = byteBuffer1.asCharBuffer();
        int int7 = charBuffer6.limit();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.Buffer buffer9 = charBuffer6.limit(1677787392);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(shortBuffer3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(charBuffer6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0803");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.nio.ByteBuffer byteBuffer4 = response3.byteData;
        java.lang.String str5 = response3.statusMessage();
        java.lang.String str6 = response3.charset;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry8 = response3.scanHeaders("java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]");
        int int9 = response3.statusCode();
        java.net.URL uRL10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response11 = response3.url(uRL10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(byteBuffer4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(strEntry8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0804");
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
            byte byte19 = byteBuffer15.get();
            org.junit.Assert.fail("Expected exception of type java.nio.BufferUnderflowException; message: null");
        } catch (java.nio.BufferUnderflowException e) {
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
    public void test0805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0805");
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
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response2);
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry15 = response13.scanHeaders("");
        org.junit.Assert.assertNull(request3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(strEntry15);
    }

    @Test
    public void test0806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0806");
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
        response12.statusCode = '4';
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry16 = response12.scanHeaders("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response17 = org.jsoup.helper.HttpConnection.Response.execute(request0, response12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(byteBuffer5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertNull(strEntry16);
    }

    @Test
    public void test0807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0807");
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
        java.lang.String str17 = response15.getHeaderCaseInsensitive("");
        boolean boolean18 = response15.executed;
        org.jsoup.Connection.Method method19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response20 = response15.method(method19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0808");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.nio.ByteBuffer byteBuffer4 = response3.byteData;
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response3);
        java.nio.ByteBuffer byteBuffer7 = java.nio.ByteBuffer.allocate(0);
        response3.byteData = byteBuffer7;
        java.nio.ByteBuffer byteBuffer9 = byteBuffer7.slice();
        boolean boolean10 = byteBuffer9.hasArray();
        java.nio.ByteBuffer byteBuffer12 = java.nio.ByteBuffer.allocate((int) (byte) 10);
        byte[] byteArray16 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.nio.ByteBuffer byteBuffer17 = java.nio.ByteBuffer.wrap(byteArray16);
        java.nio.ByteBuffer byteBuffer18 = byteBuffer12.get(byteArray16);
        java.nio.Buffer buffer19 = byteBuffer12.rewind();
        java.nio.ByteOrder byteOrder20 = byteBuffer12.order();
        boolean boolean21 = byteBuffer12.hasRemaining();
        byte[] byteArray24 = new byte[] { (byte) 10, (byte) 1 };
        java.nio.ByteBuffer byteBuffer25 = byteBuffer12.put(byteArray24);
        java.nio.ByteBuffer byteBuffer26 = java.nio.ByteBuffer.wrap(byteArray24);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer27 = byteBuffer9.get(byteArray24);
            org.junit.Assert.fail("Expected exception of type java.nio.BufferUnderflowException; message: null");
        } catch (java.nio.BufferUnderflowException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(byteBuffer4);
        org.junit.Assert.assertNotNull(byteBuffer7);
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(byteBuffer12);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(byteBuffer17);
        org.junit.Assert.assertNotNull(byteBuffer18);
        org.junit.Assert.assertNotNull(buffer19);
        org.junit.Assert.assertNotNull(byteOrder20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[10, 1]");
        org.junit.Assert.assertNotNull(byteBuffer25);
        org.junit.Assert.assertNotNull(byteBuffer26);
    }

    @Test
    public void test0809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0809");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.statusCode();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document3 = response1.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0810");
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
            java.nio.ByteBuffer byteBuffer21 = byteBuffer1.putLong((int) '#', (long) 0);
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
    public void test0811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0811");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean3 = response2.executed;
        response2.statusCode = 0;
        java.lang.String str6 = response2.contentType();
        java.lang.String str8 = response2.getHeaderCaseInsensitive("");
        java.net.HttpURLConnection httpURLConnection9 = null;
        org.jsoup.helper.HttpConnection.Response response10 = null;
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response10);
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response10);
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response10);
        java.nio.ByteBuffer byteBuffer14 = response13.byteData;
        org.jsoup.Connection.Response response17 = response13.cookie("hi!", "");
        boolean boolean18 = response13.executed;
        java.lang.String str19 = response13.charset();
        // The following exception was thrown during execution in test generation
        try {
            response2.setupFromConnection(httpURLConnection9, (org.jsoup.Connection.Response) response13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(byteBuffer14);
        org.junit.Assert.assertNotNull(response17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test0812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0812");
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
        // The following exception was thrown during execution in test generation
        try {
            int int16 = byteBuffer14.getInt((int) (byte) 100);
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
    }

    @Test
    public void test0813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0813");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean3 = response2.executed;
        java.lang.String str5 = response2.getHeaderCaseInsensitive("");
        java.net.URL uRL6 = response2.url();
        org.jsoup.Connection.Response response8 = response2.removeCookie("");
        java.nio.ByteBuffer byteBuffer9 = response2.byteData;
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response2);
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response10);
        java.lang.String str12 = response11.contentType();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(byteBuffer9);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test0814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0814");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate((int) (byte) 10);
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.nio.ByteBuffer byteBuffer6 = java.nio.ByteBuffer.wrap(byteArray5);
        java.nio.ByteBuffer byteBuffer7 = byteBuffer1.get(byteArray5);
        java.nio.Buffer buffer8 = byteBuffer1.rewind();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.Buffer buffer9 = buffer8.reset();
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
    }

    @Test
    public void test0815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0815");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.hasRemaining();
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.asReadOnlyBuffer();
        java.nio.LongBuffer longBuffer4 = byteBuffer1.asLongBuffer();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer6 = byteBuffer1.putShort((short) -1);
            org.junit.Assert.fail("Expected exception of type java.nio.BufferOverflowException; message: null");
        } catch (java.nio.BufferOverflowException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertNotNull(longBuffer4);
    }

    @Test
    public void test0816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0816");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.nio.ByteBuffer byteBuffer4 = response3.byteData;
        java.lang.String str5 = response3.statusMessage();
        java.lang.String str6 = response3.charset;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry8 = response3.scanHeaders("java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = response3.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(byteBuffer4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(strEntry8);
    }

    @Test
    public void test0817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0817");
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
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer23 = byteBuffer5.putFloat(1677787392, (float) '\u0a00');
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
    }

    @Test
    public void test0818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0818");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer2 = byteBuffer1.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        java.nio.ByteOrder byteOrder4 = null;
        java.nio.ByteBuffer byteBuffer5 = byteBuffer1.order(byteOrder4);
        java.nio.ByteBuffer byteBuffer6 = byteBuffer5.asReadOnlyBuffer();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer9 = byteBuffer6.putLong(22, (long) 85);
            org.junit.Assert.fail("Expected exception of type java.nio.ReadOnlyBufferException; message: null");
        } catch (java.nio.ReadOnlyBufferException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(doubleBuffer2);
        org.junit.Assert.assertNotNull(shortBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertNotNull(byteBuffer6);
    }

    @Test
    public void test0819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0819");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.nio.ByteBuffer byteBuffer8 = java.nio.ByteBuffer.allocate(0);
        boolean boolean9 = byteBuffer8.hasRemaining();
        java.nio.ByteBuffer byteBuffer10 = byteBuffer8.asReadOnlyBuffer();
        boolean boolean11 = byteBuffer10.hasRemaining();
        response6.byteData = byteBuffer10;
        java.nio.ByteBuffer byteBuffer13 = response6.byteData;
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response6);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response15 = org.jsoup.helper.HttpConnection.Response.execute(request0, response14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(byteBuffer10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(byteBuffer13);
    }

    @Test
    public void test0820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0820");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean3 = response2.executed;
        java.lang.String str5 = response2.getHeaderCaseInsensitive("");
        java.lang.String str7 = response2.cookie("java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]");
        int int8 = response2.statusCode();
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response2);
        java.util.Map<java.lang.String, java.lang.String> strMap10 = response9.headers();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(strMap10);
    }

    @Test
    public void test0821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0821");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate((int) (byte) 10);
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.nio.ByteBuffer byteBuffer6 = java.nio.ByteBuffer.wrap(byteArray5);
        java.nio.ByteBuffer byteBuffer7 = byteBuffer1.get(byteArray5);
        java.nio.IntBuffer intBuffer8 = byteBuffer7.asIntBuffer();
        char char9 = byteBuffer7.getChar();
        java.nio.Buffer buffer10 = byteBuffer7.flip();
        java.nio.Buffer buffer11 = buffer10.clear();
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(byteBuffer6);
        org.junit.Assert.assertNotNull(byteBuffer7);
        org.junit.Assert.assertNotNull(intBuffer8);
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '\000' + "'", char9 == '\000');
        org.junit.Assert.assertNotNull(buffer10);
        org.junit.Assert.assertNotNull(buffer11);
    }

    @Test
    public void test0822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0822");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer2 = byteBuffer1.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        java.lang.String str4 = byteBuffer1.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.Buffer buffer5 = byteBuffer1.reset();
            org.junit.Assert.fail("Expected exception of type java.nio.InvalidMarkException; message: null");
        } catch (java.nio.InvalidMarkException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(doubleBuffer2);
        org.junit.Assert.assertNotNull(shortBuffer3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]" + "'", str4, "java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]");
    }

    @Test
    public void test0823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0823");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.isReadOnly();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        int int4 = byteBuffer1.position();
        int int5 = byteBuffer1.arrayOffset();
        int int6 = byteBuffer1.limit();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.Buffer buffer8 = byteBuffer1.limit(22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
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
    public void test0824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0824");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate((int) (byte) 10);
        int int2 = byteBuffer1.getInt();
        java.nio.ByteBuffer byteBuffer5 = byteBuffer1.put((int) (byte) 0, (byte) 10);
        java.nio.IntBuffer intBuffer6 = byteBuffer1.asIntBuffer();
        byte[] byteArray10 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.nio.ByteBuffer byteBuffer11 = java.nio.ByteBuffer.wrap(byteArray10);
        java.nio.ByteBuffer byteBuffer12 = java.nio.ByteBuffer.wrap(byteArray10);
        java.nio.ByteBuffer byteBuffer13 = byteBuffer1.get(byteArray10);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer15 = byteBuffer13.putInt((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.nio.BufferOverflowException; message: null");
        } catch (java.nio.BufferOverflowException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertNotNull(intBuffer6);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(byteBuffer11);
        org.junit.Assert.assertNotNull(byteBuffer12);
        org.junit.Assert.assertNotNull(byteBuffer13);
    }

    @Test
    public void test0825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0825");
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
        // The following exception was thrown during execution in test generation
        try {
            float float18 = byteBuffer13.getFloat((int) (byte) 100);
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
        org.junit.Assert.assertNotNull(intBuffer16);
    }

    @Test
    public void test0826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0826");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.hasRemaining();
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.asReadOnlyBuffer();
        java.nio.LongBuffer longBuffer4 = byteBuffer1.asLongBuffer();
        int int5 = longBuffer4.position();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.Buffer buffer7 = longBuffer4.limit((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertNotNull(longBuffer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0827");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect((int) '#');
        float float3 = byteBuffer1.getFloat(1);
        java.nio.ByteBuffer byteBuffer5 = byteBuffer1.putLong((long) 10);
        byte byte6 = byteBuffer5.get();
        java.nio.ByteBuffer byteBuffer8 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer9 = byteBuffer8.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer10 = byteBuffer8.asShortBuffer();
        byte[] byteArray11 = byteBuffer8.array();
        java.nio.ByteBuffer byteBuffer12 = java.nio.ByteBuffer.wrap(byteArray11);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer15 = byteBuffer5.get(byteArray11, 31, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 0 + "'", byte6 == (byte) 0);
        org.junit.Assert.assertNotNull(byteBuffer8);
        org.junit.Assert.assertNotNull(doubleBuffer9);
        org.junit.Assert.assertNotNull(shortBuffer10);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[]");
        org.junit.Assert.assertNotNull(byteBuffer12);
    }

    @Test
    public void test0828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0828");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.isReadOnly();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        int int4 = byteBuffer1.position();
        boolean boolean5 = byteBuffer1.isReadOnly();
        java.nio.CharBuffer charBuffer6 = byteBuffer1.asCharBuffer();
        boolean boolean8 = byteBuffer1.equals((java.lang.Object) (-1L));
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer10 = byteBuffer1.putInt(22);
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
    public void test0829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0829");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Request request4 = response3.req;
        org.jsoup.Connection.Method method5 = response3.method();
        java.lang.String str6 = response3.contentType;
        boolean boolean8 = response3.hasCookie("");
        response3.charset = "";
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response11 = org.jsoup.helper.HttpConnection.Response.execute(request0, response3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(request4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0830");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer2 = byteBuffer1.asDoubleBuffer();
        boolean boolean3 = byteBuffer1.isDirect();
        java.lang.String str4 = byteBuffer1.toString();
        byte[] byteArray5 = byteBuffer1.array();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer7 = byteBuffer1.putDouble((double) 4);
            org.junit.Assert.fail("Expected exception of type java.nio.BufferOverflowException; message: null");
        } catch (java.nio.BufferOverflowException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(doubleBuffer2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]" + "'", str4, "java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]");
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[]");
    }

    @Test
    public void test0831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0831");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer2 = byteBuffer1.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        java.nio.ByteBuffer byteBuffer4 = byteBuffer1.compact();
        java.nio.ByteBuffer byteBuffer5 = byteBuffer1.slice();
        int int6 = byteBuffer1.position();
        java.nio.ByteBuffer byteBuffer7 = byteBuffer1.asReadOnlyBuffer();
        java.nio.ByteBuffer byteBuffer9 = java.nio.ByteBuffer.allocate((int) (byte) 10);
        byte[] byteArray13 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.nio.ByteBuffer byteBuffer14 = java.nio.ByteBuffer.wrap(byteArray13);
        java.nio.ByteBuffer byteBuffer15 = byteBuffer9.get(byteArray13);
        java.nio.LongBuffer longBuffer16 = byteBuffer9.asLongBuffer();
        java.nio.ByteBuffer byteBuffer17 = byteBuffer9.slice();
        java.nio.ByteBuffer byteBuffer19 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer20 = byteBuffer19.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer21 = byteBuffer19.asShortBuffer();
        java.nio.ByteOrder byteOrder22 = null;
        java.nio.ByteBuffer byteBuffer23 = byteBuffer19.order(byteOrder22);
        java.nio.ByteBuffer byteBuffer25 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer26 = byteBuffer25.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer27 = byteBuffer25.asShortBuffer();
        int int28 = byteBuffer25.limit();
        byte[] byteArray29 = byteBuffer25.array();
        java.nio.ByteBuffer byteBuffer30 = byteBuffer19.put(byteArray29);
        java.nio.ByteBuffer byteBuffer31 = byteBuffer17.get(byteArray29);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer34 = byteBuffer1.put(byteArray29, (int) (short) 100, 35);
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
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(byteBuffer14);
        org.junit.Assert.assertNotNull(byteBuffer15);
        org.junit.Assert.assertNotNull(longBuffer16);
        org.junit.Assert.assertNotNull(byteBuffer17);
        org.junit.Assert.assertNotNull(byteBuffer19);
        org.junit.Assert.assertNotNull(doubleBuffer20);
        org.junit.Assert.assertNotNull(shortBuffer21);
        org.junit.Assert.assertNotNull(byteBuffer23);
        org.junit.Assert.assertNotNull(byteBuffer25);
        org.junit.Assert.assertNotNull(doubleBuffer26);
        org.junit.Assert.assertNotNull(shortBuffer27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray29), "[]");
        org.junit.Assert.assertNotNull(byteBuffer30);
        org.junit.Assert.assertNotNull(byteBuffer31);
    }

    @Test
    public void test0832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0832");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.header("");
        org.jsoup.Connection.Response response5 = response1.removeCookie("hi!");
        java.lang.String str7 = response1.cookie("");
        org.jsoup.Connection.Request request8 = response1.req;
        java.util.Map<java.lang.String, java.lang.String> strMap9 = response1.headers();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(request8);
        org.junit.Assert.assertNotNull(strMap9);
    }

    @Test
    public void test0833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0833");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect((int) '#');
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.putShort((short) 0);
        java.nio.ByteBuffer byteBuffer5 = byteBuffer1.putDouble((double) '\000');
        char char6 = byteBuffer5.getChar();
        // The following exception was thrown during execution in test generation
        try {
            float float8 = byteBuffer5.getFloat((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '\000' + "'", char6 == '\000');
    }

    @Test
    public void test0834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0834");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer2 = byteBuffer1.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        java.nio.ByteBuffer byteBuffer4 = byteBuffer1.compact();
        java.nio.ByteBuffer byteBuffer5 = byteBuffer1.slice();
        // The following exception was thrown during execution in test generation
        try {
            float float7 = byteBuffer5.getFloat((int) (short) -1);
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
    public void test0835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0835");
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
        java.nio.ByteBuffer byteBuffer23 = java.nio.ByteBuffer.allocate(0);
        boolean boolean24 = byteBuffer23.isReadOnly();
        java.nio.ShortBuffer shortBuffer25 = byteBuffer23.asShortBuffer();
        java.nio.ByteBuffer byteBuffer27 = java.nio.ByteBuffer.allocate(0);
        boolean boolean28 = byteBuffer27.isReadOnly();
        int int29 = byteBuffer23.compareTo(byteBuffer27);
        java.nio.DoubleBuffer doubleBuffer30 = byteBuffer27.asDoubleBuffer();
        java.nio.FloatBuffer floatBuffer31 = byteBuffer27.asFloatBuffer();
        java.nio.ByteBuffer byteBuffer33 = java.nio.ByteBuffer.allocate((int) (byte) 10);
        byte[] byteArray37 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.nio.ByteBuffer byteBuffer38 = java.nio.ByteBuffer.wrap(byteArray37);
        java.nio.ByteBuffer byteBuffer39 = byteBuffer33.get(byteArray37);
        java.nio.ByteBuffer byteBuffer42 = byteBuffer27.put(byteArray37, 0, (int) (byte) 0);
        java.nio.ByteBuffer byteBuffer43 = java.nio.ByteBuffer.wrap(byteArray37);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer46 = byteBuffer21.put(byteArray37, (int) (byte) -1, 35);
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
        org.junit.Assert.assertNotNull(byteBuffer23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(shortBuffer25);
        org.junit.Assert.assertNotNull(byteBuffer27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(doubleBuffer30);
        org.junit.Assert.assertNotNull(floatBuffer31);
        org.junit.Assert.assertNotNull(byteBuffer33);
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray37), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(byteBuffer38);
        org.junit.Assert.assertNotNull(byteBuffer39);
        org.junit.Assert.assertNotNull(byteBuffer42);
        org.junit.Assert.assertNotNull(byteBuffer43);
    }

    @Test
    public void test0836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0836");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer2 = byteBuffer1.asDoubleBuffer();
        boolean boolean3 = byteBuffer1.isDirect();
        int int4 = byteBuffer1.arrayOffset();
        java.nio.Buffer buffer5 = byteBuffer1.mark();
        int int6 = byteBuffer1.arrayOffset();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer9 = byteBuffer1.putInt((int) (byte) 0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(doubleBuffer2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(buffer5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0837");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.ByteBuffer byteBuffer2 = byteBuffer1.slice();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        java.nio.ByteBuffer byteBuffer4 = byteBuffer1.asReadOnlyBuffer();
        // The following exception was thrown during execution in test generation
        try {
            byte byte5 = byteBuffer1.get();
            org.junit.Assert.fail("Expected exception of type java.nio.BufferUnderflowException; message: null");
        } catch (java.nio.BufferUnderflowException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteBuffer2);
        org.junit.Assert.assertNotNull(shortBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer4);
    }

    @Test
    public void test0838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0838");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer2 = byteBuffer1.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        java.nio.ByteBuffer byteBuffer4 = byteBuffer1.compact();
        java.nio.ByteOrder byteOrder5 = byteBuffer4.order();
        java.nio.CharBuffer charBuffer6 = byteBuffer4.asCharBuffer();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer8 = byteBuffer4.putInt(11);
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
    }

    @Test
    public void test0839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0839");
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
            java.nio.Buffer buffer16 = byteBuffer14.reset();
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
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[100, 1, 1]");
        org.junit.Assert.assertNotNull(byteBuffer13);
        org.junit.Assert.assertNotNull(byteBuffer14);
        org.junit.Assert.assertNotNull(byteOrder15);
    }

    @Test
    public void test0840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0840");
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
        // The following exception was thrown during execution in test generation
        try {
            float float23 = byteBuffer1.getFloat(3);
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
    }

    @Test
    public void test0841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0841");
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
        org.jsoup.Connection.Response response15 = response13.removeCookie("");
        org.junit.Assert.assertNull(byteBuffer4);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(response15);
    }

    @Test
    public void test0842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0842");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response14 = org.jsoup.helper.HttpConnection.Response.execute(request0, response3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(uRL7);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0843");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.isReadOnly();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        int int4 = byteBuffer1.position();
        int int5 = byteBuffer1.arrayOffset();
        java.nio.IntBuffer intBuffer6 = byteBuffer1.asIntBuffer();
        java.nio.ByteBuffer byteBuffer7 = byteBuffer1.duplicate();
        byte[] byteArray8 = byteBuffer7.array();
        // The following exception was thrown during execution in test generation
        try {
            float float9 = byteBuffer7.getFloat();
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
        org.junit.Assert.assertNotNull(byteBuffer7);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[]");
    }

    @Test
    public void test0844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0844");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.nio.ByteBuffer byteBuffer4 = response3.byteData;
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response3);
        java.nio.ByteBuffer byteBuffer7 = java.nio.ByteBuffer.allocate(0);
        response3.byteData = byteBuffer7;
        java.nio.ByteBuffer byteBuffer9 = byteBuffer7.slice();
        java.nio.ByteBuffer byteBuffer11 = java.nio.ByteBuffer.allocate((int) (byte) 10);
        byte[] byteArray15 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.nio.ByteBuffer byteBuffer16 = java.nio.ByteBuffer.wrap(byteArray15);
        java.nio.ByteBuffer byteBuffer17 = byteBuffer11.get(byteArray15);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer18 = byteBuffer7.get(byteArray15);
            org.junit.Assert.fail("Expected exception of type java.nio.BufferUnderflowException; message: null");
        } catch (java.nio.BufferUnderflowException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(byteBuffer4);
        org.junit.Assert.assertNotNull(byteBuffer7);
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertNotNull(byteBuffer11);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(byteBuffer16);
        org.junit.Assert.assertNotNull(byteBuffer17);
    }

    @Test
    public void test0845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0845");
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
        java.nio.LongBuffer longBuffer16 = byteBuffer1.asLongBuffer();
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
        org.junit.Assert.assertNotNull(longBuffer16);
    }

    @Test
    public void test0846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0846");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate((int) (byte) 10);
        short short3 = byteBuffer1.getShort(1);
        java.nio.CharBuffer charBuffer4 = byteBuffer1.asCharBuffer();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer7 = byteBuffer1.putFloat(9, (float) '\000');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
        org.junit.Assert.assertNotNull(charBuffer4);
    }

    @Test
    public void test0847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0847");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect((int) 'a');
        java.nio.ByteBuffer byteBuffer3 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer4 = byteBuffer3.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer5 = byteBuffer3.asShortBuffer();
        int int6 = byteBuffer3.limit();
        byte[] byteArray7 = byteBuffer3.array();
        java.nio.ByteBuffer byteBuffer8 = java.nio.ByteBuffer.wrap(byteArray7);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer11 = byteBuffer1.put(byteArray7, 100, 1677787392);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertNotNull(doubleBuffer4);
        org.junit.Assert.assertNotNull(shortBuffer5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[]");
        org.junit.Assert.assertNotNull(byteBuffer8);
    }

    @Test
    public void test0848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0848");
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
            int int28 = byteBuffer27.getInt();
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
        org.junit.Assert.assertNotNull(byteBuffer27);
    }

    @Test
    public void test0849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0849");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request3 = response2.req;
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response2);
        java.lang.String str6 = response2.cookie("");
        response2.executed = true;
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response2);
        java.lang.String str11 = response9.cookie("java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]");
        java.nio.ByteBuffer byteBuffer12 = response9.byteData;
        org.jsoup.Connection.Request request13 = response9.req;
        org.junit.Assert.assertNull(request3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(byteBuffer12);
        org.junit.Assert.assertNull(request13);
    }

    @Test
    public void test0850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0850");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.hasRemaining();
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.asReadOnlyBuffer();
        java.nio.DoubleBuffer doubleBuffer4 = byteBuffer1.asDoubleBuffer();
        java.nio.IntBuffer intBuffer5 = byteBuffer1.asIntBuffer();
        java.nio.ByteBuffer byteBuffer6 = byteBuffer1.compact();
        java.nio.ByteBuffer byteBuffer8 = java.nio.ByteBuffer.allocate(0);
        boolean boolean9 = byteBuffer8.isReadOnly();
        java.nio.ShortBuffer shortBuffer10 = byteBuffer8.asShortBuffer();
        int int11 = byteBuffer8.position();
        boolean boolean12 = byteBuffer8.isReadOnly();
        int int13 = byteBuffer1.compareTo(byteBuffer8);
        // The following exception was thrown during execution in test generation
        try {
            byte byte15 = byteBuffer1.get((int) (short) 1);
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
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(shortBuffer10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0851");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer2 = byteBuffer1.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        int int4 = byteBuffer1.limit();
        byte[] byteArray5 = byteBuffer1.array();
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
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer27 = byteBuffer1.put(byteArray21);
            org.junit.Assert.fail("Expected exception of type java.nio.BufferOverflowException; message: null");
        } catch (java.nio.BufferOverflowException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(doubleBuffer2);
        org.junit.Assert.assertNotNull(shortBuffer3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[]");
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
    }

    @Test
    public void test0852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0852");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate((int) (byte) 10);
        int int2 = byteBuffer1.getInt();
        java.nio.ByteBuffer byteBuffer5 = byteBuffer1.put((int) (byte) 0, (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.Buffer buffer7 = byteBuffer1.position((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: newPosition > limit: (100 > 10)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(byteBuffer5);
    }

    @Test
    public void test0853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0853");
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
            double double20 = byteBuffer7.getDouble(22);
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
    public void test0854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0854");
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
        // The following exception was thrown during execution in test generation
        try {
            byte byte14 = byteBuffer7.get((int) (byte) 10);
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
    }

    @Test
    public void test0855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0855");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate((int) (byte) 10);
        int int2 = byteBuffer1.limit();
        byte[] byteArray3 = byteBuffer1.array();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer6 = java.nio.ByteBuffer.wrap(byteArray3, 1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test0856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0856");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        response2.executed = false;
        java.lang.String str5 = response2.contentType;
        int int6 = response2.statusCode;
        java.lang.String str7 = response2.charset();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response8 = org.jsoup.helper.HttpConnection.Response.execute(request0, response2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0857");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer2 = byteBuffer1.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        java.nio.ByteOrder byteOrder4 = null;
        java.nio.ByteBuffer byteBuffer5 = byteBuffer1.order(byteOrder4);
        java.nio.ByteBuffer byteBuffer6 = byteBuffer5.asReadOnlyBuffer();
        java.nio.Buffer buffer8 = byteBuffer5.position((int) (byte) 0);
        int int9 = byteBuffer5.capacity();
        java.nio.FloatBuffer floatBuffer10 = byteBuffer5.asFloatBuffer();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer12 = byteBuffer5.putFloat((float) 7);
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
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(floatBuffer10);
    }

    @Test
    public void test0858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0858");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer2 = byteBuffer1.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        java.nio.ByteBuffer byteBuffer4 = byteBuffer1.compact();
        int int5 = byteBuffer4.capacity();
        java.nio.ByteBuffer byteBuffer6 = byteBuffer4.compact();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer8 = byteBuffer6.putLong((long) 9);
            org.junit.Assert.fail("Expected exception of type java.nio.BufferOverflowException; message: null");
        } catch (java.nio.BufferOverflowException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(doubleBuffer2);
        org.junit.Assert.assertNotNull(shortBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(byteBuffer6);
    }

    @Test
    public void test0859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0859");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer2 = byteBuffer1.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        java.nio.ByteBuffer byteBuffer4 = byteBuffer1.duplicate();
        // The following exception was thrown during execution in test generation
        try {
            int int5 = byteBuffer4.getInt();
            org.junit.Assert.fail("Expected exception of type java.nio.BufferUnderflowException; message: null");
        } catch (java.nio.BufferUnderflowException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(doubleBuffer2);
        org.junit.Assert.assertNotNull(shortBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer4);
    }

    @Test
    public void test0860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0860");
        byte[] byteArray0 = new byte[] {};
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.wrap(byteArray0);
        java.nio.Buffer buffer2 = byteBuffer1.flip();
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.asReadOnlyBuffer();
        java.nio.ByteBuffer byteBuffer4 = byteBuffer1.duplicate();
        int int5 = byteBuffer1.position();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer7 = byteBuffer1.putFloat((float) '\u0a00');
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
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0861");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request3 = response2.req;
        org.jsoup.Connection.Method method4 = response2.method();
        java.lang.String str5 = response2.contentType;
        boolean boolean7 = response2.hasCookie("");
        org.jsoup.Connection.Method method8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response9 = response2.method(method8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(request3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0862");
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
        java.nio.LongBuffer longBuffer14 = byteBuffer13.asLongBuffer();
        byte[] byteArray18 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.nio.ByteBuffer byteBuffer19 = java.nio.ByteBuffer.wrap(byteArray18);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer20 = byteBuffer13.put(byteArray18);
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
        org.junit.Assert.assertNotNull(longBuffer14);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[100, 1, 1]");
        org.junit.Assert.assertNotNull(byteBuffer19);
    }

    @Test
    public void test0863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0863");
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
        java.lang.String str16 = response3.charset();
        java.lang.String str17 = response3.statusMessage();
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
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test0864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0864");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer2 = byteBuffer1.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        java.nio.ByteBuffer byteBuffer4 = byteBuffer1.compact();
        int int5 = byteBuffer4.capacity();
        java.nio.ByteBuffer byteBuffer6 = byteBuffer4.compact();
        int int7 = byteBuffer6.limit();
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(doubleBuffer2);
        org.junit.Assert.assertNotNull(shortBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(byteBuffer6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0865");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect(0);
        // The following exception was thrown during execution in test generation
        try {
            byte byte3 = byteBuffer1.get(7);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
    }

    @Test
    public void test0866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0866");
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
        // The following exception was thrown during execution in test generation
        try {
            short short21 = byteBuffer18.getShort(100);
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
    }

    @Test
    public void test0867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0867");
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
        java.nio.CharBuffer charBuffer20 = byteBuffer19.asCharBuffer();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer22 = byteBuffer19.putChar('4');
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
        org.junit.Assert.assertNotNull(charBuffer20);
    }

    @Test
    public void test0868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0868");
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
        java.net.URL uRL13 = response5.url();
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNull(uRL13);
    }

    @Test
    public void test0869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0869");
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
        response15.contentType = "";
        java.lang.String str18 = response15.charset;
        org.junit.Assert.assertNull(byteBuffer4);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(uRL8);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test0870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0870");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.isReadOnly();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        int int4 = byteBuffer1.position();
        boolean boolean5 = byteBuffer1.isReadOnly();
        java.nio.CharBuffer charBuffer6 = byteBuffer1.asCharBuffer();
        boolean boolean8 = byteBuffer1.equals((java.lang.Object) (-1L));
        java.nio.ByteBuffer byteBuffer10 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer11 = byteBuffer10.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer12 = byteBuffer10.asShortBuffer();
        byte[] byteArray13 = byteBuffer10.array();
        java.nio.ByteBuffer byteBuffer14 = java.nio.ByteBuffer.wrap(byteArray13);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer17 = byteBuffer1.get(byteArray13, (int) '\u0a00', 0);
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
        org.junit.Assert.assertNotNull(byteBuffer10);
        org.junit.Assert.assertNotNull(doubleBuffer11);
        org.junit.Assert.assertNotNull(shortBuffer12);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[]");
        org.junit.Assert.assertNotNull(byteBuffer14);
    }

    @Test
    public void test0871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0871");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.isReadOnly();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        java.nio.ShortBuffer shortBuffer4 = byteBuffer1.asShortBuffer();
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(shortBuffer3);
        org.junit.Assert.assertNotNull(shortBuffer4);
    }

    @Test
    public void test0872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0872");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Method method6 = response5.method();
        org.jsoup.Connection.Method method7 = response5.method();
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response5);
        java.net.HttpURLConnection httpURLConnection9 = null;
        org.jsoup.helper.HttpConnection.Response response10 = null;
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response10);
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response10);
        org.jsoup.Connection.Request request13 = response12.req;
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response12);
        java.lang.String str15 = response12.charset;
        // The following exception was thrown during execution in test generation
        try {
            response8.setupFromConnection(httpURLConnection9, (org.jsoup.Connection.Response) response12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(request13);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test0873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0873");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect(0);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer3 = byteBuffer1.putFloat((float) 85);
            org.junit.Assert.fail("Expected exception of type java.nio.BufferOverflowException; message: null");
        } catch (java.nio.BufferOverflowException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
    }

    @Test
    public void test0874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0874");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str5 = response4.statusMessage();
        response4.contentType = "";
        java.lang.String str8 = response4.statusMessage();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response9 = org.jsoup.helper.HttpConnection.Response.execute(request0, response4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0875");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer2 = byteBuffer1.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        java.nio.ByteOrder byteOrder4 = null;
        java.nio.ByteBuffer byteBuffer5 = byteBuffer1.order(byteOrder4);
        byte[] byteArray9 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.nio.ByteBuffer byteBuffer10 = java.nio.ByteBuffer.wrap(byteArray9);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer13 = byteBuffer1.get(byteArray9, (int) (byte) 10, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(doubleBuffer2);
        org.junit.Assert.assertNotNull(shortBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[100, 1, 1]");
        org.junit.Assert.assertNotNull(byteBuffer10);
    }

    @Test
    public void test0876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0876");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.isReadOnly();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        int int4 = byteBuffer1.position();
        java.nio.ByteOrder byteOrder5 = null;
        java.nio.ByteBuffer byteBuffer6 = byteBuffer1.order(byteOrder5);
        java.nio.ByteBuffer byteBuffer7 = byteBuffer1.asReadOnlyBuffer();
        java.nio.ByteBuffer byteBuffer8 = byteBuffer7.slice();
        java.nio.ByteBuffer byteBuffer9 = byteBuffer7.duplicate();
        java.lang.Class<?> wildcardClass10 = byteBuffer7.getClass();
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(shortBuffer3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(byteBuffer6);
        org.junit.Assert.assertNotNull(byteBuffer7);
        org.junit.Assert.assertNotNull(byteBuffer8);
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0877");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.nio.ByteBuffer byteBuffer4 = response3.byteData;
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response3);
        java.nio.ByteBuffer byteBuffer7 = java.nio.ByteBuffer.allocate(0);
        response3.byteData = byteBuffer7;
        java.nio.ByteBuffer byteBuffer9 = byteBuffer7.slice();
        java.nio.Buffer buffer10 = byteBuffer9.mark();
        // The following exception was thrown during execution in test generation
        try {
            char char12 = byteBuffer9.getChar((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(byteBuffer4);
        org.junit.Assert.assertNotNull(byteBuffer7);
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertNotNull(buffer10);
    }

    @Test
    public void test0878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0878");
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
            java.nio.ByteBuffer byteBuffer17 = byteBuffer8.putFloat((float) 22);
            org.junit.Assert.fail("Expected exception of type java.nio.BufferOverflowException; message: null");
        } catch (java.nio.BufferOverflowException e) {
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
    public void test0879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0879");
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
            float float10 = byteBuffer5.getFloat();
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
    }

    @Test
    public void test0880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0880");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.nio.ByteBuffer byteBuffer4 = response3.byteData;
        org.jsoup.Connection.Response response7 = response3.cookie("hi!", "");
        java.net.URL uRL8 = response3.url();
        boolean boolean10 = response3.hasHeader("java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]");
        java.net.URL uRL11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response12 = response3.url(uRL11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(byteBuffer4);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(uRL8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0881");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.header("");
        org.jsoup.Connection.Response response5 = response1.removeCookie("hi!");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.net.URL uRL7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response8 = response6.url(uRL7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
    }

    @Test
    public void test0882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0882");
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
            java.nio.ByteBuffer byteBuffer18 = java.nio.ByteBuffer.wrap(byteArray13, (int) (short) 10, (int) (byte) -1);
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
    public void test0883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0883");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response7 = response5.removeHeader("java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]");
        java.lang.String str8 = response5.contentType();
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0884");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.isReadOnly();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        java.nio.ByteBuffer byteBuffer5 = java.nio.ByteBuffer.allocate(0);
        boolean boolean6 = byteBuffer5.isReadOnly();
        int int7 = byteBuffer1.compareTo(byteBuffer5);
        java.nio.ByteBuffer byteBuffer8 = byteBuffer5.compact();
        java.nio.Buffer buffer10 = byteBuffer5.limit((int) (short) 0);
        int int11 = byteBuffer5.remaining();
        int int12 = byteBuffer5.arrayOffset();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer15 = byteBuffer5.put((int) '\000', (byte) 1);
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
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0885");
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
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer26 = byteBuffer10.put((byte) 100);
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
    }

    @Test
    public void test0886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0886");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str5 = response4.statusMessage();
        response4.contentType = "";
        java.lang.String str8 = response4.statusMessage();
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response4);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response10 = org.jsoup.helper.HttpConnection.Response.execute(request0, response4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0887");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer2 = byteBuffer1.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        java.nio.ByteBuffer byteBuffer4 = byteBuffer1.compact();
        java.nio.ByteBuffer byteBuffer5 = byteBuffer1.slice();
        java.nio.FloatBuffer floatBuffer6 = byteBuffer5.asFloatBuffer();
        int int7 = byteBuffer5.limit();
        int int8 = byteBuffer5.remaining();
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(doubleBuffer2);
        org.junit.Assert.assertNotNull(shortBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertNotNull(floatBuffer6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0888");
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
            int int33 = byteBuffer29.getInt();
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
    public void test0889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0889");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer2 = byteBuffer1.asDoubleBuffer();
        boolean boolean3 = byteBuffer1.isDirect();
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer9 = byteBuffer1.put(byteArray6, (-32), 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(doubleBuffer2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, -1]");
    }

    @Test
    public void test0890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0890");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.ByteBuffer byteBuffer2 = byteBuffer1.slice();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        int int4 = shortBuffer3.capacity();
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteBuffer2);
        org.junit.Assert.assertNotNull(shortBuffer3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0891");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.isReadOnly();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer4 = byteBuffer1.putInt(31);
            org.junit.Assert.fail("Expected exception of type java.nio.BufferOverflowException; message: null");
        } catch (java.nio.BufferOverflowException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0892");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.isReadOnly();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        int int4 = byteBuffer1.position();
        java.nio.ByteOrder byteOrder5 = null;
        java.nio.ByteBuffer byteBuffer6 = byteBuffer1.order(byteOrder5);
        java.nio.ByteBuffer byteBuffer7 = byteBuffer1.asReadOnlyBuffer();
        java.nio.CharBuffer charBuffer8 = byteBuffer1.asCharBuffer();
        // The following exception was thrown during execution in test generation
        try {
            byte byte10 = byteBuffer1.get(1677787392);
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
        org.junit.Assert.assertNotNull(charBuffer8);
    }

    @Test
    public void test0893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0893");
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
            byte byte15 = byteBuffer5.get();
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
    public void test0894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0894");
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
        int int22 = byteBuffer21.remaining();
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test0895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0895");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response0);
        response5.charset = "hi!";
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document8 = response5.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0896");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        int int3 = response2.statusCode();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response4 = org.jsoup.helper.HttpConnection.Response.execute(request0, response2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0897");
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate((-10));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0898");
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
        java.lang.Class<?> wildcardClass13 = response1.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0899");
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
            java.nio.ByteBuffer byteBuffer16 = byteBuffer12.put(9, (byte) 10);
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
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0900");
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
        java.net.URL uRL30 = response2.url();
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
        org.junit.Assert.assertNull(uRL30);
    }

    @Test
    public void test0901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0901");
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
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer26 = byteBuffer15.put((byte) 0);
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
        org.junit.Assert.assertNotNull(byteBuffer15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(shortBuffer17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(buffer20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(byteBuffer23);
        org.junit.Assert.assertNotNull(byteBuffer24);
    }

    @Test
    public void test0902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0902");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer2 = byteBuffer1.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        java.nio.ByteOrder byteOrder4 = null;
        java.nio.ByteBuffer byteBuffer5 = byteBuffer1.order(byteOrder4);
        java.nio.ByteBuffer byteBuffer6 = byteBuffer5.asReadOnlyBuffer();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer9 = byteBuffer5.put(0, (byte) 100);
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
    public void test0903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0903");
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
            char char12 = byteBuffer5.getChar();
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
    }

    @Test
    public void test0904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0904");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate((int) (byte) 10);
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.nio.ByteBuffer byteBuffer6 = java.nio.ByteBuffer.wrap(byteArray5);
        java.nio.ByteBuffer byteBuffer7 = byteBuffer1.get(byteArray5);
        java.nio.ByteBuffer byteBuffer8 = byteBuffer1.slice();
        byte[] byteArray9 = byteBuffer8.array();
        java.nio.ByteBuffer byteBuffer11 = byteBuffer8.putShort((short) (byte) 100);
        boolean boolean12 = byteBuffer11.hasRemaining();
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(byteBuffer6);
        org.junit.Assert.assertNotNull(byteBuffer7);
        org.junit.Assert.assertNotNull(byteBuffer8);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[0, 0, 0, 0, 100, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(byteBuffer11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0905");
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
        org.jsoup.helper.HttpConnection.Response response20 = new org.jsoup.helper.HttpConnection.Response(response19);
        org.jsoup.helper.HttpConnection.Response response21 = new org.jsoup.helper.HttpConnection.Response(response20);
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
    public void test0906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0906");
        byte[] byteArray0 = new byte[] {};
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.wrap(byteArray0);
        java.nio.Buffer buffer2 = byteBuffer1.flip();
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.asReadOnlyBuffer();
        java.nio.ByteBuffer byteBuffer4 = byteBuffer1.duplicate();
        java.nio.DoubleBuffer doubleBuffer5 = byteBuffer1.asDoubleBuffer();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer7 = byteBuffer1.putDouble((-1.0d));
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
    }

    @Test
    public void test0907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0907");
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
        java.nio.ByteBuffer byteBuffer16 = java.nio.ByteBuffer.allocate((int) (byte) 10);
        int int17 = byteBuffer16.getInt();
        java.nio.ByteBuffer byteBuffer20 = byteBuffer16.put((int) (byte) 0, (byte) 10);
        byte[] byteArray21 = byteBuffer20.array();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer22 = byteBuffer14.put(byteArray21);
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
        org.junit.Assert.assertNotNull(byteBuffer16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(byteBuffer20);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[10, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test0908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0908");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.header("");
        java.lang.String str4 = response1.statusMessage;
        org.jsoup.Connection.Response response6 = response1.removeHeader("hi!");
        java.lang.String str8 = response1.getHeaderCaseInsensitive("");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = response1.hasHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0909");
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
            org.jsoup.helper.HttpConnection.Response response17 = org.jsoup.helper.HttpConnection.Response.execute(request0, response13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(byteBuffer5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(uRL9);
    }

    @Test
    public void test0910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0910");
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
            double double15 = byteBuffer1.getDouble((-32));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
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
    public void test0911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0911");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer2 = byteBuffer1.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        java.nio.ByteBuffer byteBuffer4 = byteBuffer1.compact();
        int int5 = byteBuffer4.capacity();
        java.nio.ByteBuffer byteBuffer6 = byteBuffer4.compact();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer8 = byteBuffer4.putLong(100L);
            org.junit.Assert.fail("Expected exception of type java.nio.BufferOverflowException; message: null");
        } catch (java.nio.BufferOverflowException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(doubleBuffer2);
        org.junit.Assert.assertNotNull(shortBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(byteBuffer6);
    }

    @Test
    public void test0912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0912");
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
        // The following exception was thrown during execution in test generation
        try {
            long long18 = byteBuffer16.getLong(7);
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
    }

    @Test
    public void test0913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0913");
        byte[] byteArray3 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.nio.ByteBuffer byteBuffer4 = java.nio.ByteBuffer.wrap(byteArray3);
        java.nio.ByteBuffer byteBuffer5 = java.nio.ByteBuffer.wrap(byteArray3);
        java.nio.ByteBuffer byteBuffer7 = byteBuffer5.putChar('a');
        // The following exception was thrown during execution in test generation
        try {
            char char8 = byteBuffer5.getChar();
            org.junit.Assert.fail("Expected exception of type java.nio.BufferUnderflowException; message: null");
        } catch (java.nio.BufferUnderflowException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0, 97, 1]");
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertNotNull(byteBuffer7);
    }

    @Test
    public void test0914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0914");
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
        // The following exception was thrown during execution in test generation
        try {
            int int31 = byteBuffer29.getInt();
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
    }

    @Test
    public void test0915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0915");
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
        int int16 = intBuffer15.position();
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
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test0916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0916");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.header("");
        org.jsoup.Connection.Response response5 = response1.removeCookie("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap6 = response1.headers();
        java.nio.ByteBuffer byteBuffer7 = response1.byteData;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = byteBuffer7.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNull(byteBuffer7);
    }

    @Test
    public void test0917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0917");
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
            int int22 = byteBuffer20.getInt();
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
        org.junit.Assert.assertNotNull(byteBuffer11);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(byteBuffer16);
        org.junit.Assert.assertNotNull(byteBuffer17);
        org.junit.Assert.assertNotNull(byteBuffer20);
        org.junit.Assert.assertNotNull(byteBuffer21);
    }

    @Test
    public void test0918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0918");
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
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer21 = byteBuffer13.putChar((int) (short) 10, '4');
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
    }

    @Test
    public void test0919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0919");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.header("");
        org.jsoup.Connection.Response response5 = response1.removeCookie("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap6 = response1.headers();
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Method method9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response10 = response8.method(method9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNotNull(strMap6);
    }

    @Test
    public void test0920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0920");
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
            byte byte12 = byteBuffer10.get(31);
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
    }

    @Test
    public void test0921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0921");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request3 = response2.req;
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response2);
        java.lang.String str6 = response2.cookie("");
        response2.executed = true;
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response2);
        java.lang.String str11 = response2.header("java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]");
        java.lang.String str12 = response2.statusMessage;
        org.jsoup.Connection.Method method13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response14 = response2.method(method13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(request3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test0922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0922");
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
            java.nio.ByteBuffer byteBuffer21 = byteBuffer16.putDouble((int) '\000', 0.0d);
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
    public void test0923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0923");
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
            byte byte14 = byteBuffer5.get();
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
        org.junit.Assert.assertNotNull(byteBuffer13);
    }

    @Test
    public void test0924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0924");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.isReadOnly();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        int int4 = byteBuffer1.position();
        java.nio.ByteOrder byteOrder5 = null;
        java.nio.ByteBuffer byteBuffer6 = byteBuffer1.order(byteOrder5);
        int int7 = byteBuffer6.limit();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer10 = byteBuffer6.putChar(0, '4');
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
    }

    @Test
    public void test0925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0925");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str4 = response2.header("");
        org.jsoup.Connection.Response response6 = response2.removeCookie("hi!");
        java.lang.String str8 = response2.cookie("");
        org.jsoup.Connection.Request request9 = response2.req;
        java.util.Map<java.lang.String, java.lang.String> strMap10 = response2.headers();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response11 = org.jsoup.helper.HttpConnection.Response.execute(request0, response2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(request9);
        org.junit.Assert.assertNotNull(strMap10);
    }

    @Test
    public void test0926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0926");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str5 = response4.charset;
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray6 = response4.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0927");
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
        byte byte30 = byteBuffer1.get();
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
        org.junit.Assert.assertTrue("'" + byte30 + "' != '" + (byte) 0 + "'", byte30 == (byte) 0);
    }

    @Test
    public void test0928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0928");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean3 = response2.executed;
        java.lang.String str5 = response2.getHeaderCaseInsensitive("");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response2);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document7 = response2.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0929");
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
            char char34 = byteBuffer33.getChar();
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
    public void test0930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0930");
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
        java.nio.CharBuffer charBuffer15 = byteBuffer14.asCharBuffer();
        java.nio.ByteBuffer byteBuffer17 = java.nio.ByteBuffer.allocate(0);
        boolean boolean18 = byteBuffer17.isReadOnly();
        java.nio.ShortBuffer shortBuffer19 = byteBuffer17.asShortBuffer();
        java.nio.ByteBuffer byteBuffer21 = java.nio.ByteBuffer.allocate(0);
        boolean boolean22 = byteBuffer21.isReadOnly();
        int int23 = byteBuffer17.compareTo(byteBuffer21);
        java.nio.ByteBuffer byteBuffer24 = byteBuffer21.compact();
        boolean boolean25 = byteBuffer24.hasRemaining();
        java.nio.ByteBuffer byteBuffer27 = java.nio.ByteBuffer.allocate(0);
        boolean boolean28 = byteBuffer27.isReadOnly();
        java.nio.ShortBuffer shortBuffer29 = byteBuffer27.asShortBuffer();
        int int30 = byteBuffer27.position();
        int int31 = byteBuffer27.capacity();
        java.nio.ByteBuffer byteBuffer32 = byteBuffer24.put(byteBuffer27);
        byte[] byteArray33 = byteBuffer32.array();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer36 = byteBuffer14.get(byteArray33, (int) '4', 22);
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
        org.junit.Assert.assertNotNull(charBuffer15);
        org.junit.Assert.assertNotNull(byteBuffer17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(shortBuffer19);
        org.junit.Assert.assertNotNull(byteBuffer21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(byteBuffer24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(byteBuffer27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(shortBuffer29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(byteBuffer32);
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray33), "[]");
    }

    @Test
    public void test0931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0931");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.ByteBuffer byteBuffer2 = byteBuffer1.slice();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        java.nio.ByteBuffer byteBuffer4 = byteBuffer1.slice();
        // The following exception was thrown during execution in test generation
        try {
            float float6 = byteBuffer4.getFloat((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteBuffer2);
        org.junit.Assert.assertNotNull(shortBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer4);
    }

    @Test
    public void test0932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0932");
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
        boolean boolean32 = byteBuffer31.isReadOnly();
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
    public void test0933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0933");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean3 = response2.executed;
        java.lang.String str5 = response2.getHeaderCaseInsensitive("");
        java.net.URL uRL6 = response2.url();
        org.jsoup.Connection.Response response8 = response2.removeCookie("");
        java.nio.ByteBuffer byteBuffer9 = response2.byteData;
        java.lang.String str10 = response2.charset();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(byteBuffer9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0934");
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
        // The following exception was thrown during execution in test generation
        try {
            byte byte24 = byteBuffer18.get((int) (short) 1);
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test0935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0935");
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
            int int10 = byteBuffer7.getInt();
            org.junit.Assert.fail("Expected exception of type java.nio.BufferUnderflowException; message: null");
        } catch (java.nio.BufferUnderflowException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(byteBuffer4);
        org.junit.Assert.assertNotNull(byteBuffer7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0936");
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
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response9);
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response10);
        java.util.Map<java.lang.String, java.lang.String> strMap12 = response10.headers();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response13 = org.jsoup.helper.HttpConnection.Response.execute(request0, response10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertNotNull(strMap12);
    }

    @Test
    public void test0937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0937");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer2 = byteBuffer1.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        java.nio.ByteOrder byteOrder4 = null;
        java.nio.ByteBuffer byteBuffer5 = byteBuffer1.order(byteOrder4);
        java.nio.ByteBuffer byteBuffer6 = byteBuffer5.asReadOnlyBuffer();
        boolean boolean7 = byteBuffer6.hasRemaining();
        byte[] byteArray14 = new byte[] { (byte) 100, (byte) -1, (byte) -1, (byte) 0, (byte) 10, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer17 = byteBuffer6.put(byteArray14, (-32), (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.nio.ReadOnlyBufferException; message: null");
        } catch (java.nio.ReadOnlyBufferException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(doubleBuffer2);
        org.junit.Assert.assertNotNull(shortBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertNotNull(byteBuffer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[100, -1, -1, 0, 10, 10]");
    }

    @Test
    public void test0938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0938");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean5 = response3.hasHeader("hi!");
        response3.contentType = "java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]";
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray8 = response3.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0939");
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
        org.jsoup.Connection.Method method18 = response1.method();
        java.lang.String str19 = response1.charset;
        org.jsoup.helper.HttpConnection.Response response20 = new org.jsoup.helper.HttpConnection.Response(response1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = response1.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
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
        org.junit.Assert.assertNull(method18);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test0940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0940");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean3 = response2.executed;
        response2.statusCode = 0;
        java.lang.String str6 = response2.contentType();
        org.jsoup.Connection.Response response9 = response2.cookie("java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]", "java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry11 = response2.scanHeaders("hi!");
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response2);
        int int13 = response12.statusCode();
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response12);
        java.net.URL uRL15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response16 = response12.url(uRL15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertNull(strEntry11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0941");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.nio.ByteBuffer byteBuffer4 = response3.byteData;
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response3);
        java.nio.ByteBuffer byteBuffer7 = java.nio.ByteBuffer.allocate(0);
        response3.byteData = byteBuffer7;
        java.lang.String str10 = response3.header("");
        java.lang.String str12 = response3.header("java.nio.HeapByteBuffer[pos=0 lim=32 cap=32]");
        java.net.URL uRL13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response14 = response3.url(uRL13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(byteBuffer4);
        org.junit.Assert.assertNotNull(byteBuffer7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test0942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0942");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer2 = byteBuffer1.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        java.nio.ByteBuffer byteBuffer4 = byteBuffer1.compact();
        int int5 = byteBuffer4.capacity();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer7 = byteBuffer4.putFloat((float) 0);
            org.junit.Assert.fail("Expected exception of type java.nio.BufferOverflowException; message: null");
        } catch (java.nio.BufferOverflowException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(doubleBuffer2);
        org.junit.Assert.assertNotNull(shortBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0943");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.nio.ByteBuffer byteBuffer4 = response3.byteData;
        org.jsoup.Connection.Response response7 = response3.cookie("hi!", "");
        boolean boolean8 = response3.executed;
        org.jsoup.Connection.Request request9 = response3.req;
        org.jsoup.Connection.Response response12 = response3.header("java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]", "java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]");
        java.lang.String str14 = response3.getHeaderCaseInsensitive("hi!");
        response3.executed = true;
        org.junit.Assert.assertNull(byteBuffer4);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(request9);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test0944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0944");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            java.nio.Buffer buffer3 = byteBuffer1.limit((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
    }

    @Test
    public void test0945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0945");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.isReadOnly();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        int int4 = byteBuffer1.position();
        boolean boolean5 = byteBuffer1.isReadOnly();
        java.nio.ByteOrder byteOrder6 = byteBuffer1.order();
        java.nio.ByteBuffer byteBuffer7 = byteBuffer1.slice();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer9 = byteBuffer7.putChar(' ');
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
        org.junit.Assert.assertNotNull(byteBuffer7);
    }

    @Test
    public void test0946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0946");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.header("");
        org.jsoup.Connection.Response response5 = response1.removeCookie("hi!");
        java.lang.String str7 = response1.cookie("");
        java.lang.String str8 = response1.statusMessage();
        int int9 = response1.statusCode();
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Response response13 = response1.cookie("java.nio.HeapByteBuffer[pos=0 lim=32 cap=32]", "java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]");
        java.lang.Class<?> wildcardClass14 = response13.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0947");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer2 = byteBuffer1.asDoubleBuffer();
        boolean boolean3 = byteBuffer1.isDirect();
        java.lang.String str4 = byteBuffer1.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.Buffer buffer6 = byteBuffer1.position((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: newPosition > limit: (1 > 0)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(doubleBuffer2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]" + "'", str4, "java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]");
    }

    @Test
    public void test0948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0948");
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
            int int31 = byteBuffer28.getInt(1);
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
    public void test0949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0949");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response1);
        boolean boolean4 = response3.executed;
        java.lang.String str6 = response3.getHeaderCaseInsensitive("");
        java.net.URL uRL7 = response3.url();
        org.jsoup.Connection.Response response9 = response3.removeCookie("");
        java.lang.String str10 = response3.charset();
        org.jsoup.Connection.Request request11 = response3.req;
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
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(request11);
    }

    @Test
    public void test0950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0950");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean3 = response2.executed;
        java.util.Map<java.lang.String, java.lang.String> strMap4 = response2.cookies();
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response2);
        int int6 = response2.statusCode();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0951");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate((int) (byte) 10);
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.nio.ByteBuffer byteBuffer6 = java.nio.ByteBuffer.wrap(byteArray5);
        java.nio.ByteBuffer byteBuffer7 = byteBuffer1.get(byteArray5);
        java.nio.ByteBuffer byteBuffer8 = byteBuffer1.slice();
        byte[] byteArray9 = byteBuffer8.array();
        java.nio.ByteBuffer byteBuffer11 = byteBuffer8.putShort((short) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer14 = byteBuffer8.putDouble(1, (double) (short) 10);
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[0, 0, 0, 0, 100, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(byteBuffer11);
    }

    @Test
    public void test0952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0952");
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
        response2.statusMessage = "java.nio.HeapByteBufferR[pos=0 lim=0 cap=0]";
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
    public void test0953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0953");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.isReadOnly();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        java.nio.ByteBuffer byteBuffer5 = java.nio.ByteBuffer.allocate(0);
        boolean boolean6 = byteBuffer5.isReadOnly();
        int int7 = byteBuffer1.compareTo(byteBuffer5);
        java.nio.ByteBuffer byteBuffer8 = byteBuffer5.compact();
        java.nio.Buffer buffer10 = byteBuffer5.limit((int) (short) 0);
        java.nio.Buffer buffer11 = buffer10.flip();
        int int12 = buffer11.limit();
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(shortBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(byteBuffer8);
        org.junit.Assert.assertNotNull(buffer10);
        org.junit.Assert.assertNotNull(buffer11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0954");
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
        org.jsoup.Connection.Response response15 = response11.cookie("java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]", "");
        java.lang.String str17 = response11.getHeaderCaseInsensitive("");
        boolean boolean19 = response11.hasCookie("java.nio.HeapByteBuffer[pos=3 lim=32 cap=32]");
        org.junit.Assert.assertNull(byteBuffer4);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(uRL8);
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0955");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.isReadOnly();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        java.nio.ByteBuffer byteBuffer5 = java.nio.ByteBuffer.allocate(0);
        boolean boolean6 = byteBuffer5.isReadOnly();
        int int7 = byteBuffer1.compareTo(byteBuffer5);
        java.nio.ByteBuffer byteBuffer8 = byteBuffer5.compact();
        java.nio.Buffer buffer10 = byteBuffer5.limit((int) (short) 0);
        int int11 = byteBuffer5.remaining();
        java.nio.IntBuffer intBuffer12 = byteBuffer5.asIntBuffer();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer15 = byteBuffer5.putInt(0, 1);
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
        org.junit.Assert.assertNotNull(intBuffer12);
    }

    @Test
    public void test0956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0956");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request3 = response2.req;
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response2);
        java.lang.String str6 = response2.cookie("");
        response2.executed = true;
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response2);
        java.lang.String str11 = response2.header("java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]");
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response2);
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response2);
        org.junit.Assert.assertNull(request3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0957");
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
        boolean boolean35 = buffer34.hasRemaining();
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
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test0958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0958");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.isReadOnly();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        java.nio.ByteBuffer byteBuffer5 = java.nio.ByteBuffer.allocate(0);
        boolean boolean6 = byteBuffer5.isReadOnly();
        int int7 = byteBuffer1.compareTo(byteBuffer5);
        java.nio.Buffer buffer8 = byteBuffer5.clear();
        int int9 = byteBuffer5.arrayOffset();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer11 = byteBuffer5.putChar('4');
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
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0959");
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
            double double10 = byteBuffer5.getDouble();
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
        org.junit.Assert.assertNotNull(byteBuffer9);
    }

    @Test
    public void test0960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0960");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect(2);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer4 = byteBuffer1.putFloat((int) '\000', (float) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
    }

    @Test
    public void test0961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0961");
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
        // The following exception was thrown during execution in test generation
        try {
            double double16 = byteBuffer14.getDouble(2);
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
    }

    @Test
    public void test0962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0962");
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
        java.nio.ByteBuffer byteBuffer13 = java.nio.ByteBuffer.wrap(byteArray11);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer15 = byteBuffer13.put((byte) 1);
            org.junit.Assert.fail("Expected exception of type java.nio.BufferOverflowException; message: null");
        } catch (java.nio.BufferOverflowException e) {
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
        org.junit.Assert.assertNotNull(byteBuffer13);
    }

    @Test
    public void test0963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0963");
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
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer33 = byteBuffer28.putFloat((-1), (float) 42953080832L);
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
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]" + "'", str30, "java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]");
    }

    @Test
    public void test0964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0964");
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
            double double15 = byteBuffer3.getDouble();
            org.junit.Assert.fail("Expected exception of type java.nio.BufferUnderflowException; message: null");
        } catch (java.nio.BufferUnderflowException e) {
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
    public void test0965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0965");
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
        boolean boolean14 = byteBuffer7.isDirect();
        // The following exception was thrown during execution in test generation
        try {
            byte byte16 = byteBuffer7.get((int) '\000');
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0966");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer2 = byteBuffer1.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        int int4 = byteBuffer1.limit();
        byte[] byteArray5 = byteBuffer1.array();
        java.nio.ByteBuffer byteBuffer6 = java.nio.ByteBuffer.wrap(byteArray5);
        boolean boolean7 = byteBuffer6.hasRemaining();
        // The following exception was thrown during execution in test generation
        try {
            long long9 = byteBuffer6.getLong(0);
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
        org.junit.Assert.assertNotNull(byteBuffer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0967");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.nio.ByteBuffer byteBuffer4 = response3.byteData;
        org.jsoup.Connection.Response response7 = response3.cookie("hi!", "");
        boolean boolean8 = response3.executed;
        org.jsoup.Connection.Response response10 = response3.removeCookie("");
        int int11 = response3.statusCode();
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response3);
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry14 = response3.scanHeaders("");
        java.util.Map<java.lang.String, java.lang.String> strMap15 = response3.cookies();
        org.junit.Assert.assertNull(byteBuffer4);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(strEntry14);
        org.junit.Assert.assertNotNull(strMap15);
    }

    @Test
    public void test0968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0968");
        byte[] byteArray0 = new byte[] {};
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.wrap(byteArray0);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer4 = java.nio.ByteBuffer.wrap(byteArray0, 0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNotNull(byteBuffer1);
    }

    @Test
    public void test0969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0969");
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
        int int12 = byteBuffer11.remaining();
        // The following exception was thrown during execution in test generation
        try {
            int int14 = byteBuffer11.getInt(35);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
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
    public void test0970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0970");
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
        boolean boolean20 = response19.executed;
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray21 = response19.bodyAsBytes();
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
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0971");
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
        int int12 = response11.numRedirects;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response13 = org.jsoup.helper.HttpConnection.Response.execute(request0, response11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(uRL7);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertNull(byteBuffer10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test0972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0972");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.nio.ByteBuffer byteBuffer4 = response3.byteData;
        org.jsoup.Connection.Response response7 = response3.cookie("hi!", "");
        boolean boolean8 = response3.executed;
        org.jsoup.Connection.Request request9 = response3.req;
        org.jsoup.Connection.Response response12 = response3.header("java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]", "java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]");
        org.jsoup.Connection.Method method13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response14 = response3.method(method13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(byteBuffer4);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(request9);
        org.junit.Assert.assertNotNull(response12);
    }

    @Test
    public void test0973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0973");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean3 = response2.executed;
        java.lang.String str5 = response2.getHeaderCaseInsensitive("");
        java.net.URL uRL6 = response2.url();
        org.jsoup.Connection.Response response8 = response2.removeCookie("");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry10 = response2.scanHeaders("");
        org.jsoup.Connection.Request request11 = response2.req;
        java.net.URL uRL12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response13 = response2.url(uRL12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
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
    public void test0974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0974");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean3 = response2.executed;
        java.lang.String str5 = response2.getHeaderCaseInsensitive("");
        java.lang.String str7 = response2.cookie("java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]");
        int int8 = response2.statusCode();
        org.jsoup.Connection.Response response11 = response2.cookie("hi!", "");
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = response2.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(response11);
    }

    @Test
    public void test0975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0975");
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
        response13.contentType = "";
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNotNull(strMap12);
    }

    @Test
    public void test0976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0976");
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
            java.nio.ByteBuffer byteBuffer11 = byteBuffer8.put((int) (byte) 1, (byte) -1);
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
    }

    @Test
    public void test0977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0977");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.nio.ByteBuffer byteBuffer4 = response3.byteData;
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response3);
        response3.executed = false;
        org.junit.Assert.assertNull(byteBuffer4);
    }

    @Test
    public void test0978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0978");
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
        // The following exception was thrown during execution in test generation
        try {
            float float14 = byteBuffer5.getFloat();
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
        org.junit.Assert.assertNotNull(buffer9);
        org.junit.Assert.assertNotNull(byteBuffer10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(buffer13);
    }

    @Test
    public void test0979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0979");
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
            java.nio.Buffer buffer20 = byteBuffer13.limit(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
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
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(buffer17);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[]");
    }

    @Test
    public void test0980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0980");
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
        // The following exception was thrown during execution in test generation
        try {
            long long24 = byteBuffer23.getLong();
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
    }

    @Test
    public void test0981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0981");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate((int) (byte) 10);
        int int2 = byteBuffer1.limit();
        java.nio.ByteBuffer byteBuffer4 = byteBuffer1.putChar(' ');
        java.nio.ByteBuffer byteBuffer5 = byteBuffer1.asReadOnlyBuffer();
        java.nio.LongBuffer longBuffer6 = byteBuffer5.asLongBuffer();
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertNotNull(longBuffer6);
    }

    @Test
    public void test0982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0982");
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
            int int25 = byteBuffer20.getInt();
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
    public void test0983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0983");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.nio.ByteBuffer byteBuffer5 = response4.byteData;
        java.net.URL uRL6 = response4.url();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response7 = org.jsoup.helper.HttpConnection.Response.execute(request0, response4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(byteBuffer5);
        org.junit.Assert.assertNull(uRL6);
    }

    @Test
    public void test0984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0984");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.nio.ByteBuffer byteBuffer5 = response4.byteData;
        java.lang.String str6 = response4.charset;
        boolean boolean8 = response4.hasCookie("hi!");
        org.jsoup.Connection.Response response10 = response4.removeHeader("java.nio.HeapByteBuffer[pos=0 lim=32 cap=32]");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response11 = org.jsoup.helper.HttpConnection.Response.execute(request0, response4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(byteBuffer5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(response10);
    }

    @Test
    public void test0985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0985");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Method method6 = response5.method();
        boolean boolean8 = response5.hasCookie("hi!");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry10 = response5.scanHeaders("hi!");
        java.lang.String str11 = response5.statusMessage();
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response5);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(strEntry10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0986");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean3 = response2.executed;
        java.util.Map<java.lang.String, java.lang.String> strMap4 = response2.cookies();
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response2);
        int int6 = response5.statusCode();
        java.net.URL uRL7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response8 = response5.url(uRL7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0987");
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
            long long11 = byteBuffer2.getLong(11);
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
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0988");
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
        java.nio.ShortBuffer shortBuffer18 = byteBuffer10.asShortBuffer();
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
        org.junit.Assert.assertNotNull(shortBuffer18);
    }

    @Test
    public void test0989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0989");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer2 = byteBuffer1.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        int int4 = byteBuffer1.limit();
        int int5 = byteBuffer1.arrayOffset();
        java.nio.ByteBuffer byteBuffer7 = java.nio.ByteBuffer.allocate((int) (byte) 100);
        java.nio.ByteBuffer byteBuffer9 = byteBuffer7.putDouble((double) '4');
        byte[] byteArray15 = new byte[] { (byte) 1, (byte) 100, (byte) -1, (byte) 10, (byte) -1 };
        java.nio.ByteBuffer byteBuffer16 = byteBuffer7.put(byteArray15);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer17 = byteBuffer1.put(byteArray15);
            org.junit.Assert.fail("Expected exception of type java.nio.BufferOverflowException; message: null");
        } catch (java.nio.BufferOverflowException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(doubleBuffer2);
        org.junit.Assert.assertNotNull(shortBuffer3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(byteBuffer7);
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[1, 100, -1, 10, -1]");
        org.junit.Assert.assertNotNull(byteBuffer16);
    }

    @Test
    public void test0990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0990");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect((int) '#');
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.putShort((short) 0);
        java.nio.ByteBuffer byteBuffer6 = byteBuffer3.putLong(1, (long) 10);
        long long7 = byteBuffer3.getLong();
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 2560L + "'", long7 == 2560L);
    }

    @Test
    public void test0991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0991");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer2 = byteBuffer1.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        java.nio.ByteOrder byteOrder4 = null;
        java.nio.ByteBuffer byteBuffer5 = byteBuffer1.order(byteOrder4);
        int int6 = byteBuffer5.capacity();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer8 = byteBuffer5.putInt(100);
            org.junit.Assert.fail("Expected exception of type java.nio.BufferOverflowException; message: null");
        } catch (java.nio.BufferOverflowException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(doubleBuffer2);
        org.junit.Assert.assertNotNull(shortBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0992");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer2 = byteBuffer1.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        int int4 = byteBuffer1.limit();
        byte[] byteArray5 = byteBuffer1.array();
        java.nio.ByteBuffer byteBuffer6 = java.nio.ByteBuffer.wrap(byteArray5);
        java.lang.Class<?> wildcardClass7 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(doubleBuffer2);
        org.junit.Assert.assertNotNull(shortBuffer3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[]");
        org.junit.Assert.assertNotNull(byteBuffer6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0993");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.isReadOnly();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        int int4 = byteBuffer1.position();
        java.nio.ByteOrder byteOrder5 = null;
        java.nio.ByteBuffer byteBuffer6 = byteBuffer1.order(byteOrder5);
        java.nio.ByteBuffer byteBuffer7 = byteBuffer1.asReadOnlyBuffer();
        java.nio.CharBuffer charBuffer8 = byteBuffer1.asCharBuffer();
        java.lang.Class<?> wildcardClass9 = byteBuffer1.getClass();
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(shortBuffer3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(byteBuffer6);
        org.junit.Assert.assertNotNull(byteBuffer7);
        org.junit.Assert.assertNotNull(charBuffer8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0994");
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
        java.nio.IntBuffer intBuffer12 = byteBuffer5.asIntBuffer();
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
        org.junit.Assert.assertNotNull(intBuffer12);
    }

    @Test
    public void test0995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0995");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.hasRemaining();
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.asReadOnlyBuffer();
        java.nio.LongBuffer longBuffer4 = byteBuffer1.asLongBuffer();
        java.nio.ByteOrder byteOrder5 = byteBuffer1.order();
        byte[] byteArray6 = byteBuffer1.array();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer9 = java.nio.ByteBuffer.wrap(byteArray6, (int) '\000', 1677787392);
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
    }

    @Test
    public void test0996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0996");
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
        java.util.Map<java.lang.String, java.lang.String> strMap12 = response3.headers();
        org.jsoup.Connection.Method method13 = response3.method();
        int int14 = response3.numRedirects;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response15 = org.jsoup.helper.HttpConnection.Response.execute(request0, response3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(request4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertNull(method13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test0997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0997");
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
        java.nio.Buffer buffer22 = byteBuffer15.flip();
        boolean boolean23 = buffer22.isReadOnly();
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
        org.junit.Assert.assertNotNull(buffer22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test0998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0998");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request3 = response2.req;
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response2);
        java.lang.String str6 = response2.cookie("");
        response2.executed = true;
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response2);
        java.lang.String str11 = response2.header("java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]");
        java.lang.String str12 = response2.statusMessage;
        int int13 = response2.statusCode();
        org.jsoup.Connection.Method method14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response15 = response2.method(method14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(request3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0999");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = response2.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test1000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test1000");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.header("");
        org.jsoup.Connection.Response response5 = response1.removeCookie("hi!");
        java.lang.String str7 = response1.cookie("");
        java.lang.String str8 = response1.statusMessage();
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response1);
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
    }
}
