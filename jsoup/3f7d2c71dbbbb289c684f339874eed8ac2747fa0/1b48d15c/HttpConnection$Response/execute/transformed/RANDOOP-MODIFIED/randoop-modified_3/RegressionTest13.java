import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest13 {

    public static boolean debug = false;

    @Test
    public void test6501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6501");
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
        boolean boolean13 = byteBuffer5.isReadOnly();
        java.nio.ByteBuffer byteBuffer14 = byteBuffer5.duplicate();
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
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(byteBuffer14);
    }

    @Test
    public void test6502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6502");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate((int) (byte) 10);
        int int2 = byteBuffer1.getInt();
        java.nio.ByteBuffer byteBuffer5 = byteBuffer1.put((int) (byte) 0, (byte) 10);
        java.nio.Buffer buffer7 = byteBuffer5.position(3);
        java.nio.ByteBuffer byteBuffer9 = byteBuffer5.putChar('#');
        java.nio.ShortBuffer shortBuffer10 = byteBuffer5.asShortBuffer();
        java.nio.ByteBuffer byteBuffer12 = java.nio.ByteBuffer.allocate(0);
        boolean boolean13 = byteBuffer12.isReadOnly();
        java.nio.ShortBuffer shortBuffer14 = byteBuffer12.asShortBuffer();
        java.nio.ByteBuffer byteBuffer16 = java.nio.ByteBuffer.allocate(0);
        boolean boolean17 = byteBuffer16.isReadOnly();
        int int18 = byteBuffer12.compareTo(byteBuffer16);
        java.nio.ByteBuffer byteBuffer19 = byteBuffer16.compact();
        java.nio.Buffer buffer21 = byteBuffer16.limit((int) (short) 0);
        int int22 = byteBuffer16.remaining();
        java.nio.IntBuffer intBuffer23 = byteBuffer16.asIntBuffer();
        int int24 = byteBuffer16.capacity();
        java.nio.ByteBuffer byteBuffer26 = java.nio.ByteBuffer.allocate((int) (byte) 10);
        int int27 = byteBuffer26.limit();
        java.nio.ByteBuffer byteBuffer29 = byteBuffer26.putFloat((float) (-1));
        java.nio.ByteBuffer byteBuffer31 = java.nio.ByteBuffer.allocate((int) (byte) 10);
        int int32 = byteBuffer31.getInt();
        java.nio.ByteBuffer byteBuffer35 = byteBuffer31.put((int) (byte) 0, (byte) 10);
        java.nio.IntBuffer intBuffer36 = byteBuffer31.asIntBuffer();
        java.nio.Buffer buffer37 = byteBuffer31.mark();
        java.nio.Buffer buffer38 = byteBuffer31.flip();
        java.nio.Buffer buffer39 = byteBuffer31.mark();
        java.nio.ByteBuffer byteBuffer41 = java.nio.ByteBuffer.allocate(0);
        boolean boolean42 = byteBuffer41.isReadOnly();
        java.nio.ShortBuffer shortBuffer43 = byteBuffer41.asShortBuffer();
        java.nio.ByteBuffer byteBuffer45 = java.nio.ByteBuffer.allocate(0);
        boolean boolean46 = byteBuffer45.isReadOnly();
        int int47 = byteBuffer41.compareTo(byteBuffer45);
        java.nio.ByteBuffer byteBuffer48 = byteBuffer45.compact();
        java.nio.ByteBuffer byteBuffer50 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer51 = byteBuffer50.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer52 = byteBuffer50.asShortBuffer();
        byte[] byteArray53 = byteBuffer50.array();
        java.nio.ByteBuffer byteBuffer54 = java.nio.ByteBuffer.wrap(byteArray53);
        java.nio.ByteBuffer byteBuffer55 = byteBuffer45.put(byteArray53);
        java.nio.ByteBuffer byteBuffer56 = byteBuffer31.put(byteArray53);
        java.nio.ByteBuffer byteBuffer57 = byteBuffer26.put(byteArray53);
        java.nio.ByteBuffer byteBuffer58 = byteBuffer16.put(byteArray53);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer61 = byteBuffer5.get(byteArray53, (-18), 22);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertNotNull(buffer7);
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertNotNull(shortBuffer10);
        org.junit.Assert.assertNotNull(byteBuffer12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(shortBuffer14);
        org.junit.Assert.assertNotNull(byteBuffer16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(byteBuffer19);
        org.junit.Assert.assertNotNull(buffer21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(intBuffer23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(byteBuffer26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10 + "'", int27 == 10);
        org.junit.Assert.assertNotNull(byteBuffer29);
        org.junit.Assert.assertNotNull(byteBuffer31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(byteBuffer35);
        org.junit.Assert.assertNotNull(intBuffer36);
        org.junit.Assert.assertNotNull(buffer37);
        org.junit.Assert.assertNotNull(buffer38);
        org.junit.Assert.assertNotNull(buffer39);
        org.junit.Assert.assertNotNull(byteBuffer41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(shortBuffer43);
        org.junit.Assert.assertNotNull(byteBuffer45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNotNull(byteBuffer48);
        org.junit.Assert.assertNotNull(byteBuffer50);
        org.junit.Assert.assertNotNull(doubleBuffer51);
        org.junit.Assert.assertNotNull(shortBuffer52);
        org.junit.Assert.assertNotNull(byteArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray53), "[]");
        org.junit.Assert.assertNotNull(byteBuffer54);
        org.junit.Assert.assertNotNull(byteBuffer55);
        org.junit.Assert.assertNotNull(byteBuffer56);
        org.junit.Assert.assertNotNull(byteBuffer57);
        org.junit.Assert.assertNotNull(byteBuffer58);
    }

    @Test
    public void test6503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6503");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request3 = response2.req;
        org.jsoup.Connection.Method method4 = response2.method();
        java.lang.String str5 = response2.contentType;
        java.util.Map<java.lang.String, java.lang.String> strMap6 = response2.headers();
        int int7 = response2.statusCode;
        java.net.URL uRL8 = response2.url();
        org.junit.Assert.assertNull(request3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(uRL8);
    }

    @Test
    public void test6504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6504");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.executed = false;
        java.lang.String str4 = response1.contentType;
        int int5 = response1.statusCode;
        java.nio.ByteBuffer byteBuffer6 = null;
        response1.byteData = byteBuffer6;
        java.lang.String str8 = response1.statusMessage;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = response1.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test6505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6505");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate((int) (byte) 10);
        int int2 = byteBuffer1.getInt();
        java.nio.ByteBuffer byteBuffer5 = byteBuffer1.put((int) (byte) 0, (byte) 10);
        byte[] byteArray6 = byteBuffer5.array();
        java.nio.ByteBuffer byteBuffer7 = java.nio.ByteBuffer.wrap(byteArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer10 = java.nio.ByteBuffer.wrap(byteArray6, (int) '4', (-29));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(byteBuffer7);
    }

    @Test
    public void test6506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6506");
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
        int int14 = response2.numRedirects;
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test6507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6507");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect((int) '#');
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.putShort((short) 0);
        java.nio.ByteBuffer byteBuffer6 = byteBuffer3.putShort(0, (short) (byte) 10);
        java.nio.Buffer buffer7 = byteBuffer6.clear();
        java.nio.ByteOrder byteOrder8 = byteBuffer6.order();
        java.nio.ByteBuffer byteBuffer11 = byteBuffer6.putChar(1, 'a');
        java.nio.Buffer buffer12 = byteBuffer11.rewind();
        java.nio.ByteBuffer byteBuffer15 = byteBuffer11.putShort((int) '\000', (short) (byte) 1);
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer6);
        org.junit.Assert.assertNotNull(buffer7);
        org.junit.Assert.assertNotNull(byteOrder8);
        org.junit.Assert.assertNotNull(byteBuffer11);
        org.junit.Assert.assertNotNull(buffer12);
        org.junit.Assert.assertNotNull(byteBuffer15);
    }

    @Test
    public void test6508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6508");
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
        org.jsoup.helper.HttpConnection.Response response34 = new org.jsoup.helper.HttpConnection.Response(response33);
        response34.contentType = "java.nio.DirectByteBuffer[pos=0 lim=31 cap=35]";
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
    }

    @Test
    public void test6509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6509");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate((int) (byte) 10);
        int int2 = byteBuffer1.limit();
        java.nio.ByteBuffer byteBuffer4 = byteBuffer1.putChar(' ');
        java.nio.ByteBuffer byteBuffer5 = byteBuffer1.asReadOnlyBuffer();
        java.nio.ByteBuffer byteBuffer7 = byteBuffer1.putLong((long) (-1));
        java.nio.Buffer buffer8 = byteBuffer1.rewind();
        java.nio.ByteBuffer byteBuffer11 = byteBuffer1.putDouble(0, (double) '4');
        short short12 = byteBuffer11.getShort();
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertNotNull(byteBuffer7);
        org.junit.Assert.assertNotNull(buffer8);
        org.junit.Assert.assertNotNull(byteBuffer11);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 16458 + "'", short12 == (short) 16458);
    }

    @Test
    public void test6510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6510");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect((int) '#');
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.putShort((short) 0);
        java.nio.ByteBuffer byteBuffer6 = byteBuffer3.putShort(0, (short) (byte) 10);
        java.nio.Buffer buffer7 = byteBuffer6.clear();
        java.nio.ByteBuffer byteBuffer9 = byteBuffer6.putFloat((float) 97);
        java.nio.ByteBuffer byteBuffer11 = java.nio.ByteBuffer.allocate(0);
        boolean boolean12 = byteBuffer11.isReadOnly();
        java.nio.ShortBuffer shortBuffer13 = byteBuffer11.asShortBuffer();
        java.nio.ByteBuffer byteBuffer15 = java.nio.ByteBuffer.allocate(0);
        boolean boolean16 = byteBuffer15.isReadOnly();
        int int17 = byteBuffer11.compareTo(byteBuffer15);
        java.nio.DoubleBuffer doubleBuffer18 = byteBuffer15.asDoubleBuffer();
        java.nio.FloatBuffer floatBuffer19 = byteBuffer15.asFloatBuffer();
        java.nio.ByteBuffer byteBuffer21 = java.nio.ByteBuffer.allocate((int) (byte) 10);
        byte[] byteArray25 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.nio.ByteBuffer byteBuffer26 = java.nio.ByteBuffer.wrap(byteArray25);
        java.nio.ByteBuffer byteBuffer27 = byteBuffer21.get(byteArray25);
        java.nio.ByteBuffer byteBuffer30 = byteBuffer15.put(byteArray25, 0, (int) (byte) 0);
        java.nio.ByteBuffer byteBuffer31 = java.nio.ByteBuffer.wrap(byteArray25);
        byte[] byteArray32 = new byte[] {};
        java.nio.ByteBuffer byteBuffer33 = java.nio.ByteBuffer.wrap(byteArray32);
        java.nio.ByteBuffer byteBuffer34 = byteBuffer31.get(byteArray32);
        java.nio.ByteBuffer byteBuffer36 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer37 = byteBuffer36.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer38 = byteBuffer36.asShortBuffer();
        java.nio.ByteBuffer byteBuffer39 = byteBuffer36.compact();
        java.nio.ByteOrder byteOrder40 = byteBuffer39.order();
        java.nio.ByteBuffer byteBuffer41 = byteBuffer31.order(byteOrder40);
        boolean boolean42 = byteBuffer31.isReadOnly();
        java.nio.ByteBuffer byteBuffer43 = byteBuffer9.put(byteBuffer31);
        int int44 = byteBuffer9.getInt();
        java.nio.ByteBuffer byteBuffer46 = byteBuffer9.putFloat((float) 167772160);
        java.lang.Object obj47 = null;
        boolean boolean48 = byteBuffer9.equals(obj47);
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer6);
        org.junit.Assert.assertNotNull(buffer7);
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertNotNull(byteBuffer11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(shortBuffer13);
        org.junit.Assert.assertNotNull(byteBuffer15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(doubleBuffer18);
        org.junit.Assert.assertNotNull(floatBuffer19);
        org.junit.Assert.assertNotNull(byteBuffer21);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(byteBuffer26);
        org.junit.Assert.assertNotNull(byteBuffer27);
        org.junit.Assert.assertNotNull(byteBuffer30);
        org.junit.Assert.assertNotNull(byteBuffer31);
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray32), "[]");
        org.junit.Assert.assertNotNull(byteBuffer33);
        org.junit.Assert.assertNotNull(byteBuffer34);
        org.junit.Assert.assertNotNull(byteBuffer36);
        org.junit.Assert.assertNotNull(doubleBuffer37);
        org.junit.Assert.assertNotNull(shortBuffer38);
        org.junit.Assert.assertNotNull(byteBuffer39);
        org.junit.Assert.assertNotNull(byteOrder40);
        org.junit.Assert.assertNotNull(byteBuffer41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(byteBuffer43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(byteBuffer46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test6511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6511");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean3 = response2.executed;
        response2.statusCode = 0;
        org.jsoup.Connection.Method method6 = response2.method();
        java.lang.String str8 = response2.cookie("hi!");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry10 = response2.scanHeaders("java.nio.HeapByteBuffer[pos=3 lim=32 cap=32]");
        boolean boolean12 = response2.hasHeader("java.nio.HeapByteBuffer[pos=0 lim=0 cap=100]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(strEntry10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test6512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6512");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.nio.ByteBuffer byteBuffer4 = response3.byteData;
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response3);
        java.lang.String str7 = response3.header("java.nio.DirectByteBuffer[pos=0 lim=35 cap=35]");
        int int8 = response3.numRedirects;
        org.junit.Assert.assertNull(byteBuffer4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test6513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6513");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate((int) (byte) 10);
        int int2 = byteBuffer1.limit();
        short short3 = byteBuffer1.getShort();
        java.nio.ByteBuffer byteBuffer5 = byteBuffer1.put((byte) -1);
        java.nio.ByteBuffer byteBuffer7 = byteBuffer5.putFloat((float) 137438953472L);
        // The following exception was thrown during execution in test generation
        try {
            int int8 = byteBuffer5.getInt();
            org.junit.Assert.fail("Expected exception of type java.nio.BufferUnderflowException; message: null");
        } catch (java.nio.BufferUnderflowException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertNotNull(byteBuffer7);
    }

    @Test
    public void test6514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6514");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.executed = false;
        java.lang.String str4 = response1.contentType;
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str6 = response5.charset();
        java.net.URL uRL7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response8 = response5.url(uRL7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test6515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6515");
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
        int int22 = byteBuffer10.arrayOffset();
        short short23 = byteBuffer10.getShort();
        java.nio.ByteBuffer byteBuffer25 = byteBuffer10.putChar('a');
        java.nio.ByteBuffer byteBuffer27 = java.nio.ByteBuffer.allocate((int) (byte) 10);
        int int28 = byteBuffer27.limit();
        java.nio.ByteBuffer byteBuffer30 = byteBuffer27.putChar(' ');
        java.nio.ByteBuffer byteBuffer32 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer33 = byteBuffer32.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer34 = byteBuffer32.asShortBuffer();
        java.nio.ByteOrder byteOrder35 = null;
        java.nio.ByteBuffer byteBuffer36 = byteBuffer32.order(byteOrder35);
        java.nio.ByteBuffer byteBuffer38 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer39 = byteBuffer38.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer40 = byteBuffer38.asShortBuffer();
        int int41 = byteBuffer38.limit();
        byte[] byteArray42 = byteBuffer38.array();
        java.nio.ByteBuffer byteBuffer43 = byteBuffer32.put(byteArray42);
        java.nio.ByteBuffer byteBuffer44 = byteBuffer27.put(byteArray42);
        java.nio.ByteBuffer byteBuffer45 = byteBuffer25.put(byteArray42);
        java.nio.ByteBuffer byteBuffer47 = byteBuffer45.putLong(429496729610L);
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + short23 + "' != '" + (short) 0 + "'", short23 == (short) 0);
        org.junit.Assert.assertNotNull(byteBuffer25);
        org.junit.Assert.assertNotNull(byteBuffer27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 10 + "'", int28 == 10);
        org.junit.Assert.assertNotNull(byteBuffer30);
        org.junit.Assert.assertNotNull(byteBuffer32);
        org.junit.Assert.assertNotNull(doubleBuffer33);
        org.junit.Assert.assertNotNull(shortBuffer34);
        org.junit.Assert.assertNotNull(byteBuffer36);
        org.junit.Assert.assertNotNull(byteBuffer38);
        org.junit.Assert.assertNotNull(doubleBuffer39);
        org.junit.Assert.assertNotNull(shortBuffer40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray42), "[]");
        org.junit.Assert.assertNotNull(byteBuffer43);
        org.junit.Assert.assertNotNull(byteBuffer44);
        org.junit.Assert.assertNotNull(byteBuffer45);
        org.junit.Assert.assertNotNull(byteBuffer47);
    }

    @Test
    public void test6516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6516");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.executed = false;
        java.lang.String str4 = response1.contentType;
        int int5 = response1.statusCode;
        java.lang.String str6 = response1.charset();
        java.lang.String str8 = response1.header("java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]");
        java.lang.String str9 = response1.charset;
        java.util.Map<java.lang.String, java.lang.String> strMap10 = response1.cookies();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(strMap10);
    }

    @Test
    public void test6517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6517");
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
        java.nio.IntBuffer intBuffer15 = byteBuffer12.asIntBuffer();
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
        org.junit.Assert.assertNotNull(intBuffer15);
    }

    @Test
    public void test6518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6518");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.executed = false;
        java.lang.String str4 = response1.contentType;
        int int5 = response1.statusCode;
        java.lang.String str6 = response1.charset();
        org.jsoup.Connection.Request request7 = null;
        response1.req = request7;
        response1.charset = "java.nio.DirectByteBuffer[pos=8 lim=35 cap=35]";
        java.lang.String str11 = response1.statusMessage();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test6519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6519");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate((int) (byte) 10);
        int int2 = byteBuffer1.limit();
        short short3 = byteBuffer1.getShort();
        java.nio.ByteBuffer byteBuffer5 = byteBuffer1.put((byte) -1);
        java.nio.IntBuffer intBuffer6 = byteBuffer5.asIntBuffer();
        java.nio.CharBuffer charBuffer7 = byteBuffer5.asCharBuffer();
        short short9 = byteBuffer5.getShort((int) (byte) 1);
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertNotNull(intBuffer6);
        org.junit.Assert.assertNotNull(charBuffer7);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 255 + "'", short9 == (short) 255);
    }

    @Test
    public void test6520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6520");
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
        java.nio.ByteBuffer byteBuffer13 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer14 = byteBuffer13.asDoubleBuffer();
        boolean boolean15 = byteBuffer13.isDirect();
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
        java.nio.ByteBuffer byteBuffer29 = byteBuffer21.slice();
        java.nio.ByteBuffer byteBuffer30 = byteBuffer13.put(byteBuffer29);
        java.nio.Buffer buffer31 = byteBuffer30.mark();
        java.nio.Buffer buffer32 = byteBuffer30.reset();
        java.nio.DoubleBuffer doubleBuffer33 = byteBuffer30.asDoubleBuffer();
        boolean boolean34 = byteBuffer30.hasRemaining();
        int int35 = byteBuffer30.limit();
        int int36 = byteBuffer30.capacity();
        java.nio.ByteBuffer byteBuffer37 = byteBuffer9.put(byteBuffer30);
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
        org.junit.Assert.assertNotNull(byteBuffer13);
        org.junit.Assert.assertNotNull(doubleBuffer14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
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
        org.junit.Assert.assertNotNull(byteBuffer30);
        org.junit.Assert.assertNotNull(buffer31);
        org.junit.Assert.assertNotNull(buffer32);
        org.junit.Assert.assertNotNull(doubleBuffer33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(byteBuffer37);
    }

    @Test
    public void test6521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6521");
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
        java.lang.String str31 = response2.statusMessage;
        org.jsoup.helper.HttpConnection.Response response32 = new org.jsoup.helper.HttpConnection.Response(response2);
        org.jsoup.helper.HttpConnection.Response response33 = new org.jsoup.helper.HttpConnection.Response(response2);
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
        org.junit.Assert.assertNull(str31);
    }

    @Test
    public void test6522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6522");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.nio.ByteBuffer byteBuffer4 = response3.byteData;
        org.jsoup.Connection.Response response7 = response3.cookie("hi!", "");
        boolean boolean8 = response3.executed;
        org.jsoup.Connection.Request request9 = response3.req;
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response3);
        response3.numRedirects = '\u2300';
        response3.statusMessage = "java.nio.HeapByteBuffer[pos=3 lim=32 cap=32]";
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response3);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Too many redirects occurred trying to load URL null");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(byteBuffer4);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(request9);
    }

    @Test
    public void test6523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6523");
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
        java.lang.String str13 = response11.contentType();
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
    public void test6524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6524");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate((int) (byte) 10);
        int int2 = byteBuffer1.limit();
        java.nio.ByteBuffer byteBuffer4 = byteBuffer1.putChar(' ');
        java.nio.ByteBuffer byteBuffer5 = byteBuffer1.asReadOnlyBuffer();
        java.nio.ByteBuffer byteBuffer7 = byteBuffer1.putLong((long) (-1));
        java.nio.ByteBuffer byteBuffer9 = java.nio.ByteBuffer.allocate(0);
        boolean boolean10 = byteBuffer9.isReadOnly();
        java.nio.ShortBuffer shortBuffer11 = byteBuffer9.asShortBuffer();
        java.nio.ByteBuffer byteBuffer13 = java.nio.ByteBuffer.allocate(0);
        boolean boolean14 = byteBuffer13.isReadOnly();
        int int15 = byteBuffer9.compareTo(byteBuffer13);
        java.nio.DoubleBuffer doubleBuffer16 = byteBuffer13.asDoubleBuffer();
        java.nio.FloatBuffer floatBuffer17 = byteBuffer13.asFloatBuffer();
        java.nio.ByteBuffer byteBuffer19 = java.nio.ByteBuffer.allocate((int) (byte) 10);
        byte[] byteArray23 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.nio.ByteBuffer byteBuffer24 = java.nio.ByteBuffer.wrap(byteArray23);
        java.nio.ByteBuffer byteBuffer25 = byteBuffer19.get(byteArray23);
        java.nio.ByteBuffer byteBuffer28 = byteBuffer13.put(byteArray23, 0, (int) (byte) 0);
        java.nio.ByteBuffer byteBuffer29 = java.nio.ByteBuffer.wrap(byteArray23);
        java.nio.ByteBuffer byteBuffer32 = byteBuffer1.get(byteArray23, 3, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer35 = byteBuffer1.putInt((int) (short) 16458, (-27));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertNotNull(byteBuffer7);
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(shortBuffer11);
        org.junit.Assert.assertNotNull(byteBuffer13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(doubleBuffer16);
        org.junit.Assert.assertNotNull(floatBuffer17);
        org.junit.Assert.assertNotNull(byteBuffer19);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(byteBuffer24);
        org.junit.Assert.assertNotNull(byteBuffer25);
        org.junit.Assert.assertNotNull(byteBuffer28);
        org.junit.Assert.assertNotNull(byteBuffer29);
        org.junit.Assert.assertNotNull(byteBuffer32);
    }

    @Test
    public void test6525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6525");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.header("");
        org.jsoup.Connection.Response response5 = response1.removeCookie("hi!");
        java.lang.String str7 = response1.cookie("");
        java.lang.String str8 = response1.statusMessage();
        java.lang.String str9 = response1.charset();
        java.lang.String str10 = response1.statusMessage;
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.net.URL uRL12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response13 = response1.url(uRL12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test6526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6526");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer2 = byteBuffer1.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        int int4 = byteBuffer1.limit();
        byte[] byteArray5 = byteBuffer1.array();
        java.nio.ByteBuffer byteBuffer6 = java.nio.ByteBuffer.wrap(byteArray5);
        boolean boolean7 = byteBuffer6.isDirect();
        java.nio.ByteBuffer byteBuffer9 = java.nio.ByteBuffer.allocate((int) ' ');
        java.nio.ByteBuffer byteBuffer11 = java.nio.ByteBuffer.allocate(0);
        java.nio.ByteBuffer byteBuffer12 = byteBuffer11.slice();
        java.nio.ByteBuffer byteBuffer13 = byteBuffer9.put(byteBuffer12);
        byte[] byteArray17 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.nio.ByteBuffer byteBuffer18 = java.nio.ByteBuffer.wrap(byteArray17);
        java.nio.ByteBuffer byteBuffer19 = java.nio.ByteBuffer.wrap(byteArray17);
        java.nio.ByteBuffer byteBuffer20 = java.nio.ByteBuffer.wrap(byteArray17);
        java.nio.ByteBuffer byteBuffer21 = byteBuffer13.get(byteArray17);
        java.nio.ByteOrder byteOrder22 = byteBuffer13.order();
        java.nio.ByteBuffer byteBuffer23 = byteBuffer6.order(byteOrder22);
        java.nio.Buffer buffer25 = byteBuffer6.limit(0);
        int int26 = buffer25.limit();
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(doubleBuffer2);
        org.junit.Assert.assertNotNull(shortBuffer3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[]");
        org.junit.Assert.assertNotNull(byteBuffer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertNotNull(byteBuffer11);
        org.junit.Assert.assertNotNull(byteBuffer12);
        org.junit.Assert.assertNotNull(byteBuffer13);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(byteBuffer18);
        org.junit.Assert.assertNotNull(byteBuffer19);
        org.junit.Assert.assertNotNull(byteBuffer20);
        org.junit.Assert.assertNotNull(byteBuffer21);
        org.junit.Assert.assertNotNull(byteOrder22);
        org.junit.Assert.assertNotNull(byteBuffer23);
        org.junit.Assert.assertNotNull(buffer25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test6527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6527");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean3 = response2.executed;
        java.lang.String str5 = response2.getHeaderCaseInsensitive("");
        java.net.URL uRL6 = response2.url();
        org.jsoup.Connection.Response response9 = response2.cookie("java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]", "java.nio.HeapByteBuffer[pos=0 lim=32 cap=32]");
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response2);
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response10);
        response10.contentType = "java.nio.HeapByteBuffer[pos=0 lim=32 cap=32]";
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response10);
        boolean boolean16 = response10.hasCookie("java.nio.HeapByteBuffer[pos=6 lim=10 cap=10]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test6528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6528");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.header("");
        org.jsoup.Connection.Response response5 = response1.removeCookie("hi!");
        java.lang.String str7 = response1.cookie("");
        java.lang.String str8 = response1.statusMessage();
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response9);
        org.jsoup.Connection.Response response12 = response9.removeHeader("java.nio.HeapByteBuffer[pos=10 lim=10 cap=10]");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(response12);
    }

    @Test
    public void test6529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6529");
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
        java.nio.ByteBuffer byteBuffer31 = java.nio.ByteBuffer.allocate((int) ' ');
        int int33 = byteBuffer31.getInt((int) (short) 0);
        java.nio.CharBuffer charBuffer34 = byteBuffer31.asCharBuffer();
        java.nio.ByteBuffer byteBuffer37 = byteBuffer31.putInt((int) (byte) 0, (int) ' ');
        java.nio.CharBuffer charBuffer38 = byteBuffer37.asCharBuffer();
        boolean boolean39 = byteBuffer29.equals((java.lang.Object) byteBuffer37);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer42 = byteBuffer29.putFloat(73, 0.0f);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(charBuffer34);
        org.junit.Assert.assertNotNull(byteBuffer37);
        org.junit.Assert.assertNotNull(charBuffer38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test6530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6530");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect((int) '#');
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.putShort((short) 0);
        java.nio.ByteOrder byteOrder4 = byteBuffer3.order();
        java.nio.ByteBuffer byteBuffer7 = byteBuffer3.put(0, (byte) 0);
        java.nio.ByteBuffer byteBuffer10 = byteBuffer3.putShort((int) (short) 10, (short) 100);
        java.nio.ShortBuffer shortBuffer11 = byteBuffer10.asShortBuffer();
        java.nio.ByteBuffer byteBuffer14 = byteBuffer10.putShort(25, (short) (byte) 0);
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertNotNull(byteOrder4);
        org.junit.Assert.assertNotNull(byteBuffer7);
        org.junit.Assert.assertNotNull(byteBuffer10);
        org.junit.Assert.assertNotNull(shortBuffer11);
        org.junit.Assert.assertNotNull(byteBuffer14);
    }

    @Test
    public void test6531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6531");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer2 = byteBuffer1.asDoubleBuffer();
        boolean boolean3 = byteBuffer1.isDirect();
        int int4 = byteBuffer1.arrayOffset();
        java.nio.Buffer buffer5 = byteBuffer1.mark();
        java.nio.IntBuffer intBuffer6 = byteBuffer1.asIntBuffer();
        java.nio.Buffer buffer7 = byteBuffer1.reset();
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(doubleBuffer2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(buffer5);
        org.junit.Assert.assertNotNull(intBuffer6);
        org.junit.Assert.assertNotNull(buffer7);
    }

    @Test
    public void test6532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6532");
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
        java.lang.String str16 = response11.charset();
        java.lang.Class<?> wildcardClass17 = response11.getClass();
        org.junit.Assert.assertNull(byteBuffer4);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(uRL8);
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test6533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6533");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect((int) '#');
        float float3 = byteBuffer1.getFloat(1);
        char char4 = byteBuffer1.getChar();
        java.nio.ByteBuffer byteBuffer6 = byteBuffer1.putDouble((double) '#');
        java.nio.ShortBuffer shortBuffer7 = byteBuffer6.asShortBuffer();
        java.nio.ByteBuffer byteBuffer9 = byteBuffer6.putFloat((float) 14);
        boolean boolean10 = byteBuffer6.isDirect();
        java.nio.ByteBuffer byteBuffer11 = byteBuffer6.duplicate();
        java.nio.ByteBuffer byteBuffer13 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer14 = byteBuffer13.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer15 = byteBuffer13.asShortBuffer();
        java.nio.ByteOrder byteOrder16 = null;
        java.nio.ByteBuffer byteBuffer17 = byteBuffer13.order(byteOrder16);
        java.nio.ByteBuffer byteBuffer19 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer20 = byteBuffer19.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer21 = byteBuffer19.asShortBuffer();
        int int22 = byteBuffer19.limit();
        byte[] byteArray23 = byteBuffer19.array();
        java.nio.ByteBuffer byteBuffer24 = byteBuffer13.put(byteArray23);
        int int25 = byteBuffer24.position();
        java.nio.ByteBuffer byteBuffer26 = byteBuffer24.duplicate();
        java.nio.ByteBuffer byteBuffer27 = byteBuffer24.asReadOnlyBuffer();
        java.nio.ByteBuffer byteBuffer29 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer30 = byteBuffer29.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer31 = byteBuffer29.asShortBuffer();
        java.nio.ByteBuffer byteBuffer32 = byteBuffer29.compact();
        java.nio.ByteBuffer byteBuffer33 = byteBuffer29.slice();
        int int34 = byteBuffer33.arrayOffset();
        byte[] byteArray35 = new byte[] {};
        java.nio.ByteBuffer byteBuffer36 = java.nio.ByteBuffer.wrap(byteArray35);
        java.nio.Buffer buffer37 = byteBuffer36.flip();
        java.nio.ByteBuffer byteBuffer38 = byteBuffer36.asReadOnlyBuffer();
        java.nio.ByteOrder byteOrder39 = byteBuffer38.order();
        java.nio.ByteBuffer byteBuffer40 = byteBuffer33.order(byteOrder39);
        java.nio.ByteBuffer byteBuffer41 = byteBuffer27.order(byteOrder39);
        java.nio.ByteBuffer byteBuffer42 = byteBuffer11.order(byteOrder39);
        java.nio.ByteBuffer byteBuffer44 = java.nio.ByteBuffer.allocate(0);
        boolean boolean45 = byteBuffer44.isReadOnly();
        java.nio.ShortBuffer shortBuffer46 = byteBuffer44.asShortBuffer();
        java.nio.ByteBuffer byteBuffer48 = java.nio.ByteBuffer.allocate(0);
        boolean boolean49 = byteBuffer48.isReadOnly();
        int int50 = byteBuffer44.compareTo(byteBuffer48);
        java.nio.Buffer buffer52 = byteBuffer44.limit(0);
        byte[] byteArray53 = byteBuffer44.array();
        java.nio.ByteBuffer byteBuffer54 = byteBuffer42.put(byteArray53);
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + '\000' + "'", char4 == '\000');
        org.junit.Assert.assertNotNull(byteBuffer6);
        org.junit.Assert.assertNotNull(shortBuffer7);
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(byteBuffer11);
        org.junit.Assert.assertNotNull(byteBuffer13);
        org.junit.Assert.assertNotNull(doubleBuffer14);
        org.junit.Assert.assertNotNull(shortBuffer15);
        org.junit.Assert.assertNotNull(byteBuffer17);
        org.junit.Assert.assertNotNull(byteBuffer19);
        org.junit.Assert.assertNotNull(doubleBuffer20);
        org.junit.Assert.assertNotNull(shortBuffer21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[]");
        org.junit.Assert.assertNotNull(byteBuffer24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(byteBuffer26);
        org.junit.Assert.assertNotNull(byteBuffer27);
        org.junit.Assert.assertNotNull(byteBuffer29);
        org.junit.Assert.assertNotNull(doubleBuffer30);
        org.junit.Assert.assertNotNull(shortBuffer31);
        org.junit.Assert.assertNotNull(byteBuffer32);
        org.junit.Assert.assertNotNull(byteBuffer33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray35), "[]");
        org.junit.Assert.assertNotNull(byteBuffer36);
        org.junit.Assert.assertNotNull(buffer37);
        org.junit.Assert.assertNotNull(byteBuffer38);
        org.junit.Assert.assertNotNull(byteOrder39);
        org.junit.Assert.assertNotNull(byteBuffer40);
        org.junit.Assert.assertNotNull(byteBuffer41);
        org.junit.Assert.assertNotNull(byteBuffer42);
        org.junit.Assert.assertNotNull(byteBuffer44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(shortBuffer46);
        org.junit.Assert.assertNotNull(byteBuffer48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertNotNull(buffer52);
        org.junit.Assert.assertNotNull(byteArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray53), "[]");
        org.junit.Assert.assertNotNull(byteBuffer54);
    }

    @Test
    public void test6534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6534");
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
        int int38 = byteBuffer37.arrayOffset();
        // The following exception was thrown during execution in test generation
        try {
            short short39 = byteBuffer37.getShort();
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
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
    }

    @Test
    public void test6535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6535");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.header("");
        boolean boolean5 = response1.hasCookie("");
        org.jsoup.Connection.Response response7 = response1.removeCookie("hi!");
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response1);
        response1.statusMessage = "java.nio.DirectByteBuffer[pos=13 lim=35 cap=35]";
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.util.Map<java.lang.String, java.lang.String> strMap12 = response11.cookies();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNotNull(strMap12);
    }

    @Test
    public void test6536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6536");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request3 = response2.req;
        org.jsoup.Connection.Method method4 = response2.method();
        java.lang.String str5 = response2.contentType;
        boolean boolean7 = response2.hasCookie("");
        response2.charset = "hi!";
        java.lang.String str10 = response2.statusMessage();
        int int11 = response2.statusCode();
        java.lang.String str12 = response2.statusMessage;
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response2);
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response13);
        java.nio.ByteBuffer byteBuffer15 = response13.byteData;
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response13);
        response16.executed = false;
        org.junit.Assert.assertNull(request3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(byteBuffer15);
    }

    @Test
    public void test6537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6537");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean3 = response2.executed;
        java.lang.String str5 = response2.getHeaderCaseInsensitive("");
        java.lang.String str7 = response2.cookie("java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]");
        int int8 = response2.statusCode();
        org.jsoup.Connection.Response response11 = response2.cookie("hi!", "");
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response2);
        java.net.URL uRL13 = response12.url();
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response12);
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response14);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNull(uRL13);
    }

    @Test
    public void test6538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6538");
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
        java.lang.String str13 = response2.contentType;
        org.jsoup.Connection.Request request14 = response2.req;
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response2);
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response15);
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response15);
        org.junit.Assert.assertNull(request3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(request14);
    }

    @Test
    public void test6539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6539");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer2 = byteBuffer1.asDoubleBuffer();
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.compact();
        java.lang.String str4 = byteBuffer1.toString();
        int int5 = byteBuffer1.arrayOffset();
        java.nio.LongBuffer longBuffer6 = byteBuffer1.asLongBuffer();
        // The following exception was thrown during execution in test generation
        try {
            long long8 = byteBuffer1.getLong((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(doubleBuffer2);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]" + "'", str4, "java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(longBuffer6);
    }

    @Test
    public void test6540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6540");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.header("");
        org.jsoup.Connection.Response response5 = response1.removeCookie("hi!");
        java.lang.String str7 = response1.cookie("");
        java.lang.String str8 = response1.statusMessage();
        int int9 = response1.statusCode;
        int int10 = response1.statusCode();
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Response response13 = response1.removeHeader("java.nio.HeapByteBuffer[pos=0 lim=32 cap=32]");
        response1.numRedirects = 0;
        java.util.Map<java.lang.String, java.lang.String> strMap16 = response1.cookies();
        java.net.HttpURLConnection httpURLConnection17 = null;
        org.jsoup.helper.HttpConnection.Response response18 = null;
        org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response(response18);
        org.jsoup.helper.HttpConnection.Response response20 = new org.jsoup.helper.HttpConnection.Response(response18);
        org.jsoup.helper.HttpConnection.Response response21 = new org.jsoup.helper.HttpConnection.Response(response18);
        java.nio.ByteBuffer byteBuffer22 = response21.byteData;
        org.jsoup.Connection.Response response25 = response21.cookie("hi!", "");
        boolean boolean26 = response21.executed;
        java.lang.String str27 = response21.charset();
        boolean boolean28 = response21.executed;
        response21.executed = true;
        org.jsoup.helper.HttpConnection.Response response31 = new org.jsoup.helper.HttpConnection.Response(response21);
        org.jsoup.helper.HttpConnection.Response response32 = new org.jsoup.helper.HttpConnection.Response(response31);
        boolean boolean34 = response32.hasHeader("java.nio.HeapByteBuffer[pos=0 lim=32 cap=32]");
        org.jsoup.helper.HttpConnection.Response response35 = new org.jsoup.helper.HttpConnection.Response(response32);
        // The following exception was thrown during execution in test generation
        try {
            response1.setupFromConnection(httpURLConnection17, (org.jsoup.Connection.Response) response32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertNull(byteBuffer22);
        org.junit.Assert.assertNotNull(response25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test6541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6541");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.nio.ByteBuffer byteBuffer4 = response3.byteData;
        java.net.URL uRL5 = response3.url();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response3);
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response6);
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response7);
        boolean boolean9 = response7.executed;
        org.junit.Assert.assertNull(byteBuffer4);
        org.junit.Assert.assertNull(uRL5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test6542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6542");
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
        float float24 = byteBuffer23.getFloat();
        float float25 = byteBuffer23.getFloat();
        java.nio.ByteBuffer byteBuffer27 = byteBuffer23.putInt((int) (short) 32);
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
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 0.0f + "'", float24 == 0.0f);
        org.junit.Assert.assertTrue("'" + float25 + "' != '" + 0.0f + "'", float25 == 0.0f);
        org.junit.Assert.assertNotNull(byteBuffer27);
    }

    @Test
    public void test6543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6543");
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
        java.nio.Buffer buffer16 = byteBuffer1.clear();
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
        org.junit.Assert.assertNotNull(buffer16);
    }

    @Test
    public void test6544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6544");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.header("");
        org.jsoup.Connection.Response response5 = response1.removeCookie("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap6 = response1.headers();
        java.nio.ByteBuffer byteBuffer7 = response1.byteData;
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response8);
        java.util.Map<java.lang.String, java.lang.String> strMap10 = response8.headers();
        org.jsoup.Connection.Request request11 = null;
        response8.req = request11;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNull(byteBuffer7);
        org.junit.Assert.assertNotNull(strMap10);
    }

    @Test
    public void test6545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6545");
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
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response16);
        org.jsoup.Connection.Method method18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response19 = response17.method(method18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(byteBuffer4);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(uRL8);
    }

    @Test
    public void test6546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6546");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.header("");
        org.jsoup.Connection.Response response5 = response1.removeCookie("hi!");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.util.Map<java.lang.String, java.lang.String> strMap7 = response1.cookies();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNotNull(strMap7);
    }

    @Test
    public void test6547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6547");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.header("");
        boolean boolean5 = response1.hasCookie("");
        org.jsoup.Connection.Response response7 = response1.removeCookie("hi!");
        java.lang.String str8 = response1.contentType();
        org.jsoup.Connection.Response response10 = response1.removeCookie("java.nio.HeapByteBuffer[pos=0 lim=10 cap=10]");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(response10);
    }

    @Test
    public void test6548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6548");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate((int) (byte) 10);
        int int2 = byteBuffer1.limit();
        java.nio.ByteBuffer byteBuffer4 = byteBuffer1.putFloat((float) (-1));
        java.nio.ByteBuffer byteBuffer7 = byteBuffer4.putDouble(0, (double) '#');
        java.nio.ByteBuffer byteBuffer9 = java.nio.ByteBuffer.allocateDirect((int) '#');
        java.nio.ByteBuffer byteBuffer11 = byteBuffer9.putShort((short) 0);
        java.nio.ByteBuffer byteBuffer13 = byteBuffer9.putDouble((double) '\000');
        java.nio.ByteBuffer byteBuffer15 = java.nio.ByteBuffer.allocate((int) (byte) 10);
        int int16 = byteBuffer15.getInt();
        java.nio.ByteBuffer byteBuffer19 = byteBuffer15.put((int) (byte) 0, (byte) 10);
        java.nio.IntBuffer intBuffer20 = byteBuffer15.asIntBuffer();
        byte[] byteArray24 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.nio.ByteBuffer byteBuffer25 = java.nio.ByteBuffer.wrap(byteArray24);
        java.nio.ByteBuffer byteBuffer26 = java.nio.ByteBuffer.wrap(byteArray24);
        java.nio.ByteBuffer byteBuffer27 = byteBuffer15.get(byteArray24);
        java.nio.ByteBuffer byteBuffer28 = byteBuffer13.put(byteArray24);
        java.nio.ByteBuffer byteBuffer29 = byteBuffer28.slice();
        java.nio.FloatBuffer floatBuffer30 = byteBuffer29.asFloatBuffer();
        java.nio.ByteBuffer byteBuffer32 = java.nio.ByteBuffer.allocate(0);
        boolean boolean33 = byteBuffer32.isReadOnly();
        java.nio.ShortBuffer shortBuffer34 = byteBuffer32.asShortBuffer();
        java.nio.ByteBuffer byteBuffer36 = java.nio.ByteBuffer.allocate(0);
        boolean boolean37 = byteBuffer36.isReadOnly();
        int int38 = byteBuffer32.compareTo(byteBuffer36);
        java.nio.ByteBuffer byteBuffer39 = byteBuffer36.compact();
        java.nio.ByteBuffer byteBuffer40 = byteBuffer36.slice();
        byte[] byteArray41 = byteBuffer36.array();
        java.nio.ByteBuffer byteBuffer42 = java.nio.ByteBuffer.wrap(byteArray41);
        java.nio.ByteBuffer byteBuffer43 = java.nio.ByteBuffer.wrap(byteArray41);
        java.nio.ByteBuffer byteBuffer44 = byteBuffer29.get(byteArray41);
        java.nio.ByteBuffer byteBuffer45 = byteBuffer4.put(byteArray41);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer48 = byteBuffer4.putInt((int) '4', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertNotNull(byteBuffer7);
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertNotNull(byteBuffer11);
        org.junit.Assert.assertNotNull(byteBuffer13);
        org.junit.Assert.assertNotNull(byteBuffer15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(byteBuffer19);
        org.junit.Assert.assertNotNull(intBuffer20);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(byteBuffer25);
        org.junit.Assert.assertNotNull(byteBuffer26);
        org.junit.Assert.assertNotNull(byteBuffer27);
        org.junit.Assert.assertNotNull(byteBuffer28);
        org.junit.Assert.assertNotNull(byteBuffer29);
        org.junit.Assert.assertNotNull(floatBuffer30);
        org.junit.Assert.assertNotNull(byteBuffer32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(shortBuffer34);
        org.junit.Assert.assertNotNull(byteBuffer36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(byteBuffer39);
        org.junit.Assert.assertNotNull(byteBuffer40);
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray41), "[]");
        org.junit.Assert.assertNotNull(byteBuffer42);
        org.junit.Assert.assertNotNull(byteBuffer43);
        org.junit.Assert.assertNotNull(byteBuffer44);
        org.junit.Assert.assertNotNull(byteBuffer45);
    }

    @Test
    public void test6549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6549");
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
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response14);
        java.lang.String str16 = response14.contentType();
        org.junit.Assert.assertNull(byteBuffer4);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(uRL10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test6550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6550");
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
        java.nio.ByteBuffer byteBuffer32 = byteBuffer29.putChar((int) '\000', '#');
        char char34 = byteBuffer32.getChar((int) (byte) 1);
        java.nio.ByteOrder byteOrder35 = byteBuffer32.order();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.Buffer buffer36 = byteBuffer32.reset();
            org.junit.Assert.fail("Expected exception of type java.nio.InvalidMarkException; message: null");
        } catch (java.nio.InvalidMarkException e) {
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
        org.junit.Assert.assertNotNull(byteBuffer32);
        org.junit.Assert.assertTrue("'" + char34 + "' != '" + '\u2300' + "'", char34 == '\u2300');
        org.junit.Assert.assertNotNull(byteOrder35);
    }

    @Test
    public void test6551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6551");
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
        int int13 = response5.statusCode();
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response5);
        org.jsoup.Connection.Response response17 = response14.header("java.nio.HeapByteBuffer[pos=0 lim=32 cap=32]", "java.nio.HeapByteBuffer[pos=1 lim=3 cap=3]");
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(strEntry10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(response17);
    }

    @Test
    public void test6552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6552");
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
        response13.statusMessage = "java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]";
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response17 = org.jsoup.helper.HttpConnection.Response.execute(request0, response13);
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
    }

    @Test
    public void test6553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6553");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.executed = false;
        java.lang.String str4 = response1.contentType;
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response1);
        response1.statusMessage = "";
        org.jsoup.Connection.Request request8 = null;
        response1.req = request8;
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.net.URL uRL11 = response1.url();
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(uRL11);
    }

    @Test
    public void test6554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6554");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate((int) (byte) 10);
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.nio.ByteBuffer byteBuffer6 = java.nio.ByteBuffer.wrap(byteArray5);
        java.nio.ByteBuffer byteBuffer7 = byteBuffer1.get(byteArray5);
        java.nio.LongBuffer longBuffer8 = byteBuffer1.asLongBuffer();
        java.nio.ByteBuffer byteBuffer9 = byteBuffer1.slice();
        java.nio.LongBuffer longBuffer10 = byteBuffer9.asLongBuffer();
        java.nio.ByteBuffer byteBuffer12 = java.nio.ByteBuffer.allocateDirect((int) '#');
        java.nio.ByteBuffer byteBuffer14 = byteBuffer12.putShort((short) 0);
        java.nio.ByteOrder byteOrder15 = byteBuffer14.order();
        java.nio.ByteBuffer byteBuffer18 = byteBuffer14.put(0, (byte) 0);
        double double20 = byteBuffer18.getDouble(9);
        boolean boolean21 = byteBuffer9.equals((java.lang.Object) 9);
        java.nio.Buffer buffer22 = byteBuffer9.rewind();
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(byteBuffer6);
        org.junit.Assert.assertNotNull(byteBuffer7);
        org.junit.Assert.assertNotNull(longBuffer8);
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertNotNull(longBuffer10);
        org.junit.Assert.assertNotNull(byteBuffer12);
        org.junit.Assert.assertNotNull(byteBuffer14);
        org.junit.Assert.assertNotNull(byteOrder15);
        org.junit.Assert.assertNotNull(byteBuffer18);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(buffer22);
    }

    @Test
    public void test6555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6555");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate((int) ' ');
        int int3 = byteBuffer1.getInt((int) (short) 0);
        long long4 = byteBuffer1.getLong();
        java.nio.ByteBuffer byteBuffer7 = byteBuffer1.put(0, (byte) 0);
        java.nio.ByteBuffer byteBuffer9 = byteBuffer7.putFloat(0.0f);
        java.nio.ByteBuffer byteBuffer11 = java.nio.ByteBuffer.allocate(0);
        boolean boolean12 = byteBuffer11.isReadOnly();
        java.nio.ShortBuffer shortBuffer13 = byteBuffer11.asShortBuffer();
        java.nio.ByteBuffer byteBuffer14 = byteBuffer11.duplicate();
        java.nio.ByteBuffer byteBuffer15 = byteBuffer11.slice();
        java.nio.Buffer buffer16 = byteBuffer11.mark();
        org.jsoup.helper.HttpConnection.Response response17 = null;
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response(response17);
        org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response(response17);
        org.jsoup.helper.HttpConnection.Response response20 = new org.jsoup.helper.HttpConnection.Response(response17);
        org.jsoup.helper.HttpConnection.Response response21 = new org.jsoup.helper.HttpConnection.Response(response17);
        org.jsoup.helper.HttpConnection.Response response22 = new org.jsoup.helper.HttpConnection.Response(response17);
        java.nio.ByteBuffer byteBuffer24 = java.nio.ByteBuffer.allocate(0);
        boolean boolean25 = byteBuffer24.hasRemaining();
        java.nio.ByteBuffer byteBuffer26 = byteBuffer24.asReadOnlyBuffer();
        boolean boolean27 = byteBuffer26.hasRemaining();
        response22.byteData = byteBuffer26;
        java.nio.Buffer buffer29 = byteBuffer26.mark();
        java.nio.ByteOrder byteOrder30 = byteBuffer26.order();
        java.nio.ByteBuffer byteBuffer31 = byteBuffer11.order(byteOrder30);
        java.nio.ByteBuffer byteBuffer33 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer34 = byteBuffer33.asDoubleBuffer();
        boolean boolean35 = byteBuffer33.isDirect();
        java.nio.ByteBuffer byteBuffer37 = java.nio.ByteBuffer.allocate(0);
        boolean boolean38 = byteBuffer37.isReadOnly();
        java.nio.ShortBuffer shortBuffer39 = byteBuffer37.asShortBuffer();
        java.nio.ByteBuffer byteBuffer41 = java.nio.ByteBuffer.allocate(0);
        boolean boolean42 = byteBuffer41.isReadOnly();
        int int43 = byteBuffer37.compareTo(byteBuffer41);
        java.nio.Buffer buffer44 = byteBuffer41.clear();
        java.nio.ByteBuffer byteBuffer46 = java.nio.ByteBuffer.allocate(0);
        boolean boolean47 = byteBuffer46.hasRemaining();
        java.nio.ByteBuffer byteBuffer48 = byteBuffer41.put(byteBuffer46);
        java.nio.ByteBuffer byteBuffer49 = byteBuffer41.slice();
        java.nio.ByteBuffer byteBuffer50 = byteBuffer33.put(byteBuffer49);
        byte[] byteArray51 = byteBuffer49.array();
        java.nio.ByteBuffer byteBuffer52 = byteBuffer31.put(byteArray51);
        java.nio.ByteBuffer byteBuffer53 = byteBuffer9.put(byteArray51);
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(byteBuffer7);
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertNotNull(byteBuffer11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(shortBuffer13);
        org.junit.Assert.assertNotNull(byteBuffer14);
        org.junit.Assert.assertNotNull(byteBuffer15);
        org.junit.Assert.assertNotNull(buffer16);
        org.junit.Assert.assertNotNull(byteBuffer24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(byteBuffer26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(buffer29);
        org.junit.Assert.assertNotNull(byteOrder30);
        org.junit.Assert.assertNotNull(byteBuffer31);
        org.junit.Assert.assertNotNull(byteBuffer33);
        org.junit.Assert.assertNotNull(doubleBuffer34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(byteBuffer37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(shortBuffer39);
        org.junit.Assert.assertNotNull(byteBuffer41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(buffer44);
        org.junit.Assert.assertNotNull(byteBuffer46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(byteBuffer48);
        org.junit.Assert.assertNotNull(byteBuffer49);
        org.junit.Assert.assertNotNull(byteBuffer50);
        org.junit.Assert.assertNotNull(byteArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray51), "[]");
        org.junit.Assert.assertNotNull(byteBuffer52);
        org.junit.Assert.assertNotNull(byteBuffer53);
    }

    @Test
    public void test6556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6556");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request3 = response2.req;
        org.jsoup.Connection.Method method4 = response2.method();
        java.lang.String str5 = response2.contentType;
        org.jsoup.Connection.Response response7 = response2.removeHeader("java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]");
        boolean boolean9 = response2.hasHeader("java.nio.HeapByteBuffer[pos=16 lim=100 cap=100]");
        response2.numRedirects = 10;
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response2);
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response12);
        response12.statusMessage = "java.nio.HeapByteBufferR[pos=4 lim=10 cap=10]";
        org.junit.Assert.assertNull(request3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test6557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6557");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect((int) '#');
        float float3 = byteBuffer1.getFloat(1);
        java.nio.ByteBuffer byteBuffer5 = byteBuffer1.putLong((long) 10);
        java.nio.ByteBuffer byteBuffer6 = byteBuffer5.duplicate();
        java.nio.ByteBuffer byteBuffer8 = java.nio.ByteBuffer.allocate(0);
        boolean boolean9 = byteBuffer8.isReadOnly();
        java.nio.ShortBuffer shortBuffer10 = byteBuffer8.asShortBuffer();
        int int11 = byteBuffer8.position();
        java.nio.ByteOrder byteOrder12 = null;
        java.nio.ByteBuffer byteBuffer13 = byteBuffer8.order(byteOrder12);
        java.lang.String str14 = byteBuffer13.toString();
        java.nio.ByteBuffer byteBuffer15 = byteBuffer13.slice();
        java.nio.ShortBuffer shortBuffer16 = byteBuffer13.asShortBuffer();
        java.nio.ByteBuffer byteBuffer18 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer19 = byteBuffer18.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer20 = byteBuffer18.asShortBuffer();
        java.nio.ByteOrder byteOrder21 = null;
        java.nio.ByteBuffer byteBuffer22 = byteBuffer18.order(byteOrder21);
        java.nio.ByteBuffer byteBuffer24 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer25 = byteBuffer24.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer26 = byteBuffer24.asShortBuffer();
        int int27 = byteBuffer24.limit();
        byte[] byteArray28 = byteBuffer24.array();
        java.nio.ByteBuffer byteBuffer29 = byteBuffer18.put(byteArray28);
        java.nio.ByteBuffer byteBuffer30 = byteBuffer13.get(byteArray28);
        java.nio.ByteBuffer byteBuffer31 = byteBuffer6.get(byteArray28);
        java.nio.ByteBuffer byteBuffer33 = byteBuffer31.putLong((long) (short) 10);
        java.nio.ShortBuffer shortBuffer34 = byteBuffer33.asShortBuffer();
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertNotNull(byteBuffer6);
        org.junit.Assert.assertNotNull(byteBuffer8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(shortBuffer10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(byteBuffer13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]" + "'", str14, "java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]");
        org.junit.Assert.assertNotNull(byteBuffer15);
        org.junit.Assert.assertNotNull(shortBuffer16);
        org.junit.Assert.assertNotNull(byteBuffer18);
        org.junit.Assert.assertNotNull(doubleBuffer19);
        org.junit.Assert.assertNotNull(shortBuffer20);
        org.junit.Assert.assertNotNull(byteBuffer22);
        org.junit.Assert.assertNotNull(byteBuffer24);
        org.junit.Assert.assertNotNull(doubleBuffer25);
        org.junit.Assert.assertNotNull(shortBuffer26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray28), "[]");
        org.junit.Assert.assertNotNull(byteBuffer29);
        org.junit.Assert.assertNotNull(byteBuffer30);
        org.junit.Assert.assertNotNull(byteBuffer31);
        org.junit.Assert.assertNotNull(byteBuffer33);
        org.junit.Assert.assertNotNull(shortBuffer34);
    }

    @Test
    public void test6558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6558");
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
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response3);
        java.net.URL uRL15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response16 = response3.url(uRL15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(request8);
        org.junit.Assert.assertNotNull(response13);
    }

    @Test
    public void test6559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6559");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean3 = response2.executed;
        response2.statusCode = 0;
        java.lang.String str6 = response2.contentType();
        java.lang.String str8 = response2.cookie("");
        org.jsoup.Connection.Method method9 = response2.method();
        response2.executed = false;
        java.util.Map<java.lang.String, java.lang.String> strMap12 = response2.cookies();
        java.nio.ByteBuffer byteBuffer13 = response2.byteData;
        java.net.URL uRL14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response15 = response2.url(uRL14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertNull(byteBuffer13);
    }

    @Test
    public void test6560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6560");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.nio.ByteBuffer byteBuffer4 = response3.byteData;
        org.jsoup.Connection.Response response7 = response3.cookie("hi!", "");
        java.net.URL uRL8 = response3.url();
        response3.statusMessage = "java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]";
        response3.numRedirects = (byte) 10;
        java.lang.String str13 = response3.contentType;
        java.nio.ByteBuffer byteBuffer15 = java.nio.ByteBuffer.allocate((int) (byte) 10);
        byte[] byteArray19 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.nio.ByteBuffer byteBuffer20 = java.nio.ByteBuffer.wrap(byteArray19);
        java.nio.ByteBuffer byteBuffer21 = byteBuffer15.get(byteArray19);
        java.nio.ByteBuffer byteBuffer22 = byteBuffer15.slice();
        java.nio.ByteBuffer byteBuffer24 = java.nio.ByteBuffer.allocate(0);
        boolean boolean25 = byteBuffer24.isReadOnly();
        java.nio.ShortBuffer shortBuffer26 = byteBuffer24.asShortBuffer();
        java.nio.ByteBuffer byteBuffer28 = java.nio.ByteBuffer.allocate(0);
        boolean boolean29 = byteBuffer28.isReadOnly();
        int int30 = byteBuffer24.compareTo(byteBuffer28);
        java.nio.DoubleBuffer doubleBuffer31 = byteBuffer28.asDoubleBuffer();
        java.nio.FloatBuffer floatBuffer32 = byteBuffer28.asFloatBuffer();
        java.lang.String str33 = byteBuffer28.toString();
        java.nio.ByteBuffer byteBuffer34 = byteBuffer15.put(byteBuffer28);
        java.nio.ByteBuffer byteBuffer36 = byteBuffer15.put((byte) 100);
        java.nio.ByteBuffer byteBuffer38 = byteBuffer36.put((byte) 64);
        response3.byteData = byteBuffer38;
        org.junit.Assert.assertNull(byteBuffer4);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(uRL8);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(byteBuffer15);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(byteBuffer20);
        org.junit.Assert.assertNotNull(byteBuffer21);
        org.junit.Assert.assertNotNull(byteBuffer22);
        org.junit.Assert.assertNotNull(byteBuffer24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(shortBuffer26);
        org.junit.Assert.assertNotNull(byteBuffer28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(doubleBuffer31);
        org.junit.Assert.assertNotNull(floatBuffer32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]" + "'", str33, "java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]");
        org.junit.Assert.assertNotNull(byteBuffer34);
        org.junit.Assert.assertNotNull(byteBuffer36);
        org.junit.Assert.assertNotNull(byteBuffer38);
    }

    @Test
    public void test6561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6561");
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
        // The following exception was thrown during execution in test generation
        try {
            int int21 = byteBuffer14.getInt();
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
    }

    @Test
    public void test6562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6562");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.nio.ByteBuffer byteBuffer4 = response3.byteData;
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response3);
        java.nio.ByteBuffer byteBuffer7 = java.nio.ByteBuffer.allocate(0);
        response3.byteData = byteBuffer7;
        org.jsoup.Connection.Request request9 = null;
        response3.req = request9;
        int int11 = response3.statusCode();
        java.net.URL uRL12 = response3.url();
        response3.statusMessage = "java.nio.DirectByteBuffer[pos=0 lim=31 cap=35]";
        org.junit.Assert.assertNull(byteBuffer4);
        org.junit.Assert.assertNotNull(byteBuffer7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(uRL12);
    }

    @Test
    public void test6563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6563");
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
        java.lang.String str26 = response25.statusMessage;
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
        org.junit.Assert.assertNull(str26);
    }

    @Test
    public void test6564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6564");
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
        org.jsoup.helper.HttpConnection.Response response12 = null;
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response12);
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response12);
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response12);
        java.nio.ByteBuffer byteBuffer16 = response15.byteData;
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response15);
        response15.contentType = "hi!";
        boolean boolean21 = response15.hasCookie("");
        response15.contentType = "java.nio.HeapByteBufferR[pos=0 lim=0 cap=0]";
        org.jsoup.Connection.Response response25 = response15.removeCookie("java.nio.DirectByteBuffer[pos=8 lim=35 cap=35]");
        java.nio.ByteBuffer byteBuffer27 = java.nio.ByteBuffer.allocate((int) ' ');
        int int29 = byteBuffer27.getInt((int) (short) 0);
        float float31 = byteBuffer27.getFloat((int) (short) 10);
        java.lang.String str32 = byteBuffer27.toString();
        boolean boolean33 = byteBuffer27.hasArray();
        java.nio.ByteBuffer byteBuffer35 = java.nio.ByteBuffer.allocate((int) (byte) 10);
        int int36 = byteBuffer35.limit();
        java.nio.ByteBuffer byteBuffer38 = byteBuffer35.putChar(' ');
        java.nio.ByteBuffer byteBuffer40 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer41 = byteBuffer40.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer42 = byteBuffer40.asShortBuffer();
        java.nio.ByteOrder byteOrder43 = null;
        java.nio.ByteBuffer byteBuffer44 = byteBuffer40.order(byteOrder43);
        java.nio.ByteBuffer byteBuffer46 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer47 = byteBuffer46.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer48 = byteBuffer46.asShortBuffer();
        int int49 = byteBuffer46.limit();
        byte[] byteArray50 = byteBuffer46.array();
        java.nio.ByteBuffer byteBuffer51 = byteBuffer40.put(byteArray50);
        java.nio.ByteBuffer byteBuffer52 = byteBuffer35.put(byteArray50);
        java.nio.ByteBuffer byteBuffer53 = byteBuffer27.get(byteArray50);
        java.nio.ByteOrder byteOrder54 = null;
        java.nio.ByteBuffer byteBuffer55 = byteBuffer53.order(byteOrder54);
        java.nio.ByteBuffer byteBuffer57 = java.nio.ByteBuffer.allocateDirect((int) '#');
        java.nio.ByteBuffer byteBuffer59 = byteBuffer57.putShort((short) 0);
        java.nio.ByteBuffer byteBuffer62 = byteBuffer59.putShort(0, (short) (byte) 10);
        short short64 = byteBuffer59.getShort((int) (byte) 10);
        java.nio.ByteBuffer byteBuffer66 = java.nio.ByteBuffer.allocate(0);
        boolean boolean67 = byteBuffer66.isReadOnly();
        java.nio.ShortBuffer shortBuffer68 = byteBuffer66.asShortBuffer();
        java.nio.ByteBuffer byteBuffer70 = java.nio.ByteBuffer.allocate(0);
        boolean boolean71 = byteBuffer70.isReadOnly();
        int int72 = byteBuffer66.compareTo(byteBuffer70);
        java.nio.Buffer buffer73 = byteBuffer70.clear();
        java.nio.ByteBuffer byteBuffer75 = java.nio.ByteBuffer.allocate(0);
        boolean boolean76 = byteBuffer75.hasRemaining();
        java.nio.ByteBuffer byteBuffer77 = byteBuffer70.put(byteBuffer75);
        java.nio.ByteBuffer byteBuffer79 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer80 = byteBuffer79.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer81 = byteBuffer79.asShortBuffer();
        byte[] byteArray82 = byteBuffer79.array();
        java.nio.ByteBuffer byteBuffer83 = java.nio.ByteBuffer.wrap(byteArray82);
        java.nio.ByteBuffer byteBuffer84 = byteBuffer77.put(byteArray82);
        java.nio.ByteBuffer byteBuffer85 = byteBuffer59.get(byteArray82);
        float float86 = byteBuffer85.getFloat();
        java.nio.ByteBuffer byteBuffer87 = byteBuffer55.put(byteBuffer85);
        response15.byteData = byteBuffer55;
        char char89 = byteBuffer55.getChar();
        response4.byteData = byteBuffer55;
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertNull(byteBuffer16);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(response25);
        org.junit.Assert.assertNotNull(byteBuffer27);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + float31 + "' != '" + 0.0f + "'", float31 == 0.0f);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "java.nio.HeapByteBuffer[pos=0 lim=32 cap=32]" + "'", str32, "java.nio.HeapByteBuffer[pos=0 lim=32 cap=32]");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(byteBuffer35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 10 + "'", int36 == 10);
        org.junit.Assert.assertNotNull(byteBuffer38);
        org.junit.Assert.assertNotNull(byteBuffer40);
        org.junit.Assert.assertNotNull(doubleBuffer41);
        org.junit.Assert.assertNotNull(shortBuffer42);
        org.junit.Assert.assertNotNull(byteBuffer44);
        org.junit.Assert.assertNotNull(byteBuffer46);
        org.junit.Assert.assertNotNull(doubleBuffer47);
        org.junit.Assert.assertNotNull(shortBuffer48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray50), "[]");
        org.junit.Assert.assertNotNull(byteBuffer51);
        org.junit.Assert.assertNotNull(byteBuffer52);
        org.junit.Assert.assertNotNull(byteBuffer53);
        org.junit.Assert.assertNotNull(byteBuffer55);
        org.junit.Assert.assertNotNull(byteBuffer57);
        org.junit.Assert.assertNotNull(byteBuffer59);
        org.junit.Assert.assertNotNull(byteBuffer62);
        org.junit.Assert.assertTrue("'" + short64 + "' != '" + (short) 0 + "'", short64 == (short) 0);
        org.junit.Assert.assertNotNull(byteBuffer66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(shortBuffer68);
        org.junit.Assert.assertNotNull(byteBuffer70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
        org.junit.Assert.assertNotNull(buffer73);
        org.junit.Assert.assertNotNull(byteBuffer75);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(byteBuffer77);
        org.junit.Assert.assertNotNull(byteBuffer79);
        org.junit.Assert.assertNotNull(doubleBuffer80);
        org.junit.Assert.assertNotNull(shortBuffer81);
        org.junit.Assert.assertNotNull(byteArray82);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray82), "[]");
        org.junit.Assert.assertNotNull(byteBuffer83);
        org.junit.Assert.assertNotNull(byteBuffer84);
        org.junit.Assert.assertNotNull(byteBuffer85);
        org.junit.Assert.assertTrue("'" + float86 + "' != '" + 0.0f + "'", float86 == 0.0f);
        org.junit.Assert.assertNotNull(byteBuffer87);
        org.junit.Assert.assertTrue("'" + char89 + "' != '" + '\000' + "'", char89 == '\000');
    }

    @Test
    public void test6565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6565");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect((int) '#');
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.putShort((short) 0);
        java.nio.ByteOrder byteOrder4 = byteBuffer3.order();
        java.nio.ByteBuffer byteBuffer7 = byteBuffer3.put(0, (byte) 0);
        double double9 = byteBuffer7.getDouble(9);
        double double10 = byteBuffer7.getDouble();
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertNotNull(byteOrder4);
        org.junit.Assert.assertNotNull(byteBuffer7);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test6566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6566");
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
        java.lang.String str28 = byteBuffer16.toString();
        java.nio.ByteBuffer byteBuffer30 = byteBuffer16.putDouble((double) (short) 10);
        java.nio.ByteBuffer byteBuffer32 = byteBuffer30.putDouble((double) (-78));
        java.nio.ByteBuffer byteBuffer34 = byteBuffer32.putInt((-27));
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
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "java.nio.HeapByteBuffer[pos=0 lim=100 cap=100]" + "'", str28, "java.nio.HeapByteBuffer[pos=0 lim=100 cap=100]");
        org.junit.Assert.assertNotNull(byteBuffer30);
        org.junit.Assert.assertNotNull(byteBuffer32);
        org.junit.Assert.assertNotNull(byteBuffer34);
    }

    @Test
    public void test6567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6567");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request3 = response2.req;
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response2);
        java.lang.String str5 = response4.contentType;
        boolean boolean7 = response4.hasHeader("hi!");
        org.jsoup.Connection.Method method8 = response4.method();
        org.jsoup.Connection.Request request9 = response4.req;
        org.junit.Assert.assertNull(request3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertNull(request9);
    }

    @Test
    public void test6568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6568");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate((int) ' ');
        int int3 = byteBuffer1.getInt((int) (short) 0);
        java.nio.ByteBuffer byteBuffer6 = byteBuffer1.putShort((int) (byte) 10, (short) 10);
        java.nio.ByteBuffer byteBuffer9 = byteBuffer6.putLong(3, (long) 0);
        boolean boolean10 = byteBuffer6.hasRemaining();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer13 = byteBuffer6.put(71, (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: 71");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(byteBuffer6);
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test6569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6569");
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
        java.lang.String str16 = response2.statusMessage();
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response2);
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response(response17);
        org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response(response17);
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
    public void test6570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6570");
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
        java.lang.String str21 = response1.cookie("java.nio.HeapByteBuffer[pos=0 lim=2 cap=2]");
        org.jsoup.helper.HttpConnection.Response response22 = new org.jsoup.helper.HttpConnection.Response(response1);
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
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test6571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6571");
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
        java.nio.DoubleBuffer doubleBuffer24 = byteBuffer23.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer25 = byteBuffer23.asShortBuffer();
        java.nio.ByteBuffer byteBuffer26 = byteBuffer23.compact();
        java.nio.ByteBuffer byteBuffer27 = byteBuffer23.slice();
        java.nio.ByteOrder byteOrder28 = byteBuffer23.order();
        java.nio.ByteBuffer byteBuffer29 = byteBuffer21.order(byteOrder28);
        int int30 = byteBuffer21.capacity();
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
        org.junit.Assert.assertNotNull(doubleBuffer24);
        org.junit.Assert.assertNotNull(shortBuffer25);
        org.junit.Assert.assertNotNull(byteBuffer26);
        org.junit.Assert.assertNotNull(byteBuffer27);
        org.junit.Assert.assertNotNull(byteOrder28);
        org.junit.Assert.assertNotNull(byteBuffer29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test6572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6572");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.isReadOnly();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        java.nio.ByteBuffer byteBuffer5 = java.nio.ByteBuffer.allocate(0);
        boolean boolean6 = byteBuffer5.isReadOnly();
        int int7 = byteBuffer1.compareTo(byteBuffer5);
        java.nio.Buffer buffer8 = byteBuffer5.clear();
        boolean boolean9 = byteBuffer5.hasArray();
        int int10 = byteBuffer5.capacity();
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(shortBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(buffer8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test6573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6573");
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
        java.nio.ByteBuffer byteBuffer16 = byteBuffer15.duplicate();
        java.nio.ByteBuffer byteBuffer18 = java.nio.ByteBuffer.allocate(0);
        java.nio.ByteBuffer byteBuffer19 = byteBuffer18.slice();
        java.nio.ByteBuffer byteBuffer21 = java.nio.ByteBuffer.allocate((int) ' ');
        java.nio.Buffer buffer22 = byteBuffer21.rewind();
        java.nio.ByteBuffer byteBuffer23 = byteBuffer21.compact();
        java.nio.ByteOrder byteOrder24 = byteBuffer21.order();
        java.nio.ByteBuffer byteBuffer25 = byteBuffer19.order(byteOrder24);
        java.nio.ByteBuffer byteBuffer26 = byteBuffer15.order(byteOrder24);
        char char27 = byteBuffer26.getChar();
        java.nio.ByteBuffer byteBuffer29 = byteBuffer26.putFloat((float) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer32 = byteBuffer29.putLong(1677787392, (long) (-8));
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
        org.junit.Assert.assertNotNull(byteBuffer18);
        org.junit.Assert.assertNotNull(byteBuffer19);
        org.junit.Assert.assertNotNull(byteBuffer21);
        org.junit.Assert.assertNotNull(buffer22);
        org.junit.Assert.assertNotNull(byteBuffer23);
        org.junit.Assert.assertNotNull(byteOrder24);
        org.junit.Assert.assertNotNull(byteBuffer25);
        org.junit.Assert.assertNotNull(byteBuffer26);
        org.junit.Assert.assertTrue("'" + char27 + "' != '" + '\u3f80' + "'", char27 == '\u3f80');
        org.junit.Assert.assertNotNull(byteBuffer29);
    }

    @Test
    public void test6574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6574");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.nio.ByteBuffer byteBuffer4 = response3.byteData;
        org.jsoup.Connection.Response response7 = response3.cookie("hi!", "");
        java.net.URL uRL8 = response3.url();
        boolean boolean10 = response3.hasHeader("java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]");
        java.lang.String str11 = response3.contentType;
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response3);
        org.jsoup.Connection.Request request13 = response12.req;
        org.junit.Assert.assertNull(byteBuffer4);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(uRL8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(request13);
    }

    @Test
    public void test6575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6575");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str4 = response3.statusMessage();
        response3.contentType = "";
        java.lang.String str7 = response3.statusMessage;
        java.lang.String str8 = response3.statusMessage();
        org.jsoup.Connection.Method method9 = response3.method();
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(method9);
    }

    @Test
    public void test6576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6576");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response1);
        boolean boolean4 = response3.executed;
        response3.statusCode = 0;
        java.lang.String str7 = response3.contentType();
        java.lang.String str8 = response3.statusMessage();
        org.jsoup.Connection.Method method9 = response3.method();
        org.jsoup.Connection.Response response11 = response3.removeCookie("java.nio.HeapByteBuffer[pos=16 lim=100 cap=100]");
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response3);
        org.jsoup.Connection.Response response15 = response3.header("java.nio.HeapByteBuffer[pos=2 lim=10 cap=10]", "java.nio.HeapByteBuffer[pos=0 lim=100 cap=100]");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response16 = org.jsoup.helper.HttpConnection.Response.execute(request0, response3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNotNull(response15);
    }

    @Test
    public void test6577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6577");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.net.URL uRL3 = response2.url();
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response2);
        org.jsoup.Connection.Response response6 = response2.removeCookie("java.nio.DirectByteBuffer[pos=2 lim=35 cap=35]");
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response2);
        org.junit.Assert.assertNull(uRL3);
        org.junit.Assert.assertNotNull(response6);
    }

    @Test
    public void test6578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6578");
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
        java.nio.IntBuffer intBuffer14 = byteBuffer3.asIntBuffer();
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
        org.junit.Assert.assertNotNull(intBuffer14);
    }

    @Test
    public void test6579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6579");
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
        org.jsoup.Connection.Method method14 = response13.method();
        java.lang.String str15 = response13.statusMessage;
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response13);
        org.jsoup.Connection.Response response19 = response16.cookie("java.nio.HeapByteBuffer[pos=0 lim=3 cap=3]", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertNull(method14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(response19);
    }

    @Test
    public void test6580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6580");
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
        java.nio.Buffer buffer25 = byteBuffer24.rewind();
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
        org.junit.Assert.assertNotNull(buffer25);
    }

    @Test
    public void test6581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6581");
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
        int int14 = response1.statusCode;
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Request request16 = null;
        response1.req = request16;
        org.jsoup.Connection.Method method18 = response1.method();
        java.lang.String str19 = response1.charset;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(method18);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test6582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6582");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response11 = org.jsoup.helper.HttpConnection.Response.execute(request0, response4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(request9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test6583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6583");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate((int) (byte) 10);
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.nio.ByteBuffer byteBuffer6 = java.nio.ByteBuffer.wrap(byteArray5);
        java.nio.ByteBuffer byteBuffer7 = byteBuffer1.get(byteArray5);
        java.nio.Buffer buffer8 = byteBuffer1.rewind();
        java.nio.ByteOrder byteOrder9 = byteBuffer1.order();
        boolean boolean10 = byteBuffer1.hasRemaining();
        byte[] byteArray13 = new byte[] { (byte) 10, (byte) 1 };
        java.nio.ByteBuffer byteBuffer14 = byteBuffer1.put(byteArray13);
        java.nio.ByteBuffer byteBuffer16 = byteBuffer14.putInt((int) (byte) 0);
        java.nio.ByteBuffer byteBuffer18 = byteBuffer16.put((byte) 0);
        java.nio.IntBuffer intBuffer19 = byteBuffer18.asIntBuffer();
        java.nio.ByteBuffer byteBuffer21 = byteBuffer18.putShort((short) 13312);
        java.nio.ByteBuffer byteBuffer23 = java.nio.ByteBuffer.allocate(35);
        java.nio.ByteBuffer byteBuffer26 = byteBuffer23.putChar(1, '\000');
        java.nio.ByteBuffer byteBuffer28 = java.nio.ByteBuffer.allocateDirect((int) '#');
        java.nio.ByteBuffer byteBuffer30 = byteBuffer28.putShort((short) 0);
        java.nio.ByteBuffer byteBuffer33 = byteBuffer30.putShort(0, (short) (byte) 10);
        java.nio.Buffer buffer34 = byteBuffer33.clear();
        java.nio.ByteOrder byteOrder35 = byteBuffer33.order();
        java.nio.ByteBuffer byteBuffer38 = byteBuffer33.putChar(1, 'a');
        java.nio.Buffer buffer39 = byteBuffer38.rewind();
        java.nio.ByteBuffer byteBuffer41 = java.nio.ByteBuffer.allocateDirect((int) '#');
        float float43 = byteBuffer41.getFloat(1);
        java.nio.ByteBuffer byteBuffer45 = byteBuffer41.putLong((long) 10);
        java.nio.ByteBuffer byteBuffer46 = byteBuffer45.duplicate();
        java.nio.ByteBuffer byteBuffer48 = java.nio.ByteBuffer.allocate(0);
        boolean boolean49 = byteBuffer48.isReadOnly();
        java.nio.ShortBuffer shortBuffer50 = byteBuffer48.asShortBuffer();
        int int51 = byteBuffer48.position();
        java.nio.ByteOrder byteOrder52 = null;
        java.nio.ByteBuffer byteBuffer53 = byteBuffer48.order(byteOrder52);
        java.lang.String str54 = byteBuffer53.toString();
        java.nio.ByteBuffer byteBuffer55 = byteBuffer53.slice();
        java.nio.ShortBuffer shortBuffer56 = byteBuffer53.asShortBuffer();
        java.nio.ByteBuffer byteBuffer58 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer59 = byteBuffer58.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer60 = byteBuffer58.asShortBuffer();
        java.nio.ByteOrder byteOrder61 = null;
        java.nio.ByteBuffer byteBuffer62 = byteBuffer58.order(byteOrder61);
        java.nio.ByteBuffer byteBuffer64 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer65 = byteBuffer64.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer66 = byteBuffer64.asShortBuffer();
        int int67 = byteBuffer64.limit();
        byte[] byteArray68 = byteBuffer64.array();
        java.nio.ByteBuffer byteBuffer69 = byteBuffer58.put(byteArray68);
        java.nio.ByteBuffer byteBuffer70 = byteBuffer53.get(byteArray68);
        java.nio.ByteBuffer byteBuffer71 = byteBuffer46.get(byteArray68);
        java.nio.ByteBuffer byteBuffer72 = java.nio.ByteBuffer.wrap(byteArray68);
        boolean boolean73 = byteBuffer38.equals((java.lang.Object) byteBuffer72);
        java.nio.ByteBuffer byteBuffer74 = byteBuffer26.put(byteBuffer72);
        int int75 = byteBuffer18.compareTo(byteBuffer72);
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
        org.junit.Assert.assertNotNull(byteBuffer16);
        org.junit.Assert.assertNotNull(byteBuffer18);
        org.junit.Assert.assertNotNull(intBuffer19);
        org.junit.Assert.assertNotNull(byteBuffer21);
        org.junit.Assert.assertNotNull(byteBuffer23);
        org.junit.Assert.assertNotNull(byteBuffer26);
        org.junit.Assert.assertNotNull(byteBuffer28);
        org.junit.Assert.assertNotNull(byteBuffer30);
        org.junit.Assert.assertNotNull(byteBuffer33);
        org.junit.Assert.assertNotNull(buffer34);
        org.junit.Assert.assertNotNull(byteOrder35);
        org.junit.Assert.assertNotNull(byteBuffer38);
        org.junit.Assert.assertNotNull(buffer39);
        org.junit.Assert.assertNotNull(byteBuffer41);
        org.junit.Assert.assertTrue("'" + float43 + "' != '" + 0.0f + "'", float43 == 0.0f);
        org.junit.Assert.assertNotNull(byteBuffer45);
        org.junit.Assert.assertNotNull(byteBuffer46);
        org.junit.Assert.assertNotNull(byteBuffer48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(shortBuffer50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNotNull(byteBuffer53);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]" + "'", str54, "java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]");
        org.junit.Assert.assertNotNull(byteBuffer55);
        org.junit.Assert.assertNotNull(shortBuffer56);
        org.junit.Assert.assertNotNull(byteBuffer58);
        org.junit.Assert.assertNotNull(doubleBuffer59);
        org.junit.Assert.assertNotNull(shortBuffer60);
        org.junit.Assert.assertNotNull(byteBuffer62);
        org.junit.Assert.assertNotNull(byteBuffer64);
        org.junit.Assert.assertNotNull(doubleBuffer65);
        org.junit.Assert.assertNotNull(shortBuffer66);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertNotNull(byteArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray68), "[]");
        org.junit.Assert.assertNotNull(byteBuffer69);
        org.junit.Assert.assertNotNull(byteBuffer70);
        org.junit.Assert.assertNotNull(byteBuffer71);
        org.junit.Assert.assertNotNull(byteBuffer72);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(byteBuffer74);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 1 + "'", int75 == 1);
    }

    @Test
    public void test6584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6584");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.nio.ByteBuffer byteBuffer4 = response3.byteData;
        java.lang.String str5 = response3.charset;
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response3);
        org.jsoup.Connection.Request request7 = response3.req;
        java.util.Map<java.lang.String, java.lang.String> strMap8 = response3.cookies();
        org.junit.Assert.assertNull(byteBuffer4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(request7);
        org.junit.Assert.assertNotNull(strMap8);
    }

    @Test
    public void test6585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6585");
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
        java.nio.ByteBuffer byteBuffer53 = byteBuffer50.putLong(1, (long) 10);
        int int54 = byteBuffer10.compareTo(byteBuffer53);
        float float55 = byteBuffer10.getFloat();
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
        org.junit.Assert.assertNotNull(byteBuffer53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 64 + "'", int54 == 64);
        org.junit.Assert.assertTrue("'" + float55 + "' != '" + 3.15625f + "'", float55 == 3.15625f);
    }

    @Test
    public void test6586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6586");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate((int) ' ');
        java.nio.Buffer buffer2 = byteBuffer1.rewind();
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.compact();
        java.nio.Buffer buffer4 = byteBuffer1.clear();
        java.nio.ByteBuffer byteBuffer5 = byteBuffer1.compact();
        int int6 = byteBuffer5.capacity();
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(buffer2);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertNotNull(buffer4);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
    }

    @Test
    public void test6587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6587");
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
        org.jsoup.Connection.Response response16 = response3.removeCookie("java.nio.DirectByteBuffer[pos=8 lim=35 cap=35]");
        response3.contentType = "java.nio.HeapByteBuffer[pos=7 lim=10 cap=10]";
        org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response(response3);
        org.jsoup.helper.HttpConnection.Response response20 = new org.jsoup.helper.HttpConnection.Response(response19);
        org.junit.Assert.assertNull(byteBuffer4);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(request9);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(response16);
    }

    @Test
    public void test6588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6588");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(65);
        double double2 = byteBuffer1.getDouble();
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test6589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6589");
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
        java.nio.ByteBuffer byteBuffer31 = byteBuffer27.putInt(2, (int) (short) 10);
        java.nio.ByteBuffer byteBuffer32 = byteBuffer31.compact();
        java.nio.ByteBuffer byteBuffer34 = java.nio.ByteBuffer.allocate(0);
        boolean boolean35 = byteBuffer34.isReadOnly();
        java.nio.ShortBuffer shortBuffer36 = byteBuffer34.asShortBuffer();
        java.nio.ByteBuffer byteBuffer37 = byteBuffer34.duplicate();
        java.nio.ByteBuffer byteBuffer38 = byteBuffer34.slice();
        java.nio.Buffer buffer39 = byteBuffer34.mark();
        org.jsoup.helper.HttpConnection.Response response40 = null;
        org.jsoup.helper.HttpConnection.Response response41 = new org.jsoup.helper.HttpConnection.Response(response40);
        org.jsoup.helper.HttpConnection.Response response42 = new org.jsoup.helper.HttpConnection.Response(response40);
        org.jsoup.helper.HttpConnection.Response response43 = new org.jsoup.helper.HttpConnection.Response(response40);
        org.jsoup.helper.HttpConnection.Response response44 = new org.jsoup.helper.HttpConnection.Response(response40);
        org.jsoup.helper.HttpConnection.Response response45 = new org.jsoup.helper.HttpConnection.Response(response40);
        java.nio.ByteBuffer byteBuffer47 = java.nio.ByteBuffer.allocate(0);
        boolean boolean48 = byteBuffer47.hasRemaining();
        java.nio.ByteBuffer byteBuffer49 = byteBuffer47.asReadOnlyBuffer();
        boolean boolean50 = byteBuffer49.hasRemaining();
        response45.byteData = byteBuffer49;
        java.nio.Buffer buffer52 = byteBuffer49.mark();
        java.nio.ByteOrder byteOrder53 = byteBuffer49.order();
        java.nio.ByteBuffer byteBuffer54 = byteBuffer34.order(byteOrder53);
        java.nio.ByteBuffer byteBuffer56 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer57 = byteBuffer56.asDoubleBuffer();
        boolean boolean58 = byteBuffer56.isDirect();
        java.nio.ByteBuffer byteBuffer60 = java.nio.ByteBuffer.allocate(0);
        boolean boolean61 = byteBuffer60.isReadOnly();
        java.nio.ShortBuffer shortBuffer62 = byteBuffer60.asShortBuffer();
        java.nio.ByteBuffer byteBuffer64 = java.nio.ByteBuffer.allocate(0);
        boolean boolean65 = byteBuffer64.isReadOnly();
        int int66 = byteBuffer60.compareTo(byteBuffer64);
        java.nio.Buffer buffer67 = byteBuffer64.clear();
        java.nio.ByteBuffer byteBuffer69 = java.nio.ByteBuffer.allocate(0);
        boolean boolean70 = byteBuffer69.hasRemaining();
        java.nio.ByteBuffer byteBuffer71 = byteBuffer64.put(byteBuffer69);
        java.nio.ByteBuffer byteBuffer72 = byteBuffer64.slice();
        java.nio.ByteBuffer byteBuffer73 = byteBuffer56.put(byteBuffer72);
        byte[] byteArray74 = byteBuffer72.array();
        java.nio.ByteBuffer byteBuffer75 = byteBuffer54.put(byteArray74);
        java.nio.ByteBuffer byteBuffer76 = byteBuffer31.get(byteArray74);
        java.nio.IntBuffer intBuffer77 = byteBuffer31.asIntBuffer();
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
        org.junit.Assert.assertNotNull(byteBuffer31);
        org.junit.Assert.assertNotNull(byteBuffer32);
        org.junit.Assert.assertNotNull(byteBuffer34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(shortBuffer36);
        org.junit.Assert.assertNotNull(byteBuffer37);
        org.junit.Assert.assertNotNull(byteBuffer38);
        org.junit.Assert.assertNotNull(buffer39);
        org.junit.Assert.assertNotNull(byteBuffer47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(byteBuffer49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(buffer52);
        org.junit.Assert.assertNotNull(byteOrder53);
        org.junit.Assert.assertNotNull(byteBuffer54);
        org.junit.Assert.assertNotNull(byteBuffer56);
        org.junit.Assert.assertNotNull(doubleBuffer57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(byteBuffer60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(shortBuffer62);
        org.junit.Assert.assertNotNull(byteBuffer64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertNotNull(buffer67);
        org.junit.Assert.assertNotNull(byteBuffer69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(byteBuffer71);
        org.junit.Assert.assertNotNull(byteBuffer72);
        org.junit.Assert.assertNotNull(byteBuffer73);
        org.junit.Assert.assertNotNull(byteArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray74), "[]");
        org.junit.Assert.assertNotNull(byteBuffer75);
        org.junit.Assert.assertNotNull(byteBuffer76);
        org.junit.Assert.assertNotNull(intBuffer77);
    }

    @Test
    public void test6590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6590");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.isReadOnly();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        java.nio.ByteBuffer byteBuffer4 = byteBuffer1.duplicate();
        java.nio.ByteBuffer byteBuffer5 = byteBuffer1.slice();
        org.jsoup.helper.HttpConnection.Response response6 = null;
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response6);
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response6);
        org.jsoup.Connection.Request request9 = response8.req;
        org.jsoup.Connection.Method method10 = response8.method();
        java.lang.String str11 = response8.contentType;
        boolean boolean13 = response8.hasCookie("");
        response8.charset = "hi!";
        java.lang.String str16 = response8.statusMessage();
        java.util.Map<java.lang.String, java.lang.String> strMap17 = response8.headers();
        org.jsoup.Connection.Request request18 = response8.req;
        java.nio.ByteBuffer byteBuffer20 = java.nio.ByteBuffer.allocate((int) (byte) 10);
        int int21 = byteBuffer20.limit();
        java.nio.ByteBuffer byteBuffer23 = byteBuffer20.putFloat((float) (-1));
        java.nio.ByteBuffer byteBuffer25 = java.nio.ByteBuffer.allocate((int) (byte) 10);
        int int26 = byteBuffer25.getInt();
        java.nio.ByteBuffer byteBuffer29 = byteBuffer25.put((int) (byte) 0, (byte) 10);
        java.nio.IntBuffer intBuffer30 = byteBuffer25.asIntBuffer();
        java.nio.Buffer buffer31 = byteBuffer25.mark();
        java.nio.Buffer buffer32 = byteBuffer25.flip();
        java.nio.Buffer buffer33 = byteBuffer25.mark();
        java.nio.ByteBuffer byteBuffer35 = java.nio.ByteBuffer.allocate(0);
        boolean boolean36 = byteBuffer35.isReadOnly();
        java.nio.ShortBuffer shortBuffer37 = byteBuffer35.asShortBuffer();
        java.nio.ByteBuffer byteBuffer39 = java.nio.ByteBuffer.allocate(0);
        boolean boolean40 = byteBuffer39.isReadOnly();
        int int41 = byteBuffer35.compareTo(byteBuffer39);
        java.nio.ByteBuffer byteBuffer42 = byteBuffer39.compact();
        java.nio.ByteBuffer byteBuffer44 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer45 = byteBuffer44.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer46 = byteBuffer44.asShortBuffer();
        byte[] byteArray47 = byteBuffer44.array();
        java.nio.ByteBuffer byteBuffer48 = java.nio.ByteBuffer.wrap(byteArray47);
        java.nio.ByteBuffer byteBuffer49 = byteBuffer39.put(byteArray47);
        java.nio.ByteBuffer byteBuffer50 = byteBuffer25.put(byteArray47);
        java.nio.ByteBuffer byteBuffer51 = byteBuffer20.put(byteArray47);
        response8.byteData = byteBuffer51;
        java.nio.ByteBuffer byteBuffer54 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer55 = byteBuffer54.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer56 = byteBuffer54.asShortBuffer();
        int int57 = byteBuffer54.limit();
        byte[] byteArray58 = byteBuffer54.array();
        java.nio.ByteBuffer byteBuffer59 = java.nio.ByteBuffer.wrap(byteArray58);
        java.nio.ByteBuffer byteBuffer60 = byteBuffer51.get(byteArray58);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer63 = byteBuffer1.get(byteArray58, (int) '\u2300', 8);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(shortBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertNull(request9);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(strMap17);
        org.junit.Assert.assertNull(request18);
        org.junit.Assert.assertNotNull(byteBuffer20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertNotNull(byteBuffer23);
        org.junit.Assert.assertNotNull(byteBuffer25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(byteBuffer29);
        org.junit.Assert.assertNotNull(intBuffer30);
        org.junit.Assert.assertNotNull(buffer31);
        org.junit.Assert.assertNotNull(buffer32);
        org.junit.Assert.assertNotNull(buffer33);
        org.junit.Assert.assertNotNull(byteBuffer35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(shortBuffer37);
        org.junit.Assert.assertNotNull(byteBuffer39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(byteBuffer42);
        org.junit.Assert.assertNotNull(byteBuffer44);
        org.junit.Assert.assertNotNull(doubleBuffer45);
        org.junit.Assert.assertNotNull(shortBuffer46);
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray47), "[]");
        org.junit.Assert.assertNotNull(byteBuffer48);
        org.junit.Assert.assertNotNull(byteBuffer49);
        org.junit.Assert.assertNotNull(byteBuffer50);
        org.junit.Assert.assertNotNull(byteBuffer51);
        org.junit.Assert.assertNotNull(byteBuffer54);
        org.junit.Assert.assertNotNull(doubleBuffer55);
        org.junit.Assert.assertNotNull(shortBuffer56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertNotNull(byteArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray58), "[]");
        org.junit.Assert.assertNotNull(byteBuffer59);
        org.junit.Assert.assertNotNull(byteBuffer60);
    }

    @Test
    public void test6591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6591");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean3 = response2.executed;
        java.lang.String str5 = response2.getHeaderCaseInsensitive("");
        java.lang.String str7 = response2.cookie("java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]");
        int int8 = response2.statusCode();
        java.lang.String str9 = response2.statusMessage;
        java.util.Map<java.lang.String, java.lang.String> strMap10 = response2.headers();
        response2.executed = true;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(strMap10);
    }

    @Test
    public void test6592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6592");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer2 = byteBuffer1.asDoubleBuffer();
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.compact();
        java.nio.Buffer buffer4 = byteBuffer1.mark();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer7 = byteBuffer1.putFloat(73, (float) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(doubleBuffer2);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertNotNull(buffer4);
    }

    @Test
    public void test6593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6593");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.isReadOnly();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        org.jsoup.helper.HttpConnection.Response response4 = null;
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response4);
        response5.executed = false;
        java.lang.String str8 = response5.contentType;
        boolean boolean9 = byteBuffer1.equals((java.lang.Object) response5);
        boolean boolean10 = response5.executed;
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(shortBuffer3);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test6594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6594");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str6 = response4.cookie("hi!");
        int int7 = response4.statusCode;
        org.jsoup.Connection.Response response9 = response4.removeCookie("java.nio.HeapByteBuffer[pos=0 lim=32 cap=32]");
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response4);
        java.lang.String str12 = response10.cookie("java.nio.HeapByteBuffer[pos=0 lim=7 cap=7]");
        java.lang.String str13 = response10.statusMessage;
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response10);
        java.nio.ByteBuffer byteBuffer16 = java.nio.ByteBuffer.allocate((int) (byte) 100);
        java.nio.ByteBuffer byteBuffer18 = java.nio.ByteBuffer.allocate(0);
        boolean boolean19 = byteBuffer18.isReadOnly();
        java.nio.ShortBuffer shortBuffer20 = byteBuffer18.asShortBuffer();
        java.nio.ByteBuffer byteBuffer22 = java.nio.ByteBuffer.allocate(0);
        boolean boolean23 = byteBuffer22.isReadOnly();
        int int24 = byteBuffer18.compareTo(byteBuffer22);
        java.nio.Buffer buffer25 = byteBuffer22.clear();
        java.nio.ByteBuffer byteBuffer27 = java.nio.ByteBuffer.allocate(0);
        boolean boolean28 = byteBuffer27.hasRemaining();
        java.nio.ByteBuffer byteBuffer29 = byteBuffer22.put(byteBuffer27);
        java.nio.ByteBuffer byteBuffer30 = byteBuffer29.compact();
        java.nio.ByteBuffer byteBuffer31 = byteBuffer16.put(byteBuffer30);
        java.nio.ByteBuffer byteBuffer33 = java.nio.ByteBuffer.allocateDirect((int) '#');
        java.nio.ByteBuffer byteBuffer35 = byteBuffer33.putShort((short) 0);
        java.nio.ByteBuffer byteBuffer37 = byteBuffer33.putDouble((double) '\000');
        char char38 = byteBuffer37.getChar();
        java.nio.Buffer buffer39 = byteBuffer37.clear();
        boolean boolean40 = byteBuffer31.equals((java.lang.Object) byteBuffer37);
        int int41 = byteBuffer37.getInt();
        java.nio.ByteBuffer byteBuffer42 = byteBuffer37.compact();
        int int43 = byteBuffer37.position();
        java.nio.ByteBuffer byteBuffer45 = byteBuffer37.put((byte) 1);
        short short47 = byteBuffer37.getShort((int) (short) 1);
        java.nio.Buffer buffer48 = byteBuffer37.flip();
        response10.byteData = byteBuffer37;
        java.nio.ByteBuffer byteBuffer51 = byteBuffer37.put((byte) 0);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(byteBuffer16);
        org.junit.Assert.assertNotNull(byteBuffer18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(shortBuffer20);
        org.junit.Assert.assertNotNull(byteBuffer22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(buffer25);
        org.junit.Assert.assertNotNull(byteBuffer27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(byteBuffer29);
        org.junit.Assert.assertNotNull(byteBuffer30);
        org.junit.Assert.assertNotNull(byteBuffer31);
        org.junit.Assert.assertNotNull(byteBuffer33);
        org.junit.Assert.assertNotNull(byteBuffer35);
        org.junit.Assert.assertNotNull(byteBuffer37);
        org.junit.Assert.assertTrue("'" + char38 + "' != '" + '\000' + "'", char38 == '\000');
        org.junit.Assert.assertNotNull(buffer39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(byteBuffer42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 31 + "'", int43 == 31);
        org.junit.Assert.assertNotNull(byteBuffer45);
        org.junit.Assert.assertTrue("'" + short47 + "' != '" + (short) 0 + "'", short47 == (short) 0);
        org.junit.Assert.assertNotNull(buffer48);
        org.junit.Assert.assertNotNull(byteBuffer51);
    }

    @Test
    public void test6595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6595");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect((int) '#');
        float float3 = byteBuffer1.getFloat(1);
        java.nio.ByteBuffer byteBuffer5 = byteBuffer1.putLong((long) 10);
        java.nio.ByteBuffer byteBuffer7 = byteBuffer1.putChar('\000');
        java.nio.ByteBuffer byteBuffer9 = byteBuffer1.put((byte) 1);
        int int10 = byteBuffer9.getInt();
        java.nio.ByteBuffer byteBuffer13 = byteBuffer9.putDouble(4, (double) (short) 100);
        short short14 = byteBuffer9.getShort();
        java.nio.ByteBuffer byteBuffer16 = byteBuffer9.put((byte) 1);
        java.nio.ByteBuffer byteBuffer18 = byteBuffer16.putDouble((double) (-21));
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertNotNull(byteBuffer7);
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(byteBuffer13);
        org.junit.Assert.assertTrue("'" + short14 + "' != '" + (short) 0 + "'", short14 == (short) 0);
        org.junit.Assert.assertNotNull(byteBuffer16);
        org.junit.Assert.assertNotNull(byteBuffer18);
    }

    @Test
    public void test6596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6596");
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
        int int14 = byteBuffer12.limit();
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
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test6597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6597");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate((int) (byte) 10);
        int int2 = byteBuffer1.limit();
        short short3 = byteBuffer1.getShort();
        java.nio.ByteBuffer byteBuffer5 = byteBuffer1.put((byte) -1);
        java.nio.ByteBuffer byteBuffer7 = byteBuffer5.putFloat((float) 137438953472L);
        char char8 = byteBuffer7.getChar();
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertNotNull(byteBuffer7);
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '\000' + "'", char8 == '\000');
    }

    @Test
    public void test6598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6598");
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
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response12);
        java.lang.String str18 = response12.contentType();
        java.lang.String str19 = response12.charset;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test6599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6599");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate((int) (byte) 10);
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.nio.ByteBuffer byteBuffer6 = java.nio.ByteBuffer.wrap(byteArray5);
        java.nio.ByteBuffer byteBuffer7 = byteBuffer1.get(byteArray5);
        java.nio.Buffer buffer8 = byteBuffer1.rewind();
        byte[] byteArray12 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.nio.ByteBuffer byteBuffer13 = java.nio.ByteBuffer.wrap(byteArray12);
        java.nio.ByteBuffer byteBuffer14 = byteBuffer1.put(byteArray12);
        java.nio.ByteBuffer byteBuffer15 = java.nio.ByteBuffer.wrap(byteArray12);
        short short16 = byteBuffer15.getShort();
        boolean boolean17 = byteBuffer15.hasRemaining();
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
        org.junit.Assert.assertNotNull(byteBuffer15);
        org.junit.Assert.assertTrue("'" + short16 + "' != '" + (short) 25601 + "'", short16 == (short) 25601);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test6600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6600");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.nio.ByteBuffer byteBuffer4 = response3.byteData;
        org.jsoup.Connection.Response response7 = response3.cookie("hi!", "");
        boolean boolean8 = response3.executed;
        org.jsoup.Connection.Request request9 = response3.req;
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response3);
        response10.executed = true;
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray13 = response10.bodyAsBytes();
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
    public void test6601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6601");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean3 = response2.executed;
        java.lang.String str5 = response2.getHeaderCaseInsensitive("");
        java.net.URL uRL6 = response2.url();
        org.jsoup.Connection.Response response9 = response2.cookie("java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]", "java.nio.HeapByteBuffer[pos=0 lim=32 cap=32]");
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response2);
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response2);
        response2.statusCode = 1120010240;
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNotNull(response9);
    }

    @Test
    public void test6602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6602");
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
        java.nio.Buffer buffer37 = byteBuffer29.position(8);
        java.nio.Buffer buffer38 = byteBuffer29.mark();
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
        org.junit.Assert.assertNotNull(buffer37);
        org.junit.Assert.assertNotNull(buffer38);
    }

    @Test
    public void test6603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6603");
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
        java.nio.ByteBuffer byteBuffer15 = java.nio.ByteBuffer.allocate(0);
        boolean boolean16 = byteBuffer15.isReadOnly();
        java.nio.ShortBuffer shortBuffer17 = byteBuffer15.asShortBuffer();
        java.nio.ByteBuffer byteBuffer19 = java.nio.ByteBuffer.allocate(0);
        boolean boolean20 = byteBuffer19.isReadOnly();
        int int21 = byteBuffer15.compareTo(byteBuffer19);
        java.nio.ByteBuffer byteBuffer22 = byteBuffer19.duplicate();
        int int23 = byteBuffer19.remaining();
        java.nio.ByteBuffer byteBuffer24 = byteBuffer13.put(byteBuffer19);
        java.nio.Buffer buffer25 = byteBuffer19.clear();
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
        org.junit.Assert.assertNotNull(byteBuffer19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(byteBuffer22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(byteBuffer24);
        org.junit.Assert.assertNotNull(buffer25);
    }

    @Test
    public void test6604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6604");
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
        java.lang.String str16 = response13.statusMessage();
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response13);
        int int18 = response17.numRedirects;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
    }

    @Test
    public void test6605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6605");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect(11);
        java.nio.ByteBuffer byteBuffer2 = byteBuffer1.asReadOnlyBuffer();
        boolean boolean3 = byteBuffer2.isReadOnly();
        java.nio.ByteBuffer byteBuffer4 = byteBuffer2.slice();
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteBuffer2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(byteBuffer4);
    }

    @Test
    public void test6606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6606");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.header("");
        response1.charset = "hi!";
        boolean boolean7 = response1.hasCookie("java.nio.HeapByteBuffer[pos=3 lim=10 cap=10]");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test6607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6607");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.isReadOnly();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        java.nio.ByteBuffer byteBuffer4 = byteBuffer1.duplicate();
        java.nio.ByteBuffer byteBuffer5 = byteBuffer1.asReadOnlyBuffer();
        java.nio.ShortBuffer shortBuffer6 = byteBuffer5.asShortBuffer();
        java.nio.IntBuffer intBuffer7 = byteBuffer5.asIntBuffer();
        java.nio.ShortBuffer shortBuffer8 = byteBuffer5.asShortBuffer();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer10 = byteBuffer5.putChar('\000');
            org.junit.Assert.fail("Expected exception of type java.nio.ReadOnlyBufferException; message: null");
        } catch (java.nio.ReadOnlyBufferException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(shortBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertNotNull(shortBuffer6);
        org.junit.Assert.assertNotNull(intBuffer7);
        org.junit.Assert.assertNotNull(shortBuffer8);
    }

    @Test
    public void test6608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6608");
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
        java.nio.Buffer buffer81 = byteBuffer80.flip();
        java.nio.FloatBuffer floatBuffer82 = byteBuffer80.asFloatBuffer();
        boolean boolean83 = byteBuffer80.hasArray();
        java.lang.Class<?> wildcardClass84 = byteBuffer80.getClass();
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
        org.junit.Assert.assertNotNull(buffer81);
        org.junit.Assert.assertNotNull(floatBuffer82);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertNotNull(wildcardClass84);
    }

    @Test
    public void test6609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6609");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str6 = response4.cookie("hi!");
        int int7 = response4.statusCode;
        org.jsoup.Connection.Response response9 = response4.removeCookie("java.nio.HeapByteBuffer[pos=0 lim=32 cap=32]");
        java.nio.ByteBuffer byteBuffer11 = java.nio.ByteBuffer.allocateDirect((int) '#');
        java.nio.ByteBuffer byteBuffer13 = byteBuffer11.putShort((short) 0);
        java.nio.ByteBuffer byteBuffer16 = byteBuffer13.putShort(0, (short) (byte) 10);
        short short18 = byteBuffer13.getShort((int) (byte) 10);
        java.nio.ByteBuffer byteBuffer20 = java.nio.ByteBuffer.allocate(0);
        boolean boolean21 = byteBuffer20.isReadOnly();
        java.nio.ShortBuffer shortBuffer22 = byteBuffer20.asShortBuffer();
        java.nio.ByteBuffer byteBuffer24 = java.nio.ByteBuffer.allocate(0);
        boolean boolean25 = byteBuffer24.isReadOnly();
        int int26 = byteBuffer20.compareTo(byteBuffer24);
        java.nio.Buffer buffer27 = byteBuffer24.clear();
        java.nio.ByteBuffer byteBuffer29 = java.nio.ByteBuffer.allocate(0);
        boolean boolean30 = byteBuffer29.hasRemaining();
        java.nio.ByteBuffer byteBuffer31 = byteBuffer24.put(byteBuffer29);
        java.nio.ByteBuffer byteBuffer33 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer34 = byteBuffer33.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer35 = byteBuffer33.asShortBuffer();
        byte[] byteArray36 = byteBuffer33.array();
        java.nio.ByteBuffer byteBuffer37 = java.nio.ByteBuffer.wrap(byteArray36);
        java.nio.ByteBuffer byteBuffer38 = byteBuffer31.put(byteArray36);
        java.nio.ByteBuffer byteBuffer39 = byteBuffer13.get(byteArray36);
        java.nio.ByteBuffer byteBuffer42 = byteBuffer39.putChar((int) '\000', '#');
        char char44 = byteBuffer42.getChar((int) (byte) 1);
        response4.byteData = byteBuffer42;
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertNotNull(byteBuffer11);
        org.junit.Assert.assertNotNull(byteBuffer13);
        org.junit.Assert.assertNotNull(byteBuffer16);
        org.junit.Assert.assertTrue("'" + short18 + "' != '" + (short) 0 + "'", short18 == (short) 0);
        org.junit.Assert.assertNotNull(byteBuffer20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(shortBuffer22);
        org.junit.Assert.assertNotNull(byteBuffer24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(buffer27);
        org.junit.Assert.assertNotNull(byteBuffer29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(byteBuffer31);
        org.junit.Assert.assertNotNull(byteBuffer33);
        org.junit.Assert.assertNotNull(doubleBuffer34);
        org.junit.Assert.assertNotNull(shortBuffer35);
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray36), "[]");
        org.junit.Assert.assertNotNull(byteBuffer37);
        org.junit.Assert.assertNotNull(byteBuffer38);
        org.junit.Assert.assertNotNull(byteBuffer39);
        org.junit.Assert.assertNotNull(byteBuffer42);
        org.junit.Assert.assertTrue("'" + char44 + "' != '" + '\u2300' + "'", char44 == '\u2300');
    }

    @Test
    public void test6610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6610");
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
        java.nio.ByteBuffer byteBuffer51 = byteBuffer21.putChar(0, '\000');
        java.nio.ByteBuffer byteBuffer53 = java.nio.ByteBuffer.allocate(0);
        boolean boolean54 = byteBuffer53.isReadOnly();
        java.nio.ShortBuffer shortBuffer55 = byteBuffer53.asShortBuffer();
        int int56 = byteBuffer53.position();
        boolean boolean57 = byteBuffer53.isReadOnly();
        java.nio.ByteBuffer byteBuffer58 = byteBuffer21.put(byteBuffer53);
        // The following exception was thrown during execution in test generation
        try {
            double double60 = byteBuffer53.getDouble(85);
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
        org.junit.Assert.assertNotNull(byteBuffer51);
        org.junit.Assert.assertNotNull(byteBuffer53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(shortBuffer55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(byteBuffer58);
    }

    @Test
    public void test6611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6611");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        response2.executed = false;
        java.lang.String str5 = response2.contentType;
        int int6 = response2.statusCode;
        java.lang.String str7 = response2.charset();
        java.lang.String str9 = response2.header("java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]");
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response2);
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response10);
        int int12 = response10.numRedirects;
        java.util.Map<java.lang.String, java.lang.String> strMap13 = response10.cookies();
        org.jsoup.Connection.Response response15 = response10.removeCookie("");
        java.lang.String str17 = response10.cookie("java.nio.HeapByteBuffer[pos=16 lim=100 cap=100]");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response18 = org.jsoup.helper.HttpConnection.Response.execute(request0, response10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test6612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6612");
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
        int int14 = response11.statusCode;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test6613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6613");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.nio.ByteBuffer byteBuffer4 = response3.byteData;
        java.lang.String str5 = response3.charset;
        java.lang.String str6 = response3.contentType;
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response3);
        java.lang.String str8 = response3.contentType;
        java.net.HttpURLConnection httpURLConnection9 = null;
        org.jsoup.helper.HttpConnection.Response response10 = null;
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response10);
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response10);
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response10);
        java.nio.ByteBuffer byteBuffer14 = response13.byteData;
        org.jsoup.Connection.Response response17 = response13.cookie("hi!", "");
        java.net.URL uRL18 = response13.url();
        boolean boolean20 = response13.hasHeader("java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]");
        java.nio.ByteBuffer byteBuffer21 = response13.byteData;
        response13.statusCode = (byte) 1;
        org.jsoup.helper.HttpConnection.Response response24 = new org.jsoup.helper.HttpConnection.Response(response13);
        // The following exception was thrown during execution in test generation
        try {
            response3.setupFromConnection(httpURLConnection9, (org.jsoup.Connection.Response) response13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(byteBuffer4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(byteBuffer14);
        org.junit.Assert.assertNotNull(response17);
        org.junit.Assert.assertNull(uRL18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(byteBuffer21);
    }

    @Test
    public void test6614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6614");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.executed = false;
        java.lang.String str4 = response1.contentType;
        int int5 = response1.statusCode;
        java.lang.String str6 = response1.charset();
        org.jsoup.Connection.Request request7 = response1.req;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(request7);
    }

    @Test
    public void test6615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6615");
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
        response12.numRedirects = (short) 100;
        org.junit.Assert.assertNull(byteBuffer4);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(uRL8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(method11);
    }

    @Test
    public void test6616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6616");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect((int) '#');
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.putShort((short) 0);
        java.nio.ByteBuffer byteBuffer6 = byteBuffer3.putShort(0, (short) (byte) 10);
        java.nio.Buffer buffer7 = byteBuffer6.clear();
        java.nio.ShortBuffer shortBuffer8 = byteBuffer6.asShortBuffer();
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer6);
        org.junit.Assert.assertNotNull(buffer7);
        org.junit.Assert.assertNotNull(shortBuffer8);
    }

    @Test
    public void test6617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6617");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request3 = response2.req;
        org.jsoup.Connection.Method method4 = response2.method();
        java.lang.String str5 = response2.contentType;
        boolean boolean7 = response2.hasCookie("");
        response2.charset = "hi!";
        java.lang.String str10 = response2.statusMessage();
        int int11 = response2.statusCode();
        java.lang.String str12 = response2.statusMessage;
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response2);
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response13);
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response14);
        org.junit.Assert.assertNull(request3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test6618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6618");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.nio.ByteBuffer byteBuffer5 = response4.byteData;
        org.jsoup.Connection.Response response8 = response4.cookie("hi!", "");
        java.net.URL uRL9 = response4.url();
        boolean boolean11 = response4.hasHeader("java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]");
        java.nio.ByteBuffer byteBuffer12 = response4.byteData;
        response4.statusCode = (byte) 1;
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response4);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response16 = org.jsoup.helper.HttpConnection.Response.execute(request0, response15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(byteBuffer5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(byteBuffer12);
    }

    @Test
    public void test6619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6619");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.isReadOnly();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        int int4 = byteBuffer1.position();
        java.nio.ByteOrder byteOrder5 = null;
        java.nio.ByteBuffer byteBuffer6 = byteBuffer1.order(byteOrder5);
        int int7 = byteBuffer6.limit();
        java.nio.CharBuffer charBuffer8 = byteBuffer6.asCharBuffer();
        java.nio.IntBuffer intBuffer9 = byteBuffer6.asIntBuffer();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer12 = byteBuffer6.putLong((int) (short) 13312, (long) (-8));
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
        org.junit.Assert.assertNotNull(charBuffer8);
        org.junit.Assert.assertNotNull(intBuffer9);
    }

    @Test
    public void test6620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6620");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.isReadOnly();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        int int4 = byteBuffer1.position();
        int int5 = byteBuffer1.arrayOffset();
        java.nio.Buffer buffer6 = byteBuffer1.flip();
        java.nio.Buffer buffer7 = byteBuffer1.mark();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.Buffer buffer9 = byteBuffer1.position((-3));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: newPosition < 0: (-3 < 0)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(shortBuffer3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(buffer6);
        org.junit.Assert.assertNotNull(buffer7);
    }

    @Test
    public void test6621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6621");
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
        java.nio.ByteBuffer byteBuffer25 = byteBuffer20.asReadOnlyBuffer();
        java.nio.ByteBuffer byteBuffer27 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer28 = byteBuffer27.asDoubleBuffer();
        boolean boolean29 = byteBuffer27.isDirect();
        java.nio.ByteBuffer byteBuffer31 = java.nio.ByteBuffer.allocate(0);
        boolean boolean32 = byteBuffer31.isReadOnly();
        java.nio.ShortBuffer shortBuffer33 = byteBuffer31.asShortBuffer();
        java.nio.ByteBuffer byteBuffer35 = java.nio.ByteBuffer.allocate(0);
        boolean boolean36 = byteBuffer35.isReadOnly();
        int int37 = byteBuffer31.compareTo(byteBuffer35);
        java.nio.DoubleBuffer doubleBuffer38 = byteBuffer35.asDoubleBuffer();
        java.nio.FloatBuffer floatBuffer39 = byteBuffer35.asFloatBuffer();
        java.nio.ByteBuffer byteBuffer41 = java.nio.ByteBuffer.allocate((int) (byte) 10);
        byte[] byteArray45 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.nio.ByteBuffer byteBuffer46 = java.nio.ByteBuffer.wrap(byteArray45);
        java.nio.ByteBuffer byteBuffer47 = byteBuffer41.get(byteArray45);
        java.nio.ByteBuffer byteBuffer50 = byteBuffer35.put(byteArray45, 0, (int) (byte) 0);
        java.nio.ByteBuffer byteBuffer51 = java.nio.ByteBuffer.wrap(byteArray45);
        byte[] byteArray52 = new byte[] {};
        java.nio.ByteBuffer byteBuffer53 = java.nio.ByteBuffer.wrap(byteArray52);
        java.nio.ByteBuffer byteBuffer54 = byteBuffer51.get(byteArray52);
        java.nio.ByteBuffer byteBuffer55 = byteBuffer27.get(byteArray52);
        java.nio.ByteBuffer byteBuffer56 = byteBuffer25.get(byteArray52);
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
        org.junit.Assert.assertNotNull(byteBuffer27);
        org.junit.Assert.assertNotNull(doubleBuffer28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(byteBuffer31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(shortBuffer33);
        org.junit.Assert.assertNotNull(byteBuffer35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(doubleBuffer38);
        org.junit.Assert.assertNotNull(floatBuffer39);
        org.junit.Assert.assertNotNull(byteBuffer41);
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray45), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(byteBuffer46);
        org.junit.Assert.assertNotNull(byteBuffer47);
        org.junit.Assert.assertNotNull(byteBuffer50);
        org.junit.Assert.assertNotNull(byteBuffer51);
        org.junit.Assert.assertNotNull(byteArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray52), "[]");
        org.junit.Assert.assertNotNull(byteBuffer53);
        org.junit.Assert.assertNotNull(byteBuffer54);
        org.junit.Assert.assertNotNull(byteBuffer55);
        org.junit.Assert.assertNotNull(byteBuffer56);
    }

    @Test
    public void test6622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6622");
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
        long long35 = byteBuffer29.getLong();
        java.nio.ByteBuffer byteBuffer37 = java.nio.ByteBuffer.allocate(0);
        boolean boolean38 = byteBuffer37.isReadOnly();
        java.nio.ShortBuffer shortBuffer39 = byteBuffer37.asShortBuffer();
        java.nio.ByteBuffer byteBuffer41 = java.nio.ByteBuffer.allocate(0);
        boolean boolean42 = byteBuffer41.isReadOnly();
        int int43 = byteBuffer37.compareTo(byteBuffer41);
        java.nio.Buffer buffer45 = byteBuffer37.limit(0);
        byte[] byteArray46 = byteBuffer37.array();
        java.nio.ByteBuffer byteBuffer47 = byteBuffer29.get(byteArray46);
        java.nio.ByteBuffer byteBuffer48 = java.nio.ByteBuffer.wrap(byteArray46);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer51 = byteBuffer48.putDouble((-2), (double) 14);
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
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
        org.junit.Assert.assertNotNull(byteBuffer37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(shortBuffer39);
        org.junit.Assert.assertNotNull(byteBuffer41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(buffer45);
        org.junit.Assert.assertNotNull(byteArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray46), "[]");
        org.junit.Assert.assertNotNull(byteBuffer47);
        org.junit.Assert.assertNotNull(byteBuffer48);
    }

    @Test
    public void test6623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6623");
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
        boolean boolean34 = byteBuffer33.hasArray();
        java.nio.ByteBuffer byteBuffer36 = java.nio.ByteBuffer.allocate((int) ' ');
        int int38 = byteBuffer36.getInt((int) (short) 0);
        float float40 = byteBuffer36.getFloat((int) (short) 10);
        java.lang.String str41 = byteBuffer36.toString();
        boolean boolean42 = byteBuffer36.hasArray();
        java.nio.ByteBuffer byteBuffer44 = java.nio.ByteBuffer.allocate((int) (byte) 10);
        int int45 = byteBuffer44.limit();
        java.nio.ByteBuffer byteBuffer47 = byteBuffer44.putChar(' ');
        java.nio.ByteBuffer byteBuffer49 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer50 = byteBuffer49.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer51 = byteBuffer49.asShortBuffer();
        java.nio.ByteOrder byteOrder52 = null;
        java.nio.ByteBuffer byteBuffer53 = byteBuffer49.order(byteOrder52);
        java.nio.ByteBuffer byteBuffer55 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer56 = byteBuffer55.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer57 = byteBuffer55.asShortBuffer();
        int int58 = byteBuffer55.limit();
        byte[] byteArray59 = byteBuffer55.array();
        java.nio.ByteBuffer byteBuffer60 = byteBuffer49.put(byteArray59);
        java.nio.ByteBuffer byteBuffer61 = byteBuffer44.put(byteArray59);
        java.nio.ByteBuffer byteBuffer62 = byteBuffer36.get(byteArray59);
        char char64 = byteBuffer36.getChar((int) (byte) 0);
        java.nio.ByteBuffer byteBuffer65 = byteBuffer36.compact();
        byte[] byteArray66 = new byte[] {};
        java.nio.ByteBuffer byteBuffer67 = java.nio.ByteBuffer.wrap(byteArray66);
        java.nio.ByteBuffer byteBuffer68 = byteBuffer36.get(byteArray66);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer71 = byteBuffer33.get(byteArray66, 27, 167772160);
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
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(byteBuffer36);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + float40 + "' != '" + 0.0f + "'", float40 == 0.0f);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "java.nio.HeapByteBuffer[pos=0 lim=32 cap=32]" + "'", str41, "java.nio.HeapByteBuffer[pos=0 lim=32 cap=32]");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(byteBuffer44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 10 + "'", int45 == 10);
        org.junit.Assert.assertNotNull(byteBuffer47);
        org.junit.Assert.assertNotNull(byteBuffer49);
        org.junit.Assert.assertNotNull(doubleBuffer50);
        org.junit.Assert.assertNotNull(shortBuffer51);
        org.junit.Assert.assertNotNull(byteBuffer53);
        org.junit.Assert.assertNotNull(byteBuffer55);
        org.junit.Assert.assertNotNull(doubleBuffer56);
        org.junit.Assert.assertNotNull(shortBuffer57);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertNotNull(byteArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray59), "[]");
        org.junit.Assert.assertNotNull(byteBuffer60);
        org.junit.Assert.assertNotNull(byteBuffer61);
        org.junit.Assert.assertNotNull(byteBuffer62);
        org.junit.Assert.assertTrue("'" + char64 + "' != '" + '\000' + "'", char64 == '\000');
        org.junit.Assert.assertNotNull(byteBuffer65);
        org.junit.Assert.assertNotNull(byteArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray66), "[]");
        org.junit.Assert.assertNotNull(byteBuffer67);
        org.junit.Assert.assertNotNull(byteBuffer68);
    }

    @Test
    public void test6624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6624");
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
        java.nio.ByteBuffer byteBuffer15 = byteBuffer13.slice();
        // The following exception was thrown during execution in test generation
        try {
            short short17 = byteBuffer15.getShort(1120010240);
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
        org.junit.Assert.assertNotNull(byteBuffer15);
    }

    @Test
    public void test6625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6625");
        org.jsoup.helper.HttpConnection.Response.MAX_REDIRECTS = 65536;
    }

    @Test
    public void test6626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6626");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.nio.ByteBuffer byteBuffer4 = response3.byteData;
        org.jsoup.Connection.Response response7 = response3.cookie("hi!", "");
        org.jsoup.Connection.Response response10 = response3.header("hi!", "java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]");
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response3);
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response11);
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response11);
        java.util.Map<java.lang.String, java.lang.String> strMap14 = response13.headers();
        java.lang.String str15 = response13.charset();
        org.junit.Assert.assertNull(byteBuffer4);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test6627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6627");
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
        java.lang.String str28 = byteBuffer16.toString();
        java.nio.ByteBuffer byteBuffer30 = byteBuffer16.putDouble((double) (short) 10);
        java.nio.ByteBuffer byteBuffer32 = java.nio.ByteBuffer.allocate((int) (byte) 10);
        byte[] byteArray36 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.nio.ByteBuffer byteBuffer37 = java.nio.ByteBuffer.wrap(byteArray36);
        java.nio.ByteBuffer byteBuffer38 = byteBuffer32.get(byteArray36);
        java.nio.Buffer buffer39 = byteBuffer32.rewind();
        byte[] byteArray43 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.nio.ByteBuffer byteBuffer44 = java.nio.ByteBuffer.wrap(byteArray43);
        java.nio.ByteBuffer byteBuffer45 = byteBuffer32.put(byteArray43);
        java.nio.ByteBuffer byteBuffer46 = java.nio.ByteBuffer.wrap(byteArray43);
        short short47 = byteBuffer46.getShort();
        int int48 = byteBuffer30.compareTo(byteBuffer46);
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
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "java.nio.HeapByteBuffer[pos=0 lim=100 cap=100]" + "'", str28, "java.nio.HeapByteBuffer[pos=0 lim=100 cap=100]");
        org.junit.Assert.assertNotNull(byteBuffer30);
        org.junit.Assert.assertNotNull(byteBuffer32);
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray36), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(byteBuffer37);
        org.junit.Assert.assertNotNull(byteBuffer38);
        org.junit.Assert.assertNotNull(buffer39);
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray43), "[100, 1, 1]");
        org.junit.Assert.assertNotNull(byteBuffer44);
        org.junit.Assert.assertNotNull(byteBuffer45);
        org.junit.Assert.assertNotNull(byteBuffer46);
        org.junit.Assert.assertTrue("'" + short47 + "' != '" + (short) 25601 + "'", short47 == (short) 25601);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
    }

    @Test
    public void test6628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6628");
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
        int int28 = byteBuffer27.position();
        float float29 = byteBuffer27.getFloat();
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
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + float29 + "' != '" + 0.0f + "'", float29 == 0.0f);
    }

    @Test
    public void test6629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6629");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.executed = false;
        java.lang.String str4 = response1.contentType;
        int int5 = response1.statusCode;
        java.lang.String str6 = response1.charset();
        java.lang.String str8 = response1.header("java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]");
        boolean boolean10 = response1.hasCookie("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap11 = response1.headers();
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Request request13 = response12.req;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNull(request13);
    }

    @Test
    public void test6630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6630");
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
        // The following exception was thrown during execution in test generation
        try {
            byte byte20 = byteBuffer13.get();
            org.junit.Assert.fail("Expected exception of type java.nio.BufferUnderflowException; message: null");
        } catch (java.nio.BufferUnderflowException e) {
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
    }

    @Test
    public void test6631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6631");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(85);
        java.nio.ByteBuffer byteBuffer4 = byteBuffer1.put(9, (byte) 100);
        int int5 = byteBuffer4.capacity();
        java.nio.ByteBuffer byteBuffer7 = java.nio.ByteBuffer.allocate((int) (byte) 10);
        int int8 = byteBuffer7.limit();
        byte[] byteArray9 = byteBuffer7.array();
        java.nio.ByteBuffer byteBuffer10 = byteBuffer4.put(byteArray9);
        java.nio.ByteBuffer byteBuffer11 = byteBuffer4.compact();
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 85 + "'", int5 == 85);
        org.junit.Assert.assertNotNull(byteBuffer7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(byteBuffer10);
        org.junit.Assert.assertNotNull(byteBuffer11);
    }

    @Test
    public void test6632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6632");
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
        org.jsoup.Connection.Response response15 = response3.removeCookie("java.nio.HeapByteBuffer[pos=1 lim=3 cap=3]");
        java.lang.String str16 = response3.charset();
        org.jsoup.Connection.Response response18 = response3.removeHeader("java.nio.HeapByteBuffer[pos=6 lim=7 cap=7]");
        org.junit.Assert.assertNull(byteBuffer4);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(response18);
    }

    @Test
    public void test6633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6633");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response7 = response5.removeHeader("java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]");
        org.jsoup.Connection.Response response10 = response5.cookie("java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]", "");
        java.lang.String str11 = response5.statusMessage();
        java.lang.String str13 = response5.cookie("java.nio.HeapByteBuffer[pos=0 lim=3 cap=3]");
        java.lang.String str15 = response5.getHeaderCaseInsensitive("java.nio.HeapByteBuffer[pos=2 lim=10 cap=10]");
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test6634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6634");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect(96);
        org.junit.Assert.assertNotNull(byteBuffer1);
    }

    @Test
    public void test6635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6635");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.executed = false;
        java.lang.String str4 = response1.contentType;
        int int5 = response1.statusCode;
        java.lang.String str6 = response1.charset();
        java.lang.String str8 = response1.header("java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]");
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry11 = response9.scanHeaders("java.nio.DirectByteBuffer[pos=4 lim=35 cap=35]");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(strEntry11);
    }

    @Test
    public void test6636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6636");
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
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response14);
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response15);
        java.nio.ByteBuffer byteBuffer18 = java.nio.ByteBuffer.allocate(0);
        boolean boolean19 = byteBuffer18.isReadOnly();
        java.nio.ShortBuffer shortBuffer20 = byteBuffer18.asShortBuffer();
        int int21 = byteBuffer18.position();
        boolean boolean22 = byteBuffer18.isReadOnly();
        java.nio.ByteBuffer byteBuffer24 = java.nio.ByteBuffer.allocate(0);
        boolean boolean25 = byteBuffer24.isReadOnly();
        java.nio.ShortBuffer shortBuffer26 = byteBuffer24.asShortBuffer();
        int int27 = byteBuffer24.position();
        boolean boolean28 = byteBuffer24.isReadOnly();
        int int29 = byteBuffer18.compareTo(byteBuffer24);
        java.nio.IntBuffer intBuffer30 = byteBuffer24.asIntBuffer();
        response15.byteData = byteBuffer24;
        org.junit.Assert.assertNull(byteBuffer4);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(uRL8);
        org.junit.Assert.assertNull(method12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(byteBuffer18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(shortBuffer20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(byteBuffer24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(shortBuffer26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(intBuffer30);
    }

    @Test
    public void test6637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6637");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean3 = response2.executed;
        response2.statusCode = 0;
        java.lang.String str6 = response2.contentType();
        java.lang.String str8 = response2.cookie("");
        java.nio.ByteBuffer byteBuffer9 = null;
        response2.byteData = byteBuffer9;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry12 = response2.scanHeaders("hi!");
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response2);
        org.jsoup.Connection.Response response16 = response2.cookie("java.nio.HeapByteBuffer[pos=3 lim=10 cap=10]", "java.nio.DirectByteBuffer[pos=0 lim=31 cap=35]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(strEntry12);
        org.junit.Assert.assertNotNull(response16);
    }

    @Test
    public void test6638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6638");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect((int) '#');
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.putShort((short) 0);
        java.nio.ByteBuffer byteBuffer5 = byteBuffer3.putDouble((double) '\000');
        float float6 = byteBuffer5.getFloat();
        float float8 = byteBuffer5.getFloat((int) (short) 10);
        java.nio.ByteBuffer byteBuffer10 = byteBuffer5.putDouble((double) (byte) 0);
        java.nio.DoubleBuffer doubleBuffer11 = byteBuffer10.asDoubleBuffer();
        java.nio.ByteBuffer byteBuffer12 = byteBuffer10.slice();
        java.nio.ByteBuffer byteBuffer14 = byteBuffer10.putFloat((float) 5);
        java.nio.ByteBuffer byteBuffer16 = byteBuffer14.putLong((long) 21);
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8 == 0.0f);
        org.junit.Assert.assertNotNull(byteBuffer10);
        org.junit.Assert.assertNotNull(doubleBuffer11);
        org.junit.Assert.assertNotNull(byteBuffer12);
        org.junit.Assert.assertNotNull(byteBuffer14);
        org.junit.Assert.assertNotNull(byteBuffer16);
    }

    @Test
    public void test6639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6639");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.header("");
        boolean boolean5 = response1.hasCookie("");
        org.jsoup.Connection.Request request6 = null;
        response1.req = request6;
        java.nio.ByteBuffer byteBuffer8 = response1.byteData;
        org.jsoup.Connection.Request request9 = null;
        response1.req = request9;
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str12 = response1.charset;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(byteBuffer8);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test6640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6640");
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
        java.nio.ByteBuffer byteBuffer32 = byteBuffer29.putFloat((int) (short) 0, (float) 11);
        org.jsoup.helper.HttpConnection.Response response33 = null;
        org.jsoup.helper.HttpConnection.Response response34 = new org.jsoup.helper.HttpConnection.Response(response33);
        org.jsoup.helper.HttpConnection.Response response35 = new org.jsoup.helper.HttpConnection.Response(response33);
        org.jsoup.helper.HttpConnection.Response response36 = new org.jsoup.helper.HttpConnection.Response(response33);
        org.jsoup.helper.HttpConnection.Response response37 = new org.jsoup.helper.HttpConnection.Response(response33);
        org.jsoup.helper.HttpConnection.Response response38 = new org.jsoup.helper.HttpConnection.Response(response33);
        java.nio.ByteBuffer byteBuffer40 = java.nio.ByteBuffer.allocate(0);
        boolean boolean41 = byteBuffer40.hasRemaining();
        java.nio.ByteBuffer byteBuffer42 = byteBuffer40.asReadOnlyBuffer();
        boolean boolean43 = byteBuffer42.hasRemaining();
        response38.byteData = byteBuffer42;
        java.nio.ByteBuffer byteBuffer46 = java.nio.ByteBuffer.allocate(0);
        boolean boolean47 = byteBuffer46.isReadOnly();
        java.nio.ShortBuffer shortBuffer48 = byteBuffer46.asShortBuffer();
        java.nio.ByteBuffer byteBuffer49 = byteBuffer46.duplicate();
        response38.byteData = byteBuffer46;
        int int51 = byteBuffer46.capacity();
        java.nio.ByteBuffer byteBuffer52 = byteBuffer46.slice();
        java.nio.ByteBuffer byteBuffer54 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer55 = byteBuffer54.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer56 = byteBuffer54.asShortBuffer();
        java.nio.ByteOrder byteOrder57 = null;
        java.nio.ByteBuffer byteBuffer58 = byteBuffer54.order(byteOrder57);
        java.nio.ByteBuffer byteBuffer60 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer61 = byteBuffer60.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer62 = byteBuffer60.asShortBuffer();
        int int63 = byteBuffer60.limit();
        byte[] byteArray64 = byteBuffer60.array();
        java.nio.ByteBuffer byteBuffer65 = byteBuffer54.put(byteArray64);
        java.nio.ByteBuffer byteBuffer66 = byteBuffer52.put(byteArray64);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer69 = byteBuffer32.put(byteArray64, 5, (int) (short) 10);
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
        org.junit.Assert.assertNotNull(byteBuffer40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(byteBuffer42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(byteBuffer46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(shortBuffer48);
        org.junit.Assert.assertNotNull(byteBuffer49);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNotNull(byteBuffer52);
        org.junit.Assert.assertNotNull(byteBuffer54);
        org.junit.Assert.assertNotNull(doubleBuffer55);
        org.junit.Assert.assertNotNull(shortBuffer56);
        org.junit.Assert.assertNotNull(byteBuffer58);
        org.junit.Assert.assertNotNull(byteBuffer60);
        org.junit.Assert.assertNotNull(doubleBuffer61);
        org.junit.Assert.assertNotNull(shortBuffer62);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertNotNull(byteArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray64), "[]");
        org.junit.Assert.assertNotNull(byteBuffer65);
        org.junit.Assert.assertNotNull(byteBuffer66);
    }

    @Test
    public void test6641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6641");
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
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry32 = response26.scanHeaders("java.nio.HeapByteBuffer[pos=9 lim=9 cap=32]");
        java.lang.String str34 = response26.cookie("java.nio.HeapByteBuffer[pos=16 lim=100 cap=100]");
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
        org.junit.Assert.assertNull(strEntry32);
        org.junit.Assert.assertNull(str34);
    }

    @Test
    public void test6642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6642");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate((int) (byte) 10);
        short short3 = byteBuffer1.getShort(1);
        java.nio.CharBuffer charBuffer4 = byteBuffer1.asCharBuffer();
        java.nio.Buffer buffer5 = byteBuffer1.clear();
        java.nio.ByteBuffer byteBuffer6 = byteBuffer1.asReadOnlyBuffer();
        java.nio.ByteBuffer byteBuffer8 = byteBuffer1.putFloat((float) (byte) 1);
        float float9 = byteBuffer8.getFloat();
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
        org.junit.Assert.assertNotNull(charBuffer4);
        org.junit.Assert.assertNotNull(buffer5);
        org.junit.Assert.assertNotNull(byteBuffer6);
        org.junit.Assert.assertNotNull(byteBuffer8);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.0f + "'", float9 == 0.0f);
    }

    @Test
    public void test6643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6643");
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
        org.jsoup.helper.HttpConnection.Response response15 = null;
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response15);
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response15);
        boolean boolean18 = response17.executed;
        java.lang.String str20 = response17.getHeaderCaseInsensitive("");
        java.lang.String str22 = response17.cookie("java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]");
        int int23 = response17.statusCode();
        org.jsoup.Connection.Response response26 = response17.cookie("hi!", "");
        java.nio.ByteBuffer byteBuffer28 = java.nio.ByteBuffer.allocate(0);
        boolean boolean29 = byteBuffer28.isReadOnly();
        java.nio.ShortBuffer shortBuffer30 = byteBuffer28.asShortBuffer();
        java.nio.ByteBuffer byteBuffer32 = java.nio.ByteBuffer.allocate(0);
        boolean boolean33 = byteBuffer32.isReadOnly();
        int int34 = byteBuffer28.compareTo(byteBuffer32);
        java.nio.DoubleBuffer doubleBuffer35 = byteBuffer32.asDoubleBuffer();
        response17.byteData = byteBuffer32;
        java.nio.ByteOrder byteOrder37 = byteBuffer32.order();
        java.nio.ByteBuffer byteBuffer38 = byteBuffer13.order(byteOrder37);
        java.nio.ByteBuffer byteBuffer40 = java.nio.ByteBuffer.allocate((int) (byte) 10);
        byte[] byteArray44 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.nio.ByteBuffer byteBuffer45 = java.nio.ByteBuffer.wrap(byteArray44);
        java.nio.ByteBuffer byteBuffer46 = byteBuffer40.get(byteArray44);
        java.nio.ByteBuffer byteBuffer47 = byteBuffer40.slice();
        byte[] byteArray48 = byteBuffer47.array();
        byte[] byteArray49 = new byte[] {};
        java.nio.ByteBuffer byteBuffer50 = java.nio.ByteBuffer.wrap(byteArray49);
        java.nio.Buffer buffer51 = byteBuffer50.flip();
        java.nio.ByteBuffer byteBuffer52 = byteBuffer50.asReadOnlyBuffer();
        java.nio.ByteBuffer byteBuffer53 = byteBuffer50.duplicate();
        int int54 = byteBuffer47.compareTo(byteBuffer50);
        java.lang.String str55 = byteBuffer47.toString();
        java.nio.ByteBuffer byteBuffer57 = java.nio.ByteBuffer.allocate(0);
        boolean boolean58 = byteBuffer57.isReadOnly();
        java.nio.ShortBuffer shortBuffer59 = byteBuffer57.asShortBuffer();
        int int60 = byteBuffer57.position();
        java.nio.ByteOrder byteOrder61 = null;
        java.nio.ByteBuffer byteBuffer62 = byteBuffer57.order(byteOrder61);
        java.nio.ByteBuffer byteBuffer63 = byteBuffer57.asReadOnlyBuffer();
        int int64 = byteBuffer63.capacity();
        java.nio.ByteBuffer byteBuffer65 = byteBuffer47.put(byteBuffer63);
        byte[] byteArray66 = byteBuffer47.array();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer69 = byteBuffer13.put(byteArray66, 10, (-29));
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
        org.junit.Assert.assertNotNull(longBuffer14);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(response26);
        org.junit.Assert.assertNotNull(byteBuffer28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(shortBuffer30);
        org.junit.Assert.assertNotNull(byteBuffer32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(doubleBuffer35);
        org.junit.Assert.assertNotNull(byteOrder37);
        org.junit.Assert.assertNotNull(byteBuffer38);
        org.junit.Assert.assertNotNull(byteBuffer40);
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray44), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(byteBuffer45);
        org.junit.Assert.assertNotNull(byteBuffer46);
        org.junit.Assert.assertNotNull(byteBuffer47);
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray48), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(byteArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray49), "[]");
        org.junit.Assert.assertNotNull(byteBuffer50);
        org.junit.Assert.assertNotNull(buffer51);
        org.junit.Assert.assertNotNull(byteBuffer52);
        org.junit.Assert.assertNotNull(byteBuffer53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 7 + "'", int54 == 7);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "java.nio.HeapByteBuffer[pos=0 lim=7 cap=7]" + "'", str55, "java.nio.HeapByteBuffer[pos=0 lim=7 cap=7]");
        org.junit.Assert.assertNotNull(byteBuffer57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(shortBuffer59);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertNotNull(byteBuffer62);
        org.junit.Assert.assertNotNull(byteBuffer63);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertNotNull(byteBuffer65);
        org.junit.Assert.assertNotNull(byteArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray66), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test6644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6644");
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
        java.nio.Buffer buffer19 = byteBuffer18.mark();
        java.nio.ByteBuffer byteBuffer22 = byteBuffer18.putInt(4, (int) 'a');
        java.nio.ByteBuffer byteBuffer23 = byteBuffer22.asReadOnlyBuffer();
        java.nio.Buffer buffer24 = byteBuffer22.clear();
        java.nio.ByteBuffer byteBuffer26 = java.nio.ByteBuffer.allocate((int) (byte) 10);
        int int27 = byteBuffer26.getInt();
        java.nio.ByteBuffer byteBuffer30 = byteBuffer26.put((int) (byte) 0, (byte) 10);
        java.nio.ByteBuffer byteBuffer32 = java.nio.ByteBuffer.allocate(0);
        boolean boolean33 = byteBuffer32.isReadOnly();
        java.nio.ShortBuffer shortBuffer34 = byteBuffer32.asShortBuffer();
        java.nio.ByteBuffer byteBuffer36 = java.nio.ByteBuffer.allocate(0);
        boolean boolean37 = byteBuffer36.isReadOnly();
        int int38 = byteBuffer32.compareTo(byteBuffer36);
        java.nio.DoubleBuffer doubleBuffer39 = byteBuffer36.asDoubleBuffer();
        java.nio.FloatBuffer floatBuffer40 = byteBuffer36.asFloatBuffer();
        java.nio.ByteBuffer byteBuffer42 = java.nio.ByteBuffer.allocate((int) (byte) 10);
        byte[] byteArray46 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.nio.ByteBuffer byteBuffer47 = java.nio.ByteBuffer.wrap(byteArray46);
        java.nio.ByteBuffer byteBuffer48 = byteBuffer42.get(byteArray46);
        java.nio.ByteBuffer byteBuffer51 = byteBuffer36.put(byteArray46, 0, (int) (byte) 0);
        java.nio.ByteBuffer byteBuffer52 = java.nio.ByteBuffer.wrap(byteArray46);
        java.nio.ByteBuffer byteBuffer53 = byteBuffer26.put(byteArray46);
        java.nio.ByteBuffer byteBuffer54 = byteBuffer53.compact();
        int int55 = byteBuffer22.compareTo(byteBuffer54);
        java.nio.ByteBuffer byteBuffer58 = byteBuffer22.putInt(3, 4);
        java.nio.ByteBuffer byteBuffer60 = byteBuffer58.put((byte) -1);
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
        org.junit.Assert.assertNotNull(buffer19);
        org.junit.Assert.assertNotNull(byteBuffer22);
        org.junit.Assert.assertNotNull(byteBuffer23);
        org.junit.Assert.assertNotNull(buffer24);
        org.junit.Assert.assertNotNull(byteBuffer26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(byteBuffer30);
        org.junit.Assert.assertNotNull(byteBuffer32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(shortBuffer34);
        org.junit.Assert.assertNotNull(byteBuffer36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(doubleBuffer39);
        org.junit.Assert.assertNotNull(floatBuffer40);
        org.junit.Assert.assertNotNull(byteBuffer42);
        org.junit.Assert.assertNotNull(byteArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray46), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(byteBuffer47);
        org.junit.Assert.assertNotNull(byteBuffer48);
        org.junit.Assert.assertNotNull(byteBuffer51);
        org.junit.Assert.assertNotNull(byteBuffer52);
        org.junit.Assert.assertNotNull(byteBuffer53);
        org.junit.Assert.assertNotNull(byteBuffer54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 32 + "'", int55 == 32);
        org.junit.Assert.assertNotNull(byteBuffer58);
        org.junit.Assert.assertNotNull(byteBuffer60);
    }

    @Test
    public void test6645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6645");
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
        java.lang.String str15 = response13.header("java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]");
        org.junit.Assert.assertNull(byteBuffer4);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(uRL10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test6646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6646");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate((int) (byte) 10);
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.nio.ByteBuffer byteBuffer6 = java.nio.ByteBuffer.wrap(byteArray5);
        java.nio.ByteBuffer byteBuffer7 = byteBuffer1.get(byteArray5);
        java.nio.ByteBuffer byteBuffer9 = java.nio.ByteBuffer.allocate((int) (byte) 100);
        java.nio.ByteBuffer byteBuffer11 = byteBuffer9.putDouble((double) '4');
        byte[] byteArray17 = new byte[] { (byte) 1, (byte) 100, (byte) -1, (byte) 10, (byte) -1 };
        java.nio.ByteBuffer byteBuffer18 = byteBuffer9.put(byteArray17);
        char char19 = byteBuffer18.getChar();
        java.nio.ByteBuffer byteBuffer20 = byteBuffer18.slice();
        java.nio.FloatBuffer floatBuffer21 = byteBuffer20.asFloatBuffer();
        boolean boolean22 = byteBuffer20.isDirect();
        int int23 = byteBuffer1.compareTo(byteBuffer20);
        java.nio.ByteBuffer byteBuffer25 = byteBuffer1.putChar('a');
        // The following exception was thrown during execution in test generation
        try {
            long long27 = byteBuffer25.getLong(21);
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
        org.junit.Assert.assertNotNull(byteBuffer11);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[1, 100, -1, 10, -1]");
        org.junit.Assert.assertNotNull(byteBuffer18);
        org.junit.Assert.assertTrue("'" + char19 + "' != '" + '\000' + "'", char19 == '\000');
        org.junit.Assert.assertNotNull(byteBuffer20);
        org.junit.Assert.assertNotNull(floatBuffer21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-78) + "'", int23 == (-78));
        org.junit.Assert.assertNotNull(byteBuffer25);
    }

    @Test
    public void test6647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6647");
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
        response11.statusCode = '4';
        response11.executed = false;
        org.junit.Assert.assertNull(byteBuffer4);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(uRL8);
    }

    @Test
    public void test6648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6648");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean3 = response2.executed;
        java.lang.String str5 = response2.getHeaderCaseInsensitive("");
        java.lang.String str7 = response2.cookie("java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]");
        org.jsoup.Connection.Response response10 = response2.cookie("hi!", "");
        response2.contentType = "java.nio.HeapByteBuffer[pos=0 lim=32 cap=32]";
        java.lang.String str14 = response2.header("java.nio.HeapByteBuffer[pos=0 lim=32 cap=32]");
        int int15 = response2.numRedirects;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test6649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6649");
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
        java.lang.String str16 = response15.contentType;
        java.lang.String str17 = response15.statusMessage();
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response(response15);
        org.junit.Assert.assertNull(byteBuffer4);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(uRL8);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test6650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6650");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.header("");
        org.jsoup.Connection.Response response5 = response1.removeCookie("hi!");
        java.lang.String str7 = response1.cookie("");
        java.lang.String str8 = response1.statusMessage();
        int int9 = response1.statusCode;
        java.util.Map<java.lang.String, java.lang.String> strMap10 = response1.headers();
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str12 = response1.contentType;
        int int13 = response1.statusCode;
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str15 = response14.statusMessage;
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response14);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test6651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6651");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate((int) ' ');
        java.nio.Buffer buffer2 = byteBuffer1.rewind();
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.compact();
        java.nio.ByteBuffer byteBuffer4 = byteBuffer3.slice();
        java.nio.Buffer buffer6 = byteBuffer3.limit(9);
        java.nio.ByteBuffer byteBuffer7 = byteBuffer3.duplicate();
        java.nio.ByteBuffer byteBuffer8 = byteBuffer3.slice();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer10 = byteBuffer3.putInt((int) '4');
            org.junit.Assert.fail("Expected exception of type java.nio.BufferOverflowException; message: null");
        } catch (java.nio.BufferOverflowException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(buffer2);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertNotNull(buffer6);
        org.junit.Assert.assertNotNull(byteBuffer7);
        org.junit.Assert.assertNotNull(byteBuffer8);
    }

    @Test
    public void test6652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6652");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate((int) ' ');
        int int3 = byteBuffer1.getInt((int) (short) 0);
        long long4 = byteBuffer1.getLong();
        java.nio.ByteBuffer byteBuffer7 = byteBuffer1.putShort(1, (short) 13312);
        java.nio.ByteBuffer byteBuffer9 = java.nio.ByteBuffer.allocate(0);
        boolean boolean10 = byteBuffer9.hasRemaining();
        java.nio.ByteBuffer byteBuffer11 = byteBuffer9.asReadOnlyBuffer();
        boolean boolean12 = byteBuffer11.hasRemaining();
        java.nio.ByteBuffer byteBuffer14 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer15 = byteBuffer14.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer16 = byteBuffer14.asShortBuffer();
        java.nio.ByteBuffer byteBuffer17 = byteBuffer14.compact();
        java.nio.ByteOrder byteOrder18 = byteBuffer17.order();
        java.nio.ByteBuffer byteBuffer19 = byteBuffer11.order(byteOrder18);
        int int20 = byteBuffer19.position();
        java.nio.ByteBuffer byteBuffer22 = java.nio.ByteBuffer.allocate((int) (byte) 10);
        int int23 = byteBuffer22.getInt();
        java.nio.ByteBuffer byteBuffer26 = byteBuffer22.put((int) (byte) 0, (byte) 10);
        java.nio.IntBuffer intBuffer27 = byteBuffer22.asIntBuffer();
        java.nio.Buffer buffer28 = byteBuffer22.mark();
        java.nio.Buffer buffer29 = byteBuffer22.flip();
        java.nio.Buffer buffer30 = byteBuffer22.mark();
        java.nio.ByteBuffer byteBuffer32 = java.nio.ByteBuffer.allocate(0);
        boolean boolean33 = byteBuffer32.isReadOnly();
        java.nio.ShortBuffer shortBuffer34 = byteBuffer32.asShortBuffer();
        java.nio.ByteBuffer byteBuffer36 = java.nio.ByteBuffer.allocate(0);
        boolean boolean37 = byteBuffer36.isReadOnly();
        int int38 = byteBuffer32.compareTo(byteBuffer36);
        java.nio.ByteBuffer byteBuffer39 = byteBuffer36.compact();
        java.nio.ByteBuffer byteBuffer41 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer42 = byteBuffer41.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer43 = byteBuffer41.asShortBuffer();
        byte[] byteArray44 = byteBuffer41.array();
        java.nio.ByteBuffer byteBuffer45 = java.nio.ByteBuffer.wrap(byteArray44);
        java.nio.ByteBuffer byteBuffer46 = byteBuffer36.put(byteArray44);
        java.nio.ByteBuffer byteBuffer47 = byteBuffer22.put(byteArray44);
        java.nio.ByteBuffer byteBuffer48 = byteBuffer19.get(byteArray44);
        java.nio.ByteBuffer byteBuffer49 = byteBuffer7.get(byteArray44);
        java.nio.ByteBuffer byteBuffer51 = byteBuffer49.put((byte) 1);
        byte[] byteArray52 = byteBuffer49.array();
        int int53 = byteBuffer49.capacity();
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(byteBuffer7);
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(byteBuffer11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(byteBuffer14);
        org.junit.Assert.assertNotNull(doubleBuffer15);
        org.junit.Assert.assertNotNull(shortBuffer16);
        org.junit.Assert.assertNotNull(byteBuffer17);
        org.junit.Assert.assertNotNull(byteOrder18);
        org.junit.Assert.assertNotNull(byteBuffer19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(byteBuffer22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(byteBuffer26);
        org.junit.Assert.assertNotNull(intBuffer27);
        org.junit.Assert.assertNotNull(buffer28);
        org.junit.Assert.assertNotNull(buffer29);
        org.junit.Assert.assertNotNull(buffer30);
        org.junit.Assert.assertNotNull(byteBuffer32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(shortBuffer34);
        org.junit.Assert.assertNotNull(byteBuffer36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(byteBuffer39);
        org.junit.Assert.assertNotNull(byteBuffer41);
        org.junit.Assert.assertNotNull(doubleBuffer42);
        org.junit.Assert.assertNotNull(shortBuffer43);
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray44), "[]");
        org.junit.Assert.assertNotNull(byteBuffer45);
        org.junit.Assert.assertNotNull(byteBuffer46);
        org.junit.Assert.assertNotNull(byteBuffer47);
        org.junit.Assert.assertNotNull(byteBuffer48);
        org.junit.Assert.assertNotNull(byteBuffer49);
        org.junit.Assert.assertNotNull(byteBuffer51);
        org.junit.Assert.assertNotNull(byteArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray52), "[0, 52, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 32 + "'", int53 == 32);
    }

    @Test
    public void test6653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6653");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.isReadOnly();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        int int4 = byteBuffer1.position();
        boolean boolean5 = byteBuffer1.isReadOnly();
        java.nio.Buffer buffer6 = byteBuffer1.clear();
        java.nio.IntBuffer intBuffer7 = byteBuffer1.asIntBuffer();
        // The following exception was thrown during execution in test generation
        try {
            double double8 = byteBuffer1.getDouble();
            org.junit.Assert.fail("Expected exception of type java.nio.BufferUnderflowException; message: null");
        } catch (java.nio.BufferUnderflowException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(shortBuffer3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(buffer6);
        org.junit.Assert.assertNotNull(intBuffer7);
    }

    @Test
    public void test6654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6654");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.isReadOnly();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        int int4 = byteBuffer1.position();
        java.nio.ByteOrder byteOrder5 = null;
        java.nio.ByteBuffer byteBuffer6 = byteBuffer1.order(byteOrder5);
        java.nio.ByteBuffer byteBuffer7 = byteBuffer1.asReadOnlyBuffer();
        int int8 = byteBuffer7.position();
        // The following exception was thrown during execution in test generation
        try {
            double double10 = byteBuffer7.getDouble(22);
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
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test6655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6655");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect((int) '#');
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.putShort((short) 0);
        java.nio.ByteOrder byteOrder4 = byteBuffer3.order();
        java.nio.ByteBuffer byteBuffer7 = byteBuffer3.put(0, (byte) 0);
        boolean boolean8 = byteBuffer3.hasRemaining();
        java.nio.ByteOrder byteOrder9 = byteBuffer3.order();
        int int10 = byteBuffer3.capacity();
        short short11 = byteBuffer3.getShort();
        java.nio.ByteBuffer byteBuffer13 = byteBuffer3.putFloat((float) '\u0a00');
        java.nio.ByteBuffer byteBuffer15 = byteBuffer13.putFloat((float) 3);
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertNotNull(byteOrder4);
        org.junit.Assert.assertNotNull(byteBuffer7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(byteOrder9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + short11 + "' != '" + (short) 0 + "'", short11 == (short) 0);
        org.junit.Assert.assertNotNull(byteBuffer13);
        org.junit.Assert.assertNotNull(byteBuffer15);
    }

    @Test
    public void test6656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6656");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request3 = response2.req;
        org.jsoup.Connection.Method method4 = response2.method();
        java.lang.String str5 = response2.contentType;
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response2);
        boolean boolean8 = response2.hasHeader("java.nio.HeapByteBufferR[pos=4 lim=10 cap=10]");
        org.junit.Assert.assertNull(request3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test6657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6657");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.nio.ByteBuffer byteBuffer4 = response3.byteData;
        java.net.URL uRL5 = response3.url();
        response3.statusMessage = "java.nio.HeapByteBuffer[pos=0 lim=32 cap=32]";
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response3);
        java.net.HttpURLConnection httpURLConnection9 = null;
        org.jsoup.helper.HttpConnection.Response response10 = null;
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response10);
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response10);
        boolean boolean13 = response12.executed;
        java.lang.String str15 = response12.getHeaderCaseInsensitive("");
        java.lang.String str17 = response12.cookie("java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]");
        int int18 = response12.statusCode();
        org.jsoup.Connection.Response response21 = response12.cookie("hi!", "");
        int int22 = response12.statusCode;
        org.jsoup.helper.HttpConnection.Response response23 = new org.jsoup.helper.HttpConnection.Response(response12);
        java.lang.String str25 = response23.getHeaderCaseInsensitive("java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]");
        org.jsoup.helper.HttpConnection.Response response26 = new org.jsoup.helper.HttpConnection.Response(response23);
        org.jsoup.helper.HttpConnection.Response response27 = new org.jsoup.helper.HttpConnection.Response(response23);
        response27.numRedirects = (byte) -1;
        response27.statusMessage = "java.nio.DirectByteBuffer[pos=33 lim=35 cap=35]";
        response27.contentType = "java.nio.DirectByteBuffer[pos=13 lim=35 cap=35]";
        // The following exception was thrown during execution in test generation
        try {
            response3.setupFromConnection(httpURLConnection9, (org.jsoup.Connection.Response) response27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(byteBuffer4);
        org.junit.Assert.assertNull(uRL5);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(response21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNull(str25);
    }

    @Test
    public void test6658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6658");
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
        int int16 = byteBuffer13.remaining();
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
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test6659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6659");
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
        java.nio.ByteBuffer byteBuffer31 = byteBuffer27.putInt(2, (int) (short) 10);
        java.nio.ByteBuffer byteBuffer32 = byteBuffer31.compact();
        java.nio.ByteBuffer byteBuffer34 = java.nio.ByteBuffer.allocate(0);
        boolean boolean35 = byteBuffer34.isReadOnly();
        java.nio.ShortBuffer shortBuffer36 = byteBuffer34.asShortBuffer();
        java.nio.ByteBuffer byteBuffer37 = byteBuffer34.duplicate();
        java.nio.ByteBuffer byteBuffer38 = byteBuffer34.slice();
        java.nio.Buffer buffer39 = byteBuffer34.mark();
        org.jsoup.helper.HttpConnection.Response response40 = null;
        org.jsoup.helper.HttpConnection.Response response41 = new org.jsoup.helper.HttpConnection.Response(response40);
        org.jsoup.helper.HttpConnection.Response response42 = new org.jsoup.helper.HttpConnection.Response(response40);
        org.jsoup.helper.HttpConnection.Response response43 = new org.jsoup.helper.HttpConnection.Response(response40);
        org.jsoup.helper.HttpConnection.Response response44 = new org.jsoup.helper.HttpConnection.Response(response40);
        org.jsoup.helper.HttpConnection.Response response45 = new org.jsoup.helper.HttpConnection.Response(response40);
        java.nio.ByteBuffer byteBuffer47 = java.nio.ByteBuffer.allocate(0);
        boolean boolean48 = byteBuffer47.hasRemaining();
        java.nio.ByteBuffer byteBuffer49 = byteBuffer47.asReadOnlyBuffer();
        boolean boolean50 = byteBuffer49.hasRemaining();
        response45.byteData = byteBuffer49;
        java.nio.Buffer buffer52 = byteBuffer49.mark();
        java.nio.ByteOrder byteOrder53 = byteBuffer49.order();
        java.nio.ByteBuffer byteBuffer54 = byteBuffer34.order(byteOrder53);
        java.nio.ByteBuffer byteBuffer56 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer57 = byteBuffer56.asDoubleBuffer();
        boolean boolean58 = byteBuffer56.isDirect();
        java.nio.ByteBuffer byteBuffer60 = java.nio.ByteBuffer.allocate(0);
        boolean boolean61 = byteBuffer60.isReadOnly();
        java.nio.ShortBuffer shortBuffer62 = byteBuffer60.asShortBuffer();
        java.nio.ByteBuffer byteBuffer64 = java.nio.ByteBuffer.allocate(0);
        boolean boolean65 = byteBuffer64.isReadOnly();
        int int66 = byteBuffer60.compareTo(byteBuffer64);
        java.nio.Buffer buffer67 = byteBuffer64.clear();
        java.nio.ByteBuffer byteBuffer69 = java.nio.ByteBuffer.allocate(0);
        boolean boolean70 = byteBuffer69.hasRemaining();
        java.nio.ByteBuffer byteBuffer71 = byteBuffer64.put(byteBuffer69);
        java.nio.ByteBuffer byteBuffer72 = byteBuffer64.slice();
        java.nio.ByteBuffer byteBuffer73 = byteBuffer56.put(byteBuffer72);
        byte[] byteArray74 = byteBuffer72.array();
        java.nio.ByteBuffer byteBuffer75 = byteBuffer54.put(byteArray74);
        java.nio.ByteBuffer byteBuffer76 = byteBuffer31.get(byteArray74);
        java.nio.LongBuffer longBuffer77 = byteBuffer76.asLongBuffer();
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
        org.junit.Assert.assertNotNull(byteBuffer31);
        org.junit.Assert.assertNotNull(byteBuffer32);
        org.junit.Assert.assertNotNull(byteBuffer34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(shortBuffer36);
        org.junit.Assert.assertNotNull(byteBuffer37);
        org.junit.Assert.assertNotNull(byteBuffer38);
        org.junit.Assert.assertNotNull(buffer39);
        org.junit.Assert.assertNotNull(byteBuffer47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(byteBuffer49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(buffer52);
        org.junit.Assert.assertNotNull(byteOrder53);
        org.junit.Assert.assertNotNull(byteBuffer54);
        org.junit.Assert.assertNotNull(byteBuffer56);
        org.junit.Assert.assertNotNull(doubleBuffer57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(byteBuffer60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(shortBuffer62);
        org.junit.Assert.assertNotNull(byteBuffer64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertNotNull(buffer67);
        org.junit.Assert.assertNotNull(byteBuffer69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(byteBuffer71);
        org.junit.Assert.assertNotNull(byteBuffer72);
        org.junit.Assert.assertNotNull(byteBuffer73);
        org.junit.Assert.assertNotNull(byteArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray74), "[]");
        org.junit.Assert.assertNotNull(byteBuffer75);
        org.junit.Assert.assertNotNull(byteBuffer76);
        org.junit.Assert.assertNotNull(longBuffer77);
    }

    @Test
    public void test6660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6660");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.nio.ByteBuffer byteBuffer4 = response3.byteData;
        org.jsoup.Connection.Response response7 = response3.cookie("hi!", "");
        java.net.URL uRL8 = response3.url();
        boolean boolean10 = response3.hasHeader("java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]");
        java.lang.String str11 = response3.contentType;
        java.nio.ByteBuffer byteBuffer13 = java.nio.ByteBuffer.allocateDirect((int) '#');
        java.nio.ByteBuffer byteBuffer15 = byteBuffer13.putShort((short) 0);
        java.nio.ByteBuffer byteBuffer18 = byteBuffer15.putShort(0, (short) (byte) 10);
        java.nio.ByteBuffer byteBuffer20 = java.nio.ByteBuffer.allocate((int) (byte) 10);
        byte[] byteArray24 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.nio.ByteBuffer byteBuffer25 = java.nio.ByteBuffer.wrap(byteArray24);
        java.nio.ByteBuffer byteBuffer26 = byteBuffer20.get(byteArray24);
        java.nio.Buffer buffer27 = byteBuffer20.rewind();
        java.nio.ByteOrder byteOrder28 = byteBuffer20.order();
        java.nio.ByteBuffer byteBuffer29 = byteBuffer18.order(byteOrder28);
        boolean boolean30 = byteBuffer18.hasRemaining();
        java.nio.FloatBuffer floatBuffer31 = byteBuffer18.asFloatBuffer();
        response3.byteData = byteBuffer18;
        byte byte34 = byteBuffer18.get(1);
        java.nio.ByteBuffer byteBuffer37 = byteBuffer18.putInt((int) (byte) 1, 167772160);
        java.nio.Buffer buffer38 = byteBuffer18.mark();
        org.junit.Assert.assertNull(byteBuffer4);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(uRL8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(byteBuffer13);
        org.junit.Assert.assertNotNull(byteBuffer15);
        org.junit.Assert.assertNotNull(byteBuffer18);
        org.junit.Assert.assertNotNull(byteBuffer20);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(byteBuffer25);
        org.junit.Assert.assertNotNull(byteBuffer26);
        org.junit.Assert.assertNotNull(buffer27);
        org.junit.Assert.assertNotNull(byteOrder28);
        org.junit.Assert.assertNotNull(byteBuffer29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(floatBuffer31);
        org.junit.Assert.assertTrue("'" + byte34 + "' != '" + (byte) 10 + "'", byte34 == (byte) 10);
        org.junit.Assert.assertNotNull(byteBuffer37);
        org.junit.Assert.assertNotNull(buffer38);
    }

    @Test
    public void test6661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6661");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.header("");
        org.jsoup.Connection.Response response5 = response1.removeCookie("hi!");
        java.lang.String str7 = response1.cookie("");
        java.lang.String str8 = response1.statusMessage();
        int int9 = response1.statusCode;
        int int10 = response1.statusCode();
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response1);
        int int12 = response11.statusCode;
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response11);
        int int14 = response13.numRedirects;
        java.util.Map<java.lang.String, java.lang.String> strMap15 = response13.cookies();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertNotNull(strMap15);
    }

    @Test
    public void test6662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6662");
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
        boolean boolean22 = byteBuffer13.isReadOnly();
        java.nio.FloatBuffer floatBuffer23 = byteBuffer13.asFloatBuffer();
        boolean boolean24 = byteBuffer13.hasRemaining();
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(floatBuffer23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test6663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6663");
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
        short short28 = byteBuffer16.getShort();
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
        org.junit.Assert.assertTrue("'" + short28 + "' != '" + (short) 0 + "'", short28 == (short) 0);
    }

    @Test
    public void test6664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6664");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect((int) '#');
        java.nio.ByteOrder byteOrder2 = byteBuffer1.order();
        java.nio.Buffer buffer3 = byteBuffer1.flip();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer5 = byteBuffer1.putDouble((double) 167772160);
            org.junit.Assert.fail("Expected exception of type java.nio.BufferOverflowException; message: null");
        } catch (java.nio.BufferOverflowException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteOrder2);
        org.junit.Assert.assertNotNull(buffer3);
    }

    @Test
    public void test6665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6665");
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
        org.jsoup.helper.HttpConnection.Response response20 = new org.jsoup.helper.HttpConnection.Response(response14);
        org.junit.Assert.assertNull(byteBuffer4);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(request9);
        org.junit.Assert.assertNotNull(response19);
    }

    @Test
    public void test6666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6666");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.nio.ByteBuffer byteBuffer4 = response3.byteData;
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response3);
        response3.contentType = "hi!";
        java.lang.String str9 = response3.cookie("hi!");
        java.lang.String str11 = response3.header("hi!");
        java.lang.String str13 = response3.cookie("java.nio.HeapByteBuffer[pos=3 lim=32 cap=32]");
        org.jsoup.Connection.Response response16 = response3.cookie("java.nio.HeapByteBuffer[pos=9 lim=9 cap=32]", "java.nio.HeapByteBuffer[pos=7 lim=10 cap=10]");
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response3);
        org.junit.Assert.assertNull(byteBuffer4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(response16);
    }

    @Test
    public void test6667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6667");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean3 = response2.executed;
        java.lang.String str5 = response2.getHeaderCaseInsensitive("");
        java.net.URL uRL6 = response2.url();
        org.jsoup.Connection.Response response9 = response2.cookie("java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]", "java.nio.HeapByteBuffer[pos=0 lim=32 cap=32]");
        java.lang.String str10 = response2.statusMessage;
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response2);
        response11.charset = "java.nio.HeapByteBuffer[pos=2 lim=10 cap=10]";
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response11);
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response11);
        org.jsoup.Connection.Method method16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response17 = response15.method(method16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test6668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6668");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate((int) (byte) 10);
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.nio.ByteBuffer byteBuffer6 = java.nio.ByteBuffer.wrap(byteArray5);
        java.nio.ByteBuffer byteBuffer7 = byteBuffer1.get(byteArray5);
        java.nio.ByteBuffer byteBuffer8 = byteBuffer1.slice();
        java.nio.ByteBuffer byteBuffer10 = java.nio.ByteBuffer.allocateDirect((int) '#');
        java.nio.ByteBuffer byteBuffer12 = byteBuffer10.putShort((short) 0);
        java.nio.ByteBuffer byteBuffer15 = byteBuffer12.putShort(0, (short) (byte) 10);
        short short17 = byteBuffer12.getShort((int) (byte) 10);
        java.nio.ByteBuffer byteBuffer19 = java.nio.ByteBuffer.allocate(0);
        boolean boolean20 = byteBuffer19.isReadOnly();
        java.nio.ShortBuffer shortBuffer21 = byteBuffer19.asShortBuffer();
        java.nio.ByteBuffer byteBuffer23 = java.nio.ByteBuffer.allocate(0);
        boolean boolean24 = byteBuffer23.isReadOnly();
        int int25 = byteBuffer19.compareTo(byteBuffer23);
        java.nio.Buffer buffer26 = byteBuffer23.clear();
        java.nio.ByteBuffer byteBuffer28 = java.nio.ByteBuffer.allocate(0);
        boolean boolean29 = byteBuffer28.hasRemaining();
        java.nio.ByteBuffer byteBuffer30 = byteBuffer23.put(byteBuffer28);
        java.nio.ByteBuffer byteBuffer32 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer33 = byteBuffer32.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer34 = byteBuffer32.asShortBuffer();
        byte[] byteArray35 = byteBuffer32.array();
        java.nio.ByteBuffer byteBuffer36 = java.nio.ByteBuffer.wrap(byteArray35);
        java.nio.ByteBuffer byteBuffer37 = byteBuffer30.put(byteArray35);
        java.nio.ByteBuffer byteBuffer38 = byteBuffer12.get(byteArray35);
        java.nio.ByteBuffer byteBuffer39 = byteBuffer8.put(byteArray35);
        java.nio.ShortBuffer shortBuffer40 = byteBuffer39.asShortBuffer();
        int int41 = byteBuffer39.position();
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(byteBuffer6);
        org.junit.Assert.assertNotNull(byteBuffer7);
        org.junit.Assert.assertNotNull(byteBuffer8);
        org.junit.Assert.assertNotNull(byteBuffer10);
        org.junit.Assert.assertNotNull(byteBuffer12);
        org.junit.Assert.assertNotNull(byteBuffer15);
        org.junit.Assert.assertTrue("'" + short17 + "' != '" + (short) 0 + "'", short17 == (short) 0);
        org.junit.Assert.assertNotNull(byteBuffer19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(shortBuffer21);
        org.junit.Assert.assertNotNull(byteBuffer23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(buffer26);
        org.junit.Assert.assertNotNull(byteBuffer28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(byteBuffer30);
        org.junit.Assert.assertNotNull(byteBuffer32);
        org.junit.Assert.assertNotNull(doubleBuffer33);
        org.junit.Assert.assertNotNull(shortBuffer34);
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray35), "[]");
        org.junit.Assert.assertNotNull(byteBuffer36);
        org.junit.Assert.assertNotNull(byteBuffer37);
        org.junit.Assert.assertNotNull(byteBuffer38);
        org.junit.Assert.assertNotNull(byteBuffer39);
        org.junit.Assert.assertNotNull(shortBuffer40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
    }

    @Test
    public void test6669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6669");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect((int) '#');
        float float3 = byteBuffer1.getFloat(1);
        java.nio.ByteBuffer byteBuffer5 = byteBuffer1.putLong((long) 10);
        byte byte6 = byteBuffer5.get();
        java.nio.ByteBuffer byteBuffer8 = byteBuffer5.putInt(3);
        java.nio.Buffer buffer9 = byteBuffer5.clear();
        int int10 = byteBuffer5.remaining();
        java.nio.ByteBuffer byteBuffer12 = byteBuffer5.putChar('4');
        java.lang.String str13 = byteBuffer5.toString();
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 0 + "'", byte6 == (byte) 0);
        org.junit.Assert.assertNotNull(byteBuffer8);
        org.junit.Assert.assertNotNull(buffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertNotNull(byteBuffer12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "java.nio.DirectByteBuffer[pos=2 lim=35 cap=35]" + "'", str13, "java.nio.DirectByteBuffer[pos=2 lim=35 cap=35]");
    }

    @Test
    public void test6670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6670");
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
        // The following exception was thrown during execution in test generation
        try {
            char char31 = byteBuffer29.getChar(35);
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
    public void test6671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6671");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.nio.ByteBuffer byteBuffer5 = response4.byteData;
        java.net.URL uRL6 = response4.url();
        java.lang.String str7 = response4.contentType;
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response4);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response9 = org.jsoup.helper.HttpConnection.Response.execute(request0, response4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(byteBuffer5);
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test6672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6672");
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
        java.nio.ByteBuffer byteBuffer27 = java.nio.ByteBuffer.allocate((int) (byte) 10);
        int int28 = byteBuffer27.limit();
        short short29 = byteBuffer27.getShort();
        java.nio.ByteBuffer byteBuffer31 = byteBuffer27.put((byte) -1);
        java.nio.IntBuffer intBuffer32 = byteBuffer31.asIntBuffer();
        java.nio.LongBuffer longBuffer33 = byteBuffer31.asLongBuffer();
        int int34 = byteBuffer16.compareTo(byteBuffer31);
        java.nio.ByteBuffer byteBuffer37 = byteBuffer16.put(70, (byte) -1);
        boolean boolean38 = byteBuffer37.hasArray();
        boolean boolean39 = byteBuffer37.hasArray();
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
        org.junit.Assert.assertNotNull(byteBuffer27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 10 + "'", int28 == 10);
        org.junit.Assert.assertTrue("'" + short29 + "' != '" + (short) 0 + "'", short29 == (short) 0);
        org.junit.Assert.assertNotNull(byteBuffer31);
        org.junit.Assert.assertNotNull(intBuffer32);
        org.junit.Assert.assertNotNull(longBuffer33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 93 + "'", int34 == 93);
        org.junit.Assert.assertNotNull(byteBuffer37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
    }

    @Test
    public void test6673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6673");
        byte[] byteArray0 = new byte[] {};
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.wrap(byteArray0);
        java.nio.Buffer buffer2 = byteBuffer1.flip();
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.asReadOnlyBuffer();
        java.lang.Class<?> wildcardClass4 = byteBuffer1.getClass();
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(buffer2);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test6674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6674");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate((int) (byte) 10);
        int int2 = byteBuffer1.getInt();
        java.nio.ByteBuffer byteBuffer5 = byteBuffer1.put((int) (byte) 0, (byte) 10);
        byte[] byteArray6 = byteBuffer5.array();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer9 = java.nio.ByteBuffer.wrap(byteArray6, 167772160, 33);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test6675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6675");
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
        java.lang.String str13 = response12.contentType();
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response12);
        int int15 = response12.numRedirects;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test6676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6676");
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
        org.jsoup.helper.HttpConnection.Response response29 = null;
        org.jsoup.helper.HttpConnection.Response response30 = new org.jsoup.helper.HttpConnection.Response(response29);
        org.jsoup.helper.HttpConnection.Response response31 = new org.jsoup.helper.HttpConnection.Response(response29);
        org.jsoup.helper.HttpConnection.Response response32 = new org.jsoup.helper.HttpConnection.Response(response29);
        java.lang.String str33 = response32.statusMessage();
        response32.contentType = "";
        java.lang.String str36 = response32.statusMessage;
        java.lang.String str37 = response32.contentType;
        java.lang.String str39 = response32.header("java.nio.HeapByteBufferR[pos=4 lim=10 cap=10]");
        boolean boolean40 = byteBuffer27.equals((java.lang.Object) str39);
        java.nio.ByteBuffer byteBuffer41 = byteBuffer27.slice();
        java.nio.IntBuffer intBuffer42 = byteBuffer41.asIntBuffer();
        java.nio.ByteBuffer byteBuffer44 = byteBuffer41.putInt(52);
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
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(byteBuffer41);
        org.junit.Assert.assertNotNull(intBuffer42);
        org.junit.Assert.assertNotNull(byteBuffer44);
    }

    @Test
    public void test6677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6677");
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
        org.jsoup.Connection.Response response30 = response25.header("java.nio.HeapByteBuffer[pos=32 lim=32 cap=32]", "java.nio.HeapByteBuffer[pos=3 lim=32 cap=32]");
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
        org.junit.Assert.assertNotNull(response30);
    }

    @Test
    public void test6678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6678");
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
        boolean boolean19 = byteBuffer18.isReadOnly();
        java.nio.LongBuffer longBuffer20 = byteBuffer18.asLongBuffer();
        java.lang.String str21 = byteBuffer18.toString();
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
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(longBuffer20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "java.nio.HeapByteBuffer[pos=2 lim=10 cap=10]" + "'", str21, "java.nio.HeapByteBuffer[pos=2 lim=10 cap=10]");
    }

    @Test
    public void test6679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6679");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request3 = response2.req;
        org.jsoup.Connection.Method method4 = response2.method();
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response2);
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response5);
        response5.charset = "java.nio.HeapByteBufferR[pos=4 lim=10 cap=10]";
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response5);
        java.lang.String str11 = response9.header("java.nio.HeapByteBuffer[pos=0 lim=2 cap=2]");
        org.junit.Assert.assertNull(request3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test6680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6680");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer2 = byteBuffer1.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        java.nio.ByteOrder byteOrder4 = null;
        java.nio.ByteBuffer byteBuffer5 = byteBuffer1.order(byteOrder4);
        java.nio.ByteBuffer byteBuffer6 = byteBuffer5.asReadOnlyBuffer();
        java.nio.Buffer buffer7 = byteBuffer5.clear();
        java.nio.DoubleBuffer doubleBuffer8 = byteBuffer5.asDoubleBuffer();
        java.nio.ByteBuffer byteBuffer10 = java.nio.ByteBuffer.allocate((int) (byte) 10);
        int int11 = byteBuffer10.limit();
        java.nio.ByteBuffer byteBuffer13 = byteBuffer10.putChar(' ');
        java.nio.ByteBuffer byteBuffer15 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer16 = byteBuffer15.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer17 = byteBuffer15.asShortBuffer();
        java.nio.ByteOrder byteOrder18 = null;
        java.nio.ByteBuffer byteBuffer19 = byteBuffer15.order(byteOrder18);
        java.nio.ByteBuffer byteBuffer21 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer22 = byteBuffer21.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer23 = byteBuffer21.asShortBuffer();
        int int24 = byteBuffer21.limit();
        byte[] byteArray25 = byteBuffer21.array();
        java.nio.ByteBuffer byteBuffer26 = byteBuffer15.put(byteArray25);
        java.nio.ByteBuffer byteBuffer27 = byteBuffer10.put(byteArray25);
        java.nio.ByteBuffer byteBuffer28 = byteBuffer5.get(byteArray25);
        java.nio.ByteBuffer byteBuffer29 = byteBuffer28.slice();
        java.nio.ByteBuffer byteBuffer30 = byteBuffer28.asReadOnlyBuffer();
        // The following exception was thrown during execution in test generation
        try {
            short short32 = byteBuffer30.getShort(0);
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
        org.junit.Assert.assertNotNull(doubleBuffer8);
        org.junit.Assert.assertNotNull(byteBuffer10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertNotNull(byteBuffer13);
        org.junit.Assert.assertNotNull(byteBuffer15);
        org.junit.Assert.assertNotNull(doubleBuffer16);
        org.junit.Assert.assertNotNull(shortBuffer17);
        org.junit.Assert.assertNotNull(byteBuffer19);
        org.junit.Assert.assertNotNull(byteBuffer21);
        org.junit.Assert.assertNotNull(doubleBuffer22);
        org.junit.Assert.assertNotNull(shortBuffer23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[]");
        org.junit.Assert.assertNotNull(byteBuffer26);
        org.junit.Assert.assertNotNull(byteBuffer27);
        org.junit.Assert.assertNotNull(byteBuffer28);
        org.junit.Assert.assertNotNull(byteBuffer29);
        org.junit.Assert.assertNotNull(byteBuffer30);
    }

    @Test
    public void test6681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6681");
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
        org.jsoup.helper.HttpConnection.Response response21 = new org.jsoup.helper.HttpConnection.Response(response1);
        response21.charset = "java.nio.DirectByteBuffer[pos=13 lim=35 cap=35]";
        org.jsoup.Connection.Response response25 = response21.removeCookie("java.nio.DirectByteBuffer[pos=8 lim=35 cap=35]");
        org.jsoup.helper.HttpConnection.Response response26 = new org.jsoup.helper.HttpConnection.Response(response21);
        org.jsoup.helper.HttpConnection.Response response27 = new org.jsoup.helper.HttpConnection.Response(response21);
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
        org.junit.Assert.assertNotNull(response25);
    }

    @Test
    public void test6682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6682");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect((int) '#');
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.putShort((short) 0);
        java.nio.ByteBuffer byteBuffer6 = byteBuffer3.putShort(0, (short) (byte) 10);
        char char7 = byteBuffer6.getChar();
        java.nio.ByteOrder byteOrder8 = byteBuffer6.order();
        java.nio.ShortBuffer shortBuffer9 = byteBuffer6.asShortBuffer();
        byte byte11 = byteBuffer6.get((int) (byte) 0);
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer6);
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '\000' + "'", char7 == '\000');
        org.junit.Assert.assertNotNull(byteOrder8);
        org.junit.Assert.assertNotNull(shortBuffer9);
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 0 + "'", byte11 == (byte) 0);
    }

    @Test
    public void test6683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6683");
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
        org.jsoup.Connection.Response response12 = response5.header("java.nio.HeapByteBuffer[pos=0 lim=7 cap=7]", "java.nio.DirectByteBuffer[pos=4 lim=35 cap=35]");
        java.nio.ByteBuffer byteBuffer14 = java.nio.ByteBuffer.allocateDirect(4);
        response5.byteData = byteBuffer14;
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNotNull(byteBuffer14);
    }

    @Test
    public void test6684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6684");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer2 = byteBuffer1.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        int int4 = byteBuffer1.limit();
        byte[] byteArray5 = byteBuffer1.array();
        java.nio.ByteBuffer byteBuffer6 = java.nio.ByteBuffer.wrap(byteArray5);
        boolean boolean7 = byteBuffer6.isDirect();
        java.nio.ByteBuffer byteBuffer9 = java.nio.ByteBuffer.allocate((int) ' ');
        java.nio.ByteBuffer byteBuffer11 = java.nio.ByteBuffer.allocate(0);
        java.nio.ByteBuffer byteBuffer12 = byteBuffer11.slice();
        java.nio.ByteBuffer byteBuffer13 = byteBuffer9.put(byteBuffer12);
        byte[] byteArray17 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.nio.ByteBuffer byteBuffer18 = java.nio.ByteBuffer.wrap(byteArray17);
        java.nio.ByteBuffer byteBuffer19 = java.nio.ByteBuffer.wrap(byteArray17);
        java.nio.ByteBuffer byteBuffer20 = java.nio.ByteBuffer.wrap(byteArray17);
        java.nio.ByteBuffer byteBuffer21 = byteBuffer13.get(byteArray17);
        java.nio.ByteOrder byteOrder22 = byteBuffer13.order();
        java.nio.ByteBuffer byteBuffer23 = byteBuffer6.order(byteOrder22);
        java.nio.Buffer buffer25 = byteBuffer6.limit(0);
        // The following exception was thrown during execution in test generation
        try {
            long long27 = byteBuffer6.getLong((int) (short) 0);
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
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertNotNull(byteBuffer11);
        org.junit.Assert.assertNotNull(byteBuffer12);
        org.junit.Assert.assertNotNull(byteBuffer13);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(byteBuffer18);
        org.junit.Assert.assertNotNull(byteBuffer19);
        org.junit.Assert.assertNotNull(byteBuffer20);
        org.junit.Assert.assertNotNull(byteBuffer21);
        org.junit.Assert.assertNotNull(byteOrder22);
        org.junit.Assert.assertNotNull(byteBuffer23);
        org.junit.Assert.assertNotNull(buffer25);
    }

    @Test
    public void test6685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6685");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.nio.ByteBuffer byteBuffer4 = response3.byteData;
        java.lang.String str5 = response3.charset;
        java.lang.String str6 = response3.contentType();
        java.lang.String str8 = response3.header("java.nio.HeapByteBuffer[pos=0 lim=32 cap=32]");
        java.net.URL uRL9 = response3.url();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry11 = response3.scanHeaders("java.nio.HeapByteBufferR[pos=0 lim=0 cap=0]");
        org.junit.Assert.assertNull(byteBuffer4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertNull(strEntry11);
    }

    @Test
    public void test6686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6686");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect((int) 'a');
        java.nio.LongBuffer longBuffer2 = byteBuffer1.asLongBuffer();
        boolean boolean3 = byteBuffer1.isReadOnly();
        int int4 = byteBuffer1.position();
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(longBuffer2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test6687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6687");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect((int) '#');
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.putShort((short) 0);
        java.nio.FloatBuffer floatBuffer4 = byteBuffer1.asFloatBuffer();
        java.nio.ByteBuffer byteBuffer6 = java.nio.ByteBuffer.allocate((int) (byte) 100);
        java.nio.ByteBuffer byteBuffer8 = byteBuffer6.putDouble((double) '4');
        byte[] byteArray14 = new byte[] { (byte) 1, (byte) 100, (byte) -1, (byte) 10, (byte) -1 };
        java.nio.ByteBuffer byteBuffer15 = byteBuffer6.put(byteArray14);
        char char16 = byteBuffer15.getChar();
        java.nio.ByteBuffer byteBuffer17 = byteBuffer15.slice();
        org.jsoup.helper.HttpConnection.Response response18 = null;
        org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response(response18);
        java.lang.String str21 = response19.header("");
        org.jsoup.Connection.Response response23 = response19.removeCookie("hi!");
        java.lang.String str25 = response19.cookie("");
        java.lang.String str26 = response19.statusMessage();
        int int27 = response19.statusCode();
        java.lang.String str28 = response19.charset;
        response19.numRedirects = (byte) 1;
        boolean boolean31 = byteBuffer15.equals((java.lang.Object) response19);
        org.jsoup.helper.HttpConnection.Response response32 = null;
        org.jsoup.helper.HttpConnection.Response response33 = new org.jsoup.helper.HttpConnection.Response(response32);
        org.jsoup.helper.HttpConnection.Response response34 = new org.jsoup.helper.HttpConnection.Response(response32);
        org.jsoup.helper.HttpConnection.Response response35 = new org.jsoup.helper.HttpConnection.Response(response32);
        org.jsoup.helper.HttpConnection.Response response36 = new org.jsoup.helper.HttpConnection.Response(response32);
        org.jsoup.helper.HttpConnection.Response response37 = new org.jsoup.helper.HttpConnection.Response(response32);
        java.nio.ByteBuffer byteBuffer39 = java.nio.ByteBuffer.allocate(0);
        boolean boolean40 = byteBuffer39.hasRemaining();
        java.nio.ByteBuffer byteBuffer41 = byteBuffer39.asReadOnlyBuffer();
        boolean boolean42 = byteBuffer41.hasRemaining();
        response37.byteData = byteBuffer41;
        java.nio.Buffer buffer44 = byteBuffer41.mark();
        java.nio.ByteOrder byteOrder45 = byteBuffer41.order();
        java.nio.ByteBuffer byteBuffer46 = byteBuffer15.order(byteOrder45);
        java.nio.ByteBuffer byteBuffer47 = byteBuffer1.order(byteOrder45);
        java.nio.ByteBuffer byteBuffer49 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer50 = byteBuffer49.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer51 = byteBuffer49.asShortBuffer();
        java.nio.ByteOrder byteOrder52 = null;
        java.nio.ByteBuffer byteBuffer53 = byteBuffer49.order(byteOrder52);
        java.nio.ShortBuffer shortBuffer54 = byteBuffer49.asShortBuffer();
        java.nio.ByteBuffer byteBuffer56 = java.nio.ByteBuffer.allocate(0);
        boolean boolean57 = byteBuffer56.isReadOnly();
        java.nio.ShortBuffer shortBuffer58 = byteBuffer56.asShortBuffer();
        java.nio.ByteBuffer byteBuffer60 = java.nio.ByteBuffer.allocate(0);
        boolean boolean61 = byteBuffer60.isReadOnly();
        int int62 = byteBuffer56.compareTo(byteBuffer60);
        java.nio.Buffer buffer63 = byteBuffer60.clear();
        java.nio.ByteBuffer byteBuffer65 = java.nio.ByteBuffer.allocate(0);
        boolean boolean66 = byteBuffer65.hasRemaining();
        java.nio.ByteBuffer byteBuffer67 = byteBuffer60.put(byteBuffer65);
        java.nio.ByteBuffer byteBuffer68 = byteBuffer67.compact();
        int int69 = byteBuffer68.limit();
        int int70 = byteBuffer68.position();
        java.nio.Buffer buffer72 = byteBuffer68.position((int) (byte) 0);
        byte[] byteArray73 = byteBuffer68.array();
        java.nio.ByteBuffer byteBuffer74 = byteBuffer49.put(byteArray73);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer77 = byteBuffer1.put(byteArray73, (int) (short) 100, (-32));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertNotNull(floatBuffer4);
        org.junit.Assert.assertNotNull(byteBuffer6);
        org.junit.Assert.assertNotNull(byteBuffer8);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[1, 100, -1, 10, -1]");
        org.junit.Assert.assertNotNull(byteBuffer15);
        org.junit.Assert.assertTrue("'" + char16 + "' != '" + '\000' + "'", char16 == '\000');
        org.junit.Assert.assertNotNull(byteBuffer17);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(response23);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(byteBuffer39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(byteBuffer41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(buffer44);
        org.junit.Assert.assertNotNull(byteOrder45);
        org.junit.Assert.assertNotNull(byteBuffer46);
        org.junit.Assert.assertNotNull(byteBuffer47);
        org.junit.Assert.assertNotNull(byteBuffer49);
        org.junit.Assert.assertNotNull(doubleBuffer50);
        org.junit.Assert.assertNotNull(shortBuffer51);
        org.junit.Assert.assertNotNull(byteBuffer53);
        org.junit.Assert.assertNotNull(shortBuffer54);
        org.junit.Assert.assertNotNull(byteBuffer56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(shortBuffer58);
        org.junit.Assert.assertNotNull(byteBuffer60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertNotNull(buffer63);
        org.junit.Assert.assertNotNull(byteBuffer65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(byteBuffer67);
        org.junit.Assert.assertNotNull(byteBuffer68);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
        org.junit.Assert.assertNotNull(buffer72);
        org.junit.Assert.assertNotNull(byteArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray73), "[]");
        org.junit.Assert.assertNotNull(byteBuffer74);
    }

    @Test
    public void test6688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6688");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean3 = response2.executed;
        java.lang.String str5 = response2.getHeaderCaseInsensitive("");
        java.lang.String str6 = response2.contentType;
        org.jsoup.Connection.Response response9 = response2.cookie("java.nio.HeapByteBuffer[pos=0 lim=7 cap=7]", "hi!");
        java.lang.String str10 = response2.charset;
        java.net.URL uRL11 = response2.url();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(uRL11);
    }

    @Test
    public void test6689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6689");
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
        java.nio.IntBuffer intBuffer23 = byteBuffer13.asIntBuffer();
        java.nio.ByteBuffer byteBuffer24 = byteBuffer13.compact();
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
        org.junit.Assert.assertNotNull(intBuffer23);
        org.junit.Assert.assertNotNull(byteBuffer24);
    }

    @Test
    public void test6690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6690");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer2 = byteBuffer1.asDoubleBuffer();
        boolean boolean3 = byteBuffer1.isDirect();
        int int4 = byteBuffer1.arrayOffset();
        java.nio.ByteBuffer byteBuffer5 = byteBuffer1.asReadOnlyBuffer();
        java.nio.IntBuffer intBuffer6 = byteBuffer5.asIntBuffer();
        java.nio.ByteBuffer byteBuffer7 = byteBuffer5.asReadOnlyBuffer();
        // The following exception was thrown during execution in test generation
        try {
            long long9 = byteBuffer7.getLong(3);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(doubleBuffer2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertNotNull(intBuffer6);
        org.junit.Assert.assertNotNull(byteBuffer7);
    }

    @Test
    public void test6691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6691");
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
            java.nio.Buffer buffer25 = byteBuffer23.position((int) (byte) 64);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: newPosition > limit: (64 > 7)");
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
    public void test6692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6692");
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
        // The following exception was thrown during execution in test generation
        try {
            long long20 = byteBuffer16.getLong(3);
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
    }

    @Test
    public void test6693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6693");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer2 = byteBuffer1.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        java.nio.ByteOrder byteOrder4 = null;
        java.nio.ByteBuffer byteBuffer5 = byteBuffer1.order(byteOrder4);
        java.nio.ByteBuffer byteBuffer6 = byteBuffer5.asReadOnlyBuffer();
        java.nio.Buffer buffer7 = byteBuffer5.clear();
        java.nio.DoubleBuffer doubleBuffer8 = byteBuffer5.asDoubleBuffer();
        java.nio.ByteBuffer byteBuffer10 = java.nio.ByteBuffer.allocate((int) (byte) 10);
        int int11 = byteBuffer10.limit();
        java.nio.ByteBuffer byteBuffer13 = byteBuffer10.putChar(' ');
        java.nio.ByteBuffer byteBuffer15 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer16 = byteBuffer15.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer17 = byteBuffer15.asShortBuffer();
        java.nio.ByteOrder byteOrder18 = null;
        java.nio.ByteBuffer byteBuffer19 = byteBuffer15.order(byteOrder18);
        java.nio.ByteBuffer byteBuffer21 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer22 = byteBuffer21.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer23 = byteBuffer21.asShortBuffer();
        int int24 = byteBuffer21.limit();
        byte[] byteArray25 = byteBuffer21.array();
        java.nio.ByteBuffer byteBuffer26 = byteBuffer15.put(byteArray25);
        java.nio.ByteBuffer byteBuffer27 = byteBuffer10.put(byteArray25);
        java.nio.ByteBuffer byteBuffer28 = byteBuffer5.get(byteArray25);
        int int29 = byteBuffer28.remaining();
        int int30 = byteBuffer28.capacity();
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(doubleBuffer2);
        org.junit.Assert.assertNotNull(shortBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertNotNull(byteBuffer6);
        org.junit.Assert.assertNotNull(buffer7);
        org.junit.Assert.assertNotNull(doubleBuffer8);
        org.junit.Assert.assertNotNull(byteBuffer10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertNotNull(byteBuffer13);
        org.junit.Assert.assertNotNull(byteBuffer15);
        org.junit.Assert.assertNotNull(doubleBuffer16);
        org.junit.Assert.assertNotNull(shortBuffer17);
        org.junit.Assert.assertNotNull(byteBuffer19);
        org.junit.Assert.assertNotNull(byteBuffer21);
        org.junit.Assert.assertNotNull(doubleBuffer22);
        org.junit.Assert.assertNotNull(shortBuffer23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[]");
        org.junit.Assert.assertNotNull(byteBuffer26);
        org.junit.Assert.assertNotNull(byteBuffer27);
        org.junit.Assert.assertNotNull(byteBuffer28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test6694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6694");
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
        java.nio.ShortBuffer shortBuffer14 = byteBuffer13.asShortBuffer();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer16 = byteBuffer13.putDouble((double) 1120010240);
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
        org.junit.Assert.assertNotNull(shortBuffer14);
    }

    @Test
    public void test6695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6695");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.nio.ByteBuffer byteBuffer4 = response3.byteData;
        org.jsoup.Connection.Response response7 = response3.cookie("hi!", "");
        java.net.URL uRL8 = response3.url();
        java.lang.String str10 = response3.getHeaderCaseInsensitive("hi!");
        int int11 = response3.numRedirects;
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response3);
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response3);
        org.junit.Assert.assertNull(byteBuffer4);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(uRL8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test6696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6696");
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
        java.net.URL uRL11 = response3.url();
        org.jsoup.Connection.Request request12 = null;
        response3.req = request12;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(request8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(uRL11);
    }

    @Test
    public void test6697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6697");
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
        java.nio.ByteBuffer byteBuffer51 = byteBuffer21.putChar(0, '\000');
        // The following exception was thrown during execution in test generation
        try {
            int int52 = byteBuffer51.getInt();
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
        org.junit.Assert.assertNotNull(byteBuffer51);
    }

    @Test
    public void test6698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6698");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.nio.ByteBuffer byteBuffer4 = response3.byteData;
        java.net.URL uRL5 = response3.url();
        java.nio.ByteBuffer byteBuffer6 = response3.byteData;
        response3.statusMessage = "java.nio.HeapByteBuffer[pos=10 lim=10 cap=10]";
        response3.executed = true;
        int int11 = response3.statusCode;
        org.junit.Assert.assertNull(byteBuffer4);
        org.junit.Assert.assertNull(uRL5);
        org.junit.Assert.assertNull(byteBuffer6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test6699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6699");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer2 = byteBuffer1.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        int int4 = byteBuffer1.limit();
        boolean boolean5 = byteBuffer1.isReadOnly();
        int int6 = byteBuffer1.arrayOffset();
        java.nio.ByteBuffer byteBuffer8 = java.nio.ByteBuffer.allocate((int) ' ');
        int int10 = byteBuffer8.getInt((int) (short) 0);
        java.nio.CharBuffer charBuffer11 = byteBuffer8.asCharBuffer();
        java.nio.ByteBuffer byteBuffer12 = byteBuffer8.slice();
        int int13 = byteBuffer1.compareTo(byteBuffer12);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer16 = byteBuffer1.putInt(0, 22);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(doubleBuffer2);
        org.junit.Assert.assertNotNull(shortBuffer3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(byteBuffer8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(charBuffer11);
        org.junit.Assert.assertNotNull(byteBuffer12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-32) + "'", int13 == (-32));
    }

    @Test
    public void test6700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6700");
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
        java.nio.ByteBuffer byteBuffer14 = java.nio.ByteBuffer.allocate(0);
        boolean boolean15 = byteBuffer14.isReadOnly();
        java.nio.ShortBuffer shortBuffer16 = byteBuffer14.asShortBuffer();
        java.nio.ByteBuffer byteBuffer17 = byteBuffer14.duplicate();
        response6.byteData = byteBuffer14;
        org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response(response6);
        org.jsoup.helper.HttpConnection.Response response20 = new org.jsoup.helper.HttpConnection.Response(response6);
        org.jsoup.helper.HttpConnection.Response response21 = new org.jsoup.helper.HttpConnection.Response(response20);
        org.jsoup.helper.HttpConnection.Response response22 = new org.jsoup.helper.HttpConnection.Response(response20);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response23 = org.jsoup.helper.HttpConnection.Response.execute(request0, response22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(byteBuffer10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(byteBuffer14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(shortBuffer16);
        org.junit.Assert.assertNotNull(byteBuffer17);
    }

    @Test
    public void test6701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6701");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer2 = byteBuffer1.asDoubleBuffer();
        java.nio.FloatBuffer floatBuffer3 = byteBuffer1.asFloatBuffer();
        boolean boolean4 = byteBuffer1.hasArray();
        java.nio.ByteBuffer byteBuffer5 = byteBuffer1.slice();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.Buffer buffer6 = byteBuffer1.reset();
            org.junit.Assert.fail("Expected exception of type java.nio.InvalidMarkException; message: null");
        } catch (java.nio.InvalidMarkException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(doubleBuffer2);
        org.junit.Assert.assertNotNull(floatBuffer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(byteBuffer5);
    }

    @Test
    public void test6702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6702");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate((int) ' ');
        int int3 = byteBuffer1.getInt((int) (short) 0);
        float float5 = byteBuffer1.getFloat((int) (short) 10);
        java.lang.String str6 = byteBuffer1.toString();
        char char8 = byteBuffer1.getChar((int) (byte) 1);
        java.nio.ByteBuffer byteBuffer10 = byteBuffer1.putLong((long) (-15));
        java.nio.ByteBuffer byteBuffer12 = java.nio.ByteBuffer.allocate((int) (byte) 10);
        short short14 = byteBuffer12.getShort(1);
        java.nio.CharBuffer charBuffer15 = byteBuffer12.asCharBuffer();
        java.nio.Buffer buffer16 = byteBuffer12.clear();
        java.nio.ByteBuffer byteBuffer17 = byteBuffer12.asReadOnlyBuffer();
        int int18 = byteBuffer1.compareTo(byteBuffer17);
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "java.nio.HeapByteBuffer[pos=0 lim=32 cap=32]" + "'", str6, "java.nio.HeapByteBuffer[pos=0 lim=32 cap=32]");
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '\000' + "'", char8 == '\000');
        org.junit.Assert.assertNotNull(byteBuffer10);
        org.junit.Assert.assertNotNull(byteBuffer12);
        org.junit.Assert.assertTrue("'" + short14 + "' != '" + (short) 0 + "'", short14 == (short) 0);
        org.junit.Assert.assertNotNull(charBuffer15);
        org.junit.Assert.assertNotNull(buffer16);
        org.junit.Assert.assertNotNull(byteBuffer17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 14 + "'", int18 == 14);
    }

    @Test
    public void test6703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6703");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.header("");
        org.jsoup.Connection.Response response5 = response1.removeCookie("hi!");
        java.lang.String str7 = response1.cookie("");
        java.lang.String str8 = response1.statusMessage();
        java.lang.String str9 = response1.charset();
        java.lang.String str10 = response1.statusMessage;
        org.jsoup.Connection.Request request11 = response1.req;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(request11);
    }

    @Test
    public void test6704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6704");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean3 = response2.executed;
        java.lang.String str5 = response2.getHeaderCaseInsensitive("");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response2);
        response6.statusCode = (-1);
        int int9 = response6.statusCode();
        response6.contentType = "java.nio.HeapByteBuffer[pos=10 lim=10 cap=10]";
        boolean boolean13 = response6.hasHeader("java.nio.DirectByteBuffer[pos=16 lim=35 cap=35]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test6705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6705");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate((int) (byte) 10);
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.nio.ByteBuffer byteBuffer6 = java.nio.ByteBuffer.wrap(byteArray5);
        java.nio.ByteBuffer byteBuffer7 = byteBuffer1.get(byteArray5);
        java.nio.Buffer buffer8 = byteBuffer1.rewind();
        java.nio.ByteBuffer byteBuffer10 = byteBuffer1.putInt((int) (short) 10);
        java.nio.ByteBuffer byteBuffer11 = byteBuffer1.asReadOnlyBuffer();
        int int12 = byteBuffer11.capacity();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer15 = byteBuffer11.putInt(7, 6);
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
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
    }

    @Test
    public void test6706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6706");
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect((-98));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Negative capacity: -98");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test6707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6707");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.nio.ByteBuffer byteBuffer4 = response3.byteData;
        java.lang.String str5 = response3.charset;
        boolean boolean7 = response3.hasCookie("hi!");
        boolean boolean9 = response3.hasHeader("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap10 = response3.cookies();
        java.lang.String str11 = response3.statusMessage();
        org.junit.Assert.assertNull(byteBuffer4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test6708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6708");
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
        boolean boolean18 = response12.hasHeader("java.nio.HeapByteBuffer[pos=7 lim=10 cap=10]");
        org.jsoup.Connection.Request request19 = response12.req;
        org.jsoup.Connection.Response response22 = response12.header("java.nio.DirectByteBuffer[pos=0 lim=33 cap=35]", "java.nio.DirectByteBuffer[pos=13 lim=35 cap=35]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(request13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(request19);
        org.junit.Assert.assertNotNull(response22);
    }

    @Test
    public void test6709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6709");
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
        boolean boolean11 = response10.executed;
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response10);
        java.lang.String str14 = response12.getHeaderCaseInsensitive("java.nio.DirectByteBuffer[pos=4 lim=35 cap=35]");
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test6710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6710");
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
        boolean boolean18 = response12.hasHeader("java.nio.HeapByteBuffer[pos=7 lim=10 cap=10]");
        java.lang.String str19 = response12.statusMessage();
        org.jsoup.helper.HttpConnection.Response response20 = new org.jsoup.helper.HttpConnection.Response(response12);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(request13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test6711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6711");
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
        response10.contentType = "hi!";
        response10.executed = true;
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response(response10);
        org.jsoup.Connection.Method method19 = response10.method();
        org.jsoup.helper.HttpConnection.Response response20 = new org.jsoup.helper.HttpConnection.Response(response10);
        org.jsoup.helper.HttpConnection.Response response21 = new org.jsoup.helper.HttpConnection.Response(response20);
        org.junit.Assert.assertNull(byteBuffer4);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(strEntry13);
        org.junit.Assert.assertNull(method19);
    }

    @Test
    public void test6712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6712");
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
        java.lang.String str17 = response15.cookie("java.nio.HeapByteBuffer[pos=1 lim=100 cap=100]");
        java.net.URL uRL18 = response15.url();
        org.junit.Assert.assertNull(byteBuffer4);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(uRL8);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(uRL18);
    }

    @Test
    public void test6713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6713");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean3 = response2.executed;
        response2.statusCode = 0;
        java.lang.String str6 = response2.contentType();
        java.lang.String str8 = response2.cookie("");
        org.jsoup.Connection.Method method9 = response2.method();
        response2.executed = false;
        java.util.Map<java.lang.String, java.lang.String> strMap12 = response2.cookies();
        boolean boolean13 = response2.executed;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test6714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6714");
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
        boolean boolean18 = byteBuffer16.hasRemaining();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer21 = byteBuffer16.putFloat(7, (float) 256L);
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
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test6715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6715");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer2 = byteBuffer1.asDoubleBuffer();
        java.nio.FloatBuffer floatBuffer3 = byteBuffer1.asFloatBuffer();
        boolean boolean4 = byteBuffer1.hasArray();
        java.nio.DoubleBuffer doubleBuffer5 = byteBuffer1.asDoubleBuffer();
        java.nio.ByteBuffer byteBuffer6 = byteBuffer1.duplicate();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer8 = byteBuffer1.put((byte) 0);
            org.junit.Assert.fail("Expected exception of type java.nio.BufferOverflowException; message: null");
        } catch (java.nio.BufferOverflowException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(doubleBuffer2);
        org.junit.Assert.assertNotNull(floatBuffer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(doubleBuffer5);
        org.junit.Assert.assertNotNull(byteBuffer6);
    }

    @Test
    public void test6716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6716");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer2 = byteBuffer1.asDoubleBuffer();
        boolean boolean3 = byteBuffer1.isDirect();
        java.lang.String str4 = byteBuffer1.toString();
        java.nio.LongBuffer longBuffer5 = byteBuffer1.asLongBuffer();
        java.nio.ByteBuffer byteBuffer6 = byteBuffer1.asReadOnlyBuffer();
        java.nio.ByteOrder byteOrder7 = byteBuffer1.order();
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(doubleBuffer2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]" + "'", str4, "java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]");
        org.junit.Assert.assertNotNull(longBuffer5);
        org.junit.Assert.assertNotNull(byteBuffer6);
        org.junit.Assert.assertNotNull(byteOrder7);
    }

    @Test
    public void test6717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6717");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean3 = response2.executed;
        java.lang.String str5 = response2.getHeaderCaseInsensitive("");
        java.net.URL uRL6 = response2.url();
        org.jsoup.Connection.Response response8 = response2.removeCookie("");
        java.lang.String str9 = response2.charset();
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response2);
        response2.executed = false;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry14 = response2.scanHeaders("");
        java.util.Map<java.lang.String, java.lang.String> strMap15 = response2.cookies();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(strEntry14);
        org.junit.Assert.assertNotNull(strMap15);
    }

    @Test
    public void test6718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6718");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.nio.ByteBuffer byteBuffer4 = response3.byteData;
        java.lang.String str5 = response3.charset;
        boolean boolean7 = response3.hasCookie("hi!");
        org.jsoup.Connection.Response response9 = response3.removeHeader("java.nio.HeapByteBuffer[pos=0 lim=32 cap=32]");
        boolean boolean11 = response3.hasCookie("java.nio.HeapByteBufferR[pos=0 lim=0 cap=0]");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = response3.hasHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(byteBuffer4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test6719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6719");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate((int) (byte) 10);
        int int2 = byteBuffer1.limit();
        java.nio.Buffer buffer3 = byteBuffer1.rewind();
        java.nio.ByteOrder byteOrder4 = byteBuffer1.order();
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(buffer3);
        org.junit.Assert.assertNotNull(byteOrder4);
    }

    @Test
    public void test6720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6720");
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
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response10);
        java.nio.ByteBuffer byteBuffer14 = java.nio.ByteBuffer.allocate(0);
        boolean boolean15 = byteBuffer14.isReadOnly();
        java.nio.ShortBuffer shortBuffer16 = byteBuffer14.asShortBuffer();
        int int17 = byteBuffer14.position();
        boolean boolean18 = byteBuffer14.isReadOnly();
        java.nio.ByteBuffer byteBuffer20 = java.nio.ByteBuffer.allocate(0);
        boolean boolean21 = byteBuffer20.isReadOnly();
        java.nio.ShortBuffer shortBuffer22 = byteBuffer20.asShortBuffer();
        int int23 = byteBuffer20.position();
        boolean boolean24 = byteBuffer20.isReadOnly();
        int int25 = byteBuffer14.compareTo(byteBuffer20);
        java.nio.ByteBuffer byteBuffer27 = java.nio.ByteBuffer.allocate(0);
        boolean boolean28 = byteBuffer27.isReadOnly();
        java.nio.ShortBuffer shortBuffer29 = byteBuffer27.asShortBuffer();
        int int30 = byteBuffer27.position();
        java.nio.ByteOrder byteOrder31 = null;
        java.nio.ByteBuffer byteBuffer32 = byteBuffer27.order(byteOrder31);
        java.nio.ByteBuffer byteBuffer33 = byteBuffer27.asReadOnlyBuffer();
        java.nio.ByteBuffer byteBuffer34 = byteBuffer14.put(byteBuffer33);
        java.nio.IntBuffer intBuffer35 = byteBuffer33.asIntBuffer();
        java.nio.IntBuffer intBuffer36 = byteBuffer33.asIntBuffer();
        int int37 = byteBuffer33.limit();
        response10.byteData = byteBuffer33;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(byteBuffer14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(shortBuffer16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(byteBuffer20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(shortBuffer22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(byteBuffer27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(shortBuffer29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(byteBuffer32);
        org.junit.Assert.assertNotNull(byteBuffer33);
        org.junit.Assert.assertNotNull(byteBuffer34);
        org.junit.Assert.assertNotNull(intBuffer35);
        org.junit.Assert.assertNotNull(intBuffer36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
    }

    @Test
    public void test6721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6721");
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
        java.nio.Buffer buffer19 = byteBuffer18.mark();
        java.nio.ByteBuffer byteBuffer22 = byteBuffer18.putInt(4, (int) 'a');
        java.nio.ByteBuffer byteBuffer24 = java.nio.ByteBuffer.allocate((int) (byte) 100);
        java.nio.ByteBuffer byteBuffer26 = byteBuffer24.putDouble((double) '4');
        byte[] byteArray32 = new byte[] { (byte) 1, (byte) 100, (byte) -1, (byte) 10, (byte) -1 };
        java.nio.ByteBuffer byteBuffer33 = byteBuffer24.put(byteArray32);
        char char34 = byteBuffer33.getChar();
        java.nio.ByteBuffer byteBuffer35 = byteBuffer33.slice();
        org.jsoup.helper.HttpConnection.Response response36 = null;
        org.jsoup.helper.HttpConnection.Response response37 = new org.jsoup.helper.HttpConnection.Response(response36);
        java.lang.String str39 = response37.header("");
        org.jsoup.Connection.Response response41 = response37.removeCookie("hi!");
        java.lang.String str43 = response37.cookie("");
        java.lang.String str44 = response37.statusMessage();
        int int45 = response37.statusCode();
        java.lang.String str46 = response37.charset;
        response37.numRedirects = (byte) 1;
        boolean boolean49 = byteBuffer33.equals((java.lang.Object) response37);
        org.jsoup.helper.HttpConnection.Response response50 = null;
        org.jsoup.helper.HttpConnection.Response response51 = new org.jsoup.helper.HttpConnection.Response(response50);
        org.jsoup.helper.HttpConnection.Response response52 = new org.jsoup.helper.HttpConnection.Response(response50);
        org.jsoup.helper.HttpConnection.Response response53 = new org.jsoup.helper.HttpConnection.Response(response50);
        org.jsoup.helper.HttpConnection.Response response54 = new org.jsoup.helper.HttpConnection.Response(response50);
        org.jsoup.helper.HttpConnection.Response response55 = new org.jsoup.helper.HttpConnection.Response(response50);
        java.nio.ByteBuffer byteBuffer57 = java.nio.ByteBuffer.allocate(0);
        boolean boolean58 = byteBuffer57.hasRemaining();
        java.nio.ByteBuffer byteBuffer59 = byteBuffer57.asReadOnlyBuffer();
        boolean boolean60 = byteBuffer59.hasRemaining();
        response55.byteData = byteBuffer59;
        java.nio.Buffer buffer62 = byteBuffer59.mark();
        java.nio.ByteOrder byteOrder63 = byteBuffer59.order();
        java.nio.ByteBuffer byteBuffer64 = byteBuffer33.order(byteOrder63);
        java.nio.ByteBuffer byteBuffer65 = byteBuffer22.order(byteOrder63);
        java.nio.ShortBuffer shortBuffer66 = byteBuffer65.asShortBuffer();
        int int67 = byteBuffer65.position();
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
        org.junit.Assert.assertNotNull(buffer19);
        org.junit.Assert.assertNotNull(byteBuffer22);
        org.junit.Assert.assertNotNull(byteBuffer24);
        org.junit.Assert.assertNotNull(byteBuffer26);
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray32), "[1, 100, -1, 10, -1]");
        org.junit.Assert.assertNotNull(byteBuffer33);
        org.junit.Assert.assertTrue("'" + char34 + "' != '" + '\000' + "'", char34 == '\000');
        org.junit.Assert.assertNotNull(byteBuffer35);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNotNull(response41);
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(byteBuffer57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(byteBuffer59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(buffer62);
        org.junit.Assert.assertNotNull(byteOrder63);
        org.junit.Assert.assertNotNull(byteBuffer64);
        org.junit.Assert.assertNotNull(byteBuffer65);
        org.junit.Assert.assertNotNull(shortBuffer66);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 2 + "'", int67 == 2);
    }

    @Test
    public void test6722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6722");
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
            java.nio.ByteBuffer byteBuffer10 = byteBuffer6.putInt(93);
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
    public void test6723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6723");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer2 = byteBuffer1.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        java.nio.ByteBuffer byteBuffer4 = byteBuffer1.compact();
        java.nio.ByteBuffer byteBuffer5 = byteBuffer1.slice();
        // The following exception was thrown during execution in test generation
        try {
            byte byte6 = byteBuffer5.get();
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
    public void test6724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6724");
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
        java.nio.LongBuffer longBuffer12 = byteBuffer11.asLongBuffer();
        boolean boolean13 = byteBuffer11.isDirect();
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
        org.junit.Assert.assertNotNull(longBuffer12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test6725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6725");
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
        java.nio.ByteBuffer byteBuffer42 = byteBuffer10.asReadOnlyBuffer();
        int int43 = byteBuffer42.position();
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
        org.junit.Assert.assertNotNull(byteBuffer42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 15 + "'", int43 == 15);
    }

    @Test
    public void test6726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6726");
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
        java.lang.String str20 = byteBuffer19.toString();
        java.nio.ByteBuffer byteBuffer22 = java.nio.ByteBuffer.allocate((int) ' ');
        java.nio.ByteBuffer byteBuffer24 = java.nio.ByteBuffer.allocate(0);
        java.nio.ByteBuffer byteBuffer25 = byteBuffer24.slice();
        java.nio.ByteBuffer byteBuffer26 = byteBuffer22.put(byteBuffer25);
        byte[] byteArray30 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.nio.ByteBuffer byteBuffer31 = java.nio.ByteBuffer.wrap(byteArray30);
        java.nio.ByteBuffer byteBuffer32 = java.nio.ByteBuffer.wrap(byteArray30);
        java.nio.ByteBuffer byteBuffer33 = java.nio.ByteBuffer.wrap(byteArray30);
        java.nio.ByteBuffer byteBuffer34 = byteBuffer26.get(byteArray30);
        java.nio.ByteBuffer byteBuffer35 = java.nio.ByteBuffer.wrap(byteArray30);
        java.nio.ByteBuffer byteBuffer36 = java.nio.ByteBuffer.wrap(byteArray30);
        java.nio.CharBuffer charBuffer37 = byteBuffer36.asCharBuffer();
        int int38 = byteBuffer19.compareTo(byteBuffer36);
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
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]" + "'", str20, "java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]");
        org.junit.Assert.assertNotNull(byteBuffer22);
        org.junit.Assert.assertNotNull(byteBuffer24);
        org.junit.Assert.assertNotNull(byteBuffer25);
        org.junit.Assert.assertNotNull(byteBuffer26);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray30), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(byteBuffer31);
        org.junit.Assert.assertNotNull(byteBuffer32);
        org.junit.Assert.assertNotNull(byteBuffer33);
        org.junit.Assert.assertNotNull(byteBuffer34);
        org.junit.Assert.assertNotNull(byteBuffer35);
        org.junit.Assert.assertNotNull(byteBuffer36);
        org.junit.Assert.assertNotNull(charBuffer37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-3) + "'", int38 == (-3));
    }

    @Test
    public void test6727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6727");
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
        org.jsoup.Connection.Method method19 = response18.method();
        org.jsoup.helper.HttpConnection.Response response20 = new org.jsoup.helper.HttpConnection.Response(response18);
        org.junit.Assert.assertNull(request3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(method19);
    }

    @Test
    public void test6728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6728");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request3 = response2.req;
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response2);
        java.lang.String str5 = response4.contentType;
        response4.contentType = "hi!";
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response4);
        org.junit.Assert.assertNull(request3);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test6729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6729");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Method method6 = response5.method();
        boolean boolean8 = response5.hasCookie("hi!");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry10 = response5.scanHeaders("");
        org.jsoup.Connection.Response response12 = response5.removeCookie("java.nio.HeapByteBuffer[pos=0 lim=3 cap=3]");
        java.lang.String str13 = response5.charset;
        java.lang.String str14 = response5.statusMessage;
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(strEntry10);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test6730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6730");
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
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response13);
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response13);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response16 = org.jsoup.helper.HttpConnection.Response.execute(request0, response13);
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
    public void test6731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6731");
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
        org.jsoup.helper.HttpConnection.Response response29 = null;
        org.jsoup.helper.HttpConnection.Response response30 = new org.jsoup.helper.HttpConnection.Response(response29);
        org.jsoup.helper.HttpConnection.Response response31 = new org.jsoup.helper.HttpConnection.Response(response29);
        org.jsoup.helper.HttpConnection.Response response32 = new org.jsoup.helper.HttpConnection.Response(response29);
        java.lang.String str33 = response32.statusMessage();
        response32.contentType = "";
        java.lang.String str36 = response32.statusMessage;
        java.lang.String str37 = response32.contentType;
        java.lang.String str39 = response32.header("java.nio.HeapByteBufferR[pos=4 lim=10 cap=10]");
        boolean boolean40 = byteBuffer27.equals((java.lang.Object) str39);
        java.nio.ByteBuffer byteBuffer42 = byteBuffer27.put((byte) -1);
        int int43 = byteBuffer42.remaining();
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
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(byteBuffer42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 30 + "'", int43 == 30);
    }

    @Test
    public void test6732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6732");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.nio.ByteBuffer byteBuffer4 = response3.byteData;
        org.jsoup.Connection.Response response7 = response3.cookie("hi!", "");
        boolean boolean8 = response3.executed;
        org.jsoup.Connection.Response response10 = response3.removeCookie("");
        java.lang.String str12 = response3.header("java.nio.HeapByteBuffer[pos=0 lim=32 cap=32]");
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response3);
        java.lang.String str15 = response13.header("hi!");
        boolean boolean17 = response13.hasHeader("java.nio.DirectByteBuffer[pos=33 lim=35 cap=35]");
        org.junit.Assert.assertNull(byteBuffer4);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test6733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6733");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer2 = byteBuffer1.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        java.nio.ByteBuffer byteBuffer4 = byteBuffer1.compact();
        java.nio.ByteBuffer byteBuffer5 = byteBuffer1.slice();
        java.nio.LongBuffer longBuffer6 = byteBuffer5.asLongBuffer();
        // The following exception was thrown during execution in test generation
        try {
            long long8 = byteBuffer5.getLong((int) (short) 8960);
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
    public void test6734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6734");
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
        java.nio.ByteBuffer byteBuffer21 = byteBuffer20.slice();
        java.nio.FloatBuffer floatBuffer22 = byteBuffer21.asFloatBuffer();
        java.nio.ByteBuffer byteBuffer24 = java.nio.ByteBuffer.allocate(0);
        boolean boolean25 = byteBuffer24.isReadOnly();
        java.nio.ShortBuffer shortBuffer26 = byteBuffer24.asShortBuffer();
        java.nio.ByteBuffer byteBuffer28 = java.nio.ByteBuffer.allocate(0);
        boolean boolean29 = byteBuffer28.isReadOnly();
        int int30 = byteBuffer24.compareTo(byteBuffer28);
        java.nio.ByteBuffer byteBuffer31 = byteBuffer28.compact();
        java.nio.ByteBuffer byteBuffer32 = byteBuffer28.slice();
        byte[] byteArray33 = byteBuffer28.array();
        java.nio.ByteBuffer byteBuffer34 = java.nio.ByteBuffer.wrap(byteArray33);
        java.nio.ByteBuffer byteBuffer35 = java.nio.ByteBuffer.wrap(byteArray33);
        java.nio.ByteBuffer byteBuffer36 = byteBuffer21.get(byteArray33);
        java.nio.DoubleBuffer doubleBuffer37 = byteBuffer21.asDoubleBuffer();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer40 = byteBuffer21.putDouble((-32), (double) 70);
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
        org.junit.Assert.assertNotNull(byteBuffer21);
        org.junit.Assert.assertNotNull(floatBuffer22);
        org.junit.Assert.assertNotNull(byteBuffer24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(shortBuffer26);
        org.junit.Assert.assertNotNull(byteBuffer28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(byteBuffer31);
        org.junit.Assert.assertNotNull(byteBuffer32);
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray33), "[]");
        org.junit.Assert.assertNotNull(byteBuffer34);
        org.junit.Assert.assertNotNull(byteBuffer35);
        org.junit.Assert.assertNotNull(byteBuffer36);
        org.junit.Assert.assertNotNull(doubleBuffer37);
    }

    @Test
    public void test6735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6735");
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
        int int13 = response1.numRedirects;
        java.nio.ByteBuffer byteBuffer14 = response1.byteData;
        int int15 = response1.statusCode;
        response1.executed = true;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNull(byteBuffer7);
        org.junit.Assert.assertNull(uRL8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(byteBuffer14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test6736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6736");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request3 = response2.req;
        org.jsoup.Connection.Method method4 = response2.method();
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response2);
        java.nio.ByteBuffer byteBuffer6 = response5.byteData;
        org.junit.Assert.assertNull(request3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(byteBuffer6);
    }

    @Test
    public void test6737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6737");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.header("");
        org.jsoup.Connection.Response response5 = response1.removeCookie("hi!");
        java.lang.String str7 = response1.cookie("");
        java.lang.String str8 = response1.statusMessage();
        int int9 = response1.statusCode;
        java.util.Map<java.lang.String, java.lang.String> strMap10 = response1.headers();
        response1.statusCode = 3;
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Response response16 = response13.header("java.nio.HeapByteBuffer[pos=3 lim=10 cap=10]", "java.nio.DirectByteBuffer[pos=13 lim=35 cap=35]");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = response13.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNotNull(response16);
    }

    @Test
    public void test6738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6738");
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
        java.nio.ByteBuffer byteBuffer29 = byteBuffer21.slice();
        java.nio.ByteBuffer byteBuffer30 = byteBuffer21.compact();
        java.nio.ByteBuffer byteBuffer31 = byteBuffer30.compact();
        boolean boolean32 = byteBuffer8.equals((java.lang.Object) byteBuffer31);
        java.nio.ByteBuffer byteBuffer33 = byteBuffer8.compact();
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
        org.junit.Assert.assertNotNull(byteBuffer30);
        org.junit.Assert.assertNotNull(byteBuffer31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(byteBuffer33);
    }

    @Test
    public void test6739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6739");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect((int) '#');
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.putShort((short) 0);
        java.nio.ByteBuffer byteBuffer5 = byteBuffer3.putDouble((double) '\000');
        float float6 = byteBuffer5.getFloat();
        float float8 = byteBuffer5.getFloat((int) (short) 10);
        java.nio.ByteBuffer byteBuffer10 = byteBuffer5.putDouble((double) (byte) 0);
        java.nio.DoubleBuffer doubleBuffer11 = byteBuffer10.asDoubleBuffer();
        java.nio.ByteBuffer byteBuffer12 = byteBuffer10.slice();
        java.nio.ByteBuffer byteBuffer14 = byteBuffer10.putFloat((float) 5);
        byte byte15 = byteBuffer14.get();
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8 == 0.0f);
        org.junit.Assert.assertNotNull(byteBuffer10);
        org.junit.Assert.assertNotNull(doubleBuffer11);
        org.junit.Assert.assertNotNull(byteBuffer12);
        org.junit.Assert.assertNotNull(byteBuffer14);
        org.junit.Assert.assertTrue("'" + byte15 + "' != '" + (byte) 0 + "'", byte15 == (byte) 0);
    }

    @Test
    public void test6740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6740");
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
        int int30 = byteBuffer29.capacity();
        // The following exception was thrown during execution in test generation
        try {
            int int31 = byteBuffer29.arrayOffset();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 35 + "'", int30 == 35);
    }

    @Test
    public void test6741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6741");
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
        java.lang.String str13 = response2.contentType;
        response2.numRedirects = 31;
        org.junit.Assert.assertNull(request3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test6742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6742");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate((int) (byte) 10);
        int int2 = byteBuffer1.limit();
        java.nio.ByteBuffer byteBuffer4 = byteBuffer1.putChar(' ');
        java.nio.ByteBuffer byteBuffer5 = byteBuffer1.asReadOnlyBuffer();
        java.nio.ByteBuffer byteBuffer7 = byteBuffer1.putLong((long) (-1));
        java.nio.ByteOrder byteOrder8 = null;
        java.nio.ByteBuffer byteBuffer9 = byteBuffer7.order(byteOrder8);
        java.nio.ByteBuffer byteBuffer10 = byteBuffer9.asReadOnlyBuffer();
        org.jsoup.helper.HttpConnection.Response response11 = null;
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response11);
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response11);
        boolean boolean14 = response13.executed;
        java.lang.String str16 = response13.getHeaderCaseInsensitive("");
        java.lang.String str18 = response13.cookie("java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]");
        int int19 = response13.statusCode();
        org.jsoup.Connection.Response response22 = response13.cookie("hi!", "");
        java.nio.ByteBuffer byteBuffer24 = java.nio.ByteBuffer.allocate(0);
        boolean boolean25 = byteBuffer24.isReadOnly();
        java.nio.ShortBuffer shortBuffer26 = byteBuffer24.asShortBuffer();
        java.nio.ByteBuffer byteBuffer28 = java.nio.ByteBuffer.allocate(0);
        boolean boolean29 = byteBuffer28.isReadOnly();
        int int30 = byteBuffer24.compareTo(byteBuffer28);
        java.nio.DoubleBuffer doubleBuffer31 = byteBuffer28.asDoubleBuffer();
        response13.byteData = byteBuffer28;
        java.nio.ByteOrder byteOrder33 = byteBuffer28.order();
        java.nio.ByteBuffer byteBuffer34 = byteBuffer9.order(byteOrder33);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer36 = byteBuffer34.putLong((long) 9);
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
        org.junit.Assert.assertNotNull(byteBuffer10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(response22);
        org.junit.Assert.assertNotNull(byteBuffer24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(shortBuffer26);
        org.junit.Assert.assertNotNull(byteBuffer28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(doubleBuffer31);
        org.junit.Assert.assertNotNull(byteOrder33);
        org.junit.Assert.assertNotNull(byteBuffer34);
    }

    @Test
    public void test6743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6743");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect((int) '#');
        float float3 = byteBuffer1.getFloat(1);
        java.nio.ByteBuffer byteBuffer5 = byteBuffer1.putLong((long) 10);
        byte byte6 = byteBuffer5.get();
        java.nio.IntBuffer intBuffer7 = byteBuffer5.asIntBuffer();
        boolean boolean8 = byteBuffer5.hasArray();
        boolean boolean9 = byteBuffer5.hasArray();
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 0 + "'", byte6 == (byte) 0);
        org.junit.Assert.assertNotNull(intBuffer7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test6744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6744");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate((int) ' ');
        int int3 = byteBuffer1.getInt((int) (short) 0);
        long long4 = byteBuffer1.getLong();
        java.nio.ByteBuffer byteBuffer7 = byteBuffer1.putShort(1, (short) 13312);
        java.nio.ByteBuffer byteBuffer9 = java.nio.ByteBuffer.allocate(0);
        boolean boolean10 = byteBuffer9.hasRemaining();
        java.nio.ByteBuffer byteBuffer11 = byteBuffer9.asReadOnlyBuffer();
        boolean boolean12 = byteBuffer11.hasRemaining();
        java.nio.ByteBuffer byteBuffer14 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer15 = byteBuffer14.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer16 = byteBuffer14.asShortBuffer();
        java.nio.ByteBuffer byteBuffer17 = byteBuffer14.compact();
        java.nio.ByteOrder byteOrder18 = byteBuffer17.order();
        java.nio.ByteBuffer byteBuffer19 = byteBuffer11.order(byteOrder18);
        int int20 = byteBuffer19.position();
        java.nio.ByteBuffer byteBuffer22 = java.nio.ByteBuffer.allocate((int) (byte) 10);
        int int23 = byteBuffer22.getInt();
        java.nio.ByteBuffer byteBuffer26 = byteBuffer22.put((int) (byte) 0, (byte) 10);
        java.nio.IntBuffer intBuffer27 = byteBuffer22.asIntBuffer();
        java.nio.Buffer buffer28 = byteBuffer22.mark();
        java.nio.Buffer buffer29 = byteBuffer22.flip();
        java.nio.Buffer buffer30 = byteBuffer22.mark();
        java.nio.ByteBuffer byteBuffer32 = java.nio.ByteBuffer.allocate(0);
        boolean boolean33 = byteBuffer32.isReadOnly();
        java.nio.ShortBuffer shortBuffer34 = byteBuffer32.asShortBuffer();
        java.nio.ByteBuffer byteBuffer36 = java.nio.ByteBuffer.allocate(0);
        boolean boolean37 = byteBuffer36.isReadOnly();
        int int38 = byteBuffer32.compareTo(byteBuffer36);
        java.nio.ByteBuffer byteBuffer39 = byteBuffer36.compact();
        java.nio.ByteBuffer byteBuffer41 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer42 = byteBuffer41.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer43 = byteBuffer41.asShortBuffer();
        byte[] byteArray44 = byteBuffer41.array();
        java.nio.ByteBuffer byteBuffer45 = java.nio.ByteBuffer.wrap(byteArray44);
        java.nio.ByteBuffer byteBuffer46 = byteBuffer36.put(byteArray44);
        java.nio.ByteBuffer byteBuffer47 = byteBuffer22.put(byteArray44);
        java.nio.ByteBuffer byteBuffer48 = byteBuffer19.get(byteArray44);
        java.nio.ByteBuffer byteBuffer49 = byteBuffer7.get(byteArray44);
        short short51 = byteBuffer7.getShort(22);
        java.nio.ByteBuffer byteBuffer52 = byteBuffer7.slice();
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(byteBuffer7);
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(byteBuffer11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(byteBuffer14);
        org.junit.Assert.assertNotNull(doubleBuffer15);
        org.junit.Assert.assertNotNull(shortBuffer16);
        org.junit.Assert.assertNotNull(byteBuffer17);
        org.junit.Assert.assertNotNull(byteOrder18);
        org.junit.Assert.assertNotNull(byteBuffer19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(byteBuffer22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(byteBuffer26);
        org.junit.Assert.assertNotNull(intBuffer27);
        org.junit.Assert.assertNotNull(buffer28);
        org.junit.Assert.assertNotNull(buffer29);
        org.junit.Assert.assertNotNull(buffer30);
        org.junit.Assert.assertNotNull(byteBuffer32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(shortBuffer34);
        org.junit.Assert.assertNotNull(byteBuffer36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(byteBuffer39);
        org.junit.Assert.assertNotNull(byteBuffer41);
        org.junit.Assert.assertNotNull(doubleBuffer42);
        org.junit.Assert.assertNotNull(shortBuffer43);
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray44), "[]");
        org.junit.Assert.assertNotNull(byteBuffer45);
        org.junit.Assert.assertNotNull(byteBuffer46);
        org.junit.Assert.assertNotNull(byteBuffer47);
        org.junit.Assert.assertNotNull(byteBuffer48);
        org.junit.Assert.assertNotNull(byteBuffer49);
        org.junit.Assert.assertTrue("'" + short51 + "' != '" + (short) 0 + "'", short51 == (short) 0);
        org.junit.Assert.assertNotNull(byteBuffer52);
    }

    @Test
    public void test6745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6745");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean3 = response2.executed;
        java.lang.String str5 = response2.getHeaderCaseInsensitive("");
        java.net.URL uRL6 = response2.url();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry8 = response2.scanHeaders("");
        response2.statusMessage = "";
        java.net.URL uRL11 = response2.url();
        java.net.URL uRL12 = response2.url();
        int int13 = response2.numRedirects;
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(strEntry8);
        org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertNull(uRL12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test6746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6746");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean3 = response2.executed;
        response2.statusCode = 0;
        java.lang.String str6 = response2.contentType();
        java.lang.String str8 = response2.cookie("");
        org.jsoup.Connection.Method method9 = response2.method();
        response2.executed = false;
        java.nio.ByteBuffer byteBuffer12 = response2.byteData;
        org.jsoup.Connection.Response response14 = response2.removeHeader("java.nio.DirectByteBuffer[pos=0 lim=33 cap=35]");
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertNull(byteBuffer12);
        org.junit.Assert.assertNotNull(response14);
    }

    @Test
    public void test6747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6747");
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
        java.nio.ByteBuffer byteBuffer18 = byteBuffer13.asReadOnlyBuffer();
        java.nio.ByteBuffer byteBuffer19 = byteBuffer18.slice();
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
        org.junit.Assert.assertNotNull(byteBuffer18);
        org.junit.Assert.assertNotNull(byteBuffer19);
    }

    @Test
    public void test6748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6748");
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
        java.lang.String str14 = response11.statusMessage();
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response11);
        java.lang.String str16 = response11.charset();
        org.junit.Assert.assertNull(byteBuffer4);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(uRL8);
        org.junit.Assert.assertNull(method12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test6749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6749");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean3 = response2.executed;
        java.lang.String str5 = response2.getHeaderCaseInsensitive("");
        java.lang.String str7 = response2.cookie("java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]");
        java.lang.String str8 = response2.contentType;
        org.jsoup.Connection.Request request9 = response2.req;
        int int10 = response2.numRedirects;
        java.lang.String str11 = response2.statusMessage;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(request9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test6750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6750");
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
            short short32 = byteBuffer30.getShort(63);
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
        org.junit.Assert.assertNotNull(byteBuffer30);
    }

    @Test
    public void test6751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6751");
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
        int int15 = response14.statusCode();
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response14);
        org.jsoup.Connection.Request request17 = null;
        response16.req = request17;
        java.util.Map<java.lang.String, java.lang.String> strMap19 = response16.headers();
        org.junit.Assert.assertNull(byteBuffer4);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(uRL10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(strMap19);
    }

    @Test
    public void test6752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6752");
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
        java.nio.ByteBuffer byteBuffer25 = java.nio.ByteBuffer.allocate((int) (byte) 10);
        byte[] byteArray29 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.nio.ByteBuffer byteBuffer30 = java.nio.ByteBuffer.wrap(byteArray29);
        java.nio.ByteBuffer byteBuffer31 = byteBuffer25.get(byteArray29);
        java.nio.ByteBuffer byteBuffer32 = byteBuffer25.slice();
        java.nio.ByteBuffer byteBuffer34 = java.nio.ByteBuffer.allocate(0);
        boolean boolean35 = byteBuffer34.isReadOnly();
        java.nio.ShortBuffer shortBuffer36 = byteBuffer34.asShortBuffer();
        java.nio.ByteBuffer byteBuffer38 = java.nio.ByteBuffer.allocate(0);
        boolean boolean39 = byteBuffer38.isReadOnly();
        int int40 = byteBuffer34.compareTo(byteBuffer38);
        java.nio.DoubleBuffer doubleBuffer41 = byteBuffer38.asDoubleBuffer();
        java.nio.FloatBuffer floatBuffer42 = byteBuffer38.asFloatBuffer();
        java.lang.String str43 = byteBuffer38.toString();
        java.nio.ByteBuffer byteBuffer44 = byteBuffer25.put(byteBuffer38);
        char char45 = byteBuffer44.getChar();
        boolean boolean46 = byteBuffer19.equals((java.lang.Object) byteBuffer44);
        java.nio.ByteBuffer byteBuffer48 = java.nio.ByteBuffer.allocateDirect((int) '#');
        java.nio.ByteBuffer byteBuffer50 = byteBuffer48.putShort((short) 0);
        java.nio.ByteBuffer byteBuffer52 = byteBuffer48.putDouble((double) '\000');
        java.nio.ByteBuffer byteBuffer54 = java.nio.ByteBuffer.allocate((int) (byte) 10);
        int int55 = byteBuffer54.getInt();
        java.nio.ByteBuffer byteBuffer58 = byteBuffer54.put((int) (byte) 0, (byte) 10);
        java.nio.IntBuffer intBuffer59 = byteBuffer54.asIntBuffer();
        byte[] byteArray63 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.nio.ByteBuffer byteBuffer64 = java.nio.ByteBuffer.wrap(byteArray63);
        java.nio.ByteBuffer byteBuffer65 = java.nio.ByteBuffer.wrap(byteArray63);
        java.nio.ByteBuffer byteBuffer66 = byteBuffer54.get(byteArray63);
        java.nio.ByteBuffer byteBuffer67 = byteBuffer52.put(byteArray63);
        java.nio.ByteBuffer byteBuffer68 = byteBuffer67.slice();
        java.nio.FloatBuffer floatBuffer69 = byteBuffer68.asFloatBuffer();
        java.nio.ByteBuffer byteBuffer71 = java.nio.ByteBuffer.allocate(0);
        boolean boolean72 = byteBuffer71.isReadOnly();
        java.nio.ShortBuffer shortBuffer73 = byteBuffer71.asShortBuffer();
        java.nio.ByteBuffer byteBuffer75 = java.nio.ByteBuffer.allocate(0);
        boolean boolean76 = byteBuffer75.isReadOnly();
        int int77 = byteBuffer71.compareTo(byteBuffer75);
        java.nio.ByteBuffer byteBuffer78 = byteBuffer75.compact();
        java.nio.ByteBuffer byteBuffer79 = byteBuffer75.slice();
        byte[] byteArray80 = byteBuffer75.array();
        java.nio.ByteBuffer byteBuffer81 = java.nio.ByteBuffer.wrap(byteArray80);
        java.nio.ByteBuffer byteBuffer82 = java.nio.ByteBuffer.wrap(byteArray80);
        java.nio.ByteBuffer byteBuffer83 = byteBuffer68.get(byteArray80);
        int int84 = byteBuffer19.compareTo(byteBuffer68);
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
        org.junit.Assert.assertNotNull(byteBuffer25);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray29), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(byteBuffer30);
        org.junit.Assert.assertNotNull(byteBuffer31);
        org.junit.Assert.assertNotNull(byteBuffer32);
        org.junit.Assert.assertNotNull(byteBuffer34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(shortBuffer36);
        org.junit.Assert.assertNotNull(byteBuffer38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(doubleBuffer41);
        org.junit.Assert.assertNotNull(floatBuffer42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]" + "'", str43, "java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]");
        org.junit.Assert.assertNotNull(byteBuffer44);
        org.junit.Assert.assertTrue("'" + char45 + "' != '" + '\000' + "'", char45 == '\000');
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(byteBuffer48);
        org.junit.Assert.assertNotNull(byteBuffer50);
        org.junit.Assert.assertNotNull(byteBuffer52);
        org.junit.Assert.assertNotNull(byteBuffer54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertNotNull(byteBuffer58);
        org.junit.Assert.assertNotNull(intBuffer59);
        org.junit.Assert.assertNotNull(byteArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray63), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(byteBuffer64);
        org.junit.Assert.assertNotNull(byteBuffer65);
        org.junit.Assert.assertNotNull(byteBuffer66);
        org.junit.Assert.assertNotNull(byteBuffer67);
        org.junit.Assert.assertNotNull(byteBuffer68);
        org.junit.Assert.assertNotNull(floatBuffer69);
        org.junit.Assert.assertNotNull(byteBuffer71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(shortBuffer73);
        org.junit.Assert.assertNotNull(byteBuffer75);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 0 + "'", int77 == 0);
        org.junit.Assert.assertNotNull(byteBuffer78);
        org.junit.Assert.assertNotNull(byteBuffer79);
        org.junit.Assert.assertNotNull(byteArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray80), "[]");
        org.junit.Assert.assertNotNull(byteBuffer81);
        org.junit.Assert.assertNotNull(byteBuffer82);
        org.junit.Assert.assertNotNull(byteBuffer83);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + (-22) + "'", int84 == (-22));
    }

    @Test
    public void test6753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6753");
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
        java.nio.Buffer buffer32 = byteBuffer30.flip();
        short short34 = byteBuffer30.getShort((int) (byte) 1);
        java.nio.ByteBuffer byteBuffer37 = byteBuffer30.putInt((int) (byte) 0, 85);
        byte byte39 = byteBuffer30.get(0);
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
        org.junit.Assert.assertNotNull(buffer32);
        org.junit.Assert.assertTrue("'" + short34 + "' != '" + (short) 0 + "'", short34 == (short) 0);
        org.junit.Assert.assertNotNull(byteBuffer37);
        org.junit.Assert.assertTrue("'" + byte39 + "' != '" + (byte) 0 + "'", byte39 == (byte) 0);
    }

    @Test
    public void test6754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6754");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str6 = response4.cookie("hi!");
        int int7 = response4.statusCode;
        org.jsoup.Connection.Response response9 = response4.removeCookie("java.nio.HeapByteBuffer[pos=0 lim=32 cap=32]");
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response4);
        java.lang.String str12 = response10.cookie("java.nio.HeapByteBuffer[pos=0 lim=7 cap=7]");
        java.lang.String str13 = response10.statusMessage;
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response10);
        java.lang.String str15 = response10.contentType;
        response10.numRedirects = 25;
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test6755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6755");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean3 = response2.executed;
        java.lang.String str5 = response2.getHeaderCaseInsensitive("");
        java.lang.String str7 = response2.cookie("java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]");
        int int8 = response2.statusCode();
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response2);
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response9);
        java.nio.ByteBuffer byteBuffer12 = java.nio.ByteBuffer.allocate(0);
        boolean boolean13 = byteBuffer12.isReadOnly();
        java.nio.ShortBuffer shortBuffer14 = byteBuffer12.asShortBuffer();
        java.nio.ByteBuffer byteBuffer16 = java.nio.ByteBuffer.allocate(0);
        boolean boolean17 = byteBuffer16.isReadOnly();
        int int18 = byteBuffer12.compareTo(byteBuffer16);
        java.nio.Buffer buffer19 = byteBuffer16.clear();
        java.nio.ByteBuffer byteBuffer21 = java.nio.ByteBuffer.allocate(0);
        boolean boolean22 = byteBuffer21.hasRemaining();
        java.nio.ByteBuffer byteBuffer23 = byteBuffer16.put(byteBuffer21);
        java.nio.ByteBuffer byteBuffer24 = byteBuffer16.slice();
        java.nio.FloatBuffer floatBuffer25 = byteBuffer16.asFloatBuffer();
        response10.byteData = byteBuffer16;
        java.net.HttpURLConnection httpURLConnection27 = null;
        org.jsoup.helper.HttpConnection.Response response28 = null;
        org.jsoup.helper.HttpConnection.Response response29 = new org.jsoup.helper.HttpConnection.Response(response28);
        java.lang.String str31 = response29.header("");
        response29.charset = "hi!";
        java.lang.String str34 = response29.statusMessage;
        // The following exception was thrown during execution in test generation
        try {
            response10.setupFromConnection(httpURLConnection27, (org.jsoup.Connection.Response) response29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(byteBuffer12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(shortBuffer14);
        org.junit.Assert.assertNotNull(byteBuffer16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(buffer19);
        org.junit.Assert.assertNotNull(byteBuffer21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(byteBuffer23);
        org.junit.Assert.assertNotNull(byteBuffer24);
        org.junit.Assert.assertNotNull(floatBuffer25);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNull(str34);
    }

    @Test
    public void test6756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6756");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer2 = byteBuffer1.asDoubleBuffer();
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.compact();
        int int4 = byteBuffer3.arrayOffset();
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(doubleBuffer2);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test6757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6757");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect((int) '#');
        float float3 = byteBuffer1.getFloat(1);
        java.nio.ByteBuffer byteBuffer5 = byteBuffer1.putLong((long) 10);
        byte byte6 = byteBuffer5.get();
        java.nio.ByteBuffer byteBuffer8 = byteBuffer5.putInt(3);
        java.nio.Buffer buffer9 = byteBuffer5.clear();
        int int10 = byteBuffer5.remaining();
        java.nio.ByteBuffer byteBuffer12 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer13 = byteBuffer12.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer14 = byteBuffer12.asShortBuffer();
        java.nio.ByteBuffer byteBuffer15 = byteBuffer12.compact();
        java.nio.ByteBuffer byteBuffer16 = byteBuffer12.slice();
        int int17 = byteBuffer12.position();
        int int18 = byteBuffer12.remaining();
        java.nio.Buffer buffer19 = byteBuffer12.mark();
        java.nio.ByteBuffer byteBuffer20 = byteBuffer5.put(byteBuffer12);
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 0 + "'", byte6 == (byte) 0);
        org.junit.Assert.assertNotNull(byteBuffer8);
        org.junit.Assert.assertNotNull(buffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertNotNull(byteBuffer12);
        org.junit.Assert.assertNotNull(doubleBuffer13);
        org.junit.Assert.assertNotNull(shortBuffer14);
        org.junit.Assert.assertNotNull(byteBuffer15);
        org.junit.Assert.assertNotNull(byteBuffer16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(buffer19);
        org.junit.Assert.assertNotNull(byteBuffer20);
    }

    @Test
    public void test6758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6758");
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
        int int17 = response2.statusCode();
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
    public void test6759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6759");
        byte[] byteArray0 = new byte[] {};
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.wrap(byteArray0);
        java.nio.ByteBuffer byteBuffer2 = byteBuffer1.asReadOnlyBuffer();
        // The following exception was thrown during execution in test generation
        try {
            short short4 = byteBuffer1.getShort(22);
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
    public void test6760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6760");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response1);
        boolean boolean4 = response3.executed;
        java.lang.String str6 = response3.getHeaderCaseInsensitive("");
        java.lang.String str8 = response3.cookie("java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]");
        int int9 = response3.statusCode();
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response3);
        response10.statusMessage = "java.nio.HeapByteBuffer[pos=0 lim=32 cap=32]";
        int int13 = response10.statusCode;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response14 = org.jsoup.helper.HttpConnection.Response.execute(request0, response10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test6761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6761");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.header("");
        org.jsoup.Connection.Response response5 = response1.removeCookie("hi!");
        java.lang.String str7 = response1.cookie("");
        java.lang.String str8 = response1.statusMessage();
        org.jsoup.Connection.Response response10 = response1.removeHeader("java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]");
        java.lang.String str11 = response1.contentType;
        boolean boolean13 = response1.hasCookie("hi!");
        int int14 = response1.statusCode();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test6762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6762");
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
        java.nio.Buffer buffer51 = byteBuffer13.rewind();
        int int52 = byteBuffer13.capacity();
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
        org.junit.Assert.assertNotNull(buffer51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
    }

    @Test
    public void test6763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6763");
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
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response12);
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response15);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test6764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6764");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean3 = response2.executed;
        java.lang.String str5 = response2.getHeaderCaseInsensitive("");
        java.net.URL uRL6 = response2.url();
        org.jsoup.Connection.Response response8 = response2.removeCookie("");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry10 = response2.scanHeaders("");
        boolean boolean11 = response2.executed;
        org.jsoup.Connection.Response response14 = response2.header("java.nio.HeapByteBuffer[pos=0 lim=100 cap=100]", "java.nio.HeapByteBuffer[pos=0 lim=100 cap=100]");
        java.lang.String str15 = response2.charset;
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(strEntry10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test6765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6765");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean3 = response2.executed;
        response2.statusCode = 0;
        java.lang.String str6 = response2.contentType();
        java.lang.String str7 = response2.statusMessage();
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response2);
        java.lang.String str10 = response8.header("hi!");
        java.nio.ByteBuffer byteBuffer11 = response8.byteData;
        java.lang.String str12 = response8.statusMessage();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test6766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6766");
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
        byte byte23 = byteBuffer22.get();
        java.nio.ByteBuffer byteBuffer25 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer26 = byteBuffer25.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer27 = byteBuffer25.asShortBuffer();
        java.nio.ByteOrder byteOrder28 = byteBuffer25.order();
        java.nio.ByteBuffer byteBuffer29 = byteBuffer22.order(byteOrder28);
        int int30 = byteBuffer29.getInt();
        // The following exception was thrown during execution in test generation
        try {
            double double32 = byteBuffer29.getDouble(10);
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
        org.junit.Assert.assertTrue("'" + byte23 + "' != '" + (byte) 0 + "'", byte23 == (byte) 0);
        org.junit.Assert.assertNotNull(byteBuffer25);
        org.junit.Assert.assertNotNull(doubleBuffer26);
        org.junit.Assert.assertNotNull(shortBuffer27);
        org.junit.Assert.assertNotNull(byteOrder28);
        org.junit.Assert.assertNotNull(byteBuffer29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test6767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6767");
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
        org.jsoup.Connection.Response response15 = response3.removeCookie("java.nio.HeapByteBuffer[pos=6 lim=10 cap=10]");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry17 = response3.scanHeaders("java.nio.HeapByteBuffer[pos=3 lim=32 cap=32]");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(request8);
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertNull(strEntry17);
    }

    @Test
    public void test6768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6768");
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
        int int22 = byteBuffer10.arrayOffset();
        short short23 = byteBuffer10.getShort();
        java.nio.ByteBuffer byteBuffer25 = byteBuffer10.putChar('a');
        java.nio.ByteBuffer byteBuffer27 = java.nio.ByteBuffer.allocate((int) (byte) 10);
        int int28 = byteBuffer27.limit();
        java.nio.ByteBuffer byteBuffer30 = byteBuffer27.putChar(' ');
        java.nio.ByteBuffer byteBuffer32 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer33 = byteBuffer32.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer34 = byteBuffer32.asShortBuffer();
        java.nio.ByteOrder byteOrder35 = null;
        java.nio.ByteBuffer byteBuffer36 = byteBuffer32.order(byteOrder35);
        java.nio.ByteBuffer byteBuffer38 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer39 = byteBuffer38.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer40 = byteBuffer38.asShortBuffer();
        int int41 = byteBuffer38.limit();
        byte[] byteArray42 = byteBuffer38.array();
        java.nio.ByteBuffer byteBuffer43 = byteBuffer32.put(byteArray42);
        java.nio.ByteBuffer byteBuffer44 = byteBuffer27.put(byteArray42);
        java.nio.ByteBuffer byteBuffer45 = byteBuffer25.put(byteArray42);
        char char46 = byteBuffer25.getChar();
        int int47 = byteBuffer25.getInt();
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + short23 + "' != '" + (short) 0 + "'", short23 == (short) 0);
        org.junit.Assert.assertNotNull(byteBuffer25);
        org.junit.Assert.assertNotNull(byteBuffer27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 10 + "'", int28 == 10);
        org.junit.Assert.assertNotNull(byteBuffer30);
        org.junit.Assert.assertNotNull(byteBuffer32);
        org.junit.Assert.assertNotNull(doubleBuffer33);
        org.junit.Assert.assertNotNull(shortBuffer34);
        org.junit.Assert.assertNotNull(byteBuffer36);
        org.junit.Assert.assertNotNull(byteBuffer38);
        org.junit.Assert.assertNotNull(doubleBuffer39);
        org.junit.Assert.assertNotNull(shortBuffer40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray42), "[]");
        org.junit.Assert.assertNotNull(byteBuffer43);
        org.junit.Assert.assertNotNull(byteBuffer44);
        org.junit.Assert.assertNotNull(byteBuffer45);
        org.junit.Assert.assertTrue("'" + char46 + "' != '" + '\000' + "'", char46 == '\000');
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
    }

    @Test
    public void test6769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6769");
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
        java.lang.String str13 = response12.charset;
        java.lang.String str14 = response12.charset;
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response12);
        org.junit.Assert.assertNull(byteBuffer4);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(request9);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test6770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6770");
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
            int int24 = byteBuffer18.getInt(12);
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
    public void test6771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6771");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect((int) 'a');
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.putFloat((float) 1L);
        java.nio.ByteBuffer byteBuffer6 = byteBuffer3.putChar(31, '\u2300');
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer6);
    }

    @Test
    public void test6772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6772");
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
        java.nio.ByteBuffer byteBuffer22 = java.nio.ByteBuffer.allocate((int) (byte) 10);
        byte[] byteArray26 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.nio.ByteBuffer byteBuffer27 = java.nio.ByteBuffer.wrap(byteArray26);
        java.nio.ByteBuffer byteBuffer28 = byteBuffer22.get(byteArray26);
        java.nio.ByteBuffer byteBuffer30 = byteBuffer22.putFloat((float) (byte) 10);
        java.nio.Buffer buffer31 = byteBuffer30.mark();
        java.nio.ByteBuffer byteBuffer33 = byteBuffer30.putShort((short) 0);
        java.nio.CharBuffer charBuffer34 = byteBuffer30.asCharBuffer();
        response5.byteData = byteBuffer30;
        org.junit.Assert.assertNotNull(byteBuffer7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(byteBuffer13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(shortBuffer15);
        org.junit.Assert.assertNotNull(byteBuffer16);
        org.junit.Assert.assertNotNull(byteBuffer20);
        org.junit.Assert.assertNotNull(byteBuffer22);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(byteBuffer27);
        org.junit.Assert.assertNotNull(byteBuffer28);
        org.junit.Assert.assertNotNull(byteBuffer30);
        org.junit.Assert.assertNotNull(buffer31);
        org.junit.Assert.assertNotNull(byteBuffer33);
        org.junit.Assert.assertNotNull(charBuffer34);
    }

    @Test
    public void test6773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6773");
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
        java.nio.ByteBuffer byteBuffer31 = java.nio.ByteBuffer.wrap(byteArray26);
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
        org.junit.Assert.assertNotNull(byteBuffer31);
    }

    @Test
    public void test6774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6774");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str4 = response3.statusMessage();
        response3.contentType = "";
        java.lang.String str7 = response3.statusMessage();
        response3.charset = "";
        java.lang.String str10 = response3.contentType;
        boolean boolean11 = response3.executed;
        java.lang.String str12 = response3.charset;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test6775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6775");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer2 = byteBuffer1.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        java.nio.ByteBuffer byteBuffer4 = byteBuffer1.compact();
        java.nio.ByteBuffer byteBuffer5 = byteBuffer1.slice();
        int int6 = byteBuffer5.arrayOffset();
        // The following exception was thrown during execution in test generation
        try {
            byte byte8 = byteBuffer5.get((int) (byte) 10);
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
    }

    @Test
    public void test6776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6776");
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
        org.jsoup.helper.HttpConnection.Response response21 = new org.jsoup.helper.HttpConnection.Response(response1);
        response21.charset = "java.nio.DirectByteBuffer[pos=13 lim=35 cap=35]";
        org.jsoup.Connection.Response response25 = response21.removeCookie("java.nio.DirectByteBuffer[pos=8 lim=35 cap=35]");
        org.jsoup.Connection.Method method26 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response27 = response21.method(method26);
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
        org.junit.Assert.assertNull(method18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(response25);
    }

    @Test
    public void test6777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6777");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer2 = byteBuffer1.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        java.nio.ByteOrder byteOrder4 = null;
        java.nio.ByteBuffer byteBuffer5 = byteBuffer1.order(byteOrder4);
        java.nio.ShortBuffer shortBuffer6 = byteBuffer1.asShortBuffer();
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
        java.nio.ByteBuffer byteBuffer20 = byteBuffer19.compact();
        int int21 = byteBuffer20.limit();
        int int22 = byteBuffer20.position();
        java.nio.Buffer buffer24 = byteBuffer20.position((int) (byte) 0);
        byte[] byteArray25 = byteBuffer20.array();
        java.nio.ByteBuffer byteBuffer26 = byteBuffer1.put(byteArray25);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.Buffer buffer27 = byteBuffer26.reset();
            org.junit.Assert.fail("Expected exception of type java.nio.InvalidMarkException; message: null");
        } catch (java.nio.InvalidMarkException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(doubleBuffer2);
        org.junit.Assert.assertNotNull(shortBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertNotNull(shortBuffer6);
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
        org.junit.Assert.assertNotNull(byteBuffer20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(buffer24);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[]");
        org.junit.Assert.assertNotNull(byteBuffer26);
    }

    @Test
    public void test6778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6778");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect((int) '#');
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.putShort((short) 0);
        java.nio.ByteBuffer byteBuffer5 = byteBuffer1.putDouble((double) '\000');
        char char6 = byteBuffer5.getChar();
        java.nio.Buffer buffer7 = byteBuffer5.clear();
        java.nio.ByteBuffer byteBuffer8 = byteBuffer5.slice();
        java.nio.ByteBuffer byteBuffer11 = byteBuffer8.putLong(1, 100L);
        int int12 = byteBuffer11.getInt();
        byte byte13 = byteBuffer11.get();
        java.nio.ByteBuffer byteBuffer16 = byteBuffer11.put(12, (byte) 10);
        long long17 = byteBuffer16.getLong();
        org.jsoup.helper.HttpConnection.Response response18 = null;
        org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response(response18);
        org.jsoup.helper.HttpConnection.Response response20 = new org.jsoup.helper.HttpConnection.Response(response18);
        org.jsoup.helper.HttpConnection.Response response21 = new org.jsoup.helper.HttpConnection.Response(response18);
        org.jsoup.helper.HttpConnection.Response response22 = new org.jsoup.helper.HttpConnection.Response(response18);
        org.jsoup.helper.HttpConnection.Response response23 = new org.jsoup.helper.HttpConnection.Response(response18);
        int int24 = response23.statusCode;
        response23.contentType = "hi!";
        java.nio.ByteBuffer byteBuffer27 = response23.byteData;
        org.jsoup.Connection.Response response30 = response23.cookie("java.nio.HeapByteBuffer[pos=0 lim=32 cap=32]", "hi!");
        int int31 = response23.statusCode();
        boolean boolean32 = byteBuffer16.equals((java.lang.Object) response23);
        org.jsoup.helper.HttpConnection.Response response33 = new org.jsoup.helper.HttpConnection.Response(response23);
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '\000' + "'", char6 == '\000');
        org.junit.Assert.assertNotNull(buffer7);
        org.junit.Assert.assertNotNull(byteBuffer8);
        org.junit.Assert.assertNotNull(byteBuffer11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) 0 + "'", byte13 == (byte) 0);
        org.junit.Assert.assertNotNull(byteBuffer16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 429496729610L + "'", long17 == 429496729610L);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNull(byteBuffer27);
        org.junit.Assert.assertNotNull(response30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test6779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6779");
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
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response12);
        org.jsoup.helper.HttpConnection.Response response14 = null;
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response14);
        java.lang.String str17 = response15.header("");
        response15.charset = "hi!";
        java.nio.ByteBuffer byteBuffer20 = null;
        response15.byteData = byteBuffer20;
        org.jsoup.Connection.Method method22 = response15.method();
        java.nio.ByteBuffer byteBuffer24 = java.nio.ByteBuffer.allocate((int) (byte) 10);
        byte[] byteArray28 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.nio.ByteBuffer byteBuffer29 = java.nio.ByteBuffer.wrap(byteArray28);
        java.nio.ByteBuffer byteBuffer30 = byteBuffer24.get(byteArray28);
        java.nio.Buffer buffer31 = byteBuffer24.rewind();
        int int32 = byteBuffer24.position();
        java.nio.Buffer buffer33 = byteBuffer24.rewind();
        response15.byteData = byteBuffer24;
        java.nio.ByteBuffer byteBuffer36 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer37 = byteBuffer36.asDoubleBuffer();
        java.nio.ByteBuffer byteBuffer38 = byteBuffer36.compact();
        java.lang.String str39 = byteBuffer36.toString();
        java.nio.LongBuffer longBuffer40 = byteBuffer36.asLongBuffer();
        java.nio.ByteBuffer byteBuffer41 = byteBuffer24.put(byteBuffer36);
        response12.byteData = byteBuffer24;
        org.jsoup.helper.HttpConnection.Response response43 = new org.jsoup.helper.HttpConnection.Response(response12);
        org.junit.Assert.assertNull(byteBuffer4);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(request9);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(method22);
        org.junit.Assert.assertNotNull(byteBuffer24);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray28), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(byteBuffer29);
        org.junit.Assert.assertNotNull(byteBuffer30);
        org.junit.Assert.assertNotNull(buffer31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(buffer33);
        org.junit.Assert.assertNotNull(byteBuffer36);
        org.junit.Assert.assertNotNull(doubleBuffer37);
        org.junit.Assert.assertNotNull(byteBuffer38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]" + "'", str39, "java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]");
        org.junit.Assert.assertNotNull(longBuffer40);
        org.junit.Assert.assertNotNull(byteBuffer41);
    }

    @Test
    public void test6780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6780");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer2 = byteBuffer1.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        int int4 = byteBuffer1.limit();
        boolean boolean5 = byteBuffer1.isReadOnly();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer8 = byteBuffer1.putLong((int) '\000', (long) (short) 255);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(doubleBuffer2);
        org.junit.Assert.assertNotNull(shortBuffer3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test6781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6781");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate((int) (byte) 10);
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.nio.ByteBuffer byteBuffer6 = java.nio.ByteBuffer.wrap(byteArray5);
        java.nio.ByteBuffer byteBuffer7 = byteBuffer1.get(byteArray5);
        java.nio.Buffer buffer8 = byteBuffer1.rewind();
        int int9 = byteBuffer1.position();
        java.nio.Buffer buffer10 = byteBuffer1.rewind();
        java.nio.ByteBuffer byteBuffer11 = byteBuffer1.slice();
        java.nio.ByteOrder byteOrder12 = byteBuffer1.order();
        java.nio.ByteBuffer byteBuffer14 = java.nio.ByteBuffer.allocateDirect((int) '#');
        java.nio.ByteBuffer byteBuffer16 = byteBuffer14.putShort((short) 0);
        java.nio.ByteBuffer byteBuffer19 = byteBuffer16.putLong(1, (long) 10);
        int int20 = byteBuffer1.compareTo(byteBuffer16);
        java.nio.Buffer buffer21 = byteBuffer1.rewind();
        java.nio.Buffer buffer22 = byteBuffer1.mark();
        java.nio.ByteBuffer byteBuffer24 = java.nio.ByteBuffer.allocate((int) (byte) 10);
        byte[] byteArray28 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.nio.ByteBuffer byteBuffer29 = java.nio.ByteBuffer.wrap(byteArray28);
        java.nio.ByteBuffer byteBuffer30 = byteBuffer24.get(byteArray28);
        java.nio.ByteBuffer byteBuffer32 = byteBuffer24.putFloat((float) (byte) 10);
        java.nio.ByteBuffer byteBuffer33 = byteBuffer32.compact();
        java.nio.ByteBuffer byteBuffer35 = java.nio.ByteBuffer.allocate(0);
        boolean boolean36 = byteBuffer35.isReadOnly();
        java.nio.ShortBuffer shortBuffer37 = byteBuffer35.asShortBuffer();
        int int38 = byteBuffer35.position();
        java.nio.ByteOrder byteOrder39 = null;
        java.nio.ByteBuffer byteBuffer40 = byteBuffer35.order(byteOrder39);
        java.nio.ByteBuffer byteBuffer41 = byteBuffer35.asReadOnlyBuffer();
        java.nio.ByteBuffer byteBuffer42 = byteBuffer41.slice();
        java.nio.ByteBuffer byteBuffer43 = byteBuffer41.duplicate();
        java.nio.ByteBuffer byteBuffer45 = java.nio.ByteBuffer.allocate((int) (byte) 10);
        byte[] byteArray49 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.nio.ByteBuffer byteBuffer50 = java.nio.ByteBuffer.wrap(byteArray49);
        java.nio.ByteBuffer byteBuffer51 = byteBuffer45.get(byteArray49);
        java.nio.Buffer buffer52 = byteBuffer45.rewind();
        java.nio.ByteOrder byteOrder53 = byteBuffer45.order();
        java.nio.ByteBuffer byteBuffer54 = byteBuffer41.order(byteOrder53);
        java.nio.ByteBuffer byteBuffer55 = byteBuffer33.order(byteOrder53);
        java.nio.ByteBuffer byteBuffer56 = byteBuffer1.order(byteOrder53);
        java.nio.Buffer buffer57 = byteBuffer56.clear();
        java.nio.ByteBuffer byteBuffer59 = java.nio.ByteBuffer.allocateDirect((int) '#');
        java.nio.ByteBuffer byteBuffer61 = byteBuffer59.putShort((short) 0);
        java.nio.ByteBuffer byteBuffer64 = byteBuffer61.putShort(0, (short) (byte) 10);
        java.nio.ByteBuffer byteBuffer66 = java.nio.ByteBuffer.allocate((int) (byte) 10);
        byte[] byteArray70 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.nio.ByteBuffer byteBuffer71 = java.nio.ByteBuffer.wrap(byteArray70);
        java.nio.ByteBuffer byteBuffer72 = byteBuffer66.get(byteArray70);
        java.nio.Buffer buffer73 = byteBuffer66.rewind();
        java.nio.ByteOrder byteOrder74 = byteBuffer66.order();
        java.nio.ByteBuffer byteBuffer75 = byteBuffer64.order(byteOrder74);
        java.nio.ByteOrder byteOrder76 = byteBuffer75.order();
        java.nio.ByteBuffer byteBuffer79 = byteBuffer75.putFloat(4, (float) (-10));
        int int80 = byteBuffer56.compareTo(byteBuffer79);
        double double81 = byteBuffer79.getDouble();
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
        org.junit.Assert.assertNotNull(byteBuffer14);
        org.junit.Assert.assertNotNull(byteBuffer16);
        org.junit.Assert.assertNotNull(byteBuffer19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-10) + "'", int20 == (-10));
        org.junit.Assert.assertNotNull(buffer21);
        org.junit.Assert.assertNotNull(buffer22);
        org.junit.Assert.assertNotNull(byteBuffer24);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray28), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(byteBuffer29);
        org.junit.Assert.assertNotNull(byteBuffer30);
        org.junit.Assert.assertNotNull(byteBuffer32);
        org.junit.Assert.assertNotNull(byteBuffer33);
        org.junit.Assert.assertNotNull(byteBuffer35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(shortBuffer37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(byteBuffer40);
        org.junit.Assert.assertNotNull(byteBuffer41);
        org.junit.Assert.assertNotNull(byteBuffer42);
        org.junit.Assert.assertNotNull(byteBuffer43);
        org.junit.Assert.assertNotNull(byteBuffer45);
        org.junit.Assert.assertNotNull(byteArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray49), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(byteBuffer50);
        org.junit.Assert.assertNotNull(byteBuffer51);
        org.junit.Assert.assertNotNull(buffer52);
        org.junit.Assert.assertNotNull(byteOrder53);
        org.junit.Assert.assertNotNull(byteBuffer54);
        org.junit.Assert.assertNotNull(byteBuffer55);
        org.junit.Assert.assertNotNull(byteBuffer56);
        org.junit.Assert.assertNotNull(buffer57);
        org.junit.Assert.assertNotNull(byteBuffer59);
        org.junit.Assert.assertNotNull(byteBuffer61);
        org.junit.Assert.assertNotNull(byteBuffer64);
        org.junit.Assert.assertNotNull(byteBuffer66);
        org.junit.Assert.assertNotNull(byteArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray70), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(byteBuffer71);
        org.junit.Assert.assertNotNull(byteBuffer72);
        org.junit.Assert.assertNotNull(buffer73);
        org.junit.Assert.assertNotNull(byteOrder74);
        org.junit.Assert.assertNotNull(byteBuffer75);
        org.junit.Assert.assertNotNull(byteOrder76);
        org.junit.Assert.assertNotNull(byteBuffer79);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 63 + "'", int80 == 63);
        org.junit.Assert.assertTrue("'" + double81 + "' != '" + 1.04911471905323E-309d + "'", double81 == 1.04911471905323E-309d);
    }

    @Test
    public void test6782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6782");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate((int) (byte) 10);
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.nio.ByteBuffer byteBuffer6 = java.nio.ByteBuffer.wrap(byteArray5);
        java.nio.ByteBuffer byteBuffer7 = byteBuffer1.get(byteArray5);
        java.nio.Buffer buffer8 = byteBuffer1.rewind();
        int int9 = byteBuffer1.position();
        java.nio.Buffer buffer10 = byteBuffer1.rewind();
        java.nio.ByteBuffer byteBuffer11 = byteBuffer1.slice();
        java.nio.ByteBuffer byteBuffer13 = byteBuffer1.put((byte) 100);
        java.nio.ByteBuffer byteBuffer14 = byteBuffer1.duplicate();
        java.nio.Buffer buffer15 = byteBuffer1.flip();
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
        org.junit.Assert.assertNotNull(byteBuffer14);
        org.junit.Assert.assertNotNull(buffer15);
    }

    @Test
    public void test6783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6783");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer2 = byteBuffer1.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        java.nio.ByteBuffer byteBuffer4 = byteBuffer1.compact();
        java.nio.ByteBuffer byteBuffer5 = byteBuffer1.slice();
        java.nio.FloatBuffer floatBuffer6 = byteBuffer5.asFloatBuffer();
        int int7 = byteBuffer5.limit();
        int int8 = byteBuffer5.position();
        java.nio.FloatBuffer floatBuffer9 = byteBuffer5.asFloatBuffer();
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(doubleBuffer2);
        org.junit.Assert.assertNotNull(shortBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertNotNull(floatBuffer6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(floatBuffer9);
    }

    @Test
    public void test6784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6784");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.header("");
        response1.charset = "hi!";
        java.lang.String str6 = response1.statusMessage;
        int int7 = response1.numRedirects;
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str9 = response8.contentType;
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response8);
        java.lang.String str11 = response10.charset();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test6785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6785");
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
        response2.contentType = "java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]";
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
    public void test6786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6786");
        org.jsoup.helper.HttpConnection.Response.MAX_REDIRECTS = 16449;
    }

    @Test
    public void test6787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6787");
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
        long long22 = byteBuffer1.getLong();
        java.nio.ByteBuffer byteBuffer24 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer25 = byteBuffer24.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer26 = byteBuffer24.asShortBuffer();
        java.lang.String str27 = byteBuffer24.toString();
        java.nio.ByteBuffer byteBuffer29 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer30 = byteBuffer29.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer31 = byteBuffer29.asShortBuffer();
        byte[] byteArray32 = byteBuffer29.array();
        java.nio.ByteBuffer byteBuffer33 = java.nio.ByteBuffer.wrap(byteArray32);
        java.nio.ByteBuffer byteBuffer34 = byteBuffer24.put(byteArray32);
        java.nio.ByteBuffer byteBuffer35 = byteBuffer1.get(byteArray32);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer38 = java.nio.ByteBuffer.wrap(byteArray32, (int) (byte) -1, 4);
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
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 137438953472L + "'", long22 == 137438953472L);
        org.junit.Assert.assertNotNull(byteBuffer24);
        org.junit.Assert.assertNotNull(doubleBuffer25);
        org.junit.Assert.assertNotNull(shortBuffer26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]" + "'", str27, "java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]");
        org.junit.Assert.assertNotNull(byteBuffer29);
        org.junit.Assert.assertNotNull(doubleBuffer30);
        org.junit.Assert.assertNotNull(shortBuffer31);
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray32), "[]");
        org.junit.Assert.assertNotNull(byteBuffer33);
        org.junit.Assert.assertNotNull(byteBuffer34);
        org.junit.Assert.assertNotNull(byteBuffer35);
    }

    @Test
    public void test6788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6788");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.nio.ByteBuffer byteBuffer4 = response3.byteData;
        java.net.URL uRL5 = response3.url();
        java.nio.ByteBuffer byteBuffer6 = response3.byteData;
        response3.statusMessage = "java.nio.HeapByteBuffer[pos=10 lim=10 cap=10]";
        response3.executed = true;
        java.lang.String str11 = response3.contentType;
        org.junit.Assert.assertNull(byteBuffer4);
        org.junit.Assert.assertNull(uRL5);
        org.junit.Assert.assertNull(byteBuffer6);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test6789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6789");
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
        java.nio.ByteBuffer byteBuffer18 = byteBuffer13.asReadOnlyBuffer();
        org.jsoup.helper.HttpConnection.Response response19 = null;
        org.jsoup.helper.HttpConnection.Response response20 = new org.jsoup.helper.HttpConnection.Response(response19);
        org.jsoup.helper.HttpConnection.Response response21 = new org.jsoup.helper.HttpConnection.Response(response19);
        boolean boolean22 = response21.executed;
        java.lang.String str24 = response21.getHeaderCaseInsensitive("");
        org.jsoup.helper.HttpConnection.Response response25 = new org.jsoup.helper.HttpConnection.Response(response21);
        response25.statusCode = (-1);
        int int28 = response25.statusCode();
        org.jsoup.helper.HttpConnection.Response response29 = new org.jsoup.helper.HttpConnection.Response(response25);
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry31 = response25.scanHeaders("java.nio.HeapByteBufferR[pos=0 lim=0 cap=0]");
        response25.contentType = "java.nio.HeapByteBuffer[pos=3 lim=10 cap=10]";
        response25.statusCode = (-29);
        boolean boolean36 = byteBuffer13.equals((java.lang.Object) response25);
        org.jsoup.helper.HttpConnection.Response response37 = new org.jsoup.helper.HttpConnection.Response(response25);
        int int38 = response37.numRedirects;
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
        org.junit.Assert.assertNotNull(byteBuffer18);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNull(strEntry31);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 2 + "'", int38 == 2);
    }

    @Test
    public void test6790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6790");
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
        org.jsoup.Connection.Response response12 = response9.removeCookie("java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]");
        int int13 = response9.statusCode;
        response9.statusMessage = "java.nio.HeapByteBuffer[pos=5 lim=10 cap=10]";
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response16 = org.jsoup.helper.HttpConnection.Response.execute(request0, response9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test6791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6791");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.isReadOnly();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        int int4 = byteBuffer1.position();
        boolean boolean5 = byteBuffer1.isReadOnly();
        java.nio.Buffer buffer6 = byteBuffer1.clear();
        java.nio.ByteBuffer byteBuffer8 = java.nio.ByteBuffer.allocate(0);
        boolean boolean9 = byteBuffer8.hasRemaining();
        java.nio.ByteBuffer byteBuffer10 = byteBuffer8.asReadOnlyBuffer();
        boolean boolean11 = byteBuffer10.hasRemaining();
        java.nio.ByteBuffer byteBuffer13 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer14 = byteBuffer13.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer15 = byteBuffer13.asShortBuffer();
        java.nio.ByteBuffer byteBuffer16 = byteBuffer13.compact();
        java.nio.ByteOrder byteOrder17 = byteBuffer16.order();
        java.nio.ByteBuffer byteBuffer18 = byteBuffer10.order(byteOrder17);
        int int19 = byteBuffer18.remaining();
        java.nio.ByteBuffer byteBuffer21 = java.nio.ByteBuffer.allocate((int) (byte) 100);
        java.nio.ByteBuffer byteBuffer23 = byteBuffer21.putDouble((double) '4');
        char char25 = byteBuffer23.getChar((int) 'a');
        java.nio.ByteBuffer byteBuffer27 = java.nio.ByteBuffer.allocate(0);
        boolean boolean28 = byteBuffer27.isReadOnly();
        java.nio.ShortBuffer shortBuffer29 = byteBuffer27.asShortBuffer();
        java.nio.ByteBuffer byteBuffer31 = java.nio.ByteBuffer.allocate(0);
        boolean boolean32 = byteBuffer31.isReadOnly();
        int int33 = byteBuffer27.compareTo(byteBuffer31);
        java.nio.ByteBuffer byteBuffer34 = byteBuffer31.compact();
        java.nio.Buffer buffer36 = byteBuffer31.limit((int) (short) 0);
        int int37 = byteBuffer31.remaining();
        byte[] byteArray38 = byteBuffer31.array();
        java.nio.ByteBuffer byteBuffer39 = byteBuffer23.put(byteArray38);
        java.nio.ByteBuffer byteBuffer41 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer42 = byteBuffer41.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer43 = byteBuffer41.asShortBuffer();
        java.nio.ByteOrder byteOrder44 = null;
        java.nio.ByteBuffer byteBuffer45 = byteBuffer41.order(byteOrder44);
        java.nio.ByteBuffer byteBuffer47 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer48 = byteBuffer47.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer49 = byteBuffer47.asShortBuffer();
        int int50 = byteBuffer47.limit();
        byte[] byteArray51 = byteBuffer47.array();
        java.nio.ByteBuffer byteBuffer52 = byteBuffer41.put(byteArray51);
        int int53 = byteBuffer52.position();
        java.nio.ByteBuffer byteBuffer54 = byteBuffer52.duplicate();
        java.nio.ByteBuffer byteBuffer55 = byteBuffer52.asReadOnlyBuffer();
        java.nio.ByteBuffer byteBuffer57 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer58 = byteBuffer57.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer59 = byteBuffer57.asShortBuffer();
        java.nio.ByteBuffer byteBuffer60 = byteBuffer57.compact();
        java.nio.ByteBuffer byteBuffer61 = byteBuffer57.slice();
        int int62 = byteBuffer61.arrayOffset();
        byte[] byteArray63 = new byte[] {};
        java.nio.ByteBuffer byteBuffer64 = java.nio.ByteBuffer.wrap(byteArray63);
        java.nio.Buffer buffer65 = byteBuffer64.flip();
        java.nio.ByteBuffer byteBuffer66 = byteBuffer64.asReadOnlyBuffer();
        java.nio.ByteOrder byteOrder67 = byteBuffer66.order();
        java.nio.ByteBuffer byteBuffer68 = byteBuffer61.order(byteOrder67);
        java.nio.ByteBuffer byteBuffer69 = byteBuffer55.order(byteOrder67);
        java.nio.ByteBuffer byteBuffer70 = byteBuffer23.order(byteOrder67);
        java.nio.ByteBuffer byteBuffer71 = byteBuffer18.order(byteOrder67);
        java.nio.ByteBuffer byteBuffer72 = byteBuffer1.order(byteOrder67);
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(shortBuffer3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(buffer6);
        org.junit.Assert.assertNotNull(byteBuffer8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(byteBuffer10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(byteBuffer13);
        org.junit.Assert.assertNotNull(doubleBuffer14);
        org.junit.Assert.assertNotNull(shortBuffer15);
        org.junit.Assert.assertNotNull(byteBuffer16);
        org.junit.Assert.assertNotNull(byteOrder17);
        org.junit.Assert.assertNotNull(byteBuffer18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(byteBuffer21);
        org.junit.Assert.assertNotNull(byteBuffer23);
        org.junit.Assert.assertTrue("'" + char25 + "' != '" + '\000' + "'", char25 == '\000');
        org.junit.Assert.assertNotNull(byteBuffer27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(shortBuffer29);
        org.junit.Assert.assertNotNull(byteBuffer31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(byteBuffer34);
        org.junit.Assert.assertNotNull(buffer36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray38), "[]");
        org.junit.Assert.assertNotNull(byteBuffer39);
        org.junit.Assert.assertNotNull(byteBuffer41);
        org.junit.Assert.assertNotNull(doubleBuffer42);
        org.junit.Assert.assertNotNull(shortBuffer43);
        org.junit.Assert.assertNotNull(byteBuffer45);
        org.junit.Assert.assertNotNull(byteBuffer47);
        org.junit.Assert.assertNotNull(doubleBuffer48);
        org.junit.Assert.assertNotNull(shortBuffer49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertNotNull(byteArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray51), "[]");
        org.junit.Assert.assertNotNull(byteBuffer52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertNotNull(byteBuffer54);
        org.junit.Assert.assertNotNull(byteBuffer55);
        org.junit.Assert.assertNotNull(byteBuffer57);
        org.junit.Assert.assertNotNull(doubleBuffer58);
        org.junit.Assert.assertNotNull(shortBuffer59);
        org.junit.Assert.assertNotNull(byteBuffer60);
        org.junit.Assert.assertNotNull(byteBuffer61);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertNotNull(byteArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray63), "[]");
        org.junit.Assert.assertNotNull(byteBuffer64);
        org.junit.Assert.assertNotNull(buffer65);
        org.junit.Assert.assertNotNull(byteBuffer66);
        org.junit.Assert.assertNotNull(byteOrder67);
        org.junit.Assert.assertNotNull(byteBuffer68);
        org.junit.Assert.assertNotNull(byteBuffer69);
        org.junit.Assert.assertNotNull(byteBuffer70);
        org.junit.Assert.assertNotNull(byteBuffer71);
        org.junit.Assert.assertNotNull(byteBuffer72);
    }

    @Test
    public void test6792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6792");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect((int) '#');
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.putShort((short) 0);
        java.nio.ByteBuffer byteBuffer5 = byteBuffer1.putDouble((double) '\000');
        java.nio.ShortBuffer shortBuffer6 = byteBuffer1.asShortBuffer();
        java.nio.ByteBuffer byteBuffer8 = byteBuffer1.putInt(35);
        java.nio.ByteBuffer byteBuffer10 = byteBuffer8.putDouble((double) 100.0f);
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertNotNull(shortBuffer6);
        org.junit.Assert.assertNotNull(byteBuffer8);
        org.junit.Assert.assertNotNull(byteBuffer10);
    }

    @Test
    public void test6793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6793");
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
        java.nio.ByteBuffer byteBuffer18 = byteBuffer13.asReadOnlyBuffer();
        org.jsoup.helper.HttpConnection.Response response19 = null;
        org.jsoup.helper.HttpConnection.Response response20 = new org.jsoup.helper.HttpConnection.Response(response19);
        org.jsoup.helper.HttpConnection.Response response21 = new org.jsoup.helper.HttpConnection.Response(response19);
        boolean boolean22 = response21.executed;
        java.lang.String str24 = response21.getHeaderCaseInsensitive("");
        org.jsoup.helper.HttpConnection.Response response25 = new org.jsoup.helper.HttpConnection.Response(response21);
        response25.statusCode = (-1);
        int int28 = response25.statusCode();
        org.jsoup.helper.HttpConnection.Response response29 = new org.jsoup.helper.HttpConnection.Response(response25);
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry31 = response25.scanHeaders("java.nio.HeapByteBufferR[pos=0 lim=0 cap=0]");
        response25.contentType = "java.nio.HeapByteBuffer[pos=3 lim=10 cap=10]";
        response25.statusCode = (-29);
        boolean boolean36 = byteBuffer13.equals((java.lang.Object) response25);
        org.jsoup.helper.HttpConnection.Response response37 = new org.jsoup.helper.HttpConnection.Response(response25);
        boolean boolean39 = response25.hasHeader("java.nio.HeapByteBufferR[pos=0 lim=0 cap=0]");
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
        org.junit.Assert.assertNotNull(byteBuffer18);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNull(strEntry31);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test6794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6794");
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
        java.nio.ByteBuffer byteBuffer26 = byteBuffer23.putChar(35, ' ');
        int int27 = byteBuffer26.remaining();
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
        java.nio.ByteBuffer byteBuffer41 = byteBuffer33.slice();
        java.nio.Buffer buffer42 = byteBuffer41.clear();
        java.nio.ByteBuffer byteBuffer43 = byteBuffer41.asReadOnlyBuffer();
        boolean boolean44 = byteBuffer26.equals((java.lang.Object) byteBuffer43);
        java.nio.DoubleBuffer doubleBuffer45 = byteBuffer26.asDoubleBuffer();
        java.nio.ByteBuffer byteBuffer47 = java.nio.ByteBuffer.allocateDirect((int) '#');
        float float49 = byteBuffer47.getFloat(1);
        java.nio.ByteBuffer byteBuffer51 = byteBuffer47.putLong((long) 10);
        java.nio.ByteBuffer byteBuffer52 = byteBuffer51.duplicate();
        int int53 = byteBuffer26.compareTo(byteBuffer51);
        java.nio.ByteBuffer byteBuffer56 = byteBuffer51.putLong((int) (byte) 0, (long) 100);
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
        org.junit.Assert.assertNotNull(byteBuffer26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 100 + "'", int27 == 100);
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
        org.junit.Assert.assertNotNull(byteBuffer41);
        org.junit.Assert.assertNotNull(buffer42);
        org.junit.Assert.assertNotNull(byteBuffer43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(doubleBuffer45);
        org.junit.Assert.assertNotNull(byteBuffer47);
        org.junit.Assert.assertTrue("'" + float49 + "' != '" + 0.0f + "'", float49 == 0.0f);
        org.junit.Assert.assertNotNull(byteBuffer51);
        org.junit.Assert.assertNotNull(byteBuffer52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 73 + "'", int53 == 73);
        org.junit.Assert.assertNotNull(byteBuffer56);
    }

    @Test
    public void test6795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6795");
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
        byte[] byteArray16 = byteBuffer15.array();
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
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[]");
    }

    @Test
    public void test6796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6796");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean3 = response2.executed;
        java.lang.String str5 = response2.getHeaderCaseInsensitive("");
        java.lang.String str7 = response2.cookie("java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]");
        int int8 = response2.statusCode();
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response2);
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response9);
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response10);
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response11);
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response12);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test6797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6797");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request3 = response2.req;
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response2);
        java.lang.String str5 = response4.contentType;
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response4);
        java.lang.String str8 = response4.getHeaderCaseInsensitive("java.nio.HeapByteBuffer[pos=0 lim=32 cap=32]");
        org.jsoup.Connection.Response response10 = response4.removeHeader("java.nio.HeapByteBufferR[pos=0 lim=0 cap=0]");
        response4.contentType = "java.nio.HeapByteBuffer[pos=0 lim=100 cap=100]";
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response4);
        org.junit.Assert.assertNull(request3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(response10);
    }

    @Test
    public void test6798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6798");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.header("");
        org.jsoup.Connection.Response response5 = response1.removeCookie("hi!");
        java.lang.String str7 = response1.cookie("");
        java.lang.String str8 = response1.statusMessage();
        java.lang.String str9 = response1.charset();
        java.net.URL uRL10 = response1.url();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(uRL10);
    }

    @Test
    public void test6799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6799");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect((int) '#');
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.putShort((short) 0);
        java.nio.ByteBuffer byteBuffer5 = byteBuffer1.putDouble((double) '\000');
        char char6 = byteBuffer5.getChar();
        java.nio.Buffer buffer7 = byteBuffer5.clear();
        java.nio.ByteBuffer byteBuffer8 = byteBuffer5.slice();
        short short10 = byteBuffer5.getShort((int) '\000');
        java.nio.FloatBuffer floatBuffer11 = byteBuffer5.asFloatBuffer();
        boolean boolean12 = byteBuffer5.hasRemaining();
        java.nio.ByteBuffer byteBuffer13 = byteBuffer5.asReadOnlyBuffer();
        int int14 = byteBuffer13.getInt();
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '\000' + "'", char6 == '\000');
        org.junit.Assert.assertNotNull(buffer7);
        org.junit.Assert.assertNotNull(byteBuffer8);
        org.junit.Assert.assertTrue("'" + short10 + "' != '" + (short) 0 + "'", short10 == (short) 0);
        org.junit.Assert.assertNotNull(floatBuffer11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(byteBuffer13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test6800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6800");
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
        org.jsoup.helper.HttpConnection.Response response20 = null;
        org.jsoup.helper.HttpConnection.Response response21 = new org.jsoup.helper.HttpConnection.Response(response20);
        org.jsoup.helper.HttpConnection.Response response22 = new org.jsoup.helper.HttpConnection.Response(response20);
        org.jsoup.helper.HttpConnection.Response response23 = new org.jsoup.helper.HttpConnection.Response(response20);
        org.jsoup.helper.HttpConnection.Response response24 = new org.jsoup.helper.HttpConnection.Response(response20);
        org.jsoup.helper.HttpConnection.Response response25 = new org.jsoup.helper.HttpConnection.Response(response20);
        org.jsoup.helper.HttpConnection.Response response26 = new org.jsoup.helper.HttpConnection.Response(response20);
        boolean boolean27 = byteBuffer15.equals((java.lang.Object) response26);
        java.nio.Buffer buffer28 = byteBuffer15.flip();
        org.junit.Assert.assertNull(request3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(byteBuffer15);
        org.junit.Assert.assertNotNull(doubleBuffer16);
        org.junit.Assert.assertNotNull(shortBuffer17);
        org.junit.Assert.assertNotNull(byteBuffer18);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(buffer28);
    }

    @Test
    public void test6801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6801");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect((int) '#');
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.putShort((short) 0);
        java.nio.ByteBuffer byteBuffer5 = byteBuffer1.putDouble((double) '\000');
        char char6 = byteBuffer5.getChar();
        java.nio.Buffer buffer7 = byteBuffer5.clear();
        java.nio.ByteBuffer byteBuffer9 = java.nio.ByteBuffer.allocate((int) (byte) 10);
        byte[] byteArray13 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.nio.ByteBuffer byteBuffer14 = java.nio.ByteBuffer.wrap(byteArray13);
        java.nio.ByteBuffer byteBuffer15 = byteBuffer9.get(byteArray13);
        java.nio.Buffer buffer16 = byteBuffer9.rewind();
        int int17 = byteBuffer9.position();
        java.nio.Buffer buffer18 = byteBuffer9.rewind();
        java.nio.ByteBuffer byteBuffer19 = byteBuffer9.slice();
        java.nio.ByteBuffer byteBuffer21 = byteBuffer9.put((byte) 100);
        boolean boolean22 = byteBuffer21.hasArray();
        java.nio.ByteBuffer byteBuffer23 = byteBuffer21.asReadOnlyBuffer();
        java.nio.ByteBuffer byteBuffer24 = byteBuffer5.put(byteBuffer21);
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '\000' + "'", char6 == '\000');
        org.junit.Assert.assertNotNull(buffer7);
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(byteBuffer14);
        org.junit.Assert.assertNotNull(byteBuffer15);
        org.junit.Assert.assertNotNull(buffer16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(buffer18);
        org.junit.Assert.assertNotNull(byteBuffer19);
        org.junit.Assert.assertNotNull(byteBuffer21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(byteBuffer23);
        org.junit.Assert.assertNotNull(byteBuffer24);
    }

    @Test
    public void test6802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6802");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect((int) '#');
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.putShort((short) 0);
        java.nio.ByteBuffer byteBuffer6 = byteBuffer3.putShort(0, (short) (byte) 10);
        java.nio.Buffer buffer7 = byteBuffer6.clear();
        float float8 = byteBuffer6.getFloat();
        java.nio.IntBuffer intBuffer9 = byteBuffer6.asIntBuffer();
        java.nio.ByteBuffer byteBuffer11 = byteBuffer6.put((byte) 64);
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer6);
        org.junit.Assert.assertNotNull(buffer7);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 9.18355E-40f + "'", float8 == 9.18355E-40f);
        org.junit.Assert.assertNotNull(intBuffer9);
        org.junit.Assert.assertNotNull(byteBuffer11);
    }

    @Test
    public void test6803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6803");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate((int) (byte) 10);
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.nio.ByteBuffer byteBuffer6 = java.nio.ByteBuffer.wrap(byteArray5);
        java.nio.ByteBuffer byteBuffer7 = byteBuffer1.get(byteArray5);
        java.nio.Buffer buffer8 = byteBuffer1.rewind();
        byte[] byteArray12 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.nio.ByteBuffer byteBuffer13 = java.nio.ByteBuffer.wrap(byteArray12);
        java.nio.ByteBuffer byteBuffer14 = byteBuffer1.put(byteArray12);
        java.nio.ByteOrder byteOrder15 = byteBuffer14.order();
        java.nio.ByteBuffer byteBuffer17 = java.nio.ByteBuffer.allocate((int) (byte) 10);
        byte[] byteArray21 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.nio.ByteBuffer byteBuffer22 = java.nio.ByteBuffer.wrap(byteArray21);
        java.nio.ByteBuffer byteBuffer23 = byteBuffer17.get(byteArray21);
        java.nio.LongBuffer longBuffer24 = byteBuffer17.asLongBuffer();
        java.nio.ByteBuffer byteBuffer25 = byteBuffer17.slice();
        java.nio.ByteBuffer byteBuffer27 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer28 = byteBuffer27.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer29 = byteBuffer27.asShortBuffer();
        java.nio.ByteOrder byteOrder30 = null;
        java.nio.ByteBuffer byteBuffer31 = byteBuffer27.order(byteOrder30);
        java.nio.ByteBuffer byteBuffer33 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer34 = byteBuffer33.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer35 = byteBuffer33.asShortBuffer();
        int int36 = byteBuffer33.limit();
        byte[] byteArray37 = byteBuffer33.array();
        java.nio.ByteBuffer byteBuffer38 = byteBuffer27.put(byteArray37);
        java.nio.ByteBuffer byteBuffer39 = byteBuffer25.get(byteArray37);
        java.nio.CharBuffer charBuffer40 = byteBuffer39.asCharBuffer();
        java.nio.CharBuffer charBuffer41 = byteBuffer39.asCharBuffer();
        short short42 = byteBuffer39.getShort();
        java.nio.ByteBuffer byteBuffer43 = byteBuffer14.put(byteBuffer39);
        byte byte44 = byteBuffer14.get();
        java.nio.ByteBuffer byteBuffer45 = byteBuffer14.slice();
        int int46 = byteBuffer45.limit();
        java.nio.ByteBuffer byteBuffer47 = byteBuffer45.asReadOnlyBuffer();
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
        org.junit.Assert.assertNotNull(byteBuffer17);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(byteBuffer22);
        org.junit.Assert.assertNotNull(byteBuffer23);
        org.junit.Assert.assertNotNull(longBuffer24);
        org.junit.Assert.assertNotNull(byteBuffer25);
        org.junit.Assert.assertNotNull(byteBuffer27);
        org.junit.Assert.assertNotNull(doubleBuffer28);
        org.junit.Assert.assertNotNull(shortBuffer29);
        org.junit.Assert.assertNotNull(byteBuffer31);
        org.junit.Assert.assertNotNull(byteBuffer33);
        org.junit.Assert.assertNotNull(doubleBuffer34);
        org.junit.Assert.assertNotNull(shortBuffer35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray37), "[]");
        org.junit.Assert.assertNotNull(byteBuffer38);
        org.junit.Assert.assertNotNull(byteBuffer39);
        org.junit.Assert.assertNotNull(charBuffer40);
        org.junit.Assert.assertNotNull(charBuffer41);
        org.junit.Assert.assertTrue("'" + short42 + "' != '" + (short) 0 + "'", short42 == (short) 0);
        org.junit.Assert.assertNotNull(byteBuffer43);
        org.junit.Assert.assertTrue("'" + byte44 + "' != '" + (byte) 0 + "'", byte44 == (byte) 0);
        org.junit.Assert.assertNotNull(byteBuffer45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 1 + "'", int46 == 1);
        org.junit.Assert.assertNotNull(byteBuffer47);
    }

    @Test
    public void test6804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6804");
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
        java.nio.ByteBuffer byteBuffer32 = byteBuffer29.putChar((int) '\000', '#');
        java.nio.Buffer buffer34 = byteBuffer29.position(0);
        boolean boolean35 = byteBuffer29.hasRemaining();
        int int36 = byteBuffer29.limit();
        // The following exception was thrown during execution in test generation
        try {
            double double38 = byteBuffer29.getDouble(32);
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
        org.junit.Assert.assertNotNull(byteBuffer32);
        org.junit.Assert.assertNotNull(buffer34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 35 + "'", int36 == 35);
    }

    @Test
    public void test6805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6805");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate((int) (byte) 10);
        int int2 = byteBuffer1.limit();
        short short3 = byteBuffer1.getShort();
        boolean boolean4 = byteBuffer1.hasArray();
        // The following exception was thrown during execution in test generation
        try {
            byte byte6 = byteBuffer1.get((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test6806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6806");
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
        boolean boolean22 = byteBuffer18.isReadOnly();
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
    public void test6807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6807");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate((int) ' ');
        java.nio.Buffer buffer2 = byteBuffer1.rewind();
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.compact();
        java.nio.ByteBuffer byteBuffer4 = byteBuffer3.slice();
        java.lang.String str5 = byteBuffer3.toString();
        org.jsoup.helper.HttpConnection.Response response6 = null;
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response6);
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response6);
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response6);
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response6);
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response6);
        java.nio.ByteBuffer byteBuffer13 = java.nio.ByteBuffer.allocate(0);
        boolean boolean14 = byteBuffer13.hasRemaining();
        java.nio.ByteBuffer byteBuffer15 = byteBuffer13.asReadOnlyBuffer();
        boolean boolean16 = byteBuffer15.hasRemaining();
        response11.byteData = byteBuffer15;
        java.nio.ByteBuffer byteBuffer19 = java.nio.ByteBuffer.allocate(0);
        boolean boolean20 = byteBuffer19.isReadOnly();
        java.nio.ShortBuffer shortBuffer21 = byteBuffer19.asShortBuffer();
        java.nio.ByteBuffer byteBuffer22 = byteBuffer19.duplicate();
        response11.byteData = byteBuffer19;
        byte[] byteArray24 = byteBuffer19.array();
        java.nio.ByteBuffer byteBuffer25 = byteBuffer3.put(byteArray24);
        // The following exception was thrown during execution in test generation
        try {
            float float26 = byteBuffer25.getFloat();
            org.junit.Assert.fail("Expected exception of type java.nio.BufferUnderflowException; message: null");
        } catch (java.nio.BufferUnderflowException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(buffer2);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "java.nio.HeapByteBuffer[pos=32 lim=32 cap=32]" + "'", str5, "java.nio.HeapByteBuffer[pos=32 lim=32 cap=32]");
        org.junit.Assert.assertNotNull(byteBuffer13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(byteBuffer15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(byteBuffer19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(shortBuffer21);
        org.junit.Assert.assertNotNull(byteBuffer22);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[]");
        org.junit.Assert.assertNotNull(byteBuffer25);
    }

    @Test
    public void test6808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6808");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            short short2 = byteBuffer1.getShort();
            org.junit.Assert.fail("Expected exception of type java.nio.BufferUnderflowException; message: null");
        } catch (java.nio.BufferUnderflowException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
    }

    @Test
    public void test6809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6809");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect((int) '#');
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.putShort((short) 0);
        java.nio.ByteBuffer byteBuffer5 = byteBuffer1.putDouble((double) '\000');
        char char6 = byteBuffer5.getChar();
        java.nio.ByteBuffer byteBuffer8 = byteBuffer5.put((byte) 10);
        float float9 = byteBuffer8.getFloat();
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '\000' + "'", char6 == '\000');
        org.junit.Assert.assertNotNull(byteBuffer8);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.0f + "'", float9 == 0.0f);
    }

    @Test
    public void test6810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6810");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean3 = response2.executed;
        response2.statusCode = 0;
        java.lang.String str6 = response2.contentType();
        org.jsoup.Connection.Response response9 = response2.cookie("java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]", "java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry11 = response2.scanHeaders("hi!");
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response2);
        response12.numRedirects = (byte) -1;
        org.jsoup.Connection.Method method15 = response12.method();
        org.jsoup.Connection.Request request16 = response12.req;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertNull(strEntry11);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertNull(request16);
    }

    @Test
    public void test6811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6811");
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
        java.lang.String str22 = response19.getHeaderCaseInsensitive("java.nio.HeapByteBuffer[pos=24 lim=100 cap=100]");
        org.junit.Assert.assertNotNull(byteBuffer7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(byteBuffer13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(shortBuffer15);
        org.junit.Assert.assertNotNull(byteBuffer16);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test6812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6812");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate((int) (byte) 100);
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.putDouble((double) '4');
        byte[] byteArray9 = new byte[] { (byte) 1, (byte) 100, (byte) -1, (byte) 10, (byte) -1 };
        java.nio.ByteBuffer byteBuffer10 = byteBuffer1.put(byteArray9);
        char char11 = byteBuffer10.getChar();
        java.nio.ByteBuffer byteBuffer12 = byteBuffer10.slice();
        float float13 = byteBuffer10.getFloat();
        java.nio.Buffer buffer15 = byteBuffer10.position((int) 'a');
        boolean boolean16 = byteBuffer10.hasArray();
        java.nio.ByteBuffer byteBuffer18 = java.nio.ByteBuffer.allocate((int) (byte) 100);
        java.nio.ByteBuffer byteBuffer20 = java.nio.ByteBuffer.allocate(0);
        boolean boolean21 = byteBuffer20.isReadOnly();
        java.nio.ShortBuffer shortBuffer22 = byteBuffer20.asShortBuffer();
        java.nio.ByteBuffer byteBuffer24 = java.nio.ByteBuffer.allocate(0);
        boolean boolean25 = byteBuffer24.isReadOnly();
        int int26 = byteBuffer20.compareTo(byteBuffer24);
        java.nio.Buffer buffer27 = byteBuffer24.clear();
        java.nio.ByteBuffer byteBuffer29 = java.nio.ByteBuffer.allocate(0);
        boolean boolean30 = byteBuffer29.hasRemaining();
        java.nio.ByteBuffer byteBuffer31 = byteBuffer24.put(byteBuffer29);
        java.nio.ByteBuffer byteBuffer32 = byteBuffer31.compact();
        java.nio.ByteBuffer byteBuffer33 = byteBuffer18.put(byteBuffer32);
        java.nio.ByteBuffer byteBuffer36 = byteBuffer18.putDouble(1, (double) (byte) 0);
        java.nio.FloatBuffer floatBuffer37 = byteBuffer36.asFloatBuffer();
        java.nio.ByteBuffer byteBuffer40 = byteBuffer36.putLong(35, (long) (-10));
        java.nio.ByteBuffer byteBuffer43 = byteBuffer40.putChar(35, ' ');
        int int44 = byteBuffer40.remaining();
        java.nio.ByteOrder byteOrder45 = byteBuffer40.order();
        java.nio.ByteBuffer byteBuffer46 = byteBuffer10.order(byteOrder45);
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[1, 100, -1, 10, -1]");
        org.junit.Assert.assertNotNull(byteBuffer10);
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '\000' + "'", char11 == '\000');
        org.junit.Assert.assertNotNull(byteBuffer12);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 0.0f + "'", float13 == 0.0f);
        org.junit.Assert.assertNotNull(buffer15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(byteBuffer18);
        org.junit.Assert.assertNotNull(byteBuffer20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(shortBuffer22);
        org.junit.Assert.assertNotNull(byteBuffer24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(buffer27);
        org.junit.Assert.assertNotNull(byteBuffer29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(byteBuffer31);
        org.junit.Assert.assertNotNull(byteBuffer32);
        org.junit.Assert.assertNotNull(byteBuffer33);
        org.junit.Assert.assertNotNull(byteBuffer36);
        org.junit.Assert.assertNotNull(floatBuffer37);
        org.junit.Assert.assertNotNull(byteBuffer40);
        org.junit.Assert.assertNotNull(byteBuffer43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 100 + "'", int44 == 100);
        org.junit.Assert.assertNotNull(byteOrder45);
        org.junit.Assert.assertNotNull(byteBuffer46);
    }

    @Test
    public void test6813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6813");
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
        org.jsoup.Connection.Method method34 = response1.method();
        int int35 = response1.statusCode;
        org.jsoup.helper.HttpConnection.Response response36 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry38 = response36.scanHeaders("");
        org.jsoup.Connection.Response response40 = response36.removeHeader("hi!");
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
        org.junit.Assert.assertNull(method34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNull(strEntry38);
        org.junit.Assert.assertNotNull(response40);
    }

    @Test
    public void test6814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6814");
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
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response10);
        org.jsoup.Connection.Request request13 = response10.req;
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(byteBuffer9);
        org.junit.Assert.assertNull(request13);
    }

    @Test
    public void test6815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6815");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request3 = response2.req;
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response2);
        java.lang.String str5 = response4.contentType;
        boolean boolean7 = response4.hasHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response4);
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response4);
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response4);
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response4);
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response4);
        org.junit.Assert.assertNull(request3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test6816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6816");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean3 = response2.executed;
        java.lang.String str5 = response2.getHeaderCaseInsensitive("");
        java.net.URL uRL6 = response2.url();
        org.jsoup.Connection.Response response9 = response2.cookie("java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]", "java.nio.HeapByteBuffer[pos=0 lim=32 cap=32]");
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response2);
        java.lang.String str11 = response2.contentType();
        boolean boolean13 = response2.hasCookie("java.nio.HeapByteBuffer[pos=24 lim=100 cap=100]");
        java.lang.Class<?> wildcardClass14 = response2.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test6817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6817");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate((int) ' ');
        int int3 = byteBuffer1.getInt((int) (short) 0);
        java.nio.ByteBuffer byteBuffer5 = byteBuffer1.put((byte) -1);
        int int6 = byteBuffer5.getInt();
        long long8 = byteBuffer5.getLong(0);
        double double9 = byteBuffer5.getDouble();
        java.nio.ByteBuffer byteBuffer11 = byteBuffer5.putDouble(0.0d);
        byte[] byteArray12 = byteBuffer11.array();
        java.nio.ByteBuffer byteBuffer13 = java.nio.ByteBuffer.wrap(byteArray12);
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-72057594037927936L) + "'", long8 == (-72057594037927936L));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(byteBuffer11);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[-1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(byteBuffer13);
    }

    @Test
    public void test6818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6818");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect((int) ' ');
        byte byte2 = byteBuffer1.get();
        java.nio.ByteBuffer byteBuffer5 = byteBuffer1.put(4, (byte) 0);
        java.nio.ShortBuffer shortBuffer6 = byteBuffer1.asShortBuffer();
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 0 + "'", byte2 == (byte) 0);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertNotNull(shortBuffer6);
    }

    @Test
    public void test6819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6819");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate((int) ' ');
        java.nio.Buffer buffer2 = byteBuffer1.rewind();
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.compact();
        java.nio.ByteBuffer byteBuffer5 = java.nio.ByteBuffer.allocate(0);
        boolean boolean6 = byteBuffer5.hasRemaining();
        java.nio.ByteBuffer byteBuffer7 = byteBuffer5.asReadOnlyBuffer();
        int int8 = byteBuffer5.arrayOffset();
        int int9 = byteBuffer3.compareTo(byteBuffer5);
        java.nio.ByteBuffer byteBuffer10 = byteBuffer5.compact();
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(buffer2);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(byteBuffer7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(byteBuffer10);
    }

    @Test
    public void test6820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6820");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect((int) (short) 1);
        org.junit.Assert.assertNotNull(byteBuffer1);
    }

    @Test
    public void test6821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6821");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request3 = response2.req;
        response2.contentType = "hi!";
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response2);
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response6);
        org.jsoup.helper.HttpConnection.Response response8 = null;
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response8);
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response8);
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response8);
        java.nio.ByteBuffer byteBuffer12 = response11.byteData;
        org.jsoup.Connection.Response response15 = response11.cookie("hi!", "");
        java.net.URL uRL16 = response11.url();
        org.jsoup.helper.HttpConnection.Response response17 = null;
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response(response17);
        java.lang.String str20 = response18.header("");
        response18.charset = "hi!";
        java.nio.ByteBuffer byteBuffer23 = null;
        response18.byteData = byteBuffer23;
        org.jsoup.Connection.Method method25 = response18.method();
        java.nio.ByteBuffer byteBuffer27 = java.nio.ByteBuffer.allocate((int) (byte) 10);
        byte[] byteArray31 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.nio.ByteBuffer byteBuffer32 = java.nio.ByteBuffer.wrap(byteArray31);
        java.nio.ByteBuffer byteBuffer33 = byteBuffer27.get(byteArray31);
        java.nio.Buffer buffer34 = byteBuffer27.rewind();
        int int35 = byteBuffer27.position();
        java.nio.Buffer buffer36 = byteBuffer27.rewind();
        response18.byteData = byteBuffer27;
        response11.byteData = byteBuffer27;
        java.nio.ByteBuffer byteBuffer41 = byteBuffer27.putLong(2, (long) 33);
        int int42 = byteBuffer27.capacity();
        response7.byteData = byteBuffer27;
        org.junit.Assert.assertNull(request3);
        org.junit.Assert.assertNull(byteBuffer12);
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertNull(uRL16);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(method25);
        org.junit.Assert.assertNotNull(byteBuffer27);
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray31), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(byteBuffer32);
        org.junit.Assert.assertNotNull(byteBuffer33);
        org.junit.Assert.assertNotNull(buffer34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(buffer36);
        org.junit.Assert.assertNotNull(byteBuffer41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 10 + "'", int42 == 10);
    }

    @Test
    public void test6822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6822");
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
        boolean boolean15 = byteBuffer14.hasRemaining();
        java.lang.Class<?> wildcardClass16 = byteBuffer14.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test6823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6823");
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate((-98));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test6824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6824");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect((int) '#');
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.putShort((short) 0);
        java.nio.ByteOrder byteOrder4 = byteBuffer3.order();
        java.nio.ByteBuffer byteBuffer7 = byteBuffer3.put(0, (byte) 0);
        double double9 = byteBuffer7.getDouble(9);
        java.nio.ByteBuffer byteBuffer11 = java.nio.ByteBuffer.allocate((int) (byte) 10);
        byte[] byteArray15 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.nio.ByteBuffer byteBuffer16 = java.nio.ByteBuffer.wrap(byteArray15);
        java.nio.ByteBuffer byteBuffer17 = byteBuffer11.get(byteArray15);
        java.nio.Buffer buffer18 = byteBuffer11.rewind();
        byte[] byteArray22 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.nio.ByteBuffer byteBuffer23 = java.nio.ByteBuffer.wrap(byteArray22);
        java.nio.ByteBuffer byteBuffer24 = byteBuffer11.put(byteArray22);
        boolean boolean25 = byteBuffer7.equals((java.lang.Object) byteBuffer11);
        int int26 = byteBuffer11.getInt();
        java.nio.ByteBuffer byteBuffer27 = byteBuffer11.duplicate();
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertNotNull(byteOrder4);
        org.junit.Assert.assertNotNull(byteBuffer7);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(byteBuffer11);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(byteBuffer16);
        org.junit.Assert.assertNotNull(byteBuffer17);
        org.junit.Assert.assertNotNull(buffer18);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[100, 1, 1]");
        org.junit.Assert.assertNotNull(byteBuffer23);
        org.junit.Assert.assertNotNull(byteBuffer24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(byteBuffer27);
    }

    @Test
    public void test6825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6825");
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
        java.nio.ByteBuffer byteBuffer49 = byteBuffer10.putFloat((int) (short) 10, 9.18355E-41f);
        java.nio.ByteBuffer byteBuffer51 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer52 = byteBuffer51.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer53 = byteBuffer51.asShortBuffer();
        java.nio.ByteBuffer byteBuffer54 = byteBuffer51.compact();
        int int55 = byteBuffer54.capacity();
        java.nio.Buffer buffer56 = byteBuffer54.mark();
        java.nio.ByteBuffer byteBuffer57 = byteBuffer10.put(byteBuffer54);
        java.nio.ByteBuffer byteBuffer59 = byteBuffer10.put((byte) -1);
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
        org.junit.Assert.assertNotNull(byteBuffer49);
        org.junit.Assert.assertNotNull(byteBuffer51);
        org.junit.Assert.assertNotNull(doubleBuffer52);
        org.junit.Assert.assertNotNull(shortBuffer53);
        org.junit.Assert.assertNotNull(byteBuffer54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertNotNull(buffer56);
        org.junit.Assert.assertNotNull(byteBuffer57);
        org.junit.Assert.assertNotNull(byteBuffer59);
    }

    @Test
    public void test6826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6826");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str4 = response3.statusMessage();
        java.nio.ByteBuffer byteBuffer5 = response3.byteData;
        java.lang.String str7 = response3.getHeaderCaseInsensitive("java.nio.HeapByteBuffer[pos=3 lim=10 cap=10]");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(byteBuffer5);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test6827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6827");
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
        java.nio.IntBuffer intBuffer21 = byteBuffer7.asIntBuffer();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer23 = byteBuffer7.put((byte) -1);
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
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(charBuffer14);
        org.junit.Assert.assertNotNull(byteBuffer16);
        org.junit.Assert.assertNotNull(byteBuffer17);
        org.junit.Assert.assertNotNull(shortBuffer18);
        org.junit.Assert.assertNotNull(byteBuffer19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(intBuffer21);
    }

    @Test
    public void test6828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6828");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Method method6 = response5.method();
        org.jsoup.Connection.Method method7 = response5.method();
        java.util.Map<java.lang.String, java.lang.String> strMap8 = response5.cookies();
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response5);
        java.lang.String str10 = response9.contentType();
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test6829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6829");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.nio.ByteBuffer byteBuffer4 = response3.byteData;
        org.jsoup.Connection.Response response7 = response3.cookie("hi!", "");
        java.net.URL uRL8 = response3.url();
        java.lang.String str10 = response3.getHeaderCaseInsensitive("hi!");
        org.jsoup.Connection.Method method11 = response3.method();
        java.nio.ByteBuffer byteBuffer12 = response3.byteData;
        int int13 = response3.statusCode;
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response3);
        org.junit.Assert.assertNull(byteBuffer4);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(uRL8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(method11);
        org.junit.Assert.assertNull(byteBuffer12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test6830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6830");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Method method6 = response5.method();
        java.util.Map<java.lang.String, java.lang.String> strMap7 = response5.headers();
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response5);
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response8);
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response9);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNotNull(strMap7);
    }

    @Test
    public void test6831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6831");
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
        java.net.URL uRL16 = response1.url();
        java.nio.ByteBuffer byteBuffer18 = java.nio.ByteBuffer.allocate(1677787392);
        response1.byteData = byteBuffer18;
        java.nio.ByteBuffer byteBuffer21 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer22 = byteBuffer21.asDoubleBuffer();
        boolean boolean23 = byteBuffer21.isDirect();
        int int24 = byteBuffer21.arrayOffset();
        java.nio.ByteBuffer byteBuffer25 = byteBuffer21.asReadOnlyBuffer();
        java.nio.DoubleBuffer doubleBuffer26 = byteBuffer21.asDoubleBuffer();
        java.nio.ByteBuffer byteBuffer27 = byteBuffer21.slice();
        byte[] byteArray28 = byteBuffer21.array();
        java.nio.ByteBuffer byteBuffer29 = byteBuffer18.get(byteArray28);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(method13);
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertNull(uRL16);
        org.junit.Assert.assertNotNull(byteBuffer18);
        org.junit.Assert.assertNotNull(byteBuffer21);
        org.junit.Assert.assertNotNull(doubleBuffer22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(byteBuffer25);
        org.junit.Assert.assertNotNull(doubleBuffer26);
        org.junit.Assert.assertNotNull(byteBuffer27);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray28), "[]");
        org.junit.Assert.assertNotNull(byteBuffer29);
    }

    @Test
    public void test6832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6832");
        byte[] byteArray3 = new byte[] { (byte) 0, (byte) -1, (byte) 0 };
        java.nio.ByteBuffer byteBuffer4 = java.nio.ByteBuffer.wrap(byteArray3);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0, -1, 0]");
        org.junit.Assert.assertNotNull(byteBuffer4);
    }

    @Test
    public void test6833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6833");
        byte[] byteArray3 = new byte[] { (byte) 1, (byte) 1, (byte) 1 };
        java.nio.ByteBuffer byteBuffer4 = java.nio.ByteBuffer.wrap(byteArray3);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[1, 1, 1]");
        org.junit.Assert.assertNotNull(byteBuffer4);
    }

    @Test
    public void test6834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6834");
        byte[] byteArray1 = new byte[] { (byte) 0 };
        java.nio.ByteBuffer byteBuffer2 = java.nio.ByteBuffer.wrap(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[0]");
        org.junit.Assert.assertNotNull(byteBuffer2);
    }

    @Test
    public void test6835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6835");
        byte[] byteArray2 = new byte[] { (byte) -1, (byte) -1 };
        java.nio.ByteBuffer byteBuffer5 = java.nio.ByteBuffer.wrap(byteArray2, 0, (int) (byte) 1);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[-1, -1]");
        org.junit.Assert.assertNotNull(byteBuffer5);
    }

    @Test
    public void test6836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6836");
        byte[] byteArray0 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer3 = java.nio.ByteBuffer.wrap(byteArray0, 100, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
    }

    @Test
    public void test6837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6837");
        byte[] byteArray1 = new byte[] { (byte) 100 };
        java.nio.ByteBuffer byteBuffer2 = java.nio.ByteBuffer.wrap(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[100]");
        org.junit.Assert.assertNotNull(byteBuffer2);
    }

    @Test
    public void test6838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6838");
        org.jsoup.helper.HttpConnection.Response.MAX_REDIRECTS = (short) 10;
    }

    @Test
    public void test6839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6839");
        byte[] byteArray2 = new byte[] { (byte) -1, (byte) 10 };
        java.nio.ByteBuffer byteBuffer3 = java.nio.ByteBuffer.wrap(byteArray2);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[-1, 10]");
        org.junit.Assert.assertNotNull(byteBuffer3);
    }

    @Test
    public void test6840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6840");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect((int) (short) 0);
        org.junit.Assert.assertNotNull(byteBuffer1);
    }

    @Test
    public void test6841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6841");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 0, (byte) -1, (byte) -1, (byte) 1, (byte) -1 };
        java.nio.ByteBuffer byteBuffer7 = java.nio.ByteBuffer.wrap(byteArray6);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, 0, -1, -1, 1, -1]");
        org.junit.Assert.assertNotNull(byteBuffer7);
    }
}

