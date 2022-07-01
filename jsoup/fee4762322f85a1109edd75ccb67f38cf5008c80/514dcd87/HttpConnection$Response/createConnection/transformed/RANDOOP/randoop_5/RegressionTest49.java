import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest49 {

    public static boolean debug = false;

    @Test
    public void test24501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24501");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.util.Map<java.lang.String, java.lang.String> strMap4 = response1.headers();
        org.jsoup.Connection.Method method5 = response1.method();
        int int6 = response1.statusCode();
        response1.statusMessage = "";
        java.net.URL uRL9 = response1.url();
        java.lang.String str10 = response1.charset;
        org.jsoup.Connection.Response response13 = response1.cookie("hi!", "");
        org.jsoup.Connection.Request request14 = response1.req;
        java.nio.ByteBuffer byteBuffer15 = null;
        response1.byteData = byteBuffer15;
        int int17 = response1.numRedirects;
        response1.statusCode = 0;
        java.net.URL uRL20 = response1.url();
        int int21 = response1.statusCode;
        org.jsoup.helper.HttpConnection.Response response22 = new org.jsoup.helper.HttpConnection.Response(response1);
        response22.contentType = "hi!";
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertNull(request14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(uRL20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test24502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24502");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.contentType = "hi!";
        int int4 = response1.numRedirects;
        response1.charset = "";
        boolean boolean9 = response1.hasHeaderWithValue("hi!", "");
        org.jsoup.Connection.Method method10 = response1.method();
        java.lang.Class<?> wildcardClass11 = response1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test24503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24503");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str4 = response1.contentType();
        java.lang.String str5 = response1.statusMessage;
        java.lang.String str6 = response1.charset;
        response1.executed = false;
        org.jsoup.Connection.Request request9 = response1.req;
        int int10 = response1.numRedirects;
        java.lang.String str11 = response1.charset();
        response1.contentType = "hi!";
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(request9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test24504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24504");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.util.Map<java.lang.String, java.lang.String> strMap4 = response1.headers();
        org.jsoup.Connection.Method method5 = response1.method();
        java.nio.ByteBuffer byteBuffer6 = null;
        response1.byteData = byteBuffer6;
        java.lang.String str9 = response1.getHeaderCaseInsensitive("hi!");
        java.lang.String str10 = response1.statusMessage();
        org.jsoup.Connection.Response response12 = response1.removeHeader("hi!");
        java.net.URL uRL13 = response1.url();
        org.jsoup.Connection.Method method14 = response1.method();
        response1.executed = false;
        java.lang.String str18 = response1.getHeaderCaseInsensitive("");
        java.lang.String str19 = response1.charset;
        org.jsoup.Connection.Request request20 = null;
        response1.req = request20;
        java.nio.ByteBuffer byteBuffer22 = null;
        response1.byteData = byteBuffer22;
        org.jsoup.Connection.Request request24 = response1.req;
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNull(uRL13);
        org.junit.Assert.assertNull(method14);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(request24);
    }

    @Test
    public void test24505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24505");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        response2.statusMessage = "";
        java.lang.String str5 = response2.contentType();
        java.lang.String str6 = response2.statusMessage;
        org.jsoup.Connection.Response response9 = response2.cookie("hi!", "");
        response2.contentType = "";
        java.net.URL uRL12 = response2.url();
        java.lang.String str14 = response2.getHeaderCaseInsensitive("hi!");
        java.lang.String str15 = response2.charset();
        int int16 = response2.statusCode();
        java.lang.String str17 = response2.contentType;
        java.lang.String str19 = response2.getHeaderCaseInsensitive("");
        java.lang.String str20 = response2.charset;
        org.jsoup.Connection.Response response23 = response2.header("hi!", "");
        response2.numRedirects = 52;
        java.nio.ByteBuffer byteBuffer26 = null;
        response2.byteData = byteBuffer26;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response28 = org.jsoup.helper.HttpConnection.Response.execute(request0, response2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertNull(uRL12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(response23);
    }

    @Test
    public void test24506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24506");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.util.Map<java.lang.String, java.lang.String> strMap4 = response1.headers();
        org.jsoup.Connection.Method method5 = response1.method();
        java.nio.ByteBuffer byteBuffer6 = null;
        response1.byteData = byteBuffer6;
        boolean boolean8 = response1.executed;
        java.lang.String str10 = response1.getHeaderCaseInsensitive("hi!");
        java.lang.String str12 = response1.header("");
        java.lang.String str13 = response1.charset();
        java.lang.String str15 = response1.cookie("hi!");
        response1.contentType = "";
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry19 = response1.scanHeaders("hi!");
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(strEntry19);
    }

    @Test
    public void test24507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24507");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.util.Map<java.lang.String, java.lang.String> strMap4 = response1.headers();
        org.jsoup.Connection.Method method5 = response1.method();
        java.nio.ByteBuffer byteBuffer6 = null;
        response1.byteData = byteBuffer6;
        java.lang.String str8 = response1.statusMessage();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry10 = response1.scanHeaders("");
        response1.statusMessage = "";
        java.lang.String str13 = response1.contentType();
        boolean boolean15 = response1.hasCookie("hi!");
        org.jsoup.Connection.Response response17 = response1.removeCookie("hi!");
        java.lang.String str18 = response1.charset;
        java.lang.String str19 = response1.contentType();
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(strEntry10);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(response17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test24508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24508");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str4 = response1.contentType();
        boolean boolean5 = response1.executed;
        org.jsoup.Connection.Response response7 = response1.removeCookie("hi!");
        java.lang.String str8 = response1.charset();
        org.jsoup.Connection.Method method9 = response1.method();
        int int10 = response1.statusCode;
        java.lang.String str11 = response1.charset();
        org.jsoup.Connection.Response response13 = response1.removeHeader("hi!");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry15 = response1.scanHeaders("");
        java.lang.String str16 = response1.statusMessage;
        org.jsoup.Connection.Request request17 = null;
        response1.req = request17;
        java.lang.String str20 = response1.header("hi!");
        java.lang.String str21 = response1.contentType();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertNull(strEntry15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test24509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24509");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.contentType = "hi!";
        java.util.Map<java.lang.String, java.lang.String> strMap4 = response1.headers();
        response1.numRedirects = '#';
        java.lang.String str8 = response1.header("hi!");
        org.jsoup.Connection.Method method9 = response1.method();
        org.jsoup.Connection.Response response12 = response1.cookie("hi!", "hi!");
        org.jsoup.Connection.Method method13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response14 = response1.method(method13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertNotNull(response12);
    }

    @Test
    public void test24510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24510");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str4 = response1.contentType();
        java.lang.String str5 = response1.statusMessage;
        java.lang.String str6 = response1.charset;
        java.util.Map<java.lang.String, java.lang.String> strMap7 = response1.cookies();
        response1.statusMessage = "";
        response1.contentType = "";
        response1.charset = "";
        int int14 = response1.statusCode();
        boolean boolean15 = response1.executed;
        java.util.Map<java.lang.String, java.lang.String> strMap16 = response1.cookies();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(strMap16);
    }

    @Test
    public void test24511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24511");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.contentType = "hi!";
        java.util.Map<java.lang.String, java.lang.String> strMap4 = response1.headers();
        java.util.Map<java.lang.String, java.lang.String> strMap5 = response1.cookies();
        org.jsoup.Connection.Request request6 = response1.req;
        java.lang.String str8 = response1.getHeaderCaseInsensitive("");
        java.util.Map<java.lang.String, java.lang.String> strMap9 = response1.cookies();
        java.lang.String str10 = response1.charset();
        int int11 = response1.numRedirects;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response13 = response1.removeHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNull(request6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test24512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24512");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str4 = response1.contentType();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry6 = response1.scanHeaders("");
        int int7 = response1.statusCode();
        java.nio.ByteBuffer byteBuffer8 = null;
        response1.byteData = byteBuffer8;
        int int10 = response1.numRedirects;
        response1.numRedirects = (byte) 100;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(strEntry6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test24513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24513");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.util.Map<java.lang.String, java.lang.String> strMap4 = response1.headers();
        org.jsoup.Connection.Method method5 = response1.method();
        java.nio.ByteBuffer byteBuffer6 = null;
        response1.byteData = byteBuffer6;
        java.lang.String str9 = response1.getHeaderCaseInsensitive("hi!");
        java.lang.String str10 = response1.statusMessage();
        org.jsoup.Connection.Response response12 = response1.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.nio.ByteBuffer byteBuffer14 = null;
        response1.byteData = byteBuffer14;
        boolean boolean16 = response1.executed;
        java.lang.String str18 = response1.header("");
        java.nio.ByteBuffer byteBuffer19 = response1.byteData;
        java.nio.ByteBuffer byteBuffer20 = response1.byteData;
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(byteBuffer19);
        org.junit.Assert.assertNull(byteBuffer20);
    }

    @Test
    public void test24514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24514");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.numRedirects;
        org.jsoup.Connection.Response response4 = response1.removeHeader("hi!");
        int int5 = response1.statusCode;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry7 = response1.scanHeaders("hi!");
        java.nio.ByteBuffer byteBuffer8 = response1.byteData;
        java.lang.String str9 = response1.statusMessage;
        response1.charset = "";
        java.lang.String str12 = response1.contentType();
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str15 = response13.cookie("hi!");
        response13.charset = "";
        java.nio.ByteBuffer byteBuffer18 = response13.byteData;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(strEntry7);
        org.junit.Assert.assertNull(byteBuffer8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(byteBuffer18);
    }

    @Test
    public void test24515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24515");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.numRedirects;
        org.jsoup.Connection.Response response4 = response1.removeHeader("hi!");
        int int5 = response1.statusCode;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry7 = response1.scanHeaders("hi!");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry9 = response1.scanHeaders("hi!");
        java.lang.String str10 = response1.contentType();
        java.util.Map<java.lang.String, java.lang.String> strMap11 = response1.cookies();
        response1.statusCode = 1;
        java.nio.ByteBuffer byteBuffer14 = response1.byteData;
        java.lang.String str15 = response1.charset;
        java.nio.ByteBuffer byteBuffer16 = response1.byteData;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response18 = response1.removeHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(strEntry7);
        org.junit.Assert.assertNull(strEntry9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNull(byteBuffer14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(byteBuffer16);
    }

    @Test
    public void test24516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24516");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str2 = response1.contentType;
        java.lang.String str4 = response1.cookie("hi!");
        response1.statusMessage = "";
        org.jsoup.Connection.Request request7 = response1.req;
        response1.numRedirects = (byte) 0;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(request7);
    }

    @Test
    public void test24517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24517");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str4 = response1.contentType();
        java.lang.String str5 = response1.statusMessage;
        java.lang.String str6 = response1.charset;
        java.lang.String str7 = response1.statusMessage;
        org.jsoup.Connection.Request request8 = response1.req;
        java.lang.String str9 = response1.contentType();
        int int10 = response1.statusCode;
        org.jsoup.Connection.Request request11 = response1.req;
        response1.executed = true;
        boolean boolean15 = response1.hasCookie("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap16 = response1.headers();
        response1.charset = "hi!";
        response1.statusMessage = "hi!";
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(request8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(request11);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(strMap16);
    }

    @Test
    public void test24518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24518");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.util.Map<java.lang.String, java.lang.String> strMap4 = response1.headers();
        org.jsoup.Connection.Method method5 = response1.method();
        java.nio.ByteBuffer byteBuffer6 = null;
        response1.byteData = byteBuffer6;
        java.lang.String str9 = response1.getHeaderCaseInsensitive("hi!");
        java.lang.String str10 = response1.statusMessage();
        org.jsoup.Connection.Response response12 = response1.removeHeader("hi!");
        java.net.URL uRL13 = response1.url();
        org.jsoup.Connection.Method method14 = response1.method();
        response1.executed = false;
        java.lang.String str17 = response1.contentType;
        response1.charset = "";
        org.jsoup.Connection.Response response21 = response1.removeHeader("hi!");
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNull(uRL13);
        org.junit.Assert.assertNull(method14);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(response21);
    }

    @Test
    public void test24519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24519");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.contentType = "hi!";
        java.util.Map<java.lang.String, java.lang.String> strMap4 = response1.headers();
        java.util.Map<java.lang.String, java.lang.String> strMap5 = response1.cookies();
        java.util.Map<java.lang.String, java.lang.String> strMap6 = response1.cookies();
        response1.contentType = "";
        java.lang.String str9 = response1.charset;
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test24520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24520");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.util.Map<java.lang.String, java.lang.String> strMap4 = response1.headers();
        org.jsoup.Connection.Method method5 = response1.method();
        java.nio.ByteBuffer byteBuffer6 = null;
        response1.byteData = byteBuffer6;
        java.lang.String str9 = response1.getHeaderCaseInsensitive("hi!");
        java.lang.String str10 = response1.statusMessage();
        org.jsoup.Connection.Response response12 = response1.removeHeader("hi!");
        java.net.URL uRL13 = response1.url();
        java.net.URL uRL14 = response1.url();
        int int15 = response1.statusCode;
        java.nio.ByteBuffer byteBuffer16 = null;
        response1.byteData = byteBuffer16;
        org.jsoup.Connection.Method method18 = response1.method();
        org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Request request20 = null;
        response19.req = request20;
        response19.contentType = "hi!";
        java.lang.String str24 = response19.contentType;
        org.jsoup.Connection.Response response26 = response19.removeCookie("hi!");
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNull(uRL13);
        org.junit.Assert.assertNull(uRL14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(method18);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertNotNull(response26);
    }

    @Test
    public void test24521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24521");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str4 = response1.contentType();
        java.lang.String str5 = response1.statusMessage;
        java.lang.String str6 = response1.charset;
        java.util.Map<java.lang.String, java.lang.String> strMap7 = response1.cookies();
        response1.statusMessage = "";
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str12 = response1.cookie("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap13 = response1.headers();
        java.lang.String str14 = response1.statusMessage;
        java.lang.String str16 = response1.getHeaderCaseInsensitive("");
        int int17 = response1.statusCode();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test24522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24522");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.util.Map<java.lang.String, java.lang.String> strMap4 = response1.headers();
        org.jsoup.Connection.Method method5 = response1.method();
        int int6 = response1.statusCode();
        response1.charset = "";
        java.lang.String str9 = response1.contentType();
        java.lang.String str10 = response1.contentType;
        int int11 = response1.statusCode;
        org.jsoup.Connection.Method method12 = response1.method();
        java.lang.String str14 = response1.header("hi!");
        response1.contentType = "hi!";
        org.jsoup.Connection.Response response18 = response1.removeHeader("hi!");
        java.nio.ByteBuffer byteBuffer19 = null;
        response1.byteData = byteBuffer19;
        org.jsoup.Connection.Method method21 = response1.method();
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(method12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(response18);
        org.junit.Assert.assertNull(method21);
    }

    @Test
    public void test24523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24523");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str4 = response1.contentType();
        boolean boolean5 = response1.executed;
        org.jsoup.Connection.Response response7 = response1.removeCookie("hi!");
        java.nio.ByteBuffer byteBuffer8 = response1.byteData;
        response1.numRedirects = (byte) -1;
        java.util.Map<java.lang.String, java.lang.String> strMap11 = response1.headers();
        response1.charset = "";
        response1.statusCode = 32;
        org.jsoup.Connection.Request request16 = response1.req;
        org.jsoup.Connection.Request request17 = response1.req;
        java.net.URL uRL18 = response1.url();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(byteBuffer8);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNull(request16);
        org.junit.Assert.assertNull(request17);
        org.junit.Assert.assertNull(uRL18);
    }

    @Test
    public void test24524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24524");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str4 = response1.contentType();
        boolean boolean5 = response1.executed;
        org.jsoup.Connection.Response response7 = response1.removeCookie("hi!");
        java.lang.String str8 = response1.charset();
        java.lang.String str9 = response1.statusMessage;
        response1.statusMessage = "hi!";
        response1.statusCode = (byte) 0;
        java.lang.String str14 = response1.charset();
        java.lang.String str16 = response1.cookie("hi!");
        int int17 = response1.statusCode();
        java.lang.String str18 = response1.charset;
        boolean boolean19 = response1.executed;
        response1.numRedirects = '4';
        java.lang.String str22 = response1.contentType;
        java.net.URL uRL23 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response24 = response1.url(uRL23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test24525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24525");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str4 = response1.contentType();
        java.lang.String str5 = response1.statusMessage;
        java.lang.String str6 = response1.contentType();
        java.lang.String str7 = response1.statusMessage();
        java.lang.String str8 = response1.statusMessage();
        java.nio.ByteBuffer byteBuffer9 = null;
        response1.byteData = byteBuffer9;
        response1.contentType = "";
        java.lang.String str13 = response1.contentType();
        java.nio.ByteBuffer byteBuffer14 = response1.byteData;
        java.nio.ByteBuffer byteBuffer15 = response1.byteData;
        java.lang.String str17 = response1.cookie("hi!");
        boolean boolean18 = response1.executed;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry20 = response1.scanHeaders("hi!");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(byteBuffer14);
        org.junit.Assert.assertNull(byteBuffer15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(strEntry20);
    }

    @Test
    public void test24526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24526");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.util.Map<java.lang.String, java.lang.String> strMap4 = response1.headers();
        org.jsoup.Connection.Method method5 = response1.method();
        java.nio.ByteBuffer byteBuffer6 = null;
        response1.byteData = byteBuffer6;
        java.lang.String str8 = response1.statusMessage();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry10 = response1.scanHeaders("");
        response1.statusCode = 10;
        org.jsoup.Connection.Response response14 = response1.removeCookie("hi!");
        boolean boolean15 = response1.executed;
        java.util.Map<java.lang.String, java.lang.String> strMap16 = response1.cookies();
        java.lang.String str17 = response1.charset();
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response(response1);
        response1.contentType = "";
        org.jsoup.Connection.Response response23 = response1.cookie("hi!", "hi!");
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(strEntry10);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(response23);
    }

    @Test
    public void test24527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24527");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str4 = response1.contentType();
        java.lang.String str5 = response1.statusMessage;
        org.jsoup.Connection.Response response8 = response1.cookie("hi!", "");
        boolean boolean11 = response1.hasHeaderWithValue("hi!", "");
        java.lang.String str12 = response1.contentType;
        int int13 = response1.statusCode;
        java.lang.String str14 = response1.statusMessage();
        java.nio.ByteBuffer byteBuffer15 = response1.byteData;
        response1.statusMessage = "";
        java.lang.String str18 = response1.statusMessage;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry20 = response1.scanHeaders("");
        org.jsoup.Connection.Method method21 = response1.method();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(byteBuffer15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNull(strEntry20);
        org.junit.Assert.assertNull(method21);
    }

    @Test
    public void test24528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24528");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str4 = response1.contentType();
        boolean boolean5 = response1.executed;
        java.lang.String str6 = response1.charset;
        java.lang.String str8 = response1.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Method method9 = response1.method();
        int int10 = response1.statusCode();
        int int11 = response1.numRedirects;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test24529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24529");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.numRedirects;
        org.jsoup.Connection.Response response4 = response1.removeHeader("hi!");
        int int5 = response1.statusCode;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry7 = response1.scanHeaders("hi!");
        java.lang.String str8 = response1.statusMessage;
        java.nio.ByteBuffer byteBuffer9 = response1.byteData;
        org.jsoup.Connection.Request request10 = null;
        response1.req = request10;
        java.util.Map<java.lang.String, java.lang.String> strMap12 = response1.cookies();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(strEntry7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(byteBuffer9);
        org.junit.Assert.assertNotNull(strMap12);
    }

    @Test
    public void test24530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24530");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.util.Map<java.lang.String, java.lang.String> strMap4 = response1.headers();
        org.jsoup.Connection.Method method5 = response1.method();
        java.nio.ByteBuffer byteBuffer6 = null;
        response1.byteData = byteBuffer6;
        java.lang.String str9 = response1.getHeaderCaseInsensitive("hi!");
        java.lang.String str10 = response1.statusMessage();
        org.jsoup.Connection.Response response12 = response1.removeHeader("hi!");
        java.lang.String str13 = response1.charset();
        response1.statusCode = (short) 100;
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test24531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24531");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.numRedirects;
        org.jsoup.Connection.Response response4 = response1.removeHeader("hi!");
        int int5 = response1.statusCode;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry7 = response1.scanHeaders("hi!");
        java.nio.ByteBuffer byteBuffer8 = response1.byteData;
        java.lang.String str9 = response1.statusMessage;
        java.nio.ByteBuffer byteBuffer10 = null;
        response1.byteData = byteBuffer10;
        org.jsoup.Connection.Request request12 = response1.req;
        java.lang.String str13 = response1.statusMessage();
        java.lang.String str15 = response1.cookie("hi!");
        org.jsoup.Connection.Request request16 = null;
        response1.req = request16;
        response1.executed = false;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(strEntry7);
        org.junit.Assert.assertNull(byteBuffer8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(request12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test24532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24532");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Response response6 = response1.cookie("hi!", "");
        java.lang.String str7 = response1.charset;
        int int8 = response1.numRedirects;
        int int9 = response1.numRedirects;
        java.lang.String str10 = response1.charset;
        int int11 = response1.numRedirects;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry13 = response1.scanHeaders("hi!");
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response1);
        response14.statusCode = (short) 10;
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(strEntry13);
    }

    @Test
    public void test24533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24533");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.util.Map<java.lang.String, java.lang.String> strMap4 = response1.headers();
        org.jsoup.Connection.Method method5 = response1.method();
        java.nio.ByteBuffer byteBuffer6 = null;
        response1.byteData = byteBuffer6;
        java.lang.String str9 = response1.getHeaderCaseInsensitive("hi!");
        java.lang.String str10 = response1.statusMessage();
        org.jsoup.Connection.Response response12 = response1.removeHeader("hi!");
        java.net.URL uRL13 = response1.url();
        java.nio.ByteBuffer byteBuffer14 = null;
        response1.byteData = byteBuffer14;
        int int16 = response1.statusCode;
        java.lang.String str17 = response1.charset;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry19 = response1.scanHeaders("");
        java.lang.String str21 = response1.getHeaderCaseInsensitive("hi!");
        response1.contentType = "hi!";
        response1.charset = "hi!";
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNull(uRL13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(strEntry19);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test24534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24534");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str4 = response1.contentType();
        boolean boolean5 = response1.executed;
        org.jsoup.Connection.Response response7 = response1.removeCookie("hi!");
        java.lang.String str8 = response1.charset();
        java.lang.String str9 = response1.statusMessage;
        java.lang.String str10 = response1.contentType();
        org.jsoup.Connection.Response response12 = response1.removeHeader("hi!");
        response1.statusMessage = "hi!";
        java.lang.String str16 = response1.getHeaderCaseInsensitive("");
        int int17 = response1.statusCode();
        boolean boolean18 = response1.executed;
        org.jsoup.Connection.Request request19 = response1.req;
        java.lang.String str20 = response1.contentType;
        java.lang.Class<?> wildcardClass21 = response1.getClass();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(request19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test24535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24535");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.util.Map<java.lang.String, java.lang.String> strMap4 = response1.headers();
        org.jsoup.Connection.Method method5 = response1.method();
        int int6 = response1.statusCode();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry8 = response1.scanHeaders("hi!");
        response1.contentType = "";
        java.lang.String str11 = response1.contentType();
        response1.executed = false;
        int int14 = response1.statusCode;
        java.lang.String str16 = response1.getHeaderCaseInsensitive("");
        response1.contentType = "hi!";
        boolean boolean20 = response1.hasHeader("hi!");
        boolean boolean22 = response1.hasHeader("hi!");
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(strEntry8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test24536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24536");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str4 = response1.contentType();
        java.lang.String str5 = response1.statusMessage;
        org.jsoup.Connection.Response response8 = response1.cookie("hi!", "");
        java.lang.String str9 = response1.statusMessage;
        java.util.Map<java.lang.String, java.lang.String> strMap10 = response1.cookies();
        java.lang.String str11 = response1.contentType;
        java.nio.ByteBuffer byteBuffer12 = response1.byteData;
        int int13 = response1.statusCode();
        java.nio.ByteBuffer byteBuffer14 = null;
        response1.byteData = byteBuffer14;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry17 = response1.scanHeaders("hi!");
        java.nio.ByteBuffer byteBuffer18 = response1.byteData;
        java.util.Map<java.lang.String, java.lang.String> strMap19 = response1.headers();
        org.jsoup.Connection.Response response22 = response1.header("hi!", "hi!");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(byteBuffer12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(strEntry17);
        org.junit.Assert.assertNull(byteBuffer18);
        org.junit.Assert.assertNotNull(strMap19);
        org.junit.Assert.assertNotNull(response22);
    }

    @Test
    public void test24537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24537");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str4 = response1.contentType();
        boolean boolean5 = response1.executed;
        org.jsoup.Connection.Response response7 = response1.removeCookie("hi!");
        java.lang.String str8 = response1.charset();
        response1.contentType = "";
        java.lang.String str11 = response1.charset;
        java.util.Map<java.lang.String, java.lang.String> strMap12 = response1.cookies();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(strMap12);
    }

    @Test
    public void test24538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24538");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.contentType = "hi!";
        java.util.Map<java.lang.String, java.lang.String> strMap4 = response1.headers();
        java.util.Map<java.lang.String, java.lang.String> strMap5 = response1.cookies();
        org.jsoup.Connection.Request request6 = response1.req;
        java.lang.String str8 = response1.getHeaderCaseInsensitive("");
        response1.executed = true;
        response1.contentType = "hi!";
        java.lang.String str13 = response1.charset;
        response1.statusCode = (short) 0;
        java.lang.String str16 = response1.statusMessage;
        int int17 = response1.statusCode();
        java.lang.String str18 = response1.contentType();
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNull(request6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test24539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24539");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map<java.lang.String, java.lang.String> strMap2 = response1.cookies();
        response1.statusCode = 1;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry6 = response1.scanHeaders("");
        boolean boolean9 = response1.hasHeaderWithValue("hi!", "hi!");
        response1.contentType = "";
        java.lang.String str13 = response1.getHeaderCaseInsensitive("hi!");
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNull(strEntry6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test24540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24540");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.util.Map<java.lang.String, java.lang.String> strMap4 = response1.headers();
        org.jsoup.Connection.Method method5 = response1.method();
        java.nio.ByteBuffer byteBuffer6 = null;
        response1.byteData = byteBuffer6;
        java.lang.String str8 = response1.statusMessage();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry10 = response1.scanHeaders("");
        response1.statusCode = 10;
        org.jsoup.Connection.Response response14 = response1.removeCookie("hi!");
        java.lang.String str16 = response1.cookie("hi!");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry18 = response1.scanHeaders("");
        boolean boolean21 = response1.hasHeaderWithValue("hi!", "hi!");
        org.jsoup.Connection.Response response24 = response1.cookie("hi!", "");
        int int25 = response1.numRedirects;
        java.lang.String str26 = response1.statusMessage;
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(strEntry10);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(strEntry18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(response24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test24541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24541");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str4 = response1.contentType();
        java.lang.String str5 = response1.statusMessage;
        java.lang.String str6 = response1.charset;
        response1.executed = false;
        java.lang.String str10 = response1.header("hi!");
        java.lang.String str11 = response1.charset();
        java.util.Map<java.lang.String, java.lang.String> strMap12 = response1.cookies();
        java.lang.String str14 = response1.getHeaderCaseInsensitive("hi!");
        java.lang.String str16 = response1.header("");
        org.jsoup.Connection.Response response18 = response1.removeCookie("hi!");
        boolean boolean20 = response1.hasCookie("hi!");
        int int21 = response1.numRedirects;
        java.lang.String str22 = response1.statusMessage;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(response18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test24542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24542");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str4 = response1.contentType();
        boolean boolean5 = response1.executed;
        org.jsoup.Connection.Response response7 = response1.removeCookie("hi!");
        java.lang.String str8 = response1.charset();
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str10 = response1.charset;
        response1.statusMessage = "hi!";
        org.jsoup.Connection.Method method13 = response1.method();
        java.nio.ByteBuffer byteBuffer14 = response1.byteData;
        response1.charset = "hi!";
        java.net.URL uRL17 = response1.url();
        int int18 = response1.statusCode;
        java.lang.String str19 = response1.contentType;
        org.jsoup.Connection.Response response22 = response1.cookie("hi!", "hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap23 = response1.headers();
        org.jsoup.Connection.Method method24 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response25 = response1.method(method24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(method13);
        org.junit.Assert.assertNull(byteBuffer14);
        org.junit.Assert.assertNull(uRL17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(response22);
        org.junit.Assert.assertNotNull(strMap23);
    }

    @Test
    public void test24543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24543");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.util.Map<java.lang.String, java.lang.String> strMap4 = response1.headers();
        org.jsoup.Connection.Method method5 = response1.method();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response1);
        boolean boolean9 = response6.hasHeaderWithValue("hi!", "hi!");
        java.lang.String str10 = response6.contentType;
        java.lang.String str12 = response6.getHeaderCaseInsensitive("hi!");
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test24544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24544");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.util.Map<java.lang.String, java.lang.String> strMap4 = response1.headers();
        org.jsoup.Connection.Method method5 = response1.method();
        int int6 = response1.statusCode();
        response1.charset = "";
        java.lang.String str9 = response1.contentType();
        java.lang.String str10 = response1.charset;
        org.jsoup.Connection.Request request11 = response1.req;
        java.lang.String str12 = response1.contentType();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response15 = response1.header("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(request11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test24545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24545");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.util.Map<java.lang.String, java.lang.String> strMap4 = response1.headers();
        org.jsoup.Connection.Method method5 = response1.method();
        int int6 = response1.statusCode();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry8 = response1.scanHeaders("hi!");
        int int9 = response1.statusCode;
        java.lang.String str10 = response1.statusMessage();
        response1.executed = true;
        java.lang.String str13 = response1.statusMessage;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry15 = response1.scanHeaders("hi!");
        java.lang.String str16 = response1.contentType();
        java.net.HttpURLConnection httpURLConnection17 = null;
        org.jsoup.helper.HttpConnection.Response response18 = null;
        org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response(response18);
        response19.statusMessage = "";
        java.util.Map<java.lang.String, java.lang.String> strMap22 = response19.headers();
        org.jsoup.Connection.Method method23 = response19.method();
        java.nio.ByteBuffer byteBuffer24 = null;
        response19.byteData = byteBuffer24;
        java.lang.String str27 = response19.getHeaderCaseInsensitive("hi!");
        java.lang.String str28 = response19.statusMessage();
        org.jsoup.Connection.Response response30 = response19.removeHeader("hi!");
        java.lang.String str31 = response19.charset();
        response19.statusCode = (short) 100;
        int int34 = response19.statusCode;
        java.lang.String str35 = response19.charset;
        response19.statusCode = (byte) 10;
        response19.statusMessage = "";
        int int40 = response19.numRedirects;
        java.lang.String str41 = response19.charset;
        java.lang.String str42 = response19.charset();
        org.jsoup.Connection.Method method43 = response19.method();
        response19.statusMessage = "";
        // The following exception was thrown during execution in test generation
        try {
            response1.setupFromConnection(httpURLConnection17, (org.jsoup.Connection.Response) response19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(strEntry8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(strEntry15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(strMap22);
        org.junit.Assert.assertNull(method23);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(response30);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 100 + "'", int34 == 100);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertNull(method43);
    }

    @Test
    public void test24546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24546");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str4 = response1.contentType();
        response1.executed = true;
        org.jsoup.Connection.Response response8 = response1.removeCookie("hi!");
        java.lang.String str9 = response1.statusMessage;
        org.jsoup.Connection.Response response11 = response1.removeHeader("hi!");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(response11);
    }

    @Test
    public void test24547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24547");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str4 = response1.contentType();
        java.lang.String str5 = response1.statusMessage;
        org.jsoup.Connection.Response response8 = response1.cookie("hi!", "");
        java.lang.String str9 = response1.contentType;
        java.util.Map<java.lang.String, java.lang.String> strMap10 = response1.headers();
        response1.charset = "hi!";
        java.util.Map<java.lang.String, java.lang.String> strMap13 = response1.headers();
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str15 = response14.statusMessage();
        java.lang.String str16 = response14.contentType();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test24548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24548");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str4 = response1.contentType();
        boolean boolean5 = response1.executed;
        org.jsoup.Connection.Response response7 = response1.removeCookie("hi!");
        java.lang.String str8 = response1.charset();
        org.jsoup.Connection.Method method9 = response1.method();
        response1.charset = "";
        java.lang.String str12 = response1.charset();
        java.net.URL uRL13 = response1.url();
        java.lang.String str14 = response1.charset;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry16 = response1.scanHeaders("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap17 = response1.headers();
        java.lang.String str18 = response1.contentType();
        response1.charset = "hi!";
        org.jsoup.Connection.Method method21 = response1.method();
        java.lang.String str22 = response1.statusMessage();
        response1.statusCode = 52;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(uRL13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(strEntry16);
        org.junit.Assert.assertNotNull(strMap17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(method21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test24549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24549");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.util.Map<java.lang.String, java.lang.String> strMap4 = response1.headers();
        org.jsoup.Connection.Method method5 = response1.method();
        java.nio.ByteBuffer byteBuffer6 = null;
        response1.byteData = byteBuffer6;
        java.lang.String str8 = response1.statusMessage();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry10 = response1.scanHeaders("");
        response1.statusCode = 10;
        org.jsoup.Connection.Response response14 = response1.removeCookie("hi!");
        java.lang.String str16 = response1.cookie("hi!");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry18 = response1.scanHeaders("");
        int int19 = response1.statusCode();
        java.lang.String str20 = response1.contentType();
        org.jsoup.Connection.Response response22 = response1.removeHeader("hi!");
        int int23 = response1.numRedirects;
        response1.executed = true;
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(strEntry10);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(strEntry18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(response22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test24550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24550");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str4 = response1.contentType();
        java.lang.String str5 = response1.statusMessage;
        java.lang.String str6 = response1.charset;
        response1.executed = false;
        java.lang.String str9 = response1.statusMessage;
        org.jsoup.Connection.Request request10 = response1.req;
        int int11 = response1.statusCode;
        boolean boolean12 = response1.executed;
        response1.numRedirects = 0;
        java.lang.String str15 = response1.statusMessage();
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray16 = response1.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(request10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test24551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24551");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str4 = response1.contentType();
        boolean boolean5 = response1.executed;
        org.jsoup.Connection.Response response7 = response1.removeCookie("hi!");
        java.lang.String str8 = response1.charset();
        response1.contentType = "";
        java.lang.String str12 = response1.getHeaderCaseInsensitive("hi!");
        java.lang.String str14 = response1.header("");
        java.lang.String str15 = response1.charset();
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry18 = response16.scanHeaders("");
        java.lang.String str19 = response16.charset();
        org.jsoup.Connection.Response response21 = response16.removeCookie("hi!");
        java.lang.String str22 = response16.statusMessage;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(strEntry18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(response21);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test24552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24552");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.util.Map<java.lang.String, java.lang.String> strMap4 = response1.headers();
        org.jsoup.Connection.Method method5 = response1.method();
        java.nio.ByteBuffer byteBuffer6 = null;
        response1.byteData = byteBuffer6;
        java.lang.String str9 = response1.getHeaderCaseInsensitive("hi!");
        java.lang.String str10 = response1.statusMessage();
        response1.statusCode = (short) 0;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry14 = response1.scanHeaders("hi!");
        org.jsoup.Connection.Method method15 = response1.method();
        java.lang.String str16 = response1.charset();
        boolean boolean18 = response1.hasHeader("hi!");
        boolean boolean21 = response1.hasHeaderWithValue("hi!", "hi!");
        java.lang.String str22 = response1.contentType();
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(strEntry14);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test24553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24553");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.util.Map<java.lang.String, java.lang.String> strMap4 = response1.headers();
        org.jsoup.Connection.Method method5 = response1.method();
        int int6 = response1.statusCode();
        response1.statusMessage = "";
        java.net.URL uRL9 = response1.url();
        int int10 = response1.statusCode;
        java.lang.String str12 = response1.getHeaderCaseInsensitive("hi!");
        java.lang.String str13 = response1.contentType;
        org.jsoup.Connection.Response response15 = response1.removeHeader("hi!");
        java.nio.ByteBuffer byteBuffer16 = response1.byteData;
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertNull(byteBuffer16);
    }

    @Test
    public void test24554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24554");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str4 = response1.contentType();
        boolean boolean5 = response1.executed;
        org.jsoup.Connection.Response response7 = response1.removeCookie("hi!");
        java.lang.String str8 = response1.charset();
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str11 = response9.getHeaderCaseInsensitive("hi!");
        org.jsoup.Connection.Request request12 = null;
        response9.req = request12;
        java.util.Map<java.lang.String, java.lang.String> strMap14 = response9.cookies();
        response9.statusCode = (byte) 0;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = response9.hasCookie("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(strMap14);
    }

    @Test
    public void test24555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24555");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.util.Map<java.lang.String, java.lang.String> strMap4 = response1.headers();
        org.jsoup.Connection.Method method5 = response1.method();
        java.util.Map<java.lang.String, java.lang.String> strMap6 = response1.cookies();
        org.jsoup.Connection.Response response9 = response1.cookie("hi!", "hi!");
        java.lang.String str10 = response1.contentType;
        response1.executed = false;
        java.net.URL uRL13 = response1.url();
        java.lang.String str14 = response1.statusMessage();
        org.jsoup.Connection.Request request15 = null;
        response1.req = request15;
        java.lang.String str18 = response1.getHeaderCaseInsensitive("hi!");
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(uRL13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test24556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24556");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.util.Map<java.lang.String, java.lang.String> strMap4 = response1.headers();
        org.jsoup.Connection.Method method5 = response1.method();
        java.nio.ByteBuffer byteBuffer6 = null;
        response1.byteData = byteBuffer6;
        java.util.Map<java.lang.String, java.lang.String> strMap8 = response1.headers();
        org.jsoup.Connection.Request request9 = null;
        response1.req = request9;
        java.lang.String str12 = response1.cookie("hi!");
        response1.executed = false;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response16 = response1.removeCookie("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test24557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24557");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.util.Map<java.lang.String, java.lang.String> strMap4 = response1.headers();
        org.jsoup.Connection.Method method5 = response1.method();
        java.nio.ByteBuffer byteBuffer6 = null;
        response1.byteData = byteBuffer6;
        java.lang.String str8 = response1.statusMessage();
        boolean boolean9 = response1.executed;
        int int10 = response1.statusCode();
        java.nio.ByteBuffer byteBuffer11 = null;
        response1.byteData = byteBuffer11;
        org.jsoup.Connection.Response response14 = response1.removeHeader("hi!");
        boolean boolean16 = response1.hasHeader("hi!");
        java.lang.String str18 = response1.header("hi!");
        org.jsoup.Connection.Response response20 = response1.removeCookie("hi!");
        org.jsoup.Connection.Response response23 = response1.header("hi!", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean25 = response1.hasCookie("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(response20);
        org.junit.Assert.assertNotNull(response23);
    }

    @Test
    public void test24558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24558");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        response1.executed = false;
        response1.executed = true;
        org.jsoup.Connection.Response response9 = response1.removeCookie("hi!");
        java.net.URL uRL10 = response1.url();
        org.jsoup.Connection.Request request11 = null;
        response1.req = request11;
        response1.statusCode = 35;
        java.net.URL uRL15 = response1.url();
        java.net.HttpURLConnection httpURLConnection16 = null;
        org.jsoup.helper.HttpConnection.Response response17 = null;
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response(response17);
        response18.statusMessage = "";
        response18.executed = false;
        org.jsoup.Connection.Request request23 = response18.req;
        java.util.Map<java.lang.String, java.lang.String> strMap24 = response18.headers();
        org.jsoup.Connection.Response response26 = response18.removeHeader("hi!");
        int int27 = response18.statusCode;
        response18.statusCode = (short) 10;
        java.lang.String str30 = response18.contentType;
        // The following exception was thrown during execution in test generation
        try {
            response1.setupFromConnection(httpURLConnection16, (org.jsoup.Connection.Response) response18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertNull(uRL10);
        org.junit.Assert.assertNull(uRL15);
        org.junit.Assert.assertNull(request23);
        org.junit.Assert.assertNotNull(strMap24);
        org.junit.Assert.assertNotNull(response26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNull(str30);
    }

    @Test
    public void test24559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24559");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str4 = response1.contentType();
        java.lang.String str5 = response1.statusMessage;
        org.jsoup.Connection.Response response8 = response1.cookie("hi!", "");
        java.lang.String str9 = response1.contentType;
        java.util.Map<java.lang.String, java.lang.String> strMap10 = response1.headers();
        java.lang.String str11 = response1.charset();
        java.lang.String str12 = response1.contentType();
        java.lang.String str13 = response1.charset();
        response1.statusMessage = "hi!";
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test24560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24560");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.util.Map<java.lang.String, java.lang.String> strMap4 = response1.headers();
        org.jsoup.Connection.Method method5 = response1.method();
        java.nio.ByteBuffer byteBuffer6 = null;
        response1.byteData = byteBuffer6;
        java.lang.String str9 = response1.getHeaderCaseInsensitive("hi!");
        java.nio.ByteBuffer byteBuffer10 = null;
        response1.byteData = byteBuffer10;
        java.lang.String str12 = response1.statusMessage();
        java.lang.String str13 = response1.charset;
        java.lang.Class<?> wildcardClass14 = response1.getClass();
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test24561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24561");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str4 = response1.contentType();
        boolean boolean5 = response1.executed;
        org.jsoup.Connection.Response response7 = response1.removeCookie("hi!");
        java.lang.String str8 = response1.charset();
        java.lang.String str9 = response1.statusMessage;
        response1.statusMessage = "hi!";
        response1.statusCode = (byte) 0;
        java.lang.String str14 = response1.charset();
        java.lang.String str16 = response1.cookie("hi!");
        int int17 = response1.statusCode();
        java.lang.String str18 = response1.charset;
        boolean boolean19 = response1.executed;
        response1.numRedirects = '4';
        response1.executed = true;
        java.lang.String str24 = response1.contentType;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test24562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24562");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.util.Map<java.lang.String, java.lang.String> strMap4 = response1.headers();
        org.jsoup.Connection.Method method5 = response1.method();
        java.nio.ByteBuffer byteBuffer6 = null;
        response1.byteData = byteBuffer6;
        java.lang.String str8 = response1.statusMessage;
        int int9 = response1.statusCode;
        java.lang.String str10 = response1.statusMessage();
        boolean boolean12 = response1.hasHeader("hi!");
        response1.executed = false;
        java.lang.String str15 = response1.charset();
        java.nio.ByteBuffer byteBuffer16 = null;
        response1.byteData = byteBuffer16;
        org.jsoup.Connection.Response response20 = response1.header("hi!", "hi!");
        boolean boolean21 = response1.executed;
        java.lang.String str22 = response1.charset();
        java.lang.String str23 = response1.charset;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry25 = response1.scanHeaders("");
        org.jsoup.Connection.Response response27 = response1.removeCookie("hi!");
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(response20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(strEntry25);
        org.junit.Assert.assertNotNull(response27);
    }

    @Test
    public void test24563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24563");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str4 = response1.contentType();
        boolean boolean5 = response1.executed;
        org.jsoup.Connection.Response response7 = response1.removeCookie("hi!");
        org.jsoup.Connection.Request request8 = null;
        response1.req = request8;
        int int10 = response1.statusCode;
        java.lang.String str11 = response1.charset();
        org.jsoup.Connection.Request request12 = response1.req;
        org.jsoup.Connection.Method method13 = response1.method();
        java.lang.String str15 = response1.getHeaderCaseInsensitive("");
        java.net.URL uRL16 = response1.url();
        java.net.URL uRL17 = response1.url();
        java.lang.String str18 = response1.statusMessage();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(request12);
        org.junit.Assert.assertNull(method13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(uRL16);
        org.junit.Assert.assertNull(uRL17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test24564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24564");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.util.Map<java.lang.String, java.lang.String> strMap4 = response1.headers();
        org.jsoup.Connection.Method method5 = response1.method();
        java.nio.ByteBuffer byteBuffer6 = null;
        response1.byteData = byteBuffer6;
        java.lang.String str9 = response1.getHeaderCaseInsensitive("hi!");
        java.lang.String str10 = response1.statusMessage();
        org.jsoup.Connection.Response response12 = response1.removeHeader("hi!");
        java.lang.String str13 = response1.statusMessage;
        java.util.Map<java.lang.String, java.lang.String> strMap14 = response1.headers();
        org.jsoup.Connection.Request request15 = response1.req;
        org.jsoup.Connection.Request request16 = response1.req;
        org.jsoup.Connection.Response response19 = response1.header("hi!", "hi!");
        int int20 = response1.numRedirects;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document21 = response1.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNull(request15);
        org.junit.Assert.assertNull(request16);
        org.junit.Assert.assertNotNull(response19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test24565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24565");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str4 = response1.contentType();
        java.lang.String str5 = response1.statusMessage;
        java.lang.String str6 = response1.charset;
        response1.executed = false;
        java.lang.String str9 = response1.statusMessage;
        java.lang.String str10 = response1.statusMessage();
        java.lang.String str11 = response1.statusMessage();
        boolean boolean13 = response1.hasHeader("hi!");
        boolean boolean14 = response1.executed;
        response1.statusCode = 100;
        java.util.Map<java.lang.String, java.lang.String> strMap17 = response1.cookies();
        java.nio.ByteBuffer byteBuffer18 = null;
        response1.byteData = byteBuffer18;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strMap17);
    }

    @Test
    public void test24566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24566");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str4 = response1.contentType();
        response1.executed = false;
        response1.statusMessage = "";
        org.jsoup.Connection.Request request9 = null;
        response1.req = request9;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry12 = response1.scanHeaders("hi!");
        response1.statusMessage = "hi!";
        response1.statusMessage = "";
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(strEntry12);
    }

    @Test
    public void test24567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24567");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.numRedirects;
        org.jsoup.Connection.Response response4 = response1.removeHeader("hi!");
        int int5 = response1.statusCode;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry7 = response1.scanHeaders("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap8 = response1.cookies();
        java.lang.String str9 = response1.charset();
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str11 = response1.contentType;
        java.lang.String str12 = response1.charset();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(strEntry7);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test24568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24568");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str4 = response1.contentType();
        boolean boolean5 = response1.executed;
        org.jsoup.Connection.Response response7 = response1.removeCookie("hi!");
        response1.numRedirects = 0;
        java.lang.String str10 = response1.contentType;
        org.jsoup.Connection.Request request11 = response1.req;
        response1.charset = "hi!";
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = response1.hasCookie("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(request11);
    }

    @Test
    public void test24569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24569");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.util.Map<java.lang.String, java.lang.String> strMap4 = response1.headers();
        org.jsoup.Connection.Method method5 = response1.method();
        int int6 = response1.statusCode();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry8 = response1.scanHeaders("hi!");
        java.lang.String str10 = response1.header("");
        int int11 = response1.statusCode;
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(strEntry8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test24570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24570");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str4 = response1.contentType();
        boolean boolean5 = response1.executed;
        org.jsoup.Connection.Response response7 = response1.removeCookie("hi!");
        java.lang.String str8 = response1.charset();
        java.lang.String str9 = response1.statusMessage;
        java.lang.String str10 = response1.contentType();
        org.jsoup.Connection.Response response12 = response1.removeHeader("hi!");
        response1.statusMessage = "hi!";
        java.lang.String str16 = response1.getHeaderCaseInsensitive("");
        response1.charset = "hi!";
        int int19 = response1.statusCode;
        java.nio.ByteBuffer byteBuffer20 = response1.byteData;
        java.lang.String str21 = response1.statusMessage();
        java.lang.String str23 = response1.getHeaderCaseInsensitive("hi!");
        boolean boolean24 = response1.executed;
        java.lang.String str26 = response1.header("hi!");
        java.lang.String str28 = response1.cookie("hi!");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNull(byteBuffer20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(str28);
    }

    @Test
    public void test24571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24571");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.numRedirects;
        org.jsoup.Connection.Response response4 = response1.removeHeader("hi!");
        int int5 = response1.statusCode;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry7 = response1.scanHeaders("hi!");
        java.lang.String str8 = response1.statusMessage;
        org.jsoup.Connection.Method method9 = response1.method();
        boolean boolean11 = response1.hasHeader("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap12 = response1.headers();
        java.lang.String str14 = response1.header("");
        response1.statusCode = 1;
        java.net.URL uRL17 = response1.url();
        java.util.Map<java.lang.String, java.lang.String> strMap18 = response1.headers();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(strEntry7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(uRL17);
        org.junit.Assert.assertNotNull(strMap18);
    }

    @Test
    public void test24572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24572");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.util.Map<java.lang.String, java.lang.String> strMap4 = response1.headers();
        org.jsoup.Connection.Method method5 = response1.method();
        java.nio.ByteBuffer byteBuffer6 = null;
        response1.byteData = byteBuffer6;
        java.lang.String str8 = response1.statusMessage;
        int int9 = response1.statusCode;
        java.lang.String str10 = response1.statusMessage();
        boolean boolean12 = response1.hasHeader("hi!");
        response1.executed = false;
        java.lang.String str15 = response1.charset();
        java.nio.ByteBuffer byteBuffer16 = null;
        response1.byteData = byteBuffer16;
        org.jsoup.Connection.Response response20 = response1.header("hi!", "hi!");
        boolean boolean21 = response1.executed;
        java.util.Map<java.lang.String, java.lang.String> strMap22 = response1.cookies();
        java.lang.String str23 = response1.charset();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = response1.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(response20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(strMap22);
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test24573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24573");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.util.Map<java.lang.String, java.lang.String> strMap4 = response1.headers();
        org.jsoup.Connection.Method method5 = response1.method();
        java.nio.ByteBuffer byteBuffer6 = null;
        response1.byteData = byteBuffer6;
        java.lang.String str8 = response1.statusMessage();
        boolean boolean9 = response1.executed;
        java.lang.String str10 = response1.contentType;
        org.jsoup.Connection.Request request11 = null;
        response1.req = request11;
        int int13 = response1.statusCode;
        java.nio.ByteBuffer byteBuffer14 = null;
        response1.byteData = byteBuffer14;
        java.lang.String str16 = response1.charset();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry18 = response1.scanHeaders("");
        int int19 = response1.statusCode;
        java.nio.ByteBuffer byteBuffer20 = null;
        response1.byteData = byteBuffer20;
        java.lang.String str23 = response1.header("");
        org.jsoup.Connection.Method method24 = response1.method();
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(strEntry18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(method24);
    }

    @Test
    public void test24574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24574");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.util.Map<java.lang.String, java.lang.String> strMap4 = response1.headers();
        java.util.Map<java.lang.String, java.lang.String> strMap5 = response1.headers();
        response1.statusCode = '#';
        boolean boolean8 = response1.executed;
        java.nio.ByteBuffer byteBuffer9 = null;
        response1.byteData = byteBuffer9;
        boolean boolean13 = response1.hasHeaderWithValue("hi!", "");
        org.jsoup.Connection.Request request14 = null;
        response1.req = request14;
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test24575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24575");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.numRedirects;
        org.jsoup.Connection.Response response4 = response1.removeHeader("hi!");
        int int5 = response1.statusCode;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry7 = response1.scanHeaders("hi!");
        java.lang.String str8 = response1.statusMessage;
        java.lang.String str10 = response1.header("");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry12 = response1.scanHeaders("hi!");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry14 = response1.scanHeaders("");
        int int15 = response1.statusCode();
        java.lang.String str16 = response1.statusMessage;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(strEntry7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(strEntry12);
        org.junit.Assert.assertNull(strEntry14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test24576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24576");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.util.Map<java.lang.String, java.lang.String> strMap4 = response1.headers();
        org.jsoup.Connection.Method method5 = response1.method();
        int int6 = response1.statusCode();
        response1.charset = "";
        java.lang.String str9 = response1.contentType();
        java.lang.String str11 = response1.getHeaderCaseInsensitive("hi!");
        java.lang.String str12 = response1.statusMessage();
        response1.contentType = "";
        response1.contentType = "hi!";
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test24577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24577");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.util.Map<java.lang.String, java.lang.String> strMap4 = response1.headers();
        boolean boolean7 = response1.hasHeaderWithValue("hi!", "");
        org.jsoup.Connection.Request request8 = null;
        response1.req = request8;
        java.util.Map<java.lang.String, java.lang.String> strMap10 = response1.cookies();
        response1.contentType = "";
        java.lang.String str13 = response1.contentType;
        java.lang.String str15 = response1.header("");
        boolean boolean16 = response1.executed;
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test24578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24578");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.util.Map<java.lang.String, java.lang.String> strMap4 = response1.headers();
        org.jsoup.Connection.Method method5 = response1.method();
        int int6 = response1.statusCode();
        response1.statusMessage = "";
        java.net.URL uRL9 = response1.url();
        org.jsoup.Connection.Method method10 = response1.method();
        response1.contentType = "hi!";
        response1.statusMessage = "hi!";
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response1);
        boolean boolean17 = response15.hasCookie("hi!");
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test24579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24579");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Response response6 = response1.cookie("hi!", "");
        java.lang.String str7 = response1.charset;
        int int8 = response1.numRedirects;
        int int9 = response1.numRedirects;
        java.lang.String str10 = response1.charset;
        int int11 = response1.statusCode;
        boolean boolean13 = response1.hasHeader("hi!");
        int int14 = response1.numRedirects;
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str16 = response1.contentType();
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test24580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24580");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.util.Map<java.lang.String, java.lang.String> strMap4 = response1.headers();
        org.jsoup.Connection.Method method5 = response1.method();
        java.nio.ByteBuffer byteBuffer6 = null;
        response1.byteData = byteBuffer6;
        java.lang.String str8 = response1.statusMessage();
        boolean boolean9 = response1.executed;
        java.lang.String str10 = response1.contentType;
        java.lang.String str11 = response1.statusMessage;
        response1.executed = true;
        java.util.Map<java.lang.String, java.lang.String> strMap14 = response1.cookies();
        java.lang.String str15 = response1.statusMessage();
        org.jsoup.Connection.Request request16 = null;
        response1.req = request16;
        java.lang.String str18 = response1.contentType();
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test24581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24581");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.util.Map<java.lang.String, java.lang.String> strMap4 = response1.headers();
        org.jsoup.Connection.Method method5 = response1.method();
        int int6 = response1.statusCode();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry8 = response1.scanHeaders("hi!");
        org.jsoup.Connection.Response response11 = response1.cookie("hi!", "");
        java.lang.String str12 = response1.statusMessage();
        boolean boolean15 = response1.hasHeaderWithValue("hi!", "");
        response1.statusMessage = "hi!";
        int int18 = response1.numRedirects;
        java.lang.String str19 = response1.charset();
        java.lang.String str20 = response1.statusMessage();
        response1.numRedirects = '4';
        org.jsoup.Connection.Request request23 = response1.req;
        response1.executed = true;
        java.lang.String str27 = response1.getHeaderCaseInsensitive("");
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(strEntry8);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNull(request23);
        org.junit.Assert.assertNull(str27);
    }

    @Test
    public void test24582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24582");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.util.Map<java.lang.String, java.lang.String> strMap4 = response1.headers();
        org.jsoup.Connection.Method method5 = response1.method();
        java.nio.ByteBuffer byteBuffer6 = null;
        response1.byteData = byteBuffer6;
        java.lang.String str9 = response1.getHeaderCaseInsensitive("hi!");
        java.lang.String str10 = response1.statusMessage();
        org.jsoup.Connection.Response response12 = response1.removeHeader("hi!");
        java.lang.String str13 = response1.statusMessage;
        org.jsoup.Connection.Method method14 = response1.method();
        int int15 = response1.numRedirects;
        int int16 = response1.numRedirects;
        response1.contentType = "";
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(method14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test24583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24583");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str4 = response1.contentType();
        boolean boolean5 = response1.executed;
        org.jsoup.Connection.Response response7 = response1.removeCookie("hi!");
        java.lang.String str8 = response1.charset();
        org.jsoup.Connection.Method method9 = response1.method();
        response1.charset = "";
        java.lang.String str12 = response1.charset();
        java.net.URL uRL13 = response1.url();
        java.nio.ByteBuffer byteBuffer14 = response1.byteData;
        boolean boolean15 = response1.executed;
        int int16 = response1.statusCode;
        response1.contentType = "";
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(uRL13);
        org.junit.Assert.assertNull(byteBuffer14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test24584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24584");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.util.Map<java.lang.String, java.lang.String> strMap4 = response1.headers();
        org.jsoup.Connection.Method method5 = response1.method();
        java.nio.ByteBuffer byteBuffer6 = null;
        response1.byteData = byteBuffer6;
        java.lang.String str9 = response1.getHeaderCaseInsensitive("hi!");
        java.nio.ByteBuffer byteBuffer10 = null;
        response1.byteData = byteBuffer10;
        java.lang.String str12 = response1.statusMessage();
        java.lang.String str13 = response1.charset;
        boolean boolean14 = response1.executed;
        int int15 = response1.statusCode;
        int int16 = response1.numRedirects;
        response1.executed = false;
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test24585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24585");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.util.Map<java.lang.String, java.lang.String> strMap4 = response1.headers();
        org.jsoup.Connection.Method method5 = response1.method();
        int int6 = response1.statusCode();
        boolean boolean8 = response1.hasHeader("hi!");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry10 = response1.scanHeaders("hi!");
        org.jsoup.Connection.Request request11 = response1.req;
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(strEntry10);
        org.junit.Assert.assertNull(request11);
    }

    @Test
    public void test24586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24586");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str4 = response1.contentType();
        response1.executed = false;
        response1.statusMessage = "";
        response1.statusCode = (short) -1;
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test24587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24587");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.contentType = "hi!";
        java.util.Map<java.lang.String, java.lang.String> strMap4 = response1.headers();
        java.util.Map<java.lang.String, java.lang.String> strMap5 = response1.cookies();
        org.jsoup.Connection.Request request6 = response1.req;
        java.lang.String str8 = response1.getHeaderCaseInsensitive("");
        response1.executed = true;
        response1.contentType = "hi!";
        java.lang.String str13 = response1.statusMessage();
        org.jsoup.Connection.Method method14 = response1.method();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = response1.body();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNull(request6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(method14);
    }

    @Test
    public void test24588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24588");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.util.Map<java.lang.String, java.lang.String> strMap4 = response1.headers();
        org.jsoup.Connection.Method method5 = response1.method();
        java.nio.ByteBuffer byteBuffer6 = null;
        response1.byteData = byteBuffer6;
        java.lang.String str8 = response1.statusMessage;
        int int9 = response1.statusCode;
        java.lang.String str10 = response1.statusMessage();
        boolean boolean12 = response1.hasHeader("hi!");
        response1.executed = false;
        java.lang.String str15 = response1.charset();
        java.nio.ByteBuffer byteBuffer16 = null;
        response1.byteData = byteBuffer16;
        org.jsoup.Connection.Response response20 = response1.header("hi!", "hi!");
        boolean boolean21 = response1.executed;
        java.lang.String str22 = response1.charset();
        org.jsoup.Connection.Request request23 = null;
        response1.req = request23;
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(response20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test24589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24589");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.numRedirects;
        org.jsoup.Connection.Response response4 = response1.removeHeader("hi!");
        int int5 = response1.statusCode;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry7 = response1.scanHeaders("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap8 = response1.cookies();
        org.jsoup.Connection.Response response11 = response1.header("hi!", "hi!");
        response1.executed = false;
        response1.statusMessage = "";
        java.lang.String str16 = response1.charset();
        response1.executed = true;
        java.lang.String str19 = response1.charset;
        java.lang.String str20 = response1.statusMessage;
        java.lang.String str22 = response1.getHeaderCaseInsensitive("");
        response1.numRedirects = (short) 100;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(strEntry7);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test24590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24590");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.numRedirects;
        org.jsoup.Connection.Response response4 = response1.removeHeader("hi!");
        int int5 = response1.statusCode;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry7 = response1.scanHeaders("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap8 = response1.cookies();
        java.lang.String str10 = response1.header("");
        org.jsoup.Connection.Method method11 = response1.method();
        java.lang.String str12 = response1.statusMessage;
        java.nio.ByteBuffer byteBuffer13 = response1.byteData;
        response1.contentType = "hi!";
        java.lang.String str17 = response1.cookie("hi!");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry19 = response1.scanHeaders("hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(strEntry7);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(method11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(byteBuffer13);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(strEntry19);
    }

    @Test
    public void test24591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24591");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str4 = response1.contentType();
        java.lang.String str5 = response1.statusMessage;
        org.jsoup.Connection.Response response8 = response1.cookie("hi!", "");
        java.lang.String str9 = response1.statusMessage;
        java.util.Map<java.lang.String, java.lang.String> strMap10 = response1.cookies();
        java.nio.ByteBuffer byteBuffer11 = response1.byteData;
        java.lang.String str12 = response1.contentType;
        response1.charset = "hi!";
        java.lang.String str15 = response1.statusMessage();
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response1);
        response17.statusCode = '4';
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test24592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24592");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str4 = response1.contentType();
        boolean boolean5 = response1.executed;
        org.jsoup.Connection.Response response7 = response1.removeCookie("hi!");
        java.lang.String str8 = response1.charset();
        java.lang.String str9 = response1.statusMessage;
        java.lang.String str10 = response1.charset();
        java.lang.String str11 = response1.charset;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry13 = response1.scanHeaders("hi!");
        java.nio.ByteBuffer byteBuffer14 = response1.byteData;
        java.lang.String str15 = response1.contentType;
        java.lang.Class<?> wildcardClass16 = response1.getClass();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(strEntry13);
        org.junit.Assert.assertNull(byteBuffer14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test24593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24593");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.util.Map<java.lang.String, java.lang.String> strMap4 = response1.headers();
        org.jsoup.Connection.Method method5 = response1.method();
        java.nio.ByteBuffer byteBuffer6 = null;
        response1.byteData = byteBuffer6;
        java.lang.String str9 = response1.getHeaderCaseInsensitive("hi!");
        org.jsoup.Connection.Method method10 = response1.method();
        boolean boolean11 = response1.executed;
        java.lang.String str12 = response1.contentType;
        response1.executed = true;
        response1.charset = "hi!";
        java.lang.String str17 = response1.contentType;
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test24594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24594");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.util.Map<java.lang.String, java.lang.String> strMap4 = response1.headers();
        org.jsoup.Connection.Method method5 = response1.method();
        int int6 = response1.statusCode();
        response1.charset = "";
        java.lang.String str9 = response1.contentType();
        java.lang.String str10 = response1.contentType;
        int int11 = response1.statusCode;
        org.jsoup.Connection.Method method12 = response1.method();
        java.lang.String str14 = response1.header("hi!");
        java.nio.ByteBuffer byteBuffer15 = null;
        response1.byteData = byteBuffer15;
        java.lang.String str18 = response1.header("");
        response1.executed = false;
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(method12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test24595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24595");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.contentType = "hi!";
        java.util.Map<java.lang.String, java.lang.String> strMap4 = response1.headers();
        org.jsoup.Connection.Response response7 = response1.header("hi!", "");
        response1.statusCode = (short) 1;
        response1.statusMessage = "hi!";
        int int12 = response1.statusCode;
        response1.statusMessage = "hi!";
        int int15 = response1.statusCode;
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test24596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24596");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str4 = response1.contentType();
        response1.executed = false;
        org.jsoup.Connection.Request request7 = response1.req;
        java.util.Map<java.lang.String, java.lang.String> strMap8 = response1.cookies();
        java.lang.String str10 = response1.header("hi!");
        int int11 = response1.statusCode();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(request7);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test24597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24597");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.util.Map<java.lang.String, java.lang.String> strMap4 = response1.headers();
        org.jsoup.Connection.Method method5 = response1.method();
        int int6 = response1.statusCode();
        java.nio.ByteBuffer byteBuffer7 = null;
        response1.byteData = byteBuffer7;
        int int9 = response1.numRedirects;
        java.lang.String str10 = response1.contentType();
        int int11 = response1.numRedirects;
        java.lang.String str13 = response1.header("hi!");
        org.jsoup.Connection.Response response16 = response1.cookie("hi!", "hi!");
        java.net.URL uRL17 = response1.url();
        java.lang.String str18 = response1.statusMessage;
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertNull(uRL17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test24598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24598");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str4 = response1.contentType();
        java.lang.String str5 = response1.statusMessage;
        java.lang.String str6 = response1.charset;
        response1.executed = false;
        java.lang.String str10 = response1.header("hi!");
        java.lang.String str11 = response1.charset();
        java.util.Map<java.lang.String, java.lang.String> strMap12 = response1.cookies();
        java.lang.String str13 = response1.charset;
        java.lang.String str15 = response1.header("");
        java.lang.String str16 = response1.contentType();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response18 = response1.removeCookie("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test24599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24599");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.numRedirects;
        org.jsoup.Connection.Request request3 = null;
        response1.req = request3;
        java.lang.String str5 = response1.charset();
        response1.statusCode = ' ';
        boolean boolean9 = response1.hasHeader("hi!");
        boolean boolean10 = response1.executed;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test24600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24600");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str4 = response1.contentType();
        java.lang.String str5 = response1.statusMessage;
        java.lang.String str6 = response1.contentType();
        java.lang.String str7 = response1.statusMessage();
        java.lang.String str8 = response1.statusMessage();
        java.nio.ByteBuffer byteBuffer9 = null;
        response1.byteData = byteBuffer9;
        response1.contentType = "";
        java.lang.String str13 = response1.contentType();
        int int14 = response1.statusCode;
        int int15 = response1.numRedirects;
        java.nio.ByteBuffer byteBuffer16 = null;
        response1.byteData = byteBuffer16;
        java.nio.ByteBuffer byteBuffer18 = response1.byteData;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(byteBuffer18);
    }

    @Test
    public void test24601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24601");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.util.Map<java.lang.String, java.lang.String> strMap4 = response1.headers();
        org.jsoup.Connection.Method method5 = response1.method();
        java.nio.ByteBuffer byteBuffer6 = null;
        response1.byteData = byteBuffer6;
        java.lang.String str8 = response1.statusMessage();
        boolean boolean9 = response1.executed;
        int int10 = response1.statusCode();
        java.nio.ByteBuffer byteBuffer11 = null;
        response1.byteData = byteBuffer11;
        org.jsoup.Connection.Response response14 = response1.removeHeader("hi!");
        boolean boolean16 = response1.hasHeader("hi!");
        java.lang.String str18 = response1.cookie("hi!");
        org.jsoup.Connection.Request request19 = null;
        response1.req = request19;
        org.jsoup.Connection.Request request21 = response1.req;
        java.lang.String str22 = response1.statusMessage;
        org.jsoup.Connection.Request request23 = null;
        response1.req = request23;
        java.util.Map<java.lang.String, java.lang.String> strMap25 = response1.headers();
        int int26 = response1.statusCode;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean28 = response1.hasCookie("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(request21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(strMap25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test24602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24602");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.numRedirects;
        org.jsoup.Connection.Request request3 = null;
        response1.req = request3;
        java.nio.ByteBuffer byteBuffer5 = response1.byteData;
        java.lang.String str7 = response1.getHeaderCaseInsensitive("hi!");
        response1.numRedirects = (short) 100;
        java.lang.String str10 = response1.charset();
        org.jsoup.Connection.Response response12 = response1.removeCookie("hi!");
        java.lang.String str14 = response1.header("hi!");
        boolean boolean16 = response1.hasCookie("hi!");
        response1.charset = "";
        response1.contentType = "";
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(byteBuffer5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test24603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24603");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str4 = response1.contentType();
        java.lang.String str5 = response1.statusMessage;
        org.jsoup.Connection.Response response8 = response1.cookie("hi!", "");
        response1.contentType = "";
        java.net.URL uRL11 = response1.url();
        java.lang.String str13 = response1.header("");
        boolean boolean15 = response1.hasCookie("hi!");
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response1);
        int int17 = response1.statusCode;
        java.lang.String str18 = response1.charset();
        org.jsoup.Connection.Request request19 = null;
        response1.req = request19;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test24604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24604");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str4 = response1.contentType();
        java.lang.String str5 = response1.statusMessage;
        java.lang.String str6 = response1.contentType();
        response1.contentType = "hi!";
        int int9 = response1.statusCode;
        org.jsoup.Connection.Method method10 = response1.method();
        java.lang.String str11 = response1.charset;
        org.jsoup.Connection.Method method12 = response1.method();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry14 = response1.scanHeaders("hi!");
        org.jsoup.Connection.Response response17 = response1.header("hi!", "");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(method12);
        org.junit.Assert.assertNull(strEntry14);
        org.junit.Assert.assertNotNull(response17);
    }

    @Test
    public void test24605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24605");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.util.Map<java.lang.String, java.lang.String> strMap4 = response1.headers();
        org.jsoup.Connection.Method method5 = response1.method();
        java.util.Map<java.lang.String, java.lang.String> strMap6 = response1.cookies();
        java.lang.String str7 = response1.contentType();
        response1.numRedirects = (short) 0;
        response1.statusMessage = "hi!";
        int int12 = response1.statusCode;
        java.lang.String str13 = response1.contentType;
        java.lang.String str14 = response1.statusMessage;
        java.lang.String str15 = response1.contentType;
        org.jsoup.Connection.Response response18 = response1.header("hi!", "hi!");
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(response18);
    }

    @Test
    public void test24606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24606");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.util.Map<java.lang.String, java.lang.String> strMap4 = response1.headers();
        org.jsoup.Connection.Method method5 = response1.method();
        java.nio.ByteBuffer byteBuffer6 = null;
        response1.byteData = byteBuffer6;
        java.lang.String str9 = response1.getHeaderCaseInsensitive("hi!");
        org.jsoup.Connection.Method method10 = response1.method();
        boolean boolean11 = response1.executed;
        java.lang.String str12 = response1.statusMessage();
        boolean boolean13 = response1.executed;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry15 = response1.scanHeaders("hi!");
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(strEntry15);
    }

    @Test
    public void test24607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24607");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str4 = response1.contentType();
        boolean boolean5 = response1.executed;
        org.jsoup.Connection.Response response7 = response1.removeCookie("hi!");
        java.lang.String str8 = response1.charset();
        org.jsoup.Connection.Method method9 = response1.method();
        response1.charset = "";
        java.lang.String str12 = response1.charset();
        java.net.URL uRL13 = response1.url();
        java.lang.String str14 = response1.charset;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry16 = response1.scanHeaders("hi!");
        response1.statusMessage = "";
        int int19 = response1.numRedirects;
        response1.charset = "hi!";
        int int22 = response1.numRedirects;
        org.jsoup.Connection.Request request23 = response1.req;
        java.lang.String str24 = response1.charset();
        response1.charset = "hi!";
        java.lang.String str27 = response1.contentType;
        java.nio.ByteBuffer byteBuffer28 = null;
        response1.byteData = byteBuffer28;
        org.jsoup.Connection.Request request30 = response1.req;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(uRL13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(strEntry16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNull(request23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(request30);
    }

    @Test
    public void test24608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24608");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.util.Map<java.lang.String, java.lang.String> strMap4 = response1.headers();
        org.jsoup.Connection.Method method5 = response1.method();
        java.nio.ByteBuffer byteBuffer6 = null;
        response1.byteData = byteBuffer6;
        java.lang.String str8 = response1.statusMessage;
        int int9 = response1.statusCode;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry11 = response1.scanHeaders("hi!");
        response1.statusCode = (byte) 10;
        java.lang.String str15 = response1.cookie("hi!");
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(strEntry11);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test24609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24609");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        response2.statusMessage = "";
        java.util.Map<java.lang.String, java.lang.String> strMap5 = response2.headers();
        org.jsoup.Connection.Method method6 = response2.method();
        java.nio.ByteBuffer byteBuffer7 = null;
        response2.byteData = byteBuffer7;
        java.lang.String str9 = response2.statusMessage();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry11 = response2.scanHeaders("");
        response2.statusCode = 10;
        org.jsoup.Connection.Response response15 = response2.removeCookie("hi!");
        boolean boolean16 = response2.executed;
        java.util.Map<java.lang.String, java.lang.String> strMap17 = response2.cookies();
        java.lang.String str18 = response2.charset();
        response2.charset = "";
        response2.numRedirects = '#';
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response23 = org.jsoup.helper.HttpConnection.Response.execute(request0, response2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(strEntry11);
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(strMap17);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test24610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24610");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str4 = response1.contentType();
        boolean boolean5 = response1.executed;
        org.jsoup.Connection.Response response7 = response1.removeCookie("hi!");
        java.lang.String str8 = response1.charset();
        java.lang.String str9 = response1.statusMessage;
        response1.statusMessage = "hi!";
        response1.statusCode = (byte) 0;
        java.lang.String str14 = response1.charset();
        int int15 = response1.statusCode();
        org.jsoup.Connection.Response response17 = response1.removeCookie("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap18 = response1.cookies();
        boolean boolean19 = response1.executed;
        org.jsoup.Connection.Response response21 = response1.removeCookie("hi!");
        java.lang.String str22 = response1.charset;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(response17);
        org.junit.Assert.assertNotNull(strMap18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(response21);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test24611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24611");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.util.Map<java.lang.String, java.lang.String> strMap4 = response1.headers();
        org.jsoup.Connection.Method method5 = response1.method();
        java.nio.ByteBuffer byteBuffer6 = null;
        response1.byteData = byteBuffer6;
        java.util.Map<java.lang.String, java.lang.String> strMap8 = response1.headers();
        int int9 = response1.statusCode();
        boolean boolean12 = response1.hasHeaderWithValue("hi!", "");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry14 = response1.scanHeaders("hi!");
        org.jsoup.Connection.Response response16 = response1.removeCookie("hi!");
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(strEntry14);
        org.junit.Assert.assertNotNull(response16);
    }

    @Test
    public void test24612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24612");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str4 = response1.contentType();
        java.lang.String str5 = response1.statusMessage;
        org.jsoup.Connection.Response response8 = response1.cookie("hi!", "");
        java.lang.String str9 = response1.statusMessage;
        java.util.Map<java.lang.String, java.lang.String> strMap10 = response1.cookies();
        int int11 = response1.numRedirects;
        org.jsoup.Connection.Request request12 = response1.req;
        java.nio.ByteBuffer byteBuffer13 = null;
        response1.byteData = byteBuffer13;
        int int15 = response1.numRedirects;
        response1.charset = "hi!";
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(request12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test24613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24613");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str4 = response1.contentType();
        java.lang.String str5 = response1.statusMessage;
        org.jsoup.Connection.Response response8 = response1.cookie("hi!", "");
        java.lang.String str9 = response1.statusMessage;
        java.util.Map<java.lang.String, java.lang.String> strMap10 = response1.cookies();
        java.lang.String str11 = response1.statusMessage;
        java.nio.ByteBuffer byteBuffer12 = null;
        response1.byteData = byteBuffer12;
        org.jsoup.Connection.Request request14 = response1.req;
        java.util.Map<java.lang.String, java.lang.String> strMap15 = response1.headers();
        org.jsoup.Connection.Request request16 = response1.req;
        java.util.Map<java.lang.String, java.lang.String> strMap17 = response1.headers();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(request14);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertNull(request16);
        org.junit.Assert.assertNotNull(strMap17);
    }

    @Test
    public void test24614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24614");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.util.Map<java.lang.String, java.lang.String> strMap4 = response1.headers();
        org.jsoup.Connection.Method method5 = response1.method();
        java.util.Map<java.lang.String, java.lang.String> strMap6 = response1.cookies();
        org.jsoup.Connection.Request request7 = response1.req;
        java.lang.String str8 = response1.contentType;
        response1.statusCode = '#';
        boolean boolean13 = response1.hasHeaderWithValue("hi!", "");
        java.util.Map<java.lang.String, java.lang.String> strMap14 = response1.headers();
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str16 = response1.contentType;
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNull(request7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test24615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24615");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.util.Map<java.lang.String, java.lang.String> strMap4 = response1.headers();
        org.jsoup.Connection.Method method5 = response1.method();
        java.nio.ByteBuffer byteBuffer6 = null;
        response1.byteData = byteBuffer6;
        java.lang.String str8 = response1.statusMessage;
        int int9 = response1.statusCode;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry11 = response1.scanHeaders("hi!");
        response1.statusCode = (byte) 10;
        java.lang.String str14 = response1.statusMessage();
        boolean boolean16 = response1.hasCookie("hi!");
        org.jsoup.Connection.Response response19 = response1.header("hi!", "");
        boolean boolean21 = response1.hasCookie("hi!");
        int int22 = response1.statusCode();
        java.lang.String str24 = response1.getHeaderCaseInsensitive("hi!");
        response1.statusMessage = "";
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(strEntry11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(response19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test24616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24616");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str4 = response1.contentType();
        boolean boolean5 = response1.executed;
        org.jsoup.Connection.Response response7 = response1.removeHeader("hi!");
        response1.executed = false;
        response1.contentType = "";
        response1.statusCode = 0;
        java.lang.String str15 = response1.header("hi!");
        org.jsoup.Connection.Response response18 = response1.header("hi!", "hi!");
        java.lang.String str19 = response1.statusMessage();
        response1.statusMessage = "hi!";
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(response18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test24617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24617");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.contentType = "hi!";
        java.util.Map<java.lang.String, java.lang.String> strMap4 = response1.headers();
        org.jsoup.Connection.Method method5 = response1.method();
        java.nio.ByteBuffer byteBuffer6 = null;
        response1.byteData = byteBuffer6;
        response1.charset = "hi!";
        response1.charset = "hi!";
        java.nio.ByteBuffer byteBuffer12 = response1.byteData;
        java.util.Map<java.lang.String, java.lang.String> strMap13 = response1.cookies();
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str15 = response14.statusMessage;
        java.lang.String str16 = response14.charset();
        response14.charset = "";
        int int19 = response14.numRedirects;
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(byteBuffer12);
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test24618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24618");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str4 = response1.contentType();
        boolean boolean5 = response1.executed;
        org.jsoup.Connection.Response response7 = response1.removeCookie("hi!");
        java.lang.String str8 = response1.charset();
        response1.contentType = "";
        java.lang.String str12 = response1.getHeaderCaseInsensitive("hi!");
        java.lang.String str14 = response1.header("");
        java.lang.String str15 = response1.charset();
        response1.contentType = "";
        java.nio.ByteBuffer byteBuffer18 = response1.byteData;
        org.jsoup.Connection.Method method19 = response1.method();
        java.util.Map<java.lang.String, java.lang.String> strMap20 = response1.headers();
        java.util.Map<java.lang.String, java.lang.String> strMap21 = response1.headers();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(byteBuffer18);
        org.junit.Assert.assertNull(method19);
        org.junit.Assert.assertNotNull(strMap20);
        org.junit.Assert.assertNotNull(strMap21);
    }

    @Test
    public void test24619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24619");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str4 = response1.contentType();
        boolean boolean5 = response1.executed;
        org.jsoup.Connection.Response response7 = response1.removeCookie("hi!");
        java.lang.String str8 = response1.charset();
        org.jsoup.Connection.Method method9 = response1.method();
        int int10 = response1.statusCode;
        java.lang.String str11 = response1.charset();
        org.jsoup.Connection.Response response13 = response1.removeHeader("hi!");
        java.lang.String str14 = response1.charset();
        java.nio.ByteBuffer byteBuffer15 = response1.byteData;
        org.jsoup.Connection.Response response17 = response1.removeHeader("hi!");
        response1.statusMessage = "";
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(byteBuffer15);
        org.junit.Assert.assertNotNull(response17);
    }

    @Test
    public void test24620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24620");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str4 = response1.contentType();
        boolean boolean5 = response1.executed;
        org.jsoup.Connection.Response response7 = response1.removeCookie("hi!");
        java.lang.String str8 = response1.charset();
        java.lang.String str9 = response1.statusMessage;
        response1.statusMessage = "hi!";
        response1.statusCode = (byte) 0;
        int int14 = response1.numRedirects;
        java.util.Map<java.lang.String, java.lang.String> strMap15 = response1.cookies();
        java.lang.String str16 = response1.contentType;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test24621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24621");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str2 = response1.contentType;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry4 = response1.scanHeaders("hi!");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry6 = response1.scanHeaders("");
        boolean boolean7 = response1.executed;
        java.lang.String str8 = response1.statusMessage;
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.Class<?> wildcardClass10 = response9.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(strEntry4);
        org.junit.Assert.assertNull(strEntry6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test24622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24622");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.util.Map<java.lang.String, java.lang.String> strMap4 = response1.headers();
        org.jsoup.Connection.Method method5 = response1.method();
        java.nio.ByteBuffer byteBuffer6 = null;
        response1.byteData = byteBuffer6;
        java.lang.String str8 = response1.statusMessage();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry10 = response1.scanHeaders("");
        response1.statusCode = 10;
        org.jsoup.Connection.Response response14 = response1.removeCookie("hi!");
        org.jsoup.Connection.Response response16 = response1.removeHeader("hi!");
        java.lang.String str17 = response1.statusMessage();
        java.lang.String str18 = response1.statusMessage();
        response1.charset = "";
        java.lang.String str21 = response1.statusMessage();
        java.nio.ByteBuffer byteBuffer22 = null;
        response1.byteData = byteBuffer22;
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(strEntry10);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test24623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24623");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str4 = response1.contentType();
        boolean boolean5 = response1.executed;
        org.jsoup.Connection.Response response7 = response1.removeCookie("hi!");
        java.lang.String str8 = response1.charset();
        org.jsoup.Connection.Method method9 = response1.method();
        response1.charset = "";
        java.lang.String str12 = response1.charset();
        java.net.URL uRL13 = response1.url();
        java.lang.String str14 = response1.charset;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry16 = response1.scanHeaders("hi!");
        response1.statusMessage = "";
        java.lang.String str20 = response1.getHeaderCaseInsensitive("");
        java.lang.String str22 = response1.cookie("hi!");
        int int23 = response1.statusCode;
        response1.statusCode = '#';
        java.lang.String str26 = response1.contentType;
        java.nio.ByteBuffer byteBuffer27 = null;
        response1.byteData = byteBuffer27;
        java.lang.String str30 = response1.cookie("hi!");
        int int31 = response1.statusCode;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(uRL13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(strEntry16);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 35 + "'", int31 == 35);
    }

    @Test
    public void test24624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24624");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.util.Map<java.lang.String, java.lang.String> strMap4 = response1.headers();
        org.jsoup.Connection.Method method5 = response1.method();
        java.nio.ByteBuffer byteBuffer6 = null;
        response1.byteData = byteBuffer6;
        java.lang.String str8 = response1.statusMessage();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry10 = response1.scanHeaders("");
        response1.statusCode = 10;
        org.jsoup.Connection.Response response14 = response1.removeCookie("hi!");
        java.lang.String str16 = response1.cookie("hi!");
        org.jsoup.Connection.Response response18 = response1.removeHeader("hi!");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry20 = response1.scanHeaders("");
        java.lang.String str21 = response1.charset();
        java.lang.String str23 = response1.getHeaderCaseInsensitive("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap24 = response1.cookies();
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(strEntry10);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(response18);
        org.junit.Assert.assertNull(strEntry20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(strMap24);
    }

    @Test
    public void test24625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24625");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.util.Map<java.lang.String, java.lang.String> strMap4 = response1.headers();
        org.jsoup.Connection.Method method5 = response1.method();
        java.nio.ByteBuffer byteBuffer6 = null;
        response1.byteData = byteBuffer6;
        java.lang.String str9 = response1.getHeaderCaseInsensitive("hi!");
        java.lang.String str10 = response1.statusMessage();
        org.jsoup.Connection.Response response12 = response1.removeHeader("hi!");
        java.nio.ByteBuffer byteBuffer13 = response1.byteData;
        java.net.URL uRL14 = response1.url();
        java.lang.String str15 = response1.statusMessage();
        boolean boolean17 = response1.hasCookie("hi!");
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response(response1);
        boolean boolean20 = response18.hasCookie("hi!");
        response18.statusMessage = "";
        response18.contentType = "hi!";
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNull(byteBuffer13);
        org.junit.Assert.assertNull(uRL14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test24626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24626");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Response response6 = response1.cookie("hi!", "");
        org.jsoup.Connection.Response response9 = response1.cookie("hi!", "");
        org.jsoup.Connection.Request request10 = null;
        response1.req = request10;
        java.nio.ByteBuffer byteBuffer12 = null;
        response1.byteData = byteBuffer12;
        response1.numRedirects = (byte) 1;
        java.lang.String str17 = response1.header("hi!");
        java.nio.ByteBuffer byteBuffer18 = response1.byteData;
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(byteBuffer18);
    }

    @Test
    public void test24627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24627");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.util.Map<java.lang.String, java.lang.String> strMap4 = response1.headers();
        org.jsoup.Connection.Method method5 = response1.method();
        java.nio.ByteBuffer byteBuffer6 = null;
        response1.byteData = byteBuffer6;
        java.lang.String str8 = response1.statusMessage;
        java.lang.String str9 = response1.statusMessage;
        int int10 = response1.numRedirects;
        java.lang.String str11 = response1.statusMessage();
        java.net.URL uRL12 = response1.url();
        org.jsoup.Connection.Request request13 = response1.req;
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(uRL12);
        org.junit.Assert.assertNull(request13);
    }

    @Test
    public void test24628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24628");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str4 = response1.contentType();
        java.lang.String str5 = response1.statusMessage;
        java.lang.String str6 = response1.charset;
        response1.executed = false;
        java.lang.String str9 = response1.statusMessage;
        java.lang.String str10 = response1.statusMessage();
        java.lang.String str11 = response1.statusMessage();
        java.lang.String str12 = response1.contentType();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test24629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24629");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str4 = response1.contentType();
        boolean boolean5 = response1.executed;
        org.jsoup.Connection.Response response7 = response1.removeCookie("hi!");
        response1.numRedirects = 0;
        org.jsoup.Connection.Request request10 = response1.req;
        java.util.Map<java.lang.String, java.lang.String> strMap11 = response1.headers();
        response1.statusMessage = "";
        java.nio.ByteBuffer byteBuffer14 = response1.byteData;
        java.util.Map<java.lang.String, java.lang.String> strMap15 = response1.cookies();
        response1.executed = false;
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.util.Map<java.lang.String, java.lang.String> strMap19 = response18.cookies();
        response18.charset = "";
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(request10);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNull(byteBuffer14);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertNotNull(strMap19);
    }

    @Test
    public void test24630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24630");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str4 = response1.contentType();
        boolean boolean5 = response1.executed;
        org.jsoup.Connection.Response response7 = response1.removeCookie("hi!");
        java.lang.String str8 = response1.charset();
        org.jsoup.Connection.Method method9 = response1.method();
        response1.charset = "";
        response1.statusMessage = "hi!";
        org.jsoup.Connection.Request request14 = response1.req;
        java.lang.String str16 = response1.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Request request17 = response1.req;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response19 = response1.removeCookie("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertNull(request14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(request17);
    }

    @Test
    public void test24631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24631");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.util.Map<java.lang.String, java.lang.String> strMap4 = response1.headers();
        org.jsoup.Connection.Method method5 = response1.method();
        java.nio.ByteBuffer byteBuffer6 = null;
        response1.byteData = byteBuffer6;
        java.lang.String str8 = response1.statusMessage;
        int int9 = response1.statusCode;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry11 = response1.scanHeaders("hi!");
        response1.statusCode = (byte) 10;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry15 = response1.scanHeaders("hi!");
        int int16 = response1.statusCode();
        java.nio.ByteBuffer byteBuffer17 = null;
        response1.byteData = byteBuffer17;
        java.lang.String str20 = response1.header("");
        java.nio.ByteBuffer byteBuffer21 = response1.byteData;
        java.util.Map<java.lang.String, java.lang.String> strMap22 = response1.headers();
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(strEntry11);
        org.junit.Assert.assertNull(strEntry15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(byteBuffer21);
        org.junit.Assert.assertNotNull(strMap22);
    }

    @Test
    public void test24632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24632");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.util.Map<java.lang.String, java.lang.String> strMap4 = response1.headers();
        org.jsoup.Connection.Method method5 = response1.method();
        int int6 = response1.statusCode();
        boolean boolean8 = response1.hasHeader("hi!");
        int int9 = response1.statusCode;
        int int10 = response1.statusCode();
        response1.statusCode = (byte) -1;
        java.util.Map<java.lang.String, java.lang.String> strMap13 = response1.cookies();
        org.jsoup.Connection.Method method14 = response1.method();
        java.lang.String str15 = response1.statusMessage;
        java.lang.String str17 = response1.header("hi!");
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertNull(method14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test24633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24633");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.util.Map<java.lang.String, java.lang.String> strMap4 = response1.headers();
        org.jsoup.Connection.Method method5 = response1.method();
        java.nio.ByteBuffer byteBuffer6 = null;
        response1.byteData = byteBuffer6;
        java.lang.String str8 = response1.statusMessage();
        boolean boolean9 = response1.executed;
        java.lang.String str10 = response1.contentType;
        java.lang.String str11 = response1.statusMessage;
        java.lang.String str12 = response1.contentType();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry14 = response1.scanHeaders("");
        org.jsoup.Connection.Response response17 = response1.cookie("hi!", "hi!");
        response1.statusCode = 20;
        java.util.Map<java.lang.String, java.lang.String> strMap20 = response1.cookies();
        int int21 = response1.statusCode;
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(strEntry14);
        org.junit.Assert.assertNotNull(response17);
        org.junit.Assert.assertNotNull(strMap20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 20 + "'", int21 == 20);
    }

    @Test
    public void test24634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24634");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.util.Map<java.lang.String, java.lang.String> strMap4 = response1.headers();
        org.jsoup.Connection.Method method5 = response1.method();
        java.nio.ByteBuffer byteBuffer6 = null;
        response1.byteData = byteBuffer6;
        java.lang.String str9 = response1.getHeaderCaseInsensitive("hi!");
        java.lang.String str10 = response1.statusMessage();
        org.jsoup.Connection.Response response12 = response1.removeHeader("hi!");
        java.net.URL uRL13 = response1.url();
        org.jsoup.Connection.Method method14 = response1.method();
        response1.statusMessage = "";
        boolean boolean19 = response1.hasHeaderWithValue("hi!", "");
        response1.executed = true;
        java.net.URL uRL22 = response1.url();
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNull(uRL13);
        org.junit.Assert.assertNull(method14);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(uRL22);
    }

    @Test
    public void test24635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24635");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.util.Map<java.lang.String, java.lang.String> strMap4 = response1.headers();
        org.jsoup.Connection.Method method5 = response1.method();
        java.nio.ByteBuffer byteBuffer6 = null;
        response1.byteData = byteBuffer6;
        java.lang.String str8 = response1.statusMessage;
        int int9 = response1.statusCode;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry11 = response1.scanHeaders("hi!");
        response1.statusCode = (byte) 10;
        java.lang.String str14 = response1.statusMessage;
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(strEntry11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test24636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24636");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.util.Map<java.lang.String, java.lang.String> strMap4 = response1.headers();
        org.jsoup.Connection.Method method5 = response1.method();
        java.nio.ByteBuffer byteBuffer6 = null;
        response1.byteData = byteBuffer6;
        java.lang.String str8 = response1.statusMessage;
        int int9 = response1.statusCode;
        java.lang.String str10 = response1.statusMessage();
        boolean boolean12 = response1.hasHeader("hi!");
        response1.executed = false;
        boolean boolean15 = response1.executed;
        org.jsoup.Connection.Response response18 = response1.header("hi!", "");
        java.lang.String str19 = response1.statusMessage;
        response1.statusMessage = "";
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(response18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test24637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24637");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.util.Map<java.lang.String, java.lang.String> strMap4 = response1.headers();
        org.jsoup.Connection.Method method5 = response1.method();
        java.nio.ByteBuffer byteBuffer6 = null;
        response1.byteData = byteBuffer6;
        java.lang.String str8 = response1.statusMessage;
        int int9 = response1.statusCode;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry11 = response1.scanHeaders("hi!");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry13 = response1.scanHeaders("");
        java.lang.String str14 = response1.contentType;
        java.lang.String str16 = response1.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Method method17 = response1.method();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass18 = method17.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(strEntry11);
        org.junit.Assert.assertNull(strEntry13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(method17);
    }

    @Test
    public void test24638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24638");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str4 = response1.contentType();
        boolean boolean5 = response1.executed;
        org.jsoup.Connection.Response response7 = response1.removeCookie("hi!");
        java.lang.String str8 = response1.charset();
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response1);
        response1.contentType = "hi!";
        java.nio.ByteBuffer byteBuffer12 = response1.byteData;
        java.net.URL uRL13 = response1.url();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(byteBuffer12);
        org.junit.Assert.assertNull(uRL13);
    }

    @Test
    public void test24639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24639");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str4 = response1.contentType();
        boolean boolean5 = response1.executed;
        org.jsoup.Connection.Response response7 = response1.removeCookie("hi!");
        java.lang.String str8 = response1.charset();
        org.jsoup.Connection.Method method9 = response1.method();
        int int10 = response1.statusCode;
        java.nio.ByteBuffer byteBuffer11 = response1.byteData;
        response1.statusCode = (byte) -1;
        int int14 = response1.statusCode;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test24640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24640");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.util.Map<java.lang.String, java.lang.String> strMap4 = response1.headers();
        org.jsoup.Connection.Method method5 = response1.method();
        int int6 = response1.statusCode();
        response1.statusMessage = "";
        java.net.URL uRL9 = response1.url();
        int int10 = response1.numRedirects;
        java.util.Map<java.lang.String, java.lang.String> strMap11 = response1.cookies();
        response1.statusMessage = "";
        java.lang.String str14 = response1.statusMessage;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry16 = response1.scanHeaders("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap17 = response1.headers();
        java.net.URL uRL18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response19 = response1.url(uRL18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(strEntry16);
        org.junit.Assert.assertNotNull(strMap17);
    }

    @Test
    public void test24641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24641");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str4 = response1.contentType();
        response1.contentType = "";
        int int7 = response1.statusCode();
        org.jsoup.Connection.Request request8 = response1.req;
        java.nio.ByteBuffer byteBuffer9 = null;
        response1.byteData = byteBuffer9;
        boolean boolean11 = response1.executed;
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str13 = response12.charset;
        response12.contentType = "hi!";
        response12.executed = false;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(request8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test24642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24642");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str4 = response1.contentType();
        java.lang.String str5 = response1.statusMessage;
        java.lang.String str6 = response1.contentType();
        java.lang.String str7 = response1.statusMessage();
        java.lang.String str8 = response1.statusMessage();
        java.nio.ByteBuffer byteBuffer9 = null;
        response1.byteData = byteBuffer9;
        response1.contentType = "";
        java.lang.String str13 = response1.contentType();
        int int14 = response1.statusCode;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry16 = response1.scanHeaders("hi!");
        java.nio.ByteBuffer byteBuffer17 = null;
        response1.byteData = byteBuffer17;
        java.lang.String str19 = response1.contentType;
        org.jsoup.Connection.Method method20 = response1.method();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(strEntry16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNull(method20);
    }

    @Test
    public void test24643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24643");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.contentType = "hi!";
        java.util.Map<java.lang.String, java.lang.String> strMap4 = response1.headers();
        org.jsoup.Connection.Response response7 = response1.header("hi!", "");
        response1.statusMessage = "hi!";
        org.jsoup.Connection.Response response12 = response1.cookie("hi!", "hi!");
        response1.numRedirects = 32;
        int int15 = response1.statusCode();
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test24644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24644");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str4 = response1.contentType();
        java.lang.String str5 = response1.statusMessage;
        java.lang.String str6 = response1.charset;
        response1.executed = false;
        java.lang.String str10 = response1.header("hi!");
        java.lang.String str11 = response1.charset();
        org.jsoup.Connection.Method method12 = response1.method();
        response1.charset = "hi!";
        java.lang.String str16 = response1.header("");
        response1.executed = true;
        response1.executed = false;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry22 = response1.scanHeaders("");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(method12);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(strEntry22);
    }

    @Test
    public void test24645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24645");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.util.Map<java.lang.String, java.lang.String> strMap4 = response1.headers();
        org.jsoup.Connection.Method method5 = response1.method();
        java.nio.ByteBuffer byteBuffer6 = null;
        response1.byteData = byteBuffer6;
        java.lang.String str8 = response1.statusMessage;
        int int9 = response1.statusCode;
        java.lang.String str10 = response1.statusMessage();
        boolean boolean12 = response1.hasHeader("hi!");
        response1.executed = false;
        boolean boolean15 = response1.executed;
        org.jsoup.Connection.Response response18 = response1.header("hi!", "");
        org.jsoup.Connection.Method method19 = response1.method();
        java.util.Map<java.lang.String, java.lang.String> strMap20 = response1.cookies();
        int int21 = response1.numRedirects;
        java.net.URL uRL22 = response1.url();
        response1.statusCode = (-1);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(response18);
        org.junit.Assert.assertNull(method19);
        org.junit.Assert.assertNotNull(strMap20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNull(uRL22);
    }

    @Test
    public void test24646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24646");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.util.Map<java.lang.String, java.lang.String> strMap4 = response1.headers();
        org.jsoup.Connection.Method method5 = response1.method();
        java.nio.ByteBuffer byteBuffer6 = null;
        response1.byteData = byteBuffer6;
        java.lang.String str9 = response1.getHeaderCaseInsensitive("hi!");
        java.lang.String str10 = response1.statusMessage();
        response1.statusCode = (short) 0;
        java.util.Map<java.lang.String, java.lang.String> strMap13 = response1.headers();
        org.jsoup.Connection.Method method14 = response1.method();
        org.jsoup.Connection.Request request15 = response1.req;
        java.util.Map<java.lang.String, java.lang.String> strMap16 = response1.cookies();
        int int17 = response1.statusCode();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response20 = response1.cookie("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertNull(method14);
        org.junit.Assert.assertNull(request15);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test24647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24647");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str4 = response1.contentType();
        response1.contentType = "";
        java.lang.String str7 = response1.contentType();
        java.lang.String str9 = response1.cookie("hi!");
        java.lang.String str10 = response1.contentType();
        boolean boolean13 = response1.hasHeaderWithValue("hi!", "hi!");
        java.lang.String str15 = response1.header("");
        org.jsoup.Connection.Response response17 = response1.removeCookie("hi!");
        int int18 = response1.statusCode;
        java.lang.String str19 = response1.charset();
        java.lang.String str20 = response1.statusMessage();
        java.lang.String str21 = response1.contentType();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(response17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test24648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24648");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.util.Map<java.lang.String, java.lang.String> strMap4 = response1.headers();
        org.jsoup.Connection.Method method5 = response1.method();
        int int6 = response1.statusCode();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry8 = response1.scanHeaders("hi!");
        response1.contentType = "";
        java.lang.String str12 = response1.cookie("hi!");
        org.jsoup.Connection.Response response15 = response1.cookie("hi!", "");
        java.nio.ByteBuffer byteBuffer16 = null;
        response1.byteData = byteBuffer16;
        response1.statusCode = (short) 100;
        java.net.URL uRL20 = response1.url();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry22 = response1.scanHeaders("");
        response1.statusMessage = "hi!";
        response1.contentType = "";
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(strEntry8);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertNull(uRL20);
        org.junit.Assert.assertNull(strEntry22);
    }

    @Test
    public void test24649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24649");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.numRedirects;
        org.jsoup.Connection.Request request3 = null;
        response1.req = request3;
        java.nio.ByteBuffer byteBuffer5 = response1.byteData;
        java.lang.String str6 = response1.charset();
        java.nio.ByteBuffer byteBuffer7 = null;
        response1.byteData = byteBuffer7;
        java.lang.String str9 = response1.charset;
        java.lang.String str10 = response1.contentType();
        org.jsoup.Connection.Response response12 = response1.removeCookie("hi!");
        java.lang.String str14 = response1.header("hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(byteBuffer5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test24650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24650");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        response2.statusMessage = "";
        java.util.Map<java.lang.String, java.lang.String> strMap5 = response2.headers();
        org.jsoup.Connection.Method method6 = response2.method();
        java.nio.ByteBuffer byteBuffer7 = null;
        response2.byteData = byteBuffer7;
        java.lang.String str10 = response2.getHeaderCaseInsensitive("hi!");
        java.lang.String str11 = response2.statusMessage();
        org.jsoup.Connection.Response response13 = response2.removeHeader("hi!");
        java.lang.String str14 = response2.charset();
        org.jsoup.Connection.Method method15 = response2.method();
        response2.statusCode = 20;
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response(response2);
        int int19 = response18.statusCode();
        response18.charset = "hi!";
        boolean boolean22 = response18.executed;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response23 = org.jsoup.helper.HttpConnection.Response.execute(request0, response18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test24651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24651");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str4 = response1.contentType();
        boolean boolean5 = response1.executed;
        org.jsoup.Connection.Response response7 = response1.removeCookie("hi!");
        java.lang.String str8 = response1.charset();
        org.jsoup.Connection.Method method9 = response1.method();
        response1.charset = "";
        java.lang.String str12 = response1.charset();
        java.net.URL uRL13 = response1.url();
        java.nio.ByteBuffer byteBuffer14 = null;
        response1.byteData = byteBuffer14;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry17 = response1.scanHeaders("");
        int int18 = response1.statusCode;
        response1.numRedirects = '#';
        response1.statusCode = (short) 10;
        java.nio.ByteBuffer byteBuffer23 = response1.byteData;
        response1.statusCode = 2;
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray26 = response1.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(uRL13);
        org.junit.Assert.assertNull(strEntry17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(byteBuffer23);
    }

    @Test
    public void test24652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24652");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str4 = response1.contentType();
        boolean boolean5 = response1.executed;
        org.jsoup.Connection.Response response7 = response1.removeCookie("hi!");
        java.lang.String str8 = response1.charset();
        org.jsoup.Connection.Method method9 = response1.method();
        response1.charset = "";
        java.lang.String str12 = response1.charset();
        java.net.URL uRL13 = response1.url();
        java.lang.String str14 = response1.charset;
        java.net.URL uRL15 = response1.url();
        java.lang.String str16 = response1.contentType();
        java.lang.String str18 = response1.getHeaderCaseInsensitive("hi!");
        java.lang.String str19 = response1.contentType();
        int int20 = response1.statusCode;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(uRL13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(uRL15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test24653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24653");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str4 = response1.contentType();
        java.lang.String str5 = response1.statusMessage;
        org.jsoup.Connection.Response response8 = response1.cookie("hi!", "");
        response1.contentType = "";
        java.net.URL uRL11 = response1.url();
        java.lang.String str13 = response1.getHeaderCaseInsensitive("hi!");
        java.lang.String str14 = response1.charset();
        int int15 = response1.statusCode();
        java.lang.String str16 = response1.contentType;
        java.lang.String str18 = response1.getHeaderCaseInsensitive("");
        java.lang.String str19 = response1.contentType;
        java.util.Map<java.lang.String, java.lang.String> strMap20 = response1.headers();
        boolean boolean22 = response1.hasCookie("hi!");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(strMap20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test24654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24654");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str4 = response1.contentType();
        boolean boolean5 = response1.executed;
        org.jsoup.Connection.Response response7 = response1.removeCookie("hi!");
        java.lang.String str8 = response1.charset();
        org.jsoup.Connection.Method method9 = response1.method();
        response1.charset = "";
        java.lang.String str12 = response1.charset();
        java.net.URL uRL13 = response1.url();
        java.lang.String str14 = response1.charset;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry16 = response1.scanHeaders("hi!");
        int int17 = response1.numRedirects;
        boolean boolean19 = response1.hasHeader("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap20 = response1.cookies();
        response1.contentType = "hi!";
        response1.numRedirects = (byte) 10;
        java.util.Map<java.lang.String, java.lang.String> strMap25 = response1.cookies();
        java.lang.String str26 = response1.statusMessage;
        response1.charset = "";
        org.jsoup.Connection.Response response30 = response1.removeCookie("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap31 = response1.headers();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(uRL13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(strEntry16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(strMap20);
        org.junit.Assert.assertNotNull(strMap25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(response30);
        org.junit.Assert.assertNotNull(strMap31);
    }

    @Test
    public void test24655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24655");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str2 = response1.contentType;
        java.lang.String str3 = response1.statusMessage();
        org.jsoup.Connection.Request request4 = null;
        response1.req = request4;
        int int6 = response1.numRedirects;
        java.util.Map<java.lang.String, java.lang.String> strMap7 = response1.cookies();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry9 = response1.scanHeaders("");
        java.lang.String str10 = response1.contentType();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = response1.hasCookie("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNull(strEntry9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test24656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24656");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str4 = response1.contentType();
        boolean boolean5 = response1.executed;
        org.jsoup.Connection.Response response7 = response1.removeCookie("hi!");
        java.lang.String str8 = response1.charset();
        org.jsoup.Connection.Method method9 = response1.method();
        boolean boolean11 = response1.hasHeader("hi!");
        boolean boolean13 = response1.hasHeader("hi!");
        response1.statusCode = 'a';
        java.util.Map<java.lang.String, java.lang.String> strMap16 = response1.headers();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strMap16);
    }

    @Test
    public void test24657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24657");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.util.Map<java.lang.String, java.lang.String> strMap4 = response1.headers();
        org.jsoup.Connection.Method method5 = response1.method();
        java.nio.ByteBuffer byteBuffer6 = null;
        response1.byteData = byteBuffer6;
        java.lang.String str9 = response1.getHeaderCaseInsensitive("hi!");
        java.lang.String str10 = response1.statusMessage();
        response1.statusCode = (short) 0;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry14 = response1.scanHeaders("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap15 = response1.cookies();
        java.nio.ByteBuffer byteBuffer16 = null;
        response1.byteData = byteBuffer16;
        int int18 = response1.statusCode();
        org.jsoup.Connection.Request request19 = null;
        response1.req = request19;
        java.lang.String str21 = response1.charset();
        boolean boolean22 = response1.executed;
        java.lang.String str23 = response1.charset();
        java.lang.String str25 = response1.getHeaderCaseInsensitive("hi!");
        java.nio.ByteBuffer byteBuffer26 = response1.byteData;
        java.lang.String str27 = response1.statusMessage();
        response1.numRedirects = (short) -1;
        java.lang.String str30 = response1.charset();
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(strEntry14);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(byteBuffer26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNull(str30);
    }

    @Test
    public void test24658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24658");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str4 = response1.contentType();
        boolean boolean5 = response1.executed;
        org.jsoup.Connection.Response response7 = response1.removeCookie("hi!");
        java.lang.String str8 = response1.charset();
        org.jsoup.Connection.Method method9 = response1.method();
        org.jsoup.Connection.Response response11 = response1.removeCookie("hi!");
        java.lang.String str12 = response1.statusMessage();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test24659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24659");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str4 = response1.contentType();
        boolean boolean5 = response1.executed;
        org.jsoup.Connection.Response response7 = response1.removeCookie("hi!");
        java.lang.String str8 = response1.charset();
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str10 = response1.charset;
        response1.statusMessage = "hi!";
        org.jsoup.Connection.Method method13 = response1.method();
        response1.executed = true;
        java.util.Map<java.lang.String, java.lang.String> strMap16 = response1.headers();
        response1.executed = false;
        boolean boolean21 = response1.hasHeaderWithValue("hi!", "");
        java.lang.String str22 = response1.contentType();
        java.lang.String str23 = response1.contentType;
        java.nio.ByteBuffer byteBuffer24 = response1.byteData;
        int int25 = response1.statusCode;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean27 = response1.hasCookie("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(method13);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(byteBuffer24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test24660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24660");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.util.Map<java.lang.String, java.lang.String> strMap4 = response1.headers();
        org.jsoup.Connection.Method method5 = response1.method();
        java.nio.ByteBuffer byteBuffer6 = null;
        response1.byteData = byteBuffer6;
        java.lang.String str9 = response1.getHeaderCaseInsensitive("hi!");
        java.lang.String str10 = response1.statusMessage();
        org.jsoup.Connection.Response response12 = response1.removeHeader("hi!");
        java.lang.String str13 = response1.charset();
        response1.statusCode = (short) 100;
        java.lang.String str16 = response1.statusMessage();
        response1.contentType = "";
        boolean boolean20 = response1.hasHeader("hi!");
        java.lang.String str21 = response1.statusMessage;
        org.jsoup.Connection.Request request22 = response1.req;
        int int23 = response1.numRedirects;
        java.lang.String str24 = response1.statusMessage();
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(request22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test24661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24661");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str4 = response1.contentType();
        boolean boolean5 = response1.executed;
        org.jsoup.Connection.Response response7 = response1.removeCookie("hi!");
        java.lang.String str8 = response1.charset();
        org.jsoup.Connection.Method method9 = response1.method();
        java.lang.String str10 = response1.statusMessage;
        org.jsoup.Connection.Request request11 = response1.req;
        response1.executed = true;
        org.jsoup.Connection.Response response15 = response1.removeCookie("hi!");
        org.jsoup.Connection.Response response18 = response1.cookie("hi!", "hi!");
        java.lang.String str20 = response1.header("");
        java.util.Map<java.lang.String, java.lang.String> strMap21 = response1.headers();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = response1.body();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(request11);
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertNotNull(response18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(strMap21);
    }

    @Test
    public void test24662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24662");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.util.Map<java.lang.String, java.lang.String> strMap4 = response1.headers();
        org.jsoup.Connection.Method method5 = response1.method();
        java.nio.ByteBuffer byteBuffer6 = null;
        response1.byteData = byteBuffer6;
        java.lang.String str8 = response1.statusMessage();
        boolean boolean9 = response1.executed;
        int int10 = response1.statusCode();
        java.nio.ByteBuffer byteBuffer11 = null;
        response1.byteData = byteBuffer11;
        org.jsoup.Connection.Response response14 = response1.removeHeader("hi!");
        boolean boolean16 = response1.hasHeader("hi!");
        org.jsoup.Connection.Request request17 = null;
        response1.req = request17;
        java.lang.String str19 = response1.contentType;
        java.nio.ByteBuffer byteBuffer20 = response1.byteData;
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(byteBuffer20);
    }

    @Test
    public void test24663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24663");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str4 = response1.contentType();
        boolean boolean5 = response1.executed;
        org.jsoup.Connection.Response response7 = response1.removeCookie("hi!");
        java.lang.String str8 = response1.charset();
        java.lang.String str9 = response1.statusMessage;
        java.lang.String str10 = response1.statusMessage();
        java.nio.ByteBuffer byteBuffer11 = null;
        response1.byteData = byteBuffer11;
        java.lang.String str13 = response1.statusMessage();
        org.jsoup.Connection.Request request14 = null;
        response1.req = request14;
        org.jsoup.Connection.Request request16 = response1.req;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(request16);
    }

    @Test
    public void test24664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24664");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str4 = response1.contentType();
        boolean boolean5 = response1.executed;
        org.jsoup.Connection.Response response7 = response1.removeCookie("hi!");
        java.lang.String str8 = response1.charset();
        org.jsoup.Connection.Method method9 = response1.method();
        response1.charset = "";
        java.lang.String str12 = response1.charset();
        java.net.URL uRL13 = response1.url();
        java.lang.String str14 = response1.charset;
        java.net.URL uRL15 = response1.url();
        java.lang.String str16 = response1.contentType();
        response1.statusCode = (byte) 10;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = response1.hasHeaderWithValue("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(uRL13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(uRL15);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test24665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24665");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.util.Map<java.lang.String, java.lang.String> strMap4 = response1.headers();
        org.jsoup.Connection.Method method5 = response1.method();
        java.util.Map<java.lang.String, java.lang.String> strMap6 = response1.cookies();
        java.lang.String str7 = response1.contentType();
        response1.numRedirects = (short) 0;
        response1.statusMessage = "hi!";
        int int12 = response1.statusCode;
        java.lang.String str13 = response1.contentType;
        java.lang.String str14 = response1.statusMessage;
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test24666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24666");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.util.Map<java.lang.String, java.lang.String> strMap4 = response1.headers();
        org.jsoup.Connection.Method method5 = response1.method();
        java.nio.ByteBuffer byteBuffer6 = null;
        response1.byteData = byteBuffer6;
        java.lang.String str9 = response1.getHeaderCaseInsensitive("hi!");
        java.lang.String str10 = response1.statusMessage();
        response1.statusCode = (short) 0;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry14 = response1.scanHeaders("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap15 = response1.cookies();
        int int16 = response1.numRedirects;
        java.lang.String str17 = response1.contentType();
        response1.numRedirects = 0;
        java.lang.String str20 = response1.contentType;
        boolean boolean22 = response1.hasCookie("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap23 = response1.headers();
        java.lang.String str24 = response1.statusMessage();
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(strEntry14);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(strMap23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test24667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24667");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.util.Map<java.lang.String, java.lang.String> strMap4 = response1.headers();
        org.jsoup.Connection.Method method5 = response1.method();
        java.nio.ByteBuffer byteBuffer6 = null;
        response1.byteData = byteBuffer6;
        java.lang.String str9 = response1.getHeaderCaseInsensitive("hi!");
        java.lang.String str10 = response1.statusMessage();
        response1.statusCode = (short) 0;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry14 = response1.scanHeaders("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap15 = response1.cookies();
        int int16 = response1.numRedirects;
        response1.executed = false;
        java.lang.String str20 = response1.header("hi!");
        int int21 = response1.numRedirects;
        boolean boolean23 = response1.hasCookie("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap24 = response1.headers();
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(strEntry14);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(strMap24);
    }

    @Test
    public void test24668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24668");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str4 = response1.contentType();
        boolean boolean5 = response1.executed;
        org.jsoup.Connection.Response response7 = response1.removeCookie("hi!");
        response1.numRedirects = 0;
        java.nio.ByteBuffer byteBuffer10 = response1.byteData;
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.util.Map<java.lang.String, java.lang.String> strMap12 = response11.headers();
        java.lang.String str13 = response11.contentType();
        java.lang.String str14 = response11.statusMessage;
        response11.charset = "";
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(byteBuffer10);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test24669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24669");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.util.Map<java.lang.String, java.lang.String> strMap4 = response1.headers();
        org.jsoup.Connection.Method method5 = response1.method();
        int int6 = response1.statusCode();
        response1.charset = "";
        java.nio.ByteBuffer byteBuffer9 = response1.byteData;
        java.lang.String str10 = response1.statusMessage();
        org.jsoup.Connection.Method method11 = response1.method();
        org.jsoup.Connection.Response response13 = response1.removeCookie("hi!");
        org.jsoup.Connection.Response response15 = response1.removeCookie("hi!");
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(byteBuffer9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(method11);
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertNotNull(response15);
    }

    @Test
    public void test24670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24670");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        response2.statusMessage = "";
        java.lang.String str5 = response2.contentType();
        boolean boolean6 = response2.executed;
        org.jsoup.Connection.Response response8 = response2.removeCookie("hi!");
        java.lang.String str9 = response2.charset();
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response2);
        java.lang.String str12 = response2.getHeaderCaseInsensitive("");
        java.lang.String str13 = response2.statusMessage;
        java.util.Map<java.lang.String, java.lang.String> strMap14 = response2.headers();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry16 = response2.scanHeaders("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response17 = org.jsoup.helper.HttpConnection.Response.execute(request0, response2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNull(strEntry16);
    }

    @Test
    public void test24671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24671");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        response2.statusMessage = "";
        java.lang.String str5 = response2.contentType();
        boolean boolean6 = response2.executed;
        org.jsoup.Connection.Response response8 = response2.removeCookie("hi!");
        java.lang.String str9 = response2.charset();
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response2);
        response2.contentType = "hi!";
        java.net.URL uRL13 = response2.url();
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response2);
        java.lang.String str15 = response2.contentType();
        java.lang.String str17 = response2.getHeaderCaseInsensitive("");
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response(response2);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response19 = org.jsoup.helper.HttpConnection.Response.execute(request0, response2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(uRL13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test24672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24672");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.util.Map<java.lang.String, java.lang.String> strMap4 = response1.headers();
        org.jsoup.Connection.Method method5 = response1.method();
        java.nio.ByteBuffer byteBuffer6 = null;
        response1.byteData = byteBuffer6;
        java.lang.String str9 = response1.getHeaderCaseInsensitive("hi!");
        java.lang.String str10 = response1.statusMessage();
        org.jsoup.Connection.Response response12 = response1.removeHeader("hi!");
        java.nio.ByteBuffer byteBuffer13 = response1.byteData;
        org.jsoup.Connection.Request request14 = null;
        response1.req = request14;
        int int16 = response1.statusCode();
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response1);
        response17.contentType = "hi!";
        org.jsoup.Connection.Response response22 = response17.cookie("hi!", "");
        response17.charset = "";
        java.lang.String str25 = response17.charset();
        boolean boolean28 = response17.hasHeaderWithValue("hi!", "");
        java.lang.String str29 = response17.charset();
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNull(byteBuffer13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(response22);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
    }

    @Test
    public void test24673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24673");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.util.Map<java.lang.String, java.lang.String> strMap4 = response1.headers();
        org.jsoup.Connection.Method method5 = response1.method();
        java.nio.ByteBuffer byteBuffer6 = null;
        response1.byteData = byteBuffer6;
        java.lang.String str8 = response1.statusMessage;
        int int9 = response1.statusCode;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry11 = response1.scanHeaders("hi!");
        response1.statusCode = (byte) 10;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry15 = response1.scanHeaders("hi!");
        int int16 = response1.statusCode();
        org.jsoup.Connection.Method method17 = response1.method();
        java.util.Map<java.lang.String, java.lang.String> strMap18 = response1.cookies();
        java.lang.String str19 = response1.charset();
        response1.statusCode = 52;
        java.lang.String str22 = response1.contentType;
        boolean boolean23 = response1.executed;
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(strEntry11);
        org.junit.Assert.assertNull(strEntry15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNull(method17);
        org.junit.Assert.assertNotNull(strMap18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test24674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24674");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.util.Map<java.lang.String, java.lang.String> strMap4 = response1.headers();
        org.jsoup.Connection.Method method5 = response1.method();
        java.nio.ByteBuffer byteBuffer6 = null;
        response1.byteData = byteBuffer6;
        java.lang.String str9 = response1.getHeaderCaseInsensitive("hi!");
        java.lang.String str10 = response1.statusMessage();
        org.jsoup.Connection.Response response12 = response1.removeHeader("hi!");
        java.nio.ByteBuffer byteBuffer13 = response1.byteData;
        org.jsoup.Connection.Request request14 = null;
        response1.req = request14;
        int int16 = response1.statusCode();
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response1);
        response17.statusCode = 10;
        response17.numRedirects = 10;
        java.lang.String str22 = response17.statusMessage();
        java.lang.String str23 = response17.contentType();
        java.lang.String str24 = response17.contentType();
        java.nio.ByteBuffer byteBuffer25 = null;
        response17.byteData = byteBuffer25;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry28 = response17.scanHeaders("");
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNull(byteBuffer13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(strEntry28);
    }

    @Test
    public void test24675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24675");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str4 = response1.contentType();
        boolean boolean5 = response1.executed;
        org.jsoup.Connection.Response response7 = response1.removeCookie("hi!");
        java.lang.String str8 = response1.charset();
        org.jsoup.Connection.Method method9 = response1.method();
        response1.charset = "";
        java.lang.String str12 = response1.charset();
        java.net.URL uRL13 = response1.url();
        java.lang.String str14 = response1.charset;
        java.net.URL uRL15 = response1.url();
        java.lang.String str17 = response1.cookie("hi!");
        response1.statusCode = (short) 0;
        org.jsoup.Connection.Request request20 = null;
        response1.req = request20;
        response1.charset = "hi!";
        java.nio.ByteBuffer byteBuffer24 = null;
        response1.byteData = byteBuffer24;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry27 = response1.scanHeaders("");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray28 = response1.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(uRL13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(uRL15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(strEntry27);
    }
}

