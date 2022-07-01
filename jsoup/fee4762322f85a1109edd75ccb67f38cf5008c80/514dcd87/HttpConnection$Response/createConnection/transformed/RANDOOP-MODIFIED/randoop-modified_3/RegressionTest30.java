import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest30 {

    public static boolean debug = false;

    @Test
    public void test15001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15001");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str5 = response1.statusMessage;
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.util.Map<java.lang.String, java.lang.String> strMap7 = response6.headers();
        java.lang.String str8 = response6.contentType();
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response6);
        java.lang.String str10 = response9.charset;
        response9.executed = true;
        response9.charset = "hi!";
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test15002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15002");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str2 = response1.contentType();
        java.lang.String str4 = response1.getHeaderCaseInsensitive("hi!");
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response1);
        response1.numRedirects = (short) 1;
        java.nio.ByteBuffer byteBuffer8 = null;
        response1.byteData = byteBuffer8;
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response10);
        int int12 = response10.numRedirects;
        int int13 = response10.numRedirects;
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response10);
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response10);
        org.jsoup.Connection.Request request16 = response15.req;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertNull(request16);
    }

    @Test
    public void test15003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15003");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response6 = response1.cookie("hi!", "");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry8 = response1.scanHeaders("hi!");
        java.lang.String str9 = response1.charset();
        java.lang.String str10 = response1.statusMessage();
        response1.charset = "";
        org.jsoup.Connection.Request request13 = response1.req;
        response1.statusCode = 503;
        java.net.URL uRL16 = response1.url();
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str18 = response1.statusMessage();
        boolean boolean19 = response1.executed;
        java.util.Map<java.lang.String, java.lang.String> strMap20 = response1.cookies();
        java.lang.String str21 = response1.statusMessage;
        int int22 = response1.statusCode();
        org.jsoup.helper.HttpConnection.Response response23 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNull(strEntry8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(request13);
        org.junit.Assert.assertNull(uRL16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(strMap20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 503 + "'", int22 == 503);
    }

    @Test
    public void test15004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15004");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response6 = response1.cookie("hi!", "");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry8 = response1.scanHeaders("hi!");
        java.lang.String str9 = response1.charset();
        java.lang.String str10 = response1.statusMessage();
        response1.charset = "";
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response1);
        response13.statusCode = 501;
        org.jsoup.Connection.Response response18 = response13.header("hi!", "");
        org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response(response13);
        org.jsoup.helper.HttpConnection.Response response20 = new org.jsoup.helper.HttpConnection.Response(response19);
        java.nio.ByteBuffer byteBuffer21 = null;
        response20.byteData = byteBuffer21;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNull(strEntry8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(response18);
    }

    @Test
    public void test15005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15005");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response6 = response1.cookie("hi!", "");
        int int7 = response1.numRedirects;
        java.lang.String str8 = response1.statusMessage();
        java.lang.String str9 = response1.contentType;
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.net.URL uRL11 = response1.url();
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response1);
        boolean boolean13 = response1.executed;
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test15006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15006");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        int int4 = response1.statusCode();
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str7 = response1.cookie("hi!");
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str10 = response9.statusMessage();
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response9);
        java.net.URL uRL12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response13 = response11.url(uRL12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test15007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15007");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str5 = response1.statusMessage;
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.util.Map<java.lang.String, java.lang.String> strMap7 = response6.headers();
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response6);
        int int9 = response8.statusCode();
        int int10 = response8.statusCode();
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response8);
        boolean boolean14 = response11.hasHeaderWithValue("hi!", "");
        int int15 = response11.statusCode;
        java.nio.ByteBuffer byteBuffer16 = response11.byteData;
        response11.contentType = "hi!";
        org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response(response11);
        java.lang.String str21 = response11.cookie("hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(byteBuffer16);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test15008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15008");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response4);
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response4);
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response4);
        java.util.Map<java.lang.String, java.lang.String> strMap8 = response7.cookies();
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response7);
        org.jsoup.Connection.Response response11 = response7.removeHeader("hi!");
        java.nio.ByteBuffer byteBuffer12 = null;
        response7.byteData = byteBuffer12;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(response11);
    }

    @Test
    public void test15009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15009");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        java.lang.String str4 = response1.contentType();
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response5);
        org.jsoup.Connection.Response response9 = response6.header("hi!", "");
        java.lang.String str11 = response6.getHeaderCaseInsensitive("hi!");
        response6.statusCode = 0;
        boolean boolean15 = response6.hasCookie("hi!");
        java.lang.String str16 = response6.contentType();
        java.nio.ByteBuffer byteBuffer17 = response6.byteData;
        java.lang.String str18 = response6.contentType();
        java.lang.String str19 = response6.contentType;
        org.jsoup.Connection.Request request20 = response6.req;
        org.jsoup.helper.HttpConnection.Response response21 = new org.jsoup.helper.HttpConnection.Response(response6);
        response6.charset = "hi!";
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(byteBuffer17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(request20);
    }

    @Test
    public void test15010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15010");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str2 = response1.contentType();
        java.lang.String str4 = response1.getHeaderCaseInsensitive("hi!");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry6 = response1.scanHeaders("");
        java.lang.String str8 = response1.getHeaderCaseInsensitive("");
        response1.statusCode = 400;
        org.jsoup.Connection.Method method11 = response1.method();
        java.net.URL uRL12 = response1.url();
        java.util.Map<java.lang.String, java.lang.String> strMap13 = response1.cookies();
        java.lang.String str14 = response1.statusMessage();
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = response1.hasHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(strEntry6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(method11);
        org.junit.Assert.assertNull(uRL12);
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test15011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15011");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        java.lang.String str4 = response1.contentType();
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response1);
        response5.statusMessage = "hi!";
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry9 = response5.scanHeaders("hi!");
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response5);
        org.jsoup.Connection.Request request11 = response10.req;
        response10.contentType = "hi!";
        java.lang.String str15 = response10.getHeaderCaseInsensitive("");
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response10);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(strEntry9);
        org.junit.Assert.assertNull(request11);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test15012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15012");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response6 = response1.cookie("hi!", "");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry8 = response1.scanHeaders("hi!");
        java.lang.String str9 = response1.charset();
        java.lang.String str10 = response1.statusMessage();
        response1.charset = "";
        java.lang.String str14 = response1.getHeaderCaseInsensitive("hi!");
        boolean boolean15 = response1.executed;
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response1);
        response16.contentType = "";
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNull(strEntry8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test15013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15013");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response6 = response1.cookie("hi!", "");
        response1.contentType = "";
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Request request10 = null;
        response9.req = request10;
        int int12 = response9.statusCode();
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response9);
        int int14 = response9.statusCode;
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response9);
        response9.statusMessage = "";
        response9.charset = "hi!";
        org.jsoup.helper.HttpConnection.Response response20 = new org.jsoup.helper.HttpConnection.Response(response9);
        response9.statusCode = 501;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test15014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15014");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.nio.ByteBuffer byteBuffer5 = null;
        response4.byteData = byteBuffer5;
        response4.statusMessage = "";
        java.util.Map<java.lang.String, java.lang.String> strMap9 = response4.cookies();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(strMap9);
    }

    @Test
    public void test15015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15015");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response6 = response1.cookie("hi!", "");
        int int7 = response1.numRedirects;
        java.lang.String str9 = response1.header("");
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = response1.hasHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test15016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15016");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response6 = response1.cookie("hi!", "");
        response1.contentType = "";
        boolean boolean11 = response1.hasHeaderWithValue("hi!", "");
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.nio.ByteBuffer byteBuffer13 = response12.byteData;
        java.util.Map<java.lang.String, java.lang.String> strMap14 = response12.headers();
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response12);
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response15);
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response16);
        java.lang.String str18 = response17.contentType;
        org.jsoup.Connection.Method method19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response20 = response17.method(method19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(byteBuffer13);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test15017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15017");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response6 = response1.cookie("hi!", "");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry8 = response1.scanHeaders("hi!");
        java.lang.String str10 = response1.header("");
        java.lang.String str11 = response1.contentType();
        int int12 = response1.statusCode();
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response14);
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response14);
        java.lang.String str17 = response14.contentType;
        java.lang.String str18 = response14.charset;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNull(strEntry8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test15018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15018");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str2 = response1.contentType();
        java.lang.String str4 = response1.getHeaderCaseInsensitive("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap5 = response1.cookies();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response1);
        response6.charset = "hi!";
        java.nio.ByteBuffer byteBuffer9 = response6.byteData;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = response6.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNull(byteBuffer9);
    }

    @Test
    public void test15019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15019");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response6 = response1.cookie("hi!", "");
        response1.contentType = "";
        boolean boolean11 = response1.hasHeaderWithValue("hi!", "");
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response12);
        java.lang.String str14 = response13.contentType;
        int int15 = response13.statusCode;
        java.util.Map<java.lang.String, java.lang.String> strMap16 = response13.cookies();
        java.lang.String str18 = response13.getHeaderCaseInsensitive("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test15020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15020");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response4);
        org.jsoup.Connection.Request request6 = null;
        response5.req = request6;
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response5);
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response5);
        org.jsoup.Connection.Request request10 = null;
        response9.req = request10;
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response9);
        java.net.URL uRL13 = response12.url();
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response12);
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response12);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(uRL13);
    }

    @Test
    public void test15021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15021");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Method method2 = response1.method();
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response1);
        int int4 = response3.statusCode;
        int int5 = response3.numRedirects;
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response3);
        java.net.URL uRL7 = response3.url();
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response3);
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry10 = response8.scanHeaders("");
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(uRL7);
        org.junit.Assert.assertNull(strEntry10);
    }

    @Test
    public void test15022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15022");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean2 = response1.executed;
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response3);
        response3.contentType = "hi!";
        int int7 = response3.statusCode();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document8 = response3.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test15023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15023");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response6 = response1.cookie("hi!", "");
        response1.contentType = "";
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Request request10 = null;
        response9.req = request10;
        int int12 = response9.statusCode();
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response9);
        response9.statusMessage = "hi!";
        java.net.URL uRL16 = response9.url();
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response9);
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response(response17);
        java.util.Map<java.lang.String, java.lang.String> strMap19 = response17.cookies();
        org.jsoup.helper.HttpConnection.Response response20 = new org.jsoup.helper.HttpConnection.Response(response17);
        org.jsoup.Connection.Request request21 = null;
        response20.req = request21;
        org.jsoup.helper.HttpConnection.Response response23 = new org.jsoup.helper.HttpConnection.Response(response20);
        java.lang.String str25 = response20.getHeaderCaseInsensitive("hi!");
        org.jsoup.helper.HttpConnection.Response response26 = new org.jsoup.helper.HttpConnection.Response(response20);
        org.jsoup.helper.HttpConnection.Response response27 = new org.jsoup.helper.HttpConnection.Response(response26);
        org.jsoup.helper.HttpConnection.Response response28 = new org.jsoup.helper.HttpConnection.Response(response26);
        java.lang.String str30 = response26.getHeaderCaseInsensitive("hi!");
        java.lang.String str31 = response26.charset;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(uRL16);
        org.junit.Assert.assertNotNull(strMap19);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNull(str31);
    }

    @Test
    public void test15024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15024");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response6 = response1.cookie("hi!", "");
        response1.contentType = "";
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Request request10 = null;
        response9.req = request10;
        int int12 = response9.statusCode();
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response9);
        int int14 = response9.statusCode;
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response9);
        java.util.Map<java.lang.String, java.lang.String> strMap16 = response15.cookies();
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response15);
        int int18 = response17.statusCode;
        java.lang.String str19 = response17.statusMessage();
        java.lang.String str20 = response17.statusMessage();
        java.net.HttpURLConnection httpURLConnection21 = null;
        org.jsoup.Connection.Response response22 = null;
        // The following exception was thrown during execution in test generation
        try {
            response17.setupFromConnection(httpURLConnection21, response22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test15025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15025");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response4);
        java.lang.String str6 = response5.charset();
        response5.statusCode = '4';
        java.lang.String str9 = response5.charset;
        java.net.HttpURLConnection httpURLConnection10 = null;
        org.jsoup.helper.HttpConnection.Response response11 = null;
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response11);
        java.lang.String str14 = response12.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response17 = response12.cookie("hi!", "");
        int int18 = response12.numRedirects;
        org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response(response12);
        response19.executed = false;
        java.lang.String str22 = response19.contentType();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry24 = response19.scanHeaders("");
        org.jsoup.helper.HttpConnection.Response response25 = new org.jsoup.helper.HttpConnection.Response(response19);
        response19.statusMessage = "";
        response19.statusMessage = "";
        // The following exception was thrown during execution in test generation
        try {
            response5.setupFromConnection(httpURLConnection10, (org.jsoup.Connection.Response) response19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(response17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(strEntry24);
    }

    @Test
    public void test15026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15026");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response6 = response1.cookie("hi!", "");
        int int7 = response1.numRedirects;
        java.lang.String str8 = response1.statusMessage();
        org.jsoup.Connection.Method method9 = response1.method();
        boolean boolean10 = response1.executed;
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Response response15 = response1.header("hi!", "hi!");
        java.lang.String str16 = response1.statusMessage();
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray17 = response1.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test15027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15027");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str5 = response4.statusMessage();
        java.net.URL uRL6 = response4.url();
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response4);
        java.net.URL uRL8 = response7.url();
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response7);
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response7);
        org.jsoup.Connection.Response response13 = response10.cookie("hi!", "");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(uRL8);
        org.junit.Assert.assertNotNull(response13);
    }

    @Test
    public void test15028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15028");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response4);
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response5);
        response5.statusCode = 501;
        org.jsoup.Connection.Response response11 = response5.cookie("hi!", "");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response11);
    }

    @Test
    public void test15029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15029");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        java.lang.String str4 = response1.contentType();
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response1);
        response5.contentType = "";
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response5);
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response8);
        java.lang.String str10 = response9.charset();
        org.jsoup.Connection.Response response13 = response9.header("hi!", "");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document14 = response9.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(response13);
    }

    @Test
    public void test15030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15030");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response6 = response1.cookie("hi!", "");
        int int7 = response1.numRedirects;
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response8);
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response9);
        java.lang.String str11 = response10.statusMessage();
        java.util.Map<java.lang.String, java.lang.String> strMap12 = response10.cookies();
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response10);
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response13);
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response13);
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response13);
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response16);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(strMap12);
    }

    @Test
    public void test15031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15031");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean2 = response1.executed;
        java.util.Map<java.lang.String, java.lang.String> strMap3 = response1.headers();
        java.lang.String str4 = response1.charset();
        org.jsoup.Connection.Request request5 = response1.req;
        int int6 = response1.numRedirects;
        org.jsoup.Connection.Request request7 = null;
        response1.req = request7;
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.nio.ByteBuffer byteBuffer11 = response1.byteData;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(request5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
    }

    @Test
    public void test15032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15032");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str5 = response1.statusMessage;
        response1.executed = false;
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response1);
        boolean boolean10 = response1.executed;
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response1);
        int int13 = response1.numRedirects;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test15033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15033");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response6 = response1.cookie("hi!", "");
        response1.contentType = "";
        boolean boolean11 = response1.hasHeaderWithValue("hi!", "");
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response12);
        java.lang.String str14 = response13.contentType;
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response13);
        org.jsoup.Connection.Method method16 = response13.method();
        boolean boolean18 = response13.hasCookie("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response20 = response13.removeHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(method16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test15034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15034");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response6 = response1.cookie("hi!", "");
        response1.contentType = "";
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Request request10 = null;
        response9.req = request10;
        int int12 = response9.statusCode();
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response9);
        int int14 = response9.statusCode;
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response9);
        java.util.Map<java.lang.String, java.lang.String> strMap16 = response15.cookies();
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response15);
        response17.charset = "";
        org.jsoup.helper.HttpConnection.Response response20 = new org.jsoup.helper.HttpConnection.Response(response17);
        org.jsoup.helper.HttpConnection.Response response21 = new org.jsoup.helper.HttpConnection.Response(response17);
        boolean boolean24 = response21.hasHeaderWithValue("hi!", "hi!");
        java.lang.String str25 = response21.statusMessage;
        java.lang.String str27 = response21.cookie("hi!");
        org.jsoup.helper.HttpConnection.Response response28 = new org.jsoup.helper.HttpConnection.Response(response21);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str27);
    }

    @Test
    public void test15035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15035");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response6 = response1.cookie("hi!", "");
        response1.contentType = "";
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response9);
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response9);
        response9.statusMessage = "";
        java.util.Map<java.lang.String, java.lang.String> strMap14 = response9.headers();
        org.jsoup.Connection.Request request15 = null;
        response9.req = request15;
        int int17 = response9.statusCode;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test15036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15036");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response6 = response1.cookie("hi!", "");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry8 = response1.scanHeaders("hi!");
        java.lang.String str9 = response1.charset();
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str14 = response12.cookie("hi!");
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response12);
        org.jsoup.Connection.Method method16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response17 = response15.method(method16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNull(strEntry8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test15037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15037");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response6 = response1.cookie("hi!", "");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry8 = response1.scanHeaders("hi!");
        java.lang.String str9 = response1.charset();
        java.lang.String str10 = response1.statusMessage();
        response1.charset = "";
        org.jsoup.Connection.Request request13 = response1.req;
        int int14 = response1.statusCode();
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response1);
        response1.statusMessage = "hi!";
        java.lang.String str18 = response1.statusMessage;
        java.nio.ByteBuffer byteBuffer19 = null;
        response1.byteData = byteBuffer19;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = response1.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNull(strEntry8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(request13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test15038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15038");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str2 = response1.contentType();
        java.lang.String str4 = response1.getHeaderCaseInsensitive("hi!");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry6 = response1.scanHeaders("");
        boolean boolean9 = response1.hasHeaderWithValue("hi!", "hi!");
        java.lang.String str10 = response1.charset;
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response1);
        boolean boolean12 = response1.executed;
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response13);
        response13.numRedirects = 415;
        org.jsoup.Connection.Response response18 = response13.removeCookie("hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(strEntry6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(response18);
    }

    @Test
    public void test15039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15039");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response6 = response1.cookie("hi!", "");
        java.util.Map<java.lang.String, java.lang.String> strMap7 = response1.headers();
        java.lang.String str8 = response1.statusMessage();
        boolean boolean11 = response1.hasHeaderWithValue("hi!", "");
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str13 = response12.statusMessage();
        java.lang.String str14 = response12.contentType();
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response12);
        java.net.URL uRL16 = response12.url();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(uRL16);
    }

    @Test
    public void test15040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15040");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str5 = response1.statusMessage;
        response1.executed = false;
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response1);
        response1.statusCode = 205;
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response12);
        int int14 = response13.statusCode;
        boolean boolean16 = response13.hasCookie("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = response13.cookie("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test15041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15041");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean2 = response1.executed;
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response3);
        org.jsoup.Connection.Response response6 = response4.removeCookie("hi!");
        org.jsoup.Connection.Response response8 = response4.removeCookie("hi!");
        org.jsoup.Connection.Response response10 = response4.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response4);
        boolean boolean13 = response4.hasHeader("hi!");
        response4.statusMessage = "hi!";
        response4.statusCode = 502;
        java.lang.String str18 = response4.contentType;
        java.lang.String str19 = response4.contentType;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = response4.hasCookie("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test15042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15042");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        java.lang.String str4 = response1.contentType();
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Request request6 = null;
        response1.req = request6;
        org.jsoup.Connection.Request request8 = null;
        response1.req = request8;
        response1.contentType = "";
        response1.executed = true;
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry16 = response14.scanHeaders("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response19 = response14.header("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(strEntry16);
    }

    @Test
    public void test15043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15043");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response4);
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response4);
        org.jsoup.Connection.Method method7 = response4.method();
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response4);
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response4);
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response4);
        org.jsoup.Connection.Response response13 = response10.cookie("hi!", "");
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response10);
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = response15.cookie("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNotNull(response13);
    }

    @Test
    public void test15044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15044");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str2 = response1.contentType();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry4 = response1.scanHeaders("");
        java.lang.String str5 = response1.charset();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response6);
        java.net.URL uRL8 = response7.url();
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response7);
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response7);
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response7);
        java.lang.String str12 = response7.charset;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(strEntry4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(uRL8);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test15045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15045");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response6 = response1.cookie("hi!", "");
        response1.contentType = "";
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Request request10 = null;
        response9.req = request10;
        int int12 = response9.statusCode();
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response9);
        int int14 = response9.statusCode;
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response9);
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response9);
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response16);
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response(response16);
        org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response(response16);
        response16.numRedirects = 302;
        java.lang.String str23 = response16.getHeaderCaseInsensitive("");
        int int24 = response16.statusCode();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response25 = new org.jsoup.helper.HttpConnection.Response(response16);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Too many redirects occurred trying to load URL null");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test15046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15046");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response6 = response1.cookie("hi!", "");
        response1.contentType = "";
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Request request10 = null;
        response9.req = request10;
        int int12 = response9.statusCode();
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response9);
        response9.statusMessage = "hi!";
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response9);
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response9);
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response(response9);
        org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response(response9);
        org.jsoup.helper.HttpConnection.Response response20 = new org.jsoup.helper.HttpConnection.Response(response9);
        int int21 = response20.statusCode();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test15047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15047");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str2 = response1.contentType();
        java.lang.String str4 = response1.getHeaderCaseInsensitive("hi!");
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response1);
        response1.numRedirects = (short) 1;
        java.nio.ByteBuffer byteBuffer8 = null;
        response1.byteData = byteBuffer8;
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response10);
        java.lang.String str12 = response11.charset();
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response11);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response16 = response13.cookie("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test15048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15048");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response6 = response1.cookie("hi!", "");
        response1.contentType = "";
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Request request10 = null;
        response9.req = request10;
        int int12 = response9.statusCode();
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response9);
        response9.statusMessage = "hi!";
        java.net.URL uRL16 = response9.url();
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response9);
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response(response17);
        java.util.Map<java.lang.String, java.lang.String> strMap19 = response17.cookies();
        boolean boolean22 = response17.hasHeaderWithValue("hi!", "hi!");
        response17.statusMessage = "hi!";
        response17.statusCode = 100;
        java.nio.ByteBuffer byteBuffer27 = response17.byteData;
        org.jsoup.helper.HttpConnection.Response response28 = new org.jsoup.helper.HttpConnection.Response(response17);
        java.lang.String str29 = response17.charset();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document30 = response17.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(uRL16);
        org.junit.Assert.assertNotNull(strMap19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(byteBuffer27);
        org.junit.Assert.assertNull(str29);
    }

    @Test
    public void test15049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15049");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        java.lang.String str4 = response1.contentType();
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Request request6 = null;
        response1.req = request6;
        org.jsoup.Connection.Request request8 = null;
        response1.req = request8;
        java.lang.String str10 = response1.statusMessage();
        response1.numRedirects = (-1);
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str14 = response13.statusMessage();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry16 = response13.scanHeaders("hi!");
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response13);
        java.lang.String str18 = response13.contentType();
        org.jsoup.Connection.Request request19 = null;
        response13.req = request19;
        org.jsoup.helper.HttpConnection.Response response21 = new org.jsoup.helper.HttpConnection.Response(response13);
        int int22 = response13.statusCode();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(strEntry16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test15050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15050");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        java.lang.String str4 = response1.contentType();
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response1);
        response5.charset = "";
        java.util.Map<java.lang.String, java.lang.String> strMap8 = response5.cookies();
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response5);
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response9);
        boolean boolean11 = response10.executed;
        java.nio.ByteBuffer byteBuffer12 = response10.byteData;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(byteBuffer12);
    }

    @Test
    public void test15051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15051");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        java.lang.String str4 = response1.contentType();
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Request request6 = null;
        response1.req = request6;
        org.jsoup.Connection.Request request8 = null;
        response1.req = request8;
        java.lang.String str10 = response1.statusMessage();
        response1.numRedirects = (-1);
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Method method14 = response1.method();
        response1.numRedirects = 100;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response1);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Too many redirects occurred trying to load URL null");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(method14);
    }

    @Test
    public void test15052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15052");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response1);
        response1.statusMessage = "hi!";
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test15053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15053");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response4);
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response4);
        org.jsoup.Connection.Method method7 = response4.method();
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response4);
        java.lang.String str9 = response8.charset();
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response8);
        boolean boolean12 = response8.hasHeader("hi!");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry14 = response8.scanHeaders("hi!");
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response8);
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response15);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document17 = response15.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(strEntry14);
    }

    @Test
    public void test15054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15054");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response1);
        int int5 = response1.numRedirects;
        response1.charset = "hi!";
        java.nio.ByteBuffer byteBuffer8 = null;
        response1.byteData = byteBuffer8;
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response11);
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response12);
        boolean boolean15 = response12.hasCookie("hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test15055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15055");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response4);
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response4);
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response4);
        java.util.Map<java.lang.String, java.lang.String> strMap8 = response7.cookies();
        java.lang.String str9 = response7.contentType();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test15056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15056");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str2 = response1.contentType();
        java.lang.String str4 = response1.getHeaderCaseInsensitive("hi!");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry6 = response1.scanHeaders("");
        java.lang.String str8 = response1.getHeaderCaseInsensitive("");
        response1.statusCode = 400;
        org.jsoup.Connection.Method method11 = response1.method();
        java.net.URL uRL12 = response1.url();
        java.util.Map<java.lang.String, java.lang.String> strMap13 = response1.cookies();
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response14);
        org.jsoup.Connection.Request request16 = response14.req;
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray17 = response14.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(strEntry6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(method11);
        org.junit.Assert.assertNull(uRL12);
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertNull(request16);
    }

    @Test
    public void test15057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15057");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response6 = response1.cookie("hi!", "");
        response1.contentType = "";
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Request request10 = null;
        response9.req = request10;
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response9);
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response12);
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response12);
        int int15 = response14.statusCode;
        java.lang.String str16 = response14.charset;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test15058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15058");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response6 = response1.cookie("hi!", "");
        response1.contentType = "";
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Request request10 = null;
        response9.req = request10;
        int int12 = response9.statusCode();
        java.lang.String str13 = response9.contentType();
        java.lang.String str15 = response9.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Method method16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response17 = response9.method(method16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test15059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15059");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response6 = response1.cookie("hi!", "");
        response1.contentType = "";
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Request request10 = null;
        response9.req = request10;
        int int12 = response9.statusCode();
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response9);
        response9.statusMessage = "hi!";
        java.net.URL uRL16 = response9.url();
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response9);
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response(response17);
        java.util.Map<java.lang.String, java.lang.String> strMap19 = response17.cookies();
        org.jsoup.helper.HttpConnection.Response response20 = new org.jsoup.helper.HttpConnection.Response(response17);
        java.net.URL uRL21 = response20.url();
        org.jsoup.helper.HttpConnection.Response response22 = new org.jsoup.helper.HttpConnection.Response(response20);
        java.lang.String str23 = response20.statusMessage();
        response20.statusMessage = "";
        java.lang.String str27 = response20.getHeaderCaseInsensitive("");
        response20.charset = "";
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(uRL16);
        org.junit.Assert.assertNotNull(strMap19);
        org.junit.Assert.assertNull(uRL21);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str27);
    }

    @Test
    public void test15060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15060");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        java.lang.String str4 = response1.contentType();
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response1);
        response5.statusMessage = "hi!";
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response5);
        response8.contentType = "hi!";
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response8);
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response11);
        int int13 = response11.numRedirects;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
    }

    @Test
    public void test15061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15061");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map<java.lang.String, java.lang.String> strMap2 = response1.cookies();
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response4);
        java.util.Map<java.lang.String, java.lang.String> strMap6 = response5.headers();
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response5);
        boolean boolean8 = response7.executed;
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response7);
        int int10 = response9.numRedirects;
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response9);
        int int12 = response11.numRedirects;
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response11);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
    }

    @Test
    public void test15062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15062");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean2 = response1.executed;
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str6 = response1.header("hi!");
        boolean boolean7 = response1.executed;
        java.lang.String str9 = response1.getHeaderCaseInsensitive("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test15063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15063");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str5 = response1.statusMessage;
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.util.Map<java.lang.String, java.lang.String> strMap7 = response6.headers();
        java.lang.String str8 = response6.statusMessage;
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response6);
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response6);
        java.nio.ByteBuffer byteBuffer11 = response6.byteData;
        org.jsoup.Connection.Request request12 = null;
        response6.req = request12;
        java.lang.String str14 = response6.statusMessage();
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response6);
        java.lang.String str16 = response15.charset;
        org.jsoup.Connection.Request request17 = response15.req;
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response(response15);
        java.lang.String str19 = response15.contentType;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(request17);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test15064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15064");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response4);
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response5);
        org.jsoup.Connection.Request request7 = null;
        response6.req = request7;
        response6.contentType = "";
        boolean boolean11 = response6.executed;
        java.net.URL uRL12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response13 = response6.url(uRL12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test15065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15065");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str5 = response4.statusMessage();
        java.net.URL uRL6 = response4.url();
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response4);
        java.nio.ByteBuffer byteBuffer8 = response7.byteData;
        response7.charset = "hi!";
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response7);
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response11);
        org.jsoup.Connection.Method method13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response14 = response12.method(method13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(byteBuffer8);
    }

    @Test
    public void test15066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15066");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        java.lang.String str4 = response1.contentType();
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Request request6 = null;
        response1.req = request6;
        org.jsoup.Connection.Request request8 = null;
        response1.req = request8;
        java.lang.String str10 = response1.statusMessage();
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response11);
        response12.contentType = "hi!";
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test15067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15067");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response4);
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response5);
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response6);
        java.nio.ByteBuffer byteBuffer8 = null;
        response6.byteData = byteBuffer8;
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response6);
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response10);
        java.nio.ByteBuffer byteBuffer12 = null;
        response10.byteData = byteBuffer12;
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response10);
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response14);
        java.lang.String str16 = response14.statusMessage;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test15068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15068");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        java.lang.String str4 = response1.contentType();
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Request request6 = null;
        response1.req = request6;
        org.jsoup.Connection.Request request8 = null;
        response1.req = request8;
        java.lang.String str10 = response1.statusMessage();
        response1.numRedirects = (-1);
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str14 = response13.statusMessage();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry16 = response13.scanHeaders("hi!");
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response13);
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry19 = response17.scanHeaders("hi!");
        boolean boolean20 = response17.executed;
        java.net.URL uRL21 = response17.url();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(strEntry16);
        org.junit.Assert.assertNull(strEntry19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(uRL21);
    }

    @Test
    public void test15069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15069");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response6 = response1.cookie("hi!", "");
        response1.contentType = "";
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Request request10 = null;
        response9.req = request10;
        int int12 = response9.statusCode();
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response9);
        response9.statusMessage = "hi!";
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response9);
        java.lang.String str18 = response16.cookie("hi!");
        org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response(response16);
        org.jsoup.helper.HttpConnection.Response response20 = new org.jsoup.helper.HttpConnection.Response(response16);
        org.jsoup.Connection.Method method21 = response16.method();
        java.lang.String str22 = response16.contentType();
        java.lang.String str23 = response16.statusMessage;
        org.jsoup.Connection.Method method24 = response16.method();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(method21);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(method24);
    }

    @Test
    public void test15070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15070");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str4 = response2.getHeaderCaseInsensitive("");
        java.lang.String str5 = response2.contentType();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response2);
        response6.statusMessage = "hi!";
        int int9 = response6.statusCode();
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response6);
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response6);
        java.lang.String str13 = response11.header("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response14 = org.jsoup.helper.HttpConnection.Response.execute(request0, response11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test15071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15071");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response6 = response1.cookie("hi!", "");
        response1.contentType = "";
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Request request10 = null;
        response9.req = request10;
        int int12 = response9.statusCode();
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response9);
        int int14 = response9.statusCode;
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response9);
        java.util.Map<java.lang.String, java.lang.String> strMap16 = response15.cookies();
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response15);
        response17.charset = "";
        org.jsoup.helper.HttpConnection.Response response20 = new org.jsoup.helper.HttpConnection.Response(response17);
        org.jsoup.helper.HttpConnection.Response response21 = new org.jsoup.helper.HttpConnection.Response(response17);
        org.jsoup.Connection.Response response24 = response21.cookie("hi!", "");
        org.jsoup.helper.HttpConnection.Response response25 = new org.jsoup.helper.HttpConnection.Response(response21);
        java.lang.String str26 = response25.charset;
        org.jsoup.helper.HttpConnection.Response response27 = new org.jsoup.helper.HttpConnection.Response(response25);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response30 = response27.cookie("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertNotNull(response24);
        org.junit.Assert.assertNull(str26);
    }

    @Test
    public void test15072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15072");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map<java.lang.String, java.lang.String> strMap2 = response1.cookies();
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response4);
        java.util.Map<java.lang.String, java.lang.String> strMap6 = response5.headers();
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response5);
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response5);
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response8);
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response8);
        org.jsoup.Connection.Response response13 = response8.header("hi!", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = response8.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(response13);
    }

    @Test
    public void test15073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15073");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response6 = response1.cookie("hi!", "");
        int int7 = response1.numRedirects;
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str11 = response1.statusMessage();
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response1);
        boolean boolean16 = response1.hasHeader("hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test15074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15074");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.util.Map<java.lang.String, java.lang.String> strMap5 = response4.headers();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response4);
        int int7 = response4.numRedirects;
        java.nio.ByteBuffer byteBuffer8 = response4.byteData;
        java.util.Map<java.lang.String, java.lang.String> strMap9 = response4.cookies();
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response4);
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response4);
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response11);
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response12);
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response12);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(byteBuffer8);
        org.junit.Assert.assertNotNull(strMap9);
    }

    @Test
    public void test15075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15075");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response6 = response1.cookie("hi!", "");
        int int7 = response1.numRedirects;
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response8);
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response9);
        java.lang.String str11 = response9.statusMessage();
        org.jsoup.Connection.Response response13 = response9.removeCookie("hi!");
        java.net.URL uRL14 = response9.url();
        int int15 = response9.statusCode;
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response9);
        response9.contentType = "";
        org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response(response9);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertNull(uRL14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test15076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15076");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map<java.lang.String, java.lang.String> strMap2 = response1.cookies();
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str4 = response1.charset;
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        java.lang.String str8 = response1.header("");
        int int9 = response1.statusCode();
        org.jsoup.Connection.Request request10 = null;
        response1.req = request10;
        response1.statusCode = 411;
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.nio.ByteBuffer byteBuffer15 = response14.byteData;
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response14);
        response16.statusMessage = "";
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(byteBuffer15);
    }

    @Test
    public void test15077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15077");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response6 = response1.cookie("hi!", "");
        response1.contentType = "";
        boolean boolean11 = response1.hasHeaderWithValue("hi!", "");
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response12);
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response13);
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response13);
        org.jsoup.Connection.Request request16 = null;
        response13.req = request16;
        response13.numRedirects = 505;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test15078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15078");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response6 = response1.cookie("hi!", "");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry8 = response1.scanHeaders("hi!");
        java.lang.String str9 = response1.charset();
        java.lang.String str10 = response1.statusMessage();
        response1.charset = "";
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response1);
        boolean boolean14 = response1.executed;
        boolean boolean15 = response1.executed;
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response16);
        response17.charset = "hi!";
        java.nio.ByteBuffer byteBuffer20 = response17.byteData;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNull(strEntry8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(byteBuffer20);
    }

    @Test
    public void test15079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15079");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str2 = response1.contentType();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry4 = response1.scanHeaders("");
        java.lang.String str5 = response1.charset();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response6);
        java.net.URL uRL8 = response7.url();
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response7);
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response7);
        org.jsoup.Connection.Response response13 = response7.header("hi!", "");
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response7);
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response7);
        java.util.Map<java.lang.String, java.lang.String> strMap16 = response7.cookies();
        java.lang.String str18 = response7.header("hi!");
        org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response(response7);
        org.jsoup.helper.HttpConnection.Response response20 = new org.jsoup.helper.HttpConnection.Response(response7);
        java.lang.String str22 = response20.getHeaderCaseInsensitive("hi!");
        org.jsoup.helper.HttpConnection.Response response23 = new org.jsoup.helper.HttpConnection.Response(response20);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(strEntry4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(uRL8);
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test15080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15080");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean2 = response1.executed;
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response3);
        java.lang.String str5 = response4.contentType;
        org.jsoup.Connection.Request request6 = response4.req;
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response4);
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response7);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = response7.hasHeaderWithValue("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(request6);
    }

    @Test
    public void test15081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15081");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map<java.lang.String, java.lang.String> strMap2 = response1.cookies();
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response4);
        java.util.Map<java.lang.String, java.lang.String> strMap6 = response5.headers();
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response5);
        int int8 = response5.numRedirects;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry10 = response5.scanHeaders("");
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response5);
        response5.executed = false;
        org.jsoup.Connection.Response response15 = response5.removeCookie("hi!");
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertNull(strEntry10);
        org.junit.Assert.assertNotNull(response15);
    }

    @Test
    public void test15082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15082");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str5 = response1.statusMessage;
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.util.Map<java.lang.String, java.lang.String> strMap7 = response6.headers();
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response6);
        int int9 = response8.statusCode();
        int int10 = response8.statusCode();
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response8);
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response8);
        org.jsoup.Connection.Method method13 = response8.method();
        org.jsoup.Connection.Method method14 = response8.method();
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response8);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(method13);
        org.junit.Assert.assertNull(method14);
    }

    @Test
    public void test15083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15083");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response6 = response1.cookie("hi!", "");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry8 = response1.scanHeaders("hi!");
        java.lang.String str9 = response1.charset();
        java.lang.String str10 = response1.statusMessage();
        response1.statusMessage = "";
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response13);
        org.jsoup.Connection.Request request15 = null;
        response14.req = request15;
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response14);
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response(response17);
        java.lang.String str19 = response17.contentType;
        boolean boolean20 = response17.executed;
        response17.charset = "";
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNull(strEntry8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test15084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15084");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str5 = response1.statusMessage;
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.util.Map<java.lang.String, java.lang.String> strMap7 = response6.headers();
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response6);
        int int9 = response8.statusCode();
        java.nio.ByteBuffer byteBuffer10 = null;
        response8.byteData = byteBuffer10;
        java.lang.String str13 = response8.getHeaderCaseInsensitive("");
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response8);
        response14.executed = false;
        java.nio.ByteBuffer byteBuffer17 = response14.byteData;
        java.nio.ByteBuffer byteBuffer18 = response14.byteData;
        org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response(response14);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response22 = response19.cookie("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(byteBuffer17);
        org.junit.Assert.assertNull(byteBuffer18);
    }

    @Test
    public void test15085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15085");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response4);
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response5);
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response6);
        java.nio.ByteBuffer byteBuffer8 = null;
        response6.byteData = byteBuffer8;
        int int10 = response6.numRedirects;
        response6.contentType = "hi!";
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
    }

    @Test
    public void test15086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15086");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response4);
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response4);
        org.jsoup.Connection.Method method7 = response4.method();
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response4);
        java.lang.String str9 = response8.charset();
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response8);
        java.nio.ByteBuffer byteBuffer11 = null;
        response10.byteData = byteBuffer11;
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response10);
        org.jsoup.Connection.Response response15 = response13.removeCookie("hi!");
        java.nio.ByteBuffer byteBuffer16 = null;
        response13.byteData = byteBuffer16;
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response(response13);
        org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response(response13);
        response19.statusMessage = "";
        org.jsoup.helper.HttpConnection.Response response22 = new org.jsoup.helper.HttpConnection.Response(response19);
        java.lang.String str24 = response19.header("");
        org.jsoup.helper.HttpConnection.Response response25 = new org.jsoup.helper.HttpConnection.Response(response19);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str26 = response25.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test15087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15087");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response6 = response1.cookie("hi!", "");
        response1.contentType = "";
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Request request10 = null;
        response9.req = request10;
        int int12 = response9.statusCode();
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response9);
        response9.statusMessage = "hi!";
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response9);
        java.lang.String str18 = response16.cookie("hi!");
        org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response(response16);
        response16.statusCode = 201;
        org.jsoup.helper.HttpConnection.Response response22 = new org.jsoup.helper.HttpConnection.Response(response16);
        org.jsoup.helper.HttpConnection.Response response23 = new org.jsoup.helper.HttpConnection.Response(response22);
        org.jsoup.helper.HttpConnection.Response response24 = new org.jsoup.helper.HttpConnection.Response(response23);
        java.lang.String str25 = response23.statusMessage;
        java.net.URL uRL26 = response23.url();
        java.nio.ByteBuffer byteBuffer27 = response23.byteData;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(uRL26);
        org.junit.Assert.assertNull(byteBuffer27);
    }

    @Test
    public void test15088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15088");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response4);
        response5.contentType = "";
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response5);
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response5);
        org.jsoup.Connection.Method method10 = response9.method();
        java.net.URL uRL11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response12 = response9.url(uRL11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method10);
    }

    @Test
    public void test15089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15089");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response4);
        response5.contentType = "";
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response5);
        java.lang.String str9 = response8.contentType;
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response8);
        java.net.URL uRL11 = response8.url();
        org.jsoup.Connection.Request request12 = null;
        response8.req = request12;
        java.nio.ByteBuffer byteBuffer14 = response8.byteData;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertNull(byteBuffer14);
    }

    @Test
    public void test15090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15090");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Response response6 = response4.removeCookie("hi!");
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response4);
        java.nio.ByteBuffer byteBuffer8 = response4.byteData;
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response4);
        java.lang.String str10 = response9.statusMessage();
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response9);
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response11);
        java.nio.ByteBuffer byteBuffer13 = response11.byteData;
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response11);
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response11);
        java.net.URL uRL16 = response11.url();
        java.lang.String str18 = response11.getHeaderCaseInsensitive("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNull(byteBuffer8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(byteBuffer13);
        org.junit.Assert.assertNull(uRL16);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test15091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15091");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str5 = response1.statusMessage;
        response1.executed = false;
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response10);
        int int12 = response10.statusCode();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test15092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15092");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response6 = response1.cookie("hi!", "");
        int int7 = response1.numRedirects;
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response8);
        java.net.URL uRL10 = response9.url();
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response9);
        java.util.Map<java.lang.String, java.lang.String> strMap12 = response9.cookies();
        boolean boolean14 = response9.hasHeader("hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(uRL10);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test15093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15093");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response6 = response1.cookie("hi!", "");
        int int7 = response1.numRedirects;
        response1.contentType = "";
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response11);
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response11);
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response13);
        java.lang.String str15 = response14.statusMessage;
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response14);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test15094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15094");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        java.lang.String str4 = response1.contentType();
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Request request6 = null;
        response1.req = request6;
        java.lang.String str8 = response1.charset();
        java.lang.String str9 = response1.charset();
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response10);
        response10.executed = true;
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response10);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response16 = response10.removeHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test15095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15095");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str2 = response1.contentType();
        java.lang.String str4 = response1.getHeaderCaseInsensitive("hi!");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry6 = response1.scanHeaders("");
        java.lang.String str8 = response1.getHeaderCaseInsensitive("");
        response1.statusCode = 400;
        java.lang.String str11 = response1.charset();
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Method method13 = response12.method();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(strEntry6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(method13);
    }

    @Test
    public void test15096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15096");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response6 = response1.cookie("hi!", "");
        response1.contentType = "";
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Request request10 = null;
        response9.req = request10;
        int int12 = response9.statusCode();
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response9);
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response9);
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response14);
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response15);
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response16);
        java.lang.String str18 = response16.statusMessage;
        response16.contentType = "";
        org.jsoup.helper.HttpConnection.Response response21 = new org.jsoup.helper.HttpConnection.Response(response16);
        org.jsoup.helper.HttpConnection.Response response22 = new org.jsoup.helper.HttpConnection.Response(response16);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document23 = response16.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test15097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15097");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response6 = response1.cookie("hi!", "");
        response1.contentType = "";
        java.util.Map<java.lang.String, java.lang.String> strMap9 = response1.cookies();
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Method method11 = response1.method();
        java.lang.String str12 = response1.statusMessage();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNull(method11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test15098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15098");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response6 = response1.cookie("hi!", "");
        response1.contentType = "";
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Request request10 = null;
        response9.req = request10;
        int int12 = response9.statusCode();
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response9);
        response9.statusMessage = "hi!";
        java.net.URL uRL16 = response9.url();
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response9);
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response(response17);
        org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response(response17);
        org.jsoup.Connection.Response response22 = response17.header("hi!", "hi!");
        int int23 = response17.statusCode();
        int int24 = response17.statusCode;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(uRL16);
        org.junit.Assert.assertNotNull(response22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test15099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15099");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str5 = response1.statusMessage;
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.util.Map<java.lang.String, java.lang.String> strMap7 = response6.headers();
        java.lang.String str8 = response6.statusMessage;
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response6);
        boolean boolean10 = response6.executed;
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response6);
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response6);
        java.lang.String str13 = response12.charset;
        boolean boolean15 = response12.hasHeader("hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test15100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15100");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response6 = response1.cookie("hi!", "");
        response1.contentType = "";
        boolean boolean11 = response1.hasHeaderWithValue("hi!", "");
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response12);
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response13);
        java.lang.String str15 = response13.charset();
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response13);
        int int17 = response16.numRedirects;
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response(response16);
        boolean boolean21 = response18.hasHeaderWithValue("hi!", "");
        response18.numRedirects = (byte) 100;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response24 = new org.jsoup.helper.HttpConnection.Response(response18);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Too many redirects occurred trying to load URL null");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test15101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15101");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Method method3 = response2.method();
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response2);
        int int5 = response4.statusCode;
        int int6 = response4.numRedirects;
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response4);
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response4);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response9 = org.jsoup.helper.HttpConnection.Response.execute(request0, response4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test15102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15102");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response6 = response1.cookie("hi!", "");
        response1.contentType = "";
        boolean boolean11 = response1.hasHeaderWithValue("hi!", "");
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response12);
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response13);
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response13);
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response15);
        boolean boolean18 = response15.hasHeader("hi!");
        response15.executed = true;
        org.jsoup.helper.HttpConnection.Response response21 = new org.jsoup.helper.HttpConnection.Response(response15);
        org.jsoup.helper.HttpConnection.Response response22 = new org.jsoup.helper.HttpConnection.Response(response15);
        response15.executed = false;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test15103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15103");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response6 = response1.cookie("hi!", "");
        response1.contentType = "";
        boolean boolean11 = response1.hasHeaderWithValue("hi!", "");
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response12);
        java.lang.String str14 = response12.contentType;
        response12.statusMessage = "";
        org.jsoup.Connection.Request request17 = null;
        response12.req = request17;
        org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response(response12);
        org.jsoup.Connection.Method method20 = response12.method();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry22 = response12.scanHeaders("hi!");
        org.jsoup.helper.HttpConnection.Response response23 = new org.jsoup.helper.HttpConnection.Response(response12);
        response23.executed = false;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(method20);
        org.junit.Assert.assertNull(strEntry22);
    }

    @Test
    public void test15104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15104");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str2 = response1.contentType();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry4 = response1.scanHeaders("");
        java.lang.String str5 = response1.charset();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response7);
        response7.charset = "";
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry12 = response7.scanHeaders("");
        boolean boolean13 = response7.executed;
        org.jsoup.Connection.Response response16 = response7.cookie("hi!", "hi!");
        org.jsoup.Connection.Response response19 = response7.cookie("hi!", "hi!");
        java.lang.String str20 = response7.charset;
        java.lang.String str21 = response7.contentType();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(strEntry4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(strEntry12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertNotNull(response19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test15105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15105");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        java.lang.String str4 = response1.contentType();
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Request request6 = null;
        response1.req = request6;
        org.jsoup.Connection.Request request8 = null;
        response1.req = request8;
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response1);
        boolean boolean11 = response1.executed;
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str14 = response1.getHeaderCaseInsensitive("");
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.util.Map<java.lang.String, java.lang.String> strMap16 = response15.cookies();
        java.lang.String str17 = response15.statusMessage();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test15106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15106");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response4);
        response5.contentType = "";
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response5);
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response5);
        java.nio.ByteBuffer byteBuffer10 = null;
        response9.byteData = byteBuffer10;
        java.lang.String str12 = response9.contentType();
        org.jsoup.Connection.Response response15 = response9.header("hi!", "");
        org.jsoup.Connection.Method method16 = response9.method();
        java.lang.String str17 = response9.statusMessage;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertNull(method16);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test15107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15107");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response6 = response1.cookie("hi!", "");
        response1.contentType = "";
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Request request10 = null;
        response9.req = request10;
        int int12 = response9.statusCode();
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response9);
        int int14 = response9.statusCode;
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response9);
        java.util.Map<java.lang.String, java.lang.String> strMap16 = response15.cookies();
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response15);
        response17.charset = "";
        org.jsoup.helper.HttpConnection.Response response20 = new org.jsoup.helper.HttpConnection.Response(response17);
        org.jsoup.helper.HttpConnection.Response response21 = new org.jsoup.helper.HttpConnection.Response(response17);
        org.jsoup.Connection.Response response24 = response21.cookie("hi!", "");
        org.jsoup.helper.HttpConnection.Response response25 = new org.jsoup.helper.HttpConnection.Response(response21);
        java.lang.String str26 = response25.charset;
        java.util.Map<java.lang.String, java.lang.String> strMap27 = response25.cookies();
        org.jsoup.helper.HttpConnection.Response response28 = new org.jsoup.helper.HttpConnection.Response(response25);
        java.net.URL uRL29 = response25.url();
        org.jsoup.helper.HttpConnection.Response response30 = new org.jsoup.helper.HttpConnection.Response(response25);
        org.jsoup.helper.HttpConnection.Response response31 = new org.jsoup.helper.HttpConnection.Response(response25);
        boolean boolean32 = response25.executed;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertNotNull(response24);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(strMap27);
        org.junit.Assert.assertNull(uRL29);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test15108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15108");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response4);
        org.jsoup.Connection.Request request6 = null;
        response5.req = request6;
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response5);
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response8);
        org.jsoup.Connection.Request request10 = null;
        response9.req = request10;
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response9);
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response9);
        int int14 = response9.statusCode;
        boolean boolean15 = response9.executed;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry17 = response9.scanHeaders("");
        java.lang.String str18 = response9.statusMessage();
        org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response(response9);
        java.util.Map<java.lang.String, java.lang.String> strMap20 = response9.cookies();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = response9.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(strEntry17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(strMap20);
    }

    @Test
    public void test15109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15109");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response4);
        int int6 = response5.numRedirects;
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response5);
        boolean boolean9 = response5.hasCookie("hi!");
        java.lang.String str11 = response5.cookie("hi!");
        response5.executed = true;
        org.jsoup.Connection.Request request14 = null;
        response5.req = request14;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test15110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15110");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str2 = response1.contentType();
        java.lang.String str4 = response1.getHeaderCaseInsensitive("hi!");
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response1);
        response1.numRedirects = (short) 1;
        java.nio.ByteBuffer byteBuffer8 = null;
        response1.byteData = byteBuffer8;
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response10);
        response10.charset = "";
        java.lang.String str14 = response10.contentType();
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response10);
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response15);
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response16);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response19 = response17.removeCookie("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test15111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15111");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str5 = response1.statusMessage;
        response1.statusCode = 505;
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry10 = response8.scanHeaders("hi!");
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response8);
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response11);
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response12);
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response13);
        response14.numRedirects = '4';
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(strEntry10);
    }

    @Test
    public void test15112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15112");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response6 = response1.cookie("hi!", "");
        int int7 = response1.numRedirects;
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response8);
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response9);
        java.lang.String str11 = response10.statusMessage();
        java.util.Map<java.lang.String, java.lang.String> strMap12 = response10.cookies();
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response10);
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response13);
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response13);
        response15.charset = "hi!";
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response(response15);
        java.lang.String str19 = response15.statusMessage;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry21 = response15.scanHeaders("");
        response15.statusCode = 205;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(strEntry21);
    }

    @Test
    public void test15113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15113");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Method method2 = response1.method();
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response1);
        response3.executed = false;
        java.lang.String str6 = response3.contentType;
        int int7 = response3.numRedirects;
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response3);
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response8);
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response8);
        response8.statusCode = 413;
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test15114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15114");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str2 = response1.contentType();
        java.lang.String str4 = response1.getHeaderCaseInsensitive("hi!");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry6 = response1.scanHeaders("");
        boolean boolean9 = response1.hasHeaderWithValue("hi!", "hi!");
        java.lang.String str10 = response1.charset;
        java.nio.ByteBuffer byteBuffer11 = null;
        response1.byteData = byteBuffer11;
        boolean boolean15 = response1.hasHeaderWithValue("hi!", "");
        int int16 = response1.numRedirects;
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(strEntry6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test15115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15115");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response6 = response1.cookie("hi!", "");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry8 = response1.scanHeaders("hi!");
        java.lang.String str9 = response1.charset();
        java.lang.String str10 = response1.statusMessage();
        response1.statusMessage = "";
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.nio.ByteBuffer byteBuffer14 = response13.byteData;
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response13);
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response13);
        java.lang.String str17 = response13.contentType();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNull(strEntry8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(byteBuffer14);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test15116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15116");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response6 = response1.cookie("hi!", "");
        response1.contentType = "";
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Request request10 = null;
        response9.req = request10;
        int int12 = response9.statusCode();
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response9);
        response9.statusMessage = "hi!";
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response9);
        java.lang.String str18 = response16.cookie("hi!");
        java.lang.String str19 = response16.contentType;
        java.lang.String str20 = response16.statusMessage;
        org.jsoup.helper.HttpConnection.Response response21 = new org.jsoup.helper.HttpConnection.Response(response16);
        org.jsoup.helper.HttpConnection.Response response22 = new org.jsoup.helper.HttpConnection.Response(response21);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = response22.hasCookie("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test15117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15117");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response6 = response1.cookie("hi!", "");
        int int7 = response1.numRedirects;
        java.lang.String str8 = response1.statusMessage();
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response1);
        int int10 = response1.statusCode;
        response1.contentType = "";
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response1);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document15 = response1.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test15118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15118");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str2 = response1.contentType();
        java.lang.String str4 = response1.getHeaderCaseInsensitive("hi!");
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response1);
        response1.charset = "hi!";
        java.net.URL uRL8 = response1.url();
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response9);
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response10);
        org.jsoup.Connection.Method method12 = response11.method();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(uRL8);
        org.junit.Assert.assertNull(method12);
    }

    @Test
    public void test15119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15119");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str5 = response1.statusMessage;
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.util.Map<java.lang.String, java.lang.String> strMap7 = response6.headers();
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response6);
        int int9 = response8.statusCode();
        int int10 = response8.statusCode();
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response8);
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response8);
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response8);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray14 = response8.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test15120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15120");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response6 = response1.cookie("hi!", "");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry8 = response1.scanHeaders("hi!");
        java.lang.String str9 = response1.charset();
        java.lang.String str10 = response1.statusMessage();
        boolean boolean11 = response1.executed;
        java.nio.ByteBuffer byteBuffer12 = null;
        response1.byteData = byteBuffer12;
        org.jsoup.Connection.Method method14 = response1.method();
        org.jsoup.Connection.Response response17 = response1.cookie("hi!", "");
        int int18 = response1.statusCode();
        org.jsoup.Connection.Method method19 = response1.method();
        java.util.Map<java.lang.String, java.lang.String> strMap20 = response1.headers();
        org.jsoup.Connection.Method method21 = response1.method();
        java.util.Map<java.lang.String, java.lang.String> strMap22 = response1.cookies();
        java.lang.String str23 = response1.charset;
        response1.contentType = "";
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNull(strEntry8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(method14);
        org.junit.Assert.assertNotNull(response17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(method19);
        org.junit.Assert.assertNotNull(strMap20);
        org.junit.Assert.assertNull(method21);
        org.junit.Assert.assertNotNull(strMap22);
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test15121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15121");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map<java.lang.String, java.lang.String> strMap2 = response1.cookies();
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response4);
        java.util.Map<java.lang.String, java.lang.String> strMap6 = response5.headers();
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response5);
        boolean boolean8 = response7.executed;
        java.lang.String str10 = response7.cookie("hi!");
        int int11 = response7.statusCode;
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test15122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15122");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str2 = response1.contentType();
        java.lang.String str4 = response1.getHeaderCaseInsensitive("hi!");
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response1);
        response1.numRedirects = (short) 1;
        java.nio.ByteBuffer byteBuffer8 = null;
        response1.byteData = byteBuffer8;
        java.lang.String str10 = response1.charset;
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.nio.ByteBuffer byteBuffer12 = response1.byteData;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = response1.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(byteBuffer12);
    }

    @Test
    public void test15123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15123");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response6 = response1.cookie("hi!", "");
        response1.contentType = "";
        boolean boolean11 = response1.hasHeaderWithValue("hi!", "");
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response12);
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response13);
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response13);
        java.lang.String str16 = response15.contentType();
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response15);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test15124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15124");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response6 = response1.cookie("hi!", "");
        response1.contentType = "";
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Request request10 = null;
        response9.req = request10;
        int int12 = response9.statusCode();
        org.jsoup.Connection.Method method13 = response9.method();
        java.lang.String str14 = response9.charset();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(method13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test15125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15125");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map<java.lang.String, java.lang.String> strMap2 = response1.cookies();
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str4 = response1.charset;
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        java.lang.String str8 = response1.header("");
        int int9 = response1.statusCode();
        org.jsoup.Connection.Request request10 = null;
        response1.req = request10;
        response1.statusCode = 411;
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.nio.ByteBuffer byteBuffer15 = response14.byteData;
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response14);
        response16.executed = true;
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(byteBuffer15);
    }

    @Test
    public void test15126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15126");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str5 = response1.statusMessage;
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.util.Map<java.lang.String, java.lang.String> strMap7 = response6.headers();
        java.lang.String str8 = response6.statusMessage;
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response6);
        org.jsoup.Connection.Response response11 = response6.removeCookie("hi!");
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response6);
        java.lang.String str13 = response12.charset;
        java.lang.String str15 = response12.header("hi!");
        java.lang.String str16 = response12.charset;
        boolean boolean18 = response12.hasCookie("hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test15127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15127");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str5 = response1.statusMessage;
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.util.Map<java.lang.String, java.lang.String> strMap7 = response6.headers();
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response6);
        int int9 = response8.statusCode();
        java.lang.String str11 = response8.cookie("hi!");
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response8);
        java.util.Map<java.lang.String, java.lang.String> strMap13 = response8.cookies();
        java.net.HttpURLConnection httpURLConnection14 = null;
        org.jsoup.helper.HttpConnection.Response response15 = null;
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response15);
        java.lang.String str18 = response16.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response21 = response16.cookie("hi!", "");
        response16.contentType = "";
        boolean boolean26 = response16.hasHeaderWithValue("hi!", "");
        org.jsoup.helper.HttpConnection.Response response27 = new org.jsoup.helper.HttpConnection.Response(response16);
        org.jsoup.helper.HttpConnection.Response response28 = new org.jsoup.helper.HttpConnection.Response(response27);
        java.lang.String str29 = response28.contentType;
        java.lang.String str30 = response28.charset();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry32 = response28.scanHeaders("hi!");
        org.jsoup.helper.HttpConnection.Response response33 = new org.jsoup.helper.HttpConnection.Response(response28);
        response33.statusCode = 201;
        // The following exception was thrown during execution in test generation
        try {
            response8.setupFromConnection(httpURLConnection14, (org.jsoup.Connection.Response) response33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(response21);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNull(strEntry32);
    }

    @Test
    public void test15128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15128");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.net.URL uRL5 = response4.url();
        boolean boolean7 = response4.hasHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response4);
        int int9 = response4.statusCode();
        boolean boolean10 = response4.executed;
        org.jsoup.Connection.Response response12 = response4.removeCookie("hi!");
        int int13 = response4.numRedirects;
        boolean boolean15 = response4.hasHeader("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response18 = response4.header("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(uRL5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test15129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15129");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map<java.lang.String, java.lang.String> strMap2 = response1.cookies();
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response4);
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry7 = response4.scanHeaders("hi!");
        org.jsoup.Connection.Method method8 = response4.method();
        response4.charset = "";
        boolean boolean12 = response4.hasHeader("hi!");
        response4.statusCode = (byte) 0;
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNull(strEntry7);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test15130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15130");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str2 = response1.contentType();
        java.lang.String str4 = response1.getHeaderCaseInsensitive("hi!");
        org.jsoup.Connection.Response response6 = response1.removeHeader("hi!");
        java.net.URL uRL7 = response1.url();
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response1);
        boolean boolean10 = response8.hasHeader("hi!");
        org.jsoup.Connection.Response response12 = response8.removeCookie("hi!");
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response8);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNull(uRL7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(response12);
    }

    @Test
    public void test15131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15131");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str5 = response1.statusMessage;
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response6);
        int int8 = response7.numRedirects;
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response7);
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response9);
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry12 = response9.scanHeaders("hi!");
        int int13 = response9.numRedirects;
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response9);
        int int15 = response14.statusCode;
        java.util.Map<java.lang.String, java.lang.String> strMap16 = response14.headers();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry18 = response14.scanHeaders("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertNull(strEntry12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertNull(strEntry18);
    }

    @Test
    public void test15132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15132");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str2 = response1.contentType();
        java.lang.String str4 = response1.getHeaderCaseInsensitive("hi!");
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.util.Map<java.lang.String, java.lang.String> strMap6 = response1.cookies();
        org.jsoup.Connection.Response response9 = response1.cookie("hi!", "");
        java.lang.String str10 = response1.contentType();
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response11);
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response12);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document14 = response12.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test15133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15133");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response6 = response1.cookie("hi!", "");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry8 = response1.scanHeaders("hi!");
        java.lang.String str10 = response1.header("");
        java.lang.String str11 = response1.contentType();
        int int12 = response1.statusCode();
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry15 = response13.scanHeaders("");
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response13);
        java.lang.String str17 = response13.charset();
        response13.statusCode = 304;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNull(strEntry8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(strEntry15);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test15134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15134");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response6 = response1.cookie("hi!", "");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry8 = response1.scanHeaders("hi!");
        java.lang.String str9 = response1.charset();
        java.lang.String str10 = response1.statusMessage();
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.nio.ByteBuffer byteBuffer12 = response1.byteData;
        int int13 = response1.statusCode();
        boolean boolean14 = response1.executed;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNull(strEntry8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(byteBuffer12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test15135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15135");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response6 = response1.cookie("hi!", "");
        response1.contentType = "";
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Request request10 = null;
        response9.req = request10;
        int int12 = response9.statusCode();
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response9);
        response9.statusMessage = "hi!";
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response9);
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response9);
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response(response9);
        response9.statusMessage = "hi!";
        java.net.URL uRL21 = response9.url();
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray22 = response9.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(uRL21);
    }

    @Test
    public void test15136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15136");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response6 = response1.cookie("hi!", "");
        response1.contentType = "";
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response9);
        boolean boolean11 = response9.executed;
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response9);
        int int13 = response12.statusCode;
        boolean boolean16 = response12.hasHeaderWithValue("hi!", "hi!");
        java.lang.String str17 = response12.charset;
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response(response12);
        org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response(response12);
        java.lang.String str20 = response19.contentType();
        response19.numRedirects = 303;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test15137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15137");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response6 = response1.cookie("hi!", "");
        int int7 = response1.numRedirects;
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response1);
        response8.statusCode = 403;
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response8);
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response8);
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response8);
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response8);
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response14);
        int int16 = response15.statusCode;
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response15);
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry19 = response17.scanHeaders("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(strEntry19);
    }

    @Test
    public void test15138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15138");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response6 = response1.cookie("hi!", "");
        int int7 = response1.numRedirects;
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response1);
        response8.executed = false;
        int int11 = response8.numRedirects;
        java.nio.ByteBuffer byteBuffer12 = null;
        response8.byteData = byteBuffer12;
        boolean boolean16 = response8.hasHeaderWithValue("hi!", "");
        java.lang.String str17 = response8.charset;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test15139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15139");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str2 = response1.contentType();
        java.lang.String str4 = response1.getHeaderCaseInsensitive("hi!");
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response1);
        response1.numRedirects = (short) 1;
        boolean boolean8 = response1.executed;
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str11 = response1.cookie("hi!");
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test15140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15140");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response6 = response1.cookie("hi!", "");
        response1.contentType = "";
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Request request10 = null;
        response9.req = request10;
        int int12 = response9.statusCode();
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response9);
        response9.statusMessage = "hi!";
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response9);
        java.lang.String str18 = response16.cookie("hi!");
        java.net.URL uRL19 = response16.url();
        java.lang.String str20 = response16.statusMessage();
        int int21 = response16.statusCode;
        org.jsoup.helper.HttpConnection.Response response22 = new org.jsoup.helper.HttpConnection.Response(response16);
        java.lang.String str23 = response16.statusMessage;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = response16.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(uRL19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test15141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15141");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str2 = response1.contentType();
        java.lang.String str4 = response1.getHeaderCaseInsensitive("hi!");
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response1);
        response1.statusCode = (short) 1;
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response1);
        boolean boolean9 = response8.executed;
        boolean boolean10 = response8.executed;
        response8.contentType = "";
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test15142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15142");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Response response6 = response4.removeCookie("hi!");
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response4);
        java.net.URL uRL8 = response7.url();
        org.jsoup.Connection.Method method9 = response7.method();
        java.lang.String str11 = response7.getHeaderCaseInsensitive("hi!");
        java.lang.String str12 = response7.charset();
        int int13 = response7.numRedirects;
        boolean boolean15 = response7.hasCookie("hi!");
        int int16 = response7.numRedirects;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNull(uRL8);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
    }

    @Test
    public void test15143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15143");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response6 = response1.cookie("hi!", "");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry8 = response1.scanHeaders("hi!");
        java.lang.String str9 = response1.charset();
        java.lang.String str10 = response1.statusMessage();
        boolean boolean11 = response1.executed;
        java.nio.ByteBuffer byteBuffer12 = null;
        response1.byteData = byteBuffer12;
        int int14 = response1.numRedirects;
        org.jsoup.Connection.Request request15 = response1.req;
        org.jsoup.Connection.Request request16 = response1.req;
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response(response17);
        org.jsoup.Connection.Request request19 = null;
        response17.req = request19;
        org.jsoup.helper.HttpConnection.Response response21 = new org.jsoup.helper.HttpConnection.Response(response17);
        response17.charset = "hi!";
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNull(strEntry8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(request15);
        org.junit.Assert.assertNull(request16);
    }

    @Test
    public void test15144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15144");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response6 = response1.cookie("hi!", "");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry8 = response1.scanHeaders("hi!");
        java.lang.String str9 = response1.charset();
        java.lang.String str10 = response1.statusMessage();
        response1.statusMessage = "";
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.util.Map<java.lang.String, java.lang.String> strMap15 = response14.cookies();
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response14);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response19 = response16.header("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNull(strEntry8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(strMap15);
    }

    @Test
    public void test15145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15145");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response6 = response1.cookie("hi!", "");
        response1.contentType = "";
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Request request10 = null;
        response9.req = request10;
        int int12 = response9.statusCode();
        java.util.Map<java.lang.String, java.lang.String> strMap13 = response9.cookies();
        java.lang.String str14 = response9.statusMessage;
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response9);
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response15);
        response15.statusMessage = "";
        java.lang.String str19 = response15.statusMessage();
        org.jsoup.helper.HttpConnection.Response response20 = new org.jsoup.helper.HttpConnection.Response(response15);
        org.jsoup.helper.HttpConnection.Response response21 = new org.jsoup.helper.HttpConnection.Response(response15);
        java.util.Map<java.lang.String, java.lang.String> strMap22 = response15.headers();
        org.jsoup.helper.HttpConnection.Response response23 = new org.jsoup.helper.HttpConnection.Response(response15);
        org.jsoup.helper.HttpConnection.Response response24 = new org.jsoup.helper.HttpConnection.Response(response23);
        org.jsoup.Connection.Method method25 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response26 = response24.method(method25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(strMap22);
    }

    @Test
    public void test15146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15146");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str5 = response1.statusMessage;
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.util.Map<java.lang.String, java.lang.String> strMap7 = response6.headers();
        java.lang.String str8 = response6.statusMessage;
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response6);
        org.jsoup.Connection.Response response11 = response6.removeCookie("hi!");
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response6);
        java.lang.String str13 = response12.contentType;
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response12);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test15147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15147");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response6 = response1.cookie("hi!", "");
        int int7 = response1.numRedirects;
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response8);
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response9);
        java.lang.String str11 = response10.statusMessage();
        boolean boolean13 = response10.hasCookie("hi!");
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response10);
        java.nio.ByteBuffer byteBuffer15 = response14.byteData;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document16 = response14.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(byteBuffer15);
    }

    @Test
    public void test15148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15148");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response6 = response1.cookie("hi!", "");
        int int7 = response1.numRedirects;
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response1);
        response8.executed = false;
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response8);
        org.jsoup.Connection.Method method12 = response11.method();
        int int13 = response11.numRedirects;
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response11);
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response11);
        java.lang.String str17 = response11.cookie("hi!");
        boolean boolean18 = response11.executed;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(method12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test15149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15149");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response4);
        org.jsoup.Connection.Request request6 = null;
        response5.req = request6;
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response5);
        java.lang.String str9 = response8.contentType();
        java.lang.String str10 = response8.contentType();
        response8.executed = false;
        java.lang.String str14 = response8.header("");
        response8.statusMessage = "";
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test15150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15150");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str2 = response1.contentType();
        java.lang.String str4 = response1.getHeaderCaseInsensitive("hi!");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry6 = response1.scanHeaders("");
        java.lang.String str8 = response1.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Method method9 = response1.method();
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(strEntry6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(method9);
    }

    @Test
    public void test15151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15151");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response6 = response1.cookie("hi!", "");
        int int7 = response1.numRedirects;
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response1);
        response8.statusCode = 403;
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response8);
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response11);
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response11);
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response11);
        response14.contentType = "";
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test15152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15152");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response6 = response1.cookie("hi!", "");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry8 = response1.scanHeaders("hi!");
        int int9 = response1.statusCode;
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str11 = response1.statusMessage();
        java.net.URL uRL12 = response1.url();
        org.jsoup.Connection.Request request13 = null;
        response1.req = request13;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNull(strEntry8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(uRL12);
    }

    @Test
    public void test15153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15153");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response6 = response1.cookie("hi!", "");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry8 = response1.scanHeaders("hi!");
        java.lang.String str9 = response1.charset();
        java.lang.String str10 = response1.statusMessage();
        response1.charset = "";
        org.jsoup.Connection.Request request13 = response1.req;
        int int14 = response1.statusCode();
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response1);
        response1.statusMessage = "hi!";
        java.lang.String str18 = response1.statusMessage;
        org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Request request20 = response1.req;
        boolean boolean23 = response1.hasHeaderWithValue("hi!", "");
        java.net.URL uRL24 = response1.url();
        java.lang.String str26 = response1.getHeaderCaseInsensitive("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNull(strEntry8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(request13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNull(request20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(uRL24);
        org.junit.Assert.assertNull(str26);
    }

    @Test
    public void test15154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15154");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response6 = response1.cookie("hi!", "");
        response1.contentType = "";
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response9);
        boolean boolean11 = response9.executed;
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response9);
        int int13 = response9.statusCode();
        java.nio.ByteBuffer byteBuffer14 = response9.byteData;
        int int15 = response9.statusCode;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(byteBuffer14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test15155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15155");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response6 = response1.cookie("hi!", "");
        response1.contentType = "";
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Request request10 = null;
        response9.req = request10;
        int int12 = response9.statusCode();
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response9);
        response9.statusMessage = "hi!";
        java.util.Map<java.lang.String, java.lang.String> strMap16 = response9.headers();
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response9);
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response(response17);
        response17.statusCode = 2;
        org.jsoup.helper.HttpConnection.Response response21 = new org.jsoup.helper.HttpConnection.Response(response17);
        org.jsoup.helper.HttpConnection.Response response22 = new org.jsoup.helper.HttpConnection.Response(response21);
        org.jsoup.helper.HttpConnection.Response response23 = new org.jsoup.helper.HttpConnection.Response(response21);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(strMap16);
    }

    @Test
    public void test15156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15156");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response6 = response1.cookie("hi!", "");
        response1.contentType = "";
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Request request10 = null;
        response9.req = request10;
        int int12 = response9.statusCode();
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response9);
        response9.statusMessage = "hi!";
        java.util.Map<java.lang.String, java.lang.String> strMap16 = response9.headers();
        response9.statusMessage = "hi!";
        org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response(response9);
        org.jsoup.helper.HttpConnection.Response response20 = new org.jsoup.helper.HttpConnection.Response(response9);
        org.jsoup.helper.HttpConnection.Response response21 = new org.jsoup.helper.HttpConnection.Response(response9);
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry23 = response21.scanHeaders("hi!");
        java.lang.String str24 = response21.charset();
        java.net.URL uRL25 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response26 = response21.url(uRL25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertNull(strEntry23);
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test15157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15157");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response4);
        response5.contentType = "";
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response5);
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response5);
        response9.statusMessage = "hi!";
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response9);
        org.jsoup.Connection.Method method13 = response9.method();
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response9);
        response9.charset = "";
        int int17 = response9.statusCode();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry19 = response9.scanHeaders("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method13);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(strEntry19);
    }

    @Test
    public void test15158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15158");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response6 = response1.cookie("hi!", "");
        response1.contentType = "";
        boolean boolean11 = response1.hasHeaderWithValue("hi!", "");
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.nio.ByteBuffer byteBuffer13 = response12.byteData;
        boolean boolean14 = response12.executed;
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response12);
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response12);
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response16);
        boolean boolean18 = response16.executed;
        boolean boolean20 = response16.hasHeader("hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(byteBuffer13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test15159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15159");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean2 = response1.executed;
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response3);
        java.lang.String str5 = response4.contentType;
        org.jsoup.Connection.Request request6 = response4.req;
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response4);
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response7);
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response8);
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response9);
        response10.charset = "";
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response10);
// flaky:             org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Too many redirects occurred trying to load URL null");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(request6);
    }

    @Test
    public void test15160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15160");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response4);
        response5.contentType = "";
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response5);
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response8);
        int int10 = response8.numRedirects;
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response8);
        int int12 = response11.numRedirects;
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response11);
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response13);
        response14.contentType = "";
        java.lang.String str17 = response14.statusMessage();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response(response14);
// flaky:             org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Too many redirects occurred trying to load URL null");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test15161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15161");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str3 = response2.contentType();
        java.lang.String str5 = response2.getHeaderCaseInsensitive("hi!");
        java.nio.ByteBuffer byteBuffer6 = null;
        response2.byteData = byteBuffer6;
        response2.numRedirects = 504;
        java.lang.String str10 = response2.statusMessage;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response11 = org.jsoup.helper.HttpConnection.Response.execute(request0, response2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test15162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15162");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response6 = response1.cookie("hi!", "");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry8 = response1.scanHeaders("hi!");
        java.lang.String str9 = response1.charset();
        java.lang.String str10 = response1.statusMessage();
        response1.charset = "";
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response1);
        response13.statusCode = 501;
        org.jsoup.Connection.Response response18 = response13.header("hi!", "");
        org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response(response13);
        org.jsoup.Connection.Method method20 = response19.method();
        org.jsoup.helper.HttpConnection.Response response21 = new org.jsoup.helper.HttpConnection.Response(response19);
        org.jsoup.Connection.Method method22 = response19.method();
        java.util.Map<java.lang.String, java.lang.String> strMap23 = response19.cookies();
        org.jsoup.Connection.Request request24 = null;
        response19.req = request24;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNull(strEntry8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(response18);
        org.junit.Assert.assertNull(method20);
        org.junit.Assert.assertNull(method22);
        org.junit.Assert.assertNotNull(strMap23);
    }

    @Test
    public void test15163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15163");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map<java.lang.String, java.lang.String> strMap2 = response1.cookies();
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str5 = response4.charset;
        org.jsoup.Connection.Request request6 = response4.req;
        java.lang.String str8 = response4.getHeaderCaseInsensitive("hi!");
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response4);
        org.jsoup.Connection.Response response12 = response4.cookie("hi!", "");
        response4.executed = true;
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response4);
        response4.statusMessage = "";
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(request6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(response12);
    }

    @Test
    public void test15164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15164");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response6 = response1.cookie("hi!", "");
        response1.contentType = "";
        boolean boolean11 = response1.hasHeaderWithValue("hi!", "");
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.nio.ByteBuffer byteBuffer13 = response12.byteData;
        java.util.Map<java.lang.String, java.lang.String> strMap14 = response12.headers();
        java.nio.ByteBuffer byteBuffer15 = null;
        response12.byteData = byteBuffer15;
        java.lang.String str17 = response12.charset();
        response12.statusMessage = "hi!";
        java.lang.String str20 = response12.statusMessage();
        org.jsoup.helper.HttpConnection.Response response21 = new org.jsoup.helper.HttpConnection.Response(response12);
        java.net.URL uRL22 = response21.url();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response25 = response21.cookie("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(byteBuffer13);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNull(uRL22);
    }

    @Test
    public void test15165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15165");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response6 = response1.cookie("hi!", "");
        int int7 = response1.numRedirects;
        java.lang.String str8 = response1.statusMessage();
        boolean boolean10 = response1.hasHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response1);
        int int12 = response1.numRedirects;
        java.lang.String str13 = response1.contentType();
        boolean boolean15 = response1.hasHeader("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response18 = response1.cookie("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test15166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15166");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean2 = response1.executed;
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response1);
        response1.statusMessage = "hi!";
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response6);
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response6);
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response6);
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response6);
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response6);
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response6);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = response6.hasHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test15167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15167");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str5 = response1.statusMessage;
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.util.Map<java.lang.String, java.lang.String> strMap7 = response6.headers();
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response6);
        int int9 = response8.statusCode();
        int int10 = response8.statusCode();
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response8);
        org.jsoup.Connection.Response response14 = response11.cookie("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response11);
        org.jsoup.Connection.Method method16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response17 = response15.method(method16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(response14);
    }

    @Test
    public void test15168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15168");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str2 = response1.contentType();
        java.lang.String str4 = response1.getHeaderCaseInsensitive("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap5 = response1.cookies();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Response response8 = response1.removeHeader("hi!");
        response1.numRedirects = (-1);
        boolean boolean11 = response1.executed;
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response13);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test15169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15169");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response6 = response1.cookie("hi!", "");
        int int7 = response1.numRedirects;
        java.lang.String str8 = response1.statusMessage();
        java.lang.String str9 = response1.charset;
        org.jsoup.Connection.Response response11 = response1.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.util.Map<java.lang.String, java.lang.String> strMap13 = response1.cookies();
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response1);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response20 = response17.cookie("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNotNull(strMap13);
    }

    @Test
    public void test15170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15170");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response6 = response1.cookie("hi!", "");
        response1.contentType = "";
        boolean boolean11 = response1.hasHeaderWithValue("hi!", "");
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.nio.ByteBuffer byteBuffer13 = response12.byteData;
        java.util.Map<java.lang.String, java.lang.String> strMap14 = response12.headers();
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response12);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = response12.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(byteBuffer13);
        org.junit.Assert.assertNotNull(strMap14);
    }

    @Test
    public void test15171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15171");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map<java.lang.String, java.lang.String> strMap2 = response1.cookies();
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str4 = response1.charset;
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        java.lang.String str8 = response1.header("");
        int int9 = response1.statusCode();
        org.jsoup.Connection.Request request10 = null;
        response1.req = request10;
        response1.statusCode = 411;
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response1);
        int int15 = response1.statusCode;
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response16);
        java.lang.String str18 = response17.statusMessage;
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 411 + "'", int15 == 411);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test15172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15172");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        java.lang.String str4 = response1.contentType();
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.nio.ByteBuffer byteBuffer6 = response5.byteData;
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response5);
        org.jsoup.Connection.Request request8 = null;
        response7.req = request8;
        java.lang.String str11 = response7.cookie("hi!");
        boolean boolean12 = response7.executed;
        java.nio.ByteBuffer byteBuffer13 = response7.byteData;
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response7);
        java.net.URL uRL15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response16 = response7.url(uRL15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(byteBuffer6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(byteBuffer13);
    }

    @Test
    public void test15173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15173");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response6 = response1.cookie("hi!", "");
        response1.contentType = "";
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response1);
        response1.executed = false;
        response1.statusCode = (byte) 100;
        java.util.Map<java.lang.String, java.lang.String> strMap14 = response1.cookies();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNotNull(strMap14);
    }

    @Test
    public void test15174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15174");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response6 = response1.cookie("hi!", "");
        response1.contentType = "";
        java.util.Map<java.lang.String, java.lang.String> strMap9 = response1.cookies();
        boolean boolean11 = response1.hasHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.util.Map<java.lang.String, java.lang.String> strMap14 = response1.headers();
        java.lang.String str15 = response1.contentType();
        boolean boolean16 = response1.executed;
        java.util.Map<java.lang.String, java.lang.String> strMap17 = response1.headers();
        java.lang.String str18 = response1.charset;
        org.jsoup.Connection.Response response20 = response1.removeCookie("hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(strMap17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(response20);
    }

    @Test
    public void test15175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15175");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response6 = response1.cookie("hi!", "");
        int int7 = response1.numRedirects;
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response8);
        java.net.URL uRL10 = response9.url();
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response9);
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response9);
        java.lang.String str13 = response12.contentType();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(uRL10);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test15176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15176");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str4 = response2.getHeaderCaseInsensitive("");
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response2);
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response5);
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response5);
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response5);
        java.util.Map<java.lang.String, java.lang.String> strMap9 = response8.cookies();
        java.lang.String str10 = response8.contentType;
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response8);
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response11);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response13 = org.jsoup.helper.HttpConnection.Response.execute(request0, response12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test15177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15177");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response6 = response1.cookie("hi!", "");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry8 = response1.scanHeaders("hi!");
        java.lang.String str9 = response1.charset();
        java.lang.String str10 = response1.statusMessage();
        boolean boolean11 = response1.executed;
        java.nio.ByteBuffer byteBuffer12 = null;
        response1.byteData = byteBuffer12;
        int int14 = response1.statusCode();
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str16 = response15.contentType();
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response15);
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response(response15);
        response15.statusCode = '4';
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNull(strEntry8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test15178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15178");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response6 = response1.cookie("hi!", "");
        response1.contentType = "";
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response9);
        java.lang.String str11 = response9.contentType();
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response9);
        java.util.Map<java.lang.String, java.lang.String> strMap13 = response12.headers();
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response12);
        int int15 = response14.numRedirects;
        response14.numRedirects = 6;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
    }

    @Test
    public void test15179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15179");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean2 = response1.executed;
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Response response6 = response1.cookie("hi!", "hi!");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry8 = response1.scanHeaders("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNull(strEntry8);
    }

    @Test
    public void test15180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15180");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response6 = response1.cookie("hi!", "");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry8 = response1.scanHeaders("hi!");
        java.lang.String str9 = response1.charset();
        java.lang.String str10 = response1.statusMessage();
        response1.charset = "";
        java.lang.String str14 = response1.getHeaderCaseInsensitive("hi!");
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Response response18 = response1.removeHeader("hi!");
        java.lang.String str19 = response1.statusMessage();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNull(strEntry8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(response18);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test15181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15181");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response6 = response1.cookie("hi!", "");
        response1.contentType = "";
        boolean boolean11 = response1.hasHeaderWithValue("hi!", "");
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response12);
        java.lang.String str14 = response13.contentType;
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response13);
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response15);
        boolean boolean17 = response16.executed;
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response(response16);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = response16.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test15182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15182");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response6 = response1.cookie("hi!", "");
        int int7 = response1.numRedirects;
        java.lang.String str8 = response1.statusMessage();
        java.net.URL uRL9 = response1.url();
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Method method11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response12 = response1.method(method11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(uRL9);
    }

    @Test
    public void test15183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15183");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response6 = response1.cookie("hi!", "");
        response1.contentType = "";
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Request request10 = null;
        response9.req = request10;
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response9);
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response12);
        java.util.Map<java.lang.String, java.lang.String> strMap14 = response13.cookies();
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response13);
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response13);
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response13);
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response(response13);
        org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response(response18);
        org.jsoup.helper.HttpConnection.Response response20 = new org.jsoup.helper.HttpConnection.Response(response18);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNotNull(strMap14);
    }

    @Test
    public void test15184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15184");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map<java.lang.String, java.lang.String> strMap2 = response1.cookies();
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response4);
        java.util.Map<java.lang.String, java.lang.String> strMap6 = response5.headers();
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response5);
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response5);
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response8);
        java.nio.ByteBuffer byteBuffer10 = null;
        response8.byteData = byteBuffer10;
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(strMap6);
    }

    @Test
    public void test15185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15185");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str5 = response1.statusMessage;
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.util.Map<java.lang.String, java.lang.String> strMap7 = response6.headers();
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response6);
        int int9 = response8.statusCode();
        int int10 = response8.statusCode();
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response8);
        java.util.Map<java.lang.String, java.lang.String> strMap12 = response8.cookies();
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response8);
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response13);
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response14);
        java.lang.String str17 = response14.header("");
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response(response14);
        org.jsoup.Connection.Response response21 = response18.cookie("hi!", "");
        org.jsoup.Connection.Response response24 = response18.cookie("hi!", "hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(response21);
        org.junit.Assert.assertNotNull(response24);
    }

    @Test
    public void test15186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15186");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response6 = response1.cookie("hi!", "");
        response1.contentType = "";
        java.util.Map<java.lang.String, java.lang.String> strMap9 = response1.cookies();
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response10);
        response11.executed = true;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNotNull(strMap9);
    }

    @Test
    public void test15187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15187");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        java.lang.String str4 = response1.contentType();
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response1);
        response5.contentType = "";
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response5);
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response8);
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response9);
        java.util.Map<java.lang.String, java.lang.String> strMap11 = response10.cookies();
        java.util.Map<java.lang.String, java.lang.String> strMap12 = response10.cookies();
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response10);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNotNull(strMap12);
    }

    @Test
    public void test15188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15188");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response4);
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response4);
        org.jsoup.Connection.Method method7 = response4.method();
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response4);
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response4);
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry11 = response4.scanHeaders("hi!");
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response4);
        org.jsoup.Connection.Request request13 = response12.req;
        response12.statusMessage = "hi!";
        java.lang.String str16 = response12.statusMessage();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(strEntry11);
        org.junit.Assert.assertNull(request13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test15189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15189");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response6 = response1.cookie("hi!", "");
        int int7 = response1.numRedirects;
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Request request9 = response1.req;
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response1);
        boolean boolean11 = response1.executed;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry13 = response1.scanHeaders("hi!");
        boolean boolean14 = response1.executed;
        org.jsoup.Connection.Response response17 = response1.header("hi!", "");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(request9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(strEntry13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(response17);
    }

    @Test
    public void test15190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15190");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response1);
        int int5 = response1.numRedirects;
        response1.charset = "hi!";
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.net.URL uRL9 = response8.url();
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response8);
        boolean boolean13 = response10.hasHeaderWithValue("hi!", "");
        org.jsoup.Connection.Response response15 = response10.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response10);
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response16);
        org.jsoup.Connection.Request request18 = response16.req;
        java.net.HttpURLConnection httpURLConnection19 = null;
        org.jsoup.helper.HttpConnection.Response response20 = null;
        org.jsoup.helper.HttpConnection.Response response21 = new org.jsoup.helper.HttpConnection.Response(response20);
        java.lang.String str23 = response21.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response26 = response21.cookie("hi!", "");
        response21.contentType = "";
        org.jsoup.helper.HttpConnection.Response response29 = new org.jsoup.helper.HttpConnection.Response(response21);
        org.jsoup.helper.HttpConnection.Response response30 = new org.jsoup.helper.HttpConnection.Response(response29);
        boolean boolean31 = response29.executed;
        org.jsoup.helper.HttpConnection.Response response32 = new org.jsoup.helper.HttpConnection.Response(response29);
        int int33 = response32.statusCode;
        org.jsoup.helper.HttpConnection.Response response34 = new org.jsoup.helper.HttpConnection.Response(response32);
        boolean boolean37 = response32.hasHeaderWithValue("hi!", "");
        org.jsoup.Connection.Response response40 = response32.cookie("hi!", "");
        // The following exception was thrown during execution in test generation
        try {
            response16.setupFromConnection(httpURLConnection19, (org.jsoup.Connection.Response) response32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertNull(request18);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(response26);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(response40);
    }

    @Test
    public void test15191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15191");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response6 = response1.cookie("hi!", "");
        response1.contentType = "";
        boolean boolean11 = response1.hasHeaderWithValue("hi!", "");
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response12);
        java.lang.String str14 = response13.contentType;
        java.lang.String str15 = response13.statusMessage;
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response13);
        int int17 = response13.statusCode;
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response(response13);
        org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response(response13);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test15192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15192");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Method method2 = response1.method();
        int int3 = response1.statusCode();
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response1);
        response4.statusCode = 410;
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response4);
        java.lang.String str8 = response7.contentType();
        boolean boolean10 = response7.hasHeader("hi!");
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test15193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15193");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response6 = response1.cookie("hi!", "");
        int int7 = response1.numRedirects;
        java.lang.String str8 = response1.statusMessage();
        boolean boolean10 = response1.hasHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response1);
        response1.statusMessage = "";
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response16);
        org.jsoup.Connection.Response response20 = response16.cookie("hi!", "");
        java.lang.String str22 = response16.getHeaderCaseInsensitive("hi!");
        org.jsoup.helper.HttpConnection.Response response23 = new org.jsoup.helper.HttpConnection.Response(response16);
        response16.contentType = "hi!";
        response16.numRedirects = 207;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(response20);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test15194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15194");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response6 = response1.cookie("hi!", "");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry8 = response1.scanHeaders("hi!");
        java.lang.String str9 = response1.charset();
        java.lang.String str10 = response1.statusMessage();
        boolean boolean11 = response1.executed;
        java.nio.ByteBuffer byteBuffer12 = null;
        response1.byteData = byteBuffer12;
        int int14 = response1.numRedirects;
        java.lang.String str15 = response1.statusMessage();
        java.lang.String str16 = response1.contentType;
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.nio.ByteBuffer byteBuffer18 = null;
        response17.byteData = byteBuffer18;
        org.jsoup.helper.HttpConnection.Response response20 = new org.jsoup.helper.HttpConnection.Response(response17);
        org.jsoup.helper.HttpConnection.Response response21 = new org.jsoup.helper.HttpConnection.Response(response17);
        java.lang.String str22 = response17.contentType();
        org.jsoup.Connection.Method method23 = response17.method();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNull(strEntry8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(method23);
    }

    @Test
    public void test15195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15195");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response1);
        int int5 = response1.numRedirects;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry7 = response1.scanHeaders("hi!");
        response1.statusCode = 501;
        java.lang.String str10 = response1.statusMessage;
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response1);
        boolean boolean14 = response11.hasHeaderWithValue("hi!", "");
        response11.contentType = "";
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(strEntry7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test15196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15196");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Method method2 = response1.method();
        int int3 = response1.statusCode();
        org.jsoup.Connection.Response response5 = response1.removeCookie("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap6 = response1.cookies();
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response1);
        response7.executed = false;
        boolean boolean10 = response7.executed;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = response7.cookie("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test15197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15197");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response4);
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response4);
        org.jsoup.Connection.Method method7 = response4.method();
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response4);
        java.lang.String str9 = response8.charset();
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response8);
        java.nio.ByteBuffer byteBuffer11 = null;
        response10.byteData = byteBuffer11;
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response10);
        response10.executed = false;
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response10);
        int int17 = response10.statusCode();
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response(response10);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test15198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15198");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response6 = response1.cookie("hi!", "");
        response1.contentType = "";
        java.util.Map<java.lang.String, java.lang.String> strMap9 = response1.cookies();
        boolean boolean11 = response1.hasHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.util.Map<java.lang.String, java.lang.String> strMap14 = response1.headers();
        java.lang.String str15 = response1.contentType();
        boolean boolean16 = response1.executed;
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response(response17);
        org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response(response18);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test15199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15199");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response6 = response1.cookie("hi!", "");
        response1.contentType = "";
        boolean boolean11 = response1.hasHeaderWithValue("hi!", "");
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response12);
        java.lang.String str14 = response13.contentType;
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response13);
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response15);
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry18 = response15.scanHeaders("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap19 = response15.headers();
        org.jsoup.Connection.Request request20 = response15.req;
        org.jsoup.helper.HttpConnection.Response response21 = new org.jsoup.helper.HttpConnection.Response(response15);
        java.util.Map<java.lang.String, java.lang.String> strMap22 = response21.headers();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(strEntry18);
        org.junit.Assert.assertNotNull(strMap19);
        org.junit.Assert.assertNull(request20);
        org.junit.Assert.assertNotNull(strMap22);
    }

    @Test
    public void test15200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15200");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str5 = response1.statusMessage;
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.util.Map<java.lang.String, java.lang.String> strMap7 = response6.headers();
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response6);
        int int9 = response8.statusCode();
        int int10 = response8.statusCode();
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response8);
        boolean boolean14 = response11.hasHeaderWithValue("hi!", "");
        int int15 = response11.statusCode;
        response11.statusMessage = "hi!";
        boolean boolean18 = response11.executed;
        java.net.URL uRL19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response20 = response11.url(uRL19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test15201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15201");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response6 = response1.cookie("hi!", "");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry8 = response1.scanHeaders("hi!");
        java.lang.String str9 = response1.charset();
        java.lang.String str10 = response1.statusMessage();
        response1.charset = "";
        org.jsoup.Connection.Request request13 = response1.req;
        int int14 = response1.statusCode();
        org.jsoup.Connection.Response response17 = response1.header("hi!", "");
        java.lang.String str18 = response1.statusMessage;
        java.lang.String str20 = response1.getHeaderCaseInsensitive("");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry22 = response1.scanHeaders("hi!");
        java.lang.String str24 = response1.getHeaderCaseInsensitive("hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNull(strEntry8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(request13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(response17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(strEntry22);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test15202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15202");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response6 = response1.cookie("hi!", "");
        int int7 = response1.numRedirects;
        java.lang.String str8 = response1.statusMessage();
        java.lang.String str9 = response1.charset;
        org.jsoup.Connection.Method method10 = response1.method();
        java.net.URL uRL11 = response1.url();
        java.lang.String str12 = response1.statusMessage;
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response13);
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response14);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test15203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15203");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map<java.lang.String, java.lang.String> strMap2 = response1.cookies();
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry6 = response4.scanHeaders("");
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response4);
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response7);
        java.lang.String str9 = response7.charset;
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response7);
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response7);
        java.nio.ByteBuffer byteBuffer12 = response11.byteData;
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response11);
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response11);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNull(strEntry6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(byteBuffer12);
    }

    @Test
    public void test15204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15204");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str4 = response2.getHeaderCaseInsensitive("");
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response2);
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response5);
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response5);
        org.jsoup.Connection.Method method8 = response5.method();
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response5);
        java.lang.String str10 = response9.charset();
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response9);
        response9.charset = "";
        java.lang.String str14 = response9.contentType();
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response9);
        response9.statusCode = 206;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response18 = org.jsoup.helper.HttpConnection.Response.execute(request0, response9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test15205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15205");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response4);
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response5);
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response5);
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response5);
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response5);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response11 = response5.removeHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test15206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15206");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Method method2 = response1.method();
        java.lang.String str4 = response1.getHeaderCaseInsensitive("");
        java.lang.String str5 = response1.statusMessage;
        int int6 = response1.statusCode();
        response1.statusMessage = "hi!";
        org.jsoup.Connection.Response response10 = response1.removeHeader("hi!");
        java.lang.String str11 = response1.contentType();
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test15207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15207");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response6 = response1.cookie("hi!", "");
        response1.contentType = "";
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Request request10 = null;
        response9.req = request10;
        int int12 = response9.statusCode();
        response9.contentType = "";
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response9);
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response15);
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response15);
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response(response17);
        boolean boolean19 = response18.executed;
        org.jsoup.helper.HttpConnection.Response response20 = new org.jsoup.helper.HttpConnection.Response(response18);
        org.jsoup.helper.HttpConnection.Response response21 = new org.jsoup.helper.HttpConnection.Response(response18);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test15208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15208");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        java.lang.String str4 = response1.contentType();
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Request request6 = null;
        response1.req = request6;
        org.jsoup.Connection.Request request8 = null;
        response1.req = request8;
        java.lang.String str10 = response1.statusMessage();
        response1.numRedirects = (-1);
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str14 = response13.statusMessage();
        java.lang.String str15 = response13.statusMessage();
        org.jsoup.Connection.Response response18 = response13.header("hi!", "");
        response13.statusMessage = "";
        java.net.HttpURLConnection httpURLConnection21 = null;
        org.jsoup.helper.HttpConnection.Response response22 = null;
        org.jsoup.helper.HttpConnection.Response response23 = new org.jsoup.helper.HttpConnection.Response(response22);
        java.util.Map<java.lang.String, java.lang.String> strMap24 = response23.cookies();
        org.jsoup.helper.HttpConnection.Response response25 = new org.jsoup.helper.HttpConnection.Response(response23);
        org.jsoup.helper.HttpConnection.Response response26 = new org.jsoup.helper.HttpConnection.Response(response23);
        org.jsoup.helper.HttpConnection.Response response27 = new org.jsoup.helper.HttpConnection.Response(response26);
        java.util.Map<java.lang.String, java.lang.String> strMap28 = response27.headers();
        org.jsoup.helper.HttpConnection.Response response29 = new org.jsoup.helper.HttpConnection.Response(response27);
        org.jsoup.helper.HttpConnection.Response response30 = new org.jsoup.helper.HttpConnection.Response(response27);
        org.jsoup.helper.HttpConnection.Response response31 = new org.jsoup.helper.HttpConnection.Response(response30);
        org.jsoup.helper.HttpConnection.Response response32 = new org.jsoup.helper.HttpConnection.Response(response30);
        java.lang.String str33 = response30.charset;
        java.util.Map<java.lang.String, java.lang.String> strMap34 = response30.cookies();
        org.jsoup.helper.HttpConnection.Response response35 = new org.jsoup.helper.HttpConnection.Response(response30);
        // The following exception was thrown during execution in test generation
        try {
            response13.setupFromConnection(httpURLConnection21, (org.jsoup.Connection.Response) response30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(response18);
        org.junit.Assert.assertNotNull(strMap24);
        org.junit.Assert.assertNotNull(strMap28);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNotNull(strMap34);
    }

    @Test
    public void test15209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15209");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str2 = response1.contentType();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry4 = response1.scanHeaders("");
        java.lang.String str5 = response1.charset();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str7 = response1.statusMessage();
        java.nio.ByteBuffer byteBuffer8 = null;
        response1.byteData = byteBuffer8;
        java.util.Map<java.lang.String, java.lang.String> strMap10 = response1.headers();
        int int11 = response1.statusCode();
        java.lang.Class<?> wildcardClass12 = response1.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(strEntry4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test15210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15210");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response6 = response1.cookie("hi!", "");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry8 = response1.scanHeaders("hi!");
        java.lang.String str9 = response1.charset();
        java.lang.String str10 = response1.statusMessage();
        boolean boolean11 = response1.executed;
        java.lang.String str13 = response1.getHeaderCaseInsensitive("");
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response15);
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response16);
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response(response17);
        org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response(response17);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = response19.hasCookie("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNull(strEntry8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test15211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15211");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response6 = response1.cookie("hi!", "");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry8 = response1.scanHeaders("hi!");
        java.lang.String str9 = response1.charset();
        java.lang.String str10 = response1.statusMessage();
        response1.charset = "";
        java.lang.String str13 = response1.contentType;
        java.lang.String str15 = response1.getHeaderCaseInsensitive("hi!");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry17 = response1.scanHeaders("hi!");
        response1.charset = "";
        org.jsoup.helper.HttpConnection.Response response20 = new org.jsoup.helper.HttpConnection.Response(response1);
        boolean boolean21 = response20.executed;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry23 = response20.scanHeaders("");
        org.jsoup.helper.HttpConnection.Response response24 = new org.jsoup.helper.HttpConnection.Response(response20);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean26 = response24.hasHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNull(strEntry8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(strEntry17);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(strEntry23);
    }

    @Test
    public void test15212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15212");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response6 = response1.cookie("hi!", "");
        java.util.Map<java.lang.String, java.lang.String> strMap7 = response1.headers();
        java.lang.String str8 = response1.contentType();
        java.lang.String str10 = response1.header("hi!");
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response1);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response14 = response1.header("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test15213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15213");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str5 = response1.statusMessage;
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response6);
        int int8 = response7.numRedirects;
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response7);
        java.util.Map<java.lang.String, java.lang.String> strMap10 = response9.headers();
        int int11 = response9.numRedirects;
        org.jsoup.Connection.Request request12 = null;
        response9.req = request12;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
    }

    @Test
    public void test15214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15214");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str5 = response1.statusMessage;
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.util.Map<java.lang.String, java.lang.String> strMap7 = response6.headers();
        java.lang.String str8 = response6.statusMessage;
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response6);
        java.lang.String str11 = response9.getHeaderCaseInsensitive("hi!");
        org.jsoup.Connection.Response response14 = response9.header("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response9);
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response9);
        org.jsoup.Connection.Response response18 = response9.removeCookie("hi!");
        org.jsoup.Connection.Request request19 = null;
        response9.req = request19;
        java.lang.String str22 = response9.getHeaderCaseInsensitive("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertNotNull(response18);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test15215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15215");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response6 = response1.cookie("hi!", "");
        response1.contentType = "";
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Request request10 = null;
        response9.req = request10;
        int int12 = response9.statusCode();
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response9);
        response9.statusMessage = "hi!";
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response9);
        java.lang.String str18 = response16.cookie("hi!");
        java.lang.String str19 = response16.contentType;
        org.jsoup.helper.HttpConnection.Response response20 = new org.jsoup.helper.HttpConnection.Response(response16);
        org.jsoup.helper.HttpConnection.Response response21 = new org.jsoup.helper.HttpConnection.Response(response16);
        response21.statusCode = 410;
        response21.statusCode = 410;
        java.lang.String str27 = response21.header("hi!");
        response21.charset = "hi!";
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str27);
    }

    @Test
    public void test15216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15216");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map<java.lang.String, java.lang.String> strMap2 = response1.cookies();
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str5 = response4.charset;
        org.jsoup.Connection.Request request6 = response4.req;
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response4);
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response4);
        java.lang.String str9 = response4.statusMessage;
        boolean boolean11 = response4.hasHeader("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap12 = response4.cookies();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = response4.hasHeaderWithValue("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(request6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strMap12);
    }

    @Test
    public void test15217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15217");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response6 = response1.cookie("hi!", "");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry8 = response1.scanHeaders("hi!");
        java.lang.String str9 = response1.charset();
        java.lang.String str10 = response1.statusMessage();
        boolean boolean11 = response1.executed;
        java.lang.String str13 = response1.getHeaderCaseInsensitive("");
        boolean boolean16 = response1.hasHeaderWithValue("hi!", "hi!");
        int int17 = response1.numRedirects;
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.Class<?> wildcardClass19 = response1.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNull(strEntry8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test15218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15218");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response6 = response1.cookie("hi!", "");
        int int7 = response1.numRedirects;
        java.lang.String str9 = response1.header("");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry11 = response1.scanHeaders("");
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response12);
        response12.numRedirects = 406;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(strEntry11);
    }

    @Test
    public void test15219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15219");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response6 = response1.cookie("hi!", "");
        response1.contentType = "";
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response9);
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response9);
        response9.statusMessage = "";
        java.util.Map<java.lang.String, java.lang.String> strMap14 = response9.headers();
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response9);
        java.lang.String str16 = response15.statusMessage();
        org.jsoup.Connection.Method method17 = response15.method();
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response(response15);
        int int19 = response15.statusCode;
        java.util.Map<java.lang.String, java.lang.String> strMap20 = response15.cookies();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(method17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(strMap20);
    }

    @Test
    public void test15220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15220");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response4);
        response5.contentType = "";
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response5);
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response8);
        int int10 = response8.numRedirects;
        java.net.URL uRL11 = response8.url();
        java.net.URL uRL12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response13 = response8.url(uRL12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertNull(uRL11);
    }

    @Test
    public void test15221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15221");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response6 = response1.cookie("hi!", "");
        response1.contentType = "";
        boolean boolean11 = response1.hasHeaderWithValue("hi!", "");
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response12);
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response13);
        java.lang.String str15 = response13.charset();
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response13);
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response16);
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response(response17);
        boolean boolean19 = response17.executed;
        int int20 = response17.numRedirects;
        java.util.Map<java.lang.String, java.lang.String> strMap21 = response17.headers();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
        org.junit.Assert.assertNotNull(strMap21);
    }

    @Test
    public void test15222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15222");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response6 = response1.cookie("hi!", "");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry8 = response1.scanHeaders("hi!");
        java.lang.String str10 = response1.header("");
        java.lang.String str11 = response1.contentType();
        int int12 = response1.statusCode();
        java.lang.String str13 = response1.contentType;
        org.jsoup.Connection.Method method14 = response1.method();
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNull(strEntry8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(method14);
    }

    @Test
    public void test15223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15223");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str2 = response1.contentType();
        java.lang.String str4 = response1.getHeaderCaseInsensitive("hi!");
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response1);
        response1.numRedirects = (short) 1;
        boolean boolean8 = response1.executed;
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response1);
        response10.executed = false;
        response10.charset = "hi!";
        java.nio.ByteBuffer byteBuffer15 = null;
        response10.byteData = byteBuffer15;
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response10);
        org.jsoup.Connection.Request request18 = null;
        response17.req = request18;
        org.jsoup.helper.HttpConnection.Response response20 = new org.jsoup.helper.HttpConnection.Response(response17);
        java.lang.String str21 = response20.statusMessage();
        java.lang.String str23 = response20.cookie("hi!");
        java.lang.Class<?> wildcardClass24 = response20.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test15224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15224");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response6 = response1.cookie("hi!", "");
        response1.contentType = "";
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Request request10 = null;
        response9.req = request10;
        int int12 = response9.statusCode();
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response9);
        response9.statusMessage = "hi!";
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response9);
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response9);
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response(response9);
        response9.statusMessage = "hi!";
        java.net.URL uRL21 = response9.url();
        java.lang.String str22 = response9.contentType();
        java.net.URL uRL23 = response9.url();
        java.util.Map<java.lang.String, java.lang.String> strMap24 = response9.cookies();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry26 = response9.scanHeaders("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(uRL21);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(uRL23);
        org.junit.Assert.assertNotNull(strMap24);
        org.junit.Assert.assertNull(strEntry26);
    }

    @Test
    public void test15225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15225");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response6 = response1.cookie("hi!", "");
        response1.contentType = "";
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Request request10 = null;
        response9.req = request10;
        int int12 = response9.statusCode();
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response9);
        response9.statusMessage = "hi!";
        java.net.URL uRL16 = response9.url();
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response9);
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response(response17);
        java.util.Map<java.lang.String, java.lang.String> strMap19 = response17.cookies();
        org.jsoup.helper.HttpConnection.Response response20 = new org.jsoup.helper.HttpConnection.Response(response17);
        org.jsoup.Connection.Request request21 = null;
        response20.req = request21;
        org.jsoup.helper.HttpConnection.Response response23 = new org.jsoup.helper.HttpConnection.Response(response20);
        response20.charset = "";
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response28 = response20.header("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(uRL16);
        org.junit.Assert.assertNotNull(strMap19);
    }

    @Test
    public void test15226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15226");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response6 = response1.cookie("hi!", "");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry8 = response1.scanHeaders("hi!");
        java.lang.String str9 = response1.charset();
        java.lang.String str10 = response1.statusMessage();
        boolean boolean11 = response1.executed;
        java.nio.ByteBuffer byteBuffer12 = null;
        response1.byteData = byteBuffer12;
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.util.Map<java.lang.String, java.lang.String> strMap15 = response1.headers();
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response1);
        response1.statusCode = 408;
        org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response(response1);
        boolean boolean20 = response19.executed;
        java.nio.ByteBuffer byteBuffer21 = null;
        response19.byteData = byteBuffer21;
        org.jsoup.helper.HttpConnection.Response response23 = new org.jsoup.helper.HttpConnection.Response(response19);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNull(strEntry8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test15227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15227");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response6 = response1.cookie("hi!", "");
        int int7 = response1.numRedirects;
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response1);
        response1.numRedirects = (short) 1;
        java.lang.String str15 = response1.contentType();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test15228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15228");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str2 = response1.contentType();
        java.lang.String str4 = response1.getHeaderCaseInsensitive("hi!");
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response1);
        int int6 = response5.numRedirects;
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response5);
        int int8 = response5.statusCode();
        java.net.URL uRL9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response10 = response5.url(uRL9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test15229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15229");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response6 = response1.cookie("hi!", "");
        response1.contentType = "";
        boolean boolean11 = response1.hasHeaderWithValue("hi!", "");
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response12);
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response13);
        java.lang.String str15 = response13.charset;
        java.lang.String str17 = response13.header("hi!");
        java.nio.ByteBuffer byteBuffer18 = response13.byteData;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry20 = response13.scanHeaders("");
        java.lang.String str21 = response13.charset();
        response13.statusMessage = "hi!";
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(byteBuffer18);
        org.junit.Assert.assertNull(strEntry20);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test15230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15230");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean2 = response1.executed;
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response3);
        java.lang.String str5 = response4.contentType;
        org.jsoup.Connection.Request request6 = response4.req;
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response4);
        int int8 = response7.statusCode();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response10 = response7.removeCookie("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(request6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test15231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15231");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response6 = response1.cookie("hi!", "");
        response1.contentType = "";
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Request request10 = null;
        response9.req = request10;
        int int12 = response9.statusCode();
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response9);
        int int14 = response9.statusCode;
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response9);
        java.util.Map<java.lang.String, java.lang.String> strMap16 = response15.cookies();
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response15);
        response17.charset = "";
        org.jsoup.helper.HttpConnection.Response response20 = new org.jsoup.helper.HttpConnection.Response(response17);
        org.jsoup.helper.HttpConnection.Response response21 = new org.jsoup.helper.HttpConnection.Response(response17);
        response21.executed = true;
        org.jsoup.helper.HttpConnection.Response response24 = new org.jsoup.helper.HttpConnection.Response(response21);
        org.jsoup.helper.HttpConnection.Response response25 = new org.jsoup.helper.HttpConnection.Response(response24);
        org.jsoup.helper.HttpConnection.Response response26 = new org.jsoup.helper.HttpConnection.Response(response24);
        org.jsoup.Connection.Method method27 = response24.method();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertNull(method27);
    }

    @Test
    public void test15232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15232");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str5 = response1.statusMessage;
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response6);
        int int8 = response7.numRedirects;
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response7);
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response9);
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response9);
        java.net.URL uRL12 = response9.url();
        java.nio.ByteBuffer byteBuffer13 = null;
        response9.byteData = byteBuffer13;
        java.util.Map<java.lang.String, java.lang.String> strMap15 = response9.headers();
        java.lang.String str16 = response9.statusMessage();
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray17 = response9.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertNull(uRL12);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test15233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15233");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response6 = response1.cookie("hi!", "");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry8 = response1.scanHeaders("hi!");
        response1.contentType = "hi!";
        java.lang.String str11 = response1.charset();
        response1.statusCode = 412;
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response1);
        response14.charset = "hi!";
        int int17 = response14.numRedirects;
        response14.charset = "";
        org.jsoup.helper.HttpConnection.Response response20 = new org.jsoup.helper.HttpConnection.Response(response14);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNull(strEntry8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test15234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15234");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response6 = response1.cookie("hi!", "");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry8 = response1.scanHeaders("hi!");
        java.lang.String str10 = response1.header("");
        java.lang.String str11 = response1.contentType();
        int int12 = response1.statusCode();
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response1);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response15 = response1.removeCookie("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNull(strEntry8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test15235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15235");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map<java.lang.String, java.lang.String> strMap2 = response1.cookies();
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response4);
        java.util.Map<java.lang.String, java.lang.String> strMap6 = response4.headers();
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response4);
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response4);
        response8.charset = "hi!";
        java.lang.String str12 = response8.getHeaderCaseInsensitive("hi!");
        java.lang.String str13 = response8.contentType;
        org.jsoup.Connection.Request request14 = null;
        response8.req = request14;
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test15236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15236");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response4);
        response5.contentType = "";
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response5);
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response5);
        java.lang.String str10 = response5.statusMessage;
        java.nio.ByteBuffer byteBuffer11 = response5.byteData;
        response5.statusCode = 3;
        int int14 = response5.statusCode();
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response5);
        java.lang.String str16 = response5.statusMessage();
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response5);
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response(response5);
        org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response(response5);
        java.nio.ByteBuffer byteBuffer20 = null;
        response5.byteData = byteBuffer20;
        response5.executed = false;
        java.lang.String str24 = response5.contentType;
        java.lang.String str25 = response5.contentType;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test15237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15237");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response6 = response1.cookie("hi!", "");
        response1.contentType = "";
        java.util.Map<java.lang.String, java.lang.String> strMap9 = response1.cookies();
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.util.Map<java.lang.String, java.lang.String> strMap12 = response11.headers();
        response11.charset = "";
        java.lang.String str15 = response11.charset();
        java.lang.String str16 = response11.charset;
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response11);
        org.jsoup.Connection.Response response20 = response17.cookie("hi!", "");
        java.lang.String str22 = response17.getHeaderCaseInsensitive("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(response20);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test15238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15238");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response6 = response1.cookie("hi!", "");
        int int7 = response1.numRedirects;
        java.lang.String str9 = response1.header("");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry11 = response1.scanHeaders("");
        boolean boolean14 = response1.hasHeaderWithValue("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response1);
        response1.statusMessage = "";
        java.lang.String str18 = response1.charset();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(strEntry11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test15239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15239");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str2 = response1.contentType();
        java.lang.String str4 = response1.getHeaderCaseInsensitive("hi!");
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response1);
        response1.numRedirects = (short) 1;
        boolean boolean8 = response1.executed;
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Response response14 = response1.cookie("hi!", "");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(response14);
    }

    @Test
    public void test15240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15240");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response6 = response1.cookie("hi!", "");
        int int7 = response1.numRedirects;
        java.lang.String str9 = response1.header("");
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response1);
        response1.statusMessage = "hi!";
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = response1.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test15241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15241");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response6 = response1.cookie("hi!", "");
        response1.contentType = "";
        java.util.Map<java.lang.String, java.lang.String> strMap9 = response1.cookies();
        boolean boolean11 = response1.hasHeader("hi!");
        response1.charset = "hi!";
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str16 = response1.statusMessage;
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test15242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15242");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response6 = response1.cookie("hi!", "");
        int int7 = response1.numRedirects;
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response1);
        response8.statusCode = 403;
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response8);
        int int12 = response11.statusCode;
        java.lang.String str14 = response11.getHeaderCaseInsensitive("hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test15243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15243");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map<java.lang.String, java.lang.String> strMap2 = response1.cookies();
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response4);
        java.util.Map<java.lang.String, java.lang.String> strMap6 = response5.headers();
        response5.charset = "hi!";
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response5);
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response5);
        java.lang.String str11 = response10.charset;
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response10);
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response10);
        java.lang.String str14 = response13.contentType;
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test15244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15244");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response6 = response1.cookie("hi!", "");
        response1.contentType = "";
        boolean boolean11 = response1.hasHeaderWithValue("hi!", "");
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.nio.ByteBuffer byteBuffer13 = response12.byteData;
        java.util.Map<java.lang.String, java.lang.String> strMap14 = response12.headers();
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response12);
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response15);
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry18 = response16.scanHeaders("hi!");
        int int19 = response16.statusCode;
        org.jsoup.Connection.Method method20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response21 = response16.method(method20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(byteBuffer13);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNull(strEntry18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test15245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15245");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response6 = response1.cookie("hi!", "");
        int int7 = response1.numRedirects;
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response1);
        response1.statusCode = (byte) 1;
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry16 = response1.scanHeaders("hi!");
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(strEntry16);
    }

    @Test
    public void test15246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15246");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response6 = response1.cookie("hi!", "");
        int int7 = response1.numRedirects;
        java.lang.String str9 = response1.header("");
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response1);
        int int11 = response10.statusCode();
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response10);
        java.lang.String str14 = response10.cookie("hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test15247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15247");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response6 = response1.cookie("hi!", "");
        int int7 = response1.numRedirects;
        java.lang.String str8 = response1.statusMessage();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry10 = response1.scanHeaders("hi!");
        java.lang.String str12 = response1.header("");
        java.lang.String str13 = response1.charset;
        response1.numRedirects = 0;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry17 = response1.scanHeaders("hi!");
        java.lang.String str18 = response1.charset();
        java.net.URL uRL19 = response1.url();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(strEntry10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(strEntry17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(uRL19);
    }

    @Test
    public void test15248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15248");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str4 = response2.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response7 = response2.cookie("hi!", "");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry9 = response2.scanHeaders("hi!");
        java.lang.String str10 = response2.charset();
        java.lang.String str11 = response2.statusMessage();
        boolean boolean12 = response2.executed;
        java.lang.String str14 = response2.getHeaderCaseInsensitive("");
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response2);
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response15);
        java.lang.String str18 = response16.getHeaderCaseInsensitive("hi!");
        java.lang.String str19 = response16.charset();
        org.jsoup.Connection.Request request20 = response16.req;
        java.nio.ByteBuffer byteBuffer21 = response16.byteData;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response22 = org.jsoup.helper.HttpConnection.Response.execute(request0, response16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(strEntry9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(request20);
        org.junit.Assert.assertNull(byteBuffer21);
    }

    @Test
    public void test15249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15249");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response6 = response1.cookie("hi!", "");
        response1.contentType = "";
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Request request10 = null;
        response9.req = request10;
        java.lang.String str13 = response9.getHeaderCaseInsensitive("");
        java.lang.String str14 = response9.contentType;
        java.lang.String str15 = response9.charset();
        response9.contentType = "hi!";
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response(response9);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test15250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15250");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response6 = response1.cookie("hi!", "");
        response1.contentType = "";
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Request request10 = null;
        response9.req = request10;
        int int12 = response9.statusCode();
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response9);
        int int14 = response9.statusCode;
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response9);
        java.util.Map<java.lang.String, java.lang.String> strMap16 = response15.cookies();
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response15);
        response17.charset = "";
        org.jsoup.helper.HttpConnection.Response response20 = new org.jsoup.helper.HttpConnection.Response(response17);
        org.jsoup.helper.HttpConnection.Response response21 = new org.jsoup.helper.HttpConnection.Response(response17);
        java.nio.ByteBuffer byteBuffer22 = response17.byteData;
        org.jsoup.helper.HttpConnection.Response response23 = new org.jsoup.helper.HttpConnection.Response(response17);
        java.util.Map<java.lang.String, java.lang.String> strMap24 = response23.headers();
        org.jsoup.helper.HttpConnection.Response response25 = new org.jsoup.helper.HttpConnection.Response(response23);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response28 = response23.header("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertNull(byteBuffer22);
        org.junit.Assert.assertNotNull(strMap24);
    }

    @Test
    public void test15251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15251");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response6 = response1.cookie("hi!", "");
        response1.contentType = "";
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str11 = response1.charset();
        response1.contentType = "";
        java.util.Map<java.lang.String, java.lang.String> strMap14 = response1.headers();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response16 = response1.removeHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(strMap14);
    }

    @Test
    public void test15252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15252");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response6 = response1.cookie("hi!", "");
        int int7 = response1.numRedirects;
        java.lang.String str8 = response1.statusMessage();
        org.jsoup.Connection.Method method9 = response1.method();
        boolean boolean10 = response1.executed;
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str13 = response11.getHeaderCaseInsensitive("");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry15 = response11.scanHeaders("hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(strEntry15);
    }

    @Test
    public void test15253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15253");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response6 = response1.cookie("hi!", "");
        response1.contentType = "";
        boolean boolean11 = response1.hasHeaderWithValue("hi!", "");
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response12);
        java.lang.String str14 = response12.contentType;
        response12.statusMessage = "";
        org.jsoup.Connection.Request request17 = null;
        response12.req = request17;
        org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response(response12);
        org.jsoup.helper.HttpConnection.Response response20 = new org.jsoup.helper.HttpConnection.Response(response12);
        org.jsoup.helper.HttpConnection.Response response21 = new org.jsoup.helper.HttpConnection.Response(response20);
        org.jsoup.helper.HttpConnection.Response response22 = new org.jsoup.helper.HttpConnection.Response(response20);
        org.jsoup.helper.HttpConnection.Response response23 = new org.jsoup.helper.HttpConnection.Response(response20);
        org.jsoup.helper.HttpConnection.Response response24 = new org.jsoup.helper.HttpConnection.Response(response20);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test15254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15254");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response6 = response1.cookie("hi!", "");
        int int7 = response1.numRedirects;
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response1);
        response8.executed = false;
        int int11 = response8.numRedirects;
        java.util.Map<java.lang.String, java.lang.String> strMap12 = response8.headers();
        int int13 = response8.numRedirects;
        response8.executed = true;
        int int16 = response8.statusCode();
        java.lang.String str17 = response8.charset();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test15255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15255");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        java.lang.String str4 = response1.contentType();
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Request request6 = null;
        response1.req = request6;
        org.jsoup.Connection.Request request8 = null;
        response1.req = request8;
        java.lang.String str10 = response1.statusMessage();
        response1.numRedirects = (-1);
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Method method14 = response1.method();
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response15);
        response16.executed = true;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(method14);
    }

    @Test
    public void test15256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15256");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        java.lang.String str4 = response1.contentType();
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response1);
        response5.charset = "";
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response5);
        int int9 = response8.statusCode();
        java.nio.ByteBuffer byteBuffer10 = null;
        response8.byteData = byteBuffer10;
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response8);
        response12.statusCode = 'a';
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response12);
        org.jsoup.Connection.Request request16 = null;
        response15.req = request16;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test15257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15257");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response6 = response1.cookie("hi!", "");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry8 = response1.scanHeaders("hi!");
        java.lang.String str9 = response1.charset();
        java.lang.String str10 = response1.statusMessage();
        org.jsoup.Connection.Response response12 = response1.removeCookie("hi!");
        response1.statusCode = 404;
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response1);
        response16.executed = false;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = response16.hasHeaderWithValue("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNull(strEntry8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(response12);
    }

    @Test
    public void test15258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15258");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Method method2 = response1.method();
        java.lang.String str4 = response1.cookie("hi!");
        java.lang.String str5 = response1.statusMessage;
        int int6 = response1.numRedirects;
        org.jsoup.Connection.Request request7 = response1.req;
        java.util.Map<java.lang.String, java.lang.String> strMap8 = response1.cookies();
        java.nio.ByteBuffer byteBuffer9 = response1.byteData;
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(request7);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNull(byteBuffer9);
    }

    @Test
    public void test15259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15259");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response1);
        int int5 = response1.numRedirects;
        response1.charset = "hi!";
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.net.URL uRL9 = response8.url();
        org.jsoup.Connection.Response response11 = response8.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response8);
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response8);
        int int14 = response8.numRedirects;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test15260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15260");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response4);
        response5.contentType = "";
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response5);
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response5);
        java.lang.String str10 = response5.statusMessage;
        java.nio.ByteBuffer byteBuffer11 = response5.byteData;
        response5.statusCode = 3;
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response5);
        java.util.Map<java.lang.String, java.lang.String> strMap15 = response5.cookies();
        int int16 = response5.statusCode;
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response5);
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response(response5);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
    }

    @Test
    public void test15261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15261");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean2 = response1.executed;
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response3);
        org.jsoup.Connection.Response response6 = response4.removeCookie("hi!");
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response4);
        java.lang.String str9 = response4.cookie("hi!");
        boolean boolean11 = response4.hasCookie("hi!");
        boolean boolean12 = response4.executed;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test15262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15262");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        java.lang.String str4 = response1.contentType();
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Request request6 = null;
        response1.req = request6;
        org.jsoup.Connection.Request request8 = null;
        response1.req = request8;
        response1.contentType = "";
        response1.executed = true;
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response1);
        boolean boolean15 = response1.executed;
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry18 = response16.scanHeaders("hi!");
        org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response(response16);
        java.nio.ByteBuffer byteBuffer20 = null;
        response16.byteData = byteBuffer20;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(strEntry18);
    }

    @Test
    public void test15263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15263");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map<java.lang.String, java.lang.String> strMap2 = response1.cookies();
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response4);
        java.util.Map<java.lang.String, java.lang.String> strMap6 = response5.headers();
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response5);
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response5);
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response8);
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response8);
        java.lang.String str12 = response8.getHeaderCaseInsensitive("");
        java.lang.String str13 = response8.charset();
        int int14 = response8.numRedirects;
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
    }

    @Test
    public void test15264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15264");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response4);
        response5.contentType = "";
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response5);
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response5);
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response5);
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response10);
        response11.statusMessage = "";
        java.net.HttpURLConnection httpURLConnection14 = null;
        org.jsoup.helper.HttpConnection.Response response15 = null;
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response15);
        java.lang.String str18 = response16.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response21 = response16.cookie("hi!", "");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry23 = response16.scanHeaders("hi!");
        java.lang.String str24 = response16.charset();
        java.lang.String str25 = response16.statusMessage();
        response16.charset = "";
        java.lang.String str28 = response16.contentType;
        java.lang.String str30 = response16.getHeaderCaseInsensitive("hi!");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry32 = response16.scanHeaders("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap33 = response16.cookies();
        java.lang.String str35 = response16.header("");
        response16.statusCode = 0;
        java.lang.String str39 = response16.getHeaderCaseInsensitive("");
        response16.contentType = "hi!";
        response16.statusCode = 400;
        int int44 = response16.statusCode();
        // The following exception was thrown during execution in test generation
        try {
            response11.setupFromConnection(httpURLConnection14, (org.jsoup.Connection.Response) response16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(response21);
        org.junit.Assert.assertNull(strEntry23);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNull(strEntry32);
        org.junit.Assert.assertNotNull(strMap33);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 400 + "'", int44 == 400);
    }

    @Test
    public void test15265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15265");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str2 = response1.contentType();
        java.lang.String str4 = response1.getHeaderCaseInsensitive("hi!");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry6 = response1.scanHeaders("");
        java.lang.String str8 = response1.getHeaderCaseInsensitive("");
        response1.statusCode = 400;
        org.jsoup.Connection.Method method11 = response1.method();
        java.net.URL uRL12 = response1.url();
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response1);
        response1.statusCode = 302;
        java.net.URL uRL16 = response1.url();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(strEntry6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(method11);
        org.junit.Assert.assertNull(uRL12);
        org.junit.Assert.assertNull(uRL16);
    }

    @Test
    public void test15266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15266");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response4);
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response4);
        org.jsoup.Connection.Method method7 = response4.method();
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response4);
        java.nio.ByteBuffer byteBuffer9 = response4.byteData;
        org.jsoup.Connection.Response response11 = response4.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response4);
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response12);
        java.lang.String str14 = response12.charset;
        boolean boolean16 = response12.hasHeader("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap17 = response12.cookies();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(byteBuffer9);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(strMap17);
    }

    @Test
    public void test15267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15267");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response6 = response1.cookie("hi!", "");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry8 = response1.scanHeaders("hi!");
        response1.contentType = "hi!";
        java.lang.String str11 = response1.charset();
        response1.statusCode = 412;
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response1);
        response14.charset = "hi!";
        response14.charset = "";
        response14.charset = "hi!";
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNull(strEntry8);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test15268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15268");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response1);
        int int5 = response1.numRedirects;
        response1.charset = "hi!";
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.net.URL uRL9 = response8.url();
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response8);
        int int11 = response10.statusCode;
        boolean boolean12 = response10.executed;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document13 = response10.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test15269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15269");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response6 = response1.cookie("hi!", "");
        response1.contentType = "";
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Request request10 = null;
        response9.req = request10;
        int int12 = response9.statusCode();
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response9);
        response9.statusMessage = "hi!";
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response9);
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response9);
        org.jsoup.Connection.Request request18 = null;
        response17.req = request18;
        java.nio.ByteBuffer byteBuffer20 = null;
        response17.byteData = byteBuffer20;
        org.jsoup.Connection.Request request22 = null;
        response17.req = request22;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test15270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15270");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response6 = response1.cookie("hi!", "");
        response1.contentType = "";
        boolean boolean11 = response1.hasHeaderWithValue("hi!", "");
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response12);
        java.lang.String str14 = response13.contentType;
        int int15 = response13.statusCode;
        java.lang.String str16 = response13.contentType();
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response13);
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response(response17);
        response17.contentType = "";
        org.jsoup.helper.HttpConnection.Response response21 = new org.jsoup.helper.HttpConnection.Response(response17);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test15271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15271");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str2 = response1.contentType();
        java.lang.String str4 = response1.getHeaderCaseInsensitive("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap5 = response1.cookies();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response1);
        int int7 = response1.statusCode();
        response1.numRedirects = (-1);
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.net.URL uRL11 = response10.url();
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response10);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray13 = response10.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(uRL11);
    }

    @Test
    public void test15272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15272");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str5 = response1.statusMessage;
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.util.Map<java.lang.String, java.lang.String> strMap7 = response6.headers();
        java.lang.String str8 = response6.statusMessage;
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response6);
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response6);
        java.nio.ByteBuffer byteBuffer11 = response6.byteData;
        org.jsoup.Connection.Request request12 = null;
        response6.req = request12;
        java.lang.String str14 = response6.contentType();
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response6);
        java.lang.String str16 = response6.charset();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test15273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15273");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response4);
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response4);
        org.jsoup.Connection.Method method7 = response4.method();
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response4);
        java.nio.ByteBuffer byteBuffer9 = response4.byteData;
        org.jsoup.Connection.Response response11 = response4.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response4);
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response12);
        java.lang.String str14 = response12.contentType;
        java.lang.String str15 = response12.statusMessage();
        java.lang.String str16 = response12.statusMessage;
        response12.statusCode = (-1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(byteBuffer9);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test15274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15274");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response6 = response1.cookie("hi!", "");
        java.util.Map<java.lang.String, java.lang.String> strMap7 = response1.headers();
        org.jsoup.Connection.Response response10 = response1.header("hi!", "hi!");
        response1.statusCode = 0;
        java.lang.String str13 = response1.contentType();
        response1.numRedirects = 'a';
        java.lang.String str17 = response1.header("hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test15275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15275");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str5 = response1.statusMessage;
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.util.Map<java.lang.String, java.lang.String> strMap7 = response6.headers();
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response6);
        int int9 = response8.statusCode();
        java.nio.ByteBuffer byteBuffer10 = null;
        response8.byteData = byteBuffer10;
        java.lang.String str12 = response8.contentType();
        java.lang.String str13 = response8.statusMessage();
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray14 = response8.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test15276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15276");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str5 = response1.statusMessage;
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.util.Map<java.lang.String, java.lang.String> strMap7 = response6.headers();
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response6);
        int int9 = response8.statusCode();
        int int10 = response8.statusCode();
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response8);
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response8);
        java.nio.ByteBuffer byteBuffer13 = null;
        response12.byteData = byteBuffer13;
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response12);
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response15);
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response15);
        response17.charset = "hi!";
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test15277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15277");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map<java.lang.String, java.lang.String> strMap2 = response1.cookies();
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response4);
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry7 = response4.scanHeaders("hi!");
        int int8 = response4.numRedirects;
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response4);
        response4.statusCode = 6;
        java.nio.ByteBuffer byteBuffer12 = null;
        response4.byteData = byteBuffer12;
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response4);
        java.net.HttpURLConnection httpURLConnection15 = null;
        org.jsoup.helper.HttpConnection.Response response16 = null;
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response16);
        java.lang.String str19 = response17.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response22 = response17.cookie("hi!", "");
        int int23 = response17.numRedirects;
        org.jsoup.helper.HttpConnection.Response response24 = new org.jsoup.helper.HttpConnection.Response(response17);
        org.jsoup.helper.HttpConnection.Response response25 = new org.jsoup.helper.HttpConnection.Response(response17);
        org.jsoup.Connection.Request request26 = response17.req;
        org.jsoup.helper.HttpConnection.Response response27 = new org.jsoup.helper.HttpConnection.Response(response17);
        java.net.URL uRL28 = response27.url();
        java.nio.ByteBuffer byteBuffer29 = null;
        response27.byteData = byteBuffer29;
        int int31 = response27.statusCode();
        // The following exception was thrown during execution in test generation
        try {
            response14.setupFromConnection(httpURLConnection15, (org.jsoup.Connection.Response) response27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNull(strEntry7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(response22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNull(request26);
        org.junit.Assert.assertNull(uRL28);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
    }

    @Test
    public void test15278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15278");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response4);
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response5);
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response6);
        java.nio.ByteBuffer byteBuffer8 = null;
        response6.byteData = byteBuffer8;
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response6);
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response10);
        response10.contentType = "hi!";
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response10);
        int int15 = response10.numRedirects;
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response10);
        boolean boolean17 = response16.executed;
        org.jsoup.Connection.Response response20 = response16.cookie("hi!", "");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(response20);
    }

    @Test
    public void test15279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15279");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response6 = response1.cookie("hi!", "");
        response1.contentType = "";
        boolean boolean11 = response1.hasHeaderWithValue("hi!", "");
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response12);
        java.lang.String str14 = response13.contentType;
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response13);
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response15);
        boolean boolean17 = response16.executed;
        java.net.URL uRL18 = response16.url();
        org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response(response16);
        org.jsoup.Connection.Request request20 = null;
        response19.req = request20;
        response19.statusCode = 10;
        java.nio.ByteBuffer byteBuffer24 = null;
        response19.byteData = byteBuffer24;
        java.lang.String str26 = response19.contentType;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(uRL18);
        org.junit.Assert.assertNull(str26);
    }

    @Test
    public void test15280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15280");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response6 = response1.cookie("hi!", "");
        int int7 = response1.numRedirects;
        java.lang.String str8 = response1.statusMessage();
        java.lang.String str9 = response1.contentType;
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Request request11 = null;
        response10.req = request11;
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response10);
        java.nio.ByteBuffer byteBuffer14 = response13.byteData;
        org.jsoup.Connection.Response response17 = response13.cookie("hi!", "");
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response(response13);
        org.jsoup.Connection.Request request19 = null;
        response18.req = request19;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(byteBuffer14);
        org.junit.Assert.assertNotNull(response17);
    }

    @Test
    public void test15281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15281");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response6 = response1.cookie("hi!", "");
        int int7 = response1.numRedirects;
        java.lang.String str8 = response1.statusMessage();
        java.lang.String str9 = response1.charset;
        java.lang.String str10 = response1.contentType;
        int int11 = response1.statusCode();
        response1.contentType = "hi!";
        org.jsoup.Connection.Response response16 = response1.cookie("hi!", "hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(response16);
    }

    @Test
    public void test15282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15282");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response6 = response1.cookie("hi!", "");
        int int7 = response1.numRedirects;
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str12 = response10.header("");
        int int13 = response10.statusCode();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry15 = response10.scanHeaders("");
        java.lang.String str16 = response10.charset();
        java.net.URL uRL17 = response10.url();
        response10.contentType = "hi!";
        java.util.Map<java.lang.String, java.lang.String> strMap20 = response10.headers();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(strEntry15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(uRL17);
        org.junit.Assert.assertNotNull(strMap20);
    }

    @Test
    public void test15283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15283");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response6 = response1.cookie("hi!", "");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry8 = response1.scanHeaders("hi!");
        java.lang.String str9 = response1.charset();
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response12);
        response13.contentType = "";
        int int16 = response13.statusCode();
        int int17 = response13.statusCode();
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response(response13);
        org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response(response13);
        org.jsoup.Connection.Method method20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response21 = response19.method(method20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNull(strEntry8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test15284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15284");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str2 = response1.contentType();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry4 = response1.scanHeaders("");
        java.lang.String str5 = response1.charset();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response7);
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response8);
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response9);
        java.lang.String str11 = response9.charset();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(strEntry4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test15285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15285");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response6 = response1.cookie("hi!", "");
        int int7 = response1.numRedirects;
        java.lang.String str8 = response1.statusMessage();
        java.net.URL uRL9 = response1.url();
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.net.HttpURLConnection httpURLConnection11 = null;
        org.jsoup.helper.HttpConnection.Response response12 = null;
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response12);
        java.lang.String str15 = response13.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response18 = response13.cookie("hi!", "");
        response13.contentType = "";
        org.jsoup.helper.HttpConnection.Response response21 = new org.jsoup.helper.HttpConnection.Response(response13);
        org.jsoup.Connection.Request request22 = null;
        response21.req = request22;
        int int24 = response21.statusCode();
        org.jsoup.helper.HttpConnection.Response response25 = new org.jsoup.helper.HttpConnection.Response(response21);
        response21.statusMessage = "hi!";
        org.jsoup.helper.HttpConnection.Response response28 = new org.jsoup.helper.HttpConnection.Response(response21);
        org.jsoup.helper.HttpConnection.Response response29 = new org.jsoup.helper.HttpConnection.Response(response21);
        org.jsoup.helper.HttpConnection.Response response30 = new org.jsoup.helper.HttpConnection.Response(response21);
        response21.statusMessage = "hi!";
        org.jsoup.helper.HttpConnection.Response response33 = new org.jsoup.helper.HttpConnection.Response(response21);
        org.jsoup.helper.HttpConnection.Response response34 = new org.jsoup.helper.HttpConnection.Response(response33);
        org.jsoup.helper.HttpConnection.Response response35 = new org.jsoup.helper.HttpConnection.Response(response33);
        response33.executed = false;
        // The following exception was thrown during execution in test generation
        try {
            response10.setupFromConnection(httpURLConnection11, (org.jsoup.Connection.Response) response33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(response18);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test15286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15286");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response6 = response1.cookie("hi!", "");
        int int7 = response1.numRedirects;
        java.lang.String str8 = response1.statusMessage();
        java.lang.String str9 = response1.contentType;
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response1);
        boolean boolean12 = response10.hasHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response10);
        org.jsoup.Connection.Request request14 = null;
        response13.req = request14;
        response13.charset = "hi!";
        java.lang.String str18 = response13.statusMessage;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test15287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15287");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str5 = response1.statusMessage;
        response1.executed = false;
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response1);
        response1.statusCode = 205;
        boolean boolean11 = response1.executed;
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Request request13 = response1.req;
        response1.statusCode = (short) 0;
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Request request17 = null;
        response1.req = request17;
        java.lang.String str19 = response1.contentType;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = response1.hasHeaderWithValue("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(request13);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test15288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15288");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response6 = response1.cookie("hi!", "");
        int int7 = response1.numRedirects;
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response1);
        response8.executed = false;
        java.lang.String str11 = response8.contentType();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry13 = response8.scanHeaders("");
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response8);
        boolean boolean15 = response14.executed;
        java.lang.String str16 = response14.statusMessage;
        java.lang.String str17 = response14.charset();
        java.lang.String str18 = response14.contentType();
        org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response(response14);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(strEntry13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test15289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15289");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response6 = response1.cookie("hi!", "");
        response1.contentType = "";
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str11 = response1.charset;
        java.nio.ByteBuffer byteBuffer12 = response1.byteData;
        java.lang.String str13 = response1.charset;
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response1);
        response1.charset = "";
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response(response1);
        response1.executed = false;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(byteBuffer12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test15290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15290");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str5 = response1.statusMessage;
        response1.executed = false;
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str11 = response9.getHeaderCaseInsensitive("hi!");
        int int12 = response9.numRedirects;
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response9);
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response9);
        java.lang.String str15 = response9.statusMessage;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test15291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15291");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response6 = response1.cookie("hi!", "");
        int int7 = response1.numRedirects;
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str12 = response10.header("");
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response10);
        java.lang.String str14 = response10.contentType;
        java.lang.String str15 = response10.contentType();
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response10);
        org.jsoup.Connection.Request request17 = null;
        response10.req = request17;
        org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response(response10);
        java.lang.String str20 = response10.contentType;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test15292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15292");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response6 = response1.cookie("hi!", "");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry8 = response1.scanHeaders("hi!");
        java.lang.String str9 = response1.charset();
        java.lang.String str10 = response1.statusMessage();
        response1.statusMessage = "";
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response13);
        org.jsoup.Connection.Request request15 = null;
        response14.req = request15;
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response14);
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response(response17);
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry20 = response18.scanHeaders("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNull(strEntry8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(strEntry20);
    }

    @Test
    public void test15293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15293");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response6 = response1.cookie("hi!", "");
        response1.contentType = "";
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Request request10 = null;
        response9.req = request10;
        int int12 = response9.statusCode();
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response9);
        response9.statusMessage = "hi!";
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response9);
        java.lang.String str18 = response16.cookie("hi!");
        java.lang.String str19 = response16.contentType;
        org.jsoup.helper.HttpConnection.Response response20 = new org.jsoup.helper.HttpConnection.Response(response16);
        org.jsoup.Connection.Request request21 = null;
        response16.req = request21;
        org.jsoup.helper.HttpConnection.Response response23 = new org.jsoup.helper.HttpConnection.Response(response16);
        org.jsoup.Connection.Response response26 = response23.header("hi!", "hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(response26);
    }

    @Test
    public void test15294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15294");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response6 = response1.cookie("hi!", "");
        response1.contentType = "";
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Request request10 = null;
        response9.req = request10;
        int int12 = response9.statusCode();
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response9);
        response9.statusMessage = "hi!";
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response9);
        java.lang.String str18 = response16.cookie("hi!");
        org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response(response16);
        org.jsoup.helper.HttpConnection.Response response20 = new org.jsoup.helper.HttpConnection.Response(response19);
        java.lang.String str22 = response20.header("hi!");
        org.jsoup.helper.HttpConnection.Response response23 = new org.jsoup.helper.HttpConnection.Response(response20);
        java.lang.String str24 = response20.charset();
        org.jsoup.Connection.Method method25 = response20.method();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(method25);
    }

    @Test
    public void test15295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15295");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response4);
        response5.contentType = "";
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response5);
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response5);
        java.lang.String str10 = response5.statusMessage;
        java.nio.ByteBuffer byteBuffer11 = response5.byteData;
        response5.statusCode = 3;
        int int14 = response5.statusCode();
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response5);
        java.lang.String str16 = response5.contentType;
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response5);
        java.lang.String str18 = response5.statusMessage();
        org.jsoup.Connection.Method method19 = response5.method();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response21 = response5.removeCookie("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(method19);
    }

    @Test
    public void test15296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15296");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.util.Map<java.lang.String, java.lang.String> strMap5 = response4.headers();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response4);
        int int7 = response4.numRedirects;
        java.nio.ByteBuffer byteBuffer8 = response4.byteData;
        java.util.Map<java.lang.String, java.lang.String> strMap9 = response4.cookies();
        response4.statusMessage = "";
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(byteBuffer8);
        org.junit.Assert.assertNotNull(strMap9);
    }

    @Test
    public void test15297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15297");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        java.lang.String str4 = response1.contentType();
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Request request6 = null;
        response1.req = request6;
        org.jsoup.Connection.Request request8 = null;
        response1.req = request8;
        java.lang.String str10 = response1.statusMessage();
        response1.numRedirects = (-1);
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str14 = response13.statusMessage();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry16 = response13.scanHeaders("");
        java.util.Map<java.lang.String, java.lang.String> strMap17 = response13.headers();
        response13.statusMessage = "hi!";
        org.jsoup.helper.HttpConnection.Response response20 = new org.jsoup.helper.HttpConnection.Response(response13);
        org.jsoup.Connection.Request request21 = null;
        response20.req = request21;
        java.lang.String str23 = response20.contentType();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(strEntry16);
        org.junit.Assert.assertNotNull(strMap17);
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test15298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15298");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response6 = response1.cookie("hi!", "");
        response1.contentType = "";
        boolean boolean11 = response1.hasHeaderWithValue("hi!", "");
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response12);
        java.lang.String str14 = response12.contentType;
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response12);
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response15);
        boolean boolean17 = response15.executed;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test15299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15299");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response6 = response1.cookie("hi!", "");
        response1.executed = true;
        java.net.URL uRL9 = response1.url();
        int int10 = response1.statusCode;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test15300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15300");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response6 = response1.cookie("hi!", "");
        response1.contentType = "";
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str11 = response1.charset;
        java.nio.ByteBuffer byteBuffer12 = response1.byteData;
        java.lang.String str13 = response1.charset;
        int int14 = response1.statusCode;
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Request request16 = null;
        response15.req = request16;
        int int18 = response15.statusCode;
        org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response(response15);
        response15.charset = "";
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(byteBuffer12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test15301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15301");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map<java.lang.String, java.lang.String> strMap2 = response1.cookies();
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response4);
        java.util.Map<java.lang.String, java.lang.String> strMap6 = response5.headers();
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response5);
        java.lang.String str8 = response7.charset();
        java.nio.ByteBuffer byteBuffer9 = response7.byteData;
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(byteBuffer9);
    }

    @Test
    public void test15302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15302");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        java.lang.String str4 = response1.contentType();
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response1);
        response5.contentType = "";
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response5);
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response5);
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response9);
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response10);
        java.lang.String str12 = response11.charset;
        response11.charset = "";
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test15303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15303");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        java.lang.String str4 = response1.contentType();
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.nio.ByteBuffer byteBuffer6 = response5.byteData;
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response5);
        int int8 = response5.numRedirects;
        java.lang.String str10 = response5.cookie("hi!");
        org.jsoup.Connection.Request request11 = null;
        response5.req = request11;
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response5);
        int int14 = response5.statusCode;
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response5);
        java.nio.ByteBuffer byteBuffer16 = response15.byteData;
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response15);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(byteBuffer6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(byteBuffer16);
    }

    @Test
    public void test15304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15304");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Response response6 = response4.removeCookie("hi!");
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response4);
        java.nio.ByteBuffer byteBuffer8 = response4.byteData;
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response4);
        java.lang.String str11 = response9.cookie("hi!");
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response9);
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response12);
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response12);
        java.net.URL uRL15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response16 = response14.url(uRL15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNull(byteBuffer8);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test15305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15305");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str2 = response1.contentType();
        java.lang.String str4 = response1.getHeaderCaseInsensitive("hi!");
        org.jsoup.Connection.Response response6 = response1.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response1);
        int int8 = response7.numRedirects;
        java.net.URL uRL9 = response7.url();
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = response10.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNull(uRL9);
    }

    @Test
    public void test15306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15306");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str4 = response2.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response7 = response2.cookie("hi!", "");
        response2.contentType = "";
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response2);
        org.jsoup.Connection.Request request11 = null;
        response10.req = request11;
        int int13 = response10.statusCode();
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response10);
        int int15 = response10.statusCode;
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response10);
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response10);
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response(response17);
        org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response(response17);
        org.jsoup.helper.HttpConnection.Response response20 = new org.jsoup.helper.HttpConnection.Response(response17);
        boolean boolean21 = response17.executed;
        java.lang.String str23 = response17.header("hi!");
        response17.numRedirects = 201;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response26 = org.jsoup.helper.HttpConnection.Response.execute(request0, response17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test15307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15307");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response6 = response1.cookie("hi!", "");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry8 = response1.scanHeaders("hi!");
        java.lang.String str9 = response1.charset();
        java.lang.String str10 = response1.statusMessage();
        boolean boolean11 = response1.executed;
        java.nio.ByteBuffer byteBuffer12 = null;
        response1.byteData = byteBuffer12;
        int int14 = response1.numRedirects;
        org.jsoup.Connection.Request request15 = response1.req;
        org.jsoup.Connection.Request request16 = response1.req;
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response(response17);
        org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response(response18);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response22 = response19.cookie("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNull(strEntry8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(request15);
        org.junit.Assert.assertNull(request16);
    }

    @Test
    public void test15308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15308");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.util.Map<java.lang.String, java.lang.String> strMap5 = response4.headers();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response4);
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response6);
        org.jsoup.Connection.Request request8 = response6.req;
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response6);
        java.lang.String str11 = response9.getHeaderCaseInsensitive("");
        java.util.Map<java.lang.String, java.lang.String> strMap12 = response9.cookies();
        org.jsoup.Connection.Response response15 = response9.cookie("hi!", "hi!");
        java.lang.String str17 = response9.getHeaderCaseInsensitive("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response20 = response9.header("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNull(request8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test15309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15309");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response6 = response1.cookie("hi!", "");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry8 = response1.scanHeaders("hi!");
        java.lang.String str9 = response1.charset();
        java.lang.String str11 = response1.getHeaderCaseInsensitive("hi!");
        java.lang.String str12 = response1.charset();
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response13);
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response13);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNull(strEntry8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test15310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15310");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response6 = response1.cookie("hi!", "");
        response1.contentType = "";
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Request request10 = null;
        response9.req = request10;
        int int12 = response9.statusCode();
        java.util.Map<java.lang.String, java.lang.String> strMap13 = response9.cookies();
        java.lang.String str15 = response9.header("hi!");
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response9);
        int int17 = response9.statusCode;
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response(response9);
        org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response(response18);
        response18.executed = true;
        int int22 = response18.statusCode();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test15311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15311");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response6 = response1.cookie("hi!", "");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry8 = response1.scanHeaders("hi!");
        java.lang.String str9 = response1.charset();
        java.lang.String str10 = response1.statusMessage();
        response1.charset = "";
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response1);
        boolean boolean14 = response1.executed;
        boolean boolean15 = response1.executed;
        java.nio.ByteBuffer byteBuffer16 = response1.byteData;
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str18 = response17.statusMessage();
        java.lang.String str19 = response17.contentType;
        java.lang.String str20 = response17.statusMessage();
        org.jsoup.Connection.Method method21 = response17.method();
        int int22 = response17.statusCode;
        org.jsoup.helper.HttpConnection.Response response23 = new org.jsoup.helper.HttpConnection.Response(response17);
        int int24 = response17.statusCode();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNull(strEntry8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(byteBuffer16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(method21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test15312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15312");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str5 = response1.statusMessage;
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.util.Map<java.lang.String, java.lang.String> strMap7 = response6.headers();
        java.lang.String str8 = response6.statusMessage;
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response6);
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response6);
        response10.contentType = "";
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response10);
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response13);
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response14);
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response15);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test15313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15313");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response6 = response1.cookie("hi!", "");
        response1.contentType = "";
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Request request10 = null;
        response9.req = request10;
        int int12 = response9.statusCode();
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response9);
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response9);
        org.jsoup.Connection.Request request15 = null;
        response9.req = request15;
        int int17 = response9.statusCode;
        org.jsoup.Connection.Response response19 = response9.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response20 = new org.jsoup.helper.HttpConnection.Response(response9);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(response19);
    }

    @Test
    public void test15314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15314");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response6 = response1.cookie("hi!", "");
        response1.contentType = "";
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Request request10 = null;
        response9.req = request10;
        int int12 = response9.statusCode();
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response9);
        java.nio.ByteBuffer byteBuffer14 = response13.byteData;
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response13);
        boolean boolean16 = response13.executed;
        org.jsoup.Connection.Response response19 = response13.cookie("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Response response20 = new org.jsoup.helper.HttpConnection.Response(response13);
        java.lang.String str21 = response20.charset();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(byteBuffer14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(response19);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test15315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15315");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response6 = response1.cookie("hi!", "");
        int int7 = response1.numRedirects;
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response8);
        java.lang.String str10 = response9.statusMessage();
        org.jsoup.Connection.Request request11 = null;
        response9.req = request11;
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response9);
        response9.executed = false;
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response9);
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry18 = response9.scanHeaders("hi!");
        java.net.URL uRL19 = response9.url();
        java.net.URL uRL20 = response9.url();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(strEntry18);
        org.junit.Assert.assertNull(uRL19);
        org.junit.Assert.assertNull(uRL20);
    }

    @Test
    public void test15316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15316");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Method method2 = response1.method();
        java.lang.String str4 = response1.cookie("hi!");
        int int5 = response1.statusCode;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry7 = response1.scanHeaders("hi!");
        java.lang.String str8 = response1.statusMessage();
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(strEntry7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test15317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15317");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response6 = response1.cookie("hi!", "");
        int int7 = response1.numRedirects;
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response1);
        response8.executed = false;
        response8.statusMessage = "";
        java.net.URL uRL13 = response8.url();
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response8);
        boolean boolean17 = response14.hasHeaderWithValue("hi!", "");
        response14.numRedirects = '#';
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(uRL13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test15318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15318");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response6 = response1.cookie("hi!", "");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry8 = response1.scanHeaders("hi!");
        java.lang.String str9 = response1.charset();
        java.lang.String str10 = response1.statusMessage();
        response1.charset = "";
        java.lang.String str13 = response1.contentType;
        org.jsoup.Connection.Response response15 = response1.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.nio.ByteBuffer byteBuffer17 = null;
        response1.byteData = byteBuffer17;
        response1.statusCode = 0;
        java.lang.String str21 = response1.statusMessage;
        java.util.Map<java.lang.String, java.lang.String> strMap22 = response1.cookies();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNull(strEntry8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(strMap22);
    }

    @Test
    public void test15319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15319");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response6 = response1.cookie("hi!", "");
        int int7 = response1.numRedirects;
        java.lang.String str8 = response1.statusMessage();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry10 = response1.scanHeaders("hi!");
        java.net.URL uRL11 = response1.url();
        int int12 = response1.numRedirects;
        java.lang.Class<?> wildcardClass13 = response1.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(strEntry10);
        org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test15320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15320");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map<java.lang.String, java.lang.String> strMap2 = response1.cookies();
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response4);
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry7 = response4.scanHeaders("hi!");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry9 = response4.scanHeaders("hi!");
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response4);
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response10);
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response11);
        java.util.Map<java.lang.String, java.lang.String> strMap13 = response12.headers();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = response12.hasCookie("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNull(strEntry7);
        org.junit.Assert.assertNull(strEntry9);
        org.junit.Assert.assertNotNull(strMap13);
    }

    @Test
    public void test15321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15321");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response6 = response1.cookie("hi!", "");
        int int7 = response1.numRedirects;
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response1);
        response8.executed = false;
        java.lang.String str11 = response8.contentType();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry13 = response8.scanHeaders("");
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response8);
        java.util.Map<java.lang.String, java.lang.String> strMap15 = response14.headers();
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response14);
        org.jsoup.Connection.Request request17 = response16.req;
        response16.numRedirects = (short) 100;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(strEntry13);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertNull(request17);
    }

    @Test
    public void test15322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15322");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response6 = response1.cookie("hi!", "");
        response1.contentType = "";
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Request request10 = null;
        response9.req = request10;
        int int12 = response9.statusCode();
        java.util.Map<java.lang.String, java.lang.String> strMap13 = response9.cookies();
        java.lang.String str14 = response9.statusMessage;
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response9);
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response15);
        response15.statusMessage = "";
        org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response(response15);
        org.jsoup.helper.HttpConnection.Response response20 = new org.jsoup.helper.HttpConnection.Response(response15);
        org.jsoup.helper.HttpConnection.Response response21 = new org.jsoup.helper.HttpConnection.Response(response15);
        int int22 = response15.statusCode;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document23 = response15.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test15323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15323");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str2 = response1.contentType();
        java.lang.String str4 = response1.getHeaderCaseInsensitive("hi!");
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response1);
        response1.statusCode = (short) 1;
        java.lang.String str8 = response1.charset;
        int int9 = response1.numRedirects;
        java.lang.String str10 = response1.statusMessage();
        java.lang.String str11 = response1.charset();
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test15324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15324");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response6 = response1.cookie("hi!", "");
        response1.contentType = "";
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response9);
        boolean boolean11 = response9.executed;
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response9);
        int int13 = response12.statusCode;
        boolean boolean16 = response12.hasHeaderWithValue("hi!", "hi!");
        java.lang.String str17 = response12.charset;
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response(response12);
        org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response(response12);
        org.jsoup.helper.HttpConnection.Response response20 = new org.jsoup.helper.HttpConnection.Response(response12);
        org.jsoup.helper.HttpConnection.Response response21 = new org.jsoup.helper.HttpConnection.Response(response12);
        java.util.Map<java.lang.String, java.lang.String> strMap22 = response12.headers();
        org.jsoup.helper.HttpConnection.Response response23 = new org.jsoup.helper.HttpConnection.Response(response12);
        response23.executed = true;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(strMap22);
    }

    @Test
    public void test15325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15325");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str5 = response1.statusMessage;
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.util.Map<java.lang.String, java.lang.String> strMap7 = response6.headers();
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response6);
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response6);
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response9);
        boolean boolean12 = response10.hasCookie("hi!");
        org.jsoup.Connection.Method method13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response14 = response10.method(method13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test15326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15326");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response6 = response1.cookie("hi!", "");
        response1.contentType = "";
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Request request10 = null;
        response9.req = request10;
        int int12 = response9.statusCode();
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response9);
        int int14 = response9.statusCode;
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response9);
        java.lang.String str17 = response9.header("");
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response(response9);
        response9.statusMessage = "hi!";
        org.jsoup.helper.HttpConnection.Response response21 = new org.jsoup.helper.HttpConnection.Response(response9);
        org.jsoup.helper.HttpConnection.Response response22 = new org.jsoup.helper.HttpConnection.Response(response9);
        java.net.URL uRL23 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response24 = response22.url(uRL23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test15327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15327");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean2 = response1.executed;
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response3);
        org.jsoup.Connection.Response response6 = response4.removeCookie("hi!");
        org.jsoup.Connection.Response response8 = response4.removeCookie("hi!");
        org.jsoup.Connection.Response response10 = response4.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response4);
        java.lang.String str12 = response4.statusMessage();
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response4);
        org.jsoup.Connection.Response response15 = response13.removeCookie("hi!");
        int int16 = response13.statusCode;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test15328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15328");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str2 = response1.contentType();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry4 = response1.scanHeaders("");
        java.lang.String str5 = response1.charset();
        boolean boolean7 = response1.hasCookie("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response9 = response1.removeCookie("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(strEntry4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test15329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15329");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Response response6 = response4.removeCookie("hi!");
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response4);
        java.nio.ByteBuffer byteBuffer8 = response4.byteData;
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response4);
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response4);
        int int11 = response10.statusCode;
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response10);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray13 = response12.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNull(byteBuffer8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test15330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15330");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response6 = response1.cookie("hi!", "");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry8 = response1.scanHeaders("hi!");
        java.lang.String str9 = response1.charset();
        java.lang.String str10 = response1.statusMessage();
        org.jsoup.Connection.Response response12 = response1.removeCookie("hi!");
        response1.statusCode = 404;
        java.util.Map<java.lang.String, java.lang.String> strMap15 = response1.cookies();
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNull(strEntry8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNotNull(strMap15);
    }

    @Test
    public void test15331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15331");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response6 = response1.cookie("hi!", "");
        response1.contentType = "";
        boolean boolean11 = response1.hasHeaderWithValue("hi!", "");
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response12);
        java.lang.String str14 = response12.contentType;
        java.lang.String str15 = response12.statusMessage();
        boolean boolean16 = response12.executed;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test15332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15332");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response6 = response1.cookie("hi!", "");
        int int7 = response1.numRedirects;
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response8);
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response9);
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response9);
        response11.executed = false;
        org.jsoup.Connection.Response response15 = response11.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response11);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = response16.hasHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(response15);
    }

    @Test
    public void test15333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15333");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str5 = response1.statusMessage;
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.util.Map<java.lang.String, java.lang.String> strMap7 = response6.headers();
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response6);
        int int9 = response8.statusCode();
        int int10 = response8.statusCode();
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response8);
        java.util.Map<java.lang.String, java.lang.String> strMap12 = response8.cookies();
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response8);
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response13);
        response13.charset = "";
        int int17 = response13.numRedirects;
        org.jsoup.Connection.Response response20 = response13.header("hi!", "");
        int int21 = response13.statusCode();
        org.jsoup.helper.HttpConnection.Response response22 = new org.jsoup.helper.HttpConnection.Response(response13);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertNotNull(response20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test15334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15334");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.util.Map<java.lang.String, java.lang.String> strMap5 = response4.headers();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response4);
        int int7 = response4.numRedirects;
        org.jsoup.Connection.Method method8 = response4.method();
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response4);
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response9);
        response10.executed = false;
        java.lang.Class<?> wildcardClass13 = response10.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test15335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15335");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        java.lang.String str4 = response1.contentType();
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Request request6 = null;
        response1.req = request6;
        org.jsoup.Connection.Request request8 = null;
        response1.req = request8;
        java.lang.String str10 = response1.statusMessage();
        response1.numRedirects = (-1);
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Method method14 = response1.method();
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response15);
        org.jsoup.Connection.Request request17 = null;
        response15.req = request17;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(method14);
    }

    @Test
    public void test15336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15336");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response6 = response1.cookie("hi!", "");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry8 = response1.scanHeaders("hi!");
        java.lang.String str9 = response1.charset();
        java.lang.String str11 = response1.getHeaderCaseInsensitive("hi!");
        java.lang.String str12 = response1.contentType;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNull(strEntry8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test15337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15337");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean2 = response1.executed;
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response3);
        org.jsoup.Connection.Response response7 = response4.header("hi!", "");
        java.util.Map<java.lang.String, java.lang.String> strMap8 = response4.cookies();
        java.lang.String str9 = response4.contentType;
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response4);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test15338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15338");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response6 = response1.cookie("hi!", "");
        int int7 = response1.numRedirects;
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response1);
        response8.statusCode = 403;
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response8);
        response8.statusMessage = "";
        java.nio.ByteBuffer byteBuffer14 = null;
        response8.byteData = byteBuffer14;
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response8);
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response16);
        java.lang.String str18 = response17.statusMessage();
        org.jsoup.Connection.Method method19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response20 = response17.method(method19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test15339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15339");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response4);
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response5);
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response6);
        response6.executed = false;
        response6.contentType = "hi!";
        org.jsoup.Connection.Response response14 = response6.cookie("hi!", "");
        java.net.URL uRL15 = response6.url();
        java.net.URL uRL16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response17 = response6.url(uRL16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertNull(uRL15);
    }

    @Test
    public void test15340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15340");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response1);
        int int5 = response1.numRedirects;
        response1.charset = "hi!";
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.net.URL uRL9 = response8.url();
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response8);
        boolean boolean13 = response10.hasHeaderWithValue("hi!", "");
        java.util.Map<java.lang.String, java.lang.String> strMap14 = response10.cookies();
        java.lang.String str15 = response10.statusMessage();
        response10.statusMessage = "";
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response(response10);
        java.net.URL uRL19 = response18.url();
        java.util.Map<java.lang.String, java.lang.String> strMap20 = response18.headers();
        java.nio.ByteBuffer byteBuffer21 = null;
        response18.byteData = byteBuffer21;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(uRL19);
        org.junit.Assert.assertNotNull(strMap20);
    }

    @Test
    public void test15341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15341");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map<java.lang.String, java.lang.String> strMap2 = response1.cookies();
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response1);
        int int5 = response4.numRedirects;
        response4.statusMessage = "hi!";
        org.jsoup.Connection.Response response10 = response4.header("hi!", "hi!");
        java.lang.String str11 = response4.charset();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test15342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15342");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str4 = response2.getHeaderCaseInsensitive("");
        java.lang.String str5 = response2.contentType();
        org.jsoup.Connection.Response response8 = response2.header("hi!", "");
        java.nio.ByteBuffer byteBuffer9 = response2.byteData;
        int int10 = response2.statusCode;
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response2);
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response2);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response13 = org.jsoup.helper.HttpConnection.Response.execute(request0, response2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test15343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15343");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response6 = response1.cookie("hi!", "");
        response1.contentType = "";
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response9);
        java.util.Map<java.lang.String, java.lang.String> strMap11 = response9.cookies();
        org.jsoup.Connection.Request request12 = response9.req;
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response9);
        org.jsoup.Connection.Response response16 = response13.header("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response13);
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response(response13);
        org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response(response13);
        java.nio.ByteBuffer byteBuffer20 = null;
        response13.byteData = byteBuffer20;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNull(request12);
        org.junit.Assert.assertNotNull(response16);
    }

    @Test
    public void test15344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15344");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response6 = response1.cookie("hi!", "");
        response1.contentType = "";
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Request request10 = null;
        response9.req = request10;
        int int12 = response9.statusCode();
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response9);
        response9.statusMessage = "hi!";
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response9);
        java.lang.String str18 = response16.cookie("hi!");
        java.net.URL uRL19 = response16.url();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry21 = response16.scanHeaders("");
        java.lang.String str22 = response16.charset();
        java.lang.String str24 = response16.header("hi!");
        org.jsoup.helper.HttpConnection.Response response25 = new org.jsoup.helper.HttpConnection.Response(response16);
        org.jsoup.Connection.Response response27 = response25.removeCookie("hi!");
        java.lang.String str29 = response25.getHeaderCaseInsensitive("hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(uRL19);
        org.junit.Assert.assertNull(strEntry21);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(response27);
        org.junit.Assert.assertNull(str29);
    }

    @Test
    public void test15345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15345");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response6 = response1.cookie("hi!", "");
        response1.contentType = "";
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response9);
        java.lang.String str11 = response9.contentType();
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response9);
        response12.executed = true;
        org.jsoup.Connection.Method method15 = response12.method();
        response12.charset = "hi!";
        java.lang.String str18 = response12.statusMessage;
        boolean boolean20 = response12.hasHeader("hi!");
        java.lang.String str21 = response12.statusMessage();
        response12.executed = true;
        org.jsoup.helper.HttpConnection.Response response24 = new org.jsoup.helper.HttpConnection.Response(response12);
        java.lang.String str25 = response12.charset;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
    }

    @Test
    public void test15346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15346");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean2 = response1.executed;
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response3);
        java.lang.String str5 = response3.charset();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response3);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test15347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15347");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response4);
        response5.contentType = "";
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response5);
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response5);
        java.lang.String str10 = response5.contentType();
        boolean boolean11 = response5.executed;
        org.jsoup.Connection.Response response13 = response5.removeCookie("hi!");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry15 = response5.scanHeaders("hi!");
        java.lang.String str16 = response5.charset();
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response5);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertNull(strEntry15);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test15348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15348");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response6 = response1.cookie("hi!", "");
        response1.contentType = "";
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Request request10 = null;
        response9.req = request10;
        int int12 = response9.statusCode();
        java.util.Map<java.lang.String, java.lang.String> strMap13 = response9.cookies();
        java.lang.String str14 = response9.statusMessage;
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response9);
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response15);
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response16);
        org.jsoup.Connection.Request request18 = response16.req;
        org.jsoup.Connection.Method method19 = response16.method();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(request18);
        org.junit.Assert.assertNull(method19);
    }

    @Test
    public void test15349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15349");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map<java.lang.String, java.lang.String> strMap2 = response1.cookies();
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry6 = response4.scanHeaders("");
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response4);
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response7);
        java.lang.String str9 = response7.charset;
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response7);
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response10);
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response11);
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response12);
        response12.charset = "hi!";
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNull(strEntry6);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test15350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15350");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response6 = response1.cookie("hi!", "");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry8 = response1.scanHeaders("hi!");
        response1.contentType = "hi!";
        java.lang.String str11 = response1.charset();
        java.util.Map<java.lang.String, java.lang.String> strMap12 = response1.headers();
        boolean boolean15 = response1.hasHeaderWithValue("hi!", "");
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.util.Map<java.lang.String, java.lang.String> strMap17 = response16.cookies();
        java.util.Map<java.lang.String, java.lang.String> strMap18 = response16.headers();
        java.net.URL uRL19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response20 = response16.url(uRL19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNull(strEntry8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(strMap17);
        org.junit.Assert.assertNotNull(strMap18);
    }

    @Test
    public void test15351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15351");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response6 = response1.cookie("hi!", "");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry8 = response1.scanHeaders("hi!");
        java.lang.String str9 = response1.charset();
        java.lang.String str10 = response1.statusMessage();
        response1.charset = "";
        java.lang.String str13 = response1.contentType;
        org.jsoup.Connection.Response response15 = response1.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response16);
        java.net.URL uRL18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response19 = response17.url(uRL18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNull(strEntry8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(response15);
    }

    @Test
    public void test15352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15352");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response4);
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response4);
        org.jsoup.Connection.Method method7 = response4.method();
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response4);
        java.nio.ByteBuffer byteBuffer9 = response4.byteData;
        org.jsoup.Connection.Response response11 = response4.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response4);
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response12);
        java.lang.String str14 = response13.statusMessage;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document15 = response13.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(byteBuffer9);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test15353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15353");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        java.lang.String str4 = response1.contentType();
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Request request6 = null;
        response1.req = request6;
        org.jsoup.Connection.Request request8 = null;
        response1.req = request8;
        response1.contentType = "";
        response1.executed = true;
        java.nio.ByteBuffer byteBuffer14 = response1.byteData;
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response15);
        org.jsoup.Connection.Method method17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response18 = response16.method(method17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(byteBuffer14);
    }

    @Test
    public void test15354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15354");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response4);
        org.jsoup.Connection.Request request6 = null;
        response5.req = request6;
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response5);
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response8);
        org.jsoup.Connection.Request request10 = null;
        response9.req = request10;
        response9.charset = "";
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response9);
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response14);
        java.net.URL uRL16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response17 = response15.url(uRL16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test15355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15355");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str2 = response1.contentType();
        java.lang.String str4 = response1.getHeaderCaseInsensitive("hi!");
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response1);
        response1.statusCode = (short) 1;
        java.lang.String str8 = response1.charset;
        java.util.Map<java.lang.String, java.lang.String> strMap9 = response1.headers();
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str12 = response1.charset;
        java.lang.String str13 = response1.statusMessage();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test15356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15356");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response6 = response1.cookie("hi!", "");
        response1.contentType = "";
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Request request10 = null;
        response9.req = request10;
        int int12 = response9.statusCode();
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response9);
        int int14 = response9.statusCode;
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response9);
        java.util.Map<java.lang.String, java.lang.String> strMap16 = response15.cookies();
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response15);
        response17.charset = "";
        org.jsoup.helper.HttpConnection.Response response20 = new org.jsoup.helper.HttpConnection.Response(response17);
        org.jsoup.helper.HttpConnection.Response response21 = new org.jsoup.helper.HttpConnection.Response(response17);
        java.lang.String str23 = response17.getHeaderCaseInsensitive("");
        response17.numRedirects = 405;
        java.lang.String str26 = response17.charset();
        java.util.Map<java.lang.String, java.lang.String> strMap27 = response17.headers();
        response17.charset = "hi!";
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(strMap27);
    }

    @Test
    public void test15357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15357");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean2 = response1.executed;
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response3);
        org.jsoup.Connection.Response response6 = response4.removeCookie("hi!");
        org.jsoup.Connection.Response response8 = response4.removeCookie("hi!");
        boolean boolean9 = response4.executed;
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response4);
        java.lang.String str12 = response10.header("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = response10.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test15358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15358");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response6 = response1.cookie("hi!", "");
        response1.contentType = "";
        java.util.Map<java.lang.String, java.lang.String> strMap9 = response1.cookies();
        boolean boolean11 = response1.hasHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.util.Map<java.lang.String, java.lang.String> strMap14 = response1.headers();
        java.lang.String str15 = response1.contentType();
        org.jsoup.Connection.Request request16 = null;
        response1.req = request16;
        java.lang.String str18 = response1.contentType;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry20 = response1.scanHeaders("hi!");
        org.jsoup.helper.HttpConnection.Response response21 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response22 = new org.jsoup.helper.HttpConnection.Response(response21);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response25 = response22.cookie("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNull(strEntry20);
    }

    @Test
    public void test15359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15359");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str2 = response1.contentType();
        java.lang.String str4 = response1.getHeaderCaseInsensitive("hi!");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry6 = response1.scanHeaders("");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry8 = response1.scanHeaders("");
        java.util.Map<java.lang.String, java.lang.String> strMap9 = response1.cookies();
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.util.Map<java.lang.String, java.lang.String> strMap11 = response10.headers();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry13 = response10.scanHeaders("");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(strEntry6);
        org.junit.Assert.assertNull(strEntry8);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNull(strEntry13);
    }

    @Test
    public void test15360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15360");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response6 = response1.cookie("hi!", "");
        response1.contentType = "";
        boolean boolean11 = response1.hasHeaderWithValue("hi!", "");
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.nio.ByteBuffer byteBuffer13 = response12.byteData;
        java.util.Map<java.lang.String, java.lang.String> strMap14 = response12.headers();
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response12);
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response15);
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response16);
        java.lang.String str18 = response17.contentType;
        org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response(response17);
        org.jsoup.helper.HttpConnection.Response response20 = new org.jsoup.helper.HttpConnection.Response(response17);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = response17.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(byteBuffer13);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test15361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15361");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str2 = response1.contentType();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry4 = response1.scanHeaders("");
        response1.contentType = "";
        java.lang.String str7 = response1.contentType;
        java.nio.ByteBuffer byteBuffer8 = null;
        response1.byteData = byteBuffer8;
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(strEntry4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test15362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15362");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response6 = response1.cookie("hi!", "");
        int int7 = response1.numRedirects;
        java.lang.String str8 = response1.statusMessage();
        java.lang.String str10 = response1.header("");
        java.lang.String str12 = response1.header("hi!");
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response13);
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response14);
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response14);
        java.lang.Class<?> wildcardClass17 = response16.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test15363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15363");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response4);
        org.jsoup.Connection.Request request6 = null;
        response5.req = request6;
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response5);
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response8);
        org.jsoup.Connection.Request request10 = null;
        response9.req = request10;
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response9);
        java.nio.ByteBuffer byteBuffer13 = response12.byteData;
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response12);
        java.lang.String str15 = response12.statusMessage;
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response12);
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry18 = response16.scanHeaders("");
        java.lang.String str20 = response16.getHeaderCaseInsensitive("");
        java.util.Map<java.lang.String, java.lang.String> strMap21 = response16.headers();
        java.lang.String str22 = response16.charset();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(byteBuffer13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(strEntry18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test15364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15364");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response4);
        org.jsoup.Connection.Request request6 = null;
        response5.req = request6;
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response5);
        boolean boolean10 = response5.hasHeader("hi!");
        response5.statusCode = 'a';
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test15365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15365");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response6 = response1.cookie("hi!", "");
        response1.contentType = "";
        boolean boolean11 = response1.hasHeaderWithValue("hi!", "");
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.nio.ByteBuffer byteBuffer13 = response12.byteData;
        response12.charset = "";
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response12);
        java.lang.String str18 = response16.header("hi!");
        int int19 = response16.statusCode;
        boolean boolean20 = response16.executed;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(byteBuffer13);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test15366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15366");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str5 = response1.statusMessage;
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.util.Map<java.lang.String, java.lang.String> strMap7 = response6.headers();
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response6);
        int int9 = response8.statusCode();
        int int10 = response8.statusCode();
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response8);
        org.jsoup.Connection.Response response14 = response11.cookie("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response11);
        java.lang.String str16 = response11.statusMessage;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = response11.cookie("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test15367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15367");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str2 = response1.contentType();
        java.lang.String str4 = response1.getHeaderCaseInsensitive("hi!");
        boolean boolean5 = response1.executed;
        boolean boolean7 = response1.hasCookie("hi!");
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response9);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test15368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15368");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response6 = response1.cookie("hi!", "");
        response1.contentType = "";
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Request request10 = null;
        response9.req = request10;
        int int12 = response9.statusCode();
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response9);
        int int14 = response9.statusCode;
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response9);
        java.util.Map<java.lang.String, java.lang.String> strMap16 = response15.cookies();
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response15);
        response17.charset = "";
        org.jsoup.helper.HttpConnection.Response response20 = new org.jsoup.helper.HttpConnection.Response(response17);
        org.jsoup.helper.HttpConnection.Response response21 = new org.jsoup.helper.HttpConnection.Response(response17);
        org.jsoup.Connection.Response response24 = response21.cookie("hi!", "");
        org.jsoup.helper.HttpConnection.Response response25 = new org.jsoup.helper.HttpConnection.Response(response21);
        java.lang.String str26 = response25.charset;
        java.util.Map<java.lang.String, java.lang.String> strMap27 = response25.cookies();
        org.jsoup.helper.HttpConnection.Response response28 = new org.jsoup.helper.HttpConnection.Response(response25);
        java.net.URL uRL29 = response25.url();
        java.lang.String str31 = response25.cookie("hi!");
        int int32 = response25.statusCode;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertNotNull(response24);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(strMap27);
        org.junit.Assert.assertNull(uRL29);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
    }

    @Test
    public void test15369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15369");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean2 = response1.executed;
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response3);
        java.lang.String str5 = response3.charset();
        boolean boolean6 = response3.executed;
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response3);
        response3.numRedirects = 304;
        org.jsoup.Connection.Method method10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response11 = response3.method(method10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test15370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15370");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response6 = response1.cookie("hi!", "");
        response1.contentType = "";
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Request request10 = null;
        response9.req = request10;
        int int12 = response9.statusCode();
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response9);
        int int14 = response9.statusCode;
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response9);
        java.util.Map<java.lang.String, java.lang.String> strMap16 = response15.cookies();
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response15);
        response17.charset = "";
        org.jsoup.helper.HttpConnection.Response response20 = new org.jsoup.helper.HttpConnection.Response(response17);
        org.jsoup.helper.HttpConnection.Response response21 = new org.jsoup.helper.HttpConnection.Response(response17);
        response21.executed = true;
        java.lang.String str24 = response21.charset();
        java.lang.String str26 = response21.header("hi!");
        org.jsoup.helper.HttpConnection.Response response27 = new org.jsoup.helper.HttpConnection.Response(response21);
        org.jsoup.helper.HttpConnection.Response response28 = new org.jsoup.helper.HttpConnection.Response(response21);
        int int29 = response28.statusCode;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test15371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15371");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean2 = response1.executed;
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response3);
        org.jsoup.Connection.Response response6 = response4.removeCookie("hi!");
        int int7 = response4.numRedirects;
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response4);
        org.jsoup.Connection.Response response10 = response4.removeHeader("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNotNull(response10);
    }

    @Test
    public void test15372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15372");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str2 = response1.contentType();
        java.lang.String str4 = response1.getHeaderCaseInsensitive("hi!");
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response1);
        response1.statusCode = (short) 1;
        java.lang.String str8 = response1.charset;
        java.nio.ByteBuffer byteBuffer9 = response1.byteData;
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Request request11 = response1.req;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry13 = response1.scanHeaders("");
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response1);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document15 = response14.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(byteBuffer9);
        org.junit.Assert.assertNull(request11);
        org.junit.Assert.assertNull(strEntry13);
    }

    @Test
    public void test15373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15373");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str5 = response1.statusMessage;
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.util.Map<java.lang.String, java.lang.String> strMap7 = response6.headers();
        java.lang.String str8 = response6.statusMessage;
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response6);
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response6);
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response10);
        java.lang.String str12 = response10.contentType;
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response10);
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response13);
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response14);
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response14);
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response14);
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response(response14);
        org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response(response14);
        org.jsoup.Connection.Request request20 = null;
        response14.req = request20;
        org.jsoup.helper.HttpConnection.Response response22 = new org.jsoup.helper.HttpConnection.Response(response14);
        java.net.URL uRL23 = response22.url();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(uRL23);
    }

    @Test
    public void test15374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15374");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response6 = response1.cookie("hi!", "");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry8 = response1.scanHeaders("hi!");
        java.lang.String str9 = response1.charset();
        java.lang.String str10 = response1.statusMessage();
        response1.charset = "";
        org.jsoup.Connection.Request request13 = response1.req;
        response1.statusCode = 503;
        java.net.URL uRL16 = response1.url();
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str18 = response1.statusMessage();
        boolean boolean19 = response1.executed;
        org.jsoup.helper.HttpConnection.Response response20 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response21 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response22 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str23 = response1.contentType();
        org.jsoup.helper.HttpConnection.Response response24 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNull(strEntry8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(request13);
        org.junit.Assert.assertNull(uRL16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test15375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15375");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response6 = response1.cookie("hi!", "");
        response1.contentType = "";
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Request request10 = null;
        response9.req = request10;
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response9);
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response12);
        java.util.Map<java.lang.String, java.lang.String> strMap14 = response13.cookies();
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response13);
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response13);
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response13);
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response(response13);
        org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response(response18);
        response18.executed = false;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = response18.hasHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNotNull(strMap14);
    }

    @Test
    public void test15376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15376");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str4 = response2.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response7 = response2.cookie("hi!", "");
        int int8 = response2.numRedirects;
        response2.contentType = "";
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response2);
        java.lang.String str13 = response11.header("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response14 = org.jsoup.helper.HttpConnection.Response.execute(request0, response11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test15377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15377");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response6 = response1.cookie("hi!", "");
        int int7 = response1.numRedirects;
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response8);
        java.lang.String str10 = response9.statusMessage();
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response9);
        org.jsoup.Connection.Method method12 = response11.method();
        response11.contentType = "hi!";
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response11);
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response15);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(method12);
    }

    @Test
    public void test15378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15378");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.net.URL uRL5 = response4.url();
        boolean boolean7 = response4.hasHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response4);
        int int9 = response4.statusCode();
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response4);
        java.nio.ByteBuffer byteBuffer11 = null;
        response10.byteData = byteBuffer11;
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response10);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(uRL5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test15379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15379");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response1);
        int int5 = response1.numRedirects;
        response1.charset = "hi!";
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response8);
        java.util.Map<java.lang.String, java.lang.String> strMap10 = response9.headers();
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response9);
        java.util.Map<java.lang.String, java.lang.String> strMap12 = response11.headers();
        java.lang.String str14 = response11.getHeaderCaseInsensitive("");
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response11);
        org.jsoup.Connection.Response response17 = response15.removeCookie("hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(response17);
    }

    @Test
    public void test15380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15380");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response4);
        response5.contentType = "";
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response5);
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response8);
        int int10 = response8.numRedirects;
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response8);
        int int12 = response11.numRedirects;
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response11);
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response13);
        java.lang.String str15 = response14.charset;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = response14.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test15381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15381");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response4);
        org.jsoup.Connection.Request request6 = null;
        response5.req = request6;
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response5);
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response8);
        java.lang.String str10 = response9.charset;
        java.lang.String str11 = response9.statusMessage;
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response9);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response14 = response9.removeHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test15382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15382");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str2 = response1.contentType();
        java.lang.String str4 = response1.getHeaderCaseInsensitive("hi!");
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response1);
        response1.numRedirects = (short) 1;
        java.lang.String str8 = response1.statusMessage;
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response9);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test15383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15383");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response6 = response1.cookie("hi!", "");
        int int7 = response1.numRedirects;
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response8);
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response9);
        java.lang.String str11 = response10.statusMessage();
        boolean boolean13 = response10.hasCookie("hi!");
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response10);
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response14);
        org.jsoup.Connection.Response response17 = response14.removeCookie("hi!");
        java.lang.String str18 = response14.charset;
        org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response(response14);
        response19.statusCode = (byte) -1;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(response17);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test15384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15384");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str5 = response1.statusMessage;
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.util.Map<java.lang.String, java.lang.String> strMap7 = response6.headers();
        java.lang.String str8 = response6.statusMessage;
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response6);
        org.jsoup.Connection.Response response11 = response6.removeCookie("hi!");
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response6);
        java.lang.String str13 = response12.charset;
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response12);
        org.jsoup.Connection.Request request15 = response14.req;
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response14);
        response16.executed = true;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(request15);
    }

    @Test
    public void test15385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15385");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response6 = response1.cookie("hi!", "");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry8 = response1.scanHeaders("hi!");
        java.lang.String str9 = response1.charset();
        java.lang.String str10 = response1.statusMessage();
        response1.charset = "";
        org.jsoup.Connection.Request request13 = response1.req;
        response1.statusCode = 503;
        java.net.URL uRL16 = response1.url();
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str20 = response1.header("hi!");
        org.jsoup.helper.HttpConnection.Response response21 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response22 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Request request23 = response1.req;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNull(strEntry8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(request13);
        org.junit.Assert.assertNull(uRL16);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(request23);
    }

    @Test
    public void test15386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15386");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str5 = response1.statusMessage;
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.util.Map<java.lang.String, java.lang.String> strMap7 = response6.headers();
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response6);
        int int9 = response8.statusCode();
        int int10 = response8.statusCode();
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response8);
        java.util.Map<java.lang.String, java.lang.String> strMap12 = response8.cookies();
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response8);
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response13);
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response13);
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response15);
        response15.numRedirects = 201;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(strMap12);
    }

    @Test
    public void test15387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15387");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        java.lang.String str4 = response1.contentType();
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Request request6 = null;
        response1.req = request6;
        java.lang.String str8 = response1.charset();
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str10 = response9.charset;
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response9);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test15388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15388");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response1);
        int int5 = response1.numRedirects;
        response1.charset = "hi!";
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response9);
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response10);
        int int12 = response11.statusCode();
        org.jsoup.Connection.Response response14 = response11.removeHeader("hi!");
        response11.statusMessage = "hi!";
        java.lang.String str17 = response11.contentType;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test15389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15389");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response4);
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response5);
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response6);
        boolean boolean8 = response7.executed;
        org.jsoup.Connection.Request request9 = response7.req;
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response7);
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response10);
        java.net.HttpURLConnection httpURLConnection12 = null;
        org.jsoup.helper.HttpConnection.Response response13 = null;
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response13);
        java.lang.String str16 = response14.getHeaderCaseInsensitive("");
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response14);
        java.lang.String str18 = response14.statusMessage;
        org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response(response14);
        java.util.Map<java.lang.String, java.lang.String> strMap20 = response19.headers();
        org.jsoup.helper.HttpConnection.Response response21 = new org.jsoup.helper.HttpConnection.Response(response19);
        int int22 = response21.statusCode();
        java.lang.String str24 = response21.cookie("hi!");
        org.jsoup.helper.HttpConnection.Response response25 = new org.jsoup.helper.HttpConnection.Response(response21);
        org.jsoup.Connection.Response response27 = response21.removeCookie("hi!");
        // The following exception was thrown during execution in test generation
        try {
            response11.setupFromConnection(httpURLConnection12, (org.jsoup.Connection.Response) response21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(request9);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(strMap20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(response27);
    }

    @Test
    public void test15390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15390");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Method method2 = response1.method();
        int int3 = response1.statusCode();
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response1);
        response1.statusMessage = "";
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.nio.ByteBuffer byteBuffer10 = null;
        response9.byteData = byteBuffer10;
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test15391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15391");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str2 = response1.contentType();
        java.lang.String str4 = response1.getHeaderCaseInsensitive("hi!");
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response1);
        response1.charset = "hi!";
        java.net.URL uRL8 = response1.url();
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response9);
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response9);
        int int12 = response9.statusCode();
        int int13 = response9.statusCode();
        response9.statusCode = 301;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(uRL8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test15392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15392");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str2 = response1.contentType();
        java.lang.String str4 = response1.getHeaderCaseInsensitive("hi!");
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.util.Map<java.lang.String, java.lang.String> strMap6 = response1.cookies();
        java.lang.String str7 = response1.charset;
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response8);
        java.lang.String str10 = response8.contentType;
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response8);
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response11);
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry14 = response12.scanHeaders("hi!");
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response12);
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response15);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(strEntry14);
    }

    @Test
    public void test15393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15393");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str4 = response2.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response7 = response2.cookie("hi!", "");
        response2.contentType = "";
        java.util.Map<java.lang.String, java.lang.String> strMap10 = response2.cookies();
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response2);
        response11.contentType = "";
        java.lang.String str14 = response11.charset();
        boolean boolean16 = response11.hasCookie("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response17 = org.jsoup.helper.HttpConnection.Response.execute(request0, response11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test15394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15394");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Method method2 = response1.method();
        java.lang.String str4 = response1.getHeaderCaseInsensitive("");
        response1.statusCode = 0;
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Request request8 = null;
        response1.req = request8;
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response1);
        response1.numRedirects = 409;
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test15395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15395");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response6 = response1.cookie("hi!", "");
        int int7 = response1.numRedirects;
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response1);
        response8.executed = false;
        int int11 = response8.numRedirects;
        java.util.Map<java.lang.String, java.lang.String> strMap12 = response8.headers();
        int int13 = response8.numRedirects;
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response8);
        boolean boolean15 = response8.executed;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test15396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15396");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response6 = response1.cookie("hi!", "");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry8 = response1.scanHeaders("hi!");
        java.lang.String str9 = response1.charset();
        java.lang.String str10 = response1.statusMessage();
        response1.charset = "";
        java.lang.String str13 = response1.contentType;
        java.net.URL uRL14 = response1.url();
        java.lang.String str15 = response1.charset;
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response(response17);
        int int19 = response17.statusCode();
        org.jsoup.helper.HttpConnection.Response response20 = new org.jsoup.helper.HttpConnection.Response(response17);
        response17.executed = true;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNull(strEntry8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(uRL14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test15397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15397");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str2 = response1.contentType();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry4 = response1.scanHeaders("");
        java.lang.String str5 = response1.charset();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response7);
        response7.charset = "";
        java.lang.String str12 = response7.getHeaderCaseInsensitive("hi!");
        boolean boolean15 = response7.hasHeaderWithValue("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response7);
        java.nio.ByteBuffer byteBuffer17 = response7.byteData;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(strEntry4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(byteBuffer17);
    }

    @Test
    public void test15398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15398");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response4);
        response5.contentType = "";
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response5);
        java.lang.String str9 = response8.contentType;
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response8);
        java.net.URL uRL11 = response8.url();
        response8.executed = true;
        java.lang.String str14 = response8.contentType;
        java.util.Map<java.lang.String, java.lang.String> strMap15 = response8.cookies();
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response8);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(strMap15);
    }

    @Test
    public void test15399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15399");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response6 = response1.cookie("hi!", "");
        int int7 = response1.numRedirects;
        java.lang.String str9 = response1.header("");
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response1);
        int int11 = response10.statusCode();
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response10);
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response12);
        int int14 = response12.numRedirects;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
    }

    @Test
    public void test15400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15400");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str2 = response1.contentType();
        java.lang.String str4 = response1.getHeaderCaseInsensitive("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap5 = response1.headers();
        java.lang.String str6 = response1.charset();
        response1.contentType = "hi!";
        java.lang.String str9 = response1.statusMessage;
        java.net.URL uRL10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response11 = response1.url(uRL10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test15401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15401");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str5 = response1.statusMessage;
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.util.Map<java.lang.String, java.lang.String> strMap7 = response6.headers();
        java.lang.String str8 = response6.statusMessage;
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response6);
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response6);
        java.lang.String str11 = response6.contentType;
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response6);
        boolean boolean14 = response6.hasHeader("hi!");
        int int15 = response6.statusCode();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response17 = response6.removeCookie("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test15402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15402");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean2 = response1.executed;
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response3.scanHeaders("");
        int int6 = response3.numRedirects;
        response3.contentType = "hi!";
        org.jsoup.Connection.Request request9 = response3.req;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNull(request9);
    }

    @Test
    public void test15403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15403");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map<java.lang.String, java.lang.String> strMap2 = response1.cookies();
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response4);
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response5);
        org.jsoup.Connection.Method method7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response8 = response5.method(method7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
    }

    @Test
    public void test15404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15404");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map<java.lang.String, java.lang.String> strMap2 = response1.cookies();
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response4);
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry7 = response4.scanHeaders("hi!");
        java.lang.String str9 = response4.getHeaderCaseInsensitive("hi!");
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response4);
        response10.statusCode = 4;
        response10.contentType = "";
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response10);
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response15);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNull(strEntry7);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test15405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15405");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response6 = response1.cookie("hi!", "");
        int int7 = response1.numRedirects;
        java.lang.String str9 = response1.header("");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry11 = response1.scanHeaders("");
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response1);
        boolean boolean15 = response13.hasHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response13);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(strEntry11);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test15406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15406");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        java.lang.String str4 = response1.contentType();
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.nio.ByteBuffer byteBuffer6 = response5.byteData;
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response5);
        int int8 = response5.numRedirects;
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response5);
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response9);
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response9);
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response9);
        java.net.URL uRL13 = response9.url();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(byteBuffer6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNull(uRL13);
    }

    @Test
    public void test15407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15407");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Method method2 = response1.method();
        int int3 = response1.statusCode();
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response1);
        response1.statusMessage = "";
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response9);
        org.jsoup.Connection.Request request11 = response10.req;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = response10.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(request11);
    }

    @Test
    public void test15408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15408");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map<java.lang.String, java.lang.String> strMap2 = response1.cookies();
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response4);
        java.util.Map<java.lang.String, java.lang.String> strMap6 = response5.headers();
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response5);
        int int8 = response5.numRedirects;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry10 = response5.scanHeaders("");
        boolean boolean12 = response5.hasCookie("hi!");
        boolean boolean13 = response5.executed;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = response5.cookie("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertNull(strEntry10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test15409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15409");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response6 = response1.cookie("hi!", "");
        response1.contentType = "";
        boolean boolean11 = response1.hasHeaderWithValue("hi!", "");
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response12);
        java.lang.String str14 = response12.contentType;
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response12);
        org.jsoup.Connection.Response response18 = response12.header("hi!", "");
        org.jsoup.Connection.Response response20 = response12.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response21 = new org.jsoup.helper.HttpConnection.Response(response12);
        boolean boolean23 = response12.hasCookie("hi!");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry25 = response12.scanHeaders("");
        response12.charset = "hi!";
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(response18);
        org.junit.Assert.assertNotNull(response20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(strEntry25);
    }

    @Test
    public void test15410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15410");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response6 = response1.cookie("hi!", "");
        response1.contentType = "";
        boolean boolean11 = response1.hasHeaderWithValue("hi!", "");
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response12);
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response13);
        java.lang.String str15 = response13.charset;
        java.lang.String str17 = response13.header("hi!");
        java.nio.ByteBuffer byteBuffer18 = response13.byteData;
        response13.executed = false;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(byteBuffer18);
    }

    @Test
    public void test15411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15411");
        org.jsoup.helper.HttpConnection.Response.MAX_REDIRECTS = 52;
    }

    @Test
    public void test15412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15412");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Method method2 = response1.method();
        java.lang.String str4 = response1.getHeaderCaseInsensitive("");
        java.lang.String str5 = response1.statusMessage;
        java.lang.String str6 = response1.statusMessage;
        int int7 = response1.statusCode;
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str9 = response8.charset;
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test15413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15413");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map<java.lang.String, java.lang.String> strMap2 = response1.cookies();
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response4);
        java.util.Map<java.lang.String, java.lang.String> strMap6 = response5.headers();
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response5);
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response5);
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response8);
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response8);
        java.lang.String str11 = response8.charset;
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response8);
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response12);
        int int14 = response13.numRedirects;
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5 + "'", int14 == 5);
    }

    @Test
    public void test15414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15414");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        java.lang.String str4 = response1.contentType();
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Request request6 = null;
        response1.req = request6;
        org.jsoup.Connection.Request request8 = null;
        response1.req = request8;
        java.lang.String str10 = response1.statusMessage();
        response1.numRedirects = (-1);
        boolean boolean14 = response1.hasCookie("hi!");
        java.net.URL uRL15 = response1.url();
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Response response18 = response16.removeCookie("hi!");
        org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response(response16);
        java.net.HttpURLConnection httpURLConnection20 = null;
        org.jsoup.helper.HttpConnection.Response response21 = null;
        org.jsoup.helper.HttpConnection.Response response22 = new org.jsoup.helper.HttpConnection.Response(response21);
        java.lang.String str24 = response22.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response27 = response22.cookie("hi!", "");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry29 = response22.scanHeaders("hi!");
        java.lang.String str30 = response22.charset();
        java.lang.String str31 = response22.statusMessage();
        response22.charset = "";
        java.lang.String str35 = response22.getHeaderCaseInsensitive("hi!");
        java.lang.String str36 = response22.contentType;
        org.jsoup.Connection.Method method37 = response22.method();
        org.jsoup.helper.HttpConnection.Response response38 = new org.jsoup.helper.HttpConnection.Response(response22);
        java.nio.ByteBuffer byteBuffer39 = response22.byteData;
        // The following exception was thrown during execution in test generation
        try {
            response16.setupFromConnection(httpURLConnection20, (org.jsoup.Connection.Response) response22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(uRL15);
        org.junit.Assert.assertNotNull(response18);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(response27);
        org.junit.Assert.assertNull(strEntry29);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNull(method37);
        org.junit.Assert.assertNull(byteBuffer39);
    }

    @Test
    public void test15415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15415");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map<java.lang.String, java.lang.String> strMap2 = response1.cookies();
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response4);
        java.util.Map<java.lang.String, java.lang.String> strMap6 = response5.headers();
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response5);
        java.lang.String str8 = response5.charset();
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response5);
        java.lang.String str10 = response5.contentType();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test15416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15416");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response6 = response1.cookie("hi!", "");
        response1.contentType = "";
        boolean boolean11 = response1.hasHeaderWithValue("hi!", "");
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.nio.ByteBuffer byteBuffer13 = response12.byteData;
        response12.charset = "";
        response12.contentType = "";
        org.jsoup.Connection.Request request18 = response12.req;
        org.jsoup.Connection.Method method19 = response12.method();
        org.jsoup.helper.HttpConnection.Response response20 = new org.jsoup.helper.HttpConnection.Response(response12);
        org.jsoup.Connection.Method method21 = response12.method();
        java.lang.String str22 = response12.statusMessage;
        java.util.Map<java.lang.String, java.lang.String> strMap23 = response12.headers();
        org.jsoup.helper.HttpConnection.Response response24 = new org.jsoup.helper.HttpConnection.Response(response12);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray25 = response12.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(byteBuffer13);
        org.junit.Assert.assertNull(request18);
        org.junit.Assert.assertNull(method19);
        org.junit.Assert.assertNull(method21);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(strMap23);
    }

    @Test
    public void test15417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15417");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response6 = response1.cookie("hi!", "");
        int int7 = response1.numRedirects;
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response11);
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response11);
        org.jsoup.Connection.Response response16 = response11.cookie("hi!", "");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(response16);
    }

    @Test
    public void test15418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15418");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response6 = response1.cookie("hi!", "");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry8 = response1.scanHeaders("hi!");
        java.lang.String str9 = response1.charset();
        java.lang.String str10 = response1.statusMessage();
        response1.statusMessage = "";
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response1);
        response1.contentType = "";
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNull(strEntry8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test15419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15419");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response4);
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response5);
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response5);
        java.nio.ByteBuffer byteBuffer8 = null;
        response5.byteData = byteBuffer8;
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response5);
        java.nio.ByteBuffer byteBuffer11 = null;
        response10.byteData = byteBuffer11;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry14 = response10.scanHeaders("hi!");
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response10);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(strEntry14);
    }

    @Test
    public void test15420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15420");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map<java.lang.String, java.lang.String> strMap2 = response1.cookies();
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response4);
        java.util.Map<java.lang.String, java.lang.String> strMap6 = response5.headers();
        response5.charset = "hi!";
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response5);
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response5);
        java.lang.String str11 = response10.charset;
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response10);
        org.jsoup.Connection.Request request13 = null;
        response10.req = request13;
        java.lang.String str16 = response10.header("");
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test15421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15421");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.util.Map<java.lang.String, java.lang.String> strMap5 = response4.headers();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response4);
        java.lang.String str7 = response6.contentType;
        java.lang.String str9 = response6.header("");
        org.jsoup.Connection.Request request10 = null;
        response6.req = request10;
        java.lang.String str12 = response6.contentType;
        org.jsoup.Connection.Method method13 = response6.method();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(method13);
    }

    @Test
    public void test15422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15422");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response6 = response1.cookie("hi!", "");
        response1.contentType = "";
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response9);
        java.lang.String str11 = response9.contentType();
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response9);
        org.jsoup.Connection.Request request13 = response12.req;
        java.net.URL uRL14 = response12.url();
        java.nio.ByteBuffer byteBuffer15 = null;
        response12.byteData = byteBuffer15;
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response12);
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response(response12);
        response18.executed = false;
        java.net.URL uRL21 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response22 = response18.url(uRL21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(request13);
        org.junit.Assert.assertNull(uRL14);
    }

    @Test
    public void test15423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15423");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response6 = response1.cookie("hi!", "");
        int int7 = response1.numRedirects;
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str12 = response1.contentType();
        org.jsoup.Connection.Request request13 = response1.req;
        org.jsoup.Connection.Response response15 = response1.removeCookie("hi!");
        org.jsoup.Connection.Request request16 = response1.req;
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Response response20 = response1.header("hi!", "");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(request13);
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertNull(request16);
        org.junit.Assert.assertNotNull(response20);
    }

    @Test
    public void test15424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15424");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response6 = response1.cookie("hi!", "");
        int int7 = response1.numRedirects;
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response8);
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response9);
        java.lang.String str11 = response9.statusMessage();
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response9);
        java.lang.String str13 = response12.statusMessage;
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response12);
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry16 = response14.scanHeaders("hi!");
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response14);
        org.jsoup.Connection.Method method18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response19 = response14.method(method18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(strEntry16);
    }

    @Test
    public void test15425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15425");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        java.lang.String str4 = response1.contentType();
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response1);
        response5.contentType = "";
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response5);
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response5);
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response9);
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response10);
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response10);
        response12.executed = false;
        response12.contentType = "";
        boolean boolean18 = response12.hasCookie("hi!");
        java.lang.String str20 = response12.header("");
        java.lang.String str21 = response12.statusMessage;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test15426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15426");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str2 = response1.contentType();
        java.lang.String str4 = response1.getHeaderCaseInsensitive("hi!");
        java.nio.ByteBuffer byteBuffer5 = response1.byteData;
        java.lang.String str6 = response1.statusMessage;
        int int7 = response1.statusCode();
        response1.numRedirects = 302;
        int int10 = response1.statusCode;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry12 = response1.scanHeaders("");
        int int13 = response1.statusCode;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(byteBuffer5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(strEntry12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test15427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15427");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response6 = response1.cookie("hi!", "");
        int int7 = response1.numRedirects;
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response8);
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response9);
        java.lang.String str11 = response9.statusMessage();
        org.jsoup.Connection.Response response13 = response9.removeCookie("hi!");
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response9);
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response14);
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response15);
        java.lang.String str17 = response15.statusMessage();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test15428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15428");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response6 = response1.cookie("hi!", "");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry8 = response1.scanHeaders("hi!");
        java.lang.String str9 = response1.charset();
        java.lang.String str10 = response1.statusMessage();
        response1.charset = "";
        org.jsoup.Connection.Request request13 = response1.req;
        response1.statusCode = 503;
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response16);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response19 = response17.removeHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNull(strEntry8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(request13);
    }

    @Test
    public void test15429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15429");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response6 = response1.cookie("hi!", "");
        response1.contentType = "";
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response9);
        java.util.Map<java.lang.String, java.lang.String> strMap11 = response9.cookies();
        int int12 = response9.statusCode();
        java.lang.String str13 = response9.contentType;
        java.util.Map<java.lang.String, java.lang.String> strMap14 = response9.headers();
        response9.charset = "hi!";
        java.nio.ByteBuffer byteBuffer17 = response9.byteData;
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response(response9);
        int int19 = response18.statusCode;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNull(byteBuffer17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test15430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15430");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str2 = response1.contentType();
        java.lang.String str4 = response1.getHeaderCaseInsensitive("hi!");
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Response response8 = response6.removeHeader("hi!");
        int int9 = response6.statusCode();
        java.nio.ByteBuffer byteBuffer10 = null;
        response6.byteData = byteBuffer10;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response13 = response6.removeCookie("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test15431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15431");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response4);
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response4);
        org.jsoup.Connection.Method method7 = response4.method();
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response4);
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response4);
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry11 = response4.scanHeaders("hi!");
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response4);
        org.jsoup.Connection.Request request13 = response12.req;
        response12.statusMessage = "hi!";
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response12);
        java.lang.String str17 = response16.contentType();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(strEntry11);
        org.junit.Assert.assertNull(request13);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test15432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15432");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response6 = response1.cookie("hi!", "");
        int int7 = response1.numRedirects;
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response1);
        response8.statusCode = 403;
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response8);
        int int12 = response11.statusCode;
        java.lang.String str13 = response11.contentType;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test15433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15433");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response6 = response1.cookie("hi!", "");
        int int7 = response1.numRedirects;
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str12 = response10.header("");
        int int13 = response10.statusCode();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry15 = response10.scanHeaders("");
        java.lang.String str16 = response10.charset();
        java.net.URL uRL17 = response10.url();
        java.util.Map<java.lang.String, java.lang.String> strMap18 = response10.cookies();
        org.jsoup.Connection.Response response20 = response10.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response21 = new org.jsoup.helper.HttpConnection.Response(response10);
        java.lang.String str23 = response21.cookie("hi!");
        org.jsoup.helper.HttpConnection.Response response24 = new org.jsoup.helper.HttpConnection.Response(response21);
        int int25 = response21.numRedirects;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(strEntry15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(uRL17);
        org.junit.Assert.assertNotNull(strMap18);
        org.junit.Assert.assertNotNull(response20);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2 + "'", int25 == 2);
    }

    @Test
    public void test15434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15434");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response6 = response1.cookie("hi!", "");
        response1.contentType = "";
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response9);
        boolean boolean11 = response9.executed;
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response9);
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response12);
        java.nio.ByteBuffer byteBuffer14 = response12.byteData;
        java.lang.String str15 = response12.statusMessage;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry17 = response12.scanHeaders("");
        response12.contentType = "";
        java.lang.String str20 = response12.charset;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(byteBuffer14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(strEntry17);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test15435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15435");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response1);
        int int5 = response1.numRedirects;
        response1.charset = "hi!";
        java.nio.ByteBuffer byteBuffer8 = null;
        response1.byteData = byteBuffer8;
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response11);
        org.jsoup.Connection.Request request13 = response12.req;
        java.net.URL uRL14 = response12.url();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(request13);
        org.junit.Assert.assertNull(uRL14);
    }

    @Test
    public void test15436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15436");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response4);
        org.jsoup.Connection.Request request6 = null;
        response5.req = request6;
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response5);
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response8);
        org.jsoup.Connection.Request request10 = null;
        response9.req = request10;
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response9);
        java.nio.ByteBuffer byteBuffer13 = response12.byteData;
        response12.statusCode = 412;
        java.lang.String str16 = response12.contentType;
        java.lang.String str17 = response12.charset();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(byteBuffer13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test15437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15437");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str2 = response1.contentType();
        java.lang.String str4 = response1.getHeaderCaseInsensitive("hi!");
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Request request9 = null;
        response8.req = request9;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test15438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15438");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Response response6 = response4.removeCookie("hi!");
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response4);
        java.nio.ByteBuffer byteBuffer8 = response4.byteData;
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response4);
        java.lang.String str10 = response9.statusMessage();
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response9);
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response11);
        int int13 = response12.statusCode;
        java.lang.String str14 = response12.charset();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNull(byteBuffer8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test15439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15439");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str2 = response1.contentType();
        java.lang.String str4 = response1.getHeaderCaseInsensitive("hi!");
        java.nio.ByteBuffer byteBuffer5 = response1.byteData;
        java.lang.String str6 = response1.statusMessage;
        response1.numRedirects = 'a';
        java.lang.String str9 = response1.contentType();
        java.lang.String str10 = response1.statusMessage;
        java.lang.String str11 = response1.statusMessage;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response1);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Too many redirects occurred trying to load URL null");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(byteBuffer5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test15440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15440");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str2 = response1.contentType();
        java.lang.String str4 = response1.getHeaderCaseInsensitive("hi!");
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response1);
        response1.numRedirects = (short) 1;
        java.lang.String str9 = response1.getHeaderCaseInsensitive("hi!");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry11 = response1.scanHeaders("");
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str13 = response1.charset();
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str15 = response1.contentType();
        java.lang.String str17 = response1.header("hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(strEntry11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test15441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15441");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response6 = response1.cookie("hi!", "");
        response1.contentType = "";
        boolean boolean11 = response1.hasHeaderWithValue("hi!", "");
        java.lang.String str13 = response1.header("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test15442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15442");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map<java.lang.String, java.lang.String> strMap2 = response1.cookies();
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response4);
        java.util.Map<java.lang.String, java.lang.String> strMap6 = response5.headers();
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response5);
        boolean boolean8 = response7.executed;
        org.jsoup.Connection.Request request9 = null;
        response7.req = request9;
        org.jsoup.Connection.Response response13 = response7.header("hi!", "");
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response7);
        java.lang.String str15 = response7.statusMessage();
        org.jsoup.Connection.Request request16 = null;
        response7.req = request16;
        boolean boolean19 = response7.hasHeader("hi!");
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test15443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15443");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response6 = response1.cookie("hi!", "");
        response1.contentType = "";
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response9);
        boolean boolean11 = response9.executed;
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response9);
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response12);
        java.nio.ByteBuffer byteBuffer14 = response12.byteData;
        int int15 = response12.numRedirects;
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response12);
        response12.statusMessage = "hi!";
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(byteBuffer14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
    }

    @Test
    public void test15444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15444");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Method method2 = response1.method();
        java.nio.ByteBuffer byteBuffer3 = response1.byteData;
        boolean boolean6 = response1.hasHeaderWithValue("hi!", "hi!");
        response1.statusCode = 405;
        int int9 = response1.statusCode();
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(byteBuffer3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 405 + "'", int9 == 405);
    }

    @Test
    public void test15445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15445");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response6 = response1.cookie("hi!", "");
        int int7 = response1.numRedirects;
        java.lang.String str8 = response1.statusMessage();
        response1.contentType = "";
        int int11 = response1.numRedirects;
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Method method13 = response1.method();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(method13);
    }

    @Test
    public void test15446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15446");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str5 = response1.statusMessage;
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response1);
        response1.charset = "";
        boolean boolean9 = response1.executed;
        response1.executed = true;
        int int12 = response1.statusCode;
        java.nio.ByteBuffer byteBuffer13 = null;
        response1.byteData = byteBuffer13;
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = response1.hasCookie("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test15447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15447");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response6 = response1.cookie("hi!", "");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry8 = response1.scanHeaders("hi!");
        response1.contentType = "hi!";
        java.lang.String str11 = response1.charset();
        java.util.Map<java.lang.String, java.lang.String> strMap12 = response1.headers();
        java.lang.String str13 = response1.charset;
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.nio.ByteBuffer byteBuffer15 = null;
        response14.byteData = byteBuffer15;
        org.jsoup.Connection.Request request17 = response14.req;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNull(strEntry8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(request17);
    }

    @Test
    public void test15448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15448");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response4);
        int int6 = response5.numRedirects;
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response5);
        boolean boolean9 = response5.hasCookie("hi!");
        org.jsoup.Connection.Response response11 = response5.removeHeader("hi!");
        response5.charset = "";
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response5);
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response14);
        response15.statusCode = (short) 10;
        java.net.HttpURLConnection httpURLConnection18 = null;
        org.jsoup.helper.HttpConnection.Response response19 = null;
        org.jsoup.helper.HttpConnection.Response response20 = new org.jsoup.helper.HttpConnection.Response(response19);
        java.lang.String str22 = response20.getHeaderCaseInsensitive("");
        java.lang.String str23 = response20.contentType();
        int int24 = response20.statusCode;
        java.util.Map<java.lang.String, java.lang.String> strMap25 = response20.headers();
        org.jsoup.helper.HttpConnection.Response response26 = new org.jsoup.helper.HttpConnection.Response(response20);
        boolean boolean28 = response26.hasHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response29 = new org.jsoup.helper.HttpConnection.Response(response26);
        boolean boolean30 = response29.executed;
        // The following exception was thrown during execution in test generation
        try {
            response15.setupFromConnection(httpURLConnection18, (org.jsoup.Connection.Response) response29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(strMap25);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test15449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15449");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        java.lang.String str4 = response1.contentType();
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Request request6 = null;
        response1.req = request6;
        org.jsoup.Connection.Request request8 = null;
        response1.req = request8;
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response1);
        boolean boolean11 = response1.executed;
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str14 = response1.getHeaderCaseInsensitive("");
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str17 = response15.getHeaderCaseInsensitive("hi!");
        java.lang.String str18 = response15.statusMessage();
        java.lang.String str19 = response15.contentType();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test15450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15450");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response6 = response1.cookie("hi!", "");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry8 = response1.scanHeaders("hi!");
        java.lang.String str10 = response1.header("");
        java.lang.String str11 = response1.contentType();
        int int12 = response1.statusCode();
        java.util.Map<java.lang.String, java.lang.String> strMap13 = response1.cookies();
        response1.executed = true;
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNull(strEntry8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(strMap13);
    }

    @Test
    public void test15451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15451");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str4 = response2.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response7 = response2.cookie("hi!", "");
        response2.contentType = "";
        boolean boolean12 = response2.hasHeaderWithValue("hi!", "");
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response2);
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response13);
        java.lang.String str15 = response14.contentType;
        int int16 = response14.statusCode;
        java.lang.String str17 = response14.contentType();
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response(response14);
        org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response(response18);
        response19.statusMessage = "hi!";
        response19.numRedirects = 0;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response24 = org.jsoup.helper.HttpConnection.Response.execute(request0, response19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test15452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15452");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response6 = response1.cookie("hi!", "");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry8 = response1.scanHeaders("hi!");
        java.lang.String str9 = response1.charset();
        java.lang.String str10 = response1.statusMessage();
        response1.charset = "";
        java.lang.String str13 = response1.contentType;
        java.lang.String str15 = response1.getHeaderCaseInsensitive("hi!");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry17 = response1.scanHeaders("hi!");
        response1.statusMessage = "hi!";
        boolean boolean21 = response1.hasHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response22 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response23 = new org.jsoup.helper.HttpConnection.Response(response22);
        org.jsoup.helper.HttpConnection.Response response24 = new org.jsoup.helper.HttpConnection.Response(response23);
        org.jsoup.helper.HttpConnection.Response response25 = new org.jsoup.helper.HttpConnection.Response(response23);
        boolean boolean27 = response23.hasCookie("hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNull(strEntry8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(strEntry17);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test15453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15453");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response6 = response1.cookie("hi!", "");
        response1.contentType = "";
        boolean boolean11 = response1.hasHeaderWithValue("hi!", "");
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.nio.ByteBuffer byteBuffer13 = response12.byteData;
        response12.charset = "";
        response12.contentType = "";
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response(response12);
        java.lang.String str20 = response12.cookie("hi!");
        org.jsoup.helper.HttpConnection.Response response21 = new org.jsoup.helper.HttpConnection.Response(response12);
        org.jsoup.helper.HttpConnection.Response response22 = new org.jsoup.helper.HttpConnection.Response(response12);
        org.jsoup.Connection.Method method23 = response12.method();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(byteBuffer13);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(method23);
    }

    @Test
    public void test15454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15454");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response6 = response1.cookie("hi!", "");
        response1.contentType = "";
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.nio.ByteBuffer byteBuffer10 = null;
        response9.byteData = byteBuffer10;
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response9);
        response9.executed = true;
        org.jsoup.Connection.Response response17 = response9.cookie("hi!", "");
        response9.contentType = "";
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNotNull(response17);
    }

    @Test
    public void test15455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15455");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map<java.lang.String, java.lang.String> strMap2 = response1.cookies();
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response4);
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry7 = response4.scanHeaders("hi!");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry9 = response4.scanHeaders("hi!");
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response4);
        response10.charset = "hi!";
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response10);
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response10);
        response10.contentType = "";
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response10);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNull(strEntry7);
        org.junit.Assert.assertNull(strEntry9);
    }

    @Test
    public void test15456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15456");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response4);
        response5.contentType = "";
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response5);
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response5);
        java.lang.String str10 = response5.statusMessage;
        java.nio.ByteBuffer byteBuffer11 = response5.byteData;
        response5.statusCode = 3;
        int int14 = response5.statusCode();
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response5);
        java.lang.String str16 = response5.statusMessage();
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response5);
        java.lang.String str18 = response5.contentType;
        java.lang.String str20 = response5.header("hi!");
        org.jsoup.helper.HttpConnection.Response response21 = new org.jsoup.helper.HttpConnection.Response(response5);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test15457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15457");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.util.Map<java.lang.String, java.lang.String> strMap5 = response4.headers();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response4);
        java.lang.String str8 = response4.cookie("hi!");
        java.lang.String str9 = response4.statusMessage;
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response4);
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response10);
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response11);
        boolean boolean14 = response11.hasCookie("hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test15458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15458");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response6 = response1.cookie("hi!", "");
        int int7 = response1.numRedirects;
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str12 = response1.contentType();
        org.jsoup.Connection.Request request13 = response1.req;
        org.jsoup.Connection.Response response15 = response1.removeCookie("hi!");
        org.jsoup.Connection.Method method16 = response1.method();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(request13);
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertNull(method16);
    }

    @Test
    public void test15459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15459");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str2 = response1.contentType();
        java.lang.String str4 = response1.getHeaderCaseInsensitive("hi!");
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response1);
        response1.numRedirects = (short) 1;
        java.lang.String str9 = response1.getHeaderCaseInsensitive("hi!");
        java.lang.String str11 = response1.cookie("hi!");
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response12);
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response12);
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response12);
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response15);
        java.nio.ByteBuffer byteBuffer17 = null;
        response15.byteData = byteBuffer17;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = response15.cookie("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test15460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15460");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str2 = response1.contentType();
        java.lang.String str4 = response1.getHeaderCaseInsensitive("hi!");
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response1);
        response1.numRedirects = (short) 1;
        boolean boolean8 = response1.executed;
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Method method11 = response1.method();
        int int12 = response1.statusCode;
        java.lang.String str14 = response1.getHeaderCaseInsensitive("hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(method11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test15461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15461");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean2 = response1.executed;
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.util.Map<java.lang.String, java.lang.String> strMap4 = response3.headers();
        int int5 = response3.numRedirects;
        response3.charset = "hi!";
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test15462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15462");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response6 = response1.cookie("hi!", "");
        int int7 = response1.numRedirects;
        java.lang.String str9 = response1.header("");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry11 = response1.scanHeaders("");
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str13 = response12.contentType;
        org.jsoup.Connection.Request request14 = null;
        response12.req = request14;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(strEntry11);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test15463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15463");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response6 = response1.cookie("hi!", "");
        response1.contentType = "";
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Request request10 = null;
        response9.req = request10;
        int int12 = response9.statusCode();
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response9);
        response9.statusMessage = "hi!";
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response9);
        java.lang.String str17 = response9.contentType;
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response(response9);
        org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response(response18);
        org.jsoup.helper.HttpConnection.Response response20 = new org.jsoup.helper.HttpConnection.Response(response18);
        java.lang.String str22 = response18.getHeaderCaseInsensitive("hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test15464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15464");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response6 = response1.cookie("hi!", "");
        int int7 = response1.numRedirects;
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str12 = response10.header("");
        int int13 = response10.statusCode();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry15 = response10.scanHeaders("");
        java.lang.String str16 = response10.statusMessage;
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response10);
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response(response10);
        boolean boolean20 = response18.hasHeader("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap21 = response18.cookies();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(strEntry15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(strMap21);
    }

    @Test
    public void test15465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15465");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        java.lang.String str4 = response1.contentType();
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Request request6 = null;
        response1.req = request6;
        org.jsoup.Connection.Request request8 = null;
        response1.req = request8;
        response1.contentType = "";
        response1.executed = true;
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Response response17 = response14.cookie("hi!", "");
        java.net.URL uRL18 = response14.url();
        java.nio.ByteBuffer byteBuffer19 = null;
        response14.byteData = byteBuffer19;
        response14.charset = "";
        java.lang.String str24 = response14.cookie("hi!");
        org.jsoup.helper.HttpConnection.Response response25 = new org.jsoup.helper.HttpConnection.Response(response14);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(response17);
        org.junit.Assert.assertNull(uRL18);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test15466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15466");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response6 = response1.cookie("hi!", "");
        response1.contentType = "";
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Request request10 = null;
        response9.req = request10;
        int int12 = response9.statusCode();
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response9);
        response9.statusMessage = "hi!";
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response9);
        java.lang.String str18 = response16.cookie("hi!");
        org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response(response16);
        org.jsoup.helper.HttpConnection.Response response20 = new org.jsoup.helper.HttpConnection.Response(response19);
        org.jsoup.Connection.Method method21 = response20.method();
        org.jsoup.helper.HttpConnection.Response response22 = new org.jsoup.helper.HttpConnection.Response(response20);
        response22.executed = true;
        org.jsoup.helper.HttpConnection.Response response25 = new org.jsoup.helper.HttpConnection.Response(response22);
        java.lang.String str27 = response22.getHeaderCaseInsensitive("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(method21);
        org.junit.Assert.assertNull(str27);
    }

    @Test
    public void test15467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15467");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map<java.lang.String, java.lang.String> strMap2 = response1.cookies();
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str4 = response1.charset;
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        java.lang.String str8 = response1.header("");
        int int9 = response1.statusCode();
        org.jsoup.Connection.Request request10 = null;
        response1.req = request10;
        org.jsoup.Connection.Method method12 = response1.method();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(method12);
    }

    @Test
    public void test15468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15468");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        java.lang.String str4 = response1.contentType();
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Request request6 = null;
        response1.req = request6;
        org.jsoup.Connection.Request request8 = null;
        response1.req = request8;
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response1);
        boolean boolean11 = response1.executed;
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response12);
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response13);
        java.lang.String str16 = response14.cookie("hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test15469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15469");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response6 = response1.cookie("hi!", "");
        response1.contentType = "";
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Request request10 = null;
        response9.req = request10;
        int int12 = response9.statusCode();
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response9);
        java.nio.ByteBuffer byteBuffer14 = response13.byteData;
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response13);
        response15.statusCode = 405;
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response(response15);
        org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response(response18);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(byteBuffer14);
    }

    @Test
    public void test15470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15470");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response6 = response1.cookie("hi!", "");
        response1.contentType = "";
        boolean boolean11 = response1.hasHeaderWithValue("hi!", "");
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response12);
        java.lang.String str14 = response13.contentType;
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response13);
        int int16 = response15.numRedirects;
        response15.statusCode = '#';
        org.jsoup.Connection.Request request19 = response15.req;
        response15.numRedirects = (short) 0;
        java.lang.String str23 = response15.header("hi!");
        response15.statusCode = 411;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertNull(request19);
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test15471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15471");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str2 = response1.contentType();
        java.lang.String str4 = response1.getHeaderCaseInsensitive("hi!");
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response1);
        response1.numRedirects = (short) 1;
        java.nio.ByteBuffer byteBuffer8 = null;
        response1.byteData = byteBuffer8;
        java.lang.String str10 = response1.charset;
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response1);
        response1.statusCode = 403;
        boolean boolean14 = response1.executed;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test15472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15472");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response6 = response1.cookie("hi!", "");
        response1.contentType = "";
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Request request10 = null;
        response9.req = request10;
        int int12 = response9.statusCode();
        java.util.Map<java.lang.String, java.lang.String> strMap13 = response9.cookies();
        java.lang.String str14 = response9.statusMessage;
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response9);
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response15);
        response15.statusMessage = "";
        org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response(response15);
        java.lang.String str21 = response19.header("hi!");
        java.lang.String str23 = response19.getHeaderCaseInsensitive("hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test15473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15473");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean2 = response1.executed;
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response3);
        org.jsoup.Connection.Response response6 = response4.removeCookie("hi!");
        org.jsoup.Connection.Response response8 = response4.removeCookie("hi!");
        response4.charset = "hi!";
        response4.statusCode = (short) 1;
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response4);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNotNull(response8);
    }

    @Test
    public void test15474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15474");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response6 = response1.cookie("hi!", "");
        int int7 = response1.numRedirects;
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str12 = response10.header("");
        int int13 = response10.statusCode();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry15 = response10.scanHeaders("");
        java.lang.String str16 = response10.charset();
        java.net.URL uRL17 = response10.url();
        java.util.Map<java.lang.String, java.lang.String> strMap18 = response10.cookies();
        int int19 = response10.statusCode();
        org.jsoup.helper.HttpConnection.Response response20 = new org.jsoup.helper.HttpConnection.Response(response10);
        org.jsoup.helper.HttpConnection.Response response21 = new org.jsoup.helper.HttpConnection.Response(response10);
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry23 = response21.scanHeaders("hi!");
        java.lang.String str24 = response21.charset();
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray25 = response21.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(strEntry15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(uRL17);
        org.junit.Assert.assertNotNull(strMap18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNull(strEntry23);
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test15475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15475");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response6 = response1.cookie("hi!", "");
        int int7 = response1.numRedirects;
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response1);
        response1.statusCode = (byte) 1;
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Method method14 = response1.method();
        response1.charset = "hi!";
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response(response1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = response18.hasHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(method14);
    }

    @Test
    public void test15476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15476");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response6 = response1.cookie("hi!", "");
        response1.contentType = "";
        boolean boolean11 = response1.hasHeaderWithValue("hi!", "");
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response12);
        java.lang.String str14 = response13.contentType;
        java.lang.String str15 = response13.charset();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry17 = response13.scanHeaders("hi!");
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response(response13);
        org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response(response13);
        org.jsoup.helper.HttpConnection.Response response20 = new org.jsoup.helper.HttpConnection.Response(response19);
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry22 = response19.scanHeaders("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response25 = response19.cookie("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(strEntry17);
        org.junit.Assert.assertNull(strEntry22);
    }

    @Test
    public void test15477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15477");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str2 = response1.contentType();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry4 = response1.scanHeaders("");
        java.lang.String str5 = response1.charset();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response7);
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response7);
        java.lang.String str10 = response7.statusMessage();
        boolean boolean11 = response7.executed;
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response7);
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response12);
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response12);
        java.lang.String str15 = response14.statusMessage;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = response14.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(strEntry4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test15478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15478");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response6 = response1.cookie("hi!", "");
        response1.contentType = "";
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Request request10 = null;
        response9.req = request10;
        int int12 = response9.statusCode();
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response9);
        int int14 = response9.statusCode;
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response9);
        java.util.Map<java.lang.String, java.lang.String> strMap16 = response15.cookies();
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response15);
        response17.charset = "";
        org.jsoup.helper.HttpConnection.Response response20 = new org.jsoup.helper.HttpConnection.Response(response17);
        org.jsoup.helper.HttpConnection.Response response21 = new org.jsoup.helper.HttpConnection.Response(response17);
        java.lang.String str23 = response17.getHeaderCaseInsensitive("");
        boolean boolean25 = response17.hasHeader("hi!");
        int int26 = response17.statusCode();
        response17.contentType = "hi!";
        java.lang.String str29 = response17.charset;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
    }

    @Test
    public void test15479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15479");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response6 = response1.cookie("hi!", "");
        int int7 = response1.numRedirects;
        response1.contentType = "";
        java.nio.ByteBuffer byteBuffer10 = response1.byteData;
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str12 = response1.charset;
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response1);
        response13.statusMessage = "hi!";
        org.jsoup.Connection.Request request16 = null;
        response13.req = request16;
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response(response13);
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry20 = response13.scanHeaders("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(byteBuffer10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(strEntry20);
    }

    @Test
    public void test15480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15480");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Response response6 = response4.removeCookie("hi!");
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response4);
        java.net.URL uRL8 = response7.url();
        org.jsoup.Connection.Method method9 = response7.method();
        java.lang.String str11 = response7.getHeaderCaseInsensitive("hi!");
        response7.contentType = "";
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response7);
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response14);
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response15);
        java.nio.ByteBuffer byteBuffer17 = null;
        response16.byteData = byteBuffer17;
        org.jsoup.Connection.Method method19 = response16.method();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNull(uRL8);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(method19);
    }

    @Test
    public void test15481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15481");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Method method2 = response1.method();
        java.lang.String str4 = response1.cookie("hi!");
        int int5 = response1.statusCode;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry7 = response1.scanHeaders("hi!");
        java.nio.ByteBuffer byteBuffer8 = response1.byteData;
        org.jsoup.Connection.Response response10 = response1.removeCookie("hi!");
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str13 = response1.header("");
        response1.numRedirects = 301;
        java.nio.ByteBuffer byteBuffer16 = null;
        response1.byteData = byteBuffer16;
        java.lang.String str18 = response1.contentType();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response21 = response1.cookie("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(strEntry7);
        org.junit.Assert.assertNull(byteBuffer8);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test15482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15482");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map<java.lang.String, java.lang.String> strMap2 = response1.cookies();
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response4);
        java.util.Map<java.lang.String, java.lang.String> strMap6 = response5.headers();
        response5.charset = "hi!";
        java.util.Map<java.lang.String, java.lang.String> strMap9 = response5.headers();
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response5);
        java.nio.ByteBuffer byteBuffer11 = null;
        response10.byteData = byteBuffer11;
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(strMap9);
    }

    @Test
    public void test15483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15483");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str5 = response1.statusMessage;
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response6);
        int int8 = response7.numRedirects;
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response7);
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response9);
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response9);
        boolean boolean12 = response9.executed;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document13 = response9.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test15484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15484");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        java.lang.String str4 = response1.contentType();
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response1);
        response5.executed = false;
        java.lang.String str9 = response5.getHeaderCaseInsensitive("hi!");
        java.lang.String str11 = response5.getHeaderCaseInsensitive("hi!");
        int int12 = response5.numRedirects;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test15485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15485");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response6 = response1.cookie("hi!", "");
        response1.contentType = "";
        boolean boolean11 = response1.hasHeaderWithValue("hi!", "");
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.nio.ByteBuffer byteBuffer13 = response12.byteData;
        java.util.Map<java.lang.String, java.lang.String> strMap14 = response12.headers();
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response12);
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response15);
        java.lang.String str17 = response15.charset();
        response15.charset = "hi!";
        org.jsoup.helper.HttpConnection.Response response20 = new org.jsoup.helper.HttpConnection.Response(response15);
        java.lang.String str21 = response20.statusMessage;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(byteBuffer13);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test15486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15486");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response6 = response1.cookie("hi!", "");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry8 = response1.scanHeaders("hi!");
        java.lang.String str9 = response1.charset();
        java.lang.String str10 = response1.statusMessage();
        response1.charset = "";
        java.util.Map<java.lang.String, java.lang.String> strMap13 = response1.headers();
        java.nio.ByteBuffer byteBuffer14 = null;
        response1.byteData = byteBuffer14;
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str18 = response16.getHeaderCaseInsensitive("");
        org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response(response16);
        org.jsoup.helper.HttpConnection.Response response20 = new org.jsoup.helper.HttpConnection.Response(response16);
        java.lang.String str21 = response20.contentType;
        org.jsoup.Connection.Method method22 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response23 = response20.method(method22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNull(strEntry8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test15487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15487");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean2 = response1.executed;
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response1);
        response1.statusMessage = "hi!";
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response6);
        java.lang.String str8 = response7.charset;
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response7);
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response9);
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response10);
        response11.charset = "";
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test15488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15488");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response6 = response1.cookie("hi!", "");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry8 = response1.scanHeaders("hi!");
        response1.contentType = "hi!";
        response1.contentType = "";
        int int13 = response1.numRedirects;
        int int14 = response1.statusCode;
        org.jsoup.Connection.Request request15 = null;
        response1.req = request15;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNull(strEntry8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test15489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15489");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map<java.lang.String, java.lang.String> strMap2 = response1.cookies();
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry6 = response4.scanHeaders("");
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response4);
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response7);
        java.lang.String str9 = response7.charset;
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response7);
        java.lang.String str11 = response10.charset;
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response10);
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response10);
        boolean boolean15 = response10.hasCookie("hi!");
        int int16 = response10.statusCode;
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response10);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNull(strEntry6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test15490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15490");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response6 = response1.cookie("hi!", "");
        response1.contentType = "";
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response9);
        java.lang.String str11 = response9.contentType();
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response9);
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response9);
        boolean boolean16 = response13.hasHeaderWithValue("hi!", "");
        java.util.Map<java.lang.String, java.lang.String> strMap17 = response13.cookies();
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response(response13);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(strMap17);
    }

    @Test
    public void test15491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15491");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map<java.lang.String, java.lang.String> strMap2 = response1.cookies();
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry6 = response4.scanHeaders("");
        java.lang.String str7 = response4.charset();
        boolean boolean10 = response4.hasHeaderWithValue("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response4);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document12 = response4.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNull(strEntry6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test15492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15492");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response4);
        org.jsoup.Connection.Request request6 = null;
        response5.req = request6;
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response5);
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response8);
        org.jsoup.Connection.Request request10 = null;
        response9.req = request10;
        response9.charset = "";
        java.net.URL uRL14 = response9.url();
        java.lang.String str15 = response9.contentType;
        java.lang.String str16 = response9.charset;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(uRL14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test15493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15493");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str5 = response1.statusMessage;
        response1.statusCode = 505;
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Method method9 = response1.method();
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response10);
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response10);
        java.lang.String str14 = response12.header("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = response12.cookie("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test15494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15494");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response6 = response1.cookie("hi!", "");
        response1.contentType = "";
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Method method11 = response1.method();
        boolean boolean13 = response1.hasCookie("hi!");
        java.net.URL uRL14 = response1.url();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNull(method11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(uRL14);
    }

    @Test
    public void test15495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15495");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response6 = response1.cookie("hi!", "");
        int int7 = response1.numRedirects;
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str11 = response1.statusMessage();
        java.lang.String str12 = response1.statusMessage;
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response13);
        org.jsoup.Connection.Method method15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response16 = response14.method(method15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test15496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15496");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response6 = response1.cookie("hi!", "");
        response1.contentType = "";
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Request request10 = null;
        response9.req = request10;
        int int12 = response9.statusCode();
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response9);
        int int14 = response9.statusCode;
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response9);
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response9);
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response16);
        java.nio.ByteBuffer byteBuffer18 = response17.byteData;
        org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response(response17);
        org.jsoup.helper.HttpConnection.Response response20 = new org.jsoup.helper.HttpConnection.Response(response19);
        java.lang.String str21 = response19.charset;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(byteBuffer18);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test15497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15497");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean2 = response1.executed;
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response3);
        java.lang.String str5 = response4.contentType;
        org.jsoup.Connection.Request request6 = response4.req;
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response4);
        int int8 = response7.statusCode();
        java.lang.String str9 = response7.charset();
        org.jsoup.Connection.Method method10 = response7.method();
        org.jsoup.Connection.Request request11 = response7.req;
        org.jsoup.Connection.Response response14 = response7.header("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response7);
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response15);
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response15);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(request6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNull(request11);
        org.junit.Assert.assertNotNull(response14);
    }

    @Test
    public void test15498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15498");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response6 = response1.cookie("hi!", "");
        int int7 = response1.numRedirects;
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response8);
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response9);
        java.lang.String str11 = response10.statusMessage();
        java.util.Map<java.lang.String, java.lang.String> strMap12 = response10.cookies();
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response10);
        org.jsoup.Connection.Response response16 = response13.cookie("hi!", "");
        java.lang.String str17 = response13.contentType();
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response(response13);
        boolean boolean19 = response18.executed;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test15499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15499");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str4 = response2.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response7 = response2.cookie("hi!", "");
        response2.contentType = "";
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response2);
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response10);
        boolean boolean12 = response10.executed;
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response10);
        java.lang.String str14 = response13.contentType;
        java.net.URL uRL15 = response13.url();
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response13);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response17 = org.jsoup.helper.HttpConnection.Response.execute(request0, response16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(uRL15);
    }

    @Test
    public void test15500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15500");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map<java.lang.String, java.lang.String> strMap2 = response1.cookies();
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response4);
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry7 = response4.scanHeaders("hi!");
        org.jsoup.Connection.Method method8 = response4.method();
        response4.charset = "";
        boolean boolean12 = response4.hasHeader("hi!");
        java.lang.String str14 = response4.header("hi!");
        response4.executed = true;
        java.lang.String str17 = response4.contentType();
        java.lang.String str18 = response4.contentType();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNull(strEntry7);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
    }
}
