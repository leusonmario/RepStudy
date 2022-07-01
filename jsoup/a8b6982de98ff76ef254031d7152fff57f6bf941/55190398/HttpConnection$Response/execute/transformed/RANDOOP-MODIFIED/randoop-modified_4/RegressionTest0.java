import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test00001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00001");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document4 = response1.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test00002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00002");
        int int0 = java.util.regex.Pattern.DOTALL;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 32 + "'", int0 == 32);
    }

    @Test
    public void test00003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00003");
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Negative capacity: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00004");
        javax.net.ssl.HostnameVerifier hostnameVerifier0 = org.jsoup.helper.HttpConnection.Response.getInsecureVerifier();
        org.junit.Assert.assertNotNull(hostnameVerifier0);
    }

    @Test
    public void test00005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00005");
        javax.net.ssl.SSLSocketFactory sSLSocketFactory0 = org.jsoup.helper.HttpConnection.Response.sslSocketFactory;
        org.junit.Assert.assertNull(sSLSocketFactory0);
    }

    @Test
    public void test00006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00006");
        int int0 = java.util.regex.Pattern.COMMENTS;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    public void test00007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00007");
        java.lang.String str0 = org.jsoup.helper.HttpConnection.Response.LOCATION;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "Location" + "'", str0, "Location");
    }

    @Test
    public void test00008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00008");
        int int0 = java.util.regex.Pattern.CASE_INSENSITIVE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test00009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00009");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        java.util.Map<java.lang.String, java.lang.String> strMap4 = response1.cookies();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document5 = response1.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(strMap4);
    }

    @Test
    public void test00010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00010");
        org.jsoup.helper.HttpConnection.Response.LOCATION = "Location";
    }

    @Test
    public void test00011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00011");
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
    public void test00012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00012");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response5 = response1.removeHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test00013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00013");
        int int0 = org.jsoup.helper.HttpConnection.Response.MAX_REDIRECTS;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 20 + "'", int0 == 20);
    }

    @Test
    public void test00014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00014");
        boolean boolean2 = java.util.regex.Pattern.matches("hi!", (java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test00015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00015");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        java.lang.Class<?> wildcardClass4 = response1.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00016");
        java.net.HttpURLConnection httpURLConnection0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.LinkedHashMap<java.lang.String, java.util.List<java.lang.String>> strMap1 = org.jsoup.helper.HttpConnection.Response.createHeaderMap(httpURLConnection0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00017");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.putLong((long) '4');
        java.lang.Class<?> wildcardClass4 = byteBuffer3.getClass();
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00018");
        boolean boolean2 = java.util.regex.Pattern.matches("hi!", (java.lang.CharSequence) "Location");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00019");
        boolean boolean2 = java.util.regex.Pattern.matches("", (java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test00020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00020");
        java.lang.String str1 = java.util.regex.Pattern.quote("hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\Qhi!\\E" + "'", str1, "\\Qhi!\\E");
    }

    @Test
    public void test00021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00021");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        response2.contentType = "";
        java.lang.String str6 = response2.cookie("hi!");
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response2);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response8 = org.jsoup.helper.HttpConnection.Response.execute(request0, response2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test00022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00022");
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
    public void test00023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00023");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.contentType = "";
        java.net.URL uRL4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response5 = response1.url(uRL4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00024");
        int int0 = java.util.regex.Pattern.LITERAL;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 16 + "'", int0 == 16);
    }

    @Test
    public void test00025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00025");
        boolean boolean2 = java.util.regex.Pattern.matches("Location", (java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00026");
        java.util.regex.Pattern pattern0 = null;
        org.jsoup.helper.HttpConnection.Response.xmlContentTypeRxp = pattern0;
    }

    @Test
    public void test00027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00027");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.contentType = "";
        java.lang.String str4 = response1.contentType;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = response1.hasHeaderWithValue("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test00028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00028");
        org.jsoup.Connection.Request request0 = null;
        java.io.OutputStream outputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response.writePost(request0, outputStream1, "\\Qhi!\\E");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00029");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer5 = byteBuffer1.putInt(0);
        java.nio.ByteBuffer byteBuffer7 = byteBuffer5.putInt((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            java.nio.Buffer buffer8 = byteBuffer5.reset();
            org.junit.Assert.fail("Expected exception of type java.nio.InvalidMarkException; message: null");
        } catch (java.nio.InvalidMarkException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertNotNull(byteBuffer7);
    }

    @Test
    public void test00030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00030");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.contentType = "";
        java.lang.String str4 = response1.contentType;
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry7 = response5.scanHeaders("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response9 = response5.removeHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(strEntry7);
    }

    @Test
    public void test00031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00031");
        org.jsoup.helper.HttpConnection.Response.MAX_REDIRECTS = 1;
    }

    @Test
    public void test00032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00032");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.contentType = "";
        java.lang.String str5 = response1.cookie("hi!");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray6 = response1.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test00033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00033");
        org.jsoup.Connection.Request request0 = null;
        java.io.OutputStream outputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response.writePost(request0, outputStream1, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00034");
        int int0 = java.util.regex.Pattern.CANON_EQ;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 128 + "'", int0 == 128);
    }

    @Test
    public void test00035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00035");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str4 = response2.getHeaderCaseInsensitive("");
        java.util.Map<java.lang.String, java.lang.String> strMap5 = response2.cookies();
        org.jsoup.Connection.Response response7 = response2.removeCookie("hi!");
        java.lang.String str8 = response2.statusMessage();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response9 = org.jsoup.helper.HttpConnection.Response.execute(request0, response2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test00036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00036");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        long long2 = byteBuffer1.getLong();
        int int3 = byteBuffer1.position();
        float float5 = byteBuffer1.getFloat((int) (short) 10);
        boolean boolean6 = byteBuffer1.hasArray();
        // The following exception was thrown during execution in test generation
        try {
            short short8 = byteBuffer1.getShort(128);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test00037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00037");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response6 = response1.header("hi!", "");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response1);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Too many redirects occurred trying to load URL null");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response6);
    }

    @Test
    public void test00038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00038");
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
    public void test00039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00039");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.contentType = "";
        java.lang.String str4 = response1.contentType;
        response1.executed = true;
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray7 = response1.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test00040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00040");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        java.util.Map<java.lang.String, java.lang.String> strMap4 = response1.cookies();
        org.jsoup.Connection.Response response6 = response1.removeCookie("hi!");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray7 = response1.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNotNull(response6);
    }

    @Test
    public void test00041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00041");
        int int0 = java.util.regex.Pattern.UNIX_LINES;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test00042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00042");
        int int0 = java.util.regex.Pattern.MULTILINE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 8 + "'", int0 == 8);
    }

    @Test
    public void test00043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00043");
        javax.net.ssl.SSLSocketFactory sSLSocketFactory0 = null;
        org.jsoup.helper.HttpConnection.Response.sslSocketFactory = sSLSocketFactory0;
    }

    @Test
    public void test00044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00044");
        int int0 = java.util.regex.Pattern.UNICODE_CHARACTER_CLASS;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 256 + "'", int0 == 256);
    }

    @Test
    public void test00045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00045");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer5 = byteBuffer1.putInt(0);
        byte[] byteArray8 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer9 = byteBuffer5.put(byteArray8);
        boolean boolean10 = byteBuffer5.hasArray();
        double double11 = byteBuffer5.getDouble();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer14 = byteBuffer5.putInt((int) (short) -1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test00046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00046");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        long long2 = byteBuffer1.getLong();
        int int3 = byteBuffer1.position();
        float float5 = byteBuffer1.getFloat((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray6 = byteBuffer1.array();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
    }

    @Test
    public void test00047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00047");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer5 = byteBuffer1.putInt(0);
        byte[] byteArray8 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer9 = byteBuffer5.put(byteArray8);
        boolean boolean10 = byteBuffer5.hasArray();
        // The following exception was thrown during execution in test generation
        try {
            int int11 = byteBuffer5.arrayOffset();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test00048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00048");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate((int) (short) 0);
        java.nio.ByteBuffer byteBuffer3 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer5 = byteBuffer3.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer7 = byteBuffer3.putInt(0);
        byte[] byteArray10 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer11 = byteBuffer7.put(byteArray10);
        java.nio.ByteBuffer byteBuffer13 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer15 = byteBuffer13.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer17 = byteBuffer13.putInt(0);
        byte[] byteArray20 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer21 = byteBuffer17.put(byteArray20);
        java.nio.ByteBuffer byteBuffer24 = byteBuffer7.get(byteArray20, 2, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer25 = byteBuffer1.put(byteArray20);
            org.junit.Assert.fail("Expected exception of type java.nio.BufferOverflowException; message: null");
        } catch (java.nio.BufferOverflowException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertNotNull(byteBuffer7);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer11);
        org.junit.Assert.assertNotNull(byteBuffer13);
        org.junit.Assert.assertNotNull(byteBuffer15);
        org.junit.Assert.assertNotNull(byteBuffer17);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer21);
        org.junit.Assert.assertNotNull(byteBuffer24);
    }

    @Test
    public void test00049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00049");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        java.util.Map<java.lang.String, java.lang.String> strMap4 = response1.cookies();
        org.jsoup.Connection.Response response6 = response1.removeCookie("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response1);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Too many redirects occurred trying to load URL null");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNotNull(response6);
    }

    @Test
    public void test00050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00050");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        long long2 = byteBuffer1.getLong();
        java.nio.ByteBuffer byteBuffer4 = byteBuffer1.putLong((long) 4);
        java.nio.ByteBuffer byteBuffer5 = byteBuffer1.asReadOnlyBuffer();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer8 = byteBuffer5.putFloat((int) ' ', (float) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.nio.ReadOnlyBufferException; message: null");
        } catch (java.nio.ReadOnlyBufferException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertNotNull(byteBuffer5);
    }

    @Test
    public void test00051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00051");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer5 = byteBuffer1.putInt(0);
        java.nio.ByteBuffer byteBuffer8 = byteBuffer5.putDouble((int) (byte) 1, (double) 1L);
        java.nio.ByteBuffer byteBuffer10 = byteBuffer5.putChar('a');
        // The following exception was thrown during execution in test generation
        try {
            int int12 = byteBuffer5.getInt((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertNotNull(byteBuffer8);
        org.junit.Assert.assertNotNull(byteBuffer10);
    }

    @Test
    public void test00052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00052");
        javax.net.SocketFactory socketFactory0 = javax.net.ssl.SSLSocketFactory.getDefault();
        java.net.Socket socket1 = socketFactory0.createSocket();
        java.net.Socket socket2 = socketFactory0.createSocket();
        java.net.InetAddress inetAddress3 = null;
        java.net.InetAddress inetAddress5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.Socket socket7 = socketFactory0.createSocket(inetAddress3, (int) (short) 0, inetAddress5, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.net.BindException; message: Permission denied (Bind failed)");
        } catch (java.net.BindException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(socketFactory0);
        org.junit.Assert.assertNotNull(socket1);
        org.junit.Assert.assertEquals(socket1.toString(), "Socket[unconnected]");
        org.junit.Assert.assertNotNull(socket2);
        org.junit.Assert.assertEquals(socket2.toString(), "Socket[unconnected]");
    }

    @Test
    public void test00053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00053");
        org.jsoup.helper.HttpConnection.Response.initUnSecureTSL();
    }

    @Test
    public void test00054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00054");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.contentType = "";
        java.lang.String str4 = response1.contentType;
        response1.executed = true;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response1);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Too many redirects occurred trying to load URL null");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test00055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00055");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.putLong((long) '4');
        short short5 = byteBuffer1.getShort(0);
        int int7 = byteBuffer1.getInt((int) '4');
        java.lang.Class<?> wildcardClass8 = byteBuffer1.getClass();
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 0 + "'", short5 == (short) 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00056");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.putLong((long) '4');
        int int5 = byteBuffer3.getInt((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int7 = byteBuffer3.getInt((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test00057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00057");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer5 = byteBuffer1.putInt(0);
        byte[] byteArray8 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer9 = byteBuffer5.put(byteArray8);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = byteBuffer9.arrayOffset();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer9);
    }

    @Test
    public void test00058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00058");
        javax.net.SocketFactory socketFactory0 = javax.net.ssl.SSLSocketFactory.getDefault();
        java.net.Socket socket1 = socketFactory0.createSocket();
        java.net.InetAddress inetAddress4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.Socket socket6 = socketFactory0.createSocket("", (int) '4', inetAddress4, 1);
            org.junit.Assert.fail("Expected exception of type java.net.BindException; message: Permission denied (Bind failed)");
        } catch (java.net.BindException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(socketFactory0);
        org.junit.Assert.assertNotNull(socket1);
        org.junit.Assert.assertEquals(socket1.toString(), "Socket[unconnected]");
    }

    @Test
    public void test00059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00059");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer5 = byteBuffer1.putInt(0);
        byte[] byteArray8 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer9 = byteBuffer5.put(byteArray8);
        org.jsoup.helper.HttpConnection.Response response10 = null;
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response10);
        response11.contentType = "";
        boolean boolean14 = byteBuffer9.equals((java.lang.Object) "");
        java.nio.ByteBuffer byteBuffer16 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer18 = byteBuffer16.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer20 = byteBuffer16.putInt(0);
        java.nio.ByteBuffer byteBuffer22 = byteBuffer20.putInt((int) '#');
        int int23 = byteBuffer9.compareTo(byteBuffer20);
        int int24 = byteBuffer20.position();
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(byteBuffer16);
        org.junit.Assert.assertNotNull(byteBuffer18);
        org.junit.Assert.assertNotNull(byteBuffer20);
        org.junit.Assert.assertNotNull(byteBuffer22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2 + "'", int23 == 2);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 16 + "'", int24 == 16);
    }

    @Test
    public void test00060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00060");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer5 = byteBuffer1.putInt(0);
        byte[] byteArray8 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer9 = byteBuffer5.put(byteArray8);
        java.nio.ByteBuffer byteBuffer11 = byteBuffer9.put((byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.Buffer buffer12 = byteBuffer9.reset();
            org.junit.Assert.fail("Expected exception of type java.nio.InvalidMarkException; message: null");
        } catch (java.nio.InvalidMarkException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertNotNull(byteBuffer11);
    }

    @Test
    public void test00061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00061");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        long long2 = byteBuffer1.getLong();
        int int3 = byteBuffer1.position();
        float float5 = byteBuffer1.getFloat((int) (short) 10);
        boolean boolean6 = byteBuffer1.hasArray();
        double double7 = byteBuffer1.getDouble();
        java.nio.ByteBuffer byteBuffer10 = byteBuffer1.putFloat(0, (float) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray11 = byteBuffer10.array();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(byteBuffer10);
    }

    @Test
    public void test00062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00062");
        java.util.regex.Pattern pattern2 = java.util.regex.Pattern.compile("\\Qhi!\\E", (int) (short) 100);
        java.lang.String str3 = pattern2.toString();
        org.junit.Assert.assertNotNull(pattern2);
        org.junit.Assert.assertEquals(pattern2.toString(), "\\Qhi!\\E");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\Qhi!\\E" + "'", str3, "\\Qhi!\\E");
    }

    @Test
    public void test00063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00063");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.contentType = "";
        java.lang.String str5 = response1.cookie("hi!");
        int int6 = response1.statusCode();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response1);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Too many redirects occurred trying to load URL null");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test00064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00064");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        java.util.Map<java.lang.String, java.lang.String> strMap4 = response1.cookies();
        org.jsoup.Connection.Response response6 = response1.removeCookie("hi!");
        java.lang.String str7 = response1.statusMessage();
        java.nio.ByteBuffer byteBuffer9 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer11 = byteBuffer9.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer13 = byteBuffer9.putInt(0);
        byte[] byteArray16 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer17 = byteBuffer13.put(byteArray16);
        boolean boolean18 = byteBuffer13.hasArray();
        response1.byteData = byteBuffer13;
        java.nio.ByteBuffer byteBuffer21 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer23 = byteBuffer21.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer25 = byteBuffer21.putInt(0);
        byte[] byteArray28 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer29 = byteBuffer25.put(byteArray28);
        boolean boolean30 = byteBuffer25.hasArray();
        java.nio.ByteBuffer byteBuffer32 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer34 = byteBuffer32.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer36 = byteBuffer32.putInt(0);
        byte[] byteArray39 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer40 = byteBuffer36.put(byteArray39);
        java.nio.ByteBuffer byteBuffer42 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer44 = byteBuffer42.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer46 = byteBuffer42.putInt(0);
        byte[] byteArray49 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer50 = byteBuffer46.put(byteArray49);
        java.nio.ByteBuffer byteBuffer53 = byteBuffer36.get(byteArray49, 2, (int) (byte) 0);
        java.nio.ByteBuffer byteBuffer55 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer57 = byteBuffer55.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer59 = byteBuffer55.putInt(0);
        byte[] byteArray62 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer63 = byteBuffer59.put(byteArray62);
        java.nio.ByteBuffer byteBuffer65 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer67 = byteBuffer65.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer69 = byteBuffer65.putInt(0);
        byte[] byteArray72 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer73 = byteBuffer69.put(byteArray72);
        java.nio.ByteBuffer byteBuffer76 = byteBuffer59.get(byteArray72, 2, (int) (byte) 0);
        java.nio.ByteBuffer byteBuffer77 = byteBuffer53.put(byteArray72);
        java.nio.ByteBuffer byteBuffer78 = byteBuffer25.put(byteArray72);
        response1.byteData = byteBuffer25;
        byte byte80 = byteBuffer25.get();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertNotNull(byteBuffer11);
        org.junit.Assert.assertNotNull(byteBuffer13);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(byteBuffer21);
        org.junit.Assert.assertNotNull(byteBuffer23);
        org.junit.Assert.assertNotNull(byteBuffer25);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray28), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(byteBuffer32);
        org.junit.Assert.assertNotNull(byteBuffer34);
        org.junit.Assert.assertNotNull(byteBuffer36);
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray39), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer40);
        org.junit.Assert.assertNotNull(byteBuffer42);
        org.junit.Assert.assertNotNull(byteBuffer44);
        org.junit.Assert.assertNotNull(byteBuffer46);
        org.junit.Assert.assertNotNull(byteArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray49), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer50);
        org.junit.Assert.assertNotNull(byteBuffer53);
        org.junit.Assert.assertNotNull(byteBuffer55);
        org.junit.Assert.assertNotNull(byteBuffer57);
        org.junit.Assert.assertNotNull(byteBuffer59);
        org.junit.Assert.assertNotNull(byteArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray62), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer63);
        org.junit.Assert.assertNotNull(byteBuffer65);
        org.junit.Assert.assertNotNull(byteBuffer67);
        org.junit.Assert.assertNotNull(byteBuffer69);
        org.junit.Assert.assertNotNull(byteArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray72), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer73);
        org.junit.Assert.assertNotNull(byteBuffer76);
        org.junit.Assert.assertNotNull(byteBuffer77);
        org.junit.Assert.assertNotNull(byteBuffer78);
        org.junit.Assert.assertTrue("'" + byte80 + "' != '" + (byte) 0 + "'", byte80 == (byte) 0);
    }

    @Test
    public void test00065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00065");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer5 = byteBuffer1.putInt(0);
        byte[] byteArray8 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer9 = byteBuffer5.put(byteArray8);
        org.jsoup.helper.HttpConnection.Response response10 = null;
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response10);
        response11.contentType = "";
        boolean boolean14 = byteBuffer9.equals((java.lang.Object) "");
        double double16 = byteBuffer9.getDouble(0);
        // The following exception was thrown during execution in test generation
        try {
            float float18 = byteBuffer9.getFloat((-24));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 2.57E-322d + "'", double16 == 2.57E-322d);
    }

    @Test
    public void test00066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00066");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.contentType = "";
        java.lang.String str5 = response1.cookie("hi!");
        int int6 = response1.statusCode();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = response1.hasHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test00067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00067");
        int int0 = java.util.regex.Pattern.UNICODE_CASE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 64 + "'", int0 == 64);
    }

    @Test
    public void test00068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00068");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer5 = byteBuffer1.putInt(0);
        byte[] byteArray8 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer9 = byteBuffer5.put(byteArray8);
        boolean boolean10 = byteBuffer5.hasArray();
        double double11 = byteBuffer5.getDouble();
        // The following exception was thrown during execution in test generation
        try {
            int int12 = byteBuffer5.arrayOffset();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test00069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00069");
        java.lang.String str1 = java.util.regex.Pattern.quote("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\Q\\E" + "'", str1, "\\Q\\E");
    }

    @Test
    public void test00070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00070");
        javax.net.SocketFactory socketFactory0 = javax.net.ssl.SSLSocketFactory.getDefault();
        java.net.Socket socket1 = socketFactory0.createSocket();
        java.net.Socket socket2 = socketFactory0.createSocket();
        java.net.InetAddress inetAddress5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.Socket socket7 = socketFactory0.createSocket("java.nio.DirectByteBuffer[pos=8 lim=100 cap=100]", 0, inetAddress5, 0);
            org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: java.nio.DirectByteBuffer[pos=8 lim=100 cap=100]");
        } catch (java.net.UnknownHostException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(socketFactory0);
        org.junit.Assert.assertNotNull(socket1);
        org.junit.Assert.assertEquals(socket1.toString(), "Socket[unconnected]");
        org.junit.Assert.assertNotNull(socket2);
        org.junit.Assert.assertEquals(socket2.toString(), "Socket[unconnected]");
    }

    @Test
    public void test00071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00071");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate((int) '4');
        java.nio.ShortBuffer shortBuffer2 = byteBuffer1.asShortBuffer();
        java.nio.ByteBuffer byteBuffer4 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        long long5 = byteBuffer4.getLong();
        int int6 = byteBuffer4.position();
        float float8 = byteBuffer4.getFloat((int) (short) 10);
        boolean boolean9 = byteBuffer4.hasArray();
        double double10 = byteBuffer4.getDouble();
        short short12 = byteBuffer4.getShort(0);
        java.nio.ByteBuffer byteBuffer14 = byteBuffer4.putDouble(100.0d);
        byte byte16 = byteBuffer14.get((int) (short) 0);
        java.nio.IntBuffer intBuffer17 = byteBuffer14.asIntBuffer();
        int int18 = byteBuffer1.compareTo(byteBuffer14);
        byte[] byteArray23 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer26 = byteBuffer1.get(byteArray23, (int) (byte) 1, 14);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(shortBuffer2);
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 0 + "'", short12 == (short) 0);
        org.junit.Assert.assertNotNull(byteBuffer14);
        org.junit.Assert.assertTrue("'" + byte16 + "' != '" + (byte) 0 + "'", byte16 == (byte) 0);
        org.junit.Assert.assertNotNull(intBuffer17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-24) + "'", int18 == (-24));
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[1, 1, -1, 100]");
    }

    @Test
    public void test00072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00072");
        org.jsoup.Connection.Request request0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = org.jsoup.helper.HttpConnection.Response.setOutputContentType(request0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00073");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        java.util.Map<java.lang.String, java.lang.String> strMap4 = response1.cookies();
        org.jsoup.Connection.Response response6 = response1.removeCookie("hi!");
        java.lang.String str7 = response1.statusMessage();
        java.nio.ByteBuffer byteBuffer9 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer11 = byteBuffer9.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer13 = byteBuffer9.putInt(0);
        byte[] byteArray16 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer17 = byteBuffer13.put(byteArray16);
        boolean boolean18 = byteBuffer13.hasArray();
        response1.byteData = byteBuffer13;
        java.nio.ByteBuffer byteBuffer21 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer23 = byteBuffer21.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer25 = byteBuffer21.putInt(0);
        byte[] byteArray28 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer29 = byteBuffer25.put(byteArray28);
        boolean boolean30 = byteBuffer25.hasArray();
        java.nio.ByteBuffer byteBuffer32 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer34 = byteBuffer32.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer36 = byteBuffer32.putInt(0);
        byte[] byteArray39 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer40 = byteBuffer36.put(byteArray39);
        java.nio.ByteBuffer byteBuffer42 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer44 = byteBuffer42.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer46 = byteBuffer42.putInt(0);
        byte[] byteArray49 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer50 = byteBuffer46.put(byteArray49);
        java.nio.ByteBuffer byteBuffer53 = byteBuffer36.get(byteArray49, 2, (int) (byte) 0);
        java.nio.ByteBuffer byteBuffer55 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer57 = byteBuffer55.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer59 = byteBuffer55.putInt(0);
        byte[] byteArray62 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer63 = byteBuffer59.put(byteArray62);
        java.nio.ByteBuffer byteBuffer65 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer67 = byteBuffer65.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer69 = byteBuffer65.putInt(0);
        byte[] byteArray72 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer73 = byteBuffer69.put(byteArray72);
        java.nio.ByteBuffer byteBuffer76 = byteBuffer59.get(byteArray72, 2, (int) (byte) 0);
        java.nio.ByteBuffer byteBuffer77 = byteBuffer53.put(byteArray72);
        java.nio.ByteBuffer byteBuffer78 = byteBuffer25.put(byteArray72);
        response1.byteData = byteBuffer25;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response80 = new org.jsoup.helper.HttpConnection.Response(response1);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Too many redirects occurred trying to load URL null");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertNotNull(byteBuffer11);
        org.junit.Assert.assertNotNull(byteBuffer13);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(byteBuffer21);
        org.junit.Assert.assertNotNull(byteBuffer23);
        org.junit.Assert.assertNotNull(byteBuffer25);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray28), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(byteBuffer32);
        org.junit.Assert.assertNotNull(byteBuffer34);
        org.junit.Assert.assertNotNull(byteBuffer36);
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray39), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer40);
        org.junit.Assert.assertNotNull(byteBuffer42);
        org.junit.Assert.assertNotNull(byteBuffer44);
        org.junit.Assert.assertNotNull(byteBuffer46);
        org.junit.Assert.assertNotNull(byteArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray49), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer50);
        org.junit.Assert.assertNotNull(byteBuffer53);
        org.junit.Assert.assertNotNull(byteBuffer55);
        org.junit.Assert.assertNotNull(byteBuffer57);
        org.junit.Assert.assertNotNull(byteBuffer59);
        org.junit.Assert.assertNotNull(byteArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray62), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer63);
        org.junit.Assert.assertNotNull(byteBuffer65);
        org.junit.Assert.assertNotNull(byteBuffer67);
        org.junit.Assert.assertNotNull(byteBuffer69);
        org.junit.Assert.assertNotNull(byteArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray72), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer73);
        org.junit.Assert.assertNotNull(byteBuffer76);
        org.junit.Assert.assertNotNull(byteBuffer77);
        org.junit.Assert.assertNotNull(byteBuffer78);
    }

    @Test
    public void test00074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00074");
        javax.net.SocketFactory socketFactory0 = javax.net.ssl.SSLSocketFactory.getDefault();
        java.net.InetAddress inetAddress1 = null;
        java.net.InetAddress inetAddress3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.Socket socket5 = socketFactory0.createSocket(inetAddress1, (int) ' ', inetAddress3, 1);
            org.junit.Assert.fail("Expected exception of type java.net.BindException; message: Permission denied (Bind failed)");
        } catch (java.net.BindException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(socketFactory0);
    }

    @Test
    public void test00075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00075");
        org.jsoup.helper.HttpConnection.Response.LOCATION = "\\Q\\E";
    }

    @Test
    public void test00076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00076");
        org.jsoup.Connection.Request request0 = null;
        java.io.OutputStream outputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response.writePost(request0, outputStream1, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00077");
        java.util.regex.Pattern pattern1 = java.util.regex.Pattern.compile("hi!");
        java.lang.String str2 = pattern1.pattern();
        java.lang.String str3 = pattern1.toString();
        org.junit.Assert.assertNotNull(pattern1);
        org.junit.Assert.assertEquals(pattern1.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test00078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00078");
        org.jsoup.helper.HttpConnection.Response.MAX_REDIRECTS = (byte) 0;
    }

    @Test
    public void test00079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00079");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        java.util.Map<java.lang.String, java.lang.String> strMap4 = response1.cookies();
        org.jsoup.Connection.Response response6 = response1.removeCookie("hi!");
        java.lang.String str7 = response1.statusMessage();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response1);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Too many redirects occurred trying to load URL null");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test00080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00080");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer5 = byteBuffer1.putInt(0);
        byte[] byteArray8 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer9 = byteBuffer5.put(byteArray8);
        java.nio.ByteBuffer byteBuffer11 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer13 = byteBuffer11.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer15 = byteBuffer11.putInt(0);
        byte[] byteArray18 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer19 = byteBuffer15.put(byteArray18);
        java.nio.ByteBuffer byteBuffer22 = byteBuffer5.get(byteArray18, 2, (int) (byte) 0);
        java.nio.ByteBuffer byteBuffer24 = byteBuffer5.putDouble(100.0d);
        // The following exception was thrown during execution in test generation
        try {
            int int26 = byteBuffer24.getInt((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertNotNull(byteBuffer11);
        org.junit.Assert.assertNotNull(byteBuffer13);
        org.junit.Assert.assertNotNull(byteBuffer15);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer19);
        org.junit.Assert.assertNotNull(byteBuffer22);
        org.junit.Assert.assertNotNull(byteBuffer24);
    }

    @Test
    public void test00081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00081");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer5 = byteBuffer1.putInt(0);
        byte[] byteArray8 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer9 = byteBuffer5.put(byteArray8);
        java.nio.ByteBuffer byteBuffer11 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer13 = byteBuffer11.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer15 = byteBuffer11.putInt(0);
        byte[] byteArray18 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer19 = byteBuffer15.put(byteArray18);
        java.nio.ByteBuffer byteBuffer22 = byteBuffer5.get(byteArray18, 2, (int) (byte) 0);
        java.nio.ByteBuffer byteBuffer24 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer26 = byteBuffer24.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer28 = byteBuffer24.putInt(0);
        byte[] byteArray31 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer32 = byteBuffer28.put(byteArray31);
        java.nio.ByteBuffer byteBuffer34 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer36 = byteBuffer34.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer38 = byteBuffer34.putInt(0);
        byte[] byteArray41 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer42 = byteBuffer38.put(byteArray41);
        java.nio.ByteBuffer byteBuffer45 = byteBuffer28.get(byteArray41, 2, (int) (byte) 0);
        java.nio.ByteBuffer byteBuffer46 = byteBuffer22.put(byteArray41);
        // The following exception was thrown during execution in test generation
        try {
            int int48 = byteBuffer46.getInt((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertNotNull(byteBuffer11);
        org.junit.Assert.assertNotNull(byteBuffer13);
        org.junit.Assert.assertNotNull(byteBuffer15);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer19);
        org.junit.Assert.assertNotNull(byteBuffer22);
        org.junit.Assert.assertNotNull(byteBuffer24);
        org.junit.Assert.assertNotNull(byteBuffer26);
        org.junit.Assert.assertNotNull(byteBuffer28);
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray31), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer32);
        org.junit.Assert.assertNotNull(byteBuffer34);
        org.junit.Assert.assertNotNull(byteBuffer36);
        org.junit.Assert.assertNotNull(byteBuffer38);
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray41), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer42);
        org.junit.Assert.assertNotNull(byteBuffer45);
        org.junit.Assert.assertNotNull(byteBuffer46);
    }

    @Test
    public void test00082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00082");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        long long2 = byteBuffer1.getLong();
        int int3 = byteBuffer1.position();
        float float5 = byteBuffer1.getFloat((int) (short) 10);
        boolean boolean6 = byteBuffer1.hasArray();
        double double7 = byteBuffer1.getDouble();
        short short9 = byteBuffer1.getShort(0);
        java.nio.ByteBuffer byteBuffer11 = byteBuffer1.putDouble(100.0d);
        float float12 = byteBuffer1.getFloat();
        java.nio.ByteBuffer byteBuffer14 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer16 = byteBuffer14.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer18 = byteBuffer14.putInt(0);
        byte[] byteArray21 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer22 = byteBuffer18.put(byteArray21);
        java.nio.ByteBuffer byteBuffer24 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer26 = byteBuffer24.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer28 = byteBuffer24.putInt(0);
        byte[] byteArray31 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer32 = byteBuffer28.put(byteArray31);
        java.nio.ByteBuffer byteBuffer35 = byteBuffer18.get(byteArray31, 2, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer38 = byteBuffer1.put(byteArray31, (int) (byte) 10, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 0 + "'", short9 == (short) 0);
        org.junit.Assert.assertNotNull(byteBuffer11);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.0f + "'", float12 == 0.0f);
        org.junit.Assert.assertNotNull(byteBuffer14);
        org.junit.Assert.assertNotNull(byteBuffer16);
        org.junit.Assert.assertNotNull(byteBuffer18);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer22);
        org.junit.Assert.assertNotNull(byteBuffer24);
        org.junit.Assert.assertNotNull(byteBuffer26);
        org.junit.Assert.assertNotNull(byteBuffer28);
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray31), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer32);
        org.junit.Assert.assertNotNull(byteBuffer35);
    }

    @Test
    public void test00083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00083");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer5 = byteBuffer1.putInt(0);
        byte[] byteArray8 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer9 = byteBuffer5.put(byteArray8);
        java.nio.ByteBuffer byteBuffer11 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer13 = byteBuffer11.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer15 = byteBuffer11.putInt(0);
        byte[] byteArray18 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer19 = byteBuffer15.put(byteArray18);
        java.nio.ByteBuffer byteBuffer22 = byteBuffer5.get(byteArray18, 2, (int) (byte) 0);
        java.nio.ByteBuffer byteBuffer24 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer26 = byteBuffer24.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer28 = byteBuffer24.putInt(0);
        byte[] byteArray31 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer32 = byteBuffer28.put(byteArray31);
        java.nio.ByteBuffer byteBuffer34 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer36 = byteBuffer34.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer38 = byteBuffer34.putInt(0);
        byte[] byteArray41 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer42 = byteBuffer38.put(byteArray41);
        java.nio.ByteBuffer byteBuffer45 = byteBuffer28.get(byteArray41, 2, (int) (byte) 0);
        java.nio.ByteBuffer byteBuffer46 = byteBuffer22.put(byteArray41);
        java.nio.ByteBuffer byteBuffer48 = byteBuffer22.putShort((short) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.Buffer buffer49 = byteBuffer48.reset();
            org.junit.Assert.fail("Expected exception of type java.nio.InvalidMarkException; message: null");
        } catch (java.nio.InvalidMarkException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertNotNull(byteBuffer11);
        org.junit.Assert.assertNotNull(byteBuffer13);
        org.junit.Assert.assertNotNull(byteBuffer15);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer19);
        org.junit.Assert.assertNotNull(byteBuffer22);
        org.junit.Assert.assertNotNull(byteBuffer24);
        org.junit.Assert.assertNotNull(byteBuffer26);
        org.junit.Assert.assertNotNull(byteBuffer28);
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray31), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer32);
        org.junit.Assert.assertNotNull(byteBuffer34);
        org.junit.Assert.assertNotNull(byteBuffer36);
        org.junit.Assert.assertNotNull(byteBuffer38);
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray41), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer42);
        org.junit.Assert.assertNotNull(byteBuffer45);
        org.junit.Assert.assertNotNull(byteBuffer46);
        org.junit.Assert.assertNotNull(byteBuffer48);
    }

    @Test
    public void test00084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00084");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.contentType = "";
        java.lang.String str4 = response1.contentType;
        response1.executed = true;
        java.net.URL uRL7 = response1.url();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response1);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Too many redirects occurred trying to load URL null");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(uRL7);
    }

    @Test
    public void test00085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00085");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 10, (byte) 1, (byte) -1, (byte) 10, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer9 = java.nio.ByteBuffer.wrap(byteArray6, 16, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, 10, 1, -1, 10, -1]");
    }

    @Test
    public void test00086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00086");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.putLong((long) '4');
        int int5 = byteBuffer3.getInt((int) (short) 1);
        java.nio.ByteBuffer byteBuffer8 = byteBuffer3.putChar((int) ' ', '#');
        java.lang.String str9 = byteBuffer8.toString();
        // The following exception was thrown during execution in test generation
        try {
            int int10 = byteBuffer8.arrayOffset();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(byteBuffer8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "java.nio.DirectByteBuffer[pos=8 lim=100 cap=100]" + "'", str9, "java.nio.DirectByteBuffer[pos=8 lim=100 cap=100]");
    }

    @Test
    public void test00087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00087");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer5 = byteBuffer1.putInt(0);
        java.nio.Buffer buffer7 = byteBuffer1.limit(32);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.Buffer buffer8 = buffer7.reset();
            org.junit.Assert.fail("Expected exception of type java.nio.InvalidMarkException; message: null");
        } catch (java.nio.InvalidMarkException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertNotNull(buffer7);
    }

    @Test
    public void test00088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00088");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.contentType = "";
        java.lang.String str5 = response1.cookie("hi!");
        int int6 = response1.statusCode();
        response1.contentType = "";
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response1);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Too many redirects occurred trying to load URL null");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test00089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00089");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.putLong((long) '4');
        short short5 = byteBuffer1.getShort(0);
        java.nio.ByteBuffer byteBuffer8 = byteBuffer1.putChar(1, '4');
        java.nio.ByteBuffer byteBuffer11 = byteBuffer8.put((int) (short) 10, (byte) 1);
        int int12 = byteBuffer11.getInt();
        java.lang.Class<?> wildcardClass13 = byteBuffer11.getClass();
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 0 + "'", short5 == (short) 0);
        org.junit.Assert.assertNotNull(byteBuffer8);
        org.junit.Assert.assertNotNull(byteBuffer11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 256 + "'", int12 == 256);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00090");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response6 = response1.header("hi!", "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = response1.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response6);
    }

    @Test
    public void test00091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00091");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.contentType = "";
        java.lang.String str5 = response1.cookie("hi!");
        org.jsoup.Connection.Request request6 = null;
        response1.req = request6;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response1);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Too many redirects occurred trying to load URL null");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test00092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00092");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        long long2 = byteBuffer1.getLong();
        int int3 = byteBuffer1.position();
        // The following exception was thrown during execution in test generation
        try {
            int int4 = byteBuffer1.arrayOffset();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
    }

    @Test
    public void test00093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00093");
        javax.net.SocketFactory socketFactory0 = javax.net.ssl.SSLSocketFactory.getDefault();
        java.net.InetAddress inetAddress1 = null;
        java.net.InetAddress inetAddress3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.Socket socket5 = socketFactory0.createSocket(inetAddress1, (int) 'a', inetAddress3, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.net.BindException; message: Permission denied (Bind failed)");
        } catch (java.net.BindException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(socketFactory0);
    }

    @Test
    public void test00094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00094");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer5 = byteBuffer1.putInt(0);
        byte[] byteArray8 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer9 = byteBuffer5.put(byteArray8);
        java.nio.ByteBuffer byteBuffer11 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer13 = byteBuffer11.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer15 = byteBuffer11.putInt(0);
        byte[] byteArray18 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer19 = byteBuffer15.put(byteArray18);
        java.nio.ByteBuffer byteBuffer22 = byteBuffer5.get(byteArray18, 2, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer25 = java.nio.ByteBuffer.wrap(byteArray18, (int) (byte) -1, (-24));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertNotNull(byteBuffer11);
        org.junit.Assert.assertNotNull(byteBuffer13);
        org.junit.Assert.assertNotNull(byteBuffer15);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer19);
        org.junit.Assert.assertNotNull(byteBuffer22);
    }

    @Test
    public void test00095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00095");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.putLong((long) '4');
        short short5 = byteBuffer1.getShort(0);
        java.nio.ByteBuffer byteBuffer8 = byteBuffer1.putChar(1, '4');
        java.nio.ByteBuffer byteBuffer11 = byteBuffer8.put((int) (short) 10, (byte) 1);
        int int12 = byteBuffer11.getInt();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.Buffer buffer14 = byteBuffer11.limit((-24));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 0 + "'", short5 == (short) 0);
        org.junit.Assert.assertNotNull(byteBuffer8);
        org.junit.Assert.assertNotNull(byteBuffer11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 256 + "'", int12 == 256);
    }

    @Test
    public void test00096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00096");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        response2.contentType = "";
        java.lang.String str5 = response2.contentType;
        response2.executed = true;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry9 = response2.scanHeaders("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response10 = org.jsoup.helper.HttpConnection.Response.execute(request0, response2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(strEntry9);
    }

    @Test
    public void test00097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00097");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        long long2 = byteBuffer1.getLong();
        int int3 = byteBuffer1.position();
        float float5 = byteBuffer1.getFloat((int) (short) 10);
        boolean boolean6 = byteBuffer1.hasArray();
        double double7 = byteBuffer1.getDouble();
        java.nio.ByteBuffer byteBuffer10 = byteBuffer1.putFloat(0, (float) (short) 10);
        java.nio.ByteBuffer byteBuffer12 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer14 = byteBuffer12.putLong((long) '4');
        int int16 = byteBuffer14.getInt((int) (short) 1);
        java.nio.ByteBuffer byteBuffer18 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer20 = byteBuffer18.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer22 = byteBuffer18.putInt(0);
        byte[] byteArray25 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer26 = byteBuffer22.put(byteArray25);
        java.nio.ByteBuffer byteBuffer28 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer30 = byteBuffer28.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer32 = byteBuffer28.putInt(0);
        byte[] byteArray35 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer36 = byteBuffer32.put(byteArray35);
        java.nio.ByteBuffer byteBuffer39 = byteBuffer22.get(byteArray35, 2, (int) (byte) 0);
        java.nio.ByteBuffer byteBuffer40 = byteBuffer14.get(byteArray35);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer43 = byteBuffer10.put(byteArray35, 92, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(byteBuffer10);
        org.junit.Assert.assertNotNull(byteBuffer12);
        org.junit.Assert.assertNotNull(byteBuffer14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(byteBuffer18);
        org.junit.Assert.assertNotNull(byteBuffer20);
        org.junit.Assert.assertNotNull(byteBuffer22);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer26);
        org.junit.Assert.assertNotNull(byteBuffer28);
        org.junit.Assert.assertNotNull(byteBuffer30);
        org.junit.Assert.assertNotNull(byteBuffer32);
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray35), "[0, 0]");
        org.junit.Assert.assertNotNull(byteBuffer36);
        org.junit.Assert.assertNotNull(byteBuffer39);
        org.junit.Assert.assertNotNull(byteBuffer40);
    }

    @Test
    public void test00098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00098");
        javax.net.SocketFactory socketFactory0 = javax.net.ssl.SSLSocketFactory.getDefault();
        java.net.Socket socket1 = socketFactory0.createSocket();
        // The following exception was thrown during execution in test generation
        try {
            java.net.Socket socket4 = socketFactory0.createSocket("\\Q\\E", 128);
            org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: \\Q\\E");
        } catch (java.net.UnknownHostException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(socketFactory0);
        org.junit.Assert.assertNotNull(socket1);
        org.junit.Assert.assertEquals(socket1.toString(), "Socket[unconnected]");
    }

    @Test
    public void test00099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00099");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.putLong((long) '4');
        short short5 = byteBuffer1.getShort(0);
        java.nio.ByteBuffer byteBuffer8 = byteBuffer1.putChar(1, '4');
        java.nio.ByteBuffer byteBuffer10 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer12 = byteBuffer10.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer14 = byteBuffer10.putInt(0);
        byte[] byteArray17 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer18 = byteBuffer14.put(byteArray17);
        java.nio.ByteBuffer byteBuffer20 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer22 = byteBuffer20.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer24 = byteBuffer20.putInt(0);
        byte[] byteArray27 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer28 = byteBuffer24.put(byteArray27);
        java.nio.ByteBuffer byteBuffer31 = byteBuffer14.get(byteArray27, 2, (int) (byte) 0);
        java.nio.ByteBuffer byteBuffer33 = byteBuffer14.putDouble(100.0d);
        int int34 = byteBuffer8.compareTo(byteBuffer14);
        java.nio.Buffer buffer36 = byteBuffer14.limit((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer39 = byteBuffer14.putShort(100, (short) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 0 + "'", short5 == (short) 0);
        org.junit.Assert.assertNotNull(byteBuffer8);
        org.junit.Assert.assertNotNull(byteBuffer10);
        org.junit.Assert.assertNotNull(byteBuffer12);
        org.junit.Assert.assertNotNull(byteBuffer14);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer18);
        org.junit.Assert.assertNotNull(byteBuffer20);
        org.junit.Assert.assertNotNull(byteBuffer22);
        org.junit.Assert.assertNotNull(byteBuffer24);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer28);
        org.junit.Assert.assertNotNull(byteBuffer31);
        org.junit.Assert.assertNotNull(byteBuffer33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 14 + "'", int34 == 14);
        org.junit.Assert.assertNotNull(buffer36);
    }

    @Test
    public void test00100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00100");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.putLong((long) '4');
        short short5 = byteBuffer1.getShort(0);
        java.nio.ByteBuffer byteBuffer8 = byteBuffer1.putChar(1, '4');
        java.nio.ByteBuffer byteBuffer10 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer12 = byteBuffer10.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer14 = byteBuffer10.putInt(0);
        byte[] byteArray17 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer18 = byteBuffer14.put(byteArray17);
        java.nio.ByteBuffer byteBuffer20 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer22 = byteBuffer20.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer24 = byteBuffer20.putInt(0);
        byte[] byteArray27 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer28 = byteBuffer24.put(byteArray27);
        java.nio.ByteBuffer byteBuffer31 = byteBuffer14.get(byteArray27, 2, (int) (byte) 0);
        java.nio.ByteBuffer byteBuffer33 = byteBuffer14.putDouble(100.0d);
        int int34 = byteBuffer8.compareTo(byteBuffer14);
        java.nio.Buffer buffer36 = byteBuffer14.limit((int) (byte) 100);
        java.nio.ByteBuffer byteBuffer39 = byteBuffer14.putLong(4, (long) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray40 = byteBuffer14.array();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 0 + "'", short5 == (short) 0);
        org.junit.Assert.assertNotNull(byteBuffer8);
        org.junit.Assert.assertNotNull(byteBuffer10);
        org.junit.Assert.assertNotNull(byteBuffer12);
        org.junit.Assert.assertNotNull(byteBuffer14);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer18);
        org.junit.Assert.assertNotNull(byteBuffer20);
        org.junit.Assert.assertNotNull(byteBuffer22);
        org.junit.Assert.assertNotNull(byteBuffer24);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer28);
        org.junit.Assert.assertNotNull(byteBuffer31);
        org.junit.Assert.assertNotNull(byteBuffer33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 14 + "'", int34 == 14);
        org.junit.Assert.assertNotNull(buffer36);
        org.junit.Assert.assertNotNull(byteBuffer39);
    }

    @Test
    public void test00101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00101");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.contentType = "";
        java.lang.String str4 = response1.contentType;
        java.lang.Class<?> wildcardClass5 = response1.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test00102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00102");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        java.util.Map<java.lang.String, java.lang.String> strMap4 = response1.cookies();
        org.jsoup.Connection.Response response6 = response1.removeCookie("hi!");
        java.lang.String str7 = response1.statusMessage();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = response1.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test00103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00103");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            int int2 = byteBuffer1.arrayOffset();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
    }

    @Test
    public void test00104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00104");
        javax.net.SocketFactory socketFactory0 = javax.net.ssl.SSLSocketFactory.getDefault();
        java.net.Socket socket1 = socketFactory0.createSocket();
        // The following exception was thrown during execution in test generation
        try {
            java.net.Socket socket4 = socketFactory0.createSocket("java.nio.DirectByteBuffer[pos=8 lim=100 cap=100]", (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: java.nio.DirectByteBuffer[pos=8 lim=100 cap=100]");
        } catch (java.net.UnknownHostException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(socketFactory0);
        org.junit.Assert.assertNotNull(socket1);
        org.junit.Assert.assertEquals(socket1.toString(), "Socket[unconnected]");
    }

    @Test
    public void test00105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00105");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        java.util.Map<java.lang.String, java.lang.String> strMap4 = response1.cookies();
        org.jsoup.Connection.Response response6 = response1.removeCookie("hi!");
        java.net.HttpURLConnection httpURLConnection7 = null;
        org.jsoup.helper.HttpConnection.Response response8 = null;
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response8);
        response9.contentType = "";
        java.lang.String str13 = response9.cookie("hi!");
        int int14 = response9.statusCode();
        // The following exception was thrown during execution in test generation
        try {
            response1.setupFromConnection(httpURLConnection7, (org.jsoup.Connection.Response) response9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test00106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00106");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        long long2 = byteBuffer1.getLong();
        java.nio.ByteBuffer byteBuffer4 = byteBuffer1.putLong((long) 4);
        java.nio.ByteBuffer byteBuffer5 = byteBuffer1.asReadOnlyBuffer();
        java.nio.ByteBuffer byteBuffer6 = byteBuffer5.duplicate();
        // The following exception was thrown during execution in test generation
        try {
            double double8 = byteBuffer5.getDouble((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertNotNull(byteBuffer6);
    }

    @Test
    public void test00107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00107");
        javax.net.SocketFactory socketFactory0 = javax.net.ssl.SSLSocketFactory.getDefault();
        java.net.Socket socket1 = socketFactory0.createSocket();
        // The following exception was thrown during execution in test generation
        try {
            java.net.Socket socket4 = socketFactory0.createSocket("java.nio.DirectByteBuffer[pos=10 lim=100 cap=100]", 256);
            org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: java.nio.DirectByteBuffer[pos=10 lim=100 cap=100]");
        } catch (java.net.UnknownHostException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(socketFactory0);
        org.junit.Assert.assertNotNull(socket1);
        org.junit.Assert.assertEquals(socket1.toString(), "Socket[unconnected]");
    }

    @Test
    public void test00108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00108");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        long long2 = byteBuffer1.getLong();
        int int3 = byteBuffer1.position();
        float float5 = byteBuffer1.getFloat((int) (short) 10);
        boolean boolean6 = byteBuffer1.hasArray();
        double double7 = byteBuffer1.getDouble();
        short short9 = byteBuffer1.getShort(0);
        java.nio.ByteBuffer byteBuffer11 = byteBuffer1.putDouble(100.0d);
        byte byte13 = byteBuffer11.get((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer16 = byteBuffer11.put((int) (byte) 100, (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 0 + "'", short9 == (short) 0);
        org.junit.Assert.assertNotNull(byteBuffer11);
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) 0 + "'", byte13 == (byte) 0);
    }

    @Test
    public void test00109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00109");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        long long2 = byteBuffer1.getLong();
        int int3 = byteBuffer1.position();
        float float5 = byteBuffer1.getFloat((int) (short) 10);
        boolean boolean6 = byteBuffer1.hasArray();
        double double7 = byteBuffer1.getDouble();
        short short9 = byteBuffer1.getShort(0);
        java.nio.ByteBuffer byteBuffer11 = byteBuffer1.putDouble(100.0d);
        org.jsoup.helper.HttpConnection.Response response12 = null;
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response12);
        java.lang.String str15 = response13.getHeaderCaseInsensitive("");
        java.util.Map<java.lang.String, java.lang.String> strMap16 = response13.cookies();
        org.jsoup.Connection.Response response18 = response13.removeCookie("hi!");
        java.lang.String str19 = response13.statusMessage();
        java.nio.ByteBuffer byteBuffer21 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer23 = byteBuffer21.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer25 = byteBuffer21.putInt(0);
        byte[] byteArray28 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer29 = byteBuffer25.put(byteArray28);
        boolean boolean30 = byteBuffer25.hasArray();
        response13.byteData = byteBuffer25;
        int int32 = byteBuffer11.compareTo(byteBuffer25);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray33 = byteBuffer11.array();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 0 + "'", short9 == (short) 0);
        org.junit.Assert.assertNotNull(byteBuffer11);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertNotNull(response18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(byteBuffer21);
        org.junit.Assert.assertNotNull(byteBuffer23);
        org.junit.Assert.assertNotNull(byteBuffer25);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray28), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-10) + "'", int32 == (-10));
    }

    @Test
    public void test00110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00110");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.contentType = "";
        java.lang.String str4 = response1.contentType;
        response1.executed = true;
        response1.executed = false;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response10 = response1.removeCookie("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test00111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00111");
        java.util.regex.Pattern pattern2 = java.util.regex.Pattern.compile("hi!", (int) (short) 10);
        java.util.function.Predicate<java.lang.String> strPredicate3 = pattern2.asPredicate();
        java.lang.String str4 = pattern2.toString();
        org.junit.Assert.assertNotNull(pattern2);
        org.junit.Assert.assertEquals(pattern2.toString(), "hi!");
        org.junit.Assert.assertNotNull(strPredicate3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test00112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00112");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        java.util.Map<java.lang.String, java.lang.String> strMap4 = response1.cookies();
        org.jsoup.Connection.Response response6 = response1.removeCookie("hi!");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry8 = response1.scanHeaders("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response1);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Too many redirects occurred trying to load URL null");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNull(strEntry8);
    }

    @Test
    public void test00113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00113");
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
    public void test00114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00114");
        org.jsoup.helper.HttpConnection.Response.MAX_REDIRECTS = 32;
    }

    @Test
    public void test00115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00115");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer5 = byteBuffer1.putInt(0);
        java.nio.ByteBuffer byteBuffer7 = byteBuffer5.putInt((int) '#');
        int int8 = byteBuffer5.position();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer11 = byteBuffer5.putFloat((int) (byte) -1, 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertNotNull(byteBuffer7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 16 + "'", int8 == 16);
    }

    @Test
    public void test00116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00116");
        org.jsoup.helper.HttpConnection.Response.LOCATION = "java.nio.DirectByteBuffer[pos=10 lim=100 cap=100]";
    }

    @Test
    public void test00117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00117");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        response2.statusMessage = "";
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray5 = response2.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00118");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        java.util.Map<java.lang.String, java.lang.String> strMap4 = response1.cookies();
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response1);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document6 = response1.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(strMap4);
    }

    @Test
    public void test00119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00119");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str4 = response2.getHeaderCaseInsensitive("");
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response2);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response6 = org.jsoup.helper.HttpConnection.Response.execute(request0, response5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test00120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00120");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer5 = byteBuffer1.putInt(0);
        java.nio.ByteBuffer byteBuffer7 = byteBuffer5.putDouble((double) 12);
        java.nio.ByteBuffer byteBuffer9 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        long long10 = byteBuffer9.getLong();
        int int11 = byteBuffer9.position();
        float float13 = byteBuffer9.getFloat((int) (short) 10);
        boolean boolean14 = byteBuffer9.hasArray();
        double double15 = byteBuffer9.getDouble();
        short short17 = byteBuffer9.getShort(0);
        java.nio.ByteBuffer byteBuffer19 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer21 = byteBuffer19.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer23 = byteBuffer19.putInt(0);
        byte[] byteArray26 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer27 = byteBuffer23.put(byteArray26);
        boolean boolean28 = byteBuffer23.hasArray();
        java.nio.ByteBuffer byteBuffer30 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer32 = byteBuffer30.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer34 = byteBuffer30.putInt(0);
        byte[] byteArray37 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer38 = byteBuffer34.put(byteArray37);
        java.nio.ByteBuffer byteBuffer40 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer42 = byteBuffer40.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer44 = byteBuffer40.putInt(0);
        byte[] byteArray47 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer48 = byteBuffer44.put(byteArray47);
        java.nio.ByteBuffer byteBuffer51 = byteBuffer34.get(byteArray47, 2, (int) (byte) 0);
        java.nio.ByteBuffer byteBuffer53 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer55 = byteBuffer53.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer57 = byteBuffer53.putInt(0);
        byte[] byteArray60 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer61 = byteBuffer57.put(byteArray60);
        java.nio.ByteBuffer byteBuffer63 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer65 = byteBuffer63.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer67 = byteBuffer63.putInt(0);
        byte[] byteArray70 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer71 = byteBuffer67.put(byteArray70);
        java.nio.ByteBuffer byteBuffer74 = byteBuffer57.get(byteArray70, 2, (int) (byte) 0);
        java.nio.ByteBuffer byteBuffer75 = byteBuffer51.put(byteArray70);
        java.nio.ByteBuffer byteBuffer76 = byteBuffer23.put(byteArray70);
        java.nio.ByteBuffer byteBuffer77 = byteBuffer9.get(byteArray70);
        java.nio.ByteBuffer byteBuffer78 = byteBuffer5.put(byteArray70);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer81 = byteBuffer78.putLong((-24), (long) 256);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertNotNull(byteBuffer7);
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 8 + "'", int11 == 8);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 0.0f + "'", float13 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + short17 + "' != '" + (short) 0 + "'", short17 == (short) 0);
        org.junit.Assert.assertNotNull(byteBuffer19);
        org.junit.Assert.assertNotNull(byteBuffer21);
        org.junit.Assert.assertNotNull(byteBuffer23);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(byteBuffer30);
        org.junit.Assert.assertNotNull(byteBuffer32);
        org.junit.Assert.assertNotNull(byteBuffer34);
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray37), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer38);
        org.junit.Assert.assertNotNull(byteBuffer40);
        org.junit.Assert.assertNotNull(byteBuffer42);
        org.junit.Assert.assertNotNull(byteBuffer44);
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray47), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer48);
        org.junit.Assert.assertNotNull(byteBuffer51);
        org.junit.Assert.assertNotNull(byteBuffer53);
        org.junit.Assert.assertNotNull(byteBuffer55);
        org.junit.Assert.assertNotNull(byteBuffer57);
        org.junit.Assert.assertNotNull(byteArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray60), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer61);
        org.junit.Assert.assertNotNull(byteBuffer63);
        org.junit.Assert.assertNotNull(byteBuffer65);
        org.junit.Assert.assertNotNull(byteBuffer67);
        org.junit.Assert.assertNotNull(byteArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray70), "[0, 0]");
        org.junit.Assert.assertNotNull(byteBuffer71);
        org.junit.Assert.assertNotNull(byteBuffer74);
        org.junit.Assert.assertNotNull(byteBuffer75);
        org.junit.Assert.assertNotNull(byteBuffer76);
        org.junit.Assert.assertNotNull(byteBuffer77);
        org.junit.Assert.assertNotNull(byteBuffer78);
    }

    @Test
    public void test00121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00121");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer5 = byteBuffer1.putInt(0);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer8 = byteBuffer1.putChar(128, '\000');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer5);
    }

    @Test
    public void test00122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00122");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer5 = byteBuffer1.putInt(0);
        byte[] byteArray8 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer9 = byteBuffer5.put(byteArray8);
        java.nio.FloatBuffer floatBuffer10 = byteBuffer5.asFloatBuffer();
        boolean boolean11 = byteBuffer5.isDirect();
        byte[] byteArray17 = new byte[] { (byte) 1, (byte) 1, (byte) 0, (byte) 1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer20 = byteBuffer5.get(byteArray17, 4, 14);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertNotNull(floatBuffer10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[1, 1, 0, 1, 1]");
    }

    @Test
    public void test00123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00123");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate((int) '4');
        java.nio.ByteBuffer byteBuffer4 = byteBuffer1.putShort(0, (short) -1);
        int int5 = byteBuffer1.getInt();
        byte[] byteArray6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer9 = byteBuffer1.put(byteArray6, (int) (byte) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-65536) + "'", int5 == (-65536));
    }

    @Test
    public void test00124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00124");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer5 = byteBuffer1.putInt(0);
        java.nio.ByteBuffer byteBuffer8 = byteBuffer5.putDouble((int) (byte) 1, (double) 1L);
        java.nio.ByteBuffer byteBuffer10 = byteBuffer5.putChar('a');
        java.nio.ByteBuffer byteBuffer11 = byteBuffer10.asReadOnlyBuffer();
        java.nio.IntBuffer intBuffer12 = byteBuffer11.asIntBuffer();
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertNotNull(byteBuffer8);
        org.junit.Assert.assertNotNull(byteBuffer10);
        org.junit.Assert.assertNotNull(byteBuffer11);
        org.junit.Assert.assertNotNull(intBuffer12);
    }

    @Test
    public void test00125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00125");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        java.net.URL uRL4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response5 = response1.url(uRL4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test00126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00126");
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
    public void test00127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00127");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer5 = byteBuffer1.putInt(0);
        java.nio.ByteBuffer byteBuffer8 = byteBuffer5.putDouble((int) (byte) 1, (double) 1L);
        java.nio.ByteBuffer byteBuffer10 = byteBuffer5.putChar(' ');
        java.nio.ByteBuffer byteBuffer13 = byteBuffer10.putFloat(10, (float) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer16 = byteBuffer13.putInt((-65536), (int) '\000');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertNotNull(byteBuffer8);
        org.junit.Assert.assertNotNull(byteBuffer10);
        org.junit.Assert.assertNotNull(byteBuffer13);
    }

    @Test
    public void test00128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00128");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.putLong((long) '4');
        short short5 = byteBuffer1.getShort(0);
        java.nio.ByteBuffer byteBuffer8 = byteBuffer1.putChar(1, '4');
        java.nio.ByteBuffer byteBuffer10 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer12 = byteBuffer10.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer14 = byteBuffer10.putInt(0);
        byte[] byteArray17 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer18 = byteBuffer14.put(byteArray17);
        java.nio.ByteBuffer byteBuffer20 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer22 = byteBuffer20.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer24 = byteBuffer20.putInt(0);
        byte[] byteArray27 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer28 = byteBuffer24.put(byteArray27);
        java.nio.ByteBuffer byteBuffer31 = byteBuffer14.get(byteArray27, 2, (int) (byte) 0);
        java.nio.ByteBuffer byteBuffer33 = byteBuffer14.putDouble(100.0d);
        int int34 = byteBuffer8.compareTo(byteBuffer14);
        java.nio.ByteBuffer byteBuffer36 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer38 = byteBuffer36.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer40 = byteBuffer36.putInt(0);
        byte[] byteArray43 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer44 = byteBuffer40.put(byteArray43);
        java.nio.ByteOrder byteOrder45 = byteBuffer44.order();
        java.nio.ByteBuffer byteBuffer46 = byteBuffer14.order(byteOrder45);
        java.nio.ByteBuffer byteBuffer47 = byteBuffer14.asReadOnlyBuffer();
        byte byte48 = byteBuffer47.get();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.Buffer buffer50 = byteBuffer47.limit((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 0 + "'", short5 == (short) 0);
        org.junit.Assert.assertNotNull(byteBuffer8);
        org.junit.Assert.assertNotNull(byteBuffer10);
        org.junit.Assert.assertNotNull(byteBuffer12);
        org.junit.Assert.assertNotNull(byteBuffer14);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer18);
        org.junit.Assert.assertNotNull(byteBuffer20);
        org.junit.Assert.assertNotNull(byteBuffer22);
        org.junit.Assert.assertNotNull(byteBuffer24);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer28);
        org.junit.Assert.assertNotNull(byteBuffer31);
        org.junit.Assert.assertNotNull(byteBuffer33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 14 + "'", int34 == 14);
        org.junit.Assert.assertNotNull(byteBuffer36);
        org.junit.Assert.assertNotNull(byteBuffer38);
        org.junit.Assert.assertNotNull(byteBuffer40);
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray43), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer44);
        org.junit.Assert.assertNotNull(byteOrder45);
        org.junit.Assert.assertNotNull(byteBuffer46);
        org.junit.Assert.assertNotNull(byteBuffer47);
        org.junit.Assert.assertTrue("'" + byte48 + "' != '" + (byte) 0 + "'", byte48 == (byte) 0);
    }

    @Test
    public void test00129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00129");
        javax.net.SocketFactory socketFactory0 = javax.net.ssl.SSLSocketFactory.getDefault();
        java.net.InetAddress inetAddress1 = null;
        java.net.InetAddress inetAddress3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.Socket socket5 = socketFactory0.createSocket(inetAddress1, 100, inetAddress3, 32);
            org.junit.Assert.fail("Expected exception of type java.net.BindException; message: Permission denied (Bind failed)");
        } catch (java.net.BindException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(socketFactory0);
    }

    @Test
    public void test00130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00130");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.contentType = "";
        java.lang.String str5 = response1.cookie("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response8 = response1.cookie("", "java.nio.DirectByteBuffer[pos=35 lim=100 cap=100]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test00131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00131");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.putLong((long) '4');
        short short5 = byteBuffer1.getShort(0);
        java.nio.ByteBuffer byteBuffer8 = byteBuffer1.putChar(1, '4');
        java.nio.ByteBuffer byteBuffer10 = byteBuffer1.putChar('4');
        java.nio.ByteBuffer byteBuffer12 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer14 = byteBuffer12.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer16 = byteBuffer12.putInt(0);
        byte[] byteArray19 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer20 = byteBuffer16.put(byteArray19);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer23 = byteBuffer10.put(byteArray19, 0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 0 + "'", short5 == (short) 0);
        org.junit.Assert.assertNotNull(byteBuffer8);
        org.junit.Assert.assertNotNull(byteBuffer10);
        org.junit.Assert.assertNotNull(byteBuffer12);
        org.junit.Assert.assertNotNull(byteBuffer14);
        org.junit.Assert.assertNotNull(byteBuffer16);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer20);
    }

    @Test
    public void test00132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00132");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str4 = response2.getHeaderCaseInsensitive("");
        java.util.Map<java.lang.String, java.lang.String> strMap5 = response2.cookies();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response2);
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response2);
        java.net.URL uRL8 = response2.url();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response9 = org.jsoup.helper.HttpConnection.Response.execute(request0, response2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNull(uRL8);
    }

    @Test
    public void test00133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00133");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.contentType = "";
        org.jsoup.Connection.Method method4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response5 = response1.method(method4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00134");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        long long2 = byteBuffer1.getLong();
        int int3 = byteBuffer1.position();
        float float5 = byteBuffer1.getFloat((int) (short) 10);
        boolean boolean6 = byteBuffer1.hasArray();
        double double7 = byteBuffer1.getDouble();
        short short9 = byteBuffer1.getShort(0);
        java.nio.ByteBuffer byteBuffer11 = byteBuffer1.putDouble(100.0d);
        long long13 = byteBuffer11.getLong((int) '#');
        java.nio.ByteBuffer byteBuffer15 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer17 = byteBuffer15.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer19 = byteBuffer15.putInt(0);
        java.nio.ByteBuffer byteBuffer21 = byteBuffer19.putInt((int) '#');
        float float23 = byteBuffer21.getFloat(4);
        java.nio.ByteBuffer byteBuffer25 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer27 = byteBuffer25.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer29 = byteBuffer25.putInt(0);
        byte[] byteArray32 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer33 = byteBuffer29.put(byteArray32);
        java.nio.ByteBuffer byteBuffer35 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer37 = byteBuffer35.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer39 = byteBuffer35.putInt(0);
        byte[] byteArray42 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer43 = byteBuffer39.put(byteArray42);
        java.nio.ByteBuffer byteBuffer46 = byteBuffer29.get(byteArray42, 2, (int) (byte) 0);
        java.nio.ByteBuffer byteBuffer48 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer50 = byteBuffer48.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer52 = byteBuffer48.putInt(0);
        byte[] byteArray55 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer56 = byteBuffer52.put(byteArray55);
        java.nio.ByteBuffer byteBuffer58 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer60 = byteBuffer58.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer62 = byteBuffer58.putInt(0);
        byte[] byteArray65 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer66 = byteBuffer62.put(byteArray65);
        java.nio.ByteBuffer byteBuffer69 = byteBuffer52.get(byteArray65, 2, (int) (byte) 0);
        java.nio.ByteBuffer byteBuffer70 = byteBuffer46.put(byteArray65);
        java.nio.ByteBuffer byteBuffer71 = byteBuffer21.put(byteArray65);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer74 = byteBuffer11.put(byteArray65, (int) (byte) 0, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 0 + "'", short9 == (short) 0);
        org.junit.Assert.assertNotNull(byteBuffer11);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(byteBuffer15);
        org.junit.Assert.assertNotNull(byteBuffer17);
        org.junit.Assert.assertNotNull(byteBuffer19);
        org.junit.Assert.assertNotNull(byteBuffer21);
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + 7.3E-44f + "'", float23 == 7.3E-44f);
        org.junit.Assert.assertNotNull(byteBuffer25);
        org.junit.Assert.assertNotNull(byteBuffer27);
        org.junit.Assert.assertNotNull(byteBuffer29);
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray32), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer33);
        org.junit.Assert.assertNotNull(byteBuffer35);
        org.junit.Assert.assertNotNull(byteBuffer37);
        org.junit.Assert.assertNotNull(byteBuffer39);
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray42), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer43);
        org.junit.Assert.assertNotNull(byteBuffer46);
        org.junit.Assert.assertNotNull(byteBuffer48);
        org.junit.Assert.assertNotNull(byteBuffer50);
        org.junit.Assert.assertNotNull(byteBuffer52);
        org.junit.Assert.assertNotNull(byteArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray55), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer56);
        org.junit.Assert.assertNotNull(byteBuffer58);
        org.junit.Assert.assertNotNull(byteBuffer60);
        org.junit.Assert.assertNotNull(byteBuffer62);
        org.junit.Assert.assertNotNull(byteArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray65), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer66);
        org.junit.Assert.assertNotNull(byteBuffer69);
        org.junit.Assert.assertNotNull(byteBuffer70);
        org.junit.Assert.assertNotNull(byteBuffer71);
    }

    @Test
    public void test00135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00135");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer5 = byteBuffer1.putInt(0);
        short short6 = byteBuffer5.getShort();
        java.nio.IntBuffer intBuffer7 = byteBuffer5.asIntBuffer();
        int int8 = byteBuffer5.capacity();
        java.nio.ByteBuffer byteBuffer10 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer12 = byteBuffer10.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer14 = byteBuffer10.putInt(0);
        java.nio.ByteBuffer byteBuffer17 = byteBuffer14.putDouble((int) (byte) 1, (double) 1L);
        java.nio.ByteBuffer byteBuffer19 = byteBuffer14.putChar('a');
        double double21 = byteBuffer19.getDouble(12);
        java.nio.ByteBuffer byteBuffer23 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer25 = byteBuffer23.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer27 = byteBuffer23.putInt(0);
        byte[] byteArray30 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer31 = byteBuffer27.put(byteArray30);
        java.nio.ByteBuffer byteBuffer33 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer35 = byteBuffer33.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer37 = byteBuffer33.putInt(0);
        byte[] byteArray40 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer41 = byteBuffer37.put(byteArray40);
        java.nio.ByteBuffer byteBuffer44 = byteBuffer27.get(byteArray40, 2, (int) (byte) 0);
        java.nio.ByteBuffer byteBuffer45 = byteBuffer19.put(byteArray40);
        java.nio.ByteBuffer byteBuffer46 = byteBuffer5.get(byteArray40);
        int int47 = byteBuffer46.getInt();
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 0 + "'", short6 == (short) 0);
        org.junit.Assert.assertNotNull(intBuffer7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertNotNull(byteBuffer10);
        org.junit.Assert.assertNotNull(byteBuffer12);
        org.junit.Assert.assertNotNull(byteBuffer14);
        org.junit.Assert.assertNotNull(byteBuffer17);
        org.junit.Assert.assertNotNull(byteBuffer19);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 7.565251118924485E-307d + "'", double21 == 7.565251118924485E-307d);
        org.junit.Assert.assertNotNull(byteBuffer23);
        org.junit.Assert.assertNotNull(byteBuffer25);
        org.junit.Assert.assertNotNull(byteBuffer27);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray30), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer31);
        org.junit.Assert.assertNotNull(byteBuffer33);
        org.junit.Assert.assertNotNull(byteBuffer35);
        org.junit.Assert.assertNotNull(byteBuffer37);
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray40), "[0, 0]");
        org.junit.Assert.assertNotNull(byteBuffer41);
        org.junit.Assert.assertNotNull(byteBuffer44);
        org.junit.Assert.assertNotNull(byteBuffer45);
        org.junit.Assert.assertNotNull(byteBuffer46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
    }

    @Test
    public void test00136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00136");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.contentType = "";
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str6 = response4.getHeaderCaseInsensitive("hi!");
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response4);
        response7.executed = true;
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray10 = response7.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test00137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00137");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate((int) '4');
        java.nio.ShortBuffer shortBuffer2 = byteBuffer1.asShortBuffer();
        java.nio.ByteBuffer byteBuffer4 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        long long5 = byteBuffer4.getLong();
        int int6 = byteBuffer4.position();
        float float8 = byteBuffer4.getFloat((int) (short) 10);
        boolean boolean9 = byteBuffer4.hasArray();
        double double10 = byteBuffer4.getDouble();
        short short12 = byteBuffer4.getShort(0);
        java.nio.ByteBuffer byteBuffer14 = byteBuffer4.putDouble(100.0d);
        byte byte16 = byteBuffer14.get((int) (short) 0);
        java.nio.IntBuffer intBuffer17 = byteBuffer14.asIntBuffer();
        int int18 = byteBuffer1.compareTo(byteBuffer14);
        java.nio.FloatBuffer floatBuffer19 = byteBuffer14.asFloatBuffer();
        java.nio.ByteBuffer byteBuffer21 = byteBuffer14.put((byte) -1);
        java.nio.ByteBuffer byteBuffer24 = byteBuffer21.putShort(2, (short) (byte) 0);
        java.lang.Class<?> wildcardClass25 = byteBuffer24.getClass();
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(shortBuffer2);
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 0 + "'", short12 == (short) 0);
        org.junit.Assert.assertNotNull(byteBuffer14);
        org.junit.Assert.assertTrue("'" + byte16 + "' != '" + (byte) 0 + "'", byte16 == (byte) 0);
        org.junit.Assert.assertNotNull(intBuffer17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-24) + "'", int18 == (-24));
        org.junit.Assert.assertNotNull(floatBuffer19);
        org.junit.Assert.assertNotNull(byteBuffer21);
        org.junit.Assert.assertNotNull(byteBuffer24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test00138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00138");
        javax.net.SocketFactory socketFactory0 = javax.net.ssl.SSLSocketFactory.getDefault();
        java.net.Socket socket1 = socketFactory0.createSocket();
        java.net.Socket socket2 = socketFactory0.createSocket();
        java.net.InetAddress inetAddress5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.Socket socket7 = socketFactory0.createSocket("", (int) '#', inetAddress5, (-24));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: port out of range:-24");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(socketFactory0);
        org.junit.Assert.assertNotNull(socket1);
        org.junit.Assert.assertEquals(socket1.toString(), "Socket[unconnected]");
        org.junit.Assert.assertNotNull(socket2);
        org.junit.Assert.assertEquals(socket2.toString(), "Socket[unconnected]");
    }

    @Test
    public void test00139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00139");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer3 = java.nio.ByteBuffer.wrap(byteArray0, (int) (byte) 0, (-24));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00140");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        long long2 = byteBuffer1.getLong();
        java.nio.ByteBuffer byteBuffer4 = byteBuffer1.putLong((long) 4);
        // The following exception was thrown during execution in test generation
        try {
            int int5 = byteBuffer1.arrayOffset();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(byteBuffer4);
    }

    @Test
    public void test00141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00141");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = response2.cookie("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00142");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        response2.contentType = "";
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response2);
        int int6 = response2.numRedirects;
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response2);
        response7.statusCode = 4;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response10 = org.jsoup.helper.HttpConnection.Response.execute(request0, response7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test00143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00143");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.putLong((long) '4');
        int int5 = byteBuffer3.getInt((int) (short) 1);
        java.nio.ByteBuffer byteBuffer8 = byteBuffer3.putChar((int) ' ', '#');
        java.lang.String str9 = byteBuffer8.toString();
        java.nio.ByteBuffer byteBuffer11 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer13 = byteBuffer11.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer15 = byteBuffer11.putInt(0);
        byte[] byteArray18 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer19 = byteBuffer15.put(byteArray18);
        java.nio.ByteOrder byteOrder20 = byteBuffer19.order();
        java.nio.ByteBuffer byteBuffer21 = byteBuffer8.order(byteOrder20);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer24 = byteBuffer8.putLong((int) (byte) -1, (long) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(byteBuffer8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "java.nio.DirectByteBuffer[pos=8 lim=100 cap=100]" + "'", str9, "java.nio.DirectByteBuffer[pos=8 lim=100 cap=100]");
        org.junit.Assert.assertNotNull(byteBuffer11);
        org.junit.Assert.assertNotNull(byteBuffer13);
        org.junit.Assert.assertNotNull(byteBuffer15);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer19);
        org.junit.Assert.assertNotNull(byteOrder20);
        org.junit.Assert.assertNotNull(byteBuffer21);
    }

    @Test
    public void test00144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00144");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer5 = byteBuffer1.putInt(0);
        byte[] byteArray8 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer9 = byteBuffer5.put(byteArray8);
        java.nio.ByteBuffer byteBuffer11 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer13 = byteBuffer11.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer15 = byteBuffer11.putInt(0);
        byte[] byteArray18 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer19 = byteBuffer15.put(byteArray18);
        java.nio.ByteBuffer byteBuffer22 = byteBuffer5.get(byteArray18, 2, (int) (byte) 0);
        java.nio.ByteBuffer byteBuffer24 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer26 = byteBuffer24.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer28 = byteBuffer24.putInt(0);
        byte[] byteArray31 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer32 = byteBuffer28.put(byteArray31);
        java.nio.ByteBuffer byteBuffer34 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer36 = byteBuffer34.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer38 = byteBuffer34.putInt(0);
        byte[] byteArray41 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer42 = byteBuffer38.put(byteArray41);
        java.nio.ByteBuffer byteBuffer45 = byteBuffer28.get(byteArray41, 2, (int) (byte) 0);
        java.nio.ByteBuffer byteBuffer46 = byteBuffer22.put(byteArray41);
        java.lang.Class<?> wildcardClass47 = byteBuffer46.getClass();
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertNotNull(byteBuffer11);
        org.junit.Assert.assertNotNull(byteBuffer13);
        org.junit.Assert.assertNotNull(byteBuffer15);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer19);
        org.junit.Assert.assertNotNull(byteBuffer22);
        org.junit.Assert.assertNotNull(byteBuffer24);
        org.junit.Assert.assertNotNull(byteBuffer26);
        org.junit.Assert.assertNotNull(byteBuffer28);
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray31), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer32);
        org.junit.Assert.assertNotNull(byteBuffer34);
        org.junit.Assert.assertNotNull(byteBuffer36);
        org.junit.Assert.assertNotNull(byteBuffer38);
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray41), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer42);
        org.junit.Assert.assertNotNull(byteBuffer45);
        org.junit.Assert.assertNotNull(byteBuffer46);
        org.junit.Assert.assertNotNull(wildcardClass47);
    }

    @Test
    public void test00145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00145");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.putLong((long) '4');
        int int5 = byteBuffer3.getInt((int) (short) 1);
        java.nio.ByteBuffer byteBuffer7 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer9 = byteBuffer7.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer11 = byteBuffer7.putInt(0);
        byte[] byteArray14 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer15 = byteBuffer11.put(byteArray14);
        java.nio.ByteBuffer byteBuffer17 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer19 = byteBuffer17.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer21 = byteBuffer17.putInt(0);
        byte[] byteArray24 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer25 = byteBuffer21.put(byteArray24);
        java.nio.ByteBuffer byteBuffer28 = byteBuffer11.get(byteArray24, 2, (int) (byte) 0);
        java.nio.ByteBuffer byteBuffer29 = byteBuffer3.get(byteArray24);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer32 = java.nio.ByteBuffer.wrap(byteArray24, (int) (byte) 10, (int) '\000');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(byteBuffer7);
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertNotNull(byteBuffer11);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer15);
        org.junit.Assert.assertNotNull(byteBuffer17);
        org.junit.Assert.assertNotNull(byteBuffer19);
        org.junit.Assert.assertNotNull(byteBuffer21);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[0, 0]");
        org.junit.Assert.assertNotNull(byteBuffer25);
        org.junit.Assert.assertNotNull(byteBuffer28);
        org.junit.Assert.assertNotNull(byteBuffer29);
    }

    @Test
    public void test00146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00146");
        javax.net.SocketFactory socketFactory0 = javax.net.ssl.SSLSocketFactory.getDefault();
        java.net.Socket socket1 = socketFactory0.createSocket();
        // The following exception was thrown during execution in test generation
        try {
            java.net.Socket socket4 = socketFactory0.createSocket("Location", 128);
            org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: Location");
        } catch (java.net.UnknownHostException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(socketFactory0);
        org.junit.Assert.assertNotNull(socket1);
        org.junit.Assert.assertEquals(socket1.toString(), "Socket[unconnected]");
    }

    @Test
    public void test00147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00147");
        javax.net.SocketFactory socketFactory0 = javax.net.ssl.SSLSocketFactory.getDefault();
        java.net.Socket socket1 = socketFactory0.createSocket();
        java.net.Socket socket2 = socketFactory0.createSocket();
        java.net.InetAddress inetAddress3 = null;
        java.net.InetAddress inetAddress5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.Socket socket7 = socketFactory0.createSocket(inetAddress3, 1, inetAddress5, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.net.BindException; message: Permission denied (Bind failed)");
        } catch (java.net.BindException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(socketFactory0);
        org.junit.Assert.assertNotNull(socket1);
        org.junit.Assert.assertEquals(socket1.toString(), "Socket[unconnected]");
        org.junit.Assert.assertNotNull(socket2);
        org.junit.Assert.assertEquals(socket2.toString(), "Socket[unconnected]");
    }

    @Test
    public void test00148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00148");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer5 = byteBuffer1.putInt(0);
        short short6 = byteBuffer5.getShort();
        int int7 = byteBuffer5.capacity();
        java.nio.ByteBuffer byteBuffer9 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer11 = byteBuffer9.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer13 = byteBuffer9.putInt(0);
        byte[] byteArray16 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer17 = byteBuffer13.put(byteArray16);
        java.nio.ByteBuffer byteBuffer19 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer21 = byteBuffer19.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer23 = byteBuffer19.putInt(0);
        byte[] byteArray26 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer27 = byteBuffer23.put(byteArray26);
        java.nio.ByteBuffer byteBuffer30 = byteBuffer13.get(byteArray26, 2, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer33 = byteBuffer5.put(byteArray26, (-10), (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 0 + "'", short6 == (short) 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertNotNull(byteBuffer11);
        org.junit.Assert.assertNotNull(byteBuffer13);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer17);
        org.junit.Assert.assertNotNull(byteBuffer19);
        org.junit.Assert.assertNotNull(byteBuffer21);
        org.junit.Assert.assertNotNull(byteBuffer23);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer27);
        org.junit.Assert.assertNotNull(byteBuffer30);
    }

    @Test
    public void test00149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00149");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.contentType = "";
        java.lang.String str4 = response1.contentType;
        response1.executed = true;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry8 = response1.scanHeaders("");
        java.lang.String str10 = response1.getHeaderCaseInsensitive("Location");
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response1);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document12 = response1.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(strEntry8);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test00150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00150");
        javax.net.SocketFactory socketFactory0 = javax.net.ssl.SSLSocketFactory.getDefault();
        java.net.InetAddress inetAddress1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.Socket socket3 = socketFactory0.createSocket(inetAddress1, (-10));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: port out of range:-10");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(socketFactory0);
    }

    @Test
    public void test00151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00151");
        java.lang.String str1 = java.util.regex.Pattern.quote("Location");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\QLocation\\E" + "'", str1, "\\QLocation\\E");
    }

    @Test
    public void test00152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00152");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer5 = byteBuffer1.putInt(0);
        java.nio.ByteBuffer byteBuffer8 = byteBuffer5.putDouble((int) (byte) 1, (double) 1L);
        java.nio.ByteBuffer byteBuffer10 = byteBuffer5.putChar(' ');
        java.nio.ByteBuffer byteBuffer13 = byteBuffer10.putFloat(10, (float) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray14 = byteBuffer13.array();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertNotNull(byteBuffer8);
        org.junit.Assert.assertNotNull(byteBuffer10);
        org.junit.Assert.assertNotNull(byteBuffer13);
    }

    @Test
    public void test00153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00153");
        org.jsoup.helper.HttpConnection.Response.MAX_REDIRECTS = (byte) 10;
    }

    @Test
    public void test00154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00154");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str4 = response2.getHeaderCaseInsensitive("");
        java.util.Map<java.lang.String, java.lang.String> strMap5 = response2.cookies();
        org.jsoup.Connection.Response response7 = response2.removeCookie("hi!");
        java.lang.String str8 = response2.statusMessage();
        java.nio.ByteBuffer byteBuffer10 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer12 = byteBuffer10.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer14 = byteBuffer10.putInt(0);
        byte[] byteArray17 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer18 = byteBuffer14.put(byteArray17);
        boolean boolean19 = byteBuffer14.hasArray();
        response2.byteData = byteBuffer14;
        org.jsoup.helper.HttpConnection.Response response21 = new org.jsoup.helper.HttpConnection.Response(response2);
        boolean boolean22 = response21.executed;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response23 = org.jsoup.helper.HttpConnection.Response.execute(request0, response21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(byteBuffer10);
        org.junit.Assert.assertNotNull(byteBuffer12);
        org.junit.Assert.assertNotNull(byteBuffer14);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test00155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00155");
        org.jsoup.helper.HttpConnection.Response.MAX_REDIRECTS = (byte) 66;
    }

    @Test
    public void test00156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00156");
        javax.net.SocketFactory socketFactory0 = javax.net.ssl.SSLSocketFactory.getDefault();
        java.net.Socket socket1 = socketFactory0.createSocket();
        java.net.Socket socket2 = socketFactory0.createSocket();
        java.net.InetAddress inetAddress5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.Socket socket7 = socketFactory0.createSocket("", (-65536), inetAddress5, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.net.BindException; message: Permission denied (Bind failed)");
        } catch (java.net.BindException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(socketFactory0);
        org.junit.Assert.assertNotNull(socket1);
        org.junit.Assert.assertEquals(socket1.toString(), "Socket[unconnected]");
        org.junit.Assert.assertNotNull(socket2);
        org.junit.Assert.assertEquals(socket2.toString(), "Socket[unconnected]");
    }

    @Test
    public void test00157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00157");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer5 = byteBuffer1.putInt(0);
        short short6 = byteBuffer5.getShort();
        java.nio.IntBuffer intBuffer7 = byteBuffer5.asIntBuffer();
        int int8 = byteBuffer5.capacity();
        java.nio.ByteBuffer byteBuffer10 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer12 = byteBuffer10.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer14 = byteBuffer10.putInt(0);
        java.nio.ByteBuffer byteBuffer17 = byteBuffer14.putDouble((int) (byte) 1, (double) 1L);
        java.nio.ByteBuffer byteBuffer19 = byteBuffer14.putChar('a');
        double double21 = byteBuffer19.getDouble(12);
        java.nio.ByteBuffer byteBuffer23 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer25 = byteBuffer23.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer27 = byteBuffer23.putInt(0);
        byte[] byteArray30 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer31 = byteBuffer27.put(byteArray30);
        java.nio.ByteBuffer byteBuffer33 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer35 = byteBuffer33.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer37 = byteBuffer33.putInt(0);
        byte[] byteArray40 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer41 = byteBuffer37.put(byteArray40);
        java.nio.ByteBuffer byteBuffer44 = byteBuffer27.get(byteArray40, 2, (int) (byte) 0);
        java.nio.ByteBuffer byteBuffer45 = byteBuffer19.put(byteArray40);
        java.nio.ByteBuffer byteBuffer46 = byteBuffer5.get(byteArray40);
        java.nio.ByteBuffer byteBuffer47 = java.nio.ByteBuffer.wrap(byteArray40);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer50 = java.nio.ByteBuffer.wrap(byteArray40, 0, 14);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 0 + "'", short6 == (short) 0);
        org.junit.Assert.assertNotNull(intBuffer7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertNotNull(byteBuffer10);
        org.junit.Assert.assertNotNull(byteBuffer12);
        org.junit.Assert.assertNotNull(byteBuffer14);
        org.junit.Assert.assertNotNull(byteBuffer17);
        org.junit.Assert.assertNotNull(byteBuffer19);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 7.565251118924485E-307d + "'", double21 == 7.565251118924485E-307d);
        org.junit.Assert.assertNotNull(byteBuffer23);
        org.junit.Assert.assertNotNull(byteBuffer25);
        org.junit.Assert.assertNotNull(byteBuffer27);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray30), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer31);
        org.junit.Assert.assertNotNull(byteBuffer33);
        org.junit.Assert.assertNotNull(byteBuffer35);
        org.junit.Assert.assertNotNull(byteBuffer37);
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray40), "[0, 0]");
        org.junit.Assert.assertNotNull(byteBuffer41);
        org.junit.Assert.assertNotNull(byteBuffer44);
        org.junit.Assert.assertNotNull(byteBuffer45);
        org.junit.Assert.assertNotNull(byteBuffer46);
        org.junit.Assert.assertNotNull(byteBuffer47);
    }

    @Test
    public void test00158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00158");
        javax.net.SocketFactory socketFactory0 = javax.net.ssl.SSLSocketFactory.getDefault();
        java.net.InetAddress inetAddress3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.Socket socket5 = socketFactory0.createSocket("Location", 16, inetAddress3, (-65536));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: port out of range:-65536");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(socketFactory0);
    }

    @Test
    public void test00159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00159");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer5 = byteBuffer1.putInt(0);
        byte[] byteArray8 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer9 = byteBuffer5.put(byteArray8);
        java.nio.ByteBuffer byteBuffer11 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer13 = byteBuffer11.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer15 = byteBuffer11.putInt(0);
        byte[] byteArray18 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer19 = byteBuffer15.put(byteArray18);
        java.nio.ByteBuffer byteBuffer22 = byteBuffer5.get(byteArray18, 2, (int) (byte) 0);
        java.nio.IntBuffer intBuffer23 = byteBuffer22.asIntBuffer();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.Buffer buffer24 = byteBuffer22.reset();
            org.junit.Assert.fail("Expected exception of type java.nio.InvalidMarkException; message: null");
        } catch (java.nio.InvalidMarkException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertNotNull(byteBuffer11);
        org.junit.Assert.assertNotNull(byteBuffer13);
        org.junit.Assert.assertNotNull(byteBuffer15);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer19);
        org.junit.Assert.assertNotNull(byteBuffer22);
        org.junit.Assert.assertNotNull(intBuffer23);
    }

    @Test
    public void test00160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00160");
        javax.net.SocketFactory socketFactory0 = javax.net.ssl.SSLSocketFactory.getDefault();
        java.net.InetAddress inetAddress1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.Socket socket3 = socketFactory0.createSocket(inetAddress1, 75);
            org.junit.Assert.fail("Expected exception of type java.net.ConnectException; message: Connection refused (Connection refused)");
        } catch (java.net.ConnectException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(socketFactory0);
    }

    @Test
    public void test00161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00161");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.putLong((long) '4');
        short short5 = byteBuffer1.getShort(0);
        java.nio.ByteBuffer byteBuffer8 = byteBuffer1.putChar(1, '4');
        java.nio.ByteBuffer byteBuffer10 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer12 = byteBuffer10.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer14 = byteBuffer10.putInt(0);
        byte[] byteArray17 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer18 = byteBuffer14.put(byteArray17);
        java.nio.ByteBuffer byteBuffer20 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer22 = byteBuffer20.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer24 = byteBuffer20.putInt(0);
        byte[] byteArray27 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer28 = byteBuffer24.put(byteArray27);
        java.nio.ByteBuffer byteBuffer31 = byteBuffer14.get(byteArray27, 2, (int) (byte) 0);
        java.nio.ByteBuffer byteBuffer33 = byteBuffer14.putDouble(100.0d);
        int int34 = byteBuffer8.compareTo(byteBuffer14);
        java.nio.ByteBuffer byteBuffer36 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer38 = byteBuffer36.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer40 = byteBuffer36.putInt(0);
        short short41 = byteBuffer40.getShort();
        java.nio.IntBuffer intBuffer42 = byteBuffer40.asIntBuffer();
        int int43 = byteBuffer40.capacity();
        java.nio.ByteBuffer byteBuffer45 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer47 = byteBuffer45.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer49 = byteBuffer45.putInt(0);
        java.nio.ByteBuffer byteBuffer52 = byteBuffer49.putDouble((int) (byte) 1, (double) 1L);
        java.nio.ByteBuffer byteBuffer54 = byteBuffer49.putChar('a');
        double double56 = byteBuffer54.getDouble(12);
        java.nio.ByteBuffer byteBuffer58 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer60 = byteBuffer58.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer62 = byteBuffer58.putInt(0);
        byte[] byteArray65 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer66 = byteBuffer62.put(byteArray65);
        java.nio.ByteBuffer byteBuffer68 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer70 = byteBuffer68.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer72 = byteBuffer68.putInt(0);
        byte[] byteArray75 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer76 = byteBuffer72.put(byteArray75);
        java.nio.ByteBuffer byteBuffer79 = byteBuffer62.get(byteArray75, 2, (int) (byte) 0);
        java.nio.ByteBuffer byteBuffer80 = byteBuffer54.put(byteArray75);
        java.nio.ByteBuffer byteBuffer81 = byteBuffer40.get(byteArray75);
        java.nio.ByteBuffer byteBuffer82 = java.nio.ByteBuffer.wrap(byteArray75);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer85 = byteBuffer14.get(byteArray75, (int) (byte) 100, 85);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 0 + "'", short5 == (short) 0);
        org.junit.Assert.assertNotNull(byteBuffer8);
        org.junit.Assert.assertNotNull(byteBuffer10);
        org.junit.Assert.assertNotNull(byteBuffer12);
        org.junit.Assert.assertNotNull(byteBuffer14);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer18);
        org.junit.Assert.assertNotNull(byteBuffer20);
        org.junit.Assert.assertNotNull(byteBuffer22);
        org.junit.Assert.assertNotNull(byteBuffer24);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer28);
        org.junit.Assert.assertNotNull(byteBuffer31);
        org.junit.Assert.assertNotNull(byteBuffer33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 14 + "'", int34 == 14);
        org.junit.Assert.assertNotNull(byteBuffer36);
        org.junit.Assert.assertNotNull(byteBuffer38);
        org.junit.Assert.assertNotNull(byteBuffer40);
        org.junit.Assert.assertTrue("'" + short41 + "' != '" + (short) 0 + "'", short41 == (short) 0);
        org.junit.Assert.assertNotNull(intBuffer42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 100 + "'", int43 == 100);
        org.junit.Assert.assertNotNull(byteBuffer45);
        org.junit.Assert.assertNotNull(byteBuffer47);
        org.junit.Assert.assertNotNull(byteBuffer49);
        org.junit.Assert.assertNotNull(byteBuffer52);
        org.junit.Assert.assertNotNull(byteBuffer54);
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 7.565251118924485E-307d + "'", double56 == 7.565251118924485E-307d);
        org.junit.Assert.assertNotNull(byteBuffer58);
        org.junit.Assert.assertNotNull(byteBuffer60);
        org.junit.Assert.assertNotNull(byteBuffer62);
        org.junit.Assert.assertNotNull(byteArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray65), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer66);
        org.junit.Assert.assertNotNull(byteBuffer68);
        org.junit.Assert.assertNotNull(byteBuffer70);
        org.junit.Assert.assertNotNull(byteBuffer72);
        org.junit.Assert.assertNotNull(byteArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray75), "[0, 0]");
        org.junit.Assert.assertNotNull(byteBuffer76);
        org.junit.Assert.assertNotNull(byteBuffer79);
        org.junit.Assert.assertNotNull(byteBuffer80);
        org.junit.Assert.assertNotNull(byteBuffer81);
        org.junit.Assert.assertNotNull(byteBuffer82);
    }

    @Test
    public void test00162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00162");
        javax.net.SocketFactory socketFactory0 = javax.net.ssl.SSLSocketFactory.getDefault();
        java.net.Socket socket1 = socketFactory0.createSocket();
        java.net.Socket socket2 = socketFactory0.createSocket();
        java.net.InetAddress inetAddress5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.Socket socket7 = socketFactory0.createSocket("\\Q\\E", (-24), inetAddress5, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.net.BindException; message: Permission denied (Bind failed)");
        } catch (java.net.BindException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(socketFactory0);
        org.junit.Assert.assertNotNull(socket1);
        org.junit.Assert.assertEquals(socket1.toString(), "Socket[unconnected]");
        org.junit.Assert.assertNotNull(socket2);
        org.junit.Assert.assertEquals(socket2.toString(), "Socket[unconnected]");
    }

    @Test
    public void test00163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00163");
        org.jsoup.helper.HttpConnection.Response.LOCATION = "";
    }

    @Test
    public void test00164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00164");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.contentType = "";
        java.lang.String str5 = response1.cookie("hi!");
        int int6 = response1.statusCode();
        org.jsoup.Connection.Request request7 = response1.req;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document8 = response1.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(request7);
    }

    @Test
    public void test00165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00165");
        javax.net.SocketFactory socketFactory0 = javax.net.ssl.SSLSocketFactory.getDefault();
        java.net.InetAddress inetAddress1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.Socket socket3 = socketFactory0.createSocket(inetAddress1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.net.ConnectException; message: Connection refused (Connection refused)");
        } catch (java.net.ConnectException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(socketFactory0);
    }

    @Test
    public void test00166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00166");
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect((-24));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Negative capacity: -24");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00167");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer5 = byteBuffer1.putInt(0);
        byte[] byteArray8 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer9 = byteBuffer5.put(byteArray8);
        org.jsoup.helper.HttpConnection.Response response10 = null;
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response10);
        response11.contentType = "";
        boolean boolean14 = byteBuffer9.equals((java.lang.Object) "");
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer17 = byteBuffer9.putFloat((-65536), (float) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test00168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00168");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        response2.contentType = "";
        java.lang.String str5 = response2.contentType;
        response2.executed = true;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry9 = response2.scanHeaders("");
        java.lang.String str11 = response2.getHeaderCaseInsensitive("Location");
        java.lang.String str12 = response2.charset();
        response2.statusCode = 64;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response15 = org.jsoup.helper.HttpConnection.Response.execute(request0, response2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(strEntry9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test00169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00169");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        long long2 = byteBuffer1.getLong();
        int int3 = byteBuffer1.position();
        float float5 = byteBuffer1.getFloat((int) (short) 10);
        boolean boolean6 = byteBuffer1.hasArray();
        java.nio.ByteBuffer byteBuffer8 = byteBuffer1.putFloat((float) (-24));
        java.nio.ByteBuffer byteBuffer10 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer12 = byteBuffer10.putLong((long) '4');
        int int14 = byteBuffer12.getInt((int) (short) 1);
        java.nio.ByteBuffer byteBuffer16 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer18 = byteBuffer16.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer20 = byteBuffer16.putInt(0);
        byte[] byteArray23 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer24 = byteBuffer20.put(byteArray23);
        java.nio.ByteBuffer byteBuffer26 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer28 = byteBuffer26.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer30 = byteBuffer26.putInt(0);
        byte[] byteArray33 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer34 = byteBuffer30.put(byteArray33);
        java.nio.ByteBuffer byteBuffer37 = byteBuffer20.get(byteArray33, 2, (int) (byte) 0);
        java.nio.ByteBuffer byteBuffer38 = byteBuffer12.get(byteArray33);
        java.nio.ByteBuffer byteBuffer40 = byteBuffer38.put((byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer41 = byteBuffer1.put(byteBuffer40);
            org.junit.Assert.fail("Expected exception of type java.nio.BufferOverflowException; message: null");
        } catch (java.nio.BufferOverflowException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(byteBuffer8);
        org.junit.Assert.assertNotNull(byteBuffer10);
        org.junit.Assert.assertNotNull(byteBuffer12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(byteBuffer16);
        org.junit.Assert.assertNotNull(byteBuffer18);
        org.junit.Assert.assertNotNull(byteBuffer20);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer24);
        org.junit.Assert.assertNotNull(byteBuffer26);
        org.junit.Assert.assertNotNull(byteBuffer28);
        org.junit.Assert.assertNotNull(byteBuffer30);
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray33), "[0, 0]");
        org.junit.Assert.assertNotNull(byteBuffer34);
        org.junit.Assert.assertNotNull(byteBuffer37);
        org.junit.Assert.assertNotNull(byteBuffer38);
        org.junit.Assert.assertNotNull(byteBuffer40);
    }

    @Test
    public void test00170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00170");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.contentType = "";
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response1);
        response1.executed = false;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = response1.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00171");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer5 = byteBuffer1.putInt(0);
        byte[] byteArray8 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer9 = byteBuffer5.put(byteArray8);
        java.nio.FloatBuffer floatBuffer10 = byteBuffer5.asFloatBuffer();
        boolean boolean11 = byteBuffer5.isDirect();
        java.nio.ByteBuffer byteBuffer13 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer15 = byteBuffer13.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer17 = byteBuffer13.putInt(0);
        byte[] byteArray20 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer21 = byteBuffer17.put(byteArray20);
        org.jsoup.helper.HttpConnection.Response response22 = null;
        org.jsoup.helper.HttpConnection.Response response23 = new org.jsoup.helper.HttpConnection.Response(response22);
        response23.contentType = "";
        boolean boolean26 = byteBuffer21.equals((java.lang.Object) "");
        java.nio.ByteBuffer byteBuffer28 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer30 = byteBuffer28.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer32 = byteBuffer28.putInt(0);
        java.nio.ByteBuffer byteBuffer34 = byteBuffer32.putInt((int) '#');
        int int35 = byteBuffer21.compareTo(byteBuffer32);
        java.nio.ByteBuffer byteBuffer36 = byteBuffer5.put(byteBuffer32);
        java.nio.ByteBuffer byteBuffer37 = byteBuffer5.duplicate();
        java.nio.ByteBuffer byteBuffer39 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer41 = byteBuffer39.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer43 = byteBuffer39.putInt(0);
        java.nio.ByteBuffer byteBuffer46 = byteBuffer43.putDouble((int) (byte) 1, (double) 1L);
        java.nio.ByteBuffer byteBuffer48 = byteBuffer43.putChar('a');
        double double50 = byteBuffer48.getDouble(12);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer51 = byteBuffer37.put(byteBuffer48);
            org.junit.Assert.fail("Expected exception of type java.nio.BufferOverflowException; message: null");
        } catch (java.nio.BufferOverflowException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertNotNull(floatBuffer10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(byteBuffer13);
        org.junit.Assert.assertNotNull(byteBuffer15);
        org.junit.Assert.assertNotNull(byteBuffer17);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer21);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(byteBuffer28);
        org.junit.Assert.assertNotNull(byteBuffer30);
        org.junit.Assert.assertNotNull(byteBuffer32);
        org.junit.Assert.assertNotNull(byteBuffer34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 2 + "'", int35 == 2);
        org.junit.Assert.assertNotNull(byteBuffer36);
        org.junit.Assert.assertNotNull(byteBuffer37);
        org.junit.Assert.assertNotNull(byteBuffer39);
        org.junit.Assert.assertNotNull(byteBuffer41);
        org.junit.Assert.assertNotNull(byteBuffer43);
        org.junit.Assert.assertNotNull(byteBuffer46);
        org.junit.Assert.assertNotNull(byteBuffer48);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 7.565251118924485E-307d + "'", double50 == 7.565251118924485E-307d);
    }

    @Test
    public void test00172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00172");
        boolean boolean2 = java.util.regex.Pattern.matches("java.nio.DirectByteBuffer[pos=22 lim=100 cap=100]", (java.lang.CharSequence) "\\Q\\E");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00173");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        java.util.Map<java.lang.String, java.lang.String> strMap4 = response1.cookies();
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response6);
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response6);
        response6.executed = true;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(strMap4);
    }

    @Test
    public void test00174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00174");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer5 = byteBuffer1.putInt(0);
        java.nio.Buffer buffer7 = byteBuffer1.limit(32);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer10 = byteBuffer1.putChar((int) '4', 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertNotNull(buffer7);
    }

    @Test
    public void test00175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00175");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.contentType = "";
        java.lang.String str4 = response1.contentType;
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Request request6 = null;
        response5.req = request6;
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray8 = response5.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test00176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00176");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate((int) (short) 0);
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
    public void test00177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00177");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate((int) '4');
        int int2 = byteBuffer1.arrayOffset();
        java.nio.LongBuffer longBuffer3 = byteBuffer1.asLongBuffer();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer6 = byteBuffer1.putChar((-1), '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(longBuffer3);
    }

    @Test
    public void test00178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00178");
        javax.net.SocketFactory socketFactory0 = javax.net.ssl.SSLSocketFactory.getDefault();
        // The following exception was thrown during execution in test generation
        try {
            java.net.Socket socket3 = socketFactory0.createSocket("", (int) '#');
            org.junit.Assert.fail("Expected exception of type java.net.ConnectException; message: Connection refused (Connection refused)");
        } catch (java.net.ConnectException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(socketFactory0);
    }

    @Test
    public void test00179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00179");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str4 = response2.getHeaderCaseInsensitive("");
        java.util.Map<java.lang.String, java.lang.String> strMap5 = response2.cookies();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response2);
        response2.statusMessage = "Location";
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response9 = org.jsoup.helper.HttpConnection.Response.execute(request0, response2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(strMap5);
    }

    @Test
    public void test00180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00180");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        response2.contentType = "";
        java.lang.String str5 = response2.contentType;
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response2);
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry8 = response6.scanHeaders("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response9 = org.jsoup.helper.HttpConnection.Response.execute(request0, response6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(strEntry8);
    }

    @Test
    public void test00181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00181");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.contentType = "";
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response4);
        org.jsoup.Connection.Method method6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response7 = response4.method(method6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00182");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        long long2 = byteBuffer1.getLong();
        int int3 = byteBuffer1.position();
        float float5 = byteBuffer1.getFloat((int) (short) 10);
        byte byte6 = byteBuffer1.get();
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 0 + "'", byte6 == (byte) 0);
    }

    @Test
    public void test00183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00183");
        java.lang.String str1 = java.util.regex.Pattern.quote("java.nio.DirectByteBuffer[pos=24 lim=100 cap=100]");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\Qjava.nio.DirectByteBuffer[pos=24 lim=100 cap=100]\\E" + "'", str1, "\\Qjava.nio.DirectByteBuffer[pos=24 lim=100 cap=100]\\E");
    }

    @Test
    public void test00184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00184");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.putLong((long) '4');
        short short5 = byteBuffer1.getShort(0);
        java.nio.ByteBuffer byteBuffer8 = byteBuffer1.putChar(1, '4');
        java.nio.ByteBuffer byteBuffer11 = byteBuffer8.put((int) (short) 10, (byte) 1);
        short short12 = byteBuffer8.getShort();
        double double13 = byteBuffer8.getDouble();
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 0 + "'", short5 == (short) 0);
        org.junit.Assert.assertNotNull(byteBuffer8);
        org.junit.Assert.assertNotNull(byteBuffer11);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 0 + "'", short12 == (short) 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 7.2911220195563975E-304d + "'", double13 == 7.2911220195563975E-304d);
    }

    @Test
    public void test00185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00185");
        javax.net.SocketFactory socketFactory0 = javax.net.ssl.SSLSocketFactory.getDefault();
        java.net.InetAddress inetAddress1 = null;
        java.net.InetAddress inetAddress3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.Socket socket5 = socketFactory0.createSocket(inetAddress1, (-1), inetAddress3, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.net.BindException; message: Permission denied (Bind failed)");
        } catch (java.net.BindException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(socketFactory0);
    }

    @Test
    public void test00186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00186");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        java.util.Map<java.lang.String, java.lang.String> strMap4 = response1.cookies();
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response6);
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response6);
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response8);
        org.jsoup.Connection.Method method10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response11 = response9.method(method10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(strMap4);
    }

    @Test
    public void test00187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00187");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.contentType = "";
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response1);
        int int5 = response1.numRedirects;
        int int6 = response1.statusCode();
        response1.executed = true;
        org.jsoup.Connection.Response response11 = response1.cookie("java.nio.DirectByteBuffer[pos=8 lim=100 cap=100]", "java.nio.DirectByteBuffer[pos=35 lim=100 cap=100]");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray12 = response1.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(response11);
    }

    @Test
    public void test00188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00188");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str4 = response2.getHeaderCaseInsensitive("");
        java.util.Map<java.lang.String, java.lang.String> strMap5 = response2.cookies();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response2);
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response2);
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response7);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response9 = org.jsoup.helper.HttpConnection.Response.execute(request0, response8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(strMap5);
    }

    @Test
    public void test00189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00189");
        javax.net.SocketFactory socketFactory0 = javax.net.ssl.SSLSocketFactory.getDefault();
        // The following exception was thrown during execution in test generation
        try {
            java.net.Socket socket3 = socketFactory0.createSocket("java.nio.DirectByteBuffer[pos=10 lim=100 cap=100]", 14);
            org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: java.nio.DirectByteBuffer[pos=10 lim=100 cap=100]");
        } catch (java.net.UnknownHostException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(socketFactory0);
    }

    @Test
    public void test00190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00190");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer5 = byteBuffer1.putInt(0);
        byte[] byteArray8 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer9 = byteBuffer5.put(byteArray8);
        java.nio.ByteOrder byteOrder10 = byteBuffer9.order();
        java.nio.ByteBuffer byteBuffer11 = byteBuffer9.duplicate();
        char char12 = byteBuffer11.getChar();
        // The following exception was thrown during execution in test generation
        try {
            float float14 = byteBuffer11.getFloat((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertNotNull(byteOrder10);
        org.junit.Assert.assertNotNull(byteBuffer11);
        org.junit.Assert.assertTrue("'" + char12 + "' != '" + '\000' + "'", char12 == '\000');
    }

    @Test
    public void test00191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00191");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer5 = byteBuffer1.putInt(0);
        byte[] byteArray8 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer9 = byteBuffer5.put(byteArray8);
        org.jsoup.helper.HttpConnection.Response response10 = null;
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response10);
        response11.contentType = "";
        boolean boolean14 = byteBuffer9.equals((java.lang.Object) "");
        java.nio.ByteBuffer byteBuffer16 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer18 = byteBuffer16.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer20 = byteBuffer16.putInt(0);
        java.nio.ByteBuffer byteBuffer22 = byteBuffer20.putInt((int) '#');
        int int23 = byteBuffer9.compareTo(byteBuffer20);
        java.nio.ByteBuffer byteBuffer25 = byteBuffer20.putInt((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            float float27 = byteBuffer25.getFloat((-10));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(byteBuffer16);
        org.junit.Assert.assertNotNull(byteBuffer18);
        org.junit.Assert.assertNotNull(byteBuffer20);
        org.junit.Assert.assertNotNull(byteBuffer22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2 + "'", int23 == 2);
        org.junit.Assert.assertNotNull(byteBuffer25);
    }

    @Test
    public void test00192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00192");
        org.jsoup.Connection.Request request0 = null;
        java.io.OutputStream outputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response.writePost(request0, outputStream1, "java.nio.DirectByteBuffer[pos=22 lim=100 cap=100]");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00193");
        javax.net.SocketFactory socketFactory0 = javax.net.ssl.SSLSocketFactory.getDefault();
        java.net.Socket socket1 = socketFactory0.createSocket();
        java.net.Socket socket2 = socketFactory0.createSocket();
        java.net.InetAddress inetAddress3 = null;
        java.net.InetAddress inetAddress5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.Socket socket7 = socketFactory0.createSocket(inetAddress3, 83, inetAddress5, (-24));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: port out of range:-24");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(socketFactory0);
        org.junit.Assert.assertNotNull(socket1);
        org.junit.Assert.assertEquals(socket1.toString(), "Socket[unconnected]");
        org.junit.Assert.assertNotNull(socket2);
        org.junit.Assert.assertEquals(socket2.toString(), "Socket[unconnected]");
    }

    @Test
    public void test00194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00194");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.contentType = "";
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str6 = response4.getHeaderCaseInsensitive("hi!");
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response4);
        response7.executed = true;
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response7);
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response7);
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response7);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response15 = response12.cookie("", "\\Qjava.nio.DirectByteBuffer[pos=24 lim=100 cap=100]\\E");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test00195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00195");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer5 = byteBuffer1.putInt(0);
        byte[] byteArray8 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer9 = byteBuffer5.put(byteArray8);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer12 = java.nio.ByteBuffer.wrap(byteArray8, 14, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer9);
    }

    @Test
    public void test00196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00196");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        long long2 = byteBuffer1.getLong();
        int int3 = byteBuffer1.position();
        float float5 = byteBuffer1.getFloat((int) (short) 10);
        boolean boolean6 = byteBuffer1.hasArray();
        double double7 = byteBuffer1.getDouble();
        short short9 = byteBuffer1.getShort(0);
        java.nio.ByteBuffer byteBuffer11 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer13 = byteBuffer11.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer15 = byteBuffer11.putInt(0);
        byte[] byteArray18 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer19 = byteBuffer15.put(byteArray18);
        boolean boolean20 = byteBuffer15.hasArray();
        java.nio.ByteBuffer byteBuffer22 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer24 = byteBuffer22.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer26 = byteBuffer22.putInt(0);
        byte[] byteArray29 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer30 = byteBuffer26.put(byteArray29);
        java.nio.ByteBuffer byteBuffer32 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer34 = byteBuffer32.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer36 = byteBuffer32.putInt(0);
        byte[] byteArray39 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer40 = byteBuffer36.put(byteArray39);
        java.nio.ByteBuffer byteBuffer43 = byteBuffer26.get(byteArray39, 2, (int) (byte) 0);
        java.nio.ByteBuffer byteBuffer45 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer47 = byteBuffer45.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer49 = byteBuffer45.putInt(0);
        byte[] byteArray52 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer53 = byteBuffer49.put(byteArray52);
        java.nio.ByteBuffer byteBuffer55 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer57 = byteBuffer55.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer59 = byteBuffer55.putInt(0);
        byte[] byteArray62 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer63 = byteBuffer59.put(byteArray62);
        java.nio.ByteBuffer byteBuffer66 = byteBuffer49.get(byteArray62, 2, (int) (byte) 0);
        java.nio.ByteBuffer byteBuffer67 = byteBuffer43.put(byteArray62);
        java.nio.ByteBuffer byteBuffer68 = byteBuffer15.put(byteArray62);
        java.nio.ByteBuffer byteBuffer69 = byteBuffer1.get(byteArray62);
        java.nio.Buffer buffer70 = byteBuffer69.mark();
        java.nio.Buffer buffer71 = buffer70.flip();
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 0 + "'", short9 == (short) 0);
        org.junit.Assert.assertNotNull(byteBuffer11);
        org.junit.Assert.assertNotNull(byteBuffer13);
        org.junit.Assert.assertNotNull(byteBuffer15);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(byteBuffer22);
        org.junit.Assert.assertNotNull(byteBuffer24);
        org.junit.Assert.assertNotNull(byteBuffer26);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray29), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer30);
        org.junit.Assert.assertNotNull(byteBuffer32);
        org.junit.Assert.assertNotNull(byteBuffer34);
        org.junit.Assert.assertNotNull(byteBuffer36);
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray39), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer40);
        org.junit.Assert.assertNotNull(byteBuffer43);
        org.junit.Assert.assertNotNull(byteBuffer45);
        org.junit.Assert.assertNotNull(byteBuffer47);
        org.junit.Assert.assertNotNull(byteBuffer49);
        org.junit.Assert.assertNotNull(byteArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray52), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer53);
        org.junit.Assert.assertNotNull(byteBuffer55);
        org.junit.Assert.assertNotNull(byteBuffer57);
        org.junit.Assert.assertNotNull(byteBuffer59);
        org.junit.Assert.assertNotNull(byteArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray62), "[0, 0]");
        org.junit.Assert.assertNotNull(byteBuffer63);
        org.junit.Assert.assertNotNull(byteBuffer66);
        org.junit.Assert.assertNotNull(byteBuffer67);
        org.junit.Assert.assertNotNull(byteBuffer68);
        org.junit.Assert.assertNotNull(byteBuffer69);
        org.junit.Assert.assertNotNull(buffer70);
        org.junit.Assert.assertNotNull(buffer71);
    }

    @Test
    public void test00197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00197");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer5 = byteBuffer1.putInt(0);
        java.nio.Buffer buffer7 = byteBuffer1.limit(32);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.Buffer buffer9 = buffer7.position((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: newPosition < 0: (-1 < 0)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertNotNull(buffer7);
    }

    @Test
    public void test00198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00198");
        java.lang.CharSequence charSequence1 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = java.util.regex.Pattern.matches("java.nio.DirectByteBuffer[pos=10 lim=100 cap=100]", charSequence1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00199");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        response2.contentType = "";
        java.lang.String str5 = response2.contentType;
        response2.executed = true;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry9 = response2.scanHeaders("");
        java.lang.String str11 = response2.getHeaderCaseInsensitive("Location");
        java.lang.String str12 = response2.charset();
        response2.numRedirects = (short) 0;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response15 = org.jsoup.helper.HttpConnection.Response.execute(request0, response2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(strEntry9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test00200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00200");
        javax.net.SocketFactory socketFactory0 = javax.net.ssl.SSLSocketFactory.getDefault();
        java.net.Socket socket1 = socketFactory0.createSocket();
        java.net.Socket socket2 = socketFactory0.createSocket();
        java.net.InetAddress inetAddress3 = null;
        java.net.InetAddress inetAddress5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.Socket socket7 = socketFactory0.createSocket(inetAddress3, (int) (byte) 0, inetAddress5, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.net.BindException; message: Permission denied (Bind failed)");
        } catch (java.net.BindException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(socketFactory0);
        org.junit.Assert.assertNotNull(socket1);
        org.junit.Assert.assertEquals(socket1.toString(), "Socket[unconnected]");
        org.junit.Assert.assertNotNull(socket2);
        org.junit.Assert.assertEquals(socket2.toString(), "Socket[unconnected]");
    }

    @Test
    public void test00201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00201");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer5 = byteBuffer1.putInt(0);
        byte[] byteArray8 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer9 = byteBuffer5.put(byteArray8);
        org.jsoup.helper.HttpConnection.Response response10 = null;
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response10);
        response11.contentType = "";
        boolean boolean14 = byteBuffer9.equals((java.lang.Object) "");
        java.nio.IntBuffer intBuffer15 = byteBuffer9.asIntBuffer();
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(intBuffer15);
    }

    @Test
    public void test00202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00202");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        long long2 = byteBuffer1.getLong();
        int int3 = byteBuffer1.position();
        float float5 = byteBuffer1.getFloat((int) (short) 10);
        boolean boolean6 = byteBuffer1.hasArray();
        double double7 = byteBuffer1.getDouble();
        java.nio.ByteBuffer byteBuffer10 = byteBuffer1.putFloat(0, (float) (short) 10);
        java.nio.ByteBuffer byteBuffer11 = byteBuffer1.asReadOnlyBuffer();
        double double12 = byteBuffer11.getDouble();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer15 = byteBuffer11.putShort((int) '#', (short) 1);
            org.junit.Assert.fail("Expected exception of type java.nio.ReadOnlyBufferException; message: null");
        } catch (java.nio.ReadOnlyBufferException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(byteBuffer10);
        org.junit.Assert.assertNotNull(byteBuffer11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test00203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00203");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer5 = byteBuffer1.putInt(0);
        byte[] byteArray8 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer9 = byteBuffer5.put(byteArray8);
        java.nio.ByteBuffer byteBuffer11 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer13 = byteBuffer11.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer15 = byteBuffer11.putInt(0);
        byte[] byteArray18 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer19 = byteBuffer15.put(byteArray18);
        java.nio.ByteBuffer byteBuffer22 = byteBuffer5.get(byteArray18, 2, (int) (byte) 0);
        java.nio.IntBuffer intBuffer23 = byteBuffer22.asIntBuffer();
        boolean boolean25 = byteBuffer22.equals((java.lang.Object) '\n');
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray26 = byteBuffer22.array();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertNotNull(byteBuffer11);
        org.junit.Assert.assertNotNull(byteBuffer13);
        org.junit.Assert.assertNotNull(byteBuffer15);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer19);
        org.junit.Assert.assertNotNull(byteBuffer22);
        org.junit.Assert.assertNotNull(intBuffer23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test00204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00204");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.contentType = "";
        java.lang.String str4 = response1.contentType;
        response1.executed = true;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry8 = response1.scanHeaders("");
        java.lang.String str10 = response1.getHeaderCaseInsensitive("Location");
        java.lang.String str11 = response1.charset();
        java.util.Map<java.lang.String, java.lang.String> strMap12 = response1.cookies();
        java.lang.String str14 = response1.getHeaderCaseInsensitive("");
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.nio.ByteBuffer byteBuffer18 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer20 = byteBuffer18.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer22 = byteBuffer18.putInt(0);
        short short23 = byteBuffer22.getShort();
        int int24 = byteBuffer22.capacity();
        boolean boolean25 = byteBuffer22.hasArray();
        response1.byteData = byteBuffer22;
        java.nio.ByteBuffer byteBuffer28 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer30 = byteBuffer28.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer32 = byteBuffer28.putInt(0);
        byte[] byteArray35 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer36 = byteBuffer32.put(byteArray35);
        boolean boolean37 = byteBuffer32.hasArray();
        java.nio.ByteBuffer byteBuffer39 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer41 = byteBuffer39.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer43 = byteBuffer39.putInt(0);
        byte[] byteArray46 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer47 = byteBuffer43.put(byteArray46);
        java.nio.ByteBuffer byteBuffer49 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer51 = byteBuffer49.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer53 = byteBuffer49.putInt(0);
        byte[] byteArray56 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer57 = byteBuffer53.put(byteArray56);
        java.nio.ByteBuffer byteBuffer60 = byteBuffer43.get(byteArray56, 2, (int) (byte) 0);
        java.nio.ByteBuffer byteBuffer62 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer64 = byteBuffer62.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer66 = byteBuffer62.putInt(0);
        byte[] byteArray69 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer70 = byteBuffer66.put(byteArray69);
        java.nio.ByteBuffer byteBuffer72 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer74 = byteBuffer72.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer76 = byteBuffer72.putInt(0);
        byte[] byteArray79 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer80 = byteBuffer76.put(byteArray79);
        java.nio.ByteBuffer byteBuffer83 = byteBuffer66.get(byteArray79, 2, (int) (byte) 0);
        java.nio.ByteBuffer byteBuffer84 = byteBuffer60.put(byteArray79);
        java.nio.ByteBuffer byteBuffer85 = byteBuffer32.put(byteArray79);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer88 = byteBuffer22.get(byteArray79, (-10), (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(strEntry8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(byteBuffer18);
        org.junit.Assert.assertNotNull(byteBuffer20);
        org.junit.Assert.assertNotNull(byteBuffer22);
        org.junit.Assert.assertTrue("'" + short23 + "' != '" + (short) 0 + "'", short23 == (short) 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(byteBuffer28);
        org.junit.Assert.assertNotNull(byteBuffer30);
        org.junit.Assert.assertNotNull(byteBuffer32);
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray35), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(byteBuffer39);
        org.junit.Assert.assertNotNull(byteBuffer41);
        org.junit.Assert.assertNotNull(byteBuffer43);
        org.junit.Assert.assertNotNull(byteArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray46), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer47);
        org.junit.Assert.assertNotNull(byteBuffer49);
        org.junit.Assert.assertNotNull(byteBuffer51);
        org.junit.Assert.assertNotNull(byteBuffer53);
        org.junit.Assert.assertNotNull(byteArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray56), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer57);
        org.junit.Assert.assertNotNull(byteBuffer60);
        org.junit.Assert.assertNotNull(byteBuffer62);
        org.junit.Assert.assertNotNull(byteBuffer64);
        org.junit.Assert.assertNotNull(byteBuffer66);
        org.junit.Assert.assertNotNull(byteArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray69), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer70);
        org.junit.Assert.assertNotNull(byteBuffer72);
        org.junit.Assert.assertNotNull(byteBuffer74);
        org.junit.Assert.assertNotNull(byteBuffer76);
        org.junit.Assert.assertNotNull(byteArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray79), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer80);
        org.junit.Assert.assertNotNull(byteBuffer83);
        org.junit.Assert.assertNotNull(byteBuffer84);
        org.junit.Assert.assertNotNull(byteBuffer85);
    }

    @Test
    public void test00205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00205");
        javax.net.SocketFactory socketFactory0 = javax.net.ssl.SSLSocketFactory.getDefault();
        java.net.Socket socket1 = socketFactory0.createSocket();
        java.net.Socket socket2 = socketFactory0.createSocket();
        java.net.InetAddress inetAddress3 = null;
        java.net.InetAddress inetAddress5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.Socket socket7 = socketFactory0.createSocket(inetAddress3, 20, inetAddress5, 4);
            org.junit.Assert.fail("Expected exception of type java.net.BindException; message: Permission denied (Bind failed)");
        } catch (java.net.BindException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(socketFactory0);
        org.junit.Assert.assertNotNull(socket1);
        org.junit.Assert.assertEquals(socket1.toString(), "Socket[unconnected]");
        org.junit.Assert.assertNotNull(socket2);
        org.junit.Assert.assertEquals(socket2.toString(), "Socket[unconnected]");
    }

    @Test
    public void test00206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00206");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer5 = byteBuffer1.putInt(0);
        java.nio.ByteBuffer byteBuffer7 = byteBuffer5.putInt((int) '#');
        float float9 = byteBuffer7.getFloat(4);
        java.nio.ByteBuffer byteBuffer11 = byteBuffer7.putInt(10);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray12 = byteBuffer11.array();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertNotNull(byteBuffer7);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 7.3E-44f + "'", float9 == 7.3E-44f);
        org.junit.Assert.assertNotNull(byteBuffer11);
    }

    @Test
    public void test00207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00207");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        long long2 = byteBuffer1.getLong();
        int int3 = byteBuffer1.position();
        float float5 = byteBuffer1.getFloat((int) (short) 10);
        boolean boolean6 = byteBuffer1.hasArray();
        double double7 = byteBuffer1.getDouble();
        short short9 = byteBuffer1.getShort(0);
        java.nio.ByteBuffer byteBuffer11 = byteBuffer1.putDouble(100.0d);
        org.jsoup.helper.HttpConnection.Response response12 = null;
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response12);
        java.lang.String str15 = response13.getHeaderCaseInsensitive("");
        java.util.Map<java.lang.String, java.lang.String> strMap16 = response13.cookies();
        org.jsoup.Connection.Response response18 = response13.removeCookie("hi!");
        java.lang.String str19 = response13.statusMessage();
        java.nio.ByteBuffer byteBuffer21 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer23 = byteBuffer21.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer25 = byteBuffer21.putInt(0);
        byte[] byteArray28 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer29 = byteBuffer25.put(byteArray28);
        boolean boolean30 = byteBuffer25.hasArray();
        response13.byteData = byteBuffer25;
        int int32 = byteBuffer11.compareTo(byteBuffer25);
        java.lang.String str33 = byteBuffer11.toString();
        long long34 = byteBuffer11.getLong();
        java.nio.DoubleBuffer doubleBuffer35 = byteBuffer11.asDoubleBuffer();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer38 = byteBuffer11.putDouble((int) (byte) -1, (double) 8);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 0 + "'", short9 == (short) 0);
        org.junit.Assert.assertNotNull(byteBuffer11);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertNotNull(response18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(byteBuffer21);
        org.junit.Assert.assertNotNull(byteBuffer23);
        org.junit.Assert.assertNotNull(byteBuffer25);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray28), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-10) + "'", int32 == (-10));
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "java.nio.DirectByteBuffer[pos=24 lim=100 cap=100]" + "'", str33, "java.nio.DirectByteBuffer[pos=24 lim=100 cap=100]");
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertNotNull(doubleBuffer35);
    }

    @Test
    public void test00208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00208");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer5 = byteBuffer1.putInt(0);
        byte[] byteArray8 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer9 = byteBuffer5.put(byteArray8);
        boolean boolean10 = byteBuffer5.hasArray();
        java.nio.ByteBuffer byteBuffer12 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer14 = byteBuffer12.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer16 = byteBuffer12.putInt(0);
        byte[] byteArray19 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer20 = byteBuffer16.put(byteArray19);
        java.nio.ByteBuffer byteBuffer22 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer24 = byteBuffer22.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer26 = byteBuffer22.putInt(0);
        byte[] byteArray29 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer30 = byteBuffer26.put(byteArray29);
        java.nio.ByteBuffer byteBuffer33 = byteBuffer16.get(byteArray29, 2, (int) (byte) 0);
        java.nio.ByteBuffer byteBuffer35 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer37 = byteBuffer35.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer39 = byteBuffer35.putInt(0);
        byte[] byteArray42 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer43 = byteBuffer39.put(byteArray42);
        java.nio.ByteBuffer byteBuffer45 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer47 = byteBuffer45.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer49 = byteBuffer45.putInt(0);
        byte[] byteArray52 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer53 = byteBuffer49.put(byteArray52);
        java.nio.ByteBuffer byteBuffer56 = byteBuffer39.get(byteArray52, 2, (int) (byte) 0);
        java.nio.ByteBuffer byteBuffer57 = byteBuffer33.put(byteArray52);
        java.nio.ByteBuffer byteBuffer58 = byteBuffer5.put(byteArray52);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer61 = java.nio.ByteBuffer.wrap(byteArray52, 0, 12);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(byteBuffer12);
        org.junit.Assert.assertNotNull(byteBuffer14);
        org.junit.Assert.assertNotNull(byteBuffer16);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer20);
        org.junit.Assert.assertNotNull(byteBuffer22);
        org.junit.Assert.assertNotNull(byteBuffer24);
        org.junit.Assert.assertNotNull(byteBuffer26);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray29), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer30);
        org.junit.Assert.assertNotNull(byteBuffer33);
        org.junit.Assert.assertNotNull(byteBuffer35);
        org.junit.Assert.assertNotNull(byteBuffer37);
        org.junit.Assert.assertNotNull(byteBuffer39);
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray42), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer43);
        org.junit.Assert.assertNotNull(byteBuffer45);
        org.junit.Assert.assertNotNull(byteBuffer47);
        org.junit.Assert.assertNotNull(byteBuffer49);
        org.junit.Assert.assertNotNull(byteArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray52), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer53);
        org.junit.Assert.assertNotNull(byteBuffer56);
        org.junit.Assert.assertNotNull(byteBuffer57);
        org.junit.Assert.assertNotNull(byteBuffer58);
    }

    @Test
    public void test00209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00209");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.contentType = "";
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response1);
        int int5 = response1.numRedirects;
        int int6 = response1.statusCode();
        response1.executed = true;
        java.net.HttpURLConnection httpURLConnection9 = null;
        org.jsoup.Connection.Response response10 = null;
        // The following exception was thrown during execution in test generation
        try {
            response1.setupFromConnection(httpURLConnection9, response10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test00210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00210");
        javax.net.SocketFactory socketFactory0 = javax.net.ssl.SSLSocketFactory.getDefault();
        java.net.Socket socket1 = socketFactory0.createSocket();
        java.net.InetAddress inetAddress2 = null;
        java.net.InetAddress inetAddress4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.Socket socket6 = socketFactory0.createSocket(inetAddress2, (int) (byte) 0, inetAddress4, 24);
            org.junit.Assert.fail("Expected exception of type java.net.BindException; message: Permission denied (Bind failed)");
        } catch (java.net.BindException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(socketFactory0);
        org.junit.Assert.assertNotNull(socket1);
        org.junit.Assert.assertEquals(socket1.toString(), "Socket[unconnected]");
    }

    @Test
    public void test00211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00211");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer5 = byteBuffer1.putInt(0);
        short short6 = byteBuffer5.getShort();
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray7 = byteBuffer5.array();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 0 + "'", short6 == (short) 0);
    }

    @Test
    public void test00212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00212");
        java.lang.String str1 = java.util.regex.Pattern.quote("java.nio.DirectByteBuffer[pos=35 lim=100 cap=100]");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\Qjava.nio.DirectByteBuffer[pos=35 lim=100 cap=100]\\E" + "'", str1, "\\Qjava.nio.DirectByteBuffer[pos=35 lim=100 cap=100]\\E");
    }

    @Test
    public void test00213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00213");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.contentType = "";
        java.lang.String str4 = response1.contentType;
        response1.executed = true;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry8 = response1.scanHeaders("");
        java.lang.String str10 = response1.getHeaderCaseInsensitive("Location");
        java.lang.String str11 = response1.charset();
        response1.statusCode = 64;
        java.net.HttpURLConnection httpURLConnection14 = null;
        org.jsoup.helper.HttpConnection.Response response15 = null;
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response15);
        response16.contentType = "";
        org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response(response16);
        java.lang.String str21 = response19.getHeaderCaseInsensitive("hi!");
        org.jsoup.helper.HttpConnection.Response response22 = new org.jsoup.helper.HttpConnection.Response(response19);
        response22.executed = true;
        // The following exception was thrown during execution in test generation
        try {
            response1.setupFromConnection(httpURLConnection14, (org.jsoup.Connection.Response) response22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(strEntry8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test00214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00214");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        java.util.Map<java.lang.String, java.lang.String> strMap4 = response1.cookies();
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response1);
        int int7 = response6.statusCode();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry9 = response6.scanHeaders("Location");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document10 = response6.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(strEntry9);
    }

    @Test
    public void test00215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00215");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer5 = byteBuffer1.putInt(0);
        byte[] byteArray8 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer9 = byteBuffer5.put(byteArray8);
        java.nio.ByteOrder byteOrder10 = byteBuffer9.order();
        java.nio.ByteBuffer byteBuffer11 = byteBuffer9.duplicate();
        java.nio.ByteBuffer byteBuffer14 = byteBuffer11.putDouble(8, (double) 256);
        java.nio.ByteBuffer byteBuffer16 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer18 = byteBuffer16.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer20 = byteBuffer16.putInt(0);
        short short21 = byteBuffer20.getShort();
        java.nio.IntBuffer intBuffer22 = byteBuffer20.asIntBuffer();
        int int23 = byteBuffer20.capacity();
        java.nio.ByteBuffer byteBuffer25 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer27 = byteBuffer25.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer29 = byteBuffer25.putInt(0);
        java.nio.ByteBuffer byteBuffer32 = byteBuffer29.putDouble((int) (byte) 1, (double) 1L);
        java.nio.ByteBuffer byteBuffer34 = byteBuffer29.putChar('a');
        double double36 = byteBuffer34.getDouble(12);
        java.nio.ByteBuffer byteBuffer38 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer40 = byteBuffer38.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer42 = byteBuffer38.putInt(0);
        byte[] byteArray45 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer46 = byteBuffer42.put(byteArray45);
        java.nio.ByteBuffer byteBuffer48 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer50 = byteBuffer48.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer52 = byteBuffer48.putInt(0);
        byte[] byteArray55 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer56 = byteBuffer52.put(byteArray55);
        java.nio.ByteBuffer byteBuffer59 = byteBuffer42.get(byteArray55, 2, (int) (byte) 0);
        java.nio.ByteBuffer byteBuffer60 = byteBuffer34.put(byteArray55);
        java.nio.ByteBuffer byteBuffer61 = byteBuffer20.get(byteArray55);
        java.nio.ByteBuffer byteBuffer62 = java.nio.ByteBuffer.wrap(byteArray55);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer65 = byteBuffer14.get(byteArray55, 128, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertNotNull(byteOrder10);
        org.junit.Assert.assertNotNull(byteBuffer11);
        org.junit.Assert.assertNotNull(byteBuffer14);
        org.junit.Assert.assertNotNull(byteBuffer16);
        org.junit.Assert.assertNotNull(byteBuffer18);
        org.junit.Assert.assertNotNull(byteBuffer20);
        org.junit.Assert.assertTrue("'" + short21 + "' != '" + (short) 0 + "'", short21 == (short) 0);
        org.junit.Assert.assertNotNull(intBuffer22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
        org.junit.Assert.assertNotNull(byteBuffer25);
        org.junit.Assert.assertNotNull(byteBuffer27);
        org.junit.Assert.assertNotNull(byteBuffer29);
        org.junit.Assert.assertNotNull(byteBuffer32);
        org.junit.Assert.assertNotNull(byteBuffer34);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 7.565251118924485E-307d + "'", double36 == 7.565251118924485E-307d);
        org.junit.Assert.assertNotNull(byteBuffer38);
        org.junit.Assert.assertNotNull(byteBuffer40);
        org.junit.Assert.assertNotNull(byteBuffer42);
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray45), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer46);
        org.junit.Assert.assertNotNull(byteBuffer48);
        org.junit.Assert.assertNotNull(byteBuffer50);
        org.junit.Assert.assertNotNull(byteBuffer52);
        org.junit.Assert.assertNotNull(byteArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray55), "[0, 0]");
        org.junit.Assert.assertNotNull(byteBuffer56);
        org.junit.Assert.assertNotNull(byteBuffer59);
        org.junit.Assert.assertNotNull(byteBuffer60);
        org.junit.Assert.assertNotNull(byteBuffer61);
        org.junit.Assert.assertNotNull(byteBuffer62);
    }

    @Test
    public void test00216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00216");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str4 = response2.getHeaderCaseInsensitive("");
        java.util.Map<java.lang.String, java.lang.String> strMap5 = response2.cookies();
        org.jsoup.Connection.Response response7 = response2.removeCookie("hi!");
        java.lang.String str8 = response2.statusMessage();
        java.nio.ByteBuffer byteBuffer10 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer12 = byteBuffer10.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer14 = byteBuffer10.putInt(0);
        byte[] byteArray17 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer18 = byteBuffer14.put(byteArray17);
        boolean boolean19 = byteBuffer14.hasArray();
        response2.byteData = byteBuffer14;
        boolean boolean22 = response2.hasCookie("\\Qhi!\\E");
        int int23 = response2.numRedirects;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response24 = org.jsoup.helper.HttpConnection.Response.execute(request0, response2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(byteBuffer10);
        org.junit.Assert.assertNotNull(byteBuffer12);
        org.junit.Assert.assertNotNull(byteBuffer14);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test00217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00217");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.contentType = "";
        java.lang.String str4 = response1.contentType;
        response1.executed = true;
        java.lang.String str8 = response1.header("");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray9 = response1.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test00218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00218");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.contentType = "";
        java.lang.String str4 = response1.contentType;
        response1.executed = true;
        java.util.Map<java.lang.String, java.lang.String> strMap7 = response1.headers();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document8 = response1.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(strMap7);
    }

    @Test
    public void test00219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00219");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        java.util.Map<java.lang.String, java.lang.String> strMap4 = response1.cookies();
        org.jsoup.Connection.Response response6 = response1.removeCookie("hi!");
        java.lang.String str7 = response1.statusMessage();
        java.nio.ByteBuffer byteBuffer9 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer11 = byteBuffer9.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer13 = byteBuffer9.putInt(0);
        byte[] byteArray16 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer17 = byteBuffer13.put(byteArray16);
        boolean boolean18 = byteBuffer13.hasArray();
        response1.byteData = byteBuffer13;
        org.jsoup.helper.HttpConnection.Response response20 = new org.jsoup.helper.HttpConnection.Response(response1);
        boolean boolean21 = response20.executed;
        org.jsoup.helper.HttpConnection.Response response22 = new org.jsoup.helper.HttpConnection.Response(response20);
        org.jsoup.helper.HttpConnection.Response response23 = new org.jsoup.helper.HttpConnection.Response(response20);
        org.jsoup.helper.HttpConnection.Response response24 = new org.jsoup.helper.HttpConnection.Response(response20);
        org.jsoup.Connection.Response response27 = response20.header("\\Qjava.nio.DirectByteBuffer[pos=24 lim=100 cap=100]\\E", "Location");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertNotNull(byteBuffer11);
        org.junit.Assert.assertNotNull(byteBuffer13);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(response27);
    }

    @Test
    public void test00220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00220");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.putLong((long) '4');
        int int5 = byteBuffer3.getInt((int) (short) 1);
        java.nio.ByteBuffer byteBuffer8 = byteBuffer3.putChar((int) ' ', '#');
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer11 = byteBuffer8.putFloat((-84), (float) 92);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(byteBuffer8);
    }

    @Test
    public void test00221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00221");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer5 = byteBuffer1.putInt(0);
        java.nio.ByteBuffer byteBuffer8 = byteBuffer5.putDouble((int) (byte) 1, (double) 1L);
        java.nio.ByteBuffer byteBuffer10 = byteBuffer5.putChar('a');
        java.nio.ByteBuffer byteBuffer11 = byteBuffer10.asReadOnlyBuffer();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer13 = byteBuffer11.putChar(' ');
            org.junit.Assert.fail("Expected exception of type java.nio.ReadOnlyBufferException; message: null");
        } catch (java.nio.ReadOnlyBufferException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertNotNull(byteBuffer8);
        org.junit.Assert.assertNotNull(byteBuffer10);
        org.junit.Assert.assertNotNull(byteBuffer11);
    }

    @Test
    public void test00222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00222");
        javax.net.SocketFactory socketFactory0 = javax.net.ssl.SSLSocketFactory.getDefault();
        // The following exception was thrown during execution in test generation
        try {
            java.net.Socket socket3 = socketFactory0.createSocket("\\Qhi!\\E", 24);
            org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: \\Qhi!\\E");
        } catch (java.net.UnknownHostException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(socketFactory0);
    }

    @Test
    public void test00223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00223");
        java.util.regex.Pattern pattern2 = null; // flaky: java.util.regex.Pattern.compile("java.nio.DirectByteBuffer[pos=24 lim=100 cap=100]", (-65536));
        java.util.regex.Pattern pattern5 = java.util.regex.Pattern.compile("\\Qhi!\\E", (int) (short) 100);
        java.nio.ByteBuffer byteBuffer7 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer9 = byteBuffer7.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer11 = byteBuffer7.putInt(0);
        byte[] byteArray14 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer15 = byteBuffer11.put(byteArray14);
        java.nio.CharBuffer charBuffer16 = byteBuffer11.asCharBuffer();
        java.util.regex.Matcher matcher17 = pattern5.matcher((java.lang.CharSequence) charBuffer16);
        java.util.stream.Stream<java.lang.String> strStream18 = null; // flaky: pattern2.splitAsStream((java.lang.CharSequence) charBuffer16);
        java.lang.String str19 = null; // flaky: pattern2.toString();
// flaky:         org.junit.Assert.assertNotNull(pattern2);
// flaky:         org.junit.Assert.assertEquals(pattern2.toString(), "java.nio.DirectByteBuffer[pos=24 lim=100 cap=100]");
        org.junit.Assert.assertNotNull(pattern5);
        org.junit.Assert.assertEquals(pattern5.toString(), "\\Qhi!\\E");
        org.junit.Assert.assertNotNull(byteBuffer7);
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertNotNull(byteBuffer11);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer15);
        org.junit.Assert.assertNotNull(charBuffer16);
        org.junit.Assert.assertNotNull(matcher17);
        org.junit.Assert.assertEquals(matcher17.toString(), "java.util.regex.Matcher[pattern=\\Qhi!\\E region=0,43 lastmatch=]");
// flaky:         org.junit.Assert.assertNotNull(strStream18);
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "java.nio.DirectByteBuffer[pos=24 lim=100 cap=100]" + "'", str19, "java.nio.DirectByteBuffer[pos=24 lim=100 cap=100]");
    }

    @Test
    public void test00224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00224");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.contentType = "";
        java.lang.String str4 = response1.contentType;
        response1.executed = true;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry8 = response1.scanHeaders("");
        java.lang.String str10 = response1.getHeaderCaseInsensitive("Location");
        java.lang.String str11 = response1.charset();
        response1.charset = "java.nio.DirectByteBuffer[pos=10 lim=100 cap=100]";
        response1.statusCode = 12;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document16 = response1.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(strEntry8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test00225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00225");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str4 = response2.getHeaderCaseInsensitive("");
        java.util.Map<java.lang.String, java.lang.String> strMap5 = response2.cookies();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response2);
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response2);
        org.jsoup.Connection.Method method8 = response2.method();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response9 = org.jsoup.helper.HttpConnection.Response.execute(request0, response2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNull(method8);
    }

    @Test
    public void test00226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00226");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer5 = byteBuffer1.putInt(0);
        byte[] byteArray8 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer9 = byteBuffer5.put(byteArray8);
        java.nio.ByteBuffer byteBuffer11 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer13 = byteBuffer11.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer15 = byteBuffer11.putInt(0);
        byte[] byteArray18 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer19 = byteBuffer15.put(byteArray18);
        java.nio.ByteBuffer byteBuffer22 = byteBuffer5.get(byteArray18, 2, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = byteBuffer22.getInt(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertNotNull(byteBuffer11);
        org.junit.Assert.assertNotNull(byteBuffer13);
        org.junit.Assert.assertNotNull(byteBuffer15);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer19);
        org.junit.Assert.assertNotNull(byteBuffer22);
    }

    @Test
    public void test00227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00227");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.putLong((long) '4');
        int int5 = byteBuffer3.getInt((int) (short) 1);
        java.nio.Buffer buffer6 = byteBuffer3.mark();
        java.nio.ByteBuffer byteBuffer8 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer10 = byteBuffer8.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer12 = byteBuffer8.putInt(0);
        byte[] byteArray15 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer16 = byteBuffer12.put(byteArray15);
        java.nio.ByteBuffer byteBuffer18 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer20 = byteBuffer18.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer22 = byteBuffer18.putInt(0);
        byte[] byteArray25 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer26 = byteBuffer22.put(byteArray25);
        java.nio.ByteBuffer byteBuffer29 = byteBuffer12.get(byteArray25, 2, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer32 = byteBuffer3.put(byteArray25, (int) '#', (-65536));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(buffer6);
        org.junit.Assert.assertNotNull(byteBuffer8);
        org.junit.Assert.assertNotNull(byteBuffer10);
        org.junit.Assert.assertNotNull(byteBuffer12);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer16);
        org.junit.Assert.assertNotNull(byteBuffer18);
        org.junit.Assert.assertNotNull(byteBuffer20);
        org.junit.Assert.assertNotNull(byteBuffer22);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer26);
        org.junit.Assert.assertNotNull(byteBuffer29);
    }

    @Test
    public void test00228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00228");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response6 = response1.header("hi!", "");
        org.jsoup.Connection.Request request7 = null;
        response1.req = request7;
        response1.charset = "\\Q\\E";
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = response1.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response6);
    }

    @Test
    public void test00229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00229");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.contentType = "";
        java.lang.String str4 = response1.contentType;
        response1.executed = true;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry8 = response1.scanHeaders("");
        java.lang.String str10 = response1.getHeaderCaseInsensitive("Location");
        java.lang.String str11 = response1.charset();
        java.lang.String str12 = response1.contentType();
        java.net.HttpURLConnection httpURLConnection13 = null;
        org.jsoup.helper.HttpConnection.Response response14 = null;
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response14);
        java.lang.String str17 = response15.getHeaderCaseInsensitive("");
        java.util.Map<java.lang.String, java.lang.String> strMap18 = response15.cookies();
        org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response(response15);
        org.jsoup.helper.HttpConnection.Response response20 = new org.jsoup.helper.HttpConnection.Response(response15);
        org.jsoup.helper.HttpConnection.Response response21 = new org.jsoup.helper.HttpConnection.Response(response20);
        org.jsoup.helper.HttpConnection.Response response22 = new org.jsoup.helper.HttpConnection.Response(response20);
        org.jsoup.helper.HttpConnection.Response response23 = new org.jsoup.helper.HttpConnection.Response(response20);
        // The following exception was thrown during execution in test generation
        try {
            response1.setupFromConnection(httpURLConnection13, (org.jsoup.Connection.Response) response20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(strEntry8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(strMap18);
    }

    @Test
    public void test00230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00230");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.contentType = "";
        java.lang.String str5 = response1.cookie("hi!");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Response response9 = response1.header("Location", "");
        java.lang.Class<?> wildcardClass10 = response9.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00231");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.putLong((long) '4');
        short short5 = byteBuffer1.getShort(0);
        java.nio.ByteBuffer byteBuffer8 = byteBuffer1.putChar(1, '4');
        java.nio.ByteBuffer byteBuffer11 = byteBuffer8.put((int) (short) 10, (byte) 1);
        short short12 = byteBuffer8.getShort();
        java.lang.String str13 = byteBuffer8.toString();
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray14 = byteBuffer8.array();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 0 + "'", short5 == (short) 0);
        org.junit.Assert.assertNotNull(byteBuffer8);
        org.junit.Assert.assertNotNull(byteBuffer11);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 0 + "'", short12 == (short) 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "java.nio.DirectByteBuffer[pos=10 lim=100 cap=100]" + "'", str13, "java.nio.DirectByteBuffer[pos=10 lim=100 cap=100]");
    }

    @Test
    public void test00232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00232");
        javax.net.SocketFactory socketFactory0 = javax.net.ssl.SSLSocketFactory.getDefault();
        java.net.Socket socket1 = socketFactory0.createSocket();
        java.net.Socket socket2 = socketFactory0.createSocket();
        java.net.InetAddress inetAddress3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.Socket socket5 = socketFactory0.createSocket(inetAddress3, (-10));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: port out of range:-10");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(socketFactory0);
        org.junit.Assert.assertNotNull(socket1);
        org.junit.Assert.assertEquals(socket1.toString(), "Socket[unconnected]");
        org.junit.Assert.assertNotNull(socket2);
        org.junit.Assert.assertEquals(socket2.toString(), "Socket[unconnected]");
    }

    @Test
    public void test00233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00233");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate((int) '4');
        java.nio.ShortBuffer shortBuffer2 = byteBuffer1.asShortBuffer();
        int int3 = byteBuffer1.limit();
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(shortBuffer2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
    }

    @Test
    public void test00234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00234");
        org.jsoup.helper.HttpConnection.Response.LOCATION = "hi!";
    }

    @Test
    public void test00235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00235");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Response response6 = response3.header("java.nio.DirectByteBuffer[pos=24 lim=100 cap=100]", "java.nio.DirectByteBuffer[pos=24 lim=100 cap=100]");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response7 = org.jsoup.helper.HttpConnection.Response.execute(request0, response3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response6);
    }

    @Test
    public void test00236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00236");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.Buffer buffer3 = byteBuffer1.position((-24));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: newPosition < 0: (-24 < 0)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
    }

    @Test
    public void test00237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00237");
        org.jsoup.helper.HttpConnection.Response.MAX_REDIRECTS = (short) 10;
    }

    @Test
    public void test00238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00238");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        java.util.Map<java.lang.String, java.lang.String> strMap4 = response1.cookies();
        org.jsoup.Connection.Response response6 = response1.removeCookie("hi!");
        java.lang.String str7 = response1.statusMessage();
        java.nio.ByteBuffer byteBuffer9 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer11 = byteBuffer9.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer13 = byteBuffer9.putInt(0);
        byte[] byteArray16 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer17 = byteBuffer13.put(byteArray16);
        boolean boolean18 = byteBuffer13.hasArray();
        response1.byteData = byteBuffer13;
        org.jsoup.Connection.Method method20 = response1.method();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = response1.hasHeaderWithValue("", "java.nio.DirectByteBuffer[pos=24 lim=100 cap=100]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertNotNull(byteBuffer11);
        org.junit.Assert.assertNotNull(byteBuffer13);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(method20);
    }

    @Test
    public void test00239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00239");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.putLong((long) '4');
        int int5 = byteBuffer3.getInt((int) (short) 1);
        java.nio.ByteBuffer byteBuffer8 = byteBuffer3.putChar((int) ' ', '#');
        short short9 = byteBuffer8.getShort();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.Buffer buffer11 = byteBuffer8.limit(128);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(byteBuffer8);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 0 + "'", short9 == (short) 0);
    }

    @Test
    public void test00240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00240");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer5 = byteBuffer1.putInt(0);
        byte[] byteArray8 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer9 = byteBuffer5.put(byteArray8);
        java.nio.CharBuffer charBuffer10 = byteBuffer5.asCharBuffer();
        java.nio.ByteBuffer byteBuffer12 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer14 = byteBuffer12.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer16 = byteBuffer12.putInt(0);
        java.nio.ByteBuffer byteBuffer18 = byteBuffer16.putInt((int) '#');
        float float20 = byteBuffer18.getFloat(4);
        java.nio.ByteBuffer byteBuffer22 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer24 = byteBuffer22.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer26 = byteBuffer22.putInt(0);
        byte[] byteArray29 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer30 = byteBuffer26.put(byteArray29);
        java.nio.ByteBuffer byteBuffer32 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer34 = byteBuffer32.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer36 = byteBuffer32.putInt(0);
        byte[] byteArray39 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer40 = byteBuffer36.put(byteArray39);
        java.nio.ByteBuffer byteBuffer43 = byteBuffer26.get(byteArray39, 2, (int) (byte) 0);
        java.nio.ByteBuffer byteBuffer45 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer47 = byteBuffer45.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer49 = byteBuffer45.putInt(0);
        byte[] byteArray52 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer53 = byteBuffer49.put(byteArray52);
        java.nio.ByteBuffer byteBuffer55 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer57 = byteBuffer55.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer59 = byteBuffer55.putInt(0);
        byte[] byteArray62 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer63 = byteBuffer59.put(byteArray62);
        java.nio.ByteBuffer byteBuffer66 = byteBuffer49.get(byteArray62, 2, (int) (byte) 0);
        java.nio.ByteBuffer byteBuffer67 = byteBuffer43.put(byteArray62);
        java.nio.ByteBuffer byteBuffer68 = byteBuffer18.put(byteArray62);
        java.nio.ByteBuffer byteBuffer69 = byteBuffer5.get(byteArray62);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer72 = java.nio.ByteBuffer.wrap(byteArray62, 24, 12);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertNotNull(charBuffer10);
        org.junit.Assert.assertNotNull(byteBuffer12);
        org.junit.Assert.assertNotNull(byteBuffer14);
        org.junit.Assert.assertNotNull(byteBuffer16);
        org.junit.Assert.assertNotNull(byteBuffer18);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 7.3E-44f + "'", float20 == 7.3E-44f);
        org.junit.Assert.assertNotNull(byteBuffer22);
        org.junit.Assert.assertNotNull(byteBuffer24);
        org.junit.Assert.assertNotNull(byteBuffer26);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray29), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer30);
        org.junit.Assert.assertNotNull(byteBuffer32);
        org.junit.Assert.assertNotNull(byteBuffer34);
        org.junit.Assert.assertNotNull(byteBuffer36);
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray39), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer40);
        org.junit.Assert.assertNotNull(byteBuffer43);
        org.junit.Assert.assertNotNull(byteBuffer45);
        org.junit.Assert.assertNotNull(byteBuffer47);
        org.junit.Assert.assertNotNull(byteBuffer49);
        org.junit.Assert.assertNotNull(byteArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray52), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer53);
        org.junit.Assert.assertNotNull(byteBuffer55);
        org.junit.Assert.assertNotNull(byteBuffer57);
        org.junit.Assert.assertNotNull(byteBuffer59);
        org.junit.Assert.assertNotNull(byteArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray62), "[0, 0]");
        org.junit.Assert.assertNotNull(byteBuffer63);
        org.junit.Assert.assertNotNull(byteBuffer66);
        org.junit.Assert.assertNotNull(byteBuffer67);
        org.junit.Assert.assertNotNull(byteBuffer68);
        org.junit.Assert.assertNotNull(byteBuffer69);
    }

    @Test
    public void test00241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00241");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        java.util.Map<java.lang.String, java.lang.String> strMap4 = response1.cookies();
        org.jsoup.Connection.Response response6 = response1.removeCookie("hi!");
        java.lang.String str7 = response1.statusMessage();
        java.nio.ByteBuffer byteBuffer9 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer11 = byteBuffer9.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer13 = byteBuffer9.putInt(0);
        byte[] byteArray16 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer17 = byteBuffer13.put(byteArray16);
        boolean boolean18 = byteBuffer13.hasArray();
        response1.byteData = byteBuffer13;
        java.nio.ByteBuffer byteBuffer21 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer23 = byteBuffer21.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer25 = byteBuffer21.putInt(0);
        byte[] byteArray28 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer29 = byteBuffer25.put(byteArray28);
        boolean boolean30 = byteBuffer25.hasArray();
        java.nio.ByteBuffer byteBuffer32 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer34 = byteBuffer32.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer36 = byteBuffer32.putInt(0);
        byte[] byteArray39 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer40 = byteBuffer36.put(byteArray39);
        java.nio.ByteBuffer byteBuffer42 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer44 = byteBuffer42.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer46 = byteBuffer42.putInt(0);
        byte[] byteArray49 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer50 = byteBuffer46.put(byteArray49);
        java.nio.ByteBuffer byteBuffer53 = byteBuffer36.get(byteArray49, 2, (int) (byte) 0);
        java.nio.ByteBuffer byteBuffer55 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer57 = byteBuffer55.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer59 = byteBuffer55.putInt(0);
        byte[] byteArray62 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer63 = byteBuffer59.put(byteArray62);
        java.nio.ByteBuffer byteBuffer65 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer67 = byteBuffer65.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer69 = byteBuffer65.putInt(0);
        byte[] byteArray72 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer73 = byteBuffer69.put(byteArray72);
        java.nio.ByteBuffer byteBuffer76 = byteBuffer59.get(byteArray72, 2, (int) (byte) 0);
        java.nio.ByteBuffer byteBuffer77 = byteBuffer53.put(byteArray72);
        java.nio.ByteBuffer byteBuffer78 = byteBuffer25.put(byteArray72);
        response1.byteData = byteBuffer25;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str80 = response1.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertNotNull(byteBuffer11);
        org.junit.Assert.assertNotNull(byteBuffer13);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(byteBuffer21);
        org.junit.Assert.assertNotNull(byteBuffer23);
        org.junit.Assert.assertNotNull(byteBuffer25);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray28), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(byteBuffer32);
        org.junit.Assert.assertNotNull(byteBuffer34);
        org.junit.Assert.assertNotNull(byteBuffer36);
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray39), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer40);
        org.junit.Assert.assertNotNull(byteBuffer42);
        org.junit.Assert.assertNotNull(byteBuffer44);
        org.junit.Assert.assertNotNull(byteBuffer46);
        org.junit.Assert.assertNotNull(byteArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray49), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer50);
        org.junit.Assert.assertNotNull(byteBuffer53);
        org.junit.Assert.assertNotNull(byteBuffer55);
        org.junit.Assert.assertNotNull(byteBuffer57);
        org.junit.Assert.assertNotNull(byteBuffer59);
        org.junit.Assert.assertNotNull(byteArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray62), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer63);
        org.junit.Assert.assertNotNull(byteBuffer65);
        org.junit.Assert.assertNotNull(byteBuffer67);
        org.junit.Assert.assertNotNull(byteBuffer69);
        org.junit.Assert.assertNotNull(byteArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray72), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer73);
        org.junit.Assert.assertNotNull(byteBuffer76);
        org.junit.Assert.assertNotNull(byteBuffer77);
        org.junit.Assert.assertNotNull(byteBuffer78);
    }

    @Test
    public void test00242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00242");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        java.util.Map<java.lang.String, java.lang.String> strMap4 = response1.cookies();
        org.jsoup.Connection.Response response6 = response1.removeCookie("hi!");
        java.lang.String str7 = response1.statusMessage();
        java.nio.ByteBuffer byteBuffer9 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer11 = byteBuffer9.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer13 = byteBuffer9.putInt(0);
        byte[] byteArray16 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer17 = byteBuffer13.put(byteArray16);
        boolean boolean18 = byteBuffer13.hasArray();
        response1.byteData = byteBuffer13;
        org.jsoup.helper.HttpConnection.Response response20 = new org.jsoup.helper.HttpConnection.Response(response1);
        boolean boolean21 = response20.executed;
        org.jsoup.helper.HttpConnection.Response response22 = new org.jsoup.helper.HttpConnection.Response(response20);
        org.jsoup.helper.HttpConnection.Response response23 = new org.jsoup.helper.HttpConnection.Response(response20);
        boolean boolean25 = response23.hasCookie("java.nio.DirectByteBuffer[pos=35 lim=100 cap=100]");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray26 = response23.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertNotNull(byteBuffer11);
        org.junit.Assert.assertNotNull(byteBuffer13);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test00243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00243");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.contentType = "";
        java.lang.String str4 = response1.contentType;
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Request request6 = null;
        response5.req = request6;
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response5);
        org.jsoup.Connection.Method method9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response10 = response5.method(method9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test00244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00244");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.contentType = "";
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response1);
        int int5 = response1.numRedirects;
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response1);
        response6.statusCode = 4;
        java.util.Map<java.lang.String, java.lang.String> strMap9 = response6.cookies();
        org.jsoup.Connection.Method method10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response11 = response6.method(method10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(strMap9);
    }

    @Test
    public void test00245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00245");
        javax.net.SocketFactory socketFactory0 = javax.net.ssl.SSLSocketFactory.getDefault();
        // The following exception was thrown during execution in test generation
        try {
            java.net.Socket socket3 = socketFactory0.createSocket("\\Qjava.nio.DirectByteBuffer[pos=35 lim=100 cap=100]\\E", 128);
            org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: \\Qjava.nio.DirectByteBuffer[pos=35 lim=100 cap=100]\\E");
        } catch (java.net.UnknownHostException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(socketFactory0);
    }

    @Test
    public void test00246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00246");
        java.util.regex.Pattern pattern2 = null; // flaky: java.util.regex.Pattern.compile("java.nio.DirectByteBuffer[pos=10 lim=100 cap=100]", (-24));
        org.jsoup.helper.HttpConnection.Response.xmlContentTypeRxp = pattern2;
        java.nio.ByteBuffer byteBuffer5 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer7 = byteBuffer5.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer9 = byteBuffer5.putInt(0);
        byte[] byteArray12 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer13 = byteBuffer9.put(byteArray12);
        java.nio.FloatBuffer floatBuffer14 = byteBuffer9.asFloatBuffer();
        java.nio.CharBuffer charBuffer15 = byteBuffer9.asCharBuffer();
        java.util.stream.Stream<java.lang.String> strStream16 = null; // flaky: pattern2.splitAsStream((java.lang.CharSequence) charBuffer15);
        java.nio.ByteBuffer byteBuffer18 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer20 = byteBuffer18.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer22 = byteBuffer18.putInt(0);
        byte[] byteArray25 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer26 = byteBuffer22.put(byteArray25);
        java.nio.FloatBuffer floatBuffer27 = byteBuffer22.asFloatBuffer();
        java.nio.CharBuffer charBuffer28 = byteBuffer22.asCharBuffer();
        java.lang.String[] strArray30 = null; // flaky: pattern2.split((java.lang.CharSequence) charBuffer28, (-65536));
        org.jsoup.helper.HttpConnection.Response.xmlContentTypeRxp = pattern2;
        java.lang.String str32 = null; // flaky: pattern2.pattern();
        java.util.function.Predicate<java.lang.String> strPredicate33 = null; // flaky: pattern2.asPredicate();
// flaky:         org.junit.Assert.assertNotNull(pattern2);
// flaky:         org.junit.Assert.assertEquals(pattern2.toString(), "java.nio.DirectByteBuffer[pos=10 lim=100 cap=100]");
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertNotNull(byteBuffer7);
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer13);
        org.junit.Assert.assertNotNull(floatBuffer14);
        org.junit.Assert.assertNotNull(charBuffer15);
// flaky:         org.junit.Assert.assertNotNull(strStream16);
        org.junit.Assert.assertNotNull(byteBuffer18);
        org.junit.Assert.assertNotNull(byteBuffer20);
        org.junit.Assert.assertNotNull(byteBuffer22);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer26);
        org.junit.Assert.assertNotNull(floatBuffer27);
        org.junit.Assert.assertNotNull(charBuffer28);
// flaky:         org.junit.Assert.assertNotNull(strArray30);
// flaky:         org.junit.Assert.assertEquals("'" + str32 + "' != '" + "java.nio.DirectByteBuffer[pos=10 lim=100 cap=100]" + "'", str32, "java.nio.DirectByteBuffer[pos=10 lim=100 cap=100]");
// flaky:         org.junit.Assert.assertNotNull(strPredicate33);
    }

    @Test
    public void test00247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00247");
        boolean boolean2 = java.util.regex.Pattern.matches("Location", (java.lang.CharSequence) "\\Qjava.nio.DirectByteBuffer[pos=35 lim=100 cap=100]\\E");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00248");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        long long2 = byteBuffer1.getLong();
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.compact();
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray4 = byteBuffer1.array();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(byteBuffer3);
    }

    @Test
    public void test00249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00249");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str4 = response2.getHeaderCaseInsensitive("");
        java.util.Map<java.lang.String, java.lang.String> strMap5 = response2.cookies();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response2);
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response2);
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response7);
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response7);
        response7.executed = true;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response12 = org.jsoup.helper.HttpConnection.Response.execute(request0, response7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(strMap5);
    }

    @Test
    public void test00250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00250");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer5 = byteBuffer1.putInt(0);
        byte[] byteArray8 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer9 = byteBuffer5.put(byteArray8);
        boolean boolean10 = byteBuffer5.hasArray();
        java.nio.ByteBuffer byteBuffer12 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer14 = byteBuffer12.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer16 = byteBuffer12.putInt(0);
        byte[] byteArray19 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer20 = byteBuffer16.put(byteArray19);
        java.nio.ByteBuffer byteBuffer22 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer24 = byteBuffer22.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer26 = byteBuffer22.putInt(0);
        byte[] byteArray29 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer30 = byteBuffer26.put(byteArray29);
        java.nio.ByteBuffer byteBuffer33 = byteBuffer16.get(byteArray29, 2, (int) (byte) 0);
        java.nio.ByteBuffer byteBuffer35 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer37 = byteBuffer35.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer39 = byteBuffer35.putInt(0);
        byte[] byteArray42 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer43 = byteBuffer39.put(byteArray42);
        java.nio.ByteBuffer byteBuffer45 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer47 = byteBuffer45.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer49 = byteBuffer45.putInt(0);
        byte[] byteArray52 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer53 = byteBuffer49.put(byteArray52);
        java.nio.ByteBuffer byteBuffer56 = byteBuffer39.get(byteArray52, 2, (int) (byte) 0);
        java.nio.ByteBuffer byteBuffer57 = byteBuffer33.put(byteArray52);
        java.nio.ByteBuffer byteBuffer58 = byteBuffer5.put(byteArray52);
        java.nio.LongBuffer longBuffer59 = byteBuffer58.asLongBuffer();
        java.lang.Class<?> wildcardClass60 = byteBuffer58.getClass();
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(byteBuffer12);
        org.junit.Assert.assertNotNull(byteBuffer14);
        org.junit.Assert.assertNotNull(byteBuffer16);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer20);
        org.junit.Assert.assertNotNull(byteBuffer22);
        org.junit.Assert.assertNotNull(byteBuffer24);
        org.junit.Assert.assertNotNull(byteBuffer26);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray29), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer30);
        org.junit.Assert.assertNotNull(byteBuffer33);
        org.junit.Assert.assertNotNull(byteBuffer35);
        org.junit.Assert.assertNotNull(byteBuffer37);
        org.junit.Assert.assertNotNull(byteBuffer39);
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray42), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer43);
        org.junit.Assert.assertNotNull(byteBuffer45);
        org.junit.Assert.assertNotNull(byteBuffer47);
        org.junit.Assert.assertNotNull(byteBuffer49);
        org.junit.Assert.assertNotNull(byteArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray52), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer53);
        org.junit.Assert.assertNotNull(byteBuffer56);
        org.junit.Assert.assertNotNull(byteBuffer57);
        org.junit.Assert.assertNotNull(byteBuffer58);
        org.junit.Assert.assertNotNull(longBuffer59);
        org.junit.Assert.assertNotNull(wildcardClass60);
    }

    @Test
    public void test00251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00251");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate((int) '4');
        java.nio.ShortBuffer shortBuffer2 = byteBuffer1.asShortBuffer();
        java.nio.ByteBuffer byteBuffer4 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        long long5 = byteBuffer4.getLong();
        int int6 = byteBuffer4.position();
        float float8 = byteBuffer4.getFloat((int) (short) 10);
        boolean boolean9 = byteBuffer4.hasArray();
        double double10 = byteBuffer4.getDouble();
        short short12 = byteBuffer4.getShort(0);
        java.nio.ByteBuffer byteBuffer14 = byteBuffer4.putDouble(100.0d);
        byte byte16 = byteBuffer14.get((int) (short) 0);
        java.nio.IntBuffer intBuffer17 = byteBuffer14.asIntBuffer();
        int int18 = byteBuffer1.compareTo(byteBuffer14);
        java.nio.FloatBuffer floatBuffer19 = byteBuffer14.asFloatBuffer();
        java.nio.ByteBuffer byteBuffer21 = byteBuffer14.put((byte) -1);
        java.nio.ByteBuffer byteBuffer24 = byteBuffer21.putShort(2, (short) (byte) 0);
        java.nio.FloatBuffer floatBuffer25 = byteBuffer24.asFloatBuffer();
        java.lang.Class<?> wildcardClass26 = floatBuffer25.getClass();
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(shortBuffer2);
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 0 + "'", short12 == (short) 0);
        org.junit.Assert.assertNotNull(byteBuffer14);
        org.junit.Assert.assertTrue("'" + byte16 + "' != '" + (byte) 0 + "'", byte16 == (byte) 0);
        org.junit.Assert.assertNotNull(intBuffer17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-24) + "'", int18 == (-24));
        org.junit.Assert.assertNotNull(floatBuffer19);
        org.junit.Assert.assertNotNull(byteBuffer21);
        org.junit.Assert.assertNotNull(byteBuffer24);
        org.junit.Assert.assertNotNull(floatBuffer25);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test00252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00252");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        long long2 = byteBuffer1.getLong();
        java.nio.ByteBuffer byteBuffer4 = byteBuffer1.putLong((long) 4);
        java.nio.ByteBuffer byteBuffer5 = byteBuffer4.asReadOnlyBuffer();
        java.nio.ByteBuffer byteBuffer7 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer9 = byteBuffer7.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer11 = byteBuffer7.putInt(0);
        byte[] byteArray14 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer15 = byteBuffer11.put(byteArray14);
        java.nio.ByteBuffer byteBuffer17 = byteBuffer15.put((byte) 10);
        java.nio.ByteOrder byteOrder18 = byteBuffer15.order();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer19 = byteBuffer5.put(byteBuffer15);
            org.junit.Assert.fail("Expected exception of type java.nio.ReadOnlyBufferException; message: null");
        } catch (java.nio.ReadOnlyBufferException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertNotNull(byteBuffer7);
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertNotNull(byteBuffer11);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer15);
        org.junit.Assert.assertNotNull(byteBuffer17);
        org.junit.Assert.assertNotNull(byteOrder18);
    }

    @Test
    public void test00253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00253");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.contentType = "";
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response1);
        int int5 = response1.numRedirects;
        int int6 = response1.statusCode();
        boolean boolean7 = response1.executed;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test00254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00254");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer5 = byteBuffer1.putInt(0);
        byte[] byteArray8 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer9 = byteBuffer5.put(byteArray8);
        java.nio.ByteOrder byteOrder10 = byteBuffer9.order();
        java.nio.ByteBuffer byteBuffer11 = byteBuffer9.duplicate();
        java.nio.ByteBuffer byteBuffer14 = byteBuffer11.putDouble(8, (double) 256);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.Buffer buffer15 = byteBuffer11.reset();
            org.junit.Assert.fail("Expected exception of type java.nio.InvalidMarkException; message: null");
        } catch (java.nio.InvalidMarkException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertNotNull(byteOrder10);
        org.junit.Assert.assertNotNull(byteBuffer11);
        org.junit.Assert.assertNotNull(byteBuffer14);
    }

    @Test
    public void test00255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00255");
        javax.net.SocketFactory socketFactory0 = javax.net.ssl.SSLSocketFactory.getDefault();
        java.net.Socket socket1 = socketFactory0.createSocket();
        java.net.Socket socket2 = socketFactory0.createSocket();
        java.net.InetAddress inetAddress3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.Socket socket5 = socketFactory0.createSocket(inetAddress3, (-24));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: port out of range:-24");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(socketFactory0);
        org.junit.Assert.assertNotNull(socket1);
        org.junit.Assert.assertEquals(socket1.toString(), "Socket[unconnected]");
        org.junit.Assert.assertNotNull(socket2);
        org.junit.Assert.assertEquals(socket2.toString(), "Socket[unconnected]");
    }

    @Test
    public void test00256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00256");
        javax.net.SocketFactory socketFactory0 = javax.net.ssl.SSLSocketFactory.getDefault();
        java.net.InetAddress inetAddress3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.Socket socket5 = socketFactory0.createSocket("\\QLocation\\E", (int) (short) 100, inetAddress3, (-10));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: port out of range:-10");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(socketFactory0);
    }

    @Test
    public void test00257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00257");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.contentType = "";
        java.lang.String str4 = response1.contentType;
        java.lang.String str5 = response1.charset;
        java.nio.ByteBuffer byteBuffer6 = response1.byteData;
        org.jsoup.Connection.Response response8 = response1.removeCookie("Location");
        response1.statusCode = (short) 10;
        response1.statusMessage = "hi!";
        org.jsoup.Connection.Response response14 = response1.removeCookie("java.nio.DirectByteBuffer[pos=8 lim=100 cap=100]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(byteBuffer6);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNotNull(response14);
    }

    @Test
    public void test00258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00258");
        java.util.regex.Pattern pattern2 = null; // flaky: java.util.regex.Pattern.compile("java.nio.DirectByteBuffer[pos=10 lim=100 cap=100]", (-24));
        org.jsoup.helper.HttpConnection.Response.xmlContentTypeRxp = pattern2;
        java.util.stream.Stream<java.lang.String> strStream5 = null; // flaky: pattern2.splitAsStream((java.lang.CharSequence) "java.nio.DirectByteBuffer[pos=8 lim=100 cap=100]");
        java.util.function.Predicate<java.lang.String> strPredicate6 = null; // flaky: pattern2.asPredicate();
        java.util.function.Predicate<java.lang.String> strPredicate7 = null; // flaky: pattern2.asPredicate();
        java.lang.String str8 = null; // flaky: pattern2.toString();
// flaky:         org.junit.Assert.assertNotNull(pattern2);
// flaky:         org.junit.Assert.assertEquals(pattern2.toString(), "java.nio.DirectByteBuffer[pos=10 lim=100 cap=100]");
// flaky:         org.junit.Assert.assertNotNull(strStream5);
// flaky:         org.junit.Assert.assertNotNull(strPredicate6);
// flaky:         org.junit.Assert.assertNotNull(strPredicate7);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "java.nio.DirectByteBuffer[pos=10 lim=100 cap=100]" + "'", str8, "java.nio.DirectByteBuffer[pos=10 lim=100 cap=100]");
    }

    @Test
    public void test00259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00259");
        byte[] byteArray1 = new byte[] { (byte) 66 };
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer4 = java.nio.ByteBuffer.wrap(byteArray1, 0, 64);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[66]");
    }

    @Test
    public void test00260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00260");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer5 = byteBuffer1.putInt(0);
        byte[] byteArray8 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer9 = byteBuffer5.put(byteArray8);
        java.nio.ByteBuffer byteBuffer11 = byteBuffer9.put((byte) 10);
        java.nio.ByteOrder byteOrder12 = byteBuffer9.order();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer15 = byteBuffer9.put((-65536), (byte) 66);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertNotNull(byteBuffer11);
        org.junit.Assert.assertNotNull(byteOrder12);
    }

    @Test
    public void test00261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00261");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.contentType = "";
        java.lang.String str4 = response1.contentType;
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry7 = response5.scanHeaders("hi!");
        org.jsoup.Connection.Method method8 = response5.method();
        org.jsoup.Connection.Response response10 = response5.removeHeader("java.nio.DirectByteBuffer[pos=10 lim=100 cap=100]");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = response5.cookie("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(strEntry7);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertNotNull(response10);
    }

    @Test
    public void test00262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00262");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer5 = byteBuffer1.putInt(0);
        byte[] byteArray8 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer9 = byteBuffer5.put(byteArray8);
        java.nio.FloatBuffer floatBuffer10 = byteBuffer5.asFloatBuffer();
        boolean boolean11 = byteBuffer5.isDirect();
        java.nio.ByteBuffer byteBuffer13 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer15 = byteBuffer13.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer17 = byteBuffer13.putInt(0);
        byte[] byteArray20 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer21 = byteBuffer17.put(byteArray20);
        org.jsoup.helper.HttpConnection.Response response22 = null;
        org.jsoup.helper.HttpConnection.Response response23 = new org.jsoup.helper.HttpConnection.Response(response22);
        response23.contentType = "";
        boolean boolean26 = byteBuffer21.equals((java.lang.Object) "");
        java.nio.ByteBuffer byteBuffer28 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer30 = byteBuffer28.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer32 = byteBuffer28.putInt(0);
        java.nio.ByteBuffer byteBuffer34 = byteBuffer32.putInt((int) '#');
        int int35 = byteBuffer21.compareTo(byteBuffer32);
        java.nio.ByteBuffer byteBuffer36 = byteBuffer5.put(byteBuffer32);
        java.nio.ByteBuffer byteBuffer37 = byteBuffer5.duplicate();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer39 = byteBuffer5.putFloat((float) 83);
            org.junit.Assert.fail("Expected exception of type java.nio.BufferOverflowException; message: null");
        } catch (java.nio.BufferOverflowException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertNotNull(floatBuffer10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(byteBuffer13);
        org.junit.Assert.assertNotNull(byteBuffer15);
        org.junit.Assert.assertNotNull(byteBuffer17);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer21);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(byteBuffer28);
        org.junit.Assert.assertNotNull(byteBuffer30);
        org.junit.Assert.assertNotNull(byteBuffer32);
        org.junit.Assert.assertNotNull(byteBuffer34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 2 + "'", int35 == 2);
        org.junit.Assert.assertNotNull(byteBuffer36);
        org.junit.Assert.assertNotNull(byteBuffer37);
    }

    @Test
    public void test00263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00263");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.contentType = "";
        java.lang.String str4 = response1.contentType;
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Request request6 = null;
        response5.req = request6;
        java.util.Map<java.lang.String, java.lang.String> strMap8 = response5.cookies();
        org.jsoup.Connection.Method method9 = response5.method();
        java.lang.String str10 = response5.contentType;
        java.net.URL uRL11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response12 = response5.url(uRL11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test00264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00264");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.putLong((long) '4');
        short short5 = byteBuffer1.getShort(0);
        java.nio.ByteBuffer byteBuffer8 = byteBuffer1.putChar(1, '4');
        java.nio.ByteBuffer byteBuffer10 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer12 = byteBuffer10.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer14 = byteBuffer10.putInt(0);
        byte[] byteArray17 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer18 = byteBuffer14.put(byteArray17);
        java.nio.ByteBuffer byteBuffer20 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer22 = byteBuffer20.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer24 = byteBuffer20.putInt(0);
        byte[] byteArray27 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer28 = byteBuffer24.put(byteArray27);
        java.nio.ByteBuffer byteBuffer31 = byteBuffer14.get(byteArray27, 2, (int) (byte) 0);
        java.nio.ByteBuffer byteBuffer33 = byteBuffer14.putDouble(100.0d);
        int int34 = byteBuffer8.compareTo(byteBuffer14);
        java.nio.ByteBuffer byteBuffer36 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer38 = byteBuffer36.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer40 = byteBuffer36.putInt(0);
        byte[] byteArray43 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer44 = byteBuffer40.put(byteArray43);
        java.nio.ByteOrder byteOrder45 = byteBuffer44.order();
        java.nio.ByteBuffer byteBuffer46 = byteBuffer14.order(byteOrder45);
        java.nio.ByteBuffer byteBuffer47 = byteBuffer14.slice();
        java.nio.ByteBuffer byteBuffer49 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer51 = byteBuffer49.putLong((long) '4');
        int int53 = byteBuffer51.getInt((int) (short) 1);
        java.nio.ByteBuffer byteBuffer55 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer57 = byteBuffer55.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer59 = byteBuffer55.putInt(0);
        byte[] byteArray62 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer63 = byteBuffer59.put(byteArray62);
        java.nio.ByteBuffer byteBuffer65 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer67 = byteBuffer65.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer69 = byteBuffer65.putInt(0);
        byte[] byteArray72 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer73 = byteBuffer69.put(byteArray72);
        java.nio.ByteBuffer byteBuffer76 = byteBuffer59.get(byteArray72, 2, (int) (byte) 0);
        java.nio.ByteBuffer byteBuffer77 = byteBuffer51.get(byteArray72);
        java.nio.ByteBuffer byteBuffer78 = byteBuffer14.get(byteArray72);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer81 = java.nio.ByteBuffer.wrap(byteArray72, (-24), 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 0 + "'", short5 == (short) 0);
        org.junit.Assert.assertNotNull(byteBuffer8);
        org.junit.Assert.assertNotNull(byteBuffer10);
        org.junit.Assert.assertNotNull(byteBuffer12);
        org.junit.Assert.assertNotNull(byteBuffer14);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer18);
        org.junit.Assert.assertNotNull(byteBuffer20);
        org.junit.Assert.assertNotNull(byteBuffer22);
        org.junit.Assert.assertNotNull(byteBuffer24);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer28);
        org.junit.Assert.assertNotNull(byteBuffer31);
        org.junit.Assert.assertNotNull(byteBuffer33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 14 + "'", int34 == 14);
        org.junit.Assert.assertNotNull(byteBuffer36);
        org.junit.Assert.assertNotNull(byteBuffer38);
        org.junit.Assert.assertNotNull(byteBuffer40);
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray43), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer44);
        org.junit.Assert.assertNotNull(byteOrder45);
        org.junit.Assert.assertNotNull(byteBuffer46);
        org.junit.Assert.assertNotNull(byteBuffer47);
        org.junit.Assert.assertNotNull(byteBuffer49);
        org.junit.Assert.assertNotNull(byteBuffer51);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertNotNull(byteBuffer55);
        org.junit.Assert.assertNotNull(byteBuffer57);
        org.junit.Assert.assertNotNull(byteBuffer59);
        org.junit.Assert.assertNotNull(byteArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray62), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer63);
        org.junit.Assert.assertNotNull(byteBuffer65);
        org.junit.Assert.assertNotNull(byteBuffer67);
        org.junit.Assert.assertNotNull(byteBuffer69);
        org.junit.Assert.assertNotNull(byteArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray72), "[0, 0]");
        org.junit.Assert.assertNotNull(byteBuffer73);
        org.junit.Assert.assertNotNull(byteBuffer76);
        org.junit.Assert.assertNotNull(byteBuffer77);
        org.junit.Assert.assertNotNull(byteBuffer78);
    }

    @Test
    public void test00265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00265");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response6 = response1.header("hi!", "");
        java.net.URL uRL7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response8 = response1.url(uRL7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response6);
    }

    @Test
    public void test00266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00266");
        javax.net.SocketFactory socketFactory0 = javax.net.ssl.SSLSocketFactory.getDefault();
        java.net.Socket socket1 = socketFactory0.createSocket();
        java.net.Socket socket2 = socketFactory0.createSocket();
        java.net.InetAddress inetAddress3 = null;
        java.net.InetAddress inetAddress5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.Socket socket7 = socketFactory0.createSocket(inetAddress3, 24, inetAddress5, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.net.BindException; message: Permission denied (Bind failed)");
        } catch (java.net.BindException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(socketFactory0);
        org.junit.Assert.assertNotNull(socket1);
        org.junit.Assert.assertEquals(socket1.toString(), "Socket[unconnected]");
        org.junit.Assert.assertNotNull(socket2);
        org.junit.Assert.assertEquals(socket2.toString(), "Socket[unconnected]");
    }

    @Test
    public void test00267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00267");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer5 = byteBuffer1.putInt(0);
        byte[] byteArray8 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer9 = byteBuffer5.put(byteArray8);
        java.nio.FloatBuffer floatBuffer10 = byteBuffer5.asFloatBuffer();
        boolean boolean11 = byteBuffer5.isDirect();
        java.nio.ByteBuffer byteBuffer13 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer15 = byteBuffer13.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer17 = byteBuffer13.putInt(0);
        byte[] byteArray20 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer21 = byteBuffer17.put(byteArray20);
        org.jsoup.helper.HttpConnection.Response response22 = null;
        org.jsoup.helper.HttpConnection.Response response23 = new org.jsoup.helper.HttpConnection.Response(response22);
        response23.contentType = "";
        boolean boolean26 = byteBuffer21.equals((java.lang.Object) "");
        java.nio.ByteBuffer byteBuffer28 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer30 = byteBuffer28.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer32 = byteBuffer28.putInt(0);
        java.nio.ByteBuffer byteBuffer34 = byteBuffer32.putInt((int) '#');
        int int35 = byteBuffer21.compareTo(byteBuffer32);
        java.nio.ByteBuffer byteBuffer36 = byteBuffer5.put(byteBuffer32);
        java.nio.ByteBuffer byteBuffer37 = byteBuffer5.duplicate();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer40 = byteBuffer37.putFloat((int) (byte) 100, (float) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertNotNull(floatBuffer10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(byteBuffer13);
        org.junit.Assert.assertNotNull(byteBuffer15);
        org.junit.Assert.assertNotNull(byteBuffer17);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer21);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(byteBuffer28);
        org.junit.Assert.assertNotNull(byteBuffer30);
        org.junit.Assert.assertNotNull(byteBuffer32);
        org.junit.Assert.assertNotNull(byteBuffer34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 2 + "'", int35 == 2);
        org.junit.Assert.assertNotNull(byteBuffer36);
        org.junit.Assert.assertNotNull(byteBuffer37);
    }

    @Test
    public void test00268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00268");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        response2.contentType = "";
        java.lang.String str5 = response2.contentType;
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response2);
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry8 = response6.scanHeaders("hi!");
        org.jsoup.Connection.Method method9 = response6.method();
        org.jsoup.Connection.Response response11 = response6.removeHeader("java.nio.DirectByteBuffer[pos=10 lim=100 cap=100]");
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response6);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response13 = org.jsoup.helper.HttpConnection.Response.execute(request0, response6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(strEntry8);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertNotNull(response11);
    }

    @Test
    public void test00269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00269");
        org.jsoup.helper.HttpConnection.Response.LOCATION = "\\Qhi!\\E";
    }

    @Test
    public void test00270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00270");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.contentType = "";
        java.lang.String str4 = response1.contentType;
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry7 = response5.scanHeaders("hi!");
        java.net.URL uRL8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response9 = response5.url(uRL8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(strEntry7);
    }

    @Test
    public void test00271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00271");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.contentType = "";
        java.lang.String str4 = response1.contentType;
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry7 = response5.scanHeaders("hi!");
        java.lang.String str8 = response5.statusMessage;
        org.jsoup.Connection.Request request9 = response5.req;
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray10 = response5.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(strEntry7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(request9);
    }

    @Test
    public void test00272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00272");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str4 = response2.getHeaderCaseInsensitive("");
        java.util.Map<java.lang.String, java.lang.String> strMap5 = response2.cookies();
        org.jsoup.Connection.Response response7 = response2.removeCookie("hi!");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry9 = response2.scanHeaders("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response10 = org.jsoup.helper.HttpConnection.Response.execute(request0, response2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(strEntry9);
    }

    @Test
    public void test00273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00273");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer5 = byteBuffer1.putInt(0);
        java.nio.ByteBuffer byteBuffer8 = byteBuffer5.putDouble((int) (byte) 1, (double) 1L);
        java.nio.ByteBuffer byteBuffer10 = byteBuffer5.putChar(' ');
        java.nio.ByteBuffer byteBuffer13 = byteBuffer10.putFloat(10, (float) (short) 100);
        java.nio.ByteBuffer byteBuffer15 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        long long16 = byteBuffer15.getLong();
        int int17 = byteBuffer15.position();
        float float19 = byteBuffer15.getFloat((int) (short) 10);
        boolean boolean20 = byteBuffer15.hasArray();
        double double21 = byteBuffer15.getDouble();
        short short23 = byteBuffer15.getShort(0);
        java.nio.ByteBuffer byteBuffer25 = byteBuffer15.putDouble(100.0d);
        boolean boolean26 = byteBuffer15.isDirect();
        int int27 = byteBuffer13.compareTo(byteBuffer15);
        float float28 = byteBuffer13.getFloat();
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertNotNull(byteBuffer8);
        org.junit.Assert.assertNotNull(byteBuffer10);
        org.junit.Assert.assertNotNull(byteBuffer13);
        org.junit.Assert.assertNotNull(byteBuffer15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 8 + "'", int17 == 8);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 0.0f + "'", float19 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + short23 + "' != '" + (short) 0 + "'", short23 == (short) 0);
        org.junit.Assert.assertNotNull(byteBuffer25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10 + "'", int27 == 10);
        org.junit.Assert.assertTrue("'" + float28 + "' != '" + 0.0f + "'", float28 == 0.0f);
    }

    @Test
    public void test00274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00274");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer5 = byteBuffer1.putInt(0);
        short short6 = byteBuffer5.getShort();
        java.nio.IntBuffer intBuffer7 = byteBuffer5.asIntBuffer();
        java.nio.ByteBuffer byteBuffer9 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        long long10 = byteBuffer9.getLong();
        int int11 = byteBuffer9.position();
        float float13 = byteBuffer9.getFloat((int) (short) 10);
        boolean boolean14 = byteBuffer9.hasArray();
        double double15 = byteBuffer9.getDouble();
        short short17 = byteBuffer9.getShort(0);
        java.nio.ByteBuffer byteBuffer19 = byteBuffer9.putDouble(100.0d);
        org.jsoup.helper.HttpConnection.Response response20 = null;
        org.jsoup.helper.HttpConnection.Response response21 = new org.jsoup.helper.HttpConnection.Response(response20);
        java.lang.String str23 = response21.getHeaderCaseInsensitive("");
        java.util.Map<java.lang.String, java.lang.String> strMap24 = response21.cookies();
        org.jsoup.Connection.Response response26 = response21.removeCookie("hi!");
        java.lang.String str27 = response21.statusMessage();
        java.nio.ByteBuffer byteBuffer29 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer31 = byteBuffer29.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer33 = byteBuffer29.putInt(0);
        byte[] byteArray36 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer37 = byteBuffer33.put(byteArray36);
        boolean boolean38 = byteBuffer33.hasArray();
        response21.byteData = byteBuffer33;
        int int40 = byteBuffer19.compareTo(byteBuffer33);
        int int41 = byteBuffer5.compareTo(byteBuffer33);
        java.nio.Buffer buffer42 = byteBuffer33.rewind();
        java.nio.Buffer buffer44 = buffer42.position(12);
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 0 + "'", short6 == (short) 0);
        org.junit.Assert.assertNotNull(intBuffer7);
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 8 + "'", int11 == 8);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 0.0f + "'", float13 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + short17 + "' != '" + (short) 0 + "'", short17 == (short) 0);
        org.junit.Assert.assertNotNull(byteBuffer19);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(strMap24);
        org.junit.Assert.assertNotNull(response26);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(byteBuffer29);
        org.junit.Assert.assertNotNull(byteBuffer31);
        org.junit.Assert.assertNotNull(byteBuffer33);
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray36), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-10) + "'", int40 == (-10));
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(buffer42);
        org.junit.Assert.assertNotNull(buffer44);
    }

    @Test
    public void test00275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00275");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate((int) (short) 0);
        java.nio.ByteBuffer byteBuffer2 = byteBuffer1.duplicate();
        // The following exception was thrown during execution in test generation
        try {
            double double3 = byteBuffer1.getDouble();
            org.junit.Assert.fail("Expected exception of type java.nio.BufferUnderflowException; message: null");
        } catch (java.nio.BufferUnderflowException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteBuffer2);
    }

    @Test
    public void test00276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00276");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.contentType = "";
        java.lang.String str4 = response1.contentType;
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response5);
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response6);
        response6.contentType = "hi!";
        java.net.URL uRL10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response11 = response6.url(uRL10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test00277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00277");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.contentType = "";
        java.lang.String str4 = response1.contentType;
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry7 = response5.scanHeaders("hi!");
        org.jsoup.Connection.Method method8 = response5.method();
        org.jsoup.Connection.Response response10 = response5.removeHeader("java.nio.DirectByteBuffer[pos=10 lim=100 cap=100]");
        int int11 = response5.statusCode;
        int int12 = response5.statusCode();
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray13 = response5.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(strEntry7);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test00278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00278");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.putLong((long) '4');
        short short5 = byteBuffer1.getShort(0);
        int int6 = byteBuffer1.capacity();
        java.nio.ByteBuffer byteBuffer8 = byteBuffer1.put((byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray9 = byteBuffer8.array();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 0 + "'", short5 == (short) 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertNotNull(byteBuffer8);
    }

    @Test
    public void test00279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00279");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.contentType = "";
        java.lang.String str5 = response1.cookie("hi!");
        int int6 = response1.statusCode();
        org.jsoup.Connection.Request request7 = response1.req;
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response1);
        int int9 = response1.numRedirects;
        org.jsoup.Connection.Response response11 = response1.removeHeader("java.nio.DirectByteBuffer[pos=22 lim=100 cap=100]");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(request7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(response11);
    }

    @Test
    public void test00280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00280");
        javax.net.SocketFactory socketFactory0 = javax.net.ssl.SSLSocketFactory.getDefault();
        java.net.Socket socket1 = socketFactory0.createSocket();
        java.net.Socket socket2 = socketFactory0.createSocket();
        java.net.Socket socket3 = socketFactory0.createSocket();
        // The following exception was thrown during execution in test generation
        try {
            java.net.Socket socket6 = socketFactory0.createSocket("java.nio.DirectByteBuffer[pos=10 lim=100 cap=100]", (int) '4');
            org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: java.nio.DirectByteBuffer[pos=10 lim=100 cap=100]");
        } catch (java.net.UnknownHostException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(socketFactory0);
        org.junit.Assert.assertNotNull(socket1);
        org.junit.Assert.assertEquals(socket1.toString(), "Socket[unconnected]");
        org.junit.Assert.assertNotNull(socket2);
        org.junit.Assert.assertEquals(socket2.toString(), "Socket[unconnected]");
        org.junit.Assert.assertNotNull(socket3);
        org.junit.Assert.assertEquals(socket3.toString(), "Socket[unconnected]");
    }

    @Test
    public void test00281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00281");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        response2.contentType = "";
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response2);
        java.lang.String str7 = response5.getHeaderCaseInsensitive("hi!");
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response5);
        response8.executed = true;
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response8);
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response8);
        org.jsoup.Connection.Request request13 = response12.req;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry15 = response12.scanHeaders("java.nio.DirectByteBuffer[pos=24 lim=100 cap=100]");
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response12);
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response16);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response18 = org.jsoup.helper.HttpConnection.Response.execute(request0, response17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(request13);
        org.junit.Assert.assertNull(strEntry15);
    }

    @Test
    public void test00282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00282");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.contentType = "";
        java.lang.String str4 = response1.contentType;
        response1.executed = true;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry8 = response1.scanHeaders("");
        java.lang.String str10 = response1.getHeaderCaseInsensitive("Location");
        java.lang.String str11 = response1.charset();
        response1.charset = "java.nio.DirectByteBuffer[pos=10 lim=100 cap=100]";
        java.net.URL uRL14 = response1.url();
        java.net.HttpURLConnection httpURLConnection15 = null;
        org.jsoup.helper.HttpConnection.Response response16 = null;
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response16);
        java.lang.String str19 = response17.getHeaderCaseInsensitive("");
        java.util.Map<java.lang.String, java.lang.String> strMap20 = response17.cookies();
        org.jsoup.helper.HttpConnection.Response response21 = new org.jsoup.helper.HttpConnection.Response(response17);
        org.jsoup.helper.HttpConnection.Response response22 = new org.jsoup.helper.HttpConnection.Response(response17);
        java.net.URL uRL23 = response17.url();
        org.jsoup.Connection.Method method24 = response17.method();
        // The following exception was thrown during execution in test generation
        try {
            response1.setupFromConnection(httpURLConnection15, (org.jsoup.Connection.Response) response17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(strEntry8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(uRL14);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(strMap20);
        org.junit.Assert.assertNull(uRL23);
        org.junit.Assert.assertNull(method24);
    }

    @Test
    public void test00283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00283");
        org.jsoup.helper.HttpConnection.Response.MAX_REDIRECTS = 83;
    }

    @Test
    public void test00284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00284");
        javax.net.SocketFactory socketFactory0 = javax.net.ssl.SSLSocketFactory.getDefault();
        java.net.Socket socket1 = socketFactory0.createSocket();
        java.net.Socket socket2 = socketFactory0.createSocket();
        java.net.Socket socket3 = socketFactory0.createSocket();
        java.net.InetAddress inetAddress6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.Socket socket8 = socketFactory0.createSocket("Location", 12, inetAddress6, 128);
            org.junit.Assert.fail("Expected exception of type java.net.BindException; message: Permission denied (Bind failed)");
        } catch (java.net.BindException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(socketFactory0);
        org.junit.Assert.assertNotNull(socket1);
        org.junit.Assert.assertEquals(socket1.toString(), "Socket[unconnected]");
        org.junit.Assert.assertNotNull(socket2);
        org.junit.Assert.assertEquals(socket2.toString(), "Socket[unconnected]");
        org.junit.Assert.assertNotNull(socket3);
        org.junit.Assert.assertEquals(socket3.toString(), "Socket[unconnected]");
    }

    @Test
    public void test00285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00285");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        long long2 = byteBuffer1.getLong();
        int int3 = byteBuffer1.position();
        float float5 = byteBuffer1.getFloat((int) (short) 10);
        boolean boolean6 = byteBuffer1.hasArray();
        double double7 = byteBuffer1.getDouble();
        java.nio.ByteBuffer byteBuffer10 = byteBuffer1.putFloat(0, (float) (short) 10);
        java.nio.CharBuffer charBuffer11 = byteBuffer1.asCharBuffer();
        java.nio.Buffer buffer12 = byteBuffer1.flip();
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(byteBuffer10);
        org.junit.Assert.assertNotNull(charBuffer11);
        org.junit.Assert.assertNotNull(buffer12);
    }

    @Test
    public void test00286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00286");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer5 = byteBuffer1.putInt(0);
        java.nio.Buffer buffer7 = byteBuffer1.limit(32);
        java.nio.CharBuffer charBuffer8 = byteBuffer1.asCharBuffer();
        java.lang.Class<?> wildcardClass9 = byteBuffer1.getClass();
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertNotNull(buffer7);
        org.junit.Assert.assertNotNull(charBuffer8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00287");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        long long2 = byteBuffer1.getLong();
        int int3 = byteBuffer1.position();
        float float5 = byteBuffer1.getFloat((int) (short) 10);
        boolean boolean6 = byteBuffer1.hasArray();
        double double7 = byteBuffer1.getDouble();
        java.nio.IntBuffer intBuffer8 = byteBuffer1.asIntBuffer();
        float float9 = byteBuffer1.getFloat();
        // The following exception was thrown during execution in test generation
        try {
            long long11 = byteBuffer1.getLong((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(intBuffer8);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.0f + "'", float9 == 0.0f);
    }

    @Test
    public void test00288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00288");
        javax.net.SocketFactory socketFactory0 = javax.net.ssl.SSLSocketFactory.getDefault();
        java.net.Socket socket1 = socketFactory0.createSocket();
        java.net.Socket socket2 = socketFactory0.createSocket();
        java.net.Socket socket3 = socketFactory0.createSocket();
        java.net.InetAddress inetAddress4 = null;
        java.net.InetAddress inetAddress6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.Socket socket8 = socketFactory0.createSocket(inetAddress4, 0, inetAddress6, 4);
            org.junit.Assert.fail("Expected exception of type java.net.BindException; message: Permission denied (Bind failed)");
        } catch (java.net.BindException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(socketFactory0);
        org.junit.Assert.assertNotNull(socket1);
        org.junit.Assert.assertEquals(socket1.toString(), "Socket[unconnected]");
        org.junit.Assert.assertNotNull(socket2);
        org.junit.Assert.assertEquals(socket2.toString(), "Socket[unconnected]");
        org.junit.Assert.assertNotNull(socket3);
        org.junit.Assert.assertEquals(socket3.toString(), "Socket[unconnected]");
    }

    @Test
    public void test00289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00289");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.putLong((long) '4');
        short short5 = byteBuffer1.getShort(0);
        java.nio.ByteBuffer byteBuffer8 = byteBuffer1.putChar(1, '4');
        java.nio.ByteBuffer byteBuffer11 = byteBuffer8.put((int) (short) 10, (byte) 1);
        char char13 = byteBuffer8.getChar((int) '4');
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 0 + "'", short5 == (short) 0);
        org.junit.Assert.assertNotNull(byteBuffer8);
        org.junit.Assert.assertNotNull(byteBuffer11);
        org.junit.Assert.assertTrue("'" + char13 + "' != '" + '\000' + "'", char13 == '\000');
    }

    @Test
    public void test00290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00290");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        long long2 = byteBuffer1.getLong();
        byte byte4 = byteBuffer1.get((int) '4');
        java.nio.ByteBuffer byteBuffer6 = byteBuffer1.putInt((int) (short) 0);
        java.nio.ByteBuffer byteBuffer7 = byteBuffer6.duplicate();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.Buffer buffer8 = byteBuffer6.reset();
            org.junit.Assert.fail("Expected exception of type java.nio.InvalidMarkException; message: null");
        } catch (java.nio.InvalidMarkException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 0 + "'", byte4 == (byte) 0);
        org.junit.Assert.assertNotNull(byteBuffer6);
        org.junit.Assert.assertNotNull(byteBuffer7);
    }

    @Test
    public void test00291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00291");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        java.util.Map<java.lang.String, java.lang.String> strMap4 = response1.cookies();
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response6);
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response6);
        org.jsoup.Connection.Response response10 = response6.removeCookie("Location");
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response6);
        boolean boolean12 = response11.executed;
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray13 = response11.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test00292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00292");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.putLong((long) '4');
        short short5 = byteBuffer1.getShort(0);
        java.nio.ByteBuffer byteBuffer8 = byteBuffer1.putDouble((int) '\n', 2.57E-322d);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.Buffer buffer10 = byteBuffer8.limit((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 0 + "'", short5 == (short) 0);
        org.junit.Assert.assertNotNull(byteBuffer8);
    }

    @Test
    public void test00293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00293");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        long long2 = byteBuffer1.getLong();
        int int3 = byteBuffer1.position();
        float float5 = byteBuffer1.getFloat((int) (short) 10);
        boolean boolean6 = byteBuffer1.hasArray();
        double double7 = byteBuffer1.getDouble();
        short short9 = byteBuffer1.getShort(0);
        java.nio.ByteBuffer byteBuffer11 = byteBuffer1.putDouble(100.0d);
        java.nio.ByteBuffer byteBuffer14 = byteBuffer1.put(32, (byte) 100);
        java.nio.ByteBuffer byteBuffer15 = byteBuffer14.duplicate();
        java.nio.ByteBuffer byteBuffer16 = byteBuffer14.slice();
        // The following exception was thrown during execution in test generation
        try {
            int int17 = byteBuffer16.arrayOffset();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 0 + "'", short9 == (short) 0);
        org.junit.Assert.assertNotNull(byteBuffer11);
        org.junit.Assert.assertNotNull(byteBuffer14);
        org.junit.Assert.assertNotNull(byteBuffer15);
        org.junit.Assert.assertNotNull(byteBuffer16);
    }

    @Test
    public void test00294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00294");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str4 = response2.getHeaderCaseInsensitive("");
        java.util.Map<java.lang.String, java.lang.String> strMap5 = response2.cookies();
        org.jsoup.Connection.Response response7 = response2.removeCookie("hi!");
        java.lang.String str8 = response2.statusMessage();
        java.nio.ByteBuffer byteBuffer10 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer12 = byteBuffer10.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer14 = byteBuffer10.putInt(0);
        byte[] byteArray17 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer18 = byteBuffer14.put(byteArray17);
        boolean boolean19 = byteBuffer14.hasArray();
        response2.byteData = byteBuffer14;
        org.jsoup.helper.HttpConnection.Response response21 = new org.jsoup.helper.HttpConnection.Response(response2);
        boolean boolean22 = response21.executed;
        org.jsoup.helper.HttpConnection.Response response23 = new org.jsoup.helper.HttpConnection.Response(response21);
        org.jsoup.helper.HttpConnection.Response response24 = new org.jsoup.helper.HttpConnection.Response(response21);
        org.jsoup.helper.HttpConnection.Response response25 = new org.jsoup.helper.HttpConnection.Response(response21);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response26 = org.jsoup.helper.HttpConnection.Response.execute(request0, response25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(byteBuffer10);
        org.junit.Assert.assertNotNull(byteBuffer12);
        org.junit.Assert.assertNotNull(byteBuffer14);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test00295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00295");
        org.jsoup.helper.HttpConnection.Response.LOCATION = "java.nio.DirectByteBuffer[pos=8 lim=100 cap=100]";
    }

    @Test
    public void test00296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00296");
        java.util.regex.Pattern pattern2 = java.util.regex.Pattern.compile("hi!", (int) (short) 10);
        java.util.regex.Pattern pattern3 = org.jsoup.helper.HttpConnection.Response.xmlContentTypeRxp;
        org.jsoup.helper.HttpConnection.Response.xmlContentTypeRxp = pattern3;
        java.nio.ByteBuffer byteBuffer6 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.CharBuffer charBuffer7 = byteBuffer6.asCharBuffer();
        java.util.stream.Stream<java.lang.String> strStream8 = null; // flaky: pattern3.splitAsStream((java.lang.CharSequence) charBuffer7);
        java.util.regex.Matcher matcher9 = pattern2.matcher((java.lang.CharSequence) charBuffer7);
        java.util.regex.Matcher matcher11 = pattern2.matcher((java.lang.CharSequence) "java.nio.DirectByteBuffer[pos=22 lim=100 cap=100]");
        java.util.stream.Stream<java.lang.String> strStream13 = pattern2.splitAsStream((java.lang.CharSequence) "Location");
        java.lang.String str14 = pattern2.toString();
        org.junit.Assert.assertNotNull(pattern2);
        org.junit.Assert.assertEquals(pattern2.toString(), "hi!");
// flaky:         org.junit.Assert.assertNotNull(pattern3);
// flaky:         org.junit.Assert.assertEquals(pattern3.toString(), "java.nio.DirectByteBuffer[pos=10 lim=100 cap=100]");
        org.junit.Assert.assertNotNull(byteBuffer6);
        org.junit.Assert.assertNotNull(charBuffer7);
// flaky:         org.junit.Assert.assertNotNull(strStream8);
        org.junit.Assert.assertNotNull(matcher9);
        org.junit.Assert.assertEquals(matcher9.toString(), "java.util.regex.Matcher[pattern=hi! region=0,50 lastmatch=]");
        org.junit.Assert.assertNotNull(matcher11);
        org.junit.Assert.assertEquals(matcher11.toString(), "java.util.regex.Matcher[pattern=hi! region=0,49 lastmatch=]");
        org.junit.Assert.assertNotNull(strStream13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test00297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00297");
        java.util.regex.Pattern pattern0 = org.jsoup.helper.HttpConnection.Response.xmlContentTypeRxp;
        org.jsoup.helper.HttpConnection.Response.xmlContentTypeRxp = pattern0;
        java.lang.String[] strArray3 = null; // flaky: pattern0.split((java.lang.CharSequence) "");
// flaky:         org.junit.Assert.assertNotNull(pattern0);
// flaky:         org.junit.Assert.assertEquals(pattern0.toString(), "java.nio.DirectByteBuffer[pos=10 lim=100 cap=100]");
// flaky:         org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test00298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00298");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        java.util.Map<java.lang.String, java.lang.String> strMap4 = response1.cookies();
        org.jsoup.Connection.Response response6 = response1.removeCookie("hi!");
        java.lang.String str7 = response1.statusMessage();
        java.nio.ByteBuffer byteBuffer9 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer11 = byteBuffer9.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer13 = byteBuffer9.putInt(0);
        byte[] byteArray16 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer17 = byteBuffer13.put(byteArray16);
        boolean boolean18 = byteBuffer13.hasArray();
        response1.byteData = byteBuffer13;
        org.jsoup.helper.HttpConnection.Response response20 = new org.jsoup.helper.HttpConnection.Response(response1);
        boolean boolean21 = response20.executed;
        org.jsoup.helper.HttpConnection.Response response22 = new org.jsoup.helper.HttpConnection.Response(response20);
        org.jsoup.helper.HttpConnection.Response response23 = new org.jsoup.helper.HttpConnection.Response(response20);
        boolean boolean25 = response23.hasCookie("java.nio.DirectByteBuffer[pos=35 lim=100 cap=100]");
        org.jsoup.helper.HttpConnection.Response response26 = new org.jsoup.helper.HttpConnection.Response(response23);
        java.lang.String str27 = response23.statusMessage;
        org.jsoup.helper.HttpConnection.Response response28 = new org.jsoup.helper.HttpConnection.Response(response23);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str29 = response28.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertNotNull(byteBuffer11);
        org.junit.Assert.assertNotNull(byteBuffer13);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(str27);
    }

    @Test
    public void test00299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00299");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        long long2 = byteBuffer1.getLong();
        int int3 = byteBuffer1.position();
        float float5 = byteBuffer1.getFloat((int) (short) 10);
        boolean boolean6 = byteBuffer1.hasArray();
        double double7 = byteBuffer1.getDouble();
        short short9 = byteBuffer1.getShort(0);
        java.nio.ByteBuffer byteBuffer11 = byteBuffer1.putDouble(100.0d);
        float float12 = byteBuffer1.getFloat();
        java.nio.ByteBuffer byteBuffer15 = byteBuffer1.putShort(24, (short) (byte) -1);
        java.nio.ByteBuffer byteBuffer17 = byteBuffer1.putInt(8);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer20 = byteBuffer17.putFloat(128, (float) '\000');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 0 + "'", short9 == (short) 0);
        org.junit.Assert.assertNotNull(byteBuffer11);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.0f + "'", float12 == 0.0f);
        org.junit.Assert.assertNotNull(byteBuffer15);
        org.junit.Assert.assertNotNull(byteBuffer17);
    }

    @Test
    public void test00300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00300");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.putLong((long) '4');
        float float5 = byteBuffer3.getFloat(32);
        boolean boolean6 = byteBuffer3.isDirect();
        java.util.regex.Pattern pattern9 = java.util.regex.Pattern.compile("hi!", (int) (short) 10);
        java.util.function.Predicate<java.lang.String> strPredicate10 = pattern9.asPredicate();
        boolean boolean11 = byteBuffer3.equals((java.lang.Object) pattern9);
        java.util.regex.Pattern pattern15 = null; // flaky: java.util.regex.Pattern.compile("java.nio.DirectByteBuffer[pos=10 lim=100 cap=100]", (-24));
        org.jsoup.helper.HttpConnection.Response.xmlContentTypeRxp = pattern15;
        java.nio.ByteBuffer byteBuffer18 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer20 = byteBuffer18.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer22 = byteBuffer18.putInt(0);
        byte[] byteArray25 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer26 = byteBuffer22.put(byteArray25);
        java.nio.FloatBuffer floatBuffer27 = byteBuffer22.asFloatBuffer();
        java.nio.CharBuffer charBuffer28 = byteBuffer22.asCharBuffer();
        java.util.stream.Stream<java.lang.String> strStream29 = null; // flaky: pattern15.splitAsStream((java.lang.CharSequence) charBuffer28);
        boolean boolean30 = java.util.regex.Pattern.matches("\\Qjava.nio.DirectByteBuffer[pos=24 lim=100 cap=100]\\E", (java.lang.CharSequence) charBuffer28);
        java.lang.String[] strArray31 = pattern9.split((java.lang.CharSequence) "\\Qjava.nio.DirectByteBuffer[pos=24 lim=100 cap=100]\\E");
        java.lang.String str32 = pattern9.toString();
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(pattern9);
        org.junit.Assert.assertEquals(pattern9.toString(), "hi!");
        org.junit.Assert.assertNotNull(strPredicate10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
// flaky:         org.junit.Assert.assertNotNull(pattern15);
// flaky:         org.junit.Assert.assertEquals(pattern15.toString(), "java.nio.DirectByteBuffer[pos=10 lim=100 cap=100]");
        org.junit.Assert.assertNotNull(byteBuffer18);
        org.junit.Assert.assertNotNull(byteBuffer20);
        org.junit.Assert.assertNotNull(byteBuffer22);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer26);
        org.junit.Assert.assertNotNull(floatBuffer27);
        org.junit.Assert.assertNotNull(charBuffer28);
// flaky:         org.junit.Assert.assertNotNull(strStream29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
    }

    @Test
    public void test00301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00301");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer5 = byteBuffer1.putInt(0);
        short short6 = byteBuffer5.getShort();
        java.nio.IntBuffer intBuffer7 = byteBuffer5.asIntBuffer();
        double double8 = byteBuffer5.getDouble();
        java.nio.Buffer buffer9 = byteBuffer5.rewind();
        byte[] byteArray10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer13 = byteBuffer5.get(byteArray10, (int) (short) -1, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 0 + "'", short6 == (short) 0);
        org.junit.Assert.assertNotNull(intBuffer7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(buffer9);
    }

    @Test
    public void test00302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00302");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        response2.contentType = "";
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response2);
        int int6 = response2.numRedirects;
        int int7 = response2.statusCode();
        response2.contentType = "java.nio.DirectByteBuffer[pos=22 lim=100 cap=100]";
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response10 = org.jsoup.helper.HttpConnection.Response.execute(request0, response2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test00303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00303");
        javax.net.SocketFactory socketFactory0 = javax.net.ssl.SSLSocketFactory.getDefault();
        java.net.Socket socket1 = socketFactory0.createSocket();
        java.net.Socket socket2 = socketFactory0.createSocket();
        java.net.InetAddress inetAddress3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.Socket socket5 = socketFactory0.createSocket(inetAddress3, (-84));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: port out of range:-84");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(socketFactory0);
        org.junit.Assert.assertNotNull(socket1);
        org.junit.Assert.assertEquals(socket1.toString(), "Socket[unconnected]");
        org.junit.Assert.assertNotNull(socket2);
        org.junit.Assert.assertEquals(socket2.toString(), "Socket[unconnected]");
    }

    @Test
    public void test00304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00304");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        java.util.Map<java.lang.String, java.lang.String> strMap4 = response1.cookies();
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response6);
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response6);
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response6);
        boolean boolean12 = response6.hasHeaderWithValue("java.nio.DirectByteBuffer[pos=35 lim=100 cap=100]", "\\Qjava.nio.DirectByteBuffer[pos=24 lim=100 cap=100]\\E");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test00305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00305");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        long long2 = byteBuffer1.getLong();
        int int3 = byteBuffer1.position();
        float float5 = byteBuffer1.getFloat((int) (short) 10);
        boolean boolean6 = byteBuffer1.hasArray();
        double double7 = byteBuffer1.getDouble();
        short short9 = byteBuffer1.getShort(0);
        java.nio.ShortBuffer shortBuffer10 = byteBuffer1.asShortBuffer();
        java.nio.Buffer buffer12 = byteBuffer1.position((int) '#');
        java.lang.String str13 = byteBuffer1.toString();
        java.nio.ByteBuffer byteBuffer15 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer17 = byteBuffer15.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer19 = byteBuffer15.putInt(0);
        byte[] byteArray22 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer23 = byteBuffer19.put(byteArray22);
        java.nio.ByteBuffer byteBuffer25 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer27 = byteBuffer25.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer29 = byteBuffer25.putInt(0);
        byte[] byteArray32 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer33 = byteBuffer29.put(byteArray32);
        java.nio.ByteBuffer byteBuffer36 = byteBuffer19.get(byteArray32, 2, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer39 = byteBuffer1.get(byteArray32, 24, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 0 + "'", short9 == (short) 0);
        org.junit.Assert.assertNotNull(shortBuffer10);
        org.junit.Assert.assertNotNull(buffer12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "java.nio.DirectByteBuffer[pos=35 lim=100 cap=100]" + "'", str13, "java.nio.DirectByteBuffer[pos=35 lim=100 cap=100]");
        org.junit.Assert.assertNotNull(byteBuffer15);
        org.junit.Assert.assertNotNull(byteBuffer17);
        org.junit.Assert.assertNotNull(byteBuffer19);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer23);
        org.junit.Assert.assertNotNull(byteBuffer25);
        org.junit.Assert.assertNotNull(byteBuffer27);
        org.junit.Assert.assertNotNull(byteBuffer29);
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray32), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer33);
        org.junit.Assert.assertNotNull(byteBuffer36);
    }

    @Test
    public void test00306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00306");
        javax.net.SocketFactory socketFactory0 = javax.net.ssl.SSLSocketFactory.getDefault();
        java.net.Socket socket1 = socketFactory0.createSocket();
        java.net.Socket socket2 = socketFactory0.createSocket();
        java.net.InetAddress inetAddress3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.Socket socket5 = socketFactory0.createSocket(inetAddress3, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.net.ConnectException; message: Connection refused (Connection refused)");
        } catch (java.net.ConnectException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(socketFactory0);
        org.junit.Assert.assertNotNull(socket1);
        org.junit.Assert.assertEquals(socket1.toString(), "Socket[unconnected]");
        org.junit.Assert.assertNotNull(socket2);
        org.junit.Assert.assertEquals(socket2.toString(), "Socket[unconnected]");
    }

    @Test
    public void test00307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00307");
        javax.net.SocketFactory socketFactory0 = javax.net.ssl.SSLSocketFactory.getDefault();
        java.net.Socket socket1 = socketFactory0.createSocket();
        java.net.Socket socket2 = socketFactory0.createSocket();
        java.net.InetAddress inetAddress5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.Socket socket7 = socketFactory0.createSocket("java.nio.DirectByteBuffer[pos=24 lim=100 cap=100]", (int) (short) 0, inetAddress5, (-10));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: port out of range:-10");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(socketFactory0);
        org.junit.Assert.assertNotNull(socket1);
        org.junit.Assert.assertEquals(socket1.toString(), "Socket[unconnected]");
        org.junit.Assert.assertNotNull(socket2);
        org.junit.Assert.assertEquals(socket2.toString(), "Socket[unconnected]");
    }

    @Test
    public void test00308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00308");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer5 = byteBuffer1.putInt(0);
        java.nio.ByteBuffer byteBuffer8 = byteBuffer5.putDouble((int) (byte) 1, (double) 1L);
        java.nio.ByteBuffer byteBuffer10 = byteBuffer5.putChar('a');
        java.nio.ByteBuffer byteBuffer11 = byteBuffer10.asReadOnlyBuffer();
        byte byte12 = byteBuffer10.get();
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertNotNull(byteBuffer8);
        org.junit.Assert.assertNotNull(byteBuffer10);
        org.junit.Assert.assertNotNull(byteBuffer11);
        org.junit.Assert.assertTrue("'" + byte12 + "' != '" + (byte) 0 + "'", byte12 == (byte) 0);
    }

    @Test
    public void test00309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00309");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        java.util.Map<java.lang.String, java.lang.String> strMap4 = response1.cookies();
        org.jsoup.Connection.Response response6 = response1.removeCookie("hi!");
        java.lang.String str7 = response1.statusMessage();
        java.nio.ByteBuffer byteBuffer9 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer11 = byteBuffer9.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer13 = byteBuffer9.putInt(0);
        byte[] byteArray16 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer17 = byteBuffer13.put(byteArray16);
        boolean boolean18 = byteBuffer13.hasArray();
        response1.byteData = byteBuffer13;
        java.nio.ByteBuffer byteBuffer21 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer23 = byteBuffer21.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer25 = byteBuffer21.putInt(0);
        byte[] byteArray28 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer29 = byteBuffer25.put(byteArray28);
        boolean boolean30 = byteBuffer25.hasArray();
        java.nio.ByteBuffer byteBuffer32 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer34 = byteBuffer32.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer36 = byteBuffer32.putInt(0);
        byte[] byteArray39 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer40 = byteBuffer36.put(byteArray39);
        java.nio.ByteBuffer byteBuffer42 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer44 = byteBuffer42.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer46 = byteBuffer42.putInt(0);
        byte[] byteArray49 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer50 = byteBuffer46.put(byteArray49);
        java.nio.ByteBuffer byteBuffer53 = byteBuffer36.get(byteArray49, 2, (int) (byte) 0);
        java.nio.ByteBuffer byteBuffer55 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer57 = byteBuffer55.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer59 = byteBuffer55.putInt(0);
        byte[] byteArray62 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer63 = byteBuffer59.put(byteArray62);
        java.nio.ByteBuffer byteBuffer65 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer67 = byteBuffer65.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer69 = byteBuffer65.putInt(0);
        byte[] byteArray72 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer73 = byteBuffer69.put(byteArray72);
        java.nio.ByteBuffer byteBuffer76 = byteBuffer59.get(byteArray72, 2, (int) (byte) 0);
        java.nio.ByteBuffer byteBuffer77 = byteBuffer53.put(byteArray72);
        java.nio.ByteBuffer byteBuffer78 = byteBuffer25.put(byteArray72);
        response1.byteData = byteBuffer25;
        java.lang.String str80 = response1.charset();
        org.jsoup.helper.HttpConnection.Response response81 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.net.URL uRL82 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response83 = response81.url(uRL82);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertNotNull(byteBuffer11);
        org.junit.Assert.assertNotNull(byteBuffer13);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(byteBuffer21);
        org.junit.Assert.assertNotNull(byteBuffer23);
        org.junit.Assert.assertNotNull(byteBuffer25);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray28), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(byteBuffer32);
        org.junit.Assert.assertNotNull(byteBuffer34);
        org.junit.Assert.assertNotNull(byteBuffer36);
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray39), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer40);
        org.junit.Assert.assertNotNull(byteBuffer42);
        org.junit.Assert.assertNotNull(byteBuffer44);
        org.junit.Assert.assertNotNull(byteBuffer46);
        org.junit.Assert.assertNotNull(byteArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray49), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer50);
        org.junit.Assert.assertNotNull(byteBuffer53);
        org.junit.Assert.assertNotNull(byteBuffer55);
        org.junit.Assert.assertNotNull(byteBuffer57);
        org.junit.Assert.assertNotNull(byteBuffer59);
        org.junit.Assert.assertNotNull(byteArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray62), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer63);
        org.junit.Assert.assertNotNull(byteBuffer65);
        org.junit.Assert.assertNotNull(byteBuffer67);
        org.junit.Assert.assertNotNull(byteBuffer69);
        org.junit.Assert.assertNotNull(byteArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray72), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer73);
        org.junit.Assert.assertNotNull(byteBuffer76);
        org.junit.Assert.assertNotNull(byteBuffer77);
        org.junit.Assert.assertNotNull(byteBuffer78);
        org.junit.Assert.assertNull(str80);
    }

    @Test
    public void test00310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00310");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate((int) '4');
        java.nio.ShortBuffer shortBuffer2 = byteBuffer1.asShortBuffer();
        java.nio.ByteBuffer byteBuffer4 = byteBuffer1.putChar('\000');
        // The following exception was thrown during execution in test generation
        try {
            short short6 = byteBuffer4.getShort(75);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(shortBuffer2);
        org.junit.Assert.assertNotNull(byteBuffer4);
    }

    @Test
    public void test00311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00311");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        response2.contentType = "";
        java.lang.String str5 = response2.contentType;
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response2);
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response6);
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response7);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response9 = org.jsoup.helper.HttpConnection.Response.execute(request0, response7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test00312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00312");
        javax.net.SocketFactory socketFactory0 = javax.net.ssl.SSLSocketFactory.getDefault();
        java.net.Socket socket1 = socketFactory0.createSocket();
        java.net.Socket socket2 = socketFactory0.createSocket();
        java.net.InetAddress inetAddress3 = null;
        java.net.InetAddress inetAddress5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.Socket socket7 = socketFactory0.createSocket(inetAddress3, 12, inetAddress5, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: port out of range:-1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(socketFactory0);
        org.junit.Assert.assertNotNull(socket1);
        org.junit.Assert.assertEquals(socket1.toString(), "Socket[unconnected]");
        org.junit.Assert.assertNotNull(socket2);
        org.junit.Assert.assertEquals(socket2.toString(), "Socket[unconnected]");
    }

    @Test
    public void test00313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00313");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        java.util.Map<java.lang.String, java.lang.String> strMap4 = response1.cookies();
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response6);
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response6);
        org.jsoup.Connection.Response response10 = response6.removeCookie("Location");
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response6);
        boolean boolean12 = response11.executed;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = response11.hasHeaderWithValue("", "Location");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test00314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00314");
        java.util.regex.Pattern pattern2 = null; // flaky: java.util.regex.Pattern.compile("java.nio.DirectByteBuffer[pos=10 lim=100 cap=100]", (-24));
        java.util.regex.Pattern pattern5 = java.util.regex.Pattern.compile("hi!", (int) (short) 10);
        java.util.regex.Pattern pattern6 = org.jsoup.helper.HttpConnection.Response.xmlContentTypeRxp;
        org.jsoup.helper.HttpConnection.Response.xmlContentTypeRxp = pattern6;
        java.nio.ByteBuffer byteBuffer9 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.CharBuffer charBuffer10 = byteBuffer9.asCharBuffer();
        java.util.stream.Stream<java.lang.String> strStream11 = null; // flaky: pattern6.splitAsStream((java.lang.CharSequence) charBuffer10);
        java.util.regex.Matcher matcher12 = pattern5.matcher((java.lang.CharSequence) charBuffer10);
        java.util.regex.Matcher matcher13 = null; // flaky: pattern2.matcher((java.lang.CharSequence) charBuffer10);
        java.nio.ByteBuffer byteBuffer15 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        long long16 = byteBuffer15.getLong();
        int int17 = byteBuffer15.position();
        float float19 = byteBuffer15.getFloat((int) (short) 10);
        boolean boolean20 = byteBuffer15.hasArray();
        double double21 = byteBuffer15.getDouble();
        java.nio.ByteBuffer byteBuffer24 = byteBuffer15.putFloat(0, (float) (short) 10);
        java.nio.CharBuffer charBuffer25 = byteBuffer15.asCharBuffer();
        java.lang.String[] strArray27 = null; // flaky: pattern2.split((java.lang.CharSequence) charBuffer25, 12);
        java.lang.String str28 = null; // flaky: pattern2.toString();
// flaky:         org.junit.Assert.assertNotNull(pattern2);
// flaky:         org.junit.Assert.assertEquals(pattern2.toString(), "java.nio.DirectByteBuffer[pos=10 lim=100 cap=100]");
        org.junit.Assert.assertNotNull(pattern5);
        org.junit.Assert.assertEquals(pattern5.toString(), "hi!");
// flaky:         org.junit.Assert.assertNotNull(pattern6);
// flaky:         org.junit.Assert.assertEquals(pattern6.toString(), "java.nio.DirectByteBuffer[pos=10 lim=100 cap=100]");
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertNotNull(charBuffer10);
// flaky:         org.junit.Assert.assertNotNull(strStream11);
        org.junit.Assert.assertNotNull(matcher12);
        org.junit.Assert.assertEquals(matcher12.toString(), "java.util.regex.Matcher[pattern=hi! region=0,50 lastmatch=]");
// flaky:         org.junit.Assert.assertNotNull(matcher13);
// flaky:         org.junit.Assert.assertEquals(matcher13.toString(), "java.util.regex.Matcher[pattern=java.nio.DirectByteBuffer[pos=10 lim=100 cap=100] region=0,50 lastmatch=]");
        org.junit.Assert.assertNotNull(byteBuffer15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 8 + "'", int17 == 8);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 0.0f + "'", float19 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertNotNull(byteBuffer24);
        org.junit.Assert.assertNotNull(charBuffer25);
// flaky:         org.junit.Assert.assertNotNull(strArray27);
// flaky:         org.junit.Assert.assertEquals("'" + str28 + "' != '" + "java.nio.DirectByteBuffer[pos=10 lim=100 cap=100]" + "'", str28, "java.nio.DirectByteBuffer[pos=10 lim=100 cap=100]");
    }

    @Test
    public void test00315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00315");
        javax.net.SocketFactory socketFactory0 = javax.net.ssl.SSLSocketFactory.getDefault();
        java.net.Socket socket1 = socketFactory0.createSocket();
        java.net.Socket socket2 = socketFactory0.createSocket();
        // The following exception was thrown during execution in test generation
        try {
            java.net.Socket socket5 = socketFactory0.createSocket("hi!", 85);
            org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: hi!");
        } catch (java.net.UnknownHostException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(socketFactory0);
        org.junit.Assert.assertNotNull(socket1);
        org.junit.Assert.assertEquals(socket1.toString(), "Socket[unconnected]");
        org.junit.Assert.assertNotNull(socket2);
        org.junit.Assert.assertEquals(socket2.toString(), "Socket[unconnected]");
    }

    @Test
    public void test00316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00316");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.putLong((long) '4');
        short short5 = byteBuffer1.getShort(0);
        java.nio.ByteBuffer byteBuffer8 = byteBuffer1.putChar(1, '4');
        java.nio.ByteBuffer byteBuffer10 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer12 = byteBuffer10.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer14 = byteBuffer10.putInt(0);
        byte[] byteArray17 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer18 = byteBuffer14.put(byteArray17);
        java.nio.ByteBuffer byteBuffer20 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer22 = byteBuffer20.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer24 = byteBuffer20.putInt(0);
        byte[] byteArray27 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer28 = byteBuffer24.put(byteArray27);
        java.nio.ByteBuffer byteBuffer31 = byteBuffer14.get(byteArray27, 2, (int) (byte) 0);
        java.nio.ByteBuffer byteBuffer33 = byteBuffer14.putDouble(100.0d);
        int int34 = byteBuffer8.compareTo(byteBuffer14);
        java.nio.ByteBuffer byteBuffer36 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer38 = byteBuffer36.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer40 = byteBuffer36.putInt(0);
        byte[] byteArray43 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer44 = byteBuffer40.put(byteArray43);
        java.nio.ByteOrder byteOrder45 = byteBuffer44.order();
        java.nio.ByteBuffer byteBuffer46 = byteBuffer14.order(byteOrder45);
        boolean boolean47 = byteBuffer14.isDirect();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.Buffer buffer49 = byteBuffer14.position((-10));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: newPosition < 0: (-10 < 0)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 0 + "'", short5 == (short) 0);
        org.junit.Assert.assertNotNull(byteBuffer8);
        org.junit.Assert.assertNotNull(byteBuffer10);
        org.junit.Assert.assertNotNull(byteBuffer12);
        org.junit.Assert.assertNotNull(byteBuffer14);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer18);
        org.junit.Assert.assertNotNull(byteBuffer20);
        org.junit.Assert.assertNotNull(byteBuffer22);
        org.junit.Assert.assertNotNull(byteBuffer24);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer28);
        org.junit.Assert.assertNotNull(byteBuffer31);
        org.junit.Assert.assertNotNull(byteBuffer33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 14 + "'", int34 == 14);
        org.junit.Assert.assertNotNull(byteBuffer36);
        org.junit.Assert.assertNotNull(byteBuffer38);
        org.junit.Assert.assertNotNull(byteBuffer40);
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray43), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer44);
        org.junit.Assert.assertNotNull(byteOrder45);
        org.junit.Assert.assertNotNull(byteBuffer46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
    }

    @Test
    public void test00317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00317");
        javax.net.SocketFactory socketFactory0 = javax.net.ssl.SSLSocketFactory.getDefault();
        java.net.Socket socket1 = socketFactory0.createSocket();
        java.net.Socket socket2 = socketFactory0.createSocket();
        java.net.Socket socket3 = socketFactory0.createSocket();
        java.net.InetAddress inetAddress4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.Socket socket6 = socketFactory0.createSocket(inetAddress4, 0);
            org.junit.Assert.fail("Expected exception of type java.net.ConnectException; message: Connection refused (Connection refused)");
        } catch (java.net.ConnectException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(socketFactory0);
        org.junit.Assert.assertNotNull(socket1);
        org.junit.Assert.assertEquals(socket1.toString(), "Socket[unconnected]");
        org.junit.Assert.assertNotNull(socket2);
        org.junit.Assert.assertEquals(socket2.toString(), "Socket[unconnected]");
        org.junit.Assert.assertNotNull(socket3);
        org.junit.Assert.assertEquals(socket3.toString(), "Socket[unconnected]");
    }

    @Test
    public void test00318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00318");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.putLong((long) '4');
        short short5 = byteBuffer1.getShort(0);
        java.nio.ByteBuffer byteBuffer8 = byteBuffer1.putChar(1, '4');
        java.nio.ByteBuffer byteBuffer10 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer12 = byteBuffer10.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer14 = byteBuffer10.putInt(0);
        byte[] byteArray17 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer18 = byteBuffer14.put(byteArray17);
        java.nio.ByteBuffer byteBuffer20 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer22 = byteBuffer20.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer24 = byteBuffer20.putInt(0);
        byte[] byteArray27 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer28 = byteBuffer24.put(byteArray27);
        java.nio.ByteBuffer byteBuffer31 = byteBuffer14.get(byteArray27, 2, (int) (byte) 0);
        java.nio.ByteBuffer byteBuffer33 = byteBuffer14.putDouble(100.0d);
        int int34 = byteBuffer8.compareTo(byteBuffer14);
        java.nio.ByteBuffer byteBuffer36 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer38 = byteBuffer36.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer40 = byteBuffer36.putInt(0);
        byte[] byteArray43 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer44 = byteBuffer40.put(byteArray43);
        java.nio.ByteOrder byteOrder45 = byteBuffer44.order();
        java.nio.ByteBuffer byteBuffer46 = byteBuffer14.order(byteOrder45);
        java.nio.ByteBuffer byteBuffer47 = byteBuffer14.slice();
        java.nio.ByteBuffer byteBuffer49 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer51 = byteBuffer49.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer53 = byteBuffer49.putInt(0);
        short short54 = byteBuffer53.getShort();
        java.nio.IntBuffer intBuffer55 = byteBuffer53.asIntBuffer();
        int int56 = byteBuffer53.capacity();
        java.nio.ByteBuffer byteBuffer58 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer60 = byteBuffer58.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer62 = byteBuffer58.putInt(0);
        java.nio.ByteBuffer byteBuffer65 = byteBuffer62.putDouble((int) (byte) 1, (double) 1L);
        java.nio.ByteBuffer byteBuffer67 = byteBuffer62.putChar('a');
        double double69 = byteBuffer67.getDouble(12);
        java.nio.ByteBuffer byteBuffer71 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer73 = byteBuffer71.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer75 = byteBuffer71.putInt(0);
        byte[] byteArray78 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer79 = byteBuffer75.put(byteArray78);
        java.nio.ByteBuffer byteBuffer81 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer83 = byteBuffer81.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer85 = byteBuffer81.putInt(0);
        byte[] byteArray88 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer89 = byteBuffer85.put(byteArray88);
        java.nio.ByteBuffer byteBuffer92 = byteBuffer75.get(byteArray88, 2, (int) (byte) 0);
        java.nio.ByteBuffer byteBuffer93 = byteBuffer67.put(byteArray88);
        java.nio.ByteBuffer byteBuffer94 = byteBuffer53.get(byteArray88);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer97 = byteBuffer14.get(byteArray88, 0, 20);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 0 + "'", short5 == (short) 0);
        org.junit.Assert.assertNotNull(byteBuffer8);
        org.junit.Assert.assertNotNull(byteBuffer10);
        org.junit.Assert.assertNotNull(byteBuffer12);
        org.junit.Assert.assertNotNull(byteBuffer14);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer18);
        org.junit.Assert.assertNotNull(byteBuffer20);
        org.junit.Assert.assertNotNull(byteBuffer22);
        org.junit.Assert.assertNotNull(byteBuffer24);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer28);
        org.junit.Assert.assertNotNull(byteBuffer31);
        org.junit.Assert.assertNotNull(byteBuffer33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 14 + "'", int34 == 14);
        org.junit.Assert.assertNotNull(byteBuffer36);
        org.junit.Assert.assertNotNull(byteBuffer38);
        org.junit.Assert.assertNotNull(byteBuffer40);
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray43), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer44);
        org.junit.Assert.assertNotNull(byteOrder45);
        org.junit.Assert.assertNotNull(byteBuffer46);
        org.junit.Assert.assertNotNull(byteBuffer47);
        org.junit.Assert.assertNotNull(byteBuffer49);
        org.junit.Assert.assertNotNull(byteBuffer51);
        org.junit.Assert.assertNotNull(byteBuffer53);
        org.junit.Assert.assertTrue("'" + short54 + "' != '" + (short) 0 + "'", short54 == (short) 0);
        org.junit.Assert.assertNotNull(intBuffer55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 100 + "'", int56 == 100);
        org.junit.Assert.assertNotNull(byteBuffer58);
        org.junit.Assert.assertNotNull(byteBuffer60);
        org.junit.Assert.assertNotNull(byteBuffer62);
        org.junit.Assert.assertNotNull(byteBuffer65);
        org.junit.Assert.assertNotNull(byteBuffer67);
        org.junit.Assert.assertTrue("'" + double69 + "' != '" + 7.565251118924485E-307d + "'", double69 == 7.565251118924485E-307d);
        org.junit.Assert.assertNotNull(byteBuffer71);
        org.junit.Assert.assertNotNull(byteBuffer73);
        org.junit.Assert.assertNotNull(byteBuffer75);
        org.junit.Assert.assertNotNull(byteArray78);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray78), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer79);
        org.junit.Assert.assertNotNull(byteBuffer81);
        org.junit.Assert.assertNotNull(byteBuffer83);
        org.junit.Assert.assertNotNull(byteBuffer85);
        org.junit.Assert.assertNotNull(byteArray88);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray88), "[0, 0]");
        org.junit.Assert.assertNotNull(byteBuffer89);
        org.junit.Assert.assertNotNull(byteBuffer92);
        org.junit.Assert.assertNotNull(byteBuffer93);
        org.junit.Assert.assertNotNull(byteBuffer94);
    }

    @Test
    public void test00319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00319");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.putLong((long) '4');
        int int5 = byteBuffer3.getInt((int) (short) 1);
        java.nio.ByteBuffer byteBuffer7 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer9 = byteBuffer7.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer11 = byteBuffer7.putInt(0);
        byte[] byteArray14 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer15 = byteBuffer11.put(byteArray14);
        java.nio.ByteBuffer byteBuffer17 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer19 = byteBuffer17.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer21 = byteBuffer17.putInt(0);
        byte[] byteArray24 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer25 = byteBuffer21.put(byteArray24);
        java.nio.ByteBuffer byteBuffer28 = byteBuffer11.get(byteArray24, 2, (int) (byte) 0);
        java.nio.ByteBuffer byteBuffer29 = byteBuffer3.get(byteArray24);
        java.nio.ShortBuffer shortBuffer30 = byteBuffer3.asShortBuffer();
        boolean boolean31 = shortBuffer30.hasRemaining();
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(byteBuffer7);
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertNotNull(byteBuffer11);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer15);
        org.junit.Assert.assertNotNull(byteBuffer17);
        org.junit.Assert.assertNotNull(byteBuffer19);
        org.junit.Assert.assertNotNull(byteBuffer21);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[0, 0]");
        org.junit.Assert.assertNotNull(byteBuffer25);
        org.junit.Assert.assertNotNull(byteBuffer28);
        org.junit.Assert.assertNotNull(byteBuffer29);
        org.junit.Assert.assertNotNull(shortBuffer30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    }

    @Test
    public void test00320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00320");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer5 = byteBuffer1.putInt(0);
        java.nio.ByteBuffer byteBuffer7 = byteBuffer5.putInt((int) '#');
        byte byte9 = byteBuffer5.get(1);
        java.nio.ByteBuffer byteBuffer12 = byteBuffer5.put(14, (byte) -1);
        java.nio.ByteOrder byteOrder13 = byteBuffer12.order();
        java.lang.Class<?> wildcardClass14 = byteBuffer12.getClass();
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertNotNull(byteBuffer7);
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 0 + "'", byte9 == (byte) 0);
        org.junit.Assert.assertNotNull(byteBuffer12);
        org.junit.Assert.assertNotNull(byteOrder13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test00321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00321");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.contentType = "";
        java.lang.String str4 = response1.contentType;
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry7 = response5.scanHeaders("hi!");
        org.jsoup.Connection.Method method8 = response5.method();
        org.jsoup.Connection.Response response10 = response5.removeHeader("java.nio.DirectByteBuffer[pos=10 lim=100 cap=100]");
        java.nio.ByteBuffer byteBuffer12 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer14 = byteBuffer12.putLong((long) '4');
        int int16 = byteBuffer14.getInt((int) (short) 1);
        java.nio.ByteBuffer byteBuffer19 = byteBuffer14.putChar((int) ' ', '#');
        short short20 = byteBuffer19.getShort();
        response5.byteData = byteBuffer19;
        org.jsoup.helper.HttpConnection.Response response22 = new org.jsoup.helper.HttpConnection.Response(response5);
        java.lang.Class<?> wildcardClass23 = response22.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(strEntry7);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertNotNull(byteBuffer12);
        org.junit.Assert.assertNotNull(byteBuffer14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(byteBuffer19);
        org.junit.Assert.assertTrue("'" + short20 + "' != '" + (short) 0 + "'", short20 == (short) 0);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test00322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00322");
        java.util.regex.Pattern pattern4 = java.util.regex.Pattern.compile("hi!", (int) (short) 10);
        java.util.function.Predicate<java.lang.String> strPredicate5 = pattern4.asPredicate();
        java.util.function.Predicate<java.lang.String> strPredicate6 = pattern4.asPredicate();
        java.util.regex.Pattern pattern9 = java.util.regex.Pattern.compile("hi!", (int) (short) 10);
        java.util.function.Predicate<java.lang.String> strPredicate10 = pattern9.asPredicate();
        java.util.function.Predicate<java.lang.String> strPredicate11 = pattern9.asPredicate();
        java.nio.ByteBuffer byteBuffer13 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer15 = byteBuffer13.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer17 = byteBuffer13.putInt(0);
        java.nio.Buffer buffer19 = byteBuffer13.limit(32);
        java.nio.CharBuffer charBuffer20 = byteBuffer13.asCharBuffer();
        java.util.stream.Stream<java.lang.String> strStream21 = pattern9.splitAsStream((java.lang.CharSequence) charBuffer20);
        java.util.stream.Stream<java.lang.String> strStream22 = pattern4.splitAsStream((java.lang.CharSequence) charBuffer20);
        boolean boolean23 = java.util.regex.Pattern.matches("\\Qjava.nio.DirectByteBuffer[pos=24 lim=100 cap=100]\\E", (java.lang.CharSequence) charBuffer20);
        boolean boolean24 = java.util.regex.Pattern.matches("\\Qhi!\\E", (java.lang.CharSequence) "\\Qjava.nio.DirectByteBuffer[pos=24 lim=100 cap=100]\\E");
        org.junit.Assert.assertNotNull(pattern4);
        org.junit.Assert.assertEquals(pattern4.toString(), "hi!");
        org.junit.Assert.assertNotNull(strPredicate5);
        org.junit.Assert.assertNotNull(strPredicate6);
        org.junit.Assert.assertNotNull(pattern9);
        org.junit.Assert.assertEquals(pattern9.toString(), "hi!");
        org.junit.Assert.assertNotNull(strPredicate10);
        org.junit.Assert.assertNotNull(strPredicate11);
        org.junit.Assert.assertNotNull(byteBuffer13);
        org.junit.Assert.assertNotNull(byteBuffer15);
        org.junit.Assert.assertNotNull(byteBuffer17);
        org.junit.Assert.assertNotNull(buffer19);
        org.junit.Assert.assertNotNull(charBuffer20);
        org.junit.Assert.assertNotNull(strStream21);
        org.junit.Assert.assertNotNull(strStream22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test00323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00323");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        response2.contentType = "";
        java.lang.String str6 = response2.cookie("hi!");
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response2);
        org.jsoup.Connection.Response response10 = response2.header("Location", "");
        java.util.Map<java.lang.String, java.lang.String> strMap11 = response2.cookies();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response12 = org.jsoup.helper.HttpConnection.Response.execute(request0, response2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertNotNull(strMap11);
    }

    @Test
    public void test00324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00324");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.contentType = "";
        java.lang.String str4 = response1.contentType;
        response1.executed = true;
        response1.executed = false;
        java.lang.String str9 = response1.statusMessage();
        response1.numRedirects = 2;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test00325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00325");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer5 = byteBuffer1.putInt(0);
        byte[] byteArray8 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer9 = byteBuffer5.put(byteArray8);
        java.nio.CharBuffer charBuffer10 = byteBuffer5.asCharBuffer();
        java.nio.ByteBuffer byteBuffer12 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer14 = byteBuffer12.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer16 = byteBuffer12.putInt(0);
        java.nio.ByteBuffer byteBuffer18 = byteBuffer16.putInt((int) '#');
        float float20 = byteBuffer18.getFloat(4);
        java.nio.ByteBuffer byteBuffer22 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer24 = byteBuffer22.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer26 = byteBuffer22.putInt(0);
        byte[] byteArray29 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer30 = byteBuffer26.put(byteArray29);
        java.nio.ByteBuffer byteBuffer32 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer34 = byteBuffer32.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer36 = byteBuffer32.putInt(0);
        byte[] byteArray39 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer40 = byteBuffer36.put(byteArray39);
        java.nio.ByteBuffer byteBuffer43 = byteBuffer26.get(byteArray39, 2, (int) (byte) 0);
        java.nio.ByteBuffer byteBuffer45 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer47 = byteBuffer45.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer49 = byteBuffer45.putInt(0);
        byte[] byteArray52 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer53 = byteBuffer49.put(byteArray52);
        java.nio.ByteBuffer byteBuffer55 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer57 = byteBuffer55.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer59 = byteBuffer55.putInt(0);
        byte[] byteArray62 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer63 = byteBuffer59.put(byteArray62);
        java.nio.ByteBuffer byteBuffer66 = byteBuffer49.get(byteArray62, 2, (int) (byte) 0);
        java.nio.ByteBuffer byteBuffer67 = byteBuffer43.put(byteArray62);
        java.nio.ByteBuffer byteBuffer68 = byteBuffer18.put(byteArray62);
        java.nio.ByteBuffer byteBuffer69 = byteBuffer5.get(byteArray62);
        java.nio.ByteBuffer byteBuffer70 = java.nio.ByteBuffer.wrap(byteArray62);
        java.nio.ShortBuffer shortBuffer71 = byteBuffer70.asShortBuffer();
        // The following exception was thrown during execution in test generation
        try {
            int int73 = byteBuffer70.getInt(3);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertNotNull(charBuffer10);
        org.junit.Assert.assertNotNull(byteBuffer12);
        org.junit.Assert.assertNotNull(byteBuffer14);
        org.junit.Assert.assertNotNull(byteBuffer16);
        org.junit.Assert.assertNotNull(byteBuffer18);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 7.3E-44f + "'", float20 == 7.3E-44f);
        org.junit.Assert.assertNotNull(byteBuffer22);
        org.junit.Assert.assertNotNull(byteBuffer24);
        org.junit.Assert.assertNotNull(byteBuffer26);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray29), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer30);
        org.junit.Assert.assertNotNull(byteBuffer32);
        org.junit.Assert.assertNotNull(byteBuffer34);
        org.junit.Assert.assertNotNull(byteBuffer36);
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray39), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer40);
        org.junit.Assert.assertNotNull(byteBuffer43);
        org.junit.Assert.assertNotNull(byteBuffer45);
        org.junit.Assert.assertNotNull(byteBuffer47);
        org.junit.Assert.assertNotNull(byteBuffer49);
        org.junit.Assert.assertNotNull(byteArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray52), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer53);
        org.junit.Assert.assertNotNull(byteBuffer55);
        org.junit.Assert.assertNotNull(byteBuffer57);
        org.junit.Assert.assertNotNull(byteBuffer59);
        org.junit.Assert.assertNotNull(byteArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray62), "[0, 0]");
        org.junit.Assert.assertNotNull(byteBuffer63);
        org.junit.Assert.assertNotNull(byteBuffer66);
        org.junit.Assert.assertNotNull(byteBuffer67);
        org.junit.Assert.assertNotNull(byteBuffer68);
        org.junit.Assert.assertNotNull(byteBuffer69);
        org.junit.Assert.assertNotNull(byteBuffer70);
        org.junit.Assert.assertNotNull(shortBuffer71);
    }

    @Test
    public void test00326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00326");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.contentType = "";
        java.lang.String str5 = response1.cookie("hi!");
        java.net.URL uRL6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response7 = response1.url(uRL6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test00327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00327");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        java.util.Map<java.lang.String, java.lang.String> strMap4 = response1.cookies();
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response6);
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response6);
        org.jsoup.Connection.Response response10 = response6.removeCookie("Location");
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response6);
        org.jsoup.Connection.Method method12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response13 = response6.method(method12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNotNull(response10);
    }

    @Test
    public void test00328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00328");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.putLong((long) '4');
        double double5 = byteBuffer1.getDouble(64);
        java.nio.FloatBuffer floatBuffer6 = byteBuffer1.asFloatBuffer();
        int int7 = floatBuffer6.limit();
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(floatBuffer6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 23 + "'", int7 == 23);
    }

    @Test
    public void test00329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00329");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        java.util.Map<java.lang.String, java.lang.String> strMap4 = response1.cookies();
        org.jsoup.Connection.Response response6 = response1.removeCookie("hi!");
        java.lang.String str7 = response1.statusMessage();
        java.nio.ByteBuffer byteBuffer9 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer11 = byteBuffer9.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer13 = byteBuffer9.putInt(0);
        byte[] byteArray16 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer17 = byteBuffer13.put(byteArray16);
        boolean boolean18 = byteBuffer13.hasArray();
        response1.byteData = byteBuffer13;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document20 = response1.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertNotNull(byteBuffer11);
        org.junit.Assert.assertNotNull(byteBuffer13);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test00330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00330");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.contentType = "";
        java.lang.String str4 = response1.contentType;
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response5);
        org.jsoup.Connection.Request request7 = null;
        response5.req = request7;
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response5);
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response9);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray11 = response10.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test00331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00331");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.putLong((long) '4');
        int int5 = byteBuffer3.getInt((int) (short) 1);
        java.nio.ByteBuffer byteBuffer8 = byteBuffer3.putChar((int) ' ', '#');
        java.lang.String str9 = byteBuffer8.toString();
        byte byte10 = byteBuffer8.get();
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(byteBuffer8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "java.nio.DirectByteBuffer[pos=8 lim=100 cap=100]" + "'", str9, "java.nio.DirectByteBuffer[pos=8 lim=100 cap=100]");
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) 0 + "'", byte10 == (byte) 0);
    }

    @Test
    public void test00332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00332");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        response2.contentType = "";
        java.lang.String str5 = response2.contentType;
        response2.executed = true;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry9 = response2.scanHeaders("");
        java.lang.String str11 = response2.getHeaderCaseInsensitive("Location");
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response2);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response13 = org.jsoup.helper.HttpConnection.Response.execute(request0, response12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(strEntry9);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test00333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00333");
        javax.net.SocketFactory socketFactory0 = javax.net.ssl.SSLSocketFactory.getDefault();
        java.net.Socket socket1 = socketFactory0.createSocket();
        java.net.Socket socket2 = socketFactory0.createSocket();
        java.net.Socket socket3 = socketFactory0.createSocket();
        java.net.InetAddress inetAddress6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.Socket socket8 = socketFactory0.createSocket("\\QLocation\\E", (int) ' ', inetAddress6, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: port out of range:-1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(socketFactory0);
        org.junit.Assert.assertNotNull(socket1);
        org.junit.Assert.assertEquals(socket1.toString(), "Socket[unconnected]");
        org.junit.Assert.assertNotNull(socket2);
        org.junit.Assert.assertEquals(socket2.toString(), "Socket[unconnected]");
        org.junit.Assert.assertNotNull(socket3);
        org.junit.Assert.assertEquals(socket3.toString(), "Socket[unconnected]");
    }

    @Test
    public void test00334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00334");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer5 = byteBuffer1.putInt(0);
        java.nio.ByteBuffer byteBuffer7 = byteBuffer5.putDouble((double) 12);
        java.nio.ByteBuffer byteBuffer9 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        long long10 = byteBuffer9.getLong();
        int int11 = byteBuffer9.position();
        float float13 = byteBuffer9.getFloat((int) (short) 10);
        boolean boolean14 = byteBuffer9.hasArray();
        double double15 = byteBuffer9.getDouble();
        short short17 = byteBuffer9.getShort(0);
        java.nio.ByteBuffer byteBuffer19 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer21 = byteBuffer19.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer23 = byteBuffer19.putInt(0);
        byte[] byteArray26 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer27 = byteBuffer23.put(byteArray26);
        boolean boolean28 = byteBuffer23.hasArray();
        java.nio.ByteBuffer byteBuffer30 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer32 = byteBuffer30.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer34 = byteBuffer30.putInt(0);
        byte[] byteArray37 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer38 = byteBuffer34.put(byteArray37);
        java.nio.ByteBuffer byteBuffer40 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer42 = byteBuffer40.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer44 = byteBuffer40.putInt(0);
        byte[] byteArray47 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer48 = byteBuffer44.put(byteArray47);
        java.nio.ByteBuffer byteBuffer51 = byteBuffer34.get(byteArray47, 2, (int) (byte) 0);
        java.nio.ByteBuffer byteBuffer53 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer55 = byteBuffer53.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer57 = byteBuffer53.putInt(0);
        byte[] byteArray60 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer61 = byteBuffer57.put(byteArray60);
        java.nio.ByteBuffer byteBuffer63 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer65 = byteBuffer63.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer67 = byteBuffer63.putInt(0);
        byte[] byteArray70 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer71 = byteBuffer67.put(byteArray70);
        java.nio.ByteBuffer byteBuffer74 = byteBuffer57.get(byteArray70, 2, (int) (byte) 0);
        java.nio.ByteBuffer byteBuffer75 = byteBuffer51.put(byteArray70);
        java.nio.ByteBuffer byteBuffer76 = byteBuffer23.put(byteArray70);
        java.nio.ByteBuffer byteBuffer77 = byteBuffer9.get(byteArray70);
        java.nio.ByteBuffer byteBuffer78 = byteBuffer5.put(byteArray70);
        java.nio.ByteBuffer byteBuffer79 = java.nio.ByteBuffer.wrap(byteArray70);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer82 = java.nio.ByteBuffer.wrap(byteArray70, 23, (int) '\n');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertNotNull(byteBuffer7);
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 8 + "'", int11 == 8);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 0.0f + "'", float13 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + short17 + "' != '" + (short) 0 + "'", short17 == (short) 0);
        org.junit.Assert.assertNotNull(byteBuffer19);
        org.junit.Assert.assertNotNull(byteBuffer21);
        org.junit.Assert.assertNotNull(byteBuffer23);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(byteBuffer30);
        org.junit.Assert.assertNotNull(byteBuffer32);
        org.junit.Assert.assertNotNull(byteBuffer34);
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray37), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer38);
        org.junit.Assert.assertNotNull(byteBuffer40);
        org.junit.Assert.assertNotNull(byteBuffer42);
        org.junit.Assert.assertNotNull(byteBuffer44);
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray47), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer48);
        org.junit.Assert.assertNotNull(byteBuffer51);
        org.junit.Assert.assertNotNull(byteBuffer53);
        org.junit.Assert.assertNotNull(byteBuffer55);
        org.junit.Assert.assertNotNull(byteBuffer57);
        org.junit.Assert.assertNotNull(byteArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray60), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer61);
        org.junit.Assert.assertNotNull(byteBuffer63);
        org.junit.Assert.assertNotNull(byteBuffer65);
        org.junit.Assert.assertNotNull(byteBuffer67);
        org.junit.Assert.assertNotNull(byteArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray70), "[0, 0]");
        org.junit.Assert.assertNotNull(byteBuffer71);
        org.junit.Assert.assertNotNull(byteBuffer74);
        org.junit.Assert.assertNotNull(byteBuffer75);
        org.junit.Assert.assertNotNull(byteBuffer76);
        org.junit.Assert.assertNotNull(byteBuffer77);
        org.junit.Assert.assertNotNull(byteBuffer78);
        org.junit.Assert.assertNotNull(byteBuffer79);
    }

    @Test
    public void test00335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00335");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.contentType = "";
        java.lang.String str4 = response1.contentType;
        java.lang.String str5 = response1.charset;
        java.nio.ByteBuffer byteBuffer6 = response1.byteData;
        org.jsoup.Connection.Response response8 = response1.removeCookie("Location");
        response1.statusCode = (short) 10;
        response1.statusMessage = "hi!";
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response1);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray14 = response1.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(byteBuffer6);
        org.junit.Assert.assertNotNull(response8);
    }

    @Test
    public void test00336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00336");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate((int) '4');
        java.nio.ShortBuffer shortBuffer2 = byteBuffer1.asShortBuffer();
        java.nio.ByteBuffer byteBuffer4 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        long long5 = byteBuffer4.getLong();
        int int6 = byteBuffer4.position();
        float float8 = byteBuffer4.getFloat((int) (short) 10);
        boolean boolean9 = byteBuffer4.hasArray();
        double double10 = byteBuffer4.getDouble();
        short short12 = byteBuffer4.getShort(0);
        java.nio.ByteBuffer byteBuffer14 = byteBuffer4.putDouble(100.0d);
        byte byte16 = byteBuffer14.get((int) (short) 0);
        java.nio.IntBuffer intBuffer17 = byteBuffer14.asIntBuffer();
        int int18 = byteBuffer1.compareTo(byteBuffer14);
        java.nio.FloatBuffer floatBuffer19 = byteBuffer14.asFloatBuffer();
        java.nio.ByteBuffer byteBuffer21 = byteBuffer14.put((byte) -1);
        java.nio.ByteBuffer byteBuffer24 = byteBuffer21.putShort(2, (short) (byte) 0);
        java.nio.Buffer buffer25 = byteBuffer24.mark();
        double double27 = byteBuffer24.getDouble((int) (short) 10);
        java.nio.Buffer buffer29 = byteBuffer24.limit((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer32 = byteBuffer24.putDouble(92, (double) (-6));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(shortBuffer2);
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 0 + "'", short12 == (short) 0);
        org.junit.Assert.assertNotNull(byteBuffer14);
        org.junit.Assert.assertTrue("'" + byte16 + "' != '" + (byte) 0 + "'", byte16 == (byte) 0);
        org.junit.Assert.assertNotNull(intBuffer17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-24) + "'", int18 == (-24));
        org.junit.Assert.assertNotNull(floatBuffer19);
        org.junit.Assert.assertNotNull(byteBuffer21);
        org.junit.Assert.assertNotNull(byteBuffer24);
        org.junit.Assert.assertNotNull(buffer25);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 8.1387E-320d + "'", double27 == 8.1387E-320d);
        org.junit.Assert.assertNotNull(buffer29);
    }

    @Test
    public void test00337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00337");
        boolean boolean2 = java.util.regex.Pattern.matches("java.nio.DirectByteBuffer[pos=10 lim=100 cap=100]", (java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00338");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        java.util.Map<java.lang.String, java.lang.String> strMap4 = response1.cookies();
        org.jsoup.Connection.Response response6 = response1.removeCookie("hi!");
        java.lang.String str7 = response1.statusMessage();
        java.nio.ByteBuffer byteBuffer9 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer11 = byteBuffer9.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer13 = byteBuffer9.putInt(0);
        byte[] byteArray16 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer17 = byteBuffer13.put(byteArray16);
        boolean boolean18 = byteBuffer13.hasArray();
        response1.byteData = byteBuffer13;
        org.jsoup.helper.HttpConnection.Response response20 = new org.jsoup.helper.HttpConnection.Response(response1);
        boolean boolean21 = response20.executed;
        org.jsoup.helper.HttpConnection.Response response22 = new org.jsoup.helper.HttpConnection.Response(response20);
        org.jsoup.helper.HttpConnection.Response response23 = new org.jsoup.helper.HttpConnection.Response(response20);
        org.jsoup.helper.HttpConnection.Response response24 = new org.jsoup.helper.HttpConnection.Response(response20);
        java.nio.ByteBuffer byteBuffer26 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        long long27 = byteBuffer26.getLong();
        int int28 = byteBuffer26.position();
        float float30 = byteBuffer26.getFloat((int) (short) 10);
        boolean boolean31 = byteBuffer26.hasArray();
        java.nio.ByteBuffer byteBuffer33 = byteBuffer26.putFloat((float) (-24));
        response24.byteData = byteBuffer26;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str35 = response24.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertNotNull(byteBuffer11);
        org.junit.Assert.assertNotNull(byteBuffer13);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(byteBuffer26);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 8 + "'", int28 == 8);
        org.junit.Assert.assertTrue("'" + float30 + "' != '" + 0.0f + "'", float30 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(byteBuffer33);
    }

    @Test
    public void test00339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00339");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        response2.statusMessage = "";
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response2);
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response2);
        java.net.URL uRL7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response8 = response6.url(uRL7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00340");
        org.jsoup.helper.HttpConnection.Response.LOCATION = "\\QLocation\\E";
    }

    @Test
    public void test00341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00341");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer5 = byteBuffer1.putInt(0);
        byte[] byteArray8 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer9 = byteBuffer5.put(byteArray8);
        java.nio.ByteBuffer byteBuffer11 = byteBuffer9.putDouble(7.565251118924485E-307d);
        java.nio.ByteBuffer byteBuffer13 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer15 = byteBuffer13.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer17 = byteBuffer13.putInt(0);
        java.nio.ByteBuffer byteBuffer20 = byteBuffer17.putDouble((int) (byte) 1, (double) 1L);
        java.nio.ByteBuffer byteBuffer22 = byteBuffer17.putChar(' ');
        float float23 = byteBuffer22.getFloat();
        java.nio.ByteBuffer byteBuffer25 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer27 = byteBuffer25.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer29 = byteBuffer25.putInt(0);
        byte[] byteArray32 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer33 = byteBuffer29.put(byteArray32);
        java.nio.FloatBuffer floatBuffer34 = byteBuffer29.asFloatBuffer();
        boolean boolean35 = byteBuffer29.isDirect();
        java.nio.ByteBuffer byteBuffer37 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer39 = byteBuffer37.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer41 = byteBuffer37.putInt(0);
        byte[] byteArray44 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer45 = byteBuffer41.put(byteArray44);
        org.jsoup.helper.HttpConnection.Response response46 = null;
        org.jsoup.helper.HttpConnection.Response response47 = new org.jsoup.helper.HttpConnection.Response(response46);
        response47.contentType = "";
        boolean boolean50 = byteBuffer45.equals((java.lang.Object) "");
        java.nio.ByteBuffer byteBuffer52 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer54 = byteBuffer52.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer56 = byteBuffer52.putInt(0);
        java.nio.ByteBuffer byteBuffer58 = byteBuffer56.putInt((int) '#');
        int int59 = byteBuffer45.compareTo(byteBuffer56);
        java.nio.ByteBuffer byteBuffer60 = byteBuffer29.put(byteBuffer56);
        java.nio.ByteBuffer byteBuffer61 = byteBuffer22.put(byteBuffer29);
        java.nio.ByteBuffer byteBuffer62 = byteBuffer22.compact();
        int int63 = byteBuffer9.compareTo(byteBuffer62);
        // The following exception was thrown during execution in test generation
        try {
            int int64 = byteBuffer62.arrayOffset();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertNotNull(byteBuffer11);
        org.junit.Assert.assertNotNull(byteBuffer13);
        org.junit.Assert.assertNotNull(byteBuffer15);
        org.junit.Assert.assertNotNull(byteBuffer17);
        org.junit.Assert.assertNotNull(byteBuffer20);
        org.junit.Assert.assertNotNull(byteBuffer22);
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + 0.0f + "'", float23 == 0.0f);
        org.junit.Assert.assertNotNull(byteBuffer25);
        org.junit.Assert.assertNotNull(byteBuffer27);
        org.junit.Assert.assertNotNull(byteBuffer29);
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray32), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer33);
        org.junit.Assert.assertNotNull(floatBuffer34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(byteBuffer37);
        org.junit.Assert.assertNotNull(byteBuffer39);
        org.junit.Assert.assertNotNull(byteBuffer41);
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray44), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer45);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(byteBuffer52);
        org.junit.Assert.assertNotNull(byteBuffer54);
        org.junit.Assert.assertNotNull(byteBuffer56);
        org.junit.Assert.assertNotNull(byteBuffer58);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 2 + "'", int59 == 2);
        org.junit.Assert.assertNotNull(byteBuffer60);
        org.junit.Assert.assertNotNull(byteBuffer61);
        org.junit.Assert.assertNotNull(byteBuffer62);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 58 + "'", int63 == 58);
    }

    @Test
    public void test00342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00342");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.contentType = "";
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response1);
        int int5 = response1.numRedirects;
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response1);
        response6.statusCode = 4;
        java.net.URL uRL9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response10 = response6.url(uRL9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test00343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00343");
        javax.net.SocketFactory socketFactory0 = javax.net.ssl.SSLSocketFactory.getDefault();
        java.net.InetAddress inetAddress1 = null;
        java.net.InetAddress inetAddress3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.Socket socket5 = socketFactory0.createSocket(inetAddress1, 32, inetAddress3, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: port out of range:-1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(socketFactory0);
    }

    @Test
    public void test00344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00344");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer5 = byteBuffer1.putInt(0);
        byte[] byteArray8 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer9 = byteBuffer5.put(byteArray8);
        java.nio.CharBuffer charBuffer10 = byteBuffer5.asCharBuffer();
        java.nio.ByteBuffer byteBuffer12 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer14 = byteBuffer12.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer16 = byteBuffer12.putInt(0);
        java.nio.ByteBuffer byteBuffer18 = byteBuffer16.putInt((int) '#');
        float float20 = byteBuffer18.getFloat(4);
        java.nio.ByteBuffer byteBuffer22 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer24 = byteBuffer22.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer26 = byteBuffer22.putInt(0);
        byte[] byteArray29 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer30 = byteBuffer26.put(byteArray29);
        java.nio.ByteBuffer byteBuffer32 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer34 = byteBuffer32.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer36 = byteBuffer32.putInt(0);
        byte[] byteArray39 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer40 = byteBuffer36.put(byteArray39);
        java.nio.ByteBuffer byteBuffer43 = byteBuffer26.get(byteArray39, 2, (int) (byte) 0);
        java.nio.ByteBuffer byteBuffer45 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer47 = byteBuffer45.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer49 = byteBuffer45.putInt(0);
        byte[] byteArray52 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer53 = byteBuffer49.put(byteArray52);
        java.nio.ByteBuffer byteBuffer55 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer57 = byteBuffer55.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer59 = byteBuffer55.putInt(0);
        byte[] byteArray62 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer63 = byteBuffer59.put(byteArray62);
        java.nio.ByteBuffer byteBuffer66 = byteBuffer49.get(byteArray62, 2, (int) (byte) 0);
        java.nio.ByteBuffer byteBuffer67 = byteBuffer43.put(byteArray62);
        java.nio.ByteBuffer byteBuffer68 = byteBuffer18.put(byteArray62);
        java.nio.ByteBuffer byteBuffer69 = byteBuffer5.get(byteArray62);
        // The following exception was thrown during execution in test generation
        try {
            float float71 = byteBuffer5.getFloat((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertNotNull(charBuffer10);
        org.junit.Assert.assertNotNull(byteBuffer12);
        org.junit.Assert.assertNotNull(byteBuffer14);
        org.junit.Assert.assertNotNull(byteBuffer16);
        org.junit.Assert.assertNotNull(byteBuffer18);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 7.3E-44f + "'", float20 == 7.3E-44f);
        org.junit.Assert.assertNotNull(byteBuffer22);
        org.junit.Assert.assertNotNull(byteBuffer24);
        org.junit.Assert.assertNotNull(byteBuffer26);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray29), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer30);
        org.junit.Assert.assertNotNull(byteBuffer32);
        org.junit.Assert.assertNotNull(byteBuffer34);
        org.junit.Assert.assertNotNull(byteBuffer36);
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray39), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer40);
        org.junit.Assert.assertNotNull(byteBuffer43);
        org.junit.Assert.assertNotNull(byteBuffer45);
        org.junit.Assert.assertNotNull(byteBuffer47);
        org.junit.Assert.assertNotNull(byteBuffer49);
        org.junit.Assert.assertNotNull(byteArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray52), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer53);
        org.junit.Assert.assertNotNull(byteBuffer55);
        org.junit.Assert.assertNotNull(byteBuffer57);
        org.junit.Assert.assertNotNull(byteBuffer59);
        org.junit.Assert.assertNotNull(byteArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray62), "[0, 0]");
        org.junit.Assert.assertNotNull(byteBuffer63);
        org.junit.Assert.assertNotNull(byteBuffer66);
        org.junit.Assert.assertNotNull(byteBuffer67);
        org.junit.Assert.assertNotNull(byteBuffer68);
        org.junit.Assert.assertNotNull(byteBuffer69);
    }

    @Test
    public void test00345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00345");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate((int) '4');
        java.nio.ByteBuffer byteBuffer4 = byteBuffer1.putShort(0, (short) -1);
        java.nio.ByteBuffer byteBuffer5 = byteBuffer1.duplicate();
        java.nio.CharBuffer charBuffer6 = byteBuffer1.asCharBuffer();
        java.nio.ShortBuffer shortBuffer7 = byteBuffer1.asShortBuffer();
        // The following exception was thrown during execution in test generation
        try {
            double double9 = byteBuffer1.getDouble((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertNotNull(charBuffer6);
        org.junit.Assert.assertNotNull(shortBuffer7);
    }

    @Test
    public void test00346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00346");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        long long2 = byteBuffer1.getLong();
        int int3 = byteBuffer1.position();
        float float5 = byteBuffer1.getFloat((int) (short) 10);
        boolean boolean6 = byteBuffer1.hasArray();
        double double7 = byteBuffer1.getDouble();
        short short9 = byteBuffer1.getShort(0);
        java.nio.ByteBuffer byteBuffer11 = byteBuffer1.putDouble(100.0d);
        float float12 = byteBuffer1.getFloat();
        char char14 = byteBuffer1.getChar(1);
        java.nio.ByteBuffer byteBuffer16 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer18 = byteBuffer16.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer20 = byteBuffer16.putInt(0);
        byte[] byteArray23 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer24 = byteBuffer20.put(byteArray23);
        java.nio.ByteBuffer byteBuffer26 = byteBuffer24.putDouble(7.565251118924485E-307d);
        int int27 = byteBuffer1.compareTo(byteBuffer26);
        java.nio.ByteBuffer byteBuffer29 = byteBuffer1.putShort((short) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            float float31 = byteBuffer29.getFloat((-10));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 0 + "'", short9 == (short) 0);
        org.junit.Assert.assertNotNull(byteBuffer11);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.0f + "'", float12 == 0.0f);
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + '\000' + "'", char14 == '\000');
        org.junit.Assert.assertNotNull(byteBuffer16);
        org.junit.Assert.assertNotNull(byteBuffer18);
        org.junit.Assert.assertNotNull(byteBuffer20);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer24);
        org.junit.Assert.assertNotNull(byteBuffer26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-6) + "'", int27 == (-6));
        org.junit.Assert.assertNotNull(byteBuffer29);
    }

    @Test
    public void test00347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00347");
        javax.net.SocketFactory socketFactory0 = javax.net.ssl.SSLSocketFactory.getDefault();
        java.net.Socket socket1 = socketFactory0.createSocket();
        java.net.Socket socket2 = socketFactory0.createSocket();
        java.net.Socket socket3 = socketFactory0.createSocket();
        java.net.InetAddress inetAddress4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.Socket socket6 = socketFactory0.createSocket(inetAddress4, 4);
            org.junit.Assert.fail("Expected exception of type java.net.ConnectException; message: Connection refused (Connection refused)");
        } catch (java.net.ConnectException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(socketFactory0);
        org.junit.Assert.assertNotNull(socket1);
        org.junit.Assert.assertEquals(socket1.toString(), "Socket[unconnected]");
        org.junit.Assert.assertNotNull(socket2);
        org.junit.Assert.assertEquals(socket2.toString(), "Socket[unconnected]");
        org.junit.Assert.assertNotNull(socket3);
        org.junit.Assert.assertEquals(socket3.toString(), "Socket[unconnected]");
    }

    @Test
    public void test00348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00348");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        response2.contentType = "";
        java.lang.String str6 = response2.cookie("hi!");
        boolean boolean8 = response2.hasCookie("hi!");
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response2);
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response9);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response11 = org.jsoup.helper.HttpConnection.Response.execute(request0, response10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test00349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00349");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.contentType = "";
        java.lang.String str5 = response1.cookie("hi!");
        int int6 = response1.statusCode();
        org.jsoup.Connection.Request request7 = response1.req;
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = response8.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(request7);
    }

    @Test
    public void test00350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00350");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.putLong((long) '4');
        short short5 = byteBuffer1.getShort(0);
        java.nio.ByteBuffer byteBuffer8 = byteBuffer1.putChar(1, '4');
        java.nio.ByteBuffer byteBuffer10 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer12 = byteBuffer10.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer14 = byteBuffer10.putInt(0);
        byte[] byteArray17 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer18 = byteBuffer14.put(byteArray17);
        java.nio.ByteBuffer byteBuffer20 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer22 = byteBuffer20.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer24 = byteBuffer20.putInt(0);
        byte[] byteArray27 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer28 = byteBuffer24.put(byteArray27);
        java.nio.ByteBuffer byteBuffer31 = byteBuffer14.get(byteArray27, 2, (int) (byte) 0);
        java.nio.ByteBuffer byteBuffer33 = byteBuffer14.putDouble(100.0d);
        int int34 = byteBuffer8.compareTo(byteBuffer14);
        java.nio.Buffer buffer36 = byteBuffer14.limit((int) (byte) 100);
        java.nio.ByteBuffer byteBuffer39 = byteBuffer14.putLong(4, (long) (short) 10);
        java.nio.ByteBuffer byteBuffer41 = byteBuffer39.put((byte) 1);
        boolean boolean42 = byteBuffer39.isDirect();
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 0 + "'", short5 == (short) 0);
        org.junit.Assert.assertNotNull(byteBuffer8);
        org.junit.Assert.assertNotNull(byteBuffer10);
        org.junit.Assert.assertNotNull(byteBuffer12);
        org.junit.Assert.assertNotNull(byteBuffer14);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer18);
        org.junit.Assert.assertNotNull(byteBuffer20);
        org.junit.Assert.assertNotNull(byteBuffer22);
        org.junit.Assert.assertNotNull(byteBuffer24);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer28);
        org.junit.Assert.assertNotNull(byteBuffer31);
        org.junit.Assert.assertNotNull(byteBuffer33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 14 + "'", int34 == 14);
        org.junit.Assert.assertNotNull(buffer36);
        org.junit.Assert.assertNotNull(byteBuffer39);
        org.junit.Assert.assertNotNull(byteBuffer41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
    }

    @Test
    public void test00351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00351");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.contentType = "";
        java.lang.String str4 = response1.contentType;
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.util.Map<java.lang.String, java.lang.String> strMap6 = response1.cookies();
        int int7 = response1.numRedirects;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test00352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00352");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.contentType = "";
        java.lang.String str4 = response1.contentType;
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry7 = response5.scanHeaders("hi!");
        org.jsoup.Connection.Method method8 = response5.method();
        org.jsoup.Connection.Response response10 = response5.removeHeader("java.nio.DirectByteBuffer[pos=10 lim=100 cap=100]");
        java.nio.ByteBuffer byteBuffer12 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer14 = byteBuffer12.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer16 = byteBuffer12.putInt(0);
        byte[] byteArray19 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer20 = byteBuffer16.put(byteArray19);
        java.nio.FloatBuffer floatBuffer21 = byteBuffer16.asFloatBuffer();
        boolean boolean22 = byteBuffer16.isDirect();
        java.nio.ByteBuffer byteBuffer24 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer26 = byteBuffer24.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer28 = byteBuffer24.putInt(0);
        byte[] byteArray31 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer32 = byteBuffer28.put(byteArray31);
        org.jsoup.helper.HttpConnection.Response response33 = null;
        org.jsoup.helper.HttpConnection.Response response34 = new org.jsoup.helper.HttpConnection.Response(response33);
        response34.contentType = "";
        boolean boolean37 = byteBuffer32.equals((java.lang.Object) "");
        java.nio.ByteBuffer byteBuffer39 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer41 = byteBuffer39.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer43 = byteBuffer39.putInt(0);
        java.nio.ByteBuffer byteBuffer45 = byteBuffer43.putInt((int) '#');
        int int46 = byteBuffer32.compareTo(byteBuffer43);
        java.nio.ByteBuffer byteBuffer47 = byteBuffer16.put(byteBuffer43);
        java.nio.ByteBuffer byteBuffer50 = byteBuffer47.putShort(24, (short) (byte) 0);
        response5.byteData = byteBuffer50;
        // The following exception was thrown during execution in test generation
        try {
            long long52 = byteBuffer50.getLong();
            org.junit.Assert.fail("Expected exception of type java.nio.BufferUnderflowException; message: null");
        } catch (java.nio.BufferUnderflowException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(strEntry7);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertNotNull(byteBuffer12);
        org.junit.Assert.assertNotNull(byteBuffer14);
        org.junit.Assert.assertNotNull(byteBuffer16);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer20);
        org.junit.Assert.assertNotNull(floatBuffer21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(byteBuffer24);
        org.junit.Assert.assertNotNull(byteBuffer26);
        org.junit.Assert.assertNotNull(byteBuffer28);
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray31), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer32);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(byteBuffer39);
        org.junit.Assert.assertNotNull(byteBuffer41);
        org.junit.Assert.assertNotNull(byteBuffer43);
        org.junit.Assert.assertNotNull(byteBuffer45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 2 + "'", int46 == 2);
        org.junit.Assert.assertNotNull(byteBuffer47);
        org.junit.Assert.assertNotNull(byteBuffer50);
    }

    @Test
    public void test00353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00353");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        long long2 = byteBuffer1.getLong();
        int int3 = byteBuffer1.position();
        float float5 = byteBuffer1.getFloat((int) (short) 10);
        boolean boolean6 = byteBuffer1.hasArray();
        double double7 = byteBuffer1.getDouble();
        short short9 = byteBuffer1.getShort(0);
        java.nio.ByteBuffer byteBuffer11 = byteBuffer1.putDouble(100.0d);
        float float12 = byteBuffer1.getFloat();
        java.nio.ByteBuffer byteBuffer15 = byteBuffer1.putShort(24, (short) (byte) -1);
        java.nio.ByteBuffer byteBuffer17 = byteBuffer1.putInt(8);
        java.nio.ByteBuffer byteBuffer18 = byteBuffer17.duplicate();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.Buffer buffer20 = byteBuffer18.limit((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 0 + "'", short9 == (short) 0);
        org.junit.Assert.assertNotNull(byteBuffer11);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.0f + "'", float12 == 0.0f);
        org.junit.Assert.assertNotNull(byteBuffer15);
        org.junit.Assert.assertNotNull(byteBuffer17);
        org.junit.Assert.assertNotNull(byteBuffer18);
    }

    @Test
    public void test00354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00354");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        java.util.Map<java.lang.String, java.lang.String> strMap4 = response1.cookies();
        org.jsoup.Connection.Response response6 = response1.removeCookie("hi!");
        java.lang.String str7 = response1.statusMessage();
        java.nio.ByteBuffer byteBuffer9 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer11 = byteBuffer9.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer13 = byteBuffer9.putInt(0);
        byte[] byteArray16 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer17 = byteBuffer13.put(byteArray16);
        boolean boolean18 = byteBuffer13.hasArray();
        response1.byteData = byteBuffer13;
        boolean boolean21 = response1.hasCookie("\\Qhi!\\E");
        int int22 = response1.numRedirects;
        org.jsoup.helper.HttpConnection.Response response23 = new org.jsoup.helper.HttpConnection.Response(response1);
        int int24 = response23.statusCode();
        org.jsoup.helper.HttpConnection.Response response25 = new org.jsoup.helper.HttpConnection.Response(response23);
        java.net.URL uRL26 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response27 = response23.url(uRL26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertNotNull(byteBuffer11);
        org.junit.Assert.assertNotNull(byteBuffer13);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test00355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00355");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.contentType = "";
        java.lang.String str5 = response1.cookie("hi!");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Response response9 = response1.header("Location", "");
        java.util.Map<java.lang.String, java.lang.String> strMap10 = response1.cookies();
        java.lang.String str11 = response1.charset;
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test00356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00356");
        javax.net.SocketFactory socketFactory0 = javax.net.ssl.SSLSocketFactory.getDefault();
        java.net.Socket socket1 = socketFactory0.createSocket();
        java.net.Socket socket2 = socketFactory0.createSocket();
        java.net.Socket socket3 = socketFactory0.createSocket();
        // The following exception was thrown during execution in test generation
        try {
            java.net.Socket socket6 = socketFactory0.createSocket("java.nio.DirectByteBuffer[pos=35 lim=100 cap=100]", 84);
            org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: java.nio.DirectByteBuffer[pos=35 lim=100 cap=100]");
        } catch (java.net.UnknownHostException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(socketFactory0);
        org.junit.Assert.assertNotNull(socket1);
        org.junit.Assert.assertEquals(socket1.toString(), "Socket[unconnected]");
        org.junit.Assert.assertNotNull(socket2);
        org.junit.Assert.assertEquals(socket2.toString(), "Socket[unconnected]");
        org.junit.Assert.assertNotNull(socket3);
        org.junit.Assert.assertEquals(socket3.toString(), "Socket[unconnected]");
    }

    @Test
    public void test00357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00357");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        java.util.Map<java.lang.String, java.lang.String> strMap4 = response1.cookies();
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response6);
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response6);
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response8);
        response8.executed = true;
        java.util.Map<java.lang.String, java.lang.String> strMap12 = response8.cookies();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = response8.body();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNotNull(strMap12);
    }

    @Test
    public void test00358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00358");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        java.util.Map<java.lang.String, java.lang.String> strMap4 = response1.cookies();
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response6);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray8 = response7.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(strMap4);
    }

    @Test
    public void test00359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00359");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate((int) '4');
        java.nio.ShortBuffer shortBuffer2 = byteBuffer1.asShortBuffer();
        java.nio.ByteBuffer byteBuffer4 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        long long5 = byteBuffer4.getLong();
        int int6 = byteBuffer4.position();
        float float8 = byteBuffer4.getFloat((int) (short) 10);
        boolean boolean9 = byteBuffer4.hasArray();
        double double10 = byteBuffer4.getDouble();
        short short12 = byteBuffer4.getShort(0);
        java.nio.ByteBuffer byteBuffer14 = byteBuffer4.putDouble(100.0d);
        byte byte16 = byteBuffer14.get((int) (short) 0);
        java.nio.IntBuffer intBuffer17 = byteBuffer14.asIntBuffer();
        int int18 = byteBuffer1.compareTo(byteBuffer14);
        java.nio.ByteOrder byteOrder19 = byteBuffer14.order();
        java.nio.ByteBuffer byteBuffer20 = byteBuffer14.slice();
        java.nio.ByteBuffer byteBuffer22 = byteBuffer20.putShort((short) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer25 = byteBuffer22.putDouble((-10), (double) 92);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(shortBuffer2);
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 0 + "'", short12 == (short) 0);
        org.junit.Assert.assertNotNull(byteBuffer14);
        org.junit.Assert.assertTrue("'" + byte16 + "' != '" + (byte) 0 + "'", byte16 == (byte) 0);
        org.junit.Assert.assertNotNull(intBuffer17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-24) + "'", int18 == (-24));
        org.junit.Assert.assertNotNull(byteOrder19);
        org.junit.Assert.assertNotNull(byteBuffer20);
        org.junit.Assert.assertNotNull(byteBuffer22);
    }

    @Test
    public void test00360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00360");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        long long2 = byteBuffer1.getLong();
        int int3 = byteBuffer1.position();
        float float5 = byteBuffer1.getFloat((int) (short) 10);
        boolean boolean6 = byteBuffer1.hasArray();
        java.nio.DoubleBuffer doubleBuffer7 = byteBuffer1.asDoubleBuffer();
        java.nio.Buffer buffer8 = byteBuffer1.clear();
        java.lang.String str9 = byteBuffer1.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer12 = byteBuffer1.putShort((int) (short) -1, (short) (byte) 66);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(doubleBuffer7);
        org.junit.Assert.assertNotNull(buffer8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "java.nio.DirectByteBuffer[pos=0 lim=100 cap=100]" + "'", str9, "java.nio.DirectByteBuffer[pos=0 lim=100 cap=100]");
    }

    @Test
    public void test00361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00361");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.contentType = "";
        java.lang.String str5 = response1.cookie("hi!");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Response response9 = response1.header("Location", "");
        org.jsoup.Connection.Response response12 = response1.header("\\Q\\E", "\\QLocation\\E");
        org.jsoup.Connection.Method method13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response14 = response1.method(method13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertNotNull(response12);
    }

    @Test
    public void test00362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00362");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        java.util.Map<java.lang.String, java.lang.String> strMap4 = response1.cookies();
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response1);
        response1.statusMessage = "java.nio.DirectByteBuffer[pos=35 lim=100 cap=100]";
        int int9 = response1.statusCode();
        java.net.URL uRL10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response11 = response1.url(uRL10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test00363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00363");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.contentType = "";
        java.lang.String str4 = response1.contentType;
        response1.executed = true;
        java.lang.String str7 = response1.statusMessage;
        java.nio.ByteBuffer byteBuffer8 = response1.byteData;
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Response response11 = response1.removeHeader("Location");
        java.lang.String str13 = response1.cookie("\\Qjava.nio.DirectByteBuffer[pos=24 lim=100 cap=100]\\E");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(byteBuffer8);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test00364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00364");
        javax.net.SocketFactory socketFactory0 = javax.net.ssl.SSLSocketFactory.getDefault();
        java.net.Socket socket1 = socketFactory0.createSocket();
        java.net.Socket socket2 = socketFactory0.createSocket();
        java.net.Socket socket3 = socketFactory0.createSocket();
        java.net.InetAddress inetAddress6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.Socket socket8 = socketFactory0.createSocket("", 12, inetAddress6, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.net.BindException; message: Permission denied (Bind failed)");
        } catch (java.net.BindException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(socketFactory0);
        org.junit.Assert.assertNotNull(socket1);
        org.junit.Assert.assertEquals(socket1.toString(), "Socket[unconnected]");
        org.junit.Assert.assertNotNull(socket2);
        org.junit.Assert.assertEquals(socket2.toString(), "Socket[unconnected]");
        org.junit.Assert.assertNotNull(socket3);
        org.junit.Assert.assertEquals(socket3.toString(), "Socket[unconnected]");
    }

    @Test
    public void test00365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00365");
        javax.net.SocketFactory socketFactory0 = javax.net.ssl.SSLSocketFactory.getDefault();
        java.net.InetAddress inetAddress3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.Socket socket5 = socketFactory0.createSocket("java.nio.DirectByteBuffer[pos=0 lim=100 cap=100]", (int) ' ', inetAddress3, 92);
            org.junit.Assert.fail("Expected exception of type java.net.BindException; message: Permission denied (Bind failed)");
        } catch (java.net.BindException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(socketFactory0);
    }

    @Test
    public void test00366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00366");
        java.util.regex.Pattern pattern2 = java.util.regex.Pattern.compile("java.nio.DirectByteBuffer[pos=8 lim=100 cap=100]", 14);
        java.util.stream.Stream<java.lang.String> strStream4 = pattern2.splitAsStream((java.lang.CharSequence) "Location");
        java.lang.CharSequence charSequence5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray6 = pattern2.split(charSequence5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(pattern2);
        org.junit.Assert.assertEquals(pattern2.toString(), "java.nio.DirectByteBuffer[pos=8 lim=100 cap=100]");
        org.junit.Assert.assertNotNull(strStream4);
    }

    @Test
    public void test00367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00367");
        java.util.regex.Pattern pattern3 = java.util.regex.Pattern.compile("hi!", (int) (short) 10);
        java.util.function.Predicate<java.lang.String> strPredicate4 = pattern3.asPredicate();
        java.util.function.Predicate<java.lang.String> strPredicate5 = pattern3.asPredicate();
        java.util.regex.Pattern pattern8 = java.util.regex.Pattern.compile("hi!", (int) (short) 10);
        java.util.function.Predicate<java.lang.String> strPredicate9 = pattern8.asPredicate();
        java.util.function.Predicate<java.lang.String> strPredicate10 = pattern8.asPredicate();
        java.nio.ByteBuffer byteBuffer12 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer14 = byteBuffer12.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer16 = byteBuffer12.putInt(0);
        java.nio.Buffer buffer18 = byteBuffer12.limit(32);
        java.nio.CharBuffer charBuffer19 = byteBuffer12.asCharBuffer();
        java.util.stream.Stream<java.lang.String> strStream20 = pattern8.splitAsStream((java.lang.CharSequence) charBuffer19);
        java.util.stream.Stream<java.lang.String> strStream21 = pattern3.splitAsStream((java.lang.CharSequence) charBuffer19);
        boolean boolean22 = java.util.regex.Pattern.matches("\\Qjava.nio.DirectByteBuffer[pos=24 lim=100 cap=100]\\E", (java.lang.CharSequence) charBuffer19);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.Buffer buffer24 = charBuffer19.limit(64);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(pattern3);
        org.junit.Assert.assertEquals(pattern3.toString(), "hi!");
        org.junit.Assert.assertNotNull(strPredicate4);
        org.junit.Assert.assertNotNull(strPredicate5);
        org.junit.Assert.assertNotNull(pattern8);
        org.junit.Assert.assertEquals(pattern8.toString(), "hi!");
        org.junit.Assert.assertNotNull(strPredicate9);
        org.junit.Assert.assertNotNull(strPredicate10);
        org.junit.Assert.assertNotNull(byteBuffer12);
        org.junit.Assert.assertNotNull(byteBuffer14);
        org.junit.Assert.assertNotNull(byteBuffer16);
        org.junit.Assert.assertNotNull(buffer18);
        org.junit.Assert.assertNotNull(charBuffer19);
        org.junit.Assert.assertNotNull(strStream20);
        org.junit.Assert.assertNotNull(strStream21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test00368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00368");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        long long2 = byteBuffer1.getLong();
        java.nio.ByteBuffer byteBuffer4 = byteBuffer1.putLong((long) 4);
        java.nio.ByteBuffer byteBuffer5 = byteBuffer4.asReadOnlyBuffer();
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray6 = byteBuffer4.array();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertNotNull(byteBuffer5);
    }

    @Test
    public void test00369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00369");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate((int) '4');
        java.nio.ShortBuffer shortBuffer2 = byteBuffer1.asShortBuffer();
        java.nio.ByteBuffer byteBuffer4 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        long long5 = byteBuffer4.getLong();
        int int6 = byteBuffer4.position();
        float float8 = byteBuffer4.getFloat((int) (short) 10);
        boolean boolean9 = byteBuffer4.hasArray();
        double double10 = byteBuffer4.getDouble();
        short short12 = byteBuffer4.getShort(0);
        java.nio.ByteBuffer byteBuffer14 = byteBuffer4.putDouble(100.0d);
        byte byte16 = byteBuffer14.get((int) (short) 0);
        java.nio.IntBuffer intBuffer17 = byteBuffer14.asIntBuffer();
        int int18 = byteBuffer1.compareTo(byteBuffer14);
        java.nio.FloatBuffer floatBuffer19 = byteBuffer14.asFloatBuffer();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.Buffer buffer21 = floatBuffer19.position(256);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: newPosition > limit: (256 > 19)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(shortBuffer2);
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 0 + "'", short12 == (short) 0);
        org.junit.Assert.assertNotNull(byteBuffer14);
        org.junit.Assert.assertTrue("'" + byte16 + "' != '" + (byte) 0 + "'", byte16 == (byte) 0);
        org.junit.Assert.assertNotNull(intBuffer17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-24) + "'", int18 == (-24));
        org.junit.Assert.assertNotNull(floatBuffer19);
    }

    @Test
    public void test00370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00370");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(83);
        org.junit.Assert.assertNotNull(byteBuffer1);
    }

    @Test
    public void test00371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00371");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        long long2 = byteBuffer1.getLong();
        byte byte4 = byteBuffer1.get((int) '4');
        java.nio.ByteBuffer byteBuffer6 = byteBuffer1.putInt((int) (short) 0);
        java.nio.ByteBuffer byteBuffer7 = byteBuffer6.duplicate();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.Buffer buffer9 = byteBuffer6.position((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: newPosition < 0: (-1 < 0)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 0 + "'", byte4 == (byte) 0);
        org.junit.Assert.assertNotNull(byteBuffer6);
        org.junit.Assert.assertNotNull(byteBuffer7);
    }

    @Test
    public void test00372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00372");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.contentType = "";
        java.lang.String str4 = response1.contentType;
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response1);
        boolean boolean7 = response1.hasHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Method method9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response10 = response8.method(method9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test00373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00373");
        javax.net.SocketFactory socketFactory0 = javax.net.ssl.SSLSocketFactory.getDefault();
        java.net.Socket socket1 = socketFactory0.createSocket();
        java.net.InetAddress inetAddress2 = null;
        java.net.InetAddress inetAddress4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.Socket socket6 = socketFactory0.createSocket(inetAddress2, 22, inetAddress4, (-10));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: port out of range:-10");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(socketFactory0);
        org.junit.Assert.assertNotNull(socket1);
        org.junit.Assert.assertEquals(socket1.toString(), "Socket[unconnected]");
    }

    @Test
    public void test00374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00374");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        java.util.Map<java.lang.String, java.lang.String> strMap4 = response1.cookies();
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response6);
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response6);
        java.net.URL uRL9 = response8.url();
        org.jsoup.Connection.Method method10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response11 = response8.method(method10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(uRL9);
    }

    @Test
    public void test00375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00375");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        long long2 = byteBuffer1.getLong();
        int int3 = byteBuffer1.position();
        float float5 = byteBuffer1.getFloat((int) (short) 10);
        boolean boolean6 = byteBuffer1.hasArray();
        double double7 = byteBuffer1.getDouble();
        short short9 = byteBuffer1.getShort(0);
        java.nio.ShortBuffer shortBuffer10 = byteBuffer1.asShortBuffer();
        java.nio.Buffer buffer12 = byteBuffer1.position((int) '#');
        java.lang.String str13 = byteBuffer1.toString();
        byte byte14 = byteBuffer1.get();
        java.nio.ByteBuffer byteBuffer16 = byteBuffer1.putFloat((float) (short) 100);
        java.nio.ByteBuffer byteBuffer19 = byteBuffer1.putInt(1, 0);
        // The following exception was thrown during execution in test generation
        try {
            short short21 = byteBuffer19.getShort((-10));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 0 + "'", short9 == (short) 0);
        org.junit.Assert.assertNotNull(shortBuffer10);
        org.junit.Assert.assertNotNull(buffer12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "java.nio.DirectByteBuffer[pos=35 lim=100 cap=100]" + "'", str13, "java.nio.DirectByteBuffer[pos=35 lim=100 cap=100]");
        org.junit.Assert.assertTrue("'" + byte14 + "' != '" + (byte) 0 + "'", byte14 == (byte) 0);
        org.junit.Assert.assertNotNull(byteBuffer16);
        org.junit.Assert.assertNotNull(byteBuffer19);
    }

    @Test
    public void test00376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00376");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        java.util.Map<java.lang.String, java.lang.String> strMap4 = response1.cookies();
        org.jsoup.Connection.Response response6 = response1.removeCookie("hi!");
        java.lang.String str7 = response1.statusMessage();
        java.nio.ByteBuffer byteBuffer9 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer11 = byteBuffer9.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer13 = byteBuffer9.putInt(0);
        byte[] byteArray16 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer17 = byteBuffer13.put(byteArray16);
        boolean boolean18 = byteBuffer13.hasArray();
        response1.byteData = byteBuffer13;
        java.nio.ByteBuffer byteBuffer21 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer23 = byteBuffer21.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer25 = byteBuffer21.putInt(0);
        byte[] byteArray28 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer29 = byteBuffer25.put(byteArray28);
        boolean boolean30 = byteBuffer25.hasArray();
        java.nio.ByteBuffer byteBuffer32 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer34 = byteBuffer32.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer36 = byteBuffer32.putInt(0);
        byte[] byteArray39 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer40 = byteBuffer36.put(byteArray39);
        java.nio.ByteBuffer byteBuffer42 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer44 = byteBuffer42.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer46 = byteBuffer42.putInt(0);
        byte[] byteArray49 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer50 = byteBuffer46.put(byteArray49);
        java.nio.ByteBuffer byteBuffer53 = byteBuffer36.get(byteArray49, 2, (int) (byte) 0);
        java.nio.ByteBuffer byteBuffer55 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer57 = byteBuffer55.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer59 = byteBuffer55.putInt(0);
        byte[] byteArray62 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer63 = byteBuffer59.put(byteArray62);
        java.nio.ByteBuffer byteBuffer65 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer67 = byteBuffer65.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer69 = byteBuffer65.putInt(0);
        byte[] byteArray72 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer73 = byteBuffer69.put(byteArray72);
        java.nio.ByteBuffer byteBuffer76 = byteBuffer59.get(byteArray72, 2, (int) (byte) 0);
        java.nio.ByteBuffer byteBuffer77 = byteBuffer53.put(byteArray72);
        java.nio.ByteBuffer byteBuffer78 = byteBuffer25.put(byteArray72);
        response1.byteData = byteBuffer25;
        boolean boolean80 = byteBuffer25.hasArray();
        java.nio.ByteBuffer byteBuffer83 = byteBuffer25.putInt(14, 12);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.Buffer buffer84 = byteBuffer25.reset();
            org.junit.Assert.fail("Expected exception of type java.nio.InvalidMarkException; message: null");
        } catch (java.nio.InvalidMarkException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertNotNull(byteBuffer11);
        org.junit.Assert.assertNotNull(byteBuffer13);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(byteBuffer21);
        org.junit.Assert.assertNotNull(byteBuffer23);
        org.junit.Assert.assertNotNull(byteBuffer25);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray28), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(byteBuffer32);
        org.junit.Assert.assertNotNull(byteBuffer34);
        org.junit.Assert.assertNotNull(byteBuffer36);
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray39), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer40);
        org.junit.Assert.assertNotNull(byteBuffer42);
        org.junit.Assert.assertNotNull(byteBuffer44);
        org.junit.Assert.assertNotNull(byteBuffer46);
        org.junit.Assert.assertNotNull(byteArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray49), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer50);
        org.junit.Assert.assertNotNull(byteBuffer53);
        org.junit.Assert.assertNotNull(byteBuffer55);
        org.junit.Assert.assertNotNull(byteBuffer57);
        org.junit.Assert.assertNotNull(byteBuffer59);
        org.junit.Assert.assertNotNull(byteArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray62), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer63);
        org.junit.Assert.assertNotNull(byteBuffer65);
        org.junit.Assert.assertNotNull(byteBuffer67);
        org.junit.Assert.assertNotNull(byteBuffer69);
        org.junit.Assert.assertNotNull(byteArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray72), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer73);
        org.junit.Assert.assertNotNull(byteBuffer76);
        org.junit.Assert.assertNotNull(byteBuffer77);
        org.junit.Assert.assertNotNull(byteBuffer78);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertNotNull(byteBuffer83);
    }

    @Test
    public void test00377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00377");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        long long2 = byteBuffer1.getLong();
        int int3 = byteBuffer1.position();
        float float5 = byteBuffer1.getFloat((int) (short) 10);
        boolean boolean6 = byteBuffer1.hasArray();
        double double7 = byteBuffer1.getDouble();
        short short9 = byteBuffer1.getShort(0);
        java.nio.ShortBuffer shortBuffer10 = byteBuffer1.asShortBuffer();
        java.nio.Buffer buffer12 = byteBuffer1.position((int) '#');
        java.lang.String str13 = byteBuffer1.toString();
        byte byte14 = byteBuffer1.get();
        java.nio.ByteBuffer byteBuffer16 = byteBuffer1.putFloat((float) (short) 100);
        java.nio.FloatBuffer floatBuffer17 = byteBuffer1.asFloatBuffer();
        java.nio.ByteBuffer byteBuffer19 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer21 = byteBuffer19.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer23 = byteBuffer19.putInt(0);
        byte[] byteArray26 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer27 = byteBuffer23.put(byteArray26);
        org.jsoup.helper.HttpConnection.Response response28 = null;
        org.jsoup.helper.HttpConnection.Response response29 = new org.jsoup.helper.HttpConnection.Response(response28);
        response29.contentType = "";
        boolean boolean32 = byteBuffer27.equals((java.lang.Object) "");
        java.nio.ByteBuffer byteBuffer34 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer36 = byteBuffer34.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer38 = byteBuffer34.putInt(0);
        java.nio.ByteBuffer byteBuffer40 = byteBuffer38.putInt((int) '#');
        int int41 = byteBuffer27.compareTo(byteBuffer38);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer42 = byteBuffer1.put(byteBuffer38);
            org.junit.Assert.fail("Expected exception of type java.nio.BufferOverflowException; message: null");
        } catch (java.nio.BufferOverflowException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 0 + "'", short9 == (short) 0);
        org.junit.Assert.assertNotNull(shortBuffer10);
        org.junit.Assert.assertNotNull(buffer12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "java.nio.DirectByteBuffer[pos=35 lim=100 cap=100]" + "'", str13, "java.nio.DirectByteBuffer[pos=35 lim=100 cap=100]");
        org.junit.Assert.assertTrue("'" + byte14 + "' != '" + (byte) 0 + "'", byte14 == (byte) 0);
        org.junit.Assert.assertNotNull(byteBuffer16);
        org.junit.Assert.assertNotNull(floatBuffer17);
        org.junit.Assert.assertNotNull(byteBuffer19);
        org.junit.Assert.assertNotNull(byteBuffer21);
        org.junit.Assert.assertNotNull(byteBuffer23);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer27);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(byteBuffer34);
        org.junit.Assert.assertNotNull(byteBuffer36);
        org.junit.Assert.assertNotNull(byteBuffer38);
        org.junit.Assert.assertNotNull(byteBuffer40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 2 + "'", int41 == 2);
    }

    @Test
    public void test00378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00378");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str4 = response2.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response7 = response2.header("hi!", "");
        org.jsoup.Connection.Request request8 = null;
        response2.req = request8;
        response2.executed = true;
        int int12 = response2.numRedirects;
        org.jsoup.Connection.Response response14 = response2.removeHeader("\\Qjava.nio.DirectByteBuffer[pos=35 lim=100 cap=100]\\E");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response15 = org.jsoup.helper.HttpConnection.Response.execute(request0, response2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(response14);
    }

    @Test
    public void test00379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00379");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        java.util.Map<java.lang.String, java.lang.String> strMap4 = response1.cookies();
        org.jsoup.Connection.Response response6 = response1.removeCookie("hi!");
        java.lang.String str7 = response1.statusMessage();
        java.nio.ByteBuffer byteBuffer9 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer11 = byteBuffer9.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer13 = byteBuffer9.putInt(0);
        byte[] byteArray16 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer17 = byteBuffer13.put(byteArray16);
        boolean boolean18 = byteBuffer13.hasArray();
        response1.byteData = byteBuffer13;
        java.nio.ByteBuffer byteBuffer21 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer23 = byteBuffer21.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer25 = byteBuffer21.putInt(0);
        byte[] byteArray28 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer29 = byteBuffer25.put(byteArray28);
        boolean boolean30 = byteBuffer25.hasArray();
        java.nio.ByteBuffer byteBuffer32 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer34 = byteBuffer32.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer36 = byteBuffer32.putInt(0);
        byte[] byteArray39 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer40 = byteBuffer36.put(byteArray39);
        java.nio.ByteBuffer byteBuffer42 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer44 = byteBuffer42.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer46 = byteBuffer42.putInt(0);
        byte[] byteArray49 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer50 = byteBuffer46.put(byteArray49);
        java.nio.ByteBuffer byteBuffer53 = byteBuffer36.get(byteArray49, 2, (int) (byte) 0);
        java.nio.ByteBuffer byteBuffer55 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer57 = byteBuffer55.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer59 = byteBuffer55.putInt(0);
        byte[] byteArray62 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer63 = byteBuffer59.put(byteArray62);
        java.nio.ByteBuffer byteBuffer65 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer67 = byteBuffer65.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer69 = byteBuffer65.putInt(0);
        byte[] byteArray72 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer73 = byteBuffer69.put(byteArray72);
        java.nio.ByteBuffer byteBuffer76 = byteBuffer59.get(byteArray72, 2, (int) (byte) 0);
        java.nio.ByteBuffer byteBuffer77 = byteBuffer53.put(byteArray72);
        java.nio.ByteBuffer byteBuffer78 = byteBuffer25.put(byteArray72);
        response1.byteData = byteBuffer25;
        java.lang.String str80 = response1.charset();
        java.lang.String str81 = response1.statusMessage;
        java.lang.Class<?> wildcardClass82 = response1.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertNotNull(byteBuffer11);
        org.junit.Assert.assertNotNull(byteBuffer13);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(byteBuffer21);
        org.junit.Assert.assertNotNull(byteBuffer23);
        org.junit.Assert.assertNotNull(byteBuffer25);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray28), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(byteBuffer32);
        org.junit.Assert.assertNotNull(byteBuffer34);
        org.junit.Assert.assertNotNull(byteBuffer36);
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray39), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer40);
        org.junit.Assert.assertNotNull(byteBuffer42);
        org.junit.Assert.assertNotNull(byteBuffer44);
        org.junit.Assert.assertNotNull(byteBuffer46);
        org.junit.Assert.assertNotNull(byteArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray49), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer50);
        org.junit.Assert.assertNotNull(byteBuffer53);
        org.junit.Assert.assertNotNull(byteBuffer55);
        org.junit.Assert.assertNotNull(byteBuffer57);
        org.junit.Assert.assertNotNull(byteBuffer59);
        org.junit.Assert.assertNotNull(byteArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray62), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer63);
        org.junit.Assert.assertNotNull(byteBuffer65);
        org.junit.Assert.assertNotNull(byteBuffer67);
        org.junit.Assert.assertNotNull(byteBuffer69);
        org.junit.Assert.assertNotNull(byteArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray72), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer73);
        org.junit.Assert.assertNotNull(byteBuffer76);
        org.junit.Assert.assertNotNull(byteBuffer77);
        org.junit.Assert.assertNotNull(byteBuffer78);
        org.junit.Assert.assertNull(str80);
        org.junit.Assert.assertNull(str81);
        org.junit.Assert.assertNotNull(wildcardClass82);
    }

    @Test
    public void test00380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00380");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        long long2 = byteBuffer1.getLong();
        int int3 = byteBuffer1.position();
        float float5 = byteBuffer1.getFloat((int) (short) 10);
        boolean boolean6 = byteBuffer1.hasArray();
        double double7 = byteBuffer1.getDouble();
        short short9 = byteBuffer1.getShort(0);
        java.nio.ByteBuffer byteBuffer11 = byteBuffer1.putDouble(100.0d);
        float float12 = byteBuffer1.getFloat();
        char char14 = byteBuffer1.getChar(1);
        float float15 = byteBuffer1.getFloat();
        java.nio.ByteBuffer byteBuffer18 = byteBuffer1.put(32, (byte) 1);
        java.nio.ByteBuffer byteBuffer19 = byteBuffer18.slice();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.Buffer buffer21 = byteBuffer18.limit((-2));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 0 + "'", short9 == (short) 0);
        org.junit.Assert.assertNotNull(byteBuffer11);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.0f + "'", float12 == 0.0f);
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + '\000' + "'", char14 == '\000');
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 0.0f + "'", float15 == 0.0f);
        org.junit.Assert.assertNotNull(byteBuffer18);
        org.junit.Assert.assertNotNull(byteBuffer19);
    }

    @Test
    public void test00381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00381");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        java.util.Map<java.lang.String, java.lang.String> strMap4 = response1.cookies();
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response6);
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response6);
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response8);
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response9);
        java.net.URL uRL11 = response10.url();
        java.net.URL uRL12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response13 = response10.url(uRL12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(uRL11);
    }

    @Test
    public void test00382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00382");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.contentType = "";
        java.lang.String str4 = response1.contentType;
        response1.executed = true;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry8 = response1.scanHeaders("");
        java.lang.String str10 = response1.getHeaderCaseInsensitive("Location");
        java.lang.String str11 = response1.charset();
        response1.numRedirects = (short) 0;
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.Class<?> wildcardClass15 = response14.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(strEntry8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00383");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        long long2 = byteBuffer1.getLong();
        int int3 = byteBuffer1.position();
        float float5 = byteBuffer1.getFloat((int) (short) 10);
        boolean boolean6 = byteBuffer1.hasArray();
        double double7 = byteBuffer1.getDouble();
        short short9 = byteBuffer1.getShort(0);
        java.nio.ByteBuffer byteBuffer11 = byteBuffer1.putDouble(100.0d);
        java.nio.ByteBuffer byteBuffer14 = byteBuffer1.put(32, (byte) 100);
        java.nio.ByteBuffer byteBuffer15 = byteBuffer14.slice();
        boolean boolean16 = byteBuffer15.isReadOnly();
        // The following exception was thrown during execution in test generation
        try {
            int int17 = byteBuffer15.arrayOffset();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 0 + "'", short9 == (short) 0);
        org.junit.Assert.assertNotNull(byteBuffer11);
        org.junit.Assert.assertNotNull(byteBuffer14);
        org.junit.Assert.assertNotNull(byteBuffer15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test00384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00384");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer5 = byteBuffer1.putInt(0);
        byte[] byteArray8 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer9 = byteBuffer5.put(byteArray8);
        boolean boolean10 = byteBuffer5.hasArray();
        double double11 = byteBuffer5.getDouble();
        java.nio.IntBuffer intBuffer12 = byteBuffer5.asIntBuffer();
        java.nio.ByteBuffer byteBuffer15 = byteBuffer5.putShort(0, (short) (byte) 0);
        java.lang.String str16 = byteBuffer15.toString();
        java.nio.ByteBuffer byteBuffer17 = byteBuffer15.asReadOnlyBuffer();
        java.nio.ByteBuffer byteBuffer19 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer21 = byteBuffer19.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer23 = byteBuffer19.putInt(0);
        short short24 = byteBuffer23.getShort();
        java.nio.IntBuffer intBuffer25 = byteBuffer23.asIntBuffer();
        int int26 = byteBuffer23.capacity();
        java.nio.ByteBuffer byteBuffer28 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer30 = byteBuffer28.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer32 = byteBuffer28.putInt(0);
        java.nio.ByteBuffer byteBuffer35 = byteBuffer32.putDouble((int) (byte) 1, (double) 1L);
        java.nio.ByteBuffer byteBuffer37 = byteBuffer32.putChar('a');
        double double39 = byteBuffer37.getDouble(12);
        java.nio.ByteBuffer byteBuffer41 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer43 = byteBuffer41.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer45 = byteBuffer41.putInt(0);
        byte[] byteArray48 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer49 = byteBuffer45.put(byteArray48);
        java.nio.ByteBuffer byteBuffer51 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer53 = byteBuffer51.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer55 = byteBuffer51.putInt(0);
        byte[] byteArray58 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer59 = byteBuffer55.put(byteArray58);
        java.nio.ByteBuffer byteBuffer62 = byteBuffer45.get(byteArray58, 2, (int) (byte) 0);
        java.nio.ByteBuffer byteBuffer63 = byteBuffer37.put(byteArray58);
        java.nio.ByteBuffer byteBuffer64 = byteBuffer23.get(byteArray58);
        java.nio.ByteBuffer byteBuffer65 = java.nio.ByteBuffer.wrap(byteArray58);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer68 = byteBuffer17.put(byteArray58, 20, 3);
            org.junit.Assert.fail("Expected exception of type java.nio.ReadOnlyBufferException; message: null");
        } catch (java.nio.ReadOnlyBufferException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(intBuffer12);
        org.junit.Assert.assertNotNull(byteBuffer15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "java.nio.DirectByteBuffer[pos=22 lim=100 cap=100]" + "'", str16, "java.nio.DirectByteBuffer[pos=22 lim=100 cap=100]");
        org.junit.Assert.assertNotNull(byteBuffer17);
        org.junit.Assert.assertNotNull(byteBuffer19);
        org.junit.Assert.assertNotNull(byteBuffer21);
        org.junit.Assert.assertNotNull(byteBuffer23);
        org.junit.Assert.assertTrue("'" + short24 + "' != '" + (short) 0 + "'", short24 == (short) 0);
        org.junit.Assert.assertNotNull(intBuffer25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 100 + "'", int26 == 100);
        org.junit.Assert.assertNotNull(byteBuffer28);
        org.junit.Assert.assertNotNull(byteBuffer30);
        org.junit.Assert.assertNotNull(byteBuffer32);
        org.junit.Assert.assertNotNull(byteBuffer35);
        org.junit.Assert.assertNotNull(byteBuffer37);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 7.565251118924485E-307d + "'", double39 == 7.565251118924485E-307d);
        org.junit.Assert.assertNotNull(byteBuffer41);
        org.junit.Assert.assertNotNull(byteBuffer43);
        org.junit.Assert.assertNotNull(byteBuffer45);
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray48), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer49);
        org.junit.Assert.assertNotNull(byteBuffer51);
        org.junit.Assert.assertNotNull(byteBuffer53);
        org.junit.Assert.assertNotNull(byteBuffer55);
        org.junit.Assert.assertNotNull(byteArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray58), "[0, 0]");
        org.junit.Assert.assertNotNull(byteBuffer59);
        org.junit.Assert.assertNotNull(byteBuffer62);
        org.junit.Assert.assertNotNull(byteBuffer63);
        org.junit.Assert.assertNotNull(byteBuffer64);
        org.junit.Assert.assertNotNull(byteBuffer65);
    }

    @Test
    public void test00385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00385");
        java.util.regex.Pattern pattern2 = java.util.regex.Pattern.compile("java.nio.DirectByteBuffer[pos=24 lim=100 cap=100]", (int) 'a');
        java.util.function.Predicate<java.lang.String> strPredicate3 = pattern2.asPredicate();
        java.lang.String str4 = pattern2.toString();
        org.junit.Assert.assertNotNull(pattern2);
        org.junit.Assert.assertEquals(pattern2.toString(), "java.nio.DirectByteBuffer[pos=24 lim=100 cap=100]");
        org.junit.Assert.assertNotNull(strPredicate3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.nio.DirectByteBuffer[pos=24 lim=100 cap=100]" + "'", str4, "java.nio.DirectByteBuffer[pos=24 lim=100 cap=100]");
    }

    @Test
    public void test00386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00386");
        org.jsoup.Connection.Request request0 = null;
        java.io.OutputStream outputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response.writePost(request0, outputStream1, "\\QLocation\\E");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00387");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str4 = response2.getHeaderCaseInsensitive("");
        java.util.Map<java.lang.String, java.lang.String> strMap5 = response2.cookies();
        org.jsoup.Connection.Response response7 = response2.removeCookie("hi!");
        java.lang.String str8 = response2.statusMessage();
        java.nio.ByteBuffer byteBuffer10 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer12 = byteBuffer10.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer14 = byteBuffer10.putInt(0);
        byte[] byteArray17 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer18 = byteBuffer14.put(byteArray17);
        boolean boolean19 = byteBuffer14.hasArray();
        response2.byteData = byteBuffer14;
        org.jsoup.Connection.Method method21 = response2.method();
        response2.statusCode = '\000';
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response24 = org.jsoup.helper.HttpConnection.Response.execute(request0, response2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(byteBuffer10);
        org.junit.Assert.assertNotNull(byteBuffer12);
        org.junit.Assert.assertNotNull(byteBuffer14);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(method21);
    }

    @Test
    public void test00388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00388");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer5 = byteBuffer1.putInt(0);
        byte[] byteArray8 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer9 = byteBuffer5.put(byteArray8);
        java.nio.ByteBuffer byteBuffer11 = byteBuffer9.putDouble(7.565251118924485E-307d);
        java.nio.ByteBuffer byteBuffer13 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer15 = byteBuffer13.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer17 = byteBuffer13.putInt(0);
        java.nio.ByteBuffer byteBuffer20 = byteBuffer17.putDouble((int) (byte) 1, (double) 1L);
        java.nio.ByteBuffer byteBuffer22 = byteBuffer17.putChar(' ');
        float float23 = byteBuffer22.getFloat();
        java.nio.ByteBuffer byteBuffer25 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer27 = byteBuffer25.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer29 = byteBuffer25.putInt(0);
        byte[] byteArray32 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer33 = byteBuffer29.put(byteArray32);
        java.nio.FloatBuffer floatBuffer34 = byteBuffer29.asFloatBuffer();
        boolean boolean35 = byteBuffer29.isDirect();
        java.nio.ByteBuffer byteBuffer37 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer39 = byteBuffer37.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer41 = byteBuffer37.putInt(0);
        byte[] byteArray44 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer45 = byteBuffer41.put(byteArray44);
        org.jsoup.helper.HttpConnection.Response response46 = null;
        org.jsoup.helper.HttpConnection.Response response47 = new org.jsoup.helper.HttpConnection.Response(response46);
        response47.contentType = "";
        boolean boolean50 = byteBuffer45.equals((java.lang.Object) "");
        java.nio.ByteBuffer byteBuffer52 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer54 = byteBuffer52.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer56 = byteBuffer52.putInt(0);
        java.nio.ByteBuffer byteBuffer58 = byteBuffer56.putInt((int) '#');
        int int59 = byteBuffer45.compareTo(byteBuffer56);
        java.nio.ByteBuffer byteBuffer60 = byteBuffer29.put(byteBuffer56);
        java.nio.ByteBuffer byteBuffer61 = byteBuffer22.put(byteBuffer29);
        java.nio.ByteBuffer byteBuffer62 = byteBuffer22.compact();
        int int63 = byteBuffer9.compareTo(byteBuffer62);
        byte[] byteArray68 = new byte[] { (byte) 66, (byte) 1, (byte) 100, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer71 = byteBuffer9.put(byteArray68, (int) (short) 10, 23);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertNotNull(byteBuffer11);
        org.junit.Assert.assertNotNull(byteBuffer13);
        org.junit.Assert.assertNotNull(byteBuffer15);
        org.junit.Assert.assertNotNull(byteBuffer17);
        org.junit.Assert.assertNotNull(byteBuffer20);
        org.junit.Assert.assertNotNull(byteBuffer22);
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + 0.0f + "'", float23 == 0.0f);
        org.junit.Assert.assertNotNull(byteBuffer25);
        org.junit.Assert.assertNotNull(byteBuffer27);
        org.junit.Assert.assertNotNull(byteBuffer29);
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray32), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer33);
        org.junit.Assert.assertNotNull(floatBuffer34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(byteBuffer37);
        org.junit.Assert.assertNotNull(byteBuffer39);
        org.junit.Assert.assertNotNull(byteBuffer41);
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray44), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer45);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(byteBuffer52);
        org.junit.Assert.assertNotNull(byteBuffer54);
        org.junit.Assert.assertNotNull(byteBuffer56);
        org.junit.Assert.assertNotNull(byteBuffer58);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 2 + "'", int59 == 2);
        org.junit.Assert.assertNotNull(byteBuffer60);
        org.junit.Assert.assertNotNull(byteBuffer61);
        org.junit.Assert.assertNotNull(byteBuffer62);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 58 + "'", int63 == 58);
        org.junit.Assert.assertNotNull(byteArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray68), "[66, 1, 100, -1]");
    }

    @Test
    public void test00389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00389");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer5 = byteBuffer1.putInt(0);
        java.nio.ByteBuffer byteBuffer8 = byteBuffer5.putDouble((int) (byte) 1, (double) 1L);
        java.nio.ByteBuffer byteBuffer10 = byteBuffer5.putChar('a');
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer13 = byteBuffer5.putChar(100, '\n');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertNotNull(byteBuffer8);
        org.junit.Assert.assertNotNull(byteBuffer10);
    }

    @Test
    public void test00390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00390");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer5 = byteBuffer1.putInt(0);
        byte[] byteArray8 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer9 = byteBuffer5.put(byteArray8);
        // The following exception was thrown during execution in test generation
        try {
            char char11 = byteBuffer9.getChar((-84));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer9);
    }

    @Test
    public void test00391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00391");
        javax.net.SocketFactory socketFactory0 = javax.net.ssl.SSLSocketFactory.getDefault();
        java.net.Socket socket1 = socketFactory0.createSocket();
        java.net.Socket socket2 = socketFactory0.createSocket();
        java.net.Socket socket3 = socketFactory0.createSocket();
        java.net.InetAddress inetAddress4 = null;
        java.net.InetAddress inetAddress6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.Socket socket8 = socketFactory0.createSocket(inetAddress4, 14, inetAddress6, 88);
            org.junit.Assert.fail("Expected exception of type java.net.BindException; message: Permission denied (Bind failed)");
        } catch (java.net.BindException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(socketFactory0);
        org.junit.Assert.assertNotNull(socket1);
        org.junit.Assert.assertEquals(socket1.toString(), "Socket[unconnected]");
        org.junit.Assert.assertNotNull(socket2);
        org.junit.Assert.assertEquals(socket2.toString(), "Socket[unconnected]");
        org.junit.Assert.assertNotNull(socket3);
        org.junit.Assert.assertEquals(socket3.toString(), "Socket[unconnected]");
    }

    @Test
    public void test00392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00392");
        java.lang.String str1 = java.util.regex.Pattern.quote("\\Qhi!\\E");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\Q\\Qhi!\\E\\\\E\\Q\\E" + "'", str1, "\\Q\\Qhi!\\E\\\\E\\Q\\E");
    }

    @Test
    public void test00393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00393");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(1);
        org.junit.Assert.assertNotNull(byteBuffer1);
    }

    @Test
    public void test00394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00394");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        long long2 = byteBuffer1.getLong();
        int int3 = byteBuffer1.position();
        float float5 = byteBuffer1.getFloat((int) (short) 10);
        boolean boolean6 = byteBuffer1.hasArray();
        double double7 = byteBuffer1.getDouble();
        short short9 = byteBuffer1.getShort(0);
        java.nio.ByteBuffer byteBuffer11 = byteBuffer1.putDouble(100.0d);
        org.jsoup.helper.HttpConnection.Response response12 = null;
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response12);
        java.lang.String str15 = response13.getHeaderCaseInsensitive("");
        java.util.Map<java.lang.String, java.lang.String> strMap16 = response13.cookies();
        org.jsoup.Connection.Response response18 = response13.removeCookie("hi!");
        java.lang.String str19 = response13.statusMessage();
        java.nio.ByteBuffer byteBuffer21 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer23 = byteBuffer21.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer25 = byteBuffer21.putInt(0);
        byte[] byteArray28 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer29 = byteBuffer25.put(byteArray28);
        boolean boolean30 = byteBuffer25.hasArray();
        response13.byteData = byteBuffer25;
        int int32 = byteBuffer11.compareTo(byteBuffer25);
        java.lang.String str33 = byteBuffer11.toString();
        java.nio.ByteBuffer byteBuffer35 = byteBuffer11.put((byte) 10);
        org.jsoup.helper.HttpConnection.Response response36 = null;
        org.jsoup.helper.HttpConnection.Response response37 = new org.jsoup.helper.HttpConnection.Response(response36);
        response37.contentType = "";
        java.lang.String str40 = response37.contentType;
        response37.executed = true;
        java.lang.String str43 = response37.statusMessage;
        java.nio.ByteBuffer byteBuffer44 = response37.byteData;
        boolean boolean45 = byteBuffer35.equals((java.lang.Object) response37);
        java.nio.ByteBuffer byteBuffer47 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        long long48 = byteBuffer47.getLong();
        int int49 = byteBuffer47.position();
        float float51 = byteBuffer47.getFloat((int) (short) 10);
        boolean boolean52 = byteBuffer47.hasArray();
        double double53 = byteBuffer47.getDouble();
        short short55 = byteBuffer47.getShort(0);
        java.nio.ByteBuffer byteBuffer57 = byteBuffer47.putDouble(100.0d);
        org.jsoup.helper.HttpConnection.Response response58 = null;
        org.jsoup.helper.HttpConnection.Response response59 = new org.jsoup.helper.HttpConnection.Response(response58);
        java.lang.String str61 = response59.getHeaderCaseInsensitive("");
        java.util.Map<java.lang.String, java.lang.String> strMap62 = response59.cookies();
        org.jsoup.Connection.Response response64 = response59.removeCookie("hi!");
        java.lang.String str65 = response59.statusMessage();
        java.nio.ByteBuffer byteBuffer67 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer69 = byteBuffer67.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer71 = byteBuffer67.putInt(0);
        byte[] byteArray74 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer75 = byteBuffer71.put(byteArray74);
        boolean boolean76 = byteBuffer71.hasArray();
        response59.byteData = byteBuffer71;
        int int78 = byteBuffer57.compareTo(byteBuffer71);
        java.lang.String str79 = byteBuffer57.toString();
        long long80 = byteBuffer57.getLong();
        java.nio.DoubleBuffer doubleBuffer81 = byteBuffer57.asDoubleBuffer();
        response37.byteData = byteBuffer57;
        java.lang.Class<?> wildcardClass83 = response37.getClass();
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 0 + "'", short9 == (short) 0);
        org.junit.Assert.assertNotNull(byteBuffer11);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertNotNull(response18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(byteBuffer21);
        org.junit.Assert.assertNotNull(byteBuffer23);
        org.junit.Assert.assertNotNull(byteBuffer25);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray28), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-10) + "'", int32 == (-10));
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "java.nio.DirectByteBuffer[pos=24 lim=100 cap=100]" + "'", str33, "java.nio.DirectByteBuffer[pos=24 lim=100 cap=100]");
        org.junit.Assert.assertNotNull(byteBuffer35);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertNull(byteBuffer44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(byteBuffer47);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 0L + "'", long48 == 0L);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 8 + "'", int49 == 8);
        org.junit.Assert.assertTrue("'" + float51 + "' != '" + 0.0f + "'", float51 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 0.0d + "'", double53 == 0.0d);
        org.junit.Assert.assertTrue("'" + short55 + "' != '" + (short) 0 + "'", short55 == (short) 0);
        org.junit.Assert.assertNotNull(byteBuffer57);
        org.junit.Assert.assertNull(str61);
        org.junit.Assert.assertNotNull(strMap62);
        org.junit.Assert.assertNotNull(response64);
        org.junit.Assert.assertNull(str65);
        org.junit.Assert.assertNotNull(byteBuffer67);
        org.junit.Assert.assertNotNull(byteBuffer69);
        org.junit.Assert.assertNotNull(byteBuffer71);
        org.junit.Assert.assertNotNull(byteArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray74), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer75);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + (-10) + "'", int78 == (-10));
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "java.nio.DirectByteBuffer[pos=24 lim=100 cap=100]" + "'", str79, "java.nio.DirectByteBuffer[pos=24 lim=100 cap=100]");
        org.junit.Assert.assertTrue("'" + long80 + "' != '" + 0L + "'", long80 == 0L);
        org.junit.Assert.assertNotNull(doubleBuffer81);
        org.junit.Assert.assertNotNull(wildcardClass83);
    }

    @Test
    public void test00395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00395");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.putLong((long) '4');
        int int5 = byteBuffer3.getInt((int) (short) 1);
        java.nio.ByteBuffer byteBuffer7 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer9 = byteBuffer7.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer11 = byteBuffer7.putInt(0);
        byte[] byteArray14 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer15 = byteBuffer11.put(byteArray14);
        java.nio.ByteBuffer byteBuffer17 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer19 = byteBuffer17.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer21 = byteBuffer17.putInt(0);
        byte[] byteArray24 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer25 = byteBuffer21.put(byteArray24);
        java.nio.ByteBuffer byteBuffer28 = byteBuffer11.get(byteArray24, 2, (int) (byte) 0);
        java.nio.ByteBuffer byteBuffer29 = byteBuffer3.get(byteArray24);
        java.nio.ByteBuffer byteBuffer30 = java.nio.ByteBuffer.wrap(byteArray24);
        java.nio.ByteBuffer byteBuffer31 = java.nio.ByteBuffer.wrap(byteArray24);
        // The following exception was thrown during execution in test generation
        try {
            int int33 = byteBuffer31.getInt((-84));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(byteBuffer7);
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertNotNull(byteBuffer11);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer15);
        org.junit.Assert.assertNotNull(byteBuffer17);
        org.junit.Assert.assertNotNull(byteBuffer19);
        org.junit.Assert.assertNotNull(byteBuffer21);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[0, 0]");
        org.junit.Assert.assertNotNull(byteBuffer25);
        org.junit.Assert.assertNotNull(byteBuffer28);
        org.junit.Assert.assertNotNull(byteBuffer29);
        org.junit.Assert.assertNotNull(byteBuffer30);
        org.junit.Assert.assertNotNull(byteBuffer31);
    }

    @Test
    public void test00396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00396");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        java.util.Map<java.lang.String, java.lang.String> strMap4 = response1.cookies();
        org.jsoup.Connection.Response response6 = response1.removeCookie("hi!");
        java.lang.String str7 = response1.statusMessage();
        java.nio.ByteBuffer byteBuffer9 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer11 = byteBuffer9.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer13 = byteBuffer9.putInt(0);
        byte[] byteArray16 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer17 = byteBuffer13.put(byteArray16);
        boolean boolean18 = byteBuffer13.hasArray();
        response1.byteData = byteBuffer13;
        org.jsoup.helper.HttpConnection.Response response20 = new org.jsoup.helper.HttpConnection.Response(response1);
        boolean boolean21 = response20.executed;
        org.jsoup.helper.HttpConnection.Response response22 = new org.jsoup.helper.HttpConnection.Response(response20);
        org.jsoup.helper.HttpConnection.Response response23 = new org.jsoup.helper.HttpConnection.Response(response20);
        org.jsoup.helper.HttpConnection.Response response24 = new org.jsoup.helper.HttpConnection.Response(response20);
        java.nio.ByteBuffer byteBuffer26 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        long long27 = byteBuffer26.getLong();
        int int28 = byteBuffer26.position();
        float float30 = byteBuffer26.getFloat((int) (short) 10);
        boolean boolean31 = byteBuffer26.hasArray();
        java.nio.ByteBuffer byteBuffer33 = byteBuffer26.putFloat((float) (-24));
        response24.byteData = byteBuffer26;
        java.nio.ByteBuffer byteBuffer37 = byteBuffer26.putDouble(88, 10.0d);
        java.nio.ByteBuffer byteBuffer39 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer41 = byteBuffer39.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer43 = byteBuffer39.putInt(0);
        java.nio.ByteBuffer byteBuffer45 = byteBuffer43.putInt((int) '#');
        float float47 = byteBuffer45.getFloat(4);
        java.nio.ByteBuffer byteBuffer49 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer51 = byteBuffer49.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer53 = byteBuffer49.putInt(0);
        byte[] byteArray56 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer57 = byteBuffer53.put(byteArray56);
        java.nio.ByteBuffer byteBuffer59 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer61 = byteBuffer59.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer63 = byteBuffer59.putInt(0);
        byte[] byteArray66 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer67 = byteBuffer63.put(byteArray66);
        java.nio.ByteBuffer byteBuffer70 = byteBuffer53.get(byteArray66, 2, (int) (byte) 0);
        java.nio.ByteBuffer byteBuffer72 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer74 = byteBuffer72.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer76 = byteBuffer72.putInt(0);
        byte[] byteArray79 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer80 = byteBuffer76.put(byteArray79);
        java.nio.ByteBuffer byteBuffer82 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer84 = byteBuffer82.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer86 = byteBuffer82.putInt(0);
        byte[] byteArray89 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer90 = byteBuffer86.put(byteArray89);
        java.nio.ByteBuffer byteBuffer93 = byteBuffer76.get(byteArray89, 2, (int) (byte) 0);
        java.nio.ByteBuffer byteBuffer94 = byteBuffer70.put(byteArray89);
        java.nio.ByteBuffer byteBuffer95 = byteBuffer45.put(byteArray89);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer98 = byteBuffer26.put(byteArray89, 256, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertNotNull(byteBuffer11);
        org.junit.Assert.assertNotNull(byteBuffer13);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(byteBuffer26);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 8 + "'", int28 == 8);
        org.junit.Assert.assertTrue("'" + float30 + "' != '" + 0.0f + "'", float30 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(byteBuffer33);
        org.junit.Assert.assertNotNull(byteBuffer37);
        org.junit.Assert.assertNotNull(byteBuffer39);
        org.junit.Assert.assertNotNull(byteBuffer41);
        org.junit.Assert.assertNotNull(byteBuffer43);
        org.junit.Assert.assertNotNull(byteBuffer45);
        org.junit.Assert.assertTrue("'" + float47 + "' != '" + 7.3E-44f + "'", float47 == 7.3E-44f);
        org.junit.Assert.assertNotNull(byteBuffer49);
        org.junit.Assert.assertNotNull(byteBuffer51);
        org.junit.Assert.assertNotNull(byteBuffer53);
        org.junit.Assert.assertNotNull(byteArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray56), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer57);
        org.junit.Assert.assertNotNull(byteBuffer59);
        org.junit.Assert.assertNotNull(byteBuffer61);
        org.junit.Assert.assertNotNull(byteBuffer63);
        org.junit.Assert.assertNotNull(byteArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray66), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer67);
        org.junit.Assert.assertNotNull(byteBuffer70);
        org.junit.Assert.assertNotNull(byteBuffer72);
        org.junit.Assert.assertNotNull(byteBuffer74);
        org.junit.Assert.assertNotNull(byteBuffer76);
        org.junit.Assert.assertNotNull(byteArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray79), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer80);
        org.junit.Assert.assertNotNull(byteBuffer82);
        org.junit.Assert.assertNotNull(byteBuffer84);
        org.junit.Assert.assertNotNull(byteBuffer86);
        org.junit.Assert.assertNotNull(byteArray89);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray89), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer90);
        org.junit.Assert.assertNotNull(byteBuffer93);
        org.junit.Assert.assertNotNull(byteBuffer94);
        org.junit.Assert.assertNotNull(byteBuffer95);
    }

    @Test
    public void test00397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00397");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        java.util.Map<java.lang.String, java.lang.String> strMap4 = response1.cookies();
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response6);
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response6);
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response8);
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response9);
        org.jsoup.Connection.Request request11 = null;
        response10.req = request11;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = response10.hasHeaderWithValue("", "java.nio.DirectByteBuffer[pos=35 lim=100 cap=100]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(strMap4);
    }

    @Test
    public void test00398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00398");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer5 = byteBuffer1.putInt(0);
        byte[] byteArray8 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer9 = byteBuffer5.put(byteArray8);
        boolean boolean10 = byteBuffer5.hasArray();
        double double11 = byteBuffer5.getDouble();
        java.nio.IntBuffer intBuffer12 = byteBuffer5.asIntBuffer();
        java.nio.ByteBuffer byteBuffer15 = byteBuffer5.putShort(0, (short) (byte) 0);
        java.lang.String str16 = byteBuffer15.toString();
        java.nio.LongBuffer longBuffer17 = byteBuffer15.asLongBuffer();
        // The following exception was thrown during execution in test generation
        try {
            long long19 = byteBuffer15.getLong((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(intBuffer12);
        org.junit.Assert.assertNotNull(byteBuffer15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "java.nio.DirectByteBuffer[pos=22 lim=100 cap=100]" + "'", str16, "java.nio.DirectByteBuffer[pos=22 lim=100 cap=100]");
        org.junit.Assert.assertNotNull(longBuffer17);
    }

    @Test
    public void test00399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00399");
        org.jsoup.helper.HttpConnection.Response.MAX_REDIRECTS = (short) -1;
    }

    @Test
    public void test00400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00400");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.contentType = "";
        java.lang.String str4 = response1.contentType;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry6 = response1.scanHeaders("\\QLocation\\E");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response1);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Too many redirects occurred trying to load URL null");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(strEntry6);
    }

    @Test
    public void test00401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00401");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate((int) '4');
        java.nio.ShortBuffer shortBuffer2 = byteBuffer1.asShortBuffer();
        java.nio.ByteBuffer byteBuffer4 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        long long5 = byteBuffer4.getLong();
        int int6 = byteBuffer4.position();
        float float8 = byteBuffer4.getFloat((int) (short) 10);
        boolean boolean9 = byteBuffer4.hasArray();
        double double10 = byteBuffer4.getDouble();
        short short12 = byteBuffer4.getShort(0);
        java.nio.ByteBuffer byteBuffer14 = byteBuffer4.putDouble(100.0d);
        byte byte16 = byteBuffer14.get((int) (short) 0);
        java.nio.IntBuffer intBuffer17 = byteBuffer14.asIntBuffer();
        int int18 = byteBuffer1.compareTo(byteBuffer14);
        java.nio.FloatBuffer floatBuffer19 = byteBuffer14.asFloatBuffer();
        java.nio.ByteBuffer byteBuffer21 = byteBuffer14.put((byte) -1);
        java.nio.ByteBuffer byteBuffer24 = byteBuffer21.putShort(2, (short) (byte) 0);
        java.nio.FloatBuffer floatBuffer25 = byteBuffer24.asFloatBuffer();
        java.nio.Buffer buffer26 = byteBuffer24.flip();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.Buffer buffer28 = buffer26.position((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: newPosition > limit: (32 > 25)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(shortBuffer2);
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 0 + "'", short12 == (short) 0);
        org.junit.Assert.assertNotNull(byteBuffer14);
        org.junit.Assert.assertTrue("'" + byte16 + "' != '" + (byte) 0 + "'", byte16 == (byte) 0);
        org.junit.Assert.assertNotNull(intBuffer17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-24) + "'", int18 == (-24));
        org.junit.Assert.assertNotNull(floatBuffer19);
        org.junit.Assert.assertNotNull(byteBuffer21);
        org.junit.Assert.assertNotNull(byteBuffer24);
        org.junit.Assert.assertNotNull(floatBuffer25);
        org.junit.Assert.assertNotNull(buffer26);
    }

    @Test
    public void test00402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00402");
        boolean boolean2 = java.util.regex.Pattern.matches("java.nio.DirectByteBuffer[pos=8 lim=100 cap=100]", (java.lang.CharSequence) "java.nio.DirectByteBuffer[pos=10 lim=100 cap=100]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00403");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer5 = byteBuffer1.putInt(0);
        byte[] byteArray8 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer9 = byteBuffer5.put(byteArray8);
        java.nio.CharBuffer charBuffer10 = byteBuffer5.asCharBuffer();
        java.nio.ByteBuffer byteBuffer12 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer14 = byteBuffer12.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer16 = byteBuffer12.putInt(0);
        java.nio.ByteBuffer byteBuffer18 = byteBuffer16.putInt((int) '#');
        float float20 = byteBuffer18.getFloat(4);
        java.nio.ByteBuffer byteBuffer22 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer24 = byteBuffer22.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer26 = byteBuffer22.putInt(0);
        byte[] byteArray29 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer30 = byteBuffer26.put(byteArray29);
        java.nio.ByteBuffer byteBuffer32 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer34 = byteBuffer32.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer36 = byteBuffer32.putInt(0);
        byte[] byteArray39 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer40 = byteBuffer36.put(byteArray39);
        java.nio.ByteBuffer byteBuffer43 = byteBuffer26.get(byteArray39, 2, (int) (byte) 0);
        java.nio.ByteBuffer byteBuffer45 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer47 = byteBuffer45.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer49 = byteBuffer45.putInt(0);
        byte[] byteArray52 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer53 = byteBuffer49.put(byteArray52);
        java.nio.ByteBuffer byteBuffer55 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer57 = byteBuffer55.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer59 = byteBuffer55.putInt(0);
        byte[] byteArray62 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer63 = byteBuffer59.put(byteArray62);
        java.nio.ByteBuffer byteBuffer66 = byteBuffer49.get(byteArray62, 2, (int) (byte) 0);
        java.nio.ByteBuffer byteBuffer67 = byteBuffer43.put(byteArray62);
        java.nio.ByteBuffer byteBuffer68 = byteBuffer18.put(byteArray62);
        java.nio.ByteBuffer byteBuffer69 = byteBuffer5.get(byteArray62);
        java.nio.ByteBuffer byteBuffer70 = java.nio.ByteBuffer.wrap(byteArray62);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer73 = byteBuffer70.putDouble(14, (double) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertNotNull(charBuffer10);
        org.junit.Assert.assertNotNull(byteBuffer12);
        org.junit.Assert.assertNotNull(byteBuffer14);
        org.junit.Assert.assertNotNull(byteBuffer16);
        org.junit.Assert.assertNotNull(byteBuffer18);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 7.3E-44f + "'", float20 == 7.3E-44f);
        org.junit.Assert.assertNotNull(byteBuffer22);
        org.junit.Assert.assertNotNull(byteBuffer24);
        org.junit.Assert.assertNotNull(byteBuffer26);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray29), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer30);
        org.junit.Assert.assertNotNull(byteBuffer32);
        org.junit.Assert.assertNotNull(byteBuffer34);
        org.junit.Assert.assertNotNull(byteBuffer36);
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray39), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer40);
        org.junit.Assert.assertNotNull(byteBuffer43);
        org.junit.Assert.assertNotNull(byteBuffer45);
        org.junit.Assert.assertNotNull(byteBuffer47);
        org.junit.Assert.assertNotNull(byteBuffer49);
        org.junit.Assert.assertNotNull(byteArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray52), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer53);
        org.junit.Assert.assertNotNull(byteBuffer55);
        org.junit.Assert.assertNotNull(byteBuffer57);
        org.junit.Assert.assertNotNull(byteBuffer59);
        org.junit.Assert.assertNotNull(byteArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray62), "[0, 0]");
        org.junit.Assert.assertNotNull(byteBuffer63);
        org.junit.Assert.assertNotNull(byteBuffer66);
        org.junit.Assert.assertNotNull(byteBuffer67);
        org.junit.Assert.assertNotNull(byteBuffer68);
        org.junit.Assert.assertNotNull(byteBuffer69);
        org.junit.Assert.assertNotNull(byteBuffer70);
    }

    @Test
    public void test00404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00404");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.putLong((long) '4');
        short short5 = byteBuffer1.getShort(0);
        java.nio.ByteBuffer byteBuffer8 = byteBuffer1.putChar(1, '4');
        java.nio.ByteBuffer byteBuffer10 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer12 = byteBuffer10.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer14 = byteBuffer10.putInt(0);
        byte[] byteArray17 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer18 = byteBuffer14.put(byteArray17);
        java.nio.ByteBuffer byteBuffer20 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer22 = byteBuffer20.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer24 = byteBuffer20.putInt(0);
        byte[] byteArray27 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer28 = byteBuffer24.put(byteArray27);
        java.nio.ByteBuffer byteBuffer31 = byteBuffer14.get(byteArray27, 2, (int) (byte) 0);
        java.nio.ByteBuffer byteBuffer33 = byteBuffer14.putDouble(100.0d);
        int int34 = byteBuffer8.compareTo(byteBuffer14);
        java.nio.ByteBuffer byteBuffer36 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer38 = byteBuffer36.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer40 = byteBuffer36.putInt(0);
        byte[] byteArray43 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer44 = byteBuffer40.put(byteArray43);
        java.nio.ByteOrder byteOrder45 = byteBuffer44.order();
        java.nio.ByteBuffer byteBuffer46 = byteBuffer14.order(byteOrder45);
        java.nio.ByteBuffer byteBuffer47 = byteBuffer14.slice();
        java.nio.ByteBuffer byteBuffer49 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer51 = byteBuffer49.putLong((long) '4');
        int int53 = byteBuffer51.getInt((int) (short) 1);
        java.nio.ByteBuffer byteBuffer55 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer57 = byteBuffer55.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer59 = byteBuffer55.putInt(0);
        byte[] byteArray62 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer63 = byteBuffer59.put(byteArray62);
        java.nio.ByteBuffer byteBuffer65 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer67 = byteBuffer65.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer69 = byteBuffer65.putInt(0);
        byte[] byteArray72 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer73 = byteBuffer69.put(byteArray72);
        java.nio.ByteBuffer byteBuffer76 = byteBuffer59.get(byteArray72, 2, (int) (byte) 0);
        java.nio.ByteBuffer byteBuffer77 = byteBuffer51.get(byteArray72);
        java.nio.ByteBuffer byteBuffer78 = byteBuffer14.get(byteArray72);
        double double79 = byteBuffer14.getDouble();
        int int81 = byteBuffer14.getInt(52);
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 0 + "'", short5 == (short) 0);
        org.junit.Assert.assertNotNull(byteBuffer8);
        org.junit.Assert.assertNotNull(byteBuffer10);
        org.junit.Assert.assertNotNull(byteBuffer12);
        org.junit.Assert.assertNotNull(byteBuffer14);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer18);
        org.junit.Assert.assertNotNull(byteBuffer20);
        org.junit.Assert.assertNotNull(byteBuffer22);
        org.junit.Assert.assertNotNull(byteBuffer24);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer28);
        org.junit.Assert.assertNotNull(byteBuffer31);
        org.junit.Assert.assertNotNull(byteBuffer33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 14 + "'", int34 == 14);
        org.junit.Assert.assertNotNull(byteBuffer36);
        org.junit.Assert.assertNotNull(byteBuffer38);
        org.junit.Assert.assertNotNull(byteBuffer40);
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray43), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer44);
        org.junit.Assert.assertNotNull(byteOrder45);
        org.junit.Assert.assertNotNull(byteBuffer46);
        org.junit.Assert.assertNotNull(byteBuffer47);
        org.junit.Assert.assertNotNull(byteBuffer49);
        org.junit.Assert.assertNotNull(byteBuffer51);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertNotNull(byteBuffer55);
        org.junit.Assert.assertNotNull(byteBuffer57);
        org.junit.Assert.assertNotNull(byteBuffer59);
        org.junit.Assert.assertNotNull(byteArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray62), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer63);
        org.junit.Assert.assertNotNull(byteBuffer65);
        org.junit.Assert.assertNotNull(byteBuffer67);
        org.junit.Assert.assertNotNull(byteBuffer69);
        org.junit.Assert.assertNotNull(byteArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray72), "[0, 0]");
        org.junit.Assert.assertNotNull(byteBuffer73);
        org.junit.Assert.assertNotNull(byteBuffer76);
        org.junit.Assert.assertNotNull(byteBuffer77);
        org.junit.Assert.assertNotNull(byteBuffer78);
        org.junit.Assert.assertTrue("'" + double79 + "' != '" + 0.0d + "'", double79 == 0.0d);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 0 + "'", int81 == 0);
    }

    @Test
    public void test00405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00405");
        javax.net.SocketFactory socketFactory0 = javax.net.ssl.SSLSocketFactory.getDefault();
        java.net.Socket socket1 = socketFactory0.createSocket();
        java.net.Socket socket2 = socketFactory0.createSocket();
        java.net.Socket socket3 = socketFactory0.createSocket();
        java.net.InetAddress inetAddress4 = null;
        java.net.InetAddress inetAddress6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.Socket socket8 = socketFactory0.createSocket(inetAddress4, 85, inetAddress6, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: port out of range:-1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(socketFactory0);
        org.junit.Assert.assertNotNull(socket1);
        org.junit.Assert.assertEquals(socket1.toString(), "Socket[unconnected]");
        org.junit.Assert.assertNotNull(socket2);
        org.junit.Assert.assertEquals(socket2.toString(), "Socket[unconnected]");
        org.junit.Assert.assertNotNull(socket3);
        org.junit.Assert.assertEquals(socket3.toString(), "Socket[unconnected]");
    }

    @Test
    public void test00406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00406");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response6 = response1.header("hi!", "");
        org.jsoup.Connection.Response response8 = response1.removeHeader("java.nio.DirectByteBuffer[pos=10 lim=100 cap=100]");
        org.jsoup.Connection.Method method9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response10 = response1.method(method9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNotNull(response8);
    }

    @Test
    public void test00407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00407");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer5 = byteBuffer1.putInt(0);
        java.nio.ByteBuffer byteBuffer7 = byteBuffer5.putInt((int) '#');
        byte byte9 = byteBuffer5.get(1);
        java.nio.ByteBuffer byteBuffer12 = byteBuffer5.put(14, (byte) -1);
        java.nio.ByteBuffer byteBuffer13 = byteBuffer5.slice();
        int int14 = byteBuffer5.getInt();
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertNotNull(byteBuffer7);
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 0 + "'", byte9 == (byte) 0);
        org.junit.Assert.assertNotNull(byteBuffer12);
        org.junit.Assert.assertNotNull(byteBuffer13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test00408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00408");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
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
    public void test00409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00409");
        javax.net.SocketFactory socketFactory0 = javax.net.ssl.SSLSocketFactory.getDefault();
        java.net.Socket socket1 = socketFactory0.createSocket();
        java.net.Socket socket2 = socketFactory0.createSocket();
        java.net.Socket socket3 = socketFactory0.createSocket();
        java.net.Socket socket4 = socketFactory0.createSocket();
        java.net.InetAddress inetAddress5 = null;
        java.net.InetAddress inetAddress7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.Socket socket9 = socketFactory0.createSocket(inetAddress5, (int) '#', inetAddress7, 16);
            org.junit.Assert.fail("Expected exception of type java.net.BindException; message: Permission denied (Bind failed)");
        } catch (java.net.BindException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(socketFactory0);
        org.junit.Assert.assertNotNull(socket1);
        org.junit.Assert.assertEquals(socket1.toString(), "Socket[unconnected]");
        org.junit.Assert.assertNotNull(socket2);
        org.junit.Assert.assertEquals(socket2.toString(), "Socket[unconnected]");
        org.junit.Assert.assertNotNull(socket3);
        org.junit.Assert.assertEquals(socket3.toString(), "Socket[unconnected]");
        org.junit.Assert.assertNotNull(socket4);
        org.junit.Assert.assertEquals(socket4.toString(), "Socket[unconnected]");
    }

    @Test
    public void test00410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00410");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        long long2 = byteBuffer1.getLong();
        int int3 = byteBuffer1.position();
        float float5 = byteBuffer1.getFloat((int) (short) 10);
        boolean boolean6 = byteBuffer1.hasArray();
        byte byte7 = byteBuffer1.get();
        java.nio.ByteBuffer byteBuffer9 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        long long10 = byteBuffer9.getLong();
        int int11 = byteBuffer9.position();
        float float13 = byteBuffer9.getFloat((int) (short) 10);
        boolean boolean14 = byteBuffer9.hasArray();
        double double15 = byteBuffer9.getDouble();
        short short17 = byteBuffer9.getShort(0);
        java.nio.ByteBuffer byteBuffer19 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer21 = byteBuffer19.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer23 = byteBuffer19.putInt(0);
        byte[] byteArray26 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer27 = byteBuffer23.put(byteArray26);
        boolean boolean28 = byteBuffer23.hasArray();
        java.nio.ByteBuffer byteBuffer30 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer32 = byteBuffer30.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer34 = byteBuffer30.putInt(0);
        byte[] byteArray37 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer38 = byteBuffer34.put(byteArray37);
        java.nio.ByteBuffer byteBuffer40 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer42 = byteBuffer40.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer44 = byteBuffer40.putInt(0);
        byte[] byteArray47 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer48 = byteBuffer44.put(byteArray47);
        java.nio.ByteBuffer byteBuffer51 = byteBuffer34.get(byteArray47, 2, (int) (byte) 0);
        java.nio.ByteBuffer byteBuffer53 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer55 = byteBuffer53.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer57 = byteBuffer53.putInt(0);
        byte[] byteArray60 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer61 = byteBuffer57.put(byteArray60);
        java.nio.ByteBuffer byteBuffer63 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer65 = byteBuffer63.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer67 = byteBuffer63.putInt(0);
        byte[] byteArray70 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer71 = byteBuffer67.put(byteArray70);
        java.nio.ByteBuffer byteBuffer74 = byteBuffer57.get(byteArray70, 2, (int) (byte) 0);
        java.nio.ByteBuffer byteBuffer75 = byteBuffer51.put(byteArray70);
        java.nio.ByteBuffer byteBuffer76 = byteBuffer23.put(byteArray70);
        java.nio.ByteBuffer byteBuffer77 = byteBuffer9.get(byteArray70);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer80 = byteBuffer1.get(byteArray70, (int) (short) -1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 0 + "'", byte7 == (byte) 0);
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 8 + "'", int11 == 8);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 0.0f + "'", float13 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + short17 + "' != '" + (short) 0 + "'", short17 == (short) 0);
        org.junit.Assert.assertNotNull(byteBuffer19);
        org.junit.Assert.assertNotNull(byteBuffer21);
        org.junit.Assert.assertNotNull(byteBuffer23);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(byteBuffer30);
        org.junit.Assert.assertNotNull(byteBuffer32);
        org.junit.Assert.assertNotNull(byteBuffer34);
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray37), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer38);
        org.junit.Assert.assertNotNull(byteBuffer40);
        org.junit.Assert.assertNotNull(byteBuffer42);
        org.junit.Assert.assertNotNull(byteBuffer44);
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray47), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer48);
        org.junit.Assert.assertNotNull(byteBuffer51);
        org.junit.Assert.assertNotNull(byteBuffer53);
        org.junit.Assert.assertNotNull(byteBuffer55);
        org.junit.Assert.assertNotNull(byteBuffer57);
        org.junit.Assert.assertNotNull(byteArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray60), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer61);
        org.junit.Assert.assertNotNull(byteBuffer63);
        org.junit.Assert.assertNotNull(byteBuffer65);
        org.junit.Assert.assertNotNull(byteBuffer67);
        org.junit.Assert.assertNotNull(byteArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray70), "[0, 0]");
        org.junit.Assert.assertNotNull(byteBuffer71);
        org.junit.Assert.assertNotNull(byteBuffer74);
        org.junit.Assert.assertNotNull(byteBuffer75);
        org.junit.Assert.assertNotNull(byteBuffer76);
        org.junit.Assert.assertNotNull(byteBuffer77);
    }

    @Test
    public void test00411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00411");
        org.jsoup.Connection.Request request0 = null;
        java.io.OutputStream outputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response.writePost(request0, outputStream1, "\\Q\\E");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00412");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        long long2 = byteBuffer1.getLong();
        int int3 = byteBuffer1.position();
        float float5 = byteBuffer1.getFloat((int) (short) 10);
        boolean boolean6 = byteBuffer1.hasArray();
        float float8 = byteBuffer1.getFloat(0);
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8 == 0.0f);
    }

    @Test
    public void test00413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00413");
        java.util.regex.Pattern pattern2 = java.util.regex.Pattern.compile("java.nio.DirectByteBuffer[pos=24 lim=100 cap=100]", (int) 'a');
        java.util.function.Predicate<java.lang.String> strPredicate3 = pattern2.asPredicate();
        int int4 = pattern2.flags();
        org.junit.Assert.assertNotNull(pattern2);
        org.junit.Assert.assertEquals(pattern2.toString(), "java.nio.DirectByteBuffer[pos=24 lim=100 cap=100]");
        org.junit.Assert.assertNotNull(strPredicate3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
    }

    @Test
    public void test00414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00414");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer5 = byteBuffer1.putInt(0);
        java.nio.ByteBuffer byteBuffer7 = byteBuffer5.putInt((int) '#');
        byte byte9 = byteBuffer5.get(1);
        java.nio.ByteBuffer byteBuffer12 = byteBuffer5.put(14, (byte) -1);
        java.nio.ByteBuffer byteBuffer13 = byteBuffer5.slice();
        java.nio.Buffer buffer14 = byteBuffer13.flip();
        boolean boolean15 = buffer14.isReadOnly();
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertNotNull(byteBuffer7);
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 0 + "'", byte9 == (byte) 0);
        org.junit.Assert.assertNotNull(byteBuffer12);
        org.junit.Assert.assertNotNull(byteBuffer13);
        org.junit.Assert.assertNotNull(buffer14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test00415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00415");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer5 = byteBuffer1.putInt(0);
        java.nio.ByteBuffer byteBuffer7 = byteBuffer5.putInt((int) '#');
        float float9 = byteBuffer7.getFloat(4);
        java.nio.ByteBuffer byteBuffer11 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer13 = byteBuffer11.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer15 = byteBuffer11.putInt(0);
        byte[] byteArray18 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer19 = byteBuffer15.put(byteArray18);
        java.nio.ByteBuffer byteBuffer21 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer23 = byteBuffer21.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer25 = byteBuffer21.putInt(0);
        byte[] byteArray28 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer29 = byteBuffer25.put(byteArray28);
        java.nio.ByteBuffer byteBuffer32 = byteBuffer15.get(byteArray28, 2, (int) (byte) 0);
        java.nio.ByteBuffer byteBuffer34 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer36 = byteBuffer34.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer38 = byteBuffer34.putInt(0);
        byte[] byteArray41 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer42 = byteBuffer38.put(byteArray41);
        java.nio.ByteBuffer byteBuffer44 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer46 = byteBuffer44.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer48 = byteBuffer44.putInt(0);
        byte[] byteArray51 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer52 = byteBuffer48.put(byteArray51);
        java.nio.ByteBuffer byteBuffer55 = byteBuffer38.get(byteArray51, 2, (int) (byte) 0);
        java.nio.ByteBuffer byteBuffer56 = byteBuffer32.put(byteArray51);
        java.nio.ByteBuffer byteBuffer57 = byteBuffer7.put(byteArray51);
        java.nio.ByteBuffer byteBuffer58 = byteBuffer7.compact();
        java.nio.ByteBuffer byteBuffer61 = byteBuffer58.putShort(8, (short) (byte) 1);
        int int63 = byteBuffer58.getInt(0);
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertNotNull(byteBuffer7);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 7.3E-44f + "'", float9 == 7.3E-44f);
        org.junit.Assert.assertNotNull(byteBuffer11);
        org.junit.Assert.assertNotNull(byteBuffer13);
        org.junit.Assert.assertNotNull(byteBuffer15);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer19);
        org.junit.Assert.assertNotNull(byteBuffer21);
        org.junit.Assert.assertNotNull(byteBuffer23);
        org.junit.Assert.assertNotNull(byteBuffer25);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray28), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer29);
        org.junit.Assert.assertNotNull(byteBuffer32);
        org.junit.Assert.assertNotNull(byteBuffer34);
        org.junit.Assert.assertNotNull(byteBuffer36);
        org.junit.Assert.assertNotNull(byteBuffer38);
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray41), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer42);
        org.junit.Assert.assertNotNull(byteBuffer44);
        org.junit.Assert.assertNotNull(byteBuffer46);
        org.junit.Assert.assertNotNull(byteBuffer48);
        org.junit.Assert.assertNotNull(byteArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray51), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer52);
        org.junit.Assert.assertNotNull(byteBuffer55);
        org.junit.Assert.assertNotNull(byteBuffer56);
        org.junit.Assert.assertNotNull(byteBuffer57);
        org.junit.Assert.assertNotNull(byteBuffer58);
        org.junit.Assert.assertNotNull(byteBuffer61);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
    }

    @Test
    public void test00416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00416");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.contentType = "";
        java.lang.String str5 = response1.cookie("hi!");
        int int6 = response1.statusCode();
        org.jsoup.Connection.Request request7 = response1.req;
        java.lang.String str8 = response1.charset;
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray9 = response1.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(request7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test00417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00417");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.putLong((long) '4');
        short short5 = byteBuffer1.getShort(0);
        java.nio.ByteBuffer byteBuffer8 = byteBuffer1.putChar(1, '4');
        java.nio.ByteBuffer byteBuffer10 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer12 = byteBuffer10.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer14 = byteBuffer10.putInt(0);
        byte[] byteArray17 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer18 = byteBuffer14.put(byteArray17);
        java.nio.ByteBuffer byteBuffer20 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer22 = byteBuffer20.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer24 = byteBuffer20.putInt(0);
        byte[] byteArray27 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer28 = byteBuffer24.put(byteArray27);
        java.nio.ByteBuffer byteBuffer31 = byteBuffer14.get(byteArray27, 2, (int) (byte) 0);
        java.nio.ByteBuffer byteBuffer33 = byteBuffer14.putDouble(100.0d);
        int int34 = byteBuffer8.compareTo(byteBuffer14);
        java.nio.ByteBuffer byteBuffer36 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer38 = byteBuffer36.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer40 = byteBuffer36.putInt(0);
        byte[] byteArray43 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer44 = byteBuffer40.put(byteArray43);
        java.nio.ByteOrder byteOrder45 = byteBuffer44.order();
        java.nio.ByteBuffer byteBuffer46 = byteBuffer14.order(byteOrder45);
        java.nio.ByteBuffer byteBuffer47 = byteBuffer14.asReadOnlyBuffer();
        byte byte48 = byteBuffer47.get();
        java.nio.Buffer buffer49 = byteBuffer47.mark();
        java.nio.Buffer buffer50 = buffer49.clear();
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 0 + "'", short5 == (short) 0);
        org.junit.Assert.assertNotNull(byteBuffer8);
        org.junit.Assert.assertNotNull(byteBuffer10);
        org.junit.Assert.assertNotNull(byteBuffer12);
        org.junit.Assert.assertNotNull(byteBuffer14);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer18);
        org.junit.Assert.assertNotNull(byteBuffer20);
        org.junit.Assert.assertNotNull(byteBuffer22);
        org.junit.Assert.assertNotNull(byteBuffer24);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer28);
        org.junit.Assert.assertNotNull(byteBuffer31);
        org.junit.Assert.assertNotNull(byteBuffer33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 14 + "'", int34 == 14);
        org.junit.Assert.assertNotNull(byteBuffer36);
        org.junit.Assert.assertNotNull(byteBuffer38);
        org.junit.Assert.assertNotNull(byteBuffer40);
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray43), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer44);
        org.junit.Assert.assertNotNull(byteOrder45);
        org.junit.Assert.assertNotNull(byteBuffer46);
        org.junit.Assert.assertNotNull(byteBuffer47);
        org.junit.Assert.assertTrue("'" + byte48 + "' != '" + (byte) 0 + "'", byte48 == (byte) 0);
        org.junit.Assert.assertNotNull(buffer49);
        org.junit.Assert.assertNotNull(buffer50);
    }

    @Test
    public void test00418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00418");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer5 = byteBuffer1.putInt(0);
        java.nio.ByteBuffer byteBuffer7 = byteBuffer5.putDouble((double) 12);
        java.nio.ByteBuffer byteBuffer9 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        long long10 = byteBuffer9.getLong();
        int int11 = byteBuffer9.position();
        float float13 = byteBuffer9.getFloat((int) (short) 10);
        boolean boolean14 = byteBuffer9.hasArray();
        double double15 = byteBuffer9.getDouble();
        short short17 = byteBuffer9.getShort(0);
        java.nio.ByteBuffer byteBuffer19 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer21 = byteBuffer19.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer23 = byteBuffer19.putInt(0);
        byte[] byteArray26 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer27 = byteBuffer23.put(byteArray26);
        boolean boolean28 = byteBuffer23.hasArray();
        java.nio.ByteBuffer byteBuffer30 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer32 = byteBuffer30.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer34 = byteBuffer30.putInt(0);
        byte[] byteArray37 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer38 = byteBuffer34.put(byteArray37);
        java.nio.ByteBuffer byteBuffer40 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer42 = byteBuffer40.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer44 = byteBuffer40.putInt(0);
        byte[] byteArray47 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer48 = byteBuffer44.put(byteArray47);
        java.nio.ByteBuffer byteBuffer51 = byteBuffer34.get(byteArray47, 2, (int) (byte) 0);
        java.nio.ByteBuffer byteBuffer53 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer55 = byteBuffer53.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer57 = byteBuffer53.putInt(0);
        byte[] byteArray60 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer61 = byteBuffer57.put(byteArray60);
        java.nio.ByteBuffer byteBuffer63 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer65 = byteBuffer63.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer67 = byteBuffer63.putInt(0);
        byte[] byteArray70 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer71 = byteBuffer67.put(byteArray70);
        java.nio.ByteBuffer byteBuffer74 = byteBuffer57.get(byteArray70, 2, (int) (byte) 0);
        java.nio.ByteBuffer byteBuffer75 = byteBuffer51.put(byteArray70);
        java.nio.ByteBuffer byteBuffer76 = byteBuffer23.put(byteArray70);
        java.nio.ByteBuffer byteBuffer77 = byteBuffer9.get(byteArray70);
        java.nio.ByteBuffer byteBuffer78 = byteBuffer5.put(byteArray70);
        java.nio.ByteBuffer byteBuffer79 = byteBuffer78.compact();
        java.nio.Buffer buffer80 = byteBuffer79.mark();
        int int81 = buffer80.remaining();
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertNotNull(byteBuffer7);
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 8 + "'", int11 == 8);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 0.0f + "'", float13 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + short17 + "' != '" + (short) 0 + "'", short17 == (short) 0);
        org.junit.Assert.assertNotNull(byteBuffer19);
        org.junit.Assert.assertNotNull(byteBuffer21);
        org.junit.Assert.assertNotNull(byteBuffer23);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(byteBuffer30);
        org.junit.Assert.assertNotNull(byteBuffer32);
        org.junit.Assert.assertNotNull(byteBuffer34);
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray37), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer38);
        org.junit.Assert.assertNotNull(byteBuffer40);
        org.junit.Assert.assertNotNull(byteBuffer42);
        org.junit.Assert.assertNotNull(byteBuffer44);
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray47), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer48);
        org.junit.Assert.assertNotNull(byteBuffer51);
        org.junit.Assert.assertNotNull(byteBuffer53);
        org.junit.Assert.assertNotNull(byteBuffer55);
        org.junit.Assert.assertNotNull(byteBuffer57);
        org.junit.Assert.assertNotNull(byteArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray60), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer61);
        org.junit.Assert.assertNotNull(byteBuffer63);
        org.junit.Assert.assertNotNull(byteBuffer65);
        org.junit.Assert.assertNotNull(byteBuffer67);
        org.junit.Assert.assertNotNull(byteArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray70), "[0, 0]");
        org.junit.Assert.assertNotNull(byteBuffer71);
        org.junit.Assert.assertNotNull(byteBuffer74);
        org.junit.Assert.assertNotNull(byteBuffer75);
        org.junit.Assert.assertNotNull(byteBuffer76);
        org.junit.Assert.assertNotNull(byteBuffer77);
        org.junit.Assert.assertNotNull(byteBuffer78);
        org.junit.Assert.assertNotNull(byteBuffer79);
        org.junit.Assert.assertNotNull(buffer80);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 22 + "'", int81 == 22);
    }

    @Test
    public void test00419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00419");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        java.util.Map<java.lang.String, java.lang.String> strMap4 = response1.cookies();
        org.jsoup.Connection.Response response6 = response1.removeCookie("hi!");
        java.lang.String str7 = response1.statusMessage();
        java.nio.ByteBuffer byteBuffer9 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer11 = byteBuffer9.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer13 = byteBuffer9.putInt(0);
        byte[] byteArray16 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer17 = byteBuffer13.put(byteArray16);
        boolean boolean18 = byteBuffer13.hasArray();
        response1.byteData = byteBuffer13;
        org.jsoup.Connection.Method method20 = response1.method();
        java.nio.ByteBuffer byteBuffer22 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer24 = byteBuffer22.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer26 = byteBuffer22.putInt(0);
        byte[] byteArray29 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer30 = byteBuffer26.put(byteArray29);
        java.nio.ByteBuffer byteBuffer32 = byteBuffer30.put((byte) 10);
        java.nio.Buffer buffer34 = byteBuffer30.position((int) ' ');
        java.nio.Buffer buffer35 = byteBuffer30.rewind();
        response1.byteData = byteBuffer30;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean39 = response1.hasHeaderWithValue("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertNotNull(byteBuffer11);
        org.junit.Assert.assertNotNull(byteBuffer13);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(method20);
        org.junit.Assert.assertNotNull(byteBuffer22);
        org.junit.Assert.assertNotNull(byteBuffer24);
        org.junit.Assert.assertNotNull(byteBuffer26);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray29), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer30);
        org.junit.Assert.assertNotNull(byteBuffer32);
        org.junit.Assert.assertNotNull(buffer34);
        org.junit.Assert.assertNotNull(buffer35);
    }

    @Test
    public void test00420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00420");
        java.lang.String str1 = java.util.regex.Pattern.quote("\\Q\\E");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\Q\\Q\\E\\\\E\\Q\\E" + "'", str1, "\\Q\\Q\\E\\\\E\\Q\\E");
    }

    @Test
    public void test00421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00421");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer5 = byteBuffer1.putInt(0);
        byte[] byteArray8 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer9 = byteBuffer5.put(byteArray8);
        boolean boolean10 = byteBuffer5.hasArray();
        java.nio.ByteBuffer byteBuffer12 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer14 = byteBuffer12.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer16 = byteBuffer12.putInt(0);
        byte[] byteArray19 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer20 = byteBuffer16.put(byteArray19);
        java.nio.ByteBuffer byteBuffer22 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer24 = byteBuffer22.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer26 = byteBuffer22.putInt(0);
        byte[] byteArray29 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer30 = byteBuffer26.put(byteArray29);
        java.nio.ByteBuffer byteBuffer33 = byteBuffer16.get(byteArray29, 2, (int) (byte) 0);
        java.nio.ByteBuffer byteBuffer35 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer37 = byteBuffer35.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer39 = byteBuffer35.putInt(0);
        byte[] byteArray42 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer43 = byteBuffer39.put(byteArray42);
        java.nio.ByteBuffer byteBuffer45 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer47 = byteBuffer45.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer49 = byteBuffer45.putInt(0);
        byte[] byteArray52 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer53 = byteBuffer49.put(byteArray52);
        java.nio.ByteBuffer byteBuffer56 = byteBuffer39.get(byteArray52, 2, (int) (byte) 0);
        java.nio.ByteBuffer byteBuffer57 = byteBuffer33.put(byteArray52);
        java.nio.ByteBuffer byteBuffer58 = byteBuffer5.put(byteArray52);
        java.nio.ByteBuffer byteBuffer61 = byteBuffer5.putChar((int) 'a', '4');
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(byteBuffer12);
        org.junit.Assert.assertNotNull(byteBuffer14);
        org.junit.Assert.assertNotNull(byteBuffer16);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer20);
        org.junit.Assert.assertNotNull(byteBuffer22);
        org.junit.Assert.assertNotNull(byteBuffer24);
        org.junit.Assert.assertNotNull(byteBuffer26);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray29), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer30);
        org.junit.Assert.assertNotNull(byteBuffer33);
        org.junit.Assert.assertNotNull(byteBuffer35);
        org.junit.Assert.assertNotNull(byteBuffer37);
        org.junit.Assert.assertNotNull(byteBuffer39);
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray42), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer43);
        org.junit.Assert.assertNotNull(byteBuffer45);
        org.junit.Assert.assertNotNull(byteBuffer47);
        org.junit.Assert.assertNotNull(byteBuffer49);
        org.junit.Assert.assertNotNull(byteArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray52), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer53);
        org.junit.Assert.assertNotNull(byteBuffer56);
        org.junit.Assert.assertNotNull(byteBuffer57);
        org.junit.Assert.assertNotNull(byteBuffer58);
        org.junit.Assert.assertNotNull(byteBuffer61);
    }

    @Test
    public void test00422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00422");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer5 = byteBuffer1.putInt(0);
        java.nio.ByteBuffer byteBuffer7 = byteBuffer5.putInt((int) '#');
        byte byte9 = byteBuffer5.get(1);
        java.nio.ByteBuffer byteBuffer12 = byteBuffer5.put(14, (byte) -1);
        java.nio.ByteBuffer byteBuffer13 = byteBuffer5.slice();
        java.nio.Buffer buffer14 = byteBuffer13.flip();
        boolean boolean15 = byteBuffer13.isReadOnly();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer17 = byteBuffer13.putChar('\000');
            org.junit.Assert.fail("Expected exception of type java.nio.BufferOverflowException; message: null");
        } catch (java.nio.BufferOverflowException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertNotNull(byteBuffer7);
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 0 + "'", byte9 == (byte) 0);
        org.junit.Assert.assertNotNull(byteBuffer12);
        org.junit.Assert.assertNotNull(byteBuffer13);
        org.junit.Assert.assertNotNull(buffer14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test00423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00423");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.putLong((long) '4');
        int int5 = byteBuffer3.getInt((int) (short) 1);
        java.nio.ByteBuffer byteBuffer8 = byteBuffer3.putChar((int) ' ', '#');
        java.lang.String str9 = byteBuffer8.toString();
        java.nio.ByteBuffer byteBuffer11 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer13 = byteBuffer11.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer15 = byteBuffer11.putInt(0);
        byte[] byteArray18 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer19 = byteBuffer15.put(byteArray18);
        java.nio.ByteOrder byteOrder20 = byteBuffer19.order();
        java.nio.ByteBuffer byteBuffer21 = byteBuffer8.order(byteOrder20);
        java.nio.ByteBuffer byteBuffer22 = byteBuffer8.asReadOnlyBuffer();
        short short24 = byteBuffer22.getShort(84);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer26 = byteBuffer22.putShort((short) 10);
            org.junit.Assert.fail("Expected exception of type java.nio.ReadOnlyBufferException; message: null");
        } catch (java.nio.ReadOnlyBufferException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(byteBuffer8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "java.nio.DirectByteBuffer[pos=8 lim=100 cap=100]" + "'", str9, "java.nio.DirectByteBuffer[pos=8 lim=100 cap=100]");
        org.junit.Assert.assertNotNull(byteBuffer11);
        org.junit.Assert.assertNotNull(byteBuffer13);
        org.junit.Assert.assertNotNull(byteBuffer15);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer19);
        org.junit.Assert.assertNotNull(byteOrder20);
        org.junit.Assert.assertNotNull(byteBuffer21);
        org.junit.Assert.assertNotNull(byteBuffer22);
        org.junit.Assert.assertTrue("'" + short24 + "' != '" + (short) 0 + "'", short24 == (short) 0);
    }

    @Test
    public void test00424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00424");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer5 = byteBuffer1.putInt(0);
        java.nio.ByteBuffer byteBuffer7 = byteBuffer5.putInt((int) '#');
        int int8 = byteBuffer5.position();
        java.nio.DoubleBuffer doubleBuffer9 = byteBuffer5.asDoubleBuffer();
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertNotNull(byteBuffer7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 16 + "'", int8 == 16);
        org.junit.Assert.assertNotNull(doubleBuffer9);
    }

    @Test
    public void test00425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00425");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        long long2 = byteBuffer1.getLong();
        int int3 = byteBuffer1.position();
        float float5 = byteBuffer1.getFloat((int) (short) 10);
        boolean boolean6 = byteBuffer1.hasArray();
        double double7 = byteBuffer1.getDouble();
        short short9 = byteBuffer1.getShort(0);
        java.nio.ByteBuffer byteBuffer11 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer13 = byteBuffer11.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer15 = byteBuffer11.putInt(0);
        byte[] byteArray18 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer19 = byteBuffer15.put(byteArray18);
        boolean boolean20 = byteBuffer15.hasArray();
        java.nio.ByteBuffer byteBuffer22 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer24 = byteBuffer22.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer26 = byteBuffer22.putInt(0);
        byte[] byteArray29 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer30 = byteBuffer26.put(byteArray29);
        java.nio.ByteBuffer byteBuffer32 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer34 = byteBuffer32.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer36 = byteBuffer32.putInt(0);
        byte[] byteArray39 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer40 = byteBuffer36.put(byteArray39);
        java.nio.ByteBuffer byteBuffer43 = byteBuffer26.get(byteArray39, 2, (int) (byte) 0);
        java.nio.ByteBuffer byteBuffer45 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer47 = byteBuffer45.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer49 = byteBuffer45.putInt(0);
        byte[] byteArray52 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer53 = byteBuffer49.put(byteArray52);
        java.nio.ByteBuffer byteBuffer55 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer57 = byteBuffer55.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer59 = byteBuffer55.putInt(0);
        byte[] byteArray62 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer63 = byteBuffer59.put(byteArray62);
        java.nio.ByteBuffer byteBuffer66 = byteBuffer49.get(byteArray62, 2, (int) (byte) 0);
        java.nio.ByteBuffer byteBuffer67 = byteBuffer43.put(byteArray62);
        java.nio.ByteBuffer byteBuffer68 = byteBuffer15.put(byteArray62);
        java.nio.ByteBuffer byteBuffer69 = byteBuffer1.get(byteArray62);
        java.nio.Buffer buffer70 = byteBuffer69.mark();
        java.nio.ByteBuffer byteBuffer72 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer74 = byteBuffer72.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer76 = byteBuffer72.putInt(0);
        byte[] byteArray79 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer80 = byteBuffer76.put(byteArray79);
        java.nio.ByteBuffer byteBuffer82 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer84 = byteBuffer82.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer86 = byteBuffer82.putInt(0);
        byte[] byteArray89 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer90 = byteBuffer86.put(byteArray89);
        java.nio.ByteBuffer byteBuffer93 = byteBuffer76.get(byteArray89, 2, (int) (byte) 0);
        java.nio.ByteBuffer byteBuffer95 = byteBuffer93.putShort((short) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer96 = byteBuffer69.put(byteBuffer93);
            org.junit.Assert.fail("Expected exception of type java.nio.BufferOverflowException; message: null");
        } catch (java.nio.BufferOverflowException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 0 + "'", short9 == (short) 0);
        org.junit.Assert.assertNotNull(byteBuffer11);
        org.junit.Assert.assertNotNull(byteBuffer13);
        org.junit.Assert.assertNotNull(byteBuffer15);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(byteBuffer22);
        org.junit.Assert.assertNotNull(byteBuffer24);
        org.junit.Assert.assertNotNull(byteBuffer26);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray29), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer30);
        org.junit.Assert.assertNotNull(byteBuffer32);
        org.junit.Assert.assertNotNull(byteBuffer34);
        org.junit.Assert.assertNotNull(byteBuffer36);
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray39), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer40);
        org.junit.Assert.assertNotNull(byteBuffer43);
        org.junit.Assert.assertNotNull(byteBuffer45);
        org.junit.Assert.assertNotNull(byteBuffer47);
        org.junit.Assert.assertNotNull(byteBuffer49);
        org.junit.Assert.assertNotNull(byteArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray52), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer53);
        org.junit.Assert.assertNotNull(byteBuffer55);
        org.junit.Assert.assertNotNull(byteBuffer57);
        org.junit.Assert.assertNotNull(byteBuffer59);
        org.junit.Assert.assertNotNull(byteArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray62), "[0, 0]");
        org.junit.Assert.assertNotNull(byteBuffer63);
        org.junit.Assert.assertNotNull(byteBuffer66);
        org.junit.Assert.assertNotNull(byteBuffer67);
        org.junit.Assert.assertNotNull(byteBuffer68);
        org.junit.Assert.assertNotNull(byteBuffer69);
        org.junit.Assert.assertNotNull(buffer70);
        org.junit.Assert.assertNotNull(byteBuffer72);
        org.junit.Assert.assertNotNull(byteBuffer74);
        org.junit.Assert.assertNotNull(byteBuffer76);
        org.junit.Assert.assertNotNull(byteArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray79), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer80);
        org.junit.Assert.assertNotNull(byteBuffer82);
        org.junit.Assert.assertNotNull(byteBuffer84);
        org.junit.Assert.assertNotNull(byteBuffer86);
        org.junit.Assert.assertNotNull(byteArray89);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray89), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer90);
        org.junit.Assert.assertNotNull(byteBuffer93);
        org.junit.Assert.assertNotNull(byteBuffer95);
    }

    @Test
    public void test00426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00426");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer5 = byteBuffer1.putInt(0);
        byte[] byteArray8 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer9 = byteBuffer5.put(byteArray8);
        org.jsoup.helper.HttpConnection.Response response10 = null;
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response10);
        response11.contentType = "";
        boolean boolean14 = byteBuffer9.equals((java.lang.Object) "");
        long long15 = byteBuffer9.getLong();
        java.nio.FloatBuffer floatBuffer16 = byteBuffer9.asFloatBuffer();
        boolean boolean17 = floatBuffer16.isReadOnly();
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(floatBuffer16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test00427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00427");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.putLong((long) '4');
        short short5 = byteBuffer1.getShort(0);
        java.nio.ByteBuffer byteBuffer8 = byteBuffer1.putChar(1, '4');
        java.nio.ByteBuffer byteBuffer11 = byteBuffer8.put((int) (short) 10, (byte) 1);
        int int12 = byteBuffer11.getInt();
        java.nio.ByteBuffer byteBuffer14 = byteBuffer11.putDouble((double) ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.nio.Buffer buffer16 = byteBuffer11.position((-24));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: newPosition < 0: (-24 < 0)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 0 + "'", short5 == (short) 0);
        org.junit.Assert.assertNotNull(byteBuffer8);
        org.junit.Assert.assertNotNull(byteBuffer11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 256 + "'", int12 == 256);
        org.junit.Assert.assertNotNull(byteBuffer14);
    }

    @Test
    public void test00428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00428");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer3 = java.nio.ByteBuffer.wrap(byteArray0, 24, 97);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00429");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        response2.contentType = "";
        java.lang.String str6 = response2.cookie("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response7 = org.jsoup.helper.HttpConnection.Response.execute(request0, response2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test00430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00430");
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate((-2));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00431");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer5 = byteBuffer1.putInt(0);
        java.nio.ByteBuffer byteBuffer8 = byteBuffer5.putDouble((int) (byte) 1, (double) 1L);
        java.nio.ByteBuffer byteBuffer10 = byteBuffer5.putChar('a');
        double double12 = byteBuffer10.getDouble(12);
        java.nio.ByteBuffer byteBuffer14 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer16 = byteBuffer14.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer18 = byteBuffer14.putInt(0);
        byte[] byteArray21 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer22 = byteBuffer18.put(byteArray21);
        java.nio.ByteBuffer byteBuffer24 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer26 = byteBuffer24.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer28 = byteBuffer24.putInt(0);
        byte[] byteArray31 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer32 = byteBuffer28.put(byteArray31);
        java.nio.ByteBuffer byteBuffer35 = byteBuffer18.get(byteArray31, 2, (int) (byte) 0);
        java.nio.ByteBuffer byteBuffer36 = byteBuffer10.put(byteArray31);
        java.nio.ByteBuffer byteBuffer38 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer40 = byteBuffer38.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer42 = byteBuffer38.putInt(0);
        byte[] byteArray45 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer46 = byteBuffer42.put(byteArray45);
        java.nio.ByteBuffer byteBuffer48 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer50 = byteBuffer48.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer52 = byteBuffer48.putInt(0);
        byte[] byteArray55 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer56 = byteBuffer52.put(byteArray55);
        java.nio.ByteBuffer byteBuffer59 = byteBuffer42.get(byteArray55, 2, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer60 = byteBuffer10.put(byteBuffer42);
            org.junit.Assert.fail("Expected exception of type java.nio.BufferOverflowException; message: null");
        } catch (java.nio.BufferOverflowException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertNotNull(byteBuffer8);
        org.junit.Assert.assertNotNull(byteBuffer10);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 7.565251118924485E-307d + "'", double12 == 7.565251118924485E-307d);
        org.junit.Assert.assertNotNull(byteBuffer14);
        org.junit.Assert.assertNotNull(byteBuffer16);
        org.junit.Assert.assertNotNull(byteBuffer18);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer22);
        org.junit.Assert.assertNotNull(byteBuffer24);
        org.junit.Assert.assertNotNull(byteBuffer26);
        org.junit.Assert.assertNotNull(byteBuffer28);
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray31), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer32);
        org.junit.Assert.assertNotNull(byteBuffer35);
        org.junit.Assert.assertNotNull(byteBuffer36);
        org.junit.Assert.assertNotNull(byteBuffer38);
        org.junit.Assert.assertNotNull(byteBuffer40);
        org.junit.Assert.assertNotNull(byteBuffer42);
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray45), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer46);
        org.junit.Assert.assertNotNull(byteBuffer48);
        org.junit.Assert.assertNotNull(byteBuffer50);
        org.junit.Assert.assertNotNull(byteBuffer52);
        org.junit.Assert.assertNotNull(byteArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray55), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer56);
        org.junit.Assert.assertNotNull(byteBuffer59);
    }

    @Test
    public void test00432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00432");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response6 = response1.header("hi!", "");
        org.jsoup.Connection.Request request7 = null;
        response1.req = request7;
        java.lang.String str9 = response1.charset();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response1);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Too many redirects occurred trying to load URL null");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test00433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00433");
        org.jsoup.Connection.Request request0 = null;
        java.io.OutputStream outputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response.writePost(request0, outputStream1, "\\Qjava.nio.DirectByteBuffer[pos=35 lim=100 cap=100]\\E");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00434");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        java.util.Map<java.lang.String, java.lang.String> strMap4 = response1.cookies();
        org.jsoup.Connection.Response response6 = response1.removeCookie("hi!");
        java.lang.String str7 = response1.statusMessage();
        java.nio.ByteBuffer byteBuffer9 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer11 = byteBuffer9.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer13 = byteBuffer9.putInt(0);
        byte[] byteArray16 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer17 = byteBuffer13.put(byteArray16);
        boolean boolean18 = byteBuffer13.hasArray();
        response1.byteData = byteBuffer13;
        org.jsoup.Connection.Method method20 = response1.method();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response21 = new org.jsoup.helper.HttpConnection.Response(response1);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Too many redirects occurred trying to load URL null");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertNotNull(byteBuffer11);
        org.junit.Assert.assertNotNull(byteBuffer13);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(method20);
    }

    @Test
    public void test00435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00435");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.putLong((long) '4');
        double double5 = byteBuffer1.getDouble(64);
        // The following exception was thrown during execution in test generation
        try {
            short short7 = byteBuffer1.getShort((-6));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test00436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00436");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(128);
        org.junit.Assert.assertNotNull(byteBuffer1);
    }

    @Test
    public void test00437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00437");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        long long2 = byteBuffer1.getLong();
        int int3 = byteBuffer1.position();
        float float5 = byteBuffer1.getFloat((int) (short) 10);
        boolean boolean6 = byteBuffer1.hasArray();
        java.nio.DoubleBuffer doubleBuffer7 = byteBuffer1.asDoubleBuffer();
        java.nio.Buffer buffer8 = byteBuffer1.clear();
        java.lang.String str9 = byteBuffer1.toString();
        java.nio.Buffer buffer11 = byteBuffer1.limit(84);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.Buffer buffer12 = buffer11.reset();
            org.junit.Assert.fail("Expected exception of type java.nio.InvalidMarkException; message: null");
        } catch (java.nio.InvalidMarkException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(doubleBuffer7);
        org.junit.Assert.assertNotNull(buffer8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "java.nio.DirectByteBuffer[pos=0 lim=100 cap=100]" + "'", str9, "java.nio.DirectByteBuffer[pos=0 lim=100 cap=100]");
        org.junit.Assert.assertNotNull(buffer11);
    }

    @Test
    public void test00438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00438");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.putLong((long) '4');
        short short5 = byteBuffer1.getShort(0);
        java.nio.ByteBuffer byteBuffer8 = byteBuffer1.putChar(1, '4');
        java.nio.ByteBuffer byteBuffer10 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer12 = byteBuffer10.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer14 = byteBuffer10.putInt(0);
        byte[] byteArray17 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer18 = byteBuffer14.put(byteArray17);
        java.nio.ByteBuffer byteBuffer20 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer22 = byteBuffer20.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer24 = byteBuffer20.putInt(0);
        byte[] byteArray27 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer28 = byteBuffer24.put(byteArray27);
        java.nio.ByteBuffer byteBuffer31 = byteBuffer14.get(byteArray27, 2, (int) (byte) 0);
        java.nio.ByteBuffer byteBuffer33 = byteBuffer14.putDouble(100.0d);
        int int34 = byteBuffer8.compareTo(byteBuffer14);
        java.nio.ByteBuffer byteBuffer36 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer38 = byteBuffer36.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer40 = byteBuffer36.putInt(0);
        byte[] byteArray43 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer44 = byteBuffer40.put(byteArray43);
        java.nio.ByteOrder byteOrder45 = byteBuffer44.order();
        java.nio.ByteBuffer byteBuffer46 = byteBuffer14.order(byteOrder45);
        java.nio.ByteBuffer byteBuffer47 = byteBuffer14.slice();
        long long48 = byteBuffer14.getLong();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.Buffer buffer49 = byteBuffer14.reset();
            org.junit.Assert.fail("Expected exception of type java.nio.InvalidMarkException; message: null");
        } catch (java.nio.InvalidMarkException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 0 + "'", short5 == (short) 0);
        org.junit.Assert.assertNotNull(byteBuffer8);
        org.junit.Assert.assertNotNull(byteBuffer10);
        org.junit.Assert.assertNotNull(byteBuffer12);
        org.junit.Assert.assertNotNull(byteBuffer14);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer18);
        org.junit.Assert.assertNotNull(byteBuffer20);
        org.junit.Assert.assertNotNull(byteBuffer22);
        org.junit.Assert.assertNotNull(byteBuffer24);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer28);
        org.junit.Assert.assertNotNull(byteBuffer31);
        org.junit.Assert.assertNotNull(byteBuffer33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 14 + "'", int34 == 14);
        org.junit.Assert.assertNotNull(byteBuffer36);
        org.junit.Assert.assertNotNull(byteBuffer38);
        org.junit.Assert.assertNotNull(byteBuffer40);
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray43), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer44);
        org.junit.Assert.assertNotNull(byteOrder45);
        org.junit.Assert.assertNotNull(byteBuffer46);
        org.junit.Assert.assertNotNull(byteBuffer47);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 0L + "'", long48 == 0L);
    }

    @Test
    public void test00439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00439");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str4 = response2.getHeaderCaseInsensitive("");
        java.util.Map<java.lang.String, java.lang.String> strMap5 = response2.cookies();
        org.jsoup.Connection.Response response7 = response2.removeCookie("hi!");
        java.lang.String str8 = response2.statusMessage();
        java.nio.ByteBuffer byteBuffer10 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer12 = byteBuffer10.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer14 = byteBuffer10.putInt(0);
        byte[] byteArray17 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer18 = byteBuffer14.put(byteArray17);
        boolean boolean19 = byteBuffer14.hasArray();
        response2.byteData = byteBuffer14;
        java.nio.ByteBuffer byteBuffer22 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer24 = byteBuffer22.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer26 = byteBuffer22.putInt(0);
        byte[] byteArray29 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer30 = byteBuffer26.put(byteArray29);
        boolean boolean31 = byteBuffer26.hasArray();
        java.nio.ByteBuffer byteBuffer33 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer35 = byteBuffer33.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer37 = byteBuffer33.putInt(0);
        byte[] byteArray40 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer41 = byteBuffer37.put(byteArray40);
        java.nio.ByteBuffer byteBuffer43 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer45 = byteBuffer43.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer47 = byteBuffer43.putInt(0);
        byte[] byteArray50 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer51 = byteBuffer47.put(byteArray50);
        java.nio.ByteBuffer byteBuffer54 = byteBuffer37.get(byteArray50, 2, (int) (byte) 0);
        java.nio.ByteBuffer byteBuffer56 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer58 = byteBuffer56.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer60 = byteBuffer56.putInt(0);
        byte[] byteArray63 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer64 = byteBuffer60.put(byteArray63);
        java.nio.ByteBuffer byteBuffer66 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer68 = byteBuffer66.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer70 = byteBuffer66.putInt(0);
        byte[] byteArray73 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer74 = byteBuffer70.put(byteArray73);
        java.nio.ByteBuffer byteBuffer77 = byteBuffer60.get(byteArray73, 2, (int) (byte) 0);
        java.nio.ByteBuffer byteBuffer78 = byteBuffer54.put(byteArray73);
        java.nio.ByteBuffer byteBuffer79 = byteBuffer26.put(byteArray73);
        response2.byteData = byteBuffer26;
        java.lang.String str81 = response2.charset();
        java.lang.String str82 = response2.statusMessage;
        org.jsoup.Connection.Response response84 = response2.removeHeader("java.nio.DirectByteBuffer[pos=10 lim=100 cap=100]");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response85 = org.jsoup.helper.HttpConnection.Response.execute(request0, response2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(byteBuffer10);
        org.junit.Assert.assertNotNull(byteBuffer12);
        org.junit.Assert.assertNotNull(byteBuffer14);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(byteBuffer22);
        org.junit.Assert.assertNotNull(byteBuffer24);
        org.junit.Assert.assertNotNull(byteBuffer26);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray29), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(byteBuffer33);
        org.junit.Assert.assertNotNull(byteBuffer35);
        org.junit.Assert.assertNotNull(byteBuffer37);
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray40), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer41);
        org.junit.Assert.assertNotNull(byteBuffer43);
        org.junit.Assert.assertNotNull(byteBuffer45);
        org.junit.Assert.assertNotNull(byteBuffer47);
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray50), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer51);
        org.junit.Assert.assertNotNull(byteBuffer54);
        org.junit.Assert.assertNotNull(byteBuffer56);
        org.junit.Assert.assertNotNull(byteBuffer58);
        org.junit.Assert.assertNotNull(byteBuffer60);
        org.junit.Assert.assertNotNull(byteArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray63), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer64);
        org.junit.Assert.assertNotNull(byteBuffer66);
        org.junit.Assert.assertNotNull(byteBuffer68);
        org.junit.Assert.assertNotNull(byteBuffer70);
        org.junit.Assert.assertNotNull(byteArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray73), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer74);
        org.junit.Assert.assertNotNull(byteBuffer77);
        org.junit.Assert.assertNotNull(byteBuffer78);
        org.junit.Assert.assertNotNull(byteBuffer79);
        org.junit.Assert.assertNull(str81);
        org.junit.Assert.assertNull(str82);
        org.junit.Assert.assertNotNull(response84);
    }

    @Test
    public void test00440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00440");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer5 = byteBuffer1.putInt(0);
        byte[] byteArray8 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer9 = byteBuffer5.put(byteArray8);
        org.jsoup.helper.HttpConnection.Response response10 = null;
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response10);
        response11.contentType = "";
        boolean boolean14 = byteBuffer9.equals((java.lang.Object) "");
        java.nio.ByteBuffer byteBuffer16 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer18 = byteBuffer16.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer20 = byteBuffer16.putInt(0);
        java.nio.ByteBuffer byteBuffer22 = byteBuffer20.putInt((int) '#');
        int int23 = byteBuffer9.compareTo(byteBuffer20);
        java.nio.IntBuffer intBuffer24 = byteBuffer20.asIntBuffer();
        long long25 = byteBuffer20.getLong();
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(byteBuffer16);
        org.junit.Assert.assertNotNull(byteBuffer18);
        org.junit.Assert.assertNotNull(byteBuffer20);
        org.junit.Assert.assertNotNull(byteBuffer22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2 + "'", int23 == 2);
        org.junit.Assert.assertNotNull(intBuffer24);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
    }

    @Test
    public void test00441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00441");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.putLong((long) '4');
        double double5 = byteBuffer1.getDouble(64);
        double double7 = byteBuffer1.getDouble((int) (short) 10);
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test00442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00442");
        org.jsoup.Connection.Request request0 = null;
        java.io.OutputStream outputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response.writePost(request0, outputStream1, "\\Q\\Q\\E\\\\E\\Q\\E");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00443");
        java.lang.String str1 = java.util.regex.Pattern.quote("java.nio.DirectByteBuffer[pos=22 lim=100 cap=100]");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\Qjava.nio.DirectByteBuffer[pos=22 lim=100 cap=100]\\E" + "'", str1, "\\Qjava.nio.DirectByteBuffer[pos=22 lim=100 cap=100]\\E");
    }

    @Test
    public void test00444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00444");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate(0);
        // The following exception was thrown during execution in test generation
        try {
            double double3 = byteBuffer1.getDouble(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
    }

    @Test
    public void test00445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00445");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer5 = byteBuffer1.putInt(0);
        byte[] byteArray8 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer9 = byteBuffer5.put(byteArray8);
        java.nio.ByteBuffer byteBuffer11 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer13 = byteBuffer11.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer15 = byteBuffer11.putInt(0);
        byte[] byteArray18 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer19 = byteBuffer15.put(byteArray18);
        java.nio.ByteBuffer byteBuffer22 = byteBuffer5.get(byteArray18, 2, (int) (byte) 0);
        java.nio.ByteBuffer byteBuffer24 = byteBuffer22.putShort((short) -1);
        double double25 = byteBuffer24.getDouble();
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertNotNull(byteBuffer11);
        org.junit.Assert.assertNotNull(byteBuffer13);
        org.junit.Assert.assertNotNull(byteBuffer15);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer19);
        org.junit.Assert.assertNotNull(byteBuffer22);
        org.junit.Assert.assertNotNull(byteBuffer24);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
    }

    @Test
    public void test00446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00446");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.contentType = "";
        int int4 = response1.statusCode();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response1);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Too many redirects occurred trying to load URL null");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test00447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00447");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        long long2 = byteBuffer1.getLong();
        int int3 = byteBuffer1.position();
        float float5 = byteBuffer1.getFloat((int) (short) 10);
        boolean boolean6 = byteBuffer1.hasArray();
        double double7 = byteBuffer1.getDouble();
        short short9 = byteBuffer1.getShort(0);
        java.nio.ByteBuffer byteBuffer11 = byteBuffer1.putDouble(100.0d);
        float float12 = byteBuffer1.getFloat();
        char char14 = byteBuffer1.getChar(1);
        java.nio.ByteBuffer byteBuffer16 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer18 = byteBuffer16.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer20 = byteBuffer16.putInt(0);
        byte[] byteArray23 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer24 = byteBuffer20.put(byteArray23);
        java.nio.ByteBuffer byteBuffer26 = byteBuffer24.putDouble(7.565251118924485E-307d);
        int int27 = byteBuffer1.compareTo(byteBuffer26);
        java.nio.ByteBuffer byteBuffer29 = byteBuffer1.putShort((short) (byte) -1);
        boolean boolean30 = byteBuffer1.isReadOnly();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer33 = byteBuffer1.putFloat((-6), 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 0 + "'", short9 == (short) 0);
        org.junit.Assert.assertNotNull(byteBuffer11);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.0f + "'", float12 == 0.0f);
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + '\000' + "'", char14 == '\000');
        org.junit.Assert.assertNotNull(byteBuffer16);
        org.junit.Assert.assertNotNull(byteBuffer18);
        org.junit.Assert.assertNotNull(byteBuffer20);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer24);
        org.junit.Assert.assertNotNull(byteBuffer26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-6) + "'", int27 == (-6));
        org.junit.Assert.assertNotNull(byteBuffer29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test00448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00448");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response1);
        response3.statusMessage = "";
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response6 = org.jsoup.helper.HttpConnection.Response.execute(request0, response3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00449");
        java.util.regex.Pattern pattern2 = null; // flaky: java.util.regex.Pattern.compile("java.nio.DirectByteBuffer[pos=10 lim=100 cap=100]", (-24));
        org.jsoup.helper.HttpConnection.Response.xmlContentTypeRxp = pattern2;
        java.util.stream.Stream<java.lang.String> strStream5 = null; // flaky: pattern2.splitAsStream((java.lang.CharSequence) "java.nio.DirectByteBuffer[pos=8 lim=100 cap=100]");
        java.nio.ByteBuffer byteBuffer8 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        long long9 = byteBuffer8.getLong();
        int int10 = byteBuffer8.position();
        float float12 = byteBuffer8.getFloat((int) (short) 10);
        boolean boolean13 = byteBuffer8.hasArray();
        double double14 = byteBuffer8.getDouble();
        java.nio.ByteBuffer byteBuffer17 = byteBuffer8.putFloat(0, (float) (short) 10);
        java.nio.CharBuffer charBuffer18 = byteBuffer8.asCharBuffer();
        boolean boolean19 = java.util.regex.Pattern.matches("java.nio.DirectByteBuffer[pos=0 lim=100 cap=100]", (java.lang.CharSequence) charBuffer18);
        java.lang.String[] strArray21 = null; // flaky: pattern2.split((java.lang.CharSequence) charBuffer18, 12);
        int int22 = 0; // flaky: pattern2.flags();
// flaky:         org.junit.Assert.assertNotNull(pattern2);
// flaky:         org.junit.Assert.assertEquals(pattern2.toString(), "java.nio.DirectByteBuffer[pos=10 lim=100 cap=100]");
// flaky:         org.junit.Assert.assertNotNull(strStream5);
        org.junit.Assert.assertNotNull(byteBuffer8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 8 + "'", int10 == 8);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.0f + "'", float12 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNotNull(byteBuffer17);
        org.junit.Assert.assertNotNull(charBuffer18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
// flaky:         org.junit.Assert.assertNotNull(strArray21);
// flaky:         org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-24) + "'", int22 == (-24));
    }

    @Test
    public void test00450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00450");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate((int) '4');
        java.nio.ShortBuffer shortBuffer2 = byteBuffer1.asShortBuffer();
        java.nio.ByteBuffer byteBuffer4 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        long long5 = byteBuffer4.getLong();
        int int6 = byteBuffer4.position();
        float float8 = byteBuffer4.getFloat((int) (short) 10);
        boolean boolean9 = byteBuffer4.hasArray();
        double double10 = byteBuffer4.getDouble();
        short short12 = byteBuffer4.getShort(0);
        java.nio.ByteBuffer byteBuffer14 = byteBuffer4.putDouble(100.0d);
        byte byte16 = byteBuffer14.get((int) (short) 0);
        java.nio.IntBuffer intBuffer17 = byteBuffer14.asIntBuffer();
        int int18 = byteBuffer1.compareTo(byteBuffer14);
        java.nio.FloatBuffer floatBuffer19 = byteBuffer14.asFloatBuffer();
        java.nio.ByteBuffer byteBuffer21 = byteBuffer14.put((byte) -1);
        java.nio.ByteBuffer byteBuffer24 = byteBuffer21.putShort(2, (short) (byte) 0);
        int int25 = byteBuffer21.getInt();
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(shortBuffer2);
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 0 + "'", short12 == (short) 0);
        org.junit.Assert.assertNotNull(byteBuffer14);
        org.junit.Assert.assertTrue("'" + byte16 + "' != '" + (byte) 0 + "'", byte16 == (byte) 0);
        org.junit.Assert.assertNotNull(intBuffer17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-24) + "'", int18 == (-24));
        org.junit.Assert.assertNotNull(floatBuffer19);
        org.junit.Assert.assertNotNull(byteBuffer21);
        org.junit.Assert.assertNotNull(byteBuffer24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test00451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00451");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocate((int) '4');
        java.nio.ShortBuffer shortBuffer2 = byteBuffer1.asShortBuffer();
        java.nio.ByteBuffer byteBuffer4 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        long long5 = byteBuffer4.getLong();
        int int6 = byteBuffer4.position();
        float float8 = byteBuffer4.getFloat((int) (short) 10);
        boolean boolean9 = byteBuffer4.hasArray();
        double double10 = byteBuffer4.getDouble();
        short short12 = byteBuffer4.getShort(0);
        java.nio.ByteBuffer byteBuffer14 = byteBuffer4.putDouble(100.0d);
        byte byte16 = byteBuffer14.get((int) (short) 0);
        java.nio.IntBuffer intBuffer17 = byteBuffer14.asIntBuffer();
        int int18 = byteBuffer1.compareTo(byteBuffer14);
        java.nio.ByteOrder byteOrder19 = byteBuffer14.order();
        java.nio.ByteBuffer byteBuffer20 = byteBuffer14.slice();
        java.nio.ByteBuffer byteBuffer22 = byteBuffer20.putShort((short) (byte) 0);
        float float23 = byteBuffer22.getFloat();
        // The following exception was thrown during execution in test generation
        try {
            byte byte25 = byteBuffer22.get(83);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(shortBuffer2);
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 0 + "'", short12 == (short) 0);
        org.junit.Assert.assertNotNull(byteBuffer14);
        org.junit.Assert.assertTrue("'" + byte16 + "' != '" + (byte) 0 + "'", byte16 == (byte) 0);
        org.junit.Assert.assertNotNull(intBuffer17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-24) + "'", int18 == (-24));
        org.junit.Assert.assertNotNull(byteOrder19);
        org.junit.Assert.assertNotNull(byteBuffer20);
        org.junit.Assert.assertNotNull(byteBuffer22);
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + 0.0f + "'", float23 == 0.0f);
    }

    @Test
    public void test00452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00452");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.contentType = "";
        java.lang.String str4 = response1.contentType;
        response1.executed = true;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry8 = response1.scanHeaders("");
        java.lang.String str10 = response1.getHeaderCaseInsensitive("Location");
        java.lang.String str11 = response1.charset();
        response1.numRedirects = (short) 0;
        java.lang.String str14 = response1.statusMessage;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response1);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Too many redirects occurred trying to load URL null");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(strEntry8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test00453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00453");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer5 = byteBuffer1.putInt(0);
        byte[] byteArray8 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer9 = byteBuffer5.put(byteArray8);
        java.nio.CharBuffer charBuffer10 = byteBuffer5.asCharBuffer();
        java.nio.ByteBuffer byteBuffer12 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer14 = byteBuffer12.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer16 = byteBuffer12.putInt(0);
        java.nio.ByteBuffer byteBuffer18 = byteBuffer16.putInt((int) '#');
        float float20 = byteBuffer18.getFloat(4);
        java.nio.ByteBuffer byteBuffer22 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer24 = byteBuffer22.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer26 = byteBuffer22.putInt(0);
        byte[] byteArray29 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer30 = byteBuffer26.put(byteArray29);
        java.nio.ByteBuffer byteBuffer32 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer34 = byteBuffer32.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer36 = byteBuffer32.putInt(0);
        byte[] byteArray39 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer40 = byteBuffer36.put(byteArray39);
        java.nio.ByteBuffer byteBuffer43 = byteBuffer26.get(byteArray39, 2, (int) (byte) 0);
        java.nio.ByteBuffer byteBuffer45 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer47 = byteBuffer45.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer49 = byteBuffer45.putInt(0);
        byte[] byteArray52 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer53 = byteBuffer49.put(byteArray52);
        java.nio.ByteBuffer byteBuffer55 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer57 = byteBuffer55.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer59 = byteBuffer55.putInt(0);
        byte[] byteArray62 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer63 = byteBuffer59.put(byteArray62);
        java.nio.ByteBuffer byteBuffer66 = byteBuffer49.get(byteArray62, 2, (int) (byte) 0);
        java.nio.ByteBuffer byteBuffer67 = byteBuffer43.put(byteArray62);
        java.nio.ByteBuffer byteBuffer68 = byteBuffer18.put(byteArray62);
        java.nio.ByteBuffer byteBuffer69 = byteBuffer5.get(byteArray62);
        java.nio.ByteBuffer byteBuffer70 = java.nio.ByteBuffer.wrap(byteArray62);
        java.nio.ShortBuffer shortBuffer71 = byteBuffer70.asShortBuffer();
        // The following exception was thrown during execution in test generation
        try {
            double double72 = byteBuffer70.getDouble();
            org.junit.Assert.fail("Expected exception of type java.nio.BufferUnderflowException; message: null");
        } catch (java.nio.BufferUnderflowException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertNotNull(charBuffer10);
        org.junit.Assert.assertNotNull(byteBuffer12);
        org.junit.Assert.assertNotNull(byteBuffer14);
        org.junit.Assert.assertNotNull(byteBuffer16);
        org.junit.Assert.assertNotNull(byteBuffer18);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 7.3E-44f + "'", float20 == 7.3E-44f);
        org.junit.Assert.assertNotNull(byteBuffer22);
        org.junit.Assert.assertNotNull(byteBuffer24);
        org.junit.Assert.assertNotNull(byteBuffer26);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray29), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer30);
        org.junit.Assert.assertNotNull(byteBuffer32);
        org.junit.Assert.assertNotNull(byteBuffer34);
        org.junit.Assert.assertNotNull(byteBuffer36);
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray39), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer40);
        org.junit.Assert.assertNotNull(byteBuffer43);
        org.junit.Assert.assertNotNull(byteBuffer45);
        org.junit.Assert.assertNotNull(byteBuffer47);
        org.junit.Assert.assertNotNull(byteBuffer49);
        org.junit.Assert.assertNotNull(byteArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray52), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer53);
        org.junit.Assert.assertNotNull(byteBuffer55);
        org.junit.Assert.assertNotNull(byteBuffer57);
        org.junit.Assert.assertNotNull(byteBuffer59);
        org.junit.Assert.assertNotNull(byteArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray62), "[0, 0]");
        org.junit.Assert.assertNotNull(byteBuffer63);
        org.junit.Assert.assertNotNull(byteBuffer66);
        org.junit.Assert.assertNotNull(byteBuffer67);
        org.junit.Assert.assertNotNull(byteBuffer68);
        org.junit.Assert.assertNotNull(byteBuffer69);
        org.junit.Assert.assertNotNull(byteBuffer70);
        org.junit.Assert.assertNotNull(shortBuffer71);
    }

    @Test
    public void test00454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00454");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer5 = byteBuffer1.putInt(0);
        byte[] byteArray8 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer9 = byteBuffer5.put(byteArray8);
        java.nio.FloatBuffer floatBuffer10 = byteBuffer5.asFloatBuffer();
        java.nio.CharBuffer charBuffer11 = byteBuffer5.asCharBuffer();
        boolean boolean12 = byteBuffer5.isReadOnly();
        boolean boolean13 = byteBuffer5.isDirect();
        java.nio.LongBuffer longBuffer14 = byteBuffer5.asLongBuffer();
        java.nio.ByteBuffer byteBuffer16 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        long long17 = byteBuffer16.getLong();
        byte byte19 = byteBuffer16.get((int) '4');
        java.nio.ByteBuffer byteBuffer21 = byteBuffer16.putInt((int) (short) 0);
        int int22 = byteBuffer5.compareTo(byteBuffer21);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.Buffer buffer24 = byteBuffer21.position((-65536));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: newPosition < 0: (-65536 < 0)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertNotNull(floatBuffer10);
        org.junit.Assert.assertNotNull(charBuffer11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(longBuffer14);
        org.junit.Assert.assertNotNull(byteBuffer16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + byte19 + "' != '" + (byte) 0 + "'", byte19 == (byte) 0);
        org.junit.Assert.assertNotNull(byteBuffer21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-2) + "'", int22 == (-2));
    }

    @Test
    public void test00455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00455");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer3 = java.nio.ByteBuffer.wrap(byteArray0, (int) '\000', 12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00456");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.contentType = "";
        java.lang.String str4 = response1.contentType;
        response1.executed = true;
        java.lang.String str7 = response1.statusMessage;
        java.nio.ByteBuffer byteBuffer8 = response1.byteData;
        response1.numRedirects = (byte) 10;
        org.jsoup.Connection.Response response12 = response1.removeCookie("java.nio.DirectByteBuffer[pos=35 lim=100 cap=100]");
        java.lang.String str13 = response1.statusMessage;
        java.lang.String str14 = response1.statusMessage();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response1);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Too many redirects occurred trying to load URL null");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(byteBuffer8);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test00457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00457");
        javax.net.SocketFactory socketFactory0 = javax.net.ssl.SSLSocketFactory.getDefault();
        java.net.Socket socket1 = socketFactory0.createSocket();
        java.net.Socket socket2 = socketFactory0.createSocket();
        java.net.Socket socket3 = socketFactory0.createSocket();
        java.net.Socket socket4 = socketFactory0.createSocket();
        java.net.InetAddress inetAddress7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.Socket socket9 = socketFactory0.createSocket("\\Q\\E", 22, inetAddress7, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.net.BindException; message: Permission denied (Bind failed)");
        } catch (java.net.BindException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(socketFactory0);
        org.junit.Assert.assertNotNull(socket1);
        org.junit.Assert.assertEquals(socket1.toString(), "Socket[unconnected]");
        org.junit.Assert.assertNotNull(socket2);
        org.junit.Assert.assertEquals(socket2.toString(), "Socket[unconnected]");
        org.junit.Assert.assertNotNull(socket3);
        org.junit.Assert.assertEquals(socket3.toString(), "Socket[unconnected]");
        org.junit.Assert.assertNotNull(socket4);
        org.junit.Assert.assertEquals(socket4.toString(), "Socket[unconnected]");
    }

    @Test
    public void test00458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00458");
        javax.net.SocketFactory socketFactory0 = javax.net.ssl.SSLSocketFactory.getDefault();
        java.net.Socket socket1 = socketFactory0.createSocket();
        java.net.InetAddress inetAddress2 = null;
        java.net.InetAddress inetAddress4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.Socket socket6 = socketFactory0.createSocket(inetAddress2, 75, inetAddress4, 80);
            org.junit.Assert.fail("Expected exception of type java.net.BindException; message: Permission denied (Bind failed)");
        } catch (java.net.BindException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(socketFactory0);
        org.junit.Assert.assertNotNull(socket1);
        org.junit.Assert.assertEquals(socket1.toString(), "Socket[unconnected]");
    }

    @Test
    public void test00459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00459");
        org.jsoup.Connection.Request request0 = null;
        java.io.OutputStream outputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response.writePost(request0, outputStream1, "java.nio.DirectByteBuffer[pos=0 lim=100 cap=100]");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00460");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        long long2 = byteBuffer1.getLong();
        int int3 = byteBuffer1.position();
        float float5 = byteBuffer1.getFloat((int) (short) 10);
        boolean boolean6 = byteBuffer1.hasArray();
        double double7 = byteBuffer1.getDouble();
        short short9 = byteBuffer1.getShort(0);
        java.nio.ByteBuffer byteBuffer11 = byteBuffer1.putDouble(100.0d);
        float float12 = byteBuffer1.getFloat();
        char char14 = byteBuffer1.getChar(1);
        java.nio.ByteBuffer byteBuffer16 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer18 = byteBuffer16.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer20 = byteBuffer16.putInt(0);
        byte[] byteArray23 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer24 = byteBuffer20.put(byteArray23);
        java.nio.ByteBuffer byteBuffer26 = byteBuffer24.putDouble(7.565251118924485E-307d);
        int int27 = byteBuffer1.compareTo(byteBuffer26);
        java.nio.ByteBuffer byteBuffer29 = byteBuffer1.putShort((short) (byte) -1);
        double double30 = byteBuffer29.getDouble();
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 0 + "'", short9 == (short) 0);
        org.junit.Assert.assertNotNull(byteBuffer11);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.0f + "'", float12 == 0.0f);
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + '\000' + "'", char14 == '\000');
        org.junit.Assert.assertNotNull(byteBuffer16);
        org.junit.Assert.assertNotNull(byteBuffer18);
        org.junit.Assert.assertNotNull(byteBuffer20);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer24);
        org.junit.Assert.assertNotNull(byteBuffer26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-6) + "'", int27 == (-6));
        org.junit.Assert.assertNotNull(byteBuffer29);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
    }

    @Test
    public void test00461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00461");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer5 = byteBuffer1.putInt(0);
        java.nio.ByteBuffer byteBuffer7 = byteBuffer5.putInt((int) '#');
        float float9 = byteBuffer7.getFloat(4);
        java.nio.ByteBuffer byteBuffer11 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer13 = byteBuffer11.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer15 = byteBuffer11.putInt(0);
        byte[] byteArray18 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer19 = byteBuffer15.put(byteArray18);
        java.nio.ByteBuffer byteBuffer21 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer23 = byteBuffer21.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer25 = byteBuffer21.putInt(0);
        byte[] byteArray28 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer29 = byteBuffer25.put(byteArray28);
        java.nio.ByteBuffer byteBuffer32 = byteBuffer15.get(byteArray28, 2, (int) (byte) 0);
        java.nio.ByteBuffer byteBuffer34 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer36 = byteBuffer34.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer38 = byteBuffer34.putInt(0);
        byte[] byteArray41 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer42 = byteBuffer38.put(byteArray41);
        java.nio.ByteBuffer byteBuffer44 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer46 = byteBuffer44.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer48 = byteBuffer44.putInt(0);
        byte[] byteArray51 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer52 = byteBuffer48.put(byteArray51);
        java.nio.ByteBuffer byteBuffer55 = byteBuffer38.get(byteArray51, 2, (int) (byte) 0);
        java.nio.ByteBuffer byteBuffer56 = byteBuffer32.put(byteArray51);
        java.nio.ByteBuffer byteBuffer57 = byteBuffer7.put(byteArray51);
        java.nio.ByteBuffer byteBuffer59 = byteBuffer7.putFloat((float) (byte) 100);
        long long60 = byteBuffer59.getLong();
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertNotNull(byteBuffer7);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 7.3E-44f + "'", float9 == 7.3E-44f);
        org.junit.Assert.assertNotNull(byteBuffer11);
        org.junit.Assert.assertNotNull(byteBuffer13);
        org.junit.Assert.assertNotNull(byteBuffer15);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer19);
        org.junit.Assert.assertNotNull(byteBuffer21);
        org.junit.Assert.assertNotNull(byteBuffer23);
        org.junit.Assert.assertNotNull(byteBuffer25);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray28), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer29);
        org.junit.Assert.assertNotNull(byteBuffer32);
        org.junit.Assert.assertNotNull(byteBuffer34);
        org.junit.Assert.assertNotNull(byteBuffer36);
        org.junit.Assert.assertNotNull(byteBuffer38);
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray41), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer42);
        org.junit.Assert.assertNotNull(byteBuffer44);
        org.junit.Assert.assertNotNull(byteBuffer46);
        org.junit.Assert.assertNotNull(byteBuffer48);
        org.junit.Assert.assertNotNull(byteArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray51), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer52);
        org.junit.Assert.assertNotNull(byteBuffer55);
        org.junit.Assert.assertNotNull(byteBuffer56);
        org.junit.Assert.assertNotNull(byteBuffer57);
        org.junit.Assert.assertNotNull(byteBuffer59);
        org.junit.Assert.assertTrue("'" + long60 + "' != '" + 0L + "'", long60 == 0L);
    }

    @Test
    public void test00462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00462");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        java.util.Map<java.lang.String, java.lang.String> strMap4 = response1.cookies();
        org.jsoup.Connection.Response response6 = response1.removeCookie("hi!");
        java.lang.String str7 = response1.statusMessage();
        java.nio.ByteBuffer byteBuffer9 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer11 = byteBuffer9.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer13 = byteBuffer9.putInt(0);
        byte[] byteArray16 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer17 = byteBuffer13.put(byteArray16);
        boolean boolean18 = byteBuffer13.hasArray();
        response1.byteData = byteBuffer13;
        boolean boolean21 = response1.hasCookie("\\Qhi!\\E");
        int int22 = response1.numRedirects;
        java.net.URL uRL23 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response24 = response1.url(uRL23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertNotNull(byteBuffer11);
        org.junit.Assert.assertNotNull(byteBuffer13);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test00463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00463");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.contentType = "";
        java.lang.String str4 = response1.contentType;
        response1.executed = true;
        response1.executed = false;
        java.nio.ByteBuffer byteBuffer9 = response1.byteData;
        java.lang.String str10 = response1.charset();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response1);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Too many redirects occurred trying to load URL null");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(byteBuffer9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test00464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00464");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.contentType = "";
        java.lang.String str4 = response1.contentType;
        response1.executed = true;
        response1.executed = false;
        java.lang.String str10 = response1.header("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response1);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Too many redirects occurred trying to load URL null");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test00465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00465");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer5 = byteBuffer1.putInt(0);
        java.nio.ByteBuffer byteBuffer8 = byteBuffer5.putDouble((int) (byte) 1, (double) 1L);
        java.nio.ByteBuffer byteBuffer10 = byteBuffer5.putChar(' ');
        float float11 = byteBuffer10.getFloat();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.Buffer buffer13 = byteBuffer10.limit((-65536));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertNotNull(byteBuffer8);
        org.junit.Assert.assertNotNull(byteBuffer10);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.0f + "'", float11 == 0.0f);
    }

    @Test
    public void test00466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00466");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        long long2 = byteBuffer1.getLong();
        int int3 = byteBuffer1.position();
        float float5 = byteBuffer1.getFloat((int) (short) 10);
        boolean boolean6 = byteBuffer1.hasArray();
        double double7 = byteBuffer1.getDouble();
        short short9 = byteBuffer1.getShort(0);
        java.nio.ByteBuffer byteBuffer11 = byteBuffer1.putDouble(100.0d);
        float float12 = byteBuffer1.getFloat();
        java.nio.ByteBuffer byteBuffer15 = byteBuffer1.putShort(24, (short) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray16 = byteBuffer1.array();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 0 + "'", short9 == (short) 0);
        org.junit.Assert.assertNotNull(byteBuffer11);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.0f + "'", float12 == 0.0f);
        org.junit.Assert.assertNotNull(byteBuffer15);
    }

    @Test
    public void test00467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00467");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        java.util.Map<java.lang.String, java.lang.String> strMap4 = response1.cookies();
        org.jsoup.Connection.Response response6 = response1.removeCookie("hi!");
        java.lang.String str7 = response1.statusMessage();
        int int8 = response1.statusCode;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response1);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Too many redirects occurred trying to load URL null");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test00468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00468");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.putLong((long) '4');
        int int5 = byteBuffer3.getInt((int) (short) 1);
        java.nio.ByteBuffer byteBuffer7 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer9 = byteBuffer7.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer11 = byteBuffer7.putInt(0);
        byte[] byteArray14 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer15 = byteBuffer11.put(byteArray14);
        java.nio.ByteBuffer byteBuffer17 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer19 = byteBuffer17.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer21 = byteBuffer17.putInt(0);
        byte[] byteArray24 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer25 = byteBuffer21.put(byteArray24);
        java.nio.ByteBuffer byteBuffer28 = byteBuffer11.get(byteArray24, 2, (int) (byte) 0);
        java.nio.ByteBuffer byteBuffer29 = byteBuffer3.get(byteArray24);
        java.nio.ByteBuffer byteBuffer31 = byteBuffer29.put((byte) 100);
        boolean boolean32 = byteBuffer31.hasRemaining();
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(byteBuffer7);
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertNotNull(byteBuffer11);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer15);
        org.junit.Assert.assertNotNull(byteBuffer17);
        org.junit.Assert.assertNotNull(byteBuffer19);
        org.junit.Assert.assertNotNull(byteBuffer21);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[0, 0]");
        org.junit.Assert.assertNotNull(byteBuffer25);
        org.junit.Assert.assertNotNull(byteBuffer28);
        org.junit.Assert.assertNotNull(byteBuffer29);
        org.junit.Assert.assertNotNull(byteBuffer31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    }

    @Test
    public void test00469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00469");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer5 = byteBuffer1.putInt(0);
        byte[] byteArray8 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer9 = byteBuffer5.put(byteArray8);
        java.nio.ByteOrder byteOrder10 = byteBuffer9.order();
        java.nio.ByteBuffer byteBuffer11 = byteBuffer9.duplicate();
        java.nio.ByteBuffer byteBuffer14 = byteBuffer11.putDouble(8, (double) 256);
        java.nio.CharBuffer charBuffer15 = byteBuffer11.asCharBuffer();
        java.lang.Object obj16 = null;
        boolean boolean17 = byteBuffer11.equals(obj16);
        boolean boolean18 = byteBuffer11.hasRemaining();
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertNotNull(byteOrder10);
        org.junit.Assert.assertNotNull(byteBuffer11);
        org.junit.Assert.assertNotNull(byteBuffer14);
        org.junit.Assert.assertNotNull(charBuffer15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test00470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00470");
        javax.net.SocketFactory socketFactory0 = javax.net.ssl.SSLSocketFactory.getDefault();
        java.net.Socket socket1 = socketFactory0.createSocket();
        java.net.InetAddress inetAddress2 = null;
        java.net.InetAddress inetAddress4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.Socket socket6 = socketFactory0.createSocket(inetAddress2, 64, inetAddress4, 0);
            org.junit.Assert.fail("Expected exception of type java.net.ConnectException; message: Connection refused (Connection refused)");
        } catch (java.net.ConnectException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(socketFactory0);
        org.junit.Assert.assertNotNull(socket1);
        org.junit.Assert.assertEquals(socket1.toString(), "Socket[unconnected]");
    }

    @Test
    public void test00471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00471");
        javax.net.SocketFactory socketFactory0 = javax.net.ssl.SSLSocketFactory.getDefault();
        java.net.Socket socket1 = socketFactory0.createSocket();
        // The following exception was thrown during execution in test generation
        try {
            java.net.Socket socket4 = socketFactory0.createSocket("java.nio.DirectByteBuffer[pos=22 lim=100 cap=100]", 1);
            org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: java.nio.DirectByteBuffer[pos=22 lim=100 cap=100]");
        } catch (java.net.UnknownHostException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(socketFactory0);
        org.junit.Assert.assertNotNull(socket1);
        org.junit.Assert.assertEquals(socket1.toString(), "Socket[unconnected]");
    }

    @Test
    public void test00472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00472");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.putLong((long) '4');
        float float5 = byteBuffer3.getFloat(32);
        double double6 = byteBuffer3.getDouble();
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray7 = byteBuffer3.array();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test00473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00473");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.contentType = "";
        java.lang.String str4 = response1.contentType;
        response1.executed = true;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry8 = response1.scanHeaders("");
        org.jsoup.Connection.Request request9 = null;
        response1.req = request9;
        java.lang.String str12 = response1.getHeaderCaseInsensitive("\\Qhi!\\E");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response1);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Too many redirects occurred trying to load URL null");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(strEntry8);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test00474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00474");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        java.util.Map<java.lang.String, java.lang.String> strMap4 = response1.cookies();
        org.jsoup.Connection.Response response6 = response1.removeCookie("hi!");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry8 = response1.scanHeaders("hi!");
        int int9 = response1.numRedirects;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNull(strEntry8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test00475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00475");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.contentType = "";
        java.lang.String str4 = response1.contentType;
        java.lang.String str5 = response1.charset;
        java.nio.ByteBuffer byteBuffer6 = response1.byteData;
        java.util.Map<java.lang.String, java.lang.String> strMap7 = response1.headers();
        org.jsoup.Connection.Response response9 = response1.removeHeader("java.nio.DirectByteBuffer[pos=8 lim=100 cap=100]");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = response1.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(byteBuffer6);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNotNull(response9);
    }

    @Test
    public void test00476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00476");
        javax.net.SocketFactory socketFactory0 = javax.net.ssl.SSLSocketFactory.getDefault();
        java.net.Socket socket1 = socketFactory0.createSocket();
        java.net.InetAddress inetAddress2 = null;
        java.net.InetAddress inetAddress4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.Socket socket6 = socketFactory0.createSocket(inetAddress2, 92, inetAddress4, 4);
            org.junit.Assert.fail("Expected exception of type java.net.BindException; message: Permission denied (Bind failed)");
        } catch (java.net.BindException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(socketFactory0);
        org.junit.Assert.assertNotNull(socket1);
        org.junit.Assert.assertEquals(socket1.toString(), "Socket[unconnected]");
    }

    @Test
    public void test00477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00477");
        java.util.regex.Pattern pattern2 = java.util.regex.Pattern.compile("\\Q\\Q\\E\\\\E\\Q\\E", 80);
        org.junit.Assert.assertNotNull(pattern2);
        org.junit.Assert.assertEquals(pattern2.toString(), "\\Q\\Q\\E\\\\E\\Q\\E");
    }

    @Test
    public void test00478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00478");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer5 = byteBuffer1.putInt(0);
        java.nio.ByteBuffer byteBuffer8 = byteBuffer5.putDouble((int) (byte) 1, (double) 1L);
        java.nio.ByteBuffer byteBuffer10 = byteBuffer5.putChar(' ');
        java.nio.ByteBuffer byteBuffer13 = byteBuffer10.putFloat(10, (float) (short) 100);
        java.nio.ByteBuffer byteBuffer15 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        long long16 = byteBuffer15.getLong();
        int int17 = byteBuffer15.position();
        float float19 = byteBuffer15.getFloat((int) (short) 10);
        boolean boolean20 = byteBuffer15.hasArray();
        double double21 = byteBuffer15.getDouble();
        short short23 = byteBuffer15.getShort(0);
        java.nio.ByteBuffer byteBuffer25 = byteBuffer15.putDouble(100.0d);
        boolean boolean26 = byteBuffer15.isDirect();
        int int27 = byteBuffer13.compareTo(byteBuffer15);
        java.nio.DoubleBuffer doubleBuffer28 = byteBuffer15.asDoubleBuffer();
        boolean boolean29 = doubleBuffer28.isReadOnly();
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertNotNull(byteBuffer8);
        org.junit.Assert.assertNotNull(byteBuffer10);
        org.junit.Assert.assertNotNull(byteBuffer13);
        org.junit.Assert.assertNotNull(byteBuffer15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 8 + "'", int17 == 8);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 0.0f + "'", float19 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + short23 + "' != '" + (short) 0 + "'", short23 == (short) 0);
        org.junit.Assert.assertNotNull(byteBuffer25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10 + "'", int27 == 10);
        org.junit.Assert.assertNotNull(doubleBuffer28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test00479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00479");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        long long2 = byteBuffer1.getLong();
        int int3 = byteBuffer1.position();
        float float5 = byteBuffer1.getFloat((int) (short) 10);
        boolean boolean6 = byteBuffer1.hasArray();
        double double7 = byteBuffer1.getDouble();
        java.nio.ByteBuffer byteBuffer10 = byteBuffer1.putFloat(0, (float) (short) 10);
        java.nio.ByteBuffer byteBuffer11 = byteBuffer1.asReadOnlyBuffer();
        // The following exception was thrown during execution in test generation
        try {
            short short13 = byteBuffer1.getShort((-2));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(byteBuffer10);
        org.junit.Assert.assertNotNull(byteBuffer11);
    }

    @Test
    public void test00480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00480");
        javax.net.SocketFactory socketFactory0 = javax.net.ssl.SSLSocketFactory.getDefault();
        // The following exception was thrown during execution in test generation
        try {
            java.net.Socket socket3 = socketFactory0.createSocket("Location", (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: port out of range:-1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(socketFactory0);
    }

    @Test
    public void test00481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00481");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer5 = byteBuffer1.putInt(0);
        java.nio.ByteBuffer byteBuffer7 = byteBuffer5.putDouble((double) 12);
        java.nio.ByteBuffer byteBuffer9 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        long long10 = byteBuffer9.getLong();
        int int11 = byteBuffer9.position();
        float float13 = byteBuffer9.getFloat((int) (short) 10);
        boolean boolean14 = byteBuffer9.hasArray();
        double double15 = byteBuffer9.getDouble();
        short short17 = byteBuffer9.getShort(0);
        java.nio.ByteBuffer byteBuffer19 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer21 = byteBuffer19.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer23 = byteBuffer19.putInt(0);
        byte[] byteArray26 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer27 = byteBuffer23.put(byteArray26);
        boolean boolean28 = byteBuffer23.hasArray();
        java.nio.ByteBuffer byteBuffer30 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer32 = byteBuffer30.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer34 = byteBuffer30.putInt(0);
        byte[] byteArray37 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer38 = byteBuffer34.put(byteArray37);
        java.nio.ByteBuffer byteBuffer40 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer42 = byteBuffer40.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer44 = byteBuffer40.putInt(0);
        byte[] byteArray47 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer48 = byteBuffer44.put(byteArray47);
        java.nio.ByteBuffer byteBuffer51 = byteBuffer34.get(byteArray47, 2, (int) (byte) 0);
        java.nio.ByteBuffer byteBuffer53 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer55 = byteBuffer53.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer57 = byteBuffer53.putInt(0);
        byte[] byteArray60 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer61 = byteBuffer57.put(byteArray60);
        java.nio.ByteBuffer byteBuffer63 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer65 = byteBuffer63.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer67 = byteBuffer63.putInt(0);
        byte[] byteArray70 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer71 = byteBuffer67.put(byteArray70);
        java.nio.ByteBuffer byteBuffer74 = byteBuffer57.get(byteArray70, 2, (int) (byte) 0);
        java.nio.ByteBuffer byteBuffer75 = byteBuffer51.put(byteArray70);
        java.nio.ByteBuffer byteBuffer76 = byteBuffer23.put(byteArray70);
        java.nio.ByteBuffer byteBuffer77 = byteBuffer9.get(byteArray70);
        java.nio.ByteBuffer byteBuffer78 = byteBuffer5.put(byteArray70);
        java.nio.ByteBuffer byteBuffer79 = java.nio.ByteBuffer.wrap(byteArray70);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer82 = java.nio.ByteBuffer.wrap(byteArray70, (int) 'a', 20);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertNotNull(byteBuffer7);
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 8 + "'", int11 == 8);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 0.0f + "'", float13 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + short17 + "' != '" + (short) 0 + "'", short17 == (short) 0);
        org.junit.Assert.assertNotNull(byteBuffer19);
        org.junit.Assert.assertNotNull(byteBuffer21);
        org.junit.Assert.assertNotNull(byteBuffer23);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(byteBuffer30);
        org.junit.Assert.assertNotNull(byteBuffer32);
        org.junit.Assert.assertNotNull(byteBuffer34);
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray37), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer38);
        org.junit.Assert.assertNotNull(byteBuffer40);
        org.junit.Assert.assertNotNull(byteBuffer42);
        org.junit.Assert.assertNotNull(byteBuffer44);
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray47), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer48);
        org.junit.Assert.assertNotNull(byteBuffer51);
        org.junit.Assert.assertNotNull(byteBuffer53);
        org.junit.Assert.assertNotNull(byteBuffer55);
        org.junit.Assert.assertNotNull(byteBuffer57);
        org.junit.Assert.assertNotNull(byteArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray60), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer61);
        org.junit.Assert.assertNotNull(byteBuffer63);
        org.junit.Assert.assertNotNull(byteBuffer65);
        org.junit.Assert.assertNotNull(byteBuffer67);
        org.junit.Assert.assertNotNull(byteArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray70), "[0, 0]");
        org.junit.Assert.assertNotNull(byteBuffer71);
        org.junit.Assert.assertNotNull(byteBuffer74);
        org.junit.Assert.assertNotNull(byteBuffer75);
        org.junit.Assert.assertNotNull(byteBuffer76);
        org.junit.Assert.assertNotNull(byteBuffer77);
        org.junit.Assert.assertNotNull(byteBuffer78);
        org.junit.Assert.assertNotNull(byteBuffer79);
    }

    @Test
    public void test00482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00482");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.contentType = "";
        java.lang.String str4 = response1.contentType;
        response1.executed = true;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry8 = response1.scanHeaders("");
        java.lang.String str10 = response1.getHeaderCaseInsensitive("Location");
        java.lang.String str11 = response1.charset();
        response1.numRedirects = (short) 0;
        java.lang.String str14 = response1.statusMessage;
        boolean boolean16 = response1.hasCookie("java.nio.DirectByteBuffer[pos=35 lim=100 cap=100]");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response1);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Too many redirects occurred trying to load URL null");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(strEntry8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test00483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00483");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        long long2 = byteBuffer1.getLong();
        int int3 = byteBuffer1.position();
        float float5 = byteBuffer1.getFloat((int) (short) 10);
        boolean boolean6 = byteBuffer1.hasArray();
        double double7 = byteBuffer1.getDouble();
        short short9 = byteBuffer1.getShort(0);
        java.nio.ByteBuffer byteBuffer11 = byteBuffer1.putDouble(100.0d);
        java.nio.CharBuffer charBuffer12 = byteBuffer1.asCharBuffer();
        java.nio.ByteBuffer byteBuffer14 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        long long15 = byteBuffer14.getLong();
        int int16 = byteBuffer14.position();
        float float18 = byteBuffer14.getFloat((int) (short) 10);
        boolean boolean19 = byteBuffer14.hasArray();
        double double20 = byteBuffer14.getDouble();
        short short22 = byteBuffer14.getShort(0);
        java.nio.ByteBuffer byteBuffer24 = byteBuffer14.putDouble(100.0d);
        float float25 = byteBuffer14.getFloat();
        char char27 = byteBuffer14.getChar(1);
        java.nio.ByteBuffer byteBuffer29 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer31 = byteBuffer29.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer33 = byteBuffer29.putInt(0);
        byte[] byteArray36 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer37 = byteBuffer33.put(byteArray36);
        java.nio.ByteBuffer byteBuffer39 = byteBuffer37.putDouble(7.565251118924485E-307d);
        int int40 = byteBuffer14.compareTo(byteBuffer39);
        java.nio.ByteBuffer byteBuffer42 = byteBuffer14.putShort((short) (byte) -1);
        byte[] byteArray45 = new byte[] { (byte) 1, (byte) 0 };
        java.nio.ByteBuffer byteBuffer46 = byteBuffer14.put(byteArray45);
        java.nio.ByteBuffer byteBuffer47 = byteBuffer1.put(byteArray45);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer50 = java.nio.ByteBuffer.wrap(byteArray45, (int) (short) -1, (int) '\n');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 0 + "'", short9 == (short) 0);
        org.junit.Assert.assertNotNull(byteBuffer11);
        org.junit.Assert.assertNotNull(charBuffer12);
        org.junit.Assert.assertNotNull(byteBuffer14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 8 + "'", int16 == 8);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 0.0f + "'", float18 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + short22 + "' != '" + (short) 0 + "'", short22 == (short) 0);
        org.junit.Assert.assertNotNull(byteBuffer24);
        org.junit.Assert.assertTrue("'" + float25 + "' != '" + 0.0f + "'", float25 == 0.0f);
        org.junit.Assert.assertTrue("'" + char27 + "' != '" + '\000' + "'", char27 == '\000');
        org.junit.Assert.assertNotNull(byteBuffer29);
        org.junit.Assert.assertNotNull(byteBuffer31);
        org.junit.Assert.assertNotNull(byteBuffer33);
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray36), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer37);
        org.junit.Assert.assertNotNull(byteBuffer39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-6) + "'", int40 == (-6));
        org.junit.Assert.assertNotNull(byteBuffer42);
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray45), "[1, 0]");
        org.junit.Assert.assertNotNull(byteBuffer46);
        org.junit.Assert.assertNotNull(byteBuffer47);
    }

    @Test
    public void test00484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00484");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.putLong((long) '4');
        short short5 = byteBuffer1.getShort(0);
        java.nio.ByteBuffer byteBuffer8 = byteBuffer1.putChar(1, '4');
        java.nio.ByteBuffer byteBuffer10 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer12 = byteBuffer10.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer14 = byteBuffer10.putInt(0);
        byte[] byteArray17 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer18 = byteBuffer14.put(byteArray17);
        java.nio.ByteBuffer byteBuffer20 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer22 = byteBuffer20.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer24 = byteBuffer20.putInt(0);
        byte[] byteArray27 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer28 = byteBuffer24.put(byteArray27);
        java.nio.ByteBuffer byteBuffer31 = byteBuffer14.get(byteArray27, 2, (int) (byte) 0);
        java.nio.ByteBuffer byteBuffer33 = byteBuffer14.putDouble(100.0d);
        int int34 = byteBuffer8.compareTo(byteBuffer14);
        java.nio.ByteBuffer byteBuffer36 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer38 = byteBuffer36.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer40 = byteBuffer36.putInt(0);
        byte[] byteArray43 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer44 = byteBuffer40.put(byteArray43);
        java.nio.ByteOrder byteOrder45 = byteBuffer44.order();
        java.nio.ByteBuffer byteBuffer46 = byteBuffer14.order(byteOrder45);
        java.nio.ByteBuffer byteBuffer47 = byteBuffer14.slice();
        java.nio.Buffer buffer48 = byteBuffer47.mark();
        java.nio.ByteBuffer byteBuffer50 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer52 = byteBuffer50.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer54 = byteBuffer50.putInt(0);
        short short55 = byteBuffer54.getShort();
        java.nio.IntBuffer intBuffer56 = byteBuffer54.asIntBuffer();
        int int57 = byteBuffer54.capacity();
        java.nio.ByteBuffer byteBuffer59 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer61 = byteBuffer59.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer63 = byteBuffer59.putInt(0);
        java.nio.ByteBuffer byteBuffer66 = byteBuffer63.putDouble((int) (byte) 1, (double) 1L);
        java.nio.ByteBuffer byteBuffer68 = byteBuffer63.putChar('a');
        double double70 = byteBuffer68.getDouble(12);
        java.nio.ByteBuffer byteBuffer72 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer74 = byteBuffer72.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer76 = byteBuffer72.putInt(0);
        byte[] byteArray79 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer80 = byteBuffer76.put(byteArray79);
        java.nio.ByteBuffer byteBuffer82 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer84 = byteBuffer82.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer86 = byteBuffer82.putInt(0);
        byte[] byteArray89 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer90 = byteBuffer86.put(byteArray89);
        java.nio.ByteBuffer byteBuffer93 = byteBuffer76.get(byteArray89, 2, (int) (byte) 0);
        java.nio.ByteBuffer byteBuffer94 = byteBuffer68.put(byteArray89);
        java.nio.ByteBuffer byteBuffer95 = byteBuffer54.get(byteArray89);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer98 = byteBuffer47.get(byteArray89, (int) (byte) 10, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 0 + "'", short5 == (short) 0);
        org.junit.Assert.assertNotNull(byteBuffer8);
        org.junit.Assert.assertNotNull(byteBuffer10);
        org.junit.Assert.assertNotNull(byteBuffer12);
        org.junit.Assert.assertNotNull(byteBuffer14);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer18);
        org.junit.Assert.assertNotNull(byteBuffer20);
        org.junit.Assert.assertNotNull(byteBuffer22);
        org.junit.Assert.assertNotNull(byteBuffer24);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer28);
        org.junit.Assert.assertNotNull(byteBuffer31);
        org.junit.Assert.assertNotNull(byteBuffer33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 14 + "'", int34 == 14);
        org.junit.Assert.assertNotNull(byteBuffer36);
        org.junit.Assert.assertNotNull(byteBuffer38);
        org.junit.Assert.assertNotNull(byteBuffer40);
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray43), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer44);
        org.junit.Assert.assertNotNull(byteOrder45);
        org.junit.Assert.assertNotNull(byteBuffer46);
        org.junit.Assert.assertNotNull(byteBuffer47);
        org.junit.Assert.assertNotNull(buffer48);
        org.junit.Assert.assertNotNull(byteBuffer50);
        org.junit.Assert.assertNotNull(byteBuffer52);
        org.junit.Assert.assertNotNull(byteBuffer54);
        org.junit.Assert.assertTrue("'" + short55 + "' != '" + (short) 0 + "'", short55 == (short) 0);
        org.junit.Assert.assertNotNull(intBuffer56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 100 + "'", int57 == 100);
        org.junit.Assert.assertNotNull(byteBuffer59);
        org.junit.Assert.assertNotNull(byteBuffer61);
        org.junit.Assert.assertNotNull(byteBuffer63);
        org.junit.Assert.assertNotNull(byteBuffer66);
        org.junit.Assert.assertNotNull(byteBuffer68);
        org.junit.Assert.assertTrue("'" + double70 + "' != '" + 7.565251118924485E-307d + "'", double70 == 7.565251118924485E-307d);
        org.junit.Assert.assertNotNull(byteBuffer72);
        org.junit.Assert.assertNotNull(byteBuffer74);
        org.junit.Assert.assertNotNull(byteBuffer76);
        org.junit.Assert.assertNotNull(byteArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray79), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer80);
        org.junit.Assert.assertNotNull(byteBuffer82);
        org.junit.Assert.assertNotNull(byteBuffer84);
        org.junit.Assert.assertNotNull(byteBuffer86);
        org.junit.Assert.assertNotNull(byteArray89);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray89), "[0, 0]");
        org.junit.Assert.assertNotNull(byteBuffer90);
        org.junit.Assert.assertNotNull(byteBuffer93);
        org.junit.Assert.assertNotNull(byteBuffer94);
        org.junit.Assert.assertNotNull(byteBuffer95);
    }

    @Test
    public void test00485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00485");
        org.jsoup.helper.HttpConnection.Response.MAX_REDIRECTS = (short) 0;
    }

    @Test
    public void test00486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00486");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str4 = response2.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response7 = response2.header("hi!", "");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response8 = org.jsoup.helper.HttpConnection.Response.execute(request0, response2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(response7);
    }

    @Test
    public void test00487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00487");
        java.util.regex.Pattern pattern2 = java.util.regex.Pattern.compile("\\Qhi!\\E", (int) (short) 100);
        java.nio.ByteBuffer byteBuffer4 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer6 = byteBuffer4.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer8 = byteBuffer4.putInt(0);
        byte[] byteArray11 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer12 = byteBuffer8.put(byteArray11);
        java.nio.CharBuffer charBuffer13 = byteBuffer8.asCharBuffer();
        java.util.regex.Matcher matcher14 = pattern2.matcher((java.lang.CharSequence) charBuffer13);
        int int15 = pattern2.flags();
        org.junit.Assert.assertNotNull(pattern2);
        org.junit.Assert.assertEquals(pattern2.toString(), "\\Qhi!\\E");
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertNotNull(byteBuffer6);
        org.junit.Assert.assertNotNull(byteBuffer8);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer12);
        org.junit.Assert.assertNotNull(charBuffer13);
        org.junit.Assert.assertNotNull(matcher14);
        org.junit.Assert.assertEquals(matcher14.toString(), "java.util.regex.Matcher[pattern=\\Qhi!\\E region=0,43 lastmatch=]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
    }

    @Test
    public void test00488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00488");
        org.jsoup.Connection.Request request0 = null;
        java.io.OutputStream outputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response.writePost(request0, outputStream1, "java.nio.DirectByteBuffer[pos=32 lim=100 cap=100]");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00489");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        response2.contentType = "";
        java.lang.String str5 = response2.contentType;
        response2.executed = true;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry9 = response2.scanHeaders("");
        java.lang.String str11 = response2.getHeaderCaseInsensitive("Location");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response12 = org.jsoup.helper.HttpConnection.Response.execute(request0, response2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(strEntry9);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test00490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00490");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.FloatBuffer floatBuffer2 = byteBuffer1.asFloatBuffer();
        java.nio.Buffer buffer4 = byteBuffer1.limit((int) (byte) 0);
        java.nio.ByteBuffer byteBuffer5 = byteBuffer1.asReadOnlyBuffer();
        java.nio.ByteBuffer byteBuffer7 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer9 = byteBuffer7.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer11 = byteBuffer7.putInt(0);
        short short12 = byteBuffer11.getShort();
        java.nio.IntBuffer intBuffer13 = byteBuffer11.asIntBuffer();
        int int14 = byteBuffer11.capacity();
        java.nio.ByteBuffer byteBuffer16 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer18 = byteBuffer16.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer20 = byteBuffer16.putInt(0);
        java.nio.ByteBuffer byteBuffer23 = byteBuffer20.putDouble((int) (byte) 1, (double) 1L);
        java.nio.ByteBuffer byteBuffer25 = byteBuffer20.putChar('a');
        double double27 = byteBuffer25.getDouble(12);
        java.nio.ByteBuffer byteBuffer29 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer31 = byteBuffer29.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer33 = byteBuffer29.putInt(0);
        byte[] byteArray36 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer37 = byteBuffer33.put(byteArray36);
        java.nio.ByteBuffer byteBuffer39 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer41 = byteBuffer39.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer43 = byteBuffer39.putInt(0);
        byte[] byteArray46 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer47 = byteBuffer43.put(byteArray46);
        java.nio.ByteBuffer byteBuffer50 = byteBuffer33.get(byteArray46, 2, (int) (byte) 0);
        java.nio.ByteBuffer byteBuffer51 = byteBuffer25.put(byteArray46);
        java.nio.ByteBuffer byteBuffer52 = byteBuffer11.get(byteArray46);
        java.nio.ByteBuffer byteBuffer53 = java.nio.ByteBuffer.wrap(byteArray46);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer56 = byteBuffer5.get(byteArray46, (-2), 22);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(floatBuffer2);
        org.junit.Assert.assertNotNull(buffer4);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertNotNull(byteBuffer7);
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertNotNull(byteBuffer11);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 0 + "'", short12 == (short) 0);
        org.junit.Assert.assertNotNull(intBuffer13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertNotNull(byteBuffer16);
        org.junit.Assert.assertNotNull(byteBuffer18);
        org.junit.Assert.assertNotNull(byteBuffer20);
        org.junit.Assert.assertNotNull(byteBuffer23);
        org.junit.Assert.assertNotNull(byteBuffer25);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 7.565251118924485E-307d + "'", double27 == 7.565251118924485E-307d);
        org.junit.Assert.assertNotNull(byteBuffer29);
        org.junit.Assert.assertNotNull(byteBuffer31);
        org.junit.Assert.assertNotNull(byteBuffer33);
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray36), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer37);
        org.junit.Assert.assertNotNull(byteBuffer39);
        org.junit.Assert.assertNotNull(byteBuffer41);
        org.junit.Assert.assertNotNull(byteBuffer43);
        org.junit.Assert.assertNotNull(byteArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray46), "[0, 0]");
        org.junit.Assert.assertNotNull(byteBuffer47);
        org.junit.Assert.assertNotNull(byteBuffer50);
        org.junit.Assert.assertNotNull(byteBuffer51);
        org.junit.Assert.assertNotNull(byteBuffer52);
        org.junit.Assert.assertNotNull(byteBuffer53);
    }

    @Test
    public void test00491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00491");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.contentType = "";
        java.lang.String str4 = response1.contentType;
        response1.executed = true;
        java.util.Map<java.lang.String, java.lang.String> strMap7 = response1.headers();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response1);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Too many redirects occurred trying to load URL null");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(strMap7);
    }

    @Test
    public void test00492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00492");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.contentType = "";
        java.lang.String str4 = response1.contentType;
        response1.executed = true;
        java.util.Map<java.lang.String, java.lang.String> strMap7 = response1.headers();
        java.lang.String str9 = response1.header("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response1);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Too many redirects occurred trying to load URL null");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test00493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00493");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response6 = response1.header("hi!", "");
        org.jsoup.Connection.Request request7 = null;
        response1.req = request7;
        java.lang.String str9 = response1.charset();
        java.lang.String str10 = response1.statusMessage();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test00494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00494");
        javax.net.SocketFactory socketFactory0 = javax.net.ssl.SSLSocketFactory.getDefault();
        java.net.Socket socket1 = socketFactory0.createSocket();
        java.net.Socket socket2 = socketFactory0.createSocket();
        java.net.InetAddress inetAddress3 = null;
        java.net.InetAddress inetAddress5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.Socket socket7 = socketFactory0.createSocket(inetAddress3, 52, inetAddress5, 80);
            org.junit.Assert.fail("Expected exception of type java.net.BindException; message: Permission denied (Bind failed)");
        } catch (java.net.BindException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(socketFactory0);
        org.junit.Assert.assertNotNull(socket1);
        org.junit.Assert.assertEquals(socket1.toString(), "Socket[unconnected]");
        org.junit.Assert.assertNotNull(socket2);
        org.junit.Assert.assertEquals(socket2.toString(), "Socket[unconnected]");
    }

    @Test
    public void test00495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00495");
        java.nio.ByteBuffer byteBuffer2 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer4 = byteBuffer2.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer6 = byteBuffer2.putInt(0);
        byte[] byteArray9 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer10 = byteBuffer6.put(byteArray9);
        java.nio.FloatBuffer floatBuffer11 = byteBuffer6.asFloatBuffer();
        java.nio.CharBuffer charBuffer12 = byteBuffer6.asCharBuffer();
        boolean boolean13 = java.util.regex.Pattern.matches("\\Qjava.nio.DirectByteBuffer[pos=35 lim=100 cap=100]\\E", (java.lang.CharSequence) charBuffer12);
        org.junit.Assert.assertNotNull(byteBuffer2);
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertNotNull(byteBuffer6);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer10);
        org.junit.Assert.assertNotNull(floatBuffer11);
        org.junit.Assert.assertNotNull(charBuffer12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test00496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00496");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer5 = byteBuffer1.putInt(0);
        byte[] byteArray8 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer9 = byteBuffer5.put(byteArray8);
        java.nio.ByteBuffer byteBuffer11 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer13 = byteBuffer11.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer15 = byteBuffer11.putInt(0);
        byte[] byteArray18 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer19 = byteBuffer15.put(byteArray18);
        java.nio.ByteBuffer byteBuffer22 = byteBuffer5.get(byteArray18, 2, (int) (byte) 0);
        java.nio.ByteBuffer byteBuffer24 = byteBuffer22.putShort((short) -1);
        java.nio.Buffer buffer25 = byteBuffer22.flip();
        java.nio.FloatBuffer floatBuffer26 = byteBuffer22.asFloatBuffer();
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertNotNull(byteBuffer11);
        org.junit.Assert.assertNotNull(byteBuffer13);
        org.junit.Assert.assertNotNull(byteBuffer15);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer19);
        org.junit.Assert.assertNotNull(byteBuffer22);
        org.junit.Assert.assertNotNull(byteBuffer24);
        org.junit.Assert.assertNotNull(buffer25);
        org.junit.Assert.assertNotNull(floatBuffer26);
    }

    @Test
    public void test00497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00497");
        javax.net.SocketFactory socketFactory0 = javax.net.ssl.SSLSocketFactory.getDefault();
        java.net.Socket socket1 = socketFactory0.createSocket();
        java.net.Socket socket2 = socketFactory0.createSocket();
        java.net.InetAddress inetAddress5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.Socket socket7 = socketFactory0.createSocket("\\Qjava.nio.DirectByteBuffer[pos=35 lim=100 cap=100]\\E", 22, inetAddress5, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.net.BindException; message: Permission denied (Bind failed)");
        } catch (java.net.BindException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(socketFactory0);
        org.junit.Assert.assertNotNull(socket1);
        org.junit.Assert.assertEquals(socket1.toString(), "Socket[unconnected]");
        org.junit.Assert.assertNotNull(socket2);
        org.junit.Assert.assertEquals(socket2.toString(), "Socket[unconnected]");
    }

    @Test
    public void test00498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00498");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer3 = byteBuffer1.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer5 = byteBuffer1.putInt(0);
        byte[] byteArray8 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer9 = byteBuffer5.put(byteArray8);
        java.nio.ByteBuffer byteBuffer11 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer13 = byteBuffer11.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer15 = byteBuffer11.putInt(0);
        byte[] byteArray18 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer19 = byteBuffer15.put(byteArray18);
        java.nio.ByteBuffer byteBuffer22 = byteBuffer5.get(byteArray18, 2, (int) (byte) 0);
        java.nio.ByteBuffer byteBuffer24 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer26 = byteBuffer24.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer28 = byteBuffer24.putInt(0);
        byte[] byteArray31 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer32 = byteBuffer28.put(byteArray31);
        java.nio.ByteBuffer byteBuffer34 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer36 = byteBuffer34.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer38 = byteBuffer34.putInt(0);
        byte[] byteArray41 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer42 = byteBuffer38.put(byteArray41);
        java.nio.ByteBuffer byteBuffer45 = byteBuffer28.get(byteArray41, 2, (int) (byte) 0);
        java.nio.ByteBuffer byteBuffer46 = byteBuffer22.put(byteArray41);
        long long47 = byteBuffer22.getLong();
        // The following exception was thrown during execution in test generation
        try {
            int int49 = byteBuffer22.getInt((-65536));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertNotNull(byteBuffer11);
        org.junit.Assert.assertNotNull(byteBuffer13);
        org.junit.Assert.assertNotNull(byteBuffer15);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer19);
        org.junit.Assert.assertNotNull(byteBuffer22);
        org.junit.Assert.assertNotNull(byteBuffer24);
        org.junit.Assert.assertNotNull(byteBuffer26);
        org.junit.Assert.assertNotNull(byteBuffer28);
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray31), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer32);
        org.junit.Assert.assertNotNull(byteBuffer34);
        org.junit.Assert.assertNotNull(byteBuffer36);
        org.junit.Assert.assertNotNull(byteBuffer38);
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray41), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer42);
        org.junit.Assert.assertNotNull(byteBuffer45);
        org.junit.Assert.assertNotNull(byteBuffer46);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 0L + "'", long47 == 0L);
    }

    @Test
    public void test00499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00499");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        response2.contentType = "";
        java.lang.String str5 = response2.contentType;
        response2.executed = true;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry9 = response2.scanHeaders("");
        java.lang.String str11 = response2.getHeaderCaseInsensitive("Location");
        java.lang.String str12 = response2.charset();
        response2.charset = "java.nio.DirectByteBuffer[pos=10 lim=100 cap=100]";
        java.net.URL uRL15 = response2.url();
        java.net.URL uRL16 = response2.url();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response17 = org.jsoup.helper.HttpConnection.Response.execute(request0, response2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(strEntry9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(uRL15);
        org.junit.Assert.assertNull(uRL16);
    }

    @Test
    public void test00500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00500");
        java.nio.ByteBuffer byteBuffer1 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        long long2 = byteBuffer1.getLong();
        int int3 = byteBuffer1.position();
        float float5 = byteBuffer1.getFloat((int) (short) 10);
        boolean boolean6 = byteBuffer1.hasArray();
        double double7 = byteBuffer1.getDouble();
        short short9 = byteBuffer1.getShort(0);
        java.nio.ByteBuffer byteBuffer11 = byteBuffer1.putDouble(100.0d);
        float float12 = byteBuffer1.getFloat();
        char char14 = byteBuffer1.getChar(1);
        java.nio.ByteBuffer byteBuffer16 = java.nio.ByteBuffer.allocateDirect((int) (short) 100);
        java.nio.ByteBuffer byteBuffer18 = byteBuffer16.putLong((long) '4');
        java.nio.ByteBuffer byteBuffer20 = byteBuffer16.putInt(0);
        byte[] byteArray23 = new byte[] { (byte) 0, (byte) 10 };
        java.nio.ByteBuffer byteBuffer24 = byteBuffer20.put(byteArray23);
        java.nio.ByteBuffer byteBuffer26 = byteBuffer24.putDouble(7.565251118924485E-307d);
        int int27 = byteBuffer1.compareTo(byteBuffer26);
        java.nio.DoubleBuffer doubleBuffer28 = byteBuffer1.asDoubleBuffer();
        boolean boolean29 = doubleBuffer28.hasRemaining();
        org.junit.Assert.assertNotNull(byteBuffer1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 0 + "'", short9 == (short) 0);
        org.junit.Assert.assertNotNull(byteBuffer11);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.0f + "'", float12 == 0.0f);
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + '\000' + "'", char14 == '\000');
        org.junit.Assert.assertNotNull(byteBuffer16);
        org.junit.Assert.assertNotNull(byteBuffer18);
        org.junit.Assert.assertNotNull(byteBuffer20);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[0, 10]");
        org.junit.Assert.assertNotNull(byteBuffer24);
        org.junit.Assert.assertNotNull(byteBuffer26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-6) + "'", int27 == (-6));
        org.junit.Assert.assertNotNull(doubleBuffer28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }
}
