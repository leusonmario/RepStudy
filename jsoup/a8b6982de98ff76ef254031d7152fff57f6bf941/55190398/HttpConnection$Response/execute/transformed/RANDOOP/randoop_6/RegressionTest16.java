import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest16 {

    public static boolean debug = false;

    @Test
    public void test08001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08001");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        response1.executed = false;
        response1.numRedirects = '4';
        boolean boolean13 = response1.hasHeaderWithValue("Location", "Location");
        org.jsoup.Connection.Method method14 = response1.method();
        response1.contentType = "";
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(method14);
    }

    @Test
    public void test08002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08002");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        response1.executed = false;
        java.lang.String str9 = response1.charset;
        org.jsoup.Connection.Response response11 = response1.removeCookie("Location");
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str13 = response12.charset();
        java.util.Map<java.lang.String, java.lang.String> strMap14 = response12.headers();
        java.lang.Class<?> wildcardClass15 = response12.getClass();
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test08003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08003");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        java.lang.String str8 = response1.contentType();
        response1.charset = "hi!";
        org.jsoup.Connection.Response response12 = response1.removeHeader("Location");
        org.jsoup.Connection.Response response15 = response1.cookie("Location", "hi!");
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response1);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray17 = response16.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNotNull(response15);
    }

    @Test
    public void test08004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08004");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Request request3 = null;
        response2.req = request3;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry6 = response2.scanHeaders("hi!");
        org.jsoup.Connection.Response response9 = response2.cookie("hi!", "");
        java.net.URL uRL10 = response2.url();
        java.nio.ByteBuffer byteBuffer11 = null;
        response2.byteData = byteBuffer11;
        java.lang.String str14 = response2.header("Location");
        java.lang.String str15 = response2.charset();
        boolean boolean16 = response2.executed;
        org.jsoup.Connection.Method method17 = response2.method();
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response(response2);
        int int19 = response2.statusCode();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response20 = org.jsoup.helper.HttpConnection.Response.execute(request0, response2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry6);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertNull(uRL10);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(method17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test08005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08005");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        response1.charset = "";
        response1.statusMessage = "";
        response1.charset = "Location";
        org.jsoup.Connection.Request request11 = null;
        response1.req = request11;
        response1.statusMessage = "hi!";
        org.junit.Assert.assertNotNull(response4);
    }

    @Test
    public void test08006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08006");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        response1.charset = "";
        boolean boolean9 = response1.hasHeaderWithValue("hi!", "Location");
        java.lang.String str10 = response1.statusMessage;
        org.jsoup.Connection.Response response12 = response1.removeCookie("hi!");
        java.lang.String str13 = response1.contentType();
        java.net.URL uRL14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response15 = response1.url(uRL14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test08007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08007");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        response1.charset = "";
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry8 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        response1.statusCode = (byte) 10;
        java.nio.ByteBuffer byteBuffer13 = null;
        response1.byteData = byteBuffer13;
        org.jsoup.Connection.Request request15 = response1.req;
        response1.numRedirects = (byte) 10;
        java.nio.ByteBuffer byteBuffer18 = response1.byteData;
        java.net.URL uRL19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response20 = response1.url(uRL19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNotNull(strEntry8);
        org.junit.Assert.assertNull(request15);
        org.junit.Assert.assertNull(byteBuffer18);
    }

    @Test
    public void test08008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08008");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        org.jsoup.Connection.Response response8 = response1.cookie("hi!", "");
        org.jsoup.Connection.Response response11 = response1.cookie("Location", "");
        boolean boolean14 = response1.hasHeaderWithValue("hi!", "");
        org.jsoup.Connection.Response response16 = response1.removeCookie("Location");
        response1.statusMessage = "";
        org.jsoup.Connection.Method method19 = response1.method();
        java.lang.String str20 = response1.charset;
        int int21 = response1.statusCode;
        boolean boolean22 = response1.executed;
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertNull(method19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test08009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08009");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        response1.executed = false;
        boolean boolean9 = response1.executed;
        int int10 = response1.statusCode();
        response1.executed = false;
        org.jsoup.Connection.Method method13 = response1.method();
        java.net.URL uRL14 = response1.url();
        org.jsoup.Connection.Request request15 = response1.req;
        java.lang.String str16 = response1.contentType;
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(method13);
        org.junit.Assert.assertNull(uRL14);
        org.junit.Assert.assertNull(request15);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test08010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08010");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        response1.executed = false;
        java.lang.String str9 = response1.charset;
        java.lang.String str10 = response1.charset;
        response1.charset = "hi!";
        java.lang.String str13 = response1.charset();
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = response15.cookie("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test08011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08011");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        org.jsoup.Connection.Request request5 = null;
        response1.req = request5;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry8 = response1.scanHeaders("Location");
        java.lang.String str9 = response1.contentType;
        java.util.Map<java.lang.String, java.lang.String> strMap10 = response1.headers();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry12 = response1.scanHeaders("");
        java.lang.String str13 = response1.contentType();
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(strEntry8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNull(strEntry12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test08012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08012");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        response1.charset = "";
        java.lang.String str8 = response1.cookie("hi!");
        boolean boolean9 = response1.executed;
        response1.statusMessage = "Location";
        org.jsoup.Connection.Request request12 = null;
        response1.req = request12;
        int int14 = response1.numRedirects;
        boolean boolean15 = response1.executed;
        int int16 = response1.numRedirects;
        java.net.HttpURLConnection httpURLConnection17 = null;
        org.jsoup.helper.HttpConnection.Response response18 = null;
        org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response(response18);
        org.jsoup.Connection.Request request20 = null;
        response19.req = request20;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry23 = response19.scanHeaders("hi!");
        response19.charset = "hi!";
        int int26 = response19.numRedirects;
        response19.contentType = "hi!";
        java.nio.ByteBuffer byteBuffer29 = response19.byteData;
        java.lang.String str30 = response19.contentType;
        java.lang.String str32 = response19.getHeaderCaseInsensitive("hi!");
        java.lang.String str33 = response19.charset();
        org.jsoup.Connection.Method method34 = response19.method();
        // The following exception was thrown during execution in test generation
        try {
            response1.setupFromConnection(httpURLConnection17, (org.jsoup.Connection.Response) response19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(strEntry23);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNull(byteBuffer29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertNull(method34);
    }

    @Test
    public void test08013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08013");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Request request3 = null;
        response2.req = request3;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry6 = response2.scanHeaders("hi!");
        org.jsoup.Connection.Response response9 = response2.cookie("hi!", "");
        java.lang.String str11 = response2.getHeaderCaseInsensitive("Location");
        java.lang.String str12 = response2.charset();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response13 = org.jsoup.helper.HttpConnection.Response.execute(request0, response2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry6);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test08014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08014");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Response response5 = response2.header("hi!", "");
        java.lang.String str7 = response2.getHeaderCaseInsensitive("");
        response2.executed = false;
        boolean boolean10 = response2.executed;
        int int11 = response2.statusCode();
        java.lang.String str12 = response2.contentType;
        int int13 = response2.statusCode();
        java.nio.ByteBuffer byteBuffer14 = null;
        response2.byteData = byteBuffer14;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response16 = org.jsoup.helper.HttpConnection.Response.execute(request0, response2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test08015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08015");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        response1.executed = false;
        org.jsoup.Connection.Response response11 = response1.header("Location", "");
        int int12 = response1.statusCode;
        boolean boolean13 = response1.executed;
        response1.statusMessage = "hi!";
        java.lang.String str16 = response1.charset;
        org.jsoup.Connection.Response response19 = response1.cookie("hi!", "hi!");
        response1.numRedirects = 10;
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(response19);
    }

    @Test
    public void test08016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08016");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        response1.executed = false;
        org.jsoup.Connection.Response response11 = response1.header("Location", "");
        int int12 = response1.statusCode;
        java.lang.String str13 = response1.charset();
        java.util.Map<java.lang.String, java.lang.String> strMap14 = response1.cookies();
        int int15 = response1.statusCode;
        java.net.URL uRL16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response17 = response1.url(uRL16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test08017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08017");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        response1.charset = "";
        response1.executed = true;
        boolean boolean10 = response1.hasHeader("Location");
        java.util.Map<java.lang.String, java.lang.String> strMap11 = response1.headers();
        boolean boolean14 = response1.hasHeaderWithValue("Location", "Location");
        boolean boolean16 = response1.hasHeader("hi!");
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test08018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08018");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        int int8 = response1.numRedirects;
        response1.contentType = "hi!";
        java.nio.ByteBuffer byteBuffer11 = response1.byteData;
        java.nio.ByteBuffer byteBuffer12 = null;
        response1.byteData = byteBuffer12;
        org.jsoup.Connection.Response response16 = response1.header("hi!", "hi!");
        org.jsoup.Connection.Method method17 = response1.method();
        java.lang.String str19 = response1.header("hi!");
        java.lang.String str20 = response1.contentType();
        java.nio.ByteBuffer byteBuffer21 = response1.byteData;
        org.jsoup.Connection.Method method22 = response1.method();
        org.jsoup.Connection.Response response24 = response1.removeCookie("Location");
        int int25 = response1.numRedirects;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response27 = response1.removeHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertNull(method17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNull(byteBuffer21);
        org.junit.Assert.assertNull(method22);
        org.junit.Assert.assertNotNull(response24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test08019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08019");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        response1.charset = "";
        java.lang.String str8 = response1.cookie("hi!");
        boolean boolean9 = response1.executed;
        response1.statusMessage = "Location";
        java.util.Map<java.lang.String, java.lang.String> strMap12 = response1.headers();
        java.lang.String str14 = response1.header("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response17 = response1.header("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test08020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08020");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        response1.charset = "";
        response1.statusMessage = "";
        java.lang.String str10 = response1.getHeaderCaseInsensitive("");
        boolean boolean11 = response1.executed;
        int int12 = response1.numRedirects;
        response1.charset = "Location";
        response1.charset = "hi!";
        response1.statusCode = (short) -1;
        org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.nio.ByteBuffer byteBuffer20 = response19.byteData;
        java.lang.String str21 = response19.contentType;
        java.net.URL uRL22 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response23 = response19.url(uRL22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(byteBuffer20);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test08021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08021");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        int int8 = response1.numRedirects;
        org.jsoup.Connection.Response response11 = response1.cookie("Location", "Location");
        java.lang.String str12 = response1.contentType();
        java.util.Map<java.lang.String, java.lang.String> strMap13 = response1.headers();
        java.lang.String str15 = response1.getHeaderCaseInsensitive("Location");
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test08022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08022");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Response response5 = response2.header("hi!", "");
        java.lang.String str7 = response2.getHeaderCaseInsensitive("");
        response2.executed = false;
        boolean boolean10 = response2.executed;
        int int11 = response2.statusCode();
        java.lang.String str12 = response2.contentType;
        java.lang.String str13 = response2.charset();
        java.lang.String str14 = response2.statusMessage();
        java.nio.ByteBuffer byteBuffer15 = null;
        response2.byteData = byteBuffer15;
        java.lang.String str17 = response2.contentType();
        java.nio.ByteBuffer byteBuffer18 = null;
        response2.byteData = byteBuffer18;
        java.lang.String str21 = response2.getHeaderCaseInsensitive("");
        boolean boolean24 = response2.hasHeaderWithValue("Location", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response25 = org.jsoup.helper.HttpConnection.Response.execute(request0, response2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test08023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08023");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        org.jsoup.Connection.Request request8 = response1.req;
        java.lang.String str9 = response1.statusMessage;
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNull(request8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test08024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08024");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        org.jsoup.Connection.Request request5 = null;
        response1.req = request5;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry8 = response1.scanHeaders("Location");
        boolean boolean11 = response1.hasHeaderWithValue("hi!", "");
        response1.statusCode = (short) -1;
        java.net.URL uRL14 = response1.url();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry16 = response1.scanHeaders("hi!");
        java.lang.String str18 = response1.getHeaderCaseInsensitive("");
        boolean boolean20 = response1.hasCookie("Location");
        java.lang.String str22 = response1.getHeaderCaseInsensitive("hi!");
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(strEntry8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(uRL14);
        org.junit.Assert.assertNotNull(strEntry16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test08025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08025");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        org.jsoup.Connection.Response response8 = response1.cookie("hi!", "");
        java.net.URL uRL9 = response1.url();
        java.nio.ByteBuffer byteBuffer10 = null;
        response1.byteData = byteBuffer10;
        java.lang.String str13 = response1.header("Location");
        java.lang.String str14 = response1.charset();
        boolean boolean15 = response1.executed;
        response1.numRedirects = (byte) -1;
        org.jsoup.Connection.Request request18 = null;
        response1.req = request18;
        java.nio.ByteBuffer byteBuffer20 = response1.byteData;
        response1.executed = false;
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(byteBuffer20);
    }

    @Test
    public void test08026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08026");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.charset = "Location";
        int int4 = response1.numRedirects;
        java.nio.ByteBuffer byteBuffer5 = response1.byteData;
        java.nio.ByteBuffer byteBuffer6 = response1.byteData;
        java.nio.ByteBuffer byteBuffer7 = response1.byteData;
        java.nio.ByteBuffer byteBuffer8 = null;
        response1.byteData = byteBuffer8;
        java.lang.String str10 = response1.charset;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response12 = response1.removeCookie("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(byteBuffer5);
        org.junit.Assert.assertNull(byteBuffer6);
        org.junit.Assert.assertNull(byteBuffer7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Location" + "'", str10, "Location");
    }

    @Test
    public void test08027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08027");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        org.jsoup.Connection.Response response6 = response1.removeCookie("Location");
        response1.statusCode = '#';
        boolean boolean9 = response1.executed;
        java.lang.String str10 = response1.contentType();
        response1.charset = "hi!";
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry14 = response1.scanHeaders("");
        org.jsoup.Connection.Response response17 = response1.cookie("Location", "");
        boolean boolean19 = response1.hasCookie("hi!");
        org.jsoup.Connection.Method method20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response21 = response1.method(method20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(strEntry14);
        org.junit.Assert.assertNotNull(response17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test08028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08028");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        int int8 = response1.numRedirects;
        response1.contentType = "hi!";
        java.nio.ByteBuffer byteBuffer11 = response1.byteData;
        java.nio.ByteBuffer byteBuffer12 = null;
        response1.byteData = byteBuffer12;
        org.jsoup.Connection.Response response16 = response1.header("hi!", "hi!");
        org.jsoup.Connection.Method method17 = response1.method();
        response1.numRedirects = (byte) 0;
        java.util.Map<java.lang.String, java.lang.String> strMap20 = response1.cookies();
        org.jsoup.Connection.Response response22 = response1.removeHeader("hi!");
        org.jsoup.Connection.Request request23 = response1.req;
        java.nio.ByteBuffer byteBuffer24 = response1.byteData;
        java.net.URL uRL25 = response1.url();
        response1.executed = true;
        org.jsoup.helper.HttpConnection.Response response28 = new org.jsoup.helper.HttpConnection.Response(response1);
        boolean boolean29 = response1.executed;
        org.jsoup.Connection.Response response31 = response1.removeHeader("hi!");
        response1.executed = false;
        org.jsoup.Connection.Response response36 = response1.header("hi!", "hi!");
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertNull(method17);
        org.junit.Assert.assertNotNull(strMap20);
        org.junit.Assert.assertNotNull(response22);
        org.junit.Assert.assertNull(request23);
        org.junit.Assert.assertNull(byteBuffer24);
        org.junit.Assert.assertNull(uRL25);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(response31);
        org.junit.Assert.assertNotNull(response36);
    }

    @Test
    public void test08029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08029");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        response1.charset = "";
        java.lang.String str7 = response1.contentType;
        org.jsoup.Connection.Method method8 = response1.method();
        org.jsoup.Connection.Response response11 = response1.cookie("Location", "Location");
        org.jsoup.Connection.Request request12 = null;
        response1.req = request12;
        org.jsoup.Connection.Method method14 = response1.method();
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNull(method14);
    }

    @Test
    public void test08030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08030");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        org.jsoup.Connection.Response response8 = response1.cookie("hi!", "");
        java.lang.String str9 = response1.statusMessage();
        org.jsoup.Connection.Method method10 = response1.method();
        response1.numRedirects = ' ';
        boolean boolean14 = response1.hasHeader("hi!");
        org.jsoup.Connection.Response response16 = response1.removeCookie("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap17 = response1.cookies();
        org.jsoup.Connection.Response response20 = response1.header("Location", "");
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertNotNull(strMap17);
        org.junit.Assert.assertNotNull(response20);
    }

    @Test
    public void test08031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08031");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        response1.executed = false;
        org.jsoup.Connection.Response response11 = response1.header("Location", "");
        int int12 = response1.statusCode();
        org.jsoup.Connection.Request request13 = null;
        response1.req = request13;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = response1.hasHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test08032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08032");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        int int8 = response1.numRedirects;
        response1.contentType = "hi!";
        java.nio.ByteBuffer byteBuffer11 = response1.byteData;
        java.lang.String str12 = response1.contentType;
        java.lang.String str14 = response1.getHeaderCaseInsensitive("hi!");
        org.jsoup.Connection.Request request15 = null;
        response1.req = request15;
        java.nio.ByteBuffer byteBuffer17 = response1.byteData;
        java.nio.ByteBuffer byteBuffer18 = response1.byteData;
        org.jsoup.Connection.Method method19 = response1.method();
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(byteBuffer17);
        org.junit.Assert.assertNull(byteBuffer18);
        org.junit.Assert.assertNull(method19);
    }

    @Test
    public void test08033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08033");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        java.lang.String str8 = response1.contentType();
        java.lang.String str9 = response1.contentType;
        int int10 = response1.statusCode();
        java.nio.ByteBuffer byteBuffer11 = response1.byteData;
        java.lang.String str12 = response1.statusMessage;
        java.lang.String str13 = response1.contentType();
        response1.statusCode = (-1);
        java.nio.ByteBuffer byteBuffer16 = null;
        response1.byteData = byteBuffer16;
        response1.statusMessage = "Location";
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test08034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08034");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        response1.charset = "";
        response1.statusMessage = "";
        java.lang.String str10 = response1.getHeaderCaseInsensitive("");
        boolean boolean13 = response1.hasHeaderWithValue("Location", "");
        response1.executed = false;
        java.net.HttpURLConnection httpURLConnection16 = null;
        org.jsoup.helper.HttpConnection.Response response17 = null;
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response(response17);
        org.jsoup.Connection.Response response21 = response18.header("hi!", "");
        java.lang.String str23 = response18.getHeaderCaseInsensitive("");
        response18.executed = false;
        response18.statusCode = 100;
        boolean boolean29 = response18.hasHeader("Location");
        response18.numRedirects = (-1);
        org.jsoup.Connection.Response response34 = response18.header("Location", "");
        org.jsoup.Connection.Response response36 = response18.removeHeader("hi!");
        response18.numRedirects = (-1);
        // The following exception was thrown during execution in test generation
        try {
            response1.setupFromConnection(httpURLConnection16, (org.jsoup.Connection.Response) response18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(response21);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(response34);
        org.junit.Assert.assertNotNull(response36);
    }

    @Test
    public void test08035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08035");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        int int8 = response1.numRedirects;
        response1.contentType = "hi!";
        java.nio.ByteBuffer byteBuffer11 = response1.byteData;
        java.lang.String str12 = response1.contentType;
        response1.statusCode = (short) 1;
        java.lang.String str15 = response1.statusMessage();
        response1.executed = false;
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.net.HttpURLConnection httpURLConnection19 = null;
        org.jsoup.helper.HttpConnection.Response response20 = null;
        org.jsoup.helper.HttpConnection.Response response21 = new org.jsoup.helper.HttpConnection.Response(response20);
        org.jsoup.Connection.Request request22 = null;
        response21.req = request22;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry25 = response21.scanHeaders("hi!");
        response21.charset = "hi!";
        int int28 = response21.numRedirects;
        response21.contentType = "hi!";
        java.nio.ByteBuffer byteBuffer31 = response21.byteData;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry33 = response21.scanHeaders("");
        java.lang.String str35 = response21.header("Location");
        response21.statusCode = (byte) 100;
        java.lang.String str38 = response21.statusMessage();
        java.util.Map<java.lang.String, java.lang.String> strMap39 = response21.headers();
        java.lang.String str41 = response21.header("hi!");
        int int42 = response21.statusCode;
        java.nio.ByteBuffer byteBuffer43 = null;
        response21.byteData = byteBuffer43;
        // The following exception was thrown during execution in test generation
        try {
            response18.setupFromConnection(httpURLConnection19, (org.jsoup.Connection.Response) response21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(strEntry25);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNull(byteBuffer31);
        org.junit.Assert.assertNull(strEntry33);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNotNull(strMap39);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 100 + "'", int42 == 100);
    }

    @Test
    public void test08036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08036");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        java.lang.String str8 = response1.contentType();
        java.lang.String str9 = response1.contentType;
        int int10 = response1.statusCode();
        java.net.URL uRL11 = response1.url();
        org.jsoup.Connection.Request request12 = null;
        response1.req = request12;
        java.lang.String str14 = response1.charset;
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test08037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08037");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        response1.charset = "";
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry8 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        response1.statusCode = (byte) 0;
        response1.charset = "Location";
        java.nio.ByteBuffer byteBuffer15 = null;
        response1.byteData = byteBuffer15;
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNotNull(strEntry8);
    }

    @Test
    public void test08038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08038");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        java.lang.String str8 = response1.contentType();
        response1.charset = "hi!";
        org.jsoup.Connection.Response response12 = response1.removeHeader("Location");
        java.util.Map<java.lang.String, java.lang.String> strMap13 = response1.headers();
        java.lang.String str14 = response1.charset;
        org.jsoup.Connection.Request request15 = null;
        response1.req = request15;
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test08039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08039");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        org.jsoup.Connection.Request request5 = null;
        response1.req = request5;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry8 = response1.scanHeaders("Location");
        java.lang.String str9 = response1.contentType;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry11 = response1.scanHeaders("hi!");
        org.jsoup.Connection.Request request12 = null;
        response1.req = request12;
        java.net.URL uRL14 = response1.url();
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(strEntry8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(strEntry11);
        org.junit.Assert.assertNull(uRL14);
    }

    @Test
    public void test08040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08040");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        java.lang.String str8 = response1.contentType();
        response1.charset = "hi!";
        org.jsoup.Connection.Response response12 = response1.removeHeader("Location");
        int int13 = response1.statusCode();
        boolean boolean15 = response1.hasCookie("Location");
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test08041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08041");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        response1.executed = false;
        org.jsoup.Connection.Response response11 = response1.header("Location", "");
        int int12 = response1.statusCode;
        java.lang.String str13 = response1.charset();
        java.lang.String str14 = response1.statusMessage();
        org.jsoup.Connection.Request request15 = null;
        response1.req = request15;
        java.lang.String str17 = response1.statusMessage();
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response(response1);
        response1.contentType = "";
        org.jsoup.Connection.Response response22 = response1.removeCookie("hi!");
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(response22);
    }

    @Test
    public void test08042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08042");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        boolean boolean6 = response1.hasCookie("hi!");
        response1.executed = true;
        int int9 = response1.statusCode();
        java.lang.String str10 = response1.statusMessage();
        org.jsoup.Connection.Response response12 = response1.removeHeader("Location");
        org.jsoup.Connection.Response response14 = response1.removeHeader("Location");
        java.lang.String str15 = response1.charset;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response18 = response1.header("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test08043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08043");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        int int8 = response1.numRedirects;
        response1.contentType = "hi!";
        java.nio.ByteBuffer byteBuffer11 = response1.byteData;
        java.nio.ByteBuffer byteBuffer12 = null;
        response1.byteData = byteBuffer12;
        org.jsoup.Connection.Response response16 = response1.header("hi!", "hi!");
        org.jsoup.Connection.Method method17 = response1.method();
        java.lang.String str19 = response1.header("hi!");
        java.lang.String str20 = response1.contentType();
        response1.statusCode = '4';
        boolean boolean23 = response1.executed;
        org.jsoup.Connection.Method method24 = response1.method();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass25 = method24.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertNull(method17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(method24);
    }

    @Test
    public void test08044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08044");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        boolean boolean6 = response1.hasCookie("hi!");
        response1.charset = "Location";
        java.lang.String str9 = response1.contentType;
        org.jsoup.Connection.Request request10 = response1.req;
        response1.charset = "Location";
        java.nio.ByteBuffer byteBuffer13 = response1.byteData;
        java.lang.String str15 = response1.getHeaderCaseInsensitive("hi!");
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response1);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray17 = response1.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(request10);
        org.junit.Assert.assertNull(byteBuffer13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test08045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08045");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        int int8 = response1.numRedirects;
        response1.contentType = "hi!";
        java.nio.ByteBuffer byteBuffer11 = response1.byteData;
        java.nio.ByteBuffer byteBuffer12 = null;
        response1.byteData = byteBuffer12;
        org.jsoup.Connection.Response response16 = response1.header("hi!", "hi!");
        org.jsoup.Connection.Method method17 = response1.method();
        java.lang.String str19 = response1.header("hi!");
        response1.charset = "";
        java.lang.String str22 = response1.contentType;
        java.util.Map<java.lang.String, java.lang.String> strMap23 = response1.cookies();
        java.lang.String str24 = response1.contentType;
        boolean boolean25 = response1.executed;
        org.jsoup.Connection.Response response27 = response1.removeCookie("hi!");
        response1.executed = false;
        org.jsoup.Connection.Request request30 = null;
        response1.req = request30;
        int int32 = response1.numRedirects;
        java.lang.String str33 = response1.contentType();
        java.nio.ByteBuffer byteBuffer34 = response1.byteData;
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertNull(method17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(strMap23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(response27);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertNull(byteBuffer34);
    }

    @Test
    public void test08046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08046");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        org.jsoup.Connection.Request request5 = null;
        response1.req = request5;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry8 = response1.scanHeaders("Location");
        boolean boolean11 = response1.hasHeaderWithValue("hi!", "");
        java.util.Map<java.lang.String, java.lang.String> strMap12 = response1.headers();
        java.nio.ByteBuffer byteBuffer13 = response1.byteData;
        int int14 = response1.numRedirects;
        response1.numRedirects = (short) 0;
        java.lang.String str17 = response1.contentType;
        boolean boolean19 = response1.hasCookie("Location");
        java.nio.ByteBuffer byteBuffer20 = response1.byteData;
        java.net.URL uRL21 = response1.url();
        boolean boolean22 = response1.executed;
        java.net.HttpURLConnection httpURLConnection23 = null;
        org.jsoup.helper.HttpConnection.Response response24 = null;
        org.jsoup.helper.HttpConnection.Response response25 = new org.jsoup.helper.HttpConnection.Response(response24);
        org.jsoup.Connection.Response response28 = response25.header("hi!", "");
        response25.charset = "";
        response25.statusMessage = "";
        java.lang.String str34 = response25.getHeaderCaseInsensitive("");
        boolean boolean35 = response25.executed;
        int int36 = response25.numRedirects;
        java.nio.ByteBuffer byteBuffer37 = response25.byteData;
        java.lang.String str39 = response25.header("");
        response25.numRedirects = (byte) 100;
        java.util.Map<java.lang.String, java.lang.String> strMap42 = response25.headers();
        // The following exception was thrown during execution in test generation
        try {
            response1.setupFromConnection(httpURLConnection23, (org.jsoup.Connection.Response) response25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(strEntry8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertNull(byteBuffer13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(byteBuffer20);
        org.junit.Assert.assertNull(uRL21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(response28);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNull(byteBuffer37);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNotNull(strMap42);
    }

    @Test
    public void test08047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08047");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        org.jsoup.Connection.Response response8 = response1.cookie("hi!", "");
        java.lang.String str9 = response1.statusMessage();
        org.jsoup.Connection.Request request10 = response1.req;
        java.net.URL uRL11 = response1.url();
        java.lang.String str12 = response1.contentType();
        response1.contentType = "hi!";
        java.net.URL uRL15 = response1.url();
        org.jsoup.Connection.Response response17 = response1.removeHeader("hi!");
        org.jsoup.Connection.Response response19 = response1.removeHeader("hi!");
        org.jsoup.Connection.Request request20 = response1.req;
        response1.executed = true;
        java.nio.ByteBuffer byteBuffer23 = null;
        response1.byteData = byteBuffer23;
        org.jsoup.Connection.Request request25 = response1.req;
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(request10);
        org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(uRL15);
        org.junit.Assert.assertNotNull(response17);
        org.junit.Assert.assertNotNull(response19);
        org.junit.Assert.assertNull(request20);
        org.junit.Assert.assertNull(request25);
    }

    @Test
    public void test08048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08048");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        response1.charset = "";
        response1.statusMessage = "";
        java.lang.String str10 = response1.getHeaderCaseInsensitive("");
        boolean boolean11 = response1.executed;
        int int12 = response1.numRedirects;
        response1.charset = "Location";
        response1.charset = "hi!";
        response1.statusCode = (short) -1;
        org.jsoup.Connection.Request request19 = null;
        response1.req = request19;
        java.lang.String str22 = response1.header("hi!");
        org.jsoup.helper.HttpConnection.Response response23 = new org.jsoup.helper.HttpConnection.Response(response1);
        response23.statusMessage = "";
        response23.numRedirects = (short) 0;
        java.lang.String str29 = response23.getHeaderCaseInsensitive("");
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNull(str29);
    }

    @Test
    public void test08049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08049");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        response1.executed = false;
        org.jsoup.Connection.Response response11 = response1.header("Location", "");
        java.lang.String str12 = response1.charset;
        int int13 = response1.statusCode;
        org.jsoup.Connection.Request request14 = response1.req;
        java.lang.String str16 = response1.getHeaderCaseInsensitive("");
        java.lang.String str17 = response1.statusMessage();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response19 = response1.removeCookie("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(request14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test08050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08050");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        response1.executed = false;
        boolean boolean9 = response1.executed;
        int int10 = response1.statusCode();
        java.lang.String str11 = response1.contentType;
        java.lang.String str12 = response1.charset();
        org.jsoup.Connection.Request request13 = null;
        response1.req = request13;
        org.jsoup.Connection.Method method15 = response1.method();
        java.util.Map<java.lang.String, java.lang.String> strMap16 = response1.headers();
        boolean boolean17 = response1.executed;
        response1.statusCode = 1;
        int int20 = response1.statusCode();
        int int21 = response1.numRedirects;
        org.jsoup.Connection.Method method22 = response1.method();
        org.jsoup.Connection.Response response25 = response1.cookie("Location", "Location");
        int int26 = response1.statusCode;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean28 = response1.hasCookie("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNull(method22);
        org.junit.Assert.assertNotNull(response25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
    }

    @Test
    public void test08051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08051");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        java.lang.String str8 = response1.contentType();
        java.lang.String str9 = response1.contentType;
        int int10 = response1.statusCode();
        java.nio.ByteBuffer byteBuffer11 = response1.byteData;
        response1.statusCode = (byte) 10;
        java.lang.String str15 = response1.getHeaderCaseInsensitive("");
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test08052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08052");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.charset = "Location";
        java.lang.String str4 = response1.contentType;
        response1.executed = false;
        java.nio.ByteBuffer byteBuffer7 = response1.byteData;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(byteBuffer7);
    }

    @Test
    public void test08053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08053");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        response1.executed = false;
        response1.numRedirects = '4';
        response1.statusCode = (byte) -1;
        org.jsoup.Connection.Response response14 = response1.removeHeader("hi!");
        response1.statusCode = '#';
        java.lang.String str17 = response1.statusMessage;
        java.net.URL uRL18 = response1.url();
        org.jsoup.Connection.Request request19 = null;
        response1.req = request19;
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(uRL18);
    }

    @Test
    public void test08054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08054");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Request request3 = null;
        response2.req = request3;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry6 = response2.scanHeaders("hi!");
        response2.charset = "hi!";
        int int9 = response2.numRedirects;
        response2.contentType = "hi!";
        java.nio.ByteBuffer byteBuffer12 = response2.byteData;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry14 = response2.scanHeaders("");
        java.lang.String str16 = response2.header("Location");
        java.lang.String str17 = response2.statusMessage;
        java.net.URL uRL18 = response2.url();
        java.util.Map<java.lang.String, java.lang.String> strMap19 = response2.headers();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry21 = response2.scanHeaders("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap22 = response2.cookies();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response23 = org.jsoup.helper.HttpConnection.Response.execute(request0, response2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(byteBuffer12);
        org.junit.Assert.assertNull(strEntry14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(uRL18);
        org.junit.Assert.assertNotNull(strMap19);
        org.junit.Assert.assertNull(strEntry21);
        org.junit.Assert.assertNotNull(strMap22);
    }

    @Test
    public void test08055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08055");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        org.jsoup.Connection.Request request5 = null;
        response1.req = request5;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry8 = response1.scanHeaders("Location");
        java.lang.String str9 = response1.contentType;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry11 = response1.scanHeaders("hi!");
        org.jsoup.Connection.Request request12 = null;
        response1.req = request12;
        response1.contentType = "hi!";
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(strEntry8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(strEntry11);
    }

    @Test
    public void test08056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08056");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        response1.executed = false;
        org.jsoup.Connection.Response response11 = response1.header("Location", "");
        int int12 = response1.statusCode;
        java.lang.String str13 = response1.charset();
        java.util.Map<java.lang.String, java.lang.String> strMap14 = response1.headers();
        java.lang.String str15 = response1.contentType();
        java.lang.String str16 = response1.contentType;
        java.lang.String str17 = response1.charset;
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response(response1);
        int int19 = response18.statusCode;
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray20 = response18.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test08057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08057");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        response1.executed = false;
        response1.numRedirects = '4';
        boolean boolean13 = response1.hasHeaderWithValue("Location", "Location");
        org.jsoup.Connection.Method method14 = response1.method();
        java.lang.String str16 = response1.header("hi!");
        int int17 = response1.statusCode;
        java.util.Map<java.lang.String, java.lang.String> strMap18 = response1.headers();
        java.lang.String str19 = response1.charset();
        boolean boolean22 = response1.hasHeaderWithValue("hi!", "Location");
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(method14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(strMap18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test08058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08058");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        int int8 = response1.numRedirects;
        response1.contentType = "hi!";
        java.nio.ByteBuffer byteBuffer11 = response1.byteData;
        java.lang.String str12 = response1.contentType;
        response1.contentType = "Location";
        int int15 = response1.statusCode();
        response1.statusCode = 'a';
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test08059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08059");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        org.jsoup.Connection.Response response8 = response1.cookie("hi!", "");
        java.lang.String str9 = response1.statusMessage();
        org.jsoup.Connection.Request request10 = response1.req;
        java.net.URL uRL11 = response1.url();
        java.lang.String str12 = response1.contentType();
        java.lang.String str13 = response1.charset;
        java.lang.String str14 = response1.charset();
        response1.executed = false;
        java.lang.String str18 = response1.header("");
        java.net.URL uRL19 = response1.url();
        response1.statusCode = 100;
        java.net.URL uRL22 = response1.url();
        org.jsoup.Connection.Response response25 = response1.header("hi!", "hi!");
        int int26 = response1.statusCode();
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(request10);
        org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(uRL19);
        org.junit.Assert.assertNull(uRL22);
        org.junit.Assert.assertNotNull(response25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 100 + "'", int26 == 100);
    }

    @Test
    public void test08060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08060");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        int int8 = response1.numRedirects;
        int int9 = response1.statusCode();
        java.lang.String str10 = response1.charset;
        boolean boolean12 = response1.hasHeader("Location");
        java.lang.String str13 = response1.charset();
        int int14 = response1.numRedirects;
        java.net.URL uRL15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response16 = response1.url(uRL15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test08061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08061");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.numRedirects = (byte) -1;
        java.lang.String str4 = response1.statusMessage;
        response1.contentType = "hi!";
        response1.numRedirects = 10;
        java.nio.ByteBuffer byteBuffer9 = null;
        response1.byteData = byteBuffer9;
        org.jsoup.Connection.Request request11 = response1.req;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry13 = response1.scanHeaders("");
        int int14 = response1.statusCode();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(request11);
        org.junit.Assert.assertNull(strEntry13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test08062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08062");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        response1.executed = false;
        boolean boolean9 = response1.executed;
        int int10 = response1.statusCode();
        response1.executed = false;
        org.jsoup.Connection.Request request13 = response1.req;
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str16 = response1.header("hi!");
        java.nio.ByteBuffer byteBuffer17 = null;
        response1.byteData = byteBuffer17;
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(request13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test08063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08063");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        response1.charset = "";
        response1.statusMessage = "";
        java.lang.String str10 = response1.header("");
        int int11 = response1.statusCode;
        java.lang.String str12 = response1.contentType;
        java.nio.ByteBuffer byteBuffer13 = null;
        response1.byteData = byteBuffer13;
        boolean boolean16 = response1.hasHeader("Location");
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.net.URL uRL18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response19 = response1.url(uRL18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test08064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08064");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        org.jsoup.Connection.Response response8 = response1.cookie("hi!", "");
        java.lang.String str9 = response1.statusMessage();
        org.jsoup.Connection.Method method10 = response1.method();
        org.jsoup.Connection.Response response12 = response1.removeCookie("Location");
        java.lang.String str13 = response1.statusMessage;
        int int14 = response1.statusCode();
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test08065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08065");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        java.lang.String str8 = response1.cookie("hi!");
        java.lang.String str10 = response1.header("");
        org.jsoup.Connection.Response response12 = response1.removeHeader("hi!");
        response1.numRedirects = 0;
        java.lang.String str16 = response1.header("Location");
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str18 = response17.charset;
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test08066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08066");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        response1.charset = "";
        response1.statusMessage = "";
        java.lang.String str10 = response1.header("");
        int int11 = response1.statusCode;
        java.lang.String str12 = response1.contentType;
        response1.statusMessage = "Location";
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test08067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08067");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        java.lang.String str7 = response1.contentType();
        int int8 = response1.numRedirects;
        int int9 = response1.statusCode();
        java.lang.String str11 = response1.cookie("Location");
        java.lang.String str13 = response1.header("");
        org.jsoup.Connection.Method method14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response15 = response1.method(method14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test08068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08068");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        response1.charset = "";
        response1.statusMessage = "";
        java.lang.String str10 = response1.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response13 = response1.cookie("Location", "hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap14 = response1.cookies();
        java.net.URL uRL15 = response1.url();
        java.lang.String str16 = response1.charset;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry18 = response1.scanHeaders("Location");
        org.jsoup.Connection.Response response20 = response1.removeCookie("hi!");
        java.lang.String str21 = response1.contentType;
        java.net.HttpURLConnection httpURLConnection22 = null;
        org.jsoup.Connection.Response response23 = null;
        // The following exception was thrown during execution in test generation
        try {
            response1.setupFromConnection(httpURLConnection22, response23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNull(uRL15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(strEntry18);
        org.junit.Assert.assertNotNull(response20);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test08069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08069");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        java.lang.String str8 = response1.contentType();
        java.lang.String str9 = response1.contentType;
        boolean boolean11 = response1.hasHeader("hi!");
        java.net.URL uRL12 = response1.url();
        boolean boolean14 = response1.hasCookie("Location");
        int int15 = response1.numRedirects;
        response1.contentType = "hi!";
        java.lang.String str18 = response1.contentType();
        java.lang.String str19 = response1.contentType;
        org.jsoup.Connection.Response response22 = response1.cookie("Location", "Location");
        java.lang.String str24 = response1.getHeaderCaseInsensitive("Location");
        org.jsoup.Connection.Request request25 = response1.req;
        boolean boolean26 = response1.executed;
        boolean boolean29 = response1.hasHeaderWithValue("hi!", "");
        java.lang.String str30 = response1.statusMessage();
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(uRL12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(response22);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(request25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(str30);
    }

    @Test
    public void test08070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08070");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        org.jsoup.Connection.Request request5 = null;
        response1.req = request5;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry8 = response1.scanHeaders("Location");
        boolean boolean11 = response1.hasHeaderWithValue("hi!", "");
        response1.statusCode = (short) -1;
        java.net.URL uRL14 = response1.url();
        java.lang.String str15 = response1.contentType;
        int int16 = response1.statusCode;
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.nio.ByteBuffer byteBuffer18 = null;
        response1.byteData = byteBuffer18;
        response1.statusCode = '4';
        java.lang.String str22 = response1.statusMessage();
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(strEntry8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(uRL14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test08071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08071");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        int int8 = response1.numRedirects;
        response1.contentType = "hi!";
        java.nio.ByteBuffer byteBuffer11 = response1.byteData;
        java.nio.ByteBuffer byteBuffer12 = null;
        response1.byteData = byteBuffer12;
        org.jsoup.Connection.Response response16 = response1.header("hi!", "hi!");
        org.jsoup.Connection.Method method17 = response1.method();
        java.lang.String str19 = response1.header("hi!");
        java.lang.String str20 = response1.contentType();
        java.nio.ByteBuffer byteBuffer21 = response1.byteData;
        java.nio.ByteBuffer byteBuffer22 = null;
        response1.byteData = byteBuffer22;
        org.jsoup.Connection.Response response25 = response1.removeHeader("Location");
        java.lang.String str26 = response1.statusMessage;
        java.lang.String str27 = response1.statusMessage;
        java.net.URL uRL28 = response1.url();
        java.lang.String str30 = response1.header("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str31 = response1.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertNull(method17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNull(byteBuffer21);
        org.junit.Assert.assertNotNull(response25);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(uRL28);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
    }

    @Test
    public void test08072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08072");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        org.jsoup.Connection.Request request5 = null;
        response1.req = request5;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry8 = response1.scanHeaders("Location");
        java.lang.String str9 = response1.contentType;
        java.util.Map<java.lang.String, java.lang.String> strMap10 = response1.headers();
        response1.statusMessage = "hi!";
        int int13 = response1.statusCode;
        java.lang.String str14 = response1.charset();
        response1.contentType = "Location";
        org.jsoup.Connection.Response response19 = response1.header("hi!", "hi!");
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(strEntry8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(response19);
    }

    @Test
    public void test08073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08073");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        org.jsoup.Connection.Response response8 = response1.cookie("hi!", "");
        org.jsoup.Connection.Response response11 = response1.cookie("Location", "");
        boolean boolean14 = response1.hasHeaderWithValue("hi!", "");
        org.jsoup.Connection.Response response16 = response1.removeCookie("Location");
        response1.statusMessage = "";
        org.jsoup.Connection.Response response20 = response1.removeCookie("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap21 = response1.cookies();
        response1.charset = "Location";
        response1.contentType = "Location";
        java.lang.String str26 = response1.contentType;
        org.jsoup.Connection.Request request27 = response1.req;
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertNotNull(response20);
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Location" + "'", str26, "Location");
        org.junit.Assert.assertNull(request27);
    }

    @Test
    public void test08074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08074");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        int int8 = response1.numRedirects;
        response1.contentType = "hi!";
        java.nio.ByteBuffer byteBuffer11 = response1.byteData;
        java.lang.String str12 = response1.charset;
        org.jsoup.Connection.Response response14 = response1.removeCookie("Location");
        org.jsoup.Connection.Method method15 = response1.method();
        org.jsoup.Connection.Request request16 = null;
        response1.req = request16;
        org.jsoup.Connection.Request request18 = response1.req;
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertNull(request18);
    }

    @Test
    public void test08075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08075");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        int int8 = response1.numRedirects;
        response1.contentType = "hi!";
        java.nio.ByteBuffer byteBuffer11 = response1.byteData;
        java.lang.String str12 = response1.contentType;
        org.jsoup.Connection.Response response15 = response1.cookie("Location", "Location");
        int int16 = response1.numRedirects;
        int int17 = response1.numRedirects;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry19 = response1.scanHeaders("");
        java.nio.ByteBuffer byteBuffer20 = null;
        response1.byteData = byteBuffer20;
        java.util.Map<java.lang.String, java.lang.String> strMap22 = response1.cookies();
        boolean boolean23 = response1.executed;
        java.lang.String str25 = response1.cookie("hi!");
        org.jsoup.Connection.Request request26 = null;
        response1.req = request26;
        boolean boolean29 = response1.hasHeader("Location");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry31 = response1.scanHeaders("");
        java.lang.Class<?> wildcardClass32 = response1.getClass();
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(strEntry19);
        org.junit.Assert.assertNotNull(strMap22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(strEntry31);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test08076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08076");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        java.lang.String str8 = response1.contentType();
        java.lang.String str9 = response1.contentType;
        int int10 = response1.statusCode();
        java.nio.ByteBuffer byteBuffer11 = response1.byteData;
        org.jsoup.Connection.Request request12 = null;
        response1.req = request12;
        boolean boolean16 = response1.hasHeaderWithValue("Location", "Location");
        boolean boolean18 = response1.hasHeader("Location");
        java.lang.String str19 = response1.statusMessage();
        int int20 = response1.numRedirects;
        org.jsoup.Connection.Method method21 = response1.method();
        response1.contentType = "Location";
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNull(method21);
    }

    @Test
    public void test08077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08077");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        java.lang.String str7 = response1.contentType();
        int int8 = response1.numRedirects;
        response1.statusCode = (short) 0;
        java.util.Map<java.lang.String, java.lang.String> strMap11 = response1.cookies();
        java.util.Map<java.lang.String, java.lang.String> strMap12 = response1.headers();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response14 = response1.removeCookie("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNotNull(strMap12);
    }

    @Test
    public void test08078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08078");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        java.lang.String str8 = response1.contentType();
        java.lang.String str9 = response1.contentType;
        boolean boolean11 = response1.hasHeader("hi!");
        java.net.URL uRL12 = response1.url();
        boolean boolean14 = response1.hasCookie("Location");
        org.jsoup.Connection.Response response17 = response1.header("hi!", "");
        java.lang.String str18 = response1.charset;
        java.lang.String str20 = response1.getHeaderCaseInsensitive("hi!");
        org.jsoup.Connection.Method method21 = response1.method();
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(uRL12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(response17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNull(method21);
    }

    @Test
    public void test08079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08079");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        org.jsoup.Connection.Response response8 = response1.cookie("hi!", "");
        java.net.URL uRL9 = response1.url();
        java.nio.ByteBuffer byteBuffer10 = null;
        response1.byteData = byteBuffer10;
        java.lang.String str12 = response1.charset();
        response1.executed = true;
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test08080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08080");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        org.jsoup.Connection.Response response8 = response1.cookie("hi!", "");
        boolean boolean9 = response1.executed;
        java.lang.String str10 = response1.contentType;
        int int11 = response1.statusCode();
        java.net.URL uRL12 = response1.url();
        response1.statusCode = 52;
        java.net.URL uRL15 = response1.url();
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray16 = response1.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(uRL12);
        org.junit.Assert.assertNull(uRL15);
    }

    @Test
    public void test08081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08081");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        response1.charset = "";
        response1.statusMessage = "";
        java.lang.String str10 = response1.header("");
        int int11 = response1.statusCode;
        java.lang.String str12 = response1.contentType;
        java.lang.String str14 = response1.header("Location");
        int int15 = response1.numRedirects;
        response1.statusCode = 10;
        org.jsoup.Connection.Response response20 = response1.header("hi!", "Location");
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(response20);
    }

    @Test
    public void test08082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08082");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        int int8 = response1.numRedirects;
        response1.contentType = "hi!";
        java.nio.ByteBuffer byteBuffer11 = response1.byteData;
        java.lang.String str12 = response1.contentType;
        org.jsoup.Connection.Response response15 = response1.cookie("Location", "Location");
        int int16 = response1.numRedirects;
        int int17 = response1.numRedirects;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry19 = response1.scanHeaders("");
        java.nio.ByteBuffer byteBuffer20 = null;
        response1.byteData = byteBuffer20;
        java.util.Map<java.lang.String, java.lang.String> strMap22 = response1.cookies();
        java.nio.ByteBuffer byteBuffer23 = response1.byteData;
        java.net.URL uRL24 = response1.url();
        response1.charset = "";
        java.lang.String str27 = response1.contentType;
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(strEntry19);
        org.junit.Assert.assertNotNull(strMap22);
        org.junit.Assert.assertNull(byteBuffer23);
        org.junit.Assert.assertNull(uRL24);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
    }

    @Test
    public void test08083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08083");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        org.jsoup.Connection.Response response8 = response1.cookie("hi!", "");
        java.lang.String str9 = response1.statusMessage();
        org.jsoup.Connection.Request request10 = response1.req;
        java.net.URL uRL11 = response1.url();
        java.lang.String str12 = response1.contentType();
        boolean boolean14 = response1.hasHeader("Location");
        int int15 = response1.numRedirects;
        boolean boolean16 = response1.executed;
        org.jsoup.Connection.Method method17 = response1.method();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry19 = response1.scanHeaders("");
        response1.statusCode = 1;
        org.jsoup.Connection.Response response24 = response1.header("hi!", "hi!");
        java.nio.ByteBuffer byteBuffer25 = response1.byteData;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response27 = response1.removeHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(request10);
        org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(method17);
        org.junit.Assert.assertNull(strEntry19);
        org.junit.Assert.assertNotNull(response24);
        org.junit.Assert.assertNull(byteBuffer25);
    }

    @Test
    public void test08084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08084");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        java.lang.String str8 = response1.contentType();
        java.lang.String str9 = response1.contentType;
        boolean boolean11 = response1.hasHeader("hi!");
        java.net.URL uRL12 = response1.url();
        boolean boolean14 = response1.hasCookie("Location");
        int int15 = response1.numRedirects;
        response1.contentType = "hi!";
        org.jsoup.Connection.Request request18 = null;
        response1.req = request18;
        java.nio.ByteBuffer byteBuffer20 = response1.byteData;
        org.jsoup.helper.HttpConnection.Response response21 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.nio.ByteBuffer byteBuffer22 = response21.byteData;
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray23 = response21.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(uRL12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(byteBuffer20);
        org.junit.Assert.assertNull(byteBuffer22);
    }

    @Test
    public void test08085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08085");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        response1.charset = "";
        response1.statusMessage = "";
        java.lang.String str10 = response1.header("");
        java.lang.String str11 = response1.statusMessage();
        java.nio.ByteBuffer byteBuffer12 = null;
        response1.byteData = byteBuffer12;
        java.lang.String str14 = response1.charset();
        java.lang.String str16 = response1.cookie("Location");
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test08086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08086");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        org.jsoup.Connection.Response response8 = response1.cookie("hi!", "");
        java.net.URL uRL9 = response1.url();
        java.nio.ByteBuffer byteBuffer10 = null;
        response1.byteData = byteBuffer10;
        java.lang.String str13 = response1.header("Location");
        java.lang.String str14 = response1.charset();
        boolean boolean15 = response1.executed;
        org.jsoup.Connection.Method method16 = response1.method();
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response1);
        int int18 = response1.statusCode();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document19 = response1.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(method16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test08087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08087");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        org.jsoup.Connection.Response response8 = response1.cookie("hi!", "");
        java.lang.String str9 = response1.statusMessage();
        org.jsoup.Connection.Request request10 = response1.req;
        java.net.URL uRL11 = response1.url();
        java.lang.String str12 = response1.contentType();
        response1.contentType = "hi!";
        java.net.URL uRL15 = response1.url();
        boolean boolean17 = response1.hasHeader("hi!");
        java.lang.String str18 = response1.charset;
        java.util.Map<java.lang.String, java.lang.String> strMap19 = response1.headers();
        int int20 = response1.numRedirects;
        org.jsoup.Connection.Request request21 = response1.req;
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray22 = response1.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(request10);
        org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(uRL15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(strMap19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNull(request21);
    }

    @Test
    public void test08088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08088");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.nio.ByteBuffer byteBuffer2 = null;
        response1.byteData = byteBuffer2;
        java.nio.ByteBuffer byteBuffer4 = response1.byteData;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry6 = response1.scanHeaders("");
        int int7 = response1.statusCode();
        java.lang.String str8 = response1.contentType;
        int int9 = response1.numRedirects;
        java.util.Map<java.lang.String, java.lang.String> strMap10 = response1.headers();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response13 = response1.header("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(byteBuffer4);
        org.junit.Assert.assertNull(strEntry6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(strMap10);
    }

    @Test
    public void test08089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08089");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        response1.executed = false;
        boolean boolean9 = response1.executed;
        int int10 = response1.statusCode();
        java.lang.String str11 = response1.contentType;
        java.lang.String str12 = response1.charset();
        org.jsoup.Connection.Request request13 = null;
        response1.req = request13;
        java.lang.String str15 = response1.contentType();
        java.lang.String str16 = response1.contentType;
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response1);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document18 = response1.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test08090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08090");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        org.jsoup.Connection.Response response8 = response1.cookie("hi!", "");
        java.lang.String str9 = response1.statusMessage();
        org.jsoup.Connection.Method method10 = response1.method();
        java.lang.String str11 = response1.charset;
        response1.numRedirects = 32;
        int int14 = response1.statusCode;
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test08091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08091");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Request request3 = null;
        response2.req = request3;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry6 = response2.scanHeaders("hi!");
        response2.charset = "hi!";
        boolean boolean10 = response2.hasCookie("hi!");
        response2.statusCode = 1;
        java.util.Map<java.lang.String, java.lang.String> strMap13 = response2.cookies();
        org.jsoup.Connection.Request request14 = null;
        response2.req = request14;
        java.lang.String str16 = response2.statusMessage();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response17 = org.jsoup.helper.HttpConnection.Response.execute(request0, response2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test08092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08092");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        org.jsoup.Connection.Request request4 = null;
        response1.req = request4;
        java.net.URL uRL6 = response1.url();
        org.jsoup.Connection.Request request7 = response1.req;
        java.lang.String str9 = response1.cookie("Location");
        java.lang.String str10 = response1.contentType;
        java.lang.String str11 = response1.contentType();
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(request7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test08093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08093");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        org.jsoup.Connection.Request request4 = null;
        response1.req = request4;
        java.lang.String str6 = response1.charset;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry8 = response1.scanHeaders("");
        java.nio.ByteBuffer byteBuffer9 = response1.byteData;
        java.lang.String str10 = response1.contentType;
        org.jsoup.Connection.Request request11 = response1.req;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry13 = response1.scanHeaders("hi!");
        java.lang.Class<?> wildcardClass14 = response1.getClass();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(strEntry8);
        org.junit.Assert.assertNull(byteBuffer9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(request11);
        org.junit.Assert.assertNull(strEntry13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test08094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08094");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        response1.executed = false;
        org.jsoup.Connection.Response response11 = response1.header("Location", "");
        java.lang.String str12 = response1.charset;
        java.lang.String str13 = response1.charset();
        int int14 = response1.statusCode();
        org.jsoup.Connection.Response response16 = response1.removeHeader("Location");
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(response16);
    }

    @Test
    public void test08095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08095");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        response1.executed = false;
        org.jsoup.Connection.Response response11 = response1.header("Location", "");
        response1.statusMessage = "";
        org.jsoup.Connection.Response response15 = response1.removeHeader("hi!");
        java.nio.ByteBuffer byteBuffer16 = response1.byteData;
        response1.executed = false;
        int int19 = response1.statusCode;
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertNull(byteBuffer16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test08096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08096");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        org.jsoup.Connection.Request request5 = null;
        response1.req = request5;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry8 = response1.scanHeaders("Location");
        boolean boolean11 = response1.hasHeaderWithValue("hi!", "");
        java.util.Map<java.lang.String, java.lang.String> strMap12 = response1.headers();
        response1.statusCode = 0;
        int int15 = response1.numRedirects;
        response1.numRedirects = 32;
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(strEntry8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test08097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08097");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        int int8 = response1.numRedirects;
        response1.contentType = "hi!";
        java.nio.ByteBuffer byteBuffer11 = response1.byteData;
        java.nio.ByteBuffer byteBuffer12 = null;
        response1.byteData = byteBuffer12;
        org.jsoup.Connection.Response response16 = response1.header("hi!", "hi!");
        org.jsoup.Connection.Method method17 = response1.method();
        java.lang.String str19 = response1.header("hi!");
        java.lang.String str20 = response1.contentType();
        java.nio.ByteBuffer byteBuffer21 = response1.byteData;
        java.nio.ByteBuffer byteBuffer22 = null;
        response1.byteData = byteBuffer22;
        response1.statusCode = (short) 100;
        response1.executed = true;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response30 = response1.cookie("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertNull(method17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNull(byteBuffer21);
    }

    @Test
    public void test08098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08098");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        int int8 = response1.numRedirects;
        response1.contentType = "hi!";
        java.nio.ByteBuffer byteBuffer11 = response1.byteData;
        java.lang.String str12 = response1.contentType;
        java.lang.String str14 = response1.getHeaderCaseInsensitive("hi!");
        org.jsoup.Connection.Request request15 = null;
        response1.req = request15;
        java.lang.String str18 = response1.header("hi!");
        response1.statusCode = (short) 100;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = response1.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test08099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08099");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        response1.charset = "";
        response1.statusMessage = "";
        response1.statusMessage = "Location";
        java.util.Map<java.lang.String, java.lang.String> strMap11 = response1.cookies();
        org.jsoup.Connection.Request request12 = response1.req;
        response1.statusMessage = "hi!";
        response1.numRedirects = 2;
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNull(request12);
    }

    @Test
    public void test08100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08100");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.nio.ByteBuffer byteBuffer2 = null;
        response1.byteData = byteBuffer2;
        java.nio.ByteBuffer byteBuffer4 = response1.byteData;
        java.lang.String str5 = response1.charset;
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Response response8 = response1.removeHeader("Location");
        java.net.URL uRL9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response10 = response1.url(uRL9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(byteBuffer4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(response8);
    }

    @Test
    public void test08101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08101");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        int int8 = response1.numRedirects;
        response1.contentType = "hi!";
        java.nio.ByteBuffer byteBuffer11 = response1.byteData;
        java.lang.String str12 = response1.contentType;
        org.jsoup.Connection.Response response15 = response1.cookie("Location", "Location");
        int int16 = response1.numRedirects;
        int int17 = response1.numRedirects;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry19 = response1.scanHeaders("");
        java.nio.ByteBuffer byteBuffer20 = null;
        response1.byteData = byteBuffer20;
        org.jsoup.Connection.Response response23 = response1.removeCookie("Location");
        response1.statusMessage = "hi!";
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response27 = response1.removeHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(strEntry19);
        org.junit.Assert.assertNotNull(response23);
    }

    @Test
    public void test08102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08102");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        int int8 = response1.numRedirects;
        response1.contentType = "hi!";
        java.nio.ByteBuffer byteBuffer11 = response1.byteData;
        java.nio.ByteBuffer byteBuffer12 = null;
        response1.byteData = byteBuffer12;
        org.jsoup.Connection.Response response16 = response1.header("hi!", "hi!");
        org.jsoup.Connection.Method method17 = response1.method();
        boolean boolean19 = response1.hasHeader("hi!");
        response1.numRedirects = (short) 1;
        java.util.Map<java.lang.String, java.lang.String> strMap22 = response1.cookies();
        int int23 = response1.statusCode;
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertNull(method17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(strMap22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test08103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08103");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        org.jsoup.Connection.Request request8 = response1.req;
        org.jsoup.Connection.Method method9 = response1.method();
        java.net.URL uRL10 = response1.url();
        java.util.Map<java.lang.String, java.lang.String> strMap11 = response1.headers();
        response1.executed = true;
        java.lang.String str15 = response1.cookie("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document16 = response1.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNull(request8);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertNull(uRL10);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test08104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08104");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        int int8 = response1.numRedirects;
        response1.contentType = "hi!";
        java.nio.ByteBuffer byteBuffer11 = response1.byteData;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry13 = response1.scanHeaders("");
        java.lang.String str14 = response1.contentType;
        java.util.Map<java.lang.String, java.lang.String> strMap15 = response1.cookies();
        org.jsoup.Connection.Request request16 = null;
        response1.req = request16;
        java.nio.ByteBuffer byteBuffer18 = null;
        response1.byteData = byteBuffer18;
        java.lang.String str20 = response1.contentType();
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertNull(strEntry13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test08105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08105");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        response1.charset = "";
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry8 = response1.scanHeaders("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap9 = response1.cookies();
        java.nio.ByteBuffer byteBuffer10 = response1.byteData;
        java.nio.ByteBuffer byteBuffer11 = null;
        response1.byteData = byteBuffer11;
        java.lang.String str13 = response1.charset();
        java.nio.ByteBuffer byteBuffer14 = null;
        response1.byteData = byteBuffer14;
        org.jsoup.Connection.Request request16 = response1.req;
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str19 = response17.getHeaderCaseInsensitive("");
        response17.executed = false;
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNotNull(strEntry8);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNull(byteBuffer10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(request16);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test08106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08106");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        java.lang.String str8 = response1.contentType();
        int int9 = response1.statusCode;
        int int10 = response1.statusCode;
        java.lang.String str12 = response1.header("");
        boolean boolean14 = response1.hasCookie("Location");
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test08107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08107");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        int int8 = response1.numRedirects;
        response1.contentType = "hi!";
        java.nio.ByteBuffer byteBuffer11 = response1.byteData;
        java.lang.String str12 = response1.contentType;
        java.lang.String str14 = response1.getHeaderCaseInsensitive("hi!");
        org.jsoup.Connection.Request request15 = null;
        response1.req = request15;
        java.lang.String str18 = response1.header("hi!");
        java.lang.String str19 = response1.charset();
        org.jsoup.Connection.Request request20 = null;
        response1.req = request20;
        int int22 = response1.statusCode;
        org.jsoup.Connection.Request request23 = null;
        response1.req = request23;
        int int25 = response1.statusCode();
        java.lang.String str26 = response1.statusMessage();
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNull(str26);
    }

    @Test
    public void test08108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08108");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        java.lang.String str8 = response1.contentType();
        response1.charset = "hi!";
        int int11 = response1.numRedirects;
        java.lang.String str13 = response1.getHeaderCaseInsensitive("");
        java.lang.String str15 = response1.getHeaderCaseInsensitive("hi!");
        java.lang.String str17 = response1.getHeaderCaseInsensitive("hi!");
        java.nio.ByteBuffer byteBuffer18 = response1.byteData;
        java.lang.Class<?> wildcardClass19 = response1.getClass();
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(byteBuffer18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test08109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08109");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        org.jsoup.Connection.Response response8 = response1.cookie("hi!", "");
        org.jsoup.Connection.Response response11 = response1.cookie("Location", "");
        boolean boolean14 = response1.hasHeaderWithValue("hi!", "");
        java.lang.String str15 = response1.contentType;
        java.util.Map<java.lang.String, java.lang.String> strMap16 = response1.headers();
        org.jsoup.Connection.Request request17 = null;
        response1.req = request17;
        java.lang.String str19 = response1.contentType;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = response1.hasCookie("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test08110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08110");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        response1.charset = "";
        response1.statusMessage = "";
        java.lang.String str10 = response1.getHeaderCaseInsensitive("");
        boolean boolean13 = response1.hasHeaderWithValue("Location", "");
        int int14 = response1.statusCode();
        java.nio.ByteBuffer byteBuffer15 = null;
        response1.byteData = byteBuffer15;
        java.util.Map<java.lang.String, java.lang.String> strMap17 = response1.cookies();
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(strMap17);
    }

    @Test
    public void test08111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08111");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        org.jsoup.Connection.Response response8 = response1.cookie("hi!", "");
        java.lang.String str9 = response1.statusMessage();
        org.jsoup.Connection.Request request10 = response1.req;
        java.net.URL uRL11 = response1.url();
        java.lang.String str12 = response1.contentType();
        response1.contentType = "hi!";
        java.net.URL uRL15 = response1.url();
        org.jsoup.Connection.Response response17 = response1.removeHeader("hi!");
        org.jsoup.Connection.Response response19 = response1.removeHeader("hi!");
        java.lang.String str20 = response1.contentType();
        org.jsoup.Connection.Method method21 = response1.method();
        java.lang.String str22 = response1.contentType;
        java.lang.String str23 = response1.contentType();
        java.lang.String str25 = response1.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Request request26 = null;
        response1.req = request26;
        java.lang.Class<?> wildcardClass28 = response1.getClass();
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(request10);
        org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(uRL15);
        org.junit.Assert.assertNotNull(response17);
        org.junit.Assert.assertNotNull(response19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNull(method21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test08112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08112");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        int int8 = response1.numRedirects;
        response1.contentType = "hi!";
        java.nio.ByteBuffer byteBuffer11 = response1.byteData;
        java.nio.ByteBuffer byteBuffer12 = null;
        response1.byteData = byteBuffer12;
        java.lang.String str15 = response1.header("Location");
        java.lang.String str17 = response1.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Request request18 = null;
        response1.req = request18;
        boolean boolean22 = response1.hasHeaderWithValue("Location", "");
        boolean boolean23 = response1.executed;
        int int24 = response1.statusCode();
        org.jsoup.helper.HttpConnection.Response response25 = new org.jsoup.helper.HttpConnection.Response(response1);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response27 = response25.removeHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test08113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08113");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.net.URL uRL5 = response1.url();
        boolean boolean7 = response1.hasCookie("hi!");
        org.jsoup.Connection.Request request8 = null;
        response1.req = request8;
        java.nio.ByteBuffer byteBuffer10 = response1.byteData;
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(uRL5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(byteBuffer10);
    }

    @Test
    public void test08114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08114");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        java.lang.String str6 = response1.charset();
        java.nio.ByteBuffer byteBuffer7 = null;
        response1.byteData = byteBuffer7;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response11 = response1.header("", "Location");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test08115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08115");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        response1.executed = false;
        org.jsoup.Connection.Response response11 = response1.header("Location", "");
        int int12 = response1.statusCode;
        java.lang.String str13 = response1.charset();
        java.util.Map<java.lang.String, java.lang.String> strMap14 = response1.headers();
        java.lang.String str15 = response1.contentType();
        java.lang.String str16 = response1.contentType;
        java.lang.String str17 = response1.charset;
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.nio.ByteBuffer byteBuffer19 = response1.byteData;
        boolean boolean21 = response1.hasCookie("Location");
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(byteBuffer19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test08116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08116");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        response1.executed = false;
        java.lang.String str9 = response1.charset;
        int int10 = response1.statusCode();
        java.lang.String str12 = response1.header("Location");
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = response1.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test08117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08117");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Request request3 = null;
        response2.req = request3;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry6 = response2.scanHeaders("hi!");
        response2.charset = "hi!";
        java.lang.String str9 = response2.contentType();
        response2.charset = "hi!";
        org.jsoup.Connection.Response response13 = response2.removeHeader("Location");
        org.jsoup.Connection.Response response16 = response2.cookie("Location", "hi!");
        response2.contentType = "";
        int int19 = response2.numRedirects;
        response2.statusMessage = "Location";
        response2.statusCode = (short) 1;
        java.net.URL uRL24 = response2.url();
        java.lang.String str26 = response2.header("hi!");
        org.jsoup.Connection.Method method27 = response2.method();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response28 = org.jsoup.helper.HttpConnection.Response.execute(request0, response2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNull(uRL24);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(method27);
    }

    @Test
    public void test08118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08118");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        java.lang.String str7 = response1.contentType();
        java.lang.String str8 = response1.contentType;
        response1.contentType = "";
        java.net.URL uRL11 = response1.url();
        response1.executed = false;
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(uRL11);
    }

    @Test
    public void test08119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08119");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        response1.executed = false;
        org.jsoup.Connection.Response response11 = response1.header("Location", "");
        int int12 = response1.statusCode();
        java.lang.String str14 = response1.header("");
        response1.numRedirects = 35;
        java.lang.String str17 = response1.charset();
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test08120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08120");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.charset = "Location";
        int int4 = response1.numRedirects;
        java.nio.ByteBuffer byteBuffer5 = response1.byteData;
        java.lang.String str7 = response1.cookie("Location");
        response1.numRedirects = (short) 0;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(byteBuffer5);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test08121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08121");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        response1.executed = false;
        org.jsoup.Connection.Response response11 = response1.header("Location", "");
        int int12 = response1.statusCode;
        boolean boolean13 = response1.executed;
        org.jsoup.Connection.Request request14 = null;
        response1.req = request14;
        java.lang.String str16 = response1.statusMessage();
        java.lang.String str17 = response1.statusMessage();
        java.util.Map<java.lang.String, java.lang.String> strMap18 = response1.headers();
        boolean boolean19 = response1.executed;
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(strMap18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test08122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08122");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        java.lang.String str8 = response1.contentType();
        int int9 = response1.statusCode;
        int int10 = response1.statusCode;
        java.lang.String str12 = response1.header("");
        int int13 = response1.statusCode();
        boolean boolean15 = response1.hasHeader("hi!");
        response1.numRedirects = (short) -1;
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test08123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08123");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        response1.charset = "";
        response1.statusMessage = "";
        java.lang.String str10 = response1.header("");
        int int11 = response1.statusCode;
        org.jsoup.Connection.Response response13 = response1.removeCookie("hi!");
        java.lang.String str15 = response1.cookie("hi!");
        int int16 = response1.numRedirects;
        java.lang.String str17 = response1.charset;
        java.net.HttpURLConnection httpURLConnection18 = null;
        org.jsoup.helper.HttpConnection.Response response19 = null;
        org.jsoup.helper.HttpConnection.Response response20 = new org.jsoup.helper.HttpConnection.Response(response19);
        response20.charset = "Location";
        int int23 = response20.numRedirects;
        java.nio.ByteBuffer byteBuffer24 = response20.byteData;
        java.nio.ByteBuffer byteBuffer25 = response20.byteData;
        boolean boolean26 = response20.executed;
        java.lang.String str27 = response20.contentType;
        int int28 = response20.numRedirects;
        org.jsoup.Connection.Request request29 = response20.req;
        // The following exception was thrown during execution in test generation
        try {
            response1.setupFromConnection(httpURLConnection18, (org.jsoup.Connection.Response) response20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNull(byteBuffer24);
        org.junit.Assert.assertNull(byteBuffer25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNull(request29);
    }

    @Test
    public void test08124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08124");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        response1.executed = false;
        org.jsoup.Connection.Response response11 = response1.header("Location", "");
        int int12 = response1.statusCode;
        boolean boolean13 = response1.executed;
        org.jsoup.Connection.Request request14 = null;
        response1.req = request14;
        java.lang.String str16 = response1.statusMessage();
        java.lang.String str17 = response1.statusMessage();
        java.lang.String str18 = response1.statusMessage();
        response1.charset = "hi!";
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = response1.hasHeaderWithValue("", "Location");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test08125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08125");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Request request3 = null;
        response2.req = request3;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry6 = response2.scanHeaders("hi!");
        response2.charset = "hi!";
        java.lang.String str9 = response2.contentType();
        java.lang.String str10 = response2.contentType;
        response2.statusMessage = "hi!";
        org.jsoup.Connection.Response response14 = response2.removeHeader("Location");
        int int15 = response2.statusCode;
        java.nio.ByteBuffer byteBuffer16 = response2.byteData;
        java.lang.String str17 = response2.charset;
        response2.executed = false;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response20 = org.jsoup.helper.HttpConnection.Response.execute(request0, response2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(byteBuffer16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test08126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08126");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.numRedirects = (byte) -1;
        int int4 = response1.statusCode;
        response1.statusMessage = "";
        java.lang.String str7 = response1.charset;
        java.lang.String str9 = response1.getHeaderCaseInsensitive("hi!");
        org.jsoup.Connection.Request request10 = response1.req;
        response1.numRedirects = 10;
        java.util.Map<java.lang.String, java.lang.String> strMap13 = response1.cookies();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(request10);
        org.junit.Assert.assertNotNull(strMap13);
    }

    @Test
    public void test08127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08127");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        org.jsoup.Connection.Request request4 = null;
        response1.req = request4;
        java.net.URL uRL6 = response1.url();
        boolean boolean8 = response1.hasCookie("Location");
        java.lang.String str10 = response1.cookie("hi!");
        java.lang.String str11 = response1.statusMessage();
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test08128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08128");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        response1.charset = "";
        response1.statusMessage = "";
        java.lang.String str10 = response1.getHeaderCaseInsensitive("");
        boolean boolean13 = response1.hasHeaderWithValue("Location", "");
        java.nio.ByteBuffer byteBuffer14 = null;
        response1.byteData = byteBuffer14;
        java.util.Map<java.lang.String, java.lang.String> strMap16 = response1.headers();
        org.jsoup.Connection.Request request17 = response1.req;
        boolean boolean19 = response1.hasCookie("Location");
        java.net.URL uRL20 = response1.url();
        java.util.Map<java.lang.String, java.lang.String> strMap21 = response1.cookies();
        java.lang.String str22 = response1.statusMessage();
        int int23 = response1.statusCode;
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertNull(request17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(uRL20);
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test08129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08129");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        org.jsoup.Connection.Response response8 = response1.cookie("hi!", "");
        java.lang.String str9 = response1.statusMessage();
        org.jsoup.Connection.Request request10 = response1.req;
        java.net.URL uRL11 = response1.url();
        java.lang.String str12 = response1.contentType();
        java.lang.String str13 = response1.charset;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry15 = response1.scanHeaders("hi!");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry17 = response1.scanHeaders("");
        org.jsoup.Connection.Method method18 = response1.method();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry20 = response1.scanHeaders("Location");
        response1.charset = "";
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(request10);
        org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(strEntry15);
        org.junit.Assert.assertNull(strEntry17);
        org.junit.Assert.assertNull(method18);
        org.junit.Assert.assertNull(strEntry20);
    }

    @Test
    public void test08130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08130");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        org.jsoup.Connection.Response response8 = response1.cookie("hi!", "");
        java.lang.String str9 = response1.statusMessage();
        java.lang.String str10 = response1.contentType;
        java.lang.String str11 = response1.charset;
        response1.statusMessage = "hi!";
        int int14 = response1.statusCode();
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test08131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08131");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        org.jsoup.Connection.Response response8 = response1.cookie("hi!", "");
        java.lang.String str9 = response1.statusMessage();
        org.jsoup.Connection.Method method10 = response1.method();
        response1.numRedirects = ' ';
        boolean boolean14 = response1.hasHeader("hi!");
        org.jsoup.Connection.Response response16 = response1.removeCookie("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap17 = response1.cookies();
        org.jsoup.Connection.Request request18 = null;
        response1.req = request18;
        java.util.Map<java.lang.String, java.lang.String> strMap20 = response1.headers();
        java.lang.String str22 = response1.getHeaderCaseInsensitive("hi!");
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertNotNull(strMap17);
        org.junit.Assert.assertNotNull(strMap20);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test08132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08132");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Request request3 = null;
        response2.req = request3;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry6 = response2.scanHeaders("hi!");
        response2.charset = "hi!";
        boolean boolean10 = response2.hasCookie("hi!");
        boolean boolean13 = response2.hasHeaderWithValue("Location", "Location");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response14 = org.jsoup.helper.HttpConnection.Response.execute(request0, response2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test08133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08133");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        int int8 = response1.numRedirects;
        response1.contentType = "hi!";
        java.nio.ByteBuffer byteBuffer11 = response1.byteData;
        java.nio.ByteBuffer byteBuffer12 = null;
        response1.byteData = byteBuffer12;
        org.jsoup.Connection.Response response16 = response1.header("hi!", "hi!");
        org.jsoup.Connection.Method method17 = response1.method();
        response1.numRedirects = (byte) 0;
        java.util.Map<java.lang.String, java.lang.String> strMap20 = response1.cookies();
        org.jsoup.Connection.Response response22 = response1.removeHeader("hi!");
        org.jsoup.Connection.Request request23 = response1.req;
        org.jsoup.Connection.Response response25 = response1.removeHeader("Location");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray26 = response1.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertNull(method17);
        org.junit.Assert.assertNotNull(strMap20);
        org.junit.Assert.assertNotNull(response22);
        org.junit.Assert.assertNull(request23);
        org.junit.Assert.assertNotNull(response25);
    }

    @Test
    public void test08134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08134");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        response1.charset = "";
        response1.statusMessage = "";
        java.util.Map<java.lang.String, java.lang.String> strMap9 = response1.headers();
        boolean boolean10 = response1.executed;
        int int11 = response1.numRedirects;
        org.jsoup.Connection.Method method12 = response1.method();
        java.nio.ByteBuffer byteBuffer13 = response1.byteData;
        java.lang.String str14 = response1.statusMessage();
        org.jsoup.Connection.Response response17 = response1.cookie("hi!", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document18 = response1.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(method12);
        org.junit.Assert.assertNull(byteBuffer13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(response17);
    }

    @Test
    public void test08135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08135");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        response1.executed = false;
        java.lang.String str9 = response1.contentType();
        java.util.Map<java.lang.String, java.lang.String> strMap10 = response1.cookies();
        org.jsoup.Connection.Request request11 = response1.req;
        response1.executed = false;
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNull(request11);
    }

    @Test
    public void test08136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08136");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        response1.charset = "";
        java.lang.String str8 = response1.cookie("hi!");
        boolean boolean9 = response1.executed;
        java.lang.String str10 = response1.contentType;
        response1.statusCode = (short) 1;
        response1.charset = "Location";
        boolean boolean16 = response1.hasCookie("hi!");
        response1.numRedirects = '4';
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry20 = response1.scanHeaders("hi!");
        java.lang.String str22 = response1.getHeaderCaseInsensitive("Location");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray23 = response1.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(strEntry20);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test08137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08137");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        org.jsoup.Connection.Response response8 = response1.cookie("hi!", "");
        java.lang.String str9 = response1.statusMessage();
        java.lang.String str10 = response1.contentType;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry12 = response1.scanHeaders("");
        response1.statusMessage = "";
        java.lang.String str16 = response1.cookie("Location");
        org.jsoup.Connection.Response response18 = response1.removeHeader("Location");
        java.nio.ByteBuffer byteBuffer19 = response1.byteData;
        java.util.Map<java.lang.String, java.lang.String> strMap20 = response1.headers();
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(strEntry12);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(response18);
        org.junit.Assert.assertNull(byteBuffer19);
        org.junit.Assert.assertNotNull(strMap20);
    }

    @Test
    public void test08138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08138");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        response1.charset = "";
        java.lang.String str8 = response1.cookie("hi!");
        boolean boolean9 = response1.executed;
        java.lang.String str10 = response1.contentType;
        response1.statusCode = (short) 1;
        response1.charset = "Location";
        boolean boolean16 = response1.hasCookie("hi!");
        response1.numRedirects = '4';
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry20 = response1.scanHeaders("hi!");
        java.lang.String str21 = response1.statusMessage;
        java.lang.String str22 = response1.charset();
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(strEntry20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Location" + "'", str22, "Location");
    }

    @Test
    public void test08139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08139");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        org.jsoup.Connection.Response response8 = response1.cookie("hi!", "");
        java.lang.String str9 = response1.statusMessage();
        org.jsoup.Connection.Request request10 = response1.req;
        int int11 = response1.statusCode();
        java.net.URL uRL12 = response1.url();
        int int13 = response1.statusCode;
        java.lang.String str14 = response1.charset();
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(request10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(uRL12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test08140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08140");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        response1.executed = false;
        boolean boolean9 = response1.executed;
        int int10 = response1.statusCode();
        java.lang.String str11 = response1.contentType;
        response1.statusMessage = "Location";
        java.lang.String str15 = response1.cookie("hi!");
        org.jsoup.Connection.Method method16 = response1.method();
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(method16);
    }

    @Test
    public void test08141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08141");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        response1.executed = false;
        boolean boolean9 = response1.executed;
        int int10 = response1.statusCode();
        java.lang.String str11 = response1.contentType;
        response1.statusMessage = "Location";
        java.net.URL uRL14 = response1.url();
        response1.contentType = "hi!";
        java.lang.String str18 = response1.cookie("Location");
        int int19 = response1.statusCode;
        java.net.HttpURLConnection httpURLConnection20 = null;
        org.jsoup.helper.HttpConnection.Response response21 = null;
        org.jsoup.helper.HttpConnection.Response response22 = new org.jsoup.helper.HttpConnection.Response(response21);
        org.jsoup.Connection.Response response25 = response22.header("hi!", "");
        response22.charset = "";
        response22.statusMessage = "";
        java.lang.String str31 = response22.header("");
        java.net.URL uRL32 = response22.url();
        response22.charset = "Location";
        response22.statusMessage = "hi!";
        response22.statusCode = (short) 10;
        java.lang.String str39 = response22.charset();
        org.jsoup.Connection.Response response41 = response22.removeCookie("Location");
        int int42 = response22.numRedirects;
        response22.executed = true;
        boolean boolean45 = response22.executed;
        // The following exception was thrown during execution in test generation
        try {
            response1.setupFromConnection(httpURLConnection20, (org.jsoup.Connection.Response) response22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(uRL14);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(response25);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNull(uRL32);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Location" + "'", str39, "Location");
        org.junit.Assert.assertNotNull(response41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
    }

    @Test
    public void test08142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08142");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response9 = response1.cookie("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
    }

    @Test
    public void test08143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08143");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        java.lang.String str7 = response1.contentType();
        int int8 = response1.numRedirects;
        int int9 = response1.numRedirects;
        java.nio.ByteBuffer byteBuffer10 = response1.byteData;
        java.net.HttpURLConnection httpURLConnection11 = null;
        org.jsoup.helper.HttpConnection.Response response12 = null;
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response12);
        org.jsoup.Connection.Request request14 = null;
        response13.req = request14;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry17 = response13.scanHeaders("hi!");
        response13.charset = "hi!";
        int int20 = response13.numRedirects;
        response13.contentType = "hi!";
        java.nio.ByteBuffer byteBuffer23 = response13.byteData;
        java.lang.String str24 = response13.contentType;
        java.lang.String str26 = response13.getHeaderCaseInsensitive("hi!");
        org.jsoup.Connection.Request request27 = null;
        response13.req = request27;
        java.lang.String str29 = response13.contentType();
        response13.statusMessage = "Location";
        org.jsoup.Connection.Request request32 = response13.req;
        boolean boolean34 = response13.hasHeader("Location");
        java.lang.String str35 = response13.statusMessage();
        int int36 = response13.statusCode();
        response13.charset = "hi!";
        // The following exception was thrown during execution in test generation
        try {
            response1.setupFromConnection(httpURLConnection11, (org.jsoup.Connection.Response) response13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(byteBuffer10);
        org.junit.Assert.assertNull(strEntry17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNull(byteBuffer23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertNull(request32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Location" + "'", str35, "Location");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
    }

    @Test
    public void test08144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08144");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        org.jsoup.Connection.Response response8 = response1.cookie("hi!", "");
        java.lang.String str9 = response1.statusMessage();
        org.jsoup.Connection.Request request10 = response1.req;
        java.net.URL uRL11 = response1.url();
        java.lang.String str12 = response1.contentType();
        java.lang.String str13 = response1.charset;
        java.nio.ByteBuffer byteBuffer14 = response1.byteData;
        org.jsoup.Connection.Response response17 = response1.header("Location", "Location");
        org.jsoup.Connection.Method method18 = response1.method();
        org.jsoup.Connection.Method method19 = response1.method();
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(request10);
        org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(byteBuffer14);
        org.junit.Assert.assertNotNull(response17);
        org.junit.Assert.assertNull(method18);
        org.junit.Assert.assertNull(method19);
    }

    @Test
    public void test08145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08145");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        java.lang.String str8 = response1.contentType();
        java.lang.String str9 = response1.contentType;
        boolean boolean11 = response1.hasHeader("hi!");
        response1.statusMessage = "hi!";
        java.nio.ByteBuffer byteBuffer14 = response1.byteData;
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray15 = response1.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(byteBuffer14);
    }

    @Test
    public void test08146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08146");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        response1.executed = false;
        org.jsoup.Connection.Response response11 = response1.header("Location", "");
        response1.statusMessage = "";
        response1.executed = true;
        response1.contentType = "";
        java.lang.String str18 = response1.charset();
        org.jsoup.Connection.Method method19 = response1.method();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response22 = response1.header("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(method19);
    }

    @Test
    public void test08147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08147");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        org.jsoup.Connection.Response response8 = response1.cookie("hi!", "");
        boolean boolean9 = response1.executed;
        java.lang.String str10 = response1.contentType;
        int int11 = response1.statusCode();
        java.nio.ByteBuffer byteBuffer12 = response1.byteData;
        java.net.URL uRL13 = response1.url();
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(byteBuffer12);
        org.junit.Assert.assertNull(uRL13);
    }

    @Test
    public void test08148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08148");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        int int8 = response1.numRedirects;
        response1.contentType = "hi!";
        java.nio.ByteBuffer byteBuffer11 = response1.byteData;
        java.lang.String str12 = response1.contentType;
        response1.statusCode = (short) 1;
        response1.executed = false;
        response1.statusMessage = "";
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test08149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08149");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        org.jsoup.Connection.Request request8 = response1.req;
        org.jsoup.Connection.Method method9 = response1.method();
        java.net.URL uRL10 = response1.url();
        java.util.Map<java.lang.String, java.lang.String> strMap11 = response1.headers();
        response1.executed = true;
        java.lang.String str15 = response1.getHeaderCaseInsensitive("hi!");
        java.lang.String str16 = response1.statusMessage();
        org.jsoup.Connection.Response response19 = response1.cookie("Location", "hi!");
        java.lang.Class<?> wildcardClass20 = response19.getClass();
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNull(request8);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertNull(uRL10);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(response19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test08150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08150");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        response1.executed = false;
        boolean boolean9 = response1.executed;
        int int10 = response1.statusCode();
        response1.executed = false;
        org.jsoup.Connection.Method method13 = response1.method();
        java.lang.String str14 = response1.charset;
        response1.statusMessage = "";
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response18 = response1.removeCookie("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(method13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test08151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08151");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        response1.charset = "";
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry8 = response1.scanHeaders("hi!");
        java.lang.String str9 = response1.contentType();
        java.lang.String str10 = response1.statusMessage;
        java.lang.String str11 = response1.charset();
        org.jsoup.Connection.Method method12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response13 = response1.method(method12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNotNull(strEntry8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test08152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08152");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        int int8 = response1.numRedirects;
        int int9 = response1.statusCode();
        java.lang.String str10 = response1.charset;
        boolean boolean12 = response1.hasHeader("Location");
        java.lang.String str13 = response1.charset();
        int int14 = response1.numRedirects;
        boolean boolean15 = response1.executed;
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test08153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08153");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        int int8 = response1.numRedirects;
        response1.contentType = "hi!";
        java.nio.ByteBuffer byteBuffer11 = response1.byteData;
        java.lang.String str12 = response1.contentType;
        org.jsoup.Connection.Response response15 = response1.cookie("Location", "Location");
        int int16 = response1.numRedirects;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry18 = response1.scanHeaders("hi!");
        int int19 = response1.statusCode;
        org.jsoup.Connection.Response response21 = response1.removeHeader("Location");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = response1.hasHeaderWithValue("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(strEntry18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(response21);
    }

    @Test
    public void test08154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08154");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        int int8 = response1.numRedirects;
        response1.contentType = "hi!";
        java.nio.ByteBuffer byteBuffer11 = response1.byteData;
        java.lang.String str12 = response1.contentType;
        org.jsoup.Connection.Response response15 = response1.cookie("Location", "Location");
        int int16 = response1.numRedirects;
        int int17 = response1.numRedirects;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry19 = response1.scanHeaders("");
        java.nio.ByteBuffer byteBuffer20 = null;
        response1.byteData = byteBuffer20;
        java.util.Map<java.lang.String, java.lang.String> strMap22 = response1.cookies();
        org.jsoup.Connection.Request request23 = null;
        response1.req = request23;
        java.lang.String str25 = response1.charset;
        java.lang.String str26 = response1.charset();
        int int27 = response1.statusCode();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str28 = response1.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(strEntry19);
        org.junit.Assert.assertNotNull(strMap22);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test08155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08155");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        org.jsoup.Connection.Response response8 = response1.removeHeader("Location");
        java.lang.String str9 = response1.contentType;
        java.util.Map<java.lang.String, java.lang.String> strMap10 = response1.cookies();
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response1);
        response1.contentType = "";
        java.lang.String str14 = response1.charset();
        int int15 = response1.numRedirects;
        java.nio.ByteBuffer byteBuffer16 = response1.byteData;
        java.util.Map<java.lang.String, java.lang.String> strMap17 = response1.headers();
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(byteBuffer16);
        org.junit.Assert.assertNotNull(strMap17);
    }

    @Test
    public void test08156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08156");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        int int8 = response1.numRedirects;
        response1.contentType = "hi!";
        java.nio.ByteBuffer byteBuffer11 = response1.byteData;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry13 = response1.scanHeaders("");
        java.lang.String str14 = response1.contentType;
        java.util.Map<java.lang.String, java.lang.String> strMap15 = response1.cookies();
        java.util.Map<java.lang.String, java.lang.String> strMap16 = response1.headers();
        org.jsoup.Connection.Response response18 = response1.removeCookie("Location");
        java.util.Map<java.lang.String, java.lang.String> strMap19 = response1.headers();
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertNull(strEntry13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertNotNull(response18);
        org.junit.Assert.assertNotNull(strMap19);
    }

    @Test
    public void test08157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08157");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        org.jsoup.Connection.Response response8 = response1.cookie("hi!", "");
        java.lang.String str9 = response1.statusMessage();
        org.jsoup.Connection.Request request10 = response1.req;
        java.net.URL uRL11 = response1.url();
        java.lang.String str12 = response1.contentType();
        response1.contentType = "hi!";
        java.net.URL uRL15 = response1.url();
        org.jsoup.Connection.Response response17 = response1.removeHeader("hi!");
        org.jsoup.Connection.Response response19 = response1.removeHeader("hi!");
        response1.statusMessage = "Location";
        org.jsoup.Connection.Request request22 = response1.req;
        java.util.Map<java.lang.String, java.lang.String> strMap23 = response1.cookies();
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(request10);
        org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(uRL15);
        org.junit.Assert.assertNotNull(response17);
        org.junit.Assert.assertNotNull(response19);
        org.junit.Assert.assertNull(request22);
        org.junit.Assert.assertNotNull(strMap23);
    }

    @Test
    public void test08158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08158");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        boolean boolean6 = response1.hasHeaderWithValue("hi!", "hi!");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry8 = response1.scanHeaders("");
        java.lang.String str9 = response1.statusMessage();
        java.lang.String str10 = response1.statusMessage();
        java.nio.ByteBuffer byteBuffer11 = null;
        response1.byteData = byteBuffer11;
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(strEntry8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test08159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08159");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        java.lang.String str8 = response1.contentType();
        int int9 = response1.statusCode;
        int int10 = response1.statusCode;
        java.lang.String str12 = response1.header("");
        org.jsoup.Connection.Request request13 = null;
        response1.req = request13;
        java.nio.ByteBuffer byteBuffer15 = null;
        response1.byteData = byteBuffer15;
        int int17 = response1.statusCode();
        int int18 = response1.statusCode();
        org.jsoup.Connection.Response response20 = response1.removeHeader("Location");
        java.lang.Class<?> wildcardClass21 = response1.getClass();
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(response20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test08160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08160");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        org.jsoup.Connection.Response response8 = response1.cookie("hi!", "");
        java.lang.String str9 = response1.statusMessage();
        java.lang.String str10 = response1.contentType;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry12 = response1.scanHeaders("");
        response1.statusMessage = "";
        java.lang.String str16 = response1.cookie("Location");
        org.jsoup.Connection.Response response18 = response1.removeHeader("Location");
        java.lang.String str19 = response1.statusMessage;
        int int20 = response1.numRedirects;
        java.lang.String str22 = response1.getHeaderCaseInsensitive("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document23 = response1.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(strEntry12);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(response18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test08161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08161");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        response1.statusCode = 10;
        int int9 = response1.numRedirects;
        boolean boolean10 = response1.executed;
        java.lang.String str11 = response1.statusMessage();
        response1.statusCode = (short) -1;
        java.lang.String str14 = response1.charset();
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response1);
        int int16 = response15.statusCode();
        java.lang.String str17 = response15.charset;
        boolean boolean19 = response15.hasCookie("hi!");
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test08162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08162");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        org.jsoup.Connection.Response response8 = response1.cookie("hi!", "");
        java.net.URL uRL9 = response1.url();
        java.nio.ByteBuffer byteBuffer10 = null;
        response1.byteData = byteBuffer10;
        java.lang.String str12 = response1.contentType;
        org.jsoup.Connection.Method method13 = response1.method();
        response1.statusCode = 0;
        int int16 = response1.statusCode();
        java.lang.String str18 = response1.cookie("Location");
        response1.charset = "Location";
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response23 = response1.cookie("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(method13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test08163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08163");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        java.lang.String str8 = response1.cookie("hi!");
        java.nio.ByteBuffer byteBuffer9 = response1.byteData;
        response1.statusCode = 52;
        response1.statusCode = (byte) 100;
        java.nio.ByteBuffer byteBuffer14 = response1.byteData;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = response1.hasHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(byteBuffer9);
        org.junit.Assert.assertNull(byteBuffer14);
    }

    @Test
    public void test08164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08164");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        response1.charset = "";
        org.jsoup.Connection.Method method7 = response1.method();
        java.lang.String str8 = response1.statusMessage;
        java.lang.String str10 = response1.header("hi!");
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test08165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08165");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        response1.executed = false;
        response1.statusCode = 100;
        boolean boolean12 = response1.hasHeader("Location");
        response1.numRedirects = (-1);
        org.jsoup.Connection.Request request15 = response1.req;
        response1.charset = "Location";
        org.jsoup.Connection.Method method18 = response1.method();
        java.lang.String str20 = response1.getHeaderCaseInsensitive("hi!");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = response1.hasCookie("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(request15);
        org.junit.Assert.assertNull(method18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test08166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08166");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        org.jsoup.Connection.Response response8 = response1.cookie("hi!", "");
        java.net.URL uRL9 = response1.url();
        java.nio.ByteBuffer byteBuffer10 = null;
        response1.byteData = byteBuffer10;
        java.lang.String str12 = response1.contentType;
        org.jsoup.Connection.Method method13 = response1.method();
        boolean boolean14 = response1.executed;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry16 = response1.scanHeaders("");
        response1.statusCode = (short) 10;
        org.jsoup.Connection.Response response21 = response1.header("Location", "hi!");
        org.jsoup.helper.HttpConnection.Response response22 = new org.jsoup.helper.HttpConnection.Response(response1);
        response1.executed = false;
        org.jsoup.Connection.Response response26 = response1.removeHeader("Location");
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(method13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(strEntry16);
        org.junit.Assert.assertNotNull(response21);
        org.junit.Assert.assertNotNull(response26);
    }

    @Test
    public void test08167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08167");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        response1.executed = false;
        org.jsoup.Connection.Response response11 = response1.header("Location", "");
        int int12 = response1.statusCode;
        boolean boolean13 = response1.executed;
        response1.statusMessage = "hi!";
        org.jsoup.Connection.Method method16 = response1.method();
        org.jsoup.Connection.Response response18 = response1.removeHeader("Location");
        response1.numRedirects = '4';
        java.util.Map<java.lang.String, java.lang.String> strMap21 = response1.headers();
        java.lang.String str23 = response1.cookie("Location");
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(method16);
        org.junit.Assert.assertNotNull(response18);
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test08168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08168");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        java.lang.String str7 = response1.contentType();
        java.lang.String str8 = response1.contentType();
        org.jsoup.Connection.Response response10 = response1.removeHeader("Location");
        java.nio.ByteBuffer byteBuffer11 = response1.byteData;
        int int12 = response1.statusCode();
        java.net.URL uRL13 = response1.url();
        response1.statusCode = (-1);
        int int16 = response1.statusCode;
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str19 = response1.getHeaderCaseInsensitive("");
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(uRL13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test08169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08169");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        response1.statusCode = 10;
        int int9 = response1.numRedirects;
        boolean boolean10 = response1.executed;
        java.lang.String str11 = response1.statusMessage();
        java.lang.String str12 = response1.charset;
        response1.contentType = "Location";
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test08170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08170");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.charset = "Location";
        java.nio.ByteBuffer byteBuffer4 = null;
        response1.byteData = byteBuffer4;
        response1.executed = false;
        java.lang.String str8 = response1.contentType();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document9 = response1.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test08171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08171");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        org.jsoup.Connection.Response response6 = response1.removeCookie("Location");
        response1.statusCode = '#';
        boolean boolean9 = response1.executed;
        java.lang.String str10 = response1.contentType();
        response1.charset = "hi!";
        boolean boolean13 = response1.executed;
        java.nio.ByteBuffer byteBuffer14 = response1.byteData;
        java.lang.String str16 = response1.getHeaderCaseInsensitive("hi!");
        java.lang.String str17 = response1.charset();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry19 = response1.scanHeaders("");
        org.jsoup.Connection.Method method20 = response1.method();
        response1.statusMessage = "";
        org.jsoup.Connection.Response response24 = response1.removeHeader("hi!");
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(byteBuffer14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNull(strEntry19);
        org.junit.Assert.assertNull(method20);
        org.junit.Assert.assertNotNull(response24);
    }

    @Test
    public void test08172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08172");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        org.jsoup.Connection.Response response8 = response1.cookie("hi!", "");
        java.lang.String str9 = response1.statusMessage();
        org.jsoup.Connection.Request request10 = response1.req;
        java.net.URL uRL11 = response1.url();
        java.lang.String str13 = response1.cookie("Location");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry15 = response1.scanHeaders("");
        java.lang.String str17 = response1.getHeaderCaseInsensitive("hi!");
        response1.numRedirects = (short) 0;
        org.jsoup.Connection.Response response22 = response1.cookie("Location", "Location");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response24 = response1.removeHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(request10);
        org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(strEntry15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(response22);
    }

    @Test
    public void test08173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08173");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        java.lang.String str7 = response1.contentType();
        java.lang.String str9 = response1.header("hi!");
        java.nio.ByteBuffer byteBuffer10 = response1.byteData;
        int int11 = response1.statusCode;
        java.lang.String str12 = response1.charset;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry14 = response1.scanHeaders("Location");
        org.jsoup.Connection.Method method15 = response1.method();
        response1.executed = false;
        response1.contentType = "Location";
        java.util.Map<java.lang.String, java.lang.String> strMap20 = response1.headers();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry22 = response1.scanHeaders("Location");
        org.jsoup.Connection.Request request23 = null;
        response1.req = request23;
        int int25 = response1.numRedirects;
        org.jsoup.Connection.Method method26 = response1.method();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document27 = response1.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(byteBuffer10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(strEntry14);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertNotNull(strMap20);
        org.junit.Assert.assertNull(strEntry22);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNull(method26);
    }

    @Test
    public void test08174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08174");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        response1.charset = "";
        java.lang.String str8 = response1.cookie("hi!");
        boolean boolean9 = response1.executed;
        java.lang.String str10 = response1.contentType;
        org.jsoup.Connection.Request request11 = response1.req;
        java.lang.String str13 = response1.header("");
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.util.Map<java.lang.String, java.lang.String> strMap16 = response1.headers();
        response1.statusMessage = "Location";
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(request11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(strMap16);
    }

    @Test
    public void test08175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08175");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        boolean boolean6 = response1.hasCookie("hi!");
        response1.charset = "hi!";
        java.net.URL uRL9 = response1.url();
        int int10 = response1.statusCode;
        java.nio.ByteBuffer byteBuffer11 = response1.byteData;
        boolean boolean14 = response1.hasHeaderWithValue("hi!", "hi!");
        boolean boolean17 = response1.hasHeaderWithValue("hi!", "hi!");
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test08176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08176");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        int int8 = response1.numRedirects;
        response1.contentType = "hi!";
        java.nio.ByteBuffer byteBuffer11 = response1.byteData;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry13 = response1.scanHeaders("");
        java.lang.String str15 = response1.header("Location");
        java.nio.ByteBuffer byteBuffer16 = null;
        response1.byteData = byteBuffer16;
        int int18 = response1.statusCode();
        response1.contentType = "hi!";
        java.lang.String str21 = response1.charset();
        boolean boolean22 = response1.executed;
        org.jsoup.Connection.Response response24 = response1.removeCookie("hi!");
        java.net.URL uRL25 = response1.url();
        java.util.Map<java.lang.String, java.lang.String> strMap26 = response1.cookies();
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertNull(strEntry13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(response24);
        org.junit.Assert.assertNull(uRL25);
        org.junit.Assert.assertNotNull(strMap26);
    }

    @Test
    public void test08177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08177");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        org.jsoup.Connection.Response response8 = response1.cookie("hi!", "");
        java.lang.String str9 = response1.statusMessage();
        org.jsoup.Connection.Request request10 = response1.req;
        response1.numRedirects = 0;
        org.jsoup.Connection.Response response14 = response1.removeCookie("Location");
        org.jsoup.Connection.Request request15 = null;
        response1.req = request15;
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry19 = response17.scanHeaders("hi!");
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(request10);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertNull(strEntry19);
    }

    @Test
    public void test08178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08178");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        org.jsoup.Connection.Response response8 = response1.cookie("hi!", "");
        boolean boolean9 = response1.executed;
        int int10 = response1.statusCode;
        java.lang.String str11 = response1.statusMessage;
        java.net.URL uRL12 = response1.url();
        org.jsoup.Connection.Response response15 = response1.cookie("hi!", "");
        java.util.Map<java.lang.String, java.lang.String> strMap16 = response1.headers();
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(uRL12);
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertNotNull(strMap16);
    }

    @Test
    public void test08179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08179");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.lang.String str4 = response1.statusMessage;
        java.util.Map<java.lang.String, java.lang.String> strMap5 = response1.cookies();
        java.lang.String str6 = response1.statusMessage();
        org.jsoup.Connection.Response response9 = response1.cookie("Location", "hi!");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(response9);
    }

    @Test
    public void test08180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08180");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        response1.executed = false;
        org.jsoup.Connection.Response response11 = response1.header("Location", "");
        int int12 = response1.statusCode;
        boolean boolean13 = response1.executed;
        response1.statusMessage = "hi!";
        org.jsoup.Connection.Method method16 = response1.method();
        org.jsoup.Connection.Response response18 = response1.removeHeader("Location");
        java.nio.ByteBuffer byteBuffer19 = response1.byteData;
        org.jsoup.Connection.Request request20 = response1.req;
        org.jsoup.Connection.Request request21 = response1.req;
        response1.executed = false;
        java.lang.Class<?> wildcardClass24 = response1.getClass();
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(method16);
        org.junit.Assert.assertNotNull(response18);
        org.junit.Assert.assertNull(byteBuffer19);
        org.junit.Assert.assertNull(request20);
        org.junit.Assert.assertNull(request21);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test08181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08181");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        org.jsoup.Connection.Response response8 = response1.cookie("hi!", "");
        org.jsoup.Connection.Response response11 = response1.cookie("Location", "");
        boolean boolean14 = response1.hasHeaderWithValue("hi!", "");
        java.lang.String str15 = response1.contentType;
        org.jsoup.Connection.Method method16 = response1.method();
        java.lang.String str17 = response1.charset;
        org.jsoup.Connection.Response response20 = response1.header("hi!", "");
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(method16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(response20);
    }

    @Test
    public void test08182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08182");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        response1.statusMessage = "hi!";
        boolean boolean11 = response1.hasHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str14 = response12.getHeaderCaseInsensitive("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap15 = response12.cookies();
        int int16 = response12.statusCode;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = response12.hasHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test08183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08183");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        org.jsoup.Connection.Response response6 = response1.removeCookie("Location");
        response1.statusCode = '#';
        boolean boolean9 = response1.executed;
        java.lang.String str10 = response1.contentType();
        response1.charset = "hi!";
        boolean boolean13 = response1.executed;
        java.nio.ByteBuffer byteBuffer14 = response1.byteData;
        org.jsoup.Connection.Response response16 = response1.removeCookie("hi!");
        response1.contentType = "hi!";
        boolean boolean20 = response1.hasCookie("hi!");
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(byteBuffer14);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test08184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08184");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        response1.charset = "";
        response1.statusMessage = "";
        java.lang.String str10 = response1.getHeaderCaseInsensitive("");
        boolean boolean11 = response1.executed;
        int int12 = response1.numRedirects;
        response1.charset = "Location";
        response1.charset = "hi!";
        response1.statusCode = (short) -1;
        org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str20 = response1.statusMessage();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document21 = response1.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test08185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08185");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        boolean boolean8 = response1.hasHeaderWithValue("Location", "Location");
        int int9 = response1.statusCode;
        org.jsoup.Connection.Response response11 = response1.removeHeader("hi!");
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(response11);
    }

    @Test
    public void test08186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08186");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        response1.charset = "";
        response1.statusMessage = "";
        java.util.Map<java.lang.String, java.lang.String> strMap9 = response1.headers();
        boolean boolean10 = response1.executed;
        org.jsoup.Connection.Response response13 = response1.header("hi!", "");
        response1.executed = true;
        int int16 = response1.numRedirects;
        int int17 = response1.statusCode;
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test08187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08187");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        java.lang.String str8 = response1.contentType();
        java.lang.String str10 = response1.header("hi!");
        response1.contentType = "Location";
        java.nio.ByteBuffer byteBuffer13 = response1.byteData;
        response1.charset = "Location";
        java.nio.ByteBuffer byteBuffer16 = response1.byteData;
        java.lang.String str17 = response1.contentType();
        response1.numRedirects = '4';
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(byteBuffer13);
        org.junit.Assert.assertNull(byteBuffer16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Location" + "'", str17, "Location");
    }

    @Test
    public void test08188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08188");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        org.jsoup.Connection.Response response8 = response1.cookie("hi!", "");
        java.lang.String str9 = response1.statusMessage();
        java.lang.String str10 = response1.contentType;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry12 = response1.scanHeaders("");
        boolean boolean13 = response1.executed;
        java.lang.String str15 = response1.getHeaderCaseInsensitive("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap16 = response1.cookies();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document17 = response1.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(strEntry12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(strMap16);
    }

    @Test
    public void test08189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08189");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        java.lang.String str8 = response1.cookie("hi!");
        org.jsoup.Connection.Request request9 = response1.req;
        java.net.URL uRL10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response11 = response1.url(uRL10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(request9);
    }

    @Test
    public void test08190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08190");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        int int8 = response1.numRedirects;
        response1.contentType = "hi!";
        java.nio.ByteBuffer byteBuffer11 = response1.byteData;
        java.nio.ByteBuffer byteBuffer12 = null;
        response1.byteData = byteBuffer12;
        org.jsoup.Connection.Response response16 = response1.header("hi!", "hi!");
        org.jsoup.Connection.Method method17 = response1.method();
        java.lang.String str19 = response1.header("hi!");
        java.lang.String str20 = response1.contentType();
        java.nio.ByteBuffer byteBuffer21 = response1.byteData;
        org.jsoup.Connection.Method method22 = response1.method();
        org.jsoup.Connection.Response response24 = response1.removeCookie("Location");
        java.nio.ByteBuffer byteBuffer25 = null;
        response1.byteData = byteBuffer25;
        java.lang.String str27 = response1.charset;
        java.lang.String str28 = response1.contentType();
        boolean boolean31 = response1.hasHeaderWithValue("Location", "");
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertNull(method17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNull(byteBuffer21);
        org.junit.Assert.assertNull(method22);
        org.junit.Assert.assertNotNull(response24);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test08191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08191");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        org.jsoup.Connection.Request request5 = null;
        response1.req = request5;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry8 = response1.scanHeaders("Location");
        java.lang.String str9 = response1.contentType;
        java.util.Map<java.lang.String, java.lang.String> strMap10 = response1.headers();
        response1.statusMessage = "hi!";
        org.jsoup.Connection.Method method13 = response1.method();
        org.jsoup.Connection.Request request14 = null;
        response1.req = request14;
        org.jsoup.Connection.Response response18 = response1.header("Location", "Location");
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(strEntry8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNull(method13);
        org.junit.Assert.assertNotNull(response18);
    }

    @Test
    public void test08192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08192");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        int int8 = response1.numRedirects;
        response1.contentType = "hi!";
        java.nio.ByteBuffer byteBuffer11 = response1.byteData;
        java.nio.ByteBuffer byteBuffer12 = null;
        response1.byteData = byteBuffer12;
        org.jsoup.Connection.Response response16 = response1.header("hi!", "hi!");
        org.jsoup.Connection.Method method17 = response1.method();
        java.lang.String str19 = response1.header("hi!");
        org.jsoup.Connection.Response response22 = response1.header("hi!", "hi!");
        org.jsoup.Connection.Response response25 = response1.cookie("Location", "");
        response1.charset = "hi!";
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertNull(method17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(response22);
        org.junit.Assert.assertNotNull(response25);
    }

    @Test
    public void test08193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08193");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Response response5 = response2.header("hi!", "");
        response2.charset = "";
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry9 = response2.scanHeaders("hi!");
        response2.charset = "hi!";
        response2.statusCode = (byte) 0;
        java.util.Map<java.lang.String, java.lang.String> strMap14 = response2.headers();
        org.jsoup.Connection.Response response16 = response2.removeCookie("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response17 = org.jsoup.helper.HttpConnection.Response.execute(request0, response2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNotNull(strEntry9);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNotNull(response16);
    }

    @Test
    public void test08194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08194");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        java.lang.String str8 = response1.contentType();
        response1.charset = "hi!";
        int int11 = response1.numRedirects;
        java.lang.String str13 = response1.getHeaderCaseInsensitive("");
        java.lang.String str15 = response1.cookie("Location");
        org.jsoup.Connection.Request request16 = response1.req;
        int int17 = response1.statusCode;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = response1.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(request16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test08195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08195");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        response1.charset = "";
        response1.statusMessage = "";
        java.util.Map<java.lang.String, java.lang.String> strMap9 = response1.headers();
        boolean boolean10 = response1.executed;
        int int11 = response1.numRedirects;
        org.jsoup.Connection.Method method12 = response1.method();
        java.nio.ByteBuffer byteBuffer13 = response1.byteData;
        java.lang.String str14 = response1.contentType();
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry17 = response1.scanHeaders("");
        int int18 = response1.numRedirects;
        response1.statusCode = 32;
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(method12);
        org.junit.Assert.assertNull(byteBuffer13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(strEntry17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test08196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08196");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        response1.charset = "";
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry8 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        response1.statusCode = (byte) 10;
        java.lang.String str14 = response1.cookie("Location");
        java.nio.ByteBuffer byteBuffer15 = response1.byteData;
        response1.statusMessage = "";
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document18 = response1.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNotNull(strEntry8);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(byteBuffer15);
    }

    @Test
    public void test08197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08197");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        response1.charset = "";
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry8 = response1.scanHeaders("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap9 = response1.cookies();
        boolean boolean10 = response1.executed;
        org.jsoup.Connection.Response response13 = response1.cookie("hi!", "");
        boolean boolean14 = response1.executed;
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNotNull(strEntry8);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test08198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08198");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        int int8 = response1.numRedirects;
        response1.contentType = "hi!";
        java.nio.ByteBuffer byteBuffer11 = response1.byteData;
        java.lang.String str12 = response1.statusMessage();
        response1.statusCode = (-1);
        java.lang.String str16 = response1.getHeaderCaseInsensitive("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document17 = response1.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test08199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08199");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        java.lang.String str7 = response1.contentType();
        java.lang.String str8 = response1.contentType;
        java.lang.String str9 = response1.contentType;
        org.jsoup.Connection.Method method10 = response1.method();
        java.lang.String str11 = response1.contentType();
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test08200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08200");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        int int8 = response1.numRedirects;
        response1.contentType = "hi!";
        java.nio.ByteBuffer byteBuffer11 = response1.byteData;
        java.nio.ByteBuffer byteBuffer12 = null;
        response1.byteData = byteBuffer12;
        org.jsoup.Connection.Response response16 = response1.header("hi!", "hi!");
        org.jsoup.Connection.Method method17 = response1.method();
        java.lang.String str19 = response1.header("hi!");
        java.lang.String str20 = response1.contentType();
        java.nio.ByteBuffer byteBuffer21 = response1.byteData;
        boolean boolean24 = response1.hasHeaderWithValue("hi!", "Location");
        boolean boolean26 = response1.hasHeader("Location");
        java.lang.String str27 = response1.contentType();
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertNull(method17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNull(byteBuffer21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
    }

    @Test
    public void test08201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08201");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.numRedirects = (byte) -1;
        int int4 = response1.statusCode;
        response1.statusMessage = "";
        java.lang.String str7 = response1.charset;
        java.lang.String str9 = response1.getHeaderCaseInsensitive("hi!");
        org.jsoup.Connection.Request request10 = response1.req;
        int int11 = response1.statusCode;
        int int12 = response1.statusCode();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response14 = response1.removeCookie("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(request10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test08202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08202");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        org.jsoup.Connection.Response response8 = response1.cookie("hi!", "");
        java.lang.String str9 = response1.statusMessage();
        org.jsoup.Connection.Method method10 = response1.method();
        java.nio.ByteBuffer byteBuffer11 = null;
        response1.byteData = byteBuffer11;
        org.jsoup.Connection.Request request13 = response1.req;
        java.lang.String str14 = response1.charset();
        org.jsoup.Connection.Request request15 = null;
        response1.req = request15;
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNull(request13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test08203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08203");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.charset = "Location";
        boolean boolean6 = response1.hasHeaderWithValue("hi!", "Location");
        response1.numRedirects = (byte) 100;
        java.lang.String str10 = response1.header("hi!");
        java.lang.String str11 = response1.charset();
        org.jsoup.Connection.Request request12 = null;
        response1.req = request12;
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Location" + "'", str11, "Location");
    }

    @Test
    public void test08204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08204");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        org.jsoup.Connection.Response response8 = response1.cookie("hi!", "");
        org.jsoup.Connection.Response response11 = response1.cookie("Location", "");
        java.lang.String str12 = response1.statusMessage();
        response1.charset = "Location";
        java.lang.String str15 = response1.charset();
        org.jsoup.Connection.Request request16 = response1.req;
        response1.statusCode = (short) 100;
        org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response(response1);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response21 = response19.removeCookie("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Location" + "'", str15, "Location");
        org.junit.Assert.assertNull(request16);
    }

    @Test
    public void test08205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08205");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        org.jsoup.Connection.Request request8 = response1.req;
        org.jsoup.Connection.Method method9 = response1.method();
        java.net.URL uRL10 = response1.url();
        org.jsoup.Connection.Response response13 = response1.header("hi!", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document14 = response1.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNull(request8);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertNull(uRL10);
        org.junit.Assert.assertNotNull(response13);
    }

    @Test
    public void test08206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08206");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        int int8 = response1.numRedirects;
        response1.contentType = "hi!";
        java.nio.ByteBuffer byteBuffer11 = response1.byteData;
        java.lang.String str12 = response1.contentType;
        org.jsoup.Connection.Response response15 = response1.cookie("Location", "Location");
        int int16 = response1.numRedirects;
        int int17 = response1.numRedirects;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry19 = response1.scanHeaders("");
        java.nio.ByteBuffer byteBuffer20 = null;
        response1.byteData = byteBuffer20;
        java.util.Map<java.lang.String, java.lang.String> strMap22 = response1.cookies();
        org.jsoup.Connection.Request request23 = null;
        response1.req = request23;
        java.lang.String str25 = response1.charset;
        java.lang.String str27 = response1.getHeaderCaseInsensitive("");
        boolean boolean28 = response1.executed;
        java.util.Map<java.lang.String, java.lang.String> strMap29 = response1.cookies();
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(strEntry19);
        org.junit.Assert.assertNotNull(strMap22);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(strMap29);
    }

    @Test
    public void test08207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08207");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        org.jsoup.Connection.Response response8 = response1.cookie("hi!", "");
        java.lang.String str9 = response1.statusMessage();
        org.jsoup.Connection.Request request10 = response1.req;
        java.net.URL uRL11 = response1.url();
        java.lang.String str12 = response1.statusMessage;
        response1.executed = false;
        boolean boolean16 = response1.hasHeader("hi!");
        java.lang.String str18 = response1.header("");
        java.lang.String str20 = response1.getHeaderCaseInsensitive("Location");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = response1.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(request10);
        org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test08208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08208");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        response1.executed = false;
        boolean boolean9 = response1.executed;
        int int10 = response1.statusCode();
        response1.executed = false;
        org.jsoup.Connection.Request request13 = response1.req;
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response1);
        response1.statusMessage = "Location";
        org.jsoup.Connection.Request request17 = response1.req;
        java.lang.String str18 = response1.statusMessage;
        response1.charset = "hi!";
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(request13);
        org.junit.Assert.assertNull(request17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Location" + "'", str18, "Location");
    }

    @Test
    public void test08209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08209");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        org.jsoup.Connection.Request request5 = null;
        response1.req = request5;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry8 = response1.scanHeaders("Location");
        boolean boolean11 = response1.hasHeaderWithValue("hi!", "");
        response1.statusCode = (short) -1;
        response1.numRedirects = 0;
        response1.statusMessage = "Location";
        org.jsoup.Connection.Response response19 = response1.removeCookie("hi!");
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(strEntry8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(response19);
    }

    @Test
    public void test08210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08210");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        int int8 = response1.numRedirects;
        response1.contentType = "hi!";
        java.nio.ByteBuffer byteBuffer11 = response1.byteData;
        java.nio.ByteBuffer byteBuffer12 = null;
        response1.byteData = byteBuffer12;
        org.jsoup.Connection.Response response16 = response1.header("hi!", "hi!");
        org.jsoup.Connection.Method method17 = response1.method();
        java.lang.String str19 = response1.header("hi!");
        response1.charset = "";
        java.lang.String str22 = response1.contentType;
        java.util.Map<java.lang.String, java.lang.String> strMap23 = response1.cookies();
        java.lang.String str24 = response1.contentType;
        boolean boolean25 = response1.executed;
        org.jsoup.Connection.Response response27 = response1.removeCookie("hi!");
        response1.executed = false;
        org.jsoup.Connection.Request request30 = null;
        response1.req = request30;
        int int32 = response1.numRedirects;
        java.lang.String str33 = response1.contentType();
        java.lang.String str35 = response1.getHeaderCaseInsensitive("");
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertNull(method17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(strMap23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(response27);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertNull(str35);
    }

    @Test
    public void test08211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08211");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        java.lang.String str7 = response1.contentType();
        int int8 = response1.numRedirects;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry10 = response1.scanHeaders("Location");
        org.jsoup.Connection.Request request11 = null;
        response1.req = request11;
        java.lang.String str13 = response1.contentType;
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(strEntry10);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test08212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08212");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        int int8 = response1.numRedirects;
        response1.contentType = "hi!";
        java.nio.ByteBuffer byteBuffer11 = response1.byteData;
        java.lang.String str12 = response1.contentType;
        java.lang.String str14 = response1.getHeaderCaseInsensitive("hi!");
        org.jsoup.Connection.Request request15 = null;
        response1.req = request15;
        java.lang.String str17 = response1.contentType();
        response1.statusMessage = "Location";
        int int20 = response1.numRedirects;
        java.lang.String str21 = response1.charset;
        response1.executed = true;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str25 = response1.cookie("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test08213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08213");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        java.lang.String str7 = response1.statusMessage;
        org.jsoup.Connection.Request request8 = null;
        response1.req = request8;
        org.jsoup.Connection.Response response11 = response1.removeCookie("hi!");
        org.jsoup.Connection.Request request12 = response1.req;
        java.lang.String str13 = response1.statusMessage();
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray14 = response1.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNull(request12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test08214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08214");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        org.jsoup.Connection.Response response8 = response1.cookie("hi!", "");
        java.lang.String str9 = response1.statusMessage();
        org.jsoup.Connection.Method method10 = response1.method();
        org.jsoup.Connection.Method method11 = response1.method();
        java.net.URL uRL12 = response1.url();
        org.jsoup.Connection.Response response14 = response1.removeHeader("Location");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document15 = response1.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNull(method11);
        org.junit.Assert.assertNull(uRL12);
        org.junit.Assert.assertNotNull(response14);
    }

    @Test
    public void test08215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08215");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        int int8 = response1.numRedirects;
        response1.contentType = "hi!";
        java.nio.ByteBuffer byteBuffer11 = response1.byteData;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry13 = response1.scanHeaders("");
        java.lang.String str15 = response1.header("Location");
        response1.statusCode = (byte) 100;
        java.lang.String str18 = response1.statusMessage();
        java.util.Map<java.lang.String, java.lang.String> strMap19 = response1.headers();
        java.lang.String str21 = response1.header("hi!");
        boolean boolean23 = response1.hasHeader("Location");
        int int24 = response1.numRedirects;
        java.nio.ByteBuffer byteBuffer25 = response1.byteData;
        response1.executed = true;
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertNull(strEntry13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(strMap19);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNull(byteBuffer25);
    }

    @Test
    public void test08216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08216");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        int int8 = response1.numRedirects;
        response1.contentType = "hi!";
        java.nio.ByteBuffer byteBuffer11 = response1.byteData;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry13 = response1.scanHeaders("");
        response1.numRedirects = (short) 10;
        java.lang.String str17 = response1.cookie("hi!");
        java.nio.ByteBuffer byteBuffer18 = null;
        response1.byteData = byteBuffer18;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document20 = response1.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertNull(strEntry13);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test08217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08217");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        int int8 = response1.numRedirects;
        response1.contentType = "hi!";
        java.nio.ByteBuffer byteBuffer11 = response1.byteData;
        java.nio.ByteBuffer byteBuffer12 = null;
        response1.byteData = byteBuffer12;
        org.jsoup.Connection.Response response16 = response1.header("hi!", "hi!");
        org.jsoup.Connection.Method method17 = response1.method();
        java.lang.String str19 = response1.header("hi!");
        java.lang.String str20 = response1.contentType();
        response1.statusCode = '4';
        int int23 = response1.statusCode;
        java.lang.String str24 = response1.contentType();
        java.util.Map<java.lang.String, java.lang.String> strMap25 = response1.cookies();
        java.nio.ByteBuffer byteBuffer26 = null;
        response1.byteData = byteBuffer26;
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertNull(method17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 52 + "'", int23 == 52);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertNotNull(strMap25);
    }

    @Test
    public void test08218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08218");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        response1.executed = false;
        org.jsoup.Connection.Response response11 = response1.header("Location", "");
        int int12 = response1.statusCode;
        boolean boolean14 = response1.hasCookie("hi!");
        java.lang.String str15 = response1.statusMessage;
        java.lang.String str16 = response1.charset();
        java.nio.ByteBuffer byteBuffer17 = null;
        response1.byteData = byteBuffer17;
        java.util.Map<java.lang.String, java.lang.String> strMap19 = response1.cookies();
        boolean boolean21 = response1.hasCookie("Location");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document22 = response1.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(strMap19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test08219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08219");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request3 = response2.req;
        response2.numRedirects = '#';
        org.junit.Assert.assertNull(request3);
    }

    @Test
    public void test08220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08220");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        int int8 = response1.numRedirects;
        response1.contentType = "hi!";
        java.nio.ByteBuffer byteBuffer11 = response1.byteData;
        java.lang.String str12 = response1.contentType;
        org.jsoup.Connection.Response response15 = response1.cookie("Location", "Location");
        int int16 = response1.numRedirects;
        int int17 = response1.numRedirects;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry19 = response1.scanHeaders("");
        java.nio.ByteBuffer byteBuffer20 = null;
        response1.byteData = byteBuffer20;
        org.jsoup.Connection.Response response23 = response1.removeCookie("Location");
        response1.statusMessage = "hi!";
        response1.statusCode = '4';
        org.jsoup.Connection.Response response30 = response1.cookie("hi!", "");
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(strEntry19);
        org.junit.Assert.assertNotNull(response23);
        org.junit.Assert.assertNotNull(response30);
    }

    @Test
    public void test08221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08221");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        org.jsoup.Connection.Request request5 = null;
        response1.req = request5;
        java.lang.String str7 = response1.charset();
        response1.statusMessage = "hi!";
        int int10 = response1.statusCode();
        java.net.URL uRL11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response12 = response1.url(uRL11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test08222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08222");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        org.jsoup.Connection.Response response8 = response1.cookie("hi!", "");
        java.net.URL uRL9 = response1.url();
        java.nio.ByteBuffer byteBuffer10 = null;
        response1.byteData = byteBuffer10;
        java.lang.String str13 = response1.header("Location");
        java.lang.String str14 = response1.charset();
        org.jsoup.Connection.Response response16 = response1.removeCookie("hi!");
        response1.contentType = "";
        java.lang.String str20 = response1.getHeaderCaseInsensitive("hi!");
        boolean boolean23 = response1.hasHeaderWithValue("Location", "Location");
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test08223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08223");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        org.jsoup.Connection.Response response8 = response1.cookie("hi!", "");
        java.lang.String str9 = response1.statusMessage();
        java.lang.String str11 = response1.getHeaderCaseInsensitive("Location");
        java.net.URL uRL12 = response1.url();
        java.lang.String str13 = response1.charset();
        response1.executed = true;
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response1);
        boolean boolean18 = response16.hasCookie("hi!");
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(uRL12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test08224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08224");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        int int8 = response1.numRedirects;
        response1.contentType = "hi!";
        java.nio.ByteBuffer byteBuffer11 = response1.byteData;
        java.nio.ByteBuffer byteBuffer12 = null;
        response1.byteData = byteBuffer12;
        org.jsoup.Connection.Response response16 = response1.header("hi!", "hi!");
        org.jsoup.Connection.Method method17 = response1.method();
        boolean boolean19 = response1.hasHeader("hi!");
        response1.numRedirects = (short) 1;
        java.util.Map<java.lang.String, java.lang.String> strMap22 = response1.cookies();
        java.lang.String str24 = response1.header("hi!");
        boolean boolean26 = response1.hasHeader("hi!");
        org.jsoup.Connection.Method method27 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response28 = response1.method(method27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertNull(method17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(strMap22);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test08225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08225");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        response1.executed = false;
        org.jsoup.Connection.Response response11 = response1.header("Location", "");
        int int12 = response1.statusCode;
        boolean boolean14 = response1.hasCookie("hi!");
        java.lang.String str15 = response1.statusMessage;
        java.lang.String str16 = response1.charset();
        response1.numRedirects = (short) 1;
        java.util.Map<java.lang.String, java.lang.String> strMap19 = response1.cookies();
        org.jsoup.Connection.Method method20 = response1.method();
        boolean boolean22 = response1.hasCookie("Location");
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(strMap19);
        org.junit.Assert.assertNull(method20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test08226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08226");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        java.lang.String str7 = response1.statusMessage;
        java.net.URL uRL8 = response1.url();
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(uRL8);
    }

    @Test
    public void test08227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08227");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        response1.charset = "";
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry8 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        response1.statusCode = (byte) 0;
        boolean boolean15 = response1.hasHeaderWithValue("Location", "Location");
        java.lang.String str16 = response1.statusMessage;
        org.jsoup.Connection.Request request17 = null;
        response1.req = request17;
        java.lang.String str19 = response1.statusMessage;
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNotNull(strEntry8);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test08228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08228");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        java.lang.String str8 = response1.contentType();
        int int9 = response1.statusCode;
        org.jsoup.Connection.Request request10 = null;
        response1.req = request10;
        response1.executed = false;
        org.jsoup.Connection.Request request14 = response1.req;
        response1.charset = "hi!";
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(request14);
    }

    @Test
    public void test08229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08229");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        org.jsoup.Connection.Response response8 = response1.cookie("hi!", "");
        org.jsoup.Connection.Response response11 = response1.cookie("Location", "");
        boolean boolean14 = response1.hasHeaderWithValue("hi!", "");
        org.jsoup.Connection.Method method15 = response1.method();
        org.jsoup.Connection.Response response17 = response1.removeHeader("hi!");
        org.jsoup.Connection.Response response20 = response1.header("hi!", "Location");
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertNotNull(response17);
        org.junit.Assert.assertNotNull(response20);
    }

    @Test
    public void test08230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08230");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        response1.charset = "";
        response1.statusMessage = "";
        java.lang.String str10 = response1.header("");
        int int11 = response1.statusCode;
        java.lang.String str12 = response1.contentType;
        response1.statusCode = (short) 1;
        java.lang.String str15 = response1.contentType();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry17 = response1.scanHeaders("hi!");
        boolean boolean18 = response1.executed;
        org.jsoup.Connection.Request request19 = response1.req;
        org.jsoup.Connection.Method method20 = response1.method();
        java.lang.String str22 = response1.cookie("hi!");
        response1.executed = false;
        java.lang.String str26 = response1.getHeaderCaseInsensitive("");
        boolean boolean27 = response1.executed;
        java.lang.Class<?> wildcardClass28 = response1.getClass();
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(strEntry17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(request19);
        org.junit.Assert.assertNull(method20);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test08231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08231");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        org.jsoup.Connection.Request request4 = null;
        response1.req = request4;
        java.lang.String str6 = response1.statusMessage;
        java.lang.String str8 = response1.header("");
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response1);
        int int10 = response1.statusCode;
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test08232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08232");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.numRedirects = (byte) -1;
        java.lang.String str4 = response1.statusMessage;
        response1.contentType = "hi!";
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry9 = response1.scanHeaders("");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(strEntry9);
    }

    @Test
    public void test08233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08233");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        boolean boolean6 = response1.hasCookie("hi!");
        response1.charset = "hi!";
        org.jsoup.Connection.Method method9 = response1.method();
        org.jsoup.Connection.Method method10 = response1.method();
        java.lang.String str12 = response1.getHeaderCaseInsensitive("");
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test08234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08234");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        java.lang.String str8 = response1.cookie("hi!");
        java.lang.String str10 = response1.header("");
        java.net.URL uRL11 = response1.url();
        response1.contentType = "";
        java.nio.ByteBuffer byteBuffer14 = response1.byteData;
        boolean boolean16 = response1.hasHeader("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response18 = response1.removeHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertNull(byteBuffer14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test08235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08235");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        java.lang.String str8 = response1.contentType();
        response1.charset = "hi!";
        int int11 = response1.numRedirects;
        java.lang.String str13 = response1.getHeaderCaseInsensitive("");
        java.util.Map<java.lang.String, java.lang.String> strMap14 = response1.cookies();
        org.jsoup.Connection.Request request15 = response1.req;
        java.lang.String str16 = response1.contentType;
        java.lang.String str18 = response1.getHeaderCaseInsensitive("hi!");
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNull(request15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test08236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08236");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        org.jsoup.Connection.Response response8 = response1.cookie("hi!", "");
        java.lang.String str9 = response1.statusMessage();
        org.jsoup.Connection.Method method10 = response1.method();
        response1.numRedirects = ' ';
        org.jsoup.Connection.Method method13 = response1.method();
        org.jsoup.Connection.Request request14 = null;
        response1.req = request14;
        java.lang.String str16 = response1.contentType;
        int int17 = response1.numRedirects;
        java.lang.String str18 = response1.charset();
        boolean boolean19 = response1.executed;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry21 = response1.scanHeaders("");
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNull(method13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 32 + "'", int17 == 32);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(strEntry21);
    }

    @Test
    public void test08237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08237");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        org.jsoup.Connection.Response response8 = response1.cookie("hi!", "");
        java.lang.String str9 = response1.statusMessage();
        java.lang.String str10 = response1.contentType;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry12 = response1.scanHeaders("");
        int int13 = response1.statusCode;
        org.jsoup.Connection.Request request14 = null;
        response1.req = request14;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = response1.hasHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(strEntry12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test08238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08238");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        org.jsoup.Connection.Response response8 = response1.cookie("hi!", "");
        java.net.URL uRL9 = response1.url();
        java.nio.ByteBuffer byteBuffer10 = null;
        response1.byteData = byteBuffer10;
        response1.charset = "hi!";
        response1.statusCode = 'a';
        java.nio.ByteBuffer byteBuffer16 = null;
        response1.byteData = byteBuffer16;
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(uRL9);
    }

    @Test
    public void test08239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08239");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        response1.charset = "";
        response1.statusMessage = "";
        response1.charset = "Location";
        response1.statusMessage = "hi!";
        java.net.URL uRL13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response14 = response1.url(uRL13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
    }

    @Test
    public void test08240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08240");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        int int8 = response1.numRedirects;
        response1.contentType = "hi!";
        java.nio.ByteBuffer byteBuffer11 = response1.byteData;
        java.lang.String str12 = response1.contentType;
        org.jsoup.Connection.Response response15 = response1.cookie("Location", "Location");
        int int16 = response1.numRedirects;
        int int17 = response1.numRedirects;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry19 = response1.scanHeaders("");
        java.nio.ByteBuffer byteBuffer20 = null;
        response1.byteData = byteBuffer20;
        java.util.Map<java.lang.String, java.lang.String> strMap22 = response1.cookies();
        java.net.URL uRL23 = response1.url();
        response1.statusCode = 0;
        java.lang.String str27 = response1.header("");
        java.lang.String str28 = response1.charset();
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(strEntry19);
        org.junit.Assert.assertNotNull(strMap22);
        org.junit.Assert.assertNull(uRL23);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
    }

    @Test
    public void test08241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08241");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        int int8 = response1.numRedirects;
        response1.contentType = "hi!";
        java.nio.ByteBuffer byteBuffer11 = response1.byteData;
        java.nio.ByteBuffer byteBuffer12 = null;
        response1.byteData = byteBuffer12;
        org.jsoup.Connection.Response response16 = response1.header("hi!", "hi!");
        org.jsoup.Connection.Method method17 = response1.method();
        response1.numRedirects = (byte) 0;
        java.util.Map<java.lang.String, java.lang.String> strMap20 = response1.cookies();
        org.jsoup.Connection.Response response22 = response1.removeHeader("hi!");
        org.jsoup.Connection.Request request23 = response1.req;
        java.nio.ByteBuffer byteBuffer24 = response1.byteData;
        java.net.URL uRL25 = response1.url();
        response1.executed = true;
        org.jsoup.helper.HttpConnection.Response response28 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Response response30 = response28.removeCookie("hi!");
        org.jsoup.Connection.Method method31 = response28.method();
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertNull(method17);
        org.junit.Assert.assertNotNull(strMap20);
        org.junit.Assert.assertNotNull(response22);
        org.junit.Assert.assertNull(request23);
        org.junit.Assert.assertNull(byteBuffer24);
        org.junit.Assert.assertNull(uRL25);
        org.junit.Assert.assertNotNull(response30);
        org.junit.Assert.assertNull(method31);
    }

    @Test
    public void test08242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08242");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        response1.executed = false;
        java.lang.String str9 = response1.charset;
        response1.charset = "";
        org.jsoup.Connection.Response response14 = response1.cookie("Location", "hi!");
        org.jsoup.Connection.Request request15 = null;
        response1.req = request15;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = response1.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(response14);
    }

    @Test
    public void test08243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08243");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        int int8 = response1.numRedirects;
        response1.contentType = "hi!";
        java.nio.ByteBuffer byteBuffer11 = response1.byteData;
        java.lang.String str12 = response1.contentType;
        org.jsoup.Connection.Response response15 = response1.cookie("Location", "Location");
        int int16 = response1.numRedirects;
        java.lang.String str18 = response1.cookie("Location");
        int int19 = response1.statusCode;
        boolean boolean22 = response1.hasHeaderWithValue("Location", "Location");
        java.lang.String str23 = response1.contentType;
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Location" + "'", str18, "Location");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
    }

    @Test
    public void test08244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08244");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        response1.charset = "";
        boolean boolean9 = response1.hasHeaderWithValue("hi!", "");
        org.jsoup.Connection.Response response11 = response1.removeCookie("hi!");
        org.jsoup.Connection.Request request12 = null;
        response1.req = request12;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document14 = response1.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(response11);
    }

    @Test
    public void test08245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08245");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.numRedirects = (byte) -1;
        java.lang.String str4 = response1.statusMessage;
        org.jsoup.Connection.Request request5 = response1.req;
        boolean boolean8 = response1.hasHeaderWithValue("Location", "hi!");
        org.jsoup.Connection.Method method9 = response1.method();
        java.util.Map<java.lang.String, java.lang.String> strMap10 = response1.cookies();
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry13 = response1.scanHeaders("Location");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(request5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNull(strEntry13);
    }

    @Test
    public void test08246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08246");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        response1.statusMessage = "hi!";
        boolean boolean11 = response1.hasHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str13 = response12.statusMessage();
        java.lang.String str15 = response12.header("hi!");
        org.jsoup.Connection.Response response18 = response12.cookie("Location", "Location");
        java.lang.String str20 = response12.cookie("Location");
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(response18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Location" + "'", str20, "Location");
    }

    @Test
    public void test08247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08247");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        java.lang.String str8 = response1.contentType();
        java.lang.String str9 = response1.contentType;
        boolean boolean11 = response1.hasHeader("hi!");
        java.net.URL uRL12 = response1.url();
        boolean boolean14 = response1.hasCookie("Location");
        org.jsoup.Connection.Response response17 = response1.header("hi!", "");
        org.jsoup.Connection.Response response20 = response1.header("Location", "hi!");
        response1.charset = "Location";
        response1.charset = "";
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(uRL12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(response17);
        org.junit.Assert.assertNotNull(response20);
    }

    @Test
    public void test08248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08248");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        org.jsoup.Connection.Response response8 = response1.cookie("hi!", "");
        java.lang.String str9 = response1.statusMessage();
        org.jsoup.Connection.Request request10 = response1.req;
        java.net.URL uRL11 = response1.url();
        java.lang.String str12 = response1.statusMessage;
        java.lang.String str13 = response1.charset;
        org.jsoup.Connection.Method method14 = response1.method();
        org.jsoup.Connection.Method method15 = response1.method();
        boolean boolean17 = response1.hasHeader("Location");
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(request10);
        org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(method14);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test08249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08249");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        int int8 = response1.numRedirects;
        response1.contentType = "hi!";
        response1.charset = "Location";
        java.lang.String str13 = response1.charset;
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray14 = response1.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Location" + "'", str13, "Location");
    }

    @Test
    public void test08250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08250");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        org.jsoup.Connection.Request request4 = null;
        response1.req = request4;
        java.lang.String str6 = response1.charset;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry8 = response1.scanHeaders("");
        java.nio.ByteBuffer byteBuffer9 = response1.byteData;
        org.jsoup.Connection.Response response12 = response1.cookie("hi!", "");
        java.lang.String str13 = response1.contentType();
        java.util.Map<java.lang.String, java.lang.String> strMap14 = response1.cookies();
        java.lang.String str15 = response1.contentType();
        java.lang.String str17 = response1.header("");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(strEntry8);
        org.junit.Assert.assertNull(byteBuffer9);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test08251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08251");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        response1.charset = "";
        response1.statusMessage = "";
        java.lang.String str10 = response1.header("");
        java.net.URL uRL11 = response1.url();
        java.lang.String str12 = response1.contentType;
        java.util.Map<java.lang.String, java.lang.String> strMap13 = response1.headers();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry15 = response1.scanHeaders("");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = response1.hasHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertNull(strEntry15);
    }

    @Test
    public void test08252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08252");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.nio.ByteBuffer byteBuffer2 = null;
        response1.byteData = byteBuffer2;
        response1.charset = "";
        response1.statusMessage = "hi!";
        java.lang.String str8 = response1.charset;
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test08253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08253");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        int int8 = response1.numRedirects;
        response1.contentType = "hi!";
        java.nio.ByteBuffer byteBuffer11 = response1.byteData;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry13 = response1.scanHeaders("");
        java.lang.String str15 = response1.header("Location");
        response1.statusCode = (byte) 100;
        java.lang.String str18 = response1.contentType;
        boolean boolean20 = response1.hasCookie("hi!");
        response1.executed = false;
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertNull(strEntry13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test08254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08254");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        org.jsoup.Connection.Request request5 = null;
        response1.req = request5;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry8 = response1.scanHeaders("Location");
        boolean boolean11 = response1.hasHeaderWithValue("hi!", "");
        java.util.Map<java.lang.String, java.lang.String> strMap12 = response1.headers();
        java.nio.ByteBuffer byteBuffer13 = response1.byteData;
        java.lang.String str14 = response1.charset();
        int int15 = response1.numRedirects;
        org.jsoup.Connection.Method method16 = response1.method();
        org.jsoup.Connection.Request request17 = null;
        response1.req = request17;
        java.lang.String str19 = response1.charset;
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(strEntry8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertNull(byteBuffer13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(method16);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test08255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08255");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        int int8 = response1.numRedirects;
        response1.contentType = "hi!";
        java.nio.ByteBuffer byteBuffer11 = response1.byteData;
        java.nio.ByteBuffer byteBuffer12 = null;
        response1.byteData = byteBuffer12;
        org.jsoup.Connection.Response response16 = response1.header("hi!", "hi!");
        org.jsoup.Connection.Method method17 = response1.method();
        java.lang.String str19 = response1.header("hi!");
        java.lang.String str20 = response1.contentType();
        java.nio.ByteBuffer byteBuffer21 = response1.byteData;
        java.nio.ByteBuffer byteBuffer22 = null;
        response1.byteData = byteBuffer22;
        response1.statusCode = (short) 100;
        response1.executed = true;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry29 = response1.scanHeaders("hi!");
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertNull(method17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNull(byteBuffer21);
        org.junit.Assert.assertNotNull(strEntry29);
    }

    @Test
    public void test08256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08256");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        org.jsoup.Connection.Response response8 = response1.cookie("hi!", "");
        java.lang.String str9 = response1.statusMessage();
        java.lang.String str10 = response1.contentType;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry12 = response1.scanHeaders("");
        boolean boolean13 = response1.executed;
        java.lang.String str15 = response1.getHeaderCaseInsensitive("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap16 = response1.cookies();
        boolean boolean18 = response1.hasCookie("hi!");
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(strEntry12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test08257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08257");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        org.jsoup.Connection.Response response8 = response1.cookie("hi!", "");
        java.lang.String str9 = response1.statusMessage();
        org.jsoup.Connection.Request request10 = response1.req;
        response1.numRedirects = 0;
        response1.numRedirects = (byte) 1;
        java.lang.String str15 = response1.charset();
        java.net.URL uRL16 = response1.url();
        boolean boolean18 = response1.hasCookie("hi!");
        java.lang.Class<?> wildcardClass19 = response1.getClass();
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(request10);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(uRL16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test08258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08258");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        int int8 = response1.numRedirects;
        int int9 = response1.statusCode();
        int int10 = response1.numRedirects;
        java.lang.String str11 = response1.contentType;
        java.lang.String str13 = response1.header("hi!");
        org.jsoup.Connection.Method method14 = response1.method();
        org.jsoup.Connection.Response response16 = response1.removeHeader("Location");
        java.lang.String str17 = response1.contentType();
        org.jsoup.Connection.Response response19 = response1.removeCookie("hi!");
        response1.statusCode = 0;
        org.jsoup.helper.HttpConnection.Response response22 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(method14);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(response19);
    }

    @Test
    public void test08259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08259");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        org.jsoup.Connection.Request request5 = null;
        response1.req = request5;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry8 = response1.scanHeaders("Location");
        boolean boolean11 = response1.hasHeaderWithValue("hi!", "");
        response1.statusCode = (short) -1;
        int int14 = response1.numRedirects;
        org.jsoup.Connection.Response response17 = response1.header("Location", "hi!");
        int int18 = response1.statusCode;
        response1.statusCode = 32;
        org.jsoup.Connection.Request request21 = response1.req;
        java.lang.String str22 = response1.statusMessage();
        response1.executed = false;
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(strEntry8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(response17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNull(request21);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test08260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08260");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        response1.charset = "Location";
        org.jsoup.Connection.Response response11 = response1.removeHeader("Location");
        java.lang.Class<?> wildcardClass12 = response11.getClass();
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test08261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08261");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        int int8 = response1.numRedirects;
        response1.contentType = "hi!";
        java.nio.ByteBuffer byteBuffer11 = response1.byteData;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry13 = response1.scanHeaders("");
        java.lang.String str15 = response1.header("Location");
        java.lang.String str16 = response1.statusMessage;
        java.net.URL uRL17 = response1.url();
        java.lang.String str18 = response1.charset;
        java.nio.ByteBuffer byteBuffer19 = null;
        response1.byteData = byteBuffer19;
        org.jsoup.Connection.Response response22 = response1.removeHeader("Location");
        boolean boolean24 = response1.hasHeader("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap25 = response1.cookies();
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertNull(strEntry13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(uRL17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(response22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(strMap25);
    }

    @Test
    public void test08262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08262");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        response1.charset = "";
        response1.statusMessage = "";
        java.lang.String str10 = response1.getHeaderCaseInsensitive("");
        boolean boolean11 = response1.executed;
        int int12 = response1.numRedirects;
        java.nio.ByteBuffer byteBuffer13 = response1.byteData;
        java.lang.String str15 = response1.header("");
        java.lang.String str16 = response1.contentType;
        java.net.URL uRL17 = response1.url();
        java.lang.String str18 = response1.contentType;
        response1.statusMessage = "hi!";
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(byteBuffer13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(uRL17);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test08263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08263");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        response1.executed = false;
        org.jsoup.Connection.Response response11 = response1.header("Location", "");
        int int12 = response1.statusCode();
        boolean boolean15 = response1.hasHeaderWithValue("Location", "Location");
        java.lang.String str16 = response1.contentType();
        java.lang.String str17 = response1.contentType;
        response1.statusMessage = "";
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test08264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08264");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        org.jsoup.Connection.Request request5 = null;
        response1.req = request5;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry8 = response1.scanHeaders("Location");
        java.lang.String str9 = response1.contentType;
        java.util.Map<java.lang.String, java.lang.String> strMap10 = response1.headers();
        response1.statusMessage = "hi!";
        org.jsoup.Connection.Method method13 = response1.method();
        org.jsoup.Connection.Request request14 = null;
        response1.req = request14;
        int int16 = response1.statusCode;
        java.nio.ByteBuffer byteBuffer17 = response1.byteData;
        java.nio.ByteBuffer byteBuffer18 = null;
        response1.byteData = byteBuffer18;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document20 = response1.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(strEntry8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNull(method13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(byteBuffer17);
    }

    @Test
    public void test08265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08265");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        boolean boolean6 = response1.hasCookie("hi!");
        response1.executed = true;
        java.nio.ByteBuffer byteBuffer9 = response1.byteData;
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(byteBuffer9);
    }

    @Test
    public void test08266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08266");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        org.jsoup.Connection.Request request4 = null;
        response1.req = request4;
        java.net.URL uRL6 = response1.url();
        org.jsoup.Connection.Request request7 = response1.req;
        java.lang.String str9 = response1.cookie("Location");
        java.lang.String str10 = response1.contentType;
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.util.Map<java.lang.String, java.lang.String> strMap12 = response11.headers();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document13 = response11.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(request7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(strMap12);
    }

    @Test
    public void test08267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08267");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        response1.charset = "";
        response1.statusMessage = "";
        java.lang.String str10 = response1.getHeaderCaseInsensitive("");
        boolean boolean13 = response1.hasHeaderWithValue("Location", "");
        response1.executed = false;
        java.lang.String str17 = response1.cookie("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap18 = response1.cookies();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry20 = response1.scanHeaders("hi!");
        org.jsoup.Connection.Response response23 = response1.header("Location", "");
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(strMap18);
        org.junit.Assert.assertNotNull(strEntry20);
        org.junit.Assert.assertNotNull(response23);
    }

    @Test
    public void test08268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08268");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        int int8 = response1.numRedirects;
        response1.contentType = "hi!";
        java.nio.ByteBuffer byteBuffer11 = response1.byteData;
        java.lang.String str12 = response1.statusMessage();
        org.jsoup.Connection.Response response14 = response1.removeHeader("hi!");
        boolean boolean16 = response1.hasCookie("hi!");
        java.lang.String str17 = response1.charset;
        int int18 = response1.numRedirects;
        java.lang.String str19 = response1.statusMessage;
        java.net.URL uRL20 = response1.url();
        java.lang.String str22 = response1.cookie("Location");
        java.net.HttpURLConnection httpURLConnection23 = null;
        org.jsoup.helper.HttpConnection.Response response24 = null;
        org.jsoup.helper.HttpConnection.Response response25 = new org.jsoup.helper.HttpConnection.Response(response24);
        org.jsoup.Connection.Request request26 = null;
        response25.req = request26;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry29 = response25.scanHeaders("hi!");
        response25.charset = "hi!";
        int int32 = response25.numRedirects;
        response25.contentType = "hi!";
        java.nio.ByteBuffer byteBuffer35 = response25.byteData;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry37 = response25.scanHeaders("");
        response25.numRedirects = (short) 10;
        response25.contentType = "";
        boolean boolean43 = response25.hasCookie("hi!");
        response25.charset = "hi!";
        boolean boolean46 = response25.executed;
        // The following exception was thrown during execution in test generation
        try {
            response1.setupFromConnection(httpURLConnection23, (org.jsoup.Connection.Response) response25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(uRL20);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(strEntry29);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNull(byteBuffer35);
        org.junit.Assert.assertNull(strEntry37);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    }

    @Test
    public void test08269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08269");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.numRedirects = (byte) -1;
        java.lang.String str4 = response1.statusMessage;
        response1.contentType = "hi!";
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = response8.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test08270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08270");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        org.jsoup.Connection.Response response8 = response1.cookie("hi!", "");
        org.jsoup.Connection.Response response11 = response1.cookie("Location", "");
        boolean boolean14 = response1.hasHeaderWithValue("hi!", "");
        java.lang.String str15 = response1.contentType;
        java.util.Map<java.lang.String, java.lang.String> strMap16 = response1.headers();
        org.jsoup.Connection.Response response18 = response1.removeCookie("Location");
        org.jsoup.Connection.Request request19 = response1.req;
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertNotNull(response18);
        org.junit.Assert.assertNull(request19);
    }

    @Test
    public void test08271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08271");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        response1.charset = "";
        response1.statusMessage = "";
        java.lang.String str10 = response1.getHeaderCaseInsensitive("");
        response1.charset = "hi!";
        int int13 = response1.statusCode();
        int int14 = response1.statusCode;
        org.jsoup.Connection.Method method15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response16 = response1.method(method15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test08272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08272");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Request request3 = null;
        response2.req = request3;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry6 = response2.scanHeaders("hi!");
        response2.charset = "hi!";
        java.lang.String str9 = response2.contentType();
        java.lang.String str10 = response2.contentType;
        int int11 = response2.statusCode();
        java.nio.ByteBuffer byteBuffer12 = response2.byteData;
        org.jsoup.Connection.Request request13 = null;
        response2.req = request13;
        java.lang.String str16 = response2.getHeaderCaseInsensitive("");
        response2.executed = false;
        java.lang.String str19 = response2.charset();
        java.lang.String str20 = response2.charset;
        java.lang.String str21 = response2.charset();
        response2.executed = true;
        int int24 = response2.statusCode();
        java.net.URL uRL25 = response2.url();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response26 = org.jsoup.helper.HttpConnection.Response.execute(request0, response2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(byteBuffer12);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNull(uRL25);
    }

    @Test
    public void test08273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08273");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        org.jsoup.Connection.Response response8 = response1.cookie("hi!", "");
        java.lang.String str10 = response1.cookie("hi!");
        boolean boolean11 = response1.executed;
        response1.contentType = "";
        java.net.URL uRL14 = response1.url();
        java.net.URL uRL15 = response1.url();
        boolean boolean18 = response1.hasHeaderWithValue("Location", "");
        java.lang.String str19 = response1.charset();
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(uRL14);
        org.junit.Assert.assertNull(uRL15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test08274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08274");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        java.lang.String str7 = response1.contentType();
        java.lang.String str9 = response1.header("hi!");
        java.nio.ByteBuffer byteBuffer10 = response1.byteData;
        int int11 = response1.statusCode;
        java.lang.String str12 = response1.charset;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry14 = response1.scanHeaders("Location");
        org.jsoup.Connection.Method method15 = response1.method();
        org.jsoup.Connection.Method method16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response17 = response1.method(method16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(byteBuffer10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(strEntry14);
        org.junit.Assert.assertNull(method15);
    }

    @Test
    public void test08275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08275");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        java.lang.String str7 = response1.contentType();
        int int8 = response1.numRedirects;
        int int9 = response1.statusCode();
        java.lang.String str11 = response1.cookie("Location");
        org.jsoup.Connection.Request request12 = null;
        response1.req = request12;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = response1.hasHeaderWithValue("", "Location");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test08276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08276");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        int int8 = response1.numRedirects;
        response1.contentType = "hi!";
        java.nio.ByteBuffer byteBuffer11 = response1.byteData;
        java.lang.String str12 = response1.contentType;
        int int13 = response1.numRedirects;
        response1.executed = false;
        response1.statusCode = '4';
        response1.contentType = "";
        java.lang.String str20 = response1.statusMessage();
        java.nio.ByteBuffer byteBuffer21 = null;
        response1.byteData = byteBuffer21;
        boolean boolean23 = response1.executed;
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test08277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08277");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        response1.statusMessage = "hi!";
        java.lang.String str10 = response1.statusMessage();
        java.lang.String str11 = response1.charset;
        response1.numRedirects = 35;
        org.jsoup.Connection.Method method14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response15 = response1.method(method14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test08278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08278");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        java.lang.String str7 = response1.contentType();
        int int8 = response1.numRedirects;
        response1.statusCode = (short) 0;
        java.util.Map<java.lang.String, java.lang.String> strMap11 = response1.cookies();
        org.jsoup.Connection.Request request12 = null;
        response1.req = request12;
        boolean boolean15 = response1.hasHeader("hi!");
        org.jsoup.Connection.Response response18 = response1.header("hi!", "Location");
        response1.numRedirects = 100;
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(response18);
    }

    @Test
    public void test08279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08279");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        org.jsoup.Connection.Response response6 = response1.removeCookie("Location");
        java.lang.String str8 = response1.getHeaderCaseInsensitive("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap9 = response1.headers();
        org.jsoup.Connection.Request request10 = null;
        response1.req = request10;
        org.jsoup.Connection.Response response13 = response1.removeCookie("hi!");
        response1.executed = true;
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNotNull(response13);
    }

    @Test
    public void test08280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08280");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        boolean boolean6 = response1.hasCookie("hi!");
        org.jsoup.Connection.Response response9 = response1.header("Location", "");
        java.lang.Class<?> wildcardClass10 = response9.getClass();
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test08281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08281");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        response1.executed = false;
        org.jsoup.Connection.Response response11 = response1.header("Location", "");
        int int12 = response1.statusCode;
        java.lang.String str13 = response1.charset();
        org.jsoup.Connection.Response response16 = response1.header("hi!", "hi!");
        java.lang.String str17 = response1.statusMessage;
        response1.numRedirects = 100;
        int int20 = response1.statusCode;
        org.jsoup.Connection.Response response23 = response1.cookie("Location", "Location");
        response1.charset = "";
        java.net.HttpURLConnection httpURLConnection26 = null;
        org.jsoup.helper.HttpConnection.Response response27 = null;
        org.jsoup.helper.HttpConnection.Response response28 = new org.jsoup.helper.HttpConnection.Response(response27);
        org.jsoup.Connection.Response response31 = response28.header("hi!", "");
        org.jsoup.Connection.Response response33 = response28.removeCookie("Location");
        response28.statusCode = '#';
        boolean boolean36 = response28.executed;
        java.lang.String str37 = response28.contentType();
        response28.charset = "hi!";
        boolean boolean40 = response28.executed;
        org.jsoup.Connection.Response response42 = response28.removeCookie("hi!");
        response28.numRedirects = (byte) 100;
        java.util.Map<java.lang.String, java.lang.String> strMap45 = response28.cookies();
        // The following exception was thrown during execution in test generation
        try {
            response1.setupFromConnection(httpURLConnection26, (org.jsoup.Connection.Response) response28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(response23);
        org.junit.Assert.assertNotNull(response31);
        org.junit.Assert.assertNotNull(response33);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(response42);
        org.junit.Assert.assertNotNull(strMap45);
    }

    @Test
    public void test08282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08282");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Request request3 = null;
        response2.req = request3;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry6 = response2.scanHeaders("hi!");
        response2.charset = "hi!";
        int int9 = response2.numRedirects;
        response2.contentType = "hi!";
        java.nio.ByteBuffer byteBuffer12 = response2.byteData;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry14 = response2.scanHeaders("");
        java.lang.String str16 = response2.header("Location");
        java.lang.String str17 = response2.statusMessage;
        java.lang.String str18 = response2.statusMessage();
        org.jsoup.Connection.Response response20 = response2.removeCookie("Location");
        int int21 = response2.statusCode();
        response2.executed = true;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response24 = org.jsoup.helper.HttpConnection.Response.execute(request0, response2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(byteBuffer12);
        org.junit.Assert.assertNull(strEntry14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(response20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test08283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08283");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.charset = "Location";
        int int4 = response1.numRedirects;
        java.nio.ByteBuffer byteBuffer5 = response1.byteData;
        java.lang.String str7 = response1.header("");
        boolean boolean9 = response1.hasCookie("hi!");
        org.jsoup.Connection.Response response12 = response1.cookie("hi!", "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(byteBuffer5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(response12);
    }

    @Test
    public void test08284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08284");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        response1.executed = false;
        org.jsoup.Connection.Response response11 = response1.header("Location", "");
        int int12 = response1.statusCode;
        boolean boolean13 = response1.executed;
        response1.statusMessage = "hi!";
        org.jsoup.Connection.Method method16 = response1.method();
        org.jsoup.Connection.Response response18 = response1.removeHeader("Location");
        java.nio.ByteBuffer byteBuffer19 = response1.byteData;
        org.jsoup.Connection.Request request20 = response1.req;
        org.jsoup.Connection.Request request21 = response1.req;
        response1.executed = false;
        boolean boolean25 = response1.hasHeader("Location");
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(method16);
        org.junit.Assert.assertNotNull(response18);
        org.junit.Assert.assertNull(byteBuffer19);
        org.junit.Assert.assertNull(request20);
        org.junit.Assert.assertNull(request21);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test08285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08285");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Response response5 = response2.header("hi!", "");
        response2.charset = "";
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry9 = response2.scanHeaders("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap10 = response2.cookies();
        java.nio.ByteBuffer byteBuffer11 = response2.byteData;
        java.nio.ByteBuffer byteBuffer12 = null;
        response2.byteData = byteBuffer12;
        java.lang.String str14 = response2.charset();
        java.nio.ByteBuffer byteBuffer15 = null;
        response2.byteData = byteBuffer15;
        org.jsoup.Connection.Request request17 = response2.req;
        org.jsoup.Connection.Response response19 = response2.removeHeader("Location");
        response2.statusMessage = "Location";
        response2.statusCode = 52;
        int int24 = response2.statusCode;
        response2.charset = "hi!";
        java.lang.String str27 = response2.statusMessage;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response28 = org.jsoup.helper.HttpConnection.Response.execute(request0, response2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNotNull(strEntry9);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(request17);
        org.junit.Assert.assertNotNull(response19);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 52 + "'", int24 == 52);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Location" + "'", str27, "Location");
    }

    @Test
    public void test08286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08286");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        org.jsoup.Connection.Response response8 = response1.cookie("hi!", "");
        java.lang.String str9 = response1.statusMessage();
        org.jsoup.Connection.Request request10 = response1.req;
        java.net.URL uRL11 = response1.url();
        java.lang.String str12 = response1.contentType();
        response1.contentType = "hi!";
        java.net.URL uRL15 = response1.url();
        boolean boolean17 = response1.hasHeader("hi!");
        java.lang.String str18 = response1.charset;
        java.lang.String str19 = response1.statusMessage;
        java.net.URL uRL20 = response1.url();
        response1.statusMessage = "hi!";
        java.util.Map<java.lang.String, java.lang.String> strMap23 = response1.cookies();
        org.jsoup.Connection.Response response26 = response1.cookie("hi!", "");
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(request10);
        org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(uRL15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(uRL20);
        org.junit.Assert.assertNotNull(strMap23);
        org.junit.Assert.assertNotNull(response26);
    }

    @Test
    public void test08287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08287");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        org.jsoup.Connection.Response response8 = response1.cookie("hi!", "");
        java.net.URL uRL9 = response1.url();
        java.nio.ByteBuffer byteBuffer10 = null;
        response1.byteData = byteBuffer10;
        java.lang.String str13 = response1.header("Location");
        java.lang.String str14 = response1.charset();
        org.jsoup.Connection.Response response16 = response1.removeCookie("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document17 = response1.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(response16);
    }

    @Test
    public void test08288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08288");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        org.jsoup.Connection.Request request5 = null;
        response1.req = request5;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry8 = response1.scanHeaders("Location");
        boolean boolean11 = response1.hasHeaderWithValue("hi!", "");
        response1.statusCode = (short) -1;
        java.net.URL uRL14 = response1.url();
        java.lang.String str15 = response1.contentType;
        int int16 = response1.statusCode;
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str18 = response1.contentType();
        response1.contentType = "";
        org.jsoup.Connection.Response response22 = response1.removeCookie("Location");
        int int23 = response1.numRedirects;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str25 = response1.cookie("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(strEntry8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(uRL14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(response22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test08289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08289");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        java.lang.String str8 = response1.contentType();
        java.lang.String str9 = response1.contentType;
        int int10 = response1.statusCode();
        java.nio.ByteBuffer byteBuffer11 = response1.byteData;
        org.jsoup.Connection.Request request12 = null;
        response1.req = request12;
        java.lang.String str15 = response1.getHeaderCaseInsensitive("");
        response1.executed = false;
        java.lang.String str18 = response1.charset();
        java.lang.String str19 = response1.charset;
        response1.contentType = "";
        boolean boolean22 = response1.executed;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry24 = response1.scanHeaders("");
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(strEntry24);
    }

    @Test
    public void test08290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08290");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        int int8 = response1.numRedirects;
        response1.contentType = "hi!";
        java.nio.ByteBuffer byteBuffer11 = response1.byteData;
        java.nio.ByteBuffer byteBuffer12 = null;
        response1.byteData = byteBuffer12;
        org.jsoup.Connection.Response response16 = response1.header("hi!", "hi!");
        org.jsoup.Connection.Method method17 = response1.method();
        boolean boolean19 = response1.hasHeader("hi!");
        response1.numRedirects = (short) 1;
        response1.numRedirects = 32;
        java.lang.String str25 = response1.header("");
        response1.statusMessage = "";
        java.lang.String str28 = response1.contentType();
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertNull(method17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
    }

    @Test
    public void test08291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08291");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        int int8 = response1.numRedirects;
        response1.contentType = "hi!";
        java.nio.ByteBuffer byteBuffer11 = response1.byteData;
        java.lang.String str12 = response1.contentType;
        org.jsoup.Connection.Response response15 = response1.cookie("Location", "Location");
        int int16 = response1.numRedirects;
        int int17 = response1.numRedirects;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry19 = response1.scanHeaders("");
        java.nio.ByteBuffer byteBuffer20 = null;
        response1.byteData = byteBuffer20;
        java.lang.String str23 = response1.cookie("hi!");
        response1.statusMessage = "";
        java.lang.String str26 = response1.charset();
        java.nio.ByteBuffer byteBuffer27 = response1.byteData;
        boolean boolean28 = response1.executed;
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(strEntry19);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertNull(byteBuffer27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test08292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08292");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        org.jsoup.Connection.Response response8 = response1.cookie("hi!", "");
        java.lang.String str9 = response1.statusMessage();
        org.jsoup.Connection.Request request10 = response1.req;
        java.net.URL uRL11 = response1.url();
        java.lang.String str12 = response1.contentType();
        response1.contentType = "hi!";
        java.net.URL uRL15 = response1.url();
        java.nio.ByteBuffer byteBuffer16 = response1.byteData;
        java.lang.String str18 = response1.header("Location");
        int int19 = response1.statusCode;
        org.jsoup.Connection.Method method20 = response1.method();
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(request10);
        org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(uRL15);
        org.junit.Assert.assertNull(byteBuffer16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNull(method20);
    }

    @Test
    public void test08293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08293");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        response1.charset = "";
        response1.statusMessage = "";
        java.util.Map<java.lang.String, java.lang.String> strMap9 = response1.headers();
        boolean boolean10 = response1.executed;
        int int11 = response1.numRedirects;
        org.jsoup.Connection.Method method12 = response1.method();
        java.lang.String str14 = response1.header("Location");
        response1.statusCode = '4';
        java.net.HttpURLConnection httpURLConnection17 = null;
        org.jsoup.helper.HttpConnection.Response response18 = null;
        org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response(response18);
        org.jsoup.Connection.Request request20 = null;
        response19.req = request20;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry23 = response19.scanHeaders("hi!");
        response19.charset = "hi!";
        int int26 = response19.numRedirects;
        response19.contentType = "hi!";
        java.nio.ByteBuffer byteBuffer29 = response19.byteData;
        java.lang.String str30 = response19.contentType;
        java.lang.String str31 = response19.charset();
        int int32 = response19.statusCode;
        response19.executed = false;
        java.lang.String str35 = response19.statusMessage();
        response19.contentType = "hi!";
        org.jsoup.Connection.Response response40 = response19.cookie("hi!", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            response1.setupFromConnection(httpURLConnection17, response40);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(method12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(strEntry23);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNull(byteBuffer29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNotNull(response40);
    }

    @Test
    public void test08294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08294");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        org.jsoup.Connection.Response response8 = response1.cookie("hi!", "");
        java.net.URL uRL9 = response1.url();
        java.nio.ByteBuffer byteBuffer10 = null;
        response1.byteData = byteBuffer10;
        java.lang.String str13 = response1.header("Location");
        java.lang.String str14 = response1.charset();
        response1.executed = true;
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray17 = response1.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test08295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08295");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        response1.charset = "";
        response1.statusMessage = "";
        java.lang.String str10 = response1.header("");
        int int11 = response1.statusCode;
        org.jsoup.Connection.Response response13 = response1.removeCookie("hi!");
        java.lang.String str15 = response1.cookie("hi!");
        java.lang.String str16 = response1.charset();
        int int17 = response1.numRedirects;
        java.lang.String str18 = response1.contentType;
        java.lang.Class<?> wildcardClass19 = response1.getClass();
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test08296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08296");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        response1.charset = "";
        response1.statusMessage = "";
        java.lang.String str10 = response1.header("");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry12 = response1.scanHeaders("");
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(strEntry12);
    }

    @Test
    public void test08297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08297");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        java.lang.String str8 = response1.contentType();
        int int9 = response1.statusCode;
        int int10 = response1.statusCode;
        java.lang.String str12 = response1.header("");
        org.jsoup.Connection.Request request13 = null;
        response1.req = request13;
        org.jsoup.Connection.Response response16 = response1.removeHeader("Location");
        java.lang.String str18 = response1.header("hi!");
        int int19 = response1.statusCode;
        response1.executed = false;
        response1.charset = "hi!";
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry25 = response1.scanHeaders("hi!");
        java.lang.String str26 = response1.charset();
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNull(strEntry25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
    }

    @Test
    public void test08298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08298");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        org.jsoup.Connection.Response response8 = response1.cookie("hi!", "");
        java.lang.String str9 = response1.statusMessage();
        org.jsoup.Connection.Request request10 = response1.req;
        java.net.URL uRL11 = response1.url();
        java.lang.String str12 = response1.contentType();
        java.lang.String str13 = response1.charset;
        java.lang.String str14 = response1.charset();
        response1.executed = false;
        java.lang.String str18 = response1.header("");
        response1.statusMessage = "hi!";
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = response1.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(request10);
        org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test08299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08299");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        org.jsoup.Connection.Response response8 = response1.removeHeader("Location");
        java.lang.String str9 = response1.contentType;
        java.util.Map<java.lang.String, java.lang.String> strMap10 = response1.cookies();
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response1);
        response1.contentType = "";
        java.lang.String str14 = response1.charset;
        org.jsoup.Connection.Method method15 = response1.method();
        java.lang.String str16 = response1.charset;
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test08300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08300");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        boolean boolean9 = response1.hasCookie("hi!");
        java.lang.String str10 = response1.charset();
        response1.statusCode = (byte) 0;
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = response1.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test08301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08301");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        response1.statusCode = 10;
        int int9 = response1.numRedirects;
        boolean boolean10 = response1.executed;
        java.lang.String str11 = response1.contentType();
        int int12 = response1.statusCode();
        response1.contentType = "Location";
        org.jsoup.Connection.Request request15 = null;
        response1.req = request15;
        java.nio.ByteBuffer byteBuffer17 = response1.byteData;
        org.jsoup.Connection.Response response20 = response1.cookie("Location", "Location");
        response1.contentType = "hi!";
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertNull(byteBuffer17);
        org.junit.Assert.assertNotNull(response20);
    }

    @Test
    public void test08302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08302");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        int int8 = response1.numRedirects;
        response1.contentType = "hi!";
        java.nio.ByteBuffer byteBuffer11 = response1.byteData;
        java.nio.ByteBuffer byteBuffer12 = null;
        response1.byteData = byteBuffer12;
        org.jsoup.Connection.Response response16 = response1.header("hi!", "hi!");
        org.jsoup.Connection.Method method17 = response1.method();
        java.lang.String str19 = response1.header("hi!");
        java.lang.String str20 = response1.contentType();
        java.nio.ByteBuffer byteBuffer21 = response1.byteData;
        org.jsoup.Connection.Method method22 = response1.method();
        org.jsoup.Connection.Response response24 = response1.removeCookie("Location");
        java.nio.ByteBuffer byteBuffer25 = null;
        response1.byteData = byteBuffer25;
        java.lang.String str27 = response1.charset;
        java.lang.String str28 = response1.contentType();
        int int29 = response1.numRedirects;
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertNull(method17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNull(byteBuffer21);
        org.junit.Assert.assertNull(method22);
        org.junit.Assert.assertNotNull(response24);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test08303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08303");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        int int8 = response1.numRedirects;
        response1.contentType = "hi!";
        java.nio.ByteBuffer byteBuffer11 = response1.byteData;
        java.nio.ByteBuffer byteBuffer12 = null;
        response1.byteData = byteBuffer12;
        org.jsoup.Connection.Response response16 = response1.header("hi!", "hi!");
        org.jsoup.Connection.Method method17 = response1.method();
        java.lang.String str19 = response1.header("hi!");
        boolean boolean21 = response1.hasCookie("hi!");
        org.jsoup.Connection.Request request22 = response1.req;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response24 = response1.removeHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertNull(method17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(request22);
    }

    @Test
    public void test08304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08304");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        java.lang.String str8 = response1.contentType();
        int int9 = response1.statusCode;
        int int10 = response1.statusCode;
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response1);
        response11.numRedirects = 10;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document14 = response11.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test08305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08305");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        response1.charset = "";
        response1.statusMessage = "";
        java.util.Map<java.lang.String, java.lang.String> strMap9 = response1.headers();
        boolean boolean10 = response1.executed;
        int int11 = response1.statusCode;
        response1.statusMessage = "";
        java.net.URL uRL14 = response1.url();
        org.jsoup.Connection.Response response17 = response1.cookie("Location", "Location");
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(uRL14);
        org.junit.Assert.assertNotNull(response17);
    }

    @Test
    public void test08306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08306");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        int int8 = response1.numRedirects;
        response1.contentType = "hi!";
        java.nio.ByteBuffer byteBuffer11 = response1.byteData;
        java.nio.ByteBuffer byteBuffer12 = null;
        response1.byteData = byteBuffer12;
        org.jsoup.Connection.Request request14 = response1.req;
        response1.statusMessage = "Location";
        org.jsoup.Connection.Request request17 = response1.req;
        int int18 = response1.statusCode;
        int int19 = response1.numRedirects;
        response1.executed = true;
        java.lang.Class<?> wildcardClass22 = response1.getClass();
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertNull(request14);
        org.junit.Assert.assertNull(request17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test08307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08307");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        org.jsoup.Connection.Response response8 = response1.cookie("hi!", "");
        java.net.URL uRL9 = response1.url();
        java.nio.ByteBuffer byteBuffer10 = null;
        response1.byteData = byteBuffer10;
        java.lang.String str12 = response1.contentType;
        org.jsoup.Connection.Method method13 = response1.method();
        org.jsoup.Connection.Response response15 = response1.removeCookie("Location");
        int int16 = response1.numRedirects;
        java.nio.ByteBuffer byteBuffer17 = response1.byteData;
        java.lang.String str18 = response1.charset;
        boolean boolean20 = response1.hasCookie("Location");
        org.jsoup.Connection.Request request21 = null;
        response1.req = request21;
        response1.executed = false;
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(method13);
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(byteBuffer17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test08308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08308");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        response1.charset = "";
        response1.statusMessage = "";
        java.util.Map<java.lang.String, java.lang.String> strMap9 = response1.headers();
        boolean boolean10 = response1.executed;
        int int11 = response1.statusCode;
        java.lang.String str13 = response1.header("hi!");
        java.lang.String str15 = response1.cookie("Location");
        boolean boolean17 = response1.hasHeader("hi!");
        response1.contentType = "Location";
        int int20 = response1.numRedirects;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document21 = response1.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test08309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08309");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        int int8 = response1.numRedirects;
        response1.contentType = "hi!";
        java.nio.ByteBuffer byteBuffer11 = response1.byteData;
        java.nio.ByteBuffer byteBuffer12 = null;
        response1.byteData = byteBuffer12;
        org.jsoup.Connection.Request request14 = null;
        response1.req = request14;
        int int16 = response1.numRedirects;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry18 = response1.scanHeaders("hi!");
        response1.numRedirects = 1;
        java.lang.String str21 = response1.statusMessage();
        boolean boolean23 = response1.hasHeader("Location");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response25 = response1.removeHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(strEntry18);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test08310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08310");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        response1.executed = false;
        boolean boolean9 = response1.executed;
        boolean boolean12 = response1.hasHeaderWithValue("hi!", "");
        response1.executed = false;
        response1.statusCode = 'a';
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry18 = response1.scanHeaders("");
        int int19 = response1.statusCode();
        response1.statusMessage = "hi!";
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response23 = response1.removeHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(strEntry18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 97 + "'", int19 == 97);
    }

    @Test
    public void test08311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08311");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        java.lang.String str8 = response1.contentType();
        response1.charset = "hi!";
        org.jsoup.Connection.Response response12 = response1.removeHeader("Location");
        org.jsoup.Connection.Response response15 = response1.cookie("Location", "hi!");
        response1.contentType = "";
        int int18 = response1.numRedirects;
        response1.statusMessage = "Location";
        response1.statusCode = (short) 1;
        java.net.URL uRL23 = response1.url();
        java.lang.String str25 = response1.header("hi!");
        java.lang.Class<?> wildcardClass26 = response1.getClass();
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(uRL23);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test08312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08312");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.nio.ByteBuffer byteBuffer2 = null;
        response1.byteData = byteBuffer2;
        int int4 = response1.statusCode;
        java.net.HttpURLConnection httpURLConnection5 = null;
        org.jsoup.helper.HttpConnection.Response response6 = null;
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response6);
        org.jsoup.Connection.Request request8 = null;
        response7.req = request8;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry11 = response7.scanHeaders("hi!");
        response7.charset = "hi!";
        int int14 = response7.numRedirects;
        response7.contentType = "hi!";
        java.nio.ByteBuffer byteBuffer17 = response7.byteData;
        java.lang.String str18 = response7.contentType;
        org.jsoup.Connection.Response response21 = response7.cookie("Location", "Location");
        int int22 = response7.numRedirects;
        org.jsoup.helper.HttpConnection.Response response23 = new org.jsoup.helper.HttpConnection.Response(response7);
        java.lang.String str24 = response23.statusMessage();
        // The following exception was thrown during execution in test generation
        try {
            response1.setupFromConnection(httpURLConnection5, (org.jsoup.Connection.Response) response23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(strEntry11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(byteBuffer17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(response21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test08313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08313");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        org.jsoup.Connection.Response response8 = response1.cookie("hi!", "");
        java.lang.String str9 = response1.statusMessage();
        org.jsoup.Connection.Method method10 = response1.method();
        response1.numRedirects = ' ';
        org.jsoup.Connection.Method method13 = response1.method();
        java.nio.ByteBuffer byteBuffer14 = null;
        response1.byteData = byteBuffer14;
        java.util.Map<java.lang.String, java.lang.String> strMap16 = response1.cookies();
        java.lang.String str18 = response1.getHeaderCaseInsensitive("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = response1.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNull(method13);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test08314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08314");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        org.jsoup.Connection.Response response8 = response1.cookie("hi!", "");
        java.lang.String str9 = response1.statusMessage();
        org.jsoup.Connection.Request request10 = response1.req;
        java.net.URL uRL11 = response1.url();
        java.lang.String str12 = response1.contentType();
        response1.contentType = "hi!";
        java.net.URL uRL15 = response1.url();
        org.jsoup.Connection.Response response17 = response1.removeHeader("hi!");
        org.jsoup.Connection.Response response19 = response1.removeHeader("hi!");
        java.nio.ByteBuffer byteBuffer20 = null;
        response1.byteData = byteBuffer20;
        java.lang.String str22 = response1.charset;
        java.lang.String str23 = response1.charset();
        boolean boolean24 = response1.executed;
        java.lang.String str25 = response1.contentType;
        java.net.URL uRL26 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response27 = response1.url(uRL26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(request10);
        org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(uRL15);
        org.junit.Assert.assertNotNull(response17);
        org.junit.Assert.assertNotNull(response19);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
    }

    @Test
    public void test08315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08315");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        java.lang.String str8 = response1.contentType();
        java.lang.String str9 = response1.contentType;
        boolean boolean11 = response1.hasHeader("hi!");
        java.net.URL uRL12 = response1.url();
        boolean boolean14 = response1.hasCookie("Location");
        int int15 = response1.numRedirects;
        response1.contentType = "hi!";
        java.lang.String str18 = response1.contentType();
        response1.charset = "Location";
        org.jsoup.Connection.Response response22 = response1.removeCookie("hi!");
        response1.statusCode = ' ';
        response1.contentType = "Location";
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(uRL12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(response22);
    }

    @Test
    public void test08316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08316");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        org.jsoup.Connection.Response response8 = response1.cookie("hi!", "");
        java.net.URL uRL9 = response1.url();
        java.nio.ByteBuffer byteBuffer10 = null;
        response1.byteData = byteBuffer10;
        java.lang.String str12 = response1.contentType;
        org.jsoup.Connection.Method method13 = response1.method();
        org.jsoup.Connection.Response response15 = response1.removeCookie("Location");
        int int16 = response1.numRedirects;
        java.nio.ByteBuffer byteBuffer17 = response1.byteData;
        java.lang.String str18 = response1.charset;
        java.lang.String str20 = response1.cookie("hi!");
        int int21 = response1.numRedirects;
        boolean boolean22 = response1.executed;
        java.lang.String str23 = response1.charset;
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(method13);
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(byteBuffer17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test08317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08317");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        int int8 = response1.numRedirects;
        response1.contentType = "hi!";
        java.nio.ByteBuffer byteBuffer11 = response1.byteData;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry13 = response1.scanHeaders("");
        java.lang.String str15 = response1.header("Location");
        int int16 = response1.statusCode();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry18 = response1.scanHeaders("hi!");
        response1.contentType = "hi!";
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response23 = response1.cookie("", "Location");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertNull(strEntry13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(strEntry18);
    }

    @Test
    public void test08318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08318");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        response1.charset = "";
        response1.statusMessage = "";
        java.lang.String str10 = response1.getHeaderCaseInsensitive("");
        boolean boolean11 = response1.executed;
        int int12 = response1.numRedirects;
        java.nio.ByteBuffer byteBuffer13 = response1.byteData;
        java.lang.String str15 = response1.header("");
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.nio.ByteBuffer byteBuffer17 = response1.byteData;
        response1.executed = true;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response22 = response1.cookie("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(byteBuffer13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(byteBuffer17);
    }

    @Test
    public void test08319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08319");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        response1.charset = "";
        response1.statusMessage = "";
        java.lang.String str10 = response1.getHeaderCaseInsensitive("");
        response1.charset = "hi!";
        java.net.URL uRL13 = response1.url();
        java.lang.String str14 = response1.statusMessage;
        org.jsoup.Connection.Response response17 = response1.cookie("hi!", "hi!");
        boolean boolean19 = response1.hasCookie("hi!");
        boolean boolean22 = response1.hasHeaderWithValue("hi!", "");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document23 = response1.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(uRL13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(response17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test08320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08320");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        java.lang.String str7 = response1.contentType();
        java.lang.String str8 = response1.contentType();
        org.jsoup.Connection.Response response10 = response1.removeHeader("Location");
        response1.contentType = "Location";
        boolean boolean14 = response1.hasHeader("Location");
        java.lang.String str16 = response1.header("Location");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response19 = response1.header("", "Location");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test08321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08321");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        response1.executed = false;
        java.lang.String str9 = response1.contentType();
        java.nio.ByteBuffer byteBuffer10 = response1.byteData;
        response1.numRedirects = '4';
        java.lang.String str13 = response1.charset;
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(byteBuffer10);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test08322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08322");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        org.jsoup.Connection.Response response8 = response1.cookie("hi!", "");
        java.lang.String str9 = response1.statusMessage();
        org.jsoup.Connection.Request request10 = response1.req;
        java.net.URL uRL11 = response1.url();
        java.lang.String str12 = response1.contentType();
        response1.contentType = "hi!";
        org.jsoup.Connection.Request request15 = response1.req;
        boolean boolean17 = response1.hasHeader("Location");
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(request10);
        org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(request15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test08323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08323");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        int int8 = response1.numRedirects;
        response1.contentType = "hi!";
        java.nio.ByteBuffer byteBuffer11 = response1.byteData;
        java.nio.ByteBuffer byteBuffer12 = null;
        response1.byteData = byteBuffer12;
        java.lang.String str14 = response1.contentType;
        java.lang.String str15 = response1.charset();
        org.jsoup.Connection.Method method16 = response1.method();
        org.jsoup.Connection.Response response18 = response1.removeHeader("hi!");
        java.lang.String str20 = response1.header("");
        java.util.Map<java.lang.String, java.lang.String> strMap21 = response1.headers();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = response1.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNull(method16);
        org.junit.Assert.assertNotNull(response18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(strMap21);
    }

    @Test
    public void test08324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08324");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        response1.statusCode = 10;
        int int9 = response1.numRedirects;
        java.lang.String str10 = response1.charset();
        java.lang.String str11 = response1.statusMessage;
        java.lang.String str13 = response1.header("Location");
        org.jsoup.Connection.Request request14 = response1.req;
        java.lang.String str16 = response1.getHeaderCaseInsensitive("hi!");
        boolean boolean19 = response1.hasHeaderWithValue("hi!", "Location");
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(request14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test08325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08325");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        response1.charset = "";
        response1.statusMessage = "";
        java.lang.String str10 = response1.getHeaderCaseInsensitive("");
        boolean boolean11 = response1.executed;
        java.nio.ByteBuffer byteBuffer12 = response1.byteData;
        java.lang.String str14 = response1.header("Location");
        org.jsoup.Connection.Method method15 = response1.method();
        java.lang.String str16 = response1.contentType;
        response1.statusCode = (short) -1;
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(byteBuffer12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test08326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08326");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        int int8 = response1.numRedirects;
        response1.contentType = "hi!";
        java.nio.ByteBuffer byteBuffer11 = response1.byteData;
        java.nio.ByteBuffer byteBuffer12 = null;
        response1.byteData = byteBuffer12;
        java.lang.String str15 = response1.header("Location");
        java.lang.String str16 = response1.statusMessage();
        int int17 = response1.statusCode;
        java.lang.String str18 = response1.statusMessage;
        boolean boolean20 = response1.hasCookie("Location");
        java.lang.String str21 = response1.contentType();
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test08327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08327");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        response1.executed = false;
        response1.numRedirects = '4';
        response1.statusCode = (byte) -1;
        java.lang.String str13 = response1.contentType();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response1);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Too many redirects occurred trying to load URL null");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test08328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08328");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        response1.executed = false;
        java.lang.String str9 = response1.charset;
        org.jsoup.Connection.Response response11 = response1.removeCookie("Location");
        java.nio.ByteBuffer byteBuffer12 = null;
        response1.byteData = byteBuffer12;
        java.lang.String str15 = response1.cookie("hi!");
        response1.statusCode = (short) 0;
        java.util.Map<java.lang.String, java.lang.String> strMap18 = response1.cookies();
        java.lang.String str20 = response1.getHeaderCaseInsensitive("");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray21 = response1.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(strMap18);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test08329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08329");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.nio.ByteBuffer byteBuffer2 = null;
        response1.byteData = byteBuffer2;
        java.nio.ByteBuffer byteBuffer4 = response1.byteData;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry6 = response1.scanHeaders("");
        java.lang.String str8 = response1.cookie("Location");
        org.junit.Assert.assertNull(byteBuffer4);
        org.junit.Assert.assertNull(strEntry6);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test08330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08330");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        java.lang.String str8 = response1.contentType();
        response1.charset = "hi!";
        int int11 = response1.numRedirects;
        int int12 = response1.statusCode;
        org.jsoup.Connection.Response response14 = response1.removeHeader("Location");
        org.jsoup.Connection.Request request15 = response1.req;
        java.lang.String str17 = response1.header("hi!");
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertNull(request15);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test08331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08331");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        response1.charset = "";
        response1.statusMessage = "";
        java.lang.String str10 = response1.header("");
        java.net.URL uRL11 = response1.url();
        response1.charset = "Location";
        response1.statusMessage = "hi!";
        response1.statusCode = (short) 10;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document18 = response1.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(uRL11);
    }

    @Test
    public void test08332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08332");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        int int8 = response1.numRedirects;
        response1.contentType = "hi!";
        java.nio.ByteBuffer byteBuffer11 = response1.byteData;
        java.lang.String str12 = response1.contentType;
        java.lang.String str14 = response1.getHeaderCaseInsensitive("hi!");
        java.lang.String str15 = response1.charset();
        response1.contentType = "hi!";
        org.jsoup.Connection.Request request18 = response1.req;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response21 = response1.cookie("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNull(request18);
    }

    @Test
    public void test08333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08333");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        org.jsoup.Connection.Request request5 = null;
        response1.req = request5;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry8 = response1.scanHeaders("Location");
        boolean boolean11 = response1.hasHeaderWithValue("hi!", "");
        response1.statusCode = (short) -1;
        response1.numRedirects = 0;
        response1.statusMessage = "Location";
        boolean boolean18 = response1.executed;
        int int19 = response1.numRedirects;
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(strEntry8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test08334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08334");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        org.jsoup.Connection.Response response8 = response1.cookie("hi!", "");
        java.net.URL uRL9 = response1.url();
        java.nio.ByteBuffer byteBuffer10 = null;
        response1.byteData = byteBuffer10;
        java.lang.String str13 = response1.header("Location");
        java.lang.String str14 = response1.charset();
        int int15 = response1.statusCode();
        org.jsoup.Connection.Response response17 = response1.removeHeader("hi!");
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(response17);
    }

    @Test
    public void test08335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08335");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        int int8 = response1.numRedirects;
        response1.contentType = "hi!";
        java.nio.ByteBuffer byteBuffer11 = response1.byteData;
        java.lang.String str12 = response1.contentType;
        org.jsoup.Connection.Response response15 = response1.cookie("Location", "Location");
        int int16 = response1.numRedirects;
        java.lang.String str18 = response1.cookie("Location");
        int int19 = response1.statusCode;
        response1.numRedirects = (short) 100;
        response1.executed = true;
        response1.contentType = "Location";
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Location" + "'", str18, "Location");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test08336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08336");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        java.lang.String str7 = response1.contentType();
        java.lang.String str9 = response1.header("hi!");
        java.lang.String str10 = response1.statusMessage;
        boolean boolean12 = response1.hasCookie("hi!");
        boolean boolean14 = response1.hasCookie("hi!");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray15 = response1.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test08337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08337");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.charset = "Location";
        boolean boolean6 = response1.hasHeaderWithValue("hi!", "Location");
        response1.numRedirects = (byte) 100;
        java.lang.String str9 = response1.statusMessage;
        response1.executed = false;
        java.nio.ByteBuffer byteBuffer12 = response1.byteData;
        boolean boolean13 = response1.executed;
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(byteBuffer12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test08338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08338");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        response1.charset = "";
        java.lang.String str8 = response1.cookie("hi!");
        boolean boolean11 = response1.hasHeaderWithValue("Location", "hi!");
        java.lang.String str12 = response1.statusMessage();
        java.nio.ByteBuffer byteBuffer13 = response1.byteData;
        int int14 = response1.statusCode();
        java.lang.String str16 = response1.header("Location");
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(byteBuffer13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test08339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08339");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        response1.executed = false;
        org.jsoup.Connection.Response response11 = response1.header("Location", "");
        int int12 = response1.statusCode;
        java.lang.String str13 = response1.charset();
        org.jsoup.Connection.Response response16 = response1.header("hi!", "hi!");
        response1.charset = "hi!";
        java.lang.String str19 = response1.statusMessage;
        boolean boolean20 = response1.executed;
        response1.numRedirects = 100;
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test08340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08340");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        java.lang.String str7 = response1.contentType();
        org.jsoup.Connection.Response response9 = response1.removeCookie("Location");
        java.lang.String str11 = response1.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Request request12 = response1.req;
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(request12);
    }

    @Test
    public void test08341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08341");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        java.lang.String str8 = response1.contentType();
        java.lang.String str9 = response1.contentType;
        boolean boolean11 = response1.hasHeader("hi!");
        org.jsoup.Connection.Request request12 = null;
        response1.req = request12;
        int int14 = response1.statusCode;
        java.util.Map<java.lang.String, java.lang.String> strMap15 = response1.cookies();
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(strMap15);
    }

    @Test
    public void test08342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08342");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        org.jsoup.Connection.Response response8 = response1.cookie("hi!", "");
        java.lang.String str9 = response1.statusMessage();
        org.jsoup.Connection.Method method10 = response1.method();
        response1.numRedirects = ' ';
        org.jsoup.Connection.Method method13 = response1.method();
        java.util.Map<java.lang.String, java.lang.String> strMap14 = response1.headers();
        org.jsoup.Connection.Request request15 = response1.req;
        java.util.Map<java.lang.String, java.lang.String> strMap16 = response1.cookies();
        org.jsoup.Connection.Method method17 = response1.method();
        java.util.Map<java.lang.String, java.lang.String> strMap18 = response1.headers();
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNull(method13);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNull(request15);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertNull(method17);
        org.junit.Assert.assertNotNull(strMap18);
    }

    @Test
    public void test08343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08343");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        org.jsoup.Connection.Response response8 = response1.cookie("hi!", "");
        java.lang.String str9 = response1.statusMessage();
        java.lang.String str10 = response1.contentType;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry12 = response1.scanHeaders("");
        boolean boolean15 = response1.hasHeaderWithValue("Location", "hi!");
        response1.numRedirects = 52;
        java.lang.String str18 = response1.statusMessage();
        org.jsoup.Connection.Response response21 = response1.header("hi!", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response23 = response1.removeHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(strEntry12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(response21);
    }

    @Test
    public void test08344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08344");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        int int8 = response1.numRedirects;
        response1.contentType = "hi!";
        java.nio.ByteBuffer byteBuffer11 = response1.byteData;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry13 = response1.scanHeaders("");
        response1.numRedirects = (short) 10;
        int int16 = response1.statusCode();
        java.net.URL uRL17 = response1.url();
        int int18 = response1.statusCode();
        boolean boolean19 = response1.executed;
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertNull(strEntry13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(uRL17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test08345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08345");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        response1.charset = "";
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry8 = response1.scanHeaders("hi!");
        response1.executed = false;
        java.lang.String str12 = response1.cookie("hi!");
        int int13 = response1.statusCode();
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNotNull(strEntry8);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test08346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08346");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        response1.charset = "";
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry8 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        java.lang.String str11 = response1.statusMessage;
        response1.contentType = "Location";
        response1.statusCode = (short) 1;
        boolean boolean16 = response1.executed;
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNotNull(strEntry8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test08347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08347");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Request request3 = null;
        response2.req = request3;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry6 = response2.scanHeaders("hi!");
        org.jsoup.Connection.Response response9 = response2.cookie("hi!", "");
        java.net.URL uRL10 = response2.url();
        java.nio.ByteBuffer byteBuffer11 = null;
        response2.byteData = byteBuffer11;
        org.jsoup.Connection.Response response14 = response2.removeHeader("hi!");
        org.jsoup.Connection.Request request15 = response2.req;
        java.lang.String str16 = response2.contentType;
        int int17 = response2.statusCode();
        java.lang.String str18 = response2.statusMessage();
        org.jsoup.Connection.Request request19 = null;
        response2.req = request19;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response21 = org.jsoup.helper.HttpConnection.Response.execute(request0, response2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry6);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertNull(uRL10);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertNull(request15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test08348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08348");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        response1.executed = false;
        response1.numRedirects = '4';
        boolean boolean13 = response1.hasHeaderWithValue("Location", "Location");
        org.jsoup.Connection.Method method14 = response1.method();
        java.nio.ByteBuffer byteBuffer15 = response1.byteData;
        org.jsoup.Connection.Response response17 = response1.removeCookie("hi!");
        org.jsoup.Connection.Response response20 = response1.header("Location", "");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response23 = response1.header("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(method14);
        org.junit.Assert.assertNull(byteBuffer15);
        org.junit.Assert.assertNotNull(response17);
        org.junit.Assert.assertNotNull(response20);
    }

    @Test
    public void test08349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08349");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        response1.executed = false;
        org.jsoup.Connection.Response response11 = response1.header("Location", "");
        int int12 = response1.statusCode;
        java.lang.String str13 = response1.charset();
        java.lang.String str14 = response1.statusMessage();
        org.jsoup.Connection.Request request15 = null;
        response1.req = request15;
        int int17 = response1.statusCode();
        int int18 = response1.numRedirects;
        java.lang.Class<?> wildcardClass19 = response1.getClass();
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test08350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08350");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        response1.charset = "";
        response1.statusMessage = "";
        java.lang.String str10 = response1.getHeaderCaseInsensitive("");
        response1.charset = "hi!";
        java.lang.String str14 = response1.getHeaderCaseInsensitive("");
        int int15 = response1.statusCode();
        java.nio.ByteBuffer byteBuffer16 = response1.byteData;
        java.lang.Class<?> wildcardClass17 = response1.getClass();
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(byteBuffer16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test08351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08351");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        org.jsoup.Connection.Request request5 = null;
        response1.req = request5;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry8 = response1.scanHeaders("Location");
        boolean boolean11 = response1.hasHeaderWithValue("hi!", "");
        response1.statusCode = (short) -1;
        int int14 = response1.numRedirects;
        org.jsoup.Connection.Response response17 = response1.header("Location", "hi!");
        boolean boolean20 = response1.hasHeaderWithValue("Location", "hi!");
        response1.numRedirects = (byte) -1;
        boolean boolean23 = response1.executed;
        java.lang.String str24 = response1.statusMessage;
        java.net.URL uRL25 = response1.url();
        int int26 = response1.statusCode();
        java.lang.String str27 = response1.contentType();
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(strEntry8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(response17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(uRL25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNull(str27);
    }

    @Test
    public void test08352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08352");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        response1.charset = "";
        java.lang.String str8 = response1.cookie("hi!");
        boolean boolean9 = response1.executed;
        response1.statusMessage = "Location";
        org.jsoup.Connection.Request request12 = null;
        response1.req = request12;
        int int14 = response1.numRedirects;
        response1.executed = false;
        java.util.Map<java.lang.String, java.lang.String> strMap17 = response1.cookies();
        java.lang.Class<?> wildcardClass18 = strMap17.getClass();
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(strMap17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test08353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08353");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.numRedirects = (byte) -1;
        int int4 = response1.statusCode;
        response1.statusMessage = "";
        java.lang.String str7 = response1.charset;
        java.lang.String str9 = response1.getHeaderCaseInsensitive("hi!");
        org.jsoup.Connection.Request request10 = response1.req;
        org.jsoup.Connection.Request request11 = null;
        response1.req = request11;
        boolean boolean14 = response1.hasHeader("hi!");
        response1.numRedirects = '4';
        java.lang.String str18 = response1.cookie("Location");
        org.jsoup.Connection.Response response20 = response1.removeHeader("hi!");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(request10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(response20);
    }

    @Test
    public void test08354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08354");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        org.jsoup.Connection.Response response8 = response1.cookie("hi!", "");
        boolean boolean9 = response1.executed;
        int int10 = response1.statusCode;
        java.lang.String str11 = response1.statusMessage;
        java.lang.String str12 = response1.charset();
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test08355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08355");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        org.jsoup.Connection.Request request5 = null;
        response1.req = request5;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry8 = response1.scanHeaders("Location");
        boolean boolean11 = response1.hasHeaderWithValue("hi!", "");
        response1.statusCode = (short) -1;
        int int14 = response1.numRedirects;
        org.jsoup.Connection.Response response17 = response1.header("Location", "hi!");
        java.lang.String str18 = response1.contentType();
        response1.numRedirects = (byte) 100;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = response1.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(strEntry8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(response17);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test08356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08356");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        int int8 = response1.numRedirects;
        response1.contentType = "hi!";
        java.nio.ByteBuffer byteBuffer11 = response1.byteData;
        java.lang.String str12 = response1.contentType;
        int int13 = response1.numRedirects;
        java.lang.String str14 = response1.contentType;
        int int15 = response1.statusCode();
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test08357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08357");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        boolean boolean8 = response1.hasHeaderWithValue("Location", "Location");
        java.lang.String str9 = response1.contentType();
        java.nio.ByteBuffer byteBuffer10 = null;
        response1.byteData = byteBuffer10;
        response1.contentType = "hi!";
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test08358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08358");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        response1.charset = "";
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry8 = response1.scanHeaders("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap9 = response1.cookies();
        java.nio.ByteBuffer byteBuffer10 = response1.byteData;
        java.nio.ByteBuffer byteBuffer11 = null;
        response1.byteData = byteBuffer11;
        java.lang.String str13 = response1.charset();
        java.nio.ByteBuffer byteBuffer14 = null;
        response1.byteData = byteBuffer14;
        org.jsoup.Connection.Request request16 = response1.req;
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.util.Map<java.lang.String, java.lang.String> strMap18 = response17.cookies();
        java.nio.ByteBuffer byteBuffer19 = response17.byteData;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response22 = response17.cookie("", "Location");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNotNull(strEntry8);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNull(byteBuffer10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(request16);
        org.junit.Assert.assertNotNull(strMap18);
        org.junit.Assert.assertNull(byteBuffer19);
    }

    @Test
    public void test08359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08359");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        org.jsoup.Connection.Response response8 = response1.cookie("hi!", "");
        java.lang.String str9 = response1.statusMessage();
        org.jsoup.Connection.Method method10 = response1.method();
        org.jsoup.Connection.Method method11 = response1.method();
        java.net.URL uRL12 = response1.url();
        org.jsoup.Connection.Response response14 = response1.removeHeader("hi!");
        java.lang.String str15 = response1.contentType;
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNull(method11);
        org.junit.Assert.assertNull(uRL12);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test08360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08360");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Response response5 = response2.header("hi!", "");
        response2.charset = "";
        response2.statusMessage = "";
        java.lang.String str11 = response2.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response14 = response2.cookie("Location", "hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap15 = response2.cookies();
        java.net.URL uRL16 = response2.url();
        java.lang.String str17 = response2.charset;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry19 = response2.scanHeaders("Location");
        org.jsoup.Connection.Method method20 = response2.method();
        java.nio.ByteBuffer byteBuffer21 = null;
        response2.byteData = byteBuffer21;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response23 = org.jsoup.helper.HttpConnection.Response.execute(request0, response2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertNull(uRL16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(strEntry19);
        org.junit.Assert.assertNull(method20);
    }

    @Test
    public void test08361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08361");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        response1.executed = false;
        org.jsoup.Connection.Response response11 = response1.header("Location", "");
        int int12 = response1.statusCode;
        response1.statusMessage = "";
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = response1.hasHeaderWithValue("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test08362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08362");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        int int8 = response1.numRedirects;
        response1.contentType = "hi!";
        java.nio.ByteBuffer byteBuffer11 = response1.byteData;
        java.lang.String str12 = response1.contentType;
        org.jsoup.Connection.Response response15 = response1.cookie("Location", "Location");
        int int16 = response1.numRedirects;
        int int17 = response1.numRedirects;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry19 = response1.scanHeaders("");
        java.nio.ByteBuffer byteBuffer20 = null;
        response1.byteData = byteBuffer20;
        java.lang.String str23 = response1.cookie("hi!");
        response1.statusMessage = "";
        java.nio.ByteBuffer byteBuffer26 = null;
        response1.byteData = byteBuffer26;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean29 = response1.hasCookie("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(strEntry19);
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test08363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08363");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.charset = "Location";
        java.nio.ByteBuffer byteBuffer4 = null;
        response1.byteData = byteBuffer4;
        int int6 = response1.statusCode;
        boolean boolean7 = response1.executed;
        java.nio.ByteBuffer byteBuffer8 = null;
        response1.byteData = byteBuffer8;
        java.lang.String str11 = response1.getHeaderCaseInsensitive("Location");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test08364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08364");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        response1.executed = false;
        org.jsoup.Connection.Response response11 = response1.header("Location", "");
        int int12 = response1.statusCode;
        java.lang.String str13 = response1.charset();
        org.jsoup.Connection.Response response16 = response1.header("hi!", "hi!");
        java.lang.String str17 = response1.statusMessage;
        response1.numRedirects = 100;
        java.util.Map<java.lang.String, java.lang.String> strMap20 = response1.headers();
        boolean boolean22 = response1.hasHeader("Location");
        java.nio.ByteBuffer byteBuffer23 = response1.byteData;
        java.lang.String str25 = response1.cookie("hi!");
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(strMap20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNull(byteBuffer23);
        org.junit.Assert.assertNull(str25);
    }

    @Test
    public void test08365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08365");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        int int8 = response1.numRedirects;
        response1.contentType = "hi!";
        java.nio.ByteBuffer byteBuffer11 = response1.byteData;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry13 = response1.scanHeaders("");
        java.lang.String str15 = response1.header("Location");
        java.nio.ByteBuffer byteBuffer16 = null;
        response1.byteData = byteBuffer16;
        int int18 = response1.statusCode();
        response1.contentType = "hi!";
        java.util.Map<java.lang.String, java.lang.String> strMap21 = response1.headers();
        org.jsoup.Connection.Response response23 = response1.removeHeader("Location");
        boolean boolean25 = response1.hasHeader("hi!");
        response1.executed = false;
        java.lang.String str28 = response1.charset();
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray29 = response1.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertNull(strEntry13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertNotNull(response23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
    }

    @Test
    public void test08366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08366");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        response1.charset = "";
        java.lang.String str8 = response1.cookie("hi!");
        boolean boolean9 = response1.executed;
        response1.statusMessage = "Location";
        java.lang.String str12 = response1.charset();
        java.lang.String str13 = response1.statusMessage();
        boolean boolean16 = response1.hasHeaderWithValue("hi!", "hi!");
        java.net.URL uRL17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response18 = response1.url(uRL17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Location" + "'", str13, "Location");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test08367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08367");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        org.jsoup.Connection.Request request5 = null;
        response1.req = request5;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry8 = response1.scanHeaders("Location");
        boolean boolean11 = response1.hasHeaderWithValue("hi!", "");
        java.util.Map<java.lang.String, java.lang.String> strMap12 = response1.headers();
        java.nio.ByteBuffer byteBuffer13 = response1.byteData;
        int int14 = response1.numRedirects;
        response1.numRedirects = (short) 0;
        java.lang.String str17 = response1.contentType;
        response1.charset = "hi!";
        org.jsoup.Connection.Response response21 = response1.removeHeader("hi!");
        java.lang.String str22 = response1.statusMessage();
        response1.charset = "Location";
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(strEntry8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertNull(byteBuffer13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(response21);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test08368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08368");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        java.lang.String str8 = response1.cookie("hi!");
        java.net.URL uRL9 = response1.url();
        java.lang.String str11 = response1.header("");
        java.lang.String str12 = response1.statusMessage();
        java.nio.ByteBuffer byteBuffer13 = response1.byteData;
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(byteBuffer13);
    }

    @Test
    public void test08369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08369");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        response1.executed = false;
        boolean boolean9 = response1.executed;
        int int10 = response1.statusCode();
        response1.executed = false;
        org.jsoup.Connection.Method method13 = response1.method();
        org.jsoup.Connection.Response response15 = response1.removeHeader("Location");
        response1.numRedirects = '#';
        org.jsoup.Connection.Method method18 = response1.method();
        java.lang.String str20 = response1.getHeaderCaseInsensitive("hi!");
        org.jsoup.Connection.Method method21 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response22 = response1.method(method21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(method13);
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertNull(method18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test08370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08370");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        int int8 = response1.numRedirects;
        response1.contentType = "hi!";
        java.nio.ByteBuffer byteBuffer11 = response1.byteData;
        java.nio.ByteBuffer byteBuffer12 = null;
        response1.byteData = byteBuffer12;
        org.jsoup.Connection.Response response16 = response1.header("hi!", "hi!");
        org.jsoup.Connection.Method method17 = response1.method();
        java.lang.String str19 = response1.header("hi!");
        java.lang.String str20 = response1.contentType();
        java.nio.ByteBuffer byteBuffer21 = response1.byteData;
        java.nio.ByteBuffer byteBuffer22 = null;
        response1.byteData = byteBuffer22;
        org.jsoup.Connection.Response response25 = response1.removeHeader("Location");
        response1.numRedirects = '4';
        java.lang.String str29 = response1.getHeaderCaseInsensitive("hi!");
        int int30 = response1.statusCode;
        response1.statusMessage = "hi!";
        org.jsoup.Connection.Method method33 = response1.method();
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertNull(method17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNull(byteBuffer21);
        org.junit.Assert.assertNotNull(response25);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNull(method33);
    }

    @Test
    public void test08371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08371");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        int int8 = response1.numRedirects;
        response1.contentType = "hi!";
        java.nio.ByteBuffer byteBuffer11 = response1.byteData;
        java.nio.ByteBuffer byteBuffer12 = null;
        response1.byteData = byteBuffer12;
        org.jsoup.Connection.Response response16 = response1.header("hi!", "hi!");
        org.jsoup.Connection.Method method17 = response1.method();
        java.lang.String str19 = response1.header("hi!");
        java.lang.String str20 = response1.contentType();
        java.nio.ByteBuffer byteBuffer21 = response1.byteData;
        org.jsoup.Connection.Method method22 = response1.method();
        int int23 = response1.statusCode();
        response1.statusCode = 'a';
        java.net.HttpURLConnection httpURLConnection26 = null;
        org.jsoup.helper.HttpConnection.Response response27 = null;
        org.jsoup.helper.HttpConnection.Response response28 = new org.jsoup.helper.HttpConnection.Response(response27);
        org.jsoup.Connection.Request request29 = null;
        response28.req = request29;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry32 = response28.scanHeaders("hi!");
        response28.charset = "hi!";
        int int35 = response28.numRedirects;
        response28.contentType = "hi!";
        java.nio.ByteBuffer byteBuffer38 = response28.byteData;
        java.lang.String str39 = response28.contentType;
        response28.contentType = "Location";
        org.jsoup.Connection.Request request42 = response28.req;
        response28.contentType = "hi!";
        org.jsoup.Connection.Method method45 = response28.method();
        // The following exception was thrown during execution in test generation
        try {
            response1.setupFromConnection(httpURLConnection26, (org.jsoup.Connection.Response) response28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertNull(method17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNull(byteBuffer21);
        org.junit.Assert.assertNull(method22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNull(strEntry32);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNull(byteBuffer38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!" + "'", str39, "hi!");
        org.junit.Assert.assertNull(request42);
        org.junit.Assert.assertNull(method45);
    }

    @Test
    public void test08372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08372");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        int int8 = response1.numRedirects;
        response1.contentType = "hi!";
        java.nio.ByteBuffer byteBuffer11 = response1.byteData;
        java.lang.String str12 = response1.contentType;
        int int13 = response1.numRedirects;
        response1.executed = false;
        response1.statusCode = '4';
        response1.contentType = "";
        boolean boolean22 = response1.hasHeaderWithValue("hi!", "hi!");
        boolean boolean25 = response1.hasHeaderWithValue("Location", "hi!");
        java.lang.String str26 = response1.contentType;
        response1.numRedirects = (short) -1;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean30 = response1.hasHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test08373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08373");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        response1.executed = false;
        org.jsoup.Connection.Response response11 = response1.header("Location", "");
        int int12 = response1.statusCode();
        org.jsoup.Connection.Request request13 = null;
        response1.req = request13;
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str17 = response1.header("hi!");
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Response response21 = response1.cookie("Location", "");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray22 = response1.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(response21);
    }

    @Test
    public void test08374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08374");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        boolean boolean6 = response1.hasCookie("hi!");
        response1.charset = "Location";
        java.lang.String str9 = response1.contentType;
        java.lang.String str10 = response1.contentType();
        boolean boolean11 = response1.executed;
        java.lang.String str13 = response1.getHeaderCaseInsensitive("");
        java.lang.String str15 = response1.header("");
        org.jsoup.Connection.Request request16 = null;
        response1.req = request16;
        response1.statusCode = 2;
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test08375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08375");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        int int8 = response1.numRedirects;
        response1.contentType = "hi!";
        java.nio.ByteBuffer byteBuffer11 = response1.byteData;
        java.lang.String str12 = response1.contentType;
        org.jsoup.Connection.Response response15 = response1.cookie("Location", "Location");
        int int16 = response1.numRedirects;
        int int17 = response1.numRedirects;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry19 = response1.scanHeaders("");
        java.nio.ByteBuffer byteBuffer20 = null;
        response1.byteData = byteBuffer20;
        java.util.Map<java.lang.String, java.lang.String> strMap22 = response1.cookies();
        java.nio.ByteBuffer byteBuffer23 = null;
        response1.byteData = byteBuffer23;
        response1.contentType = "";
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean29 = response1.hasHeaderWithValue("", "Location");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(strEntry19);
        org.junit.Assert.assertNotNull(strMap22);
    }

    @Test
    public void test08376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08376");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        response1.executed = false;
        response1.statusCode = 100;
        boolean boolean12 = response1.hasHeader("Location");
        response1.numRedirects = (-1);
        org.jsoup.Connection.Response response17 = response1.header("Location", "");
        org.jsoup.Connection.Response response19 = response1.removeHeader("hi!");
        org.jsoup.Connection.Response response21 = response1.removeHeader("hi!");
        response1.charset = "";
        java.lang.String str24 = response1.statusMessage();
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(response17);
        org.junit.Assert.assertNotNull(response19);
        org.junit.Assert.assertNotNull(response21);
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test08377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08377");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        response1.charset = "";
        response1.statusMessage = "";
        java.util.Map<java.lang.String, java.lang.String> strMap9 = response1.headers();
        boolean boolean10 = response1.executed;
        org.jsoup.Connection.Response response13 = response1.header("hi!", "");
        response1.executed = true;
        int int16 = response1.numRedirects;
        response1.statusCode = 10;
        response1.statusMessage = "";
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test08378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08378");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        response1.statusMessage = "hi!";
        boolean boolean11 = response1.hasHeader("hi!");
        java.lang.String str12 = response1.statusMessage();
        java.lang.String str14 = response1.getHeaderCaseInsensitive("");
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.util.Map<java.lang.String, java.lang.String> strMap16 = response1.headers();
        java.lang.String str17 = response1.statusMessage;
        java.lang.String str18 = response1.statusMessage();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = response1.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test08379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08379");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        java.lang.String str8 = response1.contentType();
        java.lang.String str9 = response1.contentType;
        int int10 = response1.statusCode();
        java.nio.ByteBuffer byteBuffer11 = response1.byteData;
        org.jsoup.Connection.Request request12 = null;
        response1.req = request12;
        response1.statusCode = (byte) 100;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry17 = response1.scanHeaders("Location");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document18 = response1.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertNull(strEntry17);
    }

    @Test
    public void test08380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08380");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        response1.contentType = "Location";
        java.lang.String str9 = response1.charset;
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test08381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08381");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        org.jsoup.Connection.Response response8 = response1.cookie("hi!", "");
        org.jsoup.Connection.Response response11 = response1.cookie("Location", "");
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Request request13 = null;
        response1.req = request13;
        org.jsoup.Connection.Response response17 = response1.header("hi!", "");
        org.jsoup.Connection.Request request18 = response1.req;
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNotNull(response17);
        org.junit.Assert.assertNull(request18);
    }

    @Test
    public void test08382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08382");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        response1.charset = "";
        response1.statusMessage = "";
        java.lang.String str10 = response1.header("");
        java.net.URL uRL11 = response1.url();
        response1.charset = "";
        java.lang.String str15 = response1.getHeaderCaseInsensitive("hi!");
        java.nio.ByteBuffer byteBuffer16 = response1.byteData;
        java.util.Map<java.lang.String, java.lang.String> strMap17 = response1.headers();
        java.lang.String str18 = response1.contentType;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response20 = response1.removeHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(byteBuffer16);
        org.junit.Assert.assertNotNull(strMap17);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test08383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08383");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        response1.charset = "";
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry8 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        response1.statusCode = (byte) 10;
        java.lang.String str14 = response1.cookie("Location");
        int int15 = response1.statusCode;
        response1.executed = false;
        java.lang.String str18 = response1.charset();
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNotNull(strEntry8);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test08384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08384");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        org.jsoup.Connection.Response response8 = response1.cookie("hi!", "");
        java.lang.String str9 = response1.statusMessage();
        org.jsoup.Connection.Request request10 = response1.req;
        response1.numRedirects = 0;
        response1.numRedirects = (byte) 1;
        java.lang.String str15 = response1.charset();
        java.lang.String str16 = response1.statusMessage();
        java.nio.ByteBuffer byteBuffer17 = null;
        response1.byteData = byteBuffer17;
        response1.charset = "Location";
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray21 = response1.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(request10);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test08385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08385");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        response1.charset = "";
        response1.statusMessage = "";
        java.lang.String str10 = response1.header("");
        java.net.URL uRL11 = response1.url();
        response1.charset = "Location";
        response1.statusMessage = "hi!";
        response1.statusCode = (short) 10;
        java.lang.String str18 = response1.charset();
        org.jsoup.Connection.Response response20 = response1.removeCookie("Location");
        int int21 = response1.numRedirects;
        org.jsoup.helper.HttpConnection.Response response22 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Response response25 = response22.cookie("Location", "hi!");
        org.jsoup.Connection.Request request26 = null;
        response22.req = request26;
        java.lang.String str28 = response22.statusMessage;
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Location" + "'", str18, "Location");
        org.junit.Assert.assertNotNull(response20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(response25);
        org.junit.Assert.assertNull(str28);
    }

    @Test
    public void test08386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08386");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        java.lang.String str8 = response1.contentType();
        java.lang.String str9 = response1.contentType;
        boolean boolean11 = response1.hasHeader("hi!");
        java.net.URL uRL12 = response1.url();
        boolean boolean14 = response1.hasCookie("Location");
        org.jsoup.Connection.Response response17 = response1.header("hi!", "");
        java.lang.String str19 = response1.header("hi!");
        boolean boolean22 = response1.hasHeaderWithValue("Location", "");
        response1.statusMessage = "hi!";
        java.util.Map<java.lang.String, java.lang.String> strMap25 = response1.headers();
        response1.contentType = "Location";
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(uRL12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(response17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(strMap25);
    }

    @Test
    public void test08387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08387");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        int int8 = response1.numRedirects;
        response1.contentType = "hi!";
        java.nio.ByteBuffer byteBuffer11 = response1.byteData;
        java.nio.ByteBuffer byteBuffer12 = null;
        response1.byteData = byteBuffer12;
        org.jsoup.Connection.Response response16 = response1.header("hi!", "hi!");
        org.jsoup.Connection.Method method17 = response1.method();
        boolean boolean19 = response1.hasHeader("hi!");
        response1.numRedirects = (short) 1;
        java.util.Map<java.lang.String, java.lang.String> strMap22 = response1.cookies();
        java.lang.String str24 = response1.header("hi!");
        boolean boolean26 = response1.hasHeader("hi!");
        org.jsoup.Connection.Response response28 = response1.removeCookie("Location");
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertNull(method17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(strMap22);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(response28);
    }

    @Test
    public void test08388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08388");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        org.jsoup.Connection.Request request5 = null;
        response1.req = request5;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry8 = response1.scanHeaders("Location");
        boolean boolean11 = response1.hasHeaderWithValue("hi!", "");
        response1.statusCode = (short) -1;
        int int14 = response1.numRedirects;
        org.jsoup.Connection.Response response17 = response1.header("Location", "hi!");
        java.lang.String str18 = response1.contentType();
        org.jsoup.Connection.Method method19 = response1.method();
        java.lang.String str20 = response1.contentType();
        java.lang.String str21 = response1.statusMessage;
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(strEntry8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(response17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(method19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test08389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08389");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.nio.ByteBuffer byteBuffer2 = null;
        response1.byteData = byteBuffer2;
        java.nio.ByteBuffer byteBuffer4 = response1.byteData;
        java.lang.String str5 = response1.charset;
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response1);
        response1.executed = false;
        org.junit.Assert.assertNull(byteBuffer4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test08390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08390");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        int int8 = response1.numRedirects;
        response1.contentType = "hi!";
        java.nio.ByteBuffer byteBuffer11 = response1.byteData;
        java.nio.ByteBuffer byteBuffer12 = null;
        response1.byteData = byteBuffer12;
        java.lang.String str15 = response1.header("Location");
        java.lang.String str17 = response1.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Request request18 = null;
        response1.req = request18;
        java.lang.String str20 = response1.statusMessage();
        int int21 = response1.statusCode();
        org.jsoup.Connection.Response response23 = response1.removeCookie("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap24 = response1.headers();
        java.util.Map<java.lang.String, java.lang.String> strMap25 = response1.cookies();
        java.util.Map<java.lang.String, java.lang.String> strMap26 = response1.cookies();
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(response23);
        org.junit.Assert.assertNotNull(strMap24);
        org.junit.Assert.assertNotNull(strMap25);
        org.junit.Assert.assertNotNull(strMap26);
    }

    @Test
    public void test08391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08391");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        int int8 = response1.numRedirects;
        response1.contentType = "hi!";
        java.nio.ByteBuffer byteBuffer11 = response1.byteData;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry13 = response1.scanHeaders("");
        java.lang.String str15 = response1.header("Location");
        response1.statusCode = (byte) 100;
        java.lang.String str18 = response1.statusMessage();
        java.util.Map<java.lang.String, java.lang.String> strMap19 = response1.headers();
        java.lang.String str21 = response1.header("hi!");
        boolean boolean22 = response1.executed;
        java.lang.String str24 = response1.cookie("hi!");
        org.jsoup.Connection.Request request25 = null;
        response1.req = request25;
        boolean boolean27 = response1.executed;
        java.nio.ByteBuffer byteBuffer28 = null;
        response1.byteData = byteBuffer28;
        java.lang.Class<?> wildcardClass30 = response1.getClass();
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertNull(strEntry13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(strMap19);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test08392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08392");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        response1.charset = "";
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry8 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        java.lang.String str11 = response1.statusMessage;
        response1.contentType = "hi!";
        java.lang.String str14 = response1.statusMessage();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document15 = response1.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNotNull(strEntry8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test08393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08393");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        int int8 = response1.numRedirects;
        response1.contentType = "hi!";
        java.nio.ByteBuffer byteBuffer11 = response1.byteData;
        java.nio.ByteBuffer byteBuffer12 = null;
        response1.byteData = byteBuffer12;
        org.jsoup.Connection.Response response16 = response1.header("hi!", "hi!");
        org.jsoup.Connection.Method method17 = response1.method();
        java.lang.String str19 = response1.header("hi!");
        java.lang.String str20 = response1.contentType();
        java.nio.ByteBuffer byteBuffer21 = response1.byteData;
        boolean boolean22 = response1.executed;
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertNull(method17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNull(byteBuffer21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test08394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08394");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.numRedirects = (byte) -1;
        java.lang.String str4 = response1.statusMessage;
        org.jsoup.Connection.Request request5 = response1.req;
        java.net.URL uRL6 = response1.url();
        java.lang.String str7 = response1.contentType();
        java.lang.String str8 = response1.contentType();
        response1.numRedirects = (short) -1;
        java.lang.String str11 = response1.charset;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(request5);
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test08395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08395");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        org.jsoup.Connection.Response response8 = response1.cookie("hi!", "");
        boolean boolean9 = response1.executed;
        response1.contentType = "";
        java.lang.String str12 = response1.charset;
        boolean boolean14 = response1.hasCookie("hi!");
        java.lang.String str16 = response1.getHeaderCaseInsensitive("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap17 = response1.headers();
        response1.numRedirects = (short) 10;
        java.nio.ByteBuffer byteBuffer20 = null;
        response1.byteData = byteBuffer20;
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(strMap17);
    }

    @Test
    public void test08396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08396");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        response1.charset = "";
        org.jsoup.Connection.Method method7 = response1.method();
        response1.charset = "";
        response1.numRedirects = (short) 10;
        int int12 = response1.statusCode;
        org.jsoup.Connection.Method method13 = response1.method();
        java.lang.String str14 = response1.statusMessage();
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(method13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test08397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08397");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        response1.executed = false;
        boolean boolean9 = response1.executed;
        int int10 = response1.statusCode();
        response1.executed = false;
        org.jsoup.Connection.Response response15 = response1.cookie("Location", "Location");
        java.lang.String str16 = response1.statusMessage();
        java.util.Map<java.lang.String, java.lang.String> strMap17 = response1.headers();
        java.lang.String str18 = response1.statusMessage;
        org.jsoup.Connection.Response response21 = response1.cookie("Location", "Location");
        java.util.Map<java.lang.String, java.lang.String> strMap22 = response1.headers();
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(strMap17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(response21);
        org.junit.Assert.assertNotNull(strMap22);
    }

    @Test
    public void test08398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08398");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        int int8 = response1.numRedirects;
        response1.contentType = "hi!";
        java.nio.ByteBuffer byteBuffer11 = response1.byteData;
        java.nio.ByteBuffer byteBuffer12 = null;
        response1.byteData = byteBuffer12;
        org.jsoup.Connection.Response response16 = response1.header("hi!", "hi!");
        org.jsoup.Connection.Method method17 = response1.method();
        java.lang.String str18 = response1.charset;
        int int19 = response1.statusCode();
        response1.charset = "hi!";
        response1.numRedirects = (short) 10;
        response1.executed = true;
        java.lang.String str27 = response1.cookie("hi!");
        org.jsoup.Connection.Response response29 = response1.removeHeader("hi!");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean31 = response1.hasCookie("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertNull(method17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(response29);
    }

    @Test
    public void test08399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08399");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response10 = response1.header("", "Location");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
    }

    @Test
    public void test08400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08400");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.charset = "Location";
        int int4 = response1.numRedirects;
        java.nio.ByteBuffer byteBuffer5 = response1.byteData;
        java.nio.ByteBuffer byteBuffer6 = response1.byteData;
        boolean boolean7 = response1.executed;
        java.lang.String str8 = response1.contentType;
        response1.numRedirects = (short) 1;
        org.jsoup.Connection.Response response13 = response1.cookie("Location", "hi!");
        response1.executed = false;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(byteBuffer5);
        org.junit.Assert.assertNull(byteBuffer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(response13);
    }

    @Test
    public void test08401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08401");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        int int8 = response1.numRedirects;
        response1.contentType = "hi!";
        java.nio.ByteBuffer byteBuffer11 = response1.byteData;
        java.nio.ByteBuffer byteBuffer12 = null;
        response1.byteData = byteBuffer12;
        org.jsoup.Connection.Response response16 = response1.header("hi!", "hi!");
        org.jsoup.Connection.Method method17 = response1.method();
        java.lang.String str19 = response1.header("hi!");
        java.lang.String str20 = response1.contentType();
        java.nio.ByteBuffer byteBuffer21 = response1.byteData;
        org.jsoup.Connection.Method method22 = response1.method();
        org.jsoup.Connection.Response response24 = response1.removeCookie("Location");
        java.nio.ByteBuffer byteBuffer25 = null;
        response1.byteData = byteBuffer25;
        org.jsoup.Connection.Method method27 = response1.method();
        java.lang.String str28 = response1.statusMessage;
        org.jsoup.Connection.Request request29 = response1.req;
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertNull(method17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNull(byteBuffer21);
        org.junit.Assert.assertNull(method22);
        org.junit.Assert.assertNotNull(response24);
        org.junit.Assert.assertNull(method27);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(request29);
    }

    @Test
    public void test08402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08402");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        response1.charset = "";
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry8 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        response1.statusCode = (byte) 0;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry14 = response1.scanHeaders("hi!");
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNotNull(strEntry8);
        org.junit.Assert.assertNotNull(strEntry14);
    }

    @Test
    public void test08403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08403");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        org.jsoup.Connection.Response response8 = response1.cookie("hi!", "");
        java.net.URL uRL9 = response1.url();
        java.nio.ByteBuffer byteBuffer10 = null;
        response1.byteData = byteBuffer10;
        java.lang.String str12 = response1.contentType;
        org.jsoup.Connection.Method method13 = response1.method();
        response1.statusMessage = "Location";
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry17 = response1.scanHeaders("hi!");
        response1.contentType = "hi!";
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(method13);
        org.junit.Assert.assertNull(strEntry17);
    }

    @Test
    public void test08404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08404");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        response1.charset = "";
        response1.statusMessage = "";
        java.lang.String str10 = response1.getHeaderCaseInsensitive("");
        boolean boolean13 = response1.hasHeaderWithValue("Location", "");
        int int14 = response1.statusCode();
        boolean boolean17 = response1.hasHeaderWithValue("Location", "Location");
        java.lang.String str18 = response1.charset;
        java.lang.String str20 = response1.header("Location");
        boolean boolean22 = response1.hasCookie("Location");
        org.jsoup.Connection.Method method23 = response1.method();
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(method23);
    }

    @Test
    public void test08405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08405");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        response1.charset = "";
        response1.statusMessage = "";
        java.lang.String str10 = response1.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response13 = response1.cookie("Location", "hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap14 = response1.cookies();
        java.net.URL uRL15 = response1.url();
        java.lang.String str16 = response1.charset;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry18 = response1.scanHeaders("Location");
        org.jsoup.Connection.Method method19 = response1.method();
        java.lang.String str20 = response1.statusMessage();
        java.lang.String str22 = response1.header("hi!");
        java.lang.Class<?> wildcardClass23 = response1.getClass();
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNull(uRL15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(strEntry18);
        org.junit.Assert.assertNull(method19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test08406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08406");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        response1.executed = false;
        org.jsoup.Connection.Response response11 = response1.header("Location", "");
        int int12 = response1.statusCode();
        boolean boolean15 = response1.hasHeaderWithValue("Location", "Location");
        java.lang.String str16 = response1.contentType();
        org.jsoup.Connection.Request request17 = response1.req;
        org.jsoup.Connection.Response response20 = response1.header("hi!", "");
        java.lang.String str21 = response1.charset;
        org.jsoup.Connection.Request request22 = null;
        response1.req = request22;
        org.jsoup.Connection.Request request24 = response1.req;
        java.lang.String str25 = response1.contentType();
        response1.statusCode = 35;
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(request17);
        org.junit.Assert.assertNotNull(response20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(request24);
        org.junit.Assert.assertNull(str25);
    }

    @Test
    public void test08407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08407");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        int int8 = response1.numRedirects;
        response1.contentType = "hi!";
        java.nio.ByteBuffer byteBuffer11 = response1.byteData;
        java.nio.ByteBuffer byteBuffer12 = null;
        response1.byteData = byteBuffer12;
        java.lang.String str15 = response1.header("Location");
        java.lang.String str17 = response1.cookie("hi!");
        org.jsoup.Connection.Response response19 = response1.removeCookie("hi!");
        java.net.URL uRL20 = response1.url();
        java.lang.String str22 = response1.header("hi!");
        java.lang.Class<?> wildcardClass23 = response1.getClass();
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(response19);
        org.junit.Assert.assertNull(uRL20);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test08408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08408");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        int int8 = response1.numRedirects;
        response1.contentType = "hi!";
        java.nio.ByteBuffer byteBuffer11 = response1.byteData;
        java.nio.ByteBuffer byteBuffer12 = null;
        response1.byteData = byteBuffer12;
        boolean boolean15 = response1.hasCookie("Location");
        org.jsoup.Connection.Response response17 = response1.removeHeader("hi!");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry19 = response1.scanHeaders("hi!");
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(response17);
        org.junit.Assert.assertNull(strEntry19);
    }

    @Test
    public void test08409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08409");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        org.jsoup.Connection.Request request5 = null;
        response1.req = request5;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry8 = response1.scanHeaders("Location");
        boolean boolean11 = response1.hasHeaderWithValue("hi!", "");
        java.util.Map<java.lang.String, java.lang.String> strMap12 = response1.headers();
        java.nio.ByteBuffer byteBuffer13 = response1.byteData;
        int int14 = response1.numRedirects;
        response1.numRedirects = (short) 0;
        java.lang.String str17 = response1.contentType;
        response1.charset = "hi!";
        org.jsoup.Connection.Response response21 = response1.removeHeader("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = response1.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(strEntry8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertNull(byteBuffer13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(response21);
    }

    @Test
    public void test08410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08410");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        int int8 = response1.numRedirects;
        response1.contentType = "hi!";
        response1.charset = "Location";
        org.jsoup.Connection.Request request13 = response1.req;
        java.net.URL uRL14 = response1.url();
        java.lang.String str15 = response1.charset;
        java.lang.String str17 = response1.header("Location");
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(request13);
        org.junit.Assert.assertNull(uRL14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Location" + "'", str15, "Location");
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test08411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08411");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        int int8 = response1.numRedirects;
        response1.contentType = "hi!";
        java.nio.ByteBuffer byteBuffer11 = response1.byteData;
        java.nio.ByteBuffer byteBuffer12 = null;
        response1.byteData = byteBuffer12;
        org.jsoup.Connection.Response response16 = response1.header("hi!", "hi!");
        org.jsoup.Connection.Method method17 = response1.method();
        java.lang.String str19 = response1.header("hi!");
        java.lang.String str20 = response1.contentType();
        response1.statusCode = '4';
        int int23 = response1.statusCode;
        java.lang.String str24 = response1.contentType();
        org.jsoup.Connection.Response response26 = response1.removeCookie("hi!");
        java.lang.String str27 = response1.statusMessage;
        java.lang.String str28 = response1.contentType;
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertNull(method17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 52 + "'", int23 == 52);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertNotNull(response26);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
    }

    @Test
    public void test08412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08412");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        response1.charset = "";
        response1.statusMessage = "";
        java.lang.String str10 = response1.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response13 = response1.cookie("Location", "hi!");
        java.lang.String str15 = response1.header("");
        response1.statusMessage = "";
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test08413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08413");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        response1.statusMessage = "hi!";
        boolean boolean11 = response1.hasHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str14 = response12.getHeaderCaseInsensitive("hi!");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry16 = response12.scanHeaders("Location");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = response12.hasHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(strEntry16);
    }

    @Test
    public void test08414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08414");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        response1.executed = false;
        boolean boolean9 = response1.executed;
        int int10 = response1.statusCode();
        java.lang.String str11 = response1.contentType;
        java.lang.String str12 = response1.charset();
        int int13 = response1.statusCode;
        boolean boolean16 = response1.hasHeaderWithValue("hi!", "Location");
        org.jsoup.Connection.Request request17 = null;
        response1.req = request17;
        org.jsoup.Connection.Response response21 = response1.cookie("Location", "Location");
        response1.numRedirects = (-1);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(response21);
    }

    @Test
    public void test08415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08415");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        int int8 = response1.numRedirects;
        response1.contentType = "hi!";
        java.nio.ByteBuffer byteBuffer11 = response1.byteData;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry13 = response1.scanHeaders("");
        java.lang.String str15 = response1.header("Location");
        response1.statusCode = (byte) 100;
        java.lang.String str18 = response1.statusMessage();
        java.util.Map<java.lang.String, java.lang.String> strMap19 = response1.headers();
        java.lang.String str21 = response1.header("hi!");
        boolean boolean23 = response1.hasHeader("Location");
        int int24 = response1.numRedirects;
        java.nio.ByteBuffer byteBuffer25 = response1.byteData;
        int int26 = response1.numRedirects;
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertNull(strEntry13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(strMap19);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNull(byteBuffer25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test08416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08416");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        response1.charset = "";
        response1.statusMessage = "";
        java.lang.String str10 = response1.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response13 = response1.cookie("Location", "hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap14 = response1.cookies();
        java.net.URL uRL15 = response1.url();
        boolean boolean17 = response1.hasHeader("hi!");
        java.lang.String str19 = response1.getHeaderCaseInsensitive("Location");
        java.nio.ByteBuffer byteBuffer20 = null;
        response1.byteData = byteBuffer20;
        int int22 = response1.numRedirects;
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray23 = response1.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNull(uRL15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test08417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08417");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        java.lang.String str7 = response1.contentType();
        java.lang.String str9 = response1.header("hi!");
        java.nio.ByteBuffer byteBuffer10 = response1.byteData;
        int int11 = response1.statusCode;
        java.lang.String str12 = response1.charset;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry14 = response1.scanHeaders("Location");
        org.jsoup.Connection.Method method15 = response1.method();
        response1.contentType = "hi!";
        java.lang.String str18 = response1.contentType;
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(byteBuffer10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(strEntry14);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test08418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08418");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.charset = "Location";
        int int4 = response1.numRedirects;
        java.nio.ByteBuffer byteBuffer5 = response1.byteData;
        java.nio.ByteBuffer byteBuffer6 = response1.byteData;
        java.nio.ByteBuffer byteBuffer7 = null;
        response1.byteData = byteBuffer7;
        org.jsoup.Connection.Response response11 = response1.cookie("Location", "hi!");
        int int12 = response1.numRedirects;
        java.lang.String str13 = response1.statusMessage;
        org.jsoup.Connection.Response response15 = response1.removeCookie("Location");
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.net.URL uRL17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response18 = response1.url(uRL17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(byteBuffer5);
        org.junit.Assert.assertNull(byteBuffer6);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(response15);
    }

    @Test
    public void test08419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08419");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        java.lang.String str7 = response1.contentType();
        java.lang.String str8 = response1.contentType();
        org.jsoup.Connection.Response response10 = response1.removeHeader("Location");
        java.lang.String str11 = response1.contentType;
        java.lang.String str13 = response1.getHeaderCaseInsensitive("");
        java.util.Map<java.lang.String, java.lang.String> strMap14 = response1.headers();
        org.jsoup.Connection.Response response17 = response1.header("hi!", "Location");
        org.jsoup.Connection.Request request18 = response1.req;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = response1.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNotNull(response17);
        org.junit.Assert.assertNull(request18);
    }

    @Test
    public void test08420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08420");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        boolean boolean6 = response1.hasCookie("hi!");
        response1.charset = "hi!";
        org.jsoup.Connection.Method method9 = response1.method();
        java.net.URL uRL10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response11 = response1.url(uRL10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(method9);
    }

    @Test
    public void test08421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08421");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        org.jsoup.Connection.Response response6 = response1.removeCookie("Location");
        response1.statusCode = '#';
        boolean boolean9 = response1.executed;
        java.lang.String str10 = response1.contentType();
        response1.charset = "hi!";
        boolean boolean13 = response1.executed;
        org.jsoup.Connection.Response response15 = response1.removeCookie("hi!");
        response1.numRedirects = (byte) 100;
        java.util.Map<java.lang.String, java.lang.String> strMap18 = response1.cookies();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response20 = response1.removeCookie("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertNotNull(strMap18);
    }

    @Test
    public void test08422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08422");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        response1.executed = false;
        org.jsoup.Connection.Response response11 = response1.header("Location", "");
        response1.statusMessage = "";
        response1.executed = true;
        response1.statusMessage = "";
        java.lang.String str18 = response1.statusMessage;
        boolean boolean21 = response1.hasHeaderWithValue("Location", "hi!");
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test08423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08423");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        response1.charset = "";
        response1.statusMessage = "";
        response1.statusMessage = "Location";
        java.util.Map<java.lang.String, java.lang.String> strMap11 = response1.cookies();
        org.jsoup.Connection.Request request12 = response1.req;
        response1.numRedirects = (short) 0;
        java.util.Map<java.lang.String, java.lang.String> strMap15 = response1.cookies();
        java.lang.Class<?> wildcardClass16 = response1.getClass();
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNull(request12);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test08424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08424");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        org.jsoup.Connection.Response response8 = response1.cookie("hi!", "");
        java.lang.String str10 = response1.cookie("hi!");
        boolean boolean11 = response1.executed;
        response1.contentType = "";
        response1.executed = false;
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response1);
        boolean boolean17 = response16.executed;
        int int18 = response16.statusCode();
        java.lang.String str19 = response16.charset;
        response16.statusMessage = "hi!";
        java.lang.String str22 = response16.charset();
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test08425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08425");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        java.lang.String str8 = response1.contentType();
        java.lang.String str9 = response1.contentType;
        boolean boolean11 = response1.hasHeader("hi!");
        java.net.URL uRL12 = response1.url();
        boolean boolean14 = response1.hasCookie("Location");
        org.jsoup.Connection.Response response17 = response1.header("hi!", "");
        boolean boolean18 = response1.executed;
        org.jsoup.Connection.Response response20 = response1.removeCookie("hi!");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray21 = response1.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(uRL12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(response17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(response20);
    }

    @Test
    public void test08426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08426");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        response2.statusMessage = "hi!";
        java.nio.ByteBuffer byteBuffer5 = response2.byteData;
        org.junit.Assert.assertNull(byteBuffer5);
    }

    @Test
    public void test08427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08427");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        int int7 = response1.statusCode();
        response1.numRedirects = (byte) 10;
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test08428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08428");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.charset = "Location";
        boolean boolean6 = response1.hasHeaderWithValue("hi!", "Location");
        response1.numRedirects = (byte) 100;
        java.util.Map<java.lang.String, java.lang.String> strMap9 = response1.cookies();
        response1.numRedirects = ' ';
        java.net.URL uRL12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response13 = response1.url(uRL12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strMap9);
    }

    @Test
    public void test08429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08429");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        java.lang.String str8 = response1.contentType();
        response1.charset = "hi!";
        org.jsoup.Connection.Response response12 = response1.removeHeader("Location");
        java.lang.String str14 = response1.getHeaderCaseInsensitive("Location");
        java.util.Map<java.lang.String, java.lang.String> strMap15 = response1.headers();
        java.util.Map<java.lang.String, java.lang.String> strMap16 = response1.headers();
        java.lang.String str17 = response1.contentType();
        response1.charset = "hi!";
        org.jsoup.Connection.Request request20 = null;
        response1.req = request20;
        boolean boolean23 = response1.hasHeader("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document24 = response1.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test08430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08430");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.numRedirects = (byte) -1;
        int int4 = response1.statusCode;
        response1.contentType = "";
        org.jsoup.Connection.Request request7 = response1.req;
        response1.statusCode = (byte) -1;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(request7);
    }

    @Test
    public void test08431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08431");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        response1.executed = false;
        org.jsoup.Connection.Response response11 = response1.header("Location", "");
        int int12 = response1.statusCode;
        java.lang.String str13 = response1.charset();
        org.jsoup.Connection.Response response16 = response1.header("hi!", "hi!");
        java.lang.String str17 = response1.statusMessage;
        response1.numRedirects = 100;
        int int20 = response1.statusCode;
        org.jsoup.Connection.Response response23 = response1.cookie("Location", "Location");
        org.jsoup.Connection.Method method24 = response1.method();
        response1.statusCode = (byte) 10;
        response1.executed = true;
        boolean boolean30 = response1.hasHeader("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response31 = new org.jsoup.helper.HttpConnection.Response(response1);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Too many redirects occurred trying to load URL null");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(response23);
        org.junit.Assert.assertNull(method24);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test08432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08432");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        int int8 = response1.numRedirects;
        response1.contentType = "hi!";
        java.nio.ByteBuffer byteBuffer11 = response1.byteData;
        java.lang.String str12 = response1.contentType;
        org.jsoup.Connection.Response response15 = response1.cookie("Location", "Location");
        int int16 = response1.numRedirects;
        int int17 = response1.numRedirects;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry19 = response1.scanHeaders("");
        java.nio.ByteBuffer byteBuffer20 = null;
        response1.byteData = byteBuffer20;
        java.lang.String str23 = response1.cookie("hi!");
        java.lang.String str24 = response1.contentType();
        boolean boolean25 = response1.executed;
        java.lang.String str27 = response1.header("Location");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str28 = response1.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(strEntry19);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(str27);
    }

    @Test
    public void test08433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08433");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        java.lang.String str7 = response1.contentType();
        java.lang.String str9 = response1.header("hi!");
        java.lang.String str10 = response1.statusMessage;
        org.jsoup.Connection.Method method11 = response1.method();
        org.jsoup.Connection.Request request12 = null;
        response1.req = request12;
        org.jsoup.Connection.Request request14 = response1.req;
        boolean boolean17 = response1.hasHeaderWithValue("Location", "");
        org.jsoup.Connection.Response response20 = response1.cookie("Location", "");
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(method11);
        org.junit.Assert.assertNull(request14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(response20);
    }

    @Test
    public void test08434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08434");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        response1.charset = "";
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry8 = response1.scanHeaders("hi!");
        response1.executed = false;
        java.lang.String str12 = response1.cookie("hi!");
        org.jsoup.Connection.Response response15 = response1.cookie("hi!", "");
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNotNull(strEntry8);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(response15);
    }

    @Test
    public void test08435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08435");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        int int8 = response1.numRedirects;
        response1.contentType = "hi!";
        java.nio.ByteBuffer byteBuffer11 = response1.byteData;
        java.lang.String str12 = response1.contentType;
        java.lang.String str14 = response1.getHeaderCaseInsensitive("hi!");
        org.jsoup.Connection.Request request15 = null;
        response1.req = request15;
        java.lang.String str17 = response1.contentType();
        response1.statusMessage = "Location";
        org.jsoup.Connection.Request request20 = response1.req;
        boolean boolean22 = response1.hasHeader("Location");
        java.lang.String str23 = response1.statusMessage();
        org.jsoup.Connection.Response response26 = response1.header("Location", "Location");
        java.lang.String str27 = response1.contentType();
        response1.statusCode = (short) 0;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document30 = response1.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNull(request20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Location" + "'", str23, "Location");
        org.junit.Assert.assertNotNull(response26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
    }

    @Test
    public void test08436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08436");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        response1.executed = false;
        boolean boolean9 = response1.executed;
        int int10 = response1.statusCode();
        java.lang.String str11 = response1.contentType;
        response1.statusMessage = "Location";
        java.lang.String str15 = response1.cookie("hi!");
        java.lang.String str17 = response1.getHeaderCaseInsensitive("");
        java.lang.String str18 = response1.statusMessage();
        boolean boolean20 = response1.hasCookie("Location");
        org.jsoup.Connection.Response response23 = response1.cookie("hi!", "hi!");
        org.jsoup.Connection.Response response25 = response1.removeHeader("Location");
        int int26 = response1.statusCode;
        int int27 = response1.statusCode;
        response1.statusCode = (byte) -1;
        java.net.URL uRL30 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response31 = response1.url(uRL30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Location" + "'", str18, "Location");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(response23);
        org.junit.Assert.assertNotNull(response25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test08437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08437");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        java.lang.String str8 = response1.contentType();
        java.lang.String str9 = response1.contentType;
        boolean boolean11 = response1.hasHeader("hi!");
        java.net.URL uRL12 = response1.url();
        boolean boolean14 = response1.hasCookie("Location");
        int int15 = response1.numRedirects;
        int int16 = response1.numRedirects;
        java.util.Map<java.lang.String, java.lang.String> strMap17 = response1.headers();
        java.lang.String str18 = response1.contentType;
        java.lang.String str19 = response1.statusMessage;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document20 = response1.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(uRL12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(strMap17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test08438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08438");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        int int8 = response1.numRedirects;
        response1.contentType = "hi!";
        java.nio.ByteBuffer byteBuffer11 = response1.byteData;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry13 = response1.scanHeaders("");
        java.lang.String str15 = response1.header("Location");
        java.nio.ByteBuffer byteBuffer16 = null;
        response1.byteData = byteBuffer16;
        int int18 = response1.statusCode();
        java.lang.String str19 = response1.statusMessage();
        org.jsoup.Connection.Method method20 = response1.method();
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertNull(strEntry13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(method20);
    }

    @Test
    public void test08439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08439");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        response1.statusCode = 10;
        int int9 = response1.numRedirects;
        boolean boolean10 = response1.executed;
        java.lang.String str11 = response1.statusMessage();
        response1.statusCode = (short) -1;
        java.lang.String str14 = response1.charset();
        org.jsoup.Connection.Request request15 = response1.req;
        org.jsoup.Connection.Request request16 = null;
        response1.req = request16;
        int int18 = response1.statusCode();
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(request15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test08440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08440");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        response1.executed = false;
        response1.executed = true;
        org.jsoup.Connection.Method method11 = response1.method();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry13 = response1.scanHeaders("Location");
        response1.statusMessage = "";
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(method11);
        org.junit.Assert.assertNull(strEntry13);
    }

    @Test
    public void test08441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08441");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        java.lang.String str8 = response1.contentType();
        java.lang.String str9 = response1.contentType;
        boolean boolean11 = response1.hasHeader("hi!");
        java.net.URL uRL12 = response1.url();
        boolean boolean14 = response1.hasCookie("Location");
        int int15 = response1.numRedirects;
        org.jsoup.Connection.Response response18 = response1.header("hi!", "Location");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document19 = response1.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(uRL12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(response18);
    }

    @Test
    public void test08442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08442");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        int int8 = response1.numRedirects;
        response1.contentType = "hi!";
        java.nio.ByteBuffer byteBuffer11 = response1.byteData;
        java.nio.ByteBuffer byteBuffer12 = null;
        response1.byteData = byteBuffer12;
        org.jsoup.Connection.Response response16 = response1.header("hi!", "hi!");
        org.jsoup.Connection.Method method17 = response1.method();
        java.lang.String str19 = response1.getHeaderCaseInsensitive("Location");
        java.lang.String str21 = response1.getHeaderCaseInsensitive("Location");
        java.lang.String str23 = response1.getHeaderCaseInsensitive("Location");
        response1.numRedirects = (byte) 10;
        response1.contentType = "Location";
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertNull(method17);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test08443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08443");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        int int8 = response1.numRedirects;
        response1.contentType = "hi!";
        java.nio.ByteBuffer byteBuffer11 = response1.byteData;
        java.lang.String str12 = response1.contentType;
        response1.statusCode = (short) 1;
        response1.numRedirects = (-1);
        java.lang.String str17 = response1.statusMessage;
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test08444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08444");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        int int8 = response1.numRedirects;
        response1.contentType = "hi!";
        java.nio.ByteBuffer byteBuffer11 = response1.byteData;
        java.lang.String str12 = response1.contentType;
        java.lang.String str14 = response1.getHeaderCaseInsensitive("hi!");
        org.jsoup.Connection.Request request15 = null;
        response1.req = request15;
        java.lang.String str18 = response1.header("hi!");
        org.jsoup.Connection.Response response20 = response1.removeHeader("hi!");
        org.jsoup.Connection.Method method21 = response1.method();
        org.jsoup.Connection.Request request22 = null;
        response1.req = request22;
        java.lang.String str24 = response1.charset();
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(response20);
        org.junit.Assert.assertNull(method21);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
    }

    @Test
    public void test08445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08445");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        java.lang.String str8 = response1.cookie("hi!");
        java.lang.String str10 = response1.header("");
        java.net.URL uRL11 = response1.url();
        boolean boolean12 = response1.executed;
        int int13 = response1.statusCode();
        java.lang.String str14 = response1.statusMessage;
        java.lang.Class<?> wildcardClass15 = response1.getClass();
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test08446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08446");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        response1.executed = false;
        boolean boolean9 = response1.executed;
        int int10 = response1.statusCode();
        response1.executed = false;
        org.jsoup.Connection.Method method13 = response1.method();
        org.jsoup.Connection.Response response15 = response1.removeHeader("Location");
        response1.numRedirects = '#';
        org.jsoup.Connection.Method method18 = response1.method();
        response1.charset = "";
        org.jsoup.Connection.Request request21 = null;
        response1.req = request21;
        response1.contentType = "hi!";
        java.lang.String str25 = response1.statusMessage();
        response1.contentType = "hi!";
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(method13);
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertNull(method18);
        org.junit.Assert.assertNull(str25);
    }

    @Test
    public void test08447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08447");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        java.lang.String str7 = response1.contentType();
        java.lang.String str8 = response1.contentType();
        org.jsoup.Connection.Response response10 = response1.removeHeader("Location");
        java.lang.String str11 = response1.contentType;
        java.lang.String str13 = response1.cookie("hi!");
        java.lang.String str14 = response1.statusMessage();
        int int15 = response1.statusCode();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = response1.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test08448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08448");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        response1.statusMessage = "hi!";
        boolean boolean11 = response1.hasHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.nio.ByteBuffer byteBuffer13 = null;
        response1.byteData = byteBuffer13;
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.net.URL uRL16 = response1.url();
        response1.numRedirects = (byte) 1;
        response1.executed = true;
        java.lang.String str21 = response1.contentType;
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(uRL16);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test08449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08449");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        int int8 = response1.numRedirects;
        response1.contentType = "hi!";
        java.nio.ByteBuffer byteBuffer11 = response1.byteData;
        java.lang.String str12 = response1.contentType;
        java.lang.String str14 = response1.getHeaderCaseInsensitive("hi!");
        org.jsoup.Connection.Request request15 = null;
        response1.req = request15;
        java.lang.String str17 = response1.contentType();
        java.lang.String str19 = response1.header("");
        int int20 = response1.numRedirects;
        int int21 = response1.statusCode();
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test08450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08450");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        response1.executed = false;
        org.jsoup.Connection.Response response11 = response1.header("Location", "");
        int int12 = response1.statusCode;
        boolean boolean14 = response1.hasCookie("hi!");
        java.lang.String str15 = response1.statusMessage;
        java.lang.String str16 = response1.charset();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = response1.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test08451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08451");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        response1.charset = "";
        response1.statusMessage = "";
        java.lang.String str10 = response1.getHeaderCaseInsensitive("");
        boolean boolean11 = response1.executed;
        int int12 = response1.numRedirects;
        java.nio.ByteBuffer byteBuffer13 = response1.byteData;
        java.lang.String str15 = response1.header("");
        response1.numRedirects = (byte) 100;
        org.jsoup.Connection.Response response20 = response1.header("hi!", "");
        org.jsoup.Connection.Method method21 = response1.method();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = response1.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(byteBuffer13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(response20);
        org.junit.Assert.assertNull(method21);
    }

    @Test
    public void test08452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08452");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.nio.ByteBuffer byteBuffer2 = null;
        response1.byteData = byteBuffer2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        java.lang.String str7 = response1.getHeaderCaseInsensitive("Location");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = response1.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test08453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08453");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Request request3 = null;
        response2.req = request3;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry6 = response2.scanHeaders("hi!");
        org.jsoup.Connection.Response response9 = response2.cookie("hi!", "");
        java.net.URL uRL10 = response2.url();
        java.nio.ByteBuffer byteBuffer11 = null;
        response2.byteData = byteBuffer11;
        java.lang.String str13 = response2.contentType;
        org.jsoup.Connection.Method method14 = response2.method();
        response2.statusCode = 0;
        java.util.Map<java.lang.String, java.lang.String> strMap17 = response2.headers();
        java.nio.ByteBuffer byteBuffer18 = null;
        response2.byteData = byteBuffer18;
        int int20 = response2.numRedirects;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response21 = org.jsoup.helper.HttpConnection.Response.execute(request0, response2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry6);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertNull(uRL10);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(method14);
        org.junit.Assert.assertNotNull(strMap17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test08454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08454");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        response1.charset = "";
        response1.statusMessage = "";
        java.lang.String str10 = response1.getHeaderCaseInsensitive("");
        boolean boolean11 = response1.executed;
        int int12 = response1.numRedirects;
        response1.charset = "Location";
        response1.charset = "hi!";
        response1.statusCode = (short) -1;
        org.jsoup.Connection.Request request19 = null;
        response1.req = request19;
        response1.statusCode = 'a';
        org.jsoup.helper.HttpConnection.Response response23 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Method method24 = response1.method();
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(method24);
    }

    @Test
    public void test08455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08455");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        org.jsoup.Connection.Response response8 = response1.cookie("hi!", "");
        boolean boolean9 = response1.executed;
        int int10 = response1.statusCode;
        response1.statusMessage = "hi!";
        java.lang.String str13 = response1.statusMessage();
        org.jsoup.Connection.Method method14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response15 = response1.method(method14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test08456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08456");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        int int8 = response1.numRedirects;
        response1.contentType = "hi!";
        java.nio.ByteBuffer byteBuffer11 = response1.byteData;
        java.nio.ByteBuffer byteBuffer12 = null;
        response1.byteData = byteBuffer12;
        org.jsoup.Connection.Request request14 = response1.req;
        response1.statusMessage = "Location";
        org.jsoup.Connection.Request request17 = response1.req;
        java.lang.String str18 = response1.statusMessage();
        boolean boolean19 = response1.executed;
        org.jsoup.helper.HttpConnection.Response response20 = new org.jsoup.helper.HttpConnection.Response(response1);
        response1.statusCode = (byte) 1;
        boolean boolean25 = response1.hasHeaderWithValue("hi!", "Location");
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertNull(request14);
        org.junit.Assert.assertNull(request17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Location" + "'", str18, "Location");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test08457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08457");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        org.jsoup.Connection.Request request5 = null;
        response1.req = request5;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry8 = response1.scanHeaders("Location");
        boolean boolean11 = response1.hasHeaderWithValue("hi!", "");
        response1.statusCode = (short) -1;
        int int14 = response1.numRedirects;
        org.jsoup.Connection.Response response17 = response1.header("Location", "hi!");
        boolean boolean20 = response1.hasHeaderWithValue("Location", "hi!");
        response1.numRedirects = (byte) -1;
        java.lang.String str23 = response1.contentType;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = response1.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(strEntry8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(response17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test08458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08458");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        java.lang.String str8 = response1.contentType();
        java.lang.String str9 = response1.contentType;
        int int10 = response1.statusCode();
        java.nio.ByteBuffer byteBuffer11 = response1.byteData;
        org.jsoup.Connection.Request request12 = null;
        response1.req = request12;
        java.lang.String str15 = response1.getHeaderCaseInsensitive("");
        response1.executed = false;
        java.lang.String str18 = response1.charset();
        java.lang.String str19 = response1.charset;
        java.util.Map<java.lang.String, java.lang.String> strMap20 = response1.headers();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response23 = response1.cookie("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(strMap20);
    }

    @Test
    public void test08459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08459");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        java.lang.String str7 = response1.contentType();
        java.lang.String str9 = response1.header("hi!");
        java.lang.String str10 = response1.statusMessage;
        org.jsoup.Connection.Method method11 = response1.method();
        boolean boolean14 = response1.hasHeaderWithValue("Location", "hi!");
        int int15 = response1.statusCode;
        org.jsoup.Connection.Method method16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response17 = response1.method(method16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(method11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test08460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08460");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        org.jsoup.Connection.Response response8 = response1.removeHeader("Location");
        java.lang.String str9 = response1.contentType;
        java.util.Map<java.lang.String, java.lang.String> strMap10 = response1.cookies();
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Response response14 = response1.cookie("hi!", "Location");
        response1.numRedirects = (short) 100;
        java.nio.ByteBuffer byteBuffer17 = response1.byteData;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response(response1);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Too many redirects occurred trying to load URL null");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertNull(byteBuffer17);
    }

    @Test
    public void test08461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08461");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        int int8 = response1.numRedirects;
        response1.contentType = "hi!";
        java.nio.ByteBuffer byteBuffer11 = response1.byteData;
        java.nio.ByteBuffer byteBuffer12 = null;
        response1.byteData = byteBuffer12;
        org.jsoup.Connection.Response response16 = response1.header("hi!", "hi!");
        org.jsoup.Connection.Method method17 = response1.method();
        java.lang.String str19 = response1.header("hi!");
        response1.charset = "";
        org.jsoup.helper.HttpConnection.Response response22 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str23 = response1.statusMessage;
        java.nio.ByteBuffer byteBuffer24 = null;
        response1.byteData = byteBuffer24;
        org.jsoup.Connection.Response response28 = response1.header("Location", "Location");
        org.jsoup.Connection.Response response30 = response1.removeCookie("Location");
        boolean boolean32 = response1.hasCookie("Location");
        java.lang.String str33 = response1.contentType();
        response1.executed = false;
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertNull(method17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(response28);
        org.junit.Assert.assertNotNull(response30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
    }

    @Test
    public void test08462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08462");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.nio.ByteBuffer byteBuffer2 = null;
        response1.byteData = byteBuffer2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        java.lang.String str7 = response1.getHeaderCaseInsensitive("Location");
        java.lang.String str8 = response1.charset();
        response1.executed = false;
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test08463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08463");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        org.jsoup.Connection.Request request5 = null;
        response1.req = request5;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry8 = response1.scanHeaders("Location");
        java.lang.String str9 = response1.contentType;
        java.util.Map<java.lang.String, java.lang.String> strMap10 = response1.headers();
        response1.statusMessage = "hi!";
        org.jsoup.Connection.Method method13 = response1.method();
        java.lang.String str14 = response1.charset();
        java.lang.String str15 = response1.contentType();
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(strEntry8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNull(method13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test08464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08464");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        int int8 = response1.numRedirects;
        response1.contentType = "hi!";
        java.nio.ByteBuffer byteBuffer11 = response1.byteData;
        java.nio.ByteBuffer byteBuffer12 = null;
        response1.byteData = byteBuffer12;
        java.lang.String str15 = response1.header("Location");
        java.lang.String str17 = response1.cookie("hi!");
        java.lang.String str19 = response1.header("hi!");
        java.lang.String str20 = response1.contentType;
        java.net.HttpURLConnection httpURLConnection21 = null;
        org.jsoup.helper.HttpConnection.Response response22 = null;
        org.jsoup.helper.HttpConnection.Response response23 = new org.jsoup.helper.HttpConnection.Response(response22);
        org.jsoup.Connection.Response response26 = response23.header("hi!", "");
        java.lang.String str28 = response23.getHeaderCaseInsensitive("");
        response23.executed = false;
        org.jsoup.Connection.Response response33 = response23.header("Location", "");
        int int34 = response23.statusCode;
        boolean boolean36 = response23.hasCookie("hi!");
        java.lang.String str37 = response23.statusMessage;
        java.lang.String str38 = response23.charset;
        java.net.URL uRL39 = response23.url();
        response23.charset = "hi!";
        // The following exception was thrown during execution in test generation
        try {
            response1.setupFromConnection(httpURLConnection21, (org.jsoup.Connection.Response) response23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(response26);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNotNull(response33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNull(uRL39);
    }

    @Test
    public void test08465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08465");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        response1.charset = "";
        response1.statusMessage = "";
        java.lang.String str10 = response1.getHeaderCaseInsensitive("");
        boolean boolean11 = response1.executed;
        int int12 = response1.numRedirects;
        response1.charset = "Location";
        response1.charset = "hi!";
        response1.statusCode = (short) -1;
        org.jsoup.Connection.Request request19 = null;
        response1.req = request19;
        boolean boolean22 = response1.hasHeader("hi!");
        org.jsoup.Connection.Response response24 = response1.removeHeader("Location");
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(response24);
    }

    @Test
    public void test08466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08466");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        org.jsoup.Connection.Request request5 = null;
        response1.req = request5;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry8 = response1.scanHeaders("Location");
        boolean boolean11 = response1.hasHeaderWithValue("hi!", "");
        response1.statusCode = (short) -1;
        java.net.URL uRL14 = response1.url();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry16 = response1.scanHeaders("hi!");
        response1.numRedirects = 0;
        response1.contentType = "hi!";
        java.lang.String str21 = response1.contentType;
        org.jsoup.Connection.Response response23 = response1.removeCookie("Location");
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(strEntry8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(uRL14);
        org.junit.Assert.assertNotNull(strEntry16);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNotNull(response23);
    }

    @Test
    public void test08467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08467");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        response1.charset = "";
        java.lang.String str8 = response1.cookie("hi!");
        boolean boolean9 = response1.executed;
        response1.statusMessage = "Location";
        org.jsoup.Connection.Request request12 = null;
        response1.req = request12;
        int int14 = response1.numRedirects;
        org.jsoup.Connection.Response response16 = response1.removeHeader("Location");
        response1.statusMessage = "hi!";
        java.lang.String str20 = response1.cookie("Location");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response23 = response1.header("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test08468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08468");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        response1.statusMessage = "hi!";
        java.lang.String str10 = response1.statusMessage();
        java.util.Map<java.lang.String, java.lang.String> strMap11 = response1.cookies();
        org.jsoup.Connection.Response response14 = response1.header("Location", "hi!");
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNotNull(response14);
    }

    @Test
    public void test08469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08469");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        org.jsoup.Connection.Response response8 = response1.cookie("hi!", "");
        java.lang.String str9 = response1.statusMessage();
        org.jsoup.Connection.Request request10 = response1.req;
        response1.numRedirects = 0;
        response1.numRedirects = (byte) 1;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry16 = response1.scanHeaders("hi!");
        java.nio.ByteBuffer byteBuffer17 = response1.byteData;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response19 = response1.removeCookie("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(request10);
        org.junit.Assert.assertNull(strEntry16);
        org.junit.Assert.assertNull(byteBuffer17);
    }

    @Test
    public void test08470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08470");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        org.jsoup.Connection.Response response6 = response1.removeCookie("Location");
        response1.statusCode = '#';
        java.nio.ByteBuffer byteBuffer9 = null;
        response1.byteData = byteBuffer9;
        java.lang.String str11 = response1.charset();
        org.jsoup.Connection.Request request12 = response1.req;
        response1.numRedirects = (byte) -1;
        java.lang.String str16 = response1.getHeaderCaseInsensitive("");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray17 = response1.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(request12);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test08471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08471");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Response response5 = response2.header("hi!", "");
        response2.charset = "";
        response2.statusMessage = "";
        java.util.Map<java.lang.String, java.lang.String> strMap10 = response2.headers();
        boolean boolean11 = response2.executed;
        int int12 = response2.statusCode;
        java.lang.String str14 = response2.header("hi!");
        java.lang.String str16 = response2.cookie("Location");
        boolean boolean18 = response2.hasHeader("hi!");
        response2.contentType = "Location";
        response2.statusMessage = "Location";
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response23 = org.jsoup.helper.HttpConnection.Response.execute(request0, response2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test08472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08472");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        response1.charset = "";
        java.lang.String str8 = response1.cookie("hi!");
        boolean boolean9 = response1.executed;
        java.lang.String str10 = response1.contentType;
        response1.contentType = "";
        java.lang.String str14 = response1.header("hi!");
        int int15 = response1.statusCode();
        response1.executed = false;
        java.lang.String str19 = response1.cookie("Location");
        org.jsoup.Connection.Response response22 = response1.cookie("hi!", "Location");
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(response22);
    }

    @Test
    public void test08473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08473");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Request request3 = null;
        response2.req = request3;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry6 = response2.scanHeaders("hi!");
        org.jsoup.Connection.Response response9 = response2.cookie("hi!", "");
        boolean boolean10 = response2.executed;
        java.lang.String str11 = response2.contentType;
        int int12 = response2.statusCode();
        org.jsoup.Connection.Request request13 = response2.req;
        java.lang.String str14 = response2.contentType();
        int int15 = response2.numRedirects;
        response2.statusMessage = "";
        java.util.Map<java.lang.String, java.lang.String> strMap18 = response2.headers();
        java.lang.String str20 = response2.header("Location");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response21 = org.jsoup.helper.HttpConnection.Response.execute(request0, response2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry6);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(request13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(strMap18);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test08474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08474");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        int int8 = response1.numRedirects;
        response1.contentType = "hi!";
        java.nio.ByteBuffer byteBuffer11 = response1.byteData;
        java.nio.ByteBuffer byteBuffer12 = null;
        response1.byteData = byteBuffer12;
        org.jsoup.Connection.Response response16 = response1.header("hi!", "hi!");
        org.jsoup.Connection.Method method17 = response1.method();
        java.lang.String str19 = response1.header("hi!");
        java.lang.String str20 = response1.contentType();
        java.nio.ByteBuffer byteBuffer21 = response1.byteData;
        java.nio.ByteBuffer byteBuffer22 = null;
        response1.byteData = byteBuffer22;
        org.jsoup.Connection.Response response25 = response1.removeHeader("Location");
        response1.numRedirects = '4';
        boolean boolean28 = response1.executed;
        java.util.Map<java.lang.String, java.lang.String> strMap29 = response1.headers();
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray30 = response1.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertNull(method17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNull(byteBuffer21);
        org.junit.Assert.assertNotNull(response25);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(strMap29);
    }

    @Test
    public void test08475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08475");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        int int8 = response1.numRedirects;
        response1.contentType = "hi!";
        java.nio.ByteBuffer byteBuffer11 = response1.byteData;
        java.nio.ByteBuffer byteBuffer12 = null;
        response1.byteData = byteBuffer12;
        org.jsoup.Connection.Response response16 = response1.header("hi!", "hi!");
        org.jsoup.Connection.Method method17 = response1.method();
        response1.numRedirects = (byte) 0;
        java.util.Map<java.lang.String, java.lang.String> strMap20 = response1.cookies();
        org.jsoup.Connection.Response response22 = response1.removeHeader("hi!");
        org.jsoup.Connection.Request request23 = null;
        response1.req = request23;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry26 = response1.scanHeaders("hi!");
        java.lang.String str27 = response1.statusMessage();
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertNull(method17);
        org.junit.Assert.assertNotNull(strMap20);
        org.junit.Assert.assertNotNull(response22);
        org.junit.Assert.assertNull(strEntry26);
        org.junit.Assert.assertNull(str27);
    }

    @Test
    public void test08476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08476");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        int int8 = response1.numRedirects;
        response1.contentType = "hi!";
        java.nio.ByteBuffer byteBuffer11 = response1.byteData;
        java.nio.ByteBuffer byteBuffer12 = null;
        response1.byteData = byteBuffer12;
        java.lang.String str15 = response1.header("Location");
        java.lang.String str17 = response1.cookie("hi!");
        org.jsoup.Connection.Response response19 = response1.removeCookie("hi!");
        boolean boolean20 = response1.executed;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document21 = response1.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(response19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test08477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08477");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        response1.charset = "";
        response1.statusMessage = "";
        java.lang.String str10 = response1.getHeaderCaseInsensitive("");
        boolean boolean13 = response1.hasHeaderWithValue("Location", "");
        response1.executed = false;
        java.lang.String str17 = response1.cookie("hi!");
        int int18 = response1.numRedirects;
        boolean boolean19 = response1.executed;
        response1.statusCode = (short) 10;
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test08478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08478");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        response1.charset = "";
        response1.statusMessage = "";
        java.util.Map<java.lang.String, java.lang.String> strMap9 = response1.headers();
        org.jsoup.Connection.Request request10 = response1.req;
        response1.numRedirects = (byte) 100;
        java.lang.String str13 = response1.charset;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response16 = response1.header("", "Location");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNull(request10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test08479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08479");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        int int8 = response1.numRedirects;
        response1.contentType = "hi!";
        java.nio.ByteBuffer byteBuffer11 = response1.byteData;
        java.lang.String str12 = response1.contentType;
        org.jsoup.Connection.Response response15 = response1.cookie("Location", "Location");
        int int16 = response1.numRedirects;
        int int17 = response1.numRedirects;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry19 = response1.scanHeaders("");
        java.nio.ByteBuffer byteBuffer20 = null;
        response1.byteData = byteBuffer20;
        java.util.Map<java.lang.String, java.lang.String> strMap22 = response1.cookies();
        java.net.URL uRL23 = response1.url();
        int int24 = response1.numRedirects;
        java.nio.ByteBuffer byteBuffer25 = response1.byteData;
        org.jsoup.Connection.Response response27 = response1.removeHeader("Location");
        java.nio.ByteBuffer byteBuffer28 = response1.byteData;
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(strEntry19);
        org.junit.Assert.assertNotNull(strMap22);
        org.junit.Assert.assertNull(uRL23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNull(byteBuffer25);
        org.junit.Assert.assertNotNull(response27);
        org.junit.Assert.assertNull(byteBuffer28);
    }

    @Test
    public void test08480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08480");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        response1.executed = false;
        org.jsoup.Connection.Response response11 = response1.header("Location", "");
        int int12 = response1.statusCode;
        boolean boolean14 = response1.hasCookie("hi!");
        java.lang.String str15 = response1.statusMessage;
        java.lang.String str16 = response1.charset;
        java.net.URL uRL17 = response1.url();
        java.nio.ByteBuffer byteBuffer18 = null;
        response1.byteData = byteBuffer18;
        int int20 = response1.statusCode;
        java.lang.String str22 = response1.header("hi!");
        org.jsoup.Connection.Response response25 = response1.header("hi!", "");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean28 = response1.hasHeaderWithValue("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(uRL17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(response25);
    }

    @Test
    public void test08481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08481");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        org.jsoup.Connection.Request request4 = null;
        response1.req = request4;
        java.net.URL uRL6 = response1.url();
        org.jsoup.Connection.Request request7 = response1.req;
        java.lang.String str9 = response1.cookie("Location");
        org.jsoup.Connection.Request request10 = response1.req;
        boolean boolean12 = response1.hasHeader("hi!");
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(request7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(request10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test08482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08482");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        org.jsoup.Connection.Request request4 = null;
        response1.req = request4;
        java.net.URL uRL6 = response1.url();
        org.jsoup.Connection.Request request7 = response1.req;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = response1.hasHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(request7);
    }

    @Test
    public void test08483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08483");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        java.lang.String str8 = response1.contentType();
        java.lang.String str9 = response1.contentType;
        response1.statusMessage = "hi!";
        org.jsoup.Connection.Response response13 = response1.removeHeader("Location");
        org.jsoup.Connection.Response response15 = response1.removeCookie("Location");
        response1.statusCode = '4';
        org.jsoup.Connection.Request request18 = null;
        response1.req = request18;
        java.net.URL uRL20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response21 = response1.url(uRL20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertNotNull(response15);
    }

    @Test
    public void test08484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08484");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        response1.charset = "";
        java.lang.String str8 = response1.cookie("hi!");
        boolean boolean9 = response1.executed;
        java.lang.String str10 = response1.contentType;
        response1.statusCode = (short) 1;
        response1.charset = "Location";
        java.lang.String str16 = response1.cookie("hi!");
        response1.statusMessage = "hi!";
        org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response(response1);
        response19.statusCode = (byte) 0;
        response19.statusCode = 53;
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test08485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08485");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        response1.executed = false;
        org.jsoup.Connection.Response response11 = response1.header("Location", "");
        int int12 = response1.statusCode();
        boolean boolean15 = response1.hasHeaderWithValue("Location", "Location");
        java.lang.String str16 = response1.contentType();
        org.jsoup.Connection.Request request17 = response1.req;
        org.jsoup.Connection.Response response20 = response1.header("hi!", "");
        java.lang.String str21 = response1.charset;
        java.lang.String str22 = response1.contentType;
        java.lang.String str24 = response1.getHeaderCaseInsensitive("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response27 = response1.header("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(request17);
        org.junit.Assert.assertNotNull(response20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test08486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08486");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        response1.charset = "";
        response1.statusMessage = "";
        java.lang.String str10 = response1.getHeaderCaseInsensitive("");
        boolean boolean11 = response1.executed;
        java.nio.ByteBuffer byteBuffer12 = response1.byteData;
        java.lang.String str14 = response1.header("Location");
        boolean boolean15 = response1.executed;
        response1.charset = "";
        java.lang.String str19 = response1.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Method method20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response21 = response1.method(method20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(byteBuffer12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test08487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08487");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        org.jsoup.Connection.Response response8 = response1.cookie("hi!", "");
        java.net.URL uRL9 = response1.url();
        java.nio.ByteBuffer byteBuffer10 = null;
        response1.byteData = byteBuffer10;
        java.lang.String str12 = response1.contentType;
        org.jsoup.Connection.Method method13 = response1.method();
        org.jsoup.Connection.Response response15 = response1.removeCookie("Location");
        int int16 = response1.numRedirects;
        java.nio.ByteBuffer byteBuffer17 = response1.byteData;
        java.lang.String str18 = response1.charset;
        java.lang.String str20 = response1.cookie("hi!");
        java.lang.String str21 = response1.contentType;
        org.jsoup.Connection.Request request22 = null;
        response1.req = request22;
        response1.charset = "";
        java.net.HttpURLConnection httpURLConnection26 = null;
        org.jsoup.helper.HttpConnection.Response response27 = null;
        org.jsoup.helper.HttpConnection.Response response28 = new org.jsoup.helper.HttpConnection.Response(response27);
        org.jsoup.Connection.Request request29 = null;
        response28.req = request29;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry32 = response28.scanHeaders("hi!");
        response28.charset = "hi!";
        int int35 = response28.numRedirects;
        response28.contentType = "hi!";
        java.nio.ByteBuffer byteBuffer38 = response28.byteData;
        java.nio.ByteBuffer byteBuffer39 = null;
        response28.byteData = byteBuffer39;
        org.jsoup.Connection.Response response43 = response28.header("hi!", "hi!");
        org.jsoup.Connection.Method method44 = response28.method();
        java.lang.String str46 = response28.header("hi!");
        java.lang.String str47 = response28.contentType();
        java.nio.ByteBuffer byteBuffer48 = response28.byteData;
        org.jsoup.Connection.Method method49 = response28.method();
        org.jsoup.Connection.Response response51 = response28.removeCookie("Location");
        // The following exception was thrown during execution in test generation
        try {
            response1.setupFromConnection(httpURLConnection26, (org.jsoup.Connection.Response) response28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(method13);
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(byteBuffer17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(strEntry32);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNull(byteBuffer38);
        org.junit.Assert.assertNotNull(response43);
        org.junit.Assert.assertNull(method44);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "hi!" + "'", str46, "hi!");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "hi!" + "'", str47, "hi!");
        org.junit.Assert.assertNull(byteBuffer48);
        org.junit.Assert.assertNull(method49);
        org.junit.Assert.assertNotNull(response51);
    }

    @Test
    public void test08488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08488");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        response1.charset = "";
        response1.statusMessage = "";
        java.lang.String str10 = response1.getHeaderCaseInsensitive("");
        boolean boolean11 = response1.executed;
        int int12 = response1.numRedirects;
        response1.charset = "Location";
        org.jsoup.Connection.Method method15 = response1.method();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response18 = response1.header("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(method15);
    }

    @Test
    public void test08489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08489");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        response1.charset = "";
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry8 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        org.jsoup.Connection.Method method11 = response1.method();
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Method method13 = response1.method();
        java.net.URL uRL14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response15 = response1.url(uRL14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNotNull(strEntry8);
        org.junit.Assert.assertNull(method11);
        org.junit.Assert.assertNull(method13);
    }

    @Test
    public void test08490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08490");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.charset = "Location";
        int int4 = response1.numRedirects;
        java.nio.ByteBuffer byteBuffer5 = response1.byteData;
        java.nio.ByteBuffer byteBuffer6 = response1.byteData;
        java.nio.ByteBuffer byteBuffer7 = null;
        response1.byteData = byteBuffer7;
        org.jsoup.Connection.Response response11 = response1.cookie("Location", "hi!");
        response1.statusMessage = "hi!";
        boolean boolean15 = response1.hasCookie("hi!");
        int int16 = response1.statusCode;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(byteBuffer5);
        org.junit.Assert.assertNull(byteBuffer6);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test08491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08491");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        int int8 = response1.numRedirects;
        response1.contentType = "hi!";
        java.nio.ByteBuffer byteBuffer11 = response1.byteData;
        java.lang.String str12 = response1.contentType;
        org.jsoup.Connection.Response response15 = response1.cookie("Location", "Location");
        int int16 = response1.numRedirects;
        int int17 = response1.numRedirects;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry19 = response1.scanHeaders("");
        java.nio.ByteBuffer byteBuffer20 = null;
        response1.byteData = byteBuffer20;
        java.util.Map<java.lang.String, java.lang.String> strMap22 = response1.cookies();
        org.jsoup.Connection.Request request23 = null;
        response1.req = request23;
        java.lang.String str25 = response1.charset;
        java.lang.String str26 = response1.charset();
        org.jsoup.Connection.Method method27 = response1.method();
        org.jsoup.helper.HttpConnection.Response response28 = new org.jsoup.helper.HttpConnection.Response(response1);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response29 = new org.jsoup.helper.HttpConnection.Response(response28);
// flaky:             org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Too many redirects occurred trying to load URL null");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(strEntry19);
        org.junit.Assert.assertNotNull(strMap22);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertNull(method27);
    }

    @Test
    public void test08492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08492");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        org.jsoup.Connection.Request request4 = null;
        response1.req = request4;
        java.net.URL uRL6 = response1.url();
        org.jsoup.Connection.Request request7 = response1.req;
        java.lang.String str9 = response1.cookie("Location");
        java.lang.String str10 = response1.contentType;
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response1);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response13 = response1.removeHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(request7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test08493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08493");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        int int8 = response1.numRedirects;
        response1.contentType = "hi!";
        java.nio.ByteBuffer byteBuffer11 = response1.byteData;
        java.lang.String str12 = response1.contentType;
        int int13 = response1.numRedirects;
        response1.executed = false;
        response1.statusCode = '4';
        response1.contentType = "";
        boolean boolean22 = response1.hasHeaderWithValue("hi!", "hi!");
        response1.statusMessage = "Location";
        int int25 = response1.statusCode();
        org.jsoup.Connection.Response response27 = response1.removeCookie("hi!");
        response1.statusCode = 53;
        int int30 = response1.statusCode;
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 52 + "'", int25 == 52);
        org.junit.Assert.assertNotNull(response27);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 53 + "'", int30 == 53);
    }

    @Test
    public void test08494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08494");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        org.jsoup.Connection.Request request4 = null;
        response1.req = request4;
        java.net.URL uRL6 = response1.url();
        org.jsoup.Connection.Request request7 = response1.req;
        java.lang.String str8 = response1.charset();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document9 = response1.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(request7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test08495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08495");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Response response5 = response2.header("hi!", "");
        java.lang.String str7 = response2.getHeaderCaseInsensitive("");
        response2.executed = false;
        org.jsoup.Connection.Response response12 = response2.header("Location", "");
        int int13 = response2.statusCode;
        boolean boolean15 = response2.hasCookie("hi!");
        java.lang.String str16 = response2.statusMessage;
        java.nio.ByteBuffer byteBuffer17 = null;
        response2.byteData = byteBuffer17;
        int int19 = response2.statusCode;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response20 = org.jsoup.helper.HttpConnection.Response.execute(request0, response2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test08496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08496");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        int int8 = response1.numRedirects;
        response1.contentType = "hi!";
        java.nio.ByteBuffer byteBuffer11 = response1.byteData;
        java.lang.String str12 = response1.contentType;
        org.jsoup.Connection.Response response15 = response1.cookie("Location", "Location");
        int int16 = response1.numRedirects;
        int int17 = response1.numRedirects;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry19 = response1.scanHeaders("");
        java.nio.ByteBuffer byteBuffer20 = null;
        response1.byteData = byteBuffer20;
        java.util.Map<java.lang.String, java.lang.String> strMap22 = response1.cookies();
        org.jsoup.Connection.Request request23 = null;
        response1.req = request23;
        java.lang.String str25 = response1.charset();
        java.util.Map<java.lang.String, java.lang.String> strMap26 = response1.headers();
        response1.charset = "hi!";
        java.net.URL uRL29 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response30 = response1.url(uRL29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(strEntry19);
        org.junit.Assert.assertNotNull(strMap22);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertNotNull(strMap26);
    }

    @Test
    public void test08497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08497");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        int int8 = response1.numRedirects;
        response1.contentType = "hi!";
        java.nio.ByteBuffer byteBuffer11 = response1.byteData;
        java.lang.String str12 = response1.contentType;
        org.jsoup.Connection.Response response15 = response1.cookie("Location", "Location");
        int int16 = response1.numRedirects;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry18 = response1.scanHeaders("hi!");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry20 = response1.scanHeaders("hi!");
        java.net.URL uRL21 = response1.url();
        java.lang.String str22 = response1.contentType;
        java.net.HttpURLConnection httpURLConnection23 = null;
        org.jsoup.helper.HttpConnection.Response response24 = null;
        org.jsoup.helper.HttpConnection.Response response25 = new org.jsoup.helper.HttpConnection.Response(response24);
        org.jsoup.Connection.Request request26 = null;
        response25.req = request26;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry29 = response25.scanHeaders("hi!");
        response25.charset = "hi!";
        int int32 = response25.numRedirects;
        response25.contentType = "hi!";
        java.nio.ByteBuffer byteBuffer35 = response25.byteData;
        java.nio.ByteBuffer byteBuffer36 = null;
        response25.byteData = byteBuffer36;
        org.jsoup.Connection.Response response40 = response25.header("hi!", "hi!");
        org.jsoup.Connection.Method method41 = response25.method();
        response25.numRedirects = (byte) 0;
        java.lang.String str44 = response25.contentType;
        org.jsoup.helper.HttpConnection.Response response45 = new org.jsoup.helper.HttpConnection.Response(response25);
        boolean boolean46 = response45.executed;
        org.jsoup.Connection.Request request47 = response45.req;
        // The following exception was thrown during execution in test generation
        try {
            response1.setupFromConnection(httpURLConnection23, (org.jsoup.Connection.Response) response45);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(strEntry18);
        org.junit.Assert.assertNull(strEntry20);
        org.junit.Assert.assertNull(uRL21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNull(strEntry29);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNull(byteBuffer35);
        org.junit.Assert.assertNotNull(response40);
        org.junit.Assert.assertNull(method41);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "hi!" + "'", str44, "hi!");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNull(request47);
    }

    @Test
    public void test08498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08498");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.numRedirects = (byte) -1;
        java.lang.String str4 = response1.statusMessage;
        org.jsoup.Connection.Response response7 = response1.header("Location", "hi!");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry9 = response1.scanHeaders("hi!");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(strEntry9);
    }

    @Test
    public void test08499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08499");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Response response5 = response2.header("hi!", "");
        java.lang.String str7 = response2.getHeaderCaseInsensitive("");
        response2.executed = false;
        org.jsoup.Connection.Response response12 = response2.header("Location", "");
        int int13 = response2.statusCode;
        boolean boolean15 = response2.hasCookie("hi!");
        java.lang.String str16 = response2.statusMessage;
        java.lang.String str17 = response2.charset;
        java.net.URL uRL18 = response2.url();
        java.nio.ByteBuffer byteBuffer19 = response2.byteData;
        java.lang.String str20 = response2.charset;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response21 = org.jsoup.helper.HttpConnection.Response.execute(request0, response2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(uRL18);
        org.junit.Assert.assertNull(byteBuffer19);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test08500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08500");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        org.jsoup.Connection.Response response8 = response1.cookie("hi!", "");
        java.net.URL uRL9 = response1.url();
        java.nio.ByteBuffer byteBuffer10 = null;
        response1.byteData = byteBuffer10;
        java.lang.String str13 = response1.header("Location");
        java.nio.ByteBuffer byteBuffer14 = response1.byteData;
        org.jsoup.Connection.Request request15 = response1.req;
        java.lang.String str16 = response1.statusMessage();
        java.lang.String str17 = response1.charset;
        boolean boolean19 = response1.hasCookie("hi!");
        response1.numRedirects = 35;
        int int22 = response1.statusCode;
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(byteBuffer14);
        org.junit.Assert.assertNull(request15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }
}
