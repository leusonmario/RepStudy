import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest20 {

    public static boolean debug = false;

    @Test
    public void test10001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10001");
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
        java.nio.ByteBuffer byteBuffer18 = null;
        response1.byteData = byteBuffer18;
        org.jsoup.Connection.Request request20 = response1.req;
        java.lang.String str21 = response1.contentType;
        java.util.Map<java.lang.String, java.lang.String> strMap22 = response1.headers();
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(request20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNotNull(strMap22);
    }

    @Test
    public void test10002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10002");
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
        java.lang.String str19 = response1.statusMessage();
        java.nio.ByteBuffer byteBuffer20 = response1.byteData;
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(strMap17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(byteBuffer20);
    }

    @Test
    public void test10003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10003");
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
        java.net.URL uRL19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response20 = response1.url(uRL19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
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
    public void test10004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10004");
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
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str20 = response1.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Request request21 = response1.req;
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(method14);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(request21);
    }

    @Test
    public void test10005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10005");
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
        java.util.Map<java.lang.String, java.lang.String> strMap15 = response1.cookies();
        int int16 = response1.statusCode();
        org.jsoup.Connection.Request request17 = response1.req;
        boolean boolean19 = response1.hasHeader("Location");
        org.jsoup.Connection.Response response22 = response1.cookie("hi!", "Location");
        org.jsoup.Connection.Method method23 = response1.method();
        response1.charset = "Location";
        int int26 = response1.statusCode();
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(request17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(response22);
        org.junit.Assert.assertNull(method23);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test10006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10006");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        org.jsoup.Connection.Response response8 = response1.cookie("hi!", "");
        org.jsoup.Connection.Response response11 = response1.cookie("Location", "");
        boolean boolean14 = response1.hasHeaderWithValue("hi!", "");
        org.jsoup.Connection.Method method15 = response1.method();
        int int16 = response1.numRedirects;
        response1.numRedirects = 'a';
        boolean boolean21 = response1.hasHeaderWithValue("Location", "");
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test10007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10007");
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
        java.lang.String str15 = response1.statusMessage();
        java.net.URL uRL16 = response1.url();
        org.jsoup.Connection.Method method17 = response1.method();
        java.util.Map<java.lang.String, java.lang.String> strMap18 = response1.cookies();
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(uRL16);
        org.junit.Assert.assertNull(method17);
        org.junit.Assert.assertNotNull(strMap18);
    }

    @Test
    public void test10008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10008");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        org.jsoup.Connection.Request request5 = null;
        response1.req = request5;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry8 = response1.scanHeaders("Location");
        org.jsoup.Connection.Response response11 = response1.cookie("Location", "Location");
        org.jsoup.Connection.Response response13 = response1.removeHeader("hi!");
        int int14 = response1.statusCode;
        java.nio.ByteBuffer byteBuffer15 = response1.byteData;
        org.jsoup.Connection.Response response17 = response1.removeCookie("hi!");
        int int18 = response1.numRedirects;
        java.lang.String str19 = response1.statusMessage();
        int int20 = response1.statusCode();
        java.nio.ByteBuffer byteBuffer21 = null;
        response1.byteData = byteBuffer21;
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(strEntry8);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(byteBuffer15);
        org.junit.Assert.assertNotNull(response17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test10009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10009");
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
        java.lang.String str18 = response1.cookie("hi!");
        java.lang.String str19 = response1.statusMessage;
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test10010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10010");
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
        org.jsoup.Connection.Response response18 = response1.header("Location", "");
        java.lang.String str20 = response1.cookie("Location");
        java.lang.String str21 = response1.statusMessage();
        int int22 = response1.numRedirects;
        int int23 = response1.statusCode;
        org.jsoup.Connection.Response response26 = response1.header("Location", "hi!");
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertNull(strEntry13);
        org.junit.Assert.assertNotNull(response18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(response26);
    }

    @Test
    public void test10011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10011");
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
        boolean boolean22 = response1.executed;
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test10012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10012");
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
        response1.statusCode = 0;
        java.util.Map<java.lang.String, java.lang.String> strMap23 = response1.cookies();
        org.jsoup.Connection.Response response25 = response1.removeHeader("Location");
        response1.numRedirects = ' ';
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(byteBuffer13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(response20);
        org.junit.Assert.assertNotNull(strMap23);
        org.junit.Assert.assertNotNull(response25);
    }

    @Test
    public void test10013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10013");
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
        org.jsoup.Connection.Request request16 = response1.req;
        int int17 = response1.numRedirects;
        boolean boolean20 = response1.hasHeaderWithValue("hi!", "hi!");
        java.lang.String str22 = response1.getHeaderCaseInsensitive("Location");
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(request16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test10014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10014");
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
        response1.numRedirects = 'a';
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
    public void test10015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10015");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        response1.executed = false;
        response1.executed = true;
        boolean boolean11 = response1.executed;
        java.lang.String str12 = response1.statusMessage();
        boolean boolean13 = response1.executed;
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test10016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10016");
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
        int int25 = response1.numRedirects;
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
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test10017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10017");
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
        response1.executed = true;
        java.lang.String str18 = response1.statusMessage();
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray19 = response1.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test10018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10018");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        org.jsoup.Connection.Response response8 = response1.cookie("hi!", "");
        java.lang.String str9 = response1.statusMessage();
        java.lang.String str10 = response1.charset;
        java.lang.String str11 = response1.charset();
        java.nio.ByteBuffer byteBuffer12 = response1.byteData;
        java.lang.String str14 = response1.header("");
        response1.executed = true;
        int int17 = response1.numRedirects;
        org.jsoup.Connection.Request request18 = null;
        response1.req = request18;
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(byteBuffer12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test10019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10019");
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
        org.jsoup.Connection.Response response21 = response1.removeCookie("Location");
        boolean boolean22 = response1.executed;
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(strMap19);
        org.junit.Assert.assertNotNull(response21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test10020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10020");
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
        boolean boolean31 = response1.hasHeaderWithValue("hi!", "Location");
        org.jsoup.Connection.Response response33 = response1.removeCookie("hi!");
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
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(response33);
    }

    @Test
    public void test10021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10021");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        boolean boolean6 = response1.hasCookie("hi!");
        response1.charset = "hi!";
        java.net.URL uRL9 = response1.url();
        int int10 = response1.statusCode;
        java.nio.ByteBuffer byteBuffer11 = response1.byteData;
        java.lang.String str12 = response1.contentType;
        int int13 = response1.statusCode();
        java.nio.ByteBuffer byteBuffer14 = null;
        response1.byteData = byteBuffer14;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry17 = response1.scanHeaders("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = response1.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(strEntry17);
    }

    @Test
    public void test10022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10022");
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
        java.net.HttpURLConnection httpURLConnection16 = null;
        org.jsoup.helper.HttpConnection.Response response17 = null;
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response(response17);
        org.jsoup.Connection.Request request19 = null;
        response18.req = request19;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry22 = response18.scanHeaders("hi!");
        response18.charset = "hi!";
        int int25 = response18.numRedirects;
        response18.contentType = "hi!";
        java.nio.ByteBuffer byteBuffer28 = response18.byteData;
        java.lang.String str29 = response18.statusMessage();
        java.lang.String str30 = response18.charset();
        org.jsoup.Connection.Response response33 = response18.header("Location", "hi!");
        org.jsoup.helper.HttpConnection.Response response34 = new org.jsoup.helper.HttpConnection.Response(response18);
        java.lang.String str35 = response34.contentType();
        boolean boolean38 = response34.hasHeaderWithValue("Location", "hi!");
        java.nio.ByteBuffer byteBuffer39 = null;
        response34.byteData = byteBuffer39;
        java.nio.ByteBuffer byteBuffer41 = null;
        response34.byteData = byteBuffer41;
        // The following exception was thrown during execution in test generation
        try {
            response1.setupFromConnection(httpURLConnection16, (org.jsoup.Connection.Response) response34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(byteBuffer5);
        org.junit.Assert.assertNull(byteBuffer6);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertNull(strEntry22);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNull(byteBuffer28);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertNotNull(response33);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test10023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10023");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.numRedirects = (byte) -1;
        boolean boolean5 = response1.hasCookie("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap6 = response1.headers();
        java.nio.ByteBuffer byteBuffer7 = null;
        response1.byteData = byteBuffer7;
        response1.charset = "Location";
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response1);
        boolean boolean14 = response1.hasHeaderWithValue("hi!", "Location");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray15 = response1.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test10024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10024");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        org.jsoup.Connection.Request request4 = null;
        response1.req = request4;
        java.lang.String str6 = response1.charset;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry8 = response1.scanHeaders("");
        java.net.URL uRL9 = response1.url();
        java.util.Map<java.lang.String, java.lang.String> strMap10 = response1.cookies();
        java.nio.ByteBuffer byteBuffer11 = response1.byteData;
        response1.statusCode = 'a';
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(strEntry8);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNull(byteBuffer11);
    }

    @Test
    public void test10025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10025");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        org.jsoup.Connection.Request request5 = null;
        response1.req = request5;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry8 = response1.scanHeaders("Location");
        org.jsoup.Connection.Response response11 = response1.cookie("Location", "Location");
        org.jsoup.Connection.Response response13 = response1.removeHeader("hi!");
        int int14 = response1.statusCode;
        java.nio.ByteBuffer byteBuffer15 = response1.byteData;
        org.jsoup.Connection.Response response17 = response1.removeCookie("hi!");
        java.lang.String str18 = response1.statusMessage;
        int int19 = response1.statusCode;
        java.net.URL uRL20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response21 = response1.url(uRL20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(strEntry8);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(byteBuffer15);
        org.junit.Assert.assertNotNull(response17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test10026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10026");
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
        response1.executed = false;
        java.lang.String str18 = response1.contentType();
        org.jsoup.Connection.Response response21 = response1.cookie("Location", "Location");
        java.nio.ByteBuffer byteBuffer22 = null;
        response1.byteData = byteBuffer22;
        response1.executed = false;
        org.jsoup.Connection.Method method26 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response27 = response1.method(method26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(strEntry8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(uRL14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(response21);
    }

    @Test
    public void test10027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10027");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        org.jsoup.Connection.Response response8 = response1.cookie("hi!", "");
        boolean boolean9 = response1.executed;
        int int10 = response1.statusCode;
        response1.statusMessage = "hi!";
        java.net.URL uRL13 = response1.url();
        java.net.URL uRL14 = response1.url();
        java.lang.String str15 = response1.contentType;
        java.net.URL uRL16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response17 = response1.url(uRL16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(uRL13);
        org.junit.Assert.assertNull(uRL14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test10028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10028");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.charset = "Location";
        java.nio.ByteBuffer byteBuffer4 = null;
        response1.byteData = byteBuffer4;
        int int6 = response1.statusCode;
        response1.contentType = "hi!";
        java.lang.String str10 = response1.getHeaderCaseInsensitive("hi!");
        org.jsoup.Connection.Request request11 = null;
        response1.req = request11;
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test10029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10029");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        org.jsoup.Connection.Request request5 = null;
        response1.req = request5;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry8 = response1.scanHeaders("Location");
        boolean boolean11 = response1.hasHeaderWithValue("hi!", "");
        java.util.Map<java.lang.String, java.lang.String> strMap12 = response1.headers();
        java.nio.ByteBuffer byteBuffer13 = response1.byteData;
        org.jsoup.Connection.Method method14 = response1.method();
        response1.numRedirects = (byte) -1;
        java.lang.String str17 = response1.statusMessage;
        java.lang.String str18 = response1.charset();
        java.util.Map<java.lang.String, java.lang.String> strMap19 = response1.cookies();
        java.lang.String str21 = response1.getHeaderCaseInsensitive("hi!");
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(strEntry8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertNull(byteBuffer13);
        org.junit.Assert.assertNull(method14);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(strMap19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test10030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10030");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        org.jsoup.Connection.Request request5 = null;
        response1.req = request5;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry8 = response1.scanHeaders("Location");
        boolean boolean11 = response1.hasHeaderWithValue("hi!", "");
        java.util.Map<java.lang.String, java.lang.String> strMap12 = response1.headers();
        java.lang.String str13 = response1.charset;
        org.jsoup.Connection.Response response15 = response1.removeHeader("Location");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry17 = response1.scanHeaders("Location");
        response1.executed = false;
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(strEntry8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertNull(strEntry17);
    }

    @Test
    public void test10031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10031");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Response response5 = response2.header("hi!", "");
        org.jsoup.Connection.Response response7 = response2.removeCookie("Location");
        response2.statusCode = '#';
        org.jsoup.Connection.Response response11 = response2.removeCookie("Location");
        java.lang.String str12 = response2.charset;
        java.util.Map<java.lang.String, java.lang.String> strMap13 = response2.cookies();
        response2.statusMessage = "hi!";
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response16 = org.jsoup.helper.HttpConnection.Response.execute(request0, response2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(strMap13);
    }

    @Test
    public void test10032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10032");
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
        java.util.Map<java.lang.String, java.lang.String> strMap19 = response1.cookies();
        response1.executed = false;
        response1.executed = true;
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(strEntry8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(response17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(strMap19);
    }

    @Test
    public void test10033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10033");
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
        response1.contentType = "hi!";
        java.lang.String str22 = response1.cookie("Location");
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
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Location" + "'", str18, "Location");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Location" + "'", str22, "Location");
    }

    @Test
    public void test10034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10034");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        org.jsoup.Connection.Response response8 = response1.cookie("hi!", "");
        java.lang.String str9 = response1.statusMessage();
        org.jsoup.Connection.Request request10 = response1.req;
        response1.numRedirects = 0;
        org.jsoup.Connection.Request request13 = response1.req;
        java.lang.String str15 = response1.header("");
        boolean boolean16 = response1.executed;
        java.lang.String str18 = response1.header("hi!");
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(request10);
        org.junit.Assert.assertNull(request13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test10035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10035");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        org.jsoup.Connection.Request request5 = null;
        response1.req = request5;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry8 = response1.scanHeaders("Location");
        boolean boolean11 = response1.hasHeaderWithValue("hi!", "");
        int int12 = response1.statusCode;
        org.jsoup.Connection.Request request13 = response1.req;
        int int14 = response1.numRedirects;
        java.util.Map<java.lang.String, java.lang.String> strMap15 = response1.cookies();
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(strEntry8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(request13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(strMap15);
    }

    @Test
    public void test10036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10036");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        org.jsoup.Connection.Response response8 = response1.cookie("hi!", "");
        boolean boolean9 = response1.executed;
        java.lang.String str10 = response1.contentType;
        int int11 = response1.statusCode();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry13 = response1.scanHeaders("hi!");
        java.lang.String str15 = response1.header("hi!");
        response1.statusMessage = "hi!";
        java.lang.String str19 = response1.header("");
        response1.statusCode = (byte) 0;
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(strEntry13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test10037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10037");
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
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry14 = response1.scanHeaders("Location");
        java.util.Map<java.lang.String, java.lang.String> strMap15 = response1.headers();
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(strEntry14);
        org.junit.Assert.assertNotNull(strMap15);
    }

    @Test
    public void test10038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10038");
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
        int int14 = response1.numRedirects;
        java.net.URL uRL15 = response1.url();
        boolean boolean17 = response1.hasHeader("hi!");
        org.jsoup.Connection.Method method18 = response1.method();
        java.lang.String str20 = response1.cookie("hi!");
        java.lang.String str21 = response1.charset();
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(uRL15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(method18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test10039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10039");
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
        org.jsoup.Connection.Method method23 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response24 = response1.method(method23);
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
    }

    @Test
    public void test10040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10040");
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
        response1.numRedirects = (short) 100;
        org.jsoup.Connection.Request request17 = null;
        response1.req = request17;
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertNull(request14);
    }

    @Test
    public void test10041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10041");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        java.lang.String str8 = response1.contentType();
        java.lang.String str9 = response1.contentType;
        int int10 = response1.numRedirects;
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response1);
        response11.charset = "";
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document14 = response11.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test10042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10042");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        response1.executed = false;
        org.jsoup.Connection.Response response11 = response1.header("Location", "");
        int int12 = response1.statusCode;
        java.lang.String str13 = response1.charset();
        java.util.Map<java.lang.String, java.lang.String> strMap14 = response1.headers();
        org.jsoup.Connection.Request request15 = response1.req;
        org.jsoup.Connection.Response response17 = response1.removeHeader("hi!");
        java.nio.ByteBuffer byteBuffer18 = response1.byteData;
        java.lang.String str19 = response1.contentType();
        java.util.Map<java.lang.String, java.lang.String> strMap20 = response1.headers();
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNull(request15);
        org.junit.Assert.assertNotNull(response17);
        org.junit.Assert.assertNull(byteBuffer18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(strMap20);
    }

    @Test
    public void test10043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10043");
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
        java.util.Map<java.lang.String, java.lang.String> strMap17 = response1.headers();
        java.lang.String str18 = response1.statusMessage;
        int int19 = response1.numRedirects;
        java.util.Map<java.lang.String, java.lang.String> strMap20 = response1.headers();
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
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(strEntry12);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(strMap17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(strMap20);
    }

    @Test
    public void test10044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10044");
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
        java.lang.String str19 = response1.contentType;
        java.net.URL uRL20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response21 = response1.url(uRL20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(strEntry18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test10045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10045");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        java.lang.String str8 = response1.contentType();
        java.lang.String str9 = response1.contentType;
        org.jsoup.Connection.Response response11 = response1.removeCookie("hi!");
        org.jsoup.Connection.Response response14 = response1.header("Location", "");
        java.lang.String str15 = response1.contentType();
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test10046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10046");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        java.lang.String str7 = response1.contentType();
        java.lang.String str9 = response1.header("hi!");
        java.lang.String str10 = response1.statusMessage;
        response1.contentType = "Location";
        java.lang.String str14 = response1.getHeaderCaseInsensitive("Location");
        response1.numRedirects = (byte) 0;
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Response response19 = response1.removeCookie("hi!");
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(response19);
    }

    @Test
    public void test10047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10047");
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
        java.nio.ByteBuffer byteBuffer18 = null;
        response1.byteData = byteBuffer18;
        org.jsoup.Connection.Request request20 = response1.req;
        java.lang.String str21 = response1.contentType;
        java.lang.String str22 = response1.charset();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry24 = response1.scanHeaders("Location");
        org.jsoup.Connection.Response response26 = response1.removeCookie("hi!");
        int int27 = response1.numRedirects;
        java.net.HttpURLConnection httpURLConnection28 = null;
        org.jsoup.Connection.Response response29 = null;
        // The following exception was thrown during execution in test generation
        try {
            response1.setupFromConnection(httpURLConnection28, response29);
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
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(request20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNull(strEntry24);
        org.junit.Assert.assertNotNull(response26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test10048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10048");
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
        org.jsoup.Connection.Response response25 = response1.header("hi!", "");
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
        org.junit.Assert.assertNotNull(response25);
    }

    @Test
    public void test10049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10049");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        org.jsoup.Connection.Response response8 = response1.cookie("hi!", "");
        java.lang.String str9 = response1.statusMessage();
        java.lang.String str10 = response1.statusMessage();
        boolean boolean12 = response1.hasHeader("Location");
        java.nio.ByteBuffer byteBuffer13 = response1.byteData;
        java.nio.ByteBuffer byteBuffer14 = null;
        response1.byteData = byteBuffer14;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = response1.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(byteBuffer13);
    }

    @Test
    public void test10050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10050");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document23 = response22.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(method13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(strEntry16);
        org.junit.Assert.assertNotNull(response21);
    }

    @Test
    public void test10051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10051");
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
        org.jsoup.Connection.Method method21 = response1.method();
        java.lang.String str23 = response1.header("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response26 = response1.header("", "Location");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(method21);
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test10052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10052");
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
        java.util.Map<java.lang.String, java.lang.String> strMap14 = response1.headers();
        int int15 = response1.statusCode();
        int int16 = response1.numRedirects;
        boolean boolean17 = response1.executed;
        org.jsoup.Connection.Method method18 = response1.method();
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(method18);
    }

    @Test
    public void test10053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10053");
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
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry25 = response1.scanHeaders("");
        org.jsoup.Connection.Method method26 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response27 = response1.method(method26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
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
        org.junit.Assert.assertNull(strEntry25);
    }

    @Test
    public void test10054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10054");
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
        java.lang.String str16 = response1.charset();
        java.lang.String str17 = response1.statusMessage;
        response1.numRedirects = '#';
        java.lang.String str21 = response1.getHeaderCaseInsensitive("Location");
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test10055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10055");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        boolean boolean6 = response1.hasCookie("hi!");
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.util.Map<java.lang.String, java.lang.String> strMap8 = response7.cookies();
        response7.charset = "hi!";
        java.lang.String str12 = response7.getHeaderCaseInsensitive("");
        java.lang.String str13 = response7.charset();
        java.util.Map<java.lang.String, java.lang.String> strMap14 = response7.cookies();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response7);
// flaky:             org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Too many redirects occurred trying to load URL null");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(strMap14);
    }

    @Test
    public void test10056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10056");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        org.jsoup.Connection.Response response10 = response1.header("Location", "Location");
        java.lang.String str11 = response1.charset();
        java.nio.ByteBuffer byteBuffer12 = response1.byteData;
        java.lang.String str13 = response1.contentType();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response16 = response1.header("", "Location");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(byteBuffer12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test10057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10057");
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
        java.lang.String str13 = response1.contentType();
        java.lang.String str15 = response1.header("hi!");
        org.jsoup.Connection.Response response17 = response1.removeHeader("hi!");
        java.lang.String str18 = response1.charset;
        boolean boolean20 = response1.hasHeader("Location");
        java.lang.String str21 = response1.contentType();
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(request10);
        org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(response17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test10058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10058");
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
        int int19 = response1.numRedirects;
        response1.executed = false;
        org.jsoup.Connection.Response response23 = response1.removeCookie("Location");
        org.jsoup.Connection.Method method24 = response1.method();
        response1.numRedirects = (byte) -1;
        java.lang.Class<?> wildcardClass27 = response1.getClass();
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(uRL12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(response18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(response23);
        org.junit.Assert.assertNull(method24);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test10059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10059");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        response1.charset = "";
        java.lang.String str8 = response1.cookie("hi!");
        boolean boolean9 = response1.executed;
        java.lang.String str10 = response1.contentType;
        response1.statusCode = (short) 1;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry14 = response1.scanHeaders("");
        java.lang.String str15 = response1.contentType;
        int int16 = response1.numRedirects;
        java.net.URL uRL17 = response1.url();
        java.net.HttpURLConnection httpURLConnection18 = null;
        org.jsoup.helper.HttpConnection.Response response19 = null;
        org.jsoup.helper.HttpConnection.Response response20 = new org.jsoup.helper.HttpConnection.Response(response19);
        org.jsoup.Connection.Response response23 = response20.header("hi!", "");
        java.lang.String str25 = response20.getHeaderCaseInsensitive("");
        java.lang.String str26 = response20.contentType();
        int int27 = response20.numRedirects;
        int int28 = response20.statusCode();
        java.lang.String str30 = response20.cookie("Location");
        boolean boolean31 = response20.executed;
        // The following exception was thrown during execution in test generation
        try {
            response1.setupFromConnection(httpURLConnection18, (org.jsoup.Connection.Response) response20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(strEntry14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(uRL17);
        org.junit.Assert.assertNotNull(response23);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test10060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10060");
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
        org.jsoup.Connection.Response response17 = response1.removeHeader("hi!");
        int int18 = response1.statusCode();
        response1.statusMessage = "hi!";
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(byteBuffer13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(response17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test10061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10061");
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
        org.jsoup.Connection.Method method16 = response1.method();
        java.util.Map<java.lang.String, java.lang.String> strMap17 = response1.headers();
        java.lang.String str18 = response1.statusMessage;
        org.jsoup.Connection.Response response21 = response1.cookie("Location", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = response1.hasHeaderWithValue("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(method16);
        org.junit.Assert.assertNotNull(strMap17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(response21);
    }

    @Test
    public void test10062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10062");
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
        int int18 = response1.numRedirects;
        org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Method method20 = response19.method();
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(method20);
    }

    @Test
    public void test10063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10063");
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
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Request request16 = null;
        response15.req = request16;
        boolean boolean18 = response15.executed;
        java.util.Map<java.lang.String, java.lang.String> strMap19 = response15.headers();
        int int20 = response15.statusCode;
        java.lang.String str21 = response15.charset();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry23 = response15.scanHeaders("hi!");
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(strMap19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(strEntry23);
    }

    @Test
    public void test10064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10064");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        org.jsoup.Connection.Request request5 = null;
        response1.req = request5;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry8 = response1.scanHeaders("Location");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry10 = response1.scanHeaders("Location");
        org.jsoup.Connection.Method method11 = response1.method();
        response1.numRedirects = (byte) 1;
        boolean boolean16 = response1.hasHeaderWithValue("Location", "hi!");
        org.jsoup.Connection.Request request17 = null;
        response1.req = request17;
        int int19 = response1.statusCode;
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(strEntry8);
        org.junit.Assert.assertNull(strEntry10);
        org.junit.Assert.assertNull(method11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test10065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10065");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        response1.charset = "";
        java.lang.String str8 = response1.cookie("hi!");
        boolean boolean9 = response1.executed;
        response1.statusMessage = "Location";
        org.jsoup.Connection.Request request12 = null;
        response1.req = request12;
        java.lang.String str14 = response1.charset;
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray15 = response1.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test10066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10066");
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
        java.lang.String str17 = response1.statusMessage();
        org.jsoup.Connection.Response response19 = response1.removeCookie("Location");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry21 = response1.scanHeaders("hi!");
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertNull(strEntry13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(response19);
        org.junit.Assert.assertNull(strEntry21);
    }

    @Test
    public void test10067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10067");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        org.jsoup.Connection.Response response8 = response1.cookie("hi!", "");
        java.lang.String str9 = response1.statusMessage();
        org.jsoup.Connection.Request request10 = response1.req;
        response1.numRedirects = 0;
        org.jsoup.Connection.Request request13 = response1.req;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry15 = response1.scanHeaders("Location");
        java.lang.String str16 = response1.charset;
        org.jsoup.Connection.Response response19 = response1.cookie("Location", "Location");
        int int20 = response1.statusCode();
        java.lang.String str21 = response1.contentType();
        org.jsoup.Connection.Request request22 = response1.req;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = response1.hasHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(request10);
        org.junit.Assert.assertNull(request13);
        org.junit.Assert.assertNull(strEntry15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(response19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(request22);
    }

    @Test
    public void test10068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10068");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.charset = "Location";
        boolean boolean6 = response1.hasHeaderWithValue("hi!", "Location");
        response1.numRedirects = (byte) 100;
        java.lang.String str10 = response1.header("hi!");
        java.lang.String str12 = response1.header("Location");
        org.jsoup.Connection.Request request13 = null;
        response1.req = request13;
        int int15 = response1.statusCode();
        java.lang.String str17 = response1.cookie("Location");
        java.nio.ByteBuffer byteBuffer18 = null;
        response1.byteData = byteBuffer18;
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test10069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10069");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        response1.executed = false;
        response1.statusCode = 100;
        boolean boolean12 = response1.hasHeader("Location");
        response1.contentType = "Location";
        java.lang.Class<?> wildcardClass15 = response1.getClass();
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test10070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10070");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        org.jsoup.Connection.Response response8 = response1.cookie("hi!", "");
        org.jsoup.Connection.Response response11 = response1.cookie("Location", "");
        boolean boolean14 = response1.hasHeaderWithValue("hi!", "");
        java.nio.ByteBuffer byteBuffer15 = null;
        response1.byteData = byteBuffer15;
        java.lang.String str17 = response1.contentType;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry19 = response1.scanHeaders("hi!");
        org.jsoup.Connection.Request request20 = response1.req;
        java.nio.ByteBuffer byteBuffer21 = response1.byteData;
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(strEntry19);
        org.junit.Assert.assertNull(request20);
        org.junit.Assert.assertNull(byteBuffer21);
    }

    @Test
    public void test10071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10071");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        response1.charset = "";
        response1.statusMessage = "";
        response1.charset = "Location";
        java.lang.String str11 = response1.contentType();
        int int12 = response1.numRedirects;
        java.lang.String str13 = response1.statusMessage;
        int int14 = response1.statusCode();
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test10072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10072");
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
        java.lang.String str17 = response1.cookie("hi!");
        int int18 = response1.statusCode();
        java.util.Map<java.lang.String, java.lang.String> strMap19 = response1.headers();
        int int20 = response1.statusCode;
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(method13);
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(strMap19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test10073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10073");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        response1.charset = "";
        java.lang.String str8 = response1.cookie("hi!");
        boolean boolean9 = response1.executed;
        response1.statusMessage = "Location";
        java.util.Map<java.lang.String, java.lang.String> strMap12 = response1.headers();
        org.jsoup.Connection.Response response14 = response1.removeHeader("hi!");
        int int15 = response1.numRedirects;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry17 = response1.scanHeaders("Location");
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(strEntry17);
    }

    @Test
    public void test10074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10074");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        response1.statusMessage = "hi!";
        boolean boolean11 = response1.hasHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response1);
        response12.statusCode = 1;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry16 = response12.scanHeaders("");
        java.util.Map<java.lang.String, java.lang.String> strMap17 = response12.cookies();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response(response12);
// flaky:             org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Too many redirects occurred trying to load URL null");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(strEntry16);
        org.junit.Assert.assertNotNull(strMap17);
    }

    @Test
    public void test10075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10075");
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
        response1.numRedirects = (-1);
        java.lang.String str23 = response1.getHeaderCaseInsensitive("Location");
        java.lang.String str24 = response1.statusMessage();
        int int25 = response1.statusCode;
        response1.contentType = "";
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str29 = response1.cookie("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(response17);
        org.junit.Assert.assertNotNull(response19);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 100 + "'", int25 == 100);
    }

    @Test
    public void test10076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10076");
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
        boolean boolean17 = response12.hasHeader("Location");
        org.jsoup.Connection.Request request18 = response12.req;
        boolean boolean19 = response12.executed;
        java.net.HttpURLConnection httpURLConnection20 = null;
        org.jsoup.helper.HttpConnection.Response response21 = null;
        org.jsoup.helper.HttpConnection.Response response22 = new org.jsoup.helper.HttpConnection.Response(response21);
        org.jsoup.Connection.Request request23 = null;
        response22.req = request23;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry26 = response22.scanHeaders("hi!");
        org.jsoup.Connection.Response response29 = response22.cookie("hi!", "");
        java.lang.String str30 = response22.statusMessage();
        org.jsoup.Connection.Request request31 = response22.req;
        java.net.URL uRL32 = response22.url();
        java.lang.String str33 = response22.contentType();
        response22.contentType = "hi!";
        java.net.URL uRL36 = response22.url();
        org.jsoup.Connection.Response response38 = response22.removeHeader("hi!");
        org.jsoup.Connection.Response response40 = response22.removeHeader("hi!");
        java.lang.String str41 = response22.contentType();
        org.jsoup.Connection.Method method42 = response22.method();
        java.lang.String str44 = response22.header("hi!");
        java.lang.String str45 = response22.charset;
        // The following exception was thrown during execution in test generation
        try {
            response12.setupFromConnection(httpURLConnection20, (org.jsoup.Connection.Response) response22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(request18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(strEntry26);
        org.junit.Assert.assertNotNull(response29);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNull(request31);
        org.junit.Assert.assertNull(uRL32);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNull(uRL36);
        org.junit.Assert.assertNotNull(response38);
        org.junit.Assert.assertNotNull(response40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertNull(method42);
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertNull(str45);
    }

    @Test
    public void test10077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10077");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        org.jsoup.Connection.Response response6 = response1.removeCookie("Location");
        response1.statusCode = '#';
        org.jsoup.Connection.Response response10 = response1.removeCookie("Location");
        java.lang.String str11 = response1.charset;
        org.jsoup.Connection.Request request12 = response1.req;
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(request12);
    }

    @Test
    public void test10078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10078");
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
        java.lang.String str17 = response1.cookie("Location");
        java.nio.ByteBuffer byteBuffer18 = response1.byteData;
        org.jsoup.Connection.Request request19 = null;
        response1.req = request19;
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(byteBuffer18);
    }

    @Test
    public void test10079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10079");
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
        java.lang.String str16 = response1.contentType();
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.util.Map<java.lang.String, java.lang.String> strMap18 = response17.cookies();
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(strMap18);
    }

    @Test
    public void test10080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10080");
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
        int int16 = response1.statusCode;
        response1.executed = false;
        int int19 = response1.statusCode;
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test10081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10081");
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
        java.util.Map<java.lang.String, java.lang.String> strMap15 = response1.cookies();
        int int16 = response1.statusCode();
        java.lang.String str18 = response1.cookie("Location");
        org.jsoup.Connection.Method method19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response20 = response1.method(method19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test10082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10082");
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
        int int14 = response1.numRedirects;
        java.lang.String str15 = response1.statusMessage;
        java.lang.String str16 = response1.charset;
        java.lang.String str17 = response1.charset;
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test10083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10083");
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
        response1.statusMessage = "hi!";
        java.util.Map<java.lang.String, java.lang.String> strMap26 = response1.cookies();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response29 = response1.header("", "Location");
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
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(strMap26);
    }

    @Test
    public void test10084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10084");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        response1.executed = false;
        org.jsoup.Connection.Response response11 = response1.header("Location", "");
        int int12 = response1.statusCode;
        response1.numRedirects = 100;
        java.lang.String str15 = response1.statusMessage;
        org.jsoup.Connection.Response response17 = response1.removeHeader("hi!");
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(response17);
    }

    @Test
    public void test10085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10085");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        org.jsoup.Connection.Request request5 = null;
        response1.req = request5;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry8 = response1.scanHeaders("Location");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry10 = response1.scanHeaders("Location");
        org.jsoup.Connection.Method method11 = response1.method();
        java.lang.String str12 = response1.charset();
        java.util.Map<java.lang.String, java.lang.String> strMap13 = response1.cookies();
        response1.statusMessage = "hi!";
        response1.charset = "hi!";
        boolean boolean18 = response1.executed;
        response1.executed = false;
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(strEntry8);
        org.junit.Assert.assertNull(strEntry10);
        org.junit.Assert.assertNull(method11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test10086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10086");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        response1.executed = false;
        org.jsoup.Connection.Response response11 = response1.header("Location", "");
        int int12 = response1.statusCode;
        java.lang.String str13 = response1.charset();
        java.lang.String str14 = response1.statusMessage();
        org.jsoup.Connection.Response response17 = response1.cookie("hi!", "Location");
        java.lang.String str19 = response1.getHeaderCaseInsensitive("");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry21 = response1.scanHeaders("");
        java.lang.String str23 = response1.cookie("hi!");
        boolean boolean24 = response1.executed;
        java.lang.String str25 = response1.contentType();
        response1.charset = "";
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(response17);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(strEntry21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Location" + "'", str23, "Location");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(str25);
    }

    @Test
    public void test10087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10087");
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
        java.lang.String str16 = response1.contentType();
        org.jsoup.Connection.Response response19 = response1.header("Location", "");
        response1.charset = "Location";
        int int22 = response1.statusCode;
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNull(method13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(response19);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test10088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10088");
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
        java.util.Map<java.lang.String, java.lang.String> strMap16 = response1.headers();
        java.nio.ByteBuffer byteBuffer17 = null;
        response1.byteData = byteBuffer17;
        java.lang.String str20 = response1.getHeaderCaseInsensitive("");
        response1.numRedirects = (short) 1;
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(method13);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test10089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10089");
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
        java.lang.String str13 = response1.contentType();
        java.util.Map<java.lang.String, java.lang.String> strMap14 = response1.cookies();
        java.util.Map<java.lang.String, java.lang.String> strMap15 = response1.cookies();
        org.jsoup.Connection.Request request16 = response1.req;
        boolean boolean19 = response1.hasHeaderWithValue("hi!", "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = response1.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertNull(request16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test10090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10090");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        boolean boolean6 = response1.hasCookie("hi!");
        response1.charset = "hi!";
        org.jsoup.Connection.Request request9 = response1.req;
        java.lang.String str10 = response1.contentType();
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response1);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response13 = response1.removeCookie("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(request9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test10091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10091");
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
        boolean boolean20 = response1.executed;
        response1.numRedirects = '#';
        boolean boolean24 = response1.hasCookie("Location");
        boolean boolean26 = response1.hasCookie("Location");
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(strEntry19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test10092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10092");
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
        int int26 = response1.statusCode;
        java.lang.String str27 = response1.statusMessage();
        org.jsoup.Connection.Method method28 = response1.method();
        response1.numRedirects = (byte) 10;
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertNull(method17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNull(byteBuffer21);
        org.junit.Assert.assertNotNull(response25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(method28);
    }

    @Test
    public void test10093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10093");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        response1.charset = "";
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry8 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        java.lang.String str11 = response1.statusMessage;
        java.lang.String str12 = response1.statusMessage;
        org.jsoup.Connection.Request request13 = null;
        response1.req = request13;
        int int15 = response1.numRedirects;
        java.util.Map<java.lang.String, java.lang.String> strMap16 = response1.headers();
        java.net.HttpURLConnection httpURLConnection17 = null;
        org.jsoup.helper.HttpConnection.Response response18 = null;
        org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response(response18);
        org.jsoup.Connection.Request request20 = null;
        response19.req = request20;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry23 = response19.scanHeaders("hi!");
        org.jsoup.Connection.Response response26 = response19.cookie("hi!", "");
        java.net.URL uRL27 = response19.url();
        java.nio.ByteBuffer byteBuffer28 = null;
        response19.byteData = byteBuffer28;
        org.jsoup.Connection.Response response31 = response19.removeHeader("hi!");
        org.jsoup.Connection.Response response33 = response19.removeHeader("Location");
        // The following exception was thrown during execution in test generation
        try {
            response1.setupFromConnection(httpURLConnection17, response33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNotNull(strEntry8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertNull(strEntry23);
        org.junit.Assert.assertNotNull(response26);
        org.junit.Assert.assertNull(uRL27);
        org.junit.Assert.assertNotNull(response31);
        org.junit.Assert.assertNotNull(response33);
    }

    @Test
    public void test10094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10094");
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
        response1.statusMessage = "hi!";
        boolean boolean20 = response1.hasCookie("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap21 = response1.headers();
        java.util.Map<java.lang.String, java.lang.String> strMap22 = response1.cookies();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = response1.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertNotNull(strMap22);
    }

    @Test
    public void test10095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10095");
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
        org.jsoup.Connection.Response response15 = response1.cookie("hi!", "hi!");
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(response15);
    }

    @Test
    public void test10096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10096");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        response1.charset = "";
        response1.statusMessage = "";
        java.lang.String str10 = response1.getHeaderCaseInsensitive("");
        boolean boolean13 = response1.hasHeaderWithValue("Location", "");
        java.lang.String str15 = response1.cookie("Location");
        response1.numRedirects = (short) 0;
        response1.numRedirects = (short) 0;
        org.jsoup.Connection.Response response22 = response1.cookie("Location", "Location");
        java.lang.String str23 = response1.charset();
        boolean boolean24 = response1.executed;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean26 = response1.hasHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(response22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test10097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10097");
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
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry18 = response1.scanHeaders("hi!");
        int int19 = response1.numRedirects;
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(byteBuffer12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertNotNull(strEntry18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test10098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10098");
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
        java.lang.String str16 = response1.getHeaderCaseInsensitive("hi!");
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Response response19 = response17.removeHeader("hi!");
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(byteBuffer14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(response19);
    }

    @Test
    public void test10099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10099");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.numRedirects = (byte) -1;
        java.lang.String str4 = response1.statusMessage;
        org.jsoup.Connection.Request request5 = response1.req;
        boolean boolean8 = response1.hasHeaderWithValue("Location", "hi!");
        java.nio.ByteBuffer byteBuffer9 = response1.byteData;
        org.jsoup.Connection.Response response12 = response1.cookie("hi!", "hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap13 = response1.headers();
        org.jsoup.Connection.Method method14 = response1.method();
        java.nio.ByteBuffer byteBuffer15 = null;
        response1.byteData = byteBuffer15;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(request5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(byteBuffer9);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertNull(method14);
    }

    @Test
    public void test10100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10100");
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
        org.jsoup.helper.HttpConnection.Response response20 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Response response22 = response1.removeHeader("Location");
        java.lang.String str24 = response1.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Request request25 = null;
        response1.req = request25;
        java.lang.String str27 = response1.statusMessage();
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertNull(strEntry13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(strMap19);
        org.junit.Assert.assertNotNull(response22);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str27);
    }

    @Test
    public void test10101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10101");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        response1.charset = "";
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry8 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        response1.statusCode = (byte) 0;
        java.lang.String str13 = response1.statusMessage();
        org.jsoup.Connection.Request request14 = null;
        response1.req = request14;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response18 = response1.header("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNotNull(strEntry8);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test10102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10102");
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
        java.lang.String str20 = response1.charset;
        java.net.HttpURLConnection httpURLConnection21 = null;
        org.jsoup.helper.HttpConnection.Response response22 = null;
        org.jsoup.helper.HttpConnection.Response response23 = new org.jsoup.helper.HttpConnection.Response(response22);
        org.jsoup.Connection.Response response26 = response23.header("hi!", "");
        java.lang.String str28 = response23.getHeaderCaseInsensitive("");
        response23.executed = false;
        org.jsoup.Connection.Request request31 = null;
        response23.req = request31;
        java.net.URL uRL33 = response23.url();
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
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(strEntry19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(response26);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(uRL33);
    }

    @Test
    public void test10103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10103");
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
        response1.executed = true;
        java.util.Map<java.lang.String, java.lang.String> strMap20 = response1.cookies();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response23 = response1.header("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
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
        org.junit.Assert.assertNotNull(strMap20);
    }

    @Test
    public void test10104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10104");
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
        java.lang.String str15 = response1.statusMessage;
        java.nio.ByteBuffer byteBuffer16 = response1.byteData;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry18 = response1.scanHeaders("Location");
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Location" + "'", str15, "Location");
        org.junit.Assert.assertNull(byteBuffer16);
        org.junit.Assert.assertNull(strEntry18);
    }

    @Test
    public void test10105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10105");
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
        int int21 = response1.statusCode();
        java.lang.String str23 = response1.getHeaderCaseInsensitive("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap24 = response1.headers();
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(strEntry18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(strMap24);
    }

    @Test
    public void test10106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10106");
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
        response1.statusMessage = "hi!";
        response1.numRedirects = 0;
        java.nio.ByteBuffer byteBuffer28 = null;
        response1.byteData = byteBuffer28;
        org.jsoup.Connection.Response response32 = response1.header("hi!", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str33 = response1.body();
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
        org.junit.Assert.assertNotNull(response32);
    }

    @Test
    public void test10107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10107");
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
        boolean boolean25 = response1.hasHeaderWithValue("hi!", "Location");
        response1.executed = true;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry29 = response1.scanHeaders("Location");
        org.jsoup.Connection.Response response32 = response1.cookie("hi!", "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str34 = response1.cookie("");
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
        org.junit.Assert.assertNotNull(strMap22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(strEntry29);
        org.junit.Assert.assertNotNull(response32);
    }

    @Test
    public void test10108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10108");
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
        org.jsoup.Connection.Response response23 = response1.header("Location", "");
        boolean boolean24 = response1.executed;
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(uRL12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(response17);
        org.junit.Assert.assertNotNull(response20);
        org.junit.Assert.assertNotNull(response23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test10109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10109");
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
        java.util.Map<java.lang.String, java.lang.String> strMap17 = response1.headers();
        java.lang.String str18 = response1.statusMessage;
        java.lang.String str19 = response1.contentType();
        java.nio.ByteBuffer byteBuffer20 = null;
        response1.byteData = byteBuffer20;
        org.jsoup.helper.HttpConnection.Response response22 = new org.jsoup.helper.HttpConnection.Response(response1);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response24 = response1.removeCookie("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(strEntry12);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(strMap17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test10110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10110");
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
        java.lang.String str20 = response1.getHeaderCaseInsensitive("");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray21 = response1.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
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
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test10111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10111");
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
        response1.numRedirects = ' ';
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test10112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10112");
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
        boolean boolean20 = response1.hasHeaderWithValue("hi!", "");
        org.jsoup.helper.HttpConnection.Response response21 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.nio.ByteBuffer byteBuffer22 = response1.byteData;
        response1.charset = "hi!";
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean26 = response1.hasCookie("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNull(byteBuffer22);
    }

    @Test
    public void test10113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10113");
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
        java.lang.String str16 = response1.contentType();
        org.jsoup.Connection.Method method17 = response1.method();
        response1.statusCode = 0;
        java.lang.String str20 = response1.contentType();
        java.lang.String str22 = response1.cookie("hi!");
        response1.charset = "";
        java.net.HttpURLConnection httpURLConnection25 = null;
        org.jsoup.helper.HttpConnection.Response response26 = null;
        org.jsoup.helper.HttpConnection.Response response27 = new org.jsoup.helper.HttpConnection.Response(response26);
        org.jsoup.Connection.Request request28 = null;
        response27.req = request28;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry31 = response27.scanHeaders("hi!");
        response27.charset = "hi!";
        int int34 = response27.numRedirects;
        response27.contentType = "hi!";
        java.nio.ByteBuffer byteBuffer37 = response27.byteData;
        java.nio.ByteBuffer byteBuffer38 = null;
        response27.byteData = byteBuffer38;
        org.jsoup.Connection.Response response42 = response27.header("hi!", "hi!");
        org.jsoup.Connection.Method method43 = response27.method();
        java.lang.String str45 = response27.header("hi!");
        java.lang.String str46 = response27.contentType();
        java.nio.ByteBuffer byteBuffer47 = response27.byteData;
        org.jsoup.Connection.Method method48 = response27.method();
        org.jsoup.Connection.Response response50 = response27.removeCookie("Location");
        java.lang.String str52 = response27.cookie("Location");
        java.net.URL uRL53 = response27.url();
        // The following exception was thrown during execution in test generation
        try {
            response1.setupFromConnection(httpURLConnection25, (org.jsoup.Connection.Response) response27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(method13);
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(method17);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(strEntry31);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNull(byteBuffer37);
        org.junit.Assert.assertNotNull(response42);
        org.junit.Assert.assertNull(method43);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "hi!" + "'", str45, "hi!");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "hi!" + "'", str46, "hi!");
        org.junit.Assert.assertNull(byteBuffer47);
        org.junit.Assert.assertNull(method48);
        org.junit.Assert.assertNotNull(response50);
        org.junit.Assert.assertNull(str52);
        org.junit.Assert.assertNull(uRL53);
    }

    @Test
    public void test10114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10114");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        org.jsoup.Connection.Request request5 = null;
        response1.req = request5;
        java.lang.String str7 = response1.charset();
        java.util.Map<java.lang.String, java.lang.String> strMap8 = response1.headers();
        java.lang.String str10 = response1.getHeaderCaseInsensitive("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response13 = response1.header("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test10115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10115");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        response1.executed = false;
        org.jsoup.Connection.Response response11 = response1.header("Location", "");
        int int12 = response1.statusCode;
        response1.numRedirects = 100;
        java.lang.String str15 = response1.charset();
        java.lang.String str16 = response1.charset;
        response1.statusMessage = "hi!";
        org.jsoup.Connection.Response response20 = response1.removeHeader("Location");
        org.jsoup.Connection.Method method21 = response1.method();
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(response20);
        org.junit.Assert.assertNull(method21);
    }

    @Test
    public void test10116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10116");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Request request3 = null;
        response2.req = request3;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry6 = response2.scanHeaders("hi!");
        response2.charset = "hi!";
        int int9 = response2.numRedirects;
        response2.contentType = "hi!";
        response2.charset = "Location";
        java.nio.ByteBuffer byteBuffer14 = response2.byteData;
        java.lang.String str15 = response2.contentType;
        java.lang.String str17 = response2.cookie("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response18 = org.jsoup.helper.HttpConnection.Response.execute(request0, response2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(byteBuffer14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test10117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10117");
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
        java.net.HttpURLConnection httpURLConnection31 = null;
        org.jsoup.helper.HttpConnection.Response response32 = null;
        org.jsoup.helper.HttpConnection.Response response33 = new org.jsoup.helper.HttpConnection.Response(response32);
        org.jsoup.Connection.Request request34 = null;
        response33.req = request34;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry37 = response33.scanHeaders("hi!");
        response33.charset = "hi!";
        int int40 = response33.numRedirects;
        response33.contentType = "hi!";
        java.nio.ByteBuffer byteBuffer43 = response33.byteData;
        java.nio.ByteBuffer byteBuffer44 = null;
        response33.byteData = byteBuffer44;
        org.jsoup.Connection.Response response48 = response33.header("hi!", "hi!");
        org.jsoup.Connection.Method method49 = response33.method();
        response33.numRedirects = (byte) 0;
        java.util.Map<java.lang.String, java.lang.String> strMap52 = response33.cookies();
        org.jsoup.Connection.Response response54 = response33.removeHeader("hi!");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry56 = response33.scanHeaders("Location");
        java.lang.String str58 = response33.header("");
        // The following exception was thrown during execution in test generation
        try {
            response1.setupFromConnection(httpURLConnection31, (org.jsoup.Connection.Response) response33);
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
        org.junit.Assert.assertNotNull(response25);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(uRL28);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertNull(strEntry37);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNull(byteBuffer43);
        org.junit.Assert.assertNotNull(response48);
        org.junit.Assert.assertNull(method49);
        org.junit.Assert.assertNotNull(strMap52);
        org.junit.Assert.assertNotNull(response54);
        org.junit.Assert.assertNull(strEntry56);
        org.junit.Assert.assertNull(str58);
    }

    @Test
    public void test10118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10118");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        boolean boolean6 = response1.hasCookie("hi!");
        response1.charset = "Location";
        java.lang.String str9 = response1.contentType;
        java.lang.String str10 = response1.contentType();
        response1.charset = "Location";
        java.lang.String str13 = response1.charset();
        java.nio.ByteBuffer byteBuffer14 = response1.byteData;
        org.jsoup.Connection.Response response17 = response1.header("hi!", "");
        java.nio.ByteBuffer byteBuffer18 = null;
        response1.byteData = byteBuffer18;
        boolean boolean20 = response1.executed;
        java.lang.String str21 = response1.contentType();
        java.lang.String str23 = response1.header("Location");
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Location" + "'", str13, "Location");
        org.junit.Assert.assertNull(byteBuffer14);
        org.junit.Assert.assertNotNull(response17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test10119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10119");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        response1.charset = "";
        response1.statusMessage = "";
        java.util.Map<java.lang.String, java.lang.String> strMap9 = response1.headers();
        org.jsoup.Connection.Request request10 = response1.req;
        java.net.URL uRL11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response12 = response1.url(uRL11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNull(request10);
    }

    @Test
    public void test10120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10120");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        boolean boolean6 = response1.hasHeaderWithValue("hi!", "hi!");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry8 = response1.scanHeaders("");
        java.lang.String str9 = response1.statusMessage();
        org.jsoup.Connection.Response response11 = response1.removeCookie("hi!");
        org.jsoup.Connection.Method method12 = response1.method();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass13 = method12.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(strEntry8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNull(method12);
    }

    @Test
    public void test10121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10121");
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
        response1.numRedirects = (byte) 10;
        response1.contentType = "hi!";
        java.net.URL uRL23 = response1.url();
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNull(uRL23);
    }

    @Test
    public void test10122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10122");
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
        java.lang.String str15 = response1.statusMessage;
        int int16 = response1.statusCode;
        java.lang.String str18 = response1.getHeaderCaseInsensitive("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap19 = response1.cookies();
        org.jsoup.Connection.Request request20 = null;
        response1.req = request20;
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Location" + "'", str15, "Location");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(strMap19);
    }

    @Test
    public void test10123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10123");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        response1.charset = "";
        java.lang.String str8 = response1.cookie("hi!");
        boolean boolean9 = response1.executed;
        boolean boolean11 = response1.hasCookie("hi!");
        java.lang.String str12 = response1.statusMessage();
        java.net.URL uRL13 = response1.url();
        org.jsoup.Connection.Response response15 = response1.removeHeader("Location");
        org.jsoup.Connection.Response response18 = response1.header("hi!", "Location");
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(uRL13);
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertNotNull(response18);
    }

    @Test
    public void test10124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10124");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        java.lang.String str7 = response1.contentType();
        java.lang.String str9 = response1.header("hi!");
        response1.statusMessage = "hi!";
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry13 = response1.scanHeaders("Location");
        response1.contentType = "Location";
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(strEntry13);
    }

    @Test
    public void test10125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10125");
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
        java.net.HttpURLConnection httpURLConnection18 = null;
        org.jsoup.helper.HttpConnection.Response response19 = null;
        org.jsoup.helper.HttpConnection.Response response20 = new org.jsoup.helper.HttpConnection.Response(response19);
        org.jsoup.Connection.Response response23 = response20.header("hi!", "");
        response20.charset = "";
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry27 = response20.scanHeaders("hi!");
        response20.charset = "hi!";
        org.jsoup.Connection.Method method30 = response20.method();
        int int31 = response20.numRedirects;
        org.jsoup.Connection.Request request32 = response20.req;
        org.jsoup.Connection.Request request33 = null;
        response20.req = request33;
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
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(response23);
        org.junit.Assert.assertNotNull(strEntry27);
        org.junit.Assert.assertNull(method30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNull(request32);
    }

    @Test
    public void test10126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10126");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        org.jsoup.Connection.Response response8 = response1.cookie("hi!", "");
        java.lang.String str10 = response1.getHeaderCaseInsensitive("Location");
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.util.Map<java.lang.String, java.lang.String> strMap12 = response1.cookies();
        org.jsoup.Connection.Response response14 = response1.removeHeader("hi!");
        java.lang.String str16 = response1.header("hi!");
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test10127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10127");
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
        response1.executed = false;
        java.lang.String str22 = response1.contentType();
        int int23 = response1.statusCode;
        org.jsoup.Connection.Response response25 = response1.removeHeader("hi!");
        response1.contentType = "";
        java.util.Map<java.lang.String, java.lang.String> strMap28 = response1.headers();
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNull(uRL15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(strEntry18);
        org.junit.Assert.assertNull(method19);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(response25);
        org.junit.Assert.assertNotNull(strMap28);
    }

    @Test
    public void test10128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10128");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        org.jsoup.Connection.Response response8 = response1.cookie("hi!", "");
        java.net.URL uRL9 = response1.url();
        org.jsoup.Connection.Response response12 = response1.header("hi!", "Location");
        java.lang.String str13 = response1.charset;
        org.jsoup.Connection.Method method14 = response1.method();
        org.jsoup.Connection.Request request15 = response1.req;
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(method14);
        org.junit.Assert.assertNull(request15);
    }

    @Test
    public void test10129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10129");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        org.jsoup.Connection.Request request5 = null;
        response1.req = request5;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry8 = response1.scanHeaders("Location");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry10 = response1.scanHeaders("Location");
        org.jsoup.Connection.Method method11 = response1.method();
        int int12 = response1.statusCode();
        org.jsoup.Connection.Method method13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response14 = response1.method(method13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(strEntry8);
        org.junit.Assert.assertNull(strEntry10);
        org.junit.Assert.assertNull(method11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test10130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10130");
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
        response1.numRedirects = (short) 1;
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test10131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10131");
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
        boolean boolean21 = response1.executed;
        response1.charset = "Location";
        org.jsoup.Connection.Response response26 = response1.cookie("hi!", "Location");
        response1.charset = "";
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertNull(strEntry13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(response26);
    }

    @Test
    public void test10132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10132");
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
        java.lang.String str17 = response1.header("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap18 = response1.headers();
        org.jsoup.Connection.Response response20 = response1.removeCookie("Location");
        response1.numRedirects = (byte) 0;
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray23 = response1.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
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
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(strMap18);
        org.junit.Assert.assertNotNull(response20);
    }

    @Test
    public void test10133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10133");
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
        int int15 = response1.numRedirects;
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test10134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10134");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        response1.charset = "";
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry8 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        response1.statusCode = (byte) 0;
        boolean boolean15 = response1.hasHeaderWithValue("Location", "Location");
        java.lang.String str16 = response1.statusMessage;
        response1.statusMessage = "hi!";
        org.jsoup.Connection.Response response21 = response1.cookie("hi!", "Location");
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNotNull(strEntry8);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(response21);
    }

    @Test
    public void test10135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10135");
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
        org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry21 = response1.scanHeaders("hi!");
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertNull(strEntry21);
    }

    @Test
    public void test10136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10136");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        boolean boolean8 = response1.hasHeaderWithValue("Location", "Location");
        int int9 = response1.statusCode();
        org.jsoup.Connection.Request request10 = null;
        response1.req = request10;
        java.lang.String str12 = response1.charset;
        boolean boolean14 = response1.hasHeader("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap15 = response1.cookies();
        org.jsoup.Connection.Method method16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response17 = response1.method(method16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strMap15);
    }

    @Test
    public void test10137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10137");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        response1.charset = "";
        java.lang.String str8 = response1.cookie("hi!");
        boolean boolean9 = response1.executed;
        response1.statusMessage = "Location";
        org.jsoup.Connection.Request request12 = null;
        response1.req = request12;
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Request request15 = null;
        response14.req = request15;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = response14.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test10138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10138");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.charset = "Location";
        int int4 = response1.numRedirects;
        java.nio.ByteBuffer byteBuffer5 = response1.byteData;
        java.nio.ByteBuffer byteBuffer6 = response1.byteData;
        java.nio.ByteBuffer byteBuffer7 = response1.byteData;
        response1.contentType = "Location";
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(byteBuffer5);
        org.junit.Assert.assertNull(byteBuffer6);
        org.junit.Assert.assertNull(byteBuffer7);
    }

    @Test
    public void test10139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10139");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        java.lang.String str7 = response1.contentType();
        java.lang.String str8 = response1.contentType();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry10 = response1.scanHeaders("");
        java.util.Map<java.lang.String, java.lang.String> strMap11 = response1.cookies();
        java.lang.String str12 = response1.statusMessage;
        response1.numRedirects = 0;
        java.nio.ByteBuffer byteBuffer15 = response1.byteData;
        java.lang.String str17 = response1.cookie("hi!");
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(strEntry10);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(byteBuffer15);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test10140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10140");
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
        int int24 = response1.statusCode;
        int int25 = response1.statusCode;
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test10141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10141");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        response1.charset = "";
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry8 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        response1.statusCode = (byte) 10;
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Request request14 = response13.req;
        java.lang.String str15 = response13.statusMessage();
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNotNull(strEntry8);
        org.junit.Assert.assertNull(request14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test10142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10142");
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
        java.util.Map<java.lang.String, java.lang.String> strMap21 = response1.headers();
        java.lang.String str22 = response1.statusMessage();
        int int23 = response1.numRedirects;
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Location" + "'", str22, "Location");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test10143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10143");
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
        java.util.Map<java.lang.String, java.lang.String> strMap15 = response1.headers();
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(strEntry8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNull(method13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(strMap15);
    }

    @Test
    public void test10144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10144");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.util.Map<java.lang.String, java.lang.String> strMap5 = response1.headers();
        java.lang.String str7 = response1.getHeaderCaseInsensitive("Location");
        response1.contentType = "hi!";
        int int10 = response1.numRedirects;
        response1.statusMessage = "hi!";
        org.jsoup.Connection.Method method13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response14 = response1.method(method13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test10145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10145");
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
        org.jsoup.Connection.Request request16 = null;
        response1.req = request16;
        boolean boolean18 = response1.executed;
        boolean boolean20 = response1.hasCookie("Location");
        java.lang.String str21 = response1.statusMessage();
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(method13);
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test10146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10146");
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
        response1.numRedirects = (byte) 10;
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray17 = response1.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test10147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10147");
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
        response1.statusMessage = "Location";
        int int29 = response1.statusCode();
        java.lang.String str30 = response1.charset();
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
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
    }

    @Test
    public void test10148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10148");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        java.lang.String str8 = response1.contentType();
        java.lang.String str9 = response1.contentType;
        org.jsoup.Connection.Response response11 = response1.removeCookie("hi!");
        org.jsoup.Connection.Response response14 = response1.header("Location", "");
        boolean boolean15 = response1.executed;
        boolean boolean16 = response1.executed;
        boolean boolean17 = response1.executed;
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.Class<?> wildcardClass19 = response1.getClass();
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test10149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10149");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        org.jsoup.Connection.Response response8 = response1.cookie("hi!", "");
        boolean boolean9 = response1.executed;
        java.lang.String str10 = response1.statusMessage();
        java.lang.String str11 = response1.statusMessage();
        java.lang.String str13 = response1.cookie("hi!");
        int int14 = response1.statusCode;
        java.lang.String str15 = response1.charset;
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test10150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10150");
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
        java.lang.String str26 = response1.statusMessage;
        org.jsoup.Connection.Method method27 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response28 = response1.method(method27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertNotNull(response20);
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test10151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10151");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.numRedirects = (byte) -1;
        java.lang.String str4 = response1.statusMessage;
        response1.contentType = "hi!";
        response1.numRedirects = 10;
        java.nio.ByteBuffer byteBuffer9 = null;
        response1.byteData = byteBuffer9;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry12 = response1.scanHeaders("");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry14 = response1.scanHeaders("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response16 = response1.removeCookie("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(strEntry12);
        org.junit.Assert.assertNull(strEntry14);
    }

    @Test
    public void test10152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10152");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        response1.charset = "";
        java.lang.String str8 = response1.cookie("hi!");
        boolean boolean9 = response1.executed;
        java.lang.String str10 = response1.contentType;
        org.jsoup.Connection.Request request11 = response1.req;
        java.lang.String str12 = response1.statusMessage;
        org.jsoup.Connection.Response response15 = response1.header("Location", "Location");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray16 = response1.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(request11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(response15);
    }

    @Test
    public void test10153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10153");
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
        response1.statusMessage = "hi!";
        response1.contentType = "Location";
        java.util.Map<java.lang.String, java.lang.String> strMap26 = response1.headers();
        java.lang.String str27 = response1.statusMessage;
        boolean boolean29 = response1.hasHeader("Location");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str31 = response1.cookie("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertNull(method17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(strMap26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test10154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10154");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        response1.executed = false;
        org.jsoup.Connection.Response response11 = response1.header("Location", "");
        int int12 = response1.statusCode;
        response1.numRedirects = 100;
        java.lang.String str15 = response1.charset();
        java.lang.String str16 = response1.charset;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry18 = response1.scanHeaders("");
        java.net.HttpURLConnection httpURLConnection19 = null;
        org.jsoup.helper.HttpConnection.Response response20 = null;
        org.jsoup.helper.HttpConnection.Response response21 = new org.jsoup.helper.HttpConnection.Response(response20);
        org.jsoup.Connection.Request request22 = null;
        response21.req = request22;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry25 = response21.scanHeaders("hi!");
        org.jsoup.Connection.Response response28 = response21.cookie("hi!", "");
        boolean boolean29 = response21.executed;
        java.lang.String str30 = response21.statusMessage();
        int int31 = response21.statusCode();
        // The following exception was thrown during execution in test generation
        try {
            response1.setupFromConnection(httpURLConnection19, (org.jsoup.Connection.Response) response21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(strEntry18);
        org.junit.Assert.assertNull(strEntry25);
        org.junit.Assert.assertNotNull(response28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
    }

    @Test
    public void test10155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10155");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        response1.executed = false;
        boolean boolean9 = response1.executed;
        int int10 = response1.statusCode();
        java.lang.String str12 = response1.getHeaderCaseInsensitive("");
        java.lang.String str14 = response1.header("hi!");
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test10156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10156");
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
        org.jsoup.helper.HttpConnection.Response response28 = new org.jsoup.helper.HttpConnection.Response(response1);
        int int29 = response1.statusCode;
        java.lang.Class<?> wildcardClass30 = response1.getClass();
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
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test10157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10157");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        response1.executed = false;
        boolean boolean9 = response1.executed;
        int int10 = response1.statusCode();
        response1.executed = false;
        org.jsoup.Connection.Method method13 = response1.method();
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray14 = response1.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(method13);
    }

    @Test
    public void test10158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10158");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        response1.executed = false;
        org.jsoup.Connection.Response response11 = response1.header("Location", "");
        response1.statusMessage = "";
        response1.executed = true;
        response1.statusMessage = "";
        response1.statusMessage = "";
        int int20 = response1.numRedirects;
        response1.numRedirects = 1;
        java.util.Map<java.lang.String, java.lang.String> strMap23 = response1.cookies();
        boolean boolean25 = response1.hasHeader("hi!");
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(strMap23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test10159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10159");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        java.lang.String str7 = response1.contentType();
        java.lang.String str8 = response1.contentType();
        boolean boolean9 = response1.executed;
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
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test10160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10160");
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
        int int20 = response1.numRedirects;
        org.jsoup.Connection.Request request21 = response1.req;
        org.jsoup.Connection.Method method22 = response1.method();
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNull(request21);
        org.junit.Assert.assertNull(method22);
        org.junit.Assert.assertNotNull(strMap23);
    }

    @Test
    public void test10161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10161");
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
        java.lang.String str20 = response1.contentType();
        java.lang.String str21 = response1.contentType;
        org.jsoup.Connection.Request request22 = null;
        response1.req = request22;
        response1.numRedirects = 0;
        java.util.Map<java.lang.String, java.lang.String> strMap26 = response1.headers();
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(strMap26);
    }

    @Test
    public void test10162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10162");
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
        java.lang.String str14 = response1.statusMessage;
        int int15 = response1.statusCode;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry17 = response1.scanHeaders("Location");
        org.jsoup.Connection.Response response20 = response1.header("Location", "");
        org.jsoup.Connection.Request request21 = null;
        response1.req = request21;
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNull(request13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(strEntry17);
        org.junit.Assert.assertNotNull(response20);
    }

    @Test
    public void test10163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10163");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        response1.charset = "";
        response1.statusMessage = "";
        java.lang.String str10 = response1.getHeaderCaseInsensitive("");
        boolean boolean11 = response1.executed;
        java.lang.String str13 = response1.header("Location");
        java.lang.String str14 = response1.statusMessage();
        java.net.HttpURLConnection httpURLConnection15 = null;
        org.jsoup.helper.HttpConnection.Response response16 = null;
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response16);
        org.jsoup.Connection.Response response20 = response17.header("hi!", "");
        java.lang.String str22 = response17.getHeaderCaseInsensitive("");
        response17.executed = false;
        boolean boolean25 = response17.executed;
        int int26 = response17.statusCode();
        response17.executed = false;
        org.jsoup.Connection.Method method29 = response17.method();
        response17.statusMessage = "hi!";
        // The following exception was thrown during execution in test generation
        try {
            response1.setupFromConnection(httpURLConnection15, (org.jsoup.Connection.Response) response17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(response20);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNull(method29);
    }

    @Test
    public void test10164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10164");
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
        java.nio.ByteBuffer byteBuffer16 = response1.byteData;
        java.util.Map<java.lang.String, java.lang.String> strMap17 = response1.headers();
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertNull(byteBuffer16);
        org.junit.Assert.assertNotNull(strMap17);
    }

    @Test
    public void test10165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10165");
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
        response1.contentType = "Location";
        int int20 = response1.numRedirects;
        java.lang.String str21 = response1.statusMessage;
        int int22 = response1.numRedirects;
        java.nio.ByteBuffer byteBuffer23 = response1.byteData;
        boolean boolean25 = response1.hasCookie("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str26 = response1.body();
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNull(byteBuffer23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test10166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10166");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        java.lang.String str8 = response1.cookie("hi!");
        java.net.URL uRL9 = response1.url();
        org.jsoup.Connection.Request request10 = null;
        response1.req = request10;
        boolean boolean12 = response1.executed;
        boolean boolean15 = response1.hasHeaderWithValue("Location", "hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap16 = response1.cookies();
        response1.statusCode = 100;
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(strMap16);
    }

    @Test
    public void test10167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10167");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        java.lang.String str7 = response1.contentType();
        java.lang.String str8 = response1.contentType();
        org.jsoup.Connection.Response response10 = response1.removeHeader("Location");
        java.nio.ByteBuffer byteBuffer11 = response1.byteData;
        int int12 = response1.statusCode();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry14 = response1.scanHeaders("");
        java.lang.String str15 = response1.charset;
        response1.statusCode = (byte) 100;
        java.lang.String str19 = response1.cookie("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap20 = response1.headers();
        org.jsoup.Connection.Response response23 = response1.header("hi!", "");
        java.lang.String str24 = response1.charset();
        org.jsoup.Connection.Request request25 = response1.req;
        boolean boolean26 = response1.executed;
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(strEntry14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(strMap20);
        org.junit.Assert.assertNotNull(response23);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(request25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test10168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10168");
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
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry18 = response1.scanHeaders("hi!");
        response1.charset = "Location";
        int int21 = response1.statusCode();
        response1.executed = false;
        int int24 = response1.statusCode;
        java.lang.String str25 = response1.statusMessage;
        int int26 = response1.statusCode();
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertNull(strEntry18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test10169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10169");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        java.lang.String str7 = response1.contentType();
        int int8 = response1.numRedirects;
        int int9 = response1.statusCode();
        java.lang.String str11 = response1.cookie("Location");
        boolean boolean12 = response1.executed;
        java.lang.String str14 = response1.header("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document15 = response1.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test10170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10170");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        response1.charset = "";
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry8 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        response1.statusCode = (byte) 10;
        java.lang.String str14 = response1.cookie("Location");
        org.jsoup.Connection.Request request15 = null;
        response1.req = request15;
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNotNull(strEntry8);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test10171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10171");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        org.jsoup.Connection.Response response8 = response1.cookie("hi!", "");
        java.nio.ByteBuffer byteBuffer9 = response1.byteData;
        java.lang.String str10 = response1.statusMessage;
        java.nio.ByteBuffer byteBuffer11 = response1.byteData;
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray12 = response1.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(byteBuffer9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(byteBuffer11);
    }

    @Test
    public void test10172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10172");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        response1.charset = "";
        response1.statusMessage = "";
        java.lang.String str10 = response1.getHeaderCaseInsensitive("");
        boolean boolean12 = response1.hasCookie("Location");
        boolean boolean14 = response1.hasCookie("Location");
        java.lang.String str16 = response1.header("");
        org.jsoup.Connection.Request request17 = response1.req;
        response1.statusMessage = "Location";
        boolean boolean21 = response1.hasHeader("Location");
        java.lang.String str22 = response1.charset();
        java.lang.String str23 = response1.charset;
        org.jsoup.Connection.Response response26 = response1.header("hi!", "Location");
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(request17);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(response26);
    }

    @Test
    public void test10173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10173");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        response1.charset = "";
        java.lang.String str8 = response1.cookie("hi!");
        boolean boolean9 = response1.executed;
        response1.statusMessage = "Location";
        java.util.Map<java.lang.String, java.lang.String> strMap12 = response1.headers();
        java.lang.String str13 = response1.contentType;
        int int14 = response1.numRedirects;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry16 = response1.scanHeaders("hi!");
        response1.statusMessage = "Location";
        boolean boolean19 = response1.executed;
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(strEntry16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test10174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10174");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        response1.charset = "";
        java.lang.String str8 = response1.cookie("hi!");
        boolean boolean9 = response1.executed;
        response1.statusMessage = "Location";
        java.util.Map<java.lang.String, java.lang.String> strMap12 = response1.headers();
        org.jsoup.Connection.Response response14 = response1.removeHeader("hi!");
        java.lang.String str16 = response1.header("");
        org.jsoup.Connection.Request request17 = null;
        response1.req = request17;
        java.lang.String str20 = response1.getHeaderCaseInsensitive("Location");
        java.lang.String str22 = response1.header("");
        response1.executed = false;
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test10175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10175");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        java.lang.String str8 = response1.contentType();
        java.lang.String str10 = response1.header("hi!");
        response1.contentType = "Location";
        java.lang.String str13 = response1.contentType();
        java.lang.String str14 = response1.charset();
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Method method16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response17 = response1.method(method16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Location" + "'", str13, "Location");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test10176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10176");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        response1.charset = "";
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry8 = response1.scanHeaders("hi!");
        response1.executed = false;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry12 = response1.scanHeaders("");
        java.nio.ByteBuffer byteBuffer13 = null;
        response1.byteData = byteBuffer13;
        java.lang.String str15 = response1.statusMessage;
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNotNull(strEntry8);
        org.junit.Assert.assertNull(strEntry12);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test10177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10177");
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
        java.util.Map<java.lang.String, java.lang.String> strMap17 = response1.headers();
        java.lang.String str18 = response1.statusMessage;
        java.lang.String str19 = response1.contentType();
        response1.statusMessage = "Location";
        boolean boolean23 = response1.hasHeader("Location");
        response1.numRedirects = '4';
        java.lang.String str26 = response1.contentType();
        java.nio.ByteBuffer byteBuffer27 = response1.byteData;
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(strEntry12);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(strMap17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(byteBuffer27);
    }

    @Test
    public void test10178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10178");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        response1.executed = false;
        org.jsoup.Connection.Response response11 = response1.header("Location", "");
        int int12 = response1.statusCode();
        org.jsoup.Connection.Response response14 = response1.removeHeader("Location");
        java.lang.String str15 = response1.charset;
        response1.statusMessage = "";
        java.lang.String str18 = response1.statusMessage;
        java.lang.String str19 = response1.contentType;
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test10179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10179");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.numRedirects = (byte) -1;
        boolean boolean5 = response1.hasCookie("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap6 = response1.headers();
        java.nio.ByteBuffer byteBuffer7 = null;
        response1.byteData = byteBuffer7;
        response1.charset = "Location";
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response1);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray12 = response11.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strMap6);
    }

    @Test
    public void test10180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10180");
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
        response1.statusMessage = "";
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str30 = response1.cookie("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
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
        org.junit.Assert.assertNull(strEntry26);
    }

    @Test
    public void test10181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10181");
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
        response1.executed = false;
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
        java.nio.ByteBuffer byteBuffer30 = null;
        response19.byteData = byteBuffer30;
        org.jsoup.Connection.Response response34 = response19.header("hi!", "hi!");
        org.jsoup.Connection.Method method35 = response19.method();
        java.lang.String str37 = response19.header("hi!");
        java.lang.String str38 = response19.contentType();
        java.nio.ByteBuffer byteBuffer39 = response19.byteData;
        java.nio.ByteBuffer byteBuffer40 = null;
        response19.byteData = byteBuffer40;
        org.jsoup.Connection.Response response43 = response19.removeHeader("Location");
        response19.numRedirects = '4';
        response19.charset = "hi!";
        response19.numRedirects = 53;
        // The following exception was thrown during execution in test generation
        try {
            response1.setupFromConnection(httpURLConnection17, (org.jsoup.Connection.Response) response19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertNull(strEntry23);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNull(byteBuffer29);
        org.junit.Assert.assertNotNull(response34);
        org.junit.Assert.assertNull(method35);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertNull(byteBuffer39);
        org.junit.Assert.assertNotNull(response43);
    }

    @Test
    public void test10182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10182");
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
        org.jsoup.Connection.Request request18 = response1.req;
        response1.statusCode = 'a';
        java.lang.String str22 = response1.getHeaderCaseInsensitive("Location");
        java.lang.String str23 = response1.contentType();
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(byteBuffer13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(request18);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test10183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10183");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        org.jsoup.Connection.Response response8 = response1.cookie("hi!", "");
        java.nio.ByteBuffer byteBuffer9 = response1.byteData;
        java.lang.String str10 = response1.statusMessage;
        java.nio.ByteBuffer byteBuffer11 = response1.byteData;
        boolean boolean12 = response1.executed;
        java.lang.String str14 = response1.header("hi!");
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(byteBuffer9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test10184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10184");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        org.jsoup.Connection.Request request5 = null;
        response1.req = request5;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry8 = response1.scanHeaders("Location");
        boolean boolean11 = response1.hasHeaderWithValue("hi!", "");
        response1.statusCode = (short) -1;
        java.lang.String str14 = response1.charset();
        org.jsoup.Connection.Method method15 = response1.method();
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(strEntry8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(method15);
    }

    @Test
    public void test10185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10185");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        response1.executed = false;
        response1.statusCode = 100;
        boolean boolean12 = response1.hasHeader("Location");
        java.nio.ByteBuffer byteBuffer13 = null;
        response1.byteData = byteBuffer13;
        int int15 = response1.numRedirects;
        int int16 = response1.numRedirects;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document17 = response1.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test10186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10186");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        java.lang.String str7 = response1.contentType();
        java.lang.String str8 = response1.contentType();
        org.jsoup.Connection.Response response10 = response1.removeHeader("Location");
        java.nio.ByteBuffer byteBuffer11 = response1.byteData;
        int int12 = response1.statusCode();
        java.util.Map<java.lang.String, java.lang.String> strMap13 = response1.cookies();
        int int14 = response1.statusCode();
        org.jsoup.Connection.Response response17 = response1.cookie("hi!", "Location");
        java.lang.Class<?> wildcardClass18 = response17.getClass();
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(response17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test10187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10187");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        response1.charset = "";
        response1.statusMessage = "";
        java.util.Map<java.lang.String, java.lang.String> strMap9 = response1.headers();
        boolean boolean10 = response1.executed;
        java.util.Map<java.lang.String, java.lang.String> strMap11 = response1.headers();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry13 = response1.scanHeaders("Location");
        org.jsoup.Connection.Request request14 = null;
        response1.req = request14;
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNull(strEntry13);
    }

    @Test
    public void test10188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10188");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.charset = "Location";
        java.nio.ByteBuffer byteBuffer4 = null;
        response1.byteData = byteBuffer4;
        org.jsoup.Connection.Request request6 = response1.req;
        java.lang.String str7 = response1.charset();
        response1.executed = false;
        response1.charset = "hi!";
        org.junit.Assert.assertNull(request6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Location" + "'", str7, "Location");
    }

    @Test
    public void test10189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10189");
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
        java.lang.String str23 = response1.contentType();
        java.util.Map<java.lang.String, java.lang.String> strMap24 = response1.headers();
        java.lang.String str25 = response1.charset();
        java.net.HttpURLConnection httpURLConnection26 = null;
        org.jsoup.helper.HttpConnection.Response response27 = null;
        org.jsoup.helper.HttpConnection.Response response28 = new org.jsoup.helper.HttpConnection.Response(response27);
        org.jsoup.Connection.Response response31 = response28.header("hi!", "");
        response28.charset = "";
        response28.statusMessage = "";
        java.lang.String str37 = response28.getHeaderCaseInsensitive("");
        boolean boolean38 = response28.executed;
        java.nio.ByteBuffer byteBuffer39 = response28.byteData;
        java.lang.String str41 = response28.header("Location");
        java.lang.String str42 = response28.charset;
        int int43 = response28.statusCode;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry45 = response28.scanHeaders("hi!");
        java.lang.String str46 = response28.contentType;
        response28.statusCode = 32;
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
        org.junit.Assert.assertNotNull(strMap20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(strMap24);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(response31);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNull(byteBuffer39);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(strEntry45);
        org.junit.Assert.assertNull(str46);
    }

    @Test
    public void test10190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10190");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.util.Map<java.lang.String, java.lang.String> strMap5 = response1.headers();
        java.lang.String str7 = response1.getHeaderCaseInsensitive("Location");
        response1.contentType = "hi!";
        int int10 = response1.numRedirects;
        response1.statusMessage = "hi!";
        org.jsoup.Connection.Method method13 = response1.method();
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(method13);
    }

    @Test
    public void test10191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10191");
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
        boolean boolean14 = response1.executed;
        java.lang.String str15 = response1.contentType();
        org.jsoup.Connection.Method method16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response17 = response1.method(method16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test10192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10192");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        response1.charset = "";
        response1.statusMessage = "";
        java.lang.String str10 = response1.getHeaderCaseInsensitive("");
        response1.charset = "hi!";
        boolean boolean14 = response1.hasHeader("Location");
        java.lang.String str15 = response1.charset();
        int int16 = response1.statusCode;
        response1.numRedirects = 100;
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test10193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10193");
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
        java.lang.String str13 = response1.contentType();
        java.lang.String str15 = response1.header("hi!");
        org.jsoup.Connection.Response response17 = response1.removeHeader("hi!");
        org.jsoup.Connection.Request request18 = null;
        response1.req = request18;
        int int20 = response1.statusCode();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry22 = response1.scanHeaders("Location");
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(request10);
        org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(response17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNull(strEntry22);
    }

    @Test
    public void test10194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10194");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        org.jsoup.Connection.Request request5 = null;
        response1.req = request5;
        java.lang.String str7 = response1.charset();
        response1.statusMessage = "hi!";
        int int10 = response1.statusCode();
        int int11 = response1.statusCode;
        java.util.Map<java.lang.String, java.lang.String> strMap12 = response1.cookies();
        int int13 = response1.numRedirects;
        int int14 = response1.statusCode();
        java.lang.String str16 = response1.getHeaderCaseInsensitive("");
        java.util.Map<java.lang.String, java.lang.String> strMap17 = response1.headers();
        java.lang.String str18 = response1.contentType();
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(strMap17);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test10195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10195");
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
        response1.statusMessage = "Location";
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
    }

    @Test
    public void test10196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10196");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        org.jsoup.Connection.Request request5 = null;
        response1.req = request5;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry8 = response1.scanHeaders("Location");
        java.lang.String str9 = response1.contentType;
        java.util.Map<java.lang.String, java.lang.String> strMap10 = response1.headers();
        org.jsoup.Connection.Response response13 = response1.cookie("Location", "Location");
        java.net.URL uRL14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response15 = response1.url(uRL14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(strEntry8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNotNull(response13);
    }

    @Test
    public void test10197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10197");
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
        java.util.Map<java.lang.String, java.lang.String> strMap14 = response1.cookies();
        java.util.Map<java.lang.String, java.lang.String> strMap15 = response1.cookies();
        org.jsoup.Connection.Response response17 = response1.removeCookie("hi!");
        java.lang.String str19 = response1.getHeaderCaseInsensitive("");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = response1.hasHeaderWithValue("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertNotNull(response17);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test10198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10198");
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
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry23 = response1.scanHeaders("hi!");
        java.lang.String str25 = response1.cookie("hi!");
        java.net.URL uRL26 = response1.url();
        java.net.URL uRL27 = response1.url();
        java.nio.ByteBuffer byteBuffer28 = response1.byteData;
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNull(strEntry23);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(uRL26);
        org.junit.Assert.assertNull(uRL27);
        org.junit.Assert.assertNull(byteBuffer28);
    }

    @Test
    public void test10199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10199");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        response1.charset = "";
        response1.statusMessage = "";
        java.lang.String str10 = response1.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response13 = response1.cookie("Location", "hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap14 = response1.cookies();
        java.net.URL uRL15 = response1.url();
        org.jsoup.Connection.Response response17 = response1.removeCookie("hi!");
        java.net.URL uRL18 = response1.url();
        java.lang.String str20 = response1.getHeaderCaseInsensitive("Location");
        java.nio.ByteBuffer byteBuffer21 = response1.byteData;
        response1.contentType = "hi!";
        java.net.HttpURLConnection httpURLConnection24 = null;
        org.jsoup.helper.HttpConnection.Response response25 = null;
        org.jsoup.helper.HttpConnection.Response response26 = new org.jsoup.helper.HttpConnection.Response(response25);
        org.jsoup.Connection.Request request27 = null;
        response26.req = request27;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry30 = response26.scanHeaders("hi!");
        response26.charset = "hi!";
        java.lang.String str33 = response26.contentType();
        response26.charset = "hi!";
        org.jsoup.Connection.Response response37 = response26.removeHeader("Location");
        java.lang.String str39 = response26.getHeaderCaseInsensitive("Location");
        java.util.Map<java.lang.String, java.lang.String> strMap40 = response26.headers();
        java.lang.String str42 = response26.header("hi!");
        org.jsoup.Connection.Response response44 = response26.removeHeader("hi!");
        // The following exception was thrown during execution in test generation
        try {
            response1.setupFromConnection(httpURLConnection24, response44);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNull(uRL15);
        org.junit.Assert.assertNotNull(response17);
        org.junit.Assert.assertNull(uRL18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(byteBuffer21);
        org.junit.Assert.assertNull(strEntry30);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNotNull(response37);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNotNull(strMap40);
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertNotNull(response44);
    }

    @Test
    public void test10200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10200");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        org.jsoup.Connection.Request request4 = null;
        response1.req = request4;
        java.lang.String str6 = response1.charset;
        java.lang.String str8 = response1.getHeaderCaseInsensitive("");
        boolean boolean10 = response1.hasCookie("Location");
        java.lang.String str12 = response1.header("Location");
        response1.contentType = "";
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test10201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10201");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        org.jsoup.Connection.Response response8 = response1.cookie("hi!", "");
        java.lang.String str10 = response1.getHeaderCaseInsensitive("Location");
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.nio.ByteBuffer byteBuffer12 = response11.byteData;
        org.jsoup.Connection.Response response14 = response11.removeCookie("hi!");
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(byteBuffer12);
        org.junit.Assert.assertNotNull(response14);
    }

    @Test
    public void test10202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10202");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        org.jsoup.Connection.Request request5 = null;
        response1.req = request5;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry8 = response1.scanHeaders("Location");
        boolean boolean11 = response1.hasHeaderWithValue("hi!", "");
        response1.statusMessage = "Location";
        java.lang.String str14 = response1.contentType;
        java.lang.String str15 = response1.statusMessage;
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(strEntry8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Location" + "'", str15, "Location");
    }

    @Test
    public void test10203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10203");
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
        org.jsoup.Connection.Response response18 = response1.header("hi!", "");
        java.util.Map<java.lang.String, java.lang.String> strMap19 = response1.cookies();
        java.lang.String str20 = response1.contentType;
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(uRL13);
        org.junit.Assert.assertNotNull(response18);
        org.junit.Assert.assertNotNull(strMap19);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test10204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10204");
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
        int int16 = response1.statusCode;
        org.jsoup.Connection.Request request17 = null;
        response1.req = request17;
        java.util.Map<java.lang.String, java.lang.String> strMap19 = response1.cookies();
        response1.executed = true;
        java.util.Map<java.lang.String, java.lang.String> strMap22 = response1.headers();
        org.jsoup.Connection.Method method23 = response1.method();
        java.lang.String str25 = response1.header("Location");
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(strMap19);
        org.junit.Assert.assertNotNull(strMap22);
        org.junit.Assert.assertNull(method23);
        org.junit.Assert.assertNull(str25);
    }

    @Test
    public void test10205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10205");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        boolean boolean6 = response1.hasCookie("hi!");
        org.jsoup.Connection.Response response9 = response1.header("Location", "");
        java.lang.String str10 = response1.charset();
        response1.statusMessage = "";
        org.jsoup.Connection.Request request13 = null;
        response1.req = request13;
        java.lang.String str16 = response1.getHeaderCaseInsensitive("");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray17 = response1.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test10206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10206");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        org.jsoup.Connection.Response response8 = response1.cookie("hi!", "");
        java.lang.String str9 = response1.statusMessage();
        org.jsoup.Connection.Request request10 = response1.req;
        response1.numRedirects = 0;
        int int13 = response1.statusCode;
        java.lang.String str15 = response1.cookie("hi!");
        org.jsoup.Connection.Request request16 = null;
        response1.req = request16;
        response1.executed = true;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = response1.cookie("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(request10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test10207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10207");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        response1.executed = false;
        org.jsoup.Connection.Response response11 = response1.header("Location", "");
        int int12 = response1.statusCode;
        java.lang.String str13 = response1.charset();
        java.lang.String str14 = response1.statusMessage();
        java.net.URL uRL15 = response1.url();
        java.lang.String str17 = response1.getHeaderCaseInsensitive("");
        response1.statusCode = '4';
        response1.statusCode = 97;
        boolean boolean22 = response1.executed;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document23 = response1.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(uRL15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test10208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10208");
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
        java.util.Map<java.lang.String, java.lang.String> strMap19 = response1.cookies();
        response1.executed = false;
        java.lang.String str22 = response1.statusMessage();
        java.net.URL uRL23 = response1.url();
        org.jsoup.Connection.Request request24 = null;
        response1.req = request24;
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(strEntry8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(response17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(strMap19);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(uRL23);
    }

    @Test
    public void test10209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10209");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        response1.executed = false;
        boolean boolean9 = response1.executed;
        int int10 = response1.statusCode();
        response1.executed = false;
        org.jsoup.Connection.Request request13 = response1.req;
        response1.statusCode = (byte) 0;
        java.lang.String str16 = response1.charset;
        response1.numRedirects = (short) 10;
        boolean boolean19 = response1.executed;
        java.util.Map<java.lang.String, java.lang.String> strMap20 = response1.cookies();
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(request13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(strMap20);
    }

    @Test
    public void test10210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10210");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        org.jsoup.Connection.Request request5 = null;
        response1.req = request5;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry8 = response1.scanHeaders("Location");
        java.lang.String str9 = response1.contentType;
        java.util.Map<java.lang.String, java.lang.String> strMap10 = response1.headers();
        response1.contentType = "hi!";
        boolean boolean14 = response1.hasCookie("Location");
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(strEntry8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test10211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10211");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        response1.charset = "";
        response1.statusMessage = "";
        java.lang.String str10 = response1.getHeaderCaseInsensitive("");
        boolean boolean11 = response1.executed;
        java.nio.ByteBuffer byteBuffer12 = response1.byteData;
        java.lang.String str14 = response1.header("Location");
        java.lang.String str15 = response1.statusMessage;
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response1);
        int int17 = response1.statusCode();
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(byteBuffer12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test10212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10212");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        java.util.Map<java.lang.String, java.lang.String> strMap7 = response1.cookies();
        java.lang.String str8 = response1.charset;
        response1.executed = true;
        response1.statusCode = 0;
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test10213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10213");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        response1.charset = "";
        response1.statusMessage = "";
        java.lang.String str10 = response1.getHeaderCaseInsensitive("");
        boolean boolean11 = response1.executed;
        java.nio.ByteBuffer byteBuffer12 = response1.byteData;
        java.lang.String str14 = response1.header("Location");
        java.lang.String str15 = response1.charset;
        int int16 = response1.statusCode;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry18 = response1.scanHeaders("hi!");
        java.net.URL uRL19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response20 = response1.url(uRL19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(byteBuffer12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(strEntry18);
    }

    @Test
    public void test10214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10214");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        response1.charset = "";
        response1.statusMessage = "";
        java.lang.String str10 = response1.getHeaderCaseInsensitive("");
        boolean boolean12 = response1.hasCookie("Location");
        boolean boolean14 = response1.hasCookie("Location");
        java.lang.String str16 = response1.header("");
        org.jsoup.Connection.Request request17 = response1.req;
        response1.statusMessage = "Location";
        boolean boolean21 = response1.hasHeader("Location");
        java.lang.String str22 = response1.charset;
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(request17);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test10215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10215");
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
        org.jsoup.Connection.Response response13 = response1.header("hi!", "Location");
        boolean boolean14 = response1.executed;
        response1.contentType = "hi!";
        int int17 = response1.numRedirects;
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(strEntry8);
        org.junit.Assert.assertNull(byteBuffer9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test10216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10216");
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
        java.lang.String str18 = response1.contentType;
        int int19 = response1.statusCode();
        java.lang.String str20 = response1.charset;
        java.lang.String str21 = response1.contentType();
        java.net.HttpURLConnection httpURLConnection22 = null;
        org.jsoup.helper.HttpConnection.Response response23 = null;
        org.jsoup.helper.HttpConnection.Response response24 = new org.jsoup.helper.HttpConnection.Response(response23);
        org.jsoup.Connection.Response response27 = response24.header("hi!", "");
        java.lang.String str29 = response24.getHeaderCaseInsensitive("");
        response24.executed = false;
        org.jsoup.Connection.Response response34 = response24.header("Location", "");
        int int35 = response24.statusCode;
        boolean boolean36 = response24.executed;
        response24.statusMessage = "hi!";
        java.lang.String str39 = response24.charset;
        org.jsoup.Connection.Response response42 = response24.cookie("hi!", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            response1.setupFromConnection(httpURLConnection22, response42);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(request17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(response27);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(response34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNotNull(response42);
    }

    @Test
    public void test10217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10217");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.charset = "Location";
        int int4 = response1.numRedirects;
        java.nio.ByteBuffer byteBuffer5 = response1.byteData;
        java.nio.ByteBuffer byteBuffer6 = response1.byteData;
        java.nio.ByteBuffer byteBuffer7 = response1.byteData;
        java.nio.ByteBuffer byteBuffer8 = null;
        response1.byteData = byteBuffer8;
        java.net.URL uRL10 = response1.url();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(byteBuffer5);
        org.junit.Assert.assertNull(byteBuffer6);
        org.junit.Assert.assertNull(byteBuffer7);
        org.junit.Assert.assertNull(uRL10);
    }

    @Test
    public void test10218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10218");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        org.jsoup.Connection.Request request5 = null;
        response1.req = request5;
        java.lang.String str8 = response1.header("Location");
        boolean boolean9 = response1.executed;
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test10219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10219");
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
        java.nio.ByteBuffer byteBuffer18 = null;
        response1.byteData = byteBuffer18;
        org.jsoup.Connection.Request request20 = response1.req;
        java.lang.String str21 = response1.contentType();
        java.lang.String str23 = response1.header("hi!");
        org.jsoup.Connection.Request request24 = response1.req;
        org.jsoup.Connection.Request request25 = response1.req;
        org.jsoup.Connection.Response response28 = response1.cookie("hi!", "Location");
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(request20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(request24);
        org.junit.Assert.assertNull(request25);
        org.junit.Assert.assertNotNull(response28);
    }

    @Test
    public void test10220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10220");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        response1.executed = false;
        org.jsoup.Connection.Response response11 = response1.header("Location", "");
        int int12 = response1.statusCode();
        org.jsoup.Connection.Request request13 = null;
        response1.req = request13;
        response1.numRedirects = 100;
        java.lang.String str18 = response1.getHeaderCaseInsensitive("Location");
        java.net.URL uRL19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response20 = response1.url(uRL19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test10221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10221");
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
        response1.contentType = "";
        response1.numRedirects = 1;
        int int21 = response1.statusCode();
        response1.contentType = "hi!";
        boolean boolean25 = response1.hasCookie("Location");
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test10222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10222");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        java.lang.String str7 = response1.charset();
        java.lang.String str8 = response1.charset();
        java.nio.ByteBuffer byteBuffer9 = null;
        response1.byteData = byteBuffer9;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = response1.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test10223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10223");
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
        org.jsoup.Connection.Method method24 = response1.method();
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(strEntry19);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(method24);
    }

    @Test
    public void test10224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10224");
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
        boolean boolean20 = response1.hasHeaderWithValue("hi!", "");
        org.jsoup.helper.HttpConnection.Response response21 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.nio.ByteBuffer byteBuffer22 = response1.byteData;
        java.lang.String str24 = response1.header("hi!");
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNull(byteBuffer22);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test10225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10225");
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
        java.lang.String str16 = response1.charset;
        java.lang.String str17 = response1.charset();
        org.jsoup.Connection.Response response19 = response1.removeCookie("Location");
        java.net.HttpURLConnection httpURLConnection20 = null;
        org.jsoup.helper.HttpConnection.Response response21 = null;
        org.jsoup.helper.HttpConnection.Response response22 = new org.jsoup.helper.HttpConnection.Response(response21);
        org.jsoup.Connection.Response response25 = response22.header("hi!", "");
        response22.charset = "";
        java.lang.String str29 = response22.cookie("hi!");
        boolean boolean30 = response22.executed;
        java.lang.String str31 = response22.contentType;
        response22.statusCode = (short) 1;
        response22.charset = "Location";
        boolean boolean37 = response22.hasCookie("hi!");
        response22.numRedirects = '4';
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry41 = response22.scanHeaders("hi!");
        // The following exception was thrown during execution in test generation
        try {
            response1.setupFromConnection(httpURLConnection20, (org.jsoup.Connection.Response) response22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertNull(strEntry13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(response19);
        org.junit.Assert.assertNotNull(response25);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(strEntry41);
    }

    @Test
    public void test10226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10226");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        boolean boolean6 = response1.hasCookie("hi!");
        response1.charset = "hi!";
        java.net.URL uRL9 = response1.url();
        int int10 = response1.statusCode;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry12 = response1.scanHeaders("hi!");
        java.lang.String str13 = response1.charset();
        boolean boolean14 = response1.executed;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response17 = response1.header("", "Location");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(strEntry12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test10227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10227");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        response1.charset = "";
        response1.statusMessage = "";
        java.util.Map<java.lang.String, java.lang.String> strMap9 = response1.headers();
        boolean boolean10 = response1.executed;
        java.util.Map<java.lang.String, java.lang.String> strMap11 = response1.headers();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry13 = response1.scanHeaders("Location");
        response1.numRedirects = 'a';
        java.net.URL uRL16 = response1.url();
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNull(strEntry13);
        org.junit.Assert.assertNull(uRL16);
    }

    @Test
    public void test10228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10228");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        org.jsoup.Connection.Request request8 = response1.req;
        org.jsoup.Connection.Method method9 = response1.method();
        java.net.URL uRL10 = response1.url();
        response1.executed = false;
        response1.executed = true;
        java.lang.String str15 = response1.contentType;
        int int16 = response1.numRedirects;
        int int17 = response1.statusCode();
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNull(request8);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertNull(uRL10);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test10229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10229");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        java.lang.String str7 = response1.contentType();
        java.lang.String str9 = response1.header("hi!");
        java.lang.String str10 = response1.statusMessage;
        org.jsoup.Connection.Method method11 = response1.method();
        java.lang.String str12 = response1.charset;
        java.util.Map<java.lang.String, java.lang.String> strMap13 = response1.cookies();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response16 = response1.header("", "Location");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(method11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(strMap13);
    }

    @Test
    public void test10230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10230");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response18 = response1.removeCookie("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(method14);
        org.junit.Assert.assertNotNull(response16);
    }

    @Test
    public void test10231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10231");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        org.jsoup.Connection.Request request8 = response1.req;
        org.jsoup.Connection.Method method9 = response1.method();
        java.net.URL uRL10 = response1.url();
        org.jsoup.Connection.Method method11 = response1.method();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = response1.hasHeaderWithValue("", "Location");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNull(request8);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertNull(uRL10);
        org.junit.Assert.assertNull(method11);
    }

    @Test
    public void test10232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10232");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        response1.executed = false;
        boolean boolean9 = response1.executed;
        int int10 = response1.statusCode();
        java.net.URL uRL11 = response1.url();
        org.jsoup.Connection.Method method12 = response1.method();
        java.lang.String str14 = response1.cookie("hi!");
        java.lang.String str15 = response1.contentType();
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertNull(method12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test10233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10233");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        org.jsoup.Connection.Request request4 = null;
        response1.req = request4;
        java.lang.String str6 = response1.charset;
        java.nio.ByteBuffer byteBuffer7 = response1.byteData;
        java.lang.String str8 = response1.contentType();
        java.lang.Class<?> wildcardClass9 = response1.getClass();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(byteBuffer7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test10234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10234");
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
        org.jsoup.Connection.Response response22 = response1.header("hi!", "Location");
        boolean boolean23 = response1.executed;
        response1.numRedirects = (byte) 0;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document26 = response1.parse();
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
        org.junit.Assert.assertNull(uRL17);
        org.junit.Assert.assertNotNull(response22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test10235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10235");
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
        java.lang.String str17 = response1.cookie("hi!");
        int int18 = response1.statusCode();
        java.util.Map<java.lang.String, java.lang.String> strMap19 = response1.headers();
        java.lang.String str21 = response1.getHeaderCaseInsensitive("");
        java.lang.String str23 = response1.getHeaderCaseInsensitive("Location");
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(method13);
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(strMap19);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test10236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10236");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        java.lang.String str8 = response1.contentType();
        java.lang.String str9 = response1.contentType;
        response1.statusMessage = "hi!";
        java.lang.String str12 = response1.charset;
        int int13 = response1.statusCode();
        java.net.URL uRL14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response15 = response1.url(uRL14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test10237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10237");
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
        java.lang.String str13 = response1.charset();
        org.jsoup.Connection.Response response16 = response1.header("Location", "hi!");
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str18 = response17.contentType();
        boolean boolean21 = response17.hasHeaderWithValue("Location", "hi!");
        java.lang.String str22 = response17.contentType();
        response17.statusCode = 32;
        java.lang.String str25 = response17.statusMessage();
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str25);
    }

    @Test
    public void test10238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10238");
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
        org.jsoup.Connection.Response response17 = response1.removeHeader("Location");
        java.lang.String str19 = response1.getHeaderCaseInsensitive("hi!");
        java.net.URL uRL20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response21 = response1.url(uRL20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(response17);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test10239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10239");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        java.lang.String str8 = response1.contentType();
        int int9 = response1.statusCode;
        java.nio.ByteBuffer byteBuffer10 = null;
        response1.byteData = byteBuffer10;
        boolean boolean14 = response1.hasHeaderWithValue("Location", "Location");
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test10240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10240");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        response1.executed = false;
        response1.numRedirects = '4';
        java.lang.String str11 = response1.contentType();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry13 = response1.scanHeaders("");
        java.lang.String str14 = response1.charset();
        org.jsoup.Connection.Method method15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response16 = response1.method(method15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(strEntry13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test10241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10241");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        response1.executed = false;
        org.jsoup.Connection.Request request9 = null;
        response1.req = request9;
        java.net.URL uRL11 = response1.url();
        org.jsoup.Connection.Response response14 = response1.header("hi!", "Location");
        boolean boolean15 = response1.executed;
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test10242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10242");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        response1.charset = "";
        java.lang.String str8 = response1.cookie("hi!");
        boolean boolean9 = response1.executed;
        response1.statusMessage = "Location";
        java.util.Map<java.lang.String, java.lang.String> strMap12 = response1.headers();
        org.jsoup.Connection.Response response14 = response1.removeHeader("hi!");
        java.lang.String str16 = response1.header("");
        java.nio.ByteBuffer byteBuffer17 = null;
        response1.byteData = byteBuffer17;
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test10243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10243");
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
        java.nio.ByteBuffer byteBuffer13 = response1.byteData;
        java.lang.String str14 = response1.charset;
        java.net.URL uRL15 = response1.url();
        java.lang.String str17 = response1.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Method method18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response19 = response1.method(method18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(request10);
        org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(byteBuffer13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(uRL15);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test10244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10244");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        response1.charset = "";
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry8 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        response1.statusCode = (byte) 0;
        boolean boolean15 = response1.hasHeaderWithValue("Location", "Location");
        java.lang.String str16 = response1.statusMessage;
        java.lang.String str18 = response1.cookie("Location");
        response1.numRedirects = '#';
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = response1.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNotNull(strEntry8);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test10245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10245");
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
        java.lang.String str18 = response1.statusMessage;
        int int19 = response1.numRedirects;
        java.nio.ByteBuffer byteBuffer20 = response1.byteData;
        org.jsoup.Connection.Request request21 = response1.req;
        java.lang.String str22 = response1.charset;
        boolean boolean24 = response1.hasCookie("Location");
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNull(byteBuffer20);
        org.junit.Assert.assertNull(request21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test10246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10246");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        java.util.Map<java.lang.String, java.lang.String> strMap7 = response1.cookies();
        org.jsoup.Connection.Method method8 = response1.method();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document9 = response1.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNull(method8);
    }

    @Test
    public void test10247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10247");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        response1.executed = false;
        org.jsoup.Connection.Response response11 = response1.header("Location", "");
        int int12 = response1.statusCode;
        boolean boolean14 = response1.hasCookie("hi!");
        response1.executed = false;
        org.jsoup.Connection.Response response18 = response1.removeHeader("hi!");
        boolean boolean19 = response1.executed;
        java.util.Map<java.lang.String, java.lang.String> strMap20 = response1.headers();
        org.jsoup.Connection.Request request21 = response1.req;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response23 = response1.removeCookie("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(response18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(strMap20);
        org.junit.Assert.assertNull(request21);
    }

    @Test
    public void test10248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10248");
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
        int int16 = response1.statusCode();
        response1.statusMessage = "";
        org.jsoup.Connection.Response response21 = response1.cookie("hi!", "Location");
        java.net.URL uRL22 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response23 = response1.url(uRL22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(strEntry12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(response21);
    }

    @Test
    public void test10249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10249");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        boolean boolean6 = response1.hasCookie("hi!");
        response1.charset = "hi!";
        java.net.URL uRL9 = response1.url();
        int int10 = response1.statusCode;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry12 = response1.scanHeaders("hi!");
        org.jsoup.Connection.Response response14 = response1.removeHeader("hi!");
        response1.numRedirects = ' ';
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray17 = response1.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(strEntry12);
        org.junit.Assert.assertNotNull(response14);
    }

    @Test
    public void test10250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10250");
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
        boolean boolean18 = response1.hasHeader("hi!");
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertNull(strEntry13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test10251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10251");
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
        java.lang.String str15 = response1.statusMessage;
        org.jsoup.Connection.Request request16 = response1.req;
        response1.statusMessage = "Location";
        org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response(response1);
        response1.executed = true;
        java.lang.String str22 = response1.contentType;
        boolean boolean25 = response1.hasHeaderWithValue("Location", "hi!");
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(uRL14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Location" + "'", str15, "Location");
        org.junit.Assert.assertNull(request16);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test10252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10252");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        org.jsoup.Connection.Response response6 = response1.removeCookie("Location");
        java.lang.String str8 = response1.getHeaderCaseInsensitive("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap9 = response1.headers();
        java.net.URL uRL10 = response1.url();
        boolean boolean12 = response1.hasCookie("Location");
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNull(uRL10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test10253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10253");
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
        org.jsoup.Connection.Method method19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response20 = response1.method(method19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
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
    public void test10254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10254");
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
        java.lang.String str18 = response1.header("hi!");
        response1.charset = "hi!";
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test10255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10255");
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
        boolean boolean17 = response1.hasHeaderWithValue("hi!", "");
        java.lang.String str18 = response1.statusMessage;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = response1.hasHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(request13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test10256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10256");
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
        java.lang.String str20 = response1.statusMessage();
        java.lang.String str21 = response1.statusMessage();
        java.util.Map<java.lang.String, java.lang.String> strMap22 = response1.headers();
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertNull(method17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(strMap22);
    }

    @Test
    public void test10257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10257");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.numRedirects = (byte) -1;
        java.lang.String str4 = response1.statusMessage;
        response1.numRedirects = (short) -1;
        java.nio.ByteBuffer byteBuffer7 = null;
        response1.byteData = byteBuffer7;
        int int9 = response1.statusCode;
        org.jsoup.Connection.Method method10 = response1.method();
        org.jsoup.Connection.Request request11 = response1.req;
        org.jsoup.Connection.Response response14 = response1.header("hi!", "");
        response1.charset = "hi!";
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNull(request11);
        org.junit.Assert.assertNotNull(response14);
    }

    @Test
    public void test10258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10258");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        boolean boolean8 = response1.hasHeaderWithValue("Location", "Location");
        int int9 = response1.statusCode();
        int int10 = response1.statusCode;
        java.lang.String str12 = response1.getHeaderCaseInsensitive("hi!");
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test10259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10259");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        java.nio.ByteBuffer byteBuffer7 = null;
        response1.byteData = byteBuffer7;
        java.lang.String str10 = response1.header("Location");
        java.net.URL uRL11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response12 = response1.url(uRL11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test10260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10260");
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
        boolean boolean17 = response1.hasHeader("hi!");
        response1.numRedirects = (short) -1;
        int int20 = response1.statusCode();
        response1.statusCode = 0;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response25 = response1.cookie("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test10261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10261");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.charset = "Location";
        java.nio.ByteBuffer byteBuffer4 = null;
        response1.byteData = byteBuffer4;
        response1.executed = false;
        java.nio.ByteBuffer byteBuffer8 = response1.byteData;
        java.nio.ByteBuffer byteBuffer9 = response1.byteData;
        response1.contentType = "";
        java.util.Map<java.lang.String, java.lang.String> strMap12 = response1.cookies();
        response1.numRedirects = (short) 0;
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Method method16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response17 = response15.method(method16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(byteBuffer8);
        org.junit.Assert.assertNull(byteBuffer9);
        org.junit.Assert.assertNotNull(strMap12);
    }

    @Test
    public void test10262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10262");
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
        org.jsoup.Connection.Method method18 = response1.method();
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(request16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(method18);
    }

    @Test
    public void test10263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10263");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        java.lang.String str7 = response1.contentType();
        java.lang.String str8 = response1.contentType();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry10 = response1.scanHeaders("");
        org.jsoup.Connection.Method method11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response12 = response1.method(method11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(strEntry10);
    }

    @Test
    public void test10264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10264");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Response response5 = response2.header("hi!", "");
        boolean boolean7 = response2.hasCookie("hi!");
        org.jsoup.Connection.Response response10 = response2.header("Location", "");
        org.jsoup.Connection.Response response12 = response2.removeHeader("hi!");
        java.lang.String str13 = response2.contentType();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response14 = org.jsoup.helper.HttpConnection.Response.execute(request0, response2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test10265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10265");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        org.jsoup.Connection.Response response8 = response1.cookie("hi!", "");
        boolean boolean9 = response1.executed;
        response1.contentType = "";
        java.lang.String str12 = response1.charset;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry14 = response1.scanHeaders("");
        int int15 = response1.numRedirects;
        response1.charset = "Location";
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(strEntry14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test10266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10266");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        response1.charset = "";
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry8 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        org.jsoup.Connection.Method method11 = response1.method();
        int int12 = response1.numRedirects;
        int int13 = response1.numRedirects;
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNotNull(strEntry8);
        org.junit.Assert.assertNull(method11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test10267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10267");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        response1.charset = "";
        response1.statusMessage = "";
        java.lang.String str10 = response1.getHeaderCaseInsensitive("");
        boolean boolean13 = response1.hasHeaderWithValue("Location", "");
        java.lang.String str14 = response1.charset;
        java.lang.String str15 = response1.charset;
        org.jsoup.Connection.Request request16 = null;
        response1.req = request16;
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test10268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10268");
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
        java.lang.Class<?> wildcardClass16 = response15.getClass();
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test10269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10269");
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
        java.nio.ByteBuffer byteBuffer13 = response1.byteData;
        java.lang.String str14 = response1.contentType();
        java.lang.String str15 = response1.charset;
        java.lang.String str16 = response1.statusMessage;
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray17 = response1.bodyAsBytes();
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
        org.junit.Assert.assertNull(byteBuffer13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test10270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10270");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        response1.charset = "";
        response1.statusMessage = "";
        java.util.Map<java.lang.String, java.lang.String> strMap9 = response1.headers();
        boolean boolean10 = response1.executed;
        int int11 = response1.numRedirects;
        boolean boolean13 = response1.hasCookie("hi!");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry15 = response1.scanHeaders("");
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(strEntry15);
    }

    @Test
    public void test10271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10271");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        response1.charset = "";
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry8 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        response1.statusCode = (byte) 10;
        java.lang.String str13 = response1.contentType;
        java.lang.String str14 = response1.contentType();
        int int15 = response1.statusCode();
        java.net.URL uRL16 = response1.url();
        java.lang.String str18 = response1.header("Location");
        org.jsoup.Connection.Response response21 = response1.cookie("Location", "hi!");
        java.lang.String str22 = response1.statusMessage();
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNotNull(strEntry8);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertNull(uRL16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(response21);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test10272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10272");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        response1.charset = "";
        response1.statusMessage = "";
        java.util.Map<java.lang.String, java.lang.String> strMap9 = response1.headers();
        int int10 = response1.numRedirects;
        response1.numRedirects = 10;
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test10273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10273");
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
        org.jsoup.Connection.Response response23 = response1.cookie("hi!", "hi!");
        org.jsoup.Connection.Request request24 = response1.req;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry26 = response1.scanHeaders("hi!");
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNull(request20);
        org.junit.Assert.assertNotNull(response23);
        org.junit.Assert.assertNull(request24);
        org.junit.Assert.assertNull(strEntry26);
    }

    @Test
    public void test10274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10274");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Request request3 = null;
        response2.req = request3;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry6 = response2.scanHeaders("hi!");
        response2.charset = "hi!";
        response2.statusMessage = "hi!";
        boolean boolean12 = response2.hasHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response2);
        int int14 = response2.statusCode();
        java.util.Map<java.lang.String, java.lang.String> strMap15 = response2.headers();
        java.nio.ByteBuffer byteBuffer16 = response2.byteData;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response17 = org.jsoup.helper.HttpConnection.Response.execute(request0, response2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertNull(byteBuffer16);
    }

    @Test
    public void test10275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10275");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        java.lang.String str7 = response1.contentType();
        java.lang.String str8 = response1.contentType();
        org.jsoup.Connection.Response response10 = response1.removeHeader("Location");
        java.lang.String str11 = response1.contentType;
        java.lang.String str13 = response1.getHeaderCaseInsensitive("");
        java.lang.String str15 = response1.header("");
        java.nio.ByteBuffer byteBuffer16 = null;
        response1.byteData = byteBuffer16;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry19 = response1.scanHeaders("Location");
        response1.numRedirects = (byte) 0;
        java.nio.ByteBuffer byteBuffer22 = response1.byteData;
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(strEntry19);
        org.junit.Assert.assertNull(byteBuffer22);
    }

    @Test
    public void test10276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10276");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        response1.executed = false;
        response1.numRedirects = '4';
        response1.statusCode = (byte) -1;
        response1.charset = "";
        java.lang.String str15 = response1.charset();
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test10277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10277");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        org.jsoup.Connection.Response response10 = response1.header("Location", "Location");
        java.lang.String str11 = response1.statusMessage();
        java.lang.String str12 = response1.statusMessage;
        java.util.Map<java.lang.String, java.lang.String> strMap13 = response1.cookies();
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(strMap13);
    }

    @Test
    public void test10278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10278");
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
        java.lang.String str19 = response1.contentType;
        org.jsoup.Connection.Request request20 = response1.req;
        boolean boolean23 = response1.hasHeaderWithValue("hi!", "hi!");
        org.jsoup.Connection.Response response26 = response1.header("Location", "hi!");
        boolean boolean28 = response1.hasHeader("Location");
        int int29 = response1.statusCode;
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNull(request20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(response26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test10279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10279");
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
        java.lang.String str14 = response1.contentType();
        java.lang.String str15 = response1.statusMessage();
        java.util.Map<java.lang.String, java.lang.String> strMap16 = response1.headers();
        org.jsoup.Connection.Response response19 = response1.cookie("Location", "");
        org.jsoup.helper.HttpConnection.Response response20 = new org.jsoup.helper.HttpConnection.Response(response1);
        response20.statusCode = (short) 0;
        java.lang.Class<?> wildcardClass23 = response20.getClass();
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(strEntry12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertNotNull(response19);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test10280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10280");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        org.jsoup.Connection.Request request5 = null;
        response1.req = request5;
        java.lang.String str7 = response1.charset();
        response1.statusMessage = "hi!";
        org.jsoup.Connection.Response response11 = response1.removeCookie("Location");
        boolean boolean14 = response1.hasHeaderWithValue("Location", "Location");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response16 = response1.removeCookie("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test10281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10281");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.charset = "Location";
        java.nio.ByteBuffer byteBuffer4 = null;
        response1.byteData = byteBuffer4;
        org.jsoup.Connection.Request request6 = response1.req;
        java.lang.String str8 = response1.getHeaderCaseInsensitive("hi!");
        org.jsoup.Connection.Response response11 = response1.cookie("hi!", "hi!");
        int int12 = response1.statusCode;
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str15 = response1.header("hi!");
        java.lang.Class<?> wildcardClass16 = response1.getClass();
        org.junit.Assert.assertNull(request6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test10282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10282");
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
        java.lang.String str14 = response1.contentType();
        java.lang.String str16 = response1.cookie("hi!");
        java.net.URL uRL17 = response1.url();
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(uRL17);
    }

    @Test
    public void test10283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10283");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.net.URL uRL5 = response1.url();
        java.nio.ByteBuffer byteBuffer6 = null;
        response1.byteData = byteBuffer6;
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response1);
        response1.statusMessage = "";
        org.jsoup.Connection.Response response13 = response1.header("hi!", "");
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(uRL5);
        org.junit.Assert.assertNotNull(response13);
    }

    @Test
    public void test10284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10284");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        boolean boolean6 = response1.hasCookie("hi!");
        response1.charset = "Location";
        java.lang.String str9 = response1.charset;
        java.lang.String str10 = response1.contentType();
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Location" + "'", str9, "Location");
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test10285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10285");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        java.lang.String str8 = response1.contentType();
        int int9 = response1.statusCode;
        int int10 = response1.statusCode;
        boolean boolean12 = response1.hasHeader("hi!");
        response1.contentType = "Location";
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test10286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10286");
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
        java.lang.String str19 = response1.charset;
        java.nio.ByteBuffer byteBuffer20 = response1.byteData;
        java.util.Map<java.lang.String, java.lang.String> strMap21 = response1.headers();
        int int22 = response1.statusCode();
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(strEntry18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNull(byteBuffer20);
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test10287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10287");
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
        java.nio.ByteBuffer byteBuffer14 = null;
        response1.byteData = byteBuffer14;
        java.lang.String str16 = response1.contentType();
        response1.contentType = "Location";
        int int19 = response1.numRedirects;
        org.jsoup.helper.HttpConnection.Response response20 = new org.jsoup.helper.HttpConnection.Response(response1);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document21 = response20.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertNull(strEntry13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test10288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10288");
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
        response1.executed = true;
        response1.statusMessage = "hi!";
        boolean boolean19 = response1.hasHeader("hi!");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = response1.hasCookie("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(strEntry8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNull(method13);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test10289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10289");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.charset = "Location";
        java.nio.ByteBuffer byteBuffer4 = null;
        response1.byteData = byteBuffer4;
        org.jsoup.Connection.Request request6 = response1.req;
        java.lang.String str7 = response1.charset();
        boolean boolean10 = response1.hasHeaderWithValue("hi!", "hi!");
        response1.statusMessage = "";
        org.junit.Assert.assertNull(request6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Location" + "'", str7, "Location");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test10290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10290");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        response1.executed = false;
        org.jsoup.Connection.Response response11 = response1.header("Location", "");
        int int12 = response1.statusCode;
        org.jsoup.Connection.Response response15 = response1.cookie("Location", "");
        int int16 = response1.statusCode();
        org.jsoup.Connection.Response response18 = response1.removeHeader("Location");
        java.lang.String str19 = response1.contentType();
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(response18);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test10291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10291");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        response1.executed = false;
        org.jsoup.Connection.Response response11 = response1.header("Location", "");
        int int12 = response1.statusCode;
        boolean boolean14 = response1.hasCookie("hi!");
        response1.executed = false;
        org.jsoup.Connection.Response response18 = response1.removeHeader("hi!");
        boolean boolean19 = response1.executed;
        response1.statusMessage = "";
        org.jsoup.Connection.Method method22 = response1.method();
        java.lang.String str23 = response1.charset();
        java.lang.String str24 = response1.statusMessage;
        java.nio.ByteBuffer byteBuffer25 = response1.byteData;
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(response18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(method22);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNull(byteBuffer25);
    }

    @Test
    public void test10292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10292");
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
        java.lang.String str17 = response1.cookie("Location");
        java.lang.String str19 = response1.getHeaderCaseInsensitive("Location");
        response1.numRedirects = (byte) 0;
        java.lang.String str22 = response1.statusMessage;
        boolean boolean24 = response1.hasCookie("Location");
        org.jsoup.Connection.Response response27 = response1.header("Location", "hi!");
        java.nio.ByteBuffer byteBuffer28 = null;
        response1.byteData = byteBuffer28;
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
        org.junit.Assert.assertNull(method13);
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(response27);
    }

    @Test
    public void test10293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10293");
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
        boolean boolean12 = response1.hasCookie("hi!");
        response1.contentType = "";
        java.net.HttpURLConnection httpURLConnection15 = null;
        org.jsoup.helper.HttpConnection.Response response16 = null;
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response16);
        org.jsoup.Connection.Request request18 = null;
        response17.req = request18;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry21 = response17.scanHeaders("hi!");
        response17.charset = "hi!";
        java.lang.String str24 = response17.contentType();
        java.lang.String str25 = response17.contentType;
        boolean boolean27 = response17.hasHeader("hi!");
        java.net.URL uRL28 = response17.url();
        boolean boolean30 = response17.hasCookie("Location");
        int int31 = response17.numRedirects;
        response17.contentType = "hi!";
        java.lang.String str34 = response17.contentType();
        response17.charset = "Location";
        java.lang.String str37 = response17.contentType();
        // The following exception was thrown during execution in test generation
        try {
            response1.setupFromConnection(httpURLConnection15, (org.jsoup.Connection.Response) response17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(strEntry8);
        org.junit.Assert.assertNull(byteBuffer9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(strEntry21);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(uRL28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
    }

    @Test
    public void test10294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10294");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        org.jsoup.Connection.Request request5 = null;
        response1.req = request5;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry8 = response1.scanHeaders("Location");
        boolean boolean11 = response1.hasHeaderWithValue("hi!", "");
        int int12 = response1.statusCode;
        response1.contentType = "Location";
        java.nio.ByteBuffer byteBuffer15 = null;
        response1.byteData = byteBuffer15;
        java.nio.ByteBuffer byteBuffer17 = response1.byteData;
        java.lang.String str18 = response1.contentType;
        java.lang.String str19 = response1.statusMessage();
        response1.charset = "hi!";
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(strEntry8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(byteBuffer17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Location" + "'", str18, "Location");
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test10295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10295");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.charset = "Location";
        int int4 = response1.numRedirects;
        java.nio.ByteBuffer byteBuffer5 = response1.byteData;
        java.net.URL uRL6 = response1.url();
        java.lang.String str7 = response1.charset;
        java.lang.String str8 = response1.contentType();
        int int9 = response1.statusCode;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(byteBuffer5);
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Location" + "'", str7, "Location");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test10296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10296");
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
        java.lang.Class<?> wildcardClass14 = response1.getClass();
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(request10);
        org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test10297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10297");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        org.jsoup.Connection.Request request5 = null;
        response1.req = request5;
        java.lang.String str7 = response1.charset();
        response1.statusMessage = "hi!";
        boolean boolean11 = response1.hasCookie("hi!");
        boolean boolean13 = response1.hasHeader("Location");
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test10298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10298");
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
        org.jsoup.Connection.Response response24 = response22.removeHeader("hi!");
        response22.contentType = "";
        java.lang.String str27 = response22.statusMessage();
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(method13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(strEntry16);
        org.junit.Assert.assertNotNull(response21);
        org.junit.Assert.assertNotNull(response24);
        org.junit.Assert.assertNull(str27);
    }

    @Test
    public void test10299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10299");
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
        response1.contentType = "";
        response1.numRedirects = 1;
        java.net.URL uRL21 = response1.url();
        org.jsoup.Connection.Request request22 = null;
        response1.req = request22;
        java.util.Map<java.lang.String, java.lang.String> strMap24 = response1.headers();
        org.jsoup.Connection.Method method25 = response1.method();
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertNull(uRL21);
        org.junit.Assert.assertNotNull(strMap24);
        org.junit.Assert.assertNull(method25);
    }

    @Test
    public void test10300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10300");
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
        org.jsoup.Connection.Request request17 = response1.req;
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNotNull(strEntry8);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNull(byteBuffer10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(request16);
        org.junit.Assert.assertNull(request17);
    }

    @Test
    public void test10301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10301");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        response1.charset = "";
        response1.statusMessage = "";
        java.lang.String str10 = response1.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response13 = response1.cookie("Location", "hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap14 = response1.cookies();
        java.net.URL uRL15 = response1.url();
        java.util.Map<java.lang.String, java.lang.String> strMap16 = response1.headers();
        response1.charset = "hi!";
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray19 = response1.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNull(uRL15);
        org.junit.Assert.assertNotNull(strMap16);
    }

    @Test
    public void test10302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10302");
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
        response1.numRedirects = 10;
        org.jsoup.Connection.Response response17 = response1.removeHeader("hi!");
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
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(response17);
    }

    @Test
    public void test10303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10303");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        boolean boolean8 = response1.hasHeaderWithValue("Location", "Location");
        int int9 = response1.statusCode();
        response1.statusMessage = "";
        response1.statusMessage = "";
        int int14 = response1.numRedirects;
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test10304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10304");
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
        org.jsoup.Connection.Request request18 = null;
        response1.req = request18;
        org.jsoup.Connection.Response response21 = response1.removeCookie("hi!");
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(response21);
    }

    @Test
    public void test10305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10305");
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
        boolean boolean21 = response1.hasHeaderWithValue("Location", "hi!");
        boolean boolean22 = response1.executed;
        java.lang.String str24 = response1.header("Location");
        response1.statusMessage = "";
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(request10);
        org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(uRL15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test10306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10306");
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
        java.lang.String str20 = response1.statusMessage;
        java.lang.String str22 = response1.cookie("Location");
        java.lang.String str23 = response1.contentType();
        int int24 = response1.numRedirects;
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertNull(method17);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test10307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10307");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        response1.charset = "";
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry8 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        java.lang.String str11 = response1.statusMessage;
        java.lang.String str12 = response1.statusMessage;
        int int13 = response1.statusCode;
        org.jsoup.Connection.Request request14 = null;
        response1.req = request14;
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str18 = response16.getHeaderCaseInsensitive("hi!");
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNotNull(strEntry8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test10308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10308");
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
        int int18 = response1.statusCode();
        response1.executed = true;
        java.lang.String str21 = response1.statusMessage();
        org.jsoup.Connection.Response response24 = response1.cookie("Location", "Location");
        java.nio.ByteBuffer byteBuffer25 = response1.byteData;
        int int26 = response1.numRedirects;
        java.lang.String str27 = response1.statusMessage;
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(method13);
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(response24);
        org.junit.Assert.assertNull(byteBuffer25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 35 + "'", int26 == 35);
        org.junit.Assert.assertNull(str27);
    }

    @Test
    public void test10309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10309");
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
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response(response1);
        boolean boolean19 = response1.executed;
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test10310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10310");
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
        java.util.Map<java.lang.String, java.lang.String> strMap28 = response1.cookies();
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertNull(method17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(strMap28);
    }

    @Test
    public void test10311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10311");
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
        java.nio.ByteBuffer byteBuffer19 = response1.byteData;
        response1.executed = true;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response24 = response1.header("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(byteBuffer19);
    }

    @Test
    public void test10312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10312");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        org.jsoup.Connection.Request request5 = null;
        response1.req = request5;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry8 = response1.scanHeaders("Location");
        boolean boolean11 = response1.hasHeaderWithValue("hi!", "");
        java.util.Map<java.lang.String, java.lang.String> strMap12 = response1.headers();
        java.nio.ByteBuffer byteBuffer13 = response1.byteData;
        org.jsoup.Connection.Method method14 = response1.method();
        java.lang.String str16 = response1.cookie("hi!");
        java.lang.String str17 = response1.contentType();
        java.nio.ByteBuffer byteBuffer18 = response1.byteData;
        boolean boolean19 = response1.executed;
        org.jsoup.helper.HttpConnection.Response response20 = new org.jsoup.helper.HttpConnection.Response(response1);
        int int21 = response20.numRedirects;
        response20.numRedirects = (short) 1;
        response20.charset = "Location";
        java.nio.ByteBuffer byteBuffer26 = response20.byteData;
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(strEntry8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertNull(byteBuffer13);
        org.junit.Assert.assertNull(method14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(byteBuffer18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNull(byteBuffer26);
    }

    @Test
    public void test10313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10313");
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
        java.util.Map<java.lang.String, java.lang.String> strMap18 = response1.cookies();
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertNull(request14);
        org.junit.Assert.assertNull(request17);
        org.junit.Assert.assertNotNull(strMap18);
    }

    @Test
    public void test10314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10314");
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
        java.lang.String str14 = response1.statusMessage;
        java.util.Map<java.lang.String, java.lang.String> strMap15 = response1.headers();
        java.net.URL uRL16 = response1.url();
        java.lang.String str17 = response1.contentType();
        java.nio.ByteBuffer byteBuffer18 = response1.byteData;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response21 = response1.header("", "Location");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertNull(uRL16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(byteBuffer18);
    }

    @Test
    public void test10315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10315");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        response1.executed = false;
        java.lang.String str9 = response1.charset;
        java.lang.String str10 = response1.charset;
        java.lang.String str12 = response1.getHeaderCaseInsensitive("");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry14 = response1.scanHeaders("");
        java.util.Map<java.lang.String, java.lang.String> strMap15 = response1.headers();
        org.jsoup.Connection.Response response18 = response1.header("Location", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = response1.hasCookie("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(strEntry14);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertNotNull(response18);
    }

    @Test
    public void test10316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10316");
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
        java.lang.String str22 = response21.statusMessage;
        org.jsoup.Connection.Request request23 = null;
        response21.req = request23;
        response21.charset = "Location";
        java.util.Map<java.lang.String, java.lang.String> strMap27 = response21.cookies();
        java.lang.String str28 = response21.statusMessage;
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(uRL12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(byteBuffer20);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(strMap27);
        org.junit.Assert.assertNull(str28);
    }

    @Test
    public void test10317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10317");
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
        java.lang.String str17 = response1.getHeaderCaseInsensitive("Location");
        java.nio.ByteBuffer byteBuffer18 = null;
        response1.byteData = byteBuffer18;
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(request15);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test10318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10318");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        response1.charset = "";
        response1.statusMessage = "";
        java.lang.String str10 = response1.getHeaderCaseInsensitive("");
        response1.charset = "hi!";
        int int13 = response1.statusCode();
        int int14 = response1.statusCode;
        java.lang.Class<?> wildcardClass15 = response1.getClass();
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test10319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10319");
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
        java.lang.String str17 = response1.charset();
        int int18 = response1.statusCode;
        response1.charset = "hi!";
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(request10);
        org.junit.Assert.assertNull(strEntry16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test10320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10320");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        boolean boolean9 = response1.hasCookie("hi!");
        org.jsoup.Connection.Response response12 = response1.header("Location", "Location");
        response1.statusCode = 'a';
        java.util.Map<java.lang.String, java.lang.String> strMap15 = response1.headers();
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNotNull(strMap15);
    }

    @Test
    public void test10321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10321");
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
        java.lang.String str19 = response1.contentType;
        org.jsoup.Connection.Request request20 = response1.req;
        boolean boolean23 = response1.hasHeaderWithValue("hi!", "hi!");
        boolean boolean24 = response1.executed;
        response1.executed = true;
        java.lang.String str27 = response1.charset();
        org.jsoup.Connection.Response response29 = response1.removeHeader("Location");
        java.net.HttpURLConnection httpURLConnection30 = null;
        org.jsoup.helper.HttpConnection.Response response31 = null;
        org.jsoup.helper.HttpConnection.Response response32 = new org.jsoup.helper.HttpConnection.Response(response31);
        org.jsoup.Connection.Request request33 = null;
        response32.req = request33;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry36 = response32.scanHeaders("hi!");
        response32.charset = "hi!";
        response32.statusMessage = "hi!";
        boolean boolean42 = response32.hasHeader("hi!");
        java.lang.String str43 = response32.statusMessage();
        java.lang.String str45 = response32.getHeaderCaseInsensitive("");
        response32.charset = "hi!";
        org.jsoup.helper.HttpConnection.Response response48 = new org.jsoup.helper.HttpConnection.Response(response32);
        org.jsoup.Connection.Response response51 = response48.header("Location", "Location");
        java.util.Map<java.lang.String, java.lang.String> strMap52 = response48.headers();
        // The following exception was thrown during execution in test generation
        try {
            response1.setupFromConnection(httpURLConnection30, (org.jsoup.Connection.Response) response48);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNull(request20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertNotNull(response29);
        org.junit.Assert.assertNull(strEntry36);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!" + "'", str43, "hi!");
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertNotNull(response51);
        org.junit.Assert.assertNotNull(strMap52);
    }

    @Test
    public void test10322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10322");
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
        java.nio.ByteBuffer byteBuffer18 = response1.byteData;
        org.jsoup.Connection.Response response20 = response1.removeHeader("Location");
        response1.statusMessage = "Location";
        java.lang.String str23 = response1.charset;
        java.lang.String str25 = response1.getHeaderCaseInsensitive("");
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(byteBuffer18);
        org.junit.Assert.assertNotNull(response20);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertNull(str25);
    }

    @Test
    public void test10323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10323");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        org.jsoup.Connection.Response response8 = response1.cookie("hi!", "");
        java.lang.String str9 = response1.statusMessage();
        org.jsoup.Connection.Request request10 = response1.req;
        response1.numRedirects = 0;
        org.jsoup.Connection.Request request13 = response1.req;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry15 = response1.scanHeaders("Location");
        java.lang.String str16 = response1.contentType();
        org.jsoup.Connection.Request request17 = null;
        response1.req = request17;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry20 = response1.scanHeaders("hi!");
        java.net.URL uRL21 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response22 = response1.url(uRL21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(request10);
        org.junit.Assert.assertNull(request13);
        org.junit.Assert.assertNull(strEntry15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(strEntry20);
    }

    @Test
    public void test10324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10324");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        boolean boolean6 = response1.hasCookie("hi!");
        response1.charset = "hi!";
        java.net.URL uRL9 = response1.url();
        int int10 = response1.statusCode;
        java.nio.ByteBuffer byteBuffer11 = response1.byteData;
        boolean boolean14 = response1.hasHeaderWithValue("hi!", "hi!");
        org.jsoup.Connection.Response response17 = response1.header("Location", "");
        java.net.HttpURLConnection httpURLConnection18 = null;
        org.jsoup.helper.HttpConnection.Response response19 = null;
        org.jsoup.helper.HttpConnection.Response response20 = new org.jsoup.helper.HttpConnection.Response(response19);
        org.jsoup.Connection.Response response23 = response20.header("hi!", "");
        response20.charset = "";
        response20.statusMessage = "";
        java.lang.String str29 = response20.header("");
        java.net.URL uRL30 = response20.url();
        response20.charset = "Location";
        response20.statusMessage = "hi!";
        response20.statusCode = (short) 10;
        java.lang.String str37 = response20.charset();
        org.jsoup.Connection.Response response39 = response20.removeCookie("Location");
        int int40 = response20.numRedirects;
        org.jsoup.helper.HttpConnection.Response response41 = new org.jsoup.helper.HttpConnection.Response(response20);
        org.jsoup.Connection.Response response44 = response41.cookie("Location", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            response1.setupFromConnection(httpURLConnection18, response44);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(response17);
        org.junit.Assert.assertNotNull(response23);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNull(uRL30);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "Location" + "'", str37, "Location");
        org.junit.Assert.assertNotNull(response39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(response44);
    }

    @Test
    public void test10325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10325");
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
        org.jsoup.Connection.Request request15 = response1.req;
        java.lang.String str17 = response1.header("Location");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document18 = response1.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertNull(request14);
        org.junit.Assert.assertNull(request15);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test10326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10326");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        response1.executed = false;
        org.jsoup.Connection.Response response11 = response1.header("Location", "");
        int int12 = response1.statusCode;
        response1.numRedirects = 100;
        java.nio.ByteBuffer byteBuffer15 = response1.byteData;
        java.util.Map<java.lang.String, java.lang.String> strMap16 = response1.headers();
        response1.charset = "";
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(byteBuffer15);
        org.junit.Assert.assertNotNull(strMap16);
    }

    @Test
    public void test10327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10327");
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
        response1.numRedirects = 0;
        java.lang.String str22 = response1.contentType;
        java.lang.String str23 = response1.statusMessage();
        java.lang.String str24 = response1.statusMessage;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry26 = response1.scanHeaders("Location");
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(uRL12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(strEntry26);
    }

    @Test
    public void test10328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10328");
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
        int int15 = response1.statusCode();
        boolean boolean18 = response1.hasHeaderWithValue("hi!", "Location");
        java.lang.String str19 = response1.contentType();
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test10329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10329");
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
        boolean boolean24 = response1.executed;
        response1.statusCode = (short) 0;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document27 = response1.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
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
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test10330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10330");
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
        java.net.URL uRL23 = response1.url();
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(uRL12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(response17);
        org.junit.Assert.assertNotNull(response20);
        org.junit.Assert.assertNull(uRL23);
    }

    @Test
    public void test10331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10331");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        org.jsoup.Connection.Response response6 = response1.removeCookie("Location");
        response1.statusCode = '#';
        org.jsoup.Connection.Response response10 = response1.removeCookie("Location");
        response1.charset = "Location";
        response1.contentType = "hi!";
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNotNull(response10);
    }

    @Test
    public void test10332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10332");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        response1.charset = "";
        response1.statusMessage = "";
        java.lang.String str10 = response1.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response13 = response1.cookie("Location", "hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap14 = response1.cookies();
        response1.charset = "Location";
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertNotNull(strMap14);
    }

    @Test
    public void test10333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10333");
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
        java.lang.String str14 = response1.contentType();
        java.lang.String str15 = response1.statusMessage();
        java.util.Map<java.lang.String, java.lang.String> strMap16 = response1.headers();
        org.jsoup.Connection.Response response19 = response1.cookie("Location", "");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry21 = response1.scanHeaders("Location");
        int int22 = response1.numRedirects;
        boolean boolean24 = response1.hasHeader("Location");
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(strEntry12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertNotNull(response19);
        org.junit.Assert.assertNull(strEntry21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test10334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10334");
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
        response1.statusMessage = "";
        java.lang.String str16 = response1.statusMessage;
        org.jsoup.Connection.Method method17 = response1.method();
        response1.numRedirects = (byte) -1;
        java.net.URL uRL20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response21 = response1.url(uRL20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNull(method13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(method17);
    }

    @Test
    public void test10335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10335");
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
        java.util.Map<java.lang.String, java.lang.String> strMap17 = response1.headers();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry19 = response1.scanHeaders("Location");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass20 = strEntry19.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(byteBuffer13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(strMap17);
        org.junit.Assert.assertNull(strEntry19);
    }

    @Test
    public void test10336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10336");
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
        response1.executed = false;
        java.lang.String str18 = response1.contentType();
        org.jsoup.Connection.Request request19 = null;
        response1.req = request19;
        java.lang.Class<?> wildcardClass21 = response1.getClass();
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(strEntry8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(uRL14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test10337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10337");
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
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry20 = response1.scanHeaders("Location");
        org.jsoup.Connection.Response response23 = response1.header("hi!", "");
        java.net.URL uRL24 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response25 = response1.url(uRL24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertNull(request14);
        org.junit.Assert.assertNull(request17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Location" + "'", str18, "Location");
        org.junit.Assert.assertNull(strEntry20);
        org.junit.Assert.assertNotNull(response23);
    }

    @Test
    public void test10338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10338");
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
        org.jsoup.Connection.Request request17 = response1.req;
        boolean boolean19 = response1.hasCookie("Location");
        org.jsoup.helper.HttpConnection.Response response20 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.net.URL uRL21 = response20.url();
        int int22 = response20.statusCode();
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertNull(request17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(uRL21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test10339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10339");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        response1.charset = "";
        response1.statusMessage = "";
        java.lang.String str10 = response1.getHeaderCaseInsensitive("");
        boolean boolean11 = response1.executed;
        org.jsoup.Connection.Request request12 = response1.req;
        java.lang.String str14 = response1.header("");
        org.jsoup.Connection.Response response17 = response1.cookie("hi!", "");
        java.lang.Class<?> wildcardClass18 = response1.getClass();
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(request12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(response17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test10340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10340");
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
        java.lang.String str18 = response1.statusMessage();
        org.jsoup.Connection.Response response20 = response1.removeHeader("hi!");
        response1.contentType = "Location";
        boolean boolean23 = response1.executed;
        response1.statusCode = 53;
        java.nio.ByteBuffer byteBuffer26 = response1.byteData;
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNotNull(response17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(response20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(byteBuffer26);
    }

    @Test
    public void test10341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10341");
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
        java.lang.String str17 = response1.statusMessage();
        org.jsoup.Connection.Response response19 = response1.removeCookie("Location");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = response1.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertNull(strEntry13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(response19);
    }

    @Test
    public void test10342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10342");
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
        java.lang.String str21 = response1.getHeaderCaseInsensitive("hi!");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray22 = response1.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNull(uRL15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(strEntry18);
        org.junit.Assert.assertNull(method19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test10343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10343");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        response1.executed = false;
        boolean boolean9 = response1.executed;
        int int10 = response1.statusCode();
        response1.executed = false;
        org.jsoup.Connection.Method method13 = response1.method();
        response1.statusMessage = "hi!";
        boolean boolean16 = response1.executed;
        java.net.HttpURLConnection httpURLConnection17 = null;
        org.jsoup.helper.HttpConnection.Response response18 = null;
        org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response(response18);
        org.jsoup.Connection.Response response22 = response19.header("hi!", "");
        org.jsoup.Connection.Request request23 = null;
        response19.req = request23;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry26 = response19.scanHeaders("Location");
        boolean boolean29 = response19.hasHeaderWithValue("hi!", "");
        int int30 = response19.statusCode;
        java.util.Map<java.lang.String, java.lang.String> strMap31 = response19.cookies();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry33 = response19.scanHeaders("");
        java.lang.String str34 = response19.statusMessage();
        java.lang.String str36 = response19.header("hi!");
        java.lang.String str37 = response19.contentType();
        java.nio.ByteBuffer byteBuffer38 = response19.byteData;
        // The following exception was thrown during execution in test generation
        try {
            response1.setupFromConnection(httpURLConnection17, (org.jsoup.Connection.Response) response19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(method13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(response22);
        org.junit.Assert.assertNull(strEntry26);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(strMap31);
        org.junit.Assert.assertNull(strEntry33);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNull(byteBuffer38);
    }

    @Test
    public void test10344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10344");
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
        org.jsoup.Connection.Request request15 = response1.req;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry17 = response1.scanHeaders("Location");
        response1.statusCode = 1;
        java.util.Map<java.lang.String, java.lang.String> strMap20 = response1.cookies();
        java.lang.String str21 = response1.contentType;
        java.nio.ByteBuffer byteBuffer22 = null;
        response1.byteData = byteBuffer22;
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(request15);
        org.junit.Assert.assertNull(strEntry17);
        org.junit.Assert.assertNotNull(strMap20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Location" + "'", str21, "Location");
    }

    @Test
    public void test10345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10345");
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
        java.lang.String str18 = response1.contentType();
        java.util.Map<java.lang.String, java.lang.String> strMap19 = response1.cookies();
        boolean boolean22 = response1.hasHeaderWithValue("Location", "Location");
        java.util.Map<java.lang.String, java.lang.String> strMap23 = response1.cookies();
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(strMap19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(strMap23);
    }

    @Test
    public void test10346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10346");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        boolean boolean8 = response1.hasHeaderWithValue("Location", "Location");
        java.util.Map<java.lang.String, java.lang.String> strMap9 = response1.headers();
        boolean boolean10 = response1.executed;
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test10347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10347");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        response1.executed = false;
        boolean boolean9 = response1.executed;
        java.util.Map<java.lang.String, java.lang.String> strMap10 = response1.headers();
        response1.executed = false;
        int int13 = response1.statusCode();
        org.jsoup.Connection.Response response15 = response1.removeHeader("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = response1.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(response15);
    }

    @Test
    public void test10348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10348");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        org.jsoup.Connection.Request request4 = null;
        response1.req = request4;
        java.lang.String str6 = response1.statusMessage;
        boolean boolean7 = response1.executed;
        java.util.Map<java.lang.String, java.lang.String> strMap8 = response1.headers();
        org.jsoup.Connection.Method method9 = response1.method();
        java.util.Map<java.lang.String, java.lang.String> strMap10 = response1.cookies();
        response1.statusMessage = "hi!";
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = response1.cookie("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertNotNull(strMap10);
    }

    @Test
    public void test10349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10349");
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
        response1.numRedirects = (short) 100;
        boolean boolean17 = response1.executed;
        boolean boolean19 = response1.hasHeader("hi!");
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertNull(request14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test10350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10350");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        response1.charset = "";
        response1.statusMessage = "";
        int int9 = response1.statusCode();
        response1.contentType = "";
        response1.executed = false;
        java.lang.String str14 = response1.charset;
        org.jsoup.Connection.Response response16 = response1.removeCookie("Location");
        boolean boolean17 = response1.executed;
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test10351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10351");
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
        int int23 = response1.statusCode;
        response1.numRedirects = (byte) 0;
        int int26 = response1.numRedirects;
        org.jsoup.Connection.Method method27 = response1.method();
        org.jsoup.Connection.Request request28 = response1.req;
        org.jsoup.Connection.Response response31 = response1.cookie("Location", "");
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(strEntry19);
        org.junit.Assert.assertNotNull(strMap22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNull(method27);
        org.junit.Assert.assertNull(request28);
        org.junit.Assert.assertNotNull(response31);
    }

    @Test
    public void test10352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10352");
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
        java.lang.String str23 = response1.statusMessage();
        response1.executed = true;
        int int26 = response1.statusCode();
        response1.statusMessage = "Location";
        java.lang.String str29 = response1.contentType();
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(strEntry19);
        org.junit.Assert.assertNotNull(strMap22);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
    }

    @Test
    public void test10353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10353");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        boolean boolean6 = response1.hasCookie("hi!");
        response1.executed = true;
        boolean boolean9 = response1.executed;
        int int10 = response1.numRedirects;
        response1.statusCode = (byte) 1;
        int int13 = response1.statusCode();
        java.net.URL uRL14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response15 = response1.url(uRL14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test10354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10354");
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
        boolean boolean15 = response1.hasHeader("hi!");
        response1.statusCode = 10;
        java.lang.String str19 = response1.header("");
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(request10);
        org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test10355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10355");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Response response5 = response2.header("hi!", "");
        java.lang.String str7 = response2.getHeaderCaseInsensitive("");
        response2.executed = false;
        boolean boolean10 = response2.executed;
        int int11 = response2.statusCode();
        response2.executed = false;
        org.jsoup.Connection.Response response16 = response2.cookie("Location", "Location");
        int int17 = response2.numRedirects;
        java.lang.String str18 = response2.charset;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry20 = response2.scanHeaders("Location");
        java.nio.ByteBuffer byteBuffer21 = response2.byteData;
        java.net.URL uRL22 = response2.url();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response23 = org.jsoup.helper.HttpConnection.Response.execute(request0, response2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(strEntry20);
        org.junit.Assert.assertNull(byteBuffer21);
        org.junit.Assert.assertNull(uRL22);
    }

    @Test
    public void test10356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10356");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        java.lang.String str8 = response1.contentType();
        java.lang.String str9 = response1.contentType;
        java.net.HttpURLConnection httpURLConnection10 = null;
        org.jsoup.helper.HttpConnection.Response response11 = null;
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response11);
        org.jsoup.Connection.Response response15 = response12.header("hi!", "");
        response12.charset = "";
        java.lang.String str19 = response12.cookie("hi!");
        boolean boolean20 = response12.executed;
        response12.statusMessage = "Location";
        org.jsoup.Connection.Request request23 = null;
        response12.req = request23;
        int int25 = response12.numRedirects;
        response12.executed = false;
        java.util.Map<java.lang.String, java.lang.String> strMap28 = response12.cookies();
        org.jsoup.Connection.Method method29 = response12.method();
        // The following exception was thrown during execution in test generation
        try {
            response1.setupFromConnection(httpURLConnection10, (org.jsoup.Connection.Response) response12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(strMap28);
        org.junit.Assert.assertNull(method29);
    }

    @Test
    public void test10357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10357");
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
        java.lang.String str15 = response1.statusMessage;
        response1.statusCode = 35;
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(uRL14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Location" + "'", str15, "Location");
    }

    @Test
    public void test10358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10358");
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
        java.util.Map<java.lang.String, java.lang.String> strMap20 = response1.headers();
        java.lang.String str21 = response1.charset;
        java.lang.String str23 = response1.cookie("hi!");
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
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertNull(method17);
        org.junit.Assert.assertNotNull(strMap20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test10359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10359");
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
        java.lang.String str16 = response1.charset();
        int int17 = response1.numRedirects;
        int int18 = response1.numRedirects;
        org.jsoup.Connection.Response response21 = response1.cookie("hi!", "");
        boolean boolean23 = response1.hasCookie("hi!");
        java.lang.String str25 = response1.header("Location");
        java.lang.String str26 = response1.statusMessage();
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(response21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str26);
    }

    @Test
    public void test10360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10360");
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
        java.lang.String str21 = response1.contentType;
        java.lang.String str22 = response1.statusMessage;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response25 = response1.cookie("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertNull(strEntry13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(uRL17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test10361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10361");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.numRedirects = (byte) -1;
        java.lang.String str4 = response1.statusMessage;
        org.jsoup.Connection.Request request5 = response1.req;
        java.net.URL uRL6 = response1.url();
        int int7 = response1.numRedirects;
        org.jsoup.Connection.Request request8 = null;
        response1.req = request8;
        java.lang.String str11 = response1.header("");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray12 = response1.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(request5);
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test10362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10362");
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
        java.util.Map<java.lang.String, java.lang.String> strMap17 = response1.headers();
        java.lang.String str18 = response1.statusMessage;
        java.lang.String str19 = response1.contentType();
        int int20 = response1.statusCode();
        java.lang.String str21 = response1.charset();
        java.net.HttpURLConnection httpURLConnection22 = null;
        org.jsoup.helper.HttpConnection.Response response23 = null;
        org.jsoup.helper.HttpConnection.Response response24 = new org.jsoup.helper.HttpConnection.Response(response23);
        org.jsoup.Connection.Response response27 = response24.header("hi!", "");
        org.jsoup.Connection.Response response29 = response24.removeCookie("Location");
        response24.statusCode = '#';
        boolean boolean32 = response24.executed;
        java.lang.String str33 = response24.contentType();
        response24.charset = "hi!";
        boolean boolean36 = response24.executed;
        java.nio.ByteBuffer byteBuffer37 = response24.byteData;
        org.jsoup.Connection.Response response39 = response24.removeCookie("hi!");
        response24.statusCode = 'a';
        org.jsoup.Connection.Response response44 = response24.header("hi!", "Location");
        // The following exception was thrown during execution in test generation
        try {
            response1.setupFromConnection(httpURLConnection22, response44);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(strEntry12);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(strMap17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(response27);
        org.junit.Assert.assertNotNull(response29);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNull(byteBuffer37);
        org.junit.Assert.assertNotNull(response39);
        org.junit.Assert.assertNotNull(response44);
    }

    @Test
    public void test10363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10363");
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
        org.jsoup.Connection.Method method18 = response1.method();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry20 = response1.scanHeaders("hi!");
        org.jsoup.Connection.Method method21 = response1.method();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry23 = response1.scanHeaders("Location");
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertNull(method17);
        org.junit.Assert.assertNull(method18);
        org.junit.Assert.assertNotNull(strEntry20);
        org.junit.Assert.assertNull(method21);
        org.junit.Assert.assertNull(strEntry23);
    }

    @Test
    public void test10364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10364");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.nio.ByteBuffer byteBuffer2 = null;
        response1.byteData = byteBuffer2;
        java.nio.ByteBuffer byteBuffer4 = response1.byteData;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry6 = response1.scanHeaders("");
        java.lang.String str7 = response1.contentType;
        org.jsoup.Connection.Request request8 = response1.req;
        java.nio.ByteBuffer byteBuffer9 = null;
        response1.byteData = byteBuffer9;
        org.jsoup.Connection.Response response12 = response1.removeCookie("hi!");
        org.jsoup.Connection.Request request13 = response1.req;
        org.junit.Assert.assertNull(byteBuffer4);
        org.junit.Assert.assertNull(strEntry6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(request8);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNull(request13);
    }

    @Test
    public void test10365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10365");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.numRedirects = (byte) -1;
        int int4 = response1.statusCode;
        java.lang.String str5 = response1.charset;
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response1);
        boolean boolean8 = response1.hasCookie("Location");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test10366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10366");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        org.jsoup.Connection.Response response8 = response1.cookie("hi!", "");
        java.lang.String str9 = response1.statusMessage();
        java.lang.String str11 = response1.getHeaderCaseInsensitive("Location");
        org.jsoup.Connection.Request request12 = response1.req;
        java.util.Map<java.lang.String, java.lang.String> strMap13 = response1.cookies();
        response1.executed = true;
        java.nio.ByteBuffer byteBuffer16 = null;
        response1.byteData = byteBuffer16;
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(request12);
        org.junit.Assert.assertNotNull(strMap13);
    }

    @Test
    public void test10367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10367");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        boolean boolean6 = response1.hasHeaderWithValue("hi!", "hi!");
        java.lang.String str7 = response1.charset;
        java.lang.String str8 = response1.charset();
        response1.statusCode = ' ';
        java.util.Map<java.lang.String, java.lang.String> strMap11 = response1.headers();
        response1.statusMessage = "Location";
        response1.charset = "";
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = response1.cookie("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(strMap11);
    }

    @Test
    public void test10368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10368");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        java.lang.String str7 = response1.contentType();
        java.lang.String str8 = response1.contentType();
        int int9 = response1.statusCode;
        java.lang.String str10 = response1.statusMessage;
        org.jsoup.Connection.Response response12 = response1.removeCookie("Location");
        java.lang.String str13 = response1.charset;
        java.lang.String str14 = response1.statusMessage;
        boolean boolean17 = response1.hasHeaderWithValue("Location", "hi!");
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test10369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10369");
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
        java.lang.String str20 = response1.header("hi!");
        int int21 = response1.statusCode;
        response1.contentType = "hi!";
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray24 = response1.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(strEntry8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(uRL14);
        org.junit.Assert.assertNotNull(strEntry16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test10370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10370");
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
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response1);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray13 = response1.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test10371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10371");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Response response5 = response2.header("hi!", "");
        java.lang.String str7 = response2.getHeaderCaseInsensitive("");
        java.lang.String str9 = response2.cookie("hi!");
        java.lang.String str11 = response2.header("");
        org.jsoup.Connection.Response response13 = response2.removeHeader("hi!");
        response2.numRedirects = 0;
        java.nio.ByteBuffer byteBuffer16 = response2.byteData;
        java.lang.String str17 = response2.charset;
        boolean boolean18 = response2.executed;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response19 = org.jsoup.helper.HttpConnection.Response.execute(request0, response2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertNull(byteBuffer16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test10372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10372");
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
        boolean boolean23 = response1.hasHeader("Location");
        org.jsoup.Connection.Response response25 = response1.removeCookie("Location");
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(method17);
        org.junit.Assert.assertNull(strEntry19);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(response25);
    }

    @Test
    public void test10373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10373");
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
        int int17 = response1.statusCode;
        java.lang.String str19 = response1.header("");
        boolean boolean21 = response1.hasHeader("hi!");
        java.net.URL uRL22 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response23 = response1.url(uRL22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
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
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test10374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10374");
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
        response1.executed = false;
        java.lang.String str26 = response1.contentType;
        org.jsoup.Connection.Response response29 = response1.header("hi!", "hi!");
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertNull(method17);
        org.junit.Assert.assertNotNull(strMap20);
        org.junit.Assert.assertNotNull(response22);
        org.junit.Assert.assertNull(request23);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertNotNull(response29);
    }

    @Test
    public void test10375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10375");
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
        int int24 = response1.statusCode();
        java.lang.String str25 = response1.charset();
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertNull(strEntry13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertNotNull(response23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
    }

    @Test
    public void test10376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10376");
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
        java.nio.ByteBuffer byteBuffer13 = response1.byteData;
        java.net.URL uRL14 = response1.url();
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(request10);
        org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(byteBuffer13);
        org.junit.Assert.assertNull(uRL14);
    }

    @Test
    public void test10377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10377");
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
        java.util.Map<java.lang.String, java.lang.String> strMap14 = response1.headers();
        int int15 = response1.statusCode();
        int int16 = response1.numRedirects;
        boolean boolean17 = response1.executed;
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray18 = response1.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test10378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10378");
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
        org.jsoup.Connection.Request request20 = null;
        response1.req = request20;
        boolean boolean23 = response1.hasHeader("Location");
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test10379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10379");
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
        response1.statusCode = 'a';
        java.lang.String str22 = response1.charset();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = response1.body();
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
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test10380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10380");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        response1.executed = false;
        org.jsoup.Connection.Response response11 = response1.header("Location", "");
        int int12 = response1.statusCode;
        boolean boolean13 = response1.executed;
        java.util.Map<java.lang.String, java.lang.String> strMap14 = response1.headers();
        java.lang.String str15 = response1.charset;
        java.util.Map<java.lang.String, java.lang.String> strMap16 = response1.cookies();
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response1);
        int int18 = response17.statusCode();
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test10381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10381");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        java.lang.String str8 = response1.cookie("hi!");
        java.nio.ByteBuffer byteBuffer9 = response1.byteData;
        response1.statusCode = 52;
        response1.statusCode = (byte) 100;
        java.nio.ByteBuffer byteBuffer14 = response1.byteData;
        org.jsoup.Connection.Request request15 = null;
        response1.req = request15;
        java.net.HttpURLConnection httpURLConnection17 = null;
        org.jsoup.helper.HttpConnection.Response response18 = null;
        org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response(response18);
        org.jsoup.Connection.Request request20 = null;
        response19.req = request20;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry23 = response19.scanHeaders("hi!");
        org.jsoup.Connection.Response response26 = response19.cookie("hi!", "");
        java.lang.String str27 = response19.statusMessage();
        org.jsoup.Connection.Method method28 = response19.method();
        java.nio.ByteBuffer byteBuffer29 = null;
        response19.byteData = byteBuffer29;
        java.lang.String str31 = response19.contentType;
        boolean boolean32 = response19.executed;
        // The following exception was thrown during execution in test generation
        try {
            response1.setupFromConnection(httpURLConnection17, (org.jsoup.Connection.Response) response19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(byteBuffer9);
        org.junit.Assert.assertNull(byteBuffer14);
        org.junit.Assert.assertNull(strEntry23);
        org.junit.Assert.assertNotNull(response26);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(method28);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test10382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10382");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        response1.executed = false;
        boolean boolean9 = response1.executed;
        int int10 = response1.statusCode();
        java.lang.String str11 = response1.contentType;
        java.lang.String str12 = response1.charset();
        int int13 = response1.numRedirects;
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test10383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10383");
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
        java.nio.ByteBuffer byteBuffer13 = null;
        response2.byteData = byteBuffer13;
        org.jsoup.Connection.Response response17 = response2.header("hi!", "hi!");
        org.jsoup.Connection.Method method18 = response2.method();
        response2.numRedirects = (byte) 0;
        java.nio.ByteBuffer byteBuffer21 = response2.byteData;
        java.lang.String str22 = response2.contentType();
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
        org.junit.Assert.assertNotNull(response17);
        org.junit.Assert.assertNull(method18);
        org.junit.Assert.assertNull(byteBuffer21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test10384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10384");
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
        java.lang.String str16 = response1.header("");
        int int17 = response1.statusCode();
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(strEntry8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNull(method13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test10385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10385");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        org.jsoup.Connection.Method method7 = response1.method();
        response1.executed = false;
        java.nio.ByteBuffer byteBuffer10 = null;
        response1.byteData = byteBuffer10;
        java.nio.ByteBuffer byteBuffer12 = null;
        response1.byteData = byteBuffer12;
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(method7);
    }

    @Test
    public void test10386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10386");
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
        java.nio.ByteBuffer byteBuffer17 = response1.byteData;
        boolean boolean19 = response1.hasHeader("Location");
        java.lang.String str20 = response1.contentType();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response22 = response1.removeCookie("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNull(method16);
        org.junit.Assert.assertNull(byteBuffer17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test10387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10387");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        response1.executed = false;
        response1.numRedirects = '4';
        java.lang.String str11 = response1.contentType();
        org.jsoup.Connection.Request request12 = null;
        response1.req = request12;
        java.lang.String str15 = response1.cookie("Location");
        org.jsoup.Connection.Request request16 = response1.req;
        response1.charset = "Location";
        org.jsoup.Connection.Method method19 = response1.method();
        java.net.URL uRL20 = response1.url();
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(request16);
        org.junit.Assert.assertNull(method19);
        org.junit.Assert.assertNull(uRL20);
    }

    @Test
    public void test10388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10388");
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
        boolean boolean21 = response1.hasHeaderWithValue("Location", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = response1.body();
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
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test10389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10389");
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
        java.lang.String str18 = response1.contentType();
        boolean boolean21 = response1.hasHeaderWithValue("Location", "Location");
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNotNull(response17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test10390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10390");
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
        org.jsoup.Connection.Response response25 = response22.cookie("Location", "Location");
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertNull(method17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(response25);
    }

    @Test
    public void test10391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10391");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Response response5 = response2.header("hi!", "");
        response2.charset = "";
        response2.statusMessage = "";
        java.lang.String str11 = response2.getHeaderCaseInsensitive("");
        boolean boolean12 = response2.executed;
        int int13 = response2.numRedirects;
        java.nio.ByteBuffer byteBuffer14 = response2.byteData;
        java.lang.String str16 = response2.header("");
        response2.numRedirects = (byte) 100;
        int int19 = response2.statusCode();
        int int20 = response2.numRedirects;
        java.net.URL uRL21 = response2.url();
        java.util.Map<java.lang.String, java.lang.String> strMap22 = response2.headers();
        java.lang.String str23 = response2.charset();
        response2.statusMessage = "hi!";
        response2.statusMessage = "";
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response28 = org.jsoup.helper.HttpConnection.Response.execute(request0, response2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(byteBuffer14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertNull(uRL21);
        org.junit.Assert.assertNotNull(strMap22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test10392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10392");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        response1.charset = "";
        response1.statusMessage = "";
        java.lang.String str10 = response1.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response13 = response1.cookie("Location", "hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap14 = response1.cookies();
        java.net.URL uRL15 = response1.url();
        org.jsoup.Connection.Response response17 = response1.removeCookie("hi!");
        java.net.URL uRL18 = response1.url();
        java.lang.String str20 = response1.getHeaderCaseInsensitive("Location");
        java.nio.ByteBuffer byteBuffer21 = response1.byteData;
        org.jsoup.helper.HttpConnection.Response response22 = new org.jsoup.helper.HttpConnection.Response(response1);
        boolean boolean23 = response1.executed;
        java.util.Map<java.lang.String, java.lang.String> strMap24 = response1.headers();
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNull(uRL15);
        org.junit.Assert.assertNotNull(response17);
        org.junit.Assert.assertNull(uRL18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(byteBuffer21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(strMap24);
    }

    @Test
    public void test10393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10393");
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
        org.jsoup.Connection.Request request12 = null;
        response1.req = request12;
        java.lang.String str15 = response1.header("");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(strEntry8);
        org.junit.Assert.assertNull(byteBuffer9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(request11);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test10394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10394");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        int int8 = response1.numRedirects;
        int int9 = response1.statusCode();
        int int10 = response1.numRedirects;
        boolean boolean13 = response1.hasHeaderWithValue("Location", "");
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Response response17 = response1.cookie("hi!", "hi!");
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(response17);
    }

    @Test
    public void test10395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10395");
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
        response1.statusMessage = "hi!";
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test10396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10396");
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
        response1.numRedirects = (byte) 10;
        java.util.Map<java.lang.String, java.lang.String> strMap17 = response1.headers();
        java.lang.String str19 = response1.cookie("hi!");
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(strMap17);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test10397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10397");
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
        java.nio.ByteBuffer byteBuffer15 = null;
        response1.byteData = byteBuffer15;
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response1);
        boolean boolean20 = response17.hasHeaderWithValue("Location", "");
        java.lang.String str22 = response17.header("Location");
        response17.statusCode = '#';
        response17.statusCode = (byte) 100;
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(strEntry8);
        org.junit.Assert.assertNull(byteBuffer9);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test10398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10398");
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
        org.jsoup.Connection.Method method24 = response1.method();
        int int25 = response1.statusCode();
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNull(request20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Location" + "'", str23, "Location");
        org.junit.Assert.assertNull(method24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test10399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10399");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        org.jsoup.Connection.Response response8 = response1.cookie("hi!", "");
        org.jsoup.Connection.Response response11 = response1.cookie("Location", "");
        boolean boolean14 = response1.hasHeaderWithValue("hi!", "");
        java.nio.ByteBuffer byteBuffer15 = null;
        response1.byteData = byteBuffer15;
        java.lang.String str17 = response1.contentType;
        response1.numRedirects = 97;
        org.jsoup.Connection.Request request20 = null;
        response1.req = request20;
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test10400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10400");
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
        java.net.URL uRL16 = response1.url();
        response1.executed = true;
        response1.executed = false;
        response1.statusMessage = "hi!";
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = response1.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNull(request15);
        org.junit.Assert.assertNull(uRL16);
    }

    @Test
    public void test10401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10401");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.util.Map<java.lang.String, java.lang.String> strMap5 = response1.headers();
        java.lang.String str7 = response1.getHeaderCaseInsensitive("Location");
        org.jsoup.Connection.Request request8 = null;
        response1.req = request8;
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test10402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10402");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        response1.charset = "";
        response1.statusMessage = "";
        java.lang.String str10 = response1.getHeaderCaseInsensitive("");
        response1.charset = "hi!";
        java.nio.ByteBuffer byteBuffer13 = null;
        response1.byteData = byteBuffer13;
        org.jsoup.Connection.Response response16 = response1.removeHeader("hi!");
        java.lang.String str18 = response1.getHeaderCaseInsensitive("hi!");
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test10403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10403");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        org.jsoup.Connection.Response response8 = response1.cookie("hi!", "");
        java.lang.String str9 = response1.statusMessage();
        org.jsoup.Connection.Request request10 = response1.req;
        response1.numRedirects = (short) -1;
        boolean boolean14 = response1.hasCookie("hi!");
        java.lang.String str15 = response1.statusMessage();
        boolean boolean18 = response1.hasHeaderWithValue("Location", "");
        response1.contentType = "Location";
        java.lang.String str22 = response1.cookie("hi!");
        java.net.URL uRL23 = response1.url();
        org.jsoup.Connection.Method method24 = response1.method();
        boolean boolean27 = response1.hasHeaderWithValue("Location", "hi!");
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(request10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNull(uRL23);
        org.junit.Assert.assertNull(method24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test10404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10404");
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
        java.lang.String str16 = response1.getHeaderCaseInsensitive("Location");
        response1.numRedirects = 0;
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(strEntry12);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test10405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10405");
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
        java.util.Map<java.lang.String, java.lang.String> strMap21 = response1.cookies();
        java.lang.String str23 = response1.header("");
        response1.charset = "hi!";
        java.lang.String str26 = response1.charset();
        int int27 = response1.statusCode;
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
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test10406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10406");
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
        java.lang.String str20 = response1.contentType();
        org.jsoup.Connection.Method method21 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response22 = response1.method(method21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test10407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10407");
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
        response1.statusMessage = "";
        org.jsoup.Connection.Request request15 = null;
        response1.req = request15;
        java.nio.ByteBuffer byteBuffer17 = response1.byteData;
        java.util.Map<java.lang.String, java.lang.String> strMap18 = response1.cookies();
        java.util.Map<java.lang.String, java.lang.String> strMap19 = response1.cookies();
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(byteBuffer17);
        org.junit.Assert.assertNotNull(strMap18);
        org.junit.Assert.assertNotNull(strMap19);
    }

    @Test
    public void test10408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10408");
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
        boolean boolean16 = response12.executed;
        response12.statusCode = 35;
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test10409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10409");
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
        int int17 = response1.statusCode;
        java.lang.String str19 = response1.header("");
        boolean boolean21 = response1.hasHeader("hi!");
        java.lang.String str22 = response1.contentType;
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(uRL12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test10410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10410");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        response1.charset = "";
        response1.statusMessage = "";
        response1.charset = "Location";
        org.jsoup.Connection.Request request11 = null;
        response1.req = request11;
        response1.numRedirects = 52;
        java.lang.String str15 = response1.contentType;
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test10411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10411");
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
        int int26 = response1.statusCode();
        int int27 = response1.numRedirects;
        response1.charset = "";
        org.jsoup.helper.HttpConnection.Response response30 = new org.jsoup.helper.HttpConnection.Response(response1);
        response1.executed = true;
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertNull(method17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNull(byteBuffer21);
        org.junit.Assert.assertNotNull(response25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test10412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10412");
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
        response1.statusMessage = "hi!";
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document22 = response1.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertNull(method17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test10413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10413");
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
        org.jsoup.Connection.Request request20 = null;
        response1.req = request20;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document22 = response1.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
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
    public void test10414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10414");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        response1.executed = false;
        int int7 = response1.statusCode();
        org.jsoup.Connection.Response response9 = response1.removeHeader("hi!");
        response1.executed = true;
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(response9);
    }

    @Test
    public void test10415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10415");
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
        boolean boolean15 = response1.hasHeader("Location");
        java.lang.String str16 = response1.charset;
        java.lang.String str17 = response1.charset;
        org.jsoup.Connection.Method method18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response19 = response1.method(method18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(strEntry12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test10416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10416");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.numRedirects = (byte) -1;
        java.lang.String str4 = response1.statusMessage;
        org.jsoup.Connection.Request request5 = response1.req;
        boolean boolean8 = response1.hasHeaderWithValue("Location", "hi!");
        java.nio.ByteBuffer byteBuffer9 = response1.byteData;
        org.jsoup.Connection.Response response12 = response1.cookie("hi!", "hi!");
        response1.charset = "";
        java.lang.String str15 = response1.statusMessage();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry17 = response1.scanHeaders("");
        boolean boolean19 = response1.hasHeader("Location");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(request5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(byteBuffer9);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(strEntry17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test10417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10417");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        java.lang.String str8 = response1.cookie("hi!");
        java.lang.String str10 = response1.header("");
        org.jsoup.Connection.Response response12 = response1.removeHeader("hi!");
        response1.numRedirects = 0;
        java.lang.String str16 = response1.header("Location");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = response1.cookie("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test10418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10418");
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
        response1.statusMessage = "";
        org.jsoup.Connection.Response response23 = response1.removeCookie("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap24 = response1.headers();
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertNotNull(strMap17);
        org.junit.Assert.assertNotNull(response23);
        org.junit.Assert.assertNotNull(strMap24);
    }

    @Test
    public void test10419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10419");
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
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str13 = response1.charset;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry15 = response1.scanHeaders("Location");
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(strEntry15);
    }

    @Test
    public void test10420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10420");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        org.jsoup.Connection.Response response8 = response1.cookie("hi!", "");
        java.lang.String str9 = response1.statusMessage();
        org.jsoup.Connection.Method method10 = response1.method();
        response1.statusCode = 0;
        response1.numRedirects = 10;
        java.util.Map<java.lang.String, java.lang.String> strMap15 = response1.headers();
        java.lang.String str16 = response1.statusMessage();
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test10421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10421");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        java.lang.String str7 = response1.contentType();
        java.lang.String str8 = response1.contentType();
        org.jsoup.Connection.Response response10 = response1.removeHeader("Location");
        java.nio.ByteBuffer byteBuffer11 = response1.byteData;
        int int12 = response1.statusCode();
        java.util.Map<java.lang.String, java.lang.String> strMap13 = response1.cookies();
        int int14 = response1.statusCode();
        org.jsoup.Connection.Response response17 = response1.cookie("hi!", "Location");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response19 = response1.removeCookie("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(response17);
    }

    @Test
    public void test10422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10422");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        org.jsoup.Connection.Request request4 = null;
        response1.req = request4;
        java.lang.String str6 = response1.statusMessage;
        java.lang.String str7 = response1.charset;
        org.jsoup.Connection.Response response10 = response1.cookie("hi!", "Location");
        java.util.Map<java.lang.String, java.lang.String> strMap11 = response1.headers();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response13 = response1.removeHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertNotNull(strMap11);
    }

    @Test
    public void test10423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10423");
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
        int int28 = response1.statusCode();
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(strEntry19);
        org.junit.Assert.assertNotNull(response23);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 52 + "'", int28 == 52);
    }

    @Test
    public void test10424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10424");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.numRedirects = (byte) -1;
        int int4 = response1.statusCode;
        response1.statusMessage = "";
        java.lang.String str7 = response1.charset;
        java.lang.String str9 = response1.getHeaderCaseInsensitive("hi!");
        org.jsoup.Connection.Request request10 = response1.req;
        int int11 = response1.statusCode;
        org.jsoup.Connection.Response response14 = response1.header("Location", "Location");
        int int15 = response1.statusCode;
        int int16 = response1.numRedirects;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(request10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test10425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10425");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        response1.executed = false;
        boolean boolean9 = response1.executed;
        int int10 = response1.statusCode();
        response1.executed = false;
        org.jsoup.Connection.Response response15 = response1.cookie("Location", "Location");
        org.jsoup.Connection.Response response18 = response1.header("hi!", "Location");
        org.jsoup.Connection.Request request19 = response1.req;
        org.jsoup.Connection.Response response21 = response1.removeCookie("Location");
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertNotNull(response18);
        org.junit.Assert.assertNull(request19);
        org.junit.Assert.assertNotNull(response21);
    }

    @Test
    public void test10426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10426");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.charset = "Location";
        java.nio.ByteBuffer byteBuffer4 = null;
        response1.byteData = byteBuffer4;
        response1.executed = false;
        java.nio.ByteBuffer byteBuffer8 = response1.byteData;
        java.nio.ByteBuffer byteBuffer9 = response1.byteData;
        response1.contentType = "";
        java.util.Map<java.lang.String, java.lang.String> strMap12 = response1.cookies();
        java.lang.String str14 = response1.getHeaderCaseInsensitive("Location");
        org.junit.Assert.assertNull(byteBuffer8);
        org.junit.Assert.assertNull(byteBuffer9);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test10427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10427");
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
        java.lang.String str17 = response1.getHeaderCaseInsensitive("Location");
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(request13);
        org.junit.Assert.assertNull(uRL14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Location" + "'", str15, "Location");
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test10428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10428");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        response1.charset = "";
        response1.statusMessage = "";
        response1.statusMessage = "Location";
        java.util.Map<java.lang.String, java.lang.String> strMap11 = response1.cookies();
        org.jsoup.Connection.Method method12 = response1.method();
        response1.statusMessage = "Location";
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNull(method12);
    }

    @Test
    public void test10429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10429");
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
        java.nio.ByteBuffer byteBuffer16 = response1.byteData;
        response1.contentType = "Location";
        java.nio.ByteBuffer byteBuffer19 = response1.byteData;
        java.lang.String str20 = response1.contentType;
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(byteBuffer16);
        org.junit.Assert.assertNull(byteBuffer19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Location" + "'", str20, "Location");
    }

    @Test
    public void test10430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10430");
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
        java.lang.String str22 = response1.charset;
        java.net.HttpURLConnection httpURLConnection23 = null;
        org.jsoup.helper.HttpConnection.Response response24 = null;
        org.jsoup.helper.HttpConnection.Response response25 = new org.jsoup.helper.HttpConnection.Response(response24);
        org.jsoup.Connection.Request request26 = null;
        response25.req = request26;
        org.jsoup.Connection.Request request28 = null;
        response25.req = request28;
        java.lang.String str30 = response25.charset;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry32 = response25.scanHeaders("");
        java.nio.ByteBuffer byteBuffer33 = response25.byteData;
        response25.numRedirects = 10;
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
        org.junit.Assert.assertNotNull(response21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNull(strEntry32);
        org.junit.Assert.assertNull(byteBuffer33);
    }

    @Test
    public void test10431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10431");
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
        org.jsoup.Connection.Response response17 = response1.cookie("hi!", "Location");
        int int18 = response1.statusCode;
        java.lang.String str19 = response1.statusMessage;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry21 = response1.scanHeaders("Location");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry23 = response1.scanHeaders("hi!");
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(response17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(strEntry21);
        org.junit.Assert.assertNull(strEntry23);
    }

    @Test
    public void test10432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10432");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        org.jsoup.Connection.Response response8 = response1.cookie("hi!", "");
        java.lang.String str9 = response1.statusMessage();
        org.jsoup.Connection.Request request10 = response1.req;
        response1.numRedirects = 0;
        org.jsoup.Connection.Request request13 = response1.req;
        java.lang.String str15 = response1.header("");
        org.jsoup.Connection.Request request16 = response1.req;
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(request10);
        org.junit.Assert.assertNull(request13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(request16);
    }

    @Test
    public void test10433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10433");
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
        response1.statusCode = (byte) 0;
        org.jsoup.Connection.Response response19 = response1.header("Location", "hi!");
        java.lang.String str20 = response1.contentType();
        java.net.HttpURLConnection httpURLConnection21 = null;
        org.jsoup.Connection.Response response22 = null;
        // The following exception was thrown during execution in test generation
        try {
            response1.setupFromConnection(httpURLConnection21, response22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(uRL12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(response19);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test10434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10434");
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
        java.lang.String str17 = response1.cookie("hi!");
        int int18 = response1.statusCode();
        java.util.Map<java.lang.String, java.lang.String> strMap19 = response1.headers();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry21 = response1.scanHeaders("");
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(method13);
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(strMap19);
        org.junit.Assert.assertNull(strEntry21);
    }

    @Test
    public void test10435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10435");
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
        response1.statusMessage = "";
        org.jsoup.Connection.Response response20 = response1.cookie("Location", "Location");
        response1.contentType = "";
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry24 = response1.scanHeaders("");
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertNotNull(response20);
        org.junit.Assert.assertNull(strEntry24);
    }

    @Test
    public void test10436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10436");
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
        int int25 = response1.statusCode;
        org.jsoup.Connection.Response response28 = response1.header("Location", "hi!");
        response1.statusMessage = "";
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertNull(method17);
        org.junit.Assert.assertNotNull(strMap20);
        org.junit.Assert.assertNotNull(response22);
        org.junit.Assert.assertNull(request23);
        org.junit.Assert.assertNull(byteBuffer24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(response28);
    }

    @Test
    public void test10437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10437");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        org.jsoup.Connection.Request request5 = null;
        response1.req = request5;
        java.lang.String str7 = response1.charset();
        response1.statusMessage = "hi!";
        java.lang.String str10 = response1.contentType();
        org.jsoup.Connection.Request request11 = response1.req;
        java.net.URL uRL12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response13 = response1.url(uRL12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(request11);
    }

    @Test
    public void test10438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10438");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        java.lang.String str7 = response1.contentType();
        java.lang.String str8 = response1.contentType();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry10 = response1.scanHeaders("");
        java.util.Map<java.lang.String, java.lang.String> strMap11 = response1.cookies();
        java.lang.String str12 = response1.statusMessage;
        java.lang.String str14 = response1.cookie("Location");
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(strEntry10);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test10439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10439");
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
        java.lang.String str14 = response1.statusMessage;
        org.jsoup.Connection.Response response16 = response1.removeCookie("hi!");
        int int17 = response1.numRedirects;
        java.lang.String str19 = response1.cookie("hi!");
        response1.statusMessage = "Location";
        java.net.URL uRL22 = response1.url();
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNull(request13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(uRL22);
    }

    @Test
    public void test10440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10440");
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
        boolean boolean21 = response1.executed;
        org.jsoup.Connection.Request request22 = null;
        response1.req = request22;
        int int24 = response1.statusCode;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry26 = response1.scanHeaders("");
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNull(strEntry26);
    }

    @Test
    public void test10441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10441");
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
        org.jsoup.Connection.Request request16 = response1.req;
        int int17 = response1.numRedirects;
        int int18 = response1.numRedirects;
        org.jsoup.Connection.Response response20 = response1.removeHeader("hi!");
        org.jsoup.Connection.Request request21 = response1.req;
        boolean boolean23 = response1.hasHeader("hi!");
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(request16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(response20);
        org.junit.Assert.assertNull(request21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test10442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10442");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        org.jsoup.Connection.Request request5 = null;
        response1.req = request5;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry8 = response1.scanHeaders("Location");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry10 = response1.scanHeaders("Location");
        org.jsoup.Connection.Method method11 = response1.method();
        java.lang.String str12 = response1.charset();
        java.util.Map<java.lang.String, java.lang.String> strMap13 = response1.cookies();
        int int14 = response1.numRedirects;
        org.jsoup.Connection.Method method15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response16 = response1.method(method15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(strEntry8);
        org.junit.Assert.assertNull(strEntry10);
        org.junit.Assert.assertNull(method11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test10443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10443");
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
        response1.executed = true;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response19 = response1.removeHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(method12);
        org.junit.Assert.assertNull(byteBuffer13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test10444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10444");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        response1.charset = "";
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry8 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        response1.statusCode = (byte) 0;
        boolean boolean15 = response1.hasHeaderWithValue("Location", "Location");
        java.lang.String str16 = response1.statusMessage;
        response1.statusMessage = "hi!";
        java.lang.String str19 = response1.contentType;
        response1.executed = true;
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNotNull(strEntry8);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test10445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10445");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.numRedirects = (byte) -1;
        boolean boolean5 = response1.hasCookie("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap6 = response1.headers();
        int int7 = response1.statusCode();
        response1.executed = true;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test10446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10446");
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
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Response response20 = response1.removeCookie("Location");
        java.util.Map<java.lang.String, java.lang.String> strMap21 = response1.cookies();
        java.util.Map<java.lang.String, java.lang.String> strMap22 = response1.cookies();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry24 = response1.scanHeaders("");
        org.jsoup.Connection.Request request25 = response1.req;
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(method14);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(response20);
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertNotNull(strMap22);
        org.junit.Assert.assertNull(strEntry24);
        org.junit.Assert.assertNull(request25);
    }

    @Test
    public void test10447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10447");
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
        response1.numRedirects = '4';
        java.util.Map<java.lang.String, java.lang.String> strMap20 = response1.headers();
        java.net.URL uRL21 = response1.url();
        int int22 = response1.statusCode();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response23 = new org.jsoup.helper.HttpConnection.Response(response1);
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
        org.junit.Assert.assertNotNull(strMap20);
        org.junit.Assert.assertNull(uRL21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test10448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10448");
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
        java.util.Map<java.lang.String, java.lang.String> strMap15 = response1.cookies();
        int int16 = response1.statusCode();
        org.jsoup.Connection.Request request17 = response1.req;
        boolean boolean19 = response1.hasHeader("Location");
        org.jsoup.Connection.Response response22 = response1.cookie("hi!", "Location");
        org.jsoup.Connection.Method method23 = response1.method();
        response1.charset = "Location";
        org.jsoup.Connection.Request request26 = null;
        response1.req = request26;
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(request17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(response22);
        org.junit.Assert.assertNull(method23);
    }

    @Test
    public void test10449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10449");
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
        response1.statusCode = (byte) 0;
        org.jsoup.Connection.Response response19 = response1.header("Location", "hi!");
        java.lang.String str20 = response1.contentType();
        java.lang.String str21 = response1.charset;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = response1.hasHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(uRL12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(response19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test10450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10450");
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
        java.lang.String str13 = response1.charset();
        org.jsoup.Connection.Response response16 = response1.header("Location", "hi!");
        response1.statusCode = (-1);
        java.lang.String str19 = response1.charset;
        java.net.URL uRL20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response21 = response1.url(uRL20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test10451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10451");
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
        org.jsoup.Connection.Request request19 = null;
        response1.req = request19;
        java.lang.String str21 = response1.statusMessage;
        response1.charset = "hi!";
        response1.charset = "Location";
        boolean boolean27 = response1.hasCookie("hi!");
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(strEntry18);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test10452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10452");
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
        response1.statusMessage = "Location";
        java.util.Map<java.lang.String, java.lang.String> strMap23 = response1.headers();
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(strMap23);
    }

    @Test
    public void test10453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10453");
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
        java.nio.ByteBuffer byteBuffer18 = null;
        response1.byteData = byteBuffer18;
        org.jsoup.Connection.Request request20 = response1.req;
        java.lang.String str21 = response1.contentType;
        java.lang.String str22 = response1.charset();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry24 = response1.scanHeaders("Location");
        org.jsoup.Connection.Response response26 = response1.removeCookie("hi!");
        java.lang.String str28 = response1.getHeaderCaseInsensitive("Location");
        org.jsoup.Connection.Request request29 = null;
        response1.req = request29;
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(request20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNull(strEntry24);
        org.junit.Assert.assertNotNull(response26);
        org.junit.Assert.assertNull(str28);
    }

    @Test
    public void test10454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10454");
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
        java.lang.String str18 = response1.statusMessage();
        java.lang.String str19 = response1.contentType();
        org.jsoup.helper.HttpConnection.Response response20 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(uRL12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(response17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test10455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10455");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        java.lang.String str8 = response1.contentType();
        java.lang.String str9 = response1.contentType;
        org.jsoup.Connection.Response response11 = response1.removeCookie("hi!");
        response1.charset = "Location";
        boolean boolean15 = response1.hasCookie("Location");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response17 = response1.removeCookie("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test10456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10456");
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
        response1.statusCode = (short) -1;
        java.lang.String str17 = response1.contentType;
        java.nio.ByteBuffer byteBuffer18 = null;
        response1.byteData = byteBuffer18;
        java.lang.String str20 = response1.charset;
        org.jsoup.Connection.Method method21 = response1.method();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response24 = response1.header("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(strEntry12);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(method21);
    }

    @Test
    public void test10457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10457");
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
        boolean boolean23 = response1.hasHeaderWithValue("Location", "hi!");
        response1.charset = "Location";
        int int26 = response1.statusCode;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response29 = response1.header("", "Location");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
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
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test10458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10458");
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
        java.util.Map<java.lang.String, java.lang.String> strMap22 = response1.cookies();
        response1.charset = "Location";
        java.lang.String str25 = response1.statusMessage();
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertNull(method17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(strMap22);
        org.junit.Assert.assertNull(str25);
    }

    @Test
    public void test10459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10459");
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
        response1.statusCode = 97;
        org.jsoup.helper.HttpConnection.Response response21 = new org.jsoup.helper.HttpConnection.Response(response1);
        response21.statusCode = (short) -1;
        int int24 = response21.statusCode;
        org.jsoup.Connection.Response response26 = response21.removeCookie("hi!");
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(response26);
    }

    @Test
    public void test10460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10460");
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
        java.lang.String str15 = response1.statusMessage();
        java.net.URL uRL16 = response1.url();
        org.jsoup.Connection.Method method17 = response1.method();
        java.nio.ByteBuffer byteBuffer18 = null;
        response1.byteData = byteBuffer18;
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(uRL16);
        org.junit.Assert.assertNull(method17);
    }

    @Test
    public void test10461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10461");
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
        java.lang.String str14 = response1.contentType();
        java.lang.String str15 = response1.statusMessage();
        java.util.Map<java.lang.String, java.lang.String> strMap16 = response1.headers();
        org.jsoup.Connection.Response response19 = response1.cookie("Location", "");
        org.jsoup.helper.HttpConnection.Response response20 = new org.jsoup.helper.HttpConnection.Response(response1);
        response20.statusCode = (short) 0;
        response20.charset = "hi!";
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(strEntry12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertNotNull(response19);
    }

    @Test
    public void test10462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10462");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        response1.executed = false;
        org.jsoup.Connection.Response response11 = response1.header("Location", "");
        int int12 = response1.statusCode;
        boolean boolean14 = response1.hasCookie("hi!");
        response1.executed = true;
        org.jsoup.Connection.Response response19 = response1.cookie("hi!", "hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap20 = response1.cookies();
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(response19);
        org.junit.Assert.assertNotNull(strMap20);
    }

    @Test
    public void test10463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10463");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.charset = "Location";
        org.jsoup.Connection.Response response6 = response1.cookie("hi!", "");
        org.jsoup.Connection.Request request7 = null;
        response1.req = request7;
        java.util.Map<java.lang.String, java.lang.String> strMap9 = response1.cookies();
        org.jsoup.Connection.Request request10 = null;
        response1.req = request10;
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNotNull(strMap9);
    }

    @Test
    public void test10464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10464");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        org.jsoup.Connection.Response response8 = response1.cookie("hi!", "");
        java.lang.String str10 = response1.cookie("hi!");
        boolean boolean11 = response1.executed;
        boolean boolean12 = response1.executed;
        int int13 = response1.statusCode();
        int int14 = response1.statusCode();
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test10465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10465");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        response1.executed = false;
        org.jsoup.Connection.Response response11 = response1.header("Location", "");
        response1.statusMessage = "";
        org.jsoup.Connection.Response response15 = response1.removeHeader("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap16 = response1.cookies();
        java.lang.String str18 = response1.getHeaderCaseInsensitive("Location");
        java.lang.String str19 = response1.contentType();
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test10466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10466");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        response1.charset = "";
        java.lang.String str8 = response1.cookie("hi!");
        boolean boolean9 = response1.executed;
        response1.statusMessage = "Location";
        java.lang.String str12 = response1.statusMessage;
        int int13 = response1.numRedirects;
        org.jsoup.Connection.Method method14 = response1.method();
        boolean boolean16 = response1.hasCookie("hi!");
        boolean boolean17 = response1.executed;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = response1.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Location" + "'", str12, "Location");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(method14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test10467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10467");
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
        java.lang.String str13 = response2.contentType;
        org.jsoup.Connection.Response response16 = response2.cookie("Location", "Location");
        int int17 = response2.numRedirects;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry19 = response2.scanHeaders("hi!");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry21 = response2.scanHeaders("hi!");
        java.net.URL uRL22 = response2.url();
        java.lang.String str23 = response2.contentType;
        response2.contentType = "hi!";
        java.lang.String str26 = response2.statusMessage();
        int int27 = response2.numRedirects;
        java.lang.String str28 = response2.contentType();
        org.jsoup.Connection.Request request29 = response2.req;
        java.lang.String str30 = response2.charset();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response31 = org.jsoup.helper.HttpConnection.Response.execute(request0, response2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(byteBuffer12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(strEntry19);
        org.junit.Assert.assertNull(strEntry21);
        org.junit.Assert.assertNull(uRL22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertNull(request29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
    }

    @Test
    public void test10468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10468");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        java.lang.String str7 = response1.charset;
        response1.numRedirects = ' ';
        org.jsoup.Connection.Method method10 = response1.method();
        org.jsoup.Connection.Method method11 = response1.method();
        java.lang.String str12 = response1.statusMessage();
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNull(method11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test10469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10469");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        org.jsoup.Connection.Method method7 = response1.method();
        response1.contentType = "hi!";
        java.lang.String str10 = response1.charset();
        org.jsoup.Connection.Method method11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response12 = response1.method(method11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test10470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10470");
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
        java.lang.String str16 = response1.statusMessage();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry18 = response1.scanHeaders("Location");
        org.jsoup.Connection.Method method19 = response1.method();
        org.jsoup.Connection.Request request20 = null;
        response1.req = request20;
        java.lang.String str22 = response1.contentType();
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(strEntry18);
        org.junit.Assert.assertNull(method19);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test10471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10471");
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
        java.lang.String str17 = response1.cookie("Location");
        java.lang.String str19 = response1.getHeaderCaseInsensitive("Location");
        org.jsoup.Connection.Method method20 = response1.method();
        int int21 = response1.statusCode();
        org.jsoup.Connection.Response response24 = response1.cookie("Location", "hi!");
        java.lang.String str26 = response1.cookie("Location");
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(method13);
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(method20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(response24);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
    }

    @Test
    public void test10472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10472");
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
        java.lang.String str23 = response1.charset;
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray24 = response1.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
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
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test10473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10473");
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
        java.lang.String str19 = response1.charset;
        response1.charset = "";
        java.util.Map<java.lang.String, java.lang.String> strMap22 = response1.headers();
        org.jsoup.helper.HttpConnection.Response response23 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Request request24 = response23.req;
        java.nio.ByteBuffer byteBuffer25 = response23.byteData;
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(strMap22);
        org.junit.Assert.assertNull(request24);
        org.junit.Assert.assertNull(byteBuffer25);
    }

    @Test
    public void test10474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10474");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        java.lang.String str7 = response1.contentType();
        java.lang.String str8 = response1.contentType();
        org.jsoup.Connection.Response response10 = response1.removeHeader("Location");
        java.nio.ByteBuffer byteBuffer11 = null;
        response1.byteData = byteBuffer11;
        org.jsoup.Connection.Response response14 = response1.removeHeader("hi!");
        response1.statusMessage = "Location";
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response1);
        int int18 = response17.statusCode();
        java.lang.String str19 = response17.statusMessage;
        java.util.Map<java.lang.String, java.lang.String> strMap20 = response17.cookies();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry22 = response17.scanHeaders("hi!");
        response17.charset = "hi!";
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(strMap20);
        org.junit.Assert.assertNull(strEntry22);
    }

    @Test
    public void test10475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10475");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        boolean boolean6 = response1.hasHeaderWithValue("hi!", "hi!");
        java.lang.String str7 = response1.charset;
        int int8 = response1.statusCode();
        org.jsoup.Connection.Method method9 = response1.method();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(method9);
    }

    @Test
    public void test10476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10476");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        java.lang.String str8 = response1.cookie("hi!");
        java.net.URL uRL9 = response1.url();
        org.jsoup.Connection.Request request10 = null;
        response1.req = request10;
        boolean boolean12 = response1.executed;
        boolean boolean14 = response1.hasCookie("Location");
        java.lang.String str15 = response1.statusMessage;
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test10477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10477");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        response1.statusCode = 10;
        int int9 = response1.numRedirects;
        boolean boolean10 = response1.executed;
        java.lang.String str11 = response1.statusMessage();
        response1.numRedirects = (byte) -1;
        org.jsoup.Connection.Request request14 = response1.req;
        int int15 = response1.statusCode;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = response1.hasCookie("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(request14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
    }

    @Test
    public void test10478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10478");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        response1.executed = false;
        boolean boolean9 = response1.executed;
        int int10 = response1.statusCode();
        java.lang.String str11 = response1.contentType;
        java.lang.String str12 = response1.charset();
        java.lang.String str13 = response1.statusMessage();
        java.nio.ByteBuffer byteBuffer14 = null;
        response1.byteData = byteBuffer14;
        java.lang.String str16 = response1.contentType();
        response1.statusMessage = "Location";
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test10479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10479");
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
        response1.statusMessage = "hi!";
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(uRL23);
        org.junit.Assert.assertNull(str25);
    }

    @Test
    public void test10480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10480");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        response1.statusMessage = "hi!";
        java.lang.String str10 = response1.statusMessage();
        java.util.Map<java.lang.String, java.lang.String> strMap11 = response1.cookies();
        java.nio.ByteBuffer byteBuffer12 = null;
        response1.byteData = byteBuffer12;
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(strMap11);
    }

    @Test
    public void test10481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10481");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        response1.executed = false;
        boolean boolean9 = response1.executed;
        java.util.Map<java.lang.String, java.lang.String> strMap10 = response1.headers();
        response1.executed = false;
        response1.executed = true;
        java.util.Map<java.lang.String, java.lang.String> strMap15 = response1.cookies();
        boolean boolean18 = response1.hasHeaderWithValue("hi!", "");
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test10482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10482");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        response1.charset = "";
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry8 = response1.scanHeaders("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap9 = response1.cookies();
        boolean boolean10 = response1.executed;
        response1.charset = "hi!";
        java.lang.String str13 = response1.contentType();
        org.jsoup.Connection.Request request14 = response1.req;
        java.util.Map<java.lang.String, java.lang.String> strMap15 = response1.cookies();
        boolean boolean17 = response1.hasCookie("hi!");
        java.lang.String str18 = response1.contentType();
        java.net.URL uRL19 = response1.url();
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNotNull(strEntry8);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(request14);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(uRL19);
    }

    @Test
    public void test10483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10483");
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
        java.lang.String str16 = response1.charset();
        int int17 = response1.numRedirects;
        int int18 = response1.numRedirects;
        java.util.Map<java.lang.String, java.lang.String> strMap19 = response1.cookies();
        response1.executed = true;
        java.lang.String str22 = response1.charset();
        response1.contentType = "";
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(strMap19);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test10484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10484");
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
        java.lang.String str17 = response1.statusMessage();
        org.jsoup.Connection.Response response19 = response1.removeCookie("Location");
        int int20 = response1.statusCode();
        java.lang.String str22 = response1.header("hi!");
        java.lang.String str23 = response1.contentType();
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertNull(strEntry13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(response19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
    }

    @Test
    public void test10485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10485");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        response1.executed = false;
        response1.statusCode = 100;
        boolean boolean12 = response1.hasHeader("Location");
        response1.numRedirects = (-1);
        org.jsoup.Connection.Response response17 = response1.header("Location", "");
        java.nio.ByteBuffer byteBuffer18 = response1.byteData;
        org.jsoup.Connection.Response response20 = response1.removeCookie("Location");
        java.lang.String str21 = response1.statusMessage;
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(response17);
        org.junit.Assert.assertNull(byteBuffer18);
        org.junit.Assert.assertNotNull(response20);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test10486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10486");
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
        java.util.Map<java.lang.String, java.lang.String> strMap18 = response1.cookies();
        org.jsoup.Connection.Method method19 = response1.method();
        java.lang.Class<?> wildcardClass20 = response1.getClass();
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(strMap18);
        org.junit.Assert.assertNull(method19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test10487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10487");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Response response5 = response2.header("hi!", "");
        response2.charset = "";
        response2.statusMessage = "";
        java.util.Map<java.lang.String, java.lang.String> strMap10 = response2.headers();
        org.jsoup.Connection.Request request11 = response2.req;
        response2.charset = "";
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response14 = org.jsoup.helper.HttpConnection.Response.execute(request0, response2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNull(request11);
    }

    @Test
    public void test10488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10488");
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
        java.lang.String str17 = response1.statusMessage();
        org.jsoup.Connection.Method method18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response19 = response1.method(method18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(uRL14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Location" + "'", str17, "Location");
    }

    @Test
    public void test10489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10489");
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
        java.lang.String str17 = response1.header("hi!");
        boolean boolean19 = response1.hasCookie("Location");
        org.jsoup.helper.HttpConnection.Response response20 = new org.jsoup.helper.HttpConnection.Response(response1);
        int int21 = response1.statusCode();
        int int22 = response1.statusCode;
        org.jsoup.Connection.Method method23 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response24 = response1.method(method23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test10490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10490");
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
        boolean boolean23 = response1.hasHeader("Location");
        org.jsoup.Connection.Response response25 = response1.removeCookie("Location");
        java.lang.String str27 = response1.cookie("Location");
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
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(response25);
        org.junit.Assert.assertNull(str27);
    }

    @Test
    public void test10491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10491");
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
        java.net.HttpURLConnection httpURLConnection14 = null;
        org.jsoup.helper.HttpConnection.Response response15 = null;
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response15);
        org.jsoup.Connection.Response response19 = response16.header("hi!", "");
        java.lang.String str21 = response16.getHeaderCaseInsensitive("");
        response16.executed = false;
        org.jsoup.Connection.Response response26 = response16.header("Location", "");
        java.lang.String str27 = response16.charset;
        java.lang.String str28 = response16.charset();
        java.lang.String str29 = response16.charset();
        org.jsoup.Connection.Request request30 = null;
        response16.req = request30;
        // The following exception was thrown during execution in test generation
        try {
            response1.setupFromConnection(httpURLConnection14, (org.jsoup.Connection.Response) response16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(response19);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(response26);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(str29);
    }

    @Test
    public void test10492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10492");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        org.jsoup.Connection.Response response8 = response1.cookie("hi!", "");
        boolean boolean9 = response1.executed;
        java.lang.String str11 = response1.header("");
        org.jsoup.Connection.Response response14 = response1.header("hi!", "Location");
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.util.Map<java.lang.String, java.lang.String> strMap16 = response1.cookies();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response19 = response1.cookie("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertNotNull(strMap16);
    }

    @Test
    public void test10493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10493");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        response1.charset = "";
        response1.statusMessage = "";
        java.lang.String str10 = response1.getHeaderCaseInsensitive("");
        boolean boolean11 = response1.executed;
        org.jsoup.Connection.Request request12 = response1.req;
        java.lang.String str14 = response1.header("");
        java.lang.String str16 = response1.header("Location");
        org.jsoup.Connection.Method method17 = response1.method();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = response1.hasCookie("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(request12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(method17);
    }

    @Test
    public void test10494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10494");
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
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.Class<?> wildcardClass18 = response1.getClass();
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(method12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test10495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10495");
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
        java.lang.String str29 = response1.getHeaderCaseInsensitive("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str30 = response1.body();
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
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(strMap23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(response27);
        org.junit.Assert.assertNull(str29);
    }

    @Test
    public void test10496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10496");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Too many redirects occurred trying to load URL null");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(request10);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(uRL16);
    }

    @Test
    public void test10497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10497");
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
        java.lang.String str17 = response1.statusMessage();
        response1.numRedirects = 1;
        org.jsoup.Connection.Response response22 = response1.header("hi!", "Location");
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(response22);
    }

    @Test
    public void test10498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10498");
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
        java.lang.String str19 = response1.contentType;
        java.lang.String str20 = response1.statusMessage;
        org.jsoup.Connection.Request request21 = response1.req;
        java.nio.ByteBuffer byteBuffer22 = response1.byteData;
        java.lang.String str24 = response1.getHeaderCaseInsensitive("hi!");
        org.jsoup.Connection.Response response27 = response1.cookie("Location", "hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap28 = response1.cookies();
        java.lang.String str30 = response1.header("hi!");
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Location" + "'", str18, "Location");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(request21);
        org.junit.Assert.assertNull(byteBuffer22);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(response27);
        org.junit.Assert.assertNotNull(strMap28);
        org.junit.Assert.assertNull(str30);
    }

    @Test
    public void test10499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10499");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        response1.statusMessage = "hi!";
        boolean boolean11 = response1.hasHeader("hi!");
        int int12 = response1.statusCode();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = response1.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test10500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10500");
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
        org.jsoup.helper.HttpConnection.Response response25 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Method method26 = response25.method();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str27 = response25.body();
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
        org.junit.Assert.assertNull(method26);
    }
}
