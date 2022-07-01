import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test0001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0001");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.Class<?> wildcardClass2 = response1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        org.jsoup.Connection.Request request0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response.serialiseRequestUrl(request0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        org.jsoup.Connection.Request request0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.HttpURLConnection httpURLConnection1 = org.jsoup.helper.HttpConnection.Response.createConnection(request0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.header("");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = response1.hasHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.nio.ByteBuffer byteBuffer4 = response3.byteData;
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response3);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = response5.hasHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(byteBuffer4);
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.nio.ByteBuffer byteBuffer4 = response3.byteData;
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response3);
        response3.contentType = "hi!";
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = response3.hasHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(byteBuffer4);
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        org.jsoup.helper.HttpConnection.Response.MAX_REDIRECTS = (-1);
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request3 = response2.req;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document4 = response2.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(request3);
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.header("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response1);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Too many redirects occurred trying to load URL null");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        org.jsoup.Connection.Request request0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = org.jsoup.helper.HttpConnection.Response.getRequestCookieString(request0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean3 = response2.executed;
        java.net.URL uRL4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response5 = response2.url(uRL4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        org.jsoup.helper.HttpConnection.Response.MAX_REDIRECTS = 'a';
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.hasRemaining();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.Buffer buffer4 = byteBuffer1.limit(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.nio.ByteBuffer byteBuffer4 = response3.byteData;
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response3);
        java.nio.ByteBuffer byteBuffer7 = java.nio.ByteBuffer.allocate(0);
        response3.byteData = byteBuffer7;
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer10 = byteBuffer7.putChar('4');
            org.junit.Assert.fail("Expected exception of type java.nio.BufferOverflowException; message: null");
        } catch (java.nio.BufferOverflowException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(byteBuffer4);
        org.junit.Assert.assertNotNull(byteBuffer7);
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.nio.ByteBuffer byteBuffer4 = response3.byteData;
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response3);
        java.nio.ByteBuffer byteBuffer7 = java.nio.ByteBuffer.allocate(0);
        response3.byteData = byteBuffer7;
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer11 = byteBuffer7.putFloat((int) '#', (float) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(byteBuffer4);
        org.junit.Assert.assertNotNull(byteBuffer7);
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer2 = byteBuffer1.asDoubleBuffer();
        // The following exception was thrown during execution in test generation
        try {
            byte byte3 = byteBuffer1.get();
            org.junit.Assert.fail("Expected exception of type java.nio.BufferUnderflowException; message: null");
        } catch (java.nio.BufferUnderflowException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(doubleBuffer2);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        // The following exception was thrown during execution in test generation
        try {
            float float3 = byteBuffer1.getFloat((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.nio.ByteBuffer byteBuffer4 = response3.byteData;
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response3);
        java.nio.ByteBuffer byteBuffer7 = java.nio.ByteBuffer.allocate(0);
        response3.byteData = byteBuffer7;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response11 = response3.cookie("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(byteBuffer4);
        org.junit.Assert.assertNotNull(byteBuffer7);
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
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
            java.nio.ByteBuffer byteBuffer12 = byteBuffer7.putChar(1, ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(byteBuffer4);
        org.junit.Assert.assertNotNull(byteBuffer7);
        org.junit.Assert.assertNotNull(byteBuffer9);
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        org.jsoup.helper.HttpConnection.Response.MAX_REDIRECTS = (byte) 0;
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str4 = response3.statusMessage();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response3);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Too many redirects occurred trying to load URL null");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Request request4 = response3.req;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response5 = org.jsoup.helper.HttpConnection.Response.execute(request0, response3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(request4);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.isReadOnly();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer5 = byteBuffer1.putFloat((int) (byte) -1, (float) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer2 = byteBuffer1.asDoubleBuffer();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.Buffer buffer4 = byteBuffer1.position((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: newPosition > limit: (97 > 0)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(doubleBuffer2);
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer2 = byteBuffer1.asDoubleBuffer();
        // The following exception was thrown during execution in test generation
        try {
            short short3 = byteBuffer1.getShort();
            org.junit.Assert.fail("Expected exception of type java.nio.BufferUnderflowException; message: null");
        } catch (java.nio.BufferUnderflowException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(doubleBuffer2);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        int int0 = org.jsoup.helper.HttpConnection.Response.MAX_REDIRECTS;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer2 = byteBuffer1.asDoubleBuffer();
        int int3 = doubleBuffer2.position();
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(doubleBuffer2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean3 = response2.executed;
        response2.statusCode = 0;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response2);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Too many redirects occurred trying to load URL null");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.hasRemaining();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer5 = byteBuffer1.putLong((int) (short) -1, (long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 1, (byte) 100, (byte) 1, (byte) 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer9 = java.nio.ByteBuffer.wrap(byteArray6, (int) (short) -1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, 1, 100, 1, 100, 10]");
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer2 = byteBuffer1.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        // The following exception was thrown during execution in test generation
        try {
            char char5 = byteBuffer1.getChar(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(doubleBuffer2);
        org.junit.Assert.assertNotNull(shortBuffer3);
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.hasRemaining();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer5 = byteBuffer1.putFloat(0, (float) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer2 = byteBuffer1.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.Buffer buffer5 = byteBuffer1.position((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: newPosition > limit: (1 > 0)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(doubleBuffer2);
        org.junit.Assert.assertNotNull(shortBuffer3);
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.nio.ByteBuffer byteBuffer4 = response3.byteData;
        org.jsoup.Connection.Response response7 = response3.cookie("hi!", "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = response3.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(byteBuffer4);
        org.junit.Assert.assertNotNull(response7);
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.isReadOnly();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 0, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer8 = byteBuffer1.put(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.nio.BufferOverflowException; message: null");
        } catch (java.nio.BufferOverflowException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(shortBuffer3);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 0, 100]");
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.hasRemaining();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer4 = byteBuffer1.put((byte) 1);
            org.junit.Assert.fail("Expected exception of type java.nio.BufferOverflowException; message: null");
        } catch (java.nio.BufferOverflowException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.isReadOnly();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        boolean boolean4 = byteBuffer1.hasArray();
        // The following exception was thrown during execution in test generation
        try {
            double double5 = byteBuffer1.getDouble();
            org.junit.Assert.fail("Expected exception of type java.nio.BufferUnderflowException; message: null");
        } catch (java.nio.BufferUnderflowException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(shortBuffer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        // The following exception was thrown during execution in test generation
        try {
            int int2 = byteBuffer1.getInt();
            org.junit.Assert.fail("Expected exception of type java.nio.BufferUnderflowException; message: null");
        } catch (java.nio.BufferUnderflowException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.isReadOnly();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        java.nio.ByteBuffer byteBuffer5 = java.nio.ByteBuffer.allocate(0);
        boolean boolean6 = byteBuffer5.isReadOnly();
        int int7 = byteBuffer1.compareTo(byteBuffer5);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.Buffer buffer9 = byteBuffer5.limit((int) (short) 1);
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
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        org.jsoup.Connection.KeyVal[] keyValArray0 = new org.jsoup.Connection.KeyVal[] {};
        java.util.ArrayList<org.jsoup.Connection.KeyVal> keyValList1 = new java.util.ArrayList<org.jsoup.Connection.KeyVal>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.jsoup.Connection.KeyVal>) keyValList1, keyValArray0);
        java.io.OutputStream outputStream3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response.writePost((java.util.Collection<org.jsoup.Connection.KeyVal>) keyValList1, outputStream3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(keyValArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str4 = response3.statusMessage();
        response3.contentType = "";
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = response3.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str5 = response4.statusMessage();
        response4.contentType = "";
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response8 = org.jsoup.helper.HttpConnection.Response.execute(request0, response4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.isReadOnly();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer5 = byteBuffer1.putLong((long) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.nio.BufferOverflowException; message: null");
        } catch (java.nio.BufferOverflowException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(shortBuffer3);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.nio.ByteBuffer byteBuffer4 = response3.byteData;
        org.jsoup.Connection.Response response7 = response3.cookie("hi!", "");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response3);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Too many redirects occurred trying to load URL null");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(byteBuffer4);
        org.junit.Assert.assertNotNull(response7);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.isReadOnly();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer6 = byteBuffer1.putLong(10, (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(shortBuffer3);
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.isReadOnly();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        java.nio.ByteBuffer byteBuffer5 = java.nio.ByteBuffer.allocate(0);
        boolean boolean6 = byteBuffer5.isReadOnly();
        int int7 = byteBuffer1.compareTo(byteBuffer5);
        // The following exception was thrown during execution in test generation
        try {
            long long9 = byteBuffer1.getLong((int) '#');
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
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.isReadOnly();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        // The following exception was thrown during execution in test generation
        try {
            int int5 = byteBuffer1.getInt((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(shortBuffer3);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer2 = byteBuffer1.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        java.nio.ByteOrder byteOrder4 = null;
        java.nio.ByteBuffer byteBuffer5 = byteBuffer1.order(byteOrder4);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer7 = byteBuffer1.putChar('4');
            org.junit.Assert.fail("Expected exception of type java.nio.BufferOverflowException; message: null");
        } catch (java.nio.BufferOverflowException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(doubleBuffer2);
        org.junit.Assert.assertNotNull(shortBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer5);
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer2 = byteBuffer1.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        java.nio.ByteOrder byteOrder4 = null;
        java.nio.ByteBuffer byteBuffer5 = byteBuffer1.order(byteOrder4);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer8 = byteBuffer1.putDouble(100, 1.0d);
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
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response1);
        response5.numRedirects = 'a';
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response8 = org.jsoup.helper.HttpConnection.Response.execute(request0, response5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer3 = byteBuffer1.putShort((short) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.nio.BufferOverflowException; message: null");
        } catch (java.nio.BufferOverflowException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.statusCode();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response1);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Too many redirects occurred trying to load URL null");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.isReadOnly();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        java.nio.ByteBuffer byteBuffer5 = java.nio.ByteBuffer.allocate(0);
        boolean boolean6 = byteBuffer5.isReadOnly();
        int int7 = byteBuffer1.compareTo(byteBuffer5);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer9 = byteBuffer1.putDouble(10.0d);
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
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.nio.ByteBuffer byteBuffer4 = response3.byteData;
        org.jsoup.Connection.Response response7 = response3.cookie("hi!", "");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document8 = response3.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(byteBuffer4);
        org.junit.Assert.assertNotNull(response7);
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer2 = byteBuffer1.asDoubleBuffer();
        boolean boolean3 = byteBuffer1.isDirect();
        // The following exception was thrown during execution in test generation
        try {
            long long5 = byteBuffer1.getLong(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(doubleBuffer2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.Buffer buffer2 = byteBuffer1.reset();
            org.junit.Assert.fail("Expected exception of type java.nio.InvalidMarkException; message: null");
        } catch (java.nio.InvalidMarkException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        org.jsoup.Connection.Request request0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response1 = org.jsoup.helper.HttpConnection.Response.execute(request0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.isReadOnly();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        java.nio.ByteBuffer byteBuffer4 = byteBuffer1.duplicate();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer7 = byteBuffer1.putShort((int) (short) 0, (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(shortBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer4);
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.hasRemaining();
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.asReadOnlyBuffer();
        byte[] byteArray8 = new byte[] { (byte) 10, (byte) -1, (byte) 0, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer9 = byteBuffer3.put(byteArray8);
            org.junit.Assert.fail("Expected exception of type java.nio.ReadOnlyBufferException; message: null");
        } catch (java.nio.ReadOnlyBufferException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[10, -1, 0, 1]");
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean3 = response2.executed;
        response2.statusCode = 0;
        java.lang.String str6 = response2.contentType();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response2);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Too many redirects occurred trying to load URL null");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean3 = response2.executed;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response2);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Too many redirects occurred trying to load URL null");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.isReadOnly();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        java.nio.ByteBuffer byteBuffer5 = java.nio.ByteBuffer.allocate(0);
        boolean boolean6 = byteBuffer5.isReadOnly();
        int int7 = byteBuffer1.compareTo(byteBuffer5);
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer14 = byteBuffer1.get(byteArray11, (int) '4', (int) (short) 100);
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
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[10, 10, 10]");
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer2 = byteBuffer1.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        int int4 = byteBuffer1.limit();
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
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer2 = byteBuffer1.asDoubleBuffer();
        java.nio.FloatBuffer floatBuffer3 = byteBuffer1.asFloatBuffer();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer6 = byteBuffer1.putInt((int) (byte) 10, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(doubleBuffer2);
        org.junit.Assert.assertNotNull(floatBuffer3);
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer2 = byteBuffer1.asDoubleBuffer();
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.compact();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer5 = byteBuffer1.putFloat((float) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.nio.BufferOverflowException; message: null");
        } catch (java.nio.BufferOverflowException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(doubleBuffer2);
        org.junit.Assert.assertNotNull(byteBuffer3);
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response1);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response6 = org.jsoup.helper.HttpConnection.Response.execute(request0, response1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer2 = byteBuffer1.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        int int4 = byteBuffer1.limit();
        // The following exception was thrown during execution in test generation
        try {
            long long6 = byteBuffer1.getLong((int) (byte) 10);
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
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.isReadOnly();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        java.nio.ByteBuffer byteBuffer5 = java.nio.ByteBuffer.allocate(0);
        boolean boolean6 = byteBuffer5.isReadOnly();
        int int7 = byteBuffer1.compareTo(byteBuffer5);
        java.nio.Buffer buffer8 = byteBuffer5.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer11 = byteBuffer5.putDouble((int) (short) 0, (double) (-1));
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
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer2 = byteBuffer1.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        // The following exception was thrown during execution in test generation
        try {
            char char5 = byteBuffer1.getChar(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(doubleBuffer2);
        org.junit.Assert.assertNotNull(shortBuffer3);
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.isReadOnly();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        java.nio.ByteBuffer byteBuffer5 = java.nio.ByteBuffer.allocate(0);
        boolean boolean6 = byteBuffer5.isReadOnly();
        int int7 = byteBuffer1.compareTo(byteBuffer5);
        java.nio.Buffer buffer8 = byteBuffer5.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer11 = byteBuffer5.putLong((int) (byte) 1, (long) 1);
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
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        byte[] byteArray0 = new byte[] {};
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.wrap(byteArray0);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer4 = java.nio.ByteBuffer.wrap(byteArray0, (-1), 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNotNull(byteBuffer1);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer2 = byteBuffer1.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        java.nio.ByteBuffer byteBuffer4 = byteBuffer1.compact();
        // The following exception was thrown during execution in test generation
        try {
            int int5 = byteBuffer1.getInt();
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
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.hasRemaining();
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.asReadOnlyBuffer();
        // The following exception was thrown during execution in test generation
        try {
            short short4 = byteBuffer3.getShort();
            org.junit.Assert.fail("Expected exception of type java.nio.BufferUnderflowException; message: null");
        } catch (java.nio.BufferUnderflowException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(byteBuffer3);
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.nio.ByteBuffer byteBuffer4 = response3.byteData;
        org.jsoup.Connection.Response response7 = response3.cookie("hi!", "");
        boolean boolean8 = response3.executed;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response3);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Too many redirects occurred trying to load URL null");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(byteBuffer4);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request3 = response2.req;
        org.jsoup.Connection.Method method4 = response2.method();
        java.lang.String str5 = response2.contentType;
        org.jsoup.Connection.Method method6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response7 = response2.method(method6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(request3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.isReadOnly();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        int int4 = byteBuffer1.position();
        // The following exception was thrown during execution in test generation
        try {
            long long5 = byteBuffer1.getLong();
            org.junit.Assert.fail("Expected exception of type java.nio.BufferUnderflowException; message: null");
        } catch (java.nio.BufferUnderflowException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(shortBuffer3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.net.HttpURLConnection httpURLConnection4 = null;
        org.jsoup.helper.HttpConnection.Response response5 = null;
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response5);
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response5);
        org.jsoup.Connection.Request request8 = response7.req;
        // The following exception was thrown during execution in test generation
        try {
            response3.setupFromConnection(httpURLConnection4, (org.jsoup.Connection.Response) response7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(request8);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response1);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response4 = org.jsoup.helper.HttpConnection.Response.execute(request0, response3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.isReadOnly();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        // The following exception was thrown during execution in test generation
        try {
            float float4 = byteBuffer1.getFloat();
            org.junit.Assert.fail("Expected exception of type java.nio.BufferUnderflowException; message: null");
        } catch (java.nio.BufferUnderflowException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(shortBuffer3);
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        // The following exception was thrown during execution in test generation
        try {
            double double3 = byteBuffer1.getDouble(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.nio.ByteBuffer byteBuffer4 = response3.byteData;
        org.jsoup.Connection.Response response7 = response3.cookie("hi!", "");
        java.net.HttpURLConnection httpURLConnection8 = null;
        org.jsoup.helper.HttpConnection.Response response9 = null;
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response9);
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response9);
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response9);
        java.nio.ByteBuffer byteBuffer13 = response12.byteData;
        org.jsoup.Connection.Response response16 = response12.cookie("hi!", "");
        // The following exception was thrown during execution in test generation
        try {
            response3.setupFromConnection(httpURLConnection8, response16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(byteBuffer4);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(byteBuffer13);
        org.junit.Assert.assertNotNull(response16);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str4 = response3.statusMessage();
        response3.contentType = "";
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response3);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Too many redirects occurred trying to load URL null");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
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
            java.nio.ByteBuffer byteBuffer17 = byteBuffer13.put(0, (byte) 10);
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
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
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
            java.nio.ByteBuffer byteBuffer14 = byteBuffer12.putShort((short) (byte) 0);
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
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
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
            short short15 = byteBuffer13.getShort();
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
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.hasRemaining();
        // The following exception was thrown during execution in test generation
        try {
            double double3 = byteBuffer1.getDouble();
            org.junit.Assert.fail("Expected exception of type java.nio.BufferUnderflowException; message: null");
        } catch (java.nio.BufferUnderflowException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer2 = byteBuffer1.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        java.nio.ByteOrder byteOrder4 = null;
        java.nio.ByteBuffer byteBuffer5 = byteBuffer1.order(byteOrder4);
        java.nio.ByteBuffer byteBuffer6 = byteBuffer5.asReadOnlyBuffer();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer8 = byteBuffer5.putChar('a');
            org.junit.Assert.fail("Expected exception of type java.nio.BufferOverflowException; message: null");
        } catch (java.nio.BufferOverflowException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(doubleBuffer2);
        org.junit.Assert.assertNotNull(shortBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertNotNull(byteBuffer6);
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean3 = response2.executed;
        java.lang.String str5 = response2.getHeaderCaseInsensitive("");
        java.net.URL uRL6 = response2.url();
        org.jsoup.Connection.Response response8 = response2.removeCookie("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response2);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Too many redirects occurred trying to load URL null");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNotNull(response8);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
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
            byte byte14 = byteBuffer12.get((int) (byte) 1);
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
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer2 = byteBuffer1.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        java.nio.ByteOrder byteOrder4 = null;
        java.nio.ByteBuffer byteBuffer5 = byteBuffer1.order(byteOrder4);
        java.nio.ByteBuffer byteBuffer6 = byteBuffer5.asReadOnlyBuffer();
        // The following exception was thrown during execution in test generation
        try {
            int int8 = byteBuffer5.getInt(0);
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
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer2 = byteBuffer1.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        java.nio.ByteBuffer byteBuffer4 = byteBuffer1.compact();
        int int5 = byteBuffer4.capacity();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer8 = byteBuffer4.putInt((int) (byte) 100, (int) (byte) -1);
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
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer2 = byteBuffer1.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        java.nio.ByteBuffer byteBuffer4 = byteBuffer1.compact();
        int int5 = byteBuffer4.capacity();
        // The following exception was thrown during execution in test generation
        try {
            long long6 = byteBuffer4.getLong();
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
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response1);
        boolean boolean4 = response3.executed;
        java.lang.String str6 = response3.getHeaderCaseInsensitive("");
        java.util.Map<java.lang.String, java.lang.String> strMap7 = response3.headers();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response8 = org.jsoup.helper.HttpConnection.Response.execute(request0, response3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(strMap7);
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response2);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Too many redirects occurred trying to load URL null");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer2 = byteBuffer1.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        java.nio.ByteBuffer byteBuffer4 = byteBuffer1.compact();
        int int5 = byteBuffer4.capacity();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer7 = byteBuffer4.putLong((long) (short) 10);
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
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.isReadOnly();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        int int4 = byteBuffer1.position();
        java.nio.ByteOrder byteOrder5 = null;
        java.nio.ByteBuffer byteBuffer6 = byteBuffer1.order(byteOrder5);
        java.nio.ByteBuffer byteBuffer7 = byteBuffer1.asReadOnlyBuffer();
        java.nio.ByteBuffer byteBuffer8 = byteBuffer7.slice();
        java.nio.ByteBuffer byteBuffer10 = java.nio.ByteBuffer.allocate((int) (byte) 10);
        byte[] byteArray14 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.nio.ByteBuffer byteBuffer15 = java.nio.ByteBuffer.wrap(byteArray14);
        java.nio.ByteBuffer byteBuffer16 = byteBuffer10.get(byteArray14);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer19 = byteBuffer8.put(byteArray14, (int) (byte) -1, (int) '#');
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
        org.junit.Assert.assertNotNull(byteBuffer10);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(byteBuffer15);
        org.junit.Assert.assertNotNull(byteBuffer16);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer2 = byteBuffer1.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        java.nio.ByteOrder byteOrder4 = null;
        java.nio.ByteBuffer byteBuffer5 = byteBuffer1.order(byteOrder4);
        // The following exception was thrown during execution in test generation
        try {
            short short7 = byteBuffer5.getShort((int) (byte) 100);
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
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean3 = response2.executed;
        response2.statusCode = 0;
        java.lang.String str6 = response2.contentType();
        org.jsoup.Connection.Response response9 = response2.cookie("java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]", "java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray10 = response2.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(response9);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
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
            java.nio.ByteBuffer byteBuffer10 = byteBuffer8.putChar(' ');
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
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.net.URL uRL6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response7 = response5.url(uRL6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean3 = response2.executed;
        java.lang.String str5 = response2.getHeaderCaseInsensitive("");
        java.net.URL uRL6 = response2.url();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response2);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Too many redirects occurred trying to load URL null");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(uRL6);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        byte[] byteArray0 = new byte[] {};
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.wrap(byteArray0);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer4 = byteBuffer1.putLong(10, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNotNull(byteBuffer1);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.Buffer buffer3 = byteBuffer1.position((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: newPosition > limit: (100 > 10)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer2 = byteBuffer1.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        java.nio.ByteBuffer byteBuffer4 = byteBuffer1.compact();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer6 = byteBuffer1.put((byte) 1);
            org.junit.Assert.fail("Expected exception of type java.nio.BufferOverflowException; message: null");
        } catch (java.nio.BufferOverflowException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(doubleBuffer2);
        org.junit.Assert.assertNotNull(shortBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer4);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean3 = response2.executed;
        java.lang.String str5 = response2.getHeaderCaseInsensitive("");
        java.lang.String str6 = response2.contentType;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document7 = response2.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer2 = byteBuffer1.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.nio.ByteBuffer byteBuffer8 = java.nio.ByteBuffer.wrap(byteArray7);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer9 = byteBuffer1.get(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.nio.BufferUnderflowException; message: null");
        } catch (java.nio.BufferUnderflowException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(doubleBuffer2);
        org.junit.Assert.assertNotNull(shortBuffer3);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 1, 1]");
        org.junit.Assert.assertNotNull(byteBuffer8);
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer2 = byteBuffer1.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer6 = byteBuffer1.putLong((int) (byte) 10, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(doubleBuffer2);
        org.junit.Assert.assertNotNull(shortBuffer3);
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
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
            int int14 = byteBuffer10.getInt((int) '4');
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
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
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
            double double14 = byteBuffer7.getDouble((int) '4');
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
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.isReadOnly();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        int int4 = byteBuffer1.position();
        boolean boolean5 = byteBuffer1.isReadOnly();
        java.nio.CharBuffer charBuffer6 = byteBuffer1.asCharBuffer();
        // The following exception was thrown during execution in test generation
        try {
            short short7 = byteBuffer1.getShort();
            org.junit.Assert.fail("Expected exception of type java.nio.BufferUnderflowException; message: null");
        } catch (java.nio.BufferUnderflowException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(shortBuffer3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(charBuffer6);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
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
            java.nio.ByteBuffer byteBuffer12 = byteBuffer5.putShort(0, (short) 0);
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
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer2 = byteBuffer1.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        java.nio.ByteBuffer byteBuffer4 = byteBuffer1.compact();
        byte[] byteArray8 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.nio.ByteBuffer byteBuffer9 = java.nio.ByteBuffer.wrap(byteArray8);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer10 = byteBuffer1.put(byteArray8);
            org.junit.Assert.fail("Expected exception of type java.nio.BufferOverflowException; message: null");
        } catch (java.nio.BufferOverflowException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(doubleBuffer2);
        org.junit.Assert.assertNotNull(shortBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[100, 1, 1]");
        org.junit.Assert.assertNotNull(byteBuffer9);
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
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
            float float13 = byteBuffer1.getFloat();
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
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean3 = response2.executed;
        java.lang.String str5 = response2.getHeaderCaseInsensitive("");
        java.util.Map<java.lang.String, java.lang.String> strMap6 = response2.headers();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response2);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Too many redirects occurred trying to load URL null");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(strMap6);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
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
            java.nio.ByteBuffer byteBuffer21 = byteBuffer1.put((int) (short) -1, (byte) 100);
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
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.header("");
        org.jsoup.Connection.Response response5 = response1.removeCookie("hi!");
        java.lang.String str7 = response1.cookie("");
        java.lang.String str8 = response1.statusMessage();
        int int9 = response1.statusCode;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response1);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Too many redirects occurred trying to load URL null");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str6 = response4.cookie("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = response4.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response12 = org.jsoup.helper.HttpConnection.Response.execute(request0, response4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(byteBuffer5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(uRL11);
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.isReadOnly();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        int int4 = byteBuffer1.position();
        java.nio.ByteOrder byteOrder5 = null;
        java.nio.ByteBuffer byteBuffer6 = byteBuffer1.order(byteOrder5);
        // The following exception was thrown during execution in test generation
        try {
            float float7 = byteBuffer1.getFloat();
            org.junit.Assert.fail("Expected exception of type java.nio.BufferUnderflowException; message: null");
        } catch (java.nio.BufferUnderflowException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(shortBuffer3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(byteBuffer6);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer2 = byteBuffer1.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        java.nio.ByteBuffer byteBuffer4 = byteBuffer1.compact();
        int int5 = byteBuffer4.capacity();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer7 = byteBuffer4.putFloat((float) (-1));
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
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
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
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer15 = byteBuffer13.put((byte) 0);
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
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
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
            java.nio.ByteBuffer byteBuffer16 = byteBuffer13.putChar('#');
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
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.isReadOnly();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        java.nio.ByteBuffer byteBuffer4 = byteBuffer1.duplicate();
        // The following exception was thrown during execution in test generation
        try {
            int int5 = byteBuffer1.getInt();
            org.junit.Assert.fail("Expected exception of type java.nio.BufferUnderflowException; message: null");
        } catch (java.nio.BufferUnderflowException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(shortBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer4);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.header("");
        org.jsoup.Connection.Response response5 = response1.removeCookie("hi!");
        java.lang.String str7 = response1.cookie("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response1);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Too many redirects occurred trying to load URL null");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate((int) (byte) 10);
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.nio.ByteBuffer byteBuffer6 = java.nio.ByteBuffer.wrap(byteArray5);
        java.nio.ByteBuffer byteBuffer7 = byteBuffer1.get(byteArray5);
        java.nio.IntBuffer intBuffer8 = byteBuffer7.asIntBuffer();
        // The following exception was thrown during execution in test generation
        try {
            long long9 = byteBuffer7.getLong();
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
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
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
        // The following exception was thrown during execution in test generation
        try {
            long long15 = byteBuffer5.getLong((int) (byte) -1);
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
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean3 = response2.executed;
        java.lang.String str5 = response2.getHeaderCaseInsensitive("");
        java.net.URL uRL6 = response2.url();
        org.jsoup.Connection.Response response8 = response2.removeCookie("");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry10 = response2.scanHeaders("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = strEntry10.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(strEntry10);
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.isReadOnly();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        java.nio.ByteBuffer byteBuffer5 = java.nio.ByteBuffer.allocate(0);
        boolean boolean6 = byteBuffer5.isReadOnly();
        int int7 = byteBuffer1.compareTo(byteBuffer5);
        java.nio.Buffer buffer8 = byteBuffer5.clear();
        boolean boolean9 = buffer8.hasRemaining();
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
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
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
            float float13 = byteBuffer5.getFloat();
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
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer2 = byteBuffer1.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        java.nio.ByteOrder byteOrder4 = null;
        java.nio.ByteBuffer byteBuffer5 = byteBuffer1.order(byteOrder4);
        java.nio.ByteBuffer byteBuffer6 = byteBuffer5.asReadOnlyBuffer();
        java.nio.Buffer buffer8 = byteBuffer5.position((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer11 = byteBuffer5.putFloat((int) (byte) -1, (float) (byte) 0);
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
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer2 = byteBuffer1.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        java.nio.ByteBuffer byteBuffer4 = byteBuffer1.compact();
        java.nio.ByteBuffer byteBuffer5 = byteBuffer1.slice();
        // The following exception was thrown during execution in test generation
        try {
            short short7 = byteBuffer1.getShort((int) 'a');
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
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.header("");
        org.jsoup.Connection.Response response5 = response1.removeCookie("hi!");
        java.lang.String str7 = response1.cookie("");
        java.lang.String str8 = response1.statusMessage();
        int int9 = response1.statusCode;
        org.jsoup.Connection.Method method10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response11 = response1.method(method10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer2 = byteBuffer1.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        java.nio.ByteOrder byteOrder4 = null;
        java.nio.ByteBuffer byteBuffer5 = byteBuffer1.order(byteOrder4);
        java.nio.ByteBuffer byteBuffer6 = byteBuffer5.asReadOnlyBuffer();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer9 = byteBuffer5.putInt((int) (short) 1, (-1));
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
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean3 = response2.executed;
        java.lang.String str5 = response2.getHeaderCaseInsensitive("");
        java.lang.String str7 = response2.cookie("java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response2);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Too many redirects occurred trying to load URL null");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.isReadOnly();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        java.nio.ByteBuffer byteBuffer5 = java.nio.ByteBuffer.allocate(0);
        boolean boolean6 = byteBuffer5.isReadOnly();
        int int7 = byteBuffer1.compareTo(byteBuffer5);
        java.nio.DoubleBuffer doubleBuffer8 = byteBuffer5.asDoubleBuffer();
        java.nio.Buffer buffer9 = byteBuffer5.mark();
        java.lang.Class<?> wildcardClass10 = buffer9.getClass();
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(shortBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(doubleBuffer8);
        org.junit.Assert.assertNotNull(buffer9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.hasRemaining();
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.asReadOnlyBuffer();
        // The following exception was thrown during execution in test generation
        try {
            byte byte4 = byteBuffer3.get();
            org.junit.Assert.fail("Expected exception of type java.nio.BufferUnderflowException; message: null");
        } catch (java.nio.BufferUnderflowException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(byteBuffer3);
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.isReadOnly();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        int int4 = byteBuffer1.position();
        java.nio.ByteOrder byteOrder5 = null;
        java.nio.ByteBuffer byteBuffer6 = byteBuffer1.order(byteOrder5);
        java.nio.ShortBuffer shortBuffer7 = byteBuffer6.asShortBuffer();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.Buffer buffer8 = shortBuffer7.reset();
            org.junit.Assert.fail("Expected exception of type java.nio.InvalidMarkException; message: null");
        } catch (java.nio.InvalidMarkException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(shortBuffer3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(byteBuffer6);
        org.junit.Assert.assertNotNull(shortBuffer7);
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
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
            long long14 = byteBuffer12.getLong(10);
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
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
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
            java.nio.Buffer buffer14 = byteBuffer7.limit((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
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
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer4 = byteBuffer1.putChar((int) 'a', ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean5 = response3.hasHeader("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response3);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Too many redirects occurred trying to load URL null");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.hasRemaining();
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.asReadOnlyBuffer();
        java.nio.LongBuffer longBuffer4 = byteBuffer1.asLongBuffer();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer6 = byteBuffer1.putDouble((double) '#');
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
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.isReadOnly();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.Buffer buffer5 = shortBuffer3.limit((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(shortBuffer3);
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.isReadOnly();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        java.nio.ByteBuffer byteBuffer5 = java.nio.ByteBuffer.allocate(0);
        boolean boolean6 = byteBuffer5.isReadOnly();
        int int7 = byteBuffer1.compareTo(byteBuffer5);
        java.nio.Buffer buffer9 = byteBuffer1.limit(0);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.Buffer buffer11 = buffer9.limit((int) (short) -1);
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
        org.junit.Assert.assertNotNull(buffer9);
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
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
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer16 = byteBuffer13.putDouble(1, 0.0d);
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
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer2 = byteBuffer1.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        int int4 = byteBuffer1.limit();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer7 = byteBuffer1.putShort((int) '#', (short) (byte) 1);
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
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.isReadOnly();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        int int4 = byteBuffer1.position();
        boolean boolean5 = byteBuffer1.isReadOnly();
        java.nio.CharBuffer charBuffer6 = byteBuffer1.asCharBuffer();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer9 = byteBuffer1.put(0, (byte) -1);
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
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer2 = byteBuffer1.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        java.nio.ByteBuffer byteBuffer4 = byteBuffer1.compact();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer7 = byteBuffer1.putChar((int) (byte) 0, ' ');
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
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer2 = byteBuffer1.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        int int4 = byteBuffer1.limit();
        // The following exception was thrown during execution in test generation
        try {
            float float6 = byteBuffer1.getFloat((int) (byte) 100);
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
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
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
        // The following exception was thrown during execution in test generation
        try {
            float float22 = byteBuffer19.getFloat((int) (short) -1);
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
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate((int) (byte) 10);
        short short3 = byteBuffer1.getShort(1);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer6 = byteBuffer1.putLong((int) (short) 100, (long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.nio.ByteBuffer byteBuffer4 = response3.byteData;
        org.jsoup.Connection.Response response7 = response3.cookie("hi!", "");
        java.net.URL uRL8 = response3.url();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response3);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Too many redirects occurred trying to load URL null");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(byteBuffer4);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(uRL8);
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate((int) (byte) 10);
        short short3 = byteBuffer1.getShort(1);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.Buffer buffer5 = byteBuffer1.position((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: newPosition < 0: (-1 < 0)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response1);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response7 = org.jsoup.helper.HttpConnection.Response.execute(request0, response6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer2 = byteBuffer1.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        java.nio.ByteOrder byteOrder4 = null;
        java.nio.ByteBuffer byteBuffer5 = byteBuffer1.order(byteOrder4);
        java.nio.ByteBuffer byteBuffer6 = byteBuffer5.asReadOnlyBuffer();
        int int7 = byteBuffer5.arrayOffset();
        // The following exception was thrown during execution in test generation
        try {
            short short9 = byteBuffer5.getShort((int) (short) 10);
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
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.hasRemaining();
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.asReadOnlyBuffer();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer5 = byteBuffer3.putFloat((float) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.nio.ReadOnlyBufferException; message: null");
        } catch (java.nio.ReadOnlyBufferException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(byteBuffer3);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.isReadOnly();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        int int4 = byteBuffer1.position();
        java.nio.ByteOrder byteOrder5 = null;
        java.nio.ByteBuffer byteBuffer6 = byteBuffer1.order(byteOrder5);
        java.nio.ByteBuffer byteBuffer7 = byteBuffer1.asReadOnlyBuffer();
        java.nio.ByteBuffer byteBuffer8 = byteBuffer7.slice();
        java.nio.ByteBuffer byteBuffer10 = java.nio.ByteBuffer.allocate((int) (byte) 10);
        byte[] byteArray14 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.nio.ByteBuffer byteBuffer15 = java.nio.ByteBuffer.wrap(byteArray14);
        java.nio.ByteBuffer byteBuffer16 = byteBuffer10.get(byteArray14);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer17 = byteBuffer8.get(byteArray14);
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
        org.junit.Assert.assertNotNull(byteBuffer10);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(byteBuffer15);
        org.junit.Assert.assertNotNull(byteBuffer16);
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        byte[] byteArray0 = new byte[] {};
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.wrap(byteArray0);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer3 = byteBuffer1.putChar('a');
            org.junit.Assert.fail("Expected exception of type java.nio.BufferOverflowException; message: null");
        } catch (java.nio.BufferOverflowException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNotNull(byteBuffer1);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        response2.charset = "";
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response2);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Too many redirects occurred trying to load URL null");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer2 = byteBuffer1.asDoubleBuffer();
        boolean boolean3 = byteBuffer1.isDirect();
        // The following exception was thrown during execution in test generation
        try {
            char char5 = byteBuffer1.getChar((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(doubleBuffer2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer2 = byteBuffer1.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        java.nio.ByteOrder byteOrder4 = null;
        java.nio.ByteBuffer byteBuffer5 = byteBuffer1.order(byteOrder4);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer7 = byteBuffer5.putDouble((double) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.nio.BufferOverflowException; message: null");
        } catch (java.nio.BufferOverflowException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(doubleBuffer2);
        org.junit.Assert.assertNotNull(shortBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer5);
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer2 = byteBuffer1.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        java.nio.ByteBuffer byteBuffer4 = byteBuffer1.compact();
        int int5 = byteBuffer1.remaining();
        // The following exception was thrown during execution in test generation
        try {
            double double7 = byteBuffer1.getDouble((int) (byte) 0);
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
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer2 = byteBuffer1.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        java.nio.ByteOrder byteOrder4 = null;
        java.nio.ByteBuffer byteBuffer5 = byteBuffer1.order(byteOrder4);
        byte[] byteArray9 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.nio.ByteBuffer byteBuffer10 = java.nio.ByteBuffer.wrap(byteArray9);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer11 = byteBuffer1.get(byteArray9);
            org.junit.Assert.fail("Expected exception of type java.nio.BufferUnderflowException; message: null");
        } catch (java.nio.BufferUnderflowException e) {
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
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.hasRemaining();
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.asReadOnlyBuffer();
        boolean boolean4 = byteBuffer3.hasRemaining();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer7 = byteBuffer3.putInt((int) ' ', (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.nio.ReadOnlyBufferException; message: null");
        } catch (java.nio.ReadOnlyBufferException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer2 = byteBuffer1.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        java.nio.ByteBuffer byteBuffer4 = byteBuffer1.compact();
        // The following exception was thrown during execution in test generation
        try {
            long long5 = byteBuffer1.getLong();
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
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate((int) (byte) 10);
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.nio.ByteBuffer byteBuffer6 = java.nio.ByteBuffer.wrap(byteArray5);
        java.nio.ByteBuffer byteBuffer7 = byteBuffer1.get(byteArray5);
        java.nio.Buffer buffer8 = byteBuffer1.rewind();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer11 = byteBuffer1.putInt(10, (int) (byte) -1);
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
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean3 = response2.executed;
        java.lang.String str5 = response2.getHeaderCaseInsensitive("");
        java.net.URL uRL6 = response2.url();
        org.jsoup.Connection.Response response8 = response2.removeCookie("");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry10 = response2.scanHeaders("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response2);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Too many redirects occurred trying to load URL null");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(strEntry10);
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request3 = response2.req;
        org.jsoup.Connection.Method method4 = response2.method();
        java.lang.String str5 = response2.contentType;
        boolean boolean7 = response2.hasCookie("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response2);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Too many redirects occurred trying to load URL null");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(request3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer2 = byteBuffer1.asDoubleBuffer();
        boolean boolean3 = byteBuffer1.isDirect();
        // The following exception was thrown during execution in test generation
        try {
            int int5 = byteBuffer1.getInt((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(doubleBuffer2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.isReadOnly();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        int int4 = byteBuffer1.position();
        boolean boolean5 = byteBuffer1.isReadOnly();
        java.nio.CharBuffer charBuffer6 = byteBuffer1.asCharBuffer();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.Buffer buffer7 = byteBuffer1.reset();
            org.junit.Assert.fail("Expected exception of type java.nio.InvalidMarkException; message: null");
        } catch (java.nio.InvalidMarkException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(shortBuffer3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(charBuffer6);
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.hasRemaining();
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.asReadOnlyBuffer();
        java.nio.DoubleBuffer doubleBuffer4 = byteBuffer1.asDoubleBuffer();
        // The following exception was thrown during execution in test generation
        try {
            float float6 = byteBuffer1.getFloat((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertNotNull(doubleBuffer4);
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        response2.charset = "";
        java.net.URL uRL5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response6 = response2.url(uRL5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request3 = response2.req;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response6 = response2.header("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(request3);
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.ByteBuffer byteBuffer2 = byteBuffer1.slice();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.Buffer buffer5 = byteBuffer1.limit((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteBuffer2);
        org.junit.Assert.assertNotNull(shortBuffer3);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
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
            org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response3);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Too many redirects occurred trying to load URL null");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(request8);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.nio.ByteBuffer byteBuffer4 = response3.byteData;
        org.jsoup.Connection.Response response7 = response3.cookie("hi!", "");
        int int8 = response3.numRedirects;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response3);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Too many redirects occurred trying to load URL null");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(byteBuffer4);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
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
        java.nio.ByteBuffer byteBuffer24 = java.nio.ByteBuffer.allocate(0);
        boolean boolean25 = byteBuffer24.isReadOnly();
        java.nio.ShortBuffer shortBuffer26 = byteBuffer24.asShortBuffer();
        java.nio.ByteBuffer byteBuffer28 = java.nio.ByteBuffer.allocate(0);
        boolean boolean29 = byteBuffer28.isReadOnly();
        int int30 = byteBuffer24.compareTo(byteBuffer28);
        java.nio.DoubleBuffer doubleBuffer31 = byteBuffer28.asDoubleBuffer();
        java.nio.FloatBuffer floatBuffer32 = byteBuffer28.asFloatBuffer();
        java.nio.ByteBuffer byteBuffer34 = java.nio.ByteBuffer.allocate((int) (byte) 10);
        byte[] byteArray38 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.nio.ByteBuffer byteBuffer39 = java.nio.ByteBuffer.wrap(byteArray38);
        java.nio.ByteBuffer byteBuffer40 = byteBuffer34.get(byteArray38);
        java.nio.ByteBuffer byteBuffer43 = byteBuffer28.put(byteArray38, 0, (int) (byte) 0);
        java.nio.ByteBuffer byteBuffer44 = java.nio.ByteBuffer.wrap(byteArray38);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer45 = byteBuffer20.put(byteArray38);
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
        org.junit.Assert.assertNotNull(byteBuffer24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(shortBuffer26);
        org.junit.Assert.assertNotNull(byteBuffer28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(doubleBuffer31);
        org.junit.Assert.assertNotNull(floatBuffer32);
        org.junit.Assert.assertNotNull(byteBuffer34);
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray38), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(byteBuffer39);
        org.junit.Assert.assertNotNull(byteBuffer40);
        org.junit.Assert.assertNotNull(byteBuffer43);
        org.junit.Assert.assertNotNull(byteBuffer44);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request3 = response2.req;
        org.jsoup.Connection.Method method4 = response2.method();
        java.net.URL uRL5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response6 = response2.url(uRL5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(request3);
        org.junit.Assert.assertNull(method4);
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.hasRemaining();
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.asReadOnlyBuffer();
        java.nio.DoubleBuffer doubleBuffer4 = byteBuffer1.asDoubleBuffer();
        // The following exception was thrown during execution in test generation
        try {
            byte byte5 = byteBuffer1.get();
            org.junit.Assert.fail("Expected exception of type java.nio.BufferUnderflowException; message: null");
        } catch (java.nio.BufferUnderflowException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertNotNull(doubleBuffer4);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response2 = org.jsoup.helper.HttpConnection.Response.execute(request0, response1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate((int) (byte) 10);
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.nio.ByteBuffer byteBuffer6 = java.nio.ByteBuffer.wrap(byteArray5);
        java.nio.ByteBuffer byteBuffer7 = byteBuffer1.get(byteArray5);
        java.nio.IntBuffer intBuffer8 = byteBuffer7.asIntBuffer();
        int int9 = intBuffer8.capacity();
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(byteBuffer6);
        org.junit.Assert.assertNotNull(byteBuffer7);
        org.junit.Assert.assertNotNull(intBuffer8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
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
        // The following exception was thrown during execution in test generation
        try {
            short short14 = byteBuffer13.getShort();
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
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int6 = response5.statusCode;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response5);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Too many redirects occurred trying to load URL null");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean3 = response2.executed;
        java.lang.String str5 = response2.getHeaderCaseInsensitive("");
        java.net.HttpURLConnection httpURLConnection6 = null;
        org.jsoup.helper.HttpConnection.Response response7 = null;
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response7);
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response7);
        boolean boolean10 = response9.executed;
        java.lang.String str12 = response9.getHeaderCaseInsensitive("");
        java.lang.String str14 = response9.cookie("java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]");
        int int15 = response9.statusCode();
        org.jsoup.Connection.Response response18 = response9.cookie("hi!", "");
        // The following exception was thrown during execution in test generation
        try {
            response2.setupFromConnection(httpURLConnection6, (org.jsoup.Connection.Response) response9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(response18);
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response0);
        response4.numRedirects = 'a';
        java.net.HttpURLConnection httpURLConnection7 = null;
        org.jsoup.helper.HttpConnection.Response response8 = null;
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response8);
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response8);
        boolean boolean11 = response10.executed;
        response10.statusCode = 0;
        // The following exception was thrown during execution in test generation
        try {
            response4.setupFromConnection(httpURLConnection7, (org.jsoup.Connection.Response) response10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
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
            java.nio.ByteBuffer byteBuffer23 = java.nio.ByteBuffer.wrap(byteArray15, (int) (short) 100, (int) '4');
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
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request3 = response2.req;
        org.jsoup.Connection.Method method4 = response2.method();
        java.lang.String str5 = response2.contentType;
        org.jsoup.Connection.Response response7 = response2.removeHeader("java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response2);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Too many redirects occurred trying to load URL null");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(request3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(response7);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.statusCode();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response5 = response1.header("", "java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Negative capacity: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.isReadOnly();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        int int4 = byteBuffer1.position();
        java.nio.ByteOrder byteOrder5 = null;
        java.nio.ByteBuffer byteBuffer6 = byteBuffer1.order(byteOrder5);
        int int7 = byteBuffer6.limit();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer9 = byteBuffer6.putChar('4');
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
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer2 = byteBuffer1.asDoubleBuffer();
        java.nio.ByteBuffer byteBuffer4 = java.nio.ByteBuffer.allocate(0);
        boolean boolean5 = byteBuffer4.isReadOnly();
        java.nio.ShortBuffer shortBuffer6 = byteBuffer4.asShortBuffer();
        java.nio.ByteBuffer byteBuffer8 = java.nio.ByteBuffer.allocate(0);
        boolean boolean9 = byteBuffer8.isReadOnly();
        int int10 = byteBuffer4.compareTo(byteBuffer8);
        java.nio.DoubleBuffer doubleBuffer11 = byteBuffer8.asDoubleBuffer();
        java.nio.FloatBuffer floatBuffer12 = byteBuffer8.asFloatBuffer();
        java.nio.ByteBuffer byteBuffer14 = java.nio.ByteBuffer.allocate((int) (byte) 10);
        byte[] byteArray18 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.nio.ByteBuffer byteBuffer19 = java.nio.ByteBuffer.wrap(byteArray18);
        java.nio.ByteBuffer byteBuffer20 = byteBuffer14.get(byteArray18);
        java.nio.ByteBuffer byteBuffer23 = byteBuffer8.put(byteArray18, 0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer26 = byteBuffer1.put(byteArray18, (int) (short) 100, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(doubleBuffer2);
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(shortBuffer6);
        org.junit.Assert.assertNotNull(byteBuffer8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(doubleBuffer11);
        org.junit.Assert.assertNotNull(floatBuffer12);
        org.junit.Assert.assertNotNull(byteBuffer14);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(byteBuffer19);
        org.junit.Assert.assertNotNull(byteBuffer20);
        org.junit.Assert.assertNotNull(byteBuffer23);
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.hasRemaining();
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.asReadOnlyBuffer();
        java.nio.LongBuffer longBuffer4 = byteBuffer1.asLongBuffer();
        // The following exception was thrown during execution in test generation
        try {
            byte byte6 = byteBuffer1.get(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertNotNull(longBuffer4);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.isReadOnly();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        java.nio.ByteBuffer byteBuffer5 = java.nio.ByteBuffer.allocate(0);
        boolean boolean6 = byteBuffer5.isReadOnly();
        int int7 = byteBuffer1.compareTo(byteBuffer5);
        java.nio.DoubleBuffer doubleBuffer8 = byteBuffer5.asDoubleBuffer();
        // The following exception was thrown during execution in test generation
        try {
            long long9 = byteBuffer5.getLong();
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
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer2 = byteBuffer1.asDoubleBuffer();
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.compact();
        // The following exception was thrown during execution in test generation
        try {
            byte byte5 = byteBuffer3.get((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(doubleBuffer2);
        org.junit.Assert.assertNotNull(byteBuffer3);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        org.jsoup.helper.HttpConnection.Response.MAX_REDIRECTS = 0;
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
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
            double double14 = byteBuffer7.getDouble((int) (byte) 1);
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
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
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
            long long20 = byteBuffer17.getLong(0);
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
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response0);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response5);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Too many redirects occurred trying to load URL null");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.nio.ByteBuffer byteBuffer4 = response3.byteData;
        org.jsoup.Connection.Response response7 = response3.cookie("hi!", "");
        boolean boolean8 = response3.executed;
        java.lang.String str9 = response3.charset();
        java.net.URL uRL10 = response3.url();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response3);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Too many redirects occurred trying to load URL null");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(byteBuffer4);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(uRL10);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
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
        byte[] byteArray16 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.nio.ByteBuffer byteBuffer17 = java.nio.ByteBuffer.wrap(byteArray16);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer18 = byteBuffer7.put(byteArray16);
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
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[100, 1, 1]");
        org.junit.Assert.assertNotNull(byteBuffer17);
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
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
            short short22 = byteBuffer5.getShort((int) (byte) 100);
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
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str4 = response2.header("");
        org.jsoup.Connection.Response response6 = response2.removeCookie("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response7 = org.jsoup.helper.HttpConnection.Response.execute(request0, response2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(response6);
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
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
            long long20 = byteBuffer18.getLong(0);
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
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer2 = byteBuffer1.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        java.nio.ByteBuffer byteBuffer4 = byteBuffer1.compact();
        int int5 = byteBuffer1.remaining();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer8 = byteBuffer1.putDouble((int) ' ', (double) 100);
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
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate((int) (byte) 10);
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.nio.ByteBuffer byteBuffer6 = java.nio.ByteBuffer.wrap(byteArray5);
        java.nio.ByteBuffer byteBuffer7 = byteBuffer1.get(byteArray5);
        java.nio.Buffer buffer8 = byteBuffer1.rewind();
        int int9 = byteBuffer1.position();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer12 = byteBuffer1.putDouble((int) '4', (double) 1L);
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
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
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
            char char14 = byteBuffer7.getChar((int) (short) 100);
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
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean3 = response2.executed;
        response2.statusCode = 0;
        org.jsoup.Connection.Method method6 = response2.method();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response2);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Too many redirects occurred trying to load URL null");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(method6);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
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
            org.jsoup.nodes.Document document12 = response5.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer2 = byteBuffer1.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        java.nio.ByteOrder byteOrder4 = null;
        java.nio.ByteBuffer byteBuffer5 = byteBuffer1.order(byteOrder4);
        java.nio.ByteBuffer byteBuffer6 = byteBuffer5.asReadOnlyBuffer();
        java.nio.Buffer buffer7 = byteBuffer5.clear();
        // The following exception was thrown during execution in test generation
        try {
            int int9 = byteBuffer5.getInt((int) (short) 0);
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
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer2 = byteBuffer1.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        java.nio.ByteOrder byteOrder4 = null;
        java.nio.ByteBuffer byteBuffer5 = byteBuffer1.order(byteOrder4);
        java.nio.ByteBuffer byteBuffer6 = byteBuffer5.asReadOnlyBuffer();
        int int7 = byteBuffer5.arrayOffset();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer10 = byteBuffer5.putShort((-1), (short) 1);
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
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate((int) (byte) 10);
        int int2 = byteBuffer1.getInt();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer5 = byteBuffer1.put((int) (short) 10, (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str4 = response2.header("");
        org.jsoup.Connection.Response response6 = response2.removeCookie("hi!");
        java.lang.String str8 = response2.cookie("");
        java.lang.String str9 = response2.statusMessage();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response10 = org.jsoup.helper.HttpConnection.Response.execute(request0, response2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect((int) '#');
        float float3 = byteBuffer1.getFloat(1);
        char char4 = byteBuffer1.getChar();
        // The following exception was thrown during execution in test generation
        try {
            int int5 = byteBuffer1.arrayOffset();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + '\000' + "'", char4 == '\000');
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.isReadOnly();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        int int4 = byteBuffer1.position();
        java.nio.ByteOrder byteOrder5 = null;
        java.nio.ByteBuffer byteBuffer6 = byteBuffer1.order(byteOrder5);
        int int7 = byteBuffer6.limit();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer10 = byteBuffer6.putDouble((int) '#', 0.0d);
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
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response0);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document6 = response5.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer2 = byteBuffer1.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        boolean boolean4 = shortBuffer3.hasRemaining();
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(doubleBuffer2);
        org.junit.Assert.assertNotNull(shortBuffer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate((int) (byte) 10);
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.nio.ByteBuffer byteBuffer6 = java.nio.ByteBuffer.wrap(byteArray5);
        java.nio.ByteBuffer byteBuffer7 = byteBuffer1.get(byteArray5);
        java.nio.ByteBuffer byteBuffer8 = byteBuffer1.slice();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer11 = byteBuffer1.put(10, (byte) 10);
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
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.isReadOnly();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        int int4 = byteBuffer1.position();
        java.nio.ByteOrder byteOrder5 = null;
        java.nio.ByteBuffer byteBuffer6 = byteBuffer1.order(byteOrder5);
        java.nio.ByteBuffer byteBuffer7 = byteBuffer1.asReadOnlyBuffer();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer10 = byteBuffer7.putShort(100, (short) (byte) 10);
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
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map<java.lang.String, java.lang.String> strMap2 = response1.headers();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response1);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Too many redirects occurred trying to load URL null");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
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
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer44 = byteBuffer5.put(byteArray36, 10, 100);
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
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer2 = byteBuffer1.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        java.nio.ByteOrder byteOrder4 = null;
        java.nio.ByteBuffer byteBuffer5 = byteBuffer1.order(byteOrder4);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer8 = byteBuffer5.putDouble(0, (double) ' ');
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
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        byte[] byteArray0 = new byte[] {};
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.wrap(byteArray0);
        // The following exception was thrown during execution in test generation
        try {
            byte byte2 = byteBuffer1.get();
            org.junit.Assert.fail("Expected exception of type java.nio.BufferUnderflowException; message: null");
        } catch (java.nio.BufferUnderflowException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNotNull(byteBuffer1);
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
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
            long long11 = byteBuffer5.getLong((-1));
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
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.isReadOnly();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        java.nio.ByteBuffer byteBuffer5 = java.nio.ByteBuffer.allocate(0);
        boolean boolean6 = byteBuffer5.isReadOnly();
        int int7 = byteBuffer1.compareTo(byteBuffer5);
        java.nio.DoubleBuffer doubleBuffer8 = byteBuffer5.asDoubleBuffer();
        int int9 = doubleBuffer8.position();
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(shortBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(doubleBuffer8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer2 = byteBuffer1.asDoubleBuffer();
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.compact();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer6 = byteBuffer1.putInt((int) (short) -1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(doubleBuffer2);
        org.junit.Assert.assertNotNull(byteBuffer3);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.isReadOnly();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        java.nio.ByteBuffer byteBuffer5 = java.nio.ByteBuffer.allocate(0);
        boolean boolean6 = byteBuffer5.isReadOnly();
        int int7 = byteBuffer1.compareTo(byteBuffer5);
        java.nio.ByteBuffer byteBuffer8 = byteBuffer5.compact();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer10 = byteBuffer8.putLong((-1L));
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
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean3 = response2.executed;
        response2.statusCode = 0;
        java.lang.String str6 = response2.contentType();
        org.jsoup.Connection.Response response9 = response2.cookie("java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]", "java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response2);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Too many redirects occurred trying to load URL null");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(response9);
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request3 = response2.req;
        org.jsoup.Connection.Method method4 = response2.method();
        response2.statusMessage = "java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]";
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response2);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Too many redirects occurred trying to load URL null");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(request3);
        org.junit.Assert.assertNull(method4);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.isReadOnly();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        java.nio.ByteBuffer byteBuffer5 = java.nio.ByteBuffer.allocate(0);
        boolean boolean6 = byteBuffer5.isReadOnly();
        int int7 = byteBuffer1.compareTo(byteBuffer5);
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
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer29 = byteBuffer1.put(byteArray23);
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
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer2 = byteBuffer1.asDoubleBuffer();
        java.nio.FloatBuffer floatBuffer3 = byteBuffer1.asFloatBuffer();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer5 = byteBuffer1.putInt(1);
            org.junit.Assert.fail("Expected exception of type java.nio.BufferOverflowException; message: null");
        } catch (java.nio.BufferOverflowException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(doubleBuffer2);
        org.junit.Assert.assertNotNull(floatBuffer3);
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer2 = byteBuffer1.asDoubleBuffer();
        boolean boolean3 = byteBuffer1.isDirect();
        java.lang.String str4 = byteBuffer1.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer7 = byteBuffer1.putShort((int) ' ', (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(doubleBuffer2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]" + "'", str4, "java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]");
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.isReadOnly();
        int int3 = byteBuffer1.position();
        java.lang.Class<?> wildcardClass4 = byteBuffer1.getClass();
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.isReadOnly();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        boolean boolean4 = byteBuffer1.hasArray();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer6 = byteBuffer1.putChar('#');
            org.junit.Assert.fail("Expected exception of type java.nio.BufferOverflowException; message: null");
        } catch (java.nio.BufferOverflowException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(shortBuffer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.isReadOnly();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        java.nio.ByteBuffer byteBuffer5 = java.nio.ByteBuffer.allocate(0);
        boolean boolean6 = byteBuffer5.isReadOnly();
        int int7 = byteBuffer1.compareTo(byteBuffer5);
        java.nio.Buffer buffer9 = byteBuffer1.limit(0);
        boolean boolean10 = buffer9.isReadOnly();
        int int11 = buffer9.position();
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(shortBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(buffer9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.header("");
        org.jsoup.Connection.Response response5 = response1.removeCookie("hi!");
        java.lang.String str6 = response1.charset();
        java.lang.String str7 = response1.charset();
        response1.charset = "hi!";
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response1);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Too many redirects occurred trying to load URL null");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
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
            org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response5);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Too many redirects occurred trying to load URL null");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer2 = byteBuffer1.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        int int4 = byteBuffer1.capacity();
        java.nio.LongBuffer longBuffer5 = byteBuffer1.asLongBuffer();
        // The following exception was thrown during execution in test generation
        try {
            short short7 = byteBuffer1.getShort(0);
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
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.nio.ByteBuffer byteBuffer4 = response3.byteData;
        org.jsoup.Connection.Response response7 = response3.cookie("hi!", "");
        java.net.URL uRL8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response9 = response3.url(uRL8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(byteBuffer4);
        org.junit.Assert.assertNotNull(response7);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer2 = byteBuffer1.asDoubleBuffer();
        boolean boolean3 = byteBuffer1.isDirect();
        int int4 = byteBuffer1.arrayOffset();
        byte[] byteArray11 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer14 = byteBuffer1.get(byteArray11, 100, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(doubleBuffer2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[0, 0, 10, -1, 1, 10]");
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.isReadOnly();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        int int4 = byteBuffer1.position();
        java.nio.ByteOrder byteOrder5 = null;
        java.nio.ByteBuffer byteBuffer6 = byteBuffer1.order(byteOrder5);
        java.nio.ByteBuffer byteBuffer7 = byteBuffer1.asReadOnlyBuffer();
        java.nio.ByteBuffer byteBuffer8 = byteBuffer7.slice();
        java.nio.ByteBuffer byteBuffer9 = byteBuffer7.duplicate();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer12 = byteBuffer7.putDouble((int) (byte) 100, (double) (byte) -1);
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
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.isReadOnly();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        int int4 = byteBuffer1.position();
        java.nio.ByteOrder byteOrder5 = null;
        java.nio.ByteBuffer byteBuffer6 = byteBuffer1.order(byteOrder5);
        byte[] byteArray10 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.nio.ByteBuffer byteBuffer11 = java.nio.ByteBuffer.wrap(byteArray10);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer12 = byteBuffer1.get(byteArray10);
            org.junit.Assert.fail("Expected exception of type java.nio.BufferUnderflowException; message: null");
        } catch (java.nio.BufferUnderflowException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(shortBuffer3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(byteBuffer6);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[100, 1, 1]");
        org.junit.Assert.assertNotNull(byteBuffer11);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.isReadOnly();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        int int4 = byteBuffer1.position();
        java.nio.ByteOrder byteOrder5 = null;
        java.nio.ByteBuffer byteBuffer6 = byteBuffer1.order(byteOrder5);
        java.nio.ByteBuffer byteBuffer7 = byteBuffer1.asReadOnlyBuffer();
        java.nio.ByteBuffer byteBuffer8 = byteBuffer7.slice();
        java.nio.ByteBuffer byteBuffer10 = java.nio.ByteBuffer.allocate(0);
        boolean boolean11 = byteBuffer10.isReadOnly();
        java.nio.ShortBuffer shortBuffer12 = byteBuffer10.asShortBuffer();
        java.nio.ByteBuffer byteBuffer14 = java.nio.ByteBuffer.allocate(0);
        boolean boolean15 = byteBuffer14.isReadOnly();
        int int16 = byteBuffer10.compareTo(byteBuffer14);
        java.nio.DoubleBuffer doubleBuffer17 = byteBuffer14.asDoubleBuffer();
        java.nio.FloatBuffer floatBuffer18 = byteBuffer14.asFloatBuffer();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer19 = byteBuffer7.put(byteBuffer14);
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
        org.junit.Assert.assertNotNull(byteBuffer10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(shortBuffer12);
        org.junit.Assert.assertNotNull(byteBuffer14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(doubleBuffer17);
        org.junit.Assert.assertNotNull(floatBuffer18);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.statusCode();
        boolean boolean4 = response1.hasHeader("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response1);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Too many redirects occurred trying to load URL null");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer2 = byteBuffer1.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        java.nio.ByteOrder byteOrder4 = null;
        java.nio.ByteBuffer byteBuffer5 = byteBuffer1.order(byteOrder4);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer7 = byteBuffer1.putDouble((double) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.nio.BufferOverflowException; message: null");
        } catch (java.nio.BufferOverflowException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(doubleBuffer2);
        org.junit.Assert.assertNotNull(shortBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer5);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.isReadOnly();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        int int4 = byteBuffer1.position();
        java.nio.ByteOrder byteOrder5 = null;
        java.nio.ByteBuffer byteBuffer6 = byteBuffer1.order(byteOrder5);
        java.nio.ByteBuffer byteBuffer7 = byteBuffer1.asReadOnlyBuffer();
        // The following exception was thrown during execution in test generation
        try {
            byte byte8 = byteBuffer1.get();
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
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer2 = byteBuffer1.asDoubleBuffer();
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.compact();
        java.lang.String str4 = byteBuffer1.toString();
        int int5 = byteBuffer1.arrayOffset();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer8 = byteBuffer1.putDouble((int) (byte) 100, (double) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(doubleBuffer2);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]" + "'", str4, "java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response1);
        boolean boolean4 = response3.executed;
        java.lang.String str6 = response3.getHeaderCaseInsensitive("");
        java.net.URL uRL7 = response3.url();
        org.jsoup.Connection.Response response9 = response3.removeCookie("");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry11 = response3.scanHeaders("");
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
        org.junit.Assert.assertNull(strEntry11);
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer2 = byteBuffer1.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        java.nio.ByteOrder byteOrder4 = null;
        java.nio.ByteBuffer byteBuffer5 = byteBuffer1.order(byteOrder4);
        java.lang.String str6 = byteBuffer1.toString();
        // The following exception was thrown during execution in test generation
        try {
            char char7 = byteBuffer1.getChar();
            org.junit.Assert.fail("Expected exception of type java.nio.BufferUnderflowException; message: null");
        } catch (java.nio.BufferUnderflowException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(doubleBuffer2);
        org.junit.Assert.assertNotNull(shortBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]" + "'", str6, "java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]");
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate((int) ' ');
        int int3 = byteBuffer1.getInt((int) (short) 0);
        java.nio.CharBuffer charBuffer4 = byteBuffer1.asCharBuffer();
        java.lang.Class<?> wildcardClass5 = byteBuffer1.getClass();
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(charBuffer4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
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
            java.nio.Buffer buffer18 = byteBuffer15.limit((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
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
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        org.jsoup.helper.HttpConnection.Response.MAX_REDIRECTS = '#';
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer2 = byteBuffer1.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        java.nio.ByteBuffer byteBuffer4 = byteBuffer1.compact();
        java.nio.ByteBuffer byteBuffer5 = byteBuffer1.slice();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.Buffer buffer7 = byteBuffer1.position((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: newPosition > limit: (10 > 0)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(doubleBuffer2);
        org.junit.Assert.assertNotNull(shortBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertNotNull(byteBuffer5);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer2 = byteBuffer1.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        int int4 = byteBuffer1.capacity();
        java.nio.LongBuffer longBuffer5 = byteBuffer1.asLongBuffer();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer8 = byteBuffer1.putDouble((int) (byte) 1, (double) ' ');
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
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
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
            java.nio.ByteBuffer byteBuffer14 = byteBuffer5.putInt((int) (byte) -1, (int) (short) 10);
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
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
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
            java.nio.ByteBuffer byteBuffer9 = byteBuffer8.compact();
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
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.isReadOnly();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        int int4 = byteBuffer1.position();
        boolean boolean5 = byteBuffer1.isReadOnly();
        java.nio.ByteOrder byteOrder6 = byteBuffer1.order();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer9 = byteBuffer1.putInt(1, 35);
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
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        response2.executed = false;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response5 = org.jsoup.helper.HttpConnection.Response.execute(request0, response2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        byte[] byteArray0 = new byte[] {};
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.wrap(byteArray0);
        java.nio.Buffer buffer2 = byteBuffer1.flip();
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.asReadOnlyBuffer();
        java.nio.ByteBuffer byteBuffer4 = byteBuffer1.duplicate();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer7 = byteBuffer1.putChar((int) (short) -1, 'a');
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
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean3 = response2.executed;
        response2.statusCode = 0;
        org.jsoup.Connection.Method method6 = response2.method();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = response2.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(method6);
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.isReadOnly();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer4 = byteBuffer1.putDouble((-1.0d));
            org.junit.Assert.fail("Expected exception of type java.nio.BufferOverflowException; message: null");
        } catch (java.nio.BufferOverflowException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.header("");
        org.jsoup.Connection.Response response5 = response1.removeCookie("hi!");
        java.lang.String str7 = response1.cookie("");
        java.lang.String str8 = response1.statusMessage();
        int int9 = response1.statusCode;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document10 = response1.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate((int) (byte) 10);
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.nio.ByteBuffer byteBuffer6 = java.nio.ByteBuffer.wrap(byteArray5);
        java.nio.ByteBuffer byteBuffer7 = byteBuffer1.get(byteArray5);
        java.nio.Buffer buffer8 = byteBuffer1.rewind();
        int int9 = byteBuffer1.position();
        java.nio.Buffer buffer10 = byteBuffer1.rewind();
        boolean boolean11 = buffer10.isReadOnly();
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(byteBuffer6);
        org.junit.Assert.assertNotNull(byteBuffer7);
        org.junit.Assert.assertNotNull(buffer8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(buffer10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        byte[] byteArray0 = new byte[] {};
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.wrap(byteArray0);
        java.nio.Buffer buffer2 = byteBuffer1.flip();
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.asReadOnlyBuffer();
        java.nio.ByteOrder byteOrder4 = byteBuffer3.order();
        // The following exception was thrown during execution in test generation
        try {
            byte byte5 = byteBuffer3.get();
            org.junit.Assert.fail("Expected exception of type java.nio.BufferUnderflowException; message: null");
        } catch (java.nio.BufferUnderflowException e) {
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
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.isReadOnly();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        int int4 = byteBuffer1.position();
        java.nio.ByteOrder byteOrder5 = null;
        java.nio.ByteBuffer byteBuffer6 = byteBuffer1.order(byteOrder5);
        java.nio.ByteBuffer byteBuffer7 = byteBuffer1.asReadOnlyBuffer();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer10 = byteBuffer1.putLong((int) 'a', (long) 100);
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
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.isReadOnly();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        java.nio.ByteBuffer byteBuffer5 = java.nio.ByteBuffer.allocate(0);
        boolean boolean6 = byteBuffer5.isReadOnly();
        int int7 = byteBuffer1.compareTo(byteBuffer5);
        java.nio.DoubleBuffer doubleBuffer8 = byteBuffer5.asDoubleBuffer();
        java.nio.Buffer buffer9 = doubleBuffer8.clear();
        int int10 = doubleBuffer8.remaining();
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(shortBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(doubleBuffer8);
        org.junit.Assert.assertNotNull(buffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
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
            java.nio.Buffer buffer17 = byteBuffer1.reset();
            org.junit.Assert.fail("Expected exception of type java.nio.InvalidMarkException; message: null");
        } catch (java.nio.InvalidMarkException e) {
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
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
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
            java.nio.ByteBuffer byteBuffer12 = byteBuffer9.putDouble((int) (byte) -1, 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(byteBuffer4);
        org.junit.Assert.assertNotNull(byteBuffer7);
        org.junit.Assert.assertNotNull(byteBuffer9);
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.nio.ByteBuffer byteBuffer4 = response3.byteData;
        org.jsoup.Connection.Response response7 = response3.cookie("hi!", "");
        boolean boolean8 = response3.executed;
        java.lang.String str9 = response3.charset();
        java.net.URL uRL10 = response3.url();
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray11 = response3.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(byteBuffer4);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(uRL10);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.header("");
        org.jsoup.Connection.Response response5 = response1.removeCookie("hi!");
        java.lang.String str7 = response1.cookie("");
        response1.charset = "";
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean3 = response2.executed;
        java.lang.String str5 = response2.getHeaderCaseInsensitive("");
        java.util.Map<java.lang.String, java.lang.String> strMap6 = response2.headers();
        boolean boolean7 = response2.executed;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = response2.hasHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.isReadOnly();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        int int4 = byteBuffer1.position();
        java.nio.ByteOrder byteOrder5 = null;
        java.nio.ByteBuffer byteBuffer6 = byteBuffer1.order(byteOrder5);
        int int7 = byteBuffer6.limit();
        java.nio.Buffer buffer8 = byteBuffer6.rewind();
        java.nio.ByteBuffer byteBuffer10 = java.nio.ByteBuffer.allocate((int) (byte) 10);
        int int11 = byteBuffer10.getInt();
        java.nio.ByteBuffer byteBuffer14 = byteBuffer10.put((int) (byte) 0, (byte) 10);
        byte[] byteArray15 = byteBuffer14.array();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer16 = byteBuffer6.put(byteArray15);
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
        org.junit.Assert.assertNotNull(byteBuffer10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(byteBuffer14);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[10, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect((int) '#');
        java.nio.ByteBuffer byteBuffer4 = byteBuffer1.putShort((int) (short) 1, (short) (byte) 10);
        java.lang.Class<?> wildcardClass5 = byteBuffer4.getClass();
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.ByteBuffer byteBuffer2 = byteBuffer1.slice();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer6 = byteBuffer1.putChar((-1), 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteBuffer2);
        org.junit.Assert.assertNotNull(shortBuffer3);
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer2 = byteBuffer1.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        java.nio.ByteOrder byteOrder4 = null;
        java.nio.ByteBuffer byteBuffer5 = byteBuffer1.order(byteOrder4);
        // The following exception was thrown during execution in test generation
        try {
            int int6 = byteBuffer5.getInt();
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
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.isReadOnly();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        int int4 = byteBuffer1.position();
        boolean boolean5 = byteBuffer1.isReadOnly();
        java.nio.CharBuffer charBuffer6 = byteBuffer1.asCharBuffer();
        boolean boolean7 = byteBuffer1.hasRemaining();
        // The following exception was thrown during execution in test generation
        try {
            int int9 = byteBuffer1.getInt((int) '#');
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
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.isReadOnly();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        java.nio.ByteBuffer byteBuffer5 = java.nio.ByteBuffer.allocate(0);
        boolean boolean6 = byteBuffer5.isReadOnly();
        int int7 = byteBuffer1.compareTo(byteBuffer5);
        java.nio.ByteBuffer byteBuffer8 = byteBuffer5.compact();
        boolean boolean9 = byteBuffer8.hasRemaining();
        java.nio.ByteBuffer byteBuffer11 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer12 = byteBuffer11.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer13 = byteBuffer11.asShortBuffer();
        byte[] byteArray14 = byteBuffer11.array();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer17 = byteBuffer8.put(byteArray14, 1, (int) 'a');
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
        org.junit.Assert.assertNotNull(doubleBuffer12);
        org.junit.Assert.assertNotNull(shortBuffer13);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[]");
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request3 = response2.req;
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response2);
        java.lang.String str5 = response4.contentType;
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response4);
        org.jsoup.Connection.Method method7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response8 = response4.method(method7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(request3);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate((int) (byte) 10);
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.nio.ByteBuffer byteBuffer6 = java.nio.ByteBuffer.wrap(byteArray5);
        java.nio.ByteBuffer byteBuffer7 = byteBuffer1.get(byteArray5);
        java.nio.Buffer buffer8 = byteBuffer1.rewind();
        byte[] byteArray12 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.nio.ByteBuffer byteBuffer13 = java.nio.ByteBuffer.wrap(byteArray12);
        java.nio.ByteBuffer byteBuffer14 = byteBuffer1.put(byteArray12);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer17 = java.nio.ByteBuffer.wrap(byteArray12, 100, 1);
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
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer2 = byteBuffer1.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        byte[] byteArray4 = byteBuffer1.array();
        java.nio.ByteBuffer byteBuffer5 = java.nio.ByteBuffer.wrap(byteArray4);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer8 = java.nio.ByteBuffer.wrap(byteArray4, (int) (short) -1, (int) (byte) 0);
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
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer2 = byteBuffer1.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        java.nio.ByteBuffer byteBuffer4 = byteBuffer1.compact();
        int int5 = byteBuffer1.remaining();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer8 = byteBuffer1.putDouble((-1), 0.0d);
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
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.isReadOnly();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        java.nio.ByteBuffer byteBuffer5 = java.nio.ByteBuffer.allocate(0);
        boolean boolean6 = byteBuffer5.isReadOnly();
        int int7 = byteBuffer1.compareTo(byteBuffer5);
        java.nio.Buffer buffer9 = byteBuffer1.limit(0);
        java.nio.Buffer buffer10 = byteBuffer1.rewind();
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
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer35 = byteBuffer1.get(byteArray26, (int) (short) 10, (int) (short) -1);
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
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.hasRemaining();
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.asReadOnlyBuffer();
        java.nio.DoubleBuffer doubleBuffer4 = byteBuffer1.asDoubleBuffer();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.Buffer buffer5 = byteBuffer1.reset();
            org.junit.Assert.fail("Expected exception of type java.nio.InvalidMarkException; message: null");
        } catch (java.nio.InvalidMarkException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertNotNull(doubleBuffer4);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request3 = response2.req;
        org.jsoup.Connection.Method method4 = response2.method();
        java.lang.String str6 = response2.getHeaderCaseInsensitive("java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document7 = response2.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(request3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Request request4 = response3.req;
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response3);
        java.lang.String str6 = response5.contentType;
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response5);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response8 = org.jsoup.helper.HttpConnection.Response.execute(request0, response5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(request4);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer2 = byteBuffer1.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        java.nio.ByteBuffer byteBuffer4 = byteBuffer1.compact();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer7 = byteBuffer4.putFloat((int) (byte) 1, (float) (short) 1);
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
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.isReadOnly();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        int int4 = byteBuffer1.position();
        java.nio.ByteOrder byteOrder5 = null;
        java.nio.ByteBuffer byteBuffer6 = byteBuffer1.order(byteOrder5);
        java.nio.ShortBuffer shortBuffer7 = byteBuffer6.asShortBuffer();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer9 = byteBuffer6.putChar('a');
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
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer2 = byteBuffer1.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        byte[] byteArray4 = byteBuffer1.array();
        // The following exception was thrown during execution in test generation
        try {
            double double5 = byteBuffer1.getDouble();
            org.junit.Assert.fail("Expected exception of type java.nio.BufferUnderflowException; message: null");
        } catch (java.nio.BufferUnderflowException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(doubleBuffer2);
        org.junit.Assert.assertNotNull(shortBuffer3);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[]");
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean3 = response2.executed;
        response2.statusCode = 0;
        java.lang.String str6 = response2.contentType();
        org.jsoup.Connection.Response response9 = response2.cookie("java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]", "java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry11 = response2.scanHeaders("hi!");
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response2);
        java.net.URL uRL13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response14 = response2.url(uRL13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertNull(strEntry11);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer2 = byteBuffer1.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        java.nio.ByteOrder byteOrder4 = null;
        java.nio.ByteBuffer byteBuffer5 = byteBuffer1.order(byteOrder4);
        java.nio.ByteBuffer byteBuffer6 = byteBuffer5.asReadOnlyBuffer();
        boolean boolean7 = byteBuffer6.hasRemaining();
        // The following exception was thrown during execution in test generation
        try {
            float float8 = byteBuffer6.getFloat();
            org.junit.Assert.fail("Expected exception of type java.nio.BufferUnderflowException; message: null");
        } catch (java.nio.BufferUnderflowException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(doubleBuffer2);
        org.junit.Assert.assertNotNull(shortBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertNotNull(byteBuffer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
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
            org.jsoup.nodes.Document document13 = response2.parse();
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
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.nio.ByteBuffer byteBuffer4 = response3.byteData;
        org.jsoup.Connection.Response response7 = response3.cookie("hi!", "");
        boolean boolean8 = response3.executed;
        org.jsoup.Connection.Request request9 = response3.req;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document10 = response3.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(byteBuffer4);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(request9);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.isReadOnly();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        boolean boolean4 = byteBuffer1.hasArray();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.Buffer buffer5 = byteBuffer1.reset();
            org.junit.Assert.fail("Expected exception of type java.nio.InvalidMarkException; message: null");
        } catch (java.nio.InvalidMarkException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(shortBuffer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        byte[] byteArray0 = new byte[] {};
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.wrap(byteArray0);
        java.nio.Buffer buffer2 = byteBuffer1.flip();
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.asReadOnlyBuffer();
        java.nio.ByteOrder byteOrder4 = byteBuffer3.order();
        // The following exception was thrown during execution in test generation
        try {
            int int6 = byteBuffer3.getInt((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
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
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer2 = byteBuffer1.asDoubleBuffer();
        java.nio.FloatBuffer floatBuffer3 = byteBuffer1.asFloatBuffer();
        java.lang.Class<?> wildcardClass4 = floatBuffer3.getClass();
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(doubleBuffer2);
        org.junit.Assert.assertNotNull(floatBuffer3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.nio.ByteBuffer byteBuffer5 = response4.byteData;
        org.jsoup.Connection.Response response8 = response4.cookie("hi!", "");
        boolean boolean9 = response4.executed;
        org.jsoup.Connection.Request request10 = response4.req;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response11 = org.jsoup.helper.HttpConnection.Response.execute(request0, response4);
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
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer2 = byteBuffer1.asDoubleBuffer();
        boolean boolean3 = byteBuffer1.isDirect();
        java.lang.String str4 = byteBuffer1.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer6 = byteBuffer1.putInt((int) (byte) 100);
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
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.nio.ByteBuffer byteBuffer4 = response3.byteData;
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = response3.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(byteBuffer4);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
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
        // The following exception was thrown during execution in test generation
        try {
            long long16 = byteBuffer13.getLong();
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
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.header("");
        org.jsoup.Connection.Response response5 = response1.removeCookie("hi!");
        java.lang.String str7 = response1.cookie("");
        java.lang.String str8 = response1.statusMessage();
        response1.executed = false;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
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
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray19 = response18.bodyAsBytes();
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
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
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
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer13 = byteBuffer5.putChar('\000');
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
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.isReadOnly();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        int int4 = byteBuffer1.position();
        boolean boolean5 = byteBuffer1.isReadOnly();
        java.nio.CharBuffer charBuffer6 = byteBuffer1.asCharBuffer();
        boolean boolean7 = byteBuffer1.hasRemaining();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer10 = byteBuffer1.put(1677787392, (byte) 100);
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
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request3 = response2.req;
        org.jsoup.Connection.Method method4 = response2.method();
        response2.statusMessage = "java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]";
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = response2.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(request3);
        org.junit.Assert.assertNull(method4);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Request request4 = response3.req;
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response3);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response6 = org.jsoup.helper.HttpConnection.Response.execute(request0, response5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(request4);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str4 = response3.statusMessage();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response7 = response3.cookie("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
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
            double double14 = byteBuffer12.getDouble((int) (short) 1);
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
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer2 = byteBuffer1.asDoubleBuffer();
        boolean boolean3 = byteBuffer1.isDirect();
        int int4 = byteBuffer1.arrayOffset();
        java.nio.ByteBuffer byteBuffer5 = byteBuffer1.asReadOnlyBuffer();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer8 = byteBuffer5.putInt(0, 35);
            org.junit.Assert.fail("Expected exception of type java.nio.ReadOnlyBufferException; message: null");
        } catch (java.nio.ReadOnlyBufferException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(doubleBuffer2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(byteBuffer5);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer2 = byteBuffer1.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        java.nio.ByteOrder byteOrder4 = null;
        java.nio.ByteBuffer byteBuffer5 = byteBuffer1.order(byteOrder4);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer8 = byteBuffer1.putChar((int) '\000', '4');
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
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.nio.ByteBuffer byteBuffer4 = response3.byteData;
        org.jsoup.Connection.Response response7 = response3.cookie("hi!", "");
        java.net.URL uRL8 = response3.url();
        response3.charset = "";
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = response3.hasHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(byteBuffer4);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(uRL8);
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
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
        java.net.URL uRL13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response14 = response11.url(uRL13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(byteBuffer4);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(uRL8);
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
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
            byte byte14 = byteBuffer5.get((int) '\000');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: 0");
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
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        byte[] byteArray0 = new byte[] {};
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.wrap(byteArray0);
        java.nio.Buffer buffer2 = byteBuffer1.flip();
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.asReadOnlyBuffer();
        java.nio.ByteOrder byteOrder4 = byteBuffer3.order();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer7 = byteBuffer3.putShort(0, (short) 10);
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
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response14 = org.jsoup.helper.HttpConnection.Response.execute(request0, response3);
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
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
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
            java.nio.ByteBuffer byteBuffer21 = byteBuffer12.put(byteArray17, (int) (byte) 100, (int) '4');
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
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
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
            java.nio.ByteBuffer byteBuffer17 = byteBuffer14.putInt((-1), (int) (byte) 10);
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
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.isReadOnly();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        int int4 = byteBuffer1.position();
        java.nio.ByteOrder byteOrder5 = null;
        java.nio.ByteBuffer byteBuffer6 = byteBuffer1.order(byteOrder5);
        java.nio.ByteBuffer byteBuffer7 = byteBuffer1.asReadOnlyBuffer();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.Buffer buffer9 = byteBuffer7.position((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: newPosition > limit: (100 > 0)");
        } catch (java.lang.IllegalArgumentException e) {
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
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.isReadOnly();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        java.nio.ByteBuffer byteBuffer4 = byteBuffer1.duplicate();
        // The following exception was thrown during execution in test generation
        try {
            double double5 = byteBuffer4.getDouble();
            org.junit.Assert.fail("Expected exception of type java.nio.BufferUnderflowException; message: null");
        } catch (java.nio.BufferUnderflowException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(shortBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer4);
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean3 = response2.executed;
        response2.statusCode = 0;
        java.lang.String str6 = response2.contentType();
        java.net.HttpURLConnection httpURLConnection7 = null;
        org.jsoup.helper.HttpConnection.Response response8 = null;
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response8);
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response8);
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response8);
        java.lang.String str12 = response11.statusMessage();
        response11.contentType = "";
        java.lang.String str15 = response11.statusMessage;
        java.lang.String str16 = response11.contentType;
        // The following exception was thrown during execution in test generation
        try {
            response2.setupFromConnection(httpURLConnection7, (org.jsoup.Connection.Response) response11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        org.jsoup.helper.HttpConnection.Response.MAX_REDIRECTS = (byte) 1;
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        int int3 = response2.statusCode();
        boolean boolean5 = response2.hasHeader("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response6 = org.jsoup.helper.HttpConnection.Response.execute(request0, response2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
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
            float float11 = byteBuffer5.getFloat((int) ' ');
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
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer2 = byteBuffer1.asDoubleBuffer();
        boolean boolean3 = byteBuffer1.isDirect();
        int int4 = byteBuffer1.arrayOffset();
        // The following exception was thrown during execution in test generation
        try {
            short short6 = byteBuffer1.getShort(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(doubleBuffer2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer2 = byteBuffer1.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        int int4 = byteBuffer1.capacity();
        java.nio.ByteBuffer byteBuffer6 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer7 = byteBuffer6.asDoubleBuffer();
        boolean boolean8 = byteBuffer6.isDirect();
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
        java.nio.ByteBuffer byteBuffer22 = byteBuffer14.slice();
        java.nio.ByteBuffer byteBuffer23 = byteBuffer6.put(byteBuffer22);
        byte[] byteArray24 = byteBuffer22.array();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer27 = byteBuffer1.put(byteArray24, (int) (byte) -1, 1677787392);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(doubleBuffer2);
        org.junit.Assert.assertNotNull(shortBuffer3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(byteBuffer6);
        org.junit.Assert.assertNotNull(doubleBuffer7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
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
        org.junit.Assert.assertNotNull(byteBuffer22);
        org.junit.Assert.assertNotNull(byteBuffer23);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[]");
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
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
            long long24 = byteBuffer20.getLong((int) (byte) 0);
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
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.isReadOnly();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        java.nio.ByteBuffer byteBuffer4 = byteBuffer1.duplicate();
        java.nio.ByteBuffer byteBuffer5 = byteBuffer1.slice();
        java.nio.Buffer buffer6 = byteBuffer1.mark();
        java.nio.ByteBuffer byteBuffer8 = java.nio.ByteBuffer.allocateDirect((int) '#');
        java.nio.ByteBuffer byteBuffer10 = byteBuffer8.putShort((short) 0);
        java.nio.ByteBuffer byteBuffer12 = byteBuffer8.putDouble((double) '\000');
        char char13 = byteBuffer12.getChar();
        java.nio.Buffer buffer14 = byteBuffer12.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer15 = byteBuffer1.put(byteBuffer12);
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
        org.junit.Assert.assertNotNull(byteBuffer8);
        org.junit.Assert.assertNotNull(byteBuffer10);
        org.junit.Assert.assertNotNull(byteBuffer12);
        org.junit.Assert.assertTrue("'" + char13 + "' != '" + '\000' + "'", char13 == '\000');
        org.junit.Assert.assertNotNull(buffer14);
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
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
            java.nio.ByteBuffer byteBuffer17 = byteBuffer15.putInt((int) (short) 0);
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
        org.junit.Assert.assertNotNull(buffer8);
        org.junit.Assert.assertNotNull(byteBuffer10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(byteBuffer12);
        org.junit.Assert.assertNotNull(byteBuffer13);
        org.junit.Assert.assertNotNull(buffer14);
        org.junit.Assert.assertNotNull(byteBuffer15);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        org.jsoup.helper.HttpConnection.Response.MAX_REDIRECTS = ' ';
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response20 = org.jsoup.helper.HttpConnection.Response.execute(request0, response6);
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
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
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
            float float14 = byteBuffer11.getFloat(0);
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
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.isReadOnly();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer5 = byteBuffer1.putInt((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.nio.BufferOverflowException; message: null");
        } catch (java.nio.BufferOverflowException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(shortBuffer3);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.hasRemaining();
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.asReadOnlyBuffer();
        java.nio.LongBuffer longBuffer4 = byteBuffer1.asLongBuffer();
        // The following exception was thrown during execution in test generation
        try {
            long long5 = byteBuffer1.getLong();
            org.junit.Assert.fail("Expected exception of type java.nio.BufferUnderflowException; message: null");
        } catch (java.nio.BufferUnderflowException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertNotNull(longBuffer4);
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request3 = response2.req;
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response2);
        java.lang.String str6 = response2.cookie("");
        org.jsoup.Connection.Method method7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response8 = response2.method(method7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(request3);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
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
            java.nio.Buffer buffer10 = byteBuffer8.position((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: newPosition > limit: (35 > 0)");
        } catch (java.lang.IllegalArgumentException e) {
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
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.isReadOnly();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        java.nio.ByteBuffer byteBuffer5 = java.nio.ByteBuffer.allocate(0);
        boolean boolean6 = byteBuffer5.isReadOnly();
        int int7 = byteBuffer1.compareTo(byteBuffer5);
        java.nio.DoubleBuffer doubleBuffer8 = byteBuffer5.asDoubleBuffer();
        java.nio.FloatBuffer floatBuffer9 = byteBuffer5.asFloatBuffer();
        int int10 = byteBuffer5.position();
        int int11 = byteBuffer5.remaining();
        // The following exception was thrown during execution in test generation
        try {
            long long12 = byteBuffer5.getLong();
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
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.hasRemaining();
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.asReadOnlyBuffer();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer5 = byteBuffer1.putShort((short) 100);
            org.junit.Assert.fail("Expected exception of type java.nio.BufferOverflowException; message: null");
        } catch (java.nio.BufferOverflowException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(byteBuffer3);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer2 = byteBuffer1.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        java.nio.ByteBuffer byteBuffer4 = byteBuffer1.compact();
        java.nio.ByteBuffer byteBuffer5 = byteBuffer1.slice();
        java.nio.Buffer buffer6 = byteBuffer5.flip();
        // The following exception was thrown during execution in test generation
        try {
            short short8 = byteBuffer5.getShort(1);
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
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str4 = response2.header("");
        org.jsoup.Connection.Response response6 = response2.removeCookie("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap7 = response2.headers();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response8 = org.jsoup.helper.HttpConnection.Response.execute(request0, response2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNotNull(strMap7);
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer2 = byteBuffer1.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        java.nio.ByteOrder byteOrder4 = null;
        java.nio.ByteBuffer byteBuffer5 = byteBuffer1.order(byteOrder4);
        java.nio.ByteBuffer byteBuffer6 = byteBuffer5.asReadOnlyBuffer();
        boolean boolean7 = byteBuffer6.hasRemaining();
        // The following exception was thrown during execution in test generation
        try {
            byte byte8 = byteBuffer6.get();
            org.junit.Assert.fail("Expected exception of type java.nio.BufferUnderflowException; message: null");
        } catch (java.nio.BufferUnderflowException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(doubleBuffer2);
        org.junit.Assert.assertNotNull(shortBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertNotNull(byteBuffer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response1);
        boolean boolean4 = response3.executed;
        java.lang.String str6 = response3.getHeaderCaseInsensitive("");
        java.net.URL uRL7 = response3.url();
        org.jsoup.Connection.Response response9 = response3.removeCookie("");
        java.nio.ByteBuffer byteBuffer10 = response3.byteData;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response11 = org.jsoup.helper.HttpConnection.Response.execute(request0, response3);
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
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer2 = byteBuffer1.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        int int4 = byteBuffer1.limit();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer6 = byteBuffer1.putDouble((double) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.nio.BufferOverflowException; message: null");
        } catch (java.nio.BufferOverflowException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(doubleBuffer2);
        org.junit.Assert.assertNotNull(shortBuffer3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.isReadOnly();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        int int4 = byteBuffer1.position();
        java.nio.ByteOrder byteOrder5 = null;
        java.nio.ByteBuffer byteBuffer6 = byteBuffer1.order(byteOrder5);
        java.nio.DoubleBuffer doubleBuffer7 = byteBuffer6.asDoubleBuffer();
        // The following exception was thrown during execution in test generation
        try {
            float float8 = byteBuffer6.getFloat();
            org.junit.Assert.fail("Expected exception of type java.nio.BufferUnderflowException; message: null");
        } catch (java.nio.BufferUnderflowException e) {
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
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.isReadOnly();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        java.nio.ByteBuffer byteBuffer4 = byteBuffer1.duplicate();
        java.nio.DoubleBuffer doubleBuffer5 = byteBuffer4.asDoubleBuffer();
        // The following exception was thrown during execution in test generation
        try {
            int int7 = byteBuffer4.getInt((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(shortBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertNotNull(doubleBuffer5);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer2 = byteBuffer1.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        java.nio.ByteOrder byteOrder4 = null;
        java.nio.ByteBuffer byteBuffer5 = byteBuffer1.order(byteOrder4);
        // The following exception was thrown during execution in test generation
        try {
            short short7 = byteBuffer5.getShort(0);
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
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
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
            java.nio.ByteBuffer byteBuffer15 = byteBuffer12.putChar('a');
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
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]" + "'", str13, "java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]");
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
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
            char char12 = byteBuffer9.getChar();
            org.junit.Assert.fail("Expected exception of type java.nio.BufferUnderflowException; message: null");
        } catch (java.nio.BufferUnderflowException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = response3.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
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
            java.nio.Buffer buffer12 = byteBuffer5.limit((-1));
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
        org.junit.Assert.assertNotNull(doubleBuffer8);
        org.junit.Assert.assertNotNull(floatBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        response2.executed = false;
        java.lang.String str5 = response2.contentType;
        int int6 = response2.statusCode;
        response2.statusMessage = "hi!";
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response9 = org.jsoup.helper.HttpConnection.Response.execute(request0, response2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer2 = byteBuffer1.asDoubleBuffer();
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.compact();
        java.lang.String str4 = byteBuffer1.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer7 = byteBuffer1.putFloat((int) '#', (float) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(doubleBuffer2);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]" + "'", str4, "java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]");
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.isReadOnly();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        int int4 = byteBuffer1.position();
        java.nio.ByteOrder byteOrder5 = null;
        java.nio.ByteBuffer byteBuffer6 = byteBuffer1.order(byteOrder5);
        int int7 = byteBuffer6.limit();
        java.nio.CharBuffer charBuffer8 = byteBuffer6.asCharBuffer();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer10 = byteBuffer6.putLong(0L);
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
        org.junit.Assert.assertNotNull(charBuffer8);
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer3 = byteBuffer1.putChar('\000');
            org.junit.Assert.fail("Expected exception of type java.nio.BufferOverflowException; message: null");
        } catch (java.nio.BufferOverflowException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer2 = byteBuffer1.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        java.nio.ByteOrder byteOrder4 = null;
        java.nio.ByteBuffer byteBuffer5 = byteBuffer1.order(byteOrder4);
        java.nio.ByteBuffer byteBuffer6 = byteBuffer5.asReadOnlyBuffer();
        // The following exception was thrown during execution in test generation
        try {
            long long8 = byteBuffer6.getLong((int) (short) -1);
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
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.isReadOnly();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        int int4 = byteBuffer1.position();
        boolean boolean5 = byteBuffer1.isReadOnly();
        // The following exception was thrown during execution in test generation
        try {
            int int7 = byteBuffer1.getInt((int) (byte) -1);
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
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate((int) (byte) 10);
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.nio.ByteBuffer byteBuffer6 = java.nio.ByteBuffer.wrap(byteArray5);
        java.nio.ByteBuffer byteBuffer7 = byteBuffer1.get(byteArray5);
        java.nio.Buffer buffer8 = byteBuffer1.rewind();
        byte[] byteArray12 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.nio.ByteBuffer byteBuffer13 = java.nio.ByteBuffer.wrap(byteArray12);
        java.nio.ByteBuffer byteBuffer14 = byteBuffer1.put(byteArray12);
        java.nio.ByteBuffer byteBuffer15 = java.nio.ByteBuffer.wrap(byteArray12);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer18 = java.nio.ByteBuffer.wrap(byteArray12, (int) '#', (int) ' ');
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
        org.junit.Assert.assertNotNull(byteBuffer15);
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request3 = response2.req;
        org.jsoup.Connection.Method method4 = response2.method();
        java.lang.String str5 = response2.contentType;
        org.jsoup.Connection.Response response7 = response2.removeHeader("java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]");
        boolean boolean9 = response2.hasCookie("java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]");
        org.jsoup.Connection.Method method10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response11 = response2.method(method10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(request3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
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
            java.nio.ByteBuffer byteBuffer12 = byteBuffer5.putChar((int) (byte) 100, '\000');
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
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
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
            java.nio.ByteBuffer byteBuffer23 = byteBuffer20.putLong((long) '#');
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
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.nio.ByteBuffer byteBuffer4 = response3.byteData;
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response3);
        java.nio.ByteBuffer byteBuffer7 = java.nio.ByteBuffer.allocate(0);
        response3.byteData = byteBuffer7;
        int int9 = byteBuffer7.arrayOffset();
        java.nio.ByteBuffer byteBuffer11 = java.nio.ByteBuffer.allocate((int) (byte) 10);
        byte[] byteArray15 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.nio.ByteBuffer byteBuffer16 = java.nio.ByteBuffer.wrap(byteArray15);
        java.nio.ByteBuffer byteBuffer17 = byteBuffer11.get(byteArray15);
        java.nio.ByteBuffer byteBuffer18 = byteBuffer11.slice();
        byte[] byteArray19 = byteBuffer18.array();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer22 = byteBuffer7.put(byteArray19, 35, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(byteBuffer4);
        org.junit.Assert.assertNotNull(byteBuffer7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(byteBuffer11);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(byteBuffer16);
        org.junit.Assert.assertNotNull(byteBuffer17);
        org.junit.Assert.assertNotNull(byteBuffer18);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.hasRemaining();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer4 = byteBuffer1.putDouble((double) 0L);
            org.junit.Assert.fail("Expected exception of type java.nio.BufferOverflowException; message: null");
        } catch (java.nio.BufferOverflowException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
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
        // The following exception was thrown during execution in test generation
        try {
            float float24 = byteBuffer20.getFloat();
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
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
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
        response11.numRedirects = (byte) -1;
        java.lang.String str17 = response11.getHeaderCaseInsensitive("");
        org.junit.Assert.assertNull(byteBuffer4);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(uRL8);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.isReadOnly();
        int int3 = byteBuffer1.position();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer6 = byteBuffer1.putFloat((int) (short) 0, (float) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.isReadOnly();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        java.nio.ByteBuffer byteBuffer5 = java.nio.ByteBuffer.allocate(0);
        boolean boolean6 = byteBuffer5.isReadOnly();
        int int7 = byteBuffer1.compareTo(byteBuffer5);
        java.nio.ByteBuffer byteBuffer8 = byteBuffer5.compact();
        boolean boolean9 = byteBuffer8.hasRemaining();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer12 = byteBuffer8.putShort((int) 'a', (short) (byte) -1);
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
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer2 = byteBuffer1.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        java.nio.ByteBuffer byteBuffer4 = byteBuffer1.compact();
        java.nio.ByteBuffer byteBuffer5 = byteBuffer1.slice();
        // The following exception was thrown during execution in test generation
        try {
            double double7 = byteBuffer1.getDouble((int) (byte) 0);
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
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer2 = byteBuffer1.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        int int4 = byteBuffer1.capacity();
        java.nio.DoubleBuffer doubleBuffer5 = byteBuffer1.asDoubleBuffer();
        // The following exception was thrown during execution in test generation
        try {
            short short6 = byteBuffer1.getShort();
            org.junit.Assert.fail("Expected exception of type java.nio.BufferUnderflowException; message: null");
        } catch (java.nio.BufferUnderflowException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(doubleBuffer2);
        org.junit.Assert.assertNotNull(shortBuffer3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(doubleBuffer5);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
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
            java.nio.ByteBuffer byteBuffer15 = byteBuffer7.put((int) (byte) 10, (byte) 0);
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
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer2 = byteBuffer1.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        java.nio.ByteOrder byteOrder4 = null;
        java.nio.ByteBuffer byteBuffer5 = byteBuffer1.order(byteOrder4);
        // The following exception was thrown during execution in test generation
        try {
            int int7 = byteBuffer5.getInt(0);
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
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean3 = response2.executed;
        java.lang.String str5 = response2.getHeaderCaseInsensitive("");
        java.lang.String str7 = response2.cookie("java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]");
        org.jsoup.Connection.Response response10 = response2.cookie("hi!", "");
        java.lang.String str11 = response2.statusMessage();
        org.jsoup.Connection.Method method12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response13 = response2.method(method12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.isReadOnly();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        int int4 = byteBuffer1.position();
        java.nio.ByteOrder byteOrder5 = null;
        java.nio.ByteBuffer byteBuffer6 = byteBuffer1.order(byteOrder5);
        int int7 = byteBuffer6.limit();
        java.lang.Class<?> wildcardClass8 = byteBuffer6.getClass();
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(shortBuffer3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(byteBuffer6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
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
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer16 = byteBuffer13.putFloat((int) (short) 0, (float) 1677787392);
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
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Request request4 = response3.req;
        org.jsoup.Connection.Method method5 = response3.method();
        java.lang.String str6 = response3.contentType;
        boolean boolean8 = response3.hasCookie("");
        java.lang.String str10 = response3.header("hi!");
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
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer2 = byteBuffer1.asDoubleBuffer();
        boolean boolean3 = byteBuffer1.isDirect();
        int int4 = byteBuffer1.arrayOffset();
        // The following exception was thrown during execution in test generation
        try {
            byte byte5 = byteBuffer1.get();
            org.junit.Assert.fail("Expected exception of type java.nio.BufferUnderflowException; message: null");
        } catch (java.nio.BufferUnderflowException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(doubleBuffer2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
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
            java.nio.ByteBuffer byteBuffer16 = byteBuffer5.putInt(35);
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
        org.junit.Assert.assertNotNull(floatBuffer14);
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer2 = byteBuffer1.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        java.nio.ByteOrder byteOrder4 = null;
        java.nio.ByteBuffer byteBuffer5 = byteBuffer1.order(byteOrder4);
        java.nio.ByteBuffer byteBuffer6 = byteBuffer5.asReadOnlyBuffer();
        java.nio.Buffer buffer8 = byteBuffer5.position((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.Buffer buffer10 = buffer8.position((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: newPosition > limit: (100 > 0)");
        } catch (java.lang.IllegalArgumentException e) {
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
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate((int) (byte) 10);
        int int2 = byteBuffer1.limit();
        java.nio.ByteBuffer byteBuffer4 = byteBuffer1.putChar(' ');
        java.nio.ByteBuffer byteBuffer5 = byteBuffer1.asReadOnlyBuffer();
        java.nio.ByteBuffer byteBuffer7 = java.nio.ByteBuffer.allocate((int) (byte) 10);
        byte[] byteArray11 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.nio.ByteBuffer byteBuffer12 = java.nio.ByteBuffer.wrap(byteArray11);
        java.nio.ByteBuffer byteBuffer13 = byteBuffer7.get(byteArray11);
        java.nio.ByteBuffer byteBuffer14 = byteBuffer7.slice();
        byte[] byteArray15 = byteBuffer14.array();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer18 = byteBuffer5.get(byteArray15, (int) (byte) -1, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertNotNull(byteBuffer7);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(byteBuffer12);
        org.junit.Assert.assertNotNull(byteBuffer13);
        org.junit.Assert.assertNotNull(byteBuffer14);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect((int) '#');
        float float3 = byteBuffer1.getFloat(1);
        char char4 = byteBuffer1.getChar();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.Buffer buffer6 = byteBuffer1.position((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: newPosition > limit: (100 > 35)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + '\000' + "'", char4 == '\000');
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.isReadOnly();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        int int4 = byteBuffer1.position();
        java.nio.ByteOrder byteOrder5 = null;
        java.nio.ByteBuffer byteBuffer6 = byteBuffer1.order(byteOrder5);
        int int7 = byteBuffer6.limit();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer10 = byteBuffer6.putChar((int) (short) 0, '#');
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
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
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
            short short24 = byteBuffer22.getShort((int) (short) 1);
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
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
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
            int int20 = byteBuffer7.getInt(100);
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
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean3 = response2.executed;
        response2.statusCode = 0;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response8 = response2.cookie("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.header("");
        java.net.HttpURLConnection httpURLConnection4 = null;
        org.jsoup.helper.HttpConnection.Response response5 = null;
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response5);
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response5);
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response5);
        java.nio.ByteBuffer byteBuffer9 = response8.byteData;
        org.jsoup.Connection.Response response12 = response8.cookie("hi!", "");
        boolean boolean13 = response8.executed;
        java.lang.String str14 = response8.charset();
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response8);
        java.lang.String str16 = response15.charset;
        // The following exception was thrown during execution in test generation
        try {
            response1.setupFromConnection(httpURLConnection4, (org.jsoup.Connection.Response) response15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(byteBuffer9);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response1);
        boolean boolean4 = response3.executed;
        response3.statusCode = 0;
        java.lang.String str7 = response3.contentType();
        java.lang.String str9 = response3.cookie("");
        org.jsoup.Connection.Method method10 = response3.method();
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
        org.junit.Assert.assertNull(method10);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.isReadOnly();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        java.nio.ByteBuffer byteBuffer4 = byteBuffer1.duplicate();
        java.nio.ByteBuffer byteBuffer5 = byteBuffer1.slice();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.Buffer buffer7 = byteBuffer1.limit((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
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
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
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
            double double16 = byteBuffer13.getDouble((int) (byte) 10);
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
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
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
        java.nio.ByteBuffer byteBuffer14 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer15 = byteBuffer14.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer16 = byteBuffer14.asShortBuffer();
        java.nio.ByteBuffer byteBuffer17 = byteBuffer14.compact();
        int int18 = byteBuffer14.remaining();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer19 = byteBuffer12.put(byteBuffer14);
            org.junit.Assert.fail("Expected exception of type java.nio.ReadOnlyBufferException; message: null");
        } catch (java.nio.ReadOnlyBufferException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(byteBuffer12);
        org.junit.Assert.assertNotNull(byteBuffer14);
        org.junit.Assert.assertNotNull(doubleBuffer15);
        org.junit.Assert.assertNotNull(shortBuffer16);
        org.junit.Assert.assertNotNull(byteBuffer17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request3 = response2.req;
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response2);
        java.lang.String str6 = response2.cookie("");
        response2.executed = true;
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response2);
        org.jsoup.Connection.Response response11 = response9.removeCookie("java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]");
        org.junit.Assert.assertNull(request3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(response11);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
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
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer16 = byteBuffer10.putLong((int) (byte) -1, (long) '#');
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
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response0);
        response4.numRedirects = 'a';
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response4);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Too many redirects occurred trying to load URL null");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
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
            java.nio.ByteBuffer byteBuffer12 = byteBuffer5.putFloat((int) ' ', (float) (byte) 100);
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
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer2 = byteBuffer1.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        java.nio.ByteBuffer byteBuffer4 = byteBuffer1.compact();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.Buffer buffer6 = byteBuffer4.position((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: newPosition > limit: (35 > 0)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(doubleBuffer2);
        org.junit.Assert.assertNotNull(shortBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer4);
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
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
            java.nio.ByteBuffer byteBuffer17 = byteBuffer8.put((byte) 0);
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
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect((int) '#');
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.putShort((short) 0);
        // The following exception was thrown during execution in test generation
        try {
            short short5 = byteBuffer1.getShort((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteBuffer3);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
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
            java.nio.ByteBuffer byteBuffer17 = byteBuffer13.putLong((int) '\000', (long) '4');
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
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request3 = response2.req;
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response2);
        java.lang.String str5 = response4.contentType;
        boolean boolean7 = response4.hasHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response4);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response11 = response8.cookie("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(request3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.isReadOnly();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        int int4 = byteBuffer1.position();
        boolean boolean5 = byteBuffer1.isReadOnly();
        java.nio.ByteOrder byteOrder6 = byteBuffer1.order();
        org.jsoup.helper.HttpConnection.Response response7 = null;
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response7);
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response7);
        boolean boolean10 = response9.executed;
        response9.statusCode = 0;
        java.lang.String str13 = response9.contentType();
        boolean boolean14 = byteBuffer1.equals((java.lang.Object) str13);
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(shortBuffer3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(byteOrder6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
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
        // The following exception was thrown during execution in test generation
        try {
            long long22 = byteBuffer21.getLong();
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
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
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
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer20 = byteBuffer13.putFloat((int) 'a', 1.0f);
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
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer2 = byteBuffer1.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer5 = byteBuffer1.putLong((long) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.nio.BufferOverflowException; message: null");
        } catch (java.nio.BufferOverflowException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(doubleBuffer2);
        org.junit.Assert.assertNotNull(shortBuffer3);
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect((int) '#');
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.putShort((short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.Buffer buffer4 = byteBuffer1.reset();
            org.junit.Assert.fail("Expected exception of type java.nio.InvalidMarkException; message: null");
        } catch (java.nio.InvalidMarkException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteBuffer3);
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean3 = response2.executed;
        java.lang.String str5 = response2.getHeaderCaseInsensitive("");
        java.net.URL uRL6 = response2.url();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = response2.hasHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(uRL6);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer2 = byteBuffer1.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        byte[] byteArray4 = byteBuffer1.array();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer7 = java.nio.ByteBuffer.wrap(byteArray4, (int) (byte) 1, (int) (byte) 10);
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
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.hasRemaining();
        // The following exception was thrown during execution in test generation
        try {
            byte byte4 = byteBuffer1.get((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response21 = org.jsoup.helper.HttpConnection.Response.execute(request0, response20);
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
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        byte[] byteArray0 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer3 = java.nio.ByteBuffer.wrap(byteArray0, (int) (short) 10, 1677787392);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
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
            java.nio.ByteBuffer byteBuffer22 = byteBuffer17.putLong(1677787392, (long) (byte) -1);
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
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
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
            char char13 = byteBuffer3.getChar((int) (short) 1);
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
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer2 = byteBuffer1.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        java.nio.ByteBuffer byteBuffer4 = byteBuffer1.compact();
        java.nio.ByteBuffer byteBuffer5 = byteBuffer1.slice();
        java.nio.FloatBuffer floatBuffer6 = byteBuffer5.asFloatBuffer();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.Buffer buffer8 = floatBuffer6.position((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: newPosition > limit: (1 > 0)");
        } catch (java.lang.IllegalArgumentException e) {
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
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
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
            int int9 = byteBuffer7.arrayOffset();
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
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.isReadOnly();
        int int3 = byteBuffer1.position();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer6 = byteBuffer1.putLong((int) (short) 0, (long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
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
            java.nio.ByteBuffer byteBuffer27 = java.nio.ByteBuffer.wrap(byteArray22, (int) 'a', 10);
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
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Request request4 = response3.req;
        org.jsoup.Connection.Method method5 = response3.method();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response6 = org.jsoup.helper.HttpConnection.Response.execute(request0, response3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(request4);
        org.junit.Assert.assertNull(method5);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        byte[] byteArray0 = new byte[] {};
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.wrap(byteArray0);
        java.nio.Buffer buffer2 = byteBuffer1.flip();
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.asReadOnlyBuffer();
        java.nio.ByteBuffer byteBuffer4 = byteBuffer1.duplicate();
        java.nio.DoubleBuffer doubleBuffer5 = byteBuffer1.asDoubleBuffer();
        // The following exception was thrown during execution in test generation
        try {
            double double6 = byteBuffer1.getDouble();
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
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.ByteBuffer byteBuffer2 = byteBuffer1.slice();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer5 = byteBuffer1.putDouble((int) (short) 10, (double) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteBuffer2);
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
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
            float float10 = byteBuffer9.getFloat();
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
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate((int) ' ');
        java.nio.ByteBuffer byteBuffer3 = java.nio.ByteBuffer.allocate(0);
        java.nio.ByteBuffer byteBuffer4 = byteBuffer3.slice();
        java.nio.ByteBuffer byteBuffer5 = byteBuffer1.put(byteBuffer4);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer8 = byteBuffer5.putShort((int) (byte) -1, (short) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertNotNull(byteBuffer5);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        byte[] byteArray0 = new byte[] {};
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.wrap(byteArray0);
        java.nio.Buffer buffer2 = byteBuffer1.flip();
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.asReadOnlyBuffer();
        java.lang.String str4 = byteBuffer1.toString();
        // The following exception was thrown during execution in test generation
        try {
            byte byte6 = byteBuffer1.get((int) '\000');
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
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.isReadOnly();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        java.nio.ByteBuffer byteBuffer4 = byteBuffer1.duplicate();
        int int5 = byteBuffer4.remaining();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer8 = byteBuffer4.putInt(35, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(shortBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.nio.ByteBuffer byteBuffer4 = response3.byteData;
        org.jsoup.Connection.Response response7 = response3.cookie("hi!", "");
        java.net.URL uRL8 = response3.url();
        java.lang.String str10 = response3.getHeaderCaseInsensitive("hi!");
        java.lang.String str11 = response3.contentType;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response13 = response3.removeHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(byteBuffer4);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(uRL8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
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
            long long16 = byteBuffer5.getLong((int) (short) 10);
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
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str4 = response3.statusMessage();
        response3.contentType = "";
        java.lang.Class<?> wildcardClass7 = response3.getClass();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.header("");
        org.jsoup.Connection.Response response5 = response1.removeCookie("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap6 = response1.headers();
        java.nio.ByteBuffer byteBuffer7 = response1.byteData;
        java.net.URL uRL8 = response1.url();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = response1.hasHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
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
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.nio.ByteBuffer byteBuffer5 = response4.byteData;
        java.lang.String str6 = response4.charset;
        java.lang.String str7 = response4.contentType;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response8 = org.jsoup.helper.HttpConnection.Response.execute(request0, response4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(byteBuffer5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean3 = response2.executed;
        response2.statusCode = 0;
        java.lang.String str6 = response2.contentType();
        org.jsoup.Connection.Response response9 = response2.cookie("java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]", "java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry11 = response2.scanHeaders("hi!");
        java.lang.String str13 = response2.getHeaderCaseInsensitive("");
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
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertNull(strEntry11);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect((int) '#');
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.putShort((short) 0);
        java.nio.ByteBuffer byteBuffer5 = byteBuffer1.putDouble((double) '\000');
        java.nio.ByteBuffer byteBuffer7 = byteBuffer5.putInt(0);
        // The following exception was thrown during execution in test generation
        try {
            double double9 = byteBuffer5.getDouble((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertNotNull(byteBuffer7);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
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
            java.nio.ByteBuffer byteBuffer11 = byteBuffer6.putDouble(1677787392, (double) 10.0f);
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
        org.junit.Assert.assertNotNull(buffer8);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate((int) (byte) 10);
        short short3 = byteBuffer1.getShort(1);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer6 = byteBuffer1.putChar((-1), '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
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
            long long12 = byteBuffer5.getLong((int) '#');
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
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
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
            short short22 = byteBuffer19.getShort();
            org.junit.Assert.fail("Expected exception of type java.nio.BufferUnderflowException; message: null");
        } catch (java.nio.BufferUnderflowException e) {
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
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean3 = response2.executed;
        java.lang.String str5 = response2.getHeaderCaseInsensitive("");
        java.net.URL uRL6 = response2.url();
        org.jsoup.Connection.Response response8 = response2.removeCookie("");
        java.lang.String str9 = response2.charset();
        org.jsoup.Connection.Request request10 = response2.req;
        response2.charset = "hi!";
        java.net.HttpURLConnection httpURLConnection13 = null;
        org.jsoup.helper.HttpConnection.Response response14 = null;
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response14);
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response14);
        boolean boolean17 = response16.executed;
        java.lang.String str19 = response16.getHeaderCaseInsensitive("");
        java.net.URL uRL20 = response16.url();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry22 = response16.scanHeaders("");
        // The following exception was thrown during execution in test generation
        try {
            response2.setupFromConnection(httpURLConnection13, (org.jsoup.Connection.Response) response16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(request10);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(uRL20);
        org.junit.Assert.assertNull(strEntry22);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.isReadOnly();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        java.nio.ByteBuffer byteBuffer5 = java.nio.ByteBuffer.allocate(0);
        boolean boolean6 = byteBuffer5.isReadOnly();
        int int7 = byteBuffer1.compareTo(byteBuffer5);
        java.nio.ByteBuffer byteBuffer8 = byteBuffer5.compact();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer10 = byteBuffer5.putChar(' ');
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
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.nio.ByteBuffer byteBuffer4 = response3.byteData;
        org.jsoup.Connection.Response response7 = response3.cookie("hi!", "");
        java.net.URL uRL8 = response3.url();
        java.lang.String str10 = response3.getHeaderCaseInsensitive("hi!");
        java.lang.String str11 = response3.contentType;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = response3.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(byteBuffer4);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(uRL8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
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
        java.nio.ByteBuffer byteBuffer20 = java.nio.ByteBuffer.allocate((int) ' ');
        int int22 = byteBuffer20.getInt((int) (short) 0);
        java.nio.ByteBuffer byteBuffer24 = byteBuffer20.put((byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer25 = byteBuffer13.put(byteBuffer24);
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
        org.junit.Assert.assertNotNull(byteBuffer20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(byteBuffer24);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer2 = byteBuffer1.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        java.nio.ByteBuffer byteBuffer4 = byteBuffer1.compact();
        int int5 = byteBuffer1.remaining();
        boolean boolean6 = byteBuffer1.hasRemaining();
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
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer2 = byteBuffer1.asDoubleBuffer();
        java.nio.FloatBuffer floatBuffer3 = byteBuffer1.asFloatBuffer();
        // The following exception was thrown during execution in test generation
        try {
            long long4 = byteBuffer1.getLong();
            org.junit.Assert.fail("Expected exception of type java.nio.BufferUnderflowException; message: null");
        } catch (java.nio.BufferUnderflowException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(doubleBuffer2);
        org.junit.Assert.assertNotNull(floatBuffer3);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.nio.ByteBuffer byteBuffer5 = response4.byteData;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response6 = org.jsoup.helper.HttpConnection.Response.execute(request0, response4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(byteBuffer5);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.isReadOnly();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        int int4 = byteBuffer1.position();
        java.nio.ByteOrder byteOrder5 = null;
        java.nio.ByteBuffer byteBuffer6 = byteBuffer1.order(byteOrder5);
        java.nio.ByteBuffer byteBuffer7 = byteBuffer1.asReadOnlyBuffer();
        // The following exception was thrown during execution in test generation
        try {
            byte byte9 = byteBuffer7.get((int) (byte) 100);
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
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean3 = response2.executed;
        response2.statusCode = 0;
        java.lang.String str6 = response2.contentType();
        org.jsoup.Connection.Response response9 = response2.cookie("java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]", "java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry11 = response2.scanHeaders("hi!");
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response2);
        org.jsoup.Connection.Method method13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response14 = response12.method(method13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertNull(strEntry11);
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.ByteBuffer byteBuffer2 = byteBuffer1.slice();
        // The following exception was thrown during execution in test generation
        try {
            float float4 = byteBuffer2.getFloat(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteBuffer2);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
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
            java.nio.ByteBuffer byteBuffer14 = byteBuffer11.putDouble((int) ' ', (double) 100L);
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
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
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
            java.nio.ByteBuffer byteBuffer17 = byteBuffer13.putShort((short) -1);
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
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        byte[] byteArray0 = new byte[] {};
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.wrap(byteArray0);
        java.nio.Buffer buffer2 = byteBuffer1.flip();
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.asReadOnlyBuffer();
        java.nio.ByteBuffer byteBuffer4 = byteBuffer1.duplicate();
        int int5 = byteBuffer1.position();
        // The following exception was thrown during execution in test generation
        try {
            long long7 = byteBuffer1.getLong((int) (byte) 1);
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
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer2 = byteBuffer1.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        int int4 = byteBuffer1.limit();
        int int5 = byteBuffer1.arrayOffset();
        // The following exception was thrown during execution in test generation
        try {
            short short6 = byteBuffer1.getShort();
            org.junit.Assert.fail("Expected exception of type java.nio.BufferUnderflowException; message: null");
        } catch (java.nio.BufferUnderflowException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(doubleBuffer2);
        org.junit.Assert.assertNotNull(shortBuffer3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
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
            int int10 = byteBuffer8.getInt((int) (byte) 0);
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
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer2 = byteBuffer1.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        java.nio.ByteBuffer byteBuffer4 = byteBuffer1.compact();
        int int5 = byteBuffer1.remaining();
        boolean boolean6 = byteBuffer1.isReadOnly();
        // The following exception was thrown during execution in test generation
        try {
            long long8 = byteBuffer1.getLong((int) (short) 1);
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
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
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
            byte byte21 = byteBuffer12.get((int) (byte) -1);
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
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
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
            double double23 = byteBuffer20.getDouble(1);
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
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
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
            int int16 = byteBuffer8.getInt();
            org.junit.Assert.fail("Expected exception of type java.nio.BufferUnderflowException; message: null");
        } catch (java.nio.BufferUnderflowException e) {
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
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request3 = response2.req;
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response2);
        response4.executed = false;
        org.junit.Assert.assertNull(request3);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
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
            java.nio.ByteBuffer byteBuffer31 = byteBuffer28.putFloat((float) 0L);
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
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response12 = org.jsoup.helper.HttpConnection.Response.execute(request0, response6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(strEntry11);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer2 = byteBuffer1.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        java.nio.ByteOrder byteOrder4 = null;
        java.nio.ByteBuffer byteBuffer5 = byteBuffer1.order(byteOrder4);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer8 = byteBuffer1.putDouble(0, (double) (byte) -1);
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
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
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
            java.nio.ByteBuffer byteBuffer13 = byteBuffer5.putShort((short) 0);
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
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(buffer11);
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.hasRemaining();
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.asReadOnlyBuffer();
        boolean boolean4 = byteBuffer3.hasRemaining();
        java.nio.ShortBuffer shortBuffer5 = byteBuffer3.asShortBuffer();
        java.nio.ByteBuffer byteBuffer7 = java.nio.ByteBuffer.allocate(0);
        boolean boolean8 = byteBuffer7.isReadOnly();
        java.nio.ShortBuffer shortBuffer9 = byteBuffer7.asShortBuffer();
        java.nio.ByteBuffer byteBuffer11 = java.nio.ByteBuffer.allocate(0);
        boolean boolean12 = byteBuffer11.isReadOnly();
        int int13 = byteBuffer7.compareTo(byteBuffer11);
        java.nio.Buffer buffer14 = byteBuffer11.clear();
        java.nio.ByteBuffer byteBuffer16 = java.nio.ByteBuffer.allocate(0);
        boolean boolean17 = byteBuffer16.hasRemaining();
        java.nio.ByteBuffer byteBuffer18 = byteBuffer11.put(byteBuffer16);
        java.nio.ByteBuffer byteBuffer20 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer21 = byteBuffer20.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer22 = byteBuffer20.asShortBuffer();
        byte[] byteArray23 = byteBuffer20.array();
        java.nio.ByteBuffer byteBuffer24 = java.nio.ByteBuffer.wrap(byteArray23);
        java.nio.ByteBuffer byteBuffer25 = byteBuffer18.put(byteArray23);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer26 = byteBuffer3.put(byteArray23);
            org.junit.Assert.fail("Expected exception of type java.nio.ReadOnlyBufferException; message: null");
        } catch (java.nio.ReadOnlyBufferException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(shortBuffer5);
        org.junit.Assert.assertNotNull(byteBuffer7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(shortBuffer9);
        org.junit.Assert.assertNotNull(byteBuffer11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(buffer14);
        org.junit.Assert.assertNotNull(byteBuffer16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(byteBuffer18);
        org.junit.Assert.assertNotNull(byteBuffer20);
        org.junit.Assert.assertNotNull(doubleBuffer21);
        org.junit.Assert.assertNotNull(shortBuffer22);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[]");
        org.junit.Assert.assertNotNull(byteBuffer24);
        org.junit.Assert.assertNotNull(byteBuffer25);
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.nio.ByteBuffer byteBuffer5 = response4.byteData;
        java.lang.String str6 = response4.statusMessage();
        java.lang.String str7 = response4.charset;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response8 = org.jsoup.helper.HttpConnection.Response.execute(request0, response4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(byteBuffer5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.ByteBuffer byteBuffer2 = byteBuffer1.slice();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        // The following exception was thrown during execution in test generation
        try {
            long long5 = byteBuffer1.getLong(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteBuffer2);
        org.junit.Assert.assertNotNull(shortBuffer3);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
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
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer31 = java.nio.ByteBuffer.wrap(byteArray21, (int) (short) 1, 3);
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
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        org.jsoup.helper.HttpConnection.Response.MAX_REDIRECTS = '\000';
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Method method6 = response5.method();
        boolean boolean8 = response5.hasCookie("hi!");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry10 = response5.scanHeaders("hi!");
        java.net.HttpURLConnection httpURLConnection11 = null;
        org.jsoup.helper.HttpConnection.Response response12 = null;
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response12);
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response12);
        java.net.URL uRL15 = response14.url();
        java.lang.String str17 = response14.cookie("java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]");
        // The following exception was thrown during execution in test generation
        try {
            response5.setupFromConnection(httpURLConnection11, (org.jsoup.Connection.Response) response14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(strEntry10);
        org.junit.Assert.assertNull(uRL15);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.nio.ByteBuffer byteBuffer4 = response3.byteData;
        java.lang.String str5 = response3.charset;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = response3.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(byteBuffer4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer2 = byteBuffer1.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        java.nio.ByteBuffer byteBuffer4 = byteBuffer1.compact();
        java.nio.ByteOrder byteOrder5 = byteBuffer4.order();
        // The following exception was thrown during execution in test generation
        try {
            int int6 = byteBuffer4.getInt();
            org.junit.Assert.fail("Expected exception of type java.nio.BufferUnderflowException; message: null");
        } catch (java.nio.BufferUnderflowException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(doubleBuffer2);
        org.junit.Assert.assertNotNull(shortBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertNotNull(byteOrder5);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer2 = byteBuffer1.asDoubleBuffer();
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.compact();
        int int4 = byteBuffer3.limit();
        // The following exception was thrown during execution in test generation
        try {
            long long6 = byteBuffer3.getLong((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(doubleBuffer2);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str4 = response3.statusMessage();
        org.jsoup.Connection.Request request5 = null;
        response3.req = request5;
        int int7 = response3.statusCode();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document8 = response3.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.isReadOnly();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        int int4 = byteBuffer1.position();
        int int5 = byteBuffer1.capacity();
        java.nio.Buffer buffer6 = byteBuffer1.flip();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer9 = byteBuffer1.put(0, (byte) 1);
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
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
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
            char char11 = byteBuffer10.getChar();
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
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
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
            int int10 = byteBuffer9.getInt();
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
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.isReadOnly();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        int int4 = byteBuffer1.position();
        java.nio.ByteOrder byteOrder5 = null;
        java.nio.ByteBuffer byteBuffer6 = byteBuffer1.order(byteOrder5);
        int int7 = byteBuffer6.limit();
        java.nio.CharBuffer charBuffer8 = byteBuffer6.asCharBuffer();
        // The following exception was thrown during execution in test generation
        try {
            int int10 = byteBuffer6.getInt((int) ' ');
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
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.isReadOnly();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        int int4 = byteBuffer1.position();
        boolean boolean5 = byteBuffer1.isDirect();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer7 = byteBuffer1.putLong((long) (byte) -1);
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
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
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
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer23 = byteBuffer13.putChar(' ');
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
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer2 = byteBuffer1.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        java.nio.ByteBuffer byteBuffer4 = byteBuffer1.compact();
        java.nio.ByteBuffer byteBuffer5 = byteBuffer1.slice();
        int int6 = byteBuffer1.position();
        int int7 = byteBuffer1.capacity();
        // The following exception was thrown during execution in test generation
        try {
            byte byte9 = byteBuffer1.get(100);
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
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect((int) '#');
        java.nio.ByteBuffer byteBuffer4 = byteBuffer1.putShort((int) (short) 1, (short) (byte) 10);
        java.nio.ByteBuffer byteBuffer6 = java.nio.ByteBuffer.allocate(0);
        boolean boolean7 = byteBuffer6.isReadOnly();
        java.nio.ShortBuffer shortBuffer8 = byteBuffer6.asShortBuffer();
        java.nio.ByteBuffer byteBuffer10 = java.nio.ByteBuffer.allocate(0);
        boolean boolean11 = byteBuffer10.isReadOnly();
        int int12 = byteBuffer6.compareTo(byteBuffer10);
        java.nio.Buffer buffer13 = byteBuffer10.clear();
        java.nio.ByteBuffer byteBuffer15 = java.nio.ByteBuffer.allocate(0);
        boolean boolean16 = byteBuffer15.hasRemaining();
        java.nio.ByteBuffer byteBuffer17 = byteBuffer10.put(byteBuffer15);
        java.nio.ByteBuffer byteBuffer19 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer20 = byteBuffer19.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer21 = byteBuffer19.asShortBuffer();
        byte[] byteArray22 = byteBuffer19.array();
        java.nio.ByteBuffer byteBuffer23 = java.nio.ByteBuffer.wrap(byteArray22);
        java.nio.ByteBuffer byteBuffer24 = byteBuffer17.put(byteArray22);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer27 = byteBuffer1.get(byteArray22, (int) (byte) 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertNotNull(byteBuffer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(shortBuffer8);
        org.junit.Assert.assertNotNull(byteBuffer10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(buffer13);
        org.junit.Assert.assertNotNull(byteBuffer15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(byteBuffer17);
        org.junit.Assert.assertNotNull(byteBuffer19);
        org.junit.Assert.assertNotNull(doubleBuffer20);
        org.junit.Assert.assertNotNull(shortBuffer21);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[]");
        org.junit.Assert.assertNotNull(byteBuffer23);
        org.junit.Assert.assertNotNull(byteBuffer24);
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.isReadOnly();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        int int4 = byteBuffer1.position();
        int int5 = byteBuffer1.arrayOffset();
        int int6 = byteBuffer1.limit();
        // The following exception was thrown during execution in test generation
        try {
            float float7 = byteBuffer1.getFloat();
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
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer2 = byteBuffer1.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        java.nio.ByteBuffer byteBuffer4 = byteBuffer1.compact();
        java.nio.ByteBuffer byteBuffer5 = byteBuffer1.slice();
        java.nio.FloatBuffer floatBuffer6 = byteBuffer5.asFloatBuffer();
        java.nio.Buffer buffer7 = floatBuffer6.flip();
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(doubleBuffer2);
        org.junit.Assert.assertNotNull(shortBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertNotNull(floatBuffer6);
        org.junit.Assert.assertNotNull(buffer7);
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.isReadOnly();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        java.nio.ByteBuffer byteBuffer5 = java.nio.ByteBuffer.allocate(0);
        boolean boolean6 = byteBuffer5.isReadOnly();
        int int7 = byteBuffer1.compareTo(byteBuffer5);
        java.nio.DoubleBuffer doubleBuffer8 = byteBuffer5.asDoubleBuffer();
        java.nio.FloatBuffer floatBuffer9 = byteBuffer5.asFloatBuffer();
        int int10 = byteBuffer5.position();
        int int11 = byteBuffer5.remaining();
        // The following exception was thrown during execution in test generation
        try {
            double double12 = byteBuffer5.getDouble();
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
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
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
            java.nio.Buffer buffer12 = byteBuffer5.reset();
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
        org.junit.Assert.assertNotNull(byteBuffer8);
        org.junit.Assert.assertNotNull(buffer10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
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
        java.nio.ByteBuffer byteBuffer30 = java.nio.ByteBuffer.allocate(0);
        boolean boolean31 = byteBuffer30.isReadOnly();
        java.nio.ShortBuffer shortBuffer32 = byteBuffer30.asShortBuffer();
        java.nio.ByteBuffer byteBuffer34 = java.nio.ByteBuffer.allocate(0);
        boolean boolean35 = byteBuffer34.isReadOnly();
        int int36 = byteBuffer30.compareTo(byteBuffer34);
        java.nio.Buffer buffer37 = byteBuffer34.clear();
        java.nio.ByteBuffer byteBuffer39 = java.nio.ByteBuffer.allocate(0);
        boolean boolean40 = byteBuffer39.hasRemaining();
        java.nio.ByteBuffer byteBuffer41 = byteBuffer34.put(byteBuffer39);
        java.nio.ByteBuffer byteBuffer42 = byteBuffer41.compact();
        int int43 = byteBuffer42.limit();
        int int44 = byteBuffer42.position();
        java.nio.Buffer buffer46 = byteBuffer42.position((int) (byte) 0);
        byte[] byteArray47 = byteBuffer42.array();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer50 = byteBuffer28.put(byteArray47, (int) (short) 10, 0);
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
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(shortBuffer32);
        org.junit.Assert.assertNotNull(byteBuffer34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(buffer37);
        org.junit.Assert.assertNotNull(byteBuffer39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(byteBuffer41);
        org.junit.Assert.assertNotNull(byteBuffer42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(buffer46);
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray47), "[]");
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.header("");
        response1.charset = "hi!";
        java.nio.ByteBuffer byteBuffer6 = null;
        response1.byteData = byteBuffer6;
        org.jsoup.Connection.Method method8 = response1.method();
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray9 = response1.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method8);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.nio.ByteBuffer byteBuffer4 = response3.byteData;
        org.jsoup.Connection.Response response7 = response3.cookie("hi!", "");
        java.net.URL uRL8 = response3.url();
        boolean boolean10 = response3.hasHeader("java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response3);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Too many redirects occurred trying to load URL null");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(byteBuffer4);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(uRL8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.header("");
        org.jsoup.Connection.Response response5 = response1.removeCookie("hi!");
        java.lang.String str6 = response1.charset();
        java.lang.String str7 = response1.charset();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response1);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Too many redirects occurred trying to load URL null");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        boolean boolean2 = byteBuffer1.isReadOnly();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        int int4 = byteBuffer1.position();
        // The following exception was thrown during execution in test generation
        try {
            double double6 = byteBuffer1.getDouble((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(shortBuffer3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate((int) (byte) 10);
        int int2 = byteBuffer1.limit();
        java.nio.ByteBuffer byteBuffer4 = byteBuffer1.putChar(' ');
        // The following exception was thrown during execution in test generation
        try {
            float float6 = byteBuffer1.getFloat((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(byteBuffer4);
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.nio.ByteBuffer byteBuffer4 = response3.byteData;
        org.jsoup.Connection.Response response7 = response3.cookie("hi!", "");
        boolean boolean8 = response3.executed;
        java.lang.String str9 = response3.charset();
        java.net.URL uRL10 = response3.url();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = response3.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(byteBuffer4);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(uRL10);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
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
            java.nio.ByteBuffer byteBuffer21 = byteBuffer17.putFloat((int) (byte) 1, (-1.0f));
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
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
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
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer24 = byteBuffer15.putFloat((int) (byte) 10, (float) 0L);
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
        org.junit.Assert.assertNotNull(byteBuffer15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(shortBuffer17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(buffer20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer2 = byteBuffer1.asDoubleBuffer();
        boolean boolean3 = byteBuffer1.isDirect();
        int int4 = byteBuffer1.arrayOffset();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer7 = byteBuffer1.putShort((int) '\000', (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(doubleBuffer2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response13 = org.jsoup.helper.HttpConnection.Response.execute(request0, response3);
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
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate((int) (byte) 10);
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.nio.ByteBuffer byteBuffer6 = java.nio.ByteBuffer.wrap(byteArray5);
        java.nio.ByteBuffer byteBuffer7 = byteBuffer1.get(byteArray5);
        java.nio.ByteBuffer byteBuffer9 = byteBuffer1.putFloat((float) (byte) 10);
        java.nio.ByteBuffer byteBuffer10 = byteBuffer9.compact();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer13 = byteBuffer10.putDouble((int) ' ', (double) (-1L));
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
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response1);
        boolean boolean4 = response3.executed;
        java.lang.String str6 = response3.getHeaderCaseInsensitive("");
        java.lang.String str8 = response3.cookie("java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]");
        int int9 = response3.statusCode();
        org.jsoup.Connection.Response response12 = response3.cookie("hi!", "");
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
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(response12);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer2 = byteBuffer1.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        int int4 = byteBuffer1.limit();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer6 = byteBuffer1.putChar('\000');
            org.junit.Assert.fail("Expected exception of type java.nio.BufferOverflowException; message: null");
        } catch (java.nio.BufferOverflowException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(doubleBuffer2);
        org.junit.Assert.assertNotNull(shortBuffer3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer2 = byteBuffer1.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        java.nio.ByteBuffer byteBuffer4 = byteBuffer1.compact();
        java.nio.ByteBuffer byteBuffer5 = byteBuffer1.slice();
        java.nio.LongBuffer longBuffer6 = byteBuffer5.asLongBuffer();
        // The following exception was thrown during execution in test generation
        try {
            byte byte7 = byteBuffer5.get();
            org.junit.Assert.fail("Expected exception of type java.nio.BufferUnderflowException; message: null");
        } catch (java.nio.BufferUnderflowException e) {
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
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Method method3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response4 = response2.method(method3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
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
            short short39 = byteBuffer12.getShort((int) (short) 0);
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
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate((int) (byte) 10);
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.nio.ByteBuffer byteBuffer6 = java.nio.ByteBuffer.wrap(byteArray5);
        java.nio.ByteBuffer byteBuffer7 = byteBuffer1.get(byteArray5);
        java.nio.LongBuffer longBuffer8 = byteBuffer1.asLongBuffer();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer10 = byteBuffer1.putLong((long) '#');
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
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
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
            java.nio.ByteBuffer byteBuffer11 = byteBuffer8.putInt((int) ' ', 10);
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
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        response2.executed = false;
        java.lang.String str5 = response2.contentType;
        int int6 = response2.statusCode;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response7 = org.jsoup.helper.HttpConnection.Response.execute(request0, response2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean3 = response2.executed;
        java.lang.String str5 = response2.getHeaderCaseInsensitive("");
        java.lang.String str7 = response2.cookie("java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]");
        java.lang.String str8 = response2.contentType;
        response2.charset = "hi!";
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response2);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Too many redirects occurred trying to load URL null");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer2 = byteBuffer1.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        java.nio.ByteBuffer byteBuffer4 = byteBuffer1.compact();
        java.nio.ByteBuffer byteBuffer5 = byteBuffer1.slice();
        java.nio.Buffer buffer6 = byteBuffer5.flip();
        int int7 = byteBuffer5.position();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer10 = byteBuffer5.put((int) (short) 0, (byte) -1);
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
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
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
            java.nio.Buffer buffer14 = byteBuffer13.reset();
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
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer2 = byteBuffer1.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        int int4 = byteBuffer1.limit();
        byte[] byteArray5 = byteBuffer1.array();
        // The following exception was thrown during execution in test generation
        try {
            int int7 = byteBuffer1.getInt((int) '\000');
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
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        java.nio.DoubleBuffer doubleBuffer2 = byteBuffer1.asDoubleBuffer();
        java.nio.ShortBuffer shortBuffer3 = byteBuffer1.asShortBuffer();
        java.lang.String str4 = byteBuffer1.toString();
        // The following exception was thrown during execution in test generation
        try {
            float float5 = byteBuffer1.getFloat();
            org.junit.Assert.fail("Expected exception of type java.nio.BufferUnderflowException; message: null");
        } catch (java.nio.BufferUnderflowException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(doubleBuffer2);
        org.junit.Assert.assertNotNull(shortBuffer3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]" + "'", str4, "java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]");
    }
}

